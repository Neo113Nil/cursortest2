package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class af implements krk {
    public final CoordinatorLayout a;
    public final ViewStub b;
    public final RecyclerView c;
    public final ComposeView d;
    public final FrameLayout e;

    public af(CoordinatorLayout coordinatorLayout, ViewStub viewStub, RecyclerView recyclerView, ComposeView composeView, FrameLayout frameLayout) {
        this.a = coordinatorLayout;
        this.b = viewStub;
        this.c = recyclerView;
        this.d = composeView;
        this.e = frameLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
