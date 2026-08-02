package defpackage;

import com.sofascore.model.network.response.EventResponse;
import com.sofascore.model.newNetwork.StageResponse;
import com.sofascore.model.newNetwork.UniqueTournamentResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.mediaposts.MediaUniqueTournament;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p7c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ MediaPost t;
    public final /* synthetic */ u8c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7c(rq3 rq3Var, u8c u8cVar, MediaPost mediaPost) {
        super(2, rq3Var);
        this.r = 5;
        this.u = u8cVar;
        this.t = mediaPost;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        MediaPost mediaPost = this.t;
        u8c u8cVar = this.u;
        switch (i) {
            case 0:
                return new p7c(mediaPost, u8cVar, rq3Var, 0);
            case 1:
                return new p7c(mediaPost, u8cVar, rq3Var, 1);
            case 2:
                return new p7c(mediaPost, u8cVar, rq3Var, 2);
            case 3:
                return new p7c(mediaPost, u8cVar, rq3Var, 3);
            case 4:
                return new p7c(mediaPost, u8cVar, rq3Var, 4);
            default:
                return new p7c(rq3Var, u8cVar, mediaPost);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((p7c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        EventResponse eventResponse;
        int i = this.r;
        MediaPost mediaPost = this.t;
        u8c u8cVar = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    Integer eventId = mediaPost.getEventId();
                    if (eventId == null) {
                        return null;
                    }
                    int intValue = eventId.intValue();
                    s96 s96Var = u8cVar.c;
                    this.s = 1;
                    obj = s96Var.d(intValue, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                if (x2gVar == null || (eventResponse = (EventResponse) yaa.x(x2gVar)) == null) {
                    return null;
                }
                return eventResponse.getEvent();
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    Integer stageId = mediaPost.getStageId();
                    if (stageId == null) {
                        return null;
                    }
                    int intValue2 = stageId.intValue();
                    s96 s96Var2 = u8cVar.c;
                    this.s = 1;
                    s96Var2.getClass();
                    obj = yaa.P(new a86(s96Var2, intValue2, null, 24), this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                StageResponse stageResponse = (StageResponse) yaa.x((x2g) obj);
                if (stageResponse != null) {
                    return stageResponse.getStage();
                }
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Integer uniqueTournamentId = mediaPost.getUniqueTournamentId();
                    if (uniqueTournamentId == null) {
                        return null;
                    }
                    int intValue3 = uniqueTournamentId.intValue();
                    w3b w3bVar = u8cVar.d;
                    this.s = 1;
                    obj = w3bVar.q0(intValue3, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (UniqueTournamentResponse) obj;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    Integer eventId2 = mediaPost.getEventId();
                    if (eventId2 == null) {
                        return null;
                    }
                    int intValue4 = eventId2.intValue();
                    s96 s96Var3 = u8cVar.c;
                    this.s = 1;
                    obj = s96Var3.d(intValue4, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (x2g) obj;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    MediaUniqueTournament uniqueTournament = mediaPost.getUniqueTournament();
                    if (uniqueTournament == null) {
                        return null;
                    }
                    int id = uniqueTournament.getId();
                    w3b w3bVar2 = u8cVar.d;
                    this.s = 1;
                    obj = w3bVar2.q0(id, this);
                    if (obj == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return (UniqueTournamentResponse) obj;
            default:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                rm5 rm5Var = rm5.a;
                this.s = 1;
                Object d = u8c.d(u8cVar, mediaPost, rm5Var, this, 6);
                return d == lu3Var6 ? lu3Var6 : d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7c(MediaPost mediaPost, u8c u8cVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = mediaPost;
        this.u = u8cVar;
    }
}
