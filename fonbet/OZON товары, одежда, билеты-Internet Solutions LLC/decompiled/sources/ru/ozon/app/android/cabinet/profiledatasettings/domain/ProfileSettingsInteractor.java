package ru.ozon.app.android.cabinet.profiledatasettings.domain;

import Sc.r;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/domain/ProfileSettingsInteractor;", "", "Lio/reactivex/y;", "Lru/ozon/app/android/storage/user/model/User;", "getUser", "()Lio/reactivex/y;", "", "birthday", "LSc/r;", "", "updateUserBirthday", "(Ljava/lang/String;)Lio/reactivex/y;", "", "sex", "updateUserSex", "(I)Lio/reactivex/y;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ProfileSettingsInteractor {
    @NotNull
    y<User> getUser();

    @NotNull
    y<r<Unit>> updateUserBirthday(@NotNull String birthday);

    @NotNull
    y<r<Unit>> updateUserSex(int sex);
}
