package ru.ozon.app.android.account.user;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.user.model.composer.GetUserResponse;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storage/user/model/User;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/account/user/model/composer/GetUserResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/account/user/model/composer/GetUserResponse;)Lru/ozon/app/android/storage/user/model/User;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class NetworkUserDataStore$getUserInfoV2$1 extends AbstractC7737t implements Function1<GetUserResponse, User> {
    final /* synthetic */ NetworkUserDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkUserDataStore$getUserInfoV2$1(NetworkUserDataStore networkUserDataStore) {
        super(1);
        this.this$0 = networkUserDataStore;
    }

    @Override // kotlin.jvm.functions.Function1
    public final User invoke(GetUserResponse it) {
        User user;
        Intrinsics.checkNotNullParameter(it, "it");
        user = this.this$0.toUser(it);
        return user;
    }
}
