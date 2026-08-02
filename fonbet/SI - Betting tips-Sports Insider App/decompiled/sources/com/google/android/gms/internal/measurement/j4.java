package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile e8.b f5096a = e8.a.f8772a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5097b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z5 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            io.sentry.android.core.w0.d("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (f5096a.b()) {
            return ((Boolean) f5096a.a()).booleanValue();
        }
        synchronized (f5097b) {
            try {
                if (f5096a.b()) {
                    return ((Boolean) f5096a.a()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                    }
                    f5096a = new e8.c(Boolean.valueOf(z5));
                    return ((Boolean) f5096a.a()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                    z5 = true;
                }
                f5096a = new e8.c(Boolean.valueOf(z5));
                return ((Boolean) f5096a.a()).booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
