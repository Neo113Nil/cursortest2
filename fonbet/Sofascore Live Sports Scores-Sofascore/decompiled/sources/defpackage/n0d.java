package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class n0d extends m2g implements Function2 {
    public kw8 s;
    public o0d t;
    public long[] u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ o0d y;
    public final /* synthetic */ kw8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0d(o0d o0dVar, kw8 kw8Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = o0dVar;
        this.z = kw8Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        n0d n0dVar = new n0d(this.y, this.z, rq3Var);
        n0dVar.x = obj;
        return n0dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0d) create((x4h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        x4h x4hVar;
        o0d o0dVar;
        long[] jArr;
        int i;
        kw8 kw8Var;
        lu3 lu3Var = lu3.a;
        int i2 = this.w;
        if (i2 == 0) {
            y6a.M(obj);
            x4hVar = (x4h) this.x;
            o0dVar = this.y;
            m0d m0dVar = o0dVar.b;
            jArr = m0dVar.c;
            i = m0dVar.e;
            kw8Var = this.z;
        } else {
            if (i2 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.v;
            jArr = this.u;
            o0dVar = this.t;
            kw8Var = this.s;
            x4hVar = (x4h) this.x;
            y6a.M(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        kw8Var.b = i;
        Object obj2 = o0dVar.b.b[i];
        this.x = x4hVar;
        this.s = kw8Var;
        this.t = o0dVar;
        this.u = jArr;
        this.v = i3;
        this.w = 1;
        x4hVar.d(this, obj2);
        return lu3Var;
    }
}
