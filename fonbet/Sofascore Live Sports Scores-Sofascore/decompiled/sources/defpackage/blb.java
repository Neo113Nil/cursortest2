package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class blb extends hoi implements Function1 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ olb B;
    public int r;
    public final /* synthetic */ flb s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ float w;
    public final /* synthetic */ plb x;
    public final /* synthetic */ float y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blb(flb flbVar, int i, int i2, boolean z, float f, plb plbVar, float f2, boolean z2, boolean z3, olb olbVar, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = flbVar;
        this.t = i;
        this.u = i2;
        this.v = z;
        this.w = f;
        this.x = plbVar;
        this.y = f2;
        this.z = z2;
        this.A = z3;
        this.B = olbVar;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new blb(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((blb) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        flb flbVar = this.s;
        try {
            if (i == 0) {
                y6a.M(obj);
                flbVar.h(this.t);
                e1d e1dVar = flbVar.c;
                int i2 = this.u;
                ((eoh) e1dVar).setValue(Integer.valueOf(i2));
                ((eoh) flbVar.d).setValue(Boolean.valueOf(this.v));
                e1d e1dVar2 = flbVar.f;
                float f = this.w;
                ((eoh) e1dVar2).setValue(Float.valueOf(f));
                ((eoh) flbVar.e).setValue(null);
                eoh eohVar = (eoh) flbVar.i;
                plb plbVar = this.x;
                eohVar.setValue(plbVar);
                flbVar.j(this.y);
                ((eoh) flbVar.g).setValue(Boolean.valueOf(this.z));
                if (!this.A) {
                    ((eoh) flbVar.l).setValue(Long.MIN_VALUE);
                }
                if (plbVar == null) {
                    flbVar.i(false);
                    return Unit.a;
                }
                if (Float.isInfinite(f)) {
                    flbVar.j(((Number) flbVar.m.getValue()).floatValue());
                    flbVar.i(false);
                    flbVar.h(i2);
                    return Unit.a;
                }
                flbVar.i(true);
                int ordinal = this.B.ordinal();
                if (ordinal == 0) {
                    coroutineContext = g.a;
                } else {
                    if (ordinal != 1) {
                        throw new ndd();
                    }
                    coroutineContext = eed.b;
                }
                ly7 ly7Var = new ly7(this.B, bea.x(getContext()), this.u, this.t, flbVar, (rq3) null);
                this.r = 1;
                if (xw3.R(coroutineContext, ly7Var, this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
            bea.u(getContext());
            flbVar.i(false);
            return Unit.a;
        } catch (Throwable th) {
            flbVar.i(false);
            throw th;
        }
    }
}
