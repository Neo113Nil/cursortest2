package com.sofascore.results.fantasy.competition.leagues.bottomsheet.reorder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.duf;
import defpackage.eca;
import defpackage.is6;
import defpackage.joa;
import defpackage.otk;
import defpackage.s26;
import defpackage.tc3;
import defpackage.uf7;
import defpackage.vf7;
import defpackage.w74;
import defpackage.wf7;
import defpackage.xf7;
import defpackage.yf7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yso;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/leagues/bottomsheet/reorder/FantasyReorderLeaguesBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyReorderLeaguesBottomSheet extends Hilt_FantasyReorderLeaguesBottomSheet {
    public w74 C;
    public final otk B = new otk(duf.a.getOrCreateKotlinClass(is6.class), new yf7(this, 0), new yf7(this, 2), new yf7(this, 1));
    public final joa D = ypa.a(ysa.c, new wf7(this, 0));
    public final eca E = new eca(new xf7(this, 0));
    public final boolean F = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View C(LayoutInflater layoutInflater) {
        return yso.s(this, new tc3(-449505141, new vf7(this, 0), true));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        w74 b = w74.b(layoutInflater, (FrameLayout) v().l);
        this.C = b;
        RecyclerView recyclerView = b.c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 22);
        w74 w74Var = this.C;
        if (w74Var == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        RecyclerView recyclerView2 = w74Var.c;
        joa joaVar = this.D;
        recyclerView2.setAdapter((uf7) joaVar.getValue());
        w74 w74Var2 = this.C;
        if (w74Var2 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        this.E.f(w74Var2.c);
        ((uf7) joaVar.getValue()).l = new s26(1, this.E, eca.class, "startDrag", "startDrag(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", 0, 9);
        w74 w74Var3 = this.C;
        if (w74Var3 != null) {
            return w74Var3.b;
        }
        Intrinsics.i("dialogBinding");
        throw null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ReorderLeaguesModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getF() {
        return this.F;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
