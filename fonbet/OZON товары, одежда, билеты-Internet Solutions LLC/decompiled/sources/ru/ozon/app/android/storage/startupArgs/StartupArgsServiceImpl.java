package ru.ozon.app.android.storage.startupArgs;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storage/startupArgs/StartupArgsServiceImpl;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "getArgValue", "", "argName", "", "setArgValue", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartupArgsServiceImpl implements StartupArgsService {
    private final SharedPreferences sharedPreferences;

    public StartupArgsServiceImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.sharedPreferences = context.getSharedPreferences("StartupArgsServiceSharedPreferences", 0);
    }

    @Override // ru.ozon.app.android.storage.startupArgs.StartupArgsService
    public boolean getArgValue(@NotNull String argName) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        return this.sharedPreferences.getBoolean(argName, false);
    }

    @Override // ru.ozon.app.android.storage.startupArgs.StartupArgsService
    public void setArgValue(@NotNull String argName, boolean value) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (value) {
            edit.putBoolean(argName, true);
        } else {
            edit.remove(argName);
        }
        edit.apply();
    }
}
