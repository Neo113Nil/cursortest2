package ru.ozon.app.android.storefront.widgets.stickyCart.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.stickyCart.data.StickyCartDTO;
import ru.ozon.app.android.storefront.widgets.stickyCart.presenatation.StickyCartVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/stickyCart/core/StickyCartMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/stickyCart/data/StickyCartDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/stickyCart/presenatation/StickyCartVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "createDefaultIcon", "(Lru/ozon/uni/atoms/data/icon/IconDTO;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "createDefaultIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/stickyCart/data/StickyCartDTO;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickyCartMapper implements Function2<StickyCartDTO, d, List<? extends StickyCartVO>> {
    private final IconDTO createDefaultIcon(IconDTO iconDTO) {
        CommonAtomIconDTO icon = iconDTO.getIcon();
        return new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.CIRCLE, null, icon != null ? CommonAtomIconDTO.copy$default(icon, null, UniColors.GRAPHIC_KEY_INVERTED.getToken(), 1, null) : null, null, iconDTO.getBackgroundColor(), null, null, null, null, null, null, null, null, null, 65450, null);
    }

    private final IndicatorDTO createDefaultIndicator() {
        return new IndicatorDTO(null, null, IndicatorDTO.IndicatorSize.SIZE_500, null, null, IndicatorDTO.IndicatorContent.TEXT, null, null, null, IndicatorDTO.Style.ACCENT, null, 1499, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StickyCartVO> invoke(@NotNull StickyCartDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        IconDTO createDefaultIcon = createDefaultIcon(state.getIcon());
        IndicatorDTO indicator = state.getIndicator();
        if (indicator == null) {
            indicator = createDefaultIndicator();
        }
        IndicatorDTO indicatorDTO = indicator;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new StickyCartVO(hashCode, createDefaultIcon, indicatorDTO, AtomActionMapperKt.toAtomAction(state.getAction(), state.getTrackingInfo()), trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
