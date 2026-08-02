package com.sofascore.results.main.fantasy.bottomsheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;
import defpackage.joa;
import defpackage.q9k;
import defpackage.qo6;
import defpackage.tc3;
import defpackage.vj7;
import defpackage.ypa;
import defpackage.yrh;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/main/fantasy/bottomsheet/FantasySectionedBottomSheetFragment;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FantasySectionedBottomSheetFragment extends BaseModalBottomSheetDialog {
    public final joa w = ypa.a(ysa.c, new qo6(this, 17));
    public final boolean x = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        a.b.setContent(new tc3(1952904179, new vj7(w(), this, 0), true));
        CoordinatorLayout coordinatorLayout = a.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return ((FantasySectionedInfoType) this.w.getValue()).Q0();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        q9k title = ((FantasySectionedInfoType) this.w.getValue()).getTitle();
        Context requireContext = requireContext();
        requireContext.getClass();
        return title.b(requireContext);
    }
}
