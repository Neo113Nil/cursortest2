package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jv2 extends r9 {
    public static final qq7 k = e80.b;
    public static final int[] l = {0, TTAdConstant.STYLE_SIZE_RADIO_3_2, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 4500};
    public static final float[] m = {0.1f, 0.87f};
    public static final e51 n = new e51(8, "animationFraction", Float.class);
    public static final e51 o = new e51(9, "completeEndFraction", Float.class);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final TimeInterpolator e;
    public final ov2 f;
    public int g;
    public float h;
    public float i;
    public p50 j;

    public jv2(Context context, ov2 ov2Var) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = ov2Var;
        this.e = yfa.E(context, R.attr.motionEasingStandardInterpolator, k);
    }

    @Override // defpackage.r9
    public final void A() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((v0a) this.a).isVisible()) {
            this.d.start();
        } else {
            d();
        }
    }

    @Override // defpackage.r9
    public final void C() {
        G();
        this.g = 0;
        ((kb5) ((ArrayList) this.b).get(0)).c = this.f.e[0];
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c.start();
    }

    @Override // defpackage.r9
    public final void D() {
        this.j = null;
    }

    public final void G() {
        ObjectAnimator objectAnimator = this.c;
        ov2 ov2Var = this.f;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, n, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (ov2Var.n * 6000.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new iv2(this, 0));
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, o, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration((long) (ov2Var.n * 500.0f));
            this.d.addListener(new iv2(this, 1));
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
        ov2 ov2Var = this.f;
        objectAnimator.setDuration((long) (ov2Var.n * 6000.0f));
        this.d.setDuration((long) (ov2Var.n * 500.0f));
        this.g = 0;
        ((kb5) ((ArrayList) this.b).get(0)).c = ov2Var.e[0];
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // defpackage.r9
    public final void z(j51 j51Var) {
        this.j = j51Var;
    }
}
