package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jy6 extends hoi implements Function2 {
    public List r;
    public ky6 s;
    public int t;
    public int u;
    public final /* synthetic */ ky6 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ r3 y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy6(ky6 ky6Var, int i, int i2, r3 r3Var, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = ky6Var;
        this.w = i;
        this.x = i2;
        this.y = r3Var;
        this.z = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new jy6(this.v, this.w, this.x, this.y, this.z, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jy6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061 A[RETURN] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        int i;
        boolean booleanValue;
        long j;
        lu3 lu3Var = lu3.a;
        int i2 = this.u;
        ky6 ky6Var = this.v;
        if (i2 == 0) {
            y6a.M(obj);
            this.u = 1;
            ky6Var.getClass();
            obj = s9a.r(new hy6(ky6Var, this.w, null, 1), this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.t;
                ky6Var = this.s;
                list = this.r;
                y6a.M(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                j = this.z;
                if (ky6Var.a(j, i, booleanValue) < j) {
                    return list;
                }
                return null;
            }
            y6a.M(obj);
        }
        list = (List) obj;
        this.r = list;
        this.s = ky6Var;
        int i3 = this.x;
        this.t = i3;
        this.u = 2;
        Object invoke = this.y.invoke(this);
        if (invoke != lu3Var) {
            i = i3;
            obj = invoke;
            booleanValue = ((Boolean) obj).booleanValue();
            j = this.z;
            if (ky6Var.a(j, i, booleanValue) < j) {
            }
        }
        return lu3Var;
    }
}
