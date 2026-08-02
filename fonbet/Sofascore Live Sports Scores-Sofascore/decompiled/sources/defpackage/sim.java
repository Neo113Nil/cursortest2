package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sim implements krk {
    public final FrameLayout a;
    public final FrameLayout b;

    public sim(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = frameLayout2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
