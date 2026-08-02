package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import com.sofascore.results.league.view.cuptree.ExpandButton;
import com.sofascore.results.view.CupTreeView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class co8 implements krk {
    public final LinearLayout a;
    public final ComposeView b;
    public final NestedScrollView c;
    public final CupTreeView d;
    public final CupTreeExtendedView e;
    public final View f;
    public final ExpandButton g;
    public final FrameLayout h;
    public final CoordinatorLayout i;
    public final FrameLayout j;
    public final ConstraintLayout k;

    public co8(LinearLayout linearLayout, ComposeView composeView, NestedScrollView nestedScrollView, CupTreeView cupTreeView, CupTreeExtendedView cupTreeExtendedView, View view, ExpandButton expandButton, FrameLayout frameLayout, CoordinatorLayout coordinatorLayout, FrameLayout frameLayout2, ConstraintLayout constraintLayout) {
        this.a = linearLayout;
        this.b = composeView;
        this.c = nestedScrollView;
        this.d = cupTreeView;
        this.e = cupTreeExtendedView;
        this.f = view;
        this.g = expandButton;
        this.h = frameLayout;
        this.i = coordinatorLayout;
        this.j = frameLayout2;
        this.k = constraintLayout;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
