package defpackage;

import com.blaze.blazesdk.user_management.models.responses.UserManagementResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ksm extends hoi implements Function2 {
    public String r;
    public String s;
    public int t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksm(String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ksm(this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ksm(this.u, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        if (r7 == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r7 == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (r7 == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r7 == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0040, code lost:
    
        if (r7 == r0) goto L50;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        uul uulVar;
        String str2;
        String str3;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        String str4 = this.u;
        switch (i) {
            case 0:
                y6a.M(obj);
                ssm ssmVar = ssm.a;
                this.t = 1;
                obj = ssmVar.a(this);
                break;
            case 1:
                y6a.M(obj);
                str = (String) obj;
                ssm ssmVar2 = ssm.a;
                this.r = str;
                this.t = 2;
                obj = ssmVar2.f(this);
                break;
            case 2:
                str = this.r;
                y6a.M(obj);
                String str5 = (String) obj;
                if (str != null && !StringsKt.R(str) && c.o(str5, str4, false)) {
                    ssm ssmVar3 = ssm.a;
                    this.r = str;
                    this.t = 5;
                    obj = ssmVar3.g(this);
                    break;
                } else {
                    kqm kqmVar = kqm.a;
                    tul tulVar = jdm.d;
                    boolean z = (tulVar == null || (uulVar = tulVar.a) == null) ? false : uulVar.g;
                    this.r = null;
                    this.t = 3;
                    obj = kqmVar.c(z, this);
                    break;
                }
                return lu3Var;
            case 3:
                y6a.M(obj);
                a9m a9mVar = (a9m) obj;
                if (!(a9mVar instanceof a6m)) {
                    brm brmVar = new brm(str4, null);
                    this.t = 4;
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(hq4.c, new xsl(false, brmVar, null), this);
                    break;
                } else {
                    return (a6m) a9mVar;
                }
            case 4:
                y6a.M(obj);
                return (a9m) obj;
            case 5:
                str = this.r;
                y6a.M(obj);
                String str6 = (String) obj;
                ssm ssmVar4 = ssm.a;
                this.r = str;
                this.s = str6;
                this.t = 6;
                Object h = ssmVar4.h(this);
                if (h != lu3Var) {
                    str2 = str6;
                    obj = h;
                    str3 = str;
                    return new qbm(new UserManagementResponse(str3, str2, (String) obj));
                }
                return lu3Var;
            case 6:
                str2 = this.s;
                str3 = this.r;
                y6a.M(obj);
                return new qbm(new UserManagementResponse(str3, str2, (String) obj));
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
