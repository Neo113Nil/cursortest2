package defpackage;

import android.os.Build;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yxf implements mah {
    public static final int g;
    public static final Regex h;
    public final vhj a;
    public final l48 b;
    public final kf0 c;
    public final zxf d;
    public final gah e;
    public final j2d f;

    static {
        wd5 wd5Var = xd5.b;
        g = (int) xd5.k(wkn.R(24, be5.HOURS), be5.SECONDS);
        h = new Regex("com/google/firebase/sessions//");
    }

    public yxf(vhj vhjVar, l48 l48Var, kf0 kf0Var, zxf zxfVar, gah gahVar) {
        vhjVar.getClass();
        l48Var.getClass();
        kf0Var.getClass();
        zxfVar.getClass();
        gahVar.getClass();
        this.a = vhjVar;
        this.b = l48Var;
        this.c = kf0Var;
        this.d = zxfVar;
        this.e = gahVar;
        this.f = new j2d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0071, code lost:
    
        if (r1.e(r3) == r4) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #1 {all -> 0x004a, blocks: (B:26:0x0046, B:27:0x009a, B:29:0x00a4, B:32:0x00aa, B:38:0x012d), top: B:25:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #1 {all -> 0x004a, blocks: (B:26:0x0046, B:27:0x009a, B:29:0x00a4, B:32:0x00aa, B:38:0x012d), top: B:25:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:43:0x0075, B:45:0x007b, B:48:0x0085), top: B:42:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085 A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:43:0x0075, B:45:0x007b, B:48:0x0085), top: B:42:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r5v9, types: [h2d] */
    @Override // defpackage.mah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        xxf xxfVar;
        int i;
        gah gahVar;
        j2d j2dVar;
        h2d h2dVar;
        h2d h2dVar2;
        String str;
        try {
            if (rq3Var instanceof xxf) {
                xxfVar = (xxf) rq3Var;
                int i2 = xxfVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xxfVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = xxfVar.s;
                    lu3 lu3Var = lu3.a;
                    i = xxfVar.u;
                    gahVar = this.e;
                    int i3 = 2;
                    rq3 rq3Var2 = null;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = this.f;
                        if (!j2dVar.d() && !gahVar.b()) {
                            return Unit.a;
                        }
                        xxfVar.r = j2dVar;
                        xxfVar.u = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                h2dVar = xxfVar.r;
                                try {
                                    y6a.M(obj);
                                    Unit unit = Unit.a;
                                    h2dVar.f(null);
                                    return Unit.a;
                                } catch (Throwable th) {
                                    th = th;
                                    h2dVar.f(null);
                                    throw th;
                                }
                            }
                            h2dVar2 = xxfVar.r;
                            try {
                                y6a.M(obj);
                                str = ((n5a) obj).a;
                                if (!str.equals("")) {
                                    Unit unit2 = Unit.a;
                                    h2dVar2.f(null);
                                    return unit2;
                                }
                                Pair pair = new Pair("X-Crashlytics-Installation-ID", str);
                                String str2 = Build.MANUFACTURER + Build.MODEL;
                                Regex regex = h;
                                Pair pair2 = new Pair("X-Crashlytics-Device-Model", regex.replace(str2, ""));
                                String str3 = Build.VERSION.INCREMENTAL;
                                str3.getClass();
                                Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", regex.replace(str3, ""));
                                String str4 = Build.VERSION.RELEASE;
                                str4.getClass();
                                Pair pair4 = new Pair("X-Crashlytics-OS-Display-Version", regex.replace(str4, ""));
                                this.c.getClass();
                                Map h2 = tub.h(pair, pair2, pair3, pair4, new Pair("X-Crashlytics-API-Client-Version", "3.0.7"));
                                zxf zxfVar = this.d;
                                gje gjeVar = new gje(this, rq3Var2, 17);
                                d11 d11Var = new d11(i3, rq3Var2, 15);
                                xxfVar.r = h2dVar2;
                                xxfVar.u = 3;
                                Object R = xw3.R(zxfVar.b, new cce(zxfVar, h2, gjeVar, d11Var, null, 7), xxfVar);
                                if (R != lu3Var) {
                                    R = Unit.a;
                                }
                                if (R != lu3Var) {
                                    h2dVar = h2dVar2;
                                    Unit unit3 = Unit.a;
                                    h2dVar.f(null);
                                    return Unit.a;
                                }
                                return lu3Var;
                            } catch (Throwable th2) {
                                th = th2;
                                h2dVar = h2dVar2;
                                h2dVar.f(null);
                                throw th;
                            }
                        }
                        ?? r5 = xxfVar.r;
                        y6a.M(obj);
                        j2dVar = r5;
                    }
                    if (gahVar.b()) {
                        Unit unit4 = Unit.a;
                        j2dVar.f(null);
                        return unit4;
                    }
                    inb inbVar = n5a.c;
                    l48 l48Var = this.b;
                    xxfVar.r = j2dVar;
                    xxfVar.u = 2;
                    Object q = inbVar.q(l48Var, xxfVar);
                    if (q != lu3Var) {
                        h2dVar2 = j2dVar;
                        obj = q;
                        str = ((n5a) obj).a;
                        if (!str.equals("")) {
                        }
                    }
                    return lu3Var;
                }
            }
            if (gahVar.b()) {
            }
        } catch (Throwable th3) {
            th = th3;
            h2dVar = j2dVar;
            h2dVar.f(null);
            throw th;
        }
        xxfVar = new xxf(this, (sq3) rq3Var);
        Object obj2 = xxfVar.s;
        lu3 lu3Var2 = lu3.a;
        i = xxfVar.u;
        gahVar = this.e;
        int i32 = 2;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
    }

    @Override // defpackage.mah
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override // defpackage.mah
    public final xd5 c() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        wd5 wd5Var = xd5.b;
        return new xd5(wkn.R(num.intValue(), be5.SECONDS));
    }

    @Override // defpackage.mah
    public final Double d() {
        return this.e.a().b;
    }
}
