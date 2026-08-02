package defpackage;

import com.sofascore.model.TvType;
import com.sofascore.model.newNetwork.TvChannelVoteBody;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y3k extends hoi implements Function1 {
    public final /* synthetic */ int r = 1;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Serializable x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3k(z3k z3kVar, TvType tvType, int i, int i2, TvChannelVoteBody tvChannelVoteBody, rq3 rq3Var) {
        super(1, rq3Var);
        this.v = z3kVar;
        this.w = tvType;
        this.t = i;
        this.u = i2;
        this.x = tvChannelVoteBody;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Serializable serializable = this.x;
        Object obj = this.w;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new y3k((z3k) obj2, (TvType) obj, this.t, this.u, (TvChannelVoteBody) serializable, rq3Var);
            default:
                int i2 = this.u;
                return new y3k((unk) obj2, this.t, (String) obj, (String) serializable, i2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((y3k) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        Serializable serializable = this.x;
        Object obj2 = this.w;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object voteTvChannel = ((z3k) obj3).b.voteTvChannel((TvType) obj2, this.t, this.u, (TvChannelVoteBody) serializable, this);
                    return voteTvChannel == lu3Var ? lu3Var : voteTvChannel;
                }
                if (i2 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object venueMatches = ((unk) obj3).a.venueMatches(this.t, (String) obj2, (String) serializable, this.u, this);
                    return venueMatches == lu3Var2 ? lu3Var2 : venueMatches;
                }
                if (i3 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3k(unk unkVar, int i, String str, String str2, int i2, rq3 rq3Var) {
        super(1, rq3Var);
        this.v = unkVar;
        this.t = i;
        this.w = str;
        this.x = str2;
        this.u = i2;
    }
}
