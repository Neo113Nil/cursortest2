package ru.ozon.app.android.account.user;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class UserManagerImpl$fetchUser$1 extends C7735q implements Function1<User, Unit> {
    UserManagerImpl$fetchUser$1(Object obj) {
        super(1, obj, UserLocalDataStore.class, "saveUser", "saveUser(Lru/ozon/app/android/storage/user/model/User;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(User user) {
        invoke2(user);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(User p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((UserLocalDataStore) this.receiver).saveUser(p02);
    }
}
