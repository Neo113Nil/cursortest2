package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.first_time_slide.ui.FirstTimeSlideCustomView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class udm implements krk {
    public final ConstraintLayout a;
    public final Guideline b;
    public final Guideline c;
    public final View d;
    public final ImageView e;
    public final FirstTimeSlideCustomView f;
    public final ImageView g;
    public final ImageView h;
    public final Flow i;
    public final ViewPager2 j;
    public final View k;

    public udm(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, View view, ImageView imageView, FirstTimeSlideCustomView firstTimeSlideCustomView, ImageView imageView2, ImageView imageView3, Flow flow, ViewPager2 viewPager2, View view2) {
        this.a = constraintLayout;
        this.b = guideline;
        this.c = guideline2;
        this.d = view;
        this.e = imageView;
        this.f = firstTimeSlideCustomView;
        this.g = imageView2;
        this.h = imageView3;
        this.i = flow;
        this.j = viewPager2;
        this.k = view2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
