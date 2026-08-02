package ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.data.TravelTextWithBadgeDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.presentation.TravelTextWithBadgeVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO$Gravity;", "gravity", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO$Gravity;", "mapGravity", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO$Gravity;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/presentation/TravelTextWithBadgeVO$Gravity;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelTextWithBadge/data/TravelTextWithBadgeDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTextWithBadgeMapper implements Function2<TravelTextWithBadgeDTO, d, List<? extends TravelTextWithBadgeVO>> {

    @NotNull
    private final Context context;

    public TravelTextWithBadgeMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final TravelTextWithBadgeVO.Gravity mapGravity(TravelTextWithBadgeDTO.Gravity gravity) {
        return gravity == TravelTextWithBadgeDTO.Gravity.GRAVITY_END ? TravelTextWithBadgeVO.Gravity.END : TravelTextWithBadgeVO.Gravity.TEXT_END;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelTextWithBadgeVO> invoke(@NotNull TravelTextWithBadgeDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom text = dto.getText();
        Badge badge = dto.getBadge();
        String backgroundColor = dto.getBackgroundColor();
        Integer offsetHorizontal = dto.getOffsetHorizontal();
        int px = offsetHorizontal != null ? ResourceExtKt.toPx(offsetHorizontal.intValue(), this.context) : 0;
        Integer offsetTop = dto.getOffsetTop();
        int px2 = offsetTop != null ? ResourceExtKt.toPx(offsetTop.intValue(), this.context) : 0;
        Integer offsetBottom = dto.getOffsetBottom();
        return C7714v.a0(new TravelTextWithBadgeVO(hashCode, text, badge, backgroundColor, px, px2, offsetBottom != null ? ResourceExtKt.toPx(offsetBottom.intValue(), this.context) : 0, dto.isCentered(), mapGravity(dto.getBadgeGravity()), dto.getOnboarding()));
    }
}
