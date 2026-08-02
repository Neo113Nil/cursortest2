package androidx.fragment.app;

import android.os.Bundle;
import defpackage.un8;
import defpackage.yso;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i extends un8 {
    public final /* synthetic */ Fragment a;

    public i(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.un8
    public final void a() {
        Fragment fragment = this.a;
        fragment.mSavedStateRegistryController.a.c();
        yso.y(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.a(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
