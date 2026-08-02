package ru.ozon.app.android.domain.session.interactors;

import io.reactivex.C;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.repository.mappers.AuthResponseMapper;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AuthInteractorImpl$callAction$1 extends AbstractC7737t implements Function1<ActionV2Response<Response>, C<? extends Response>> {
    final /* synthetic */ AuthInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthInteractorImpl$callAction$1(AuthInteractorImpl authInteractorImpl) {
        super(1);
        this.this$0 = authInteractorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends Response> invoke(ActionV2Response<Response> it) {
        AuthResponseMapper authResponseMapper;
        Intrinsics.checkNotNullParameter(it, "it");
        authResponseMapper = this.this$0.authResponseMapper;
        return authResponseMapper.handleToken(it.getData());
    }
}
