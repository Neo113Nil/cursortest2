package androidx.fragment.app;

import android.view.View;
import defpackage.d6b;
import defpackage.p6b;
import defpackage.u6b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k implements p6b {
    public final /* synthetic */ Fragment a;

    public k(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        View view;
        if (d6bVar != d6b.ON_STOP || (view = this.a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
