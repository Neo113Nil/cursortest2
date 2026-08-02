package ru.ozon.app.android.storage.di.module;

import N4.a;
import N4.c;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.utils.SharedPrefsExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storage/di/module/SharedPreferencesProvider;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "createEncryptedSharedPreferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "getEncryptedSharedPreferences", "getSharedPreferences$storage_prodGoogleAllVendorsRelease", "getSharedPreferences", "encryptedPreferences", "Landroid/content/SharedPreferences;", "sharedPreferences", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SharedPreferencesProvider {

    @NotNull
    public static final SharedPreferencesProvider INSTANCE = new SharedPreferencesProvider();
    private static SharedPreferences encryptedPreferences;
    private static SharedPreferences sharedPreferences;

    private SharedPreferencesProvider() {
    }

    private final SharedPreferences createEncryptedSharedPreferences(Context context) {
        try {
            String a11 = c.a(c.f18682a);
            Intrinsics.checkNotNullExpressionValue(a11, "getOrCreate(...)");
            a b11 = a.b("OZON_PREFS_ENCRYPTED", a11, context, a.c.AES256_SIV, a.d.AES256_GCM);
            SharedPrefsExtKt.migrateSharedPrefsIfRequired(context, b11, "OZON_PREFS", C7714v.a0("UNIQUE_APPLICATION_ID"));
            return b11;
        } catch (Exception unused) {
            return getSharedPreferences$storage_prodGoogleAllVendorsRelease(context);
        }
    }

    @NotNull
    public final SharedPreferences getEncryptedSharedPreferences(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences2 = encryptedPreferences;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        SharedPreferences createEncryptedSharedPreferences = createEncryptedSharedPreferences(context);
        encryptedPreferences = createEncryptedSharedPreferences;
        return createEncryptedSharedPreferences;
    }

    @NotNull
    public final SharedPreferences getSharedPreferences$storage_prodGoogleAllVendorsRelease(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        SharedPreferences sharedPreferences3 = context.getSharedPreferences("OZON_PREFS", 0);
        sharedPreferences = sharedPreferences3;
        Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "also(...)");
        return sharedPreferences3;
    }
}
