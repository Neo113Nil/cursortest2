package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain;

import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\f\u0010\rJD\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ChangeEmailRepository;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ChangeEmailApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ChangeEmailApi;)V", "", "actionName", Scopes.EMAIL, "Lretrofit2/Response;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ActionResponseDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bGetOtpResponseDTO;", "sendGetOtp", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "otpId", "otpValue", "", "commsPermission", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bChangeEmailResponseDTO;", "sendChangeEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ChangeEmailApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangeEmailRepository {

    @NotNull
    private final ChangeEmailApi api;

    public ChangeEmailRepository(@NotNull ChangeEmailApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    public final Object sendChangeEmail(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z11, @NotNull d<? super Response<ActionResponseDTO<B2bChangeEmailResponseDTO>>> dVar) {
        return this.api.sendChangeEmail(str, U.j(new Pair("otpId", str2), new Pair("otpValue", str3), new Pair(Scopes.EMAIL, str4), new Pair("commsPermission", Boolean.valueOf(z11))), dVar);
    }

    public final Object sendGetOtp(@NotNull String str, @NotNull String str2, @NotNull d<? super Response<ActionResponseDTO<B2bGetOtpResponseDTO>>> dVar) {
        return this.api.sendGetOtp(str, U.i(new Pair(Scopes.EMAIL, str2)), dVar);
    }
}
