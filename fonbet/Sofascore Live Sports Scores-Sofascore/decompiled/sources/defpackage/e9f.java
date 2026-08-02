package defpackage;

import com.sofascore.model.profile.ProfileData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e9f extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ f9f t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9f(f9f f9fVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = f9fVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        f9f f9fVar = this.t;
        switch (i) {
            case 0:
                return new e9f(f9fVar, rq3Var, 0);
            default:
                return new e9f(f9fVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((e9f) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        f9f f9fVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dhk dhkVar = f9fVar.f;
                String str = f9fVar.o;
                this.s = 1;
                dhkVar.getClass();
                Object P = yaa.P(new hgk(dhkVar, str, null, 0), this);
                return P == lu3Var ? lu3Var : P;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    dhk dhkVar2 = f9fVar.f;
                    String str2 = f9fVar.o;
                    this.s = 1;
                    obj = dhkVar2.e(str2, this);
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
                ProfileData profileData = (ProfileData) yaa.x((x2g) obj);
                if (profileData != null) {
                    return profileData.getUserBadge();
                }
                return null;
        }
    }
}
