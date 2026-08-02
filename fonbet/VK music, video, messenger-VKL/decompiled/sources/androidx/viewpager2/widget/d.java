package androidx.viewpager2.widget;

import android.view.View;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
import xsna.sl9;

/* compiled from: PageTransformerAdapter.java */
/* loaded from: classes12.dex */
public final class d extends ViewPager2.g {
    public final LinearLayoutManager d;
    public ViewPager2.i e;

    public d(ViewPager2.f fVar) {
        this.d = fVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.e == null) {
            return;
        }
        float f2 = -f;
        int i3 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.d;
            if (i3 >= linearLayoutManager.getChildCount()) {
                return;
            }
            View childAt = linearLayoutManager.getChildAt(i3);
            if (childAt == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException(sl9.c(i3, linearLayoutManager.getChildCount(), "LayoutManager returned a null child at pos ", DomExceptionUtils.SEPARATOR, " while transforming pages"));
            }
            this.e.transformPage(childAt, (linearLayoutManager.getPosition(childAt) - i) + f2);
            i3++;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
    }
}
