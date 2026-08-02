package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.data.PromoReviewItemDTO;
import ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item.PromoReviewItemVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$ProductDTO;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$ProductVO;", "toVO", "(Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$ProductDTO;)Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$ProductVO;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;", "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", "(Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO$TimerDTO;)Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/item/PromoReviewItemVO$TimerVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/data/PromoReviewItemDTO;Ll20/d;)Ljava/util/List;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoReviewItemMapper implements Function2<PromoReviewItemDTO, d, List<? extends PromoReviewItemVO>> {
    private final PromoReviewItemVO.ProductVO toVO(PromoReviewItemDTO.ProductDTO productDTO) {
        ImageDTO image = productDTO.getImage();
        TextDTO title = productDTO.getTitle();
        AtomActionDTO action = productDTO.getAction();
        return new PromoReviewItemVO.ProductVO(image, title, action != null ? AtomActionMapperKt.toAtomAction(action, productDTO.getTrackingInfo()) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PromoReviewItemVO> invoke(@NotNull PromoReviewItemDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        String backgroundColor = state.getBackgroundColor();
        PromoReviewItemVO.ProductVO vo = toVO(state.getProduct());
        PromoReviewItemDTO.TimerDTO timer = state.getTimer();
        PromoReviewItemVO.TimerVO vo2 = timer != null ? toVO(timer) : null;
        List<PromoReviewItemDTO.PointDTO> points = state.getPoints();
        if (points != null) {
            List<PromoReviewItemDTO.PointDTO> list = points;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (PromoReviewItemDTO.PointDTO pointDTO : list) {
                arrayList.add(new PromoReviewItemVO.PointVO(pointDTO.getIcons(), pointDTO.getTitle()));
            }
        } else {
            arrayList = null;
        }
        ButtonV3DTO reviewButton = state.getReviewButton();
        CellDTO pointsCell = state.getPointsCell();
        AtomActionDTO action = state.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Integer topPaddingCell = state.getTopPaddingCell();
        return C7714v.a0(new PromoReviewItemVO(hashCode, backgroundColor, vo, vo2, arrayList, reviewButton, pointsCell, atomAction, tokenizedEvent$default, topPaddingCell != null ? Integer.valueOf(ResourceExtKt.toPx(topPaddingCell.intValue())) : null, state.getRightBottomIcon()));
    }

    private final PromoReviewItemVO.TimerVO toVO(PromoReviewItemDTO.TimerDTO timerDTO) {
        DateTime serverTimestamp = timerDTO.getServerTimestamp();
        DateTimeZone dateTimeZone = DateTimeZone.f78989a;
        DateTime p11 = serverTimestamp.p(dateTimeZone);
        OzonSpannableString ozonSpannableString = new OzonSpannableString();
        String typographyToken = timerDTO.getTypographyToken();
        String textColor = timerDTO.getTextColor();
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_250;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_100;
        TextDTO textDTO = new TextDTO(ozonSpannableString, null, layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, textPreset, typographyToken, textColor, null, null, null, null, false, null, null, null, null, null, 523778, null);
        DateTime p12 = timerDTO.getStartTimestamp().p(dateTimeZone);
        Intrinsics.checkNotNullExpressionValue(p12, "withZone(...)");
        DateTime p13 = timerDTO.getEndTimestamp().p(dateTimeZone);
        Intrinsics.checkNotNullExpressionValue(p13, "withZone(...)");
        long millis = p11.getMillis() - new DateTime().getMillis();
        String backgroundColor = timerDTO.getBackgroundColor();
        CornerRadius cornerRadius = timerDTO.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_250;
        }
        return new PromoReviewItemVO.TimerVO(textDTO, p11, p12, p13, millis, backgroundColor, cornerRadius);
    }
}
