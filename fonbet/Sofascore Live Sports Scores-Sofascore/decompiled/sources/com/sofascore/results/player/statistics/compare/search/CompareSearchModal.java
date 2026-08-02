package com.sofascore.results.player.statistics.compare.search;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.results.R;
import defpackage.c63;
import defpackage.dd;
import defpackage.duf;
import defpackage.e73;
import defpackage.h63;
import defpackage.i63;
import defpackage.j63;
import defpackage.joa;
import defpackage.k43;
import defpackage.mnc;
import defpackage.nh3;
import defpackage.nq4;
import defpackage.nq8;
import defpackage.otk;
import defpackage.ox1;
import defpackage.p63;
import defpackage.p83;
import defpackage.pfb;
import defpackage.r82;
import defpackage.s0;
import defpackage.w1;
import defpackage.x1;
import defpackage.y1;
import defpackage.y7;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/statistics/compare/search/CompareSearchModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "com/sofascore/results/team/trophy/TeamTrophyCompareActivity", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompareSearchModal extends Hilt_CompareSearchModal {
    public final otk B;
    public final joa C;

    public CompareSearchModal() {
        w1 w1Var = new w1(this, 29);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new j63(w1Var, 0));
        this.B = new otk(duf.a.getOrCreateKotlinClass(p63.class), new x1(a, 25), new y1(19, this, a), new x1(a, 26));
        this.C = ypa.a(ysaVar, new h63(this, 0));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View C(LayoutInflater layoutInflater) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.modal_player_search, (ViewGroup) null, false);
        int i2 = R.id.clear_button;
        ImageView imageView = (ImageView) nq8.B(R.id.clear_button, inflate);
        if (imageView != null) {
            i2 = R.id.search_edit;
            TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.search_edit, inflate);
            if (textInputEditText != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                dd ddVar = new dd(constraintLayout, imageView, textInputEditText, 26);
                textInputEditText.addTextChangedListener(new i63(i, this, ddVar));
                textInputEditText.setHint(((p83) this.C.getValue()).d);
                imageView.setOnClickListener(new s0(ddVar, 16));
                constraintLayout.getClass();
                return constraintLayout;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        Context requireContext = requireContext();
        requireContext.getClass();
        c63 c63Var = new c63(requireContext, new k43(1, this, CompareSearchModal.class, "onItemDeletedFromRecent", "onItemDeletedFromRecent(I)V", 0, 5), new k43(1, this, CompareSearchModal.class, "onItemSelected", "onItemSelected(Lcom/sofascore/model/mvvm/IRecent;)V", 0, 6));
        RecyclerView recyclerView = new RecyclerView(requireContext());
        m itemAnimator = recyclerView.getItemAnimator();
        itemAnimator.getClass();
        ((nq4) itemAnimator).g = false;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        nh3 nh3Var = new nh3();
        nh3Var.b = new pfb(false);
        c63Var.o(new mnc(nh3Var, 25));
        recyclerView.setAdapter(new nh3(new l[]{c63Var, nh3Var}));
        s(recyclerView);
        ((p63) this.B.getValue()).i.e(this, new y7(10, new r82(5, c63Var, this)));
        c63Var.o(new ox1(recyclerView, 20));
        return recyclerView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.t.b = arguments != null ? arguments.getString("ANALYTICS_TYPE") : null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("ENTITY_TYPE")) == null) {
            str = "Player";
        }
        return e73.valueOf(str) == e73.a ? "PlayerSelectionModal" : "TeamSelectionModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
