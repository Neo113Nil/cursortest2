package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eum implements krk {
    public final ConstraintLayout a;
    public final ViewPager2 b;
    public final TabLayout c;
    public final View d;

    public eum(ConstraintLayout constraintLayout, ViewPager2 viewPager2, TabLayout tabLayout, View view) {
        this.a = constraintLayout;
        this.b = viewPager2;
        this.c = tabLayout;
        this.d = view;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
