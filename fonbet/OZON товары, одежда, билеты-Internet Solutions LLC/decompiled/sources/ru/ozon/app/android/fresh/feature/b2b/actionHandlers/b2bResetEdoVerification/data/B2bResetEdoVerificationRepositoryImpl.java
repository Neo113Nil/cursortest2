package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.data;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.api.B2bResetEdoVerificationApi;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/data/B2bResetEdoVerificationRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/data/B2bResetEdoVerificationRepository;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/api/B2bResetEdoVerificationApi;", "resetVerificationRequestApi", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/api/B2bResetEdoVerificationApi;)V", "", "actionName", "id", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/data/B2bResetVerificationResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/api/B2bResetEdoVerificationApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bResetEdoVerificationRepositoryImpl implements B2bResetEdoVerificationRepository {

    @NotNull
    private final B2bResetEdoVerificationApi resetVerificationRequestApi;

    public B2bResetEdoVerificationRepositoryImpl(@NotNull B2bResetEdoVerificationApi resetVerificationRequestApi) {
        Intrinsics.checkNotNullParameter(resetVerificationRequestApi, "resetVerificationRequestApi");
        this.resetVerificationRequestApi = resetVerificationRequestApi;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.data.B2bResetEdoVerificationRepository
    public Object resetVerificationRequestApi(@NotNull String str, @NotNull String str2, @NotNull d<? super Result<B2bResetVerificationResponse>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new B2bResetEdoVerificationRepositoryImpl$resetVerificationRequestApi$$inlined$runCatchingWithDispatchers$default$1(this, null, str, str2), dVar);
    }
}
