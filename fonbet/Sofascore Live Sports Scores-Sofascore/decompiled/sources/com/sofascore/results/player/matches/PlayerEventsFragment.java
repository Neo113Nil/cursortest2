package com.sofascore.results.player.matches;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.player.matches.PlayerEventsFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a5f;
import defpackage.dt5;
import defpackage.duf;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqb;
import defpackage.gqe;
import defpackage.gz8;
import defpackage.i9a;
import defpackage.is1;
import defpackage.j29;
import defpackage.j58;
import defpackage.joa;
import defpackage.k03;
import defpackage.k13;
import defpackage.km5;
import defpackage.kp5;
import defpackage.kqe;
import defpackage.krk;
import defpackage.mqi;
import defpackage.n9e;
import defpackage.otk;
import defpackage.oxk;
import defpackage.q9k;
import defpackage.qoe;
import defpackage.qqe;
import defpackage.s1h;
import defpackage.sse;
import defpackage.ta0;
import defpackage.tug;
import defpackage.u6e;
import defpackage.uic;
import defpackage.un0;
import defpackage.v8a;
import defpackage.vce;
import defpackage.vse;
import defpackage.w91;
import defpackage.wse;
import defpackage.wya;
import defpackage.x2e;
import defpackage.xq8;
import defpackage.xw3;
import defpackage.yea;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/matches/PlayerEventsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lxq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerEventsFragment extends Hilt_PlayerEventsFragment<xq8> {
    public final e1d A;
    public boolean B;
    public boolean C;
    public final joa D;
    public final joa E;
    public final joa F;
    public final joa G;
    public final joa H;
    public final mqi r;
    public Integer s;
    public final otk t;
    public boolean u;
    public v8a v;
    public final tug w;
    public final mqi x;
    public final j29 y;
    public final e1d z;

    public PlayerEventsFragment() {
        final int i = 2;
        this.r = ypa.b(new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                final int i3 = 0;
                final int i4 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = i3;
                                PlayerEventsFragment playerEventsFragment2 = playerEventsFragment;
                                switch (i5) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment2.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment2.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i6 = av8Var.i(playerEventsFragment2);
                                            Object O = av8Var.O();
                                            if (i6 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment2, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment2.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment2.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment2.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment2.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment2.C().Y(playerEventsFragment2.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i5 = i4;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i5) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a2, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i6 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i6 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        });
        final int i2 = 4;
        vce vceVar = new vce(this, 4);
        ysa ysaVar = ysa.c;
        final int i3 = 5;
        joa a = ypa.a(ysaVar, new vce(vceVar, 5));
        final int i4 = 7;
        final int i5 = 8;
        this.t = new otk(duf.a.getOrCreateKotlinClass(qqe.class), new x2e(a, 7), new wya(28, this, a), new x2e(a, 8));
        final int i6 = 1;
        this.u = true;
        this.w = new tug();
        this.x = ypa.b(new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a2, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        });
        this.y = new j29(Integer.valueOf(R.drawable.no_events_2), Integer.valueOf(R.string.no_games_title), Integer.valueOf(R.string.no_next_games), 497);
        this.z = e.f(km5.a);
        this.A = e.f(null);
        this.D = ypa.a(ysaVar, new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        });
        final int i7 = 6;
        this.E = n9e.M(new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        }, new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        });
        final int i8 = 9;
        this.F = n9e.M(new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        }, new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        });
        final int i9 = 10;
        final int i10 = 0;
        this.G = n9e.M(new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i9;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        }, new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i10;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        });
        final int i11 = 3;
        this.H = n9e.M(new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        }, new Function0(this) { // from class: lqe
            public final /* synthetic */ PlayerEventsFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r13v0, types: [nqe] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i11;
                final int i32 = 0;
                final int i42 = 1;
                final PlayerEventsFragment playerEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = playerEventsFragment.requireContext();
                        requireContext.getClass();
                        TypeHeaderView typeHeaderView = new TypeHeaderView(requireContext, null, 6);
                        g5k g5kVar = new g5k(typeHeaderView);
                        g5kVar.k = true;
                        g5kVar.d = new kqe(playerEventsFragment, 1);
                        g5kVar.m = new ur1(playerEventsFragment, 16);
                        g5kVar.b();
                        return typeHeaderView;
                    case 1:
                        return Boolean.valueOf(!playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 2:
                        Bundle requireArguments = playerEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                        if (M != null) {
                            return (Player) M;
                        }
                        a70.p("Serializable PLAYER not found");
                        return null;
                    case 3:
                        Context requireContext2 = playerEventsFragment.requireContext();
                        requireContext2.getClass();
                        ComposeView composeView = new ComposeView(requireContext2, null, 6);
                        composeView.setContent(new tc3(-1896246317, new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i32;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                        return composeView;
                    case 4:
                        final PlayerEventsFragment playerEventsFragment2 = this.b;
                        FragmentActivity requireActivity = playerEventsFragment2.requireActivity();
                        requireActivity.getClass();
                        tug tugVar = playerEventsFragment2.w;
                        String sportSlug = playerEventsFragment2.F().getSportSlug();
                        if (sportSlug == null) {
                            sportSlug = "";
                        }
                        return new sse(requireActivity, playerEventsFragment2, tugVar, wv8.o(SearchResponseKt.SPORT_ENTITY, sportSlug), !playerEventsFragment2.G().equals(Sports.BASEBALL), new gt8() { // from class: nqe
                            @Override // defpackage.gt8
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                                String str;
                                Sport sport;
                                Integer num = (Integer) obj;
                                num.getClass();
                                Team team = (Team) obj2;
                                String str2 = (String) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                Double d = (Double) obj5;
                                Boolean bool = (Boolean) obj6;
                                team.getClass();
                                str2.getClass();
                                PlayerEventsFragment playerEventsFragment3 = PlayerEventsFragment.this;
                                Team team2 = playerEventsFragment3.F().getTeam();
                                if (team2 == null || (sport = team2.getSport()) == null || (str = sport.getSlug()) == null) {
                                    str = "";
                                }
                                String str3 = str;
                                FragmentActivity requireActivity2 = playerEventsFragment3.requireActivity();
                                requireActivity2.getClass();
                                ArrayList e = b.e(new xoe(playerEventsFragment3.F(), null, d, playerEventsFragment3.F().getPosition(), team, intValue, null));
                                int id = playerEventsFragment3.F().getId();
                                PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                                ArrayList arrayList = new ArrayList();
                                Iterator it = e.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (!((xoe) next).a.getDisabled()) {
                                        arrayList.add(next);
                                    }
                                }
                                playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(num, -1, arrayList, str3, false, false, id, str2, 0, bool, 0L, null, null)), fz8.H("ANALYTICS_LOCATION", null)));
                                AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                                if (appCompatActivity != null) {
                                    me4.n(playerEventStatisticsModal, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                                }
                                return Unit.a;
                            }
                        });
                    case 5:
                        return new u6e(playerEventsFragment.C(), false, new bba(playerEventsFragment, 26));
                    case 6:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 7:
                        LayoutInflater layoutInflater = playerEventsFragment.getLayoutInflater();
                        krk krkVar = playerEventsFragment.l;
                        krkVar.getClass();
                        dt5 a2 = dt5.a(layoutInflater.inflate(R.layout.event_baseball_table_header, (ViewGroup) ((xq8) krkVar).c, false));
                        a2.c.setOnClickListener(new cne(playerEventsFragment, 4));
                        return a2;
                    case 8:
                        return Boolean.valueOf(playerEventsFragment.G().equals(Sports.BASEBALL));
                    case 9:
                        Context requireContext3 = playerEventsFragment.requireContext();
                        requireContext3.getClass();
                        SegmentedButtonsView segmentedButtonsView = new SegmentedButtonsView(requireContext3, null, 6);
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        jie jieVar = new jie(11);
                        segmentedButtonsView.k = new Function2() { // from class: mqe
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i52 = i42;
                                PlayerEventsFragment playerEventsFragment22 = playerEventsFragment;
                                switch (i52) {
                                    case 0:
                                        of3 of3Var = (of3) obj;
                                        int intValue = ((Integer) obj2).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            av8Var.d0(-1226574792);
                                            List<gqe> E = playerEventsFragment22.E();
                                            ArrayList arrayList = new ArrayList(k13.r(E, 10));
                                            for (gqe gqeVar : E) {
                                                arrayList.add(new oxh(gqeVar, gqeVar.b, yqo.H(704408310, av8Var, new bba(gqeVar, 27)), null, null, false, 248));
                                            }
                                            av8Var.s(false);
                                            gv9 W = l6g.W(arrayList);
                                            xtc q = n9e.q(utc.a, lz.D(R.color.surface_1, av8Var), oyn.e);
                                            u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                                            int hashCode = Long.hashCode(av8Var.T);
                                            aee m = av8Var.m();
                                            xtc C = fqj.C(av8Var, q);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var.h0();
                                            if (av8Var.S) {
                                                av8Var.l(zg3Var);
                                            } else {
                                                av8Var.q0();
                                            }
                                            waa.K(av8Var, a22, hf3.g);
                                            waa.K(av8Var, m, hf3.f);
                                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var, hf3.k);
                                            waa.K(av8Var, C, hf3.d);
                                            Iterator<E> it = W.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    Object next = it.next();
                                                    if (Intrinsics.c(((oxh) next).a, (gqe) ((eoh) playerEventsFragment22.A).getValue())) {
                                                        r2 = next;
                                                    }
                                                }
                                            }
                                            oxh oxhVar = (oxh) r2;
                                            boolean i62 = av8Var.i(playerEventsFragment22);
                                            Object O = av8Var.O();
                                            if (i62 || O == nf3.a) {
                                                O = new kqe(playerEventsFragment22, 2);
                                                av8Var.n0(O);
                                            }
                                            r4a.j(W, oxhVar, (Function1) O, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 12582912, 888);
                                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, 0L, lz.D(R.color.n_lv_4, av8Var), av8Var, null);
                                            av8Var.s(true);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                    default:
                                        String str = (String) obj;
                                        ((Integer) obj2).getClass();
                                        str.getClass();
                                        playerEventsFragment22.v = new wse(w91.valueOf(str));
                                        dt5 D = playerEventsFragment22.D();
                                        if (D != null) {
                                            v8a v8aVar = playerEventsFragment22.v;
                                            r2 = v8aVar instanceof wse ? (wse) v8aVar : null;
                                            if (r2 != null) {
                                                i9a.r(dt5.a(D.a), playerEventsFragment22.w, r2.i);
                                            }
                                        }
                                        playerEventsFragment22.C().Y(playerEventsFragment22.v);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = jieVar;
                        rlh rlhVar = rlh.b;
                        if (!rlhVar.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                        }
                        return segmentedButtonsView;
                    default:
                        Set set = wyh.a;
                        return Boolean.valueOf(CollectionsKt.R(wyh.k, playerEventsFragment.G()));
                }
            }
        });
    }

    public final sse C() {
        return (sse) this.x.getValue();
    }

    public final dt5 D() {
        return (dt5) this.E.getValue();
    }

    public final List E() {
        return (List) ((eoh) this.z).getValue();
    }

    public final Player F() {
        return (Player) this.r.getValue();
    }

    public final String G() {
        String sportSlug = F().getSportSlug();
        return sportSlug == null ? "" : sportSlug;
    }

    public final boolean H() {
        boolean z;
        List E;
        e1d e1dVar = this.A;
        gqe gqeVar = (gqe) ((eoh) e1dVar).getValue();
        if (!Intrinsics.c(gqeVar != null ? Boolean.valueOf(gqeVar.c) : null, Boolean.TRUE)) {
            gqe gqeVar2 = (gqe) ((eoh) e1dVar).getValue();
            if ((gqeVar2 != null ? gqeVar2.a : null) == null && ((E = E()) == null || !E.isEmpty())) {
                Iterator it = E.iterator();
                while (it.hasNext()) {
                    if (Boolean.valueOf(((gqe) it.next()).c).equals(Boolean.TRUE)) {
                    }
                }
            }
            z = false;
            yea yeaVar = j58.a;
            return !j58.k() && z;
        }
        z = true;
        yea yeaVar2 = j58.a;
        if (j58.k()) {
        }
    }

    public final void I(Boolean bool) {
        w91 w91Var;
        if (!this.C || !this.B) {
            if (this.u) {
                this.v = new wse(Intrinsics.c(bool, Boolean.TRUE) ? w91.e : w91.d);
                dt5 D = D();
                if (D != null) {
                    v8a v8aVar = this.v;
                    wse wseVar = v8aVar instanceof wse ? (wse) v8aVar : null;
                    if (wseVar != null) {
                        C().Y(wseVar);
                        i9a.r(dt5.a(D.a), this.w, wseVar.i);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        joa joaVar = this.F;
        View view = (SegmentedButtonsView) joaVar.getValue();
        if (view != null) {
            if (view.getParent() != null) {
                view = null;
            }
            if (view != null) {
                krk krkVar = this.l;
                krkVar.getClass();
                AppBarLayout appBarLayout = ((xq8) krkVar).b;
                krk krkVar2 = this.l;
                krkVar2.getClass();
                int childCount = ((xq8) krkVar2).b.getChildCount() - 1;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ta0 ta0Var = layoutParams != null ? new ta0(layoutParams) : new ta0(-2);
                ta0Var.a = 0;
                Unit unit = Unit.a;
                appBarLayout.addView(view, childCount, ta0Var);
            }
        }
        v8a v8aVar2 = this.v;
        wse wseVar2 = v8aVar2 instanceof wse ? (wse) v8aVar2 : null;
        if (wseVar2 == null || (w91Var = wseVar2.i) == null) {
            w91Var = this.u ? Intrinsics.c(bool, Boolean.TRUE) ? w91.e : w91.d : null;
        }
        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) joaVar.getValue();
        if (segmentedButtonsView != null) {
            kp5<w91> kp5Var = w91.g;
            ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
            for (w91 w91Var2 : kp5Var) {
                String name = w91Var2.name();
                q9k q9kVar = w91Var2.a;
                Context requireContext = requireContext();
                requireContext.getClass();
                arrayList.add(new s1h(name, q9kVar.b(requireContext), true));
            }
            segmentedButtonsView.s(arrayList, w91Var != null ? w91Var.name() : null, this.u);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return xq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MatchesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        vse vseVar;
        SharedPreferences d;
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((xq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 4);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        this.s = (Integer) gz8.M(requireArguments, "TOURNAMENT_UNIQUE_ID", Integer.class);
        ((qqe) this.t.getValue()).d.e(getViewLifecycleOwner(), new eqb(12, new kqe(this, 0)));
        if (G().equals(Sports.BASEBALL)) {
            vseVar = new vse(G().equals(Sports.BASKETBALL) ? H() ? is1.e : is1.f : oxk.e);
        } else {
            String G = G();
            Context requireContext = requireContext();
            requireContext.getClass();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = requireContext.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            vseVar = new vse(k03.l(G, sharedPreferences.getString("PREF_STATISTICS_HEADER_VIEW_SELECTION_TYPE_".concat(G()), null)));
        }
        this.v = vseVar;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((xq8) krkVar2).c;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        z8e.b0(recyclerView, requireContext2, false, false, null, 30);
        recyclerView.setAdapter(C());
        recyclerView.addOnScrollListener((u6e) this.D.getValue());
        ComposeView composeView = (ComposeView) this.H.getValue();
        if (composeView != null) {
            krk krkVar3 = this.l;
            krkVar3.getClass();
            z8e.r(((xq8) krkVar3).b, composeView, false);
        }
        TypeHeaderView typeHeaderView = (TypeHeaderView) this.G.getValue();
        if (typeHeaderView != null) {
            krk krkVar4 = this.l;
            krkVar4.getClass();
            z8e.r(((xq8) krkVar4).b, typeHeaderView, false);
        }
        dt5 D = D();
        if (D != null) {
            krk krkVar5 = this.l;
            krkVar5.getClass();
            AppBarLayout appBarLayout = ((xq8) krkVar5).b;
            ConstraintLayout constraintLayout = D.a;
            constraintLayout.getClass();
            z8e.r(appBarLayout, constraintLayout, false);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        qqe qqeVar = (qqe) this.t.getValue();
        int id = F().getId();
        gqe gqeVar = (gqe) ((eoh) this.A).getValue();
        xw3.L(un0.z(qqeVar), null, null, new qoe(gqeVar != null ? gqeVar.a : null, qqeVar, id, null, 1), 3);
    }
}
