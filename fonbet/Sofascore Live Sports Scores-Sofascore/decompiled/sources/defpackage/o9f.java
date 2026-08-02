package defpackage;

import com.sofascore.model.profile.EditorsPopularEventsResponse;
import com.sofascore.model.profile.ProfileData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o9f extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ q9f t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9f(q9f q9fVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = q9fVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        q9f q9fVar = this.t;
        switch (i) {
            case 0:
                return new o9f(q9fVar, rq3Var, 0);
            case 1:
                return new o9f(q9fVar, rq3Var, 1);
            case 2:
                return new o9f(q9fVar, rq3Var, 2);
            case 3:
                return new o9f(q9fVar, rq3Var, 3);
            default:
                return new o9f(q9fVar, rq3Var, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((o9f) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        q9f q9fVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    oi5 oi5Var = q9fVar.m;
                    String str = q9fVar.o;
                    this.s = 1;
                    oi5Var.getClass();
                    obj = yaa.P(new cl(oi5Var, str, null, 9), this);
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
                return yaa.x((x2g) obj);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    p9f p9fVar = new p9f(q9fVar, null, 0);
                    this.s = 1;
                    obj = yaa.P(p9fVar, this);
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
                return yaa.x((x2g) obj);
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    p9f p9fVar2 = new p9f(q9fVar, null, 1);
                    this.s = 1;
                    obj = yaa.P(p9fVar2, this);
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
                EditorsPopularEventsResponse editorsPopularEventsResponse = (EditorsPopularEventsResponse) yaa.x((x2g) obj);
                if (editorsPopularEventsResponse != null) {
                    return editorsPopularEventsResponse.getEvents();
                }
                return null;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    p9f p9fVar3 = new p9f(q9fVar, null, 2);
                    this.s = 1;
                    obj = yaa.P(p9fVar3, this);
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
                return yaa.x((x2g) obj);
            default:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    dhk dhkVar = q9fVar.l;
                    String str2 = q9fVar.o;
                    this.s = 1;
                    obj = dhkVar.e(str2, this);
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
                ProfileData profileData = (ProfileData) yaa.x((x2g) obj);
                if (profileData != null) {
                    return profileData.getUserEditorScoreAggregates();
                }
                return null;
        }
    }
}
