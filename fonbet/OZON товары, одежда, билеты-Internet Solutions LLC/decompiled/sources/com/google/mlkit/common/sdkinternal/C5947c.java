package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Locale;

@KeepForSdk
/* renamed from: com.google.mlkit.common.sdkinternal.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5947c {

    /* renamed from: a, reason: collision with root package name */
    private static final GmsLogger f60029a = new GmsLogger("CommonUtils", "");

    @NonNull
    @KeepForSdk
    public static String a(@NonNull Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e11) {
            f60029a.e("CommonUtils", "Exception thrown when trying to get app version ".concat(e11.toString()));
            return "";
        }
    }

    @NonNull
    @KeepForSdk
    public static String b(@NonNull Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
