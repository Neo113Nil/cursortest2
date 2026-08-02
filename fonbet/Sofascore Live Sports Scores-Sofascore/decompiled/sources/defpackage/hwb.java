package defpackage;

import com.sofascore.local_persistance.BrandingBoostedOdds;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.results.matchOfTheWeek.MatchOfTheWeekBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hwb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MatchOfTheWeekBottomSheet b;

    public /* synthetic */ hwb(MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet, int i) {
        this.a = i;
        this.b = matchOfTheWeekBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        WhoWillWinOptions fromChoice;
        BrandingBoostedOdds brandingBoostedOdds;
        w3f w3fVar;
        int i = this.a;
        MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet = this.b;
        switch (i) {
            case 0:
                twb twbVar = (twb) obj;
                twbVar.getClass();
                if (twbVar.equals(twb.a)) {
                    matchOfTheWeekBottomSheet.j();
                    return Unit.a;
                }
                zzl.b();
                return null;
            default:
                cwb cwbVar = (cwb) obj;
                cwbVar.getClass();
                if (cwbVar instanceof zvb) {
                    matchOfTheWeekBottomSheet.D = ((zvb) cwbVar).a;
                } else if (cwbVar.equals(yvb.a)) {
                    matchOfTheWeekBottomSheet.j();
                } else {
                    axb axbVar = (axb) matchOfTheWeekBottomSheet.C.getValue();
                    jof jofVar = axbVar.f;
                    rq3 rq3Var = null;
                    if (cwbVar.equals(awb.a)) {
                        Event event = axbVar.p;
                        if (event != null && (brandingBoostedOdds = axbVar.q) != null) {
                            rwb rwbVar = (rwb) ((vnb) jofVar.a.getValue()).a();
                            fwb fwbVar = rwbVar != null ? rwbVar.c : null;
                            ewb ewbVar = fwbVar instanceof ewb ? (ewb) fwbVar : null;
                            if (ewbVar != null && (w3fVar = ewbVar.b) != null) {
                                xw3.L(un0.z(axbVar), null, null, new va8(axbVar, event, brandingBoostedOdds, w3fVar, null, 14), 3);
                            }
                        }
                    } else if ((cwbVar instanceof bwb) && (fromChoice = WhoWillWinOptions.INSTANCE.getFromChoice((str = ((bwb) cwbVar).a))) != null) {
                        rwb rwbVar2 = (rwb) ((vnb) jofVar.a.getValue()).a();
                        fwb fwbVar2 = rwbVar2 != null ? rwbVar2.c : null;
                        ewb ewbVar2 = fwbVar2 instanceof ewb ? (ewb) fwbVar2 : null;
                        if (ewbVar2 != null) {
                            w3f w3fVar2 = ewbVar2.b;
                            if (w3fVar2.g == null) {
                                Vote vote = w3fVar2.d;
                                if (vote != null) {
                                    VotesResponseKt.addVote(vote, fromChoice);
                                }
                                axbVar.n(null, new lsb(2, ewbVar2, w3f.a(ewbVar2.b, null, null, null, str, false, null, false, 262079)));
                                Event event2 = axbVar.p;
                                if (event2 != null) {
                                    xw3.L(un0.z(axbVar), null, null, new zi7(axbVar, event2, str, rq3Var, 26), 3);
                                }
                            }
                        }
                    }
                }
                return Unit.a;
        }
    }
}
