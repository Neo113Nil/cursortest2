package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.divider.MaterialDivider;
import com.ironsource.L6;
import com.sofascore.model.Sports;
import com.sofascore.model.TvType;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageInfo;
import com.sofascore.model.mvvm.model.StageSeasonKt;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.StageStandingsResponse;
import com.sofascore.results.event.details.view.odds.GambleRegulationFooterView;
import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.stagesport.StageFeaturedOddsView;
import com.sofascore.results.stagesport.fragments.details.StageDetailsResultsFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class t3i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StageDetailsResultsFragment b;

    public /* synthetic */ t3i(StageDetailsResultsFragment stageDetailsResultsFragment, int i) {
        this.a = i;
        this.b = stageDetailsResultsFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x03d1, code lost:
    
        if (r6 == null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026c, code lost:
    
        if (r3.equals(0) == false) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022a  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r5v31, types: [android.view.View, i3, java.lang.Object, w6i] */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.sofascore.results.view.typeheader.SegmentedButtonsView] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        w3i w3iVar;
        Integer num;
        Stage stage;
        ServerType type;
        int i;
        Stage stage2;
        boolean z;
        SofaDivider sofaDivider;
        SofaDivider sofaDivider2;
        ?? r0;
        GambleRegulationFooterView gambleRegulationFooterView;
        GambleRegulationFooterView gambleRegulationFooterView2;
        String note;
        int i2 = this.a;
        StageDetailsResultsFragment stageDetailsResultsFragment = this.b;
        switch (i2) {
            case 0:
                stageDetailsResultsFragment.G().j = (Stage) obj;
                return Unit.a;
            case 1:
                List list = (List) obj;
                stageDetailsResultsFragment.G().k = list;
                FragmentActivity requireActivity = stageDetailsResultsFragment.requireActivity();
                StageDetailsActivity stageDetailsActivity = requireActivity instanceof StageDetailsActivity ? (StageDetailsActivity) requireActivity : null;
                if (stageDetailsActivity != null) {
                    stageDetailsActivity.Z(list);
                }
                ArrayList k = me4.k(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ServerType type2 = ((Stage) it.next()).getType();
                    w3i H = type2 != null ? StageDetailsResultsFragment.H(type2) : null;
                    if (H != null) {
                        k.add(H);
                    }
                }
                List<w3i> S0 = CollectionsKt.S0(CollectionsKt.V0(k));
                Stage stage3 = stageDetailsResultsFragment.u;
                if (stage3 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                if (!cga.G(stage3.getUniqueStage())) {
                    S0 = CollectionsKt.G0(S0);
                }
                if (stageDetailsResultsFragment.E().e.getHeaderTypes().isEmpty()) {
                    Stage stage4 = stageDetailsResultsFragment.G().j;
                    if (stage4 != null) {
                        joa joaVar = l5i.a;
                        if (!l5i.f(stage4) || !Intrinsics.c(stage4.getStatusType(), StatusKt.STATUS_FINISHED)) {
                            stage4 = null;
                            break;
                        }
                    }
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            stage = it2.next();
                            int id = ((Stage) stage).getId();
                            Integer num2 = stageDetailsResultsFragment.C().j;
                            if (num2 != null && id == num2.intValue()) {
                            }
                        } else {
                            stage = 0;
                        }
                    }
                    stage4 = stage;
                    if (stage4 == null) {
                        joa joaVar2 = l5i.a;
                        stage4 = l5i.d(list);
                    }
                    if (stage4 != null && (type = stage4.getType()) != null) {
                        w3iVar = StageDetailsResultsFragment.H(type);
                        stageDetailsResultsFragment.E().e.setBackground(null);
                        ?? r6 = stageDetailsResultsFragment.E().e;
                        ArrayList arrayList = new ArrayList(k13.r(S0, 10));
                        for (w3i w3iVar2 : S0) {
                            String name = w3iVar2.name();
                            int i3 = w3iVar2.a;
                            joa joaVar3 = l5i.a;
                            Stage stage5 = stageDetailsResultsFragment.u;
                            if (stage5 == null) {
                                Intrinsics.i("event");
                                throw null;
                            }
                            if (l5i.f(stage5) && (num = w3iVar2.c) != null) {
                                i3 = num.intValue();
                            }
                            String string = stageDetailsResultsFragment.getString(i3);
                            string.getClass();
                            arrayList.add(new s1h(name, string, true));
                        }
                        r6.s(arrayList, w3iVar != null ? w3iVar.name() : null, true);
                        ConstraintLayout constraintLayout = stageDetailsResultsFragment.E().a;
                        constraintLayout.getClass();
                        tgj.p(constraintLayout, 0L, 3);
                        return Unit.a;
                    }
                }
                w3iVar = null;
                stageDetailsResultsFragment.E().e.setBackground(null);
                ?? r62 = stageDetailsResultsFragment.E().e;
                ArrayList arrayList2 = new ArrayList(k13.r(S0, 10));
                while (r5.hasNext()) {
                }
                r62.s(arrayList2, w3iVar != null ? w3iVar.name() : null, true);
                ConstraintLayout constraintLayout2 = stageDetailsResultsFragment.E().a;
                constraintLayout2.getClass();
                tgj.p(constraintLayout2, 0L, 3);
                return Unit.a;
            case 2:
                joa joaVar4 = stageDetailsResultsFragment.A;
                joa joaVar5 = stageDetailsResultsFragment.B;
                joa joaVar6 = stageDetailsResultsFragment.D;
                b4i b4iVar = (b4i) obj;
                stageDetailsResultsFragment.n();
                Stage stage6 = stageDetailsResultsFragment.G().n;
                if (stage6 == null) {
                    return Unit.a;
                }
                x2g x2gVar = b4iVar.a;
                c4i c4iVar = b4iVar.c;
                if (x2gVar instanceof v2g) {
                    List<StageStandingsItem> standings = ((StageStandingsResponse) ((v2g) x2gVar).a).getStandings();
                    Stage stage7 = stageDetailsResultsFragment.G().n;
                    if (stage7 != null) {
                        stageDetailsResultsFragment.K(stage7, ((StageStandingsResponse) ((v2g) b4iVar.a).a).getStandings());
                    }
                    Stage stage8 = stageDetailsResultsFragment.u;
                    if (stage8 == null) {
                        Intrinsics.i("event");
                        throw null;
                    }
                    if (Intrinsics.c(StageSeasonKt.getSportName(stage8.getStageSeason()), Sports.CYCLING)) {
                        stageDetailsResultsFragment.G();
                        r6i r6iVar = stageDetailsResultsFragment.v;
                        if (r6iVar == null) {
                            Intrinsics.i(L6.G1);
                            throw null;
                        }
                        alf alfVar = r6iVar.o;
                        alfVar.getClass();
                        standings = g4i.k(standings, (ta4) alfVar);
                    }
                    stageDetailsResultsFragment.E().g.setVisibility(standings.isEmpty() ? 0 : 8);
                    r3i D = stageDetailsResultsFragment.D();
                    if (D != null) {
                        TextView textView = D.b;
                        StageInfo info = stage6.getInfo();
                        haa.N(textView, (info == null || (note = info.getNote()) == null) ? null : StringsKt.l0(note).toString());
                    }
                    r6i r6iVar2 = stageDetailsResultsFragment.v;
                    if (r6iVar2 == null) {
                        Intrinsics.i(L6.G1);
                        throw null;
                    }
                    r6iVar2.G(stage6, standings);
                    r6i r6iVar3 = stageDetailsResultsFragment.v;
                    if (r6iVar3 == null) {
                        Intrinsics.i(L6.G1);
                        throw null;
                    }
                    r6iVar3.a.d = new v3i(stageDetailsResultsFragment, 1);
                    ((LinearLayout) joaVar5.getValue()).setVisibility(0);
                } else {
                    ((LinearLayout) joaVar5.getValue()).setVisibility(0);
                    r6i r6iVar4 = stageDetailsResultsFragment.v;
                    if (r6iVar4 == null) {
                        Intrinsics.i(L6.G1);
                        throw null;
                    }
                    r6iVar4.s();
                    stageDetailsResultsFragment.E().g.setVisibility(0);
                    r3i D2 = stageDetailsResultsFragment.D();
                    if (D2 != null) {
                        D2.b.setVisibility(8);
                    }
                    stageDetailsResultsFragment.n();
                }
                if (stageDetailsResultsFragment.E().g.getVisibility() == 0) {
                    stageDetailsResultsFragment.I();
                    ConstraintLayout constraintLayout3 = stageDetailsResultsFragment.E().a;
                    constraintLayout3.getClass();
                    sea.v(constraintLayout3, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else {
                    uyf uyfVar = stageDetailsResultsFragment.w;
                    if (uyfVar != null) {
                        uyfVar.cancel();
                    }
                    stageDetailsResultsFragment.w = null;
                    ConstraintLayout constraintLayout4 = stageDetailsResultsFragment.E().a;
                    constraintLayout4.getClass();
                    sea.v(constraintLayout4, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                MaterialDivider materialDivider = stageDetailsResultsFragment.E().c;
                if (stageDetailsResultsFragment.E().d.getHeaderTypes().size() <= 1 && stageDetailsResultsFragment.E().g.getVisibility() != 0) {
                    joa joaVar7 = l5i.a;
                    Stage stage9 = stageDetailsResultsFragment.u;
                    if (stage9 == null) {
                        Intrinsics.i("event");
                        throw null;
                    }
                    if (!l5i.f(stage9)) {
                        i = 0;
                        materialDivider.setVisibility(i);
                        ((lec) stageDetailsResultsFragment.G().e.c).e(stageDetailsResultsFragment.getViewLifecycleOwner(), new ioe(12, new t3i(stageDetailsResultsFragment, 4)));
                        ?? r5 = (w6i) joaVar4.getValue();
                        stage2 = stageDetailsResultsFragment.u;
                        if (stage2 != null) {
                            Intrinsics.i("event");
                            throw null;
                        }
                        stage2.getInfo();
                        r5.getClass();
                        StageInfo info2 = stage2.getInfo();
                        if (info2 != null) {
                            if (info2.getCircuitCity() == null && info2.getLapRecord() == null) {
                                Integer laps = info2.getLaps();
                                if ((laps != null ? laps.intValue() : 0) == 0) {
                                    Float circuitLength = info2.getCircuitLength();
                                    if (circuitLength == null) {
                                        circuitLength = 0;
                                    }
                                    if (circuitLength.equals(0)) {
                                        Object raceDistance = info2.getRaceDistance();
                                        if (raceDistance == null) {
                                            raceDistance = 0;
                                        }
                                        break;
                                    }
                                }
                            }
                            z = true;
                            r5.l(stage2, z);
                            sofaDivider = r5.e;
                            if (sofaDivider != null) {
                                sofaDivider.setDividerVisibility(false);
                            }
                            Context context = r5.getContext();
                            context.getClass();
                            r5.setPadding(r5.getPaddingLeft(), ao2.s(8, context), r5.getPaddingRight(), r5.getPaddingBottom());
                            sofaDivider2 = ((w6i) joaVar4.getValue()).e;
                            if (sofaDivider2 != null) {
                                sofaDivider2.setDividerVisibility(false);
                            }
                            stageDetailsResultsFragment.E().h.n(c4iVar == null ? c4iVar.a : null, c4iVar == null ? c4iVar.b : null);
                            if (c4iVar == null && stageDetailsResultsFragment.E == null) {
                                g6b lifecycle = stageDetailsResultsFragment.getLifecycle();
                                lifecycle.getClass();
                                zsk zskVar = new zsk(lifecycle, 45);
                                StageFeaturedOddsView stageFeaturedOddsView = stageDetailsResultsFragment.E().h;
                                zskVar.b(stageFeaturedOddsView, new fl8(0, stageFeaturedOddsView, StageFeaturedOddsView.class, "trackEvent", "trackEvent()V", 0, 21), null);
                                stageDetailsResultsFragment.E = zskVar;
                            } else if (c4iVar == null) {
                                zsk zskVar2 = stageDetailsResultsFragment.E;
                                if (zskVar2 != null) {
                                    zskVar2.a();
                                }
                                stageDetailsResultsFragment.E = null;
                            }
                            r0 = c4iVar == null;
                            gambleRegulationFooterView = (GambleRegulationFooterView) joaVar6.getValue();
                            if (gambleRegulationFooterView != null) {
                                gambleRegulationFooterView.setVisibility(r0 == true ? 0 : 8);
                            }
                            if (r0 != false) {
                                GambleRegulationFooterView gambleRegulationFooterView3 = (GambleRegulationFooterView) joaVar6.getValue();
                                if (Intrinsics.c(gambleRegulationFooterView3 != null ? Boolean.valueOf(gambleRegulationFooterView3.d.e.length() > 0) : null, Boolean.FALSE) && (gambleRegulationFooterView2 = (GambleRegulationFooterView) joaVar6.getValue()) != null) {
                                    Boolean oddsMayDiffer = c4iVar.a.getOddsMayDiffer();
                                    int i4 = GambleRegulationFooterView.e;
                                    gambleRegulationFooterView2.j(oddsMayDiffer, false);
                                }
                            }
                            return Unit.a;
                        }
                        z = false;
                        r5.l(stage2, z);
                        sofaDivider = r5.e;
                        if (sofaDivider != null) {
                        }
                        Context context2 = r5.getContext();
                        context2.getClass();
                        r5.setPadding(r5.getPaddingLeft(), ao2.s(8, context2), r5.getPaddingRight(), r5.getPaddingBottom());
                        sofaDivider2 = ((w6i) joaVar4.getValue()).e;
                        if (sofaDivider2 != null) {
                        }
                        stageDetailsResultsFragment.E().h.n(c4iVar == null ? c4iVar.a : null, c4iVar == null ? c4iVar.b : null);
                        if (c4iVar == null) {
                        }
                        if (c4iVar == null) {
                        }
                        if (c4iVar == null) {
                        }
                        gambleRegulationFooterView = (GambleRegulationFooterView) joaVar6.getValue();
                        if (gambleRegulationFooterView != null) {
                        }
                        if (r0 != false) {
                        }
                        return Unit.a;
                    }
                }
                i = 8;
                materialDivider.setVisibility(i);
                ((lec) stageDetailsResultsFragment.G().e.c).e(stageDetailsResultsFragment.getViewLifecycleOwner(), new ioe(12, new t3i(stageDetailsResultsFragment, 4)));
                ?? r52 = (w6i) joaVar4.getValue();
                stage2 = stageDetailsResultsFragment.u;
                if (stage2 != null) {
                }
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                String string2 = stageDetailsResultsFragment.getString(fwc.valueOf(str).a);
                string2.getClass();
                return string2;
            default:
                v3k v3kVar = (v3k) obj;
                k3k k3kVar = (k3k) stageDetailsResultsFragment.z.getValue();
                Stage stage10 = stageDetailsResultsFragment.u;
                if (stage10 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                int id2 = stage10.getId();
                Stage stage11 = stageDetailsResultsFragment.u;
                if (stage11 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                String statusType = stage11.getStatusType();
                Stage stage12 = stageDetailsResultsFragment.u;
                if (stage12 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                long startDateTimestamp = stage12.getStartDateTimestamp();
                Stage stage13 = stageDetailsResultsFragment.u;
                if (stage13 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                boolean hasBet365LiveStream = stage13.hasBet365LiveStream();
                Stage stage14 = stageDetailsResultsFragment.u;
                if (stage14 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                TvChannelData tvChannelData = new TvChannelData(id2, statusType, startDateTimestamp, "", hasBet365LiveStream, stage14.countriesWithBlockedBet365Stream(), TvType.STAGE);
                v3kVar.getClass();
                k3kVar.n(tvChannelData, v3kVar, stageDetailsResultsFragment.G().i.c());
                return Unit.a;
        }
    }
}
