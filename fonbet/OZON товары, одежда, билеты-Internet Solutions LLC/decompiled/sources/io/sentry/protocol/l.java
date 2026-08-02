package io.sentry.protocol;

import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68256a;

    /* renamed from: b, reason: collision with root package name */
    private String f68257b;

    /* renamed from: c, reason: collision with root package name */
    private String f68258c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f68259d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractMap f68260e;

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentHashMap f68261f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f68262g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f68263h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f68264i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f68265j;

    /* renamed from: k, reason: collision with root package name */
    private HashMap f68266k;

    public static final class a implements InterfaceC7174n0<l> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final l a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            l lVar = new l();
            interfaceC7131c1.beginObject();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "description":
                        lVar.f68257b = interfaceC7131c1.k0();
                        break;
                    case "exception_id":
                        lVar.f68263h = interfaceC7131c1.A1();
                        break;
                    case "data":
                        lVar.f68261f = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                        break;
                    case "meta":
                        lVar.f68260e = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                        break;
                    case "type":
                        lVar.f68256a = interfaceC7131c1.k0();
                        break;
                    case "handled":
                        lVar.f68259d = interfaceC7131c1.P();
                        break;
                    case "synthetic":
                        lVar.f68262g = interfaceC7131c1.P();
                        break;
                    case "is_exception_group":
                        lVar.f68265j = interfaceC7131c1.P();
                        break;
                    case "help_link":
                        lVar.f68258c = interfaceC7131c1.k0();
                        break;
                    case "parent_id":
                        lVar.f68264i = interfaceC7131c1.A1();
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
            lVar.s(hashMap);
            return lVar;
        }
    }

    public final String k() {
        return this.f68256a;
    }

    public final Boolean l() {
        return this.f68259d;
    }

    public final void m(Integer num) {
        this.f68263h = num;
    }

    public final void n() {
        this.f68259d = Boolean.FALSE;
    }

    public final void o(HashMap hashMap) {
        this.f68260e = new HashMap(hashMap);
    }

    public final void p(Integer num) {
        this.f68264i = num;
    }

    public final void q() {
        this.f68262g = Boolean.TRUE;
    }

    public final void r(String str) {
        this.f68256a = str;
    }

    public final void s(Map<String, Object> map) {
        this.f68266k = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68256a != null) {
            c7212v0.g("type");
            c7212v0.p(this.f68256a);
        }
        if (this.f68257b != null) {
            c7212v0.g("description");
            c7212v0.p(this.f68257b);
        }
        if (this.f68258c != null) {
            c7212v0.g("help_link");
            c7212v0.p(this.f68258c);
        }
        if (this.f68259d != null) {
            c7212v0.g("handled");
            c7212v0.n(this.f68259d);
        }
        if (this.f68260e != null) {
            c7212v0.g("meta");
            c7212v0.m(iLogger, this.f68260e);
        }
        if (this.f68261f != null) {
            c7212v0.g("data");
            c7212v0.m(iLogger, this.f68261f);
        }
        if (this.f68262g != null) {
            c7212v0.g("synthetic");
            c7212v0.n(this.f68262g);
        }
        if (this.f68263h != null) {
            c7212v0.g("exception_id");
            c7212v0.m(iLogger, this.f68263h);
        }
        if (this.f68264i != null) {
            c7212v0.g("parent_id");
            c7212v0.m(iLogger, this.f68264i);
        }
        if (this.f68265j != null) {
            c7212v0.g("is_exception_group");
            c7212v0.n(this.f68265j);
        }
        HashMap hashMap = this.f68266k;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f68266k, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
