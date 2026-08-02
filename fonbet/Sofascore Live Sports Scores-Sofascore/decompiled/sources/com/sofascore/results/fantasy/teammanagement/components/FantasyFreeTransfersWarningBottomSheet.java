package com.sofascore.results.fantasy.teammanagement.components;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.R;
import defpackage.b07;
import defpackage.tc3;
import defpackage.yrh;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/teammanagement/components/FantasyFreeTransfersWarningBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyFreeTransfersWarningBottomSheet extends Hilt_FantasyFreeTransfersWarningBottomSheet {
    public final boolean B = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        a.b.setContent(new tc3(1945808830, new b07(w(), 0), true));
        CoordinatorLayout coordinatorLayout = a.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TransfersWarningModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getB() {
        return this.B;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.fantasy_no_free_transfers_left_title);
        string.getClass();
        return string;
    }
}
