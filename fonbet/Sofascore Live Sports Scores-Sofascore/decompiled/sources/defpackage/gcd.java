package defpackage;

import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gcd {
    public static final String a = oc3.b;
    public static final int b;
    public static String[] c;

    static {
        ArrayList arrayList = ovk.a;
        iie iieVar = iie.a;
        b = 25;
        c = new String[]{MimeTypes.VIDEO_MP4};
        Application application = oie.a;
    }

    public static void a(ia0 ia0Var) {
        rm5.a.getClass();
        Application application = oie.a;
        ad2 ad2Var = oc3.a;
        ad2Var.getClass();
        Context applicationContext = ia0Var.getApplicationContext();
        applicationContext.getClass();
        oie.a = (Application) applicationContext;
        iie.c = "b6e17a47-e5d3-4854-be9c-7bff41132800";
        iie.d = "sofaitdoo-sofascore";
        oie.a().registerActivityLifecycleCallbacks(iie.a);
        rq3 rq3Var = null;
        xw3.L(ad2Var, null, null, new u41(2, rq3Var, 10), 3);
        hs4 hs4Var = z45.a;
        hq4 hq4Var = hq4.c;
        xw3.L(ad2Var, hq4Var, null, new ga0(ia0Var, rq3Var, 4), 2);
        xw3.L(ad2Var, hq4Var, null, new nie(2, null), 2);
    }
}
