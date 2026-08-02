package com.sofascore.results.sharemodal.match;

import android.os.Bundle;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.IShareContent;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.results.R;
import com.sofascore.results.sharemodal.match.ShareMatchStatisticsModal;
import com.sofascore.results.sharemodal.match.fragment.ShareMatchStatisticsAttackPageFragment;
import com.sofascore.results.sharemodal.match.fragment.ShareMatchStatisticsPageFragment;
import com.sofascore.results.sharemodal.match.fragment.ShareMatchStatisticsPassesPageFragment;
import com.sofascore.results.sharemodal.match.fragment.ShareMatchStatisticsShotmapPageFragment;
import defpackage.gc6;
import defpackage.ich;
import defpackage.kch;
import defpackage.mqi;
import defpackage.qdh;
import defpackage.ypa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/match/ShareMatchStatisticsModal;", "Lcom/sofascore/results/sharemodal/match/BaseShareMultiPageModal;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareMatchStatisticsModal extends BaseShareMultiPageModal {
    public static final List I = b.j("Ball possession", "Duels", "Total shots", "Goalkeeper saves", "Big chances scored", "Accurate passes", "Tackles won");
    public final mqi A;
    public final mqi B;
    public final mqi C;
    public final mqi D;
    public final mqi E;
    public final mqi F;
    public final mqi G;
    public final mqi H;
    public final mqi x;
    public final int y = R.string.share_match_statistics_description;
    public final kch z = kch.EVENT_STATISTICS;

    public ShareMatchStatisticsModal() {
        final int i = 0;
        this.x = ypa.b(new Function0(this) { // from class: edh
            public final /* synthetic */ ShareMatchStatisticsModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ShareMatchStatisticsModal shareMatchStatisticsModal;
                mqi mqiVar;
                mqi mqiVar2;
                mqi mqiVar3;
                List<EventStatisticsItem> list;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Object obj;
                List<EventStatisticsItem> statisticsItems;
                Object obj2;
                List<EventStatisticsItem> statisticsItems2;
                List list2;
                Object obj3;
                Object obj4;
                int i2 = i;
                ShareMatchStatisticsModal shareMatchStatisticsModal2 = this.b;
                switch (i2) {
                    case 0:
                        List list3 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments = shareMatchStatisticsModal2.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DATA_HOLDER", ich.class);
                        if (M != null) {
                            return (ich) M;
                        }
                        a70.p("Serializable ARG_DATA_HOLDER not found");
                        return null;
                    case 1:
                        List list4 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments2 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments2.getClass();
                        return (ArrayList) gz8.M(requireArguments2, "ARG_SHOTMAP", ArrayList.class);
                    case 2:
                        List list5 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments3 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments3.getClass();
                        return (vk8) gz8.M(requireArguments3, "ARG_SHOTMAP_TEAM", vk8.class);
                    case 3:
                        List list6 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments4 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments4.getClass();
                        return (FootballShotmapItem) gz8.M(requireArguments4, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                    case 4:
                        List list7 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments5 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments5.getClass();
                        return (ArrayList) gz8.M(requireArguments5, "ARG_STATISTICS", ArrayList.class);
                    case 5:
                        List list8 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments6 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments6.getClass();
                        return (gc6) gz8.M(requireArguments6, "ARG_HEATMAP", gc6.class);
                    case 6:
                        List list9 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments7 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments7.getClass();
                        Boolean bool = (Boolean) gz8.M(requireArguments7, "ARG_HEATMAP_HOME_TEAM_SELECTED", Boolean.class);
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    case 7:
                        List list10 = ShareMatchStatisticsModal.I;
                        IShareContent data = shareMatchStatisticsModal2.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        mqi mqiVar4 = shareMatchStatisticsModal2.F;
                        mqi mqiVar5 = shareMatchStatisticsModal2.C;
                        mqi mqiVar6 = shareMatchStatisticsModal2.B;
                        mqi mqiVar7 = shareMatchStatisticsModal2.A;
                        List list11 = ShareMatchStatisticsModal.I;
                        qdh qdhVar = new qdh(shareMatchStatisticsModal2);
                        mqi mqiVar8 = shareMatchStatisticsModal2.D;
                        ArrayList arrayList5 = (ArrayList) mqiVar8.getValue();
                        if (arrayList5 != null) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                shareMatchStatisticsModal = shareMatchStatisticsModal2;
                                if (it.hasNext()) {
                                    obj4 = it.next();
                                    mqiVar = mqiVar4;
                                    if (!Intrinsics.c(((EventStatisticsGroup) obj4).getGroupName(), "Match overview")) {
                                        shareMatchStatisticsModal2 = shareMatchStatisticsModal;
                                        mqiVar4 = mqiVar;
                                    }
                                } else {
                                    mqiVar = mqiVar4;
                                    obj4 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj4;
                            if (eventStatisticsGroup != null && (list = eventStatisticsGroup.getStatisticsItems()) != null) {
                                Event O = shareMatchStatisticsModal.O();
                                O.getClass();
                                mqiVar2 = mqiVar5;
                                ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment = new ShareMatchStatisticsPageFragment();
                                mqiVar3 = mqiVar6;
                                shareMatchStatisticsPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O), fz8.H("ARG_TITLE", "Match overview"), fz8.G("ARG_STATISTICS", new ArrayList(list))));
                                qdhVar.v(shareMatchStatisticsPageFragment);
                                arrayList = (ArrayList) mqiVar8.getValue();
                                if (arrayList != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList6);
                                    }
                                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                                    List<String> list12 = ShareMatchStatisticsModal.I;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (String str : list12) {
                                        Iterator it3 = S0.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                list2 = S0;
                                                if (!Intrinsics.c(((EventStatisticsItem) obj3).getName(), str)) {
                                                    S0 = list2;
                                                }
                                            } else {
                                                list2 = S0;
                                                obj3 = null;
                                            }
                                        }
                                        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj3;
                                        if (eventStatisticsItem != null) {
                                            arrayList7.add(eventStatisticsItem);
                                        }
                                        S0 = list2;
                                    }
                                    if (arrayList7.size() > 2 && !list.containsAll(arrayList7)) {
                                        Event O2 = shareMatchStatisticsModal.O();
                                        O2.getClass();
                                        ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment2 = new ShareMatchStatisticsPageFragment();
                                        arrayList2 = null;
                                        shareMatchStatisticsPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O2), fz8.H("ARG_TITLE", null), fz8.G("ARG_STATISTICS", new ArrayList(arrayList7))));
                                        qdhVar.v(shareMatchStatisticsPageFragment2);
                                        if (((ArrayList) mqiVar7.getValue()) != null && ((vk8) mqiVar3.getValue()) != null && ((FootballShotmapItem) mqiVar2.getValue()) != null) {
                                            Event O3 = shareMatchStatisticsModal.O();
                                            ArrayList arrayList8 = (ArrayList) mqiVar7.getValue();
                                            vk8 vk8Var = (vk8) mqiVar3.getValue();
                                            FootballShotmapItem footballShotmapItem = (FootballShotmapItem) mqiVar2.getValue();
                                            O3.getClass();
                                            ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment = new ShareMatchStatisticsShotmapPageFragment();
                                            shareMatchStatisticsShotmapPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O3), fz8.G("ARG_SHOTMAP", arrayList8 == null ? new ArrayList(arrayList8) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem)));
                                            qdhVar.v(shareMatchStatisticsShotmapPageFragment);
                                        }
                                        arrayList3 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList3 != null) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Attack")) {
                                                    }
                                                } else {
                                                    obj2 = arrayList2;
                                                }
                                            }
                                            EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj2;
                                            if (eventStatisticsGroup2 != null && (statisticsItems2 = eventStatisticsGroup2.getStatisticsItems()) != null) {
                                                if (statisticsItems2.size() <= 2) {
                                                    statisticsItems2 = arrayList2;
                                                }
                                                if (statisticsItems2 != null) {
                                                    Event O4 = shareMatchStatisticsModal.O();
                                                    gc6 P = shareMatchStatisticsModal.P();
                                                    boolean booleanValue = ((Boolean) mqiVar.getValue()).booleanValue();
                                                    O4.getClass();
                                                    ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = new ShareMatchStatisticsAttackPageFragment();
                                                    shareMatchStatisticsAttackPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O4), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems2)), fz8.G("ARG_HEATMAP", P), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue)));
                                                    qdhVar.v(shareMatchStatisticsAttackPageFragment);
                                                    arrayList4 = (ArrayList) mqiVar8.getValue();
                                                    if (arrayList4 != null) {
                                                        Iterator it5 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                obj = it5.next();
                                                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Passes")) {
                                                                }
                                                            } else {
                                                                obj = arrayList2;
                                                            }
                                                        }
                                                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj;
                                                        if (eventStatisticsGroup3 != null && (statisticsItems = eventStatisticsGroup3.getStatisticsItems()) != null) {
                                                            if (statisticsItems.size() <= 2) {
                                                                statisticsItems = arrayList2;
                                                            }
                                                            if (statisticsItems != null) {
                                                                Event O5 = shareMatchStatisticsModal.O();
                                                                gc6 P2 = shareMatchStatisticsModal.P();
                                                                O5.getClass();
                                                                ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment = new ShareMatchStatisticsPassesPageFragment();
                                                                shareMatchStatisticsPassesPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O5), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems)), fz8.G("ARG_HEATMAP", P2), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                                qdhVar.v(shareMatchStatisticsPassesPageFragment);
                                                                return qdhVar;
                                                            }
                                                        }
                                                    }
                                                    if (shareMatchStatisticsModal.P() != null) {
                                                        Event O6 = shareMatchStatisticsModal.O();
                                                        km5 km5Var = km5.a;
                                                        gc6 P3 = shareMatchStatisticsModal.P();
                                                        O6.getClass();
                                                        ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment2 = new ShareMatchStatisticsPassesPageFragment();
                                                        shareMatchStatisticsPassesPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O6), fz8.G("ARG_STATISTICS", km5Var != null ? new ArrayList(km5Var) : arrayList2), fz8.G("ARG_HEATMAP", P3), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                        qdhVar.v(shareMatchStatisticsPassesPageFragment2);
                                                    }
                                                    return qdhVar;
                                                }
                                            }
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                            Event O7 = shareMatchStatisticsModal.O();
                                            km5 km5Var2 = km5.a;
                                            gc6 P4 = shareMatchStatisticsModal.P();
                                            boolean booleanValue2 = ((Boolean) mqiVar.getValue()).booleanValue();
                                            O7.getClass();
                                            ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment2 = new ShareMatchStatisticsAttackPageFragment();
                                            shareMatchStatisticsAttackPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O7), fz8.G("ARG_STATISTICS", km5Var2 != null ? new ArrayList(km5Var2) : arrayList2), fz8.G("ARG_HEATMAP", P4), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue2)));
                                            qdhVar.v(shareMatchStatisticsAttackPageFragment2);
                                        }
                                        arrayList4 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList4 != null) {
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                        }
                                        return qdhVar;
                                    }
                                }
                                arrayList2 = null;
                                if (((ArrayList) mqiVar7.getValue()) != null) {
                                    Event O32 = shareMatchStatisticsModal.O();
                                    ArrayList arrayList82 = (ArrayList) mqiVar7.getValue();
                                    vk8 vk8Var2 = (vk8) mqiVar3.getValue();
                                    FootballShotmapItem footballShotmapItem2 = (FootballShotmapItem) mqiVar2.getValue();
                                    O32.getClass();
                                    ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment2 = new ShareMatchStatisticsShotmapPageFragment();
                                    shareMatchStatisticsShotmapPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O32), fz8.G("ARG_SHOTMAP", arrayList82 == null ? new ArrayList(arrayList82) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var2), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem2)));
                                    qdhVar.v(shareMatchStatisticsShotmapPageFragment2);
                                }
                                arrayList3 = (ArrayList) mqiVar8.getValue();
                                if (arrayList3 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                arrayList4 = (ArrayList) mqiVar8.getValue();
                                if (arrayList4 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                return qdhVar;
                            }
                        } else {
                            shareMatchStatisticsModal = shareMatchStatisticsModal2;
                            mqiVar = mqiVar4;
                        }
                        mqiVar2 = mqiVar5;
                        mqiVar3 = mqiVar6;
                        list = km5.a;
                        arrayList = (ArrayList) mqiVar8.getValue();
                        if (arrayList != null) {
                        }
                        arrayList2 = null;
                        if (((ArrayList) mqiVar7.getValue()) != null) {
                        }
                        arrayList3 = (ArrayList) mqiVar8.getValue();
                        if (arrayList3 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        arrayList4 = (ArrayList) mqiVar8.getValue();
                        if (arrayList4 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        return qdhVar;
                }
            }
        });
        final int i2 = 1;
        this.A = ypa.b(new Function0(this) { // from class: edh
            public final /* synthetic */ ShareMatchStatisticsModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ShareMatchStatisticsModal shareMatchStatisticsModal;
                mqi mqiVar;
                mqi mqiVar2;
                mqi mqiVar3;
                List<EventStatisticsItem> list;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Object obj;
                List<EventStatisticsItem> statisticsItems;
                Object obj2;
                List<EventStatisticsItem> statisticsItems2;
                List list2;
                Object obj3;
                Object obj4;
                int i22 = i2;
                ShareMatchStatisticsModal shareMatchStatisticsModal2 = this.b;
                switch (i22) {
                    case 0:
                        List list3 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments = shareMatchStatisticsModal2.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DATA_HOLDER", ich.class);
                        if (M != null) {
                            return (ich) M;
                        }
                        a70.p("Serializable ARG_DATA_HOLDER not found");
                        return null;
                    case 1:
                        List list4 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments2 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments2.getClass();
                        return (ArrayList) gz8.M(requireArguments2, "ARG_SHOTMAP", ArrayList.class);
                    case 2:
                        List list5 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments3 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments3.getClass();
                        return (vk8) gz8.M(requireArguments3, "ARG_SHOTMAP_TEAM", vk8.class);
                    case 3:
                        List list6 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments4 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments4.getClass();
                        return (FootballShotmapItem) gz8.M(requireArguments4, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                    case 4:
                        List list7 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments5 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments5.getClass();
                        return (ArrayList) gz8.M(requireArguments5, "ARG_STATISTICS", ArrayList.class);
                    case 5:
                        List list8 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments6 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments6.getClass();
                        return (gc6) gz8.M(requireArguments6, "ARG_HEATMAP", gc6.class);
                    case 6:
                        List list9 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments7 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments7.getClass();
                        Boolean bool = (Boolean) gz8.M(requireArguments7, "ARG_HEATMAP_HOME_TEAM_SELECTED", Boolean.class);
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    case 7:
                        List list10 = ShareMatchStatisticsModal.I;
                        IShareContent data = shareMatchStatisticsModal2.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        mqi mqiVar4 = shareMatchStatisticsModal2.F;
                        mqi mqiVar5 = shareMatchStatisticsModal2.C;
                        mqi mqiVar6 = shareMatchStatisticsModal2.B;
                        mqi mqiVar7 = shareMatchStatisticsModal2.A;
                        List list11 = ShareMatchStatisticsModal.I;
                        qdh qdhVar = new qdh(shareMatchStatisticsModal2);
                        mqi mqiVar8 = shareMatchStatisticsModal2.D;
                        ArrayList arrayList5 = (ArrayList) mqiVar8.getValue();
                        if (arrayList5 != null) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                shareMatchStatisticsModal = shareMatchStatisticsModal2;
                                if (it.hasNext()) {
                                    obj4 = it.next();
                                    mqiVar = mqiVar4;
                                    if (!Intrinsics.c(((EventStatisticsGroup) obj4).getGroupName(), "Match overview")) {
                                        shareMatchStatisticsModal2 = shareMatchStatisticsModal;
                                        mqiVar4 = mqiVar;
                                    }
                                } else {
                                    mqiVar = mqiVar4;
                                    obj4 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj4;
                            if (eventStatisticsGroup != null && (list = eventStatisticsGroup.getStatisticsItems()) != null) {
                                Event O = shareMatchStatisticsModal.O();
                                O.getClass();
                                mqiVar2 = mqiVar5;
                                ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment = new ShareMatchStatisticsPageFragment();
                                mqiVar3 = mqiVar6;
                                shareMatchStatisticsPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O), fz8.H("ARG_TITLE", "Match overview"), fz8.G("ARG_STATISTICS", new ArrayList(list))));
                                qdhVar.v(shareMatchStatisticsPageFragment);
                                arrayList = (ArrayList) mqiVar8.getValue();
                                if (arrayList != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList6);
                                    }
                                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                                    List<String> list12 = ShareMatchStatisticsModal.I;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (String str : list12) {
                                        Iterator it3 = S0.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                list2 = S0;
                                                if (!Intrinsics.c(((EventStatisticsItem) obj3).getName(), str)) {
                                                    S0 = list2;
                                                }
                                            } else {
                                                list2 = S0;
                                                obj3 = null;
                                            }
                                        }
                                        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj3;
                                        if (eventStatisticsItem != null) {
                                            arrayList7.add(eventStatisticsItem);
                                        }
                                        S0 = list2;
                                    }
                                    if (arrayList7.size() > 2 && !list.containsAll(arrayList7)) {
                                        Event O2 = shareMatchStatisticsModal.O();
                                        O2.getClass();
                                        ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment2 = new ShareMatchStatisticsPageFragment();
                                        arrayList2 = null;
                                        shareMatchStatisticsPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O2), fz8.H("ARG_TITLE", null), fz8.G("ARG_STATISTICS", new ArrayList(arrayList7))));
                                        qdhVar.v(shareMatchStatisticsPageFragment2);
                                        if (((ArrayList) mqiVar7.getValue()) != null && ((vk8) mqiVar3.getValue()) != null && ((FootballShotmapItem) mqiVar2.getValue()) != null) {
                                            Event O32 = shareMatchStatisticsModal.O();
                                            ArrayList arrayList82 = (ArrayList) mqiVar7.getValue();
                                            vk8 vk8Var2 = (vk8) mqiVar3.getValue();
                                            FootballShotmapItem footballShotmapItem2 = (FootballShotmapItem) mqiVar2.getValue();
                                            O32.getClass();
                                            ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment2 = new ShareMatchStatisticsShotmapPageFragment();
                                            shareMatchStatisticsShotmapPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O32), fz8.G("ARG_SHOTMAP", arrayList82 == null ? new ArrayList(arrayList82) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var2), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem2)));
                                            qdhVar.v(shareMatchStatisticsShotmapPageFragment2);
                                        }
                                        arrayList3 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList3 != null) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Attack")) {
                                                    }
                                                } else {
                                                    obj2 = arrayList2;
                                                }
                                            }
                                            EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj2;
                                            if (eventStatisticsGroup2 != null && (statisticsItems2 = eventStatisticsGroup2.getStatisticsItems()) != null) {
                                                if (statisticsItems2.size() <= 2) {
                                                    statisticsItems2 = arrayList2;
                                                }
                                                if (statisticsItems2 != null) {
                                                    Event O4 = shareMatchStatisticsModal.O();
                                                    gc6 P = shareMatchStatisticsModal.P();
                                                    boolean booleanValue = ((Boolean) mqiVar.getValue()).booleanValue();
                                                    O4.getClass();
                                                    ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = new ShareMatchStatisticsAttackPageFragment();
                                                    shareMatchStatisticsAttackPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O4), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems2)), fz8.G("ARG_HEATMAP", P), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue)));
                                                    qdhVar.v(shareMatchStatisticsAttackPageFragment);
                                                    arrayList4 = (ArrayList) mqiVar8.getValue();
                                                    if (arrayList4 != null) {
                                                        Iterator it5 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                obj = it5.next();
                                                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Passes")) {
                                                                }
                                                            } else {
                                                                obj = arrayList2;
                                                            }
                                                        }
                                                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj;
                                                        if (eventStatisticsGroup3 != null && (statisticsItems = eventStatisticsGroup3.getStatisticsItems()) != null) {
                                                            if (statisticsItems.size() <= 2) {
                                                                statisticsItems = arrayList2;
                                                            }
                                                            if (statisticsItems != null) {
                                                                Event O5 = shareMatchStatisticsModal.O();
                                                                gc6 P2 = shareMatchStatisticsModal.P();
                                                                O5.getClass();
                                                                ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment = new ShareMatchStatisticsPassesPageFragment();
                                                                shareMatchStatisticsPassesPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O5), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems)), fz8.G("ARG_HEATMAP", P2), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                                qdhVar.v(shareMatchStatisticsPassesPageFragment);
                                                                return qdhVar;
                                                            }
                                                        }
                                                    }
                                                    if (shareMatchStatisticsModal.P() != null) {
                                                        Event O6 = shareMatchStatisticsModal.O();
                                                        km5 km5Var = km5.a;
                                                        gc6 P3 = shareMatchStatisticsModal.P();
                                                        O6.getClass();
                                                        ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment2 = new ShareMatchStatisticsPassesPageFragment();
                                                        shareMatchStatisticsPassesPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O6), fz8.G("ARG_STATISTICS", km5Var != null ? new ArrayList(km5Var) : arrayList2), fz8.G("ARG_HEATMAP", P3), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                        qdhVar.v(shareMatchStatisticsPassesPageFragment2);
                                                    }
                                                    return qdhVar;
                                                }
                                            }
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                            Event O7 = shareMatchStatisticsModal.O();
                                            km5 km5Var2 = km5.a;
                                            gc6 P4 = shareMatchStatisticsModal.P();
                                            boolean booleanValue2 = ((Boolean) mqiVar.getValue()).booleanValue();
                                            O7.getClass();
                                            ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment2 = new ShareMatchStatisticsAttackPageFragment();
                                            shareMatchStatisticsAttackPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O7), fz8.G("ARG_STATISTICS", km5Var2 != null ? new ArrayList(km5Var2) : arrayList2), fz8.G("ARG_HEATMAP", P4), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue2)));
                                            qdhVar.v(shareMatchStatisticsAttackPageFragment2);
                                        }
                                        arrayList4 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList4 != null) {
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                        }
                                        return qdhVar;
                                    }
                                }
                                arrayList2 = null;
                                if (((ArrayList) mqiVar7.getValue()) != null) {
                                    Event O322 = shareMatchStatisticsModal.O();
                                    ArrayList arrayList822 = (ArrayList) mqiVar7.getValue();
                                    vk8 vk8Var22 = (vk8) mqiVar3.getValue();
                                    FootballShotmapItem footballShotmapItem22 = (FootballShotmapItem) mqiVar2.getValue();
                                    O322.getClass();
                                    ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment22 = new ShareMatchStatisticsShotmapPageFragment();
                                    shareMatchStatisticsShotmapPageFragment22.setArguments(fz8.C(fz8.G("ARG_EVENT", O322), fz8.G("ARG_SHOTMAP", arrayList822 == null ? new ArrayList(arrayList822) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var22), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem22)));
                                    qdhVar.v(shareMatchStatisticsShotmapPageFragment22);
                                }
                                arrayList3 = (ArrayList) mqiVar8.getValue();
                                if (arrayList3 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                arrayList4 = (ArrayList) mqiVar8.getValue();
                                if (arrayList4 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                return qdhVar;
                            }
                        } else {
                            shareMatchStatisticsModal = shareMatchStatisticsModal2;
                            mqiVar = mqiVar4;
                        }
                        mqiVar2 = mqiVar5;
                        mqiVar3 = mqiVar6;
                        list = km5.a;
                        arrayList = (ArrayList) mqiVar8.getValue();
                        if (arrayList != null) {
                        }
                        arrayList2 = null;
                        if (((ArrayList) mqiVar7.getValue()) != null) {
                        }
                        arrayList3 = (ArrayList) mqiVar8.getValue();
                        if (arrayList3 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        arrayList4 = (ArrayList) mqiVar8.getValue();
                        if (arrayList4 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        return qdhVar;
                }
            }
        });
        final int i3 = 2;
        this.B = ypa.b(new Function0(this) { // from class: edh
            public final /* synthetic */ ShareMatchStatisticsModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ShareMatchStatisticsModal shareMatchStatisticsModal;
                mqi mqiVar;
                mqi mqiVar2;
                mqi mqiVar3;
                List<EventStatisticsItem> list;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Object obj;
                List<EventStatisticsItem> statisticsItems;
                Object obj2;
                List<EventStatisticsItem> statisticsItems2;
                List list2;
                Object obj3;
                Object obj4;
                int i22 = i3;
                ShareMatchStatisticsModal shareMatchStatisticsModal2 = this.b;
                switch (i22) {
                    case 0:
                        List list3 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments = shareMatchStatisticsModal2.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DATA_HOLDER", ich.class);
                        if (M != null) {
                            return (ich) M;
                        }
                        a70.p("Serializable ARG_DATA_HOLDER not found");
                        return null;
                    case 1:
                        List list4 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments2 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments2.getClass();
                        return (ArrayList) gz8.M(requireArguments2, "ARG_SHOTMAP", ArrayList.class);
                    case 2:
                        List list5 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments3 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments3.getClass();
                        return (vk8) gz8.M(requireArguments3, "ARG_SHOTMAP_TEAM", vk8.class);
                    case 3:
                        List list6 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments4 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments4.getClass();
                        return (FootballShotmapItem) gz8.M(requireArguments4, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                    case 4:
                        List list7 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments5 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments5.getClass();
                        return (ArrayList) gz8.M(requireArguments5, "ARG_STATISTICS", ArrayList.class);
                    case 5:
                        List list8 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments6 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments6.getClass();
                        return (gc6) gz8.M(requireArguments6, "ARG_HEATMAP", gc6.class);
                    case 6:
                        List list9 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments7 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments7.getClass();
                        Boolean bool = (Boolean) gz8.M(requireArguments7, "ARG_HEATMAP_HOME_TEAM_SELECTED", Boolean.class);
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    case 7:
                        List list10 = ShareMatchStatisticsModal.I;
                        IShareContent data = shareMatchStatisticsModal2.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        mqi mqiVar4 = shareMatchStatisticsModal2.F;
                        mqi mqiVar5 = shareMatchStatisticsModal2.C;
                        mqi mqiVar6 = shareMatchStatisticsModal2.B;
                        mqi mqiVar7 = shareMatchStatisticsModal2.A;
                        List list11 = ShareMatchStatisticsModal.I;
                        qdh qdhVar = new qdh(shareMatchStatisticsModal2);
                        mqi mqiVar8 = shareMatchStatisticsModal2.D;
                        ArrayList arrayList5 = (ArrayList) mqiVar8.getValue();
                        if (arrayList5 != null) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                shareMatchStatisticsModal = shareMatchStatisticsModal2;
                                if (it.hasNext()) {
                                    obj4 = it.next();
                                    mqiVar = mqiVar4;
                                    if (!Intrinsics.c(((EventStatisticsGroup) obj4).getGroupName(), "Match overview")) {
                                        shareMatchStatisticsModal2 = shareMatchStatisticsModal;
                                        mqiVar4 = mqiVar;
                                    }
                                } else {
                                    mqiVar = mqiVar4;
                                    obj4 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj4;
                            if (eventStatisticsGroup != null && (list = eventStatisticsGroup.getStatisticsItems()) != null) {
                                Event O = shareMatchStatisticsModal.O();
                                O.getClass();
                                mqiVar2 = mqiVar5;
                                ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment = new ShareMatchStatisticsPageFragment();
                                mqiVar3 = mqiVar6;
                                shareMatchStatisticsPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O), fz8.H("ARG_TITLE", "Match overview"), fz8.G("ARG_STATISTICS", new ArrayList(list))));
                                qdhVar.v(shareMatchStatisticsPageFragment);
                                arrayList = (ArrayList) mqiVar8.getValue();
                                if (arrayList != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList6);
                                    }
                                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                                    List<String> list12 = ShareMatchStatisticsModal.I;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (String str : list12) {
                                        Iterator it3 = S0.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                list2 = S0;
                                                if (!Intrinsics.c(((EventStatisticsItem) obj3).getName(), str)) {
                                                    S0 = list2;
                                                }
                                            } else {
                                                list2 = S0;
                                                obj3 = null;
                                            }
                                        }
                                        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj3;
                                        if (eventStatisticsItem != null) {
                                            arrayList7.add(eventStatisticsItem);
                                        }
                                        S0 = list2;
                                    }
                                    if (arrayList7.size() > 2 && !list.containsAll(arrayList7)) {
                                        Event O2 = shareMatchStatisticsModal.O();
                                        O2.getClass();
                                        ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment2 = new ShareMatchStatisticsPageFragment();
                                        arrayList2 = null;
                                        shareMatchStatisticsPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O2), fz8.H("ARG_TITLE", null), fz8.G("ARG_STATISTICS", new ArrayList(arrayList7))));
                                        qdhVar.v(shareMatchStatisticsPageFragment2);
                                        if (((ArrayList) mqiVar7.getValue()) != null && ((vk8) mqiVar3.getValue()) != null && ((FootballShotmapItem) mqiVar2.getValue()) != null) {
                                            Event O322 = shareMatchStatisticsModal.O();
                                            ArrayList arrayList822 = (ArrayList) mqiVar7.getValue();
                                            vk8 vk8Var22 = (vk8) mqiVar3.getValue();
                                            FootballShotmapItem footballShotmapItem22 = (FootballShotmapItem) mqiVar2.getValue();
                                            O322.getClass();
                                            ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment22 = new ShareMatchStatisticsShotmapPageFragment();
                                            shareMatchStatisticsShotmapPageFragment22.setArguments(fz8.C(fz8.G("ARG_EVENT", O322), fz8.G("ARG_SHOTMAP", arrayList822 == null ? new ArrayList(arrayList822) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var22), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem22)));
                                            qdhVar.v(shareMatchStatisticsShotmapPageFragment22);
                                        }
                                        arrayList3 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList3 != null) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Attack")) {
                                                    }
                                                } else {
                                                    obj2 = arrayList2;
                                                }
                                            }
                                            EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj2;
                                            if (eventStatisticsGroup2 != null && (statisticsItems2 = eventStatisticsGroup2.getStatisticsItems()) != null) {
                                                if (statisticsItems2.size() <= 2) {
                                                    statisticsItems2 = arrayList2;
                                                }
                                                if (statisticsItems2 != null) {
                                                    Event O4 = shareMatchStatisticsModal.O();
                                                    gc6 P = shareMatchStatisticsModal.P();
                                                    boolean booleanValue = ((Boolean) mqiVar.getValue()).booleanValue();
                                                    O4.getClass();
                                                    ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = new ShareMatchStatisticsAttackPageFragment();
                                                    shareMatchStatisticsAttackPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O4), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems2)), fz8.G("ARG_HEATMAP", P), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue)));
                                                    qdhVar.v(shareMatchStatisticsAttackPageFragment);
                                                    arrayList4 = (ArrayList) mqiVar8.getValue();
                                                    if (arrayList4 != null) {
                                                        Iterator it5 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                obj = it5.next();
                                                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Passes")) {
                                                                }
                                                            } else {
                                                                obj = arrayList2;
                                                            }
                                                        }
                                                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj;
                                                        if (eventStatisticsGroup3 != null && (statisticsItems = eventStatisticsGroup3.getStatisticsItems()) != null) {
                                                            if (statisticsItems.size() <= 2) {
                                                                statisticsItems = arrayList2;
                                                            }
                                                            if (statisticsItems != null) {
                                                                Event O5 = shareMatchStatisticsModal.O();
                                                                gc6 P2 = shareMatchStatisticsModal.P();
                                                                O5.getClass();
                                                                ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment = new ShareMatchStatisticsPassesPageFragment();
                                                                shareMatchStatisticsPassesPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O5), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems)), fz8.G("ARG_HEATMAP", P2), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                                qdhVar.v(shareMatchStatisticsPassesPageFragment);
                                                                return qdhVar;
                                                            }
                                                        }
                                                    }
                                                    if (shareMatchStatisticsModal.P() != null) {
                                                        Event O6 = shareMatchStatisticsModal.O();
                                                        km5 km5Var = km5.a;
                                                        gc6 P3 = shareMatchStatisticsModal.P();
                                                        O6.getClass();
                                                        ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment2 = new ShareMatchStatisticsPassesPageFragment();
                                                        shareMatchStatisticsPassesPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O6), fz8.G("ARG_STATISTICS", km5Var != null ? new ArrayList(km5Var) : arrayList2), fz8.G("ARG_HEATMAP", P3), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                        qdhVar.v(shareMatchStatisticsPassesPageFragment2);
                                                    }
                                                    return qdhVar;
                                                }
                                            }
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                            Event O7 = shareMatchStatisticsModal.O();
                                            km5 km5Var2 = km5.a;
                                            gc6 P4 = shareMatchStatisticsModal.P();
                                            boolean booleanValue2 = ((Boolean) mqiVar.getValue()).booleanValue();
                                            O7.getClass();
                                            ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment2 = new ShareMatchStatisticsAttackPageFragment();
                                            shareMatchStatisticsAttackPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O7), fz8.G("ARG_STATISTICS", km5Var2 != null ? new ArrayList(km5Var2) : arrayList2), fz8.G("ARG_HEATMAP", P4), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue2)));
                                            qdhVar.v(shareMatchStatisticsAttackPageFragment2);
                                        }
                                        arrayList4 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList4 != null) {
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                        }
                                        return qdhVar;
                                    }
                                }
                                arrayList2 = null;
                                if (((ArrayList) mqiVar7.getValue()) != null) {
                                    Event O3222 = shareMatchStatisticsModal.O();
                                    ArrayList arrayList8222 = (ArrayList) mqiVar7.getValue();
                                    vk8 vk8Var222 = (vk8) mqiVar3.getValue();
                                    FootballShotmapItem footballShotmapItem222 = (FootballShotmapItem) mqiVar2.getValue();
                                    O3222.getClass();
                                    ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment222 = new ShareMatchStatisticsShotmapPageFragment();
                                    shareMatchStatisticsShotmapPageFragment222.setArguments(fz8.C(fz8.G("ARG_EVENT", O3222), fz8.G("ARG_SHOTMAP", arrayList8222 == null ? new ArrayList(arrayList8222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem222)));
                                    qdhVar.v(shareMatchStatisticsShotmapPageFragment222);
                                }
                                arrayList3 = (ArrayList) mqiVar8.getValue();
                                if (arrayList3 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                arrayList4 = (ArrayList) mqiVar8.getValue();
                                if (arrayList4 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                return qdhVar;
                            }
                        } else {
                            shareMatchStatisticsModal = shareMatchStatisticsModal2;
                            mqiVar = mqiVar4;
                        }
                        mqiVar2 = mqiVar5;
                        mqiVar3 = mqiVar6;
                        list = km5.a;
                        arrayList = (ArrayList) mqiVar8.getValue();
                        if (arrayList != null) {
                        }
                        arrayList2 = null;
                        if (((ArrayList) mqiVar7.getValue()) != null) {
                        }
                        arrayList3 = (ArrayList) mqiVar8.getValue();
                        if (arrayList3 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        arrayList4 = (ArrayList) mqiVar8.getValue();
                        if (arrayList4 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        return qdhVar;
                }
            }
        });
        final int i4 = 3;
        this.C = ypa.b(new Function0(this) { // from class: edh
            public final /* synthetic */ ShareMatchStatisticsModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ShareMatchStatisticsModal shareMatchStatisticsModal;
                mqi mqiVar;
                mqi mqiVar2;
                mqi mqiVar3;
                List<EventStatisticsItem> list;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Object obj;
                List<EventStatisticsItem> statisticsItems;
                Object obj2;
                List<EventStatisticsItem> statisticsItems2;
                List list2;
                Object obj3;
                Object obj4;
                int i22 = i4;
                ShareMatchStatisticsModal shareMatchStatisticsModal2 = this.b;
                switch (i22) {
                    case 0:
                        List list3 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments = shareMatchStatisticsModal2.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DATA_HOLDER", ich.class);
                        if (M != null) {
                            return (ich) M;
                        }
                        a70.p("Serializable ARG_DATA_HOLDER not found");
                        return null;
                    case 1:
                        List list4 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments2 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments2.getClass();
                        return (ArrayList) gz8.M(requireArguments2, "ARG_SHOTMAP", ArrayList.class);
                    case 2:
                        List list5 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments3 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments3.getClass();
                        return (vk8) gz8.M(requireArguments3, "ARG_SHOTMAP_TEAM", vk8.class);
                    case 3:
                        List list6 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments4 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments4.getClass();
                        return (FootballShotmapItem) gz8.M(requireArguments4, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                    case 4:
                        List list7 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments5 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments5.getClass();
                        return (ArrayList) gz8.M(requireArguments5, "ARG_STATISTICS", ArrayList.class);
                    case 5:
                        List list8 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments6 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments6.getClass();
                        return (gc6) gz8.M(requireArguments6, "ARG_HEATMAP", gc6.class);
                    case 6:
                        List list9 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments7 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments7.getClass();
                        Boolean bool = (Boolean) gz8.M(requireArguments7, "ARG_HEATMAP_HOME_TEAM_SELECTED", Boolean.class);
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    case 7:
                        List list10 = ShareMatchStatisticsModal.I;
                        IShareContent data = shareMatchStatisticsModal2.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        mqi mqiVar4 = shareMatchStatisticsModal2.F;
                        mqi mqiVar5 = shareMatchStatisticsModal2.C;
                        mqi mqiVar6 = shareMatchStatisticsModal2.B;
                        mqi mqiVar7 = shareMatchStatisticsModal2.A;
                        List list11 = ShareMatchStatisticsModal.I;
                        qdh qdhVar = new qdh(shareMatchStatisticsModal2);
                        mqi mqiVar8 = shareMatchStatisticsModal2.D;
                        ArrayList arrayList5 = (ArrayList) mqiVar8.getValue();
                        if (arrayList5 != null) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                shareMatchStatisticsModal = shareMatchStatisticsModal2;
                                if (it.hasNext()) {
                                    obj4 = it.next();
                                    mqiVar = mqiVar4;
                                    if (!Intrinsics.c(((EventStatisticsGroup) obj4).getGroupName(), "Match overview")) {
                                        shareMatchStatisticsModal2 = shareMatchStatisticsModal;
                                        mqiVar4 = mqiVar;
                                    }
                                } else {
                                    mqiVar = mqiVar4;
                                    obj4 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj4;
                            if (eventStatisticsGroup != null && (list = eventStatisticsGroup.getStatisticsItems()) != null) {
                                Event O = shareMatchStatisticsModal.O();
                                O.getClass();
                                mqiVar2 = mqiVar5;
                                ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment = new ShareMatchStatisticsPageFragment();
                                mqiVar3 = mqiVar6;
                                shareMatchStatisticsPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O), fz8.H("ARG_TITLE", "Match overview"), fz8.G("ARG_STATISTICS", new ArrayList(list))));
                                qdhVar.v(shareMatchStatisticsPageFragment);
                                arrayList = (ArrayList) mqiVar8.getValue();
                                if (arrayList != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList6);
                                    }
                                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                                    List<String> list12 = ShareMatchStatisticsModal.I;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (String str : list12) {
                                        Iterator it3 = S0.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                list2 = S0;
                                                if (!Intrinsics.c(((EventStatisticsItem) obj3).getName(), str)) {
                                                    S0 = list2;
                                                }
                                            } else {
                                                list2 = S0;
                                                obj3 = null;
                                            }
                                        }
                                        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj3;
                                        if (eventStatisticsItem != null) {
                                            arrayList7.add(eventStatisticsItem);
                                        }
                                        S0 = list2;
                                    }
                                    if (arrayList7.size() > 2 && !list.containsAll(arrayList7)) {
                                        Event O2 = shareMatchStatisticsModal.O();
                                        O2.getClass();
                                        ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment2 = new ShareMatchStatisticsPageFragment();
                                        arrayList2 = null;
                                        shareMatchStatisticsPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O2), fz8.H("ARG_TITLE", null), fz8.G("ARG_STATISTICS", new ArrayList(arrayList7))));
                                        qdhVar.v(shareMatchStatisticsPageFragment2);
                                        if (((ArrayList) mqiVar7.getValue()) != null && ((vk8) mqiVar3.getValue()) != null && ((FootballShotmapItem) mqiVar2.getValue()) != null) {
                                            Event O3222 = shareMatchStatisticsModal.O();
                                            ArrayList arrayList8222 = (ArrayList) mqiVar7.getValue();
                                            vk8 vk8Var222 = (vk8) mqiVar3.getValue();
                                            FootballShotmapItem footballShotmapItem222 = (FootballShotmapItem) mqiVar2.getValue();
                                            O3222.getClass();
                                            ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment222 = new ShareMatchStatisticsShotmapPageFragment();
                                            shareMatchStatisticsShotmapPageFragment222.setArguments(fz8.C(fz8.G("ARG_EVENT", O3222), fz8.G("ARG_SHOTMAP", arrayList8222 == null ? new ArrayList(arrayList8222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem222)));
                                            qdhVar.v(shareMatchStatisticsShotmapPageFragment222);
                                        }
                                        arrayList3 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList3 != null) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Attack")) {
                                                    }
                                                } else {
                                                    obj2 = arrayList2;
                                                }
                                            }
                                            EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj2;
                                            if (eventStatisticsGroup2 != null && (statisticsItems2 = eventStatisticsGroup2.getStatisticsItems()) != null) {
                                                if (statisticsItems2.size() <= 2) {
                                                    statisticsItems2 = arrayList2;
                                                }
                                                if (statisticsItems2 != null) {
                                                    Event O4 = shareMatchStatisticsModal.O();
                                                    gc6 P = shareMatchStatisticsModal.P();
                                                    boolean booleanValue = ((Boolean) mqiVar.getValue()).booleanValue();
                                                    O4.getClass();
                                                    ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = new ShareMatchStatisticsAttackPageFragment();
                                                    shareMatchStatisticsAttackPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O4), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems2)), fz8.G("ARG_HEATMAP", P), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue)));
                                                    qdhVar.v(shareMatchStatisticsAttackPageFragment);
                                                    arrayList4 = (ArrayList) mqiVar8.getValue();
                                                    if (arrayList4 != null) {
                                                        Iterator it5 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                obj = it5.next();
                                                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Passes")) {
                                                                }
                                                            } else {
                                                                obj = arrayList2;
                                                            }
                                                        }
                                                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj;
                                                        if (eventStatisticsGroup3 != null && (statisticsItems = eventStatisticsGroup3.getStatisticsItems()) != null) {
                                                            if (statisticsItems.size() <= 2) {
                                                                statisticsItems = arrayList2;
                                                            }
                                                            if (statisticsItems != null) {
                                                                Event O5 = shareMatchStatisticsModal.O();
                                                                gc6 P2 = shareMatchStatisticsModal.P();
                                                                O5.getClass();
                                                                ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment = new ShareMatchStatisticsPassesPageFragment();
                                                                shareMatchStatisticsPassesPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O5), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems)), fz8.G("ARG_HEATMAP", P2), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                                qdhVar.v(shareMatchStatisticsPassesPageFragment);
                                                                return qdhVar;
                                                            }
                                                        }
                                                    }
                                                    if (shareMatchStatisticsModal.P() != null) {
                                                        Event O6 = shareMatchStatisticsModal.O();
                                                        km5 km5Var = km5.a;
                                                        gc6 P3 = shareMatchStatisticsModal.P();
                                                        O6.getClass();
                                                        ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment2 = new ShareMatchStatisticsPassesPageFragment();
                                                        shareMatchStatisticsPassesPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O6), fz8.G("ARG_STATISTICS", km5Var != null ? new ArrayList(km5Var) : arrayList2), fz8.G("ARG_HEATMAP", P3), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                        qdhVar.v(shareMatchStatisticsPassesPageFragment2);
                                                    }
                                                    return qdhVar;
                                                }
                                            }
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                            Event O7 = shareMatchStatisticsModal.O();
                                            km5 km5Var2 = km5.a;
                                            gc6 P4 = shareMatchStatisticsModal.P();
                                            boolean booleanValue2 = ((Boolean) mqiVar.getValue()).booleanValue();
                                            O7.getClass();
                                            ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment2 = new ShareMatchStatisticsAttackPageFragment();
                                            shareMatchStatisticsAttackPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O7), fz8.G("ARG_STATISTICS", km5Var2 != null ? new ArrayList(km5Var2) : arrayList2), fz8.G("ARG_HEATMAP", P4), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue2)));
                                            qdhVar.v(shareMatchStatisticsAttackPageFragment2);
                                        }
                                        arrayList4 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList4 != null) {
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                        }
                                        return qdhVar;
                                    }
                                }
                                arrayList2 = null;
                                if (((ArrayList) mqiVar7.getValue()) != null) {
                                    Event O32222 = shareMatchStatisticsModal.O();
                                    ArrayList arrayList82222 = (ArrayList) mqiVar7.getValue();
                                    vk8 vk8Var2222 = (vk8) mqiVar3.getValue();
                                    FootballShotmapItem footballShotmapItem2222 = (FootballShotmapItem) mqiVar2.getValue();
                                    O32222.getClass();
                                    ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment2222 = new ShareMatchStatisticsShotmapPageFragment();
                                    shareMatchStatisticsShotmapPageFragment2222.setArguments(fz8.C(fz8.G("ARG_EVENT", O32222), fz8.G("ARG_SHOTMAP", arrayList82222 == null ? new ArrayList(arrayList82222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var2222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem2222)));
                                    qdhVar.v(shareMatchStatisticsShotmapPageFragment2222);
                                }
                                arrayList3 = (ArrayList) mqiVar8.getValue();
                                if (arrayList3 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                arrayList4 = (ArrayList) mqiVar8.getValue();
                                if (arrayList4 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                return qdhVar;
                            }
                        } else {
                            shareMatchStatisticsModal = shareMatchStatisticsModal2;
                            mqiVar = mqiVar4;
                        }
                        mqiVar2 = mqiVar5;
                        mqiVar3 = mqiVar6;
                        list = km5.a;
                        arrayList = (ArrayList) mqiVar8.getValue();
                        if (arrayList != null) {
                        }
                        arrayList2 = null;
                        if (((ArrayList) mqiVar7.getValue()) != null) {
                        }
                        arrayList3 = (ArrayList) mqiVar8.getValue();
                        if (arrayList3 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        arrayList4 = (ArrayList) mqiVar8.getValue();
                        if (arrayList4 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        return qdhVar;
                }
            }
        });
        final int i5 = 4;
        this.D = ypa.b(new Function0(this) { // from class: edh
            public final /* synthetic */ ShareMatchStatisticsModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ShareMatchStatisticsModal shareMatchStatisticsModal;
                mqi mqiVar;
                mqi mqiVar2;
                mqi mqiVar3;
                List<EventStatisticsItem> list;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Object obj;
                List<EventStatisticsItem> statisticsItems;
                Object obj2;
                List<EventStatisticsItem> statisticsItems2;
                List list2;
                Object obj3;
                Object obj4;
                int i22 = i5;
                ShareMatchStatisticsModal shareMatchStatisticsModal2 = this.b;
                switch (i22) {
                    case 0:
                        List list3 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments = shareMatchStatisticsModal2.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DATA_HOLDER", ich.class);
                        if (M != null) {
                            return (ich) M;
                        }
                        a70.p("Serializable ARG_DATA_HOLDER not found");
                        return null;
                    case 1:
                        List list4 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments2 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments2.getClass();
                        return (ArrayList) gz8.M(requireArguments2, "ARG_SHOTMAP", ArrayList.class);
                    case 2:
                        List list5 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments3 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments3.getClass();
                        return (vk8) gz8.M(requireArguments3, "ARG_SHOTMAP_TEAM", vk8.class);
                    case 3:
                        List list6 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments4 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments4.getClass();
                        return (FootballShotmapItem) gz8.M(requireArguments4, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                    case 4:
                        List list7 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments5 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments5.getClass();
                        return (ArrayList) gz8.M(requireArguments5, "ARG_STATISTICS", ArrayList.class);
                    case 5:
                        List list8 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments6 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments6.getClass();
                        return (gc6) gz8.M(requireArguments6, "ARG_HEATMAP", gc6.class);
                    case 6:
                        List list9 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments7 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments7.getClass();
                        Boolean bool = (Boolean) gz8.M(requireArguments7, "ARG_HEATMAP_HOME_TEAM_SELECTED", Boolean.class);
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    case 7:
                        List list10 = ShareMatchStatisticsModal.I;
                        IShareContent data = shareMatchStatisticsModal2.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        mqi mqiVar4 = shareMatchStatisticsModal2.F;
                        mqi mqiVar5 = shareMatchStatisticsModal2.C;
                        mqi mqiVar6 = shareMatchStatisticsModal2.B;
                        mqi mqiVar7 = shareMatchStatisticsModal2.A;
                        List list11 = ShareMatchStatisticsModal.I;
                        qdh qdhVar = new qdh(shareMatchStatisticsModal2);
                        mqi mqiVar8 = shareMatchStatisticsModal2.D;
                        ArrayList arrayList5 = (ArrayList) mqiVar8.getValue();
                        if (arrayList5 != null) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                shareMatchStatisticsModal = shareMatchStatisticsModal2;
                                if (it.hasNext()) {
                                    obj4 = it.next();
                                    mqiVar = mqiVar4;
                                    if (!Intrinsics.c(((EventStatisticsGroup) obj4).getGroupName(), "Match overview")) {
                                        shareMatchStatisticsModal2 = shareMatchStatisticsModal;
                                        mqiVar4 = mqiVar;
                                    }
                                } else {
                                    mqiVar = mqiVar4;
                                    obj4 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj4;
                            if (eventStatisticsGroup != null && (list = eventStatisticsGroup.getStatisticsItems()) != null) {
                                Event O = shareMatchStatisticsModal.O();
                                O.getClass();
                                mqiVar2 = mqiVar5;
                                ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment = new ShareMatchStatisticsPageFragment();
                                mqiVar3 = mqiVar6;
                                shareMatchStatisticsPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O), fz8.H("ARG_TITLE", "Match overview"), fz8.G("ARG_STATISTICS", new ArrayList(list))));
                                qdhVar.v(shareMatchStatisticsPageFragment);
                                arrayList = (ArrayList) mqiVar8.getValue();
                                if (arrayList != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList6);
                                    }
                                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                                    List<String> list12 = ShareMatchStatisticsModal.I;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (String str : list12) {
                                        Iterator it3 = S0.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                list2 = S0;
                                                if (!Intrinsics.c(((EventStatisticsItem) obj3).getName(), str)) {
                                                    S0 = list2;
                                                }
                                            } else {
                                                list2 = S0;
                                                obj3 = null;
                                            }
                                        }
                                        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj3;
                                        if (eventStatisticsItem != null) {
                                            arrayList7.add(eventStatisticsItem);
                                        }
                                        S0 = list2;
                                    }
                                    if (arrayList7.size() > 2 && !list.containsAll(arrayList7)) {
                                        Event O2 = shareMatchStatisticsModal.O();
                                        O2.getClass();
                                        ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment2 = new ShareMatchStatisticsPageFragment();
                                        arrayList2 = null;
                                        shareMatchStatisticsPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O2), fz8.H("ARG_TITLE", null), fz8.G("ARG_STATISTICS", new ArrayList(arrayList7))));
                                        qdhVar.v(shareMatchStatisticsPageFragment2);
                                        if (((ArrayList) mqiVar7.getValue()) != null && ((vk8) mqiVar3.getValue()) != null && ((FootballShotmapItem) mqiVar2.getValue()) != null) {
                                            Event O32222 = shareMatchStatisticsModal.O();
                                            ArrayList arrayList82222 = (ArrayList) mqiVar7.getValue();
                                            vk8 vk8Var2222 = (vk8) mqiVar3.getValue();
                                            FootballShotmapItem footballShotmapItem2222 = (FootballShotmapItem) mqiVar2.getValue();
                                            O32222.getClass();
                                            ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment2222 = new ShareMatchStatisticsShotmapPageFragment();
                                            shareMatchStatisticsShotmapPageFragment2222.setArguments(fz8.C(fz8.G("ARG_EVENT", O32222), fz8.G("ARG_SHOTMAP", arrayList82222 == null ? new ArrayList(arrayList82222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var2222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem2222)));
                                            qdhVar.v(shareMatchStatisticsShotmapPageFragment2222);
                                        }
                                        arrayList3 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList3 != null) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Attack")) {
                                                    }
                                                } else {
                                                    obj2 = arrayList2;
                                                }
                                            }
                                            EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj2;
                                            if (eventStatisticsGroup2 != null && (statisticsItems2 = eventStatisticsGroup2.getStatisticsItems()) != null) {
                                                if (statisticsItems2.size() <= 2) {
                                                    statisticsItems2 = arrayList2;
                                                }
                                                if (statisticsItems2 != null) {
                                                    Event O4 = shareMatchStatisticsModal.O();
                                                    gc6 P = shareMatchStatisticsModal.P();
                                                    boolean booleanValue = ((Boolean) mqiVar.getValue()).booleanValue();
                                                    O4.getClass();
                                                    ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = new ShareMatchStatisticsAttackPageFragment();
                                                    shareMatchStatisticsAttackPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O4), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems2)), fz8.G("ARG_HEATMAP", P), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue)));
                                                    qdhVar.v(shareMatchStatisticsAttackPageFragment);
                                                    arrayList4 = (ArrayList) mqiVar8.getValue();
                                                    if (arrayList4 != null) {
                                                        Iterator it5 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                obj = it5.next();
                                                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Passes")) {
                                                                }
                                                            } else {
                                                                obj = arrayList2;
                                                            }
                                                        }
                                                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj;
                                                        if (eventStatisticsGroup3 != null && (statisticsItems = eventStatisticsGroup3.getStatisticsItems()) != null) {
                                                            if (statisticsItems.size() <= 2) {
                                                                statisticsItems = arrayList2;
                                                            }
                                                            if (statisticsItems != null) {
                                                                Event O5 = shareMatchStatisticsModal.O();
                                                                gc6 P2 = shareMatchStatisticsModal.P();
                                                                O5.getClass();
                                                                ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment = new ShareMatchStatisticsPassesPageFragment();
                                                                shareMatchStatisticsPassesPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O5), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems)), fz8.G("ARG_HEATMAP", P2), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                                qdhVar.v(shareMatchStatisticsPassesPageFragment);
                                                                return qdhVar;
                                                            }
                                                        }
                                                    }
                                                    if (shareMatchStatisticsModal.P() != null) {
                                                        Event O6 = shareMatchStatisticsModal.O();
                                                        km5 km5Var = km5.a;
                                                        gc6 P3 = shareMatchStatisticsModal.P();
                                                        O6.getClass();
                                                        ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment2 = new ShareMatchStatisticsPassesPageFragment();
                                                        shareMatchStatisticsPassesPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O6), fz8.G("ARG_STATISTICS", km5Var != null ? new ArrayList(km5Var) : arrayList2), fz8.G("ARG_HEATMAP", P3), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                        qdhVar.v(shareMatchStatisticsPassesPageFragment2);
                                                    }
                                                    return qdhVar;
                                                }
                                            }
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                            Event O7 = shareMatchStatisticsModal.O();
                                            km5 km5Var2 = km5.a;
                                            gc6 P4 = shareMatchStatisticsModal.P();
                                            boolean booleanValue2 = ((Boolean) mqiVar.getValue()).booleanValue();
                                            O7.getClass();
                                            ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment2 = new ShareMatchStatisticsAttackPageFragment();
                                            shareMatchStatisticsAttackPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O7), fz8.G("ARG_STATISTICS", km5Var2 != null ? new ArrayList(km5Var2) : arrayList2), fz8.G("ARG_HEATMAP", P4), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue2)));
                                            qdhVar.v(shareMatchStatisticsAttackPageFragment2);
                                        }
                                        arrayList4 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList4 != null) {
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                        }
                                        return qdhVar;
                                    }
                                }
                                arrayList2 = null;
                                if (((ArrayList) mqiVar7.getValue()) != null) {
                                    Event O322222 = shareMatchStatisticsModal.O();
                                    ArrayList arrayList822222 = (ArrayList) mqiVar7.getValue();
                                    vk8 vk8Var22222 = (vk8) mqiVar3.getValue();
                                    FootballShotmapItem footballShotmapItem22222 = (FootballShotmapItem) mqiVar2.getValue();
                                    O322222.getClass();
                                    ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment22222 = new ShareMatchStatisticsShotmapPageFragment();
                                    shareMatchStatisticsShotmapPageFragment22222.setArguments(fz8.C(fz8.G("ARG_EVENT", O322222), fz8.G("ARG_SHOTMAP", arrayList822222 == null ? new ArrayList(arrayList822222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var22222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem22222)));
                                    qdhVar.v(shareMatchStatisticsShotmapPageFragment22222);
                                }
                                arrayList3 = (ArrayList) mqiVar8.getValue();
                                if (arrayList3 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                arrayList4 = (ArrayList) mqiVar8.getValue();
                                if (arrayList4 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                return qdhVar;
                            }
                        } else {
                            shareMatchStatisticsModal = shareMatchStatisticsModal2;
                            mqiVar = mqiVar4;
                        }
                        mqiVar2 = mqiVar5;
                        mqiVar3 = mqiVar6;
                        list = km5.a;
                        arrayList = (ArrayList) mqiVar8.getValue();
                        if (arrayList != null) {
                        }
                        arrayList2 = null;
                        if (((ArrayList) mqiVar7.getValue()) != null) {
                        }
                        arrayList3 = (ArrayList) mqiVar8.getValue();
                        if (arrayList3 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        arrayList4 = (ArrayList) mqiVar8.getValue();
                        if (arrayList4 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        return qdhVar;
                }
            }
        });
        final int i6 = 5;
        this.E = ypa.b(new Function0(this) { // from class: edh
            public final /* synthetic */ ShareMatchStatisticsModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ShareMatchStatisticsModal shareMatchStatisticsModal;
                mqi mqiVar;
                mqi mqiVar2;
                mqi mqiVar3;
                List<EventStatisticsItem> list;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Object obj;
                List<EventStatisticsItem> statisticsItems;
                Object obj2;
                List<EventStatisticsItem> statisticsItems2;
                List list2;
                Object obj3;
                Object obj4;
                int i22 = i6;
                ShareMatchStatisticsModal shareMatchStatisticsModal2 = this.b;
                switch (i22) {
                    case 0:
                        List list3 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments = shareMatchStatisticsModal2.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DATA_HOLDER", ich.class);
                        if (M != null) {
                            return (ich) M;
                        }
                        a70.p("Serializable ARG_DATA_HOLDER not found");
                        return null;
                    case 1:
                        List list4 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments2 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments2.getClass();
                        return (ArrayList) gz8.M(requireArguments2, "ARG_SHOTMAP", ArrayList.class);
                    case 2:
                        List list5 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments3 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments3.getClass();
                        return (vk8) gz8.M(requireArguments3, "ARG_SHOTMAP_TEAM", vk8.class);
                    case 3:
                        List list6 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments4 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments4.getClass();
                        return (FootballShotmapItem) gz8.M(requireArguments4, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                    case 4:
                        List list7 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments5 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments5.getClass();
                        return (ArrayList) gz8.M(requireArguments5, "ARG_STATISTICS", ArrayList.class);
                    case 5:
                        List list8 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments6 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments6.getClass();
                        return (gc6) gz8.M(requireArguments6, "ARG_HEATMAP", gc6.class);
                    case 6:
                        List list9 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments7 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments7.getClass();
                        Boolean bool = (Boolean) gz8.M(requireArguments7, "ARG_HEATMAP_HOME_TEAM_SELECTED", Boolean.class);
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    case 7:
                        List list10 = ShareMatchStatisticsModal.I;
                        IShareContent data = shareMatchStatisticsModal2.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        mqi mqiVar4 = shareMatchStatisticsModal2.F;
                        mqi mqiVar5 = shareMatchStatisticsModal2.C;
                        mqi mqiVar6 = shareMatchStatisticsModal2.B;
                        mqi mqiVar7 = shareMatchStatisticsModal2.A;
                        List list11 = ShareMatchStatisticsModal.I;
                        qdh qdhVar = new qdh(shareMatchStatisticsModal2);
                        mqi mqiVar8 = shareMatchStatisticsModal2.D;
                        ArrayList arrayList5 = (ArrayList) mqiVar8.getValue();
                        if (arrayList5 != null) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                shareMatchStatisticsModal = shareMatchStatisticsModal2;
                                if (it.hasNext()) {
                                    obj4 = it.next();
                                    mqiVar = mqiVar4;
                                    if (!Intrinsics.c(((EventStatisticsGroup) obj4).getGroupName(), "Match overview")) {
                                        shareMatchStatisticsModal2 = shareMatchStatisticsModal;
                                        mqiVar4 = mqiVar;
                                    }
                                } else {
                                    mqiVar = mqiVar4;
                                    obj4 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj4;
                            if (eventStatisticsGroup != null && (list = eventStatisticsGroup.getStatisticsItems()) != null) {
                                Event O = shareMatchStatisticsModal.O();
                                O.getClass();
                                mqiVar2 = mqiVar5;
                                ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment = new ShareMatchStatisticsPageFragment();
                                mqiVar3 = mqiVar6;
                                shareMatchStatisticsPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O), fz8.H("ARG_TITLE", "Match overview"), fz8.G("ARG_STATISTICS", new ArrayList(list))));
                                qdhVar.v(shareMatchStatisticsPageFragment);
                                arrayList = (ArrayList) mqiVar8.getValue();
                                if (arrayList != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList6);
                                    }
                                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                                    List<String> list12 = ShareMatchStatisticsModal.I;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (String str : list12) {
                                        Iterator it3 = S0.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                list2 = S0;
                                                if (!Intrinsics.c(((EventStatisticsItem) obj3).getName(), str)) {
                                                    S0 = list2;
                                                }
                                            } else {
                                                list2 = S0;
                                                obj3 = null;
                                            }
                                        }
                                        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj3;
                                        if (eventStatisticsItem != null) {
                                            arrayList7.add(eventStatisticsItem);
                                        }
                                        S0 = list2;
                                    }
                                    if (arrayList7.size() > 2 && !list.containsAll(arrayList7)) {
                                        Event O2 = shareMatchStatisticsModal.O();
                                        O2.getClass();
                                        ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment2 = new ShareMatchStatisticsPageFragment();
                                        arrayList2 = null;
                                        shareMatchStatisticsPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O2), fz8.H("ARG_TITLE", null), fz8.G("ARG_STATISTICS", new ArrayList(arrayList7))));
                                        qdhVar.v(shareMatchStatisticsPageFragment2);
                                        if (((ArrayList) mqiVar7.getValue()) != null && ((vk8) mqiVar3.getValue()) != null && ((FootballShotmapItem) mqiVar2.getValue()) != null) {
                                            Event O322222 = shareMatchStatisticsModal.O();
                                            ArrayList arrayList822222 = (ArrayList) mqiVar7.getValue();
                                            vk8 vk8Var22222 = (vk8) mqiVar3.getValue();
                                            FootballShotmapItem footballShotmapItem22222 = (FootballShotmapItem) mqiVar2.getValue();
                                            O322222.getClass();
                                            ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment22222 = new ShareMatchStatisticsShotmapPageFragment();
                                            shareMatchStatisticsShotmapPageFragment22222.setArguments(fz8.C(fz8.G("ARG_EVENT", O322222), fz8.G("ARG_SHOTMAP", arrayList822222 == null ? new ArrayList(arrayList822222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var22222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem22222)));
                                            qdhVar.v(shareMatchStatisticsShotmapPageFragment22222);
                                        }
                                        arrayList3 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList3 != null) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Attack")) {
                                                    }
                                                } else {
                                                    obj2 = arrayList2;
                                                }
                                            }
                                            EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj2;
                                            if (eventStatisticsGroup2 != null && (statisticsItems2 = eventStatisticsGroup2.getStatisticsItems()) != null) {
                                                if (statisticsItems2.size() <= 2) {
                                                    statisticsItems2 = arrayList2;
                                                }
                                                if (statisticsItems2 != null) {
                                                    Event O4 = shareMatchStatisticsModal.O();
                                                    gc6 P = shareMatchStatisticsModal.P();
                                                    boolean booleanValue = ((Boolean) mqiVar.getValue()).booleanValue();
                                                    O4.getClass();
                                                    ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = new ShareMatchStatisticsAttackPageFragment();
                                                    shareMatchStatisticsAttackPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O4), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems2)), fz8.G("ARG_HEATMAP", P), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue)));
                                                    qdhVar.v(shareMatchStatisticsAttackPageFragment);
                                                    arrayList4 = (ArrayList) mqiVar8.getValue();
                                                    if (arrayList4 != null) {
                                                        Iterator it5 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                obj = it5.next();
                                                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Passes")) {
                                                                }
                                                            } else {
                                                                obj = arrayList2;
                                                            }
                                                        }
                                                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj;
                                                        if (eventStatisticsGroup3 != null && (statisticsItems = eventStatisticsGroup3.getStatisticsItems()) != null) {
                                                            if (statisticsItems.size() <= 2) {
                                                                statisticsItems = arrayList2;
                                                            }
                                                            if (statisticsItems != null) {
                                                                Event O5 = shareMatchStatisticsModal.O();
                                                                gc6 P2 = shareMatchStatisticsModal.P();
                                                                O5.getClass();
                                                                ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment = new ShareMatchStatisticsPassesPageFragment();
                                                                shareMatchStatisticsPassesPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O5), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems)), fz8.G("ARG_HEATMAP", P2), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                                qdhVar.v(shareMatchStatisticsPassesPageFragment);
                                                                return qdhVar;
                                                            }
                                                        }
                                                    }
                                                    if (shareMatchStatisticsModal.P() != null) {
                                                        Event O6 = shareMatchStatisticsModal.O();
                                                        km5 km5Var = km5.a;
                                                        gc6 P3 = shareMatchStatisticsModal.P();
                                                        O6.getClass();
                                                        ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment2 = new ShareMatchStatisticsPassesPageFragment();
                                                        shareMatchStatisticsPassesPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O6), fz8.G("ARG_STATISTICS", km5Var != null ? new ArrayList(km5Var) : arrayList2), fz8.G("ARG_HEATMAP", P3), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                        qdhVar.v(shareMatchStatisticsPassesPageFragment2);
                                                    }
                                                    return qdhVar;
                                                }
                                            }
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                            Event O7 = shareMatchStatisticsModal.O();
                                            km5 km5Var2 = km5.a;
                                            gc6 P4 = shareMatchStatisticsModal.P();
                                            boolean booleanValue2 = ((Boolean) mqiVar.getValue()).booleanValue();
                                            O7.getClass();
                                            ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment2 = new ShareMatchStatisticsAttackPageFragment();
                                            shareMatchStatisticsAttackPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O7), fz8.G("ARG_STATISTICS", km5Var2 != null ? new ArrayList(km5Var2) : arrayList2), fz8.G("ARG_HEATMAP", P4), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue2)));
                                            qdhVar.v(shareMatchStatisticsAttackPageFragment2);
                                        }
                                        arrayList4 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList4 != null) {
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                        }
                                        return qdhVar;
                                    }
                                }
                                arrayList2 = null;
                                if (((ArrayList) mqiVar7.getValue()) != null) {
                                    Event O3222222 = shareMatchStatisticsModal.O();
                                    ArrayList arrayList8222222 = (ArrayList) mqiVar7.getValue();
                                    vk8 vk8Var222222 = (vk8) mqiVar3.getValue();
                                    FootballShotmapItem footballShotmapItem222222 = (FootballShotmapItem) mqiVar2.getValue();
                                    O3222222.getClass();
                                    ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment222222 = new ShareMatchStatisticsShotmapPageFragment();
                                    shareMatchStatisticsShotmapPageFragment222222.setArguments(fz8.C(fz8.G("ARG_EVENT", O3222222), fz8.G("ARG_SHOTMAP", arrayList8222222 == null ? new ArrayList(arrayList8222222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var222222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem222222)));
                                    qdhVar.v(shareMatchStatisticsShotmapPageFragment222222);
                                }
                                arrayList3 = (ArrayList) mqiVar8.getValue();
                                if (arrayList3 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                arrayList4 = (ArrayList) mqiVar8.getValue();
                                if (arrayList4 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                return qdhVar;
                            }
                        } else {
                            shareMatchStatisticsModal = shareMatchStatisticsModal2;
                            mqiVar = mqiVar4;
                        }
                        mqiVar2 = mqiVar5;
                        mqiVar3 = mqiVar6;
                        list = km5.a;
                        arrayList = (ArrayList) mqiVar8.getValue();
                        if (arrayList != null) {
                        }
                        arrayList2 = null;
                        if (((ArrayList) mqiVar7.getValue()) != null) {
                        }
                        arrayList3 = (ArrayList) mqiVar8.getValue();
                        if (arrayList3 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        arrayList4 = (ArrayList) mqiVar8.getValue();
                        if (arrayList4 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        return qdhVar;
                }
            }
        });
        final int i7 = 6;
        this.F = ypa.b(new Function0(this) { // from class: edh
            public final /* synthetic */ ShareMatchStatisticsModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ShareMatchStatisticsModal shareMatchStatisticsModal;
                mqi mqiVar;
                mqi mqiVar2;
                mqi mqiVar3;
                List<EventStatisticsItem> list;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Object obj;
                List<EventStatisticsItem> statisticsItems;
                Object obj2;
                List<EventStatisticsItem> statisticsItems2;
                List list2;
                Object obj3;
                Object obj4;
                int i22 = i7;
                ShareMatchStatisticsModal shareMatchStatisticsModal2 = this.b;
                switch (i22) {
                    case 0:
                        List list3 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments = shareMatchStatisticsModal2.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DATA_HOLDER", ich.class);
                        if (M != null) {
                            return (ich) M;
                        }
                        a70.p("Serializable ARG_DATA_HOLDER not found");
                        return null;
                    case 1:
                        List list4 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments2 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments2.getClass();
                        return (ArrayList) gz8.M(requireArguments2, "ARG_SHOTMAP", ArrayList.class);
                    case 2:
                        List list5 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments3 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments3.getClass();
                        return (vk8) gz8.M(requireArguments3, "ARG_SHOTMAP_TEAM", vk8.class);
                    case 3:
                        List list6 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments4 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments4.getClass();
                        return (FootballShotmapItem) gz8.M(requireArguments4, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                    case 4:
                        List list7 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments5 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments5.getClass();
                        return (ArrayList) gz8.M(requireArguments5, "ARG_STATISTICS", ArrayList.class);
                    case 5:
                        List list8 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments6 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments6.getClass();
                        return (gc6) gz8.M(requireArguments6, "ARG_HEATMAP", gc6.class);
                    case 6:
                        List list9 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments7 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments7.getClass();
                        Boolean bool = (Boolean) gz8.M(requireArguments7, "ARG_HEATMAP_HOME_TEAM_SELECTED", Boolean.class);
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    case 7:
                        List list10 = ShareMatchStatisticsModal.I;
                        IShareContent data = shareMatchStatisticsModal2.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        mqi mqiVar4 = shareMatchStatisticsModal2.F;
                        mqi mqiVar5 = shareMatchStatisticsModal2.C;
                        mqi mqiVar6 = shareMatchStatisticsModal2.B;
                        mqi mqiVar7 = shareMatchStatisticsModal2.A;
                        List list11 = ShareMatchStatisticsModal.I;
                        qdh qdhVar = new qdh(shareMatchStatisticsModal2);
                        mqi mqiVar8 = shareMatchStatisticsModal2.D;
                        ArrayList arrayList5 = (ArrayList) mqiVar8.getValue();
                        if (arrayList5 != null) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                shareMatchStatisticsModal = shareMatchStatisticsModal2;
                                if (it.hasNext()) {
                                    obj4 = it.next();
                                    mqiVar = mqiVar4;
                                    if (!Intrinsics.c(((EventStatisticsGroup) obj4).getGroupName(), "Match overview")) {
                                        shareMatchStatisticsModal2 = shareMatchStatisticsModal;
                                        mqiVar4 = mqiVar;
                                    }
                                } else {
                                    mqiVar = mqiVar4;
                                    obj4 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj4;
                            if (eventStatisticsGroup != null && (list = eventStatisticsGroup.getStatisticsItems()) != null) {
                                Event O = shareMatchStatisticsModal.O();
                                O.getClass();
                                mqiVar2 = mqiVar5;
                                ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment = new ShareMatchStatisticsPageFragment();
                                mqiVar3 = mqiVar6;
                                shareMatchStatisticsPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O), fz8.H("ARG_TITLE", "Match overview"), fz8.G("ARG_STATISTICS", new ArrayList(list))));
                                qdhVar.v(shareMatchStatisticsPageFragment);
                                arrayList = (ArrayList) mqiVar8.getValue();
                                if (arrayList != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList6);
                                    }
                                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                                    List<String> list12 = ShareMatchStatisticsModal.I;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (String str : list12) {
                                        Iterator it3 = S0.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                list2 = S0;
                                                if (!Intrinsics.c(((EventStatisticsItem) obj3).getName(), str)) {
                                                    S0 = list2;
                                                }
                                            } else {
                                                list2 = S0;
                                                obj3 = null;
                                            }
                                        }
                                        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj3;
                                        if (eventStatisticsItem != null) {
                                            arrayList7.add(eventStatisticsItem);
                                        }
                                        S0 = list2;
                                    }
                                    if (arrayList7.size() > 2 && !list.containsAll(arrayList7)) {
                                        Event O2 = shareMatchStatisticsModal.O();
                                        O2.getClass();
                                        ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment2 = new ShareMatchStatisticsPageFragment();
                                        arrayList2 = null;
                                        shareMatchStatisticsPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O2), fz8.H("ARG_TITLE", null), fz8.G("ARG_STATISTICS", new ArrayList(arrayList7))));
                                        qdhVar.v(shareMatchStatisticsPageFragment2);
                                        if (((ArrayList) mqiVar7.getValue()) != null && ((vk8) mqiVar3.getValue()) != null && ((FootballShotmapItem) mqiVar2.getValue()) != null) {
                                            Event O3222222 = shareMatchStatisticsModal.O();
                                            ArrayList arrayList8222222 = (ArrayList) mqiVar7.getValue();
                                            vk8 vk8Var222222 = (vk8) mqiVar3.getValue();
                                            FootballShotmapItem footballShotmapItem222222 = (FootballShotmapItem) mqiVar2.getValue();
                                            O3222222.getClass();
                                            ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment222222 = new ShareMatchStatisticsShotmapPageFragment();
                                            shareMatchStatisticsShotmapPageFragment222222.setArguments(fz8.C(fz8.G("ARG_EVENT", O3222222), fz8.G("ARG_SHOTMAP", arrayList8222222 == null ? new ArrayList(arrayList8222222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var222222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem222222)));
                                            qdhVar.v(shareMatchStatisticsShotmapPageFragment222222);
                                        }
                                        arrayList3 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList3 != null) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Attack")) {
                                                    }
                                                } else {
                                                    obj2 = arrayList2;
                                                }
                                            }
                                            EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj2;
                                            if (eventStatisticsGroup2 != null && (statisticsItems2 = eventStatisticsGroup2.getStatisticsItems()) != null) {
                                                if (statisticsItems2.size() <= 2) {
                                                    statisticsItems2 = arrayList2;
                                                }
                                                if (statisticsItems2 != null) {
                                                    Event O4 = shareMatchStatisticsModal.O();
                                                    gc6 P = shareMatchStatisticsModal.P();
                                                    boolean booleanValue = ((Boolean) mqiVar.getValue()).booleanValue();
                                                    O4.getClass();
                                                    ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = new ShareMatchStatisticsAttackPageFragment();
                                                    shareMatchStatisticsAttackPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O4), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems2)), fz8.G("ARG_HEATMAP", P), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue)));
                                                    qdhVar.v(shareMatchStatisticsAttackPageFragment);
                                                    arrayList4 = (ArrayList) mqiVar8.getValue();
                                                    if (arrayList4 != null) {
                                                        Iterator it5 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                obj = it5.next();
                                                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Passes")) {
                                                                }
                                                            } else {
                                                                obj = arrayList2;
                                                            }
                                                        }
                                                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj;
                                                        if (eventStatisticsGroup3 != null && (statisticsItems = eventStatisticsGroup3.getStatisticsItems()) != null) {
                                                            if (statisticsItems.size() <= 2) {
                                                                statisticsItems = arrayList2;
                                                            }
                                                            if (statisticsItems != null) {
                                                                Event O5 = shareMatchStatisticsModal.O();
                                                                gc6 P2 = shareMatchStatisticsModal.P();
                                                                O5.getClass();
                                                                ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment = new ShareMatchStatisticsPassesPageFragment();
                                                                shareMatchStatisticsPassesPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O5), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems)), fz8.G("ARG_HEATMAP", P2), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                                qdhVar.v(shareMatchStatisticsPassesPageFragment);
                                                                return qdhVar;
                                                            }
                                                        }
                                                    }
                                                    if (shareMatchStatisticsModal.P() != null) {
                                                        Event O6 = shareMatchStatisticsModal.O();
                                                        km5 km5Var = km5.a;
                                                        gc6 P3 = shareMatchStatisticsModal.P();
                                                        O6.getClass();
                                                        ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment2 = new ShareMatchStatisticsPassesPageFragment();
                                                        shareMatchStatisticsPassesPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O6), fz8.G("ARG_STATISTICS", km5Var != null ? new ArrayList(km5Var) : arrayList2), fz8.G("ARG_HEATMAP", P3), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                        qdhVar.v(shareMatchStatisticsPassesPageFragment2);
                                                    }
                                                    return qdhVar;
                                                }
                                            }
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                            Event O7 = shareMatchStatisticsModal.O();
                                            km5 km5Var2 = km5.a;
                                            gc6 P4 = shareMatchStatisticsModal.P();
                                            boolean booleanValue2 = ((Boolean) mqiVar.getValue()).booleanValue();
                                            O7.getClass();
                                            ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment2 = new ShareMatchStatisticsAttackPageFragment();
                                            shareMatchStatisticsAttackPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O7), fz8.G("ARG_STATISTICS", km5Var2 != null ? new ArrayList(km5Var2) : arrayList2), fz8.G("ARG_HEATMAP", P4), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue2)));
                                            qdhVar.v(shareMatchStatisticsAttackPageFragment2);
                                        }
                                        arrayList4 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList4 != null) {
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                        }
                                        return qdhVar;
                                    }
                                }
                                arrayList2 = null;
                                if (((ArrayList) mqiVar7.getValue()) != null) {
                                    Event O32222222 = shareMatchStatisticsModal.O();
                                    ArrayList arrayList82222222 = (ArrayList) mqiVar7.getValue();
                                    vk8 vk8Var2222222 = (vk8) mqiVar3.getValue();
                                    FootballShotmapItem footballShotmapItem2222222 = (FootballShotmapItem) mqiVar2.getValue();
                                    O32222222.getClass();
                                    ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment2222222 = new ShareMatchStatisticsShotmapPageFragment();
                                    shareMatchStatisticsShotmapPageFragment2222222.setArguments(fz8.C(fz8.G("ARG_EVENT", O32222222), fz8.G("ARG_SHOTMAP", arrayList82222222 == null ? new ArrayList(arrayList82222222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var2222222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem2222222)));
                                    qdhVar.v(shareMatchStatisticsShotmapPageFragment2222222);
                                }
                                arrayList3 = (ArrayList) mqiVar8.getValue();
                                if (arrayList3 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                arrayList4 = (ArrayList) mqiVar8.getValue();
                                if (arrayList4 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                return qdhVar;
                            }
                        } else {
                            shareMatchStatisticsModal = shareMatchStatisticsModal2;
                            mqiVar = mqiVar4;
                        }
                        mqiVar2 = mqiVar5;
                        mqiVar3 = mqiVar6;
                        list = km5.a;
                        arrayList = (ArrayList) mqiVar8.getValue();
                        if (arrayList != null) {
                        }
                        arrayList2 = null;
                        if (((ArrayList) mqiVar7.getValue()) != null) {
                        }
                        arrayList3 = (ArrayList) mqiVar8.getValue();
                        if (arrayList3 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        arrayList4 = (ArrayList) mqiVar8.getValue();
                        if (arrayList4 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        return qdhVar;
                }
            }
        });
        final int i8 = 7;
        this.G = ypa.b(new Function0(this) { // from class: edh
            public final /* synthetic */ ShareMatchStatisticsModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ShareMatchStatisticsModal shareMatchStatisticsModal;
                mqi mqiVar;
                mqi mqiVar2;
                mqi mqiVar3;
                List<EventStatisticsItem> list;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Object obj;
                List<EventStatisticsItem> statisticsItems;
                Object obj2;
                List<EventStatisticsItem> statisticsItems2;
                List list2;
                Object obj3;
                Object obj4;
                int i22 = i8;
                ShareMatchStatisticsModal shareMatchStatisticsModal2 = this.b;
                switch (i22) {
                    case 0:
                        List list3 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments = shareMatchStatisticsModal2.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DATA_HOLDER", ich.class);
                        if (M != null) {
                            return (ich) M;
                        }
                        a70.p("Serializable ARG_DATA_HOLDER not found");
                        return null;
                    case 1:
                        List list4 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments2 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments2.getClass();
                        return (ArrayList) gz8.M(requireArguments2, "ARG_SHOTMAP", ArrayList.class);
                    case 2:
                        List list5 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments3 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments3.getClass();
                        return (vk8) gz8.M(requireArguments3, "ARG_SHOTMAP_TEAM", vk8.class);
                    case 3:
                        List list6 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments4 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments4.getClass();
                        return (FootballShotmapItem) gz8.M(requireArguments4, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                    case 4:
                        List list7 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments5 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments5.getClass();
                        return (ArrayList) gz8.M(requireArguments5, "ARG_STATISTICS", ArrayList.class);
                    case 5:
                        List list8 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments6 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments6.getClass();
                        return (gc6) gz8.M(requireArguments6, "ARG_HEATMAP", gc6.class);
                    case 6:
                        List list9 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments7 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments7.getClass();
                        Boolean bool = (Boolean) gz8.M(requireArguments7, "ARG_HEATMAP_HOME_TEAM_SELECTED", Boolean.class);
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    case 7:
                        List list10 = ShareMatchStatisticsModal.I;
                        IShareContent data = shareMatchStatisticsModal2.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        mqi mqiVar4 = shareMatchStatisticsModal2.F;
                        mqi mqiVar5 = shareMatchStatisticsModal2.C;
                        mqi mqiVar6 = shareMatchStatisticsModal2.B;
                        mqi mqiVar7 = shareMatchStatisticsModal2.A;
                        List list11 = ShareMatchStatisticsModal.I;
                        qdh qdhVar = new qdh(shareMatchStatisticsModal2);
                        mqi mqiVar8 = shareMatchStatisticsModal2.D;
                        ArrayList arrayList5 = (ArrayList) mqiVar8.getValue();
                        if (arrayList5 != null) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                shareMatchStatisticsModal = shareMatchStatisticsModal2;
                                if (it.hasNext()) {
                                    obj4 = it.next();
                                    mqiVar = mqiVar4;
                                    if (!Intrinsics.c(((EventStatisticsGroup) obj4).getGroupName(), "Match overview")) {
                                        shareMatchStatisticsModal2 = shareMatchStatisticsModal;
                                        mqiVar4 = mqiVar;
                                    }
                                } else {
                                    mqiVar = mqiVar4;
                                    obj4 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj4;
                            if (eventStatisticsGroup != null && (list = eventStatisticsGroup.getStatisticsItems()) != null) {
                                Event O = shareMatchStatisticsModal.O();
                                O.getClass();
                                mqiVar2 = mqiVar5;
                                ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment = new ShareMatchStatisticsPageFragment();
                                mqiVar3 = mqiVar6;
                                shareMatchStatisticsPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O), fz8.H("ARG_TITLE", "Match overview"), fz8.G("ARG_STATISTICS", new ArrayList(list))));
                                qdhVar.v(shareMatchStatisticsPageFragment);
                                arrayList = (ArrayList) mqiVar8.getValue();
                                if (arrayList != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList6);
                                    }
                                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                                    List<String> list12 = ShareMatchStatisticsModal.I;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (String str : list12) {
                                        Iterator it3 = S0.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                list2 = S0;
                                                if (!Intrinsics.c(((EventStatisticsItem) obj3).getName(), str)) {
                                                    S0 = list2;
                                                }
                                            } else {
                                                list2 = S0;
                                                obj3 = null;
                                            }
                                        }
                                        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj3;
                                        if (eventStatisticsItem != null) {
                                            arrayList7.add(eventStatisticsItem);
                                        }
                                        S0 = list2;
                                    }
                                    if (arrayList7.size() > 2 && !list.containsAll(arrayList7)) {
                                        Event O2 = shareMatchStatisticsModal.O();
                                        O2.getClass();
                                        ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment2 = new ShareMatchStatisticsPageFragment();
                                        arrayList2 = null;
                                        shareMatchStatisticsPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O2), fz8.H("ARG_TITLE", null), fz8.G("ARG_STATISTICS", new ArrayList(arrayList7))));
                                        qdhVar.v(shareMatchStatisticsPageFragment2);
                                        if (((ArrayList) mqiVar7.getValue()) != null && ((vk8) mqiVar3.getValue()) != null && ((FootballShotmapItem) mqiVar2.getValue()) != null) {
                                            Event O32222222 = shareMatchStatisticsModal.O();
                                            ArrayList arrayList82222222 = (ArrayList) mqiVar7.getValue();
                                            vk8 vk8Var2222222 = (vk8) mqiVar3.getValue();
                                            FootballShotmapItem footballShotmapItem2222222 = (FootballShotmapItem) mqiVar2.getValue();
                                            O32222222.getClass();
                                            ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment2222222 = new ShareMatchStatisticsShotmapPageFragment();
                                            shareMatchStatisticsShotmapPageFragment2222222.setArguments(fz8.C(fz8.G("ARG_EVENT", O32222222), fz8.G("ARG_SHOTMAP", arrayList82222222 == null ? new ArrayList(arrayList82222222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var2222222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem2222222)));
                                            qdhVar.v(shareMatchStatisticsShotmapPageFragment2222222);
                                        }
                                        arrayList3 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList3 != null) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Attack")) {
                                                    }
                                                } else {
                                                    obj2 = arrayList2;
                                                }
                                            }
                                            EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj2;
                                            if (eventStatisticsGroup2 != null && (statisticsItems2 = eventStatisticsGroup2.getStatisticsItems()) != null) {
                                                if (statisticsItems2.size() <= 2) {
                                                    statisticsItems2 = arrayList2;
                                                }
                                                if (statisticsItems2 != null) {
                                                    Event O4 = shareMatchStatisticsModal.O();
                                                    gc6 P = shareMatchStatisticsModal.P();
                                                    boolean booleanValue = ((Boolean) mqiVar.getValue()).booleanValue();
                                                    O4.getClass();
                                                    ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = new ShareMatchStatisticsAttackPageFragment();
                                                    shareMatchStatisticsAttackPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O4), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems2)), fz8.G("ARG_HEATMAP", P), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue)));
                                                    qdhVar.v(shareMatchStatisticsAttackPageFragment);
                                                    arrayList4 = (ArrayList) mqiVar8.getValue();
                                                    if (arrayList4 != null) {
                                                        Iterator it5 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                obj = it5.next();
                                                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Passes")) {
                                                                }
                                                            } else {
                                                                obj = arrayList2;
                                                            }
                                                        }
                                                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj;
                                                        if (eventStatisticsGroup3 != null && (statisticsItems = eventStatisticsGroup3.getStatisticsItems()) != null) {
                                                            if (statisticsItems.size() <= 2) {
                                                                statisticsItems = arrayList2;
                                                            }
                                                            if (statisticsItems != null) {
                                                                Event O5 = shareMatchStatisticsModal.O();
                                                                gc6 P2 = shareMatchStatisticsModal.P();
                                                                O5.getClass();
                                                                ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment = new ShareMatchStatisticsPassesPageFragment();
                                                                shareMatchStatisticsPassesPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O5), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems)), fz8.G("ARG_HEATMAP", P2), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                                qdhVar.v(shareMatchStatisticsPassesPageFragment);
                                                                return qdhVar;
                                                            }
                                                        }
                                                    }
                                                    if (shareMatchStatisticsModal.P() != null) {
                                                        Event O6 = shareMatchStatisticsModal.O();
                                                        km5 km5Var = km5.a;
                                                        gc6 P3 = shareMatchStatisticsModal.P();
                                                        O6.getClass();
                                                        ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment2 = new ShareMatchStatisticsPassesPageFragment();
                                                        shareMatchStatisticsPassesPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O6), fz8.G("ARG_STATISTICS", km5Var != null ? new ArrayList(km5Var) : arrayList2), fz8.G("ARG_HEATMAP", P3), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                        qdhVar.v(shareMatchStatisticsPassesPageFragment2);
                                                    }
                                                    return qdhVar;
                                                }
                                            }
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                            Event O7 = shareMatchStatisticsModal.O();
                                            km5 km5Var2 = km5.a;
                                            gc6 P4 = shareMatchStatisticsModal.P();
                                            boolean booleanValue2 = ((Boolean) mqiVar.getValue()).booleanValue();
                                            O7.getClass();
                                            ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment2 = new ShareMatchStatisticsAttackPageFragment();
                                            shareMatchStatisticsAttackPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O7), fz8.G("ARG_STATISTICS", km5Var2 != null ? new ArrayList(km5Var2) : arrayList2), fz8.G("ARG_HEATMAP", P4), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue2)));
                                            qdhVar.v(shareMatchStatisticsAttackPageFragment2);
                                        }
                                        arrayList4 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList4 != null) {
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                        }
                                        return qdhVar;
                                    }
                                }
                                arrayList2 = null;
                                if (((ArrayList) mqiVar7.getValue()) != null) {
                                    Event O322222222 = shareMatchStatisticsModal.O();
                                    ArrayList arrayList822222222 = (ArrayList) mqiVar7.getValue();
                                    vk8 vk8Var22222222 = (vk8) mqiVar3.getValue();
                                    FootballShotmapItem footballShotmapItem22222222 = (FootballShotmapItem) mqiVar2.getValue();
                                    O322222222.getClass();
                                    ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment22222222 = new ShareMatchStatisticsShotmapPageFragment();
                                    shareMatchStatisticsShotmapPageFragment22222222.setArguments(fz8.C(fz8.G("ARG_EVENT", O322222222), fz8.G("ARG_SHOTMAP", arrayList822222222 == null ? new ArrayList(arrayList822222222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var22222222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem22222222)));
                                    qdhVar.v(shareMatchStatisticsShotmapPageFragment22222222);
                                }
                                arrayList3 = (ArrayList) mqiVar8.getValue();
                                if (arrayList3 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                arrayList4 = (ArrayList) mqiVar8.getValue();
                                if (arrayList4 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                return qdhVar;
                            }
                        } else {
                            shareMatchStatisticsModal = shareMatchStatisticsModal2;
                            mqiVar = mqiVar4;
                        }
                        mqiVar2 = mqiVar5;
                        mqiVar3 = mqiVar6;
                        list = km5.a;
                        arrayList = (ArrayList) mqiVar8.getValue();
                        if (arrayList != null) {
                        }
                        arrayList2 = null;
                        if (((ArrayList) mqiVar7.getValue()) != null) {
                        }
                        arrayList3 = (ArrayList) mqiVar8.getValue();
                        if (arrayList3 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        arrayList4 = (ArrayList) mqiVar8.getValue();
                        if (arrayList4 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        return qdhVar;
                }
            }
        });
        final int i9 = 8;
        this.H = ypa.b(new Function0(this) { // from class: edh
            public final /* synthetic */ ShareMatchStatisticsModal b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0195  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0281  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                ShareMatchStatisticsModal shareMatchStatisticsModal;
                mqi mqiVar;
                mqi mqiVar2;
                mqi mqiVar3;
                List<EventStatisticsItem> list;
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                Object obj;
                List<EventStatisticsItem> statisticsItems;
                Object obj2;
                List<EventStatisticsItem> statisticsItems2;
                List list2;
                Object obj3;
                Object obj4;
                int i22 = i9;
                ShareMatchStatisticsModal shareMatchStatisticsModal2 = this.b;
                switch (i22) {
                    case 0:
                        List list3 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments = shareMatchStatisticsModal2.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DATA_HOLDER", ich.class);
                        if (M != null) {
                            return (ich) M;
                        }
                        a70.p("Serializable ARG_DATA_HOLDER not found");
                        return null;
                    case 1:
                        List list4 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments2 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments2.getClass();
                        return (ArrayList) gz8.M(requireArguments2, "ARG_SHOTMAP", ArrayList.class);
                    case 2:
                        List list5 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments3 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments3.getClass();
                        return (vk8) gz8.M(requireArguments3, "ARG_SHOTMAP_TEAM", vk8.class);
                    case 3:
                        List list6 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments4 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments4.getClass();
                        return (FootballShotmapItem) gz8.M(requireArguments4, "ARG_SHOTMAP_LAST_SHOT", FootballShotmapItem.class);
                    case 4:
                        List list7 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments5 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments5.getClass();
                        return (ArrayList) gz8.M(requireArguments5, "ARG_STATISTICS", ArrayList.class);
                    case 5:
                        List list8 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments6 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments6.getClass();
                        return (gc6) gz8.M(requireArguments6, "ARG_HEATMAP", gc6.class);
                    case 6:
                        List list9 = ShareMatchStatisticsModal.I;
                        Bundle requireArguments7 = shareMatchStatisticsModal2.requireArguments();
                        requireArguments7.getClass();
                        Boolean bool = (Boolean) gz8.M(requireArguments7, "ARG_HEATMAP_HOME_TEAM_SELECTED", Boolean.class);
                        return Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                    case 7:
                        List list10 = ShareMatchStatisticsModal.I;
                        IShareContent data = shareMatchStatisticsModal2.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        mqi mqiVar4 = shareMatchStatisticsModal2.F;
                        mqi mqiVar5 = shareMatchStatisticsModal2.C;
                        mqi mqiVar6 = shareMatchStatisticsModal2.B;
                        mqi mqiVar7 = shareMatchStatisticsModal2.A;
                        List list11 = ShareMatchStatisticsModal.I;
                        qdh qdhVar = new qdh(shareMatchStatisticsModal2);
                        mqi mqiVar8 = shareMatchStatisticsModal2.D;
                        ArrayList arrayList5 = (ArrayList) mqiVar8.getValue();
                        if (arrayList5 != null) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                shareMatchStatisticsModal = shareMatchStatisticsModal2;
                                if (it.hasNext()) {
                                    obj4 = it.next();
                                    mqiVar = mqiVar4;
                                    if (!Intrinsics.c(((EventStatisticsGroup) obj4).getGroupName(), "Match overview")) {
                                        shareMatchStatisticsModal2 = shareMatchStatisticsModal;
                                        mqiVar4 = mqiVar;
                                    }
                                } else {
                                    mqiVar = mqiVar4;
                                    obj4 = null;
                                }
                            }
                            EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj4;
                            if (eventStatisticsGroup != null && (list = eventStatisticsGroup.getStatisticsItems()) != null) {
                                Event O = shareMatchStatisticsModal.O();
                                O.getClass();
                                mqiVar2 = mqiVar5;
                                ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment = new ShareMatchStatisticsPageFragment();
                                mqiVar3 = mqiVar6;
                                shareMatchStatisticsPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O), fz8.H("ARG_TITLE", "Match overview"), fz8.G("ARG_STATISTICS", new ArrayList(list))));
                                qdhVar.v(shareMatchStatisticsPageFragment);
                                arrayList = (ArrayList) mqiVar8.getValue();
                                if (arrayList != null) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        o13.v(((EventStatisticsGroup) it2.next()).getStatisticsItems(), arrayList6);
                                    }
                                    List S0 = CollectionsKt.S0(CollectionsKt.V0(arrayList6));
                                    List<String> list12 = ShareMatchStatisticsModal.I;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (String str : list12) {
                                        Iterator it3 = S0.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                list2 = S0;
                                                if (!Intrinsics.c(((EventStatisticsItem) obj3).getName(), str)) {
                                                    S0 = list2;
                                                }
                                            } else {
                                                list2 = S0;
                                                obj3 = null;
                                            }
                                        }
                                        EventStatisticsItem eventStatisticsItem = (EventStatisticsItem) obj3;
                                        if (eventStatisticsItem != null) {
                                            arrayList7.add(eventStatisticsItem);
                                        }
                                        S0 = list2;
                                    }
                                    if (arrayList7.size() > 2 && !list.containsAll(arrayList7)) {
                                        Event O2 = shareMatchStatisticsModal.O();
                                        O2.getClass();
                                        ShareMatchStatisticsPageFragment shareMatchStatisticsPageFragment2 = new ShareMatchStatisticsPageFragment();
                                        arrayList2 = null;
                                        shareMatchStatisticsPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O2), fz8.H("ARG_TITLE", null), fz8.G("ARG_STATISTICS", new ArrayList(arrayList7))));
                                        qdhVar.v(shareMatchStatisticsPageFragment2);
                                        if (((ArrayList) mqiVar7.getValue()) != null && ((vk8) mqiVar3.getValue()) != null && ((FootballShotmapItem) mqiVar2.getValue()) != null) {
                                            Event O322222222 = shareMatchStatisticsModal.O();
                                            ArrayList arrayList822222222 = (ArrayList) mqiVar7.getValue();
                                            vk8 vk8Var22222222 = (vk8) mqiVar3.getValue();
                                            FootballShotmapItem footballShotmapItem22222222 = (FootballShotmapItem) mqiVar2.getValue();
                                            O322222222.getClass();
                                            ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment22222222 = new ShareMatchStatisticsShotmapPageFragment();
                                            shareMatchStatisticsShotmapPageFragment22222222.setArguments(fz8.C(fz8.G("ARG_EVENT", O322222222), fz8.G("ARG_SHOTMAP", arrayList822222222 == null ? new ArrayList(arrayList822222222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var22222222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem22222222)));
                                            qdhVar.v(shareMatchStatisticsShotmapPageFragment22222222);
                                        }
                                        arrayList3 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList3 != null) {
                                            Iterator it4 = arrayList3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    obj2 = it4.next();
                                                    if (Intrinsics.c(((EventStatisticsGroup) obj2).getGroupName(), "Attack")) {
                                                    }
                                                } else {
                                                    obj2 = arrayList2;
                                                }
                                            }
                                            EventStatisticsGroup eventStatisticsGroup2 = (EventStatisticsGroup) obj2;
                                            if (eventStatisticsGroup2 != null && (statisticsItems2 = eventStatisticsGroup2.getStatisticsItems()) != null) {
                                                if (statisticsItems2.size() <= 2) {
                                                    statisticsItems2 = arrayList2;
                                                }
                                                if (statisticsItems2 != null) {
                                                    Event O4 = shareMatchStatisticsModal.O();
                                                    gc6 P = shareMatchStatisticsModal.P();
                                                    boolean booleanValue = ((Boolean) mqiVar.getValue()).booleanValue();
                                                    O4.getClass();
                                                    ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment = new ShareMatchStatisticsAttackPageFragment();
                                                    shareMatchStatisticsAttackPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O4), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems2)), fz8.G("ARG_HEATMAP", P), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue)));
                                                    qdhVar.v(shareMatchStatisticsAttackPageFragment);
                                                    arrayList4 = (ArrayList) mqiVar8.getValue();
                                                    if (arrayList4 != null) {
                                                        Iterator it5 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it5.hasNext()) {
                                                                obj = it5.next();
                                                                if (Intrinsics.c(((EventStatisticsGroup) obj).getGroupName(), "Passes")) {
                                                                }
                                                            } else {
                                                                obj = arrayList2;
                                                            }
                                                        }
                                                        EventStatisticsGroup eventStatisticsGroup3 = (EventStatisticsGroup) obj;
                                                        if (eventStatisticsGroup3 != null && (statisticsItems = eventStatisticsGroup3.getStatisticsItems()) != null) {
                                                            if (statisticsItems.size() <= 2) {
                                                                statisticsItems = arrayList2;
                                                            }
                                                            if (statisticsItems != null) {
                                                                Event O5 = shareMatchStatisticsModal.O();
                                                                gc6 P2 = shareMatchStatisticsModal.P();
                                                                O5.getClass();
                                                                ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment = new ShareMatchStatisticsPassesPageFragment();
                                                                shareMatchStatisticsPassesPageFragment.setArguments(fz8.C(fz8.G("ARG_EVENT", O5), fz8.G("ARG_STATISTICS", new ArrayList(statisticsItems)), fz8.G("ARG_HEATMAP", P2), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                                qdhVar.v(shareMatchStatisticsPassesPageFragment);
                                                                return qdhVar;
                                                            }
                                                        }
                                                    }
                                                    if (shareMatchStatisticsModal.P() != null) {
                                                        Event O6 = shareMatchStatisticsModal.O();
                                                        km5 km5Var = km5.a;
                                                        gc6 P3 = shareMatchStatisticsModal.P();
                                                        O6.getClass();
                                                        ShareMatchStatisticsPassesPageFragment shareMatchStatisticsPassesPageFragment2 = new ShareMatchStatisticsPassesPageFragment();
                                                        shareMatchStatisticsPassesPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O6), fz8.G("ARG_STATISTICS", km5Var != null ? new ArrayList(km5Var) : arrayList2), fz8.G("ARG_HEATMAP", P3), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", true)));
                                                        qdhVar.v(shareMatchStatisticsPassesPageFragment2);
                                                    }
                                                    return qdhVar;
                                                }
                                            }
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                            Event O7 = shareMatchStatisticsModal.O();
                                            km5 km5Var2 = km5.a;
                                            gc6 P4 = shareMatchStatisticsModal.P();
                                            boolean booleanValue2 = ((Boolean) mqiVar.getValue()).booleanValue();
                                            O7.getClass();
                                            ShareMatchStatisticsAttackPageFragment shareMatchStatisticsAttackPageFragment2 = new ShareMatchStatisticsAttackPageFragment();
                                            shareMatchStatisticsAttackPageFragment2.setArguments(fz8.C(fz8.G("ARG_EVENT", O7), fz8.G("ARG_STATISTICS", km5Var2 != null ? new ArrayList(km5Var2) : arrayList2), fz8.G("ARG_HEATMAP", P4), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", booleanValue2)));
                                            qdhVar.v(shareMatchStatisticsAttackPageFragment2);
                                        }
                                        arrayList4 = (ArrayList) mqiVar8.getValue();
                                        if (arrayList4 != null) {
                                        }
                                        if (shareMatchStatisticsModal.P() != null) {
                                        }
                                        return qdhVar;
                                    }
                                }
                                arrayList2 = null;
                                if (((ArrayList) mqiVar7.getValue()) != null) {
                                    Event O3222222222 = shareMatchStatisticsModal.O();
                                    ArrayList arrayList8222222222 = (ArrayList) mqiVar7.getValue();
                                    vk8 vk8Var222222222 = (vk8) mqiVar3.getValue();
                                    FootballShotmapItem footballShotmapItem222222222 = (FootballShotmapItem) mqiVar2.getValue();
                                    O3222222222.getClass();
                                    ShareMatchStatisticsShotmapPageFragment shareMatchStatisticsShotmapPageFragment222222222 = new ShareMatchStatisticsShotmapPageFragment();
                                    shareMatchStatisticsShotmapPageFragment222222222.setArguments(fz8.C(fz8.G("ARG_EVENT", O3222222222), fz8.G("ARG_SHOTMAP", arrayList8222222222 == null ? new ArrayList(arrayList8222222222) : arrayList2), fz8.G("ARG_SHOTMAP_TEAM", vk8Var222222222), fz8.G("ARG_SHOTMAP_LAST_SHOT", footballShotmapItem222222222)));
                                    qdhVar.v(shareMatchStatisticsShotmapPageFragment222222222);
                                }
                                arrayList3 = (ArrayList) mqiVar8.getValue();
                                if (arrayList3 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                arrayList4 = (ArrayList) mqiVar8.getValue();
                                if (arrayList4 != null) {
                                }
                                if (shareMatchStatisticsModal.P() != null) {
                                }
                                return qdhVar;
                            }
                        } else {
                            shareMatchStatisticsModal = shareMatchStatisticsModal2;
                            mqiVar = mqiVar4;
                        }
                        mqiVar2 = mqiVar5;
                        mqiVar3 = mqiVar6;
                        list = km5.a;
                        arrayList = (ArrayList) mqiVar8.getValue();
                        if (arrayList != null) {
                        }
                        arrayList2 = null;
                        if (((ArrayList) mqiVar7.getValue()) != null) {
                        }
                        arrayList3 = (ArrayList) mqiVar8.getValue();
                        if (arrayList3 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        arrayList4 = (ArrayList) mqiVar8.getValue();
                        if (arrayList4 != null) {
                        }
                        if (shareMatchStatisticsModal.P() != null) {
                        }
                        return qdhVar;
                }
            }
        });
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal
    /* renamed from: F, reason: from getter */
    public final kch getZ() {
        return this.z;
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal
    public final ich H() {
        return (ich) this.x.getValue();
    }

    @Override // com.sofascore.results.sharemodal.match.BaseShareMultiPageModal
    public final qdh L() {
        return (qdh) this.H.getValue();
    }

    @Override // com.sofascore.results.sharemodal.match.BaseShareMultiPageModal
    public final Integer M() {
        return Integer.valueOf(this.y);
    }

    public final Event O() {
        return (Event) this.G.getValue();
    }

    public final gc6 P() {
        return (gc6) this.E.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ShareMatchStatisticsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.share_match_statistics);
        string.getClass();
        return string;
    }
}
