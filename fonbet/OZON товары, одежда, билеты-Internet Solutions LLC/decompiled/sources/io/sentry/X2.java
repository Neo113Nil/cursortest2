package io.sentry;

import io.sentry.O1;
import io.sentry.protocol.t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class X2 extends O1 implements InterfaceC7220x0 {

    /* renamed from: p, reason: collision with root package name */
    private File f66788p;

    /* renamed from: t, reason: collision with root package name */
    private int f66792t;

    /* renamed from: v, reason: collision with root package name */
    private Date f66794v;

    /* renamed from: z, reason: collision with root package name */
    private HashMap f66798z;

    /* renamed from: s, reason: collision with root package name */
    private io.sentry.protocol.t f66791s = new io.sentry.protocol.t();

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private String f66789q = "replay_event";

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private b f66790r = b.SESSION;

    /* renamed from: x, reason: collision with root package name */
    private List<String> f66796x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    private List<String> f66797y = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private List<String> f66795w = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private Date f66793u = C7165l.b();

    public static final class a implements InterfaceC7174n0<X2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final X2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            X2 x22 = new X2();
            interfaceC7131c1.beginObject();
            String str = null;
            b bVar = null;
            Integer num = null;
            Date date = null;
            HashMap hashMap = null;
            io.sentry.protocol.t tVar = null;
            Date date2 = null;
            List<String> list = null;
            List<String> list2 = null;
            List<String> list3 = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "replay_id":
                        tVar = (io.sentry.protocol.t) interfaceC7131c1.S(iLogger, new t.a());
                        break;
                    case "replay_start_timestamp":
                        date2 = interfaceC7131c1.M(iLogger);
                        break;
                    case "type":
                        str = interfaceC7131c1.k0();
                        break;
                    case "urls":
                        list = (List) interfaceC7131c1.U1();
                        break;
                    case "timestamp":
                        date = interfaceC7131c1.M(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) interfaceC7131c1.U1();
                        break;
                    case "trace_ids":
                        list3 = (List) interfaceC7131c1.U1();
                        break;
                    case "replay_type":
                        bVar = (b) interfaceC7131c1.S(iLogger, new b.a());
                        break;
                    case "segment_id":
                        num = interfaceC7131c1.A1();
                        break;
                    default:
                        if (!O1.a.a(x22, nextName, interfaceC7131c1, iLogger)) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                            break;
                        } else {
                            break;
                        }
                }
            }
            interfaceC7131c1.endObject();
            if (str != null) {
                x22.n0(str);
            }
            if (bVar != null) {
                x22.j0(bVar);
            }
            if (num != null) {
                x22.k0(num.intValue());
            }
            if (date != null) {
                x22.l0(date);
            }
            x22.h0(tVar);
            x22.i0(date2);
            x22.p0(list);
            x22.g0(list2);
            x22.m0(list3);
            x22.o0(hashMap);
            return x22;
        }
    }

    /* loaded from: classes10.dex */
    public enum b implements InterfaceC7220x0 {
        SESSION,
        BUFFER;

        public static final class a implements InterfaceC7174n0<b> {
            @Override // io.sentry.InterfaceC7174n0
            @NotNull
            public final b a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
                return b.valueOf(interfaceC7131c1.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.InterfaceC7220x0
        public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
            ((C7212v0) interfaceC7135d1).p(name().toLowerCase(Locale.ROOT));
        }
    }

    @NotNull
    public final Date e0() {
        return this.f66793u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && X2.class == obj.getClass()) {
            X2 x22 = (X2) obj;
            if (this.f66792t == x22.f66792t && io.sentry.util.p.a(this.f66789q, x22.f66789q) && this.f66790r == x22.f66790r && io.sentry.util.p.a(this.f66791s, x22.f66791s) && io.sentry.util.p.a(this.f66795w, x22.f66795w) && io.sentry.util.p.a(this.f66796x, x22.f66796x) && io.sentry.util.p.a(this.f66797y, x22.f66797y)) {
                return true;
            }
        }
        return false;
    }

    public final File f0() {
        return this.f66788p;
    }

    public final void g0(List<String> list) {
        this.f66796x = list;
    }

    public final void h0(io.sentry.protocol.t tVar) {
        this.f66791s = tVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f66789q, this.f66790r, this.f66791s, Integer.valueOf(this.f66792t), this.f66795w, this.f66796x, this.f66797y});
    }

    public final void i0(Date date) {
        this.f66794v = date;
    }

    public final void j0(@NotNull b bVar) {
        this.f66790r = bVar;
    }

    public final void k0(int i11) {
        this.f66792t = i11;
    }

    public final void l0(@NotNull Date date) {
        this.f66793u = date;
    }

    public final void m0(List<String> list) {
        this.f66797y = list;
    }

    public final void n0(@NotNull String str) {
        this.f66789q = str;
    }

    public final void o0(Map<String, Object> map) {
        this.f66798z = (HashMap) map;
    }

    public final void p0(List<String> list) {
        this.f66795w = list;
    }

    public final void q0(File file) {
        this.f66788p = file;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("type");
        c7212v0.p(this.f66789q);
        c7212v0.g("replay_type");
        c7212v0.m(iLogger, this.f66790r);
        c7212v0.g("segment_id");
        c7212v0.l(this.f66792t);
        c7212v0.g("timestamp");
        c7212v0.m(iLogger, this.f66793u);
        if (this.f66791s != null) {
            c7212v0.g("replay_id");
            c7212v0.m(iLogger, this.f66791s);
        }
        if (this.f66794v != null) {
            c7212v0.g("replay_start_timestamp");
            c7212v0.m(iLogger, this.f66794v);
        }
        if (this.f66795w != null) {
            c7212v0.g("urls");
            c7212v0.m(iLogger, this.f66795w);
        }
        if (this.f66796x != null) {
            c7212v0.g("error_ids");
            c7212v0.m(iLogger, this.f66796x);
        }
        if (this.f66797y != null) {
            c7212v0.g("trace_ids");
            c7212v0.m(iLogger, this.f66797y);
        }
        O1.b.a(this, c7212v0, iLogger);
        HashMap hashMap = this.f66798z;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f66798z, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
