package ru.ozon.app.android.domain.session.interactors;

import io.reactivex.AbstractC7094b;
import io.reactivex.C;
import io.reactivex.y;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.domain.session.api.auth.models.Data;
import ru.ozon.app.android.domain.session.api.auth.models.Response;
import vc.s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/Response;", "Lkotlin/jvm/internal/EnhancedNullability;", "response", "Lio/reactivex/C;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/domain/session/api/auth/models/Response;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class BiometryInteractorImpl$auth$2 extends AbstractC7737t implements Function1<Response, C<? extends Response>> {
    final /* synthetic */ BiometryInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BiometryInteractorImpl$auth$2(BiometryInteractorImpl biometryInteractorImpl) {
        super(1);
        this.this$0 = biometryInteractorImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response invoke$lambda$0(Response response) {
        return response;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends Response> invoke(final Response response) {
        Data.Biometry biometry;
        Intrinsics.checkNotNullParameter(response, "response");
        Data data = response.getData();
        if (!((data == null || (biometry = data.getBiometry()) == null) ? false : Intrinsics.d(biometry.getClearDevicePublicKey(), Boolean.TRUE))) {
            return y.f(response);
        }
        AbstractC7094b deleteKey = this.this$0.deleteKey();
        Callable callable = new Callable() { // from class: ru.ozon.app.android.domain.session.interactors.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Response invoke$lambda$0;
                invoke$lambda$0 = BiometryInteractorImpl$auth$2.invoke$lambda$0(Response.this);
                return invoke$lambda$0;
            }
        };
        deleteKey.getClass();
        return new s(deleteKey, callable);
    }
}
