package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.first_time_slide.ui.FirstTimeSlideCustomView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class orm implements krk {
    public final ConstraintLayout a;
    public final View b;
    public final View c;
    public final FirstTimeSlideCustomView d;
    public final ViewPager2 e;

    public orm(ConstraintLayout constraintLayout, View view, View view2, FirstTimeSlideCustomView firstTimeSlideCustomView, ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = view2;
        this.d = firstTimeSlideCustomView;
        this.e = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
