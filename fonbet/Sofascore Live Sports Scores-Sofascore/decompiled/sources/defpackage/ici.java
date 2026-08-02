package defpackage;

import com.sofascore.local_persistance.UserAccount;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ici extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ lci t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ici(lci lciVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = lciVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        lci lciVar = this.t;
        switch (i) {
            case 0:
                return new ici(lciVar, rq3Var, 0);
            default:
                return new ici(lciVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ici) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r0.d(r7) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        if (r8 == r1) goto L30;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        lci lciVar = this.t;
        switch (i) {
            case 0:
                bfk bfkVar = lciVar.e;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    obj = bfkVar.c(this);
                    break;
                } else if (i2 == 1) {
                    y6a.M(obj);
                } else if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                UserAccount userAccount = (UserAccount) obj;
                if (userAccount.getIsLoggedIn() && Intrinsics.c(userAccount.getType(), "sofa")) {
                    this.s = 2;
                    break;
                }
                break;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    cg4 cg4Var = lciVar.h;
                    this.s = 1;
                    if (cg4Var.g("PREF_SHOW_BASEBALL_HOME_AWAY_BUBBLE", false, this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
