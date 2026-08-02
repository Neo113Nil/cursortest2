package f30;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements Jb.e<AppsFlyerLib> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final e f62513a = new e();
    }

    @Override // Pc.a
    public final Object get() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        Intrinsics.checkNotNullExpressionValue(appsFlyerLib, "getInstance(...)");
        Jb.j.d(appsFlyerLib);
        return appsFlyerLib;
    }
}
