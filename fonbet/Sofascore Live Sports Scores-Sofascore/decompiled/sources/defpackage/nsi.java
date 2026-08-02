package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nsi extends ouk {
    public final WeakReference a;
    public int c = 0;
    public int b = 0;

    public nsi(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.ouk
    public final void a(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.U = this.c;
        }
    }

    @Override // defpackage.ouk
    public final void b(int i, float f, int i2) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z2 = true;
            if (i3 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.n(i, f, z2, z, false);
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.l(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
