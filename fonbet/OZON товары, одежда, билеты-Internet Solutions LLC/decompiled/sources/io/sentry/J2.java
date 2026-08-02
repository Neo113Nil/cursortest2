package io.sentry;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

/* loaded from: classes.dex */
public final class J2 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private int f66648a;

    /* renamed from: b, reason: collision with root package name */
    private String f66649b;

    /* renamed from: c, reason: collision with root package name */
    private String f66650c;

    /* renamed from: d, reason: collision with root package name */
    private String f66651d;

    /* renamed from: e, reason: collision with root package name */
    private Long f66652e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap f66653f;

    public static final class a implements InterfaceC7174n0<J2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final J2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            J2 j22 = new J2();
            interfaceC7131c1.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "package_name":
                        j22.f66650c = interfaceC7131c1.k0();
                        break;
                    case "thread_id":
                        j22.f66652e = interfaceC7131c1.D1();
                        break;
                    case "address":
                        j22.f66649b = interfaceC7131c1.k0();
                        break;
                    case "class_name":
                        j22.f66651d = interfaceC7131c1.k0();
                        break;
                    case "type":
                        j22.f66648a = interfaceC7131c1.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            j22.m(concurrentHashMap);
            interfaceC7131c1.endObject();
            return j22;
        }
    }

    public J2() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J2.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.p.a(this.f66649b, ((J2) obj).f66649b);
    }

    public final String f() {
        return this.f66649b;
    }

    public final int g() {
        return this.f66648a;
    }

    public final void h(String str) {
        this.f66649b = str;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f66649b});
    }

    public final void i(String str) {
        this.f66651d = str;
    }

    public final void j(String str) {
        this.f66650c = str;
    }

    public final void k(Long l11) {
        this.f66652e = l11;
    }

    public final void l(int i11) {
        this.f66648a = i11;
    }

    public final void m(Map<String, Object> map) {
        this.f66653f = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("type");
        c7212v0.l(this.f66648a);
        if (this.f66649b != null) {
            c7212v0.g(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
            c7212v0.p(this.f66649b);
        }
        if (this.f66650c != null) {
            c7212v0.g("package_name");
            c7212v0.p(this.f66650c);
        }
        if (this.f66651d != null) {
            c7212v0.g("class_name");
            c7212v0.p(this.f66651d);
        }
        if (this.f66652e != null) {
            c7212v0.g("thread_id");
            c7212v0.o(this.f66652e);
        }
        ConcurrentHashMap concurrentHashMap = this.f66653f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f66653f, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public J2(@NotNull J2 j22) {
        this.f66648a = j22.f66648a;
        this.f66649b = j22.f66649b;
        this.f66650c = j22.f66650c;
        this.f66651d = j22.f66651d;
        this.f66652e = j22.f66652e;
        this.f66653f = io.sentry.util.c.a(j22.f66653f);
    }
}
