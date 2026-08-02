package com.sofascore.results.fantasy.competition.home.bottomsheet.pricetracker;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.R;
import defpackage.a99;
import defpackage.cf7;
import defpackage.duf;
import defpackage.if7;
import defpackage.joa;
import defpackage.l07;
import defpackage.l27;
import defpackage.otk;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.yrh;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/home/bottomsheet/pricetracker/FantasyPriceTrackerBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyPriceTrackerBottomSheet extends Hilt_FantasyPriceTrackerBottomSheet {
    public final otk B;

    public FantasyPriceTrackerBottomSheet() {
        joa a = ypa.a(ysa.c, new l07(new l07(this, 19), 20));
        this.B = new otk(duf.a.getOrCreateKotlinClass(if7.class), new l27(a, 13), new z07(10, this, a), new l27(a, 14));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        ComposeView composeView = a.b;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(-1408327561, new cf7(this, 1), true));
        CoordinatorLayout coordinatorLayout = a.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "PriceTrackerModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.fantasy_recent_price_changes);
        string.getClass();
        return string;
    }
}
