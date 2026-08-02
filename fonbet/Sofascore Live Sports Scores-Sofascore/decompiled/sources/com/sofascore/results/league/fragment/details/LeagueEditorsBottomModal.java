package com.sofascore.results.league.fragment.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.league.fragment.details.LeagueEditorsBottomModal;
import defpackage.duf;
import defpackage.gwa;
import defpackage.ida;
import defpackage.iwa;
import defpackage.joa;
import defpackage.jwa;
import defpackage.kva;
import defpackage.mqi;
import defpackage.otk;
import defpackage.y7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/details/LeagueEditorsBottomModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueEditorsBottomModal extends BaseModalBottomSheetDialog {
    public final boolean w = true;
    public final otk x = new otk(duf.a.getOrCreateKotlinClass(kva.class), new iwa(this, 0), new iwa(this, 2), new iwa(this, 1));
    public final mqi y;
    public final joa z;

    public LeagueEditorsBottomModal() {
        final int i = 1;
        final int i2 = 0;
        this.y = ypa.b(new Function0(this) { // from class: hwa
            public final /* synthetic */ LeagueEditorsBottomModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                LeagueEditorsBottomModal leagueEditorsBottomModal = this.b;
                switch (i3) {
                    case 0:
                        View inflate = leagueEditorsBottomModal.getLayoutInflater().inflate(R.layout.league_editors_bottom_modal, (ViewGroup) leagueEditorsBottomModal.v().l, false);
                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                        if (recyclerView != null) {
                            return new jwa((LinearLayout) inflate, recyclerView);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.recycler_view)));
                        return null;
                    default:
                        Context requireContext = leagueEditorsBottomModal.requireContext();
                        requireContext.getClass();
                        gwa gwaVar = new gwa(requireContext);
                        gwaVar.a.d = new bba(leagueEditorsBottomModal, 3);
                        return gwaVar;
                }
            }
        });
        this.z = ypa.a(ysa.c, new Function0(this) { // from class: hwa
            public final /* synthetic */ LeagueEditorsBottomModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                LeagueEditorsBottomModal leagueEditorsBottomModal = this.b;
                switch (i3) {
                    case 0:
                        View inflate = leagueEditorsBottomModal.getLayoutInflater().inflate(R.layout.league_editors_bottom_modal, (ViewGroup) leagueEditorsBottomModal.v().l, false);
                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                        if (recyclerView != null) {
                            return new jwa((LinearLayout) inflate, recyclerView);
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.recycler_view)));
                        return null;
                    default:
                        Context requireContext = leagueEditorsBottomModal.requireContext();
                        requireContext.getClass();
                        gwa gwaVar = new gwa(requireContext);
                        gwaVar.a.d = new bba(leagueEditorsBottomModal, 3);
                        return gwaVar;
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        mqi mqiVar = this.y;
        RecyclerView recyclerView = ((jwa) mqiVar.getValue()).b;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter((gwa) this.z.getValue());
        ((kva) this.x.getValue()).m.e(getViewLifecycleOwner(), new y7(29, new ida(this, 13)));
        LinearLayout linearLayout = ((jwa) mqiVar.getValue()).a;
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.a = Integer.valueOf(requireArguments().getInt("UNIQUE_TOURNAMENT_ID"));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ChooseEditorModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.competition_editors_list_title);
        string.getClass();
        return string;
    }
}
