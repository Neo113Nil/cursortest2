package ru.ozon.app.android.storefront.widgets.rateApp.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.rateApp.data.RateAppDTO;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/core/RateAppMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateAppMapper implements Function2<RateAppDTO, d, List<? extends RateAppVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RateAppVO> invoke(@NotNull RateAppDTO state, @NotNull d widgetInfo) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        RatingDTO rating = state.getRating();
        CommonControlSettings common = state.getRating().getCommon();
        AtomAction atomAction = null;
        atomAction = null;
        if (common != null && (action = common.getAction()) != null) {
            CommonControlSettings common2 = state.getRating().getCommon();
            atomAction = AtomActionMapperKt.toAtomAction(action, common2 != null ? common2.getTrackingInfo() : null);
        }
        return C7714v.a0(new RateAppVO(hashCode, title, rating, atomAction));
    }
}
