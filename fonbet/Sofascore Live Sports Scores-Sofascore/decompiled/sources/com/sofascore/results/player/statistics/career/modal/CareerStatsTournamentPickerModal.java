package com.sofascore.results.player.statistics.career.modal;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.player.statistics.career.modal.CareerStatsTournamentPickerModal;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.ez0;
import defpackage.g5k;
import defpackage.il2;
import defpackage.joa;
import defpackage.ll2;
import defpackage.nq8;
import defpackage.vt2;
import defpackage.wk2;
import defpackage.wt;
import defpackage.xk2;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/statistics/career/modal/CareerStatsTournamentPickerModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "kl2", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CareerStatsTournamentPickerModal extends Hilt_CareerStatsTournamentPickerModal {
    public xk2 B;
    public ez0 C;
    public final joa D;
    public final joa E;

    public CareerStatsTournamentPickerModal() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: jl2
            public final /* synthetic */ CareerStatsTournamentPickerModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CareerStatsTournamentPickerModal careerStatsTournamentPickerModal = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = careerStatsTournamentPickerModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "tournaments", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable tournaments not found");
                        return null;
                    default:
                        Bundle requireArguments2 = careerStatsTournamentPickerModal.requireArguments();
                        requireArguments2.getClass();
                        return (PickerItem.Tournament) ((Parcelable) gz8.K(requireArguments2, "selected_tournament_item", PickerItem.Tournament.class));
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.D = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: jl2
            public final /* synthetic */ CareerStatsTournamentPickerModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CareerStatsTournamentPickerModal careerStatsTournamentPickerModal = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = careerStatsTournamentPickerModal.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "tournaments", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable tournaments not found");
                        return null;
                    default:
                        Bundle requireArguments2 = careerStatsTournamentPickerModal.requireArguments();
                        requireArguments2.getClass();
                        return (PickerItem.Tournament) ((Parcelable) gz8.K(requireArguments2, "selected_tournament_item", PickerItem.Tournament.class));
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        List list;
        wk2 wk2Var;
        View inflate = layoutInflater.inflate(R.layout.career_stats_competition_selector_modal, (ViewGroup) v().l, false);
        int i = R.id.competition_type_header;
        TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.competition_type_header, inflate);
        if (typeHeaderView != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                this.C = new ez0(linearLayout, typeHeaderView, recyclerView, linearLayout, 2);
                joa joaVar = this.D;
                List list2 = (List) joaVar.getValue();
                joa joaVar2 = this.E;
                il2 il2Var = new il2(list2, (PickerItem.Tournament) joaVar2.getValue(), new ll2(1, 0, CareerStatsTournamentPickerModal.class, this, "onTournamentSelected", "onTournamentSelected(Lcom/sofascore/results/player/statistics/career/model/PickerItem$Tournament;)V"));
                PickerItem.Tournament tournament = (PickerItem.Tournament) joaVar2.getValue();
                this.B = (tournament == null || (wk2Var = tournament.a) == null) ? G() ? xk2.b : xk2.c : wk2Var.d;
                if (G() && ((list = (List) joaVar.getValue()) == null || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (Intrinsics.c(((UniqueTournament) it.next()).getCompetitionType(), wk2.j.a)) {
                            ez0 ez0Var = this.C;
                            if (ez0Var == null) {
                                Intrinsics.i("binding");
                                throw null;
                            }
                            g5k g5kVar = new g5k((TypeHeaderView) ez0Var.c);
                            String string = getString(R.string.club);
                            string.getClass();
                            vt2 vt2Var = new vt2("CLUB", string, false, null, null, null, null, 252);
                            String string2 = getString(R.string.national_team);
                            string2.getClass();
                            List j = kotlin.collections.b.j(vt2Var, new vt2("NATIONAL", string2, false, null, null, null, null, 252));
                            j.getClass();
                            g5kVar.b = j;
                            xk2 xk2Var = this.B;
                            g5kVar.c = xk2Var != null ? xk2Var.name() : null;
                            g5kVar.m = new wt(1, this, il2Var);
                            g5kVar.b();
                        }
                    }
                }
                ez0 ez0Var2 = this.C;
                if (ez0Var2 == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                RecyclerView recyclerView2 = (RecyclerView) ez0Var2.d;
                requireContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager());
                recyclerView2.setAdapter(il2Var);
                ez0 ez0Var3 = this.C;
                if (ez0Var3 == null) {
                    Intrinsics.i("binding");
                    throw null;
                }
                LinearLayout linearLayout2 = (LinearLayout) ez0Var3.e;
                linearLayout2.getClass();
                return linearLayout2;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final boolean G() {
        List list = (List) this.D.getValue();
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!Intrinsics.c(((UniqueTournament) it.next()).getCompetitionType(), wk2.j.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "SelectCompetitionModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.select_competition);
        string.getClass();
        return string;
    }
}
