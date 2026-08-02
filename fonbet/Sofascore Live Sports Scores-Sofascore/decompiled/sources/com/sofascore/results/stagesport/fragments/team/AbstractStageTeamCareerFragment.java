package com.sofascore.results.stagesport.fragments.team;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.newNetwork.StageTeamHistoryResponse;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.stagesport.fragments.team.AbstractStageTeamCareerFragment;
import defpackage.ao2;
import defpackage.duf;
import defpackage.h8i;
import defpackage.joa;
import defpackage.k8i;
import defpackage.krk;
import defpackage.oo8;
import defpackage.otk;
import defpackage.u2;
import defpackage.y7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z7;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/team/AbstractStageTeamCareerFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractStageTeamCareerFragment extends AbstractFragment<oo8> {
    public final otk m;
    public final joa n;
    public final joa o;
    public final joa p;

    public AbstractStageTeamCareerFragment() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.m = new otk(duf.a.getOrCreateKotlinClass(h8i.class), new z7(this, i), new z7(this, i3), new z7(this, i2));
        Function0 function0 = new Function0(this) { // from class: x7
            public final /* synthetic */ AbstractStageTeamCareerFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                AbstractStageTeamCareerFragment abstractStageTeamCareerFragment = this.b;
                switch (i4) {
                    case 0:
                        Context requireContext = abstractStageTeamCareerFragment.requireContext();
                        requireContext.getClass();
                        k8i k8iVar = new k8i(requireContext);
                        k8iVar.a.d = new kr1(k8iVar, 8);
                        break;
                    case 1:
                        LayoutInflater from = LayoutInflater.from(abstractStageTeamCareerFragment.getContext());
                        krk krkVar = abstractStageTeamCareerFragment.l;
                        krkVar.getClass();
                        View inflate = from.inflate(R.layout.section_header_driver_career, (ViewGroup) ((oo8) krkVar).d, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            break;
                        } else {
                            break;
                        }
                    default:
                        LayoutInflater from2 = LayoutInflater.from(abstractStageTeamCareerFragment.requireContext());
                        krk krkVar2 = abstractStageTeamCareerFragment.l;
                        krkVar2.getClass();
                        View inflate2 = from2.inflate(R.layout.item_simple_legend, (ViewGroup) ((oo8) krkVar2).d, false);
                        if (inflate2 == null) {
                            yhk.s("rootView");
                            break;
                        } else {
                            LinearLayout linearLayout = (LinearLayout) inflate2;
                            vy1 vy1Var = new vy1(linearLayout, 2);
                            wba.m(vy1Var, R.string.motorsport_races_short, R.string.formula_races);
                            wba.m(vy1Var, R.string.motorsport_podiums_short, R.string.podiums);
                            wba.m(vy1Var, R.string.win_short, R.string.wins);
                            wba.m(vy1Var, R.string.motorsport_pole_positions_short, R.string.pole_positions);
                            break;
                        }
                }
                return null;
            }
        };
        ysa ysaVar = ysa.c;
        this.n = ypa.a(ysaVar, function0);
        this.o = ypa.a(ysaVar, new Function0(this) { // from class: x7
            public final /* synthetic */ AbstractStageTeamCareerFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                AbstractStageTeamCareerFragment abstractStageTeamCareerFragment = this.b;
                switch (i4) {
                    case 0:
                        Context requireContext = abstractStageTeamCareerFragment.requireContext();
                        requireContext.getClass();
                        k8i k8iVar = new k8i(requireContext);
                        k8iVar.a.d = new kr1(k8iVar, 8);
                        break;
                    case 1:
                        LayoutInflater from = LayoutInflater.from(abstractStageTeamCareerFragment.getContext());
                        krk krkVar = abstractStageTeamCareerFragment.l;
                        krkVar.getClass();
                        View inflate = from.inflate(R.layout.section_header_driver_career, (ViewGroup) ((oo8) krkVar).d, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            break;
                        } else {
                            break;
                        }
                    default:
                        LayoutInflater from2 = LayoutInflater.from(abstractStageTeamCareerFragment.requireContext());
                        krk krkVar2 = abstractStageTeamCareerFragment.l;
                        krkVar2.getClass();
                        View inflate2 = from2.inflate(R.layout.item_simple_legend, (ViewGroup) ((oo8) krkVar2).d, false);
                        if (inflate2 == null) {
                            yhk.s("rootView");
                            break;
                        } else {
                            LinearLayout linearLayout = (LinearLayout) inflate2;
                            vy1 vy1Var = new vy1(linearLayout, 2);
                            wba.m(vy1Var, R.string.motorsport_races_short, R.string.formula_races);
                            wba.m(vy1Var, R.string.motorsport_podiums_short, R.string.podiums);
                            wba.m(vy1Var, R.string.win_short, R.string.wins);
                            wba.m(vy1Var, R.string.motorsport_pole_positions_short, R.string.pole_positions);
                            break;
                        }
                }
                return null;
            }
        });
        this.p = ypa.a(ysaVar, new Function0(this) { // from class: x7
            public final /* synthetic */ AbstractStageTeamCareerFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                AbstractStageTeamCareerFragment abstractStageTeamCareerFragment = this.b;
                switch (i4) {
                    case 0:
                        Context requireContext = abstractStageTeamCareerFragment.requireContext();
                        requireContext.getClass();
                        k8i k8iVar = new k8i(requireContext);
                        k8iVar.a.d = new kr1(k8iVar, 8);
                        break;
                    case 1:
                        LayoutInflater from = LayoutInflater.from(abstractStageTeamCareerFragment.getContext());
                        krk krkVar = abstractStageTeamCareerFragment.l;
                        krkVar.getClass();
                        View inflate = from.inflate(R.layout.section_header_driver_career, (ViewGroup) ((oo8) krkVar).d, false);
                        if (inflate == null) {
                            yhk.s("rootView");
                            break;
                        } else {
                            break;
                        }
                    default:
                        LayoutInflater from2 = LayoutInflater.from(abstractStageTeamCareerFragment.requireContext());
                        krk krkVar2 = abstractStageTeamCareerFragment.l;
                        krkVar2.getClass();
                        View inflate2 = from2.inflate(R.layout.item_simple_legend, (ViewGroup) ((oo8) krkVar2).d, false);
                        if (inflate2 == null) {
                            yhk.s("rootView");
                            break;
                        } else {
                            LinearLayout linearLayout = (LinearLayout) inflate2;
                            vy1 vy1Var = new vy1(linearLayout, 2);
                            wba.m(vy1Var, R.string.motorsport_races_short, R.string.formula_races);
                            wba.m(vy1Var, R.string.motorsport_podiums_short, R.string.podiums);
                            wba.m(vy1Var, R.string.win_short, R.string.wins);
                            wba.m(vy1Var, R.string.motorsport_pole_positions_short, R.string.pole_positions);
                            break;
                        }
                }
                return null;
            }
        });
    }

    public abstract List A(StageTeamHistoryResponse stageTeamHistoryResponse);

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "HistoryTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        ((oo8) krkVar).e.setEnabled(false);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar3).d;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView2.setPaddingRelative(recyclerView2.getPaddingStart(), ao2.s(4, requireContext2), recyclerView2.getPaddingEnd(), recyclerView2.getPaddingBottom());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((oo8) krkVar4).d.setAdapter((k8i) this.n.getValue());
        ((h8i) this.m.getValue()).m.e(getViewLifecycleOwner(), new y7(0, new u2(this, 3)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        ((h8i) this.m.getValue()).k();
    }
}
