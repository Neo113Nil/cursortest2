package P8;

import O8.s;
import O8.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.giphy.sdk.ui.views.GifView;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8841a;

    /* renamed from: b, reason: collision with root package name */
    public final View f8842b;

    /* renamed from: c, reason: collision with root package name */
    public final GifView f8843c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f8844d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f8845e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f8846f;

    /* renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f8847g;

    public c(ConstraintLayout constraintLayout, View view, GifView gifView, ImageView imageView, LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout2) {
        this.f8841a = constraintLayout;
        this.f8842b = view;
        this.f8843c = gifView;
        this.f8844d = imageView;
        this.f8845e = linearLayout;
        this.f8846f = textView;
        this.f8847g = constraintLayout2;
    }

    public static c a(View view) {
        int i10 = s.f8508p;
        View a10 = N2.a.a(view, i10);
        if (a10 != null) {
            i10 = s.f8445D;
            GifView gifView = (GifView) N2.a.a(view, i10);
            if (gifView != null) {
                i10 = s.f8491g0;
                ImageView imageView = (ImageView) N2.a.a(view, i10);
                if (imageView != null) {
                    i10 = s.f8497j0;
                    LinearLayout linearLayout = (LinearLayout) N2.a.a(view, i10);
                    if (linearLayout != null) {
                        i10 = s.f8499k0;
                        TextView textView = (TextView) N2.a.a(view, i10);
                        if (textView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            return new c(constraintLayout, a10, gifView, imageView, linearLayout, textView, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(t.f8532c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f8841a;
    }
}
