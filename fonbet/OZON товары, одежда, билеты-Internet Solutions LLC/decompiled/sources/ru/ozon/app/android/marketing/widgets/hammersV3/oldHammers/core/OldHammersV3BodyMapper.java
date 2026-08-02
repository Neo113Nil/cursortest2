package ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.core;

import WZ.t;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.data.HammersV3HammerPriceDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.data.HammersV3PlaceholderDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.model.OldHammersV3BodyVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.model.OldHammersV3ProductInfoVO;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.product.imagesswipeview.Paranja;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0013B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/core/OldHammersV3BodyMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3BodyDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3BodyVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "itemsAreFaded", "Lru/ozon/app/android/product/imagesswipeview/Paranja;", "setParanjaType", "(Z)Lru/ozon/app/android/product/imagesswipeview/Paranja;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3BodyDTO;Ll20/d;)Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OldHammersV3BodyMapper implements Function2<HammersV3BodyDTO, d, List<? extends OldHammersV3BodyVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/core/OldHammersV3BodyMapper$Companion;", "", "<init>", "()V", "DEFAULT_ALPHA", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final Paranja setParanjaType(boolean itemsAreFaded) {
        return itemsAreFaded ? Paranja.PARANJA_BOTH_THEMES : Paranja.PARANJA_DISABLED_WHITE_BACKGROUND;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OldHammersV3BodyVO> invoke(@NotNull HammersV3BodyDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        String mainImage = state.getMainImage();
        if (mainImage == null) {
            mainImage = "";
        }
        String str = mainImage;
        AdultImageView.Image.HeightMode.Relative relative = new AdultImageView.Image.HeightMode.Relative(1.0f);
        Boolean imageIsFaded = state.getImageIsFaded();
        Paranja paranjaType = setParanjaType(imageIsFaded != null ? imageIsFaded.booleanValue() : true);
        Boolean isAdult = state.isAdult();
        AdultImageView.Image image = new AdultImageView.Image(str, relative, 1.0f, false, isAdult != null ? isAdult.booleanValue() : false, false, null, paranjaType, ImageView.ScaleType.FIT_CENTER, false, null, false, 3616, null);
        Float mainImageAlpha = state.getMainImageAlpha();
        float floatValue = mainImageAlpha != null ? mainImageAlpha.floatValue() : 1.0f;
        String imageOverlayPicture = state.getImageOverlayPicture();
        BadgeDTO dsBadge = state.getDsBadge();
        AtomActionDTO action = state.getAction();
        OldHammersV3ProductInfoVO oldHammersV3ProductInfoVO = null;
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Object productInfo = state.getProductInfo();
        if (productInfo instanceof HammersV3PlaceholderDTO) {
            HammersV3PlaceholderDTO hammersV3PlaceholderDTO = (HammersV3PlaceholderDTO) productInfo;
            oldHammersV3ProductInfoVO = new OldHammersV3ProductInfoVO.PlaceholderVO(hammersV3PlaceholderDTO.getDiscountPlaceholder(), hammersV3PlaceholderDTO.getText(), hammersV3PlaceholderDTO.getPricePlaceholder());
        } else if (productInfo instanceof HammersV3HammerPriceDTO) {
            HammersV3HammerPriceDTO hammersV3HammerPriceDTO = (HammersV3HammerPriceDTO) productInfo;
            oldHammersV3ProductInfoVO = new OldHammersV3ProductInfoVO.HammerPriceVO(hammersV3HammerPriceDTO.getDiscount(), hammersV3HammerPriceDTO.getText(), hammersV3HammerPriceDTO.getPrice(), hammersV3HammerPriceDTO.getStockBar());
        }
        return C7714v.a0(new OldHammersV3BodyVO(hashCode, image, floatValue, imageOverlayPicture, dsBadge, atomAction, tokenizedEvent$default, oldHammersV3ProductInfoVO, state.getHasHeader()));
    }
}
