package defpackage;

import android.os.Build;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yr0 implements sjd {
    public static final yr0 a = new yr0();
    public static final nz7 b = nz7.a(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    public static final nz7 c = nz7.a("versionName");
    public static final nz7 d = nz7.a("appBuildVersion");
    public static final nz7 e = nz7.a("deviceManufacturer");
    public static final nz7 f = nz7.a("currentProcessDetails");
    public static final nz7 g = nz7.a("appProcessDetails");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        px pxVar = (px) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.a(b, pxVar.a);
        tjdVar.a(c, pxVar.b);
        tjdVar.a(d, pxVar.c);
        tjdVar.a(e, Build.MANUFACTURER);
        tjdVar.a(f, pxVar.d);
        tjdVar.a(g, pxVar.e);
    }
}
