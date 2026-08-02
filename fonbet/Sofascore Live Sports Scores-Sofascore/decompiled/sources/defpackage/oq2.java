package defpackage;

import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.network.response.MmaPostMatchVote;
import com.sofascore.model.network.response.VotesResponse;
import com.sofascore.model.network.response.VotesResponseKt;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oq2 extends hoi implements Function2 {
    public final /* synthetic */ pq2 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public pq2 r;
    public List s;
    public List t;
    public Iterator u;
    public MmaEvent v;
    public VotesResponse w;
    public int x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq2(pq2 pq2Var, int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = pq2Var;
        this.B = i;
        this.C = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        oq2 oq2Var = new oq2(this.A, this.B, this.C, rq3Var);
        oq2Var.z = obj;
        return oq2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oq2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0165, code lost:
    
        if (r3 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x011c, code lost:
    
        if (r14 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0053, code lost:
    
        if (r14 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7 A[LOOP:2: B:64:0x00c1->B:66:0x00c7, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x011c -> B:7:0x011f). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pq2 pq2Var;
        List list;
        int i;
        Iterator it;
        List arrayList;
        pq2 pq2Var2;
        Iterator it2;
        ku3 ku3Var = (ku3) this.z;
        lu3 lu3Var = lu3.a;
        int i2 = this.y;
        pq2 pq2Var3 = this.A;
        if (i2 == 0) {
            y6a.M(obj);
            wqc wqcVar = pq2Var3.h;
            this.z = ku3Var;
            this.y = 1;
            obj = wqcVar.a(this.B, this.C, this, Season.YEAR_ALL_TIME);
        } else if (i2 == 1) {
            y6a.M(obj);
        } else if (i2 == 2) {
            i = this.x;
            list = this.s;
            pq2Var = this.r;
            y6a.M(obj);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof v2g) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
            it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add((VotesResponse) yaa.x((v2g) it.next()));
            }
            ArrayList Y0 = CollectionsKt.Y0(list, arrayList3);
            arrayList = new ArrayList();
            pq2Var2 = pq2Var;
            it2 = Y0.iterator();
            if (!it2.hasNext()) {
            }
        } else {
            if (i2 != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.x;
            VotesResponse votesResponse = this.w;
            MmaEvent mmaEvent = this.v;
            it2 = this.u;
            arrayList = this.t;
            pq2Var2 = this.r;
            y6a.M(obj);
            MmaPostMatchVotingOptions fromChoice = MmaPostMatchVotingOptions.INSTANCE.getFromChoice((String) ((Map) obj).get(VoteType.MMA_POST_MATCH_VOTING));
            if (votesResponse != null) {
                MmaPostMatchVote whoShouldHaveWonVote = votesResponse.getWhoShouldHaveWonVote();
                if (whoShouldHaveWonVote == null) {
                    whoShouldHaveWonVote = null;
                } else {
                    if ((VotesResponseKt.getTotalVotes(whoShouldHaveWonVote) == 0 && fromChoice != null) || ((whoShouldHaveWonVote.getVote1() == 0 && fromChoice == MmaPostMatchVotingOptions.FIRST_FIGHTER_WIN) || (whoShouldHaveWonVote.getVote2() == 0 && fromChoice == MmaPostMatchVotingOptions.SECOND_FIGHTER_WIN))) {
                        VotesResponseKt.addVote(whoShouldHaveWonVote, fromChoice);
                    }
                    arrayList.add(new qlc(mmaEvent, new fqc(whoShouldHaveWonVote, fromChoice)));
                }
            }
            if (fromChoice != null) {
                MmaPostMatchVote mmaPostMatchVote = new MmaPostMatchVote(0, 0);
                VotesResponseKt.addVote(mmaPostMatchVote, fromChoice);
                Unit unit = Unit.a;
                arrayList.add(new qlc(mmaEvent, new fqc(mmaPostMatchVote, fromChoice)));
            }
            Unit unit2 = Unit.a;
            if (!it2.hasNext()) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList) {
                    MmaEvent mmaEvent2 = ((qlc) obj3).a;
                    mmaEvent2.getClass();
                    jnb[] jnbVarArr = jnb.a;
                    if (CollectionsKt.R(b.j("UD", "MD", "SD", "PTS"), mmaEvent2.getWinType())) {
                        arrayList4.add(obj3);
                    }
                }
                pq2Var2.n.j(arrayList4);
                return Unit.a;
            }
            Pair pair = (Pair) it2.next();
            mmaEvent = (MmaEvent) pair.a;
            votesResponse = (VotesResponse) pair.b;
            fyk fykVar = pq2Var2.i;
            int id = mmaEvent.getId();
            this.z = ku3Var;
            this.r = pq2Var2;
            this.s = null;
            this.t = arrayList;
            this.u = it2;
            this.v = mmaEvent;
            this.w = votesResponse;
            this.x = i;
            this.y = 3;
            obj = fykVar.e(id, this);
        }
        List list2 = (List) obj;
        if (list2 != null) {
            ArrayList arrayList5 = new ArrayList(k13.r(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList5.add(xw3.t(ku3Var, null, new hy1(pq2Var3, (MmaEvent) it3.next(), null, 10), 3));
            }
            this.z = ku3Var;
            this.r = pq2Var3;
            this.s = list2;
            this.x = 0;
            this.y = 2;
            Object u = m6k.u(arrayList5, this);
            if (u != lu3Var) {
                pq2Var = pq2Var3;
                list = list2;
                obj = u;
                i = 0;
                ArrayList arrayList22 = new ArrayList();
                while (r14.hasNext()) {
                }
                ArrayList arrayList32 = new ArrayList(k13.r(arrayList22, 10));
                it = arrayList22.iterator();
                while (it.hasNext()) {
                }
                ArrayList Y02 = CollectionsKt.Y0(list, arrayList32);
                arrayList = new ArrayList();
                pq2Var2 = pq2Var;
                it2 = Y02.iterator();
                if (!it2.hasNext()) {
                }
            }
            return lu3Var;
        }
        return Unit.a;
    }
}
