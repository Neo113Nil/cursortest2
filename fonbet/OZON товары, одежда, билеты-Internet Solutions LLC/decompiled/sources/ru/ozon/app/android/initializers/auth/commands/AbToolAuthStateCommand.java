package ru.ozon.app.android.initializers.auth.commands;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/AbToolAuthStateCommand;", "Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "userManager", "Lru/ozon/app/android/account/user/UserManager;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/account/user/UserManager;)V", "lastUserId", "", "Ljava/lang/Long;", "onChange", "", "isAuth", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbToolAuthStateCommand extends AuthStateCommand {

    @NotNull
    private final FeatureService featureService;
    private Long lastUserId;

    @NotNull
    private final UserManager userManager;

    public AbToolAuthStateCommand(@NotNull FeatureService featureService, @NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.featureService = featureService;
        this.userManager = userManager;
    }

    @Override // ru.ozon.app.android.initializers.auth.commands.AuthStateCommand
    public void onChange(boolean isAuth) {
        long userId = this.userManager.getUserId();
        Long l11 = this.lastUserId;
        if (l11 != null && userId == l11.longValue()) {
            return;
        }
        this.lastUserId = Long.valueOf(userId);
        this.featureService.fetch();
    }
}
