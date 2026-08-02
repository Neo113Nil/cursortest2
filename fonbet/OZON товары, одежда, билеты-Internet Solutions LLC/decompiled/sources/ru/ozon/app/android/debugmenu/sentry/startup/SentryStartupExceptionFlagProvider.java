package ru.ozon.app.android.debugmenu.sentry.startup;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/debugmenu/sentry/startup/SentryStartupExceptionFlagProvider;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "", "state", "", "setupStartupExceptionState", "(Landroid/content/SharedPreferences;Z)V", "Landroid/content/Context;", "context", "getSharedPreferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "setupStartupExceptionEnabled", "(Landroid/content/Context;)V", "checkStartupExceptionState", "(Landroid/content/Context;)Z", "sharedPreferences", "Landroid/content/SharedPreferences;", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SentryStartupExceptionFlagProvider {

    @NotNull
    public static final SentryStartupExceptionFlagProvider INSTANCE = new SentryStartupExceptionFlagProvider();
    private static SharedPreferences sharedPreferences;

    private SentryStartupExceptionFlagProvider() {
    }

    private final SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        SharedPreferences sharedPreferences3 = context.getSharedPreferences("OZON_PREFS.QA", 0);
        sharedPreferences = sharedPreferences3;
        Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "also(...)");
        return sharedPreferences3;
    }

    @SuppressLint({"ApplySharedPref"})
    private final void setupStartupExceptionState(SharedPreferences sharedPreferences2, boolean z11) {
        sharedPreferences2.edit().putBoolean("startup.exception", z11).commit();
    }

    public final boolean checkStartupExceptionState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        SharedPreferences sharedPreferences2 = getSharedPreferences(applicationContext);
        boolean z11 = sharedPreferences2.getBoolean("startup.exception", false);
        if (z11) {
            setupStartupExceptionState(sharedPreferences2, false);
        }
        return z11;
    }

    public final void setupStartupExceptionEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        setupStartupExceptionState(getSharedPreferences(applicationContext), true);
    }
}
