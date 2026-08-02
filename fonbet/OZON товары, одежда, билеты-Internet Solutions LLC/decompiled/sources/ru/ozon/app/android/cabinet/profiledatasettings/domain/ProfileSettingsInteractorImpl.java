package ru.ozon.app.android.cabinet.profiledatasettings.domain;

import AA.d;
import Bc.m;
import Cw.c;
import Sc.r;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/domain/ProfileSettingsInteractorImpl;", "Lru/ozon/app/android/cabinet/profiledatasettings/domain/ProfileSettingsInteractor;", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "<init>", "(Lru/ozon/app/android/account/user/UserManager;)V", "Lio/reactivex/y;", "Lru/ozon/app/android/storage/user/model/User;", "getUser", "()Lio/reactivex/y;", "", "birthday", "LSc/r;", "", "kotlin.jvm.PlatformType", "updateUserBirthday", "(Ljava/lang/String;)Lio/reactivex/y;", "", "sex", "updateUserSex", "(I)Lio/reactivex/y;", "Lru/ozon/app/android/account/user/UserManager;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfileSettingsInteractorImpl implements ProfileSettingsInteractor {

    @NotNull
    private final UserManager userManager;

    public ProfileSettingsInteractorImpl(@NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.userManager = userManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C updateUserBirthday$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C updateUserSex$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.cabinet.profiledatasettings.domain.ProfileSettingsInteractor
    @NotNull
    public y<User> getUser() {
        return this.userManager.updateProfileInfo();
    }

    @Override // ru.ozon.app.android.cabinet.profiledatasettings.domain.ProfileSettingsInteractor
    @NotNull
    public y<r<Unit>> updateUserBirthday(@NotNull String birthday) {
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        y<User> updateProfileInfo = this.userManager.updateProfileInfo();
        d dVar = new d(new ProfileSettingsInteractorImpl$updateUserBirthday$1(birthday, this), 4);
        updateProfileInfo.getClass();
        m mVar = new m(updateProfileInfo, dVar);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    @Override // ru.ozon.app.android.cabinet.profiledatasettings.domain.ProfileSettingsInteractor
    @NotNull
    public y<r<Unit>> updateUserSex(int sex) {
        y<User> updateProfileInfo = this.userManager.updateProfileInfo();
        c cVar = new c(new ProfileSettingsInteractorImpl$updateUserSex$1(sex, this), 4);
        updateProfileInfo.getClass();
        m mVar = new m(updateProfileInfo, cVar);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }
}
