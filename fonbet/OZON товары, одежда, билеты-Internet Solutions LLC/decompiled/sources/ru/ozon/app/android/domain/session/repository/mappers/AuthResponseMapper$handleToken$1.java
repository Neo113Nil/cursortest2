package ru.ozon.app.android.domain.session.repository.mappers;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/storage/user/model/User;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/storage/user/model/User;)Lru/ozon/app/android/domain/session/api/auth/models/Response;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AuthResponseMapper$handleToken$1 extends AbstractC7737t implements Function1<User, Response> {
    final /* synthetic */ Response $response;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthResponseMapper$handleToken$1(Response response) {
        super(1);
        this.$response = response;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Response invoke(User it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$response;
    }
}
