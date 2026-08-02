package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kpl extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ BlazeDataSourceType t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Function1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpl(String str, BlazeDataSourceType blazeDataSourceType, boolean z, Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = str;
        this.t = blazeDataSourceType;
        this.u = z;
        this.v = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new kpl(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kpl) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            aeh aehVar = rxl.a;
            qim qimVar = new qim(this.s, this.t, this.u, this.v);
            this.r = 1;
            if (aehVar.emit(qimVar, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
