package defpackage;

import com.sofascore.model.profile.EditorsEventsCountResponse;
import com.sofascore.model.profile.ProfileData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xbf extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ ybf t;
    public final /* synthetic */ ProfileData u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbf(ybf ybfVar, ProfileData profileData, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = ybfVar;
        this.u = profileData;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        ProfileData profileData = this.u;
        ybf ybfVar = this.t;
        switch (i) {
            case 0:
                return new xbf(profileData, ybfVar, rq3Var);
            default:
                return new xbf(ybfVar, profileData, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((xbf) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ProfileData profileData = this.u;
        ybf ybfVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    if (!profileData.getEditor()) {
                        return null;
                    }
                    oi5 oi5Var = ybfVar.g;
                    String str = ybfVar.n;
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
                return (EditorsEventsCountResponse) yaa.x((x2g) obj);
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                a3l a3lVar = ybfVar.e;
                String valueOf = String.valueOf(profileData.getLeaderboardId());
                this.s = 1;
                Object d = a3lVar.d(valueOf, this);
                return d == lu3Var2 ? lu3Var2 : d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbf(ProfileData profileData, ybf ybfVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = profileData;
        this.t = ybfVar;
    }
}
