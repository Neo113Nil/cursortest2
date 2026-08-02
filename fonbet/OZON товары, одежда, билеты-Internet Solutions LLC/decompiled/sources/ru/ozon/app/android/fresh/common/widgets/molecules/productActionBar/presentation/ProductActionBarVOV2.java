package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation;

import B0.A0;
import B0.C2454a;
import G.g;
import Nh.a;
import Tl.b;
import Ve.C4598rp;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u0003./0B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016JH\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "", "", "widgetId", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;", "outOfStockActionIcon", "adultActionIcon", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;", "quantityPicker", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$CustomStyleVO;", "customStyle", "<init>", "(JLru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$CustomStyleVO;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarType;", "getType", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarType;", "currentQuantityPicker", "", "newValue", "", "isIncrementDisabled", "copyWithNewQuantity", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;IZ)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "copy", "(JLru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$CustomStyleVO;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;", "getOutOfStockActionIcon", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;", "getAdultActionIcon", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;", "getQuantityPicker", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$CustomStyleVO;", "getCustomStyle", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$CustomStyleVO;", "ActionIconVO", "QuantityPickerVO", "CustomStyleVO", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductActionBarVOV2 {
    private final ActionIconVO adultActionIcon;

    @NotNull
    private final CustomStyleVO customStyle;
    private final ActionIconVO outOfStockActionIcon;
    private final QuantityPickerVO quantityPicker;
    private final long widgetId;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;", "", "", "iconToken", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconToken", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionIconVO {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final String iconToken;
        private final t tokenizedEvent;

        public ActionIconVO(@NotNull String iconToken, @NotNull AtomAction action, t tVar) {
            Intrinsics.checkNotNullParameter(iconToken, "iconToken");
            Intrinsics.checkNotNullParameter(action, "action");
            this.iconToken = iconToken;
            this.action = action;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionIconVO)) {
                return false;
            }
            ActionIconVO actionIconVO = (ActionIconVO) other;
            return Intrinsics.d(this.iconToken, actionIconVO.iconToken) && Intrinsics.d(this.action, actionIconVO.action) && Intrinsics.d(this.tokenizedEvent, actionIconVO.tokenizedEvent);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getIconToken() {
            return this.iconToken;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, this.iconToken.hashCode() * 31, 31);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.iconToken;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("ActionIconVO(iconToken=");
            sb2.append(str);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", tokenizedEvent=");
            return b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$CustomStyleVO;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "sizeToken", "", "sizePx", "", "backgroundColorToken", "iconColorToken", "marginPx", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;ILjava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "getSizeToken", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO$Sizes;", "I", "getSizePx", "Ljava/lang/String;", "getBackgroundColorToken", "getIconColorToken", "getMarginPx", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomStyleVO {
        private final String backgroundColorToken;
        private final String iconColorToken;
        private final int marginPx;
        private final int sizePx;

        @NotNull
        private final IconButtonV3DTO.Sizes sizeToken;

        public CustomStyleVO(@NotNull IconButtonV3DTO.Sizes sizeToken, int i11, String str, String str2, int i12) {
            Intrinsics.checkNotNullParameter(sizeToken, "sizeToken");
            this.sizeToken = sizeToken;
            this.sizePx = i11;
            this.backgroundColorToken = str;
            this.iconColorToken = str2;
            this.marginPx = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomStyleVO)) {
                return false;
            }
            CustomStyleVO customStyleVO = (CustomStyleVO) other;
            return this.sizeToken == customStyleVO.sizeToken && this.sizePx == customStyleVO.sizePx && Intrinsics.d(this.backgroundColorToken, customStyleVO.backgroundColorToken) && Intrinsics.d(this.iconColorToken, customStyleVO.iconColorToken) && this.marginPx == customStyleVO.marginPx;
        }

        public final String getBackgroundColorToken() {
            return this.backgroundColorToken;
        }

        public final String getIconColorToken() {
            return this.iconColorToken;
        }

        public final int getMarginPx() {
            return this.marginPx;
        }

        public final int getSizePx() {
            return this.sizePx;
        }

        @NotNull
        public final IconButtonV3DTO.Sizes getSizeToken() {
            return this.sizeToken;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.sizePx, this.sizeToken.hashCode() * 31, 31);
            String str = this.backgroundColorToken;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.iconColorToken;
            return Integer.hashCode(this.marginPx) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO.Sizes sizes = this.sizeToken;
            int i11 = this.sizePx;
            String str = this.backgroundColorToken;
            String str2 = this.iconColorToken;
            int i12 = this.marginPx;
            StringBuilder sb2 = new StringBuilder("CustomStyleVO(sizeToken=");
            sb2.append(sizes);
            sb2.append(", sizePx=");
            sb2.append(i11);
            sb2.append(", backgroundColorToken=");
            a.h(sb2, str, ", iconColorToken=", str2, ", marginPx=");
            return K00.b.e(i12, ")", sb2);
        }
    }

    public ProductActionBarVOV2(long j11, ActionIconVO actionIconVO, ActionIconVO actionIconVO2, QuantityPickerVO quantityPickerVO, @NotNull CustomStyleVO customStyle) {
        Intrinsics.checkNotNullParameter(customStyle, "customStyle");
        this.widgetId = j11;
        this.outOfStockActionIcon = actionIconVO;
        this.adultActionIcon = actionIconVO2;
        this.quantityPicker = quantityPickerVO;
        this.customStyle = customStyle;
    }

    public static /* synthetic */ ProductActionBarVOV2 copy$default(ProductActionBarVOV2 productActionBarVOV2, long j11, ActionIconVO actionIconVO, ActionIconVO actionIconVO2, QuantityPickerVO quantityPickerVO, CustomStyleVO customStyleVO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = productActionBarVOV2.widgetId;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            actionIconVO = productActionBarVOV2.outOfStockActionIcon;
        }
        ActionIconVO actionIconVO3 = actionIconVO;
        if ((i11 & 4) != 0) {
            actionIconVO2 = productActionBarVOV2.adultActionIcon;
        }
        ActionIconVO actionIconVO4 = actionIconVO2;
        if ((i11 & 8) != 0) {
            quantityPickerVO = productActionBarVOV2.quantityPicker;
        }
        QuantityPickerVO quantityPickerVO2 = quantityPickerVO;
        if ((i11 & 16) != 0) {
            customStyleVO = productActionBarVOV2.customStyle;
        }
        return productActionBarVOV2.copy(j12, actionIconVO3, actionIconVO4, quantityPickerVO2, customStyleVO);
    }

    @NotNull
    public final ProductActionBarVOV2 copy(long widgetId, ActionIconVO outOfStockActionIcon, ActionIconVO adultActionIcon, QuantityPickerVO quantityPicker, @NotNull CustomStyleVO customStyle) {
        Intrinsics.checkNotNullParameter(customStyle, "customStyle");
        return new ProductActionBarVOV2(widgetId, outOfStockActionIcon, adultActionIcon, quantityPicker, customStyle);
    }

    @NotNull
    public final ProductActionBarVOV2 copyWithNewQuantity(@NotNull QuantityPickerVO currentQuantityPicker, int newValue, boolean isIncrementDisabled) {
        Intrinsics.checkNotNullParameter(currentQuantityPicker, "currentQuantityPicker");
        return copy$default(this, 0L, null, null, QuantityPickerVO.copy$default(currentQuantityPicker, 0L, null, newValue, TextDTO.copy$default(currentQuantityPicker.getValueText(), new OzonSpannableString(String.valueOf(newValue)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, null, 0, 0, 0, 0, null, null, null, isIncrementDisabled, 8179, null), null, 23, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductActionBarVOV2)) {
            return false;
        }
        ProductActionBarVOV2 productActionBarVOV2 = (ProductActionBarVOV2) other;
        return this.widgetId == productActionBarVOV2.widgetId && Intrinsics.d(this.outOfStockActionIcon, productActionBarVOV2.outOfStockActionIcon) && Intrinsics.d(this.adultActionIcon, productActionBarVOV2.adultActionIcon) && Intrinsics.d(this.quantityPicker, productActionBarVOV2.quantityPicker) && Intrinsics.d(this.customStyle, productActionBarVOV2.customStyle);
    }

    public final ActionIconVO getAdultActionIcon() {
        return this.adultActionIcon;
    }

    @NotNull
    public final CustomStyleVO getCustomStyle() {
        return this.customStyle;
    }

    public final ActionIconVO getOutOfStockActionIcon() {
        return this.outOfStockActionIcon;
    }

    public final QuantityPickerVO getQuantityPicker() {
        return this.quantityPicker;
    }

    @NotNull
    public final ProductActionBarType getType() {
        if (this.outOfStockActionIcon != null) {
            return ProductActionBarType.OUT_OF_STOCK;
        }
        if (this.adultActionIcon != null) {
            return ProductActionBarType.BUTTON_ADULT;
        }
        QuantityPickerVO quantityPickerVO = this.quantityPicker;
        return (quantityPickerVO == null || quantityPickerVO.getValue() <= 0) ? ProductActionBarType.BUTTON_A2C : ProductActionBarType.QUANTITY_PICKER;
    }

    public final long getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.widgetId) * 31;
        ActionIconVO actionIconVO = this.outOfStockActionIcon;
        int hashCode2 = (hashCode + (actionIconVO == null ? 0 : actionIconVO.hashCode())) * 31;
        ActionIconVO actionIconVO2 = this.adultActionIcon;
        int hashCode3 = (hashCode2 + (actionIconVO2 == null ? 0 : actionIconVO2.hashCode())) * 31;
        QuantityPickerVO quantityPickerVO = this.quantityPicker;
        return this.customStyle.hashCode() + ((hashCode3 + (quantityPickerVO != null ? quantityPickerVO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ProductActionBarVOV2(widgetId=" + this.widgetId + ", outOfStockActionIcon=" + this.outOfStockActionIcon + ", adultActionIcon=" + this.adultActionIcon + ", quantityPicker=" + this.quantityPicker + ", customStyle=" + this.customStyle + ")";
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ®\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b5\u0010 R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b6\u0010 R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b7\u0010 R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b8\u0010 R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b;\u0010\u001eR%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b\u0018\u0010@¨\u0006A"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;", "", "", "sku", "selectedDeliverySchema", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/atoms/data/text/TextDTO;", "valueText", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;", "cartActionIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "additionalAction", "minValue", "maxValue", "multiplicity", "quantSize", "", "decrementIconToken", "incrementIconToken", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "isIncrementDisabled", "<init>", "(JLjava/lang/Long;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;Lru/ozon/uni/atoms/af/AtomAction;IIIILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "copy", "(JLjava/lang/Long;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;Lru/ozon/uni/atoms/af/AtomAction;IIIILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "I", "getValue", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getValueText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;", "getCartActionIcon", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAdditionalAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getMinValue", "getMaxValue", "getMultiplicity", "getQuantSize", "Ljava/lang/String;", "getDecrementIconToken", "getIncrementIconToken", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Z", "()Z", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuantityPickerVO {
        private final AtomAction additionalAction;

        @NotNull
        private final ActionIconVO cartActionIcon;

        @NotNull
        private final String decrementIconToken;

        @NotNull
        private final String incrementIconToken;
        private final boolean isIncrementDisabled;
        private final int maxValue;
        private final int minValue;
        private final int multiplicity;
        private final int quantSize;
        private final Long selectedDeliverySchema;
        private final long sku;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final int value;

        @NotNull
        private final TextDTO valueText;

        public QuantityPickerVO(long j11, Long l11, int i11, @NotNull TextDTO valueText, @NotNull ActionIconVO cartActionIcon, AtomAction atomAction, int i12, int i13, int i14, int i15, @NotNull String decrementIconToken, @NotNull String incrementIconToken, Map<String, TokenizedTrackingInfo> map, boolean z11) {
            Intrinsics.checkNotNullParameter(valueText, "valueText");
            Intrinsics.checkNotNullParameter(cartActionIcon, "cartActionIcon");
            Intrinsics.checkNotNullParameter(decrementIconToken, "decrementIconToken");
            Intrinsics.checkNotNullParameter(incrementIconToken, "incrementIconToken");
            this.sku = j11;
            this.selectedDeliverySchema = l11;
            this.value = i11;
            this.valueText = valueText;
            this.cartActionIcon = cartActionIcon;
            this.additionalAction = atomAction;
            this.minValue = i12;
            this.maxValue = i13;
            this.multiplicity = i14;
            this.quantSize = i15;
            this.decrementIconToken = decrementIconToken;
            this.incrementIconToken = incrementIconToken;
            this.trackingInfo = map;
            this.isIncrementDisabled = z11;
        }

        public static /* synthetic */ QuantityPickerVO copy$default(QuantityPickerVO quantityPickerVO, long j11, Long l11, int i11, TextDTO textDTO, ActionIconVO actionIconVO, AtomAction atomAction, int i12, int i13, int i14, int i15, String str, String str2, Map map, boolean z11, int i16, Object obj) {
            return quantityPickerVO.copy((i16 & 1) != 0 ? quantityPickerVO.sku : j11, (i16 & 2) != 0 ? quantityPickerVO.selectedDeliverySchema : l11, (i16 & 4) != 0 ? quantityPickerVO.value : i11, (i16 & 8) != 0 ? quantityPickerVO.valueText : textDTO, (i16 & 16) != 0 ? quantityPickerVO.cartActionIcon : actionIconVO, (i16 & 32) != 0 ? quantityPickerVO.additionalAction : atomAction, (i16 & 64) != 0 ? quantityPickerVO.minValue : i12, (i16 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? quantityPickerVO.maxValue : i13, (i16 & 256) != 0 ? quantityPickerVO.multiplicity : i14, (i16 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? quantityPickerVO.quantSize : i15, (i16 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? quantityPickerVO.decrementIconToken : str, (i16 & 2048) != 0 ? quantityPickerVO.incrementIconToken : str2, (i16 & 4096) != 0 ? quantityPickerVO.trackingInfo : map, (i16 & 8192) != 0 ? quantityPickerVO.isIncrementDisabled : z11);
        }

        @NotNull
        public final QuantityPickerVO copy(long sku, Long selectedDeliverySchema, int value, @NotNull TextDTO valueText, @NotNull ActionIconVO cartActionIcon, AtomAction additionalAction, int minValue, int maxValue, int multiplicity, int quantSize, @NotNull String decrementIconToken, @NotNull String incrementIconToken, Map<String, TokenizedTrackingInfo> trackingInfo, boolean isIncrementDisabled) {
            Intrinsics.checkNotNullParameter(valueText, "valueText");
            Intrinsics.checkNotNullParameter(cartActionIcon, "cartActionIcon");
            Intrinsics.checkNotNullParameter(decrementIconToken, "decrementIconToken");
            Intrinsics.checkNotNullParameter(incrementIconToken, "incrementIconToken");
            return new QuantityPickerVO(sku, selectedDeliverySchema, value, valueText, cartActionIcon, additionalAction, minValue, maxValue, multiplicity, quantSize, decrementIconToken, incrementIconToken, trackingInfo, isIncrementDisabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityPickerVO)) {
                return false;
            }
            QuantityPickerVO quantityPickerVO = (QuantityPickerVO) other;
            return this.sku == quantityPickerVO.sku && Intrinsics.d(this.selectedDeliverySchema, quantityPickerVO.selectedDeliverySchema) && this.value == quantityPickerVO.value && Intrinsics.d(this.valueText, quantityPickerVO.valueText) && Intrinsics.d(this.cartActionIcon, quantityPickerVO.cartActionIcon) && Intrinsics.d(this.additionalAction, quantityPickerVO.additionalAction) && this.minValue == quantityPickerVO.minValue && this.maxValue == quantityPickerVO.maxValue && this.multiplicity == quantityPickerVO.multiplicity && this.quantSize == quantityPickerVO.quantSize && Intrinsics.d(this.decrementIconToken, quantityPickerVO.decrementIconToken) && Intrinsics.d(this.incrementIconToken, quantityPickerVO.incrementIconToken) && Intrinsics.d(this.trackingInfo, quantityPickerVO.trackingInfo) && this.isIncrementDisabled == quantityPickerVO.isIncrementDisabled;
        }

        public final AtomAction getAdditionalAction() {
            return this.additionalAction;
        }

        @NotNull
        public final ActionIconVO getCartActionIcon() {
            return this.cartActionIcon;
        }

        @NotNull
        public final String getDecrementIconToken() {
            return this.decrementIconToken;
        }

        @NotNull
        public final String getIncrementIconToken() {
            return this.incrementIconToken;
        }

        public final int getMaxValue() {
            return this.maxValue;
        }

        public final int getMinValue() {
            return this.minValue;
        }

        public final int getMultiplicity() {
            return this.multiplicity;
        }

        public final int getQuantSize() {
            return this.quantSize;
        }

        public final Long getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        public final long getSku() {
            return this.sku;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final int getValue() {
            return this.value;
        }

        @NotNull
        public final TextDTO getValueText() {
            return this.valueText;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.sku) * 31;
            Long l11 = this.selectedDeliverySchema;
            int hashCode2 = (this.cartActionIcon.hashCode() + Ns.b.a(this.valueText, C2454a.a(this.value, (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31, 31), 31)) * 31;
            AtomAction atomAction = this.additionalAction;
            int a11 = g.a(g.a(C2454a.a(this.quantSize, C2454a.a(this.multiplicity, C2454a.a(this.maxValue, C2454a.a(this.minValue, (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31), 31), 31), 31), 31, this.decrementIconToken), 31, this.incrementIconToken);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return Boolean.hashCode(this.isIncrementDisabled) + ((a11 + (map != null ? map.hashCode() : 0)) * 31);
        }

        /* renamed from: isIncrementDisabled, reason: from getter */
        public final boolean getIsIncrementDisabled() {
            return this.isIncrementDisabled;
        }

        @NotNull
        public String toString() {
            long j11 = this.sku;
            Long l11 = this.selectedDeliverySchema;
            int i11 = this.value;
            TextDTO textDTO = this.valueText;
            ActionIconVO actionIconVO = this.cartActionIcon;
            AtomAction atomAction = this.additionalAction;
            int i12 = this.minValue;
            int i13 = this.maxValue;
            int i14 = this.multiplicity;
            int i15 = this.quantSize;
            String str = this.decrementIconToken;
            String str2 = this.incrementIconToken;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            boolean z11 = this.isIncrementDisabled;
            StringBuilder sb2 = new StringBuilder("QuantityPickerVO(sku=");
            sb2.append(j11);
            sb2.append(", selectedDeliverySchema=");
            sb2.append(l11);
            sb2.append(", value=");
            sb2.append(i11);
            sb2.append(", valueText=");
            sb2.append(textDTO);
            sb2.append(", cartActionIcon=");
            sb2.append(actionIconVO);
            sb2.append(", additionalAction=");
            sb2.append(atomAction);
            A0.c(i12, i13, ", minValue=", ", maxValue=", sb2);
            A0.c(i14, i15, ", multiplicity=", ", quantSize=", sb2);
            a.h(sb2, ", decrementIconToken=", str, ", incrementIconToken=", str2);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", isIncrementDisabled=");
            sb2.append(z11);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ QuantityPickerVO(long j11, Long l11, int i11, TextDTO textDTO, ActionIconVO actionIconVO, AtomAction atomAction, int i12, int i13, int i14, int i15, String str, String str2, Map map, boolean z11, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, l11, i11, textDTO, actionIconVO, atomAction, i12, i13, i14, i15, str, str2, map, (i16 & 8192) != 0 ? false : z11);
        }
    }
}
