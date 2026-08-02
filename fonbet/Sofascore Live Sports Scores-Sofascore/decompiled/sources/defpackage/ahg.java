package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.ironsource.Ua;
import java.util.Timer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ahg {
    public final boolean a;
    public final hcg b;
    public final long c;
    public final long d;
    public final ad2 e;
    public final View f;
    public xgg g;
    public final long h;
    public long i;
    public final Timer j;
    public scg k;
    public zgg l;
    public boolean m;

    public ahg(Context context, long j, long j2, boolean z) {
        long e;
        hcg hcgVar = new hcg(context);
        this.a = z;
        this.b = hcgVar;
        this.c = Ua.s;
        this.d = 2000L;
        hs4 hs4Var = z45.a;
        this.e = s9a.c(rob.a.f);
        this.f = hcgVar.getView();
        this.h = -1L;
        this.i = -1L;
        this.j = new Timer();
        hcgVar.setClickListener(new cne(this, 18));
        if (j2 < 0) {
            e = (long) (llf.a(j2 * (-0.01d), 0.0d, 1.0d) * (j < 0 ? 0L : j));
        } else {
            e = llf.e(j2, 0L, j < 0 ? 0L : j);
        }
        this.h = e;
        if (e > 0) {
            String valueOf = String.valueOf((int) Math.ceil(e / 1000.0d));
            valueOf.getClass();
            xw3.L(hcgVar.a, null, null, new m1f(hcgVar, valueOf, null, 9), 3);
        } else {
            this.m = true;
            hcgVar.a(true);
            c();
        }
    }

    public final void a() {
        xw3.L(this.e, null, null, new ygg(this, null, 0), 3);
    }

    public final void b(wgg wggVar, long j) {
        if (this.m) {
            return;
        }
        long j2 = this.h - j;
        if (j2 < 0) {
            j2 = 0;
        }
        hcg hcgVar = this.b;
        if (j2 == 0) {
            this.m = true;
            hcgVar.a(true);
            c();
            return;
        }
        String valueOf = String.valueOf((int) Math.ceil(j2 / 1000.0d));
        hcgVar.getClass();
        valueOf.getClass();
        xw3.L(hcgVar.a, null, null, new m1f(hcgVar, valueOf, null, 9), 3);
        try {
            wgg wggVar2 = wgg.b;
            Timer timer = this.j;
            if (wggVar == wggVar2 && j == this.i) {
                zgg zggVar = this.l;
                if (zggVar != null) {
                    zggVar.cancel();
                }
                this.l = null;
                if (this.k == null) {
                    scg scgVar = new scg(this, 2);
                    this.k = scgVar;
                    timer.schedule(scgVar, this.c);
                }
            } else {
                scg scgVar2 = this.k;
                if (scgVar2 != null && this.l == null) {
                    zgg zggVar2 = new zgg(scgVar2, this);
                    this.l = zggVar2;
                    timer.schedule(zggVar2, this.d);
                }
            }
        } catch (Exception unused) {
        }
        this.i = j;
    }

    public final void c() {
        this.j.cancel();
        scg scgVar = this.k;
        if (scgVar != null) {
            scgVar.cancel();
        }
        zgg zggVar = this.l;
        if (zggVar != null) {
            zggVar.cancel();
        }
    }

    public final void d(gig gigVar) {
        rq3 rq3Var = null;
        xw3.L(this.e, null, null, new w9g(this, (int) TypedValue.applyDimension(1, gigVar.a, this.f.getContext().getResources().getDisplayMetrics()), rq3Var, 6), 3);
    }

    public final void e() {
        xw3.L(this.e, null, null, new ygg(this, null, 1), 3);
    }
}
