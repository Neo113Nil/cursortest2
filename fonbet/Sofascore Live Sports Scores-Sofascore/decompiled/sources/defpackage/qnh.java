package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qnh extends m2g implements Function2 {
    public long[] s;
    public int t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rnh x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnh(rnh rnhVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = rnhVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        qnh qnhVar = new qnh(this.x, rq3Var);
        qnhVar.w = obj;
        return qnhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qnh) create((x4h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c5 -> B:7:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:20:0x0099). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x4h x4hVar;
        long[] jArr;
        int length;
        int i;
        x4h x4hVar2;
        int i2;
        x4h x4hVar3;
        int i3;
        rnh rnhVar = this.x;
        long j = rnhVar.a;
        long j2 = rnhVar.c;
        long j3 = rnhVar.b;
        lu3 lu3Var = lu3.a;
        int i4 = this.v;
        if (i4 == 0) {
            y6a.M(obj);
            x4hVar = (x4h) this.w;
            jArr = rnhVar.d;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                x4hVar2 = x4hVar;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return Unit.a;
        }
        if (i4 == 1) {
            length = this.u;
            int i5 = this.t;
            jArr = this.s;
            x4hVar = (x4h) this.w;
            y6a.M(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.t;
                x4hVar3 = (x4h) this.w;
                y6a.M(obj);
                i3++;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.w = x4hVar3;
                        this.s = null;
                        this.t = i3;
                        this.v = 3;
                        x4hVar3.d(this, l);
                        lu3 lu3Var2 = lu3.a;
                        return lu3Var;
                    }
                    i3++;
                    if (i3 < 64) {
                    }
                }
                return Unit.a;
            }
            i2 = this.t;
            x4hVar2 = (x4h) this.w;
            y6a.M(obj);
            i2++;
            if (i2 >= 64) {
                x4hVar = x4hVar2;
                if (j != 0) {
                    x4hVar3 = x4hVar;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return Unit.a;
            }
            if ((j3 & (1 << i2)) != 0) {
                Long l2 = new Long(j2 + i2);
                this.w = x4hVar2;
                this.s = null;
                this.t = i2;
                this.v = 2;
                x4hVar2.d(this, l2);
                lu3 lu3Var3 = lu3.a;
                return lu3Var;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.w = x4hVar;
            this.s = jArr;
            this.t = i;
            this.u = length;
            this.v = 1;
            x4hVar.d(this, l3);
            return lu3Var;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return Unit.a;
    }
}
