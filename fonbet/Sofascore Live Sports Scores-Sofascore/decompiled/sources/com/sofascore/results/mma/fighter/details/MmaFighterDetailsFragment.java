package com.sofascore.results.mma.fighter.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.GridItem;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.PlayerTeamInfo;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamRankings;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.mma.fighter.details.MmaFighterDetailsFragment;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.aba;
import defpackage.ah5;
import defpackage.ao2;
import defpackage.as9;
import defpackage.au7;
import defpackage.bi4;
import defpackage.dla;
import defpackage.doc;
import defpackage.duf;
import defpackage.dv3;
import defpackage.eqb;
import defpackage.fc6;
import defpackage.hk4;
import defpackage.j08;
import defpackage.jmc;
import defpackage.joa;
import defpackage.krk;
import defpackage.llc;
import defpackage.mnc;
import defpackage.mqi;
import defpackage.ofe;
import defpackage.oo8;
import defpackage.ooe;
import defpackage.otk;
import defpackage.t39;
import defpackage.tba;
import defpackage.tnf;
import defpackage.un0;
import defpackage.v7a;
import defpackage.va8;
import defpackage.vm6;
import defpackage.vnc;
import defpackage.wm6;
import defpackage.wya;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.io.Serializable;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/fighter/details/MmaFighterDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaFighterDetailsFragment extends Hilt_MmaFighterDetailsFragment<oo8> {
    public final mqi r;
    public final otk s;
    public final mqi t;
    public final mqi u;

    public MmaFighterDetailsFragment() {
        final int i = 0;
        this.r = ypa.b(new Function0(this) { // from class: tnc
            public final /* synthetic */ MmaFighterDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MmaFighterDetailsFragment mmaFighterDetailsFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = mmaFighterDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FIGHTER", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable FIGHTER not found");
                        return null;
                    case 1:
                        Context requireContext = mmaFighterDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ooe(requireContext);
                    default:
                        LayoutInflater from = LayoutInflater.from(mmaFighterDetailsFragment.requireContext());
                        krk krkVar = mmaFighterDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = from.inflate(R.layout.mma_fighter_organization_division, (ViewGroup) ((oo8) krkVar).d, false);
                        int i3 = R.id.division_container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.division_container, inflate);
                        if (linearLayout != null) {
                            i3 = R.id.fighter_facts_grid;
                            GridView gridView = (GridView) nq8.B(R.id.fighter_facts_grid, inflate);
                            if (gridView != null) {
                                i3 = R.id.organisation_card;
                                CardView cardView = (CardView) nq8.B(R.id.organisation_card, inflate);
                                if (cardView != null) {
                                    i3 = R.id.organisation_container;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.organisation_container, inflate);
                                    if (constraintLayout != null) {
                                        i3 = R.id.organization_logo;
                                        ImageView imageView = (ImageView) nq8.B(R.id.organization_logo, inflate);
                                        if (imageView != null) {
                                            i3 = R.id.organization_name;
                                            TextView textView = (TextView) nq8.B(R.id.organization_name, inflate);
                                            if (textView != null) {
                                                i3 = R.id.period;
                                                TextView textView2 = (TextView) nq8.B(R.id.period, inflate);
                                                if (textView2 != null) {
                                                    return new doc((LinearLayout) inflate, linearLayout, gridView, cardView, constraintLayout, imageView, textView, textView2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                        return null;
                }
            }
        });
        joa a = ypa.a(ysa.c, new jmc(new jmc(this, 3), 4));
        this.s = new otk(duf.a.getOrCreateKotlinClass(vnc.class), new llc(a, 5), new wya(11, this, a), new llc(a, 6));
        final int i2 = 1;
        this.t = ypa.b(new Function0(this) { // from class: tnc
            public final /* synthetic */ MmaFighterDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MmaFighterDetailsFragment mmaFighterDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = mmaFighterDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FIGHTER", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable FIGHTER not found");
                        return null;
                    case 1:
                        Context requireContext = mmaFighterDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ooe(requireContext);
                    default:
                        LayoutInflater from = LayoutInflater.from(mmaFighterDetailsFragment.requireContext());
                        krk krkVar = mmaFighterDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = from.inflate(R.layout.mma_fighter_organization_division, (ViewGroup) ((oo8) krkVar).d, false);
                        int i3 = R.id.division_container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.division_container, inflate);
                        if (linearLayout != null) {
                            i3 = R.id.fighter_facts_grid;
                            GridView gridView = (GridView) nq8.B(R.id.fighter_facts_grid, inflate);
                            if (gridView != null) {
                                i3 = R.id.organisation_card;
                                CardView cardView = (CardView) nq8.B(R.id.organisation_card, inflate);
                                if (cardView != null) {
                                    i3 = R.id.organisation_container;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.organisation_container, inflate);
                                    if (constraintLayout != null) {
                                        i3 = R.id.organization_logo;
                                        ImageView imageView = (ImageView) nq8.B(R.id.organization_logo, inflate);
                                        if (imageView != null) {
                                            i3 = R.id.organization_name;
                                            TextView textView = (TextView) nq8.B(R.id.organization_name, inflate);
                                            if (textView != null) {
                                                i3 = R.id.period;
                                                TextView textView2 = (TextView) nq8.B(R.id.period, inflate);
                                                if (textView2 != null) {
                                                    return new doc((LinearLayout) inflate, linearLayout, gridView, cardView, constraintLayout, imageView, textView, textView2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.u = ypa.b(new Function0(this) { // from class: tnc
            public final /* synthetic */ MmaFighterDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MmaFighterDetailsFragment mmaFighterDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = mmaFighterDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FIGHTER", Team.class);
                        if (M != null) {
                            return (Team) M;
                        }
                        a70.p("Serializable FIGHTER not found");
                        return null;
                    case 1:
                        Context requireContext = mmaFighterDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new ooe(requireContext);
                    default:
                        LayoutInflater from = LayoutInflater.from(mmaFighterDetailsFragment.requireContext());
                        krk krkVar = mmaFighterDetailsFragment.l;
                        krkVar.getClass();
                        View inflate = from.inflate(R.layout.mma_fighter_organization_division, (ViewGroup) ((oo8) krkVar).d, false);
                        int i32 = R.id.division_container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.division_container, inflate);
                        if (linearLayout != null) {
                            i32 = R.id.fighter_facts_grid;
                            GridView gridView = (GridView) nq8.B(R.id.fighter_facts_grid, inflate);
                            if (gridView != null) {
                                i32 = R.id.organisation_card;
                                CardView cardView = (CardView) nq8.B(R.id.organisation_card, inflate);
                                if (cardView != null) {
                                    i32 = R.id.organisation_container;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.organisation_container, inflate);
                                    if (constraintLayout != null) {
                                        i32 = R.id.organization_logo;
                                        ImageView imageView = (ImageView) nq8.B(R.id.organization_logo, inflate);
                                        if (imageView != null) {
                                            i32 = R.id.organization_name;
                                            TextView textView = (TextView) nq8.B(R.id.organization_name, inflate);
                                            if (textView != null) {
                                                i32 = R.id.period;
                                                TextView textView2 = (TextView) nq8.B(R.id.period, inflate);
                                                if (textView2 != null) {
                                                    return new doc((LinearLayout) inflate, linearLayout, gridView, cardView, constraintLayout, imageView, textView, textView2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i32)));
                        return null;
                }
            }
        });
    }

    public final Team C() {
        return (Team) this.r.getValue();
    }

    public final doc D() {
        return (doc) this.u.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        String str;
        UniqueTournament uniqueTournament;
        Double reach;
        Double height;
        String w;
        Long birthDateTimestamp;
        String fightingStyle;
        Object obj;
        String residence;
        UniqueTournament uniqueTournament2;
        List<TeamRankings> teamRankings;
        Object obj2;
        UniqueTournament uniqueTournament3;
        String weightClass;
        Long currentUniqueTournamentSinceTimestamp;
        String string;
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 4);
        l();
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((oo8) krkVar2).e.setEnabled(false);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView = ((oo8) krkVar3).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        mqi mqiVar = this.t;
        recyclerView.setAdapter((ooe) mqiVar.getValue());
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        doc D = D();
        PlayerTeamInfo playerTeamInfo = C().getPlayerTeamInfo();
        CardView cardView = D().d;
        Tournament tournament = C().getTournament();
        cardView.setVisibility((tournament != null ? tournament.getUniqueTournament() : null) != null ? 0 : 8);
        Tournament tournament2 = C().getTournament();
        int i = 3;
        int i2 = 1;
        if (tournament2 != null && (uniqueTournament2 = tournament2.getUniqueTournament()) != null) {
            ImageView imageView = D.f;
            ConstraintLayout constraintLayout = D.e;
            TextView textView = D.h;
            as9.q(imageView, Integer.valueOf(uniqueTournament2.getId()), 0, null);
            D.g.setText(tba.x(uniqueTournament2));
            if (playerTeamInfo == null || (currentUniqueTournamentSinceTimestamp = playerTeamInfo.getCurrentUniqueTournamentSinceTimestamp()) == null) {
                textView.setVisibility(8);
            } else {
                long longValue = currentUniqueTournamentSinceTimestamp.longValue();
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                String i3 = fc6.i(longValue, hk4.a(bi4Var.d()));
                Long currentUniqueTournamentUntilTimestamp = playerTeamInfo.getCurrentUniqueTournamentUntilTimestamp();
                if (currentUniqueTournamentUntilTimestamp != null) {
                    string = fc6.i(currentUniqueTournamentUntilTimestamp.longValue(), hk4.a(bi4Var.d()));
                } else {
                    string = getString(R.string.present);
                    string.getClass();
                }
                textView.setText(getString(R.string.toolbar_subtitle_template, i3, string));
            }
            aba.y(constraintLayout, 0, 3);
            constraintLayout.setOnClickListener(new au7(25, this, uniqueTournament2));
            if (playerTeamInfo != null && (weightClass = playerTeamInfo.getWeightClass()) != null) {
                Context requireContext3 = requireContext();
                requireContext3.getClass();
                String q = tnf.q(requireContext3, weightClass);
                LinearLayout linearLayout = D().b;
                Context requireContext4 = requireContext();
                requireContext4.getClass();
                vm6 vm6Var = new vm6(requireContext4);
                String string2 = vm6Var.getResources().getString(R.string.current_division);
                string2.getClass();
                vm6Var.j(string2, null, true);
                vm6Var.setLabelValue(q);
                linearLayout.addView(vm6Var);
            }
            if (playerTeamInfo != null && (teamRankings = C().getTeamRankings()) != null) {
                Iterator<T> it = teamRankings.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    TeamRankings teamRankings2 = (TeamRankings) obj2;
                    if (teamRankings2.getGender() == C().getGender() && Intrinsics.c(teamRankings2.getWeightClass(), playerTeamInfo.getWeightClass())) {
                        Integer uniqueTournamentId = teamRankings2.getUniqueTournamentId();
                        Tournament tournament3 = C().getTournament();
                        if (Intrinsics.c(uniqueTournamentId, (tournament3 == null || (uniqueTournament3 = tournament3.getUniqueTournament()) == null) ? null : Integer.valueOf(uniqueTournament3.getId()))) {
                            break;
                        }
                    }
                }
                TeamRankings teamRankings3 = (TeamRankings) obj2;
                if (teamRankings3 != null) {
                    int position = teamRankings3.getPosition();
                    LinearLayout linearLayout2 = D().b;
                    Context requireContext5 = requireContext();
                    requireContext5.getClass();
                    vm6 vm6Var2 = new vm6(requireContext5);
                    String string3 = vm6Var2.getResources().getString(R.string.current_ranking);
                    string3.getClass();
                    vm6Var2.j(string3, null, true);
                    if (position == 0) {
                        String string4 = vm6Var2.getResources().getString(R.string.champion);
                        string4.getClass();
                        vm6Var2.l(new wm6(string4, requireContext().getDrawable(R.drawable.ic_champion), null, Integer.valueOf(requireContext().getColor(R.color.value)), null, 42));
                    } else {
                        vm6Var2.setLabelValue("#" + position);
                    }
                    linearLayout2.addView(vm6Var2);
                }
            }
        }
        Context requireContext6 = requireContext();
        requireContext6.getClass();
        t39 t39Var = t39.a;
        ofe ofeVar = new ofe(requireContext6);
        ArrayList arrayList = new ArrayList();
        PlayerTeamInfo playerTeamInfo2 = C().getPlayerTeamInfo();
        GridView gridView = D().c;
        gridView.setAdapter((ListAdapter) ofeVar);
        ArrayList arrayList2 = dv3.a;
        Country country = C().getCountry();
        if (country == null || (str = country.getAlpha2()) == null) {
            str = "";
        }
        com.sofascore.model.Country a = dv3.a(str);
        if (a != null) {
            GridItem gridItem = new GridItem(GridItem.Type.IMAGE, getString(R.string.nationality));
            gridItem.setFirst(a.getIoc());
            gridItem.setIsEnabled(true);
            gridItem.setCountryCode(a.getIso2Alpha());
            arrayList.add(gridItem);
        } else {
            a = null;
        }
        if (playerTeamInfo2 != null && (residence = playerTeamInfo2.getResidence()) != null) {
            GridItem gridItem2 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, getString(R.string.fighting_out_of));
            gridItem2.setFirst(residence);
            arrayList.add(gridItem2);
        }
        if (playerTeamInfo2 != null && (fightingStyle = playerTeamInfo2.getFightingStyle()) != null) {
            GridItem gridItem3 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, getString(R.string.style));
            j08.c.getClass();
            Iterator<E> it2 = j08.e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((j08) obj).a.equals(fightingStyle)) {
                        break;
                    }
                }
            }
            j08 j08Var = (j08) obj;
            gridItem3.setFirst(getString(j08Var != null ? j08Var.b : R.string.value_unknown));
            arrayList.add(gridItem3);
        }
        if (playerTeamInfo2 != null && (birthDateTimestamp = playerTeamInfo2.getBirthDateTimestamp()) != null) {
            long longValue2 = birthDateTimestamp.longValue();
            bi4 bi4Var2 = bi4.PATTERN_DMMY;
            Locale d = dla.d();
            ZoneId of = ZoneId.of("GMT");
            of.getClass();
            String i4 = fc6.i(longValue2, DateTimeFormatter.ofPattern(bi4Var2.d(), d).withZone(of).withDecimalStyle(DecimalStyle.of(d)));
            GridItem gridItem4 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, getString(R.string.date_of_birth));
            gridItem4.setFirst(i4);
            arrayList.add(gridItem4);
        }
        if (playerTeamInfo2 != null && (height = playerTeamInfo2.getHeight()) != null) {
            double doubleValue = height.doubleValue();
            Context context = gridView.getContext();
            context.getClass();
            w = v7a.w(context, doubleValue, (r4 & 4) == 0, false);
            GridItem gridItem5 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, getString(R.string.player_height));
            gridItem5.setFirst(w);
            arrayList.add(gridItem5);
        }
        if (playerTeamInfo2 != null && (reach = playerTeamInfo2.getReach()) != null) {
            double doubleValue2 = reach.doubleValue();
            Context context2 = gridView.getContext();
            context2.getClass();
            String w2 = v7a.w(context2, doubleValue2, true, true);
            GridItem gridItem6 = new GridItem(GridItem.Type.DISABLED_ALL_CAPS, getString(R.string.reach));
            gridItem6.setFirst(w2);
            arrayList.add(gridItem6);
        }
        gridView.setOnItemClickListener(new ah5(i, this, a));
        int ceil = (int) Math.ceil(arrayList.size() / 3.0d);
        ViewGroup.LayoutParams layoutParams = gridView.getLayoutParams();
        Context requireContext7 = requireContext();
        requireContext7.getClass();
        layoutParams.height = ao2.s(56, requireContext7) * ceil;
        ofeVar.a(arrayList);
        ooe ooeVar = (ooe) mqiVar.getValue();
        LinearLayout linearLayout3 = D().a;
        linearLayout3.getClass();
        ooeVar.p(ooeVar.g.size(), linearLayout3);
        otk otkVar = this.s;
        vnc vncVar = (vnc) otkVar.getValue();
        Tournament tournament4 = C().getTournament();
        Integer valueOf = (tournament4 == null || (uniqueTournament = tournament4.getUniqueTournament()) == null) ? null : Integer.valueOf(uniqueTournament.getId());
        PlayerTeamInfo playerTeamInfo3 = C().getPlayerTeamInfo();
        xw3.L(un0.z(vncVar), null, null, new va8(valueOf, playerTeamInfo3 != null ? playerTeamInfo3.getWeightClass() : null, C().getGender(), vncVar, null, 20), 3);
        ((vnc) otkVar.getValue()).g.e(getViewLifecycleOwner(), new eqb(7, new mnc(this, i2)));
    }
}
