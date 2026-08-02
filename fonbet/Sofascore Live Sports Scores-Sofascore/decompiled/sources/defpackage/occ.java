package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class occ implements krk {
    public final FrameLayout a;
    public final ViewPager2 b;

    public occ(FrameLayout frameLayout, ViewPager2 viewPager2) {
        this.a = frameLayout;
        this.b = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
