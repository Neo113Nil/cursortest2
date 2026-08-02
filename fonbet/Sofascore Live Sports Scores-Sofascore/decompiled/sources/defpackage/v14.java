package defpackage;

import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class v14 {
    public static CronetEngine a;
    public static t14 b;
    public static final mqi c = ypa.b(zg3.l);

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|(1:23))(3:24|13|14))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        defpackage.cjb.a("Error initializing Cronet - " + r8.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ia0 ia0Var, sq3 sq3Var) {
        s14 s14Var;
        int i;
        if (sq3Var instanceof s14) {
            s14Var = (s14) sq3Var;
            int i2 = s14Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s14Var.t = i2 - Integer.MIN_VALUE;
                Object obj = s14Var.s;
                lu3 lu3Var = lu3.a;
                i = s14Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    if (a != null) {
                        cjb.a("network engine has already been initialized");
                        return Unit.a;
                    }
                    Task a2 = CronetProviderInstaller.a(ia0Var);
                    a2.getClass();
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(2, be5.MINUTES);
                    s14Var.r = ia0Var;
                    s14Var.t = 1;
                    if (wba.U(n4o.R(R), new q3(a2, rq3Var, 16), s14Var) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ia0Var = s14Var.r;
                    y6a.M(obj);
                }
                CronetEngine build = new CronetEngine.Builder(ia0Var).enableHttp2(true).enableQuic(true).build();
                build.getClass();
                a = build;
                b = t14.b;
                cjb.b("Network engine initialized");
                return Unit.a;
            }
        }
        s14Var = new s14(sq3Var);
        Object obj2 = s14Var.s;
        lu3 lu3Var2 = lu3.a;
        i = s14Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        CronetEngine build2 = new CronetEngine.Builder(ia0Var).enableHttp2(true).enableQuic(true).build();
        build2.getClass();
        a = build2;
        b = t14.b;
        cjb.b("Network engine initialized");
        return Unit.a;
    }
}
