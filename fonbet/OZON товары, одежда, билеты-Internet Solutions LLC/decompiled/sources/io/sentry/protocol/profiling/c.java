package io.sentry.protocol.profiling;

import I1.w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68305a;

    /* renamed from: b, reason: collision with root package name */
    private int f68306b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f68307c;

    public static final class a implements InterfaceC7174n0<c> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final c a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            c cVar = new c();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("priority")) {
                    cVar.f68306b = interfaceC7131c1.nextInt();
                } else if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    cVar.f68305a = interfaceC7131c1.k0();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                }
            }
            cVar.c(hashMap);
            interfaceC7131c1.endObject();
            return cVar;
        }
    }

    public final void c(Map<String, Object> map) {
        this.f68307c = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68305a != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.m(iLogger, this.f68305a);
        }
        c7212v0.g("priority");
        c7212v0.m(iLogger, Integer.valueOf(this.f68306b));
        HashMap hashMap = this.f68307c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                w.e(this.f68307c, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
