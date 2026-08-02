package P8;

import O8.s;
import O8.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.giphy.sdk.ui.views.GifView;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f8884a;

    /* renamed from: b, reason: collision with root package name */
    public final Guideline f8885b;

    /* renamed from: c, reason: collision with root package name */
    public final GifView f8886c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f8887d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8888e;

    /* renamed from: f, reason: collision with root package name */
    public final View f8889f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f8890g;

    /* renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f8891h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageButton f8892i;

    /* renamed from: j, reason: collision with root package name */
    public final GifView f8893j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f8894k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f8895l;

    public h(FrameLayout frameLayout, Guideline guideline, GifView gifView, FrameLayout frameLayout2, TextView textView, View view, FrameLayout frameLayout3, ConstraintLayout constraintLayout, ImageButton imageButton, GifView gifView2, TextView textView2, ImageView imageView) {
        this.f8884a = frameLayout;
        this.f8885b = guideline;
        this.f8886c = gifView;
        this.f8887d = frameLayout2;
        this.f8888e = textView;
        this.f8889f = view;
        this.f8890g = frameLayout3;
        this.f8891h = constraintLayout;
        this.f8892i = imageButton;
        this.f8893j = gifView2;
        this.f8894k = textView2;
        this.f8895l = imageView;
    }

    public static h a(View view) {
        View a10;
        int i10 = s.f8480b;
        Guideline guideline = (Guideline) N2.a.a(view, i10);
        if (guideline != null) {
            i10 = s.f8482c;
            GifView gifView = (GifView) N2.a.a(view, i10);
            if (gifView != null) {
                i10 = s.f8492h;
                FrameLayout frameLayout = (FrameLayout) N2.a.a(view, i10);
                if (frameLayout != null) {
                    i10 = s.f8496j;
                    TextView textView = (TextView) N2.a.a(view, i10);
                    if (textView != null && (a10 = N2.a.a(view, (i10 = s.f8502m))) != null) {
                        i10 = s.f8483c0;
                        FrameLayout frameLayout2 = (FrameLayout) N2.a.a(view, i10);
                        if (frameLayout2 != null) {
                            i10 = s.f8485d0;
                            ConstraintLayout constraintLayout = (ConstraintLayout) N2.a.a(view, i10);
                            if (constraintLayout != null) {
                                i10 = s.f8487e0;
                                ImageButton imageButton = (ImageButton) N2.a.a(view, i10);
                                if (imageButton != null) {
                                    i10 = s.f8454H0;
                                    GifView gifView2 = (GifView) N2.a.a(view, i10);
                                    if (gifView2 != null) {
                                        i10 = s.f8456I0;
                                        TextView textView2 = (TextView) N2.a.a(view, i10);
                                        if (textView2 != null) {
                                            i10 = s.f8458J0;
                                            ImageView imageView = (ImageView) N2.a.a(view, i10);
                                            if (imageView != null) {
                                                return new h((FrameLayout) view, guideline, gifView, frameLayout, textView, a10, frameLayout2, constraintLayout, imageButton, gifView2, textView2, imageView);
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

    public static h c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(t.f8543n, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public FrameLayout b() {
        return this.f8884a;
    }
}
