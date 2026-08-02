package o6;

import T5.f;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o6.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8650b {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f77774a = new ConcurrentHashMap();

    @NonNull
    public static f a(@NonNull Context context) {
        PackageInfo packageInfo;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap = f77774a;
        f fVar = (f) concurrentHashMap.get(packageName);
        if (fVar != null) {
            return fVar;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e11);
            packageInfo = null;
        }
        d dVar = new d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
        f fVar2 = (f) concurrentHashMap.putIfAbsent(packageName, dVar);
        return fVar2 == null ? dVar : fVar2;
    }
}
