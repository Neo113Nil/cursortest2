package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class io8 implements krk {
    public final ConstraintLayout a;
    public final ViewPager2 b;

    public io8(ConstraintLayout constraintLayout, ViewPager2 viewPager2) {
        this.a = constraintLayout;
        this.b = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
