package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vzh extends m2g implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ z69 B;
    public final /* synthetic */ ksa C;
    public final /* synthetic */ e1d D;
    public final /* synthetic */ xnh E;
    public final /* synthetic */ e1d F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Function2 H;
    public int s;
    public int t;
    public float u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ float y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzh(boolean z, float f, boolean z2, List list, z69 z69Var, ksa ksaVar, e1d e1dVar, xnh xnhVar, e1d e1dVar2, float f2, Function2 function2, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = z;
        this.y = f;
        this.z = z2;
        this.A = list;
        this.B = z69Var;
        this.C = ksaVar;
        this.D = e1dVar;
        this.E = xnhVar;
        this.F = e1dVar2;
        this.G = f2;
        this.H = function2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        vzh vzhVar = new vzh(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, rq3Var);
        vzhVar.w = obj;
        return vzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vzh) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f3, code lost:
    
        if (r4 != r2) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f5, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0046, code lost:
    
        if (r3 == r2) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00f3 -> B:6:0x0029). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        long j;
        int i;
        float f;
        int i2;
        dsa x;
        Object b2;
        noi noiVar = (noi) this.w;
        lu3 lu3Var = lu3.a;
        int i3 = this.v;
        e1d e1dVar = this.F;
        xnh xnhVar = this.E;
        e1d e1dVar2 = this.D;
        if (i3 == 0) {
            y6a.M(obj);
            gze gzeVar = gze.a;
            this.w = noiVar;
            this.v = 1;
            b = noiVar.b(gzeVar, this);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.t;
                f = this.u;
                i = this.s;
                y6a.M(obj);
                b2 = obj;
                j = 4294967295L;
                float f2 = f;
                int i4 = i;
                mze mzeVar = (mze) CollectionsKt.firstOrNull(((fze) b2).a);
                if (mzeVar != null) {
                    mzeVar.a();
                    float intBitsToFloat = Float.intBitsToFloat((int) (mzeVar.c & j)) - Float.intBitsToFloat((int) (mzeVar.g & j));
                    if (((Integer) e1dVar2.getValue()) != null) {
                        xnhVar.i(xnhVar.h() + intBitsToFloat);
                        hz8.w(this.G, this.A, this.H, this.B, e1dVar2, xnhVar, this.C);
                    }
                    if (mzeVar.d) {
                        f = f2;
                        i = i4;
                        gze gzeVar2 = gze.a;
                        this.w = noiVar;
                        this.s = i;
                        this.u = f;
                        this.t = i2;
                        this.v = 2;
                        b2 = noiVar.b(gzeVar2, this);
                    }
                }
                e1dVar2.setValue(null);
                e1dVar.setValue(null);
                return Unit.a;
            }
            y6a.M(obj);
            b = obj;
        }
        mze mzeVar2 = (mze) CollectionsKt.firstOrNull(((fze) b).a);
        if (mzeVar2 == null) {
            return Unit.a;
        }
        long j2 = mzeVar2.c;
        int i5 = (int) (noiVar.f.x >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        boolean z = this.x;
        float f3 = this.y;
        int i6 = (!z ? intBitsToFloat2 > ((float) i5) - f3 : intBitsToFloat2 < f3) ? 0 : 1;
        if (i6 == 0) {
            return Unit.a;
        }
        mzeVar2.a();
        j = 4294967295L;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        if (this.z && (x = hz8.x(this.C, intBitsToFloat3)) != null) {
            Object obj2 = x.k;
            List list = this.A;
            Integer y = hz8.y(list, obj2);
            if (y != null) {
                int intValue = y.intValue();
                if (!Intrinsics.c(((hzh) list.get(intValue)).a, mzh.a)) {
                    e1dVar2.setValue(y);
                    xnhVar.i(x.o);
                    e1dVar.setValue((hzh) list.get(intValue));
                    ((kie) this.B).a(0);
                }
            }
        }
        i = i5;
        f = intBitsToFloat2;
        i2 = i6;
        gze gzeVar22 = gze.a;
        this.w = noiVar;
        this.s = i;
        this.u = f;
        this.t = i2;
        this.v = 2;
        b2 = noiVar.b(gzeVar22, this);
    }
}
