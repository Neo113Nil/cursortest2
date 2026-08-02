package com.sofascore.results.sharemodal.match.fragment;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatisticSection;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.results.R;
import com.sofascore.results.sharemodal.match.fragment.ShareMatchStatisticsShotmapPageFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import defpackage.g7;
import defpackage.mqi;
import defpackage.nb6;
import defpackage.och;
import defpackage.pch;
import defpackage.r1h;
import defpackage.rlh;
import defpackage.tc3;
import defpackage.v1h;
import defpackage.vk8;
import defpackage.vqg;
import defpackage.ypa;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/match/fragment/ShareMatchStatisticsShotmapPageFragment;", "Lcom/sofascore/results/sharemodal/match/fragment/BaseShareMatchPageFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShareMatchStatisticsShotmapPageFragment extends Hilt_ShareMatchStatisticsShotmapPageFragment {
    public final mqi t;
    public final mqi u;
    public final mqi v;
    public final mqi w;

    public ShareMatchStatisticsShotmapPageFragment() {
        final int i = 0;
        this.t = ypa.b(new Function0(this) { // from class: jdh
            public final /* synthetic */ ShareMatchStatisticsShotmapPageFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_SHOTMAP", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable ARG_SHOTMAP not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "ARG_SHOTMAP_TEAM", vk8.class);
                        if (M2 != null) {
                            return (vk8) M2;
                        }
                        a70.p("Serializable ARG_SHOTMAP_TEAM not found");
                        return null;
                    case 2:
                        Bundle requireArguments3 = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments3.getClass();
                        Serializable M3 = gz8.M(requireArguments3, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                        if (M3 != null) {
                            return (FootballShotmapItem) M3;
                        }
                        a70.p("Serializable ARG_SHOTMAP_LAST_SHOT not found");
                        return null;
                    default:
                        Context requireContext = shareMatchStatisticsShotmapPageFragment.requireContext();
                        requireContext.getClass();
                        return new nb6(requireContext, shareMatchStatisticsShotmapPageFragment.E().getTournament().getCategory().getSport().getSlug(), true);
                }
            }
        });
        final int i2 = 1;
        this.u = ypa.b(new Function0(this) { // from class: jdh
            public final /* synthetic */ ShareMatchStatisticsShotmapPageFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_SHOTMAP", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable ARG_SHOTMAP not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "ARG_SHOTMAP_TEAM", vk8.class);
                        if (M2 != null) {
                            return (vk8) M2;
                        }
                        a70.p("Serializable ARG_SHOTMAP_TEAM not found");
                        return null;
                    case 2:
                        Bundle requireArguments3 = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments3.getClass();
                        Serializable M3 = gz8.M(requireArguments3, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                        if (M3 != null) {
                            return (FootballShotmapItem) M3;
                        }
                        a70.p("Serializable ARG_SHOTMAP_LAST_SHOT not found");
                        return null;
                    default:
                        Context requireContext = shareMatchStatisticsShotmapPageFragment.requireContext();
                        requireContext.getClass();
                        return new nb6(requireContext, shareMatchStatisticsShotmapPageFragment.E().getTournament().getCategory().getSport().getSlug(), true);
                }
            }
        });
        final int i3 = 2;
        this.v = ypa.b(new Function0(this) { // from class: jdh
            public final /* synthetic */ ShareMatchStatisticsShotmapPageFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_SHOTMAP", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable ARG_SHOTMAP not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "ARG_SHOTMAP_TEAM", vk8.class);
                        if (M2 != null) {
                            return (vk8) M2;
                        }
                        a70.p("Serializable ARG_SHOTMAP_TEAM not found");
                        return null;
                    case 2:
                        Bundle requireArguments3 = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments3.getClass();
                        Serializable M3 = gz8.M(requireArguments3, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                        if (M3 != null) {
                            return (FootballShotmapItem) M3;
                        }
                        a70.p("Serializable ARG_SHOTMAP_LAST_SHOT not found");
                        return null;
                    default:
                        Context requireContext = shareMatchStatisticsShotmapPageFragment.requireContext();
                        requireContext.getClass();
                        return new nb6(requireContext, shareMatchStatisticsShotmapPageFragment.E().getTournament().getCategory().getSport().getSlug(), true);
                }
            }
        });
        final int i4 = 3;
        this.w = ypa.b(new Function0(this) { // from class: jdh
            public final /* synthetic */ ShareMatchStatisticsShotmapPageFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_SHOTMAP", ArrayList.class);
                        if (M != null) {
                            return (ArrayList) M;
                        }
                        a70.p("Serializable ARG_SHOTMAP not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "ARG_SHOTMAP_TEAM", vk8.class);
                        if (M2 != null) {
                            return (vk8) M2;
                        }
                        a70.p("Serializable ARG_SHOTMAP_TEAM not found");
                        return null;
                    case 2:
                        Bundle requireArguments3 = shareMatchStatisticsShotmapPageFragment.requireArguments();
                        requireArguments3.getClass();
                        Serializable M3 = gz8.M(requireArguments3, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                        if (M3 != null) {
                            return (FootballShotmapItem) M3;
                        }
                        a70.p("Serializable ARG_SHOTMAP_LAST_SHOT not found");
                        return null;
                    default:
                        Context requireContext = shareMatchStatisticsShotmapPageFragment.requireContext();
                        requireContext.getClass();
                        return new nb6(requireContext, shareMatchStatisticsShotmapPageFragment.E().getTournament().getCategory().getSport().getSlug(), true);
                }
            }
        });
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final g7 B() {
        return (nb6) this.w.getValue();
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final String C() {
        String string = getString(R.string.share_card_shotmap);
        string.getClass();
        return string;
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final void D() {
        nb6 nb6Var = (nb6) this.w.getValue();
        StatisticSection statisticSection = new StatisticSection("Shots", 0, false, 4, (DefaultConstructorMarker) null);
        Context requireContext = requireContext();
        requireContext.getClass();
        Event E = E();
        E.getClass();
        pch pchVar = new pch(requireContext, E, null);
        vk8 vk8Var = (vk8) this.u.getValue();
        if (vk8Var != null) {
            pchVar.setTeamSide(vk8Var);
        }
        ArrayList arrayList = (ArrayList) this.t.getValue();
        if (arrayList != null) {
            pchVar.l(arrayList);
        }
        FootballShotmapItem footballShotmapItem = (FootballShotmapItem) this.v.getValue();
        if (footballShotmapItem != null) {
            pchVar.setShotSelection(footballShotmapItem);
        }
        r1h r1hVar = pchVar.getTeamSide() == vk8.a ? new r1h("FIRST", new tc3(-1776821058, new och(pchVar, 0), true)) : new r1h("SECOND", new tc3(1223722581, new och(pchVar, 1), true));
        SegmentedButtonsView segmentedButtonsView = pchVar.getBinding().f;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        vqg vqgVar = new vqg(29);
        segmentedButtonsView.k = null;
        segmentedButtonsView.g = false;
        segmentedButtonsView.h = pair;
        segmentedButtonsView.j = v1h.f;
        segmentedButtonsView.i = vqgVar;
        rlh rlhVar = rlh.b;
        if (!rlhVar.isEmpty()) {
            SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
        }
        SegmentedButtonsView.t(pchVar.getBinding().f, a.c(r1hVar), null, 6);
        ((ImageView) pchVar.getBinding().c.c).setVisibility(8);
        ((ImageView) pchVar.getBinding().c.d).setVisibility(8);
        pchVar.getBinding().e.setVisibility(0);
        Unit unit = Unit.a;
        nb6Var.F(b.j(statisticSection, pchVar));
    }

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "match_shotmap";
    }
}
