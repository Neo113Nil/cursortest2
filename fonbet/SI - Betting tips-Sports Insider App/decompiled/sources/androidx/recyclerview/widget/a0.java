package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2320a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2322c;

    public a0(boolean z5, ze.k kVar) {
        this.f2320a = 1;
        this.f2321b = z5;
        this.f2322c = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2320a) {
            case 0:
                this.f2321b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f2320a) {
            case 0:
                c0 c0Var = (c0) this.f2322c;
                if (!this.f2321b) {
                    if (((Float) c0Var.f2354z.getAnimatedValue()).floatValue() != 0.0f) {
                        c0Var.A = 2;
                        c0Var.f2347s.invalidate();
                        break;
                    } else {
                        c0Var.A = 0;
                        c0Var.d(0);
                        break;
                    }
                } else {
                    this.f2321b = false;
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                if (this.f2321b) {
                    ((ze.k) this.f2322c).f25965b.onDismiss();
                    break;
                }
                break;
        }
    }

    public a0(c0 c0Var) {
        this.f2320a = 0;
        this.f2322c = c0Var;
        this.f2321b = false;
    }
}
