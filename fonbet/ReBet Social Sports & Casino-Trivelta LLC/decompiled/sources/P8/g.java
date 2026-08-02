package P8;

import O8.s;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.giphy.sdk.ui.views.GifView;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f8873a;

    /* renamed from: b, reason: collision with root package name */
    public final NestedScrollView f8874b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f8875c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8876d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8877e;

    /* renamed from: f, reason: collision with root package name */
    public final CoordinatorLayout f8878f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f8879g;

    /* renamed from: h, reason: collision with root package name */
    public final GifView f8880h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f8881i;

    /* renamed from: j, reason: collision with root package name */
    public final ImageView f8882j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f8883k;

    public g(FrameLayout frameLayout, NestedScrollView nestedScrollView, FrameLayout frameLayout2, TextView textView, TextView textView2, CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, GifView gifView, TextView textView3, ImageView imageView, TextView textView4) {
        this.f8873a = frameLayout;
        this.f8874b = nestedScrollView;
        this.f8875c = frameLayout2;
        this.f8876d = textView;
        this.f8877e = textView2;
        this.f8878f = coordinatorLayout;
        this.f8879g = linearLayout;
        this.f8880h = gifView;
        this.f8881i = textView3;
        this.f8882j = imageView;
        this.f8883k = textView4;
    }

    public static g a(View view) {
        int i10 = s.f8484d;
        NestedScrollView nestedScrollView = (NestedScrollView) N2.a.a(view, i10);
        if (nestedScrollView != null) {
            i10 = s.f8492h;
            FrameLayout frameLayout = (FrameLayout) N2.a.a(view, i10);
            if (frameLayout != null) {
                i10 = s.f8494i;
                TextView textView = (TextView) N2.a.a(view, i10);
                if (textView != null) {
                    i10 = s.f8496j;
                    TextView textView2 = (TextView) N2.a.a(view, i10);
                    if (textView2 != null) {
                        i10 = s.f8506o;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) N2.a.a(view, i10);
                        if (coordinatorLayout != null) {
                            i10 = s.f8517t0;
                            LinearLayout linearLayout = (LinearLayout) N2.a.a(view, i10);
                            if (linearLayout != null) {
                                i10 = s.f8454H0;
                                GifView gifView = (GifView) N2.a.a(view, i10);
                                if (gifView != null) {
                                    i10 = s.f8456I0;
                                    TextView textView3 = (TextView) N2.a.a(view, i10);
                                    if (textView3 != null) {
                                        i10 = s.f8458J0;
                                        ImageView imageView = (ImageView) N2.a.a(view, i10);
                                        if (imageView != null) {
                                            i10 = s.f8464M0;
                                            TextView textView4 = (TextView) N2.a.a(view, i10);
                                            if (textView4 != null) {
                                                return new g((FrameLayout) view, nestedScrollView, frameLayout, textView, textView2, coordinatorLayout, linearLayout, gifView, textView3, imageView, textView4);
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
