package com.sofascore.results.featuredtournament;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.cuptree.CupTreesResponse;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.mvvm.model.UniqueTournamentDetails;
import com.sofascore.model.newNetwork.PlayerOfTheSeasonResponse;
import com.sofascore.model.newNetwork.TeamOfTheWeekResponse;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.RatedTopPlayersStatistics;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentCalendarRailView;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentHeaderView;
import com.sofascore.results.featuredtournament.view.PromotionalOffersBannerView;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.CupTreeView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a52;
import defpackage.ad2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.d17;
import defpackage.duf;
import defpackage.e6b;
import defpackage.ev7;
import defpackage.fuf;
import defpackage.gl7;
import defpackage.gv7;
import defpackage.hkg;
import defpackage.hv7;
import defpackage.jo8;
import defpackage.joa;
import defpackage.jv7;
import defpackage.krk;
import defpackage.l27;
import defpackage.n9e;
import defpackage.nq8;
import defpackage.nv7;
import defpackage.otk;
import defpackage.pv7;
import defpackage.qv5;
import defpackage.rbi;
import defpackage.rq3;
import defpackage.s16;
import defpackage.t42;
import defpackage.tv7;
import defpackage.u6b;
import defpackage.un0;
import defpackage.w42;
import defpackage.wca;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.yp7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yu7;
import defpackage.z07;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zi7;
import defpackage.zu7;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/featuredtournament/FeaturedTournamentFragment;", "Lcom/sofascore/results/main/AbstractFadingFragment;", "Ljo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeaturedTournamentFragment extends Hilt_FeaturedTournamentFragment<jo8> {
    public final joa A;
    public final joa B;
    public final joa C;
    public final joa D;
    public final joa E;
    public final joa F;
    public boolean G;
    public boolean H;
    public final otk t;
    public final otk u;
    public final joa v;
    public final joa w;
    public final joa x;
    public final joa y;
    public final joa z;

    public FeaturedTournamentFragment() {
        fuf fufVar = duf.a;
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        this.t = new otk(fufVar.getOrCreateKotlinClass(nv7.class), new gv7(this, i), new gv7(this, i3), new gv7(this, i2));
        int i4 = 3;
        gv7 gv7Var = new gv7(this, i4);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(gv7Var, 0));
        this.u = new otk(fufVar.getOrCreateKotlinClass(rbi.class), new l27(a, 27), new z07(17, this, a), new l27(a, 28));
        this.v = ypa.a(ysaVar, new zu7(this, i));
        this.w = ypa.a(ysaVar, new zu7(this, 9));
        this.x = ypa.a(ysaVar, new zu7(this, 10));
        this.y = ypa.a(ysaVar, new zu7(this, 11));
        this.z = ypa.a(ysaVar, new zu7(this, 12));
        this.A = ypa.a(ysaVar, new zu7(this, 13));
        this.B = ypa.a(ysaVar, new zu7(this, 14));
        this.C = n9e.M(new zu7(this, i2), new zu7(this, i3));
        this.D = ypa.a(ysaVar, new zu7(this, i4));
        this.E = ypa.a(ysaVar, new zu7(this, 4));
        this.F = n9e.M(new zu7(this, 7), new zu7(this, 8));
        this.G = true;
        this.H = true;
    }

    public final yu7 D() {
        return (yu7) this.v.getValue();
    }

    public final CupTreeView E() {
        return (CupTreeView) this.E.getValue();
    }

    public final tv7 F() {
        return (tv7) this.D.getValue();
    }

    public final nv7 G() {
        return (nv7) this.t.getValue();
    }

    public final void H() {
        FragmentActivity activity = getActivity();
        MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
        if (mainActivity != null) {
            jv7 jv7Var = (jv7) G().k.d();
            mainActivity.d0(jv7Var != null ? jv7Var.a : null);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_featured_tournament, (ViewGroup) null, false);
        int i = R.id.app_bar_layout;
        if (((AppBarLayout) nq8.B(R.id.app_bar_layout, inflate)) != null) {
            i = R.id.calendar_rail;
            FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = (FeaturedTournamentCalendarRailView) nq8.B(R.id.calendar_rail, inflate);
            if (featuredTournamentCalendarRailView != null) {
                i = R.id.empty_state;
                GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, inflate);
                if (graphicLarge != null) {
                    i = R.id.header;
                    FeaturedTournamentHeaderView featuredTournamentHeaderView = (FeaturedTournamentHeaderView) nq8.B(R.id.header, inflate);
                    if (featuredTournamentHeaderView != null) {
                        i = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
                        if (recyclerView != null) {
                            i = R.id.refresh_layout;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nq8.B(R.id.refresh_layout, inflate);
                            if (swipeRefreshLayout != null) {
                                return new jo8((CoordinatorLayout) inflate, featuredTournamentCalendarRailView, graphicLarge, featuredTournamentHeaderView, recyclerView, swipeRefreshLayout);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        krk krkVar = this.l;
        krkVar.getClass();
        pv7 pv7Var = ((jo8) krkVar).d.b;
        if (pv7Var != null) {
            pv7Var.cancel();
        }
        super.onDestroyView();
    }

    @Override // com.sofascore.results.main.AbstractFadingFragment, com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        nv7 G = G();
        if (G.l.d() == null) {
            xw3.L(un0.z(G), null, null, new yp7(G, (rq3) null, 4), 3);
        }
        H();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FeaturedTournamentTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        rq3 rq3Var = null;
        final int i = 6;
        AbstractFragment.v(this, ((jo8) krkVar).f, null, null, 6);
        G().i.getClass();
        this.i.a = 270;
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(a52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        final int i2 = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        final int i3 = 3;
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new ev7(viewLifecycleOwner, (b1d) obj, this, null, this, 0), 3);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((jo8) krkVar2).b.setDateClickCallback(new Function1(this) { // from class: av7
            public final /* synthetic */ FeaturedTournamentFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:130:0x0272, code lost:
            
                if (r2 == null) goto L106;
             */
            /* JADX WARN: Removed duplicated region for block: B:323:0x07fd  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.CoroutineContext, nu3, rq3] */
            /* JADX WARN: Type inference failed for: r5v5 */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj2) {
                List list;
                LinkedHashMap linkedHashMap2;
                Map.Entry entry;
                int intValue;
                Object next;
                Function1 function1;
                joa joaVar;
                ?? r5;
                Boolean bool;
                Category category;
                Category category2;
                Sport sport;
                boolean z;
                Object next2;
                String str;
                LocalDate localDate;
                String str2;
                String groupName;
                wai waiVar;
                ArrayList arrayList;
                x9i x9iVar;
                int i4 = i2;
                FeaturedTournamentFragment featuredTournamentFragment = this.b;
                int i5 = 1;
                switch (i4) {
                    case 0:
                        ZonedDateTime zonedDateTime = (ZonedDateTime) obj2;
                        zonedDateTime.getClass();
                        featuredTournamentFragment.G = true;
                        featuredTournamentFragment.G().k(zonedDateTime);
                        featuredTournamentFragment.F().setVisibility(zonedDateTime.toLocalDate().compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.d) <= 0 ? 0 : 8);
                        break;
                    case 1:
                        List list2 = (List) obj2;
                        krk krkVar3 = featuredTournamentFragment.l;
                        krkVar3.getClass();
                        FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = ((jo8) krkVar3).b;
                        mg2 mg2Var = featuredTournamentCalendarRailView.a;
                        if (list2 != null && !list2.isEmpty() && ((list = featuredTournamentCalendarRailView.d) == null || !(!list.isEmpty()))) {
                            featuredTournamentCalendarRailView.d = list2;
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(LocalDate.parse((String) it.next(), DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.systemDefault()));
                            }
                            mg2Var.F(arrayList2);
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.getClass();
                            bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                            long timeInMillis = calendar2.getTimeInMillis() / 1000;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            String i6 = fc6.i(timeInMillis, hk4.a(bi4Var.d()));
                            List list3 = featuredTournamentCalendarRailView.d;
                            if (list3 == null || !list3.contains(i6)) {
                                List list4 = featuredTournamentCalendarRailView.d;
                                if (list4 != null) {
                                    int c = sub.c(k13.r(list4, 10));
                                    if (c < 16) {
                                        c = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(c);
                                    for (Object obj3 : list4) {
                                        Date parse = featuredTournamentCalendarRailView.c.parse((String) obj3);
                                        if (parse == null) {
                                            parse = new Date();
                                        }
                                        linkedHashMap2.put(obj3, parse);
                                    }
                                } else {
                                    linkedHashMap2 = null;
                                }
                                if (linkedHashMap2 != null) {
                                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            long abs = Math.abs(((Date) ((Map.Entry) next).getValue()).getTime() - calendar.getTimeInMillis());
                                            do {
                                                Object next3 = it2.next();
                                                long abs2 = Math.abs(((Date) ((Map.Entry) next3).getValue()).getTime() - calendar.getTimeInMillis());
                                                if (abs > abs2) {
                                                    next = next3;
                                                    abs = abs2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    entry = (Map.Entry) next;
                                } else {
                                    entry = null;
                                }
                                List list5 = featuredTournamentCalendarRailView.d;
                                if (list5 != null) {
                                    Iterator it3 = list5.iterator();
                                    int i7 = 0;
                                    while (true) {
                                        if (it3.hasNext()) {
                                            String str3 = (String) it3.next();
                                            int i8 = FeaturedTournamentCalendarRailView.f;
                                            str3.getClass();
                                            if (!Intrinsics.c(str3, entry != null ? (String) entry.getKey() : null)) {
                                                i7++;
                                            }
                                        } else {
                                            i7 = -1;
                                        }
                                    }
                                    Integer valueOf = i7 == -1 ? null : Integer.valueOf(i7);
                                    if (valueOf != null) {
                                        intValue = valueOf.intValue();
                                        int i9 = mg2Var.m;
                                        mg2Var.m = intValue;
                                        mg2Var.notifyItemChanged(intValue);
                                        mg2Var.notifyItemChanged(i9);
                                        function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                        if (function1 != null) {
                                            Object obj4 = arrayList2.get(intValue);
                                            obj4.getClass();
                                            function1.invoke(obj4);
                                        }
                                        featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                        featuredTournamentCalendarRailView.requestLayout();
                                    }
                                }
                                intValue = 0;
                                int i92 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i92);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            } else {
                                List list6 = featuredTournamentCalendarRailView.d;
                                if (list6 != null) {
                                    intValue = list6.indexOf(i6);
                                    int i922 = mg2Var.m;
                                    mg2Var.m = intValue;
                                    mg2Var.notifyItemChanged(intValue);
                                    mg2Var.notifyItemChanged(i922);
                                    function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                    if (function1 != null) {
                                    }
                                    featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                    featuredTournamentCalendarRailView.requestLayout();
                                }
                                intValue = 0;
                                int i9222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i9222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            }
                        }
                        break;
                    case 2:
                        joa joaVar2 = featuredTournamentFragment.A;
                        jv7 jv7Var = (jv7) obj2;
                        featuredTournamentFragment.n();
                        UniqueTournamentDetails uniqueTournamentDetails = jv7Var.a;
                        List list7 = jv7Var.e;
                        List list8 = jv7Var.b;
                        CupTreesResponse cupTreesResponse = jv7Var.f;
                        boolean z2 = uniqueTournamentDetails == null && list8 == null && cupTreesResponse == null;
                        krk krkVar4 = featuredTournamentFragment.l;
                        krkVar4.getClass();
                        ((jo8) krkVar4).c.setVisibility(z2 ? 0 : 8);
                        krk krkVar5 = featuredTournamentFragment.l;
                        krkVar5.getClass();
                        ((jo8) krkVar5).e.setVisibility(!z2 ? 0 : 8);
                        featuredTournamentFragment.E().setVisibility(cupTreesResponse != null ? 0 : 8);
                        if (!z2) {
                            FragmentActivity activity = featuredTournamentFragment.getActivity();
                            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                            if (mainActivity != null) {
                                mainActivity.d0(uniqueTournamentDetails);
                            }
                        }
                        qv7 qv7Var = featuredTournamentFragment.G().i;
                        if (uniqueTournamentDetails != null) {
                            krk krkVar6 = featuredTournamentFragment.l;
                            krkVar6.getClass();
                            FeaturedTournamentHeaderView featuredTournamentHeaderView = ((jo8) krkVar6).d;
                            e92 e92Var = featuredTournamentHeaderView.a;
                            ((TextView) e92Var.b).setText(tba.y(uniqueTournamentDetails));
                            ((TextView) e92Var.b).setTextColor(featuredTournamentHeaderView.getContext().getColor(R.color.on_color_primary));
                            aba.y((ImageView) e92Var.c, 0, 3);
                            ((FeaturedTournamentHeaderView) e92Var.e).setOnClickListener(new au7(i5, featuredTournamentHeaderView, uniqueTournamentDetails));
                            long intValue2 = ((uniqueTournamentDetails.getStartDateTimestamp() != null ? r2.intValue() : 0L) * 1000) - Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis();
                            if (intValue2 > 0) {
                                Integer startDateTimestamp = uniqueTournamentDetails.getStartDateTimestamp();
                                Integer endDateTimestamp = uniqueTournamentDetails.getEndDateTimestamp();
                                e92 e92Var2 = featuredTournamentHeaderView.c;
                                if (e92Var2 == null) {
                                    View inflate = ((ViewStub) e92Var.d).inflate();
                                    int i10 = R.id.days;
                                    View B = nq8.B(R.id.days, inflate);
                                    if (B != null) {
                                        t22 b = t22.b(B);
                                        i10 = R.id.hours;
                                        View B2 = nq8.B(R.id.hours, inflate);
                                        if (B2 != null) {
                                            t22 b2 = t22.b(B2);
                                            i10 = R.id.minutes;
                                            View B3 = nq8.B(R.id.minutes, inflate);
                                            if (B3 != null) {
                                                t22 b3 = t22.b(B3);
                                                i10 = R.id.seconds;
                                                View B4 = nq8.B(R.id.seconds, inflate);
                                                if (B4 != null) {
                                                    e92Var2 = new e92((LinearLayout) inflate, b, b2, b3, t22.b(B4), 25);
                                                    featuredTournamentHeaderView.c = e92Var2;
                                                }
                                            }
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                                    break;
                                }
                                ((t22) e92Var2.d).c.setText(R.string.days);
                                TextView textView = ((t22) e92Var2.b).c;
                                String string = featuredTournamentHeaderView.getContext().getString(R.string.hours);
                                string.getClass();
                                if (string.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    joaVar = joaVar2;
                                    char charAt = string.charAt(0);
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    sb.append((Object) CharsKt.c(charAt, locale));
                                    sb.append(string.substring(1));
                                    string = sb.toString();
                                } else {
                                    joaVar = joaVar2;
                                }
                                textView.setText(string);
                                ((t22) e92Var2.f).c.setText(R.string.minutes);
                                ((t22) e92Var2.c).c.setText(R.string.seconds);
                                pv7 pv7Var = featuredTournamentHeaderView.b;
                                if (pv7Var != null) {
                                    pv7Var.cancel();
                                }
                                pv7 pv7Var2 = new pv7(intValue2, e92Var2, featuredTournamentHeaderView, startDateTimestamp, endDateTimestamp);
                                featuredTournamentHeaderView.b = pv7Var2;
                                pv7Var2.start();
                            } else {
                                joaVar = joaVar2;
                                featuredTournamentHeaderView.f(uniqueTournamentDetails.getStartDateTimestamp(), uniqueTournamentDetails.getEndDateTimestamp());
                            }
                        } else {
                            joaVar = joaVar2;
                        }
                        tv7 F = featuredTournamentFragment.F();
                        bv7 bv7Var = new bv7(featuredTournamentFragment, qv7Var, 0);
                        F.getClass();
                        if (F.k || list8 == null || list8.isEmpty()) {
                            r5 = 0;
                        } else {
                            F.j = list8;
                            F.i = bv7Var;
                            F.k = true;
                            ArrayList arrayList3 = new ArrayList(k13.r(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((UniqueTournamentGroup) it4.next()).getGroupName());
                            }
                            r5 = 0;
                            TypeHeaderView.z((TypeHeaderView) ((e92) F.d.g).b, CollectionsKt.S0(CollectionsKt.V0(arrayList3)), null, 2);
                        }
                        xw3.L(wca.x(featuredTournamentFragment.getLifecycle()), r5, r5, new yp7(featuredTournamentFragment, cupTreesResponse, (rq3) r5, 1), 3);
                        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = jv7Var.c;
                        if (playerOfTheSeasonResponse != null) {
                            nue nueVar = (nue) featuredTournamentFragment.y.getValue();
                            qv7Var.getClass();
                            nueVar.l(270, 71636, playerOfTheSeasonResponse, Sports.FOOTBALL, new zu7(featuredTournamentFragment, 5), Integer.valueOf(R.color.color_afcon));
                        }
                        TopPerformanceResponse topPerformanceResponse = jv7Var.d;
                        if (topPerformanceResponse != null) {
                            Object topPerformanceItems = topPerformanceResponse.getTopPerformanceItems();
                            RatedTopPlayersStatistics ratedTopPlayersStatistics = topPerformanceItems instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) topPerformanceItems : r5;
                            if (ratedTopPlayersStatistics != null) {
                                cue cueVar = (cue) featuredTournamentFragment.z.getValue();
                                List<TopPlayersStatisticsItem<? extends BaseTopPlayersStatisticsItem>> rating = ratedTopPlayersStatistics.getRating();
                                Object ineligibleTopPlayers = topPerformanceResponse.getIneligibleTopPlayers();
                                RatedTopPlayersStatistics ratedTopPlayersStatistics2 = ineligibleTopPlayers instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) ineligibleTopPlayers : r5;
                                cueVar.j(rating, ratedTopPlayersStatistics2 != null ? ratedTopPlayersStatistics2.getRating() : r5, true, new zu7(featuredTournamentFragment, 6), new n37(26, featuredTournamentFragment, qv7Var), new go7(15));
                            }
                        }
                        if (list7 != null) {
                            if (!list7.isEmpty()) {
                                Iterator it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    if (((TournamentRoundWrapper) it5.next()).getHasTotw()) {
                                        z = true;
                                        bool = Boolean.valueOf(z);
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        } else {
                            bool = r5;
                        }
                        if (Intrinsics.c(bool, Boolean.TRUE)) {
                            ((dyi) joaVar.getValue()).setVisibility(0);
                            ((dyi) joaVar.getValue()).setOnItemSelectedCallback(new bv7(featuredTournamentFragment, qv7Var, 1));
                            dyi dyiVar = (dyi) joaVar.getValue();
                            Integer valueOf2 = uniqueTournamentDetails != null ? Integer.valueOf(uniqueTournamentDetails.getId()) : r5;
                            String slug = (uniqueTournamentDetails == null || (category2 = uniqueTournamentDetails.getCategory()) == null || (sport = category2.getSport()) == null) ? r5 : sport.getSlug();
                            if (list7 == null) {
                                list7 = km5.a;
                            }
                            List list9 = list7;
                            qv7Var.getClass();
                            String slug2 = (uniqueTournamentDetails == null || (category = uniqueTournamentDetails.getCategory()) == null) ? r5 : category.getSlug();
                            String str4 = slug2 == null ? "" : slug2;
                            String slug3 = uniqueTournamentDetails != null ? uniqueTournamentDetails.getSlug() : r5;
                            dyiVar.l(valueOf2, slug, list9, null, 71636, false, str4, slug3 == null ? "" : slug3);
                        }
                        break;
                    case 3:
                        List list10 = (List) obj2;
                        yu7 D = featuredTournamentFragment.D();
                        list10.getClass();
                        D.F(list10);
                        krk krkVar7 = featuredTournamentFragment.l;
                        krkVar7.getClass();
                        ((jo8) krkVar7).e.scrollToPosition(0);
                        if (featuredTournamentFragment.H) {
                            featuredTournamentFragment.H = false;
                            r2.p(featuredTournamentFragment.D().g.size(), (AdBannerView) featuredTournamentFragment.w.getValue());
                            g7.o(featuredTournamentFragment.D(), (FrameLayout) featuredTournamentFragment.B.getValue(), 2);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.F(), 6);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.E(), 6);
                            g7.o(featuredTournamentFragment.D(), (nue) featuredTournamentFragment.y.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (cue) featuredTournamentFragment.z.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (AdBannerView) featuredTournamentFragment.x.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (dyi) featuredTournamentFragment.A.getValue(), 6);
                            PromotionalOffersBannerView promotionalOffersBannerView = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                            if (promotionalOffersBannerView != null) {
                                g7.o(featuredTournamentFragment.D(), promotionalOffersBannerView, 6);
                            }
                            GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) featuredTournamentFragment.F.getValue();
                            if (gambleRegulationFooterView != null) {
                                g7.o(featuredTournamentFragment.D(), gambleRegulationFooterView, 6);
                            }
                        }
                        if (featuredTournamentFragment.D().h.contains(featuredTournamentFragment.F()) && featuredTournamentFragment.G && featuredTournamentFragment.F().k) {
                            jo8 jo8Var = (jo8) featuredTournamentFragment.l;
                            ZonedDateTime currentDate = jo8Var != null ? jo8Var.b.getCurrentDate() : null;
                            if (currentDate != null && (localDate = currentDate.toLocalDate()) != null && localDate.compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.c) >= 0) {
                                UniqueTournamentGroup uniqueTournamentGroup = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                if (uniqueTournamentGroup == null || (groupName = uniqueTournamentGroup.getGroupName()) == null) {
                                    str2 = null;
                                } else {
                                    str2 = groupName.toLowerCase(Locale.ROOT);
                                    str2.getClass();
                                }
                                if (Intrinsics.c(str2, "third-placed teams")) {
                                    UniqueTournamentGroup uniqueTournamentGroup2 = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                    if (uniqueTournamentGroup2 != null) {
                                        str = uniqueTournamentGroup2.getGroupName();
                                        featuredTournamentFragment.G = false;
                                        if (str != null) {
                                            tv7 F2 = featuredTournamentFragment.F();
                                            F2.getClass();
                                            ((TypeHeaderView) ((e92) F2.d.g).b).t(str, true);
                                        }
                                    }
                                    str = null;
                                    featuredTournamentFragment.G = false;
                                    if (str != null) {
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list10) {
                                if (ok3.D(((iv7) obj5).a)) {
                                    arrayList4.add(obj5);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                arrayList4 = null;
                            }
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                for (Object obj6 : list10) {
                                    iv7 iv7Var = (iv7) obj6;
                                    if (ok3.E(iv7Var.a) && Intrinsics.c(iv7Var.a.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    arrayList4 = null;
                                    break;
                                }
                            }
                            list10 = arrayList4;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj7 : list10) {
                                String groupName2 = ((iv7) obj7).a.getTournament().getGroupName();
                                Object obj8 = linkedHashMap3.get(groupName2);
                                if (obj8 == null) {
                                    obj8 = wv8.n(linkedHashMap3, groupName2);
                                }
                                ((List) obj8).add(obj7);
                            }
                            Iterator it6 = linkedHashMap3.entrySet().iterator();
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                if (it6.hasNext()) {
                                    int size = ((List) ((Map.Entry) next2).getValue()).size();
                                    do {
                                        Object next4 = it6.next();
                                        int size2 = ((List) ((Map.Entry) next4).getValue()).size();
                                        if (size < size2) {
                                            next2 = next4;
                                            size = size2;
                                        }
                                    } while (it6.hasNext());
                                }
                            } else {
                                next2 = null;
                            }
                            Map.Entry entry2 = (Map.Entry) next2;
                            if (entry2 != null) {
                                str = (String) entry2.getKey();
                                featuredTournamentFragment.G = false;
                                if (str != null) {
                                }
                            }
                            str = null;
                            featuredTournamentFragment.G = false;
                            if (str != null) {
                            }
                        }
                        break;
                    case 4:
                        dyi dyiVar2 = (dyi) featuredTournamentFragment.A.getValue();
                        dyiVar2.l = true;
                        dyiVar2.q = (TeamOfTheWeekResponse) obj2;
                        dyiVar2.o();
                        break;
                    case 5:
                        List list11 = (List) obj2;
                        if (list11 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj9 : list11) {
                                if (obj9 instanceof wai) {
                                    arrayList5.add(obj9);
                                }
                            }
                            waiVar = (wai) CollectionsKt.Y(arrayList5);
                        } else {
                            waiVar = null;
                        }
                        if (list11 != null) {
                            arrayList = new ArrayList();
                            for (Object obj10 : list11) {
                                if (obj10 instanceof bbi) {
                                    arrayList.add(obj10);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (list11 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj11 : list11) {
                                if (obj11 instanceof x9i) {
                                    arrayList6.add(obj11);
                                }
                            }
                            x9iVar = (x9i) CollectionsKt.firstOrNull(arrayList6);
                        } else {
                            x9iVar = null;
                        }
                        if (x9iVar != null) {
                            x9iVar.i = false;
                        }
                        if (waiVar != null && arrayList != null) {
                            tv7 F3 = featuredTournamentFragment.F();
                            F3.getClass();
                            F3.f = waiVar;
                            F3.g = arrayList;
                            F3.h = x9iVar;
                            F3.j();
                        }
                        break;
                    default:
                        List list12 = (List) obj2;
                        PromotionalOffersBannerView promotionalOffersBannerView2 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                        if (promotionalOffersBannerView2 != null) {
                            list12.getClass();
                            featuredTournamentFragment.G().i.getClass();
                            PromotionalOffersBannerView.j(promotionalOffersBannerView2, list12, new tdf(0, 270), fv.FEATURED_TOURNAMENT);
                        }
                        break;
                }
                return Unit.a;
            }
        });
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((jo8) krkVar3).c.setVisibility(8);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView = ((jo8) krkVar4).e;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        hkg.t(16, ((jo8) krkVar5).e);
        krk krkVar6 = this.l;
        krkVar6.getClass();
        ((jo8) krkVar6).e.setAdapter(D());
        yu7 D = D();
        s16 s16Var = new s16(this, 23);
        D.getClass();
        D.a.d = s16Var;
        xw3.L(wca.x(getLifecycle()), null, null, new d17(this, rq3Var, 17), 3);
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(w42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new zi7(viewLifecycleOwner2, (b1d) obj2, (rq3) null, this), 3);
        PromotionalOffersBannerView promotionalOffersBannerView = (PromotionalOffersBannerView) this.C.getValue();
        if (promotionalOffersBannerView != null) {
            promotionalOffersBannerView.setListener(new gl7(8));
        }
        final int i4 = 1;
        G().m.e(getViewLifecycleOwner(), new z1(14, new Function1(this) { // from class: av7
            public final /* synthetic */ FeaturedTournamentFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:130:0x0272, code lost:
            
                if (r2 == null) goto L106;
             */
            /* JADX WARN: Removed duplicated region for block: B:323:0x07fd  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.CoroutineContext, nu3, rq3] */
            /* JADX WARN: Type inference failed for: r5v5 */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj22) {
                List list;
                LinkedHashMap linkedHashMap2;
                Map.Entry entry;
                int intValue;
                Object next;
                Function1 function1;
                joa joaVar;
                ?? r5;
                Boolean bool;
                Category category;
                Category category2;
                Sport sport;
                boolean z;
                Object next2;
                String str;
                LocalDate localDate;
                String str2;
                String groupName;
                wai waiVar;
                ArrayList arrayList;
                x9i x9iVar;
                int i42 = i4;
                FeaturedTournamentFragment featuredTournamentFragment = this.b;
                int i5 = 1;
                switch (i42) {
                    case 0:
                        ZonedDateTime zonedDateTime = (ZonedDateTime) obj22;
                        zonedDateTime.getClass();
                        featuredTournamentFragment.G = true;
                        featuredTournamentFragment.G().k(zonedDateTime);
                        featuredTournamentFragment.F().setVisibility(zonedDateTime.toLocalDate().compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.d) <= 0 ? 0 : 8);
                        break;
                    case 1:
                        List list2 = (List) obj22;
                        krk krkVar32 = featuredTournamentFragment.l;
                        krkVar32.getClass();
                        FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = ((jo8) krkVar32).b;
                        mg2 mg2Var = featuredTournamentCalendarRailView.a;
                        if (list2 != null && !list2.isEmpty() && ((list = featuredTournamentCalendarRailView.d) == null || !(!list.isEmpty()))) {
                            featuredTournamentCalendarRailView.d = list2;
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(LocalDate.parse((String) it.next(), DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.systemDefault()));
                            }
                            mg2Var.F(arrayList2);
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.getClass();
                            bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                            long timeInMillis = calendar2.getTimeInMillis() / 1000;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            String i6 = fc6.i(timeInMillis, hk4.a(bi4Var.d()));
                            List list3 = featuredTournamentCalendarRailView.d;
                            if (list3 == null || !list3.contains(i6)) {
                                List list4 = featuredTournamentCalendarRailView.d;
                                if (list4 != null) {
                                    int c = sub.c(k13.r(list4, 10));
                                    if (c < 16) {
                                        c = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(c);
                                    for (Object obj3 : list4) {
                                        Date parse = featuredTournamentCalendarRailView.c.parse((String) obj3);
                                        if (parse == null) {
                                            parse = new Date();
                                        }
                                        linkedHashMap2.put(obj3, parse);
                                    }
                                } else {
                                    linkedHashMap2 = null;
                                }
                                if (linkedHashMap2 != null) {
                                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            long abs = Math.abs(((Date) ((Map.Entry) next).getValue()).getTime() - calendar.getTimeInMillis());
                                            do {
                                                Object next3 = it2.next();
                                                long abs2 = Math.abs(((Date) ((Map.Entry) next3).getValue()).getTime() - calendar.getTimeInMillis());
                                                if (abs > abs2) {
                                                    next = next3;
                                                    abs = abs2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    entry = (Map.Entry) next;
                                } else {
                                    entry = null;
                                }
                                List list5 = featuredTournamentCalendarRailView.d;
                                if (list5 != null) {
                                    Iterator it3 = list5.iterator();
                                    int i7 = 0;
                                    while (true) {
                                        if (it3.hasNext()) {
                                            String str3 = (String) it3.next();
                                            int i8 = FeaturedTournamentCalendarRailView.f;
                                            str3.getClass();
                                            if (!Intrinsics.c(str3, entry != null ? (String) entry.getKey() : null)) {
                                                i7++;
                                            }
                                        } else {
                                            i7 = -1;
                                        }
                                    }
                                    Integer valueOf = i7 == -1 ? null : Integer.valueOf(i7);
                                    if (valueOf != null) {
                                        intValue = valueOf.intValue();
                                        int i9222 = mg2Var.m;
                                        mg2Var.m = intValue;
                                        mg2Var.notifyItemChanged(intValue);
                                        mg2Var.notifyItemChanged(i9222);
                                        function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                        if (function1 != null) {
                                            Object obj4 = arrayList2.get(intValue);
                                            obj4.getClass();
                                            function1.invoke(obj4);
                                        }
                                        featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                        featuredTournamentCalendarRailView.requestLayout();
                                    }
                                }
                                intValue = 0;
                                int i92222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i92222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            } else {
                                List list6 = featuredTournamentCalendarRailView.d;
                                if (list6 != null) {
                                    intValue = list6.indexOf(i6);
                                    int i922222 = mg2Var.m;
                                    mg2Var.m = intValue;
                                    mg2Var.notifyItemChanged(intValue);
                                    mg2Var.notifyItemChanged(i922222);
                                    function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                    if (function1 != null) {
                                    }
                                    featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                    featuredTournamentCalendarRailView.requestLayout();
                                }
                                intValue = 0;
                                int i9222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i9222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            }
                        }
                        break;
                    case 2:
                        joa joaVar2 = featuredTournamentFragment.A;
                        jv7 jv7Var = (jv7) obj22;
                        featuredTournamentFragment.n();
                        UniqueTournamentDetails uniqueTournamentDetails = jv7Var.a;
                        List list7 = jv7Var.e;
                        List list8 = jv7Var.b;
                        CupTreesResponse cupTreesResponse = jv7Var.f;
                        boolean z2 = uniqueTournamentDetails == null && list8 == null && cupTreesResponse == null;
                        krk krkVar42 = featuredTournamentFragment.l;
                        krkVar42.getClass();
                        ((jo8) krkVar42).c.setVisibility(z2 ? 0 : 8);
                        krk krkVar52 = featuredTournamentFragment.l;
                        krkVar52.getClass();
                        ((jo8) krkVar52).e.setVisibility(!z2 ? 0 : 8);
                        featuredTournamentFragment.E().setVisibility(cupTreesResponse != null ? 0 : 8);
                        if (!z2) {
                            FragmentActivity activity = featuredTournamentFragment.getActivity();
                            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                            if (mainActivity != null) {
                                mainActivity.d0(uniqueTournamentDetails);
                            }
                        }
                        qv7 qv7Var = featuredTournamentFragment.G().i;
                        if (uniqueTournamentDetails != null) {
                            krk krkVar62 = featuredTournamentFragment.l;
                            krkVar62.getClass();
                            FeaturedTournamentHeaderView featuredTournamentHeaderView = ((jo8) krkVar62).d;
                            e92 e92Var = featuredTournamentHeaderView.a;
                            ((TextView) e92Var.b).setText(tba.y(uniqueTournamentDetails));
                            ((TextView) e92Var.b).setTextColor(featuredTournamentHeaderView.getContext().getColor(R.color.on_color_primary));
                            aba.y((ImageView) e92Var.c, 0, 3);
                            ((FeaturedTournamentHeaderView) e92Var.e).setOnClickListener(new au7(i5, featuredTournamentHeaderView, uniqueTournamentDetails));
                            long intValue2 = ((uniqueTournamentDetails.getStartDateTimestamp() != null ? r2.intValue() : 0L) * 1000) - Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis();
                            if (intValue2 > 0) {
                                Integer startDateTimestamp = uniqueTournamentDetails.getStartDateTimestamp();
                                Integer endDateTimestamp = uniqueTournamentDetails.getEndDateTimestamp();
                                e92 e92Var2 = featuredTournamentHeaderView.c;
                                if (e92Var2 == null) {
                                    View inflate = ((ViewStub) e92Var.d).inflate();
                                    int i10 = R.id.days;
                                    View B = nq8.B(R.id.days, inflate);
                                    if (B != null) {
                                        t22 b = t22.b(B);
                                        i10 = R.id.hours;
                                        View B2 = nq8.B(R.id.hours, inflate);
                                        if (B2 != null) {
                                            t22 b2 = t22.b(B2);
                                            i10 = R.id.minutes;
                                            View B3 = nq8.B(R.id.minutes, inflate);
                                            if (B3 != null) {
                                                t22 b3 = t22.b(B3);
                                                i10 = R.id.seconds;
                                                View B4 = nq8.B(R.id.seconds, inflate);
                                                if (B4 != null) {
                                                    e92Var2 = new e92((LinearLayout) inflate, b, b2, b3, t22.b(B4), 25);
                                                    featuredTournamentHeaderView.c = e92Var2;
                                                }
                                            }
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                                    break;
                                }
                                ((t22) e92Var2.d).c.setText(R.string.days);
                                TextView textView = ((t22) e92Var2.b).c;
                                String string = featuredTournamentHeaderView.getContext().getString(R.string.hours);
                                string.getClass();
                                if (string.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    joaVar = joaVar2;
                                    char charAt = string.charAt(0);
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    sb.append((Object) CharsKt.c(charAt, locale));
                                    sb.append(string.substring(1));
                                    string = sb.toString();
                                } else {
                                    joaVar = joaVar2;
                                }
                                textView.setText(string);
                                ((t22) e92Var2.f).c.setText(R.string.minutes);
                                ((t22) e92Var2.c).c.setText(R.string.seconds);
                                pv7 pv7Var = featuredTournamentHeaderView.b;
                                if (pv7Var != null) {
                                    pv7Var.cancel();
                                }
                                pv7 pv7Var2 = new pv7(intValue2, e92Var2, featuredTournamentHeaderView, startDateTimestamp, endDateTimestamp);
                                featuredTournamentHeaderView.b = pv7Var2;
                                pv7Var2.start();
                            } else {
                                joaVar = joaVar2;
                                featuredTournamentHeaderView.f(uniqueTournamentDetails.getStartDateTimestamp(), uniqueTournamentDetails.getEndDateTimestamp());
                            }
                        } else {
                            joaVar = joaVar2;
                        }
                        tv7 F = featuredTournamentFragment.F();
                        bv7 bv7Var = new bv7(featuredTournamentFragment, qv7Var, 0);
                        F.getClass();
                        if (F.k || list8 == null || list8.isEmpty()) {
                            r5 = 0;
                        } else {
                            F.j = list8;
                            F.i = bv7Var;
                            F.k = true;
                            ArrayList arrayList3 = new ArrayList(k13.r(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((UniqueTournamentGroup) it4.next()).getGroupName());
                            }
                            r5 = 0;
                            TypeHeaderView.z((TypeHeaderView) ((e92) F.d.g).b, CollectionsKt.S0(CollectionsKt.V0(arrayList3)), null, 2);
                        }
                        xw3.L(wca.x(featuredTournamentFragment.getLifecycle()), r5, r5, new yp7(featuredTournamentFragment, cupTreesResponse, (rq3) r5, 1), 3);
                        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = jv7Var.c;
                        if (playerOfTheSeasonResponse != null) {
                            nue nueVar = (nue) featuredTournamentFragment.y.getValue();
                            qv7Var.getClass();
                            nueVar.l(270, 71636, playerOfTheSeasonResponse, Sports.FOOTBALL, new zu7(featuredTournamentFragment, 5), Integer.valueOf(R.color.color_afcon));
                        }
                        TopPerformanceResponse topPerformanceResponse = jv7Var.d;
                        if (topPerformanceResponse != null) {
                            Object topPerformanceItems = topPerformanceResponse.getTopPerformanceItems();
                            RatedTopPlayersStatistics ratedTopPlayersStatistics = topPerformanceItems instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) topPerformanceItems : r5;
                            if (ratedTopPlayersStatistics != null) {
                                cue cueVar = (cue) featuredTournamentFragment.z.getValue();
                                List<TopPlayersStatisticsItem<? extends BaseTopPlayersStatisticsItem>> rating = ratedTopPlayersStatistics.getRating();
                                Object ineligibleTopPlayers = topPerformanceResponse.getIneligibleTopPlayers();
                                RatedTopPlayersStatistics ratedTopPlayersStatistics2 = ineligibleTopPlayers instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) ineligibleTopPlayers : r5;
                                cueVar.j(rating, ratedTopPlayersStatistics2 != null ? ratedTopPlayersStatistics2.getRating() : r5, true, new zu7(featuredTournamentFragment, 6), new n37(26, featuredTournamentFragment, qv7Var), new go7(15));
                            }
                        }
                        if (list7 != null) {
                            if (!list7.isEmpty()) {
                                Iterator it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    if (((TournamentRoundWrapper) it5.next()).getHasTotw()) {
                                        z = true;
                                        bool = Boolean.valueOf(z);
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        } else {
                            bool = r5;
                        }
                        if (Intrinsics.c(bool, Boolean.TRUE)) {
                            ((dyi) joaVar.getValue()).setVisibility(0);
                            ((dyi) joaVar.getValue()).setOnItemSelectedCallback(new bv7(featuredTournamentFragment, qv7Var, 1));
                            dyi dyiVar = (dyi) joaVar.getValue();
                            Integer valueOf2 = uniqueTournamentDetails != null ? Integer.valueOf(uniqueTournamentDetails.getId()) : r5;
                            String slug = (uniqueTournamentDetails == null || (category2 = uniqueTournamentDetails.getCategory()) == null || (sport = category2.getSport()) == null) ? r5 : sport.getSlug();
                            if (list7 == null) {
                                list7 = km5.a;
                            }
                            List list9 = list7;
                            qv7Var.getClass();
                            String slug2 = (uniqueTournamentDetails == null || (category = uniqueTournamentDetails.getCategory()) == null) ? r5 : category.getSlug();
                            String str4 = slug2 == null ? "" : slug2;
                            String slug3 = uniqueTournamentDetails != null ? uniqueTournamentDetails.getSlug() : r5;
                            dyiVar.l(valueOf2, slug, list9, null, 71636, false, str4, slug3 == null ? "" : slug3);
                        }
                        break;
                    case 3:
                        List list10 = (List) obj22;
                        yu7 D2 = featuredTournamentFragment.D();
                        list10.getClass();
                        D2.F(list10);
                        krk krkVar7 = featuredTournamentFragment.l;
                        krkVar7.getClass();
                        ((jo8) krkVar7).e.scrollToPosition(0);
                        if (featuredTournamentFragment.H) {
                            featuredTournamentFragment.H = false;
                            r2.p(featuredTournamentFragment.D().g.size(), (AdBannerView) featuredTournamentFragment.w.getValue());
                            g7.o(featuredTournamentFragment.D(), (FrameLayout) featuredTournamentFragment.B.getValue(), 2);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.F(), 6);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.E(), 6);
                            g7.o(featuredTournamentFragment.D(), (nue) featuredTournamentFragment.y.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (cue) featuredTournamentFragment.z.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (AdBannerView) featuredTournamentFragment.x.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (dyi) featuredTournamentFragment.A.getValue(), 6);
                            PromotionalOffersBannerView promotionalOffersBannerView2 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                            if (promotionalOffersBannerView2 != null) {
                                g7.o(featuredTournamentFragment.D(), promotionalOffersBannerView2, 6);
                            }
                            GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) featuredTournamentFragment.F.getValue();
                            if (gambleRegulationFooterView != null) {
                                g7.o(featuredTournamentFragment.D(), gambleRegulationFooterView, 6);
                            }
                        }
                        if (featuredTournamentFragment.D().h.contains(featuredTournamentFragment.F()) && featuredTournamentFragment.G && featuredTournamentFragment.F().k) {
                            jo8 jo8Var = (jo8) featuredTournamentFragment.l;
                            ZonedDateTime currentDate = jo8Var != null ? jo8Var.b.getCurrentDate() : null;
                            if (currentDate != null && (localDate = currentDate.toLocalDate()) != null && localDate.compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.c) >= 0) {
                                UniqueTournamentGroup uniqueTournamentGroup = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                if (uniqueTournamentGroup == null || (groupName = uniqueTournamentGroup.getGroupName()) == null) {
                                    str2 = null;
                                } else {
                                    str2 = groupName.toLowerCase(Locale.ROOT);
                                    str2.getClass();
                                }
                                if (Intrinsics.c(str2, "third-placed teams")) {
                                    UniqueTournamentGroup uniqueTournamentGroup2 = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                    if (uniqueTournamentGroup2 != null) {
                                        str = uniqueTournamentGroup2.getGroupName();
                                        featuredTournamentFragment.G = false;
                                        if (str != null) {
                                            tv7 F2 = featuredTournamentFragment.F();
                                            F2.getClass();
                                            ((TypeHeaderView) ((e92) F2.d.g).b).t(str, true);
                                        }
                                    }
                                    str = null;
                                    featuredTournamentFragment.G = false;
                                    if (str != null) {
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list10) {
                                if (ok3.D(((iv7) obj5).a)) {
                                    arrayList4.add(obj5);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                arrayList4 = null;
                            }
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                for (Object obj6 : list10) {
                                    iv7 iv7Var = (iv7) obj6;
                                    if (ok3.E(iv7Var.a) && Intrinsics.c(iv7Var.a.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    arrayList4 = null;
                                    break;
                                }
                            }
                            list10 = arrayList4;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj7 : list10) {
                                String groupName2 = ((iv7) obj7).a.getTournament().getGroupName();
                                Object obj8 = linkedHashMap3.get(groupName2);
                                if (obj8 == null) {
                                    obj8 = wv8.n(linkedHashMap3, groupName2);
                                }
                                ((List) obj8).add(obj7);
                            }
                            Iterator it6 = linkedHashMap3.entrySet().iterator();
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                if (it6.hasNext()) {
                                    int size = ((List) ((Map.Entry) next2).getValue()).size();
                                    do {
                                        Object next4 = it6.next();
                                        int size2 = ((List) ((Map.Entry) next4).getValue()).size();
                                        if (size < size2) {
                                            next2 = next4;
                                            size = size2;
                                        }
                                    } while (it6.hasNext());
                                }
                            } else {
                                next2 = null;
                            }
                            Map.Entry entry2 = (Map.Entry) next2;
                            if (entry2 != null) {
                                str = (String) entry2.getKey();
                                featuredTournamentFragment.G = false;
                                if (str != null) {
                                }
                            }
                            str = null;
                            featuredTournamentFragment.G = false;
                            if (str != null) {
                            }
                        }
                        break;
                    case 4:
                        dyi dyiVar2 = (dyi) featuredTournamentFragment.A.getValue();
                        dyiVar2.l = true;
                        dyiVar2.q = (TeamOfTheWeekResponse) obj22;
                        dyiVar2.o();
                        break;
                    case 5:
                        List list11 = (List) obj22;
                        if (list11 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj9 : list11) {
                                if (obj9 instanceof wai) {
                                    arrayList5.add(obj9);
                                }
                            }
                            waiVar = (wai) CollectionsKt.Y(arrayList5);
                        } else {
                            waiVar = null;
                        }
                        if (list11 != null) {
                            arrayList = new ArrayList();
                            for (Object obj10 : list11) {
                                if (obj10 instanceof bbi) {
                                    arrayList.add(obj10);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (list11 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj11 : list11) {
                                if (obj11 instanceof x9i) {
                                    arrayList6.add(obj11);
                                }
                            }
                            x9iVar = (x9i) CollectionsKt.firstOrNull(arrayList6);
                        } else {
                            x9iVar = null;
                        }
                        if (x9iVar != null) {
                            x9iVar.i = false;
                        }
                        if (waiVar != null && arrayList != null) {
                            tv7 F3 = featuredTournamentFragment.F();
                            F3.getClass();
                            F3.f = waiVar;
                            F3.g = arrayList;
                            F3.h = x9iVar;
                            F3.j();
                        }
                        break;
                    default:
                        List list12 = (List) obj22;
                        PromotionalOffersBannerView promotionalOffersBannerView22 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                        if (promotionalOffersBannerView22 != null) {
                            list12.getClass();
                            featuredTournamentFragment.G().i.getClass();
                            PromotionalOffersBannerView.j(promotionalOffersBannerView22, list12, new tdf(0, 270), fv.FEATURED_TOURNAMENT);
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i5 = 2;
        G().k.e(getViewLifecycleOwner(), new z1(14, new Function1(this) { // from class: av7
            public final /* synthetic */ FeaturedTournamentFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:130:0x0272, code lost:
            
                if (r2 == null) goto L106;
             */
            /* JADX WARN: Removed duplicated region for block: B:323:0x07fd  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.CoroutineContext, nu3, rq3] */
            /* JADX WARN: Type inference failed for: r5v5 */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj22) {
                List list;
                LinkedHashMap linkedHashMap2;
                Map.Entry entry;
                int intValue;
                Object next;
                Function1 function1;
                joa joaVar;
                ?? r5;
                Boolean bool;
                Category category;
                Category category2;
                Sport sport;
                boolean z;
                Object next2;
                String str;
                LocalDate localDate;
                String str2;
                String groupName;
                wai waiVar;
                ArrayList arrayList;
                x9i x9iVar;
                int i42 = i5;
                FeaturedTournamentFragment featuredTournamentFragment = this.b;
                int i52 = 1;
                switch (i42) {
                    case 0:
                        ZonedDateTime zonedDateTime = (ZonedDateTime) obj22;
                        zonedDateTime.getClass();
                        featuredTournamentFragment.G = true;
                        featuredTournamentFragment.G().k(zonedDateTime);
                        featuredTournamentFragment.F().setVisibility(zonedDateTime.toLocalDate().compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.d) <= 0 ? 0 : 8);
                        break;
                    case 1:
                        List list2 = (List) obj22;
                        krk krkVar32 = featuredTournamentFragment.l;
                        krkVar32.getClass();
                        FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = ((jo8) krkVar32).b;
                        mg2 mg2Var = featuredTournamentCalendarRailView.a;
                        if (list2 != null && !list2.isEmpty() && ((list = featuredTournamentCalendarRailView.d) == null || !(!list.isEmpty()))) {
                            featuredTournamentCalendarRailView.d = list2;
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(LocalDate.parse((String) it.next(), DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.systemDefault()));
                            }
                            mg2Var.F(arrayList2);
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.getClass();
                            bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                            long timeInMillis = calendar2.getTimeInMillis() / 1000;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            String i6 = fc6.i(timeInMillis, hk4.a(bi4Var.d()));
                            List list3 = featuredTournamentCalendarRailView.d;
                            if (list3 == null || !list3.contains(i6)) {
                                List list4 = featuredTournamentCalendarRailView.d;
                                if (list4 != null) {
                                    int c = sub.c(k13.r(list4, 10));
                                    if (c < 16) {
                                        c = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(c);
                                    for (Object obj3 : list4) {
                                        Date parse = featuredTournamentCalendarRailView.c.parse((String) obj3);
                                        if (parse == null) {
                                            parse = new Date();
                                        }
                                        linkedHashMap2.put(obj3, parse);
                                    }
                                } else {
                                    linkedHashMap2 = null;
                                }
                                if (linkedHashMap2 != null) {
                                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            long abs = Math.abs(((Date) ((Map.Entry) next).getValue()).getTime() - calendar.getTimeInMillis());
                                            do {
                                                Object next3 = it2.next();
                                                long abs2 = Math.abs(((Date) ((Map.Entry) next3).getValue()).getTime() - calendar.getTimeInMillis());
                                                if (abs > abs2) {
                                                    next = next3;
                                                    abs = abs2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    entry = (Map.Entry) next;
                                } else {
                                    entry = null;
                                }
                                List list5 = featuredTournamentCalendarRailView.d;
                                if (list5 != null) {
                                    Iterator it3 = list5.iterator();
                                    int i7 = 0;
                                    while (true) {
                                        if (it3.hasNext()) {
                                            String str3 = (String) it3.next();
                                            int i8 = FeaturedTournamentCalendarRailView.f;
                                            str3.getClass();
                                            if (!Intrinsics.c(str3, entry != null ? (String) entry.getKey() : null)) {
                                                i7++;
                                            }
                                        } else {
                                            i7 = -1;
                                        }
                                    }
                                    Integer valueOf = i7 == -1 ? null : Integer.valueOf(i7);
                                    if (valueOf != null) {
                                        intValue = valueOf.intValue();
                                        int i9222222 = mg2Var.m;
                                        mg2Var.m = intValue;
                                        mg2Var.notifyItemChanged(intValue);
                                        mg2Var.notifyItemChanged(i9222222);
                                        function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                        if (function1 != null) {
                                            Object obj4 = arrayList2.get(intValue);
                                            obj4.getClass();
                                            function1.invoke(obj4);
                                        }
                                        featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                        featuredTournamentCalendarRailView.requestLayout();
                                    }
                                }
                                intValue = 0;
                                int i92222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i92222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            } else {
                                List list6 = featuredTournamentCalendarRailView.d;
                                if (list6 != null) {
                                    intValue = list6.indexOf(i6);
                                    int i922222222 = mg2Var.m;
                                    mg2Var.m = intValue;
                                    mg2Var.notifyItemChanged(intValue);
                                    mg2Var.notifyItemChanged(i922222222);
                                    function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                    if (function1 != null) {
                                    }
                                    featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                    featuredTournamentCalendarRailView.requestLayout();
                                }
                                intValue = 0;
                                int i9222222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i9222222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            }
                        }
                        break;
                    case 2:
                        joa joaVar2 = featuredTournamentFragment.A;
                        jv7 jv7Var = (jv7) obj22;
                        featuredTournamentFragment.n();
                        UniqueTournamentDetails uniqueTournamentDetails = jv7Var.a;
                        List list7 = jv7Var.e;
                        List list8 = jv7Var.b;
                        CupTreesResponse cupTreesResponse = jv7Var.f;
                        boolean z2 = uniqueTournamentDetails == null && list8 == null && cupTreesResponse == null;
                        krk krkVar42 = featuredTournamentFragment.l;
                        krkVar42.getClass();
                        ((jo8) krkVar42).c.setVisibility(z2 ? 0 : 8);
                        krk krkVar52 = featuredTournamentFragment.l;
                        krkVar52.getClass();
                        ((jo8) krkVar52).e.setVisibility(!z2 ? 0 : 8);
                        featuredTournamentFragment.E().setVisibility(cupTreesResponse != null ? 0 : 8);
                        if (!z2) {
                            FragmentActivity activity = featuredTournamentFragment.getActivity();
                            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                            if (mainActivity != null) {
                                mainActivity.d0(uniqueTournamentDetails);
                            }
                        }
                        qv7 qv7Var = featuredTournamentFragment.G().i;
                        if (uniqueTournamentDetails != null) {
                            krk krkVar62 = featuredTournamentFragment.l;
                            krkVar62.getClass();
                            FeaturedTournamentHeaderView featuredTournamentHeaderView = ((jo8) krkVar62).d;
                            e92 e92Var = featuredTournamentHeaderView.a;
                            ((TextView) e92Var.b).setText(tba.y(uniqueTournamentDetails));
                            ((TextView) e92Var.b).setTextColor(featuredTournamentHeaderView.getContext().getColor(R.color.on_color_primary));
                            aba.y((ImageView) e92Var.c, 0, 3);
                            ((FeaturedTournamentHeaderView) e92Var.e).setOnClickListener(new au7(i52, featuredTournamentHeaderView, uniqueTournamentDetails));
                            long intValue2 = ((uniqueTournamentDetails.getStartDateTimestamp() != null ? r2.intValue() : 0L) * 1000) - Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis();
                            if (intValue2 > 0) {
                                Integer startDateTimestamp = uniqueTournamentDetails.getStartDateTimestamp();
                                Integer endDateTimestamp = uniqueTournamentDetails.getEndDateTimestamp();
                                e92 e92Var2 = featuredTournamentHeaderView.c;
                                if (e92Var2 == null) {
                                    View inflate = ((ViewStub) e92Var.d).inflate();
                                    int i10 = R.id.days;
                                    View B = nq8.B(R.id.days, inflate);
                                    if (B != null) {
                                        t22 b = t22.b(B);
                                        i10 = R.id.hours;
                                        View B2 = nq8.B(R.id.hours, inflate);
                                        if (B2 != null) {
                                            t22 b2 = t22.b(B2);
                                            i10 = R.id.minutes;
                                            View B3 = nq8.B(R.id.minutes, inflate);
                                            if (B3 != null) {
                                                t22 b3 = t22.b(B3);
                                                i10 = R.id.seconds;
                                                View B4 = nq8.B(R.id.seconds, inflate);
                                                if (B4 != null) {
                                                    e92Var2 = new e92((LinearLayout) inflate, b, b2, b3, t22.b(B4), 25);
                                                    featuredTournamentHeaderView.c = e92Var2;
                                                }
                                            }
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                                    break;
                                }
                                ((t22) e92Var2.d).c.setText(R.string.days);
                                TextView textView = ((t22) e92Var2.b).c;
                                String string = featuredTournamentHeaderView.getContext().getString(R.string.hours);
                                string.getClass();
                                if (string.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    joaVar = joaVar2;
                                    char charAt = string.charAt(0);
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    sb.append((Object) CharsKt.c(charAt, locale));
                                    sb.append(string.substring(1));
                                    string = sb.toString();
                                } else {
                                    joaVar = joaVar2;
                                }
                                textView.setText(string);
                                ((t22) e92Var2.f).c.setText(R.string.minutes);
                                ((t22) e92Var2.c).c.setText(R.string.seconds);
                                pv7 pv7Var = featuredTournamentHeaderView.b;
                                if (pv7Var != null) {
                                    pv7Var.cancel();
                                }
                                pv7 pv7Var2 = new pv7(intValue2, e92Var2, featuredTournamentHeaderView, startDateTimestamp, endDateTimestamp);
                                featuredTournamentHeaderView.b = pv7Var2;
                                pv7Var2.start();
                            } else {
                                joaVar = joaVar2;
                                featuredTournamentHeaderView.f(uniqueTournamentDetails.getStartDateTimestamp(), uniqueTournamentDetails.getEndDateTimestamp());
                            }
                        } else {
                            joaVar = joaVar2;
                        }
                        tv7 F = featuredTournamentFragment.F();
                        bv7 bv7Var = new bv7(featuredTournamentFragment, qv7Var, 0);
                        F.getClass();
                        if (F.k || list8 == null || list8.isEmpty()) {
                            r5 = 0;
                        } else {
                            F.j = list8;
                            F.i = bv7Var;
                            F.k = true;
                            ArrayList arrayList3 = new ArrayList(k13.r(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((UniqueTournamentGroup) it4.next()).getGroupName());
                            }
                            r5 = 0;
                            TypeHeaderView.z((TypeHeaderView) ((e92) F.d.g).b, CollectionsKt.S0(CollectionsKt.V0(arrayList3)), null, 2);
                        }
                        xw3.L(wca.x(featuredTournamentFragment.getLifecycle()), r5, r5, new yp7(featuredTournamentFragment, cupTreesResponse, (rq3) r5, 1), 3);
                        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = jv7Var.c;
                        if (playerOfTheSeasonResponse != null) {
                            nue nueVar = (nue) featuredTournamentFragment.y.getValue();
                            qv7Var.getClass();
                            nueVar.l(270, 71636, playerOfTheSeasonResponse, Sports.FOOTBALL, new zu7(featuredTournamentFragment, 5), Integer.valueOf(R.color.color_afcon));
                        }
                        TopPerformanceResponse topPerformanceResponse = jv7Var.d;
                        if (topPerformanceResponse != null) {
                            Object topPerformanceItems = topPerformanceResponse.getTopPerformanceItems();
                            RatedTopPlayersStatistics ratedTopPlayersStatistics = topPerformanceItems instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) topPerformanceItems : r5;
                            if (ratedTopPlayersStatistics != null) {
                                cue cueVar = (cue) featuredTournamentFragment.z.getValue();
                                List<TopPlayersStatisticsItem<? extends BaseTopPlayersStatisticsItem>> rating = ratedTopPlayersStatistics.getRating();
                                Object ineligibleTopPlayers = topPerformanceResponse.getIneligibleTopPlayers();
                                RatedTopPlayersStatistics ratedTopPlayersStatistics2 = ineligibleTopPlayers instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) ineligibleTopPlayers : r5;
                                cueVar.j(rating, ratedTopPlayersStatistics2 != null ? ratedTopPlayersStatistics2.getRating() : r5, true, new zu7(featuredTournamentFragment, 6), new n37(26, featuredTournamentFragment, qv7Var), new go7(15));
                            }
                        }
                        if (list7 != null) {
                            if (!list7.isEmpty()) {
                                Iterator it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    if (((TournamentRoundWrapper) it5.next()).getHasTotw()) {
                                        z = true;
                                        bool = Boolean.valueOf(z);
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        } else {
                            bool = r5;
                        }
                        if (Intrinsics.c(bool, Boolean.TRUE)) {
                            ((dyi) joaVar.getValue()).setVisibility(0);
                            ((dyi) joaVar.getValue()).setOnItemSelectedCallback(new bv7(featuredTournamentFragment, qv7Var, 1));
                            dyi dyiVar = (dyi) joaVar.getValue();
                            Integer valueOf2 = uniqueTournamentDetails != null ? Integer.valueOf(uniqueTournamentDetails.getId()) : r5;
                            String slug = (uniqueTournamentDetails == null || (category2 = uniqueTournamentDetails.getCategory()) == null || (sport = category2.getSport()) == null) ? r5 : sport.getSlug();
                            if (list7 == null) {
                                list7 = km5.a;
                            }
                            List list9 = list7;
                            qv7Var.getClass();
                            String slug2 = (uniqueTournamentDetails == null || (category = uniqueTournamentDetails.getCategory()) == null) ? r5 : category.getSlug();
                            String str4 = slug2 == null ? "" : slug2;
                            String slug3 = uniqueTournamentDetails != null ? uniqueTournamentDetails.getSlug() : r5;
                            dyiVar.l(valueOf2, slug, list9, null, 71636, false, str4, slug3 == null ? "" : slug3);
                        }
                        break;
                    case 3:
                        List list10 = (List) obj22;
                        yu7 D2 = featuredTournamentFragment.D();
                        list10.getClass();
                        D2.F(list10);
                        krk krkVar7 = featuredTournamentFragment.l;
                        krkVar7.getClass();
                        ((jo8) krkVar7).e.scrollToPosition(0);
                        if (featuredTournamentFragment.H) {
                            featuredTournamentFragment.H = false;
                            r2.p(featuredTournamentFragment.D().g.size(), (AdBannerView) featuredTournamentFragment.w.getValue());
                            g7.o(featuredTournamentFragment.D(), (FrameLayout) featuredTournamentFragment.B.getValue(), 2);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.F(), 6);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.E(), 6);
                            g7.o(featuredTournamentFragment.D(), (nue) featuredTournamentFragment.y.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (cue) featuredTournamentFragment.z.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (AdBannerView) featuredTournamentFragment.x.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (dyi) featuredTournamentFragment.A.getValue(), 6);
                            PromotionalOffersBannerView promotionalOffersBannerView2 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                            if (promotionalOffersBannerView2 != null) {
                                g7.o(featuredTournamentFragment.D(), promotionalOffersBannerView2, 6);
                            }
                            GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) featuredTournamentFragment.F.getValue();
                            if (gambleRegulationFooterView != null) {
                                g7.o(featuredTournamentFragment.D(), gambleRegulationFooterView, 6);
                            }
                        }
                        if (featuredTournamentFragment.D().h.contains(featuredTournamentFragment.F()) && featuredTournamentFragment.G && featuredTournamentFragment.F().k) {
                            jo8 jo8Var = (jo8) featuredTournamentFragment.l;
                            ZonedDateTime currentDate = jo8Var != null ? jo8Var.b.getCurrentDate() : null;
                            if (currentDate != null && (localDate = currentDate.toLocalDate()) != null && localDate.compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.c) >= 0) {
                                UniqueTournamentGroup uniqueTournamentGroup = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                if (uniqueTournamentGroup == null || (groupName = uniqueTournamentGroup.getGroupName()) == null) {
                                    str2 = null;
                                } else {
                                    str2 = groupName.toLowerCase(Locale.ROOT);
                                    str2.getClass();
                                }
                                if (Intrinsics.c(str2, "third-placed teams")) {
                                    UniqueTournamentGroup uniqueTournamentGroup2 = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                    if (uniqueTournamentGroup2 != null) {
                                        str = uniqueTournamentGroup2.getGroupName();
                                        featuredTournamentFragment.G = false;
                                        if (str != null) {
                                            tv7 F2 = featuredTournamentFragment.F();
                                            F2.getClass();
                                            ((TypeHeaderView) ((e92) F2.d.g).b).t(str, true);
                                        }
                                    }
                                    str = null;
                                    featuredTournamentFragment.G = false;
                                    if (str != null) {
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list10) {
                                if (ok3.D(((iv7) obj5).a)) {
                                    arrayList4.add(obj5);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                arrayList4 = null;
                            }
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                for (Object obj6 : list10) {
                                    iv7 iv7Var = (iv7) obj6;
                                    if (ok3.E(iv7Var.a) && Intrinsics.c(iv7Var.a.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    arrayList4 = null;
                                    break;
                                }
                            }
                            list10 = arrayList4;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj7 : list10) {
                                String groupName2 = ((iv7) obj7).a.getTournament().getGroupName();
                                Object obj8 = linkedHashMap3.get(groupName2);
                                if (obj8 == null) {
                                    obj8 = wv8.n(linkedHashMap3, groupName2);
                                }
                                ((List) obj8).add(obj7);
                            }
                            Iterator it6 = linkedHashMap3.entrySet().iterator();
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                if (it6.hasNext()) {
                                    int size = ((List) ((Map.Entry) next2).getValue()).size();
                                    do {
                                        Object next4 = it6.next();
                                        int size2 = ((List) ((Map.Entry) next4).getValue()).size();
                                        if (size < size2) {
                                            next2 = next4;
                                            size = size2;
                                        }
                                    } while (it6.hasNext());
                                }
                            } else {
                                next2 = null;
                            }
                            Map.Entry entry2 = (Map.Entry) next2;
                            if (entry2 != null) {
                                str = (String) entry2.getKey();
                                featuredTournamentFragment.G = false;
                                if (str != null) {
                                }
                            }
                            str = null;
                            featuredTournamentFragment.G = false;
                            if (str != null) {
                            }
                        }
                        break;
                    case 4:
                        dyi dyiVar2 = (dyi) featuredTournamentFragment.A.getValue();
                        dyiVar2.l = true;
                        dyiVar2.q = (TeamOfTheWeekResponse) obj22;
                        dyiVar2.o();
                        break;
                    case 5:
                        List list11 = (List) obj22;
                        if (list11 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj9 : list11) {
                                if (obj9 instanceof wai) {
                                    arrayList5.add(obj9);
                                }
                            }
                            waiVar = (wai) CollectionsKt.Y(arrayList5);
                        } else {
                            waiVar = null;
                        }
                        if (list11 != null) {
                            arrayList = new ArrayList();
                            for (Object obj10 : list11) {
                                if (obj10 instanceof bbi) {
                                    arrayList.add(obj10);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (list11 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj11 : list11) {
                                if (obj11 instanceof x9i) {
                                    arrayList6.add(obj11);
                                }
                            }
                            x9iVar = (x9i) CollectionsKt.firstOrNull(arrayList6);
                        } else {
                            x9iVar = null;
                        }
                        if (x9iVar != null) {
                            x9iVar.i = false;
                        }
                        if (waiVar != null && arrayList != null) {
                            tv7 F3 = featuredTournamentFragment.F();
                            F3.getClass();
                            F3.f = waiVar;
                            F3.g = arrayList;
                            F3.h = x9iVar;
                            F3.j();
                        }
                        break;
                    default:
                        List list12 = (List) obj22;
                        PromotionalOffersBannerView promotionalOffersBannerView22 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                        if (promotionalOffersBannerView22 != null) {
                            list12.getClass();
                            featuredTournamentFragment.G().i.getClass();
                            PromotionalOffersBannerView.j(promotionalOffersBannerView22, list12, new tdf(0, 270), fv.FEATURED_TOURNAMENT);
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        G().q.e(getViewLifecycleOwner(), new z1(14, new Function1(this) { // from class: av7
            public final /* synthetic */ FeaturedTournamentFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:130:0x0272, code lost:
            
                if (r2 == null) goto L106;
             */
            /* JADX WARN: Removed duplicated region for block: B:323:0x07fd  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.CoroutineContext, nu3, rq3] */
            /* JADX WARN: Type inference failed for: r5v5 */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj22) {
                List list;
                LinkedHashMap linkedHashMap2;
                Map.Entry entry;
                int intValue;
                Object next;
                Function1 function1;
                joa joaVar;
                ?? r5;
                Boolean bool;
                Category category;
                Category category2;
                Sport sport;
                boolean z;
                Object next2;
                String str;
                LocalDate localDate;
                String str2;
                String groupName;
                wai waiVar;
                ArrayList arrayList;
                x9i x9iVar;
                int i42 = i3;
                FeaturedTournamentFragment featuredTournamentFragment = this.b;
                int i52 = 1;
                switch (i42) {
                    case 0:
                        ZonedDateTime zonedDateTime = (ZonedDateTime) obj22;
                        zonedDateTime.getClass();
                        featuredTournamentFragment.G = true;
                        featuredTournamentFragment.G().k(zonedDateTime);
                        featuredTournamentFragment.F().setVisibility(zonedDateTime.toLocalDate().compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.d) <= 0 ? 0 : 8);
                        break;
                    case 1:
                        List list2 = (List) obj22;
                        krk krkVar32 = featuredTournamentFragment.l;
                        krkVar32.getClass();
                        FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = ((jo8) krkVar32).b;
                        mg2 mg2Var = featuredTournamentCalendarRailView.a;
                        if (list2 != null && !list2.isEmpty() && ((list = featuredTournamentCalendarRailView.d) == null || !(!list.isEmpty()))) {
                            featuredTournamentCalendarRailView.d = list2;
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(LocalDate.parse((String) it.next(), DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.systemDefault()));
                            }
                            mg2Var.F(arrayList2);
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.getClass();
                            bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                            long timeInMillis = calendar2.getTimeInMillis() / 1000;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            String i6 = fc6.i(timeInMillis, hk4.a(bi4Var.d()));
                            List list3 = featuredTournamentCalendarRailView.d;
                            if (list3 == null || !list3.contains(i6)) {
                                List list4 = featuredTournamentCalendarRailView.d;
                                if (list4 != null) {
                                    int c = sub.c(k13.r(list4, 10));
                                    if (c < 16) {
                                        c = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(c);
                                    for (Object obj3 : list4) {
                                        Date parse = featuredTournamentCalendarRailView.c.parse((String) obj3);
                                        if (parse == null) {
                                            parse = new Date();
                                        }
                                        linkedHashMap2.put(obj3, parse);
                                    }
                                } else {
                                    linkedHashMap2 = null;
                                }
                                if (linkedHashMap2 != null) {
                                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            long abs = Math.abs(((Date) ((Map.Entry) next).getValue()).getTime() - calendar.getTimeInMillis());
                                            do {
                                                Object next3 = it2.next();
                                                long abs2 = Math.abs(((Date) ((Map.Entry) next3).getValue()).getTime() - calendar.getTimeInMillis());
                                                if (abs > abs2) {
                                                    next = next3;
                                                    abs = abs2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    entry = (Map.Entry) next;
                                } else {
                                    entry = null;
                                }
                                List list5 = featuredTournamentCalendarRailView.d;
                                if (list5 != null) {
                                    Iterator it3 = list5.iterator();
                                    int i7 = 0;
                                    while (true) {
                                        if (it3.hasNext()) {
                                            String str3 = (String) it3.next();
                                            int i8 = FeaturedTournamentCalendarRailView.f;
                                            str3.getClass();
                                            if (!Intrinsics.c(str3, entry != null ? (String) entry.getKey() : null)) {
                                                i7++;
                                            }
                                        } else {
                                            i7 = -1;
                                        }
                                    }
                                    Integer valueOf = i7 == -1 ? null : Integer.valueOf(i7);
                                    if (valueOf != null) {
                                        intValue = valueOf.intValue();
                                        int i9222222222 = mg2Var.m;
                                        mg2Var.m = intValue;
                                        mg2Var.notifyItemChanged(intValue);
                                        mg2Var.notifyItemChanged(i9222222222);
                                        function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                        if (function1 != null) {
                                            Object obj4 = arrayList2.get(intValue);
                                            obj4.getClass();
                                            function1.invoke(obj4);
                                        }
                                        featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                        featuredTournamentCalendarRailView.requestLayout();
                                    }
                                }
                                intValue = 0;
                                int i92222222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i92222222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            } else {
                                List list6 = featuredTournamentCalendarRailView.d;
                                if (list6 != null) {
                                    intValue = list6.indexOf(i6);
                                    int i922222222222 = mg2Var.m;
                                    mg2Var.m = intValue;
                                    mg2Var.notifyItemChanged(intValue);
                                    mg2Var.notifyItemChanged(i922222222222);
                                    function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                    if (function1 != null) {
                                    }
                                    featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                    featuredTournamentCalendarRailView.requestLayout();
                                }
                                intValue = 0;
                                int i9222222222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i9222222222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            }
                        }
                        break;
                    case 2:
                        joa joaVar2 = featuredTournamentFragment.A;
                        jv7 jv7Var = (jv7) obj22;
                        featuredTournamentFragment.n();
                        UniqueTournamentDetails uniqueTournamentDetails = jv7Var.a;
                        List list7 = jv7Var.e;
                        List list8 = jv7Var.b;
                        CupTreesResponse cupTreesResponse = jv7Var.f;
                        boolean z2 = uniqueTournamentDetails == null && list8 == null && cupTreesResponse == null;
                        krk krkVar42 = featuredTournamentFragment.l;
                        krkVar42.getClass();
                        ((jo8) krkVar42).c.setVisibility(z2 ? 0 : 8);
                        krk krkVar52 = featuredTournamentFragment.l;
                        krkVar52.getClass();
                        ((jo8) krkVar52).e.setVisibility(!z2 ? 0 : 8);
                        featuredTournamentFragment.E().setVisibility(cupTreesResponse != null ? 0 : 8);
                        if (!z2) {
                            FragmentActivity activity = featuredTournamentFragment.getActivity();
                            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                            if (mainActivity != null) {
                                mainActivity.d0(uniqueTournamentDetails);
                            }
                        }
                        qv7 qv7Var = featuredTournamentFragment.G().i;
                        if (uniqueTournamentDetails != null) {
                            krk krkVar62 = featuredTournamentFragment.l;
                            krkVar62.getClass();
                            FeaturedTournamentHeaderView featuredTournamentHeaderView = ((jo8) krkVar62).d;
                            e92 e92Var = featuredTournamentHeaderView.a;
                            ((TextView) e92Var.b).setText(tba.y(uniqueTournamentDetails));
                            ((TextView) e92Var.b).setTextColor(featuredTournamentHeaderView.getContext().getColor(R.color.on_color_primary));
                            aba.y((ImageView) e92Var.c, 0, 3);
                            ((FeaturedTournamentHeaderView) e92Var.e).setOnClickListener(new au7(i52, featuredTournamentHeaderView, uniqueTournamentDetails));
                            long intValue2 = ((uniqueTournamentDetails.getStartDateTimestamp() != null ? r2.intValue() : 0L) * 1000) - Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis();
                            if (intValue2 > 0) {
                                Integer startDateTimestamp = uniqueTournamentDetails.getStartDateTimestamp();
                                Integer endDateTimestamp = uniqueTournamentDetails.getEndDateTimestamp();
                                e92 e92Var2 = featuredTournamentHeaderView.c;
                                if (e92Var2 == null) {
                                    View inflate = ((ViewStub) e92Var.d).inflate();
                                    int i10 = R.id.days;
                                    View B = nq8.B(R.id.days, inflate);
                                    if (B != null) {
                                        t22 b = t22.b(B);
                                        i10 = R.id.hours;
                                        View B2 = nq8.B(R.id.hours, inflate);
                                        if (B2 != null) {
                                            t22 b2 = t22.b(B2);
                                            i10 = R.id.minutes;
                                            View B3 = nq8.B(R.id.minutes, inflate);
                                            if (B3 != null) {
                                                t22 b3 = t22.b(B3);
                                                i10 = R.id.seconds;
                                                View B4 = nq8.B(R.id.seconds, inflate);
                                                if (B4 != null) {
                                                    e92Var2 = new e92((LinearLayout) inflate, b, b2, b3, t22.b(B4), 25);
                                                    featuredTournamentHeaderView.c = e92Var2;
                                                }
                                            }
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                                    break;
                                }
                                ((t22) e92Var2.d).c.setText(R.string.days);
                                TextView textView = ((t22) e92Var2.b).c;
                                String string = featuredTournamentHeaderView.getContext().getString(R.string.hours);
                                string.getClass();
                                if (string.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    joaVar = joaVar2;
                                    char charAt = string.charAt(0);
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    sb.append((Object) CharsKt.c(charAt, locale));
                                    sb.append(string.substring(1));
                                    string = sb.toString();
                                } else {
                                    joaVar = joaVar2;
                                }
                                textView.setText(string);
                                ((t22) e92Var2.f).c.setText(R.string.minutes);
                                ((t22) e92Var2.c).c.setText(R.string.seconds);
                                pv7 pv7Var = featuredTournamentHeaderView.b;
                                if (pv7Var != null) {
                                    pv7Var.cancel();
                                }
                                pv7 pv7Var2 = new pv7(intValue2, e92Var2, featuredTournamentHeaderView, startDateTimestamp, endDateTimestamp);
                                featuredTournamentHeaderView.b = pv7Var2;
                                pv7Var2.start();
                            } else {
                                joaVar = joaVar2;
                                featuredTournamentHeaderView.f(uniqueTournamentDetails.getStartDateTimestamp(), uniqueTournamentDetails.getEndDateTimestamp());
                            }
                        } else {
                            joaVar = joaVar2;
                        }
                        tv7 F = featuredTournamentFragment.F();
                        bv7 bv7Var = new bv7(featuredTournamentFragment, qv7Var, 0);
                        F.getClass();
                        if (F.k || list8 == null || list8.isEmpty()) {
                            r5 = 0;
                        } else {
                            F.j = list8;
                            F.i = bv7Var;
                            F.k = true;
                            ArrayList arrayList3 = new ArrayList(k13.r(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((UniqueTournamentGroup) it4.next()).getGroupName());
                            }
                            r5 = 0;
                            TypeHeaderView.z((TypeHeaderView) ((e92) F.d.g).b, CollectionsKt.S0(CollectionsKt.V0(arrayList3)), null, 2);
                        }
                        xw3.L(wca.x(featuredTournamentFragment.getLifecycle()), r5, r5, new yp7(featuredTournamentFragment, cupTreesResponse, (rq3) r5, 1), 3);
                        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = jv7Var.c;
                        if (playerOfTheSeasonResponse != null) {
                            nue nueVar = (nue) featuredTournamentFragment.y.getValue();
                            qv7Var.getClass();
                            nueVar.l(270, 71636, playerOfTheSeasonResponse, Sports.FOOTBALL, new zu7(featuredTournamentFragment, 5), Integer.valueOf(R.color.color_afcon));
                        }
                        TopPerformanceResponse topPerformanceResponse = jv7Var.d;
                        if (topPerformanceResponse != null) {
                            Object topPerformanceItems = topPerformanceResponse.getTopPerformanceItems();
                            RatedTopPlayersStatistics ratedTopPlayersStatistics = topPerformanceItems instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) topPerformanceItems : r5;
                            if (ratedTopPlayersStatistics != null) {
                                cue cueVar = (cue) featuredTournamentFragment.z.getValue();
                                List<TopPlayersStatisticsItem<? extends BaseTopPlayersStatisticsItem>> rating = ratedTopPlayersStatistics.getRating();
                                Object ineligibleTopPlayers = topPerformanceResponse.getIneligibleTopPlayers();
                                RatedTopPlayersStatistics ratedTopPlayersStatistics2 = ineligibleTopPlayers instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) ineligibleTopPlayers : r5;
                                cueVar.j(rating, ratedTopPlayersStatistics2 != null ? ratedTopPlayersStatistics2.getRating() : r5, true, new zu7(featuredTournamentFragment, 6), new n37(26, featuredTournamentFragment, qv7Var), new go7(15));
                            }
                        }
                        if (list7 != null) {
                            if (!list7.isEmpty()) {
                                Iterator it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    if (((TournamentRoundWrapper) it5.next()).getHasTotw()) {
                                        z = true;
                                        bool = Boolean.valueOf(z);
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        } else {
                            bool = r5;
                        }
                        if (Intrinsics.c(bool, Boolean.TRUE)) {
                            ((dyi) joaVar.getValue()).setVisibility(0);
                            ((dyi) joaVar.getValue()).setOnItemSelectedCallback(new bv7(featuredTournamentFragment, qv7Var, 1));
                            dyi dyiVar = (dyi) joaVar.getValue();
                            Integer valueOf2 = uniqueTournamentDetails != null ? Integer.valueOf(uniqueTournamentDetails.getId()) : r5;
                            String slug = (uniqueTournamentDetails == null || (category2 = uniqueTournamentDetails.getCategory()) == null || (sport = category2.getSport()) == null) ? r5 : sport.getSlug();
                            if (list7 == null) {
                                list7 = km5.a;
                            }
                            List list9 = list7;
                            qv7Var.getClass();
                            String slug2 = (uniqueTournamentDetails == null || (category = uniqueTournamentDetails.getCategory()) == null) ? r5 : category.getSlug();
                            String str4 = slug2 == null ? "" : slug2;
                            String slug3 = uniqueTournamentDetails != null ? uniqueTournamentDetails.getSlug() : r5;
                            dyiVar.l(valueOf2, slug, list9, null, 71636, false, str4, slug3 == null ? "" : slug3);
                        }
                        break;
                    case 3:
                        List list10 = (List) obj22;
                        yu7 D2 = featuredTournamentFragment.D();
                        list10.getClass();
                        D2.F(list10);
                        krk krkVar7 = featuredTournamentFragment.l;
                        krkVar7.getClass();
                        ((jo8) krkVar7).e.scrollToPosition(0);
                        if (featuredTournamentFragment.H) {
                            featuredTournamentFragment.H = false;
                            r2.p(featuredTournamentFragment.D().g.size(), (AdBannerView) featuredTournamentFragment.w.getValue());
                            g7.o(featuredTournamentFragment.D(), (FrameLayout) featuredTournamentFragment.B.getValue(), 2);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.F(), 6);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.E(), 6);
                            g7.o(featuredTournamentFragment.D(), (nue) featuredTournamentFragment.y.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (cue) featuredTournamentFragment.z.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (AdBannerView) featuredTournamentFragment.x.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (dyi) featuredTournamentFragment.A.getValue(), 6);
                            PromotionalOffersBannerView promotionalOffersBannerView2 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                            if (promotionalOffersBannerView2 != null) {
                                g7.o(featuredTournamentFragment.D(), promotionalOffersBannerView2, 6);
                            }
                            GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) featuredTournamentFragment.F.getValue();
                            if (gambleRegulationFooterView != null) {
                                g7.o(featuredTournamentFragment.D(), gambleRegulationFooterView, 6);
                            }
                        }
                        if (featuredTournamentFragment.D().h.contains(featuredTournamentFragment.F()) && featuredTournamentFragment.G && featuredTournamentFragment.F().k) {
                            jo8 jo8Var = (jo8) featuredTournamentFragment.l;
                            ZonedDateTime currentDate = jo8Var != null ? jo8Var.b.getCurrentDate() : null;
                            if (currentDate != null && (localDate = currentDate.toLocalDate()) != null && localDate.compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.c) >= 0) {
                                UniqueTournamentGroup uniqueTournamentGroup = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                if (uniqueTournamentGroup == null || (groupName = uniqueTournamentGroup.getGroupName()) == null) {
                                    str2 = null;
                                } else {
                                    str2 = groupName.toLowerCase(Locale.ROOT);
                                    str2.getClass();
                                }
                                if (Intrinsics.c(str2, "third-placed teams")) {
                                    UniqueTournamentGroup uniqueTournamentGroup2 = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                    if (uniqueTournamentGroup2 != null) {
                                        str = uniqueTournamentGroup2.getGroupName();
                                        featuredTournamentFragment.G = false;
                                        if (str != null) {
                                            tv7 F2 = featuredTournamentFragment.F();
                                            F2.getClass();
                                            ((TypeHeaderView) ((e92) F2.d.g).b).t(str, true);
                                        }
                                    }
                                    str = null;
                                    featuredTournamentFragment.G = false;
                                    if (str != null) {
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list10) {
                                if (ok3.D(((iv7) obj5).a)) {
                                    arrayList4.add(obj5);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                arrayList4 = null;
                            }
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                for (Object obj6 : list10) {
                                    iv7 iv7Var = (iv7) obj6;
                                    if (ok3.E(iv7Var.a) && Intrinsics.c(iv7Var.a.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    arrayList4 = null;
                                    break;
                                }
                            }
                            list10 = arrayList4;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj7 : list10) {
                                String groupName2 = ((iv7) obj7).a.getTournament().getGroupName();
                                Object obj8 = linkedHashMap3.get(groupName2);
                                if (obj8 == null) {
                                    obj8 = wv8.n(linkedHashMap3, groupName2);
                                }
                                ((List) obj8).add(obj7);
                            }
                            Iterator it6 = linkedHashMap3.entrySet().iterator();
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                if (it6.hasNext()) {
                                    int size = ((List) ((Map.Entry) next2).getValue()).size();
                                    do {
                                        Object next4 = it6.next();
                                        int size2 = ((List) ((Map.Entry) next4).getValue()).size();
                                        if (size < size2) {
                                            next2 = next4;
                                            size = size2;
                                        }
                                    } while (it6.hasNext());
                                }
                            } else {
                                next2 = null;
                            }
                            Map.Entry entry2 = (Map.Entry) next2;
                            if (entry2 != null) {
                                str = (String) entry2.getKey();
                                featuredTournamentFragment.G = false;
                                if (str != null) {
                                }
                            }
                            str = null;
                            featuredTournamentFragment.G = false;
                            if (str != null) {
                            }
                        }
                        break;
                    case 4:
                        dyi dyiVar2 = (dyi) featuredTournamentFragment.A.getValue();
                        dyiVar2.l = true;
                        dyiVar2.q = (TeamOfTheWeekResponse) obj22;
                        dyiVar2.o();
                        break;
                    case 5:
                        List list11 = (List) obj22;
                        if (list11 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj9 : list11) {
                                if (obj9 instanceof wai) {
                                    arrayList5.add(obj9);
                                }
                            }
                            waiVar = (wai) CollectionsKt.Y(arrayList5);
                        } else {
                            waiVar = null;
                        }
                        if (list11 != null) {
                            arrayList = new ArrayList();
                            for (Object obj10 : list11) {
                                if (obj10 instanceof bbi) {
                                    arrayList.add(obj10);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (list11 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj11 : list11) {
                                if (obj11 instanceof x9i) {
                                    arrayList6.add(obj11);
                                }
                            }
                            x9iVar = (x9i) CollectionsKt.firstOrNull(arrayList6);
                        } else {
                            x9iVar = null;
                        }
                        if (x9iVar != null) {
                            x9iVar.i = false;
                        }
                        if (waiVar != null && arrayList != null) {
                            tv7 F3 = featuredTournamentFragment.F();
                            F3.getClass();
                            F3.f = waiVar;
                            F3.g = arrayList;
                            F3.h = x9iVar;
                            F3.j();
                        }
                        break;
                    default:
                        List list12 = (List) obj22;
                        PromotionalOffersBannerView promotionalOffersBannerView22 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                        if (promotionalOffersBannerView22 != null) {
                            list12.getClass();
                            featuredTournamentFragment.G().i.getClass();
                            PromotionalOffersBannerView.j(promotionalOffersBannerView22, list12, new tdf(0, 270), fv.FEATURED_TOURNAMENT);
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i6 = 4;
        G().s.e(getViewLifecycleOwner(), new z1(14, new Function1(this) { // from class: av7
            public final /* synthetic */ FeaturedTournamentFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:130:0x0272, code lost:
            
                if (r2 == null) goto L106;
             */
            /* JADX WARN: Removed duplicated region for block: B:323:0x07fd  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.CoroutineContext, nu3, rq3] */
            /* JADX WARN: Type inference failed for: r5v5 */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj22) {
                List list;
                LinkedHashMap linkedHashMap2;
                Map.Entry entry;
                int intValue;
                Object next;
                Function1 function1;
                joa joaVar;
                ?? r5;
                Boolean bool;
                Category category;
                Category category2;
                Sport sport;
                boolean z;
                Object next2;
                String str;
                LocalDate localDate;
                String str2;
                String groupName;
                wai waiVar;
                ArrayList arrayList;
                x9i x9iVar;
                int i42 = i6;
                FeaturedTournamentFragment featuredTournamentFragment = this.b;
                int i52 = 1;
                switch (i42) {
                    case 0:
                        ZonedDateTime zonedDateTime = (ZonedDateTime) obj22;
                        zonedDateTime.getClass();
                        featuredTournamentFragment.G = true;
                        featuredTournamentFragment.G().k(zonedDateTime);
                        featuredTournamentFragment.F().setVisibility(zonedDateTime.toLocalDate().compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.d) <= 0 ? 0 : 8);
                        break;
                    case 1:
                        List list2 = (List) obj22;
                        krk krkVar32 = featuredTournamentFragment.l;
                        krkVar32.getClass();
                        FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = ((jo8) krkVar32).b;
                        mg2 mg2Var = featuredTournamentCalendarRailView.a;
                        if (list2 != null && !list2.isEmpty() && ((list = featuredTournamentCalendarRailView.d) == null || !(!list.isEmpty()))) {
                            featuredTournamentCalendarRailView.d = list2;
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(LocalDate.parse((String) it.next(), DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.systemDefault()));
                            }
                            mg2Var.F(arrayList2);
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.getClass();
                            bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                            long timeInMillis = calendar2.getTimeInMillis() / 1000;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            String i62 = fc6.i(timeInMillis, hk4.a(bi4Var.d()));
                            List list3 = featuredTournamentCalendarRailView.d;
                            if (list3 == null || !list3.contains(i62)) {
                                List list4 = featuredTournamentCalendarRailView.d;
                                if (list4 != null) {
                                    int c = sub.c(k13.r(list4, 10));
                                    if (c < 16) {
                                        c = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(c);
                                    for (Object obj3 : list4) {
                                        Date parse = featuredTournamentCalendarRailView.c.parse((String) obj3);
                                        if (parse == null) {
                                            parse = new Date();
                                        }
                                        linkedHashMap2.put(obj3, parse);
                                    }
                                } else {
                                    linkedHashMap2 = null;
                                }
                                if (linkedHashMap2 != null) {
                                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            long abs = Math.abs(((Date) ((Map.Entry) next).getValue()).getTime() - calendar.getTimeInMillis());
                                            do {
                                                Object next3 = it2.next();
                                                long abs2 = Math.abs(((Date) ((Map.Entry) next3).getValue()).getTime() - calendar.getTimeInMillis());
                                                if (abs > abs2) {
                                                    next = next3;
                                                    abs = abs2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    entry = (Map.Entry) next;
                                } else {
                                    entry = null;
                                }
                                List list5 = featuredTournamentCalendarRailView.d;
                                if (list5 != null) {
                                    Iterator it3 = list5.iterator();
                                    int i7 = 0;
                                    while (true) {
                                        if (it3.hasNext()) {
                                            String str3 = (String) it3.next();
                                            int i8 = FeaturedTournamentCalendarRailView.f;
                                            str3.getClass();
                                            if (!Intrinsics.c(str3, entry != null ? (String) entry.getKey() : null)) {
                                                i7++;
                                            }
                                        } else {
                                            i7 = -1;
                                        }
                                    }
                                    Integer valueOf = i7 == -1 ? null : Integer.valueOf(i7);
                                    if (valueOf != null) {
                                        intValue = valueOf.intValue();
                                        int i9222222222222 = mg2Var.m;
                                        mg2Var.m = intValue;
                                        mg2Var.notifyItemChanged(intValue);
                                        mg2Var.notifyItemChanged(i9222222222222);
                                        function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                        if (function1 != null) {
                                            Object obj4 = arrayList2.get(intValue);
                                            obj4.getClass();
                                            function1.invoke(obj4);
                                        }
                                        featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                        featuredTournamentCalendarRailView.requestLayout();
                                    }
                                }
                                intValue = 0;
                                int i92222222222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i92222222222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            } else {
                                List list6 = featuredTournamentCalendarRailView.d;
                                if (list6 != null) {
                                    intValue = list6.indexOf(i62);
                                    int i922222222222222 = mg2Var.m;
                                    mg2Var.m = intValue;
                                    mg2Var.notifyItemChanged(intValue);
                                    mg2Var.notifyItemChanged(i922222222222222);
                                    function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                    if (function1 != null) {
                                    }
                                    featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                    featuredTournamentCalendarRailView.requestLayout();
                                }
                                intValue = 0;
                                int i9222222222222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i9222222222222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            }
                        }
                        break;
                    case 2:
                        joa joaVar2 = featuredTournamentFragment.A;
                        jv7 jv7Var = (jv7) obj22;
                        featuredTournamentFragment.n();
                        UniqueTournamentDetails uniqueTournamentDetails = jv7Var.a;
                        List list7 = jv7Var.e;
                        List list8 = jv7Var.b;
                        CupTreesResponse cupTreesResponse = jv7Var.f;
                        boolean z2 = uniqueTournamentDetails == null && list8 == null && cupTreesResponse == null;
                        krk krkVar42 = featuredTournamentFragment.l;
                        krkVar42.getClass();
                        ((jo8) krkVar42).c.setVisibility(z2 ? 0 : 8);
                        krk krkVar52 = featuredTournamentFragment.l;
                        krkVar52.getClass();
                        ((jo8) krkVar52).e.setVisibility(!z2 ? 0 : 8);
                        featuredTournamentFragment.E().setVisibility(cupTreesResponse != null ? 0 : 8);
                        if (!z2) {
                            FragmentActivity activity = featuredTournamentFragment.getActivity();
                            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                            if (mainActivity != null) {
                                mainActivity.d0(uniqueTournamentDetails);
                            }
                        }
                        qv7 qv7Var = featuredTournamentFragment.G().i;
                        if (uniqueTournamentDetails != null) {
                            krk krkVar62 = featuredTournamentFragment.l;
                            krkVar62.getClass();
                            FeaturedTournamentHeaderView featuredTournamentHeaderView = ((jo8) krkVar62).d;
                            e92 e92Var = featuredTournamentHeaderView.a;
                            ((TextView) e92Var.b).setText(tba.y(uniqueTournamentDetails));
                            ((TextView) e92Var.b).setTextColor(featuredTournamentHeaderView.getContext().getColor(R.color.on_color_primary));
                            aba.y((ImageView) e92Var.c, 0, 3);
                            ((FeaturedTournamentHeaderView) e92Var.e).setOnClickListener(new au7(i52, featuredTournamentHeaderView, uniqueTournamentDetails));
                            long intValue2 = ((uniqueTournamentDetails.getStartDateTimestamp() != null ? r2.intValue() : 0L) * 1000) - Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis();
                            if (intValue2 > 0) {
                                Integer startDateTimestamp = uniqueTournamentDetails.getStartDateTimestamp();
                                Integer endDateTimestamp = uniqueTournamentDetails.getEndDateTimestamp();
                                e92 e92Var2 = featuredTournamentHeaderView.c;
                                if (e92Var2 == null) {
                                    View inflate = ((ViewStub) e92Var.d).inflate();
                                    int i10 = R.id.days;
                                    View B = nq8.B(R.id.days, inflate);
                                    if (B != null) {
                                        t22 b = t22.b(B);
                                        i10 = R.id.hours;
                                        View B2 = nq8.B(R.id.hours, inflate);
                                        if (B2 != null) {
                                            t22 b2 = t22.b(B2);
                                            i10 = R.id.minutes;
                                            View B3 = nq8.B(R.id.minutes, inflate);
                                            if (B3 != null) {
                                                t22 b3 = t22.b(B3);
                                                i10 = R.id.seconds;
                                                View B4 = nq8.B(R.id.seconds, inflate);
                                                if (B4 != null) {
                                                    e92Var2 = new e92((LinearLayout) inflate, b, b2, b3, t22.b(B4), 25);
                                                    featuredTournamentHeaderView.c = e92Var2;
                                                }
                                            }
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                                    break;
                                }
                                ((t22) e92Var2.d).c.setText(R.string.days);
                                TextView textView = ((t22) e92Var2.b).c;
                                String string = featuredTournamentHeaderView.getContext().getString(R.string.hours);
                                string.getClass();
                                if (string.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    joaVar = joaVar2;
                                    char charAt = string.charAt(0);
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    sb.append((Object) CharsKt.c(charAt, locale));
                                    sb.append(string.substring(1));
                                    string = sb.toString();
                                } else {
                                    joaVar = joaVar2;
                                }
                                textView.setText(string);
                                ((t22) e92Var2.f).c.setText(R.string.minutes);
                                ((t22) e92Var2.c).c.setText(R.string.seconds);
                                pv7 pv7Var = featuredTournamentHeaderView.b;
                                if (pv7Var != null) {
                                    pv7Var.cancel();
                                }
                                pv7 pv7Var2 = new pv7(intValue2, e92Var2, featuredTournamentHeaderView, startDateTimestamp, endDateTimestamp);
                                featuredTournamentHeaderView.b = pv7Var2;
                                pv7Var2.start();
                            } else {
                                joaVar = joaVar2;
                                featuredTournamentHeaderView.f(uniqueTournamentDetails.getStartDateTimestamp(), uniqueTournamentDetails.getEndDateTimestamp());
                            }
                        } else {
                            joaVar = joaVar2;
                        }
                        tv7 F = featuredTournamentFragment.F();
                        bv7 bv7Var = new bv7(featuredTournamentFragment, qv7Var, 0);
                        F.getClass();
                        if (F.k || list8 == null || list8.isEmpty()) {
                            r5 = 0;
                        } else {
                            F.j = list8;
                            F.i = bv7Var;
                            F.k = true;
                            ArrayList arrayList3 = new ArrayList(k13.r(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((UniqueTournamentGroup) it4.next()).getGroupName());
                            }
                            r5 = 0;
                            TypeHeaderView.z((TypeHeaderView) ((e92) F.d.g).b, CollectionsKt.S0(CollectionsKt.V0(arrayList3)), null, 2);
                        }
                        xw3.L(wca.x(featuredTournamentFragment.getLifecycle()), r5, r5, new yp7(featuredTournamentFragment, cupTreesResponse, (rq3) r5, 1), 3);
                        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = jv7Var.c;
                        if (playerOfTheSeasonResponse != null) {
                            nue nueVar = (nue) featuredTournamentFragment.y.getValue();
                            qv7Var.getClass();
                            nueVar.l(270, 71636, playerOfTheSeasonResponse, Sports.FOOTBALL, new zu7(featuredTournamentFragment, 5), Integer.valueOf(R.color.color_afcon));
                        }
                        TopPerformanceResponse topPerformanceResponse = jv7Var.d;
                        if (topPerformanceResponse != null) {
                            Object topPerformanceItems = topPerformanceResponse.getTopPerformanceItems();
                            RatedTopPlayersStatistics ratedTopPlayersStatistics = topPerformanceItems instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) topPerformanceItems : r5;
                            if (ratedTopPlayersStatistics != null) {
                                cue cueVar = (cue) featuredTournamentFragment.z.getValue();
                                List<TopPlayersStatisticsItem<? extends BaseTopPlayersStatisticsItem>> rating = ratedTopPlayersStatistics.getRating();
                                Object ineligibleTopPlayers = topPerformanceResponse.getIneligibleTopPlayers();
                                RatedTopPlayersStatistics ratedTopPlayersStatistics2 = ineligibleTopPlayers instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) ineligibleTopPlayers : r5;
                                cueVar.j(rating, ratedTopPlayersStatistics2 != null ? ratedTopPlayersStatistics2.getRating() : r5, true, new zu7(featuredTournamentFragment, 6), new n37(26, featuredTournamentFragment, qv7Var), new go7(15));
                            }
                        }
                        if (list7 != null) {
                            if (!list7.isEmpty()) {
                                Iterator it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    if (((TournamentRoundWrapper) it5.next()).getHasTotw()) {
                                        z = true;
                                        bool = Boolean.valueOf(z);
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        } else {
                            bool = r5;
                        }
                        if (Intrinsics.c(bool, Boolean.TRUE)) {
                            ((dyi) joaVar.getValue()).setVisibility(0);
                            ((dyi) joaVar.getValue()).setOnItemSelectedCallback(new bv7(featuredTournamentFragment, qv7Var, 1));
                            dyi dyiVar = (dyi) joaVar.getValue();
                            Integer valueOf2 = uniqueTournamentDetails != null ? Integer.valueOf(uniqueTournamentDetails.getId()) : r5;
                            String slug = (uniqueTournamentDetails == null || (category2 = uniqueTournamentDetails.getCategory()) == null || (sport = category2.getSport()) == null) ? r5 : sport.getSlug();
                            if (list7 == null) {
                                list7 = km5.a;
                            }
                            List list9 = list7;
                            qv7Var.getClass();
                            String slug2 = (uniqueTournamentDetails == null || (category = uniqueTournamentDetails.getCategory()) == null) ? r5 : category.getSlug();
                            String str4 = slug2 == null ? "" : slug2;
                            String slug3 = uniqueTournamentDetails != null ? uniqueTournamentDetails.getSlug() : r5;
                            dyiVar.l(valueOf2, slug, list9, null, 71636, false, str4, slug3 == null ? "" : slug3);
                        }
                        break;
                    case 3:
                        List list10 = (List) obj22;
                        yu7 D2 = featuredTournamentFragment.D();
                        list10.getClass();
                        D2.F(list10);
                        krk krkVar7 = featuredTournamentFragment.l;
                        krkVar7.getClass();
                        ((jo8) krkVar7).e.scrollToPosition(0);
                        if (featuredTournamentFragment.H) {
                            featuredTournamentFragment.H = false;
                            r2.p(featuredTournamentFragment.D().g.size(), (AdBannerView) featuredTournamentFragment.w.getValue());
                            g7.o(featuredTournamentFragment.D(), (FrameLayout) featuredTournamentFragment.B.getValue(), 2);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.F(), 6);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.E(), 6);
                            g7.o(featuredTournamentFragment.D(), (nue) featuredTournamentFragment.y.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (cue) featuredTournamentFragment.z.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (AdBannerView) featuredTournamentFragment.x.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (dyi) featuredTournamentFragment.A.getValue(), 6);
                            PromotionalOffersBannerView promotionalOffersBannerView2 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                            if (promotionalOffersBannerView2 != null) {
                                g7.o(featuredTournamentFragment.D(), promotionalOffersBannerView2, 6);
                            }
                            GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) featuredTournamentFragment.F.getValue();
                            if (gambleRegulationFooterView != null) {
                                g7.o(featuredTournamentFragment.D(), gambleRegulationFooterView, 6);
                            }
                        }
                        if (featuredTournamentFragment.D().h.contains(featuredTournamentFragment.F()) && featuredTournamentFragment.G && featuredTournamentFragment.F().k) {
                            jo8 jo8Var = (jo8) featuredTournamentFragment.l;
                            ZonedDateTime currentDate = jo8Var != null ? jo8Var.b.getCurrentDate() : null;
                            if (currentDate != null && (localDate = currentDate.toLocalDate()) != null && localDate.compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.c) >= 0) {
                                UniqueTournamentGroup uniqueTournamentGroup = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                if (uniqueTournamentGroup == null || (groupName = uniqueTournamentGroup.getGroupName()) == null) {
                                    str2 = null;
                                } else {
                                    str2 = groupName.toLowerCase(Locale.ROOT);
                                    str2.getClass();
                                }
                                if (Intrinsics.c(str2, "third-placed teams")) {
                                    UniqueTournamentGroup uniqueTournamentGroup2 = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                    if (uniqueTournamentGroup2 != null) {
                                        str = uniqueTournamentGroup2.getGroupName();
                                        featuredTournamentFragment.G = false;
                                        if (str != null) {
                                            tv7 F2 = featuredTournamentFragment.F();
                                            F2.getClass();
                                            ((TypeHeaderView) ((e92) F2.d.g).b).t(str, true);
                                        }
                                    }
                                    str = null;
                                    featuredTournamentFragment.G = false;
                                    if (str != null) {
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list10) {
                                if (ok3.D(((iv7) obj5).a)) {
                                    arrayList4.add(obj5);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                arrayList4 = null;
                            }
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                for (Object obj6 : list10) {
                                    iv7 iv7Var = (iv7) obj6;
                                    if (ok3.E(iv7Var.a) && Intrinsics.c(iv7Var.a.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    arrayList4 = null;
                                    break;
                                }
                            }
                            list10 = arrayList4;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj7 : list10) {
                                String groupName2 = ((iv7) obj7).a.getTournament().getGroupName();
                                Object obj8 = linkedHashMap3.get(groupName2);
                                if (obj8 == null) {
                                    obj8 = wv8.n(linkedHashMap3, groupName2);
                                }
                                ((List) obj8).add(obj7);
                            }
                            Iterator it6 = linkedHashMap3.entrySet().iterator();
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                if (it6.hasNext()) {
                                    int size = ((List) ((Map.Entry) next2).getValue()).size();
                                    do {
                                        Object next4 = it6.next();
                                        int size2 = ((List) ((Map.Entry) next4).getValue()).size();
                                        if (size < size2) {
                                            next2 = next4;
                                            size = size2;
                                        }
                                    } while (it6.hasNext());
                                }
                            } else {
                                next2 = null;
                            }
                            Map.Entry entry2 = (Map.Entry) next2;
                            if (entry2 != null) {
                                str = (String) entry2.getKey();
                                featuredTournamentFragment.G = false;
                                if (str != null) {
                                }
                            }
                            str = null;
                            featuredTournamentFragment.G = false;
                            if (str != null) {
                            }
                        }
                        break;
                    case 4:
                        dyi dyiVar2 = (dyi) featuredTournamentFragment.A.getValue();
                        dyiVar2.l = true;
                        dyiVar2.q = (TeamOfTheWeekResponse) obj22;
                        dyiVar2.o();
                        break;
                    case 5:
                        List list11 = (List) obj22;
                        if (list11 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj9 : list11) {
                                if (obj9 instanceof wai) {
                                    arrayList5.add(obj9);
                                }
                            }
                            waiVar = (wai) CollectionsKt.Y(arrayList5);
                        } else {
                            waiVar = null;
                        }
                        if (list11 != null) {
                            arrayList = new ArrayList();
                            for (Object obj10 : list11) {
                                if (obj10 instanceof bbi) {
                                    arrayList.add(obj10);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (list11 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj11 : list11) {
                                if (obj11 instanceof x9i) {
                                    arrayList6.add(obj11);
                                }
                            }
                            x9iVar = (x9i) CollectionsKt.firstOrNull(arrayList6);
                        } else {
                            x9iVar = null;
                        }
                        if (x9iVar != null) {
                            x9iVar.i = false;
                        }
                        if (waiVar != null && arrayList != null) {
                            tv7 F3 = featuredTournamentFragment.F();
                            F3.getClass();
                            F3.f = waiVar;
                            F3.g = arrayList;
                            F3.h = x9iVar;
                            F3.j();
                        }
                        break;
                    default:
                        List list12 = (List) obj22;
                        PromotionalOffersBannerView promotionalOffersBannerView22 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                        if (promotionalOffersBannerView22 != null) {
                            list12.getClass();
                            featuredTournamentFragment.G().i.getClass();
                            PromotionalOffersBannerView.j(promotionalOffersBannerView22, list12, new tdf(0, 270), fv.FEATURED_TOURNAMENT);
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i7 = 5;
        ((rbi) this.u.getValue()).i.e(getViewLifecycleOwner(), new z1(14, new Function1(this) { // from class: av7
            public final /* synthetic */ FeaturedTournamentFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:130:0x0272, code lost:
            
                if (r2 == null) goto L106;
             */
            /* JADX WARN: Removed duplicated region for block: B:323:0x07fd  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.CoroutineContext, nu3, rq3] */
            /* JADX WARN: Type inference failed for: r5v5 */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj22) {
                List list;
                LinkedHashMap linkedHashMap2;
                Map.Entry entry;
                int intValue;
                Object next;
                Function1 function1;
                joa joaVar;
                ?? r5;
                Boolean bool;
                Category category;
                Category category2;
                Sport sport;
                boolean z;
                Object next2;
                String str;
                LocalDate localDate;
                String str2;
                String groupName;
                wai waiVar;
                ArrayList arrayList;
                x9i x9iVar;
                int i42 = i7;
                FeaturedTournamentFragment featuredTournamentFragment = this.b;
                int i52 = 1;
                switch (i42) {
                    case 0:
                        ZonedDateTime zonedDateTime = (ZonedDateTime) obj22;
                        zonedDateTime.getClass();
                        featuredTournamentFragment.G = true;
                        featuredTournamentFragment.G().k(zonedDateTime);
                        featuredTournamentFragment.F().setVisibility(zonedDateTime.toLocalDate().compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.d) <= 0 ? 0 : 8);
                        break;
                    case 1:
                        List list2 = (List) obj22;
                        krk krkVar32 = featuredTournamentFragment.l;
                        krkVar32.getClass();
                        FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = ((jo8) krkVar32).b;
                        mg2 mg2Var = featuredTournamentCalendarRailView.a;
                        if (list2 != null && !list2.isEmpty() && ((list = featuredTournamentCalendarRailView.d) == null || !(!list.isEmpty()))) {
                            featuredTournamentCalendarRailView.d = list2;
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(LocalDate.parse((String) it.next(), DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.systemDefault()));
                            }
                            mg2Var.F(arrayList2);
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.getClass();
                            bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                            long timeInMillis = calendar2.getTimeInMillis() / 1000;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            String i62 = fc6.i(timeInMillis, hk4.a(bi4Var.d()));
                            List list3 = featuredTournamentCalendarRailView.d;
                            if (list3 == null || !list3.contains(i62)) {
                                List list4 = featuredTournamentCalendarRailView.d;
                                if (list4 != null) {
                                    int c = sub.c(k13.r(list4, 10));
                                    if (c < 16) {
                                        c = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(c);
                                    for (Object obj3 : list4) {
                                        Date parse = featuredTournamentCalendarRailView.c.parse((String) obj3);
                                        if (parse == null) {
                                            parse = new Date();
                                        }
                                        linkedHashMap2.put(obj3, parse);
                                    }
                                } else {
                                    linkedHashMap2 = null;
                                }
                                if (linkedHashMap2 != null) {
                                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            long abs = Math.abs(((Date) ((Map.Entry) next).getValue()).getTime() - calendar.getTimeInMillis());
                                            do {
                                                Object next3 = it2.next();
                                                long abs2 = Math.abs(((Date) ((Map.Entry) next3).getValue()).getTime() - calendar.getTimeInMillis());
                                                if (abs > abs2) {
                                                    next = next3;
                                                    abs = abs2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    entry = (Map.Entry) next;
                                } else {
                                    entry = null;
                                }
                                List list5 = featuredTournamentCalendarRailView.d;
                                if (list5 != null) {
                                    Iterator it3 = list5.iterator();
                                    int i72 = 0;
                                    while (true) {
                                        if (it3.hasNext()) {
                                            String str3 = (String) it3.next();
                                            int i8 = FeaturedTournamentCalendarRailView.f;
                                            str3.getClass();
                                            if (!Intrinsics.c(str3, entry != null ? (String) entry.getKey() : null)) {
                                                i72++;
                                            }
                                        } else {
                                            i72 = -1;
                                        }
                                    }
                                    Integer valueOf = i72 == -1 ? null : Integer.valueOf(i72);
                                    if (valueOf != null) {
                                        intValue = valueOf.intValue();
                                        int i9222222222222222 = mg2Var.m;
                                        mg2Var.m = intValue;
                                        mg2Var.notifyItemChanged(intValue);
                                        mg2Var.notifyItemChanged(i9222222222222222);
                                        function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                        if (function1 != null) {
                                            Object obj4 = arrayList2.get(intValue);
                                            obj4.getClass();
                                            function1.invoke(obj4);
                                        }
                                        featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                        featuredTournamentCalendarRailView.requestLayout();
                                    }
                                }
                                intValue = 0;
                                int i92222222222222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i92222222222222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            } else {
                                List list6 = featuredTournamentCalendarRailView.d;
                                if (list6 != null) {
                                    intValue = list6.indexOf(i62);
                                    int i922222222222222222 = mg2Var.m;
                                    mg2Var.m = intValue;
                                    mg2Var.notifyItemChanged(intValue);
                                    mg2Var.notifyItemChanged(i922222222222222222);
                                    function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                    if (function1 != null) {
                                    }
                                    featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                    featuredTournamentCalendarRailView.requestLayout();
                                }
                                intValue = 0;
                                int i9222222222222222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i9222222222222222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            }
                        }
                        break;
                    case 2:
                        joa joaVar2 = featuredTournamentFragment.A;
                        jv7 jv7Var = (jv7) obj22;
                        featuredTournamentFragment.n();
                        UniqueTournamentDetails uniqueTournamentDetails = jv7Var.a;
                        List list7 = jv7Var.e;
                        List list8 = jv7Var.b;
                        CupTreesResponse cupTreesResponse = jv7Var.f;
                        boolean z2 = uniqueTournamentDetails == null && list8 == null && cupTreesResponse == null;
                        krk krkVar42 = featuredTournamentFragment.l;
                        krkVar42.getClass();
                        ((jo8) krkVar42).c.setVisibility(z2 ? 0 : 8);
                        krk krkVar52 = featuredTournamentFragment.l;
                        krkVar52.getClass();
                        ((jo8) krkVar52).e.setVisibility(!z2 ? 0 : 8);
                        featuredTournamentFragment.E().setVisibility(cupTreesResponse != null ? 0 : 8);
                        if (!z2) {
                            FragmentActivity activity = featuredTournamentFragment.getActivity();
                            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                            if (mainActivity != null) {
                                mainActivity.d0(uniqueTournamentDetails);
                            }
                        }
                        qv7 qv7Var = featuredTournamentFragment.G().i;
                        if (uniqueTournamentDetails != null) {
                            krk krkVar62 = featuredTournamentFragment.l;
                            krkVar62.getClass();
                            FeaturedTournamentHeaderView featuredTournamentHeaderView = ((jo8) krkVar62).d;
                            e92 e92Var = featuredTournamentHeaderView.a;
                            ((TextView) e92Var.b).setText(tba.y(uniqueTournamentDetails));
                            ((TextView) e92Var.b).setTextColor(featuredTournamentHeaderView.getContext().getColor(R.color.on_color_primary));
                            aba.y((ImageView) e92Var.c, 0, 3);
                            ((FeaturedTournamentHeaderView) e92Var.e).setOnClickListener(new au7(i52, featuredTournamentHeaderView, uniqueTournamentDetails));
                            long intValue2 = ((uniqueTournamentDetails.getStartDateTimestamp() != null ? r2.intValue() : 0L) * 1000) - Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis();
                            if (intValue2 > 0) {
                                Integer startDateTimestamp = uniqueTournamentDetails.getStartDateTimestamp();
                                Integer endDateTimestamp = uniqueTournamentDetails.getEndDateTimestamp();
                                e92 e92Var2 = featuredTournamentHeaderView.c;
                                if (e92Var2 == null) {
                                    View inflate = ((ViewStub) e92Var.d).inflate();
                                    int i10 = R.id.days;
                                    View B = nq8.B(R.id.days, inflate);
                                    if (B != null) {
                                        t22 b = t22.b(B);
                                        i10 = R.id.hours;
                                        View B2 = nq8.B(R.id.hours, inflate);
                                        if (B2 != null) {
                                            t22 b2 = t22.b(B2);
                                            i10 = R.id.minutes;
                                            View B3 = nq8.B(R.id.minutes, inflate);
                                            if (B3 != null) {
                                                t22 b3 = t22.b(B3);
                                                i10 = R.id.seconds;
                                                View B4 = nq8.B(R.id.seconds, inflate);
                                                if (B4 != null) {
                                                    e92Var2 = new e92((LinearLayout) inflate, b, b2, b3, t22.b(B4), 25);
                                                    featuredTournamentHeaderView.c = e92Var2;
                                                }
                                            }
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                                    break;
                                }
                                ((t22) e92Var2.d).c.setText(R.string.days);
                                TextView textView = ((t22) e92Var2.b).c;
                                String string = featuredTournamentHeaderView.getContext().getString(R.string.hours);
                                string.getClass();
                                if (string.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    joaVar = joaVar2;
                                    char charAt = string.charAt(0);
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    sb.append((Object) CharsKt.c(charAt, locale));
                                    sb.append(string.substring(1));
                                    string = sb.toString();
                                } else {
                                    joaVar = joaVar2;
                                }
                                textView.setText(string);
                                ((t22) e92Var2.f).c.setText(R.string.minutes);
                                ((t22) e92Var2.c).c.setText(R.string.seconds);
                                pv7 pv7Var = featuredTournamentHeaderView.b;
                                if (pv7Var != null) {
                                    pv7Var.cancel();
                                }
                                pv7 pv7Var2 = new pv7(intValue2, e92Var2, featuredTournamentHeaderView, startDateTimestamp, endDateTimestamp);
                                featuredTournamentHeaderView.b = pv7Var2;
                                pv7Var2.start();
                            } else {
                                joaVar = joaVar2;
                                featuredTournamentHeaderView.f(uniqueTournamentDetails.getStartDateTimestamp(), uniqueTournamentDetails.getEndDateTimestamp());
                            }
                        } else {
                            joaVar = joaVar2;
                        }
                        tv7 F = featuredTournamentFragment.F();
                        bv7 bv7Var = new bv7(featuredTournamentFragment, qv7Var, 0);
                        F.getClass();
                        if (F.k || list8 == null || list8.isEmpty()) {
                            r5 = 0;
                        } else {
                            F.j = list8;
                            F.i = bv7Var;
                            F.k = true;
                            ArrayList arrayList3 = new ArrayList(k13.r(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((UniqueTournamentGroup) it4.next()).getGroupName());
                            }
                            r5 = 0;
                            TypeHeaderView.z((TypeHeaderView) ((e92) F.d.g).b, CollectionsKt.S0(CollectionsKt.V0(arrayList3)), null, 2);
                        }
                        xw3.L(wca.x(featuredTournamentFragment.getLifecycle()), r5, r5, new yp7(featuredTournamentFragment, cupTreesResponse, (rq3) r5, 1), 3);
                        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = jv7Var.c;
                        if (playerOfTheSeasonResponse != null) {
                            nue nueVar = (nue) featuredTournamentFragment.y.getValue();
                            qv7Var.getClass();
                            nueVar.l(270, 71636, playerOfTheSeasonResponse, Sports.FOOTBALL, new zu7(featuredTournamentFragment, 5), Integer.valueOf(R.color.color_afcon));
                        }
                        TopPerformanceResponse topPerformanceResponse = jv7Var.d;
                        if (topPerformanceResponse != null) {
                            Object topPerformanceItems = topPerformanceResponse.getTopPerformanceItems();
                            RatedTopPlayersStatistics ratedTopPlayersStatistics = topPerformanceItems instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) topPerformanceItems : r5;
                            if (ratedTopPlayersStatistics != null) {
                                cue cueVar = (cue) featuredTournamentFragment.z.getValue();
                                List<TopPlayersStatisticsItem<? extends BaseTopPlayersStatisticsItem>> rating = ratedTopPlayersStatistics.getRating();
                                Object ineligibleTopPlayers = topPerformanceResponse.getIneligibleTopPlayers();
                                RatedTopPlayersStatistics ratedTopPlayersStatistics2 = ineligibleTopPlayers instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) ineligibleTopPlayers : r5;
                                cueVar.j(rating, ratedTopPlayersStatistics2 != null ? ratedTopPlayersStatistics2.getRating() : r5, true, new zu7(featuredTournamentFragment, 6), new n37(26, featuredTournamentFragment, qv7Var), new go7(15));
                            }
                        }
                        if (list7 != null) {
                            if (!list7.isEmpty()) {
                                Iterator it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    if (((TournamentRoundWrapper) it5.next()).getHasTotw()) {
                                        z = true;
                                        bool = Boolean.valueOf(z);
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        } else {
                            bool = r5;
                        }
                        if (Intrinsics.c(bool, Boolean.TRUE)) {
                            ((dyi) joaVar.getValue()).setVisibility(0);
                            ((dyi) joaVar.getValue()).setOnItemSelectedCallback(new bv7(featuredTournamentFragment, qv7Var, 1));
                            dyi dyiVar = (dyi) joaVar.getValue();
                            Integer valueOf2 = uniqueTournamentDetails != null ? Integer.valueOf(uniqueTournamentDetails.getId()) : r5;
                            String slug = (uniqueTournamentDetails == null || (category2 = uniqueTournamentDetails.getCategory()) == null || (sport = category2.getSport()) == null) ? r5 : sport.getSlug();
                            if (list7 == null) {
                                list7 = km5.a;
                            }
                            List list9 = list7;
                            qv7Var.getClass();
                            String slug2 = (uniqueTournamentDetails == null || (category = uniqueTournamentDetails.getCategory()) == null) ? r5 : category.getSlug();
                            String str4 = slug2 == null ? "" : slug2;
                            String slug3 = uniqueTournamentDetails != null ? uniqueTournamentDetails.getSlug() : r5;
                            dyiVar.l(valueOf2, slug, list9, null, 71636, false, str4, slug3 == null ? "" : slug3);
                        }
                        break;
                    case 3:
                        List list10 = (List) obj22;
                        yu7 D2 = featuredTournamentFragment.D();
                        list10.getClass();
                        D2.F(list10);
                        krk krkVar7 = featuredTournamentFragment.l;
                        krkVar7.getClass();
                        ((jo8) krkVar7).e.scrollToPosition(0);
                        if (featuredTournamentFragment.H) {
                            featuredTournamentFragment.H = false;
                            r2.p(featuredTournamentFragment.D().g.size(), (AdBannerView) featuredTournamentFragment.w.getValue());
                            g7.o(featuredTournamentFragment.D(), (FrameLayout) featuredTournamentFragment.B.getValue(), 2);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.F(), 6);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.E(), 6);
                            g7.o(featuredTournamentFragment.D(), (nue) featuredTournamentFragment.y.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (cue) featuredTournamentFragment.z.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (AdBannerView) featuredTournamentFragment.x.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (dyi) featuredTournamentFragment.A.getValue(), 6);
                            PromotionalOffersBannerView promotionalOffersBannerView2 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                            if (promotionalOffersBannerView2 != null) {
                                g7.o(featuredTournamentFragment.D(), promotionalOffersBannerView2, 6);
                            }
                            GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) featuredTournamentFragment.F.getValue();
                            if (gambleRegulationFooterView != null) {
                                g7.o(featuredTournamentFragment.D(), gambleRegulationFooterView, 6);
                            }
                        }
                        if (featuredTournamentFragment.D().h.contains(featuredTournamentFragment.F()) && featuredTournamentFragment.G && featuredTournamentFragment.F().k) {
                            jo8 jo8Var = (jo8) featuredTournamentFragment.l;
                            ZonedDateTime currentDate = jo8Var != null ? jo8Var.b.getCurrentDate() : null;
                            if (currentDate != null && (localDate = currentDate.toLocalDate()) != null && localDate.compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.c) >= 0) {
                                UniqueTournamentGroup uniqueTournamentGroup = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                if (uniqueTournamentGroup == null || (groupName = uniqueTournamentGroup.getGroupName()) == null) {
                                    str2 = null;
                                } else {
                                    str2 = groupName.toLowerCase(Locale.ROOT);
                                    str2.getClass();
                                }
                                if (Intrinsics.c(str2, "third-placed teams")) {
                                    UniqueTournamentGroup uniqueTournamentGroup2 = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                    if (uniqueTournamentGroup2 != null) {
                                        str = uniqueTournamentGroup2.getGroupName();
                                        featuredTournamentFragment.G = false;
                                        if (str != null) {
                                            tv7 F2 = featuredTournamentFragment.F();
                                            F2.getClass();
                                            ((TypeHeaderView) ((e92) F2.d.g).b).t(str, true);
                                        }
                                    }
                                    str = null;
                                    featuredTournamentFragment.G = false;
                                    if (str != null) {
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list10) {
                                if (ok3.D(((iv7) obj5).a)) {
                                    arrayList4.add(obj5);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                arrayList4 = null;
                            }
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                for (Object obj6 : list10) {
                                    iv7 iv7Var = (iv7) obj6;
                                    if (ok3.E(iv7Var.a) && Intrinsics.c(iv7Var.a.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    arrayList4 = null;
                                    break;
                                }
                            }
                            list10 = arrayList4;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj7 : list10) {
                                String groupName2 = ((iv7) obj7).a.getTournament().getGroupName();
                                Object obj8 = linkedHashMap3.get(groupName2);
                                if (obj8 == null) {
                                    obj8 = wv8.n(linkedHashMap3, groupName2);
                                }
                                ((List) obj8).add(obj7);
                            }
                            Iterator it6 = linkedHashMap3.entrySet().iterator();
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                if (it6.hasNext()) {
                                    int size = ((List) ((Map.Entry) next2).getValue()).size();
                                    do {
                                        Object next4 = it6.next();
                                        int size2 = ((List) ((Map.Entry) next4).getValue()).size();
                                        if (size < size2) {
                                            next2 = next4;
                                            size = size2;
                                        }
                                    } while (it6.hasNext());
                                }
                            } else {
                                next2 = null;
                            }
                            Map.Entry entry2 = (Map.Entry) next2;
                            if (entry2 != null) {
                                str = (String) entry2.getKey();
                                featuredTournamentFragment.G = false;
                                if (str != null) {
                                }
                            }
                            str = null;
                            featuredTournamentFragment.G = false;
                            if (str != null) {
                            }
                        }
                        break;
                    case 4:
                        dyi dyiVar2 = (dyi) featuredTournamentFragment.A.getValue();
                        dyiVar2.l = true;
                        dyiVar2.q = (TeamOfTheWeekResponse) obj22;
                        dyiVar2.o();
                        break;
                    case 5:
                        List list11 = (List) obj22;
                        if (list11 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj9 : list11) {
                                if (obj9 instanceof wai) {
                                    arrayList5.add(obj9);
                                }
                            }
                            waiVar = (wai) CollectionsKt.Y(arrayList5);
                        } else {
                            waiVar = null;
                        }
                        if (list11 != null) {
                            arrayList = new ArrayList();
                            for (Object obj10 : list11) {
                                if (obj10 instanceof bbi) {
                                    arrayList.add(obj10);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (list11 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj11 : list11) {
                                if (obj11 instanceof x9i) {
                                    arrayList6.add(obj11);
                                }
                            }
                            x9iVar = (x9i) CollectionsKt.firstOrNull(arrayList6);
                        } else {
                            x9iVar = null;
                        }
                        if (x9iVar != null) {
                            x9iVar.i = false;
                        }
                        if (waiVar != null && arrayList != null) {
                            tv7 F3 = featuredTournamentFragment.F();
                            F3.getClass();
                            F3.f = waiVar;
                            F3.g = arrayList;
                            F3.h = x9iVar;
                            F3.j();
                        }
                        break;
                    default:
                        List list12 = (List) obj22;
                        PromotionalOffersBannerView promotionalOffersBannerView22 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                        if (promotionalOffersBannerView22 != null) {
                            list12.getClass();
                            featuredTournamentFragment.G().i.getClass();
                            PromotionalOffersBannerView.j(promotionalOffersBannerView22, list12, new tdf(0, 270), fv.FEATURED_TOURNAMENT);
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        G().o.e(getViewLifecycleOwner(), new z1(14, new Function1(this) { // from class: av7
            public final /* synthetic */ FeaturedTournamentFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:130:0x0272, code lost:
            
                if (r2 == null) goto L106;
             */
            /* JADX WARN: Removed duplicated region for block: B:323:0x07fd  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.coroutines.CoroutineContext, nu3, rq3] */
            /* JADX WARN: Type inference failed for: r5v5 */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj22) {
                List list;
                LinkedHashMap linkedHashMap2;
                Map.Entry entry;
                int intValue;
                Object next;
                Function1 function1;
                joa joaVar;
                ?? r5;
                Boolean bool;
                Category category;
                Category category2;
                Sport sport;
                boolean z;
                Object next2;
                String str;
                LocalDate localDate;
                String str2;
                String groupName;
                wai waiVar;
                ArrayList arrayList;
                x9i x9iVar;
                int i42 = i;
                FeaturedTournamentFragment featuredTournamentFragment = this.b;
                int i52 = 1;
                switch (i42) {
                    case 0:
                        ZonedDateTime zonedDateTime = (ZonedDateTime) obj22;
                        zonedDateTime.getClass();
                        featuredTournamentFragment.G = true;
                        featuredTournamentFragment.G().k(zonedDateTime);
                        featuredTournamentFragment.F().setVisibility(zonedDateTime.toLocalDate().compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.d) <= 0 ? 0 : 8);
                        break;
                    case 1:
                        List list2 = (List) obj22;
                        krk krkVar32 = featuredTournamentFragment.l;
                        krkVar32.getClass();
                        FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = ((jo8) krkVar32).b;
                        mg2 mg2Var = featuredTournamentCalendarRailView.a;
                        if (list2 != null && !list2.isEmpty() && ((list = featuredTournamentCalendarRailView.d) == null || !(!list.isEmpty()))) {
                            featuredTournamentCalendarRailView.d = list2;
                            ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(LocalDate.parse((String) it.next(), DateTimeFormatter.ISO_DATE).atStartOfDay(ZoneId.systemDefault()));
                            }
                            mg2Var.F(arrayList2);
                            Calendar calendar = Calendar.getInstance();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.getClass();
                            bi4 bi4Var = bi4.PATTERN_NETWORK_YYMMDD;
                            long timeInMillis = calendar2.getTimeInMillis() / 1000;
                            ConcurrentHashMap concurrentHashMap = hk4.a;
                            String i62 = fc6.i(timeInMillis, hk4.a(bi4Var.d()));
                            List list3 = featuredTournamentCalendarRailView.d;
                            if (list3 == null || !list3.contains(i62)) {
                                List list4 = featuredTournamentCalendarRailView.d;
                                if (list4 != null) {
                                    int c = sub.c(k13.r(list4, 10));
                                    if (c < 16) {
                                        c = 16;
                                    }
                                    linkedHashMap2 = new LinkedHashMap(c);
                                    for (Object obj3 : list4) {
                                        Date parse = featuredTournamentCalendarRailView.c.parse((String) obj3);
                                        if (parse == null) {
                                            parse = new Date();
                                        }
                                        linkedHashMap2.put(obj3, parse);
                                    }
                                } else {
                                    linkedHashMap2 = null;
                                }
                                if (linkedHashMap2 != null) {
                                    Iterator it2 = linkedHashMap2.entrySet().iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            long abs = Math.abs(((Date) ((Map.Entry) next).getValue()).getTime() - calendar.getTimeInMillis());
                                            do {
                                                Object next3 = it2.next();
                                                long abs2 = Math.abs(((Date) ((Map.Entry) next3).getValue()).getTime() - calendar.getTimeInMillis());
                                                if (abs > abs2) {
                                                    next = next3;
                                                    abs = abs2;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    entry = (Map.Entry) next;
                                } else {
                                    entry = null;
                                }
                                List list5 = featuredTournamentCalendarRailView.d;
                                if (list5 != null) {
                                    Iterator it3 = list5.iterator();
                                    int i72 = 0;
                                    while (true) {
                                        if (it3.hasNext()) {
                                            String str3 = (String) it3.next();
                                            int i8 = FeaturedTournamentCalendarRailView.f;
                                            str3.getClass();
                                            if (!Intrinsics.c(str3, entry != null ? (String) entry.getKey() : null)) {
                                                i72++;
                                            }
                                        } else {
                                            i72 = -1;
                                        }
                                    }
                                    Integer valueOf = i72 == -1 ? null : Integer.valueOf(i72);
                                    if (valueOf != null) {
                                        intValue = valueOf.intValue();
                                        int i9222222222222222222 = mg2Var.m;
                                        mg2Var.m = intValue;
                                        mg2Var.notifyItemChanged(intValue);
                                        mg2Var.notifyItemChanged(i9222222222222222222);
                                        function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                        if (function1 != null) {
                                            Object obj4 = arrayList2.get(intValue);
                                            obj4.getClass();
                                            function1.invoke(obj4);
                                        }
                                        featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                        featuredTournamentCalendarRailView.requestLayout();
                                    }
                                }
                                intValue = 0;
                                int i92222222222222222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i92222222222222222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            } else {
                                List list6 = featuredTournamentCalendarRailView.d;
                                if (list6 != null) {
                                    intValue = list6.indexOf(i62);
                                    int i922222222222222222222 = mg2Var.m;
                                    mg2Var.m = intValue;
                                    mg2Var.notifyItemChanged(intValue);
                                    mg2Var.notifyItemChanged(i922222222222222222222);
                                    function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                    if (function1 != null) {
                                    }
                                    featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                    featuredTournamentCalendarRailView.requestLayout();
                                }
                                intValue = 0;
                                int i9222222222222222222222 = mg2Var.m;
                                mg2Var.m = intValue;
                                mg2Var.notifyItemChanged(intValue);
                                mg2Var.notifyItemChanged(i9222222222222222222222);
                                function1 = featuredTournamentCalendarRailView.dateClickCallback;
                                if (function1 != null) {
                                }
                                featuredTournamentCalendarRailView.post(new pn0(featuredTournamentCalendarRailView, intValue, 8));
                                featuredTournamentCalendarRailView.requestLayout();
                            }
                        }
                        break;
                    case 2:
                        joa joaVar2 = featuredTournamentFragment.A;
                        jv7 jv7Var = (jv7) obj22;
                        featuredTournamentFragment.n();
                        UniqueTournamentDetails uniqueTournamentDetails = jv7Var.a;
                        List list7 = jv7Var.e;
                        List list8 = jv7Var.b;
                        CupTreesResponse cupTreesResponse = jv7Var.f;
                        boolean z2 = uniqueTournamentDetails == null && list8 == null && cupTreesResponse == null;
                        krk krkVar42 = featuredTournamentFragment.l;
                        krkVar42.getClass();
                        ((jo8) krkVar42).c.setVisibility(z2 ? 0 : 8);
                        krk krkVar52 = featuredTournamentFragment.l;
                        krkVar52.getClass();
                        ((jo8) krkVar52).e.setVisibility(!z2 ? 0 : 8);
                        featuredTournamentFragment.E().setVisibility(cupTreesResponse != null ? 0 : 8);
                        if (!z2) {
                            FragmentActivity activity = featuredTournamentFragment.getActivity();
                            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                            if (mainActivity != null) {
                                mainActivity.d0(uniqueTournamentDetails);
                            }
                        }
                        qv7 qv7Var = featuredTournamentFragment.G().i;
                        if (uniqueTournamentDetails != null) {
                            krk krkVar62 = featuredTournamentFragment.l;
                            krkVar62.getClass();
                            FeaturedTournamentHeaderView featuredTournamentHeaderView = ((jo8) krkVar62).d;
                            e92 e92Var = featuredTournamentHeaderView.a;
                            ((TextView) e92Var.b).setText(tba.y(uniqueTournamentDetails));
                            ((TextView) e92Var.b).setTextColor(featuredTournamentHeaderView.getContext().getColor(R.color.on_color_primary));
                            aba.y((ImageView) e92Var.c, 0, 3);
                            ((FeaturedTournamentHeaderView) e92Var.e).setOnClickListener(new au7(i52, featuredTournamentHeaderView, uniqueTournamentDetails));
                            long intValue2 = ((uniqueTournamentDetails.getStartDateTimestamp() != null ? r2.intValue() : 0L) * 1000) - Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTimeInMillis();
                            if (intValue2 > 0) {
                                Integer startDateTimestamp = uniqueTournamentDetails.getStartDateTimestamp();
                                Integer endDateTimestamp = uniqueTournamentDetails.getEndDateTimestamp();
                                e92 e92Var2 = featuredTournamentHeaderView.c;
                                if (e92Var2 == null) {
                                    View inflate = ((ViewStub) e92Var.d).inflate();
                                    int i10 = R.id.days;
                                    View B = nq8.B(R.id.days, inflate);
                                    if (B != null) {
                                        t22 b = t22.b(B);
                                        i10 = R.id.hours;
                                        View B2 = nq8.B(R.id.hours, inflate);
                                        if (B2 != null) {
                                            t22 b2 = t22.b(B2);
                                            i10 = R.id.minutes;
                                            View B3 = nq8.B(R.id.minutes, inflate);
                                            if (B3 != null) {
                                                t22 b3 = t22.b(B3);
                                                i10 = R.id.seconds;
                                                View B4 = nq8.B(R.id.seconds, inflate);
                                                if (B4 != null) {
                                                    e92Var2 = new e92((LinearLayout) inflate, b, b2, b3, t22.b(B4), 25);
                                                    featuredTournamentHeaderView.c = e92Var2;
                                                }
                                            }
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
                                    break;
                                }
                                ((t22) e92Var2.d).c.setText(R.string.days);
                                TextView textView = ((t22) e92Var2.b).c;
                                String string = featuredTournamentHeaderView.getContext().getString(R.string.hours);
                                string.getClass();
                                if (string.length() > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    joaVar = joaVar2;
                                    char charAt = string.charAt(0);
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    sb.append((Object) CharsKt.c(charAt, locale));
                                    sb.append(string.substring(1));
                                    string = sb.toString();
                                } else {
                                    joaVar = joaVar2;
                                }
                                textView.setText(string);
                                ((t22) e92Var2.f).c.setText(R.string.minutes);
                                ((t22) e92Var2.c).c.setText(R.string.seconds);
                                pv7 pv7Var = featuredTournamentHeaderView.b;
                                if (pv7Var != null) {
                                    pv7Var.cancel();
                                }
                                pv7 pv7Var2 = new pv7(intValue2, e92Var2, featuredTournamentHeaderView, startDateTimestamp, endDateTimestamp);
                                featuredTournamentHeaderView.b = pv7Var2;
                                pv7Var2.start();
                            } else {
                                joaVar = joaVar2;
                                featuredTournamentHeaderView.f(uniqueTournamentDetails.getStartDateTimestamp(), uniqueTournamentDetails.getEndDateTimestamp());
                            }
                        } else {
                            joaVar = joaVar2;
                        }
                        tv7 F = featuredTournamentFragment.F();
                        bv7 bv7Var = new bv7(featuredTournamentFragment, qv7Var, 0);
                        F.getClass();
                        if (F.k || list8 == null || list8.isEmpty()) {
                            r5 = 0;
                        } else {
                            F.j = list8;
                            F.i = bv7Var;
                            F.k = true;
                            ArrayList arrayList3 = new ArrayList(k13.r(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((UniqueTournamentGroup) it4.next()).getGroupName());
                            }
                            r5 = 0;
                            TypeHeaderView.z((TypeHeaderView) ((e92) F.d.g).b, CollectionsKt.S0(CollectionsKt.V0(arrayList3)), null, 2);
                        }
                        xw3.L(wca.x(featuredTournamentFragment.getLifecycle()), r5, r5, new yp7(featuredTournamentFragment, cupTreesResponse, (rq3) r5, 1), 3);
                        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = jv7Var.c;
                        if (playerOfTheSeasonResponse != null) {
                            nue nueVar = (nue) featuredTournamentFragment.y.getValue();
                            qv7Var.getClass();
                            nueVar.l(270, 71636, playerOfTheSeasonResponse, Sports.FOOTBALL, new zu7(featuredTournamentFragment, 5), Integer.valueOf(R.color.color_afcon));
                        }
                        TopPerformanceResponse topPerformanceResponse = jv7Var.d;
                        if (topPerformanceResponse != null) {
                            Object topPerformanceItems = topPerformanceResponse.getTopPerformanceItems();
                            RatedTopPlayersStatistics ratedTopPlayersStatistics = topPerformanceItems instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) topPerformanceItems : r5;
                            if (ratedTopPlayersStatistics != null) {
                                cue cueVar = (cue) featuredTournamentFragment.z.getValue();
                                List<TopPlayersStatisticsItem<? extends BaseTopPlayersStatisticsItem>> rating = ratedTopPlayersStatistics.getRating();
                                Object ineligibleTopPlayers = topPerformanceResponse.getIneligibleTopPlayers();
                                RatedTopPlayersStatistics ratedTopPlayersStatistics2 = ineligibleTopPlayers instanceof RatedTopPlayersStatistics ? (RatedTopPlayersStatistics) ineligibleTopPlayers : r5;
                                cueVar.j(rating, ratedTopPlayersStatistics2 != null ? ratedTopPlayersStatistics2.getRating() : r5, true, new zu7(featuredTournamentFragment, 6), new n37(26, featuredTournamentFragment, qv7Var), new go7(15));
                            }
                        }
                        if (list7 != null) {
                            if (!list7.isEmpty()) {
                                Iterator it5 = list7.iterator();
                                while (it5.hasNext()) {
                                    if (((TournamentRoundWrapper) it5.next()).getHasTotw()) {
                                        z = true;
                                        bool = Boolean.valueOf(z);
                                    }
                                }
                            }
                            z = false;
                            bool = Boolean.valueOf(z);
                        } else {
                            bool = r5;
                        }
                        if (Intrinsics.c(bool, Boolean.TRUE)) {
                            ((dyi) joaVar.getValue()).setVisibility(0);
                            ((dyi) joaVar.getValue()).setOnItemSelectedCallback(new bv7(featuredTournamentFragment, qv7Var, 1));
                            dyi dyiVar = (dyi) joaVar.getValue();
                            Integer valueOf2 = uniqueTournamentDetails != null ? Integer.valueOf(uniqueTournamentDetails.getId()) : r5;
                            String slug = (uniqueTournamentDetails == null || (category2 = uniqueTournamentDetails.getCategory()) == null || (sport = category2.getSport()) == null) ? r5 : sport.getSlug();
                            if (list7 == null) {
                                list7 = km5.a;
                            }
                            List list9 = list7;
                            qv7Var.getClass();
                            String slug2 = (uniqueTournamentDetails == null || (category = uniqueTournamentDetails.getCategory()) == null) ? r5 : category.getSlug();
                            String str4 = slug2 == null ? "" : slug2;
                            String slug3 = uniqueTournamentDetails != null ? uniqueTournamentDetails.getSlug() : r5;
                            dyiVar.l(valueOf2, slug, list9, null, 71636, false, str4, slug3 == null ? "" : slug3);
                        }
                        break;
                    case 3:
                        List list10 = (List) obj22;
                        yu7 D2 = featuredTournamentFragment.D();
                        list10.getClass();
                        D2.F(list10);
                        krk krkVar7 = featuredTournamentFragment.l;
                        krkVar7.getClass();
                        ((jo8) krkVar7).e.scrollToPosition(0);
                        if (featuredTournamentFragment.H) {
                            featuredTournamentFragment.H = false;
                            r2.p(featuredTournamentFragment.D().g.size(), (AdBannerView) featuredTournamentFragment.w.getValue());
                            g7.o(featuredTournamentFragment.D(), (FrameLayout) featuredTournamentFragment.B.getValue(), 2);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.F(), 6);
                            g7.o(featuredTournamentFragment.D(), featuredTournamentFragment.E(), 6);
                            g7.o(featuredTournamentFragment.D(), (nue) featuredTournamentFragment.y.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (cue) featuredTournamentFragment.z.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (AdBannerView) featuredTournamentFragment.x.getValue(), 6);
                            g7.o(featuredTournamentFragment.D(), (dyi) featuredTournamentFragment.A.getValue(), 6);
                            PromotionalOffersBannerView promotionalOffersBannerView2 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                            if (promotionalOffersBannerView2 != null) {
                                g7.o(featuredTournamentFragment.D(), promotionalOffersBannerView2, 6);
                            }
                            GambleRegulationFooterView gambleRegulationFooterView = (GambleRegulationFooterView) featuredTournamentFragment.F.getValue();
                            if (gambleRegulationFooterView != null) {
                                g7.o(featuredTournamentFragment.D(), gambleRegulationFooterView, 6);
                            }
                        }
                        if (featuredTournamentFragment.D().h.contains(featuredTournamentFragment.F()) && featuredTournamentFragment.G && featuredTournamentFragment.F().k) {
                            jo8 jo8Var = (jo8) featuredTournamentFragment.l;
                            ZonedDateTime currentDate = jo8Var != null ? jo8Var.b.getCurrentDate() : null;
                            if (currentDate != null && (localDate = currentDate.toLocalDate()) != null && localDate.compareTo((ChronoLocalDate) featuredTournamentFragment.G().i.c) >= 0) {
                                UniqueTournamentGroup uniqueTournamentGroup = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                if (uniqueTournamentGroup == null || (groupName = uniqueTournamentGroup.getGroupName()) == null) {
                                    str2 = null;
                                } else {
                                    str2 = groupName.toLowerCase(Locale.ROOT);
                                    str2.getClass();
                                }
                                if (Intrinsics.c(str2, "third-placed teams")) {
                                    UniqueTournamentGroup uniqueTournamentGroup2 = (UniqueTournamentGroup) CollectionsKt.j0(featuredTournamentFragment.F().getTournamentGroups());
                                    if (uniqueTournamentGroup2 != null) {
                                        str = uniqueTournamentGroup2.getGroupName();
                                        featuredTournamentFragment.G = false;
                                        if (str != null) {
                                            tv7 F2 = featuredTournamentFragment.F();
                                            F2.getClass();
                                            ((TypeHeaderView) ((e92) F2.d.g).b).t(str, true);
                                        }
                                    }
                                    str = null;
                                    featuredTournamentFragment.G = false;
                                    if (str != null) {
                                    }
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj5 : list10) {
                                if (ok3.D(((iv7) obj5).a)) {
                                    arrayList4.add(obj5);
                                }
                            }
                            if (arrayList4.isEmpty()) {
                                arrayList4 = null;
                            }
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                for (Object obj6 : list10) {
                                    iv7 iv7Var = (iv7) obj6;
                                    if (ok3.E(iv7Var.a) && Intrinsics.c(iv7Var.a.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                                        arrayList4.add(obj6);
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    arrayList4 = null;
                                    break;
                                }
                            }
                            list10 = arrayList4;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Object obj7 : list10) {
                                String groupName2 = ((iv7) obj7).a.getTournament().getGroupName();
                                Object obj8 = linkedHashMap3.get(groupName2);
                                if (obj8 == null) {
                                    obj8 = wv8.n(linkedHashMap3, groupName2);
                                }
                                ((List) obj8).add(obj7);
                            }
                            Iterator it6 = linkedHashMap3.entrySet().iterator();
                            if (it6.hasNext()) {
                                next2 = it6.next();
                                if (it6.hasNext()) {
                                    int size = ((List) ((Map.Entry) next2).getValue()).size();
                                    do {
                                        Object next4 = it6.next();
                                        int size2 = ((List) ((Map.Entry) next4).getValue()).size();
                                        if (size < size2) {
                                            next2 = next4;
                                            size = size2;
                                        }
                                    } while (it6.hasNext());
                                }
                            } else {
                                next2 = null;
                            }
                            Map.Entry entry2 = (Map.Entry) next2;
                            if (entry2 != null) {
                                str = (String) entry2.getKey();
                                featuredTournamentFragment.G = false;
                                if (str != null) {
                                }
                            }
                            str = null;
                            featuredTournamentFragment.G = false;
                            if (str != null) {
                            }
                        }
                        break;
                    case 4:
                        dyi dyiVar2 = (dyi) featuredTournamentFragment.A.getValue();
                        dyiVar2.l = true;
                        dyiVar2.q = (TeamOfTheWeekResponse) obj22;
                        dyiVar2.o();
                        break;
                    case 5:
                        List list11 = (List) obj22;
                        if (list11 != null) {
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj9 : list11) {
                                if (obj9 instanceof wai) {
                                    arrayList5.add(obj9);
                                }
                            }
                            waiVar = (wai) CollectionsKt.Y(arrayList5);
                        } else {
                            waiVar = null;
                        }
                        if (list11 != null) {
                            arrayList = new ArrayList();
                            for (Object obj10 : list11) {
                                if (obj10 instanceof bbi) {
                                    arrayList.add(obj10);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (list11 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj11 : list11) {
                                if (obj11 instanceof x9i) {
                                    arrayList6.add(obj11);
                                }
                            }
                            x9iVar = (x9i) CollectionsKt.firstOrNull(arrayList6);
                        } else {
                            x9iVar = null;
                        }
                        if (x9iVar != null) {
                            x9iVar.i = false;
                        }
                        if (waiVar != null && arrayList != null) {
                            tv7 F3 = featuredTournamentFragment.F();
                            F3.getClass();
                            F3.f = waiVar;
                            F3.g = arrayList;
                            F3.h = x9iVar;
                            F3.j();
                        }
                        break;
                    default:
                        List list12 = (List) obj22;
                        PromotionalOffersBannerView promotionalOffersBannerView22 = (PromotionalOffersBannerView) featuredTournamentFragment.C.getValue();
                        if (promotionalOffersBannerView22 != null) {
                            list12.getClass();
                            featuredTournamentFragment.G().i.getClass();
                            PromotionalOffersBannerView.j(promotionalOffersBannerView22, list12, new tdf(0, 270), fv.FEATURED_TOURNAMENT);
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        u6b viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(t42.class);
        Object obj3 = linkedHashMap.get(orCreateKotlinClass3);
        if (obj3 == null) {
            obj3 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass3, obj3);
        }
        xw3.L(wca.x(viewLifecycleOwner3.getLifecycle()), null, null, new ev7(viewLifecycleOwner3, (b1d) obj3, this, null, this, 1), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        jo8 jo8Var = (jo8) this.l;
        ZonedDateTime currentDate = jo8Var != null ? jo8Var.b.getCurrentDate() : null;
        if (currentDate != null) {
            G().k(currentDate);
        }
    }
}
