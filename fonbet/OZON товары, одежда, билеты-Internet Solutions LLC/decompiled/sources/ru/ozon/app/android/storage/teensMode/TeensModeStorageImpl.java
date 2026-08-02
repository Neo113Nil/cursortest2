package ru.ozon.app.android.storage.teensMode;

import C.C2702w;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storage/teensMode/TeensModeStorageImpl;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModePrefs", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "saveTeensMode", "", "isEnabled", "", "isTeensModeEnabled", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TeensModeStorageImpl implements TeensModeStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SharedPreferences teensModePrefs;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storage/teensMode/TeensModeStorageImpl$Companion;", "", "<init>", "()V", "TEENS_MODE_VALUE_KEY", "", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TeensModeStorageImpl(@NotNull SharedPreferences teensModePrefs) {
        Intrinsics.checkNotNullParameter(teensModePrefs, "teensModePrefs");
        this.teensModePrefs = teensModePrefs;
    }

    @Override // ru.ozon.app.android.storage.teensMode.TeensModeStorage
    public boolean isTeensModeEnabled() {
        return this.teensModePrefs.getBoolean("teens_mode_value", false);
    }

    @Override // ru.ozon.app.android.storage.teensMode.TeensModeStorage
    public void saveTeensMode(boolean isEnabled) {
        C2702w.e(this.teensModePrefs, "teens_mode_value", isEnabled);
    }
}
