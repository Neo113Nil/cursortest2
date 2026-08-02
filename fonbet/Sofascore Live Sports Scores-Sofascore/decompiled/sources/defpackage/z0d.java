package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class z0d extends m2g implements Function2 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ a1d C;
    public final /* synthetic */ kw8 D;
    public kw8 s;
    public a1d t;
    public long[] u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0d(a1d a1dVar, kw8 kw8Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.C = a1dVar;
        this.D = kw8Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        z0d z0dVar = new z0d(this.C, this.D, rq3Var);
        z0dVar.B = obj;
        return z0dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0d) create((x4h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:14:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:6:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006f -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x4h x4hVar;
        a1d a1dVar;
        long[] jArr;
        int length;
        kw8 kw8Var;
        int i;
        long j;
        lu3 lu3Var = lu3.a;
        int i2 = this.A;
        if (i2 == 0) {
            y6a.M(obj);
            x4hVar = (x4h) this.B;
            a1dVar = this.C;
            jArr = a1dVar.b.a;
            length = jArr.length - 2;
            if (length >= 0) {
                kw8Var = this.D;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return Unit.a;
        }
        if (i2 != 1) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.y;
        int i4 = this.x;
        long j2 = this.z;
        int i5 = this.w;
        int i6 = this.v;
        long[] jArr2 = this.u;
        a1d a1dVar2 = this.t;
        kw8 kw8Var2 = this.s;
        x4h x4hVar2 = (x4h) this.B;
        y6a.M(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                a1dVar = a1dVar2;
                x4hVar = x4hVar2;
                i = i5;
                kw8Var = kw8Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        x4hVar2 = x4hVar;
                        i3 = 0;
                        a1dVar2 = a1dVar;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        kw8Var2 = kw8Var;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                kw8Var2.b = i7;
                                Object obj2 = a1dVar2.b.b[i7];
                                this.B = x4hVar2;
                                this.s = kw8Var2;
                                this.t = a1dVar2;
                                this.u = jArr2;
                                this.v = i6;
                                this.w = i5;
                                this.z = j2;
                                this.x = i4;
                                this.y = i3;
                                this.A = 1;
                                x4hVar2.d(this, obj2);
                                lu3 lu3Var2 = lu3.a;
                                return lu3Var;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return Unit.a;
        }
    }
}
