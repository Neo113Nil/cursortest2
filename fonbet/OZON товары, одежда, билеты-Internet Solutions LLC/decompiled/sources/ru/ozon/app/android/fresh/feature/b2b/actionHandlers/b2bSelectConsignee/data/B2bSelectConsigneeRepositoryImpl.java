package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.data;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.api.B2bSelectConsigneeApi;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/data/B2bSelectConsigneeRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/data/B2bSelectConsigneeRepository;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/api/B2bSelectConsigneeApi;", "selectConsigneeApi", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/api/B2bSelectConsigneeApi;)V", "", "actionName", "id", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/data/B2bSelectConsigneeResponse;", "selectConsignee", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/api/B2bSelectConsigneeApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bSelectConsigneeRepositoryImpl implements B2bSelectConsigneeRepository {

    @NotNull
    private final B2bSelectConsigneeApi selectConsigneeApi;

    public B2bSelectConsigneeRepositoryImpl(@NotNull B2bSelectConsigneeApi selectConsigneeApi) {
        Intrinsics.checkNotNullParameter(selectConsigneeApi, "selectConsigneeApi");
        this.selectConsigneeApi = selectConsigneeApi;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.data.B2bSelectConsigneeRepository
    public Object selectConsignee(@NotNull String str, @NotNull String str2, @NotNull d<? super Result<B2bSelectConsigneeResponse>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new B2bSelectConsigneeRepositoryImpl$selectConsignee$$inlined$runCatchingWithDispatchers$default$1(this, null, str, str2), dVar);
    }
}
