package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.shared.FantasyRoundPlayerInfo;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureData;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.player.fantasy.PlayerFantasyFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class are implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerFantasyFragment b;

    public /* synthetic */ are(PlayerFantasyFragment playerFantasyFragment, int i) {
        this.a = i;
        this.b = playerFantasyFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[LOOP:1: B:29:0x00bc->B:31:0x00c2, LOOP_END] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        otk otkVar;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel;
        boolean z2;
        int c;
        Iterator it;
        int i = this.a;
        PlayerFantasyFragment playerFantasyFragment = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc J = lz.J(utc.a, jaa.L(av8Var), null);
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, J);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c2, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    jre jreVar = (jre) playerFantasyFragment.r.getValue();
                    boolean i2 = av8Var.i(playerFantasyFragment);
                    Object O = av8Var.O();
                    if (i2 || O == nf3.a) {
                        z = true;
                        O = new are(playerFantasyFragment, z ? 1 : 0);
                        av8Var.n0(O);
                    } else {
                        z = true;
                    }
                    gvd.o(jreVar, (Function2) O, av8Var, 0);
                    av8Var.s(z);
                } else {
                    av8Var.W();
                }
                break;
            default:
                otk otkVar2 = playerFantasyFragment.r;
                FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj;
                int intValue2 = ((Integer) obj2).intValue();
                fantasyPlayerFixtureUiModel.getClass();
                Integer num = fantasyPlayerFixtureUiModel.q;
                Integer num2 = fantasyPlayerFixtureUiModel.d;
                if (num == null) {
                    wxf wxfVar = EventActivity.h0;
                    Context requireContext = playerFantasyFragment.requireContext();
                    requireContext.getClass();
                    wxf.B(requireContext, fantasyPlayerFixtureUiModel.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else {
                    jre jreVar2 = (jre) otkVar2.getValue();
                    gv9 gv9Var = jreVar2.k().e;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : gv9Var) {
                        if (Intrinsics.c(((FantasyPlayerFixtureUiModel) obj3).d, num2)) {
                            arrayList.add(obj3);
                        }
                    }
                    FantasyPlayerUiModel fantasyPlayerUiModel = jreVar2.k().d;
                    if (fantasyPlayerUiModel != null) {
                        int i3 = fantasyPlayerUiModel.a;
                        rz6 rz6Var = fantasyPlayerUiModel.i;
                        String str = fantasyPlayerUiModel.k;
                        Float f = fantasyPlayerUiModel.l;
                        int i4 = fantasyPlayerUiModel.c;
                        String str2 = fantasyPlayerUiModel.d;
                        String str3 = fantasyPlayerUiModel.e;
                        if (!arrayList.isEmpty()) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (((FantasyPlayerFixtureUiModel) it2.next()).q != null) {
                                    z2 = true;
                                    FantasyRoundPlayerInfo.Companion.getClass();
                                    FantasyRoundPlayerInfo fantasyRoundPlayerInfo = FantasyRoundPlayerInfo.h;
                                    c = sub.c(k13.r(arrayList, 10));
                                    if (c < 16) {
                                        c = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel2 = (FantasyPlayerFixtureUiModel) it.next();
                                        linkedHashMap.put(Integer.valueOf(fantasyPlayerFixtureUiModel2.a), new FantasyPlayerFixtureData(fantasyPlayerFixtureUiModel2.u, fantasyPlayerFixtureUiModel2.v, fantasyPlayerFixtureUiModel2.w));
                                        it = it;
                                        str = str;
                                        otkVar2 = otkVar2;
                                    }
                                    otkVar = otkVar2;
                                    fantasyRoundPlayerUiModel = new FantasyRoundPlayerUiModel(i3, rz6Var, 0, 0, fantasyPlayerUiModel, i4, str2, str3, false, null, false, null, str, f, null, null, null, null, null, z2, false, null, l6g.X(linkedHashMap), false, null, null, fantasyRoundPlayerInfo, 176160768);
                                }
                            }
                        }
                        z2 = false;
                        FantasyRoundPlayerInfo.Companion.getClass();
                        FantasyRoundPlayerInfo fantasyRoundPlayerInfo2 = FantasyRoundPlayerInfo.h;
                        c = sub.c(k13.r(arrayList, 10));
                        if (c < 16) {
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                        }
                        otkVar = otkVar2;
                        fantasyRoundPlayerUiModel = new FantasyRoundPlayerUiModel(i3, rz6Var, 0, 0, fantasyPlayerUiModel, i4, str2, str3, false, null, false, null, str, f, null, null, null, null, null, z2, false, null, l6g.X(linkedHashMap2), false, null, null, fantasyRoundPlayerInfo2, 176160768);
                    } else {
                        otkVar = otkVar2;
                        fantasyRoundPlayerUiModel = null;
                    }
                    if (fantasyRoundPlayerUiModel != null && num2 != null) {
                        FragmentActivity requireActivity = playerFantasyFragment.requireActivity();
                        requireActivity.getClass();
                        FantasyCompetitionType fantasyCompetitionType = FantasyCompetitionType.SEASON;
                        int intValue3 = num2.intValue();
                        boolean z3 = ((jre) otkVar.getValue()).k().h;
                        fantasyCompetitionType.getClass();
                        FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet = new FantasyFootballPlayerBottomSheet();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel);
                        bundle.putBoolean("tripleCaptain", false);
                        bundle.putInt("competitionId", intValue2);
                        bundle.putSerializable("competitionType", fantasyCompetitionType);
                        bundle.putInt("roundId", intValue3);
                        bundle.putBoolean("assetsRestricted", z3);
                        fantasyFootballPlayerBottomSheet.setArguments(bundle);
                        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                        if (appCompatActivity != null) {
                            wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasyFootballPlayerBottomSheet, appCompatActivity, null, 3));
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
