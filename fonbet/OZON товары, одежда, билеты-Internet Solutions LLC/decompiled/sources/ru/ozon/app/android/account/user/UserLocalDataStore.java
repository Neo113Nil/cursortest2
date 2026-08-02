package ru.ozon.app.android.account.user;

import Nc.C3667a;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00050\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\b\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011*\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/user/UserLocalDataStore;", "", "<init>", "()V", "Lio/reactivex/p;", "Lru/ozon/app/android/storage/user/model/User;", "observeUser", "()Lio/reactivex/p;", "user", "", "saveUser", "(Lru/ozon/app/android/storage/user/model/User;)V", "LNc/a;", "kotlin.jvm.PlatformType", "userSubject", "LNc/a;", "getUser", "()Lru/ozon/app/android/storage/user/model/User;", "getUser$delegate", "(Lru/ozon/app/android/account/user/UserLocalDataStore;)Ljava/lang/Object;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserLocalDataStore {

    @NotNull
    private final C3667a<User> userSubject;

    public UserLocalDataStore() {
        C3667a<User> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.userSubject = d11;
    }

    public final User getUser() {
        return this.userSubject.f();
    }

    @NotNull
    public final p<User> observeUser() {
        return this.userSubject;
    }

    public final void saveUser(@NotNull User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.userSubject.onNext(user);
    }
}
