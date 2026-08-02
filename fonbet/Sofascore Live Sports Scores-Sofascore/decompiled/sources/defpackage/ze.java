package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ze implements krk {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final FrameLayout c;
    public final View d;
    public final LinearLayout e;
    public final ViewPager2 f;

    public ze(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, View view, LinearLayout linearLayout, ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = frameLayout;
        this.d = view;
        this.e = linearLayout;
        this.f = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
