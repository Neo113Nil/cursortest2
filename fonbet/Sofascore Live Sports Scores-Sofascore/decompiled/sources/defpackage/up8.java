package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class up8 extends ap8 {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;

    public up8(wp8 wp8Var, Fragment fragment, FrameLayout frameLayout) {
        this.a = fragment;
        this.b = frameLayout;
    }

    @Override // defpackage.ap8
    public final void d(s sVar, Fragment fragment, View view) {
        if (fragment == this.a) {
            sVar.n0(this);
            wp8.o(view, this.b);
        }
    }
}
