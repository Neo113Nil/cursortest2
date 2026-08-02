package com.sofascore.results.league.fragment.topStats;

import android.os.Bundle;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.league.fragment.topStats.TopStatsFragment;
import defpackage.ava;
import defpackage.boj;
import defpackage.duf;
import defpackage.fuf;
import defpackage.hnj;
import defpackage.joa;
import defpackage.koj;
import defpackage.mqi;
import defpackage.otk;
import defpackage.q8i;
import defpackage.rnj;
import defpackage.tba;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yta;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/topStats/TopStatsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopStatsFragment extends Hilt_TopStatsFragment {
    public final otk r;
    public final otk s;
    public final mqi t;
    public final mqi u;
    public final mqi v;
    public final joa w;
    public final tc3 x;

    public TopStatsFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(yta.class), new hnj(this, 0), new hnj(this, 2), new hnj(this, 1));
        final int i4 = 3;
        this.s = new otk(fufVar.getOrCreateKotlinClass(koj.class), new hnj(this, 3), new hnj(this, 5), new hnj(this, 4));
        this.t = ypa.b(new Function0(this) { // from class: gnj
            public final /* synthetic */ TopStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                TopStatsFragment topStatsFragment = this.b;
                switch (i5) {
                    case 0:
                        return topStatsFragment.D().o();
                    case 1:
                        return ((Tournament) topStatsFragment.t.getValue()).getCategory().getSport().getSlug();
                    case 2:
                        return Boolean.valueOf(tz9.H(topStatsFragment.D().q));
                    default:
                        Bundle requireArguments = topStatsFragment.requireArguments();
                        requireArguments.getClass();
                        return (boj) gz8.M(requireArguments, "INITIAL_TOP_STATS_TYPE", boj.class);
                }
            }
        });
        this.u = ypa.b(new Function0(this) { // from class: gnj
            public final /* synthetic */ TopStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                TopStatsFragment topStatsFragment = this.b;
                switch (i5) {
                    case 0:
                        return topStatsFragment.D().o();
                    case 1:
                        return ((Tournament) topStatsFragment.t.getValue()).getCategory().getSport().getSlug();
                    case 2:
                        return Boolean.valueOf(tz9.H(topStatsFragment.D().q));
                    default:
                        Bundle requireArguments = topStatsFragment.requireArguments();
                        requireArguments.getClass();
                        return (boj) gz8.M(requireArguments, "INITIAL_TOP_STATS_TYPE", boj.class);
                }
            }
        });
        this.v = ypa.b(new Function0(this) { // from class: gnj
            public final /* synthetic */ TopStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                TopStatsFragment topStatsFragment = this.b;
                switch (i5) {
                    case 0:
                        return topStatsFragment.D().o();
                    case 1:
                        return ((Tournament) topStatsFragment.t.getValue()).getCategory().getSport().getSlug();
                    case 2:
                        return Boolean.valueOf(tz9.H(topStatsFragment.D().q));
                    default:
                        Bundle requireArguments = topStatsFragment.requireArguments();
                        requireArguments.getClass();
                        return (boj) gz8.M(requireArguments, "INITIAL_TOP_STATS_TYPE", boj.class);
                }
            }
        });
        this.w = ypa.a(ysa.c, new Function0(this) { // from class: gnj
            public final /* synthetic */ TopStatsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                TopStatsFragment topStatsFragment = this.b;
                switch (i5) {
                    case 0:
                        return topStatsFragment.D().o();
                    case 1:
                        return ((Tournament) topStatsFragment.t.getValue()).getCategory().getSport().getSlug();
                    case 2:
                        return Boolean.valueOf(tz9.H(topStatsFragment.D().q));
                    default:
                        Bundle requireArguments = topStatsFragment.requireArguments();
                        requireArguments.getClass();
                        return (boj) gz8.M(requireArguments, "INITIAL_TOP_STATS_TYPE", boj.class);
                }
            }
        });
        this.x = new tc3(863402040, new q8i(this, 29), true);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A, reason: from getter */
    public final tc3 getX() {
        return this.x;
    }

    public final yta D() {
        return (yta) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        l();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StatsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        String w;
        ArrayList arrayList = new ArrayList();
        ava avaVar = (ava) D().z.d();
        Boolean valueOf = avaVar != null ? Boolean.valueOf(avaVar.f) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.c(valueOf, bool)) {
            arrayList.add(boj.PLAYERS);
        }
        ava avaVar2 = (ava) D().z.d();
        if (Intrinsics.c(avaVar2 != null ? Boolean.valueOf(avaVar2.h) : null, bool)) {
            arrayList.add(boj.TEAMS);
        }
        ava avaVar3 = (ava) D().z.d();
        if (Intrinsics.c(avaVar3 != null ? Boolean.valueOf(avaVar3.i) : null, bool)) {
            arrayList.add(boj.PERFORMANCES);
        }
        koj kojVar = (koj) this.s.getValue();
        mqi mqiVar = this.t;
        UniqueTournament uniqueTournament = ((Tournament) mqiVar.getValue()).getUniqueTournament();
        int id = uniqueTournament != null ? uniqueTournament.getId() : 0;
        Season l = D().l();
        int id2 = l != null ? l.getId() : 0;
        String str = (String) this.u.getValue();
        UniqueTournament uniqueTournament2 = ((Tournament) mqiVar.getValue()).getUniqueTournament();
        if (uniqueTournament2 == null || (w = tba.x(uniqueTournament2)) == null) {
            w = tba.w((Tournament) mqiVar.getValue());
        }
        kojVar.C(new rnj(id, id2, null, str, w), arrayList, (boj) this.w.getValue());
    }
}
