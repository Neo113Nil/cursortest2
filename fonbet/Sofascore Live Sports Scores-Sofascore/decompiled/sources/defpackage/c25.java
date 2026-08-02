package defpackage;

import android.view.View;
import android.view.ViewStub;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c25 implements krk {
    public final CoordinatorLayout a;
    public final ViewStub b;
    public final w82 c;

    public c25(CoordinatorLayout coordinatorLayout, ViewStub viewStub, w82 w82Var, NestedScrollView nestedScrollView) {
        this.a = coordinatorLayout;
        this.b = viewStub;
        this.c = w82Var;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
