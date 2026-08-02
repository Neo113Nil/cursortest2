package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.event.boxscore.EventBoxScoreFragment;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ot5 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventBoxScoreFragment b;

    public /* synthetic */ ot5(EventBoxScoreFragment eventBoxScoreFragment, int i) {
        this.a = i;
        this.b = eventBoxScoreFragment;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wj1 wj1Var;
        int i = this.a;
        EventBoxScoreFragment eventBoxScoreFragment = this.b;
        switch (i) {
            case 0:
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof Team) {
                    int i2 = TeamActivity.Z;
                    Context requireContext = eventBoxScoreFragment.requireContext();
                    requireContext.getClass();
                    jle.r(requireContext, ((Team) obj3).getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (obj3 instanceof i22) {
                    int id = ((i22) obj3).n.getId();
                    if (Intrinsics.c(eventBoxScoreFragment.E().getHasEventPlayerStatistics(), Boolean.TRUE) && dti.e(ok3.s(eventBoxScoreFragment.E()))) {
                        List list = eventBoxScoreFragment.G().x;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj4 : list) {
                            linkedHashMap.put(Integer.valueOf(((xoe) obj4).a.getId()), obj4);
                        }
                        Collection values = linkedHashMap.values();
                        values.getClass();
                        List S0 = CollectionsKt.S0(values);
                        boolean H = eventBoxScoreFragment.H();
                        Boolean valueOf = Boolean.valueOf(H);
                        if (!H) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            b0i b0iVar = eventBoxScoreFragment.G().n;
                            wj1Var = b0iVar == u71.d ? wj1.b : b0iVar == u71.e ? wj1.c : b0iVar == u71.f ? wj1.d : null;
                        } else {
                            wj1Var = null;
                        }
                        FragmentActivity activity = eventBoxScoreFragment.getActivity();
                        if (activity != null) {
                            PlayerEventStatisticsModal c = jpe.c(f8h.j(eventBoxScoreFragment.E(), S0, id, false, null, wj1Var, 24), null);
                            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                            if (appCompatActivity != null) {
                                me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                            }
                        }
                    } else {
                        int i3 = PlayerActivity.Z;
                        FragmentActivity requireActivity = eventBoxScoreFragment.requireActivity();
                        requireActivity.getClass();
                        UniqueTournament uniqueTournament = eventBoxScoreFragment.E().getTournament().getUniqueTournament();
                        jle.q(requireActivity, id, uniqueTournament != null ? uniqueTournament.getId() : 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                    }
                }
                break;
            case 1:
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof MissingPlayerData) {
                    int i4 = PlayerActivity.Z;
                    Context requireContext2 = eventBoxScoreFragment.requireContext();
                    requireContext2.getClass();
                    int id2 = ((MissingPlayerData) obj3).getPlayer().getId();
                    UniqueTournament uniqueTournament2 = eventBoxScoreFragment.E().getTournament().getUniqueTournament();
                    jle.q(requireContext2, id2, uniqueTournament2 != null ? uniqueTournament2.getId() : 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                }
                break;
            case 2:
                xtc xtcVar = (xtc) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    td4.G(Event.getHomeTeam$default(eventBoxScoreFragment.E(), null, 1, null).getId(), xtcVar, false, 0L, av8Var, (intValue << 3) & 112, 12);
                } else {
                    av8Var.W();
                }
                break;
            default:
                xtc xtcVar2 = (xtc) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xtcVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar2) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    td4.G(Event.getAwayTeam$default(eventBoxScoreFragment.E(), null, 1, null).getId(), xtcVar2, false, 0L, av8Var2, (intValue2 << 3) & 112, 12);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
