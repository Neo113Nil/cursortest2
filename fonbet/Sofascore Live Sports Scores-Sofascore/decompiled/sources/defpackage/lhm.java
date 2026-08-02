package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.shared.results.BlazeResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lhm extends hoi implements Function1 {
    public qbm r;
    public int s;
    public final /* synthetic */ BlazeDataSourceType t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ Function1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhm(BlazeDataSourceType blazeDataSourceType, String str, String str2, String str3, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.t = blazeDataSourceType;
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new lhm(this.t, this.u, this.v, this.w, this.x, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((lhm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (defpackage.evl.c(r14, r3, r16) == r13) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r0 == r13) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object momentsAndSaveToCache$default;
        Object obj2;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        Function1 function1 = this.x;
        if (i == 0) {
            y6a.M(obj);
            gum gumVar = gum.b;
            this.s = 1;
            momentsAndSaveToCache$default = jrl.getMomentsAndSaveToCache$default(gumVar, this.t, this.u, "entry_points_broadcast_id", false, false, this.v, this.w, null, false, this, 392, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.r;
                y6a.M(obj);
                if (obj2 instanceof a6m) {
                    function1.invoke(new BlazeResult.Error(null, null, null, "Failed To prepare moments", null, null, 55, null));
                }
                return Unit.a;
            }
            y6a.M(obj);
            momentsAndSaveToCache$default = obj;
        }
        obj2 = (a9m) momentsAndSaveToCache$default;
        if (obj2 instanceof qbm) {
            qbm qbmVar = (qbm) obj2;
            List list = (List) qbmVar.a;
            irm.prefetchPlayables$default(new irm(), i6m.a(list), null, e7m.a(mcm.a), tum.a, 2, null);
            BlazeResult.Success success = new BlazeResult.Success(list);
            this.r = qbmVar;
            this.s = 2;
        }
        if (obj2 instanceof a6m) {
        }
        return Unit.a;
    }
}
