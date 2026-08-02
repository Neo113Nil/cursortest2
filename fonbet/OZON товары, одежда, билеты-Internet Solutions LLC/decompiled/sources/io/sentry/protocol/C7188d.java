package io.sentry.protocol;

import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.W2;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.protocol.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7188d implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private q f68189a;

    /* renamed from: b, reason: collision with root package name */
    private List<DebugImage> f68190b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f68191c;

    /* renamed from: io.sentry.protocol.d$a */
    public static final class a implements InterfaceC7174n0<C7188d> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7188d a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            C7188d c7188d = new C7188d();
            interfaceC7131c1.beginObject();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("images")) {
                    c7188d.f68190b = interfaceC7131c1.J0(iLogger, new DebugImage.a());
                } else if (nextName.equals("sdk_info")) {
                    c7188d.f68189a = (q) interfaceC7131c1.S(iLogger, new q.a());
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                }
            }
            interfaceC7131c1.endObject();
            c7188d.f(hashMap);
            return c7188d;
        }
    }

    public static C7188d c(C7188d c7188d, @NotNull W2 w22) {
        ArrayList arrayList = new ArrayList();
        if (w22.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(w22.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : w22.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c7188d == null) {
            c7188d = new C7188d();
        }
        List<DebugImage> list = c7188d.f68190b;
        if (list == null) {
            c7188d.e(arrayList);
            return c7188d;
        }
        list.addAll(arrayList);
        return c7188d;
    }

    public final List<DebugImage> d() {
        return this.f68190b;
    }

    public final void e(ArrayList arrayList) {
        this.f68190b = arrayList != null ? new ArrayList(arrayList) : null;
    }

    public final void f(Map<String, Object> map) {
        this.f68191c = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68189a != null) {
            c7212v0.g("sdk_info");
            c7212v0.m(iLogger, this.f68189a);
        }
        if (this.f68190b != null) {
            c7212v0.g("images");
            c7212v0.m(iLogger, this.f68190b);
        }
        HashMap hashMap = this.f68191c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f68191c, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
