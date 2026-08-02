package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.config.dynamic.utils.image.b;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.results.R;
import com.sofascore.results.mma.postMatchVoting.MmaPostMatchVotingMotionViewDetails;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hqc implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hqc(Bitmap bitmap, int i, int i2, ImageView imageView) {
        this.d = bitmap;
        this.b = i;
        this.c = i2;
        this.e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float b;
        int i = this.a;
        Object obj = this.e;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                MmaPostMatchVotingMotionViewDetails mmaPostMatchVotingMotionViewDetails = (MmaPostMatchVotingMotionViewDetails) obj2;
                MmaPostMatchVotingOptions mmaPostMatchVotingOptions = (MmaPostMatchVotingOptions) obj;
                int i4 = MmaPostMatchVotingMotionViewDetails.p;
                mmaPostMatchVotingMotionViewDetails.getBinding().o.setVisibility(0);
                mmaPostMatchVotingMotionViewDetails.getBinding().o.setText(i3 + (mmaPostMatchVotingOptions == MmaPostMatchVotingOptions.FIRST_FIGHTER_WIN ? mmaPostMatchVotingMotionViewDetails.getContext().getString(R.string.plus_you) : ""));
                mmaPostMatchVotingMotionViewDetails.getBinding().i.setVisibility(0);
                View view = mmaPostMatchVotingMotionViewDetails.getBinding().i;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    break;
                } else {
                    tl3 tl3Var = (tl3) layoutParams;
                    float f = i3;
                    float f2 = i2;
                    float f3 = f + f2;
                    float f4 = 1.0f;
                    if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b = 1.0f;
                    } else {
                        float f5 = f3 / 1.0f;
                        float f6 = f3 * 0.02222222f;
                        if (f < f6) {
                            f = f6;
                        }
                        b = wzb.b((f / f5) * 100.0f) / 100.0f;
                    }
                    tl3Var.H = b;
                    view.setLayoutParams(tl3Var);
                    mmaPostMatchVotingMotionViewDetails.getBinding().p.setVisibility(0);
                    mmaPostMatchVotingMotionViewDetails.getBinding().p.setText(i2 + (mmaPostMatchVotingOptions == MmaPostMatchVotingOptions.SECOND_FIGHTER_WIN ? mmaPostMatchVotingMotionViewDetails.getContext().getString(R.string.plus_you) : ""));
                    mmaPostMatchVotingMotionViewDetails.getBinding().j.setVisibility(0);
                    View view2 = mmaPostMatchVotingMotionViewDetails.getBinding().j;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 == null) {
                        yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        break;
                    } else {
                        tl3 tl3Var2 = (tl3) layoutParams2;
                        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f7 = f3 / 1.0f;
                            float f8 = f3 * 0.02222222f;
                            if (f2 < f8) {
                                f2 = f8;
                            }
                            f4 = wzb.b((f2 / f7) * 100.0f) / 100.0f;
                        }
                        tl3Var2.H = f4;
                        view2.setLayoutParams(tl3Var2);
                        break;
                    }
                }
            default:
                b.a((Bitmap) obj2, i3, i2, (ImageView) obj);
                break;
        }
    }

    public /* synthetic */ hqc(MmaPostMatchVotingMotionViewDetails mmaPostMatchVotingMotionViewDetails, int i, MmaPostMatchVotingOptions mmaPostMatchVotingOptions, int i2) {
        this.d = mmaPostMatchVotingMotionViewDetails;
        this.b = i;
        this.e = mmaPostMatchVotingOptions;
        this.c = i2;
    }
}
