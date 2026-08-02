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
import com.giphy.sdk.ui.views.GPHVideoPlayerView;
import com.giphy.sdk.ui.views.GifView;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8896a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f8897b;

    /* renamed from: c, reason: collision with root package name */
    public final GifView f8898c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8899d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8900e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f8901f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f8902g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f8903h;

    /* renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f8904i;

    /* renamed from: j, reason: collision with root package name */
    public final Button f8905j;

    /* renamed from: k, reason: collision with root package name */
    public final GPHVideoPlayerView f8906k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f8907l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f8908m;

    public i(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, GifView gifView, TextView textView, TextView textView2, LinearLayout linearLayout, ImageView imageView, TextView textView3, ConstraintLayout constraintLayout3, Button button, GPHVideoPlayerView gPHVideoPlayerView, ImageView imageView2, ImageView imageView3) {
        this.f8896a = constraintLayout;
        this.f8897b = constraintLayout2;
        this.f8898c = gifView;
        this.f8899d = textView;
        this.f8900e = textView2;
        this.f8901f = linearLayout;
        this.f8902g = imageView;
        this.f8903h = textView3;
        this.f8904i = constraintLayout3;
        this.f8905j = button;
        this.f8906k = gPHVideoPlayerView;
        this.f8907l = imageView2;
        this.f8908m = imageView3;
    }

    public static i a(View view) {
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
                                    i10 = s.f8479a0;
                                    Button button = (Button) N2.a.a(view, i10);
                                    if (button != null) {
                                        i10 = s.f8481b0;
                                        GPHVideoPlayerView gPHVideoPlayerView = (GPHVideoPlayerView) N2.a.a(view, i10);
                                        if (gPHVideoPlayerView != null) {
                                            i10 = s.f8450F0;
                                            ImageView imageView2 = (ImageView) N2.a.a(view, i10);
                                            if (imageView2 != null) {
                                                i10 = s.f8458J0;
                                                ImageView imageView3 = (ImageView) N2.a.a(view, i10);
                                                if (imageView3 != null) {
                                                    return new i(constraintLayout, constraintLayout, gifView, textView, textView2, linearLayout, imageView, textView3, constraintLayout2, button, gPHVideoPlayerView, imageView2, imageView3);
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

    public static i c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(t.f8544o, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f8896a;
    }
}
