package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core;

import Xc.a;
import Xc.b;
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
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.Background;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.ExtendedPrice;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$AccentPrice;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$TypedPrice;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.StyledText;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DTO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data.PriceV2DtoWrapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price.PriceV2MainPriceVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001(B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020!*\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2MainMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Price;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/price/PriceV2MainPriceVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;", "extractPrice", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Price;)Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$TypedPrice;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "toExtendedPrice", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;)Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;", "toStyledText", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceComponent;)Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon;", "priceContainer", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconWithPosition;", "toVoIcon", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;)Lru/ozon/app/android/pdp/ui/configurators/pdp/price/ExtendedPrice$IconWithPosition;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$AccentPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$AccentPrice;", "toVo", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$AccentPrice;)Lru/ozon/app/android/pdp/ui/configurators/pdp/price/PriceV2VO$AccentPrice;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "extractBackground", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$AccentPrice;)Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient$Style;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Orientation;", "toOrientation", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient$Style;)Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Orientation;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DtoWrapper$Price;Ll20/d;)Ljava/util/List;", "ViewTypePrice", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV2MainMapper implements Function2<PriceV2DtoWrapper.Price, d, List<? extends PriceV2MainPriceVO>> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2MainMapper$ViewTypePrice;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR_PRICE", "OZON_CARD_PRICE", "VAT_PRICE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ViewTypePrice {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewTypePrice[] $VALUES;
        public static final ViewTypePrice REGULAR_PRICE = new ViewTypePrice("REGULAR_PRICE", 0);
        public static final ViewTypePrice OZON_CARD_PRICE = new ViewTypePrice("OZON_CARD_PRICE", 1);
        public static final ViewTypePrice VAT_PRICE = new ViewTypePrice("VAT_PRICE", 2);

        private static final /* synthetic */ ViewTypePrice[] $values() {
            return new ViewTypePrice[]{REGULAR_PRICE, OZON_CARD_PRICE, VAT_PRICE};
        }

        static {
            ViewTypePrice[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewTypePrice(String str, int i11) {
        }

        public static ViewTypePrice valueOf(String str) {
            return (ViewTypePrice) Enum.valueOf(ViewTypePrice.class, str);
        }

        public static ViewTypePrice[] values() {
            return (ViewTypePrice[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PriceV2DTO.Icon.Position.values().length];
            try {
                iArr[PriceV2DTO.Icon.Position.AFTER_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceV2DTO.Icon.Position.AFTER_DESCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PriceV2DTO.Gradient.Style.values().length];
            try {
                iArr2[PriceV2DTO.Gradient.Style.GRADIENT_STYLE_TYPE_LEFT_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PriceV2DTO.Gradient.Style.GRADIENT_STYLE_TYPE_TOP_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PriceV2DTO.Gradient.Style.GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PriceV2DTO.Gradient.Style.GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final Background extractBackground(PriceV2DTO.AccentPrice accentPrice) {
        if (accentPrice.getGradientBackground() != null) {
            return new Background.Gradient(accentPrice.getGradientBackground().getColors(), toOrientation(accentPrice.getGradientBackground().getStyle()));
        }
        if (accentPrice.getSolidBackground() != null) {
            return new Background.Solid(accentPrice.getSolidBackground());
        }
        return null;
    }

    private final PriceV2VO$TypedPrice extractPrice(PriceV2DtoWrapper.Price price) {
        if (price.getOrdinaryPrice() != null) {
            return new PriceV2VO$TypedPrice.RegularPrice(toExtendedPrice(price.getOrdinaryPrice()), ViewTypePrice.REGULAR_PRICE.ordinal());
        }
        if (price.getOzonCardPrice() != null) {
            return new PriceV2VO$TypedPrice.OzonCardPrice(toVo(price.getOzonCardPrice().getAccentPrice()), toExtendedPrice(price.getOzonCardPrice().getPrice()), ViewTypePrice.OZON_CARD_PRICE.ordinal());
        }
        if (price.getVatPrice() == null) {
            throw new IllegalStateException("PriceV2DTO doesn't contain any Price: " + price);
        }
        PriceV2DTO.PriceContainer priceWithVAT = price.getVatPrice().getPriceWithVAT();
        ExtendedPrice extendedPrice = priceWithVAT != null ? toExtendedPrice(priceWithVAT) : null;
        PriceV2DTO.PriceContainer priceWithoutVAT = price.getVatPrice().getPriceWithoutVAT();
        return new PriceV2VO$TypedPrice.VATPrice(extendedPrice, priceWithoutVAT != null ? toExtendedPrice(priceWithoutVAT) : null, ViewTypePrice.VAT_PRICE.ordinal());
    }

    private final ExtendedPrice toExtendedPrice(PriceV2DTO.PriceContainer priceContainer) {
        StyledText styledText = toStyledText(priceContainer.getPrice().getPrice());
        PriceV2DTO.PriceComponent originalPrice = priceContainer.getPrice().getOriginalPrice();
        StyledText styledText2 = originalPrice != null ? toStyledText(originalPrice) : null;
        PriceV2DTO.PriceComponent priceDescription = priceContainer.getPrice().getPriceDescription();
        StyledText styledText3 = priceDescription != null ? toStyledText(priceDescription) : null;
        TextAtom description = priceContainer.getDescription();
        TextDTO dsTextAtom = description != null ? TextMapperKt.getDsTextAtom(description) : null;
        PriceV2DTO.Icon icon = priceContainer.getIcon();
        ExtendedPrice.IconWithPosition voIcon = icon != null ? toVoIcon(icon, priceContainer) : null;
        String strikethroughColor = priceContainer.getPrice().getStrikethroughColor();
        AtomActionDTO action = priceContainer.getAction();
        return new ExtendedPrice(styledText, styledText2, styledText3, dsTextAtom, voIcon, strikethroughColor, action != null ? AtomActionMapperKt.toAtomAction(action, priceContainer.getTrackingInfo()) : null);
    }

    private final Background.Orientation toOrientation(PriceV2DTO.Gradient.Style style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$1[style.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? Background.Orientation.LEFT_RIGHT : Background.Orientation.TOP_RIGHT_LEFT_BOTTOM : Background.Orientation.TOP_LEFT_RIGHT_BOTTOM : Background.Orientation.TOP_BOTTOM : Background.Orientation.LEFT_RIGHT;
    }

    private final StyledText toStyledText(PriceV2DTO.PriceComponent priceComponent) {
        return new StyledText(priceComponent.getText(), priceComponent.getColor(), StyleParser.INSTANCE.parseTextStyle(priceComponent.getStyle()));
    }

    private final PriceV2VO$AccentPrice toVo(PriceV2DTO.AccentPrice accentPrice) {
        ExtendedPrice extendedPrice = toExtendedPrice(accentPrice.getPrice());
        Background extractBackground = extractBackground(accentPrice);
        String disclosureTintColor = accentPrice.getDisclosureTintColor();
        AtomActionDTO action = accentPrice.getAction();
        return new PriceV2VO$AccentPrice(extendedPrice, action != null ? AtomActionMapperKt.toAtomAction(action, accentPrice.getTrackingInfo()) : null, extractBackground, disclosureTintColor);
    }

    private final ExtendedPrice.IconWithPosition toVoIcon(PriceV2DTO.Icon icon, PriceV2DTO.PriceContainer priceContainer) {
        PriceV2DTO.Icon.Position position = icon.getPosition();
        int i11 = position == null ? -1 : WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        ExtendedPrice.IconPosition iconPosition = i11 != 1 ? i11 != 2 ? ExtendedPrice.IconPosition.AFTER_DESCRIPTION : ExtendedPrice.IconPosition.AFTER_DESCRIPTION : ExtendedPrice.IconPosition.AFTER_PRICE;
        if (iconPosition == ExtendedPrice.IconPosition.AFTER_DESCRIPTION && priceContainer.getDescription() == null) {
            return null;
        }
        return new ExtendedPrice.IconWithPosition(icon.getIcon(), iconPosition);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PriceV2MainPriceVO> invoke(@NotNull PriceV2DtoWrapper.Price state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        CornersConfig cornersConfig = (state.getIsLastItem() && state.getShowBottomRounding().booleanValue()) ? CornersConfig.ALL : CornersConfig.TOP;
        PriceV2VO$TypedPrice extractPrice = extractPrice(state);
        int dp_12 = state.getIsLastItem() ? Dimens.INSTANCE.getDP_12() : 0;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new PriceV2MainPriceVO(widgetId, cornersConfig, extractPrice, dp_12, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null));
    }
}
