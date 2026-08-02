package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y7b extends r9 {
    public static final int[] k = {533, 567, 850, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final e51 m = new e51(16, "animationFraction", Float.class);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final e8b f;
    public int g;
    public boolean h;
    public float i;
    public p50 j;

    public y7b(Context context, e8b e8bVar) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = e8bVar;
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator);
        vha.H(loadInterpolator, "Failed to parse interpolator, no start tag found");
        Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator);
        vha.H(loadInterpolator2, "Failed to parse interpolator, no start tag found");
        Interpolator loadInterpolator3 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator);
        vha.H(loadInterpolator3, "Failed to parse interpolator, no start tag found");
        Interpolator loadInterpolator4 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator);
        vha.H(loadInterpolator4, "Failed to parse interpolator, no start tag found");
        this.e = new Interpolator[]{loadInterpolator, loadInterpolator2, loadInterpolator3, loadInterpolator4};
    }

    @Override // defpackage.r9
    public final void A() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        d();
        if (((v0a) this.a).isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // defpackage.r9
    public final void C() {
        G();
        H();
        this.c.start();
    }

    @Override // defpackage.r9
    public final void D() {
        this.j = null;
    }

    public final void G() {
        ObjectAnimator objectAnimator = this.c;
        int i = 0;
        e8b e8bVar = this.f;
        e51 e51Var = m;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, e51Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (e8bVar.n * 1800.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new x7b(this, i));
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, e51Var, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration((long) (e8bVar.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.addListener(new x7b(this, 1));
        }
    }

    public final void H() {
        this.g = 0;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((kb5) it.next()).c = this.f.e[0];
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
        ObjectAnimator objectAnimator = this.c;
        e8b e8bVar = this.f;
        objectAnimator.setDuration((long) (e8bVar.n * 1800.0f));
        this.d.setDuration((long) (e8bVar.n * 1800.0f));
        H();
    }

    @Override // defpackage.r9
    public final void z(j51 j51Var) {
        this.j = j51Var;
    }
}
