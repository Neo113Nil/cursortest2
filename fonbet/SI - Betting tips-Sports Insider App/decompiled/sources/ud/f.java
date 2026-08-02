package ud;

import android.animation.Animator;
import androidx.appcompat.widget.AppCompatImageView;
import com.sports.insider.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24243c;

    public /* synthetic */ f(int i5, Object obj, Object obj2) {
        this.f24241a = i5;
        this.f24242b = obj;
        this.f24243c = obj2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f24241a) {
            case 0:
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f24241a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((jc.c) this.f24242b).f18429d = false;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ((b) this.f24243c).itemView.findViewById(R.id.arrow_view);
                if (appCompatImageView != null) {
                    appCompatImageView.setColorFilter(-1);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                ((jc.c) this.f24242b).f18429d = true;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ((b) this.f24243c).itemView.findViewById(R.id.arrow_view);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setColorFilter(-1);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        switch (this.f24241a) {
            case 0:
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            default:
                androidx.swiperefreshlayout.widget.d dVar = (androidx.swiperefreshlayout.widget.d) this.f24243c;
                androidx.swiperefreshlayout.widget.c cVar = (androidx.swiperefreshlayout.widget.c) this.f24242b;
                dVar.a(1.0f, cVar, true);
                cVar.f2652k = cVar.f2647e;
                cVar.f2653l = cVar.f2648f;
                cVar.f2654m = cVar.f2649g;
                cVar.a((cVar.j + 1) % cVar.f2651i.length);
                if (!dVar.f2670f) {
                    dVar.f2669e += 1.0f;
                    break;
                } else {
                    dVar.f2670f = false;
                    animation.cancel();
                    animation.setDuration(1332L);
                    animation.start();
                    if (cVar.f2655n) {
                        cVar.f2655n = false;
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f24241a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                break;
            default:
                ((androidx.swiperefreshlayout.widget.d) this.f24243c).f2669e = 0.0f;
                break;
        }
    }

    public f(androidx.swiperefreshlayout.widget.d dVar, androidx.swiperefreshlayout.widget.c cVar) {
        this.f24241a = 2;
        this.f24243c = dVar;
        this.f24242b = cVar;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
