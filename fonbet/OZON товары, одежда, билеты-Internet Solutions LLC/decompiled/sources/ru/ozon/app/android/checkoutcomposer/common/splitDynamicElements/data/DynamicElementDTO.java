package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data;

import B0.C2454a;
import Co.a;
import D3.g;
import El.C2971a;
import N3.C3660k;
import Ns.b;
import T7.E;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVOKt;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "annotation", type = DisclaimerAtom.class), @ProtoOneOfSignature(name = DynamicElementDTO.FORM, type = FormBuilderDTO.class), @ProtoOneOfSignature(name = DynamicElementDTO.CELL_REGULAR_PICKER, type = CellAtom.CellRegularPicker.class), @ProtoOneOfSignature(name = DynamicElementDTO.CELL_WITH_SUBTITLE_CHECKBOX_RADIO, type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio.class), @ProtoOneOfSignature(name = DynamicElementDTO.CELL_WITH_SUBTITLE_24_ICON_CHECKBOX_RADIO, type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconCheckboxRadio.class), @ProtoOneOfSignature(name = DynamicElementDTO.CELL_WITH_SUBTITLE_VALUE, type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleValue.class), @ProtoOneOfSignature(name = DynamicElementDTO.CELL_WITH_SUBTITLE_DEFAULT, type = CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault.class), @ProtoOneOfSignature(name = "cellWithSubtitle24Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = DynamicElementDTO.CELL_WITH_SUBTITLE_24_ICON_TOGGLE_COUNTER, type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter.class), @ProtoOneOfSignature(name = DynamicElementDTO.LARGE_BUTTON, type = ButtonV3Atom.LargeButton.class), @ProtoOneOfSignature(name = DynamicElementDTO.LOGOS_CAROUSEL, type = LogosCarouselDTO.class), @ProtoOneOfSignature(name = "separator", type = SeparatorDTO.class), @ProtoOneOfSignature(name = DynamicElementDTO.SMALL_BORDERLESS_BUTTON, type = ButtonV3Atom.SmallBorderlessButton.class), @ProtoOneOfSignature(name = "textAtom", type = TextAtom.class), @ProtoOneOfSignature(name = "verticalSpacer", type = VerticalSpacerDTO.class), @ProtoOneOfSignature(name = DynamicElementDTO.TABS, type = Tabs.class), @ProtoOneOfSignature(name = "progressiveText", type = ProgressiveTextWidgetDTO.ProgressiveTextDTO.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = DynamicElementDTO.PRODUCTS_BLOCK, type = ProductsBlockDTO.class), @ProtoOneOfSignature(name = "cellList", type = CheckoutCellListDTO.class), @ProtoOneOfSignature(name = DynamicElementDTO.TAG_LIST, type = TagListDTO.class)})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO;", "", "<init>", "()V", "Companion", "LogosCarouselDTO", "VerticalSpacerDTO", "SeparatorDTO", "ProductsBlockDTO", "TagListDTO", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$LogosCarouselDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$SeparatorDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$TagListDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$VerticalSpacerDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ProtoOneOf(label = "type")
/* loaded from: classes11.dex */
public abstract class DynamicElementDTO {
    public static final int $stable = 0;

    @NotNull
    public static final String ANNOTATION = "annotation";

    @NotNull
    public static final String CELL = "cell";

    @NotNull
    public static final String CELL_LIST = "cellList";

    @NotNull
    public static final String CELL_REGULAR_PICKER = "cellRegularPicker";

    @NotNull
    public static final String CELL_WITH_SUBTITLE_24ICON = "cellWithSubtitle24Icon";

    @NotNull
    public static final String CELL_WITH_SUBTITLE_24_ICON_CHECKBOX_RADIO = "cellWithSubtitle24IconCheckboxRadio";

    @NotNull
    public static final String CELL_WITH_SUBTITLE_24_ICON_TOGGLE_COUNTER = "cellWithSubtitle24IconToggleCounter";

    @NotNull
    public static final String CELL_WITH_SUBTITLE_CHECKBOX_RADIO = "cellWithSubtitleCheckboxRadio";

    @NotNull
    public static final String CELL_WITH_SUBTITLE_DEFAULT = "cellWithSubtitleDefault";

    @NotNull
    public static final String CELL_WITH_SUBTITLE_VALUE = "cellWithSubtitleValue";

    @NotNull
    public static final String FORM = "form";

    @NotNull
    public static final String LARGE_BUTTON = "largeButton";

    @NotNull
    public static final String LOGOS_CAROUSEL = "logosCarousel";

    @NotNull
    public static final String PRODUCTS_BLOCK = "productsBlock";

    @NotNull
    public static final String PROGRESSIVE_TEXT = "progressiveText";

    @NotNull
    public static final String SEPARATOR = "separator";

    @NotNull
    public static final String SMALL_BORDERLESS_BUTTON = "smallBorderlessButton";

    @NotNull
    public static final String TABS = "tabs";

    @NotNull
    public static final String TAG_LIST = "tagList";

    @NotNull
    public static final String TEXT_ATOM = "textAtom";

    @NotNull
    public static final String VERTICAL_SPACER = "verticalSpacer";

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J_\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "promotedProducts", "", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPromotedProducts", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PromotedProduct", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ProductsBlockDTO extends DynamicElementDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final BadgeDTO badge;
        private final List<PromotedProduct> promotedProducts;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct;", "", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIcon", "promoIconPosition", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "tooltip", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;)V", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPromoIcon", "getPromoIconPosition", "()Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "getTooltip", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ProductTooltip", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class PromotedProduct {
            public static final int $stable = 8;

            @NotNull
            private final IconDTO image;
            private final IconDTO promoIcon;
            private final PromoIconPosition promoIconPosition;
            private final ProductTooltip tooltip;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J^\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "", "backgroundColor", "", "message", "Lru/ozon/uni/atoms/data/text/TextDTO;", "closeIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "displayTimeInSeconds", "", "delayTimeInSeconds", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getMessage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCloseIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getDisplayTimeInSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDelayTimeInSeconds", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "equals", "", "other", "hashCode", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ProductTooltip {
                public static final int $stable = 8;
                private final String backgroundColor;

                @NotNull
                private final IconDTO closeIcon;
                private final Integer delayTimeInSeconds;
                private final Integer displayTimeInSeconds;

                @NotNull
                private final TextDTO message;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public ProductTooltip(String str, @NotNull TextDTO message, @NotNull IconDTO closeIcon, Integer num, Integer num2, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intrinsics.checkNotNullParameter(closeIcon, "closeIcon");
                    this.backgroundColor = str;
                    this.message = message;
                    this.closeIcon = closeIcon;
                    this.displayTimeInSeconds = num;
                    this.delayTimeInSeconds = num2;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ ProductTooltip copy$default(ProductTooltip productTooltip, String str, TextDTO textDTO, IconDTO iconDTO, Integer num, Integer num2, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = productTooltip.backgroundColor;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO = productTooltip.message;
                    }
                    if ((i11 & 4) != 0) {
                        iconDTO = productTooltip.closeIcon;
                    }
                    if ((i11 & 8) != 0) {
                        num = productTooltip.displayTimeInSeconds;
                    }
                    if ((i11 & 16) != 0) {
                        num2 = productTooltip.delayTimeInSeconds;
                    }
                    if ((i11 & 32) != 0) {
                        map = productTooltip.trackingInfo;
                    }
                    Integer num3 = num2;
                    Map map2 = map;
                    return productTooltip.copy(str, textDTO, iconDTO, num, num3, map2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final TextDTO getMessage() {
                    return this.message;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final IconDTO getCloseIcon() {
                    return this.closeIcon;
                }

                /* renamed from: component4, reason: from getter */
                public final Integer getDisplayTimeInSeconds() {
                    return this.displayTimeInSeconds;
                }

                /* renamed from: component5, reason: from getter */
                public final Integer getDelayTimeInSeconds() {
                    return this.delayTimeInSeconds;
                }

                public final Map<String, TokenizedTrackingInfo> component6() {
                    return this.trackingInfo;
                }

                @NotNull
                public final ProductTooltip copy(String backgroundColor, @NotNull TextDTO message, @NotNull IconDTO closeIcon, Integer displayTimeInSeconds, Integer delayTimeInSeconds, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intrinsics.checkNotNullParameter(closeIcon, "closeIcon");
                    return new ProductTooltip(backgroundColor, message, closeIcon, displayTimeInSeconds, delayTimeInSeconds, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ProductTooltip)) {
                        return false;
                    }
                    ProductTooltip productTooltip = (ProductTooltip) other;
                    return Intrinsics.d(this.backgroundColor, productTooltip.backgroundColor) && Intrinsics.d(this.message, productTooltip.message) && Intrinsics.d(this.closeIcon, productTooltip.closeIcon) && Intrinsics.d(this.displayTimeInSeconds, productTooltip.displayTimeInSeconds) && Intrinsics.d(this.delayTimeInSeconds, productTooltip.delayTimeInSeconds) && Intrinsics.d(this.trackingInfo, productTooltip.trackingInfo);
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                @NotNull
                public final IconDTO getCloseIcon() {
                    return this.closeIcon;
                }

                public final Integer getDelayTimeInSeconds() {
                    return this.delayTimeInSeconds;
                }

                public final Integer getDisplayTimeInSeconds() {
                    return this.displayTimeInSeconds;
                }

                @NotNull
                public final TextDTO getMessage() {
                    return this.message;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    String str = this.backgroundColor;
                    int a11 = C2971a.a(this.closeIcon, b.a(this.message, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
                    Integer num = this.displayTimeInSeconds;
                    int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.delayTimeInSeconds;
                    int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode2 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.backgroundColor;
                    TextDTO textDTO = this.message;
                    IconDTO iconDTO = this.closeIcon;
                    Integer num = this.displayTimeInSeconds;
                    Integer num2 = this.delayTimeInSeconds;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder b11 = a.b("ProductTooltip(backgroundColor=", textDTO, str, ", message=", ", closeIcon=");
                    b11.append(iconDTO);
                    b11.append(", displayTimeInSeconds=");
                    b11.append(num);
                    b11.append(", delayTimeInSeconds=");
                    b11.append(num2);
                    b11.append(", trackingInfo=");
                    b11.append(map);
                    b11.append(")");
                    return b11.toString();
                }
            }

            public PromotedProduct(@NotNull IconDTO image, IconDTO iconDTO, PromoIconPosition promoIconPosition, ProductTooltip productTooltip) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.promoIcon = iconDTO;
                this.promoIconPosition = promoIconPosition;
                this.tooltip = productTooltip;
            }

            public static /* synthetic */ PromotedProduct copy$default(PromotedProduct promotedProduct, IconDTO iconDTO, IconDTO iconDTO2, PromoIconPosition promoIconPosition, ProductTooltip productTooltip, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconDTO = promotedProduct.image;
                }
                if ((i11 & 2) != 0) {
                    iconDTO2 = promotedProduct.promoIcon;
                }
                if ((i11 & 4) != 0) {
                    promoIconPosition = promotedProduct.promoIconPosition;
                }
                if ((i11 & 8) != 0) {
                    productTooltip = promotedProduct.tooltip;
                }
                return promotedProduct.copy(iconDTO, iconDTO2, promoIconPosition, productTooltip);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IconDTO getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final IconDTO getPromoIcon() {
                return this.promoIcon;
            }

            /* renamed from: component3, reason: from getter */
            public final PromoIconPosition getPromoIconPosition() {
                return this.promoIconPosition;
            }

            /* renamed from: component4, reason: from getter */
            public final ProductTooltip getTooltip() {
                return this.tooltip;
            }

            @NotNull
            public final PromotedProduct copy(@NotNull IconDTO image, IconDTO promoIcon, PromoIconPosition promoIconPosition, ProductTooltip tooltip) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new PromotedProduct(image, promoIcon, promoIconPosition, tooltip);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PromotedProduct)) {
                    return false;
                }
                PromotedProduct promotedProduct = (PromotedProduct) other;
                return Intrinsics.d(this.image, promotedProduct.image) && Intrinsics.d(this.promoIcon, promotedProduct.promoIcon) && this.promoIconPosition == promotedProduct.promoIconPosition && Intrinsics.d(this.tooltip, promotedProduct.tooltip);
            }

            @NotNull
            public final IconDTO getImage() {
                return this.image;
            }

            public final IconDTO getPromoIcon() {
                return this.promoIcon;
            }

            public final PromoIconPosition getPromoIconPosition() {
                return this.promoIconPosition;
            }

            public final ProductTooltip getTooltip() {
                return this.tooltip;
            }

            public int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                IconDTO iconDTO = this.promoIcon;
                int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                PromoIconPosition promoIconPosition = this.promoIconPosition;
                int hashCode3 = (hashCode2 + (promoIconPosition == null ? 0 : promoIconPosition.hashCode())) * 31;
                ProductTooltip productTooltip = this.tooltip;
                return hashCode3 + (productTooltip != null ? productTooltip.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "PromotedProduct(image=" + this.image + ", promoIcon=" + this.promoIcon + ", promoIconPosition=" + this.promoIconPosition + ", tooltip=" + this.tooltip + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductsBlockDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, BadgeDTO badgeDTO, List<PromotedProduct> list, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
            this.badge = badgeDTO;
            this.promotedProducts = list;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ProductsBlockDTO copy$default(ProductsBlockDTO productsBlockDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, List list, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = productsBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = productsBlockDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = productsBlockDTO.badge;
            }
            if ((i11 & 8) != 0) {
                list = productsBlockDTO.promotedProducts;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = productsBlockDTO.action;
            }
            if ((i11 & 32) != 0) {
                map = productsBlockDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return productsBlockDTO.copy(textDTO, textDTO2, badgeDTO, list, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final List<PromotedProduct> component4() {
            return this.promotedProducts;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final ProductsBlockDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, BadgeDTO badge, List<PromotedProduct> promotedProducts, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new ProductsBlockDTO(title, subtitle, badge, promotedProducts, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsBlockDTO)) {
                return false;
            }
            ProductsBlockDTO productsBlockDTO = (ProductsBlockDTO) other;
            return Intrinsics.d(this.title, productsBlockDTO.title) && Intrinsics.d(this.subtitle, productsBlockDTO.subtitle) && Intrinsics.d(this.badge, productsBlockDTO.badge) && Intrinsics.d(this.promotedProducts, productsBlockDTO.promotedProducts) && Intrinsics.d(this.action, productsBlockDTO.action) && Intrinsics.d(this.trackingInfo, productsBlockDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final List<PromotedProduct> getPromotedProducts() {
            return this.promotedProducts;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.subtitle, this.title.hashCode() * 31, 31);
            BadgeDTO badgeDTO = this.badge;
            int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            List<PromotedProduct> list = this.promotedProducts;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            BadgeDTO badgeDTO = this.badge;
            List<PromotedProduct> list = this.promotedProducts;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder g10 = g.g("ProductsBlockDTO(title=", textDTO, ", subtitle=", textDTO2, ", badge=");
            g10.append(badgeDTO);
            g10.append(", promotedProducts=");
            g10.append(list);
            g10.append(", action=");
            return D40.a.d(g10, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$SeparatorDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO;", "color", "", "leftInset", "", "rightInset", "<init>", "(Ljava/lang/String;II)V", "getColor", "()Ljava/lang/String;", "getLeftInset", "()I", "getRightInset", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorDTO extends DynamicElementDTO {
        public static final int $stable = 0;

        @NotNull
        private final String color;
        private final int leftInset;
        private final int rightInset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SeparatorDTO(@NotNull String color, int i11, int i12) {
            super(null);
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
            this.leftInset = i11;
            this.rightInset = i12;
        }

        public static /* synthetic */ SeparatorDTO copy$default(SeparatorDTO separatorDTO, String str, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = separatorDTO.color;
            }
            if ((i13 & 2) != 0) {
                i11 = separatorDTO.leftInset;
            }
            if ((i13 & 4) != 0) {
                i12 = separatorDTO.rightInset;
            }
            return separatorDTO.copy(str, i11, i12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLeftInset() {
            return this.leftInset;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRightInset() {
            return this.rightInset;
        }

        @NotNull
        public final SeparatorDTO copy(@NotNull String color, int leftInset, int rightInset) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new SeparatorDTO(color, leftInset, rightInset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SeparatorDTO)) {
                return false;
            }
            SeparatorDTO separatorDTO = (SeparatorDTO) other;
            return Intrinsics.d(this.color, separatorDTO.color) && this.leftInset == separatorDTO.leftInset && this.rightInset == separatorDTO.rightInset;
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final int getLeftInset() {
            return this.leftInset;
        }

        public final int getRightInset() {
            return this.rightInset;
        }

        public int hashCode() {
            return Integer.hashCode(this.rightInset) + C2454a.a(this.leftInset, this.color.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.color;
            return K00.b.e(this.rightInset, ")", C3660k.c(this.leftInset, "SeparatorDTO(color=", str, ", leftInset=", ", rightInset="));
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$TagListDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO;", "buttons", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tooltip", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$TagListDTO$Tooltip;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$TagListDTO$Tooltip;)V", "getButtons", "()Ljava/util/List;", "getTooltip", "()Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$TagListDTO$Tooltip;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Tooltip", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TagListDTO extends DynamicElementDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<TagButtonDTO> buttons;
        private final Tooltip tooltip;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$TagListDTO$Tooltip;", "", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "index", "", "closeTimeout", "", "showDelay", "<init>", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;ILjava/lang/Long;Ljava/lang/Long;)V", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getIndex", "()I", "getCloseTimeout", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShowDelay", "toVO", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$TagListElement$Tooltip;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;ILjava/lang/Long;Ljava/lang/Long;)Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$TagListDTO$Tooltip;", "equals", "", "other", "hashCode", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tooltip {
            public static final int $stable = TooltipDTO.$stable;
            private final Long closeTimeout;
            private final int index;
            private final Long showDelay;

            @NotNull
            private final TooltipDTO tooltip;

            public Tooltip(@NotNull TooltipDTO tooltip, int i11, Long l11, Long l12) {
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                this.tooltip = tooltip;
                this.index = i11;
                this.closeTimeout = l11;
                this.showDelay = l12;
            }

            public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, TooltipDTO tooltipDTO, int i11, Long l11, Long l12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    tooltipDTO = tooltip.tooltip;
                }
                if ((i12 & 2) != 0) {
                    i11 = tooltip.index;
                }
                if ((i12 & 4) != 0) {
                    l11 = tooltip.closeTimeout;
                }
                if ((i12 & 8) != 0) {
                    l12 = tooltip.showDelay;
                }
                return tooltip.copy(tooltipDTO, i11, l11, l12);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TooltipDTO getTooltip() {
                return this.tooltip;
            }

            /* renamed from: component2, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getCloseTimeout() {
                return this.closeTimeout;
            }

            /* renamed from: component4, reason: from getter */
            public final Long getShowDelay() {
                return this.showDelay;
            }

            @NotNull
            public final Tooltip copy(@NotNull TooltipDTO tooltip, int index, Long closeTimeout, Long showDelay) {
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                return new Tooltip(tooltip, index, closeTimeout, showDelay);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Tooltip)) {
                    return false;
                }
                Tooltip tooltip = (Tooltip) other;
                return Intrinsics.d(this.tooltip, tooltip.tooltip) && this.index == tooltip.index && Intrinsics.d(this.closeTimeout, tooltip.closeTimeout) && Intrinsics.d(this.showDelay, tooltip.showDelay);
            }

            public final Long getCloseTimeout() {
                return this.closeTimeout;
            }

            public final int getIndex() {
                return this.index;
            }

            public final Long getShowDelay() {
                return this.showDelay;
            }

            @NotNull
            public final TooltipDTO getTooltip() {
                return this.tooltip;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.index, this.tooltip.hashCode() * 31, 31);
                Long l11 = this.closeTimeout;
                int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.showDelay;
                return hashCode + (l12 != null ? l12.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Tooltip(tooltip=" + this.tooltip + ", index=" + this.index + ", closeTimeout=" + this.closeTimeout + ", showDelay=" + this.showDelay + ")";
            }

            @NotNull
            public final SplitDynamicElementVO.TagListElement.Tooltip toVO() {
                return new SplitDynamicElementVO.TagListElement.Tooltip(CartTooltipVOKt.toCartTooltipVO(this.tooltip), this.index, this.closeTimeout, this.showDelay);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TagListDTO(@NotNull List<TagButtonDTO> buttons, Tooltip tooltip) {
            super(null);
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.buttons = buttons;
            this.tooltip = tooltip;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TagListDTO copy$default(TagListDTO tagListDTO, List list, Tooltip tooltip, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = tagListDTO.buttons;
            }
            if ((i11 & 2) != 0) {
                tooltip = tagListDTO.tooltip;
            }
            return tagListDTO.copy(list, tooltip);
        }

        @NotNull
        public final List<TagButtonDTO> component1() {
            return this.buttons;
        }

        /* renamed from: component2, reason: from getter */
        public final Tooltip getTooltip() {
            return this.tooltip;
        }

        @NotNull
        public final TagListDTO copy(@NotNull List<TagButtonDTO> buttons, Tooltip tooltip) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            return new TagListDTO(buttons, tooltip);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TagListDTO)) {
                return false;
            }
            TagListDTO tagListDTO = (TagListDTO) other;
            return Intrinsics.d(this.buttons, tagListDTO.buttons) && Intrinsics.d(this.tooltip, tagListDTO.tooltip);
        }

        @NotNull
        public final List<TagButtonDTO> getButtons() {
            return this.buttons;
        }

        public final Tooltip getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            int hashCode = this.buttons.hashCode() * 31;
            Tooltip tooltip = this.tooltip;
            return hashCode + (tooltip == null ? 0 : tooltip.hashCode());
        }

        @NotNull
        public String toString() {
            return "TagListDTO(buttons=" + this.buttons + ", tooltip=" + this.tooltip + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$VerticalSpacerDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO;", "spacing", "", "<init>", "(I)V", "getSpacing", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerticalSpacerDTO extends DynamicElementDTO {
        public static final int $stable = 0;
        private final int spacing;

        public VerticalSpacerDTO(int i11) {
            super(null);
            this.spacing = i11;
        }

        public static /* synthetic */ VerticalSpacerDTO copy$default(VerticalSpacerDTO verticalSpacerDTO, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = verticalSpacerDTO.spacing;
            }
            return verticalSpacerDTO.copy(i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSpacing() {
            return this.spacing;
        }

        @NotNull
        public final VerticalSpacerDTO copy(int spacing) {
            return new VerticalSpacerDTO(spacing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalSpacerDTO) && this.spacing == ((VerticalSpacerDTO) other).spacing;
        }

        public final int getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            return Integer.hashCode(this.spacing);
        }

        @NotNull
        public String toString() {
            return E.a(this.spacing, "VerticalSpacerDTO(spacing=", ")");
        }
    }

    public /* synthetic */ DynamicElementDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DynamicElementDTO() {
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$LogosCarouselDTO;", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO;", "elements", "", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$LogosCarouselDTO$LogosElement;", "scrollPosition", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getElements", "()Ljava/util/List;", "getScrollPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$LogosCarouselDTO;", "equals", "", "other", "", "hashCode", "toString", "", "LogosElement", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class LogosCarouselDTO extends DynamicElementDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<LogosElement> elements;
        private final Integer scrollPosition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogosCarouselDTO(@NotNull List<LogosElement> elements, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
            this.scrollPosition = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LogosCarouselDTO copy$default(LogosCarouselDTO logosCarouselDTO, List list, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = logosCarouselDTO.elements;
            }
            if ((i11 & 2) != 0) {
                num = logosCarouselDTO.scrollPosition;
            }
            return logosCarouselDTO.copy(list, num);
        }

        @NotNull
        public final List<LogosElement> component1() {
            return this.elements;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getScrollPosition() {
            return this.scrollPosition;
        }

        @NotNull
        public final LogosCarouselDTO copy(@NotNull List<LogosElement> elements, Integer scrollPosition) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new LogosCarouselDTO(elements, scrollPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogosCarouselDTO)) {
                return false;
            }
            LogosCarouselDTO logosCarouselDTO = (LogosCarouselDTO) other;
            return Intrinsics.d(this.elements, logosCarouselDTO.elements) && Intrinsics.d(this.scrollPosition, logosCarouselDTO.scrollPosition);
        }

        @NotNull
        public final List<LogosElement> getElements() {
            return this.elements;
        }

        public final Integer getScrollPosition() {
            return this.scrollPosition;
        }

        public int hashCode() {
            int hashCode = this.elements.hashCode() * 31;
            Integer num = this.scrollPosition;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "LogosCarouselDTO(elements=" + this.elements + ", scrollPosition=" + this.scrollPosition + ")";
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jx\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\r\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u00061"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$LogosCarouselDTO$LogosElement;", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isSelectable", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtext", "<init>", "(ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Boolean;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "()Z", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtext", "toVO", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO$LogosCarousel$LogosElement;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Boolean;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;)Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$LogosCarouselDTO$LogosElement;", "equals", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LogosElement {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final Boolean isSelectable;
            private final boolean isSelected;
            private final OzonSpannableString subtext;
            private final TextDTO subtitle;
            private final OzonSpannableString text;
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public LogosElement(boolean z11, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Boolean bool, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2) {
                this.isSelected = z11;
                this.title = textDTO;
                this.subtitle = textDTO2;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.isSelectable = bool;
                this.text = ozonSpannableString;
                this.subtext = ozonSpannableString2;
            }

            public static /* synthetic */ LogosElement copy$default(LogosElement logosElement, boolean z11, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, Map map, Boolean bool, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = logosElement.isSelected;
                }
                if ((i11 & 2) != 0) {
                    textDTO = logosElement.title;
                }
                if ((i11 & 4) != 0) {
                    textDTO2 = logosElement.subtitle;
                }
                if ((i11 & 8) != 0) {
                    atomActionDTO = logosElement.action;
                }
                if ((i11 & 16) != 0) {
                    map = logosElement.trackingInfo;
                }
                if ((i11 & 32) != 0) {
                    bool = logosElement.isSelectable;
                }
                if ((i11 & 64) != 0) {
                    ozonSpannableString = logosElement.text;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    ozonSpannableString2 = logosElement.subtext;
                }
                OzonSpannableString ozonSpannableString3 = ozonSpannableString;
                OzonSpannableString ozonSpannableString4 = ozonSpannableString2;
                Map map2 = map;
                Boolean bool2 = bool;
                return logosElement.copy(z11, textDTO, textDTO2, atomActionDTO, map2, bool2, ozonSpannableString3, ozonSpannableString4);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            /* renamed from: component6, reason: from getter */
            public final Boolean getIsSelectable() {
                return this.isSelectable;
            }

            /* renamed from: component7, reason: from getter */
            public final OzonSpannableString getText() {
                return this.text;
            }

            /* renamed from: component8, reason: from getter */
            public final OzonSpannableString getSubtext() {
                return this.subtext;
            }

            @NotNull
            public final LogosElement copy(boolean isSelected, TextDTO title, TextDTO subtitle, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean isSelectable, OzonSpannableString text, OzonSpannableString subtext) {
                return new LogosElement(isSelected, title, subtitle, action, trackingInfo, isSelectable, text, subtext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LogosElement)) {
                    return false;
                }
                LogosElement logosElement = (LogosElement) other;
                return this.isSelected == logosElement.isSelected && Intrinsics.d(this.title, logosElement.title) && Intrinsics.d(this.subtitle, logosElement.subtitle) && Intrinsics.d(this.action, logosElement.action) && Intrinsics.d(this.trackingInfo, logosElement.trackingInfo) && Intrinsics.d(this.isSelectable, logosElement.isSelectable) && Intrinsics.d(this.text, logosElement.text) && Intrinsics.d(this.subtext, logosElement.subtext);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final OzonSpannableString getSubtext() {
                return this.subtext;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            public final OzonSpannableString getText() {
                return this.text;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.isSelected) * 31;
                TextDTO textDTO = this.title;
                int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                TextDTO textDTO2 = this.subtitle;
                int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
                Boolean bool = this.isSelectable;
                int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                OzonSpannableString ozonSpannableString = this.text;
                int hashCode7 = (hashCode6 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
                OzonSpannableString ozonSpannableString2 = this.subtext;
                return hashCode7 + (ozonSpannableString2 != null ? ozonSpannableString2.hashCode() : 0);
            }

            public final Boolean isSelectable() {
                return this.isSelectable;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                return "LogosElement(isSelected=" + this.isSelected + ", title=" + this.title + ", subtitle=" + this.subtitle + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", isSelectable=" + this.isSelectable + ", text=" + ((Object) this.text) + ", subtext=" + ((Object) this.subtext) + ")";
            }

            @NotNull
            public final SplitDynamicElementVO.LogosCarousel.LogosElement toVO() {
                Integer num;
                TextDTO textDTO;
                TextDTO textDTO2;
                boolean z11 = this.isSelected;
                TextDTO textDTO3 = this.title;
                boolean z12 = true;
                if (textDTO3 == null || (textDTO = TextDTO.copy$default(textDTO3, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null)) == null) {
                    OzonSpannableString ozonSpannableString = this.text;
                    if (ozonSpannableString == null) {
                        ozonSpannableString = new OzonSpannableString();
                    }
                    num = 1;
                    textDTO = new TextDTO(ozonSpannableString, null, null, null, null, null, TextPreset.PRESET_CUSTOM, "tsBody400Small", "textPrimary", null, null, null, null, true, null, null, null, null, num, 253502, null);
                } else {
                    num = 1;
                }
                TextDTO textDTO4 = this.subtitle;
                if (textDTO4 == null || (textDTO2 = TextDTO.copy$default(textDTO4, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null)) == null) {
                    OzonSpannableString ozonSpannableString2 = this.subtext;
                    textDTO2 = ozonSpannableString2 != null ? new TextDTO(ozonSpannableString2, null, null, null, null, null, TextPreset.PRESET_CUSTOM, "tsCompact300XSmall", "textSecondary", null, null, null, null, true, null, null, null, null, num, 253502, null) : null;
                }
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (this.title != null) {
                    Boolean bool = this.isSelectable;
                    z12 = bool != null ? bool.booleanValue() : false;
                }
                return new SplitDynamicElementVO.LogosCarousel.LogosElement(z11, textDTO, textDTO2, atomActionDTO, map, z12);
            }

            public /* synthetic */ LogosElement(boolean z11, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, Map map, Boolean bool, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? false : z11, textDTO, textDTO2, atomActionDTO, map, bool, ozonSpannableString, ozonSpannableString2);
            }
        }
    }
}
