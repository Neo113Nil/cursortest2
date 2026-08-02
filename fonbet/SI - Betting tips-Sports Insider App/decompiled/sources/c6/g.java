package c6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.android.core.w0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3662b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3663c = false;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3665e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f3661a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f3664d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f3663c) {
                try {
                    PackageInfo b10 = s6.c.a(context).b(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    h.a(context);
                    if (b10 == null || h.c(b10, false) || !h.c(b10, true)) {
                        f3662b = false;
                    } else {
                        f3662b = true;
                    }
                    f3663c = true;
                } catch (PackageManager.NameNotFoundException e7) {
                    w0.n("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                    f3663c = true;
                }
            }
            return f3662b || !"user".equals(Build.TYPE);
        } catch (Throwable th2) {
            f3663c = true;
            throw th2;
        }
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", Segment.SIZE).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
