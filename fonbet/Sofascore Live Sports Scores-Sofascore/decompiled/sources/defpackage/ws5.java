package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ws5 extends hoi implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ im B;
    public final /* synthetic */ String C;
    public x2g r;
    public xs5 s;
    public im t;
    public String u;
    public int v;
    public final /* synthetic */ bs2 w;
    public final /* synthetic */ av4 x;
    public final /* synthetic */ r82 y;
    public final /* synthetic */ xs5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws5(bs2 bs2Var, av4 av4Var, r82 r82Var, xs5 xs5Var, boolean z, im imVar, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = bs2Var;
        this.x = av4Var;
        this.y = r82Var;
        this.z = xs5Var;
        this.A = z;
        this.B = imVar;
        this.C = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ws5(this.w, this.x, this.y, this.z, this.A, this.B, this.C, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ws5) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        if (defpackage.h2h.d(r6, r11) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0042, code lost:
    
        if (r12 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ba  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x2g x2gVar;
        im imVar;
        String str;
        Object value;
        lu3 lu3Var = lu3.a;
        int i = this.v;
        xs5 xs5Var = this.z;
        av4 av4Var = this.x;
        if (i == 0) {
            y6a.M(obj);
            this.v = 1;
            obj = this.w.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.u;
                    imVar = this.t;
                    xs5Var = this.s;
                    y6a.M(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        xs5Var.getClass();
                        fdi fdiVar = xs5Var.e;
                        do {
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, new unb(new ms5(imVar, m6k.H(xs5Var.i(), imVar, str)))));
                    }
                    return Unit.a;
                }
                x2gVar = this.r;
                y6a.M(obj);
                if (!(x2gVar instanceof t2g)) {
                    Throwable th = ((t2g) x2gVar).a;
                    av4Var.e(null);
                    if (this.A && (th instanceof wi9) && ((wi9) th).a == 403) {
                        bli bliVar = xs5Var.n;
                        this.r = x2gVar;
                        this.s = xs5Var;
                        imVar = this.B;
                        this.t = imVar;
                        String str2 = this.C;
                        this.u = str2;
                        this.v = 3;
                        obj = bliVar.b(this);
                        if (obj != lu3Var) {
                            str = str2;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                        return lu3Var;
                    }
                } else if (!(x2gVar instanceof v2g)) {
                    zzl.b();
                    return null;
                }
                return Unit.a;
            }
            y6a.M(obj);
        }
        x2gVar = (x2g) obj;
        if (!(x2gVar instanceof t2g)) {
            if (!(x2gVar instanceof v2g)) {
                zzl.b();
                return null;
            }
            Object obj2 = ((v2g) x2gVar).a;
            h2h h2hVar = new h2h(getContext());
            h2hVar.g(av4Var.K(), new k50(this.y, obj2, xs5Var, (rq3) null));
            this.r = x2gVar;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = 2;
        }
        if (!(x2gVar instanceof t2g)) {
        }
        return Unit.a;
    }
}
