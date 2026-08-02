package ru.ozon.app.android.ugcratingservice;

import Ae.O0;
import Ae.x0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingservice.EditingActionDTO;
import ru.ozon.app.android.ugcratingservice.data.RatingState;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000e0\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\fJ#\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R2\u0010\u001a\u001a \u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000e0\r0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugcratingservice/UgcRatingServiceImpl;", "Lru/ozon/app/android/ugcratingservice/UgcRatingService;", "<init>", "()V", "Lru/ozon/app/android/ugcratingservice/data/RatingState;", "ratingState", "", "updateReviewInfo", "(Lru/ozon/app/android/ugcratingservice/data/RatingState;)V", "", "pageId", "unRegisterUgcRatingMoleculeScreen", "(Ljava/lang/String;)V", "LAe/x0;", "", "getRatingStateFlow", "(Ljava/lang/String;)LAe/x0;", "productId", "markFailedRatingService", "rating", "markPendingRatingService", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;", "editingActionDTO", "markSucceedRatingService", "(Ljava/lang/String;Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;Ljava/lang/String;)V", "screenSubscriptionsMap", "Ljava/util/Map;", "ugcratingmolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcRatingServiceImpl implements UgcRatingService {

    @NotNull
    private final Map<String, x0<Map<String, RatingState>>> screenSubscriptionsMap = new LinkedHashMap();

    private final void updateReviewInfo(RatingState ratingState) {
        Map<String, RatingState> value;
        LinkedHashMap u11;
        Iterator<Map.Entry<String, x0<Map<String, RatingState>>>> it = this.screenSubscriptionsMap.entrySet().iterator();
        while (it.hasNext()) {
            x0<Map<String, RatingState>> value2 = it.next().getValue();
            do {
                value = value2.getValue();
                u11 = U.u(value);
                u11.put(ratingState.getProductId(), ratingState);
            } while (!value2.b(value, u11));
        }
    }

    @Override // ru.ozon.app.android.ugcratingservice.UgcRatingService
    public void markFailedRatingService(String productId) {
        if (productId == null) {
            return;
        }
        updateReviewInfo(new RatingState.Failed(productId));
    }

    @Override // ru.ozon.app.android.ugcratingservice.UgcRatingService
    public void markPendingRatingService(String rating, String productId) {
        Integer w02;
        if (rating == null || (w02 = h.w0(rating)) == null) {
            return;
        }
        int intValue = w02.intValue();
        if (productId == null) {
            return;
        }
        updateReviewInfo(new RatingState.Pending(productId, intValue));
    }

    @Override // ru.ozon.app.android.ugcratingservice.UgcRatingService
    public void markSucceedRatingService(String rating, EditingActionDTO editingActionDTO, String productId) {
        Integer w02;
        if (rating == null || (w02 = h.w0(rating)) == null) {
            return;
        }
        int intValue = w02.intValue();
        if (productId == null || editingActionDTO == null) {
            return;
        }
        updateReviewInfo(new RatingState.Success(productId, intValue, editingActionDTO));
    }

    @Override // ru.ozon.app.android.ugcratingservice.UgcRatingService
    public void unRegisterUgcRatingMoleculeScreen(@NotNull String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.screenSubscriptionsMap.remove(pageId);
    }

    @Override // ru.ozon.app.android.ugcratingservice.UgcRatingService
    @NotNull
    public x0<Map<String, RatingState>> getRatingStateFlow(@NotNull String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Map<String, x0<Map<String, RatingState>>> map = this.screenSubscriptionsMap;
        x0<Map<String, RatingState>> x0Var = map.get(pageId);
        if (x0Var == null) {
            x0Var = O0.a(new LinkedHashMap());
            map.put(pageId, x0Var);
        }
        return x0Var;
    }
}
