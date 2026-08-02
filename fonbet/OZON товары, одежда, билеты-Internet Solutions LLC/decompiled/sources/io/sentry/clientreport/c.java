package io.sentry.clientreport;

import B0.A0;
import I1.w;
import io.sentry.C7212v0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.clientreport.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f67827a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f67828b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f67829c;

    public static final class a implements InterfaceC7174n0<c> {
        private static IllegalStateException b(String str, ILogger iLogger) {
            String b11 = A0.b("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(b11);
            iLogger.a(I2.ERROR, b11, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final c a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            interfaceC7131c1.beginObject();
            Date date = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("discarded_events")) {
                    arrayList.addAll(interfaceC7131c1.J0(iLogger, new g.a()));
                } else if (nextName.equals("timestamp")) {
                    date = interfaceC7131c1.M(iLogger);
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                }
            }
            interfaceC7131c1.endObject();
            if (date == null) {
                throw b("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw b("discarded_events", iLogger);
            }
            c cVar = new c(date, arrayList);
            cVar.b(hashMap);
            return cVar;
        }
    }

    public c(@NotNull Date date, @NotNull ArrayList arrayList) {
        this.f67827a = date;
        this.f67828b = arrayList;
    }

    @NotNull
    public final List<g> a() {
        return this.f67828b;
    }

    public final void b(Map<String, Object> map) {
        this.f67829c = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("timestamp");
        c7212v0.p(io.sentry.vendor.gson.internal.bind.util.a.b(this.f67827a));
        c7212v0.g("discarded_events");
        c7212v0.m(iLogger, this.f67828b);
        HashMap hashMap = this.f67829c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                w.e(this.f67829c, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
