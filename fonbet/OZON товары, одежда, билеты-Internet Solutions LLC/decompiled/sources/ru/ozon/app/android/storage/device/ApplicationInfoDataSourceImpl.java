package ru.ozon.app.android.storage.device;

import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storage/device/ApplicationInfoDataSourceImpl;", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "getUniqueApplicationId", "", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApplicationInfoDataSourceImpl implements ApplicationInfoDataSource {

    @NotNull
    private final SharedPreferences sharedPreferences;

    public ApplicationInfoDataSourceImpl(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.ozon.app.android.storage.device.ApplicationInfoDataSource
    @NotNull
    public String getUniqueApplicationId() {
        String string = this.sharedPreferences.getString("UNIQUE_APPLICATION_ID", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.sharedPreferences.edit().putString("UNIQUE_APPLICATION_ID", uuid).apply();
        return uuid;
    }
}
