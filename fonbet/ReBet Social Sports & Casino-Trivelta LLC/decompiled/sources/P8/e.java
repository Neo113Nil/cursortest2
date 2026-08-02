package P8;

import O8.s;
import O8.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8865a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f8866b;

    /* renamed from: c, reason: collision with root package name */
    public final LottieAnimationView f8867c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f8868d;

    public e(ConstraintLayout constraintLayout, TextView textView, LottieAnimationView lottieAnimationView, Button button) {
        this.f8865a = constraintLayout;
        this.f8866b = textView;
        this.f8867c = lottieAnimationView;
        this.f8868d = button;
    }

    public static e a(View view) {
        int i10 = s.f8510q;
        TextView textView = (TextView) N2.a.a(view, i10);
        if (textView != null) {
            i10 = s.f8493h0;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) N2.a.a(view, i10);
            if (lottieAnimationView != null) {
                i10 = s.f8507o0;
                Button button = (Button) N2.a.a(view, i10);
                if (button != null) {
                    return new e((ConstraintLayout) view, textView, lottieAnimationView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static e c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(t.f8536g, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f8865a;
    }
}
