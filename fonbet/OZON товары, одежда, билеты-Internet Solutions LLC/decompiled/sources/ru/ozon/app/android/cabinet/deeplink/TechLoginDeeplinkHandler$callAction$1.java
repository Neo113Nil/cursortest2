package ru.ozon.app.android.cabinet.deeplink;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.repository.mappers.AuthFlowMapper;
import ru.ozon.app.android.domain.session.state.AuthState;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lru/ozon/app/android/domain/session/state/AuthState;", "it", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TechLoginDeeplinkHandler$callAction$1 extends AbstractC7737t implements Function1<Response, AuthState> {
    final /* synthetic */ TechLoginDeeplinkHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TechLoginDeeplinkHandler$callAction$1(TechLoginDeeplinkHandler techLoginDeeplinkHandler) {
        super(1);
        this.this$0 = techLoginDeeplinkHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AuthState invoke(Response it) {
        AuthFlowMapper authFlowMapper;
        Intrinsics.checkNotNullParameter(it, "it");
        authFlowMapper = this.this$0.authFlowMapper;
        return authFlowMapper.mapToState(it);
    }
}
