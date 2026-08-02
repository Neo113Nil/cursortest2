package ru.ozon.app.android.cabinet.profiledatasettings.domain;

import Sc.r;
import io.reactivex.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/storage/user/model/User;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "LSc/r;", "", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/storage/user/model/User;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ProfileSettingsInteractorImpl$updateUserBirthday$1 extends AbstractC7737t implements Function1<User, C<? extends r<? extends Unit>>> {
    final /* synthetic */ String $birthday;
    final /* synthetic */ ProfileSettingsInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileSettingsInteractorImpl$updateUserBirthday$1(String str, ProfileSettingsInteractorImpl profileSettingsInteractorImpl) {
        super(1);
        this.$birthday = str;
        this.this$0 = profileSettingsInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends r<Unit>> invoke(User it) {
        UserManager userManager;
        Intrinsics.checkNotNullParameter(it, "it");
        User copy$default = User.copy$default(it, 0L, null, null, null, 0, null, this.$birthday, null, 191, null);
        userManager = this.this$0.userManager;
        return userManager.updateUserBirthday(copy$default);
    }
}
