package ru.ozon.app.android.domain.session.interactors;

import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import ru.ozon.app.android.domain.session.repository.mappers.AuthResponseMapper;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class SberIdInteractorImpl$auth$4 extends C7735q implements Function1<Response, y<Response>> {
    SberIdInteractorImpl$auth$4(Object obj) {
        super(1, obj, AuthResponseMapper.class, "handleToken", "handleToken(Lru/ozon/app/android/domain/session/api/auth/models/Response;)Lio/reactivex/Single;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final y<Response> invoke(Response response) {
        return ((AuthResponseMapper) this.receiver).handleToken(response);
    }
}
