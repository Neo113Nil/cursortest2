package defpackage;

import com.sofascore.model.newNetwork.EventMediaNews;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t41 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w41 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t41(w41 w41Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = w41Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new t41(this.t, rq3Var, 0);
            case 1:
                return new t41(this.t, rq3Var, 1);
            case 2:
                return new t41(this.t, rq3Var, 2);
            case 3:
                return new t41(this.t, rq3Var, 3);
            case 4:
                return new t41(this.t, rq3Var, 4);
            case 5:
                return new t41(this.t, rq3Var, 5);
            case 6:
                return new t41(this.t, rq3Var, 6);
            case 7:
                return new t41(this.t, rq3Var, 7);
            case 8:
                return new t41(this.t, rq3Var, 8);
            case 9:
                return new t41(this.t, rq3Var, 9);
            default:
                return new t41(this.t, rq3Var, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((t41) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0068, code lost:
    
        if (r0 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [lu3] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object w;
        int i = this.r;
        w41 w41Var = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Boolean z = w41Var.z();
                    return z == lu3Var ? lu3Var : z;
                }
                if (i2 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object A = w41Var.A(this);
                    return A == lu3Var2 ? lu3Var2 : A;
                }
                if (i3 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object B = w41Var.B(this);
                    return B == lu3Var3 ? lu3Var3 : B;
                }
                if (i4 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object C = w41Var.C(this);
                    return C == lu3Var4 ? lu3Var4 : C;
                }
                if (i5 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object D = w41Var.D(this);
                    return D == lu3Var5 ? lu3Var5 : D;
                }
                if (i6 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object E = w41Var.E(this);
                    return E == lu3Var6 ? lu3Var6 : E;
                }
                if (i7 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object v = w41Var.v(this);
                    return v == lu3Var7 ? lu3Var7 : v;
                }
                if (i8 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object t = w41Var.t(this);
                    return t == lu3Var8 ? lu3Var8 : t;
                }
                if (i9 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                Object obj2 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    w = w41Var.w(this);
                    break;
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    w = obj;
                }
                Iterable<w5c> iterable = (Iterable) w;
                obj2 = new ArrayList(k13.r(iterable, 10));
                for (w5c w5cVar : iterable) {
                    EventMediaNews eventMediaNews = w5cVar.a;
                    String B2 = jca.B(eventMediaNews.getHeader());
                    if (B2 == null) {
                        B2 = "";
                    }
                    String str = B2;
                    String description = w5cVar.a.getDescription();
                    EventMediaNews copy$default = EventMediaNews.copy$default(eventMediaNews, 0, null, null, description != null ? jca.B(description) : null, str, null, null, null, 231, null);
                    copy$default.getClass();
                    obj2.add(new w5c(copy$default));
                }
                return obj2;
            case 9:
                lu3 lu3Var9 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object x = w41Var.x(this);
                    return x == lu3Var9 ? lu3Var9 : x;
                }
                if (i11 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lu3 lu3Var10 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object y = w41Var.y(this);
                    return y == lu3Var10 ? lu3Var10 : y;
                }
                if (i12 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
