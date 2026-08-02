package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dt5 implements krk {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final ScrollInterceptorHorizontalScrollView f;

    public dt5(ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout, ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = textView;
        this.d = imageView;
        this.e = imageView2;
        this.f = scrollInterceptorHorizontalScrollView;
    }

    public static dt5 a(View view) {
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, view);
        if (linearLayout != null) {
            i = R.id.legend_button;
            TextView textView = (TextView) nq8.B(R.id.legend_button, view);
            if (textView != null) {
                i = R.id.scroll_indicator_left;
                ImageView imageView = (ImageView) nq8.B(R.id.scroll_indicator_left, view);
                if (imageView != null) {
                    i = R.id.scroll_indicator_right;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.scroll_indicator_right, view);
                    if (imageView2 != null) {
                        i = R.id.scroller;
                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, view);
                        if (scrollInterceptorHorizontalScrollView != null) {
                            return new dt5(imageView, imageView2, linearLayout, textView, (ConstraintLayout) view, scrollInterceptorHorizontalScrollView);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
