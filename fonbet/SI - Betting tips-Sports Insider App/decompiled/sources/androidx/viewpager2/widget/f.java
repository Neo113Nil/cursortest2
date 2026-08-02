package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2904a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2905b;

    public /* synthetic */ f(ViewPager2 viewPager2, int i5) {
        this.f2904a = i5;
        this.f2905b = viewPager2;
    }

    @Override // androidx.viewpager2.widget.i
    public void onPageScrollStateChanged(int i5) {
        switch (this.f2904a) {
            case 0:
                if (i5 == 0) {
                    ((ViewPager2) this.f2905b).c();
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                try {
                    Iterator it = ((ArrayList) this.f2905b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).onPageScrollStateChanged(i5);
                    }
                    return;
                } catch (ConcurrentModificationException e7) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e7);
                }
        }
    }

    @Override // androidx.viewpager2.widget.i
    public void onPageScrolled(int i5, float f6, int i10) {
        switch (this.f2904a) {
            case 2:
                try {
                    Iterator it = ((ArrayList) this.f2905b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).onPageScrolled(i5, f6, i10);
                    }
                    return;
                } catch (ConcurrentModificationException e7) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e7);
                }
            default:
                return;
        }
    }

    @Override // androidx.viewpager2.widget.i
    public final void onPageSelected(int i5) {
        switch (this.f2904a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f2905b;
                if (viewPager2.f2869d != i5) {
                    viewPager2.f2869d = i5;
                    viewPager2.f2883t.P();
                    return;
                }
                return;
            case 1:
                ViewPager2 viewPager22 = (ViewPager2) this.f2905b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.j.requestFocus(2);
                    return;
                }
                return;
            default:
                try {
                    Iterator it = ((ArrayList) this.f2905b).iterator();
                    while (it.hasNext()) {
                        ((i) it.next()).onPageSelected(i5);
                    }
                    return;
                } catch (ConcurrentModificationException e7) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e7);
                }
        }
    }

    public f() {
        this.f2904a = 2;
        this.f2905b = new ArrayList(3);
    }
}
