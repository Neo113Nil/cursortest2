package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.api.LegalsApi;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;)V", "", "action", "postData", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;", "addLegalMobile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/ProcessRegistrationResponse;", "processRegistration", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/GetPostResponse;", "getPostByAddress", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/api/LegalsApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddLegalRepositoryImpl implements AddLegalRepository {

    @NotNull
    private final LegalsApi api;

    public AddLegalRepositoryImpl(@NotNull LegalsApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository
    public Object addLegalMobile(@NotNull String str, @NotNull String str2, @NotNull d<? super Result<AddLegalResponse>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new AddLegalRepositoryImpl$addLegalMobile$$inlined$runCatchingWithDispatchers$default$1(this, null, str, str2), dVar);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository
    public Object getPostByAddress(@NotNull String str, @NotNull d<? super Result<GetPostResponse>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new AddLegalRepositoryImpl$getPostByAddress$$inlined$runCatchingWithDispatchers$default$1(this, null, str), dVar);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.AddLegalRepository
    public Object processRegistration(@NotNull String str, @NotNull String str2, @NotNull d<? super Result<ProcessRegistrationResponse>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new AddLegalRepositoryImpl$processRegistration$$inlined$runCatchingWithDispatchers$default$1(this, null, str, str2), dVar);
    }
}
