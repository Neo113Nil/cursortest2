package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h3m extends hoi implements Function2 {
    public a9m r;
    public int s;
    public final /* synthetic */ sqm t;
    public final /* synthetic */ qim u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3m(sqm sqmVar, qim qimVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = sqmVar;
        this.u = qimVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new h3m(this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h3m(this.t, this.u, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c8, code lost:
    
        if (defpackage.sqm.X(r14, r1, r2, r9) == r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (defpackage.sqm.X(r14, r1, r2, r9) == r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r0 == r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        if (r0 == r13) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object momentsAndDontCache$default;
        Object momentsAndSaveToCache$default;
        a9m a9mVar;
        a9m a9mVar2;
        h3m h3mVar = this;
        lu3 lu3Var = lu3.a;
        int i = h3mVar.s;
        sqm sqmVar = h3mVar.t;
        qim qimVar = h3mVar.u;
        switch (i) {
            case 0:
                y6a.M(obj);
                boolean z = sqmVar.o0;
                gum gumVar = sqmVar.k0;
                if (!z) {
                    BlazeDataSourceType blazeDataSourceType = qimVar.b;
                    String str = qimVar.a;
                    boolean z2 = qimVar.c;
                    String C = sqmVar.C();
                    h3mVar.s = 4;
                    momentsAndDontCache$default = jrl.getMomentsAndDontCache$default(gumVar, blazeDataSourceType, str, C, false, z2, null, null, null, h3mVar, 232, null);
                    break;
                } else {
                    BlazeDataSourceType blazeDataSourceType2 = qimVar.b;
                    String str2 = qimVar.a;
                    boolean z3 = qimVar.c;
                    String C2 = sqmVar.C();
                    h3mVar.s = 1;
                    momentsAndSaveToCache$default = jrl.getMomentsAndSaveToCache$default(gumVar, blazeDataSourceType2, str2, C2, false, z3, null, null, null, true, this, 232, null);
                    h3mVar = this;
                    break;
                }
                return lu3Var;
            case 1:
                y6a.M(obj);
                momentsAndSaveToCache$default = obj;
                a9mVar = (a9m) momentsAndSaveToCache$default;
                if (a9mVar instanceof qbm) {
                    List list = (List) ((qbm) a9mVar).a;
                    Function1 function1 = qimVar.d;
                    h3mVar.r = a9mVar;
                    h3mVar.s = 2;
                    break;
                }
                if (a9mVar instanceof a6m) {
                    Function1 function12 = qimVar.d;
                    h3mVar.r = a9mVar;
                    h3mVar.s = 3;
                    if (sqm.W(sqmVar, (a6m) a9mVar, function12, h3mVar) == lu3Var) {
                        return lu3Var;
                    }
                }
                return a9mVar;
            case 2:
                a9mVar = h3mVar.r;
                y6a.M(obj);
                if (a9mVar instanceof a6m) {
                }
                return a9mVar;
            case 3:
                a9m a9mVar3 = h3mVar.r;
                y6a.M(obj);
                return a9mVar3;
            case 4:
                y6a.M(obj);
                momentsAndDontCache$default = obj;
                a9mVar2 = (a9m) momentsAndDontCache$default;
                if (a9mVar2 instanceof qbm) {
                    List list2 = (List) ((qbm) a9mVar2).a;
                    Function1 function13 = qimVar.d;
                    h3mVar.r = a9mVar2;
                    h3mVar.s = 5;
                    break;
                }
                if (a9mVar2 instanceof a6m) {
                    Function1 function14 = qimVar.d;
                    h3mVar.r = a9mVar2;
                    h3mVar.s = 6;
                    if (sqm.W(sqmVar, (a6m) a9mVar2, function14, h3mVar) == lu3Var) {
                    }
                }
                return a9mVar2;
            case 5:
                a9mVar2 = h3mVar.r;
                y6a.M(obj);
                if (a9mVar2 instanceof a6m) {
                }
                return a9mVar2;
            case 6:
                a9m a9mVar4 = h3mVar.r;
                y6a.M(obj);
                return a9mVar4;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
