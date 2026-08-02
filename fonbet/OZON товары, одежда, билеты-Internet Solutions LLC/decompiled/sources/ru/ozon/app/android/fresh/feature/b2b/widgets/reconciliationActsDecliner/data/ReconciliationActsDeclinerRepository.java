package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data;

import We.D;
import We.K;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.SingleDocumentResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.RejectReconciliationActRequestDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.api.RejectReconciliationActResponseDTO;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerRepository;", "", "LWe/K;", "documentType", "LWe/D$c;", "file", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO;", "loadDocument", "(LWe/K;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "actionName", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActRequestDTO;", "request", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActResponseDTO;", "rejectReconciliationAct", "(Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/api/RejectReconciliationActRequestDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ReconciliationActsDeclinerRepository {
    Object loadDocument(@NotNull K k11, @NotNull D.c cVar, @NotNull d<? super Result<SingleDocumentResponseDTO>> dVar);

    Object rejectReconciliationAct(@NotNull String str, @NotNull RejectReconciliationActRequestDTO rejectReconciliationActRequestDTO, @NotNull d<? super Result<RejectReconciliationActResponseDTO>> dVar);
}
