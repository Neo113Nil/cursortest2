package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.api.VerificationEdoApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.api.VerificationEdoResponse;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/VerificationEdoRepository;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoApi;)V", "", "actionName", "position", "type", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoResponse;", "createVerificationRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/data/api/VerificationEdoApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerificationEdoRepositoryImpl implements VerificationEdoRepository {

    @NotNull
    private final VerificationEdoApi api;

    public VerificationEdoRepositoryImpl(@NotNull VerificationEdoApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.data.VerificationEdoRepository
    public Object createVerificationRequest(@NotNull String str, @NotNull String str2, String str3, @NotNull d<? super Result<VerificationEdoResponse>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new VerificationEdoRepositoryImpl$createVerificationRequest$$inlined$runCatchingWithDispatchers$default$1(this, null, str, str2, str3), dVar);
    }
}
