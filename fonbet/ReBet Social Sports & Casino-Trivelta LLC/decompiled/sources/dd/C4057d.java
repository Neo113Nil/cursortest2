package dd;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: dd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4057d {

    /* renamed from: a, reason: collision with root package name */
    public static final C4057d f45171a = new C4057d();

    public final boolean a(Context context) {
        PackageManager packageManager;
        return (context == null || (packageManager = context.getPackageManager()) == null || !packageManager.hasSystemFeature("android.software.leanback")) ? false : true;
    }
}
