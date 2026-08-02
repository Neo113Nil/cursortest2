package P8;

import O8.s;
import O8.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.giphy.sdk.ui.views.GifView;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8828a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f8829b;

    /* renamed from: c, reason: collision with root package name */
    public final GifView f8830c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8831d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8832e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f8833f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f8834g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f8835h;

    /* renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f8836i;

    /* renamed from: j, reason: collision with root package name */
    public final GifView f8837j;

    /* renamed from: k, reason: collision with root package name */
    public final Button f8838k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f8839l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f8840m;

    public b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, GifView gifView, TextView textView, TextView textView2, LinearLayout linearLayout, ImageView imageView, TextView textView3, ConstraintLayout constraintLayout3, GifView gifView2, Button button, ImageView imageView2, ImageView imageView3) {
        this.f8828a = constraintLayout;
        this.f8829b = constraintLayout2;
        this.f8830c = gifView;
        this.f8831d = textView;
        this.f8832e = textView2;
        this.f8833f = linearLayout;
        this.f8834g = imageView;
        this.f8835h = textView3;
        this.f8836i = constraintLayout3;
        this.f8837j = gifView2;
        this.f8838k = button;
        this.f8839l = imageView2;
        this.f8840m = imageView3;
    }

    public static b a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = s.f8490g;
        GifView gifView = (GifView) N2.a.a(view, i10);
        if (gifView != null) {
            i10 = s.f8496j;
            TextView textView = (TextView) N2.a.a(view, i10);
            if (textView != null) {
                i10 = s.f8447E;
                TextView textView2 = (TextView) N2.a.a(view, i10);
                if (textView2 != null) {
                    i10 = s.f8463M;
                    LinearLayout linearLayout = (LinearLayout) N2.a.a(view, i10);
                    if (linearLayout != null) {
                        i10 = s.f8465N;
                        ImageView imageView = (ImageView) N2.a.a(view, i10);
                        if (imageView != null) {
                            i10 = s.f8466O;
                            TextView textView3 = (TextView) N2.a.a(view, i10);
                            if (textView3 != null) {
                                i10 = s.f8467P;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) N2.a.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = s.f8470S;
                                    GifView gifView2 = (GifView) N2.a.a(view, i10);
                                    if (gifView2 != null) {
                                        i10 = s.f8479a0;
                                        Button button = (Button) N2.a.a(view, i10);
                                        if (button != null) {
                                            i10 = s.f8450F0;
                                            ImageView imageView2 = (ImageView) N2.a.a(view, i10);
                                            if (imageView2 != null) {
                                                i10 = s.f8458J0;
                                                ImageView imageView3 = (ImageView) N2.a.a(view, i10);
                                                if (imageView3 != null) {
                                                    return new b(constraintLayout, constraintLayout, gifView, textView, textView2, linearLayout, imageView, textView3, constraintLayout2, gifView2, button, imageView2, imageView3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(t.f8531b, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f8828a;
    }
}
