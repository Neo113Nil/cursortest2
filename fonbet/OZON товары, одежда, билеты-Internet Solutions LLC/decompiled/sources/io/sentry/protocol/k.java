package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Number f68253a;

    /* renamed from: b, reason: collision with root package name */
    private final String f68254b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap f68255c;

    public static final class a implements InterfaceC7174n0<k> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final k a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            Number number = null;
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("unit")) {
                    str = interfaceC7131c1.k0();
                } else if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    number = (Number) interfaceC7131c1.U1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                }
            }
            interfaceC7131c1.endObject();
            if (number != null) {
                k kVar = new k(str, number);
                kVar.a(concurrentHashMap);
                return kVar;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"value\"");
            iLogger.a(I2.ERROR, "Missing required field \"value\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public k(String str, @NotNull Number number) {
        this.f68253a = number;
        this.f68254b = str;
    }

    public final void a(Map<String, Object> map) {
        this.f68255c = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c7212v0.o(this.f68253a);
        String str = this.f68254b;
        if (str != null) {
            c7212v0.g("unit");
            c7212v0.p(str);
        }
        ConcurrentHashMap concurrentHashMap = this.f68255c;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                C7137e.b(this.f68255c, str2, c7212v0, str2, iLogger);
            }
        }
        c7212v0.d();
    }
}
