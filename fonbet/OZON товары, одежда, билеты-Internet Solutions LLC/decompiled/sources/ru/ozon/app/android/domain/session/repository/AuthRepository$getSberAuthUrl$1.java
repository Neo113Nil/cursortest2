package ru.ozon.app.android.domain.session.repository;

import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.domain.session.api.auth.models.SberAuthResponse;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/SberAuthResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "Lio/reactivex/C;", "", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/domain/session/api/auth/models/SberAuthResponse;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class AuthRepository$getSberAuthUrl$1 extends AbstractC7737t implements Function1<SberAuthResponse, C<? extends String>> {
    public static final AuthRepository$getSberAuthUrl$1 INSTANCE = new AuthRepository$getSberAuthUrl$1();

    AuthRepository$getSberAuthUrl$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends String> invoke(SberAuthResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String authUri = it.getAuthUri();
        if (authUri != null) {
            if (authUri.length() <= 0) {
                authUri = null;
            }
            if (authUri != null) {
                return y.f(authUri);
            }
        }
        return y.e(new Throwable(it.getError()));
    }
}
