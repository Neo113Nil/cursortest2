package com.moloco.sdk.internal;

import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import defpackage.d6b;
import defpackage.e6g;
import defpackage.g6b;
import defpackage.nqg;
import defpackage.oqg;
import defpackage.p2g;
import defpackage.pqg;
import defpackage.qha;
import defpackage.qqg;
import defpackage.rha;
import defpackage.u6b;
import defpackage.w2g;
import defpackage.y6b;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d implements u6b, qqg {
    public final y6b a = new y6b(this, true);
    public final oqg b = new oqg(new pqg(this, new e6g(this, 8)));

    public final void a(FrameLayout frameLayout) {
        View rootView = frameLayout.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (rha.q(rootView) == null) {
            rootView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            try {
                p2g p2gVar = w2g.b;
                this.b.a(null);
                Unit unit = Unit.a;
            } catch (Throwable unused) {
                p2g p2gVar2 = w2g.b;
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeSavedStateRegistryOwner is absent, setting custom one", null, false, 12, null);
        }
        if (qha.w(rootView) == null) {
            rootView.setTag(R.id.view_tree_lifecycle_owner, this);
            d6b d6bVar = d6b.ON_CREATE;
            y6b y6bVar = this.a;
            y6bVar.g(d6bVar);
            y6bVar.g(d6b.ON_START);
            y6bVar.g(d6b.ON_RESUME);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeLifecycleOwner is absent, setting custom one", null, false, 12, null);
        }
    }

    @Override // defpackage.u6b
    public final g6b getLifecycle() {
        return this.a;
    }

    @Override // defpackage.qqg
    public final nqg getSavedStateRegistry() {
        return this.b.b;
    }
}
