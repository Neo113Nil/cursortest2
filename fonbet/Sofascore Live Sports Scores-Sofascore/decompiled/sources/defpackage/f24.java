package defpackage;

import android.os.SystemClock;
import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f24 extends d7e {
    public d7e f;
    public final d7e g;
    public final op3 h;
    public final int i;
    public final boolean j;
    public boolean m;
    public final e1d k = e.f(0);
    public long l = -1;
    public final e1d n = e.f(Float.valueOf(1.0f));
    public final e1d o = e.f(null);

    public f24(d7e d7eVar, d7e d7eVar2, op3 op3Var, int i, boolean z) {
        this.f = d7eVar;
        this.g = d7eVar2;
        this.h = op3Var;
        this.i = i;
        this.j = z;
    }

    @Override // defpackage.d7e
    public final boolean c(float f) {
        ((eoh) this.n).setValue(Float.valueOf(f));
        return true;
    }

    @Override // defpackage.d7e
    public final boolean e(ay1 ay1Var) {
        ((eoh) this.o).setValue(ay1Var);
        return true;
    }

    @Override // defpackage.d7e
    public final long i() {
        d7e d7eVar = this.f;
        long i = d7eVar != null ? d7eVar.i() : 0L;
        d7e d7eVar2 = this.g;
        long i2 = d7eVar2 != null ? d7eVar2.i() : 0L;
        boolean z = i != 9205357640488583168L;
        boolean z2 = i2 != 9205357640488583168L;
        if (z && z2) {
            return yaa.f(Math.max(njh.f(i), njh.f(i2)), Math.max(njh.d(i), njh.d(i2)));
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.d7e
    public final void j(ha5 ha5Var) {
        boolean z = this.m;
        e1d e1dVar = this.n;
        d7e d7eVar = this.g;
        if (z) {
            k(ha5Var, d7eVar, ((Number) ((eoh) e1dVar).getValue()).floatValue());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.l;
        if (j == -1) {
            this.l = uptimeMillis;
            j = uptimeMillis;
        }
        float f = (uptimeMillis - j) / this.i;
        float floatValue = ((Number) ((eoh) e1dVar).getValue()).floatValue() * llf.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        float floatValue2 = this.j ? ((Number) ((eoh) e1dVar).getValue()).floatValue() - floatValue : ((Number) ((eoh) e1dVar).getValue()).floatValue();
        this.m = f >= 1.0f;
        k(ha5Var, this.f, floatValue2);
        k(ha5Var, d7eVar, floatValue);
        if (this.m) {
            this.f = null;
        } else {
            eoh eohVar = (eoh) this.k;
            eohVar.setValue(Integer.valueOf(((Number) eohVar.getValue()).intValue() + 1));
        }
    }

    public final void k(ha5 ha5Var, d7e d7eVar, float f) {
        if (d7eVar == null || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        long n = ha5Var.n();
        long i = d7eVar.i();
        long B = (i == 9205357640488583168L || njh.g(i) || n == 9205357640488583168L || njh.g(n)) ? n : b6a.B(i, this.h.e(i, n));
        e1d e1dVar = this.o;
        if (n == 9205357640488583168L || njh.g(n)) {
            d7eVar.g(ha5Var, B, f, (ay1) ((eoh) e1dVar).getValue());
            return;
        }
        float f2 = (njh.f(n) - njh.f(B)) / 2.0f;
        float d = (njh.d(n) - njh.d(B)) / 2.0f;
        ((hpo) ha5Var.L0().a).y(f2, d, f2, d);
        d7eVar.g(ha5Var, B, f, (ay1) ((eoh) e1dVar).getValue());
        hpo hpoVar = (hpo) ha5Var.L0().a;
        float f3 = -f2;
        float f4 = -d;
        hpoVar.y(f3, f4, f3, f4);
    }
}
