package ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.api.CloseStatusEdoResponseDTO;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/StatusEdoRepository;", "", "", "actionName", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/api/CloseStatusEdoResponseDTO;", "closeStatusEdo", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface StatusEdoRepository {
    Object closeStatusEdo(@NotNull String str, @NotNull d<? super Result<CloseStatusEdoResponseDTO>> dVar);
}
