package ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.api.CloseStatusEdoResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.api.StatusEdoApi;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/StatusEdoRepositoryImpl;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/StatusEdoRepository;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/api/StatusEdoApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/api/StatusEdoApi;)V", "", "actionName", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/api/CloseStatusEdoResponseDTO;", "closeStatusEdo", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/api/StatusEdoApi;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StatusEdoRepositoryImpl implements StatusEdoRepository {

    @NotNull
    private final StatusEdoApi api;

    public StatusEdoRepositoryImpl(@NotNull StatusEdoApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.StatusEdoRepository
    public Object closeStatusEdo(@NotNull String str, @NotNull d<? super Result<CloseStatusEdoResponseDTO>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new StatusEdoRepositoryImpl$closeStatusEdo$$inlined$runCatchingWithDispatchers$default$1(this, null, str), dVar);
    }
}
