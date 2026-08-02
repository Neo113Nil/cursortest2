package P8;

import O8.s;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.giphy.sdk.ui.views.GPHMediaView;
import com.giphy.sdk.ui.views.GPHVideoPlayerView;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f8848a;

    /* renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f8849b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8850c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f8851d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f8852e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f8853f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f8854g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f8855h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f8856i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f8857j;

    /* renamed from: k, reason: collision with root package name */
    public final LinearLayout f8858k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f8859l;

    /* renamed from: m, reason: collision with root package name */
    public final GPHMediaView f8860m;

    /* renamed from: n, reason: collision with root package name */
    public final ConstraintLayout f8861n;

    /* renamed from: o, reason: collision with root package name */
    public final GPHMediaView f8862o;

    /* renamed from: p, reason: collision with root package name */
    public final ImageView f8863p;

    /* renamed from: q, reason: collision with root package name */
    public final GPHVideoPlayerView f8864q;

    public d(FrameLayout frameLayout, ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView2, LinearLayout linearLayout3, TextView textView3, LinearLayout linearLayout4, TextView textView4, GPHMediaView gPHMediaView, ConstraintLayout constraintLayout4, GPHMediaView gPHMediaView2, ImageView imageView, GPHVideoPlayerView gPHVideoPlayerView) {
        this.f8848a = frameLayout;
        this.f8849b = constraintLayout;
        this.f8850c = textView;
        this.f8851d = constraintLayout2;
        this.f8852e = constraintLayout3;
        this.f8853f = linearLayout;
        this.f8854g = linearLayout2;
        this.f8855h = textView2;
        this.f8856i = linearLayout3;
        this.f8857j = textView3;
        this.f8858k = linearLayout4;
        this.f8859l = textView4;
        this.f8860m = gPHMediaView;
        this.f8861n = constraintLayout4;
        this.f8862o = gPHMediaView2;
        this.f8863p = imageView;
        this.f8864q = gPHVideoPlayerView;
    }

    public static d a(View view) {
        int i10 = s.f8478a;
        ConstraintLayout constraintLayout = (ConstraintLayout) N2.a.a(view, i10);
        if (constraintLayout != null) {
            i10 = s.f8496j;
            TextView textView = (TextView) N2.a.a(view, i10);
            if (textView != null) {
                i10 = s.f8504n;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) N2.a.a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = s.f8506o;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) N2.a.a(view, i10);
                    if (constraintLayout3 != null) {
                        i10 = s.f8449F;
                        LinearLayout linearLayout = (LinearLayout) N2.a.a(view, i10);
                        if (linearLayout != null) {
                            i10 = s.f8451G;
                            LinearLayout linearLayout2 = (LinearLayout) N2.a.a(view, i10);
                            if (linearLayout2 != null) {
                                i10 = s.f8453H;
                                TextView textView2 = (TextView) N2.a.a(view, i10);
                                if (textView2 != null) {
                                    i10 = s.f8455I;
                                    LinearLayout linearLayout3 = (LinearLayout) N2.a.a(view, i10);
                                    if (linearLayout3 != null) {
                                        i10 = s.f8457J;
                                        TextView textView3 = (TextView) N2.a.a(view, i10);
                                        if (textView3 != null) {
                                            i10 = s.f8459K;
                                            LinearLayout linearLayout4 = (LinearLayout) N2.a.a(view, i10);
                                            if (linearLayout4 != null) {
                                                i10 = s.f8461L;
                                                TextView textView4 = (TextView) N2.a.a(view, i10);
                                                if (textView4 != null) {
                                                    i10 = s.f8495i0;
                                                    GPHMediaView gPHMediaView = (GPHMediaView) N2.a.a(view, i10);
                                                    if (gPHMediaView != null) {
                                                        i10 = s.f8452G0;
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) N2.a.a(view, i10);
                                                        if (constraintLayout4 != null) {
                                                            i10 = s.f8454H0;
                                                            GPHMediaView gPHMediaView2 = (GPHMediaView) N2.a.a(view, i10);
                                                            if (gPHMediaView2 != null) {
                                                                i10 = s.f8458J0;
                                                                ImageView imageView = (ImageView) N2.a.a(view, i10);
                                                                if (imageView != null) {
                                                                    i10 = s.f8462L0;
                                                                    GPHVideoPlayerView gPHVideoPlayerView = (GPHVideoPlayerView) N2.a.a(view, i10);
                                                                    if (gPHVideoPlayerView != null) {
                                                                        return new d((FrameLayout) view, constraintLayout, textView, constraintLayout2, constraintLayout3, linearLayout, linearLayout2, textView2, linearLayout3, textView3, linearLayout4, textView4, gPHMediaView, constraintLayout4, gPHMediaView2, imageView, gPHVideoPlayerView);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
