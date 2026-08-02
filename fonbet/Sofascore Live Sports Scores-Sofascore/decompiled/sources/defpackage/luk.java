package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class luk extends ouk {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewPager2 b;

    public /* synthetic */ luk(ViewPager2 viewPager2, int i) {
        this.a = i;
        this.b = viewPager2;
    }

    @Override // defpackage.ouk
    public void a(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b.f();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        int i2 = this.a;
        ViewPager2 viewPager2 = this.b;
        switch (i2) {
            case 0:
                if (viewPager2.d != i) {
                    viewPager2.d = i;
                    viewPager2.t.f0();
                    break;
                }
                break;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.j.requestFocus(2);
                    break;
                }
                break;
        }
    }
}
