package defpackage;

import com.sofascore.results.onboarding.OnboardingViewModel;
import java.io.Serializable;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o63 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o63(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0171 -> B:50:0x0178). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x018d -> B:53:0x0186). Please report as a decompilation issue!!! */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        z98 z98Var;
        int i;
        long j;
        int i2;
        b98 b98Var2;
        int i3;
        z98 z98Var2;
        int i4;
        long j2;
        Throwable th;
        Serializable B;
        b98 b98Var3 = b98Var;
        int i5 = this.a;
        int i6 = 2;
        int i7 = 3;
        int i8 = 25;
        int i9 = 4;
        int i10 = 0;
        int i11 = 1;
        rq3 rq3Var2 = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i5) {
            case 0:
                Object collect = ((hof) obj2).a.collect(new nk0(i7, b98Var3, (p63) obj), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            case 1:
                ((aeh) obj2).collect(new vj0(b98Var3, (w24) obj), rq3Var);
                return lu3.a;
            case 2:
                ((aeh) obj2).collect(new nk0(5, b98Var3, (q54) obj), rq3Var);
                return lu3.a;
            case 3:
                z88[] z88VarArr = (z88[]) obj2;
                Object v = un0.v(rq3Var, b98Var3, new tl(rq3Var2, (od7) obj, 7), new wzj(z88VarArr, 25), z88VarArr);
                return v == lu3.a ? v : Unit.a;
            case 4:
                Object collect2 = ((yf4) obj2).collect(new nk0(9, b98Var3, (String) obj), rq3Var);
                return collect2 == lu3.a ? collect2 : Unit.a;
            case 5:
                if (rq3Var instanceof z98) {
                    z98Var = (z98) rq3Var;
                    int i12 = z98Var.s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        z98Var.s = i12 - Integer.MIN_VALUE;
                        Object obj3 = z98Var.r;
                        lu3 lu3Var = lu3.a;
                        i = z98Var.s;
                        if (i != 0) {
                            y6a.M(obj3);
                            j = 0;
                            i2 = 0;
                            z98Var.u = b98Var3;
                            z98Var.v = null;
                            z98Var.w = i2;
                            z98Var.y = j;
                            z98Var.x = 0;
                            z98Var.s = 1;
                            B = lz.B((nb8) obj2, b98Var3, z98Var);
                            if (B != lu3Var) {
                            }
                            return lu3Var;
                        }
                        if (i == 1) {
                            int i13 = z98Var.x;
                            long j3 = z98Var.y;
                            int i14 = z98Var.w;
                            b98Var2 = z98Var.u;
                            y6a.M(obj3);
                            z98 z98Var3 = z98Var;
                            i4 = i13;
                            i3 = i14;
                            z98Var2 = z98Var3;
                            j2 = j3;
                            th = (Throwable) obj3;
                            if (th == null) {
                            }
                        } else {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j2 = z98Var.y;
                            int i15 = z98Var.w;
                            Throwable th2 = z98Var.v;
                            b98Var2 = z98Var.u;
                            y6a.M(obj3);
                            if (!((Boolean) obj3).booleanValue()) {
                                j2++;
                                i2 = i15;
                                z98Var2 = z98Var;
                                i4 = 1;
                                long j4 = j2;
                                b98Var3 = b98Var2;
                                if (i4 != 0) {
                                    return Unit.a;
                                }
                                z98Var = z98Var2;
                                j = j4;
                                z98Var.u = b98Var3;
                                z98Var.v = null;
                                z98Var.w = i2;
                                z98Var.y = j;
                                z98Var.x = 0;
                                z98Var.s = 1;
                                B = lz.B((nb8) obj2, b98Var3, z98Var);
                                if (B != lu3Var) {
                                    b98Var2 = b98Var3;
                                    long j5 = j;
                                    i3 = i2;
                                    obj3 = B;
                                    z98Var2 = z98Var;
                                    j2 = j5;
                                    i4 = 0;
                                    th = (Throwable) obj3;
                                    if (th == null) {
                                        Long l = new Long(j2);
                                        z98Var2.u = b98Var2;
                                        z98Var2.v = th;
                                        z98Var2.w = i3;
                                        z98Var2.y = j2;
                                        z98Var2.x = i4;
                                        z98Var2.s = 2;
                                        Object invoke = ((bak) obj).invoke(b98Var2, th, l, z98Var2);
                                        if (invoke != lu3Var) {
                                            int i16 = i3;
                                            th2 = th;
                                            obj3 = invoke;
                                            z98Var = z98Var2;
                                            i15 = i16;
                                            if (!((Boolean) obj3).booleanValue()) {
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        i2 = i3;
                                        long j42 = j2;
                                        b98Var3 = b98Var2;
                                        if (i4 != 0) {
                                        }
                                    }
                                }
                                return lu3Var;
                            }
                        }
                    }
                }
                z98Var = new z98(this, rq3Var);
                Object obj32 = z98Var.r;
                lu3 lu3Var2 = lu3.a;
                i = z98Var.s;
                if (i != 0) {
                }
            case 6:
                Object v2 = un0.v(rq3Var, b98Var3, new c37(rq3Var2, (et8) obj, i6), o67.m, (z88[]) obj2);
                return v2 == lu3.a ? v2 : Unit.a;
            case 7:
                Object v3 = un0.v(rq3Var, b98Var3, new c37(rq3Var2, (mr7) obj, i7), o67.m, (z88[]) obj2);
                return v3 == lu3.a ? v3 : Unit.a;
            case 8:
                Object v4 = un0.v(rq3Var, b98Var3, new c37(rq3Var2, (gt8) obj, i9), o67.m, (z88[]) obj2);
                return v4 == lu3.a ? v4 : Unit.a;
            case 9:
                Object collect3 = ((z88) obj2).collect(new nk0(21, b98Var3, (String[]) obj), rq3Var);
                return collect3 == lu3.a ? collect3 : Unit.a;
            case 10:
                Object collect4 = ((th2) obj2).collect(new nk0(22, b98Var3, (fgf) obj), rq3Var);
                return collect4 == lu3.a ? collect4 : Unit.a;
            case 11:
                Object collect5 = ((zn2) obj2).collect(new nk0(i8, b98Var3, (OnboardingViewModel) obj), rq3Var);
                return collect5 == lu3.a ? collect5 : Unit.a;
            case 12:
                Object collect6 = ((z88) obj2).collect(new usf(i9, b98Var3, (t4h) obj), rq3Var);
                return collect6 == lu3.a ? collect6 : Unit.a;
            case 13:
                Object collect7 = ((nb8) obj2).collect(new e4k(b98Var3, (g4k) obj, i10), rq3Var);
                return collect7 == lu3.a ? collect7 : Unit.a;
            default:
                Object collect8 = ((o63) obj2).collect(new e4k(b98Var3, (g4k) obj, i11), rq3Var);
                return collect8 == lu3.a ? collect8 : Unit.a;
        }
    }
}
