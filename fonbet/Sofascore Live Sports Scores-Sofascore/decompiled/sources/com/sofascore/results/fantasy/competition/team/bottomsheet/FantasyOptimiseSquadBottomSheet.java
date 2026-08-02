package com.sofascore.results.fantasy.competition.team.bottomsheet;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.R;
import defpackage.duf;
import defpackage.fuf;
import defpackage.gc7;
import defpackage.joa;
import defpackage.l07;
import defpackage.l27;
import defpackage.otk;
import defpackage.pu6;
import defpackage.qo6;
import defpackage.tc3;
import defpackage.xb7;
import defpackage.yb7;
import defpackage.ypa;
import defpackage.yrh;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/team/bottomsheet/FantasyOptimiseSquadBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyOptimiseSquadBottomSheet extends Hilt_FantasyOptimiseSquadBottomSheet {
    public final otk B;
    public final otk C;
    public yrh D;
    public final joa E;
    public final boolean F;

    public FantasyOptimiseSquadBottomSheet() {
        yb7 yb7Var = new yb7(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new l07(yb7Var, 16));
        fuf fufVar = duf.a;
        this.B = new otk(fufVar.getOrCreateKotlinClass(gc7.class), new l27(a, 9), new z07(8, this, a), new l27(a, 10));
        this.C = new otk(fufVar.getOrCreateKotlinClass(pu6.class), new yb7(this, 0), new yb7(this, 2), new yb7(this, 1));
        this.E = ypa.a(ysaVar, new qo6(this, 14));
        this.F = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        this.D = a;
        a.b.setContent(new tc3(902595066, new xb7(this, 0), true));
        yrh yrhVar = this.D;
        if (yrhVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        CoordinatorLayout coordinatorLayout = yrhVar.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "OptimiseLineupModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.F;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.fantasy_optimise_your_lineup_title);
        string.getClass();
        return string;
    }
}
