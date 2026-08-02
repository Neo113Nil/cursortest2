package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes12.dex */
public final class a extends ViewPager2.g {

    @NonNull
    public final ArrayList d = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((ViewPager2.g) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
