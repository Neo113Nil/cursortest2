package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iy6 extends hoi implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public av4 r;
    public ky6 s;
    public int t;
    public long u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ ky6 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy6(ky6 ky6Var, int i, long j, int i2, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = ky6Var;
        this.y = i;
        this.z = j;
        this.A = i2;
        this.B = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        iy6 iy6Var = new iy6(this.x, this.y, this.z, this.A, this.B, rq3Var);
        iy6Var.w = obj;
        return iy6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((iy6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0082 A[RETURN] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 av4Var;
        int i;
        ky6 ky6Var;
        long j;
        ku3 ku3Var = (ku3) this.w;
        lu3 lu3Var = lu3.a;
        int i2 = this.v;
        long j2 = this.z;
        if (i2 == 0) {
            y6a.M(obj);
            ky6 ky6Var2 = this.x;
            int i3 = this.A;
            av4 t = xw3.t(ku3Var, null, new hy6(ky6Var2, i3, null, 3), 3);
            av4 t2 = xw3.t(ku3Var, null, new ok0(ky6Var2, this.B, i3, (rq3) null, 19), 3);
            this.w = null;
            this.r = t;
            this.s = ky6Var2;
            int i4 = this.y;
            this.t = i4;
            this.v = 1;
            Object w = t2.w(this);
            if (w != lu3Var) {
                av4Var = t;
                obj = w;
                i = i4;
                ky6Var = ky6Var2;
            }
            return lu3Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.u;
            y6a.M(obj);
            if (j < j2) {
                return obj;
            }
            return null;
        }
        i = this.t;
        ky6Var = this.s;
        av4Var = this.r;
        y6a.M(obj);
        long a = ky6Var.a(j2, i, ((Boolean) obj).booleanValue());
        this.w = null;
        this.r = null;
        this.s = null;
        this.u = a;
        this.v = 2;
        obj = av4Var.T(this);
        if (obj != lu3Var) {
            j = a;
            if (j < j2) {
            }
        }
        return lu3Var;
    }
}
