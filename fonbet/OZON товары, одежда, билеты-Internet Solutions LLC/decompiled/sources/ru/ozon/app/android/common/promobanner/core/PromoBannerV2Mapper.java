package ru.ozon.app.android.common.promobanner.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.promobanner.data.PromoBannerV2DTO;
import ru.ozon.app.android.common.promobanner.presentation.PromoBannerV2VO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/common/promobanner/core/PromoBannerV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO;Ll20/d;)Ljava/util/List;", "promo-banner_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoBannerV2Mapper implements Function2<PromoBannerV2DTO, d, List<? extends PromoBannerV2VO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PromoBannerV2VO> invoke(@NotNull PromoBannerV2DTO dto, @NotNull d widgetInfo) {
        t tVar;
        String str;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = dto.hashCode();
        String theme = dto.getTheme();
        String image = dto.getImage();
        String backgroundColor = dto.getBackgroundColor();
        String outerBackgroundColor = dto.getOuterBackgroundColor();
        ButtonV3Atom.SmallIconButton iconButton = dto.getIconButton();
        ButtonV3Atom.SmallButton actionButton = dto.getActionButton();
        TextAtom titleAtom = dto.getTitleAtom();
        TextAtom description = dto.getDescription();
        Boolean showShadow = dto.getShowShadow();
        boolean booleanValue = showShadow != null ? showShadow.booleanValue() : false;
        Boolean hideParandja = dto.getHideParandja();
        boolean booleanValue2 = hideParandja != null ? hideParandja.booleanValue() : false;
        String actionButtonPosition = dto.getActionButtonPosition();
        if (actionButtonPosition == null) {
            actionButtonPosition = "POSITION_TOP";
        }
        String str2 = actionButtonPosition;
        Boolean isRounded = dto.isRounded();
        boolean booleanValue3 = isRounded != null ? isRounded.booleanValue() : false;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        PromoBannerV2VO.MarginsVO marginsVO = null;
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        BadgeDTO adBadge = dto.getAdBadge();
        PromoBannerV2DTO.MarginsDTO margins = dto.getMargins();
        if (margins != null) {
            tVar = tokenizedEvent$default;
            str = theme;
            marginsVO = new PromoBannerV2VO.MarginsVO(UiExtKt.toPx(margins.getLeft()), UiExtKt.toPx(margins.getTop()), UiExtKt.toPx(margins.getRight()), UiExtKt.toPx(margins.getBottom()));
        } else {
            tVar = tokenizedEvent$default;
            str = theme;
        }
        return C7714v.a0(new PromoBannerV2VO(hashCode, str, image, backgroundColor, outerBackgroundColor, iconButton, actionButton, titleAtom, description, booleanValue3, booleanValue, booleanValue2, str2, false, tVar, adBadge, marginsVO, 8192, null));
    }
}
