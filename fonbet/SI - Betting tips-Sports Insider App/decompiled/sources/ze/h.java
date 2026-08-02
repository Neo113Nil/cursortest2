package ze;

import com.viewer.MultiTouchViewPager;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements c3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiTouchViewPager f25956a;

    public h(MultiTouchViewPager multiTouchViewPager) {
        this.f25956a = multiTouchViewPager;
    }

    @Override // c3.g
    public final void onPageScrollStateChanged(int i5) {
        this.f25956a.f8074u0 = i5 == 0;
    }

    @Override // c3.g
    public final void onPageSelected(int i5) {
    }

    @Override // c3.g
    public final void onPageScrolled(int i5, float f6, int i10) {
    }
}
