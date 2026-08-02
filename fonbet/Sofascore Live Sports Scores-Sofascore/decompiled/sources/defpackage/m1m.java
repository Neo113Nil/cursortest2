package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import java.net.URL;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class m1m {
    public static String a(String str) {
        try {
            URL url = new URL(str);
            return url.getProtocol() + "://" + url.getHost() + '/';
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
    }
}
