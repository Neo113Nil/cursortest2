package ru.ozon.app.android.domain.session.interactors;

import Sc.InterfaceC3999a;
import android.net.Uri;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.session.api.auth.models.Response;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/domain/session/interactors/SberIdInteractor;", "", "", "action", "", "body", "Lio/reactivex/y;", "getUrl", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "Landroid/net/Uri;", "uri", "origin", "Lru/ozon/app/android/domain/session/api/auth/models/Response;", "auth", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface SberIdInteractor {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ y getUrl$default(SberIdInteractor sberIdInteractor, String str, Map map, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUrl");
            }
            if ((i11 & 2) != 0) {
                map = U.c();
            }
            return sberIdInteractor.getUrl(str, map);
        }
    }

    @InterfaceC3999a
    @NotNull
    y<Response> auth(@NotNull Uri uri, @NotNull String action, String origin);

    @InterfaceC3999a
    @NotNull
    y<String> getUrl(@NotNull String action, @NotNull Map<String, ? extends Object> body);
}
