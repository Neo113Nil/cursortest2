package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.n;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class quk extends i {
    public final /* synthetic */ ViewPager2 c;

    public quk(ViewPager2 viewPager2) {
        this.c = viewPager2;
    }

    @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.w
    public final View findSnapView(n nVar) {
        if (this.c.n.b.m) {
            return null;
        }
        return super.findSnapView(nVar);
    }
}
