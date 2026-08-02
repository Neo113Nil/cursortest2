package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u49 implements hm6, gtf {
    public final zci a;
    public int b;
    public s49 c;
    public int d = -1;
    public int e = -1;
    public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public String g;

    public u49(zci zciVar) {
        this.a = zciVar;
    }

    @Override // defpackage.gtf
    public final wm3 a() {
        s49 s49Var = this.c;
        if (s49Var != null) {
            return s49Var;
        }
        s49 s49Var2 = new s49();
        this.c = s49Var2;
        return s49Var2;
    }

    @Override // defpackage.hm6
    public final void apply() {
        this.c.W(this.b);
        int i = this.d;
        if (i != -1) {
            s49 s49Var = this.c;
            if (i <= -1) {
                s49Var.getClass();
                return;
            }
            s49Var.r0 = -1.0f;
            s49Var.s0 = i;
            s49Var.t0 = -1;
            return;
        }
        int i2 = this.e;
        s49 s49Var2 = this.c;
        if (i2 != -1) {
            if (i2 <= -1) {
                s49Var2.getClass();
                return;
            }
            s49Var2.r0 = -1.0f;
            s49Var2.s0 = -1;
            s49Var2.t0 = i2;
            return;
        }
        float f = this.f;
        if (f <= -1.0f) {
            s49Var2.getClass();
            return;
        }
        s49Var2.r0 = f;
        s49Var2.s0 = -1;
        s49Var2.t0 = -1;
    }

    @Override // defpackage.gtf
    public final void b(wm3 wm3Var) {
        if (wm3Var instanceof s49) {
            this.c = (s49) wm3Var;
        } else {
            this.c = null;
        }
    }

    @Override // defpackage.gtf
    public final hm6 c() {
        return null;
    }

    @Override // defpackage.gtf
    public final Object getKey() {
        return this.g;
    }
}
