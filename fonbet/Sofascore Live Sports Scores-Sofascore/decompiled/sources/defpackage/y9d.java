package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class y9d extends ot8 implements Function1 {
    public static final y9d b = new y9d(1, ok3.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && eq3.b(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new nk3(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return mk3.a;
    }
}
