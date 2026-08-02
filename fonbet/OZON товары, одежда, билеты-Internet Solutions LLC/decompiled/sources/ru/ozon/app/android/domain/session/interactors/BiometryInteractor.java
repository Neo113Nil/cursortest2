package ru.ozon.app.android.domain.session.interactors;

import W10.c;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.session.api.auth.models.Response;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/domain/session/interactors/BiometryInteractor;", "", "", "action", "signed", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lio/reactivex/y;", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "auth", "(Ljava/lang/String;Ljava/lang/String;LW10/c;)Lio/reactivex/y;", "Lio/reactivex/b;", "deleteKey", "()Lio/reactivex/b;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BiometryInteractor {
    @NotNull
    y<Response> auth(@NotNull String action, @NotNull String signed, @NotNull c trackingData);

    @NotNull
    AbstractC7094b deleteKey();
}
