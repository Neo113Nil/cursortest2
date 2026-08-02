package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.results.view.InfoBubbleText;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class to8 implements krk {
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final ComposeView c;
    public final FrameLayout d;
    public final InfoBubbleText e;
    public final SegmentedButtonsView f;

    public to8(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ComposeView composeView, FrameLayout frameLayout, InfoBubbleText infoBubbleText, SegmentedButtonsView segmentedButtonsView) {
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = composeView;
        this.d = frameLayout;
        this.e = infoBubbleText;
        this.f = segmentedButtonsView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
