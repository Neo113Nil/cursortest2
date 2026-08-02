package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class re3 extends m2g implements Function2 {
    public int s;
    public int t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ se3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re3(se3 se3Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = se3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        re3 re3Var = new re3(this.x, rq3Var);
        re3Var.w = obj;
        return re3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((re3) create((x4h) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        x4h x4hVar;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        se3 se3Var = this.x;
        l0d l0dVar = se3Var.a;
        tzc tzcVar = se3Var.c;
        lu3 lu3Var = lu3.a;
        int i6 = this.v;
        if (i6 == 0) {
            y6a.M(obj);
            x4hVar = (x4h) this.w;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.u;
            i2 = this.t;
            i3 = this.s;
            x4hVar = (x4h) this.w;
            y6a.M(obj);
        }
        if (i3 >= Math.min(se3Var.d + 10, tzcVar.b)) {
            return Unit.a;
        }
        int i7 = i3 + 1;
        int c = tzcVar.c(i3);
        switch (c) {
            case 0:
                str = "up";
                break;
            case 1:
                String m = mz1.m(l0dVar.f(i2), "down ");
                i2++;
                str = m;
                break;
            case 2:
                str = "remove " + tzcVar.c(i7) + ' ' + tzcVar.c(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                str = "move " + tzcVar.c(i7) + ' ' + tzcVar.c(i3 + 2) + ' ' + tzcVar.c(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int c2 = tzcVar.c(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + c2 + ' ' + l0dVar.f(i2);
                int i8 = i4;
                str = str2;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int c3 = tzcVar.c(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + c3 + ' ' + l0dVar.f(i2);
                int i82 = i4;
                str = str2;
                i7 = i82;
                i2 = i5;
                break;
            case 7:
                Object f = l0dVar.f(i2);
                f.getClass();
                i5k.e(2, f);
                i2 += 2;
                str = "apply " + ((Function2) f);
                break;
            case 8:
                str = "reuse " + se3Var.b.f(i);
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = ljg.j(c, "unknown op: ");
                break;
        }
        this.w = x4hVar;
        this.s = i7;
        this.t = i2;
        this.u = i;
        this.v = 1;
        x4hVar.d(this, i3 + ": " + str);
        return lu3Var;
    }
}
