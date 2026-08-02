package ru.ozon.app.android.ugcratingservice;

import Ae.InterfaceC2395h;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingservice.EditingActionDTO;
import ru.ozon.app.android.ugcratingservice.data.RatingState;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\u0006J#\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugcratingservice/UgcRatingService;", "", "", "pageId", "", "unRegisterUgcRatingMoleculeScreen", "(Ljava/lang/String;)V", "LAe/h;", "", "Lru/ozon/app/android/ugcratingservice/data/RatingState;", "getRatingStateFlow", "(Ljava/lang/String;)LAe/h;", "productId", "markFailedRatingService", "rating", "markPendingRatingService", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;", "editingActionDTO", "markSucceedRatingService", "(Ljava/lang/String;Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;Ljava/lang/String;)V", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UgcRatingService {
    @NotNull
    InterfaceC2395h<Map<String, RatingState>> getRatingStateFlow(@NotNull String pageId);

    void markFailedRatingService(String productId);

    void markPendingRatingService(String rating, String productId);

    void markSucceedRatingService(String rating, EditingActionDTO editingActionDTO, String productId);

    void unRegisterUgcRatingMoleculeScreen(@NotNull String pageId);
}
