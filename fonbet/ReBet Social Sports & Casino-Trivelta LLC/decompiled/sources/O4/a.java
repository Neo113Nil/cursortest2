package O4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.g;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap f8331a = new ConcurrentHashMap();

    public static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    public static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    public static g c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap concurrentMap = f8331a;
        g gVar = (g) concurrentMap.get(packageName);
        if (gVar != null) {
            return gVar;
        }
        g d10 = d(context);
        g gVar2 = (g) concurrentMap.putIfAbsent(packageName, d10);
        return gVar2 == null ? d10 : gVar2;
    }

    public static g d(Context context) {
        return new c(b(a(context)));
    }
}
