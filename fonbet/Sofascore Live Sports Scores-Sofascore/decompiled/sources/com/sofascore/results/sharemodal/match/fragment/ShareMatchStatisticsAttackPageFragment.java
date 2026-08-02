package com.sofascore.results.sharemodal.match.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatisticSection;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.results.R;
import com.sofascore.results.sharemodal.match.fragment.ShareMatchStatisticsAttackPageFragment;
import defpackage.g7;
import defpackage.gc6;
import defpackage.jch;
import defpackage.k13;
import defpackage.mqi;
import defpackage.nb6;
import defpackage.xbb;
import defpackage.ypa;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/match/fragment/ShareMatchStatisticsAttackPageFragment;", "Lcom/sofascore/results/sharemodal/match/fragment/BaseShareMatchPageFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareMatchStatisticsAttackPageFragment extends Hilt_ShareMatchStatisticsAttackPageFragment {
    public final mqi t;
    public final mqi u;
    public final mqi v;
    public final mqi w;

    public ShareMatchStatisticsAttackPageFragment() {
        final int i = 0;
        this.t = ypa.b(new Function0(this) { // from class: cdh
            public final /* synthetic */ ShareMatchStatisticsAttackPageFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = shareMatchStatisticsAttackPageFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_STATISTICS", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable ARG_STATISTICS not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = shareMatchStatisticsAttackPageFragment.requireArguments();
                        requireArguments2.getClass();
                        return (gc6) gz8.M(requireArguments2, "ARG_HEATMAP", gc6.class);
                    case 2:
                        Context requireContext = shareMatchStatisticsAttackPageFragment.requireContext();
                        requireContext.getClass();
                        return new nb6(requireContext, shareMatchStatisticsAttackPageFragment.E().getTournament().getCategory().getSport().getSlug(), true);
                    default:
                        return Boolean.valueOf(shareMatchStatisticsAttackPageFragment.requireArguments().getBoolean("ARG_HEATMAP_HOME_TEAM_SELECTED", true));
                }
            }
        });
        final int i2 = 1;
        this.u = ypa.b(new Function0(this) { // from class: cdh
            public final /* synthetic */ ShareMatchStatisticsAttackPageFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchStatisticsAttackPageFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_STATISTICS", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable ARG_STATISTICS not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = shareMatchStatisticsAttackPageFragment.requireArguments();
                        requireArguments2.getClass();
                        return (gc6) gz8.M(requireArguments2, "ARG_HEATMAP", gc6.class);
                    case 2:
                        Context requireContext = shareMatchStatisticsAttackPageFragment.requireContext();
                        requireContext.getClass();
                        return new nb6(requireContext, shareMatchStatisticsAttackPageFragment.E().getTournament().getCategory().getSport().getSlug(), true);
                    default:
                        return Boolean.valueOf(shareMatchStatisticsAttackPageFragment.requireArguments().getBoolean("ARG_HEATMAP_HOME_TEAM_SELECTED", true));
                }
            }
        });
        final int i3 = 2;
        this.v = ypa.b(new Function0(this) { // from class: cdh
            public final /* synthetic */ ShareMatchStatisticsAttackPageFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchStatisticsAttackPageFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_STATISTICS", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable ARG_STATISTICS not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = shareMatchStatisticsAttackPageFragment.requireArguments();
                        requireArguments2.getClass();
                        return (gc6) gz8.M(requireArguments2, "ARG_HEATMAP", gc6.class);
                    case 2:
                        Context requireContext = shareMatchStatisticsAttackPageFragment.requireContext();
                        requireContext.getClass();
                        return new nb6(requireContext, shareMatchStatisticsAttackPageFragment.E().getTournament().getCategory().getSport().getSlug(), true);
                    default:
                        return Boolean.valueOf(shareMatchStatisticsAttackPageFragment.requireArguments().getBoolean("ARG_HEATMAP_HOME_TEAM_SELECTED", true));
                }
            }
        });
        final int i4 = 3;
        this.w = ypa.b(new Function0(this) { // from class: cdh
            public final /* synthetic */ ShareMatchStatisticsAttackPageFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchStatisticsAttackPageFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_STATISTICS", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable ARG_STATISTICS not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = shareMatchStatisticsAttackPageFragment.requireArguments();
                        requireArguments2.getClass();
                        return (gc6) gz8.M(requireArguments2, "ARG_HEATMAP", gc6.class);
                    case 2:
                        Context requireContext = shareMatchStatisticsAttackPageFragment.requireContext();
                        requireContext.getClass();
                        return new nb6(requireContext, shareMatchStatisticsAttackPageFragment.E().getTournament().getCategory().getSport().getSlug(), true);
                    default:
                        return Boolean.valueOf(shareMatchStatisticsAttackPageFragment.requireArguments().getBoolean("ARG_HEATMAP_HOME_TEAM_SELECTED", true));
                }
            }
        });
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final g7 B() {
        return (nb6) this.v.getValue();
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final String C() {
        String string = getString(R.string.share_card_attacking_areas);
        string.getClass();
        return string;
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final void D() {
        xbb b = a.b();
        b.add(new StatisticSection("Attack", 0, false, 4, (DefaultConstructorMarker) null));
        Context requireContext = requireContext();
        requireContext.getClass();
        jch jchVar = new jch(requireContext);
        jchVar.l(Event.getHomeTeam$default(E(), null, 1, null).getId(), Event.getAwayTeam$default(E(), null, 1, null).getId());
        jchVar.j((gc6) this.u.getValue(), E().getStatus(), E().getTime(), ((Boolean) this.w.getValue()).booleanValue());
        b.add(jchVar);
        mqi mqiVar = this.t;
        ArrayList arrayList = (ArrayList) mqiVar.getValue();
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj;
            EventStatisticsItem eventStatisticsItem2 = i != b.i((ArrayList) mqiVar.getValue()) ? eventStatisticsItem : null;
            if (eventStatisticsItem2 == null) {
                eventStatisticsItem2 = eventStatisticsItem.copy((r33 & 1) != 0 ? eventStatisticsItem.name : null, (r33 & 2) != 0 ? eventStatisticsItem.home : null, (r33 & 4) != 0 ? eventStatisticsItem.away : null, (r33 & 8) != 0 ? eventStatisticsItem.compareCode : 0, (r33 & 16) != 0 ? eventStatisticsItem.otherPlayerSelected : false, (r33 & 32) != 0 ? eventStatisticsItem.statisticsType : null, (r33 & 64) != 0 ? eventStatisticsItem.valueType : null, (r33 & 128) != 0 ? eventStatisticsItem.homeValue : 0.0d, (r33 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? eventStatisticsItem.awayValue : 0.0d, (r33 & 512) != 0 ? eventStatisticsItem.homeTotal : null, (r33 & 1024) != 0 ? eventStatisticsItem.awayTotal : null, (r33 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? eventStatisticsItem.renderType : null, (r33 & 4096) != 0 ? eventStatisticsItem.specialStatisticType : null, (r33 & 8192) != 0 ? eventStatisticsItem.avgRatingVersion : null);
                eventStatisticsItem2.setRoundBottom(true);
            }
            arrayList2.add(eventStatisticsItem2);
            i = i2;
        }
        b.addAll(arrayList2);
        ((nb6) this.v.getValue()).F(a.a(b));
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "play_areas";
    }
}
