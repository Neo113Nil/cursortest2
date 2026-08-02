package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class q98 extends hoi implements ct8 {
    public ln2 r;
    public fsf s;
    public esf t;
    public int u;
    public /* synthetic */ ku3 v;
    public /* synthetic */ b98 w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ z88 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q98(Function1 function1, z88 z88Var, rq3 rq3Var) {
        super(3, rq3Var);
        this.x = function1;
        this.y = z88Var;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q98 q98Var = new q98(this.x, this.y, (rq3) obj3);
        q98Var.v = (ku3) obj;
        q98Var.w = (b98) obj2;
        return q98Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        if (defpackage.h2h.d(r11, r18) != r3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00de -> B:6:0x001a). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fsf fsfVar;
        ln2 ln2Var;
        esf esfVar;
        fsf fsfVar2;
        ln2 ln2Var2;
        esf esfVar2;
        Object obj2;
        ku3 ku3Var = this.v;
        b98 b98Var = this.w;
        lu3 lu3Var = lu3.a;
        int i = this.u;
        int i2 = 1;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            j8f z = v7a.z(ku3Var, new g33(this.y, rq3Var, i2));
            fsfVar = new fsf();
            ln2Var = z;
            obj2 = fsfVar.a;
            if (obj2 != rid.c) {
            }
        } else if (i == 1) {
            esfVar2 = this.t;
            fsfVar = this.s;
            ln2Var = this.r;
            y6a.M(obj);
            fsfVar.a = null;
            esfVar = esfVar2;
            fsfVar2 = fsfVar;
            ln2Var2 = ln2Var;
            h2h h2hVar = new h2h(getContext());
            if (fsfVar2.a != null) {
            }
            h2hVar.g(ln2Var2.l(), new u1(fsfVar2, b98Var, rq3Var, 28));
            this.v = null;
            this.w = b98Var;
            this.r = ln2Var2;
            this.s = fsfVar2;
            this.t = null;
            this.u = 2;
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fsfVar2 = this.s;
            ln2Var2 = this.r;
            y6a.M(obj);
            ln2Var = ln2Var2;
            fsfVar = fsfVar2;
            obj2 = fsfVar.a;
            if (obj2 != rid.c) {
                return Unit.a;
            }
            esfVar = new esf();
            if (obj2 != null) {
                ih2 ih2Var = rid.a;
                if (obj2 == ih2Var) {
                    obj2 = null;
                }
                long longValue = ((Number) this.x.invoke(obj2)).longValue();
                esfVar.a = longValue;
                if (longValue < 0) {
                    a70.p("Debounce timeout should not be negative");
                    return null;
                }
                if (longValue == 0) {
                    Object obj3 = fsfVar.a;
                    if (obj3 == ih2Var) {
                        obj3 = null;
                    }
                    this.v = null;
                    this.w = b98Var;
                    this.r = ln2Var;
                    this.s = fsfVar;
                    this.t = esfVar;
                    this.u = 1;
                    if (b98Var.emit(obj3, this) != lu3Var) {
                        esfVar2 = esfVar;
                        fsfVar.a = null;
                        esfVar = esfVar2;
                    }
                    return lu3Var;
                }
            }
            fsfVar2 = fsfVar;
            ln2Var2 = ln2Var;
            h2h h2hVar2 = new h2h(getContext());
            if (fsfVar2.a != null) {
                long j = esfVar.a;
                cl clVar = new cl(b98Var, fsfVar2, rq3Var, 15);
                uqd uqdVar = new uqd(j);
                tqd tqdVar = tqd.b;
                i5k.e(3, tqdVar);
                h2hVar2.h(new f2h(h2hVar2, uqdVar, tqdVar, zh2.h, j2h.e, clVar, null), false);
            }
            h2hVar2.g(ln2Var2.l(), new u1(fsfVar2, b98Var, rq3Var, 28));
            this.v = null;
            this.w = b98Var;
            this.r = ln2Var2;
            this.s = fsfVar2;
            this.t = null;
            this.u = 2;
        }
    }
}
