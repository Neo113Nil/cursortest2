package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data;

import He.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.api.AddEdoApiV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.api.AddEdoResponseV2;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoRepositoryImplV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoRepositoryV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoApiV2;", "api", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoApiV2;)V", "", "actionName", "clientId", "edoId", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoResponseV2;", "addEdo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoApiV2;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddEdoRepositoryImplV2 implements AddEdoRepositoryV2 {

    @NotNull
    private final AddEdoApiV2 api;

    public AddEdoRepositoryImplV2(@NotNull AddEdoApiV2 api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoRepositoryV2
    public Object addEdo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull d<? super Result<AddEdoResponseV2>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new AddEdoRepositoryImplV2$addEdo$$inlined$runCatchingWithDispatchers$default$1(this, null, str2, str3, str), dVar);
    }
}
