package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z7h {
    public static final z7h a = new z7h();
    public static final d4a b;

    static {
        lfa lfaVar = new lfa();
        lfaVar.a(y7h.class, cs0.a);
        lfaVar.a(e8h.class, ds0.a);
        lfaVar.a(vd4.class, as0.a);
        lfaVar.a(kf0.class, zr0.a);
        lfaVar.a(px.class, yr0.a);
        lfaVar.a(y7f.class, bs0.a);
        lfaVar.d = true;
        b = new d4a(lfaVar, 2);
    }

    public static kf0 a(r38 r38Var) {
        r38Var.a();
        Context context = r38Var.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        r38Var.a();
        String str = r38Var.c.b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        oib oibVar = oib.LOG_ENVIRONMENT_PROD;
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = valueOf;
        }
        Build.MANUFACTURER.getClass();
        r38Var.a();
        y7f i = z9.i(context);
        r38Var.a();
        return new kf0(str, new px(packageName, str2, valueOf, i, z9.e(context)));
    }
}
