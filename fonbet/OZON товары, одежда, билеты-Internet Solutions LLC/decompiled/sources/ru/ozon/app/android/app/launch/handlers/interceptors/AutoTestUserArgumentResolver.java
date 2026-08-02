package ru.ozon.app.android.app.launch.handlers.interceptors;

import Kd0.a;
import Kd0.j;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.uni.android.ds.UniGlobalConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/interceptors/AutoTestUserArgumentResolver;", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentResolver;", "userStatusStorage", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "<init>", "(Lru/ozon/app/android/storage/user/UserStatusStorage;)V", "resolveIntent", "", "intent", "Landroid/content/Intent;", "canResolve", "", "Companion", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutoTestUserArgumentResolver implements AppLaunchArgumentResolver {

    @NotNull
    private final UserStatusStorage userStatusStorage;

    public AutoTestUserArgumentResolver(@NotNull UserStatusStorage userStatusStorage) {
        Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
        this.userStatusStorage = userStatusStorage;
    }

    @Override // ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver
    public boolean canResolve(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return intent.hasExtra("TEST_USER");
    }

    @Override // ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver
    public void resolveIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        int i11 = a.f15938b;
        a.b(j.a(intent));
        String stringExtra = intent.getStringExtra("TEST_USER");
        if (stringExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.userStatusStorage.setAutoTestUser(stringExtra.equals("ENABLED"));
        BxAtomConfig.INSTANCE.getGeneratorIdFactory().setAutoTestUser(this.userStatusStorage.getIsAutoTestUser());
        UniGlobalConfig uniGlobalConfig = UniGlobalConfig.INSTANCE;
        uniGlobalConfig.setTestTagsAsContentDescription(this.userStatusStorage.getIsAutoTestUser());
        uniGlobalConfig.setEnableTestTags(this.userStatusStorage.getIsAutoTestUser());
        uniGlobalConfig.setTestTagsAsResourceId(this.userStatusStorage.getIsAutoTestUser());
    }
}
