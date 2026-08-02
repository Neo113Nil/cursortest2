package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: MarginPageTransformer.java */
/* loaded from: classes12.dex */
public final class c implements ViewPager2.i {
    public final int a;

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Margin must be non-negative");
        }
        this.a = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void transformPage(@NonNull View view, float f) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        }
        ViewPager2 viewPager2 = (ViewPager2) parent2;
        float f2 = this.a * f;
        if (viewPager2.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (viewPager2.h.getLayoutDirection() == 1) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }
}
