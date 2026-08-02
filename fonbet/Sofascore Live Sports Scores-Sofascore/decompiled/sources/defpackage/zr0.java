package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zr0 implements sjd {
    public static final zr0 a = new zr0();
    public static final nz7 b = nz7.a("appId");
    public static final nz7 c = nz7.a("deviceModel");
    public static final nz7 d = nz7.a("sessionSdkVersion");
    public static final nz7 e = nz7.a("osVersion");
    public static final nz7 f = nz7.a("logEnvironment");
    public static final nz7 g = nz7.a("androidAppInfo");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        kf0 kf0Var = (kf0) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.a(b, kf0Var.a);
        tjdVar.a(c, Build.MODEL);
        tjdVar.a(d, "3.0.7");
        tjdVar.a(e, Build.VERSION.RELEASE);
        tjdVar.a(f, oib.LOG_ENVIRONMENT_PROD);
        tjdVar.a(g, kf0Var.b);
    }
}
