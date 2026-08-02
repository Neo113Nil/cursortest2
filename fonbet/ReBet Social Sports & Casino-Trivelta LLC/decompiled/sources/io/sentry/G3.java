package io.sentry;

import com.twilio.voice.EventKeys;
import io.sentry.AbstractC4810q2;
import io.sentry.protocol.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class G3 extends AbstractC4810q2 implements G0 {

    /* renamed from: p, reason: collision with root package name */
    public File f50341p;

    /* renamed from: t, reason: collision with root package name */
    public int f50345t;

    /* renamed from: v, reason: collision with root package name */
    public Date f50347v;

    /* renamed from: z, reason: collision with root package name */
    public Map f50351z;

    /* renamed from: s, reason: collision with root package name */
    public io.sentry.protocol.u f50344s = new io.sentry.protocol.u();

    /* renamed from: q, reason: collision with root package name */
    public String f50342q = "replay_event";

    /* renamed from: r, reason: collision with root package name */
    public b f50343r = b.SESSION;

    /* renamed from: x, reason: collision with root package name */
    public List f50349x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public List f50350y = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public List f50348w = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public Date f50346u = AbstractC4779m.c();

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public G3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            AbstractC4810q2.a aVar = new AbstractC4810q2.a();
            G3 g32 = new G3();
            interfaceC4809q1.m();
            String str = null;
            b bVar = null;
            Integer num = null;
            Date date = null;
            HashMap hashMap = null;
            io.sentry.protocol.u uVar = null;
            Date date2 = null;
            List list = null;
            List list2 = null;
            List list3 = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "replay_id":
                        uVar = (io.sentry.protocol.u) interfaceC4809q1.x0(iLogger, new u.a());
                        break;
                    case "replay_start_timestamp":
                        date2 = interfaceC4809q1.j0(iLogger);
                        break;
                    case "type":
                        str = interfaceC4809q1.a1();
                        break;
                    case "urls":
                        list = (List) interfaceC4809q1.H1();
                        break;
                    case "timestamp":
                        date = interfaceC4809q1.j0(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) interfaceC4809q1.H1();
                        break;
                    case "trace_ids":
                        list3 = (List) interfaceC4809q1.H1();
                        break;
                    case "replay_type":
                        bVar = (b) interfaceC4809q1.x0(iLogger, new b.a());
                        break;
                    case "segment_id":
                        num = interfaceC4809q1.Q0();
                        break;
                    default:
                        if (!aVar.a(g32, f02, interfaceC4809q1, iLogger)) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            interfaceC4809q1.g1(iLogger, hashMap, f02);
                            break;
                        } else {
                            break;
                        }
                }
            }
            interfaceC4809q1.t();
            if (str != null) {
                g32.p0(str);
            }
            if (bVar != null) {
                g32.l0(bVar);
            }
            if (num != null) {
                g32.m0(num.intValue());
            }
            if (date != null) {
                g32.n0(date);
            }
            g32.j0(uVar);
            g32.k0(date2);
            g32.r0(list);
            g32.i0(list2);
            g32.o0(list3);
            g32.q0(hashMap);
            return g32;
        }
    }

    public enum b implements G0 {
        SESSION,
        BUFFER;

        public static final class a implements InterfaceC4859w0 {
            @Override // io.sentry.InterfaceC4859w0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
                return b.valueOf(interfaceC4809q1.M0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.G0
        public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
            interfaceC4813r1.e(name().toLowerCase(Locale.ROOT));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G3.class == obj.getClass()) {
            G3 g32 = (G3) obj;
            if (this.f50345t == g32.f50345t && io.sentry.util.w.a(this.f50342q, g32.f50342q) && this.f50343r == g32.f50343r && io.sentry.util.w.a(this.f50344s, g32.f50344s) && io.sentry.util.w.a(this.f50348w, g32.f50348w) && io.sentry.util.w.a(this.f50349x, g32.f50349x) && io.sentry.util.w.a(this.f50350y, g32.f50350y)) {
                return true;
            }
        }
        return false;
    }

    public Date g0() {
        return this.f50346u;
    }

    public File h0() {
        return this.f50341p;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f50342q, this.f50343r, this.f50344s, Integer.valueOf(this.f50345t), this.f50348w, this.f50349x, this.f50350y);
    }

    public void i0(List list) {
        this.f50349x = list;
    }

    public void j0(io.sentry.protocol.u uVar) {
        this.f50344s = uVar;
    }

    public void k0(Date date) {
        this.f50347v = date;
    }

    public void l0(b bVar) {
        this.f50343r = bVar;
    }

    public void m0(int i10) {
        this.f50345t = i10;
    }

    public void n0(Date date) {
        this.f50346u = date;
    }

    public void o0(List list) {
        this.f50350y = list;
    }

    public void p0(String str) {
        this.f50342q = str;
    }

    public void q0(Map map) {
        this.f50351z = map;
    }

    public void r0(List list) {
        this.f50348w = list;
    }

    public void s0(File file) {
        this.f50341p = file;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("type").e(this.f50342q);
        interfaceC4813r1.d("replay_type").j(iLogger, this.f50343r);
        interfaceC4813r1.d("segment_id").a(this.f50345t);
        interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, this.f50346u);
        if (this.f50344s != null) {
            interfaceC4813r1.d("replay_id").j(iLogger, this.f50344s);
        }
        if (this.f50347v != null) {
            interfaceC4813r1.d("replay_start_timestamp").j(iLogger, this.f50347v);
        }
        if (this.f50348w != null) {
            interfaceC4813r1.d("urls").j(iLogger, this.f50348w);
        }
        if (this.f50349x != null) {
            interfaceC4813r1.d("error_ids").j(iLogger, this.f50349x);
        }
        if (this.f50350y != null) {
            interfaceC4813r1.d("trace_ids").j(iLogger, this.f50350y);
        }
        new AbstractC4810q2.b().a(this, interfaceC4813r1, iLogger);
        Map map = this.f50351z;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f50351z.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
