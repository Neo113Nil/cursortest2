package io.sentry;

import io.sentry.Q2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class R2 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private List<Q2> f66734a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap f66735b;

    public static final class a implements InterfaceC7174n0<R2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final R2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            ArrayList arrayList = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("items")) {
                    arrayList = interfaceC7131c1.J0(iLogger, new Q2.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                }
            }
            interfaceC7131c1.endObject();
            if (arrayList != null) {
                R2 r22 = new R2(arrayList);
                r22.b(hashMap);
                return r22;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"items\"");
            iLogger.a(I2.ERROR, "Missing required field \"items\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public R2(@NotNull List<Q2> list) {
        this.f66734a = list;
    }

    @NotNull
    public final List<Q2> a() {
        return this.f66734a;
    }

    public final void b(Map<String, Object> map) {
        this.f66735b = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("items");
        c7212v0.m(iLogger, this.f66734a);
        HashMap hashMap = this.f66735b;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f66735b, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
