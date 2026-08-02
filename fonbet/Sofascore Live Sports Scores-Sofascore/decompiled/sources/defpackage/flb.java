package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class flb implements cdi {
    public final e1d a;
    public final e1d b;
    public final e1d c;
    public final e1d d;
    public final e1d e;
    public final e1d f;
    public final e1d g;
    public final ay4 h;
    public final e1d i;
    public final e1d j;
    public final e1d k;
    public final e1d l;
    public final ay4 m;
    public final ay4 n;
    public final q1d o;

    public flb() {
        Boolean bool = Boolean.FALSE;
        this.a = e.f(bool);
        this.b = e.f(1);
        this.c = e.f(1);
        this.d = e.f(bool);
        this.e = e.f(null);
        this.f = e.f(Float.valueOf(1.0f));
        this.g = e.f(bool);
        this.h = goh.b(new dlb(this, 1));
        this.i = e.f(null);
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.j = e.f(valueOf);
        this.k = e.f(valueOf);
        this.l = e.f(Long.MIN_VALUE);
        this.m = goh.b(new dlb(this, 0));
        this.n = goh.b(new dlb(this, 2));
        this.o = new q1d();
    }

    public final void c() {
        if (((eoh) this.e).getValue() == null) {
            return;
        }
        pvd.j();
    }

    public final int d() {
        return ((Number) ((eoh) this.b).getValue()).intValue();
    }

    public final float e() {
        return ((Number) ((eoh) this.k).getValue()).floatValue();
    }

    public final float f() {
        return ((Number) ((eoh) this.f).getValue()).floatValue();
    }

    public final boolean g(int i, long j) {
        plb plbVar = (plb) ((eoh) this.i).getValue();
        if (plbVar == null) {
            return true;
        }
        e1d e1dVar = this.l;
        long longValue = ((Number) ((eoh) e1dVar).getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) ((eoh) e1dVar).getValue()).longValue();
        ((eoh) e1dVar).setValue(Long.valueOf(j));
        c();
        c();
        float b = (longValue / 1000000) / plbVar.b();
        ay4 ay4Var = this.h;
        float floatValue = ((Number) ay4Var.getValue()).floatValue() * b;
        float floatValue2 = ((Number) ay4Var.getValue()).floatValue();
        e1d e1dVar2 = this.j;
        float floatValue3 = floatValue2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - (((Number) ((eoh) e1dVar2).getValue()).floatValue() + floatValue) : (((Number) ((eoh) e1dVar2).getValue()).floatValue() + floatValue) - 1.0f;
        if (floatValue3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            j(llf.b(((Number) ((eoh) e1dVar2).getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) + floatValue);
            return true;
        }
        int i2 = (int) (floatValue3 / 1.0f);
        int i3 = i2 + 1;
        if (d() + i3 > i) {
            j(((Number) this.m.getValue()).floatValue());
            h(i);
            return false;
        }
        h(d() + i3);
        float f = floatValue3 - (i2 * 1.0f);
        j(((Number) ay4Var.getValue()).floatValue() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f - f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + f);
        return true;
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        return Float.valueOf(e());
    }

    public final void h(int i) {
        ((eoh) this.b).setValue(Integer.valueOf(i));
    }

    public final void i(boolean z) {
        ((eoh) this.a).setValue(Boolean.valueOf(z));
    }

    public final void j(float f) {
        plb plbVar;
        ((eoh) this.j).setValue(Float.valueOf(f));
        if (((Boolean) ((eoh) this.g).getValue()).booleanValue() && (plbVar = (plb) ((eoh) this.i).getValue()) != null) {
            f -= f % (1.0f / plbVar.n);
        }
        ((eoh) this.k).setValue(Float.valueOf(f));
    }
}
