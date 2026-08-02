package defpackage;

import androidx.recyclerview.widget.l;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class osi {
    public final TabLayout a;
    public final ViewPager2 b;
    public final msi c;
    public l d;
    public boolean e;
    public nsi f;
    public kta g;
    public vp8 h;

    public osi(TabLayout tabLayout, ViewPager2 viewPager2, msi msiVar) {
        this.a = tabLayout;
        this.b = viewPager2;
        this.c = msiVar;
    }

    public final void a() {
        if (this.e) {
            a70.r("TabLayoutMediator is already attached");
            return;
        }
        ViewPager2 viewPager2 = this.b;
        l adapter = viewPager2.getAdapter();
        this.d = adapter;
        if (adapter == null) {
            a70.r("TabLayoutMediator attached before ViewPager2 has an adapter");
            return;
        }
        this.e = true;
        TabLayout tabLayout = this.a;
        nsi nsiVar = new nsi(tabLayout);
        this.f = nsiVar;
        viewPager2.a(nsiVar);
        kta ktaVar = new kta(viewPager2, 2);
        this.g = ktaVar;
        tabLayout.a(ktaVar);
        vp8 vp8Var = new vp8(this, 3);
        this.h = vp8Var;
        this.d.registerAdapterDataObserver(vp8Var);
        c();
        tabLayout.n(viewPager2.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true, true);
    }

    public final void b() {
        if (this.e) {
            l lVar = this.d;
            if (lVar != null) {
                lVar.unregisterAdapterDataObserver(this.h);
                this.h = null;
            }
            this.a.L.remove(this.g);
            this.b.e(this.f);
            this.g = null;
            this.f = null;
            this.d = null;
            this.e = false;
        }
    }

    public final void c() {
        TabLayout tabLayout = this.a;
        tabLayout.k();
        l lVar = this.d;
        if (lVar != null) {
            int itemCount = lVar.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                jsi i2 = tabLayout.i();
                this.c.d(i2, i);
                tabLayout.b(i2, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.l(tabLayout.h(min), true);
                }
            }
        }
    }
}
