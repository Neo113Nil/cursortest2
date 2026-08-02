package io.sentry.protocol;

import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68158a;

    /* renamed from: b, reason: collision with root package name */
    private String f68159b;

    /* renamed from: c, reason: collision with root package name */
    private String f68160c;

    /* renamed from: d, reason: collision with root package name */
    private String f68161d;

    /* renamed from: e, reason: collision with root package name */
    private Double f68162e;

    /* renamed from: f, reason: collision with root package name */
    private Double f68163f;

    /* renamed from: g, reason: collision with root package name */
    private Double f68164g;

    /* renamed from: h, reason: collision with root package name */
    private Double f68165h;

    /* renamed from: i, reason: collision with root package name */
    private String f68166i;

    /* renamed from: j, reason: collision with root package name */
    private Double f68167j;

    /* renamed from: k, reason: collision with root package name */
    private List<G> f68168k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap f68169l;

    public static final class a implements InterfaceC7174n0<G> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final G a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            G g10 = new G();
            interfaceC7131c1.beginObject();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "rendering_system":
                        g10.f68158a = interfaceC7131c1.k0();
                        break;
                    case "identifier":
                        g10.f68160c = interfaceC7131c1.k0();
                        break;
                    case "height":
                        g10.f68163f = interfaceC7131c1.g1();
                        break;
                    case "x":
                        g10.f68164g = interfaceC7131c1.g1();
                        break;
                    case "y":
                        g10.f68165h = interfaceC7131c1.g1();
                        break;
                    case "tag":
                        g10.f68161d = interfaceC7131c1.k0();
                        break;
                    case "type":
                        g10.f68159b = interfaceC7131c1.k0();
                        break;
                    case "alpha":
                        g10.f68167j = interfaceC7131c1.g1();
                        break;
                    case "width":
                        g10.f68162e = interfaceC7131c1.g1();
                        break;
                    case "children":
                        g10.f68168k = interfaceC7131c1.J0(iLogger, this);
                        break;
                    case "visibility":
                        g10.f68166i = interfaceC7131c1.k0();
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
            g10.q(hashMap);
            return g10;
        }
    }

    public final void l(Double d11) {
        this.f68167j = d11;
    }

    public final void m(ArrayList arrayList) {
        this.f68168k = arrayList;
    }

    public final void n(Double d11) {
        this.f68163f = d11;
    }

    public final void o(String str) {
        this.f68160c = str;
    }

    public final void p(String str) {
        this.f68159b = str;
    }

    public final void q(Map<String, Object> map) {
        this.f68169l = (HashMap) map;
    }

    public final void r(String str) {
        this.f68166i = str;
    }

    public final void s(Double d11) {
        this.f68162e = d11;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68158a != null) {
            c7212v0.g("rendering_system");
            c7212v0.p(this.f68158a);
        }
        if (this.f68159b != null) {
            c7212v0.g("type");
            c7212v0.p(this.f68159b);
        }
        if (this.f68160c != null) {
            c7212v0.g("identifier");
            c7212v0.p(this.f68160c);
        }
        if (this.f68161d != null) {
            c7212v0.g("tag");
            c7212v0.p(this.f68161d);
        }
        if (this.f68162e != null) {
            c7212v0.g("width");
            c7212v0.o(this.f68162e);
        }
        if (this.f68163f != null) {
            c7212v0.g("height");
            c7212v0.o(this.f68163f);
        }
        if (this.f68164g != null) {
            c7212v0.g("x");
            c7212v0.o(this.f68164g);
        }
        if (this.f68165h != null) {
            c7212v0.g("y");
            c7212v0.o(this.f68165h);
        }
        if (this.f68166i != null) {
            c7212v0.g("visibility");
            c7212v0.p(this.f68166i);
        }
        if (this.f68167j != null) {
            c7212v0.g("alpha");
            c7212v0.o(this.f68167j);
        }
        List<G> list = this.f68168k;
        if (list != null && !list.isEmpty()) {
            c7212v0.g("children");
            c7212v0.m(iLogger, this.f68168k);
        }
        HashMap hashMap = this.f68169l;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f68169l, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public final void t(Double d11) {
        this.f68164g = d11;
    }

    public final void u(Double d11) {
        this.f68165h = d11;
    }
}
