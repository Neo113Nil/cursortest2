package io.sentry.protocol;

import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.protocol.G;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class F implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f68155a;

    /* renamed from: b, reason: collision with root package name */
    private final List<G> f68156b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f68157c;

    public static final class a implements InterfaceC7174n0<F> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final F a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            String str = null;
            ArrayList arrayList = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("rendering_system")) {
                    str = interfaceC7131c1.k0();
                } else if (nextName.equals("windows")) {
                    arrayList = interfaceC7131c1.J0(iLogger, new G.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                }
            }
            interfaceC7131c1.endObject();
            F f7 = new F(str, arrayList);
            f7.a(hashMap);
            return f7;
        }
    }

    public F(String str, List<G> list) {
        this.f68155a = str;
        this.f68156b = list;
    }

    public final void a(Map<String, Object> map) {
        this.f68157c = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        String str = this.f68155a;
        if (str != null) {
            c7212v0.g("rendering_system");
            c7212v0.p(str);
        }
        List<G> list = this.f68156b;
        if (list != null) {
            c7212v0.g("windows");
            c7212v0.m(iLogger, list);
        }
        HashMap hashMap = this.f68157c;
        if (hashMap != null) {
            for (String str2 : hashMap.keySet()) {
                I1.w.e(this.f68157c, str2, c7212v0, str2, iLogger);
            }
        }
        c7212v0.d();
    }
}
