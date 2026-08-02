package P8;

import O8.s;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final View f8909a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageButton f8910b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f8911c;

    /* renamed from: d, reason: collision with root package name */
    public final LottieAnimationView f8912d;

    /* renamed from: e, reason: collision with root package name */
    public final ProgressBar f8913e;

    /* renamed from: f, reason: collision with root package name */
    public final LottieAnimationView f8914f;

    /* renamed from: g, reason: collision with root package name */
    public final View f8915g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageButton f8916h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageButton f8917i;

    public j(View view, ImageButton imageButton, ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, ProgressBar progressBar, LottieAnimationView lottieAnimationView2, View view2, ImageButton imageButton2, ImageButton imageButton3) {
        this.f8909a = view;
        this.f8910b = imageButton;
        this.f8911c = constraintLayout;
        this.f8912d = lottieAnimationView;
        this.f8913e = progressBar;
        this.f8914f = lottieAnimationView2;
        this.f8915g = view2;
        this.f8916h = imageButton2;
        this.f8917i = imageButton3;
    }

    public static j a(View view) {
        View a10;
        int i10 = s.f8488f;
        ImageButton imageButton = (ImageButton) N2.a.a(view, i10);
        if (imageButton != null) {
            i10 = s.f8500l;
            ConstraintLayout constraintLayout = (ConstraintLayout) N2.a.a(view, i10);
            if (constraintLayout != null) {
                i10 = s.f8514s;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) N2.a.a(view, i10);
                if (lottieAnimationView != null) {
                    i10 = s.f8503m0;
                    ProgressBar progressBar = (ProgressBar) N2.a.a(view, i10);
                    if (progressBar != null) {
                        i10 = s.f8509p0;
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) N2.a.a(view, i10);
                        if (lottieAnimationView2 != null && (a10 = N2.a.a(view, (i10 = s.f8513r0))) != null) {
                            i10 = s.f8519u0;
                            ImageButton imageButton2 = (ImageButton) N2.a.a(view, i10);
                            if (imageButton2 != null) {
                                i10 = s.f8521v0;
                                ImageButton imageButton3 = (ImageButton) N2.a.a(view, i10);
                                if (imageButton3 != null) {
                                    return new j(view, imageButton, constraintLayout, lottieAnimationView, progressBar, lottieAnimationView2, a10, imageButton2, imageButton3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
