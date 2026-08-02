package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k39 implements hsg, ypd, qe6 {
    public final Context a;
    public final wv4 c;
    public boolean d;
    public final g8f g;
    public final c0l h;
    public final ti3 i;
    public Boolean k;
    public final zl1 l;
    public final zti m;
    public final g7h n;
    public final HashMap b = new HashMap();
    public final Object e = new Object();
    public final y3g f = new y3g(new by9(21));
    public final HashMap j = new HashMap();

    static {
        rik.x("GreedyScheduler");
    }

    public k39(Context context, ti3 ti3Var, nuj nujVar, g8f g8fVar, c0l c0lVar, zti ztiVar) {
        this.a = context;
        dad dadVar = ti3Var.f;
        this.c = new wv4(this, dadVar, ti3Var.d);
        this.n = new g7h(dadVar, c0lVar);
        this.m = ztiVar;
        this.l = new zl1(nujVar);
        this.i = ti3Var;
        this.g = g8fVar;
        this.h = c0lVar;
    }

    @Override // defpackage.qe6
    public final void a(qbl qblVar, boolean z) {
        yda ydaVar;
        cci z2 = this.f.z(qblVar);
        if (z2 != null) {
            this.n.m(z2);
        }
        synchronized (this.e) {
            ydaVar = (yda) this.b.remove(qblVar);
        }
        if (ydaVar != null) {
            rik o = rik.o();
            Objects.toString(qblVar);
            o.getClass();
            ydaVar.e(null);
        }
        if (z) {
            return;
        }
        synchronized (this.e) {
            this.j.remove(qblVar);
        }
    }

    @Override // defpackage.hsg
    public final void b(String str) {
        List<cci> y;
        Runnable runnable;
        Boolean bool = this.k;
        if (bool == null) {
            bool = Boolean.valueOf(f8f.a(this.a, this.i));
            this.k = bool;
        }
        if (!bool.booleanValue()) {
            rik.o().getClass();
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        rik.o().getClass();
        wv4 wv4Var = this.c;
        if (wv4Var != null && (runnable = (Runnable) wv4Var.c.remove(str)) != null) {
            ((Handler) wv4Var.b.b).removeCallbacks(runnable);
        }
        y3g y3gVar = this.f;
        y3gVar.getClass();
        str.getClass();
        synchronized (y3gVar.c) {
            y = ((by9) y3gVar.b).y(str);
        }
        for (cci cciVar : y) {
            this.n.m(cciVar);
            c0l c0lVar = this.h;
            c0lVar.getClass();
            c0lVar.m(cciVar, -512);
        }
    }

    @Override // defpackage.hsg
    public final void c(lcl... lclVarArr) {
        long max;
        Boolean bool = this.k;
        if (bool == null) {
            bool = Boolean.valueOf(f8f.a(this.a, this.i));
            this.k = bool;
        }
        if (!bool.booleanValue()) {
            rik.o().getClass();
            return;
        }
        if (!this.d) {
            this.g.a(this);
            this.d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (lcl lclVar : lclVarArr) {
            if (!this.f.m(rha.p(lclVar))) {
                synchronized (this.e) {
                    try {
                        qbl p = rha.p(lclVar);
                        j39 j39Var = (j39) this.j.get(p);
                        if (j39Var == null) {
                            int i = lclVar.k;
                            bgf bgfVar = this.i.d;
                            j39Var = new j39(i, System.currentTimeMillis());
                            this.j.put(p, j39Var);
                        }
                        max = (Math.max((lclVar.k - j39Var.a) - 5, 0) * CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) + j39Var.b;
                    } finally {
                    }
                }
                long max2 = Math.max(lclVar.a(), max);
                bgf bgfVar2 = this.i.d;
                long currentTimeMillis = System.currentTimeMillis();
                if (lclVar.b == sbl.a) {
                    if (currentTimeMillis < max2) {
                        wv4 wv4Var = this.c;
                        if (wv4Var != null) {
                            dad dadVar = wv4Var.b;
                            HashMap hashMap = wv4Var.c;
                            Runnable runnable = (Runnable) hashMap.remove(lclVar.a);
                            if (runnable != null) {
                                ((Handler) dadVar.b).removeCallbacks(runnable);
                            }
                            a8p a8pVar = new a8p(wv4Var, lclVar, false, 10);
                            hashMap.put(lclVar.a, a8pVar);
                            ((Handler) dadVar.b).postDelayed(a8pVar, max2 - System.currentTimeMillis());
                        }
                    } else if (!Intrinsics.c(zm3.j, lclVar.j)) {
                        zm3 zm3Var = lclVar.j;
                        if (zm3Var.d) {
                            rik o = rik.o();
                            lclVar.toString();
                            o.getClass();
                        } else if (zm3Var.i.isEmpty()) {
                            hashSet.add(lclVar);
                            hashSet2.add(lclVar.a);
                        } else {
                            rik o2 = rik.o();
                            lclVar.toString();
                            o2.getClass();
                        }
                    } else if (!this.f.m(rha.p(lclVar))) {
                        rik.o().getClass();
                        y3g y3gVar = this.f;
                        y3gVar.getClass();
                        cci E = y3gVar.E(rha.p(lclVar));
                        this.n.B(E);
                        c0l c0lVar = this.h;
                        c0lVar.getClass();
                        c0lVar.k(E, null);
                    }
                }
            }
        }
        synchronized (this.e) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, hashSet2);
                    rik.o().getClass();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        lcl lclVar2 = (lcl) it.next();
                        qbl p2 = rha.p(lclVar2);
                        if (!this.b.containsKey(p2)) {
                            this.b.put(p2, kbl.a(this.l, lclVar2, ((zbl) this.m).b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.ypd
    public final void d(lcl lclVar, jn3 jn3Var) {
        qbl p = rha.p(lclVar);
        boolean z = jn3Var instanceof hn3;
        c0l c0lVar = this.h;
        g7h g7hVar = this.n;
        y3g y3gVar = this.f;
        if (z) {
            if (y3gVar.m(p)) {
                return;
            }
            rik o = rik.o();
            p.toString();
            o.getClass();
            cci E = y3gVar.E(p);
            g7hVar.B(E);
            c0lVar.getClass();
            c0lVar.k(E, null);
            return;
        }
        rik o2 = rik.o();
        p.toString();
        o2.getClass();
        cci z2 = y3gVar.z(p);
        if (z2 != null) {
            g7hVar.m(z2);
            int i = ((in3) jn3Var).a;
            c0lVar.getClass();
            c0lVar.m(z2, i);
        }
    }

    @Override // defpackage.hsg
    public final boolean e() {
        return false;
    }
}
