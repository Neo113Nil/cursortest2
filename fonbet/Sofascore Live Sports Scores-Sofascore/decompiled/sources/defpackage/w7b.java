package defpackage;

import android.animation.ObjectAnimator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w7b extends r9 {
    public static final e51 i = new e51(15, "animationFraction", Float.class);
    public ObjectAnimator c;
    public final qq7 d;
    public final e8b e;
    public int f;
    public boolean g;
    public float h;

    public w7b(e8b e8bVar) {
        super(3);
        this.f = 1;
        this.e = e8bVar;
        this.d = new qq7(1);
    }

    @Override // defpackage.r9
    public final void C() {
        G();
        H();
        this.c.start();
    }

    public final void G() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (this.e.n * 333.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new eb(this, 8));
        }
    }

    public final void H() {
        this.g = true;
        this.f = 1;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            kb5 kb5Var = (kb5) it.next();
            e8b e8bVar = this.e;
            kb5Var.c = e8bVar.e[0];
            kb5Var.d = e8bVar.i / 2;
        }
    }

    @Override // defpackage.r9
    public final void d() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.r9
    public final void r() {
        G();
        this.c.setDuration((long) (this.e.n * 333.0f));
        H();
    }

    @Override // defpackage.r9
    public final void A() {
    }

    @Override // defpackage.r9
    public final void D() {
    }

    @Override // defpackage.r9
    public final void z(j51 j51Var) {
    }
}
