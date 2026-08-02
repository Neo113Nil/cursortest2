package ru.ozon.app.android.account.user;

import Ae.InterfaceC2395h;
import Sc.r;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\rH&¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/user/UserManager;", "", "", "getUserId", "()J", "Lio/reactivex/p;", "Lru/ozon/app/android/storage/user/model/User;", "observeUser", "()Lio/reactivex/p;", "Lio/reactivex/b;", "fetchUser", "()Lio/reactivex/b;", "userValue", "Lio/reactivex/y;", "LSc/r;", "", "updateUserBirthday", "(Lru/ozon/app/android/storage/user/model/User;)Lio/reactivex/y;", "updateUserSex", "updateProfileInfo", "()Lio/reactivex/y;", "getUser", "()Lru/ozon/app/android/storage/user/model/User;", "user", "LAe/h;", "getUserIdFlow", "()LAe/h;", "userIdFlow", "getUserIdChangedFlow", "userIdChangedFlow", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserManager {
    @NotNull
    AbstractC7094b fetchUser();

    User getUser();

    long getUserId();

    @NotNull
    InterfaceC2395h<Long> getUserIdChangedFlow();

    @NotNull
    InterfaceC2395h<Long> getUserIdFlow();

    @NotNull
    p<User> observeUser();

    @NotNull
    y<User> updateProfileInfo();

    @NotNull
    y<r<Unit>> updateUserBirthday(@NotNull User userValue);

    @NotNull
    y<r<Unit>> updateUserSex(@NotNull User userValue);
}
