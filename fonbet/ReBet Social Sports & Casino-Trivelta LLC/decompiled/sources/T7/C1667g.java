package T7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import g6.C4331C;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: T7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1667g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1667g f11132a = new C1667g();

    @NotNull
    private static final String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    public static final String a() {
        if (Y7.a.d(C1667g.class)) {
            return null;
        }
        try {
            Context l10 = C4331C.l();
            List<ResolveInfo> queryIntentServices = l10.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            HashSet hashSet = ArraysKt.toHashSet(CHROME_PACKAGES);
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, C1667g.class);
            return null;
        }
    }

    public static final String b() {
        if (Y7.a.d(C1667g.class)) {
            return null;
        }
        try {
            return Intrinsics.stringPlus("fbconnect://cct.", C4331C.l().getPackageName());
        } catch (Throwable th2) {
            Y7.a.b(th2, C1667g.class);
            return null;
        }
    }

    public static final String c(String developerDefinedRedirectURI) {
        if (Y7.a.d(C1667g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            Z z10 = Z.f11052a;
            return Z.e(C4331C.l(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : Z.e(C4331C.l(), b()) ? b() : "";
        } catch (Throwable th2) {
            Y7.a.b(th2, C1667g.class);
            return null;
        }
    }
}
