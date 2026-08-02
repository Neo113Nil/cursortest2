package bc;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {
    public static AppsFlyerLib a() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        Intrinsics.checkNotNullExpressionValue(appsFlyerLib, "getInstance(...)");
        return appsFlyerLib;
    }
}
