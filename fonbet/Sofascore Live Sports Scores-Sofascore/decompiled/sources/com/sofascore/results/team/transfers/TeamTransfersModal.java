package com.sofascore.results.team.transfers;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import defpackage.bte;
import defpackage.duf;
import defpackage.eyd;
import defpackage.fwi;
import defpackage.g2i;
import defpackage.joa;
import defpackage.otk;
import defpackage.q3j;
import defpackage.q8i;
import defpackage.rlh;
import defpackage.rvj;
import defpackage.s2j;
import defpackage.uri;
import defpackage.v1h;
import defpackage.w1i;
import defpackage.w74;
import defpackage.ygi;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/team/transfers/TeamTransfersModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamTransfersModal extends Hilt_TeamTransfersModal {
    public final otk B;
    public final joa C;
    public SegmentedButtonsView D;

    public TeamTransfersModal() {
        s2j s2jVar = new s2j(this, 1);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new s2j(s2jVar, 2));
        this.B = new otk(duf.a.getOrCreateKotlinClass(q3j.class), new fwi(a, 17), new bte(this, a, 29), new fwi(a, 18));
        this.C = ypa.a(ysaVar, new w1i(this, 13));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View B(LayoutInflater layoutInflater) {
        if (Intrinsics.c(requireArguments().getString(SearchResponseKt.SPORT_ENTITY), Sports.FOOTBALL)) {
            View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.button_transfers_modal, (ViewGroup) v().m, false);
            if (inflate != null) {
                MaterialButton materialButton = (MaterialButton) inflate;
                materialButton.setOnClickListener(new eyd(27, materialButton, this));
                return materialButton;
            }
            yhk.s("rootView");
        }
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View C(LayoutInflater layoutInflater) {
        Context requireContext = requireContext();
        requireContext.getClass();
        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext, null, 6);
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        segmentedButtonsView.k = new q8i(this, 19);
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = new z1h(0);
        rlh rlhVar = rlh.b;
        if (!rlhVar.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
        }
        segmentedButtonsView.setNewLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        segmentedButtonsView.setBackgroundColor(requireContext().getColor(R.color.surface_P));
        this.D = segmentedButtonsView;
        return segmentedButtonsView;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        RecyclerView recyclerView = w74.b(layoutInflater, null).c;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        s(recyclerView);
        joa joaVar = this.C;
        recyclerView.setAdapter((rvj) joaVar.getValue());
        rvj rvjVar = (rvj) joaVar.getValue();
        uri uriVar = new uri(this, 7);
        rvjVar.getClass();
        rvjVar.a.d = uriVar;
        return recyclerView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.D = null;
        super.onDestroyView();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((q3j) this.B.getValue()).j.e(getViewLifecycleOwner(), new ygi(4, new g2i(this, 23)));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "PlayerTransfersScreen";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(Intrinsics.c(requireArguments().getString(SearchResponseKt.SPORT_ENTITY), Sports.BASKETBALL) ? R.string.transactions : R.string.transfers);
        string.getClass();
        return string;
    }
}
