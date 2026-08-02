package io.sentry;

import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.o3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4793o3 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public int f52233a;

    /* renamed from: b, reason: collision with root package name */
    public String f52234b;

    /* renamed from: c, reason: collision with root package name */
    public String f52235c;

    /* renamed from: d, reason: collision with root package name */
    public String f52236d;

    /* renamed from: e, reason: collision with root package name */
    public Long f52237e;

    /* renamed from: f, reason: collision with root package name */
    public Map f52238f;

    /* renamed from: io.sentry.o3$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4793o3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            C4793o3 c4793o3 = new C4793o3();
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "package_name":
                        c4793o3.f52235c = interfaceC4809q1.a1();
                        break;
                    case "thread_id":
                        c4793o3.f52237e = interfaceC4809q1.U0();
                        break;
                    case "address":
                        c4793o3.f52234b = interfaceC4809q1.a1();
                        break;
                    case "class_name":
                        c4793o3.f52236d = interfaceC4809q1.a1();
                        break;
                    case "type":
                        c4793o3.f52233a = interfaceC4809q1.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            c4793o3.m(concurrentHashMap);
            interfaceC4809q1.t();
            return c4793o3;
        }
    }

    public C4793o3() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4793o3.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.w.a(this.f52234b, ((C4793o3) obj).f52234b);
    }

    public String f() {
        return this.f52234b;
    }

    public int g() {
        return this.f52233a;
    }

    public void h(String str) {
        this.f52234b = str;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52234b);
    }

    public void i(String str) {
        this.f52236d = str;
    }

    public void j(String str) {
        this.f52235c = str;
    }

    public void k(Long l10) {
        this.f52237e = l10;
    }

    public void l(int i10) {
        this.f52233a = i10;
    }

    public void m(Map map) {
        this.f52238f = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("type").a(this.f52233a);
        if (this.f52234b != null) {
            interfaceC4813r1.d("address").e(this.f52234b);
        }
        if (this.f52235c != null) {
            interfaceC4813r1.d("package_name").e(this.f52235c);
        }
        if (this.f52236d != null) {
            interfaceC4813r1.d("class_name").e(this.f52236d);
        }
        if (this.f52237e != null) {
            interfaceC4813r1.d("thread_id").i(this.f52237e);
        }
        Map map = this.f52238f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52238f.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public C4793o3(C4793o3 c4793o3) {
        this.f52233a = c4793o3.f52233a;
        this.f52234b = c4793o3.f52234b;
        this.f52235c = c4793o3.f52235c;
        this.f52236d = c4793o3.f52236d;
        this.f52237e = c4793o3.f52237e;
        this.f52238f = AbstractC4845c.b(c4793o3.f52238f);
    }
}
