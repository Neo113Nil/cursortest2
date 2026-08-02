package io.sentry.protocol.profiling;

import I1.w;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private double f68301a;

    /* renamed from: b, reason: collision with root package name */
    private int f68302b;

    /* renamed from: c, reason: collision with root package name */
    private String f68303c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap f68304d;

    public static final class a implements InterfaceC7174n0<b> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final b a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            b bVar = new b();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "thread_id":
                        bVar.f68303c = interfaceC7131c1.k0();
                        break;
                    case "timestamp":
                        bVar.f68301a = interfaceC7131c1.nextDouble();
                        break;
                    case "stack_id":
                        bVar.f68302b = interfaceC7131c1.nextInt();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                        break;
                }
            }
            bVar.d(hashMap);
            interfaceC7131c1.endObject();
            return bVar;
        }
    }

    public final void d(Map<String, Object> map) {
        this.f68304d = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, BigDecimal.valueOf(this.f68301a).setScale(6, RoundingMode.DOWN));
        c7212v0.g("stack_id");
        c7212v0.m(iLogger, Integer.valueOf(this.f68302b));
        if (this.f68303c != null) {
            c7212v0.g("thread_id");
            c7212v0.m(iLogger, this.f68303c);
        }
        HashMap hashMap = this.f68304d;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                w.e(this.f68304d, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
