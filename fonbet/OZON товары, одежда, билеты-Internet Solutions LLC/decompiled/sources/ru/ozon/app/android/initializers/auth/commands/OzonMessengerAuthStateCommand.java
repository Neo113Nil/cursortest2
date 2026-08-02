package ru.ozon.app.android.initializers.auth.commands;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.e;
import ru.ozon.app.android.account.user.UserManager;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/OzonMessengerAuthStateCommand;", "Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "userManager", "Lru/ozon/app/android/account/user/UserManager;", "<init>", "(Lru/ozon/app/android/account/user/UserManager;)V", "lastUserId", "", "Ljava/lang/Long;", "onChange", "", "isAuth", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonMessengerAuthStateCommand extends AuthStateCommand {
    private Long lastUserId;

    @NotNull
    private final UserManager userManager;

    public OzonMessengerAuthStateCommand(@NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
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
        int i11 = e.f87343e;
        e.d();
    }
}
