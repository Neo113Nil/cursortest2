package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.api.AddConsigneeApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.api.AddConsigneeResponse;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeRepository;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeApi;", "addConsigneeApi", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeApi;)V", "", "actionName", "kpp", "branch", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeResponse;", "addConsignee", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/api/AddConsigneeApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddConsigneeRepositoryImpl implements AddConsigneeRepository {

    @NotNull
    private final AddConsigneeApi addConsigneeApi;

    public AddConsigneeRepositoryImpl(@NotNull AddConsigneeApi addConsigneeApi) {
        Intrinsics.checkNotNullParameter(addConsigneeApi, "addConsigneeApi");
        this.addConsigneeApi = addConsigneeApi;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeRepository
    public Object addConsignee(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull d<? super Result<AddConsigneeResponse>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new AddConsigneeRepositoryImpl$addConsignee$$inlined$runCatchingWithDispatchers$default$1(this, null, str, str2, str4, str3), dVar);
    }
}
