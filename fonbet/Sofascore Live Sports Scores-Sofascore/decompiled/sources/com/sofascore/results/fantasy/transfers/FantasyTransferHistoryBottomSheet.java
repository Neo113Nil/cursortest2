package com.sofascore.results.fantasy.transfers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.results.R;
import defpackage.c51;
import defpackage.duf;
import defpackage.joa;
import defpackage.l07;
import defpackage.l27;
import defpackage.om7;
import defpackage.otk;
import defpackage.tc3;
import defpackage.tm7;
import defpackage.ypa;
import defpackage.yrh;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/transfers/FantasyTransferHistoryBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyTransferHistoryBottomSheet extends Hilt_FantasyTransferHistoryBottomSheet {
    public yrh B;
    public final otk C;

    public FantasyTransferHistoryBottomSheet() {
        joa a = ypa.a(ysa.c, new l07(new l07(this, 23), 24));
        this.C = new otk(duf.a.getOrCreateKotlinClass(tm7.class), new l27(a, 17), new z07(12, this, a), new l27(a, 18));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        c51 w = w();
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        this.B = a;
        a.b.setContent(new tc3(-1304440342, new om7(this, w, 1), true));
        yrh yrhVar = this.B;
        if (yrhVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        CoordinatorLayout coordinatorLayout = yrhVar.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior.C((View) parent).M(3);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TransferHistoryModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.transfer_history);
        string.getClass();
        return string;
    }
}
