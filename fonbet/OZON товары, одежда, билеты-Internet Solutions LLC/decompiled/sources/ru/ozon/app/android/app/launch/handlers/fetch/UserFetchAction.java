package ru.ozon.app.android.app.launch.handlers.fetch;

import Kr.e;
import Lm0.a;
import Nl.b;
import android.annotation.SuppressLint;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import uc.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/fetch/UserFetchAction;", "", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "<init>", "(Lru/ozon/app/android/account/user/UserManager;)V", "", "fetch", "()V", "Lru/ozon/app/android/account/user/UserManager;", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserFetchAction {

    @NotNull
    private final UserManager userManager;

    public UserFetchAction(@NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.userManager = userManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetch$lambda$0() {
    }

    @SuppressLint({"CheckResult"})
    public void fetch() {
        AbstractC7094b fetchUser = this.userManager.fetchUser();
        b bVar = new b();
        e eVar = new e(new UserFetchAction$fetch$2(a.f17149a), 1);
        fetchUser.getClass();
        fetchUser.a(new i(eVar, bVar));
    }
}
