package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ntl extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ BlazeDataSourceType t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ Function1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntl(String str, BlazeDataSourceType blazeDataSourceType, boolean z, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = str;
        this.t = blazeDataSourceType;
        this.u = z;
        this.v = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new ntl(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ntl) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object obj2 = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            aeh aehVar = rxl.a;
            this.r = 1;
            hs4 hs4Var = z45.a;
            Object R = xw3.R(hq4.c, new kpl(this.s, this.t, this.u, this.v, null), this);
            if (R != obj2) {
                R = Unit.a;
            }
            if (R == obj2) {
                return obj2;
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
