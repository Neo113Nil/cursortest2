package com.google.android.gms.internal.measurement;

import Ra.k;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.plaid.internal.EnumC3631g;

/* loaded from: classes2.dex */
public final class zzka {
    static volatile k zza = k.a();
    private static final Object zzb = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (zza.c()) {
            return ((Boolean) zza.b()).booleanValue();
        }
        synchronized (zzb) {
            try {
                if (zza.c()) {
                    return ((Boolean) zza.b()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider != null) {
                    }
                    zza = k.d(Boolean.valueOf(z10));
                    return ((Boolean) zza.b()).booleanValue();
                }
                if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 0) {
                    z10 = true;
                }
                zza = k.d(Boolean.valueOf(z10));
                return ((Boolean) zza.b()).booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
