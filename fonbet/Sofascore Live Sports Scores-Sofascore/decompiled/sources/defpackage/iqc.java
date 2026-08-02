package defpackage;

import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.MmaPostMatchVote;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iqc extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ jqc s;
    public final /* synthetic */ Event t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ VotesResponse v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqc(jqc jqcVar, Event event, boolean z, VotesResponse votesResponse, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = jqcVar;
        this.t = event;
        this.u = z;
        this.v = votesResponse;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new iqc(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((iqc) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        MmaPostMatchVote whoShouldHaveWonVote;
        jqc jqcVar = this.s;
        yzc yzcVar = jqcVar.d;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            fyk fykVar = jqcVar.c;
            int id = this.t.getId();
            this.r = 1;
            obj = fykVar.e(id, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        MmaPostMatchVotingOptions fromChoice = MmaPostMatchVotingOptions.INSTANCE.getFromChoice((String) ((Map) obj).get(VoteType.MMA_POST_MATCH_VOTING));
        if ((this.u || yzcVar.d() == null) && (whoShouldHaveWonVote = this.v.getWhoShouldHaveWonVote()) != null) {
            if ((VotesResponseKt.getTotalVotes(whoShouldHaveWonVote) == 0 && fromChoice != null) || ((whoShouldHaveWonVote.getVote1() == 0 && fromChoice == MmaPostMatchVotingOptions.FIRST_FIGHTER_WIN) || (whoShouldHaveWonVote.getVote2() == 0 && fromChoice == MmaPostMatchVotingOptions.SECOND_FIGHTER_WIN))) {
                VotesResponseKt.addVote(whoShouldHaveWonVote, fromChoice);
            }
            yzcVar.j(new fqc(whoShouldHaveWonVote, fromChoice));
        }
        return Unit.a;
    }
}
