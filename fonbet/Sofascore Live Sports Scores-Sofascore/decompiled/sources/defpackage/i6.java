package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.results.view.EventListScoreTextView;
import com.sofascore.results.view.header.widget.RollingTextView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i6 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public i6(mv2 mv2Var, lv2 lv2Var) {
        this.a = 1;
        this.c = mv2Var;
        this.b = lv2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                animator.getClass();
                break;
            case 1:
                break;
            case 2:
                animator.getClass();
                break;
            case 3:
                animator.getClass();
                break;
            default:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        MmaPostMatchVotingOptions mmaPostMatchVotingOptions;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                k6 k6Var = (k6) obj;
                animator.getClass();
                int intValue = ((Integer) obj2).intValue();
                if (intValue == 1) {
                    Context context = k6Var.getContext();
                    context.getClass();
                    mmaPostMatchVotingOptions = hkg.c0(context) ? null : MmaPostMatchVotingOptions.FIRST_FIGHTER_WIN;
                    if (mmaPostMatchVotingOptions == null) {
                        mmaPostMatchVotingOptions = MmaPostMatchVotingOptions.SECOND_FIGHTER_WIN;
                    }
                    Function1 function1 = k6Var.n;
                    if (function1 != null) {
                        function1.invoke(mmaPostMatchVotingOptions);
                    }
                    k6Var.n(mmaPostMatchVotingOptions);
                    break;
                } else if (intValue == 2) {
                    Context context2 = k6Var.getContext();
                    context2.getClass();
                    mmaPostMatchVotingOptions = hkg.c0(context2) ? MmaPostMatchVotingOptions.FIRST_FIGHTER_WIN : null;
                    if (mmaPostMatchVotingOptions == null) {
                        mmaPostMatchVotingOptions = MmaPostMatchVotingOptions.SECOND_FIGHTER_WIN;
                    }
                    Function1 function12 = k6Var.n;
                    if (function12 != null) {
                        function12.invoke(mmaPostMatchVotingOptions);
                    }
                    k6Var.n(mmaPostMatchVotingOptions);
                    break;
                } else {
                    if (!k6Var.k) {
                        k6Var.j.start();
                    }
                    k6Var.l();
                    break;
                }
            case 1:
                break;
            case 2:
                animator.getClass();
                break;
            case 3:
                animator.getClass();
                break;
            default:
                animator.getClass();
                fcg fcgVar = (fcg) obj;
                RelativeLayout relativeLayout = fcgVar.l;
                ((ViewGroup) obj2).removeView(relativeLayout);
                fcgVar.addView(relativeLayout);
                jca.S(relativeLayout, -1, -1);
                relativeLayout.setX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                relativeLayout.setY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                xag xagVar = fcgVar.j;
                if (xagVar != null) {
                    ((zag) xagVar).d();
                }
                fcgVar.k.post(new zbg(fcgVar, 5));
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                animator.getClass();
                break;
            case 1:
                mv2 mv2Var = (mv2) this.c;
                lv2 lv2Var = (lv2) this.b;
                mv2Var.a(1.0f, lv2Var, true);
                lv2Var.k = lv2Var.e;
                lv2Var.l = lv2Var.f;
                lv2Var.m = lv2Var.g;
                lv2Var.a((lv2Var.j + 1) % lv2Var.i.length);
                if (!mv2Var.f) {
                    mv2Var.e += 1.0f;
                    break;
                } else {
                    mv2Var.f = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    if (lv2Var.n) {
                        lv2Var.n = false;
                        break;
                    }
                }
                break;
            case 2:
                animator.getClass();
                break;
            case 3:
                animator.getClass();
                break;
            default:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                animator.getClass();
                break;
            case 1:
                ((mv2) obj2).e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                break;
            case 2:
                animator.getClass();
                ((EventListScoreTextView) obj).g = (String) obj2;
                break;
            case 3:
                animator.getClass();
                ((RollingTextView) obj).setTextNext((String) obj2);
                break;
            default:
                animator.getClass();
                break;
        }
    }

    public /* synthetic */ i6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
