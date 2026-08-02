package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data;

import We.D;
import We.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.LegalDetailsEditorResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api.SingleDocumentResponseDTO;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorRepository;", "", "", "message", "", "paramsMap", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/LegalDetailsEditorResponseDTO;", "sendAllEdit", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LWe/K;", "documentType", "LWe/D$c;", "file", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO;", "loadDocument", "(LWe/K;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface LegalDetailsEditorRepository {
    Object loadDocument(@NotNull K k11, @NotNull D.c cVar, @NotNull d<? super Result<SingleDocumentResponseDTO>> dVar);

    Object sendAllEdit(@NotNull String str, @NotNull Map<String, String> map, @NotNull d<? super Result<LegalDetailsEditorResponseDTO>> dVar);
}
