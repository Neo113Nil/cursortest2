package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardRepository;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardApi;)V", "", "actionName", "", "params", "Lretrofit2/Response;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/ActionResponseDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CheckCanChangeEmailResponseDTO;", "canChangeEmail", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CompanyCardRepository {

    @NotNull
    private final CompanyCardApi api;

    public CompanyCardRepository(@NotNull CompanyCardApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    public final Object canChangeEmail(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull d<? super Response<ActionResponseDTO<CheckCanChangeEmailResponseDTO>>> dVar) {
        return this.api.canChangeEmail(str, map, dVar);
    }
}
