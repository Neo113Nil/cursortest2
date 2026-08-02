package androidx.fragment.app;

import android.view.View;
import defpackage.a70;
import defpackage.bo8;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j extends bo8 {
    public final /* synthetic */ Fragment a;

    public j(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.bo8
    public final View b(int i) {
        Fragment fragment = this.a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        a70.r(fc6.m("Fragment ", fragment, " does not have a view"));
        return null;
    }

    @Override // defpackage.bo8
    public final boolean c() {
        return this.a.mView != null;
    }
}
