package androidx.recyclerview.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i0;
import java.util.Map;
import xsna.bh10;
import xsna.c63;
import xsna.cuo;
import xsna.dq;
import xsna.duo;
import xsna.epx;
import xsna.hg00;
import xsna.hwi0;
import xsna.izs;
import xsna.l100;
import xsna.lhg;
import xsna.nz3;
import xsna.shy;
import xsna.up;
import xsna.urd0;
import xsna.v11;

/* compiled from: ViewPoolProviderBase.kt */
/* loaded from: classes12.dex */
public class t0 {
    public final b a;
    public final a b;
    public final d c;
    public final s0 d;
    public final c e;

    /* compiled from: ViewPoolProviderBase.kt */
    public interface a {
        void a(d dVar);

        void b(d dVar);
    }

    /* compiled from: ViewPoolProviderBase.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final Map<Integer, Integer> c;
        public final Context d;
        public final String e;
        public final izs<Context, RecyclerView.Adapter<?>> f;
        public final c63 g;
        public final long h;
        public final izs<RecyclerView.e0, Boolean> i;

        public b() {
            throw null;
        }

        public b(int i, int i2, Map map, Context context, String str, izs izsVar, izs izsVar2, int i3) {
            c63 c63Var = c63.a;
            izsVar2 = (i3 & 256) != 0 ? new hwi0(15) : izsVar2;
            this.a = i;
            this.b = i2;
            this.c = map;
            this.d = context;
            this.e = str;
            this.f = izsVar;
            this.g = c63Var;
            this.h = 4000L;
            this.i = izsVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && this.h == bVar.h && epx.f(this.i, bVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + bh10.a((this.g.hashCode() + dq.c(urd0.a((this.d.hashCode() + v11.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c)) * 31, 31, this.e), 31, this.f)) * 31, 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkPoolConfig(mode=");
            sb.append(this.a);
            sb.append(", priority=");
            sb.append(this.b);
            sb.append(", viewTypes=");
            sb.append(this.c);
            sb.append(", context=");
            sb.append(this.d);
            sb.append(", adapterName=");
            sb.append(this.e);
            sb.append(", adapterFactory=");
            sb.append(this.f);
            sb.append(", dispatcher=");
            sb.append(this.g);
            sb.append(", waitVhCreationTimeout=");
            sb.append(this.h);
            sb.append(", prefetchViewHolderListener=");
            return up.c(sb, this.i, ')');
        }
    }

    /* compiled from: ViewPoolProviderBase.kt */
    public static final class c extends c63.b {
        public c() {
        }

        @Override // xsna.c63.b
        public final void B(Configuration configuration) {
            t0.this.d.j();
        }

        @Override // xsna.c63.b
        public final void C() {
            t0.this.d.k();
        }

        @Override // xsna.c63.b
        public final void n(Activity activity) {
            t0.this.d.l(activity);
        }

        @Override // xsna.c63.b
        public final void u() {
            t0.this.d.r();
        }

        @Override // xsna.c63.b
        public final void w() {
            t0.this.d.k();
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            t0.this.d.m();
        }
    }

    /* compiled from: ViewPoolProviderBase.kt */
    public static final class d {
        public d() {
        }

        public final void a(int i) {
            t0.this.d.q(i);
        }
    }

    public t0(b bVar, l100 l100Var, a aVar) {
        i0 i0Var;
        izs<RecyclerView.e0, Boolean> izsVar = bVar.i;
        long j = bVar.h;
        this.a = bVar;
        this.b = aVar;
        d dVar = new d();
        this.c = dVar;
        String str = bVar.e;
        izs<Context, RecyclerView.Adapter<?>> izsVar2 = bVar.f;
        Context context = bVar.d;
        Map<Integer, Integer> map = bVar.c;
        int i = bVar.b;
        int i2 = bVar.a;
        if (i2 == 0) {
            i0Var = i0.c.b;
        } else if (i2 == 1) {
            i0Var = i0.e.b;
        } else if (i2 == 2) {
            i0Var = i0.a.b;
        } else if (i2 == 3) {
            i0Var = i0.f.b;
        } else if (i2 == 4) {
            hg00 hg00Var = hg00.a;
            nz3 nz3Var = nz3.a;
            i0Var = new i0.b(new cuo(j, izsVar));
        } else {
            if (i2 != 5) {
                throw new IllegalArgumentException(lhg.a(i2, "Unknown pool mode="));
            }
            nz3 nz3Var2 = nz3.a;
            i0Var = new i0.d(new duo(j, izsVar));
        }
        i0 i0Var2 = i0Var;
        h0 h0Var = new h0(str, izsVar2, context, l100Var, map, i, i0Var2, bVar.i);
        this.d = ((i0Var2 instanceof i0.c) || (i0Var2 instanceof i0.f)) ? new b0(h0Var) : new j0(h0Var);
        c cVar = new c();
        this.e = cVar;
        aVar.a(dVar);
        bVar.g.getClass();
        c63.a(cVar);
    }

    public final LayoutInflater a() {
        return this.d.p();
    }

    public final RecyclerView.u b() {
        return this.d.o();
    }
}
