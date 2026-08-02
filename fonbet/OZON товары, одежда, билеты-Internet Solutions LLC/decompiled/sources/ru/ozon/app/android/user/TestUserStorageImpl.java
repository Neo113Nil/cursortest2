package ru.ozon.app.android.user;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentConfig;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.storage.user.test.TestUserStorage;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/user/TestUserStorageImpl;", "Lru/ozon/app/android/storage/user/test/TestUserStorage;", "userStatusStorage", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "androidPlatformComponentConfig", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;", "<init>", "(Lru/ozon/app/android/storage/user/UserStatusStorage;Lru/ozon/app/android/platform/di/AndroidPlatformComponentConfig;)V", "isTestUser", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TestUserStorageImpl implements TestUserStorage {

    @NotNull
    private final AndroidPlatformComponentConfig androidPlatformComponentConfig;

    @NotNull
    private final UserStatusStorage userStatusStorage;

    public TestUserStorageImpl(@NotNull UserStatusStorage userStatusStorage, @NotNull AndroidPlatformComponentConfig androidPlatformComponentConfig) {
        Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
        Intrinsics.checkNotNullParameter(androidPlatformComponentConfig, "androidPlatformComponentConfig");
        this.userStatusStorage = userStatusStorage;
        this.androidPlatformComponentConfig = androidPlatformComponentConfig;
    }

    @Override // ru.ozon.app.android.storage.user.test.TestUserStorage
    public boolean isTestUser() {
        return this.androidPlatformComponentConfig.getIsDebug() || this.userStatusStorage.isOzonQa() || this.userStatusStorage.isAutoTestUser();
    }
}
