package defpackage;

import android.app.Application;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class oie {
    public static Application a;
    public static final AdvertisingIdClient.Info b = new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);

    public static final Application a() {
        Application application = a;
        if (application != null) {
            return application;
        }
        Intrinsics.i("application");
        throw null;
    }
}
