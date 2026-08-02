package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.z;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class iqm extends hoi implements Function1 {
    public BlazeResult.Error r;
    public Object s;
    public int t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Function1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqm(String str, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.u = str;
        this.v = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new iqm(this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new iqm(this.u, this.v, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00de, code lost:
    
        if (r13 == r1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x015f, code lost:
    
        if (defpackage.evl.b(r3, r2, r9) == r1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x018b, code lost:
    
        if (defpackage.evl.b(r3, r5, r9) != r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0144, code lost:
    
        if (defpackage.evl.c(r3, r12, r9) == r1) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #7 {all -> 0x014b, blocks: (B:36:0x0115, B:38:0x011c, B:41:0x0121, B:43:0x0132, B:45:0x013b, B:73:0x010d), top: B:72:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0091 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x003a, blocks: (B:34:0x0034, B:65:0x00ea, B:87:0x005f, B:91:0x0091, B:94:0x009b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        iqm iqmVar;
        BlazeResult.Error error;
        Object obj3;
        BlazeResult.Error error2;
        String modifiedProposedExternalUserID;
        uul uulVar;
        a9m a9mVar;
        BlazeResult.Error error3;
        lu3 lu3Var = lu3.a;
        int i = this.t;
        ?? r2 = 3;
        Function1 function1 = this.v;
        try {
            try {
                try {
                } catch (Throwable th) {
                    obj2 = th;
                    iqmVar = this;
                }
            } catch (Throwable th2) {
                obj2 = th2;
                iqmVar = this;
            }
        } catch (Throwable th3) {
            obj2 = th3;
            iqmVar = this;
        }
        switch (i) {
            case 0:
                y6a.M(obj);
                BlazeResult.Error d = new z().d();
                try {
                    ssm ssmVar = ssm.a;
                    this.r = d;
                    this.t = 1;
                    Object f = ssmVar.f(this);
                    if (f != lu3Var) {
                        error = d;
                        obj = f;
                        try {
                            modifiedProposedExternalUserID = BlazeSDK.INSTANCE.getModifiedProposedExternalUserID(this.u);
                            boolean z = false;
                            if (c.o((String) obj, modifiedProposedExternalUserID, false)) {
                                try {
                                    Iterator it = pgm.b.iterator();
                                    while (it.hasNext()) {
                                        yda ydaVar = ((s1m) it.next()).d;
                                        if (ydaVar != null) {
                                            ydaVar.e(null);
                                        }
                                    }
                                    pgm.b.clear();
                                    kqm kqmVar = kqm.a;
                                    tul tulVar = jdm.d;
                                    if (tulVar != null && (uulVar = tulVar.a) != null) {
                                        z = uulVar.g;
                                    }
                                    this.r = error;
                                    this.s = modifiedProposedExternalUserID;
                                    this.t = 3;
                                    obj = kqmVar.c(z, this);
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    iqmVar = this;
                                    obj2 = th;
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj2, null);
                                    iqmVar.r = null;
                                    iqmVar.s = null;
                                    iqmVar.t = 8;
                                    break;
                                }
                            } else {
                                BlazeResult.Success success = new BlazeResult.Success(Unit.a);
                                this.r = error;
                                this.t = 2;
                                if (evl.c(function1, success, this) != lu3Var) {
                                    return Unit.a;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            iqmVar = this;
                            obj2 = th;
                            r2 = error;
                            error = r2;
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj2, null);
                            iqmVar.r = null;
                            iqmVar.s = null;
                            iqmVar.t = 8;
                        }
                    }
                } catch (Throwable th6) {
                    iqmVar = this;
                    obj3 = th6;
                    error2 = d;
                    obj2 = obj3;
                    r2 = error2;
                    error = r2;
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj2, null);
                    iqmVar.r = null;
                    iqmVar.s = null;
                    iqmVar.t = 8;
                }
                return lu3Var;
            case 1:
                error = this.r;
                y6a.M(obj);
                modifiedProposedExternalUserID = BlazeSDK.INSTANCE.getModifiedProposedExternalUserID(this.u);
                boolean z2 = false;
                if (c.o((String) obj, modifiedProposedExternalUserID, false)) {
                }
                return lu3Var;
            case 2:
                BlazeResult.Error error4 = this.r;
                y6a.M(obj);
                return Unit.a;
            case 3:
                modifiedProposedExternalUserID = (String) this.s;
                error = this.r;
                y6a.M(obj);
                if (!(((a9m) obj) instanceof a6m)) {
                    rwl rwlVar = rwl.a;
                    dpm dpmVar = new dpm(modifiedProposedExternalUserID, null);
                    this.r = error;
                    this.s = null;
                    this.t = 5;
                    iqmVar = this;
                    try {
                        obj = rwl.safeApiCall$default(rwlVar, false, dpmVar, iqmVar, 1, null);
                        if (obj == lu3Var) {
                        }
                        a9mVar = (a9m) obj;
                        if (a9mVar instanceof qbm) {
                            try {
                                BlazeSDK.INSTANCE.refreshWidgetAndGetUserData();
                                xw3.L(pgm.c, null, null, new gdm(null), 3);
                                BlazeResult.Success success2 = new BlazeResult.Success(Unit.a);
                                iqmVar.r = error;
                                iqmVar.s = a9mVar;
                                iqmVar.t = 6;
                                break;
                            } catch (Throwable th7) {
                                th = th7;
                                obj2 = th;
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj2, null);
                                iqmVar.r = null;
                                iqmVar.s = null;
                                iqmVar.t = 8;
                                break;
                            }
                        }
                        error3 = error;
                        try {
                            if (a9mVar instanceof a6m) {
                                try {
                                    iqmVar.r = error3;
                                    iqmVar.s = a9mVar;
                                    iqmVar.t = 7;
                                    break;
                                } catch (Throwable th8) {
                                    obj3 = th8;
                                    error2 = error3;
                                    obj2 = obj3;
                                    r2 = error2;
                                    error = r2;
                                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj2, null);
                                    iqmVar.r = null;
                                    iqmVar.s = null;
                                    iqmVar.t = 8;
                                }
                            }
                        } catch (Throwable th9) {
                            obj2 = th9;
                            r2 = error3;
                            error = r2;
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj2, null);
                            iqmVar.r = null;
                            iqmVar.s = null;
                            iqmVar.t = 8;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        obj2 = th;
                        r2 = error;
                        error = r2;
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj2, null);
                        iqmVar.r = null;
                        iqmVar.s = null;
                        iqmVar.t = 8;
                    }
                    return Unit.a;
                }
                this.r = error;
                this.s = null;
                this.t = 4;
                if (evl.b(function1, error, this) != lu3Var) {
                    return Unit.a;
                }
                return lu3Var;
            case 4:
                BlazeResult.Error error5 = this.r;
                y6a.M(obj);
                return Unit.a;
            case 5:
                error = this.r;
                y6a.M(obj);
                iqmVar = this;
                a9mVar = (a9m) obj;
                if (a9mVar instanceof qbm) {
                }
                error3 = error;
                if (a9mVar instanceof a6m) {
                }
                return Unit.a;
            case 6:
                a9mVar = (a9m) this.s;
                BlazeResult.Error error6 = this.r;
                y6a.M(obj);
                iqmVar = this;
                error3 = error6;
                if (a9mVar instanceof a6m) {
                }
                return Unit.a;
            case 7:
                BlazeResult.Error error7 = this.r;
                y6a.M(obj);
                return Unit.a;
            case 8:
                y6a.M(obj);
                return Unit.a;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
