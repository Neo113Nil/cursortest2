package io.sentry.protocol;

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

/* loaded from: classes.dex */
public final class q implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68308a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f68309b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f68310c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f68311d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f68312e;

    public static final class a implements InterfaceC7174n0<q> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final q a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            q qVar = new q();
            interfaceC7131c1.beginObject();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "sdk_name":
                        qVar.f68308a = interfaceC7131c1.k0();
                        break;
                    case "version_patchlevel":
                        qVar.f68311d = interfaceC7131c1.A1();
                        break;
                    case "version_major":
                        qVar.f68309b = interfaceC7131c1.A1();
                        break;
                    case "version_minor":
                        qVar.f68310c = interfaceC7131c1.A1();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                        break;
                }
            }
            interfaceC7131c1.endObject();
            qVar.e(hashMap);
            return qVar;
        }
    }

    public final void e(Map<String, Object> map) {
        this.f68312e = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68308a != null) {
            c7212v0.g("sdk_name");
            c7212v0.p(this.f68308a);
        }
        if (this.f68309b != null) {
            c7212v0.g("version_major");
            c7212v0.o(this.f68309b);
        }
        if (this.f68310c != null) {
            c7212v0.g("version_minor");
            c7212v0.o(this.f68310c);
        }
        if (this.f68311d != null) {
            c7212v0.g("version_patchlevel");
            c7212v0.o(this.f68311d);
        }
        HashMap hashMap = this.f68312e;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f68312e, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
