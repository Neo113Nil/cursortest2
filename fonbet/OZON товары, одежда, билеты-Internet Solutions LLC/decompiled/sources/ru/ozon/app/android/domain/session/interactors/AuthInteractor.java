package ru.ozon.app.android.domain.session.interactors;

import W10.c;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.domain.session.api.auth.models.Response;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H&¢\u0006\u0004\b\b\u0010\tJ?\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/domain/session/interactors/AuthInteractor;", "", "", "action", "", "body", "Lio/reactivex/y;", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "callAction", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "callActionWithTracking", "(Ljava/lang/String;LW10/c;Ljava/util/Map;)Lio/reactivex/y;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "", "sendTrackEvent", "(Ljava/lang/String;)Lio/reactivex/y;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AuthInteractor {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ y callActionWithTracking$default(AuthInteractor authInteractor, String str, c cVar, Map map, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callActionWithTracking");
            }
            if ((i11 & 4) != 0) {
                map = U.c();
            }
            return authInteractor.callActionWithTracking(str, cVar, map);
        }
    }

    @NotNull
    y<Response> callAction(@NotNull String action, @NotNull Map<String, ? extends Object> body);

    @NotNull
    y<Response> callActionWithTracking(@NotNull String action, @NotNull c trackingData, @NotNull Map<String, ? extends Object> body);

    @NotNull
    y<ActionV2Response<Unit>> sendTrackEvent(@NotNull String action);
}
