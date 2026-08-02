package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gnh implements p78 {
    public final knh a;
    public final ol4 b;
    public final c80 c;
    public final yug d = bvg.c;

    public gnh(knh knhVar, ol4 ol4Var, c80 c80Var) {
        this.a = knhVar;
        this.b = ol4Var;
        this.c = c80Var;
    }

    @Override // defpackage.p78
    public Object a(oug ougVar, float f, rq3 rq3Var) {
        return c(ougVar, f, s9a.h, (sq3) rq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oug ougVar, float f, Function1 function1, sq3 sq3Var) {
        cnh cnhVar;
        int i;
        Function1 function12;
        if (sq3Var instanceof cnh) {
            cnhVar = (cnh) sq3Var;
            int i2 = cnhVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cnhVar.u = i2 - Integer.MIN_VALUE;
                Object obj = cnhVar.s;
                lu3 lu3Var = lu3.a;
                i = cnhVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    ip4 ip4Var = new ip4(this, f, function1, ougVar, null);
                    cnhVar.r = function1;
                    cnhVar.u = 1;
                    obj = xw3.R(this.d, ip4Var, cnhVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    function12 = function1;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = cnhVar.r;
                    y6a.M(obj);
                }
                z70 z70Var = (z70) obj;
                function12.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                return z70Var;
            }
        }
        cnhVar = new cnh(this, sq3Var);
        Object obj2 = cnhVar.s;
        lu3 lu3Var2 = lu3.a;
        i = cnhVar.u;
        if (i != 0) {
        }
        z70 z70Var2 = (z70) obj2;
        function12.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        return z70Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(oug ougVar, float f, Function1 function1, sq3 sq3Var) {
        enh enhVar;
        int i;
        float floatValue;
        if (sq3Var instanceof enh) {
            enhVar = (enh) sq3Var;
            int i2 = enhVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                enhVar.t = i2 - Integer.MIN_VALUE;
                Object obj = enhVar.r;
                Object obj2 = lu3.a;
                i = enhVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    enhVar.t = 1;
                    obj = b(ougVar, f, function1, enhVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                z70 z70Var = (z70) obj;
                floatValue = z70Var.a.floatValue();
                d80 d80Var = z70Var.b;
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = ((Number) d80Var.c()).floatValue();
                }
                return new Float(f2);
            }
        }
        enhVar = new enh(this, sq3Var);
        Object obj3 = enhVar.r;
        Object obj22 = lu3.a;
        i = enhVar.t;
        if (i != 0) {
        }
        z70 z70Var2 = (z70) obj3;
        floatValue = z70Var2.a.floatValue();
        d80 d80Var2 = z70Var2.b;
        float f22 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        return new Float(f22);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oug ougVar, float f, float f2, dnh dnhVar, sq3 sq3Var) {
        fnh fnhVar;
        int i;
        if (sq3Var instanceof fnh) {
            fnhVar = (fnh) sq3Var;
            int i2 = fnhVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fnhVar.t = i2 - Integer.MIN_VALUE;
                fnh fnhVar2 = fnhVar;
                Object obj = fnhVar2.r;
                lu3 lu3Var = lu3.a;
                i = fnhVar2.t;
                if (i != 0) {
                    y6a.M(obj);
                    if (Math.abs(f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f2) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return t62.a(28, f, f2);
                    }
                    fnhVar2.t = 1;
                    ol4 ol4Var = this.b;
                    obj = (Math.abs(tgj.t(ol4Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2)) >= Math.abs(f) ? new dad(ol4Var, 18) : new e3c(this.c, 15)).e(ougVar, new Float(f), new Float(f2), dnhVar, fnhVar2);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((z70) obj).b;
            }
        }
        fnhVar = new fnh(this, sq3Var);
        fnh fnhVar22 = fnhVar;
        Object obj2 = fnhVar22.r;
        lu3 lu3Var2 = lu3.a;
        i = fnhVar22.t;
        if (i != 0) {
        }
        return ((z70) obj2).b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gnh) {
            gnh gnhVar = (gnh) obj;
            if (Intrinsics.c(gnhVar.c, this.c) && Intrinsics.c(gnhVar.b, this.b) && Intrinsics.c(gnhVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
