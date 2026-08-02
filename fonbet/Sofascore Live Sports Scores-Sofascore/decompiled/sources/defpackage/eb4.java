package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eb4 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb4(rq3 rq3Var, k6g k6gVar, boolean z, boolean z2, Function1 function1) {
        super(2, rq3Var);
        this.t = k6gVar;
        this.u = z;
        this.v = z2;
        this.w = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                return new eb4((k6g) obj3, this.u, this.v, (Function1) obj2, rq3Var);
            case 1:
                return new eb4(rq3Var, (k6g) obj3, this.u, this.v, (Function1) obj2);
            default:
                boolean z = this.v;
                return new eb4(this.u, (q50) obj3, (q50) obj2, z, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((eb4) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (r9.f(r19, r0) == r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (defpackage.q50.a((defpackage.q50) r7, r1, r2, null, r19, 12) == r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r9.f(r19, r0) == r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r0.f(r19, r1) == r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (r0.f(r19, r1) == r10) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (defpackage.s9a.r(r11, r19) == r10) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0079 -> B:11:0x007c). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        boolean z = this.u;
        Object obj2 = this.w;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                k6g k6gVar = (k6g) obj3;
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
                boolean z2 = !(k6gVar.inCompatibilityMode() && k6gVar.inTransaction()) && z;
                k6g k6gVar2 = (k6g) obj3;
                boolean z3 = this.v;
                db4 db4Var = new db4(z2, z3, k6gVar2, null, (Function1) obj2, 0);
                this.s = 1;
                Object useConnection = k6gVar2.useConnection(z3, db4Var, this);
                return useConnection == lu3Var ? lu3Var : useConnection;
            case 1:
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
                k6g k6gVar3 = (k6g) obj3;
                boolean z4 = this.v;
                boolean z5 = this.u;
                db4 db4Var2 = new db4(z4, z5, k6gVar3, null, (Function1) obj2, 1);
                this.s = 1;
                Object useConnection2 = k6gVar3.useConnection(z5, db4Var2, this);
                return useConnection2 == lu3Var2 ? lu3Var2 : useConnection2;
            default:
                q50 q50Var = (q50) obj3;
                q50 q50Var2 = (q50) obj2;
                lu3 lu3Var3 = lu3.a;
                switch (this.s) {
                    case 0:
                        y6a.M(obj);
                        if (z) {
                            Float f = new Float(1.0f);
                            this.s = 1;
                            break;
                        } else if (!this.v) {
                            Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            this.s = 5;
                            break;
                        } else {
                            if (((Number) q50Var.d()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                long b = (long) ((1.0f - llf.b((((Number) q50Var2.d()).floatValue() - (-90.0f)) / 360.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)) * 700.0f);
                                long j = b - 250;
                                ev2 ev2Var = new ev2((q50) obj2, b, j < 0 ? 0L : j, (q50) obj3, null);
                                this.s = 6;
                                break;
                            }
                            return Unit.a;
                        }
                        return lu3Var3;
                    case 1:
                        y6a.M(obj);
                        Float f3 = new Float(-90.0f);
                        this.s = 2;
                        break;
                    case 2:
                    case 4:
                        y6a.M(obj);
                        Float f4 = new Float(270.0f);
                        i4k h0 = s02.h0(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, jg5.d, 2);
                        this.s = 3;
                        break;
                    case 3:
                        y6a.M(obj);
                        Float f5 = new Float(-90.0f);
                        this.s = 4;
                        break;
                    case 5:
                    case 6:
                        y6a.M(obj);
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb4(k6g k6gVar, boolean z, boolean z2, Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = k6gVar;
        this.u = z;
        this.v = z2;
        this.w = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb4(boolean z, q50 q50Var, q50 q50Var2, boolean z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = z;
        this.t = q50Var;
        this.w = q50Var2;
        this.v = z2;
    }
}
