package defpackage;

import com.moloco.sdk.internal.services.analytics.a;
import com.moloco.sdk.internal.services.events.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class rvg extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public int s;
    public long t;
    public /* synthetic */ long u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvg(a aVar, long j, long j2, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = aVar;
        this.t = j;
        this.u = j2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                rvg rvgVar = new rvg((svg) this.v, rq3Var);
                rvgVar.u = ((vmk) obj).a;
                return rvgVar;
            default:
                return new rvg((a) this.v, this.t, this.u, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                long j = ((vmk) obj).a;
                rvg rvgVar = new rvg((svg) this.v, (rq3) obj2);
                rvgVar.u = j;
                return rvgVar.invokeSuspend(Unit.a);
            default:
                return ((rvg) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r13 == r12) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                svg svgVar = (svg) obj2;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    j = this.u;
                    h9d h9dVar = svgVar.f;
                    this.u = j;
                    this.s = 1;
                    obj = h9dVar.b(j, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j4 = this.t;
                            j5 = this.u;
                            y6a.M(obj);
                            return new vmk(vmk.d(j5, vmk.d(j4, ((vmk) obj).a)));
                        }
                        j3 = this.t;
                        long j6 = this.u;
                        y6a.M(obj);
                        j2 = j6;
                        long j7 = ((vmk) obj).a;
                        h9d h9dVar2 = svgVar.f;
                        long d = vmk.d(j3, j7);
                        this.u = j2;
                        this.t = j7;
                        this.s = 3;
                        obj = h9dVar2.a(d, j7, this);
                        if (obj != lu3Var) {
                            j4 = j7;
                            j5 = j2;
                            return new vmk(vmk.d(j5, vmk.d(j4, ((vmk) obj).a)));
                        }
                        return lu3Var;
                    }
                    j = this.u;
                    y6a.M(obj);
                }
                long d2 = vmk.d(j, ((vmk) obj).a);
                this.u = j;
                this.t = d2;
                this.s = 2;
                obj = svgVar.a(d2, this);
                if (obj != lu3Var) {
                    j2 = j;
                    j3 = d2;
                    long j72 = ((vmk) obj).a;
                    h9d h9dVar22 = svgVar.f;
                    long d3 = vmk.d(j3, j72);
                    this.u = j2;
                    this.t = j72;
                    this.s = 3;
                    obj = h9dVar22.a(d3, j72, this);
                    if (obj != lu3Var) {
                    }
                }
                return lu3Var;
            default:
                a aVar = (a) obj2;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    c cVar = aVar.b;
                    long j8 = this.t;
                    b bVar = new b(this.u);
                    String str = aVar.c.a.c;
                    this.s = 1;
                    obj = cVar.b(j8, bVar, str, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                aVar.a.a((String) obj);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvg(svg svgVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = svgVar;
    }
}
