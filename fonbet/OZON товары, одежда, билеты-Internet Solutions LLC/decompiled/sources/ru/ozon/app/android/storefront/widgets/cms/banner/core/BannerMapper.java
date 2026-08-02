package ru.ozon.app.android.storefront.widgets.cms.banner.core;

import WZ.t;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.storefront.widgets.cms.banner.BannerDTO;
import ru.ozon.app.android.storefront.widgets.cms.banner.presentation.BannerVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/banner/core/BannerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/cms/banner/presentation/BannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "height", "width", "", "getRatio", "(II)F", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;Ll20/d;)Ljava/util/List;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BannerMapper implements Function2<BannerDTO, d, List<? extends BannerVO>> {
    private final float getRatio(int height, int width) {
        return BigDecimal.valueOf(height).divide(BigDecimal.valueOf(width), 4, RoundingMode.HALF_UP).floatValue();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BannerVO> invoke(@NotNull BannerDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (dto.getWidth() <= 0 || dto.getHeight() <= 0) {
            return K.f71697a;
        }
        long hashCode = (dto.getItem().getImage() + "." + dto.getWidth() + "." + dto.getHeight()).hashCode();
        String image = dto.getItem().getImage();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getItem().getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        float ratio = getRatio(dto.getHeight(), dto.getWidth());
        String deeplink = dto.getItem().getDeeplink();
        String str = (deeplink == null || h.K(deeplink)) ? null : deeplink;
        BadgeDTO adBadge = dto.getItem().getAdBadge();
        String backgroundColor = dto.getItem().getBackgroundColor();
        boolean isRounded = dto.isRounded();
        boolean disableVerticalMargins = dto.getDisableVerticalMargins();
        AtomActionDTO action = dto.getItem().getAction();
        return C7714v.a0(new BannerVO(hashCode, tokenizedEvent$default, str, ratio, image, isRounded, disableVerticalMargins, adBadge, backgroundColor, action != null ? AtomActionMapperKt.toAtomAction(action, dto.getItem().getTrackingInfo()) : null));
    }
}
