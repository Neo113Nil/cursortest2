package ru.ozon.app.android.storefront.data.tiles.addtocart.likezone;

import B0.C2454a;
import Bl.C2639a;
import Fm.C3051a;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00042345Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003J\u0082\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\b\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001f¨\u00066"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;", "", "skuId", "", "actionButton", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$ActionButton;", "quantityButton", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton;", "isDisabled", "", "theme", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "extendMap", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$ActionButton;Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getSkuId", "()Ljava/lang/String;", "getActionButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$ActionButton;", "getQuantityButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTheme", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getExtendMap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$ActionButton;Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;", "equals", "other", "hashCode", "", "toString", "Companion", "ActionButton", "QuantityButton", "Theme", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FamilyButtonDTO {

    @NotNull
    public static final String ADD_TO_FAMILY_CART_ACTION_ID = "addToCart";
    public static final int DEFAULT_QUANTITY = 1;

    @NotNull
    public static final String QUANTITY_PARAM_NAME = "quantity";

    @NotNull
    public static final String SELECTED_DELIVERY_SCHEMA_PARAM_NAME = "selectedDeliverySchema";

    @NotNull
    public static final String SKU_ID_PARAM_NAME = "id";

    @NotNull
    private final ActionButton actionButton;
    private final Map<String, String> extendMap;
    private final Boolean isDisabled;
    private final QuantityButton quantityButton;
    private final String skuId;
    private final TestInfo testInfo;

    @NotNull
    private final Theme theme;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$ActionButton;", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "icon", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getIcon", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionButton {
        private final CommonControlSettings common;
        private final String icon;

        public ActionButton(CommonControlSettings commonControlSettings, String str) {
            this.common = commonControlSettings;
            this.icon = str;
        }

        public static /* synthetic */ ActionButton copy$default(ActionButton actionButton, CommonControlSettings commonControlSettings, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonControlSettings = actionButton.common;
            }
            if ((i11 & 2) != 0) {
                str = actionButton.icon;
            }
            return actionButton.copy(commonControlSettings, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final ActionButton copy(CommonControlSettings common, String icon) {
            return new ActionButton(common, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) other;
            return Intrinsics.d(this.common, actionButton.common) && Intrinsics.d(this.icon, actionButton.icon);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            CommonControlSettings commonControlSettings = this.common;
            int hashCode = (commonControlSettings == null ? 0 : commonControlSettings.hashCode()) * 31;
            String str = this.icon;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ActionButton(common=" + this.common + ", icon=" + this.icon + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme;", "", "<init>", "()V", "StyleWrapper", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme$StyleWrapper;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Theme {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme$StyleWrapper;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme;", "style", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme$StyleWrapper$Style;", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme$StyleWrapper$Style;)V", "getStyle", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme$StyleWrapper$Style;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Style", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class StyleWrapper extends Theme {

            @NotNull
            private final Style style;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$Theme$StyleWrapper$Style;", "", "<init>", "(Ljava/lang/String;I)V", "LIKEZONE_DEFAULT_PRIMARY", "LIKEZONE_DEFAULT_FRESH", "LIKEZONE_DEFAULT_EXPRESS", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Style {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Style[] $VALUES;
                public static final Style LIKEZONE_DEFAULT_PRIMARY = new Style("LIKEZONE_DEFAULT_PRIMARY", 0);
                public static final Style LIKEZONE_DEFAULT_FRESH = new Style("LIKEZONE_DEFAULT_FRESH", 1);
                public static final Style LIKEZONE_DEFAULT_EXPRESS = new Style("LIKEZONE_DEFAULT_EXPRESS", 2);

                private static final /* synthetic */ Style[] $values() {
                    return new Style[]{LIKEZONE_DEFAULT_PRIMARY, LIKEZONE_DEFAULT_FRESH, LIKEZONE_DEFAULT_EXPRESS};
                }

                static {
                    Style[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private Style(String str, int i11) {
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) $VALUES.clone();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StyleWrapper(@NotNull Style style) {
                super(null);
                Intrinsics.checkNotNullParameter(style, "style");
                this.style = style;
            }

            public static /* synthetic */ StyleWrapper copy$default(StyleWrapper styleWrapper, Style style, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    style = styleWrapper.style;
                }
                return styleWrapper.copy(style);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Style getStyle() {
                return this.style;
            }

            @NotNull
            public final StyleWrapper copy(@NotNull Style style) {
                Intrinsics.checkNotNullParameter(style, "style");
                return new StyleWrapper(style);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof StyleWrapper) && this.style == ((StyleWrapper) other).style;
            }

            @NotNull
            public final Style getStyle() {
                return this.style;
            }

            public int hashCode() {
                return this.style.hashCode();
            }

            @NotNull
            public String toString() {
                return "StyleWrapper(style=" + this.style + ")";
            }
        }

        public /* synthetic */ Theme(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Theme() {
        }
    }

    public FamilyButtonDTO(String str, @NotNull ActionButton actionButton, QuantityButton quantityButton, Boolean bool, @ProtoOneOfSignature(name = "styleWrapper", type = Theme.StyleWrapper.class) @NotNull @ProtoOneOf(label = "type") Theme theme, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.skuId = str;
        this.actionButton = actionButton;
        this.quantityButton = quantityButton;
        this.isDisabled = bool;
        this.theme = theme;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.extendMap = map2;
    }

    public static /* synthetic */ FamilyButtonDTO copy$default(FamilyButtonDTO familyButtonDTO, String str, ActionButton actionButton, QuantityButton quantityButton, Boolean bool, Theme theme, Map map, TestInfo testInfo, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = familyButtonDTO.skuId;
        }
        if ((i11 & 2) != 0) {
            actionButton = familyButtonDTO.actionButton;
        }
        if ((i11 & 4) != 0) {
            quantityButton = familyButtonDTO.quantityButton;
        }
        if ((i11 & 8) != 0) {
            bool = familyButtonDTO.isDisabled;
        }
        if ((i11 & 16) != 0) {
            theme = familyButtonDTO.theme;
        }
        if ((i11 & 32) != 0) {
            map = familyButtonDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            testInfo = familyButtonDTO.testInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map2 = familyButtonDTO.extendMap;
        }
        TestInfo testInfo2 = testInfo;
        Map map3 = map2;
        Theme theme2 = theme;
        Map map4 = map;
        return familyButtonDTO.copy(str, actionButton, quantityButton, bool, theme2, map4, testInfo2, map3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component3, reason: from getter */
    public final QuantityButton getQuantityButton() {
        return this.quantityButton;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, String> component8() {
        return this.extendMap;
    }

    @NotNull
    public final FamilyButtonDTO copy(String skuId, @NotNull ActionButton actionButton, QuantityButton quantityButton, Boolean isDisabled, @ProtoOneOfSignature(name = "styleWrapper", type = Theme.StyleWrapper.class) @NotNull @ProtoOneOf(label = "type") Theme theme, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, Map<String, String> extendMap) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new FamilyButtonDTO(skuId, actionButton, quantityButton, isDisabled, theme, trackingInfo, testInfo, extendMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyButtonDTO)) {
            return false;
        }
        FamilyButtonDTO familyButtonDTO = (FamilyButtonDTO) other;
        return Intrinsics.d(this.skuId, familyButtonDTO.skuId) && Intrinsics.d(this.actionButton, familyButtonDTO.actionButton) && Intrinsics.d(this.quantityButton, familyButtonDTO.quantityButton) && Intrinsics.d(this.isDisabled, familyButtonDTO.isDisabled) && Intrinsics.d(this.theme, familyButtonDTO.theme) && Intrinsics.d(this.trackingInfo, familyButtonDTO.trackingInfo) && Intrinsics.d(this.testInfo, familyButtonDTO.testInfo) && Intrinsics.d(this.extendMap, familyButtonDTO.extendMap);
    }

    @NotNull
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    public final Map<String, String> getExtendMap() {
        return this.extendMap;
    }

    public final QuantityButton getQuantityButton() {
        return this.quantityButton;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final Theme getTheme() {
        return this.theme;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.skuId;
        int hashCode = (this.actionButton.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        QuantityButton quantityButton = this.quantityButton;
        int hashCode2 = (hashCode + (quantityButton == null ? 0 : quantityButton.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        int hashCode3 = (this.theme.hashCode() + ((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, String> map2 = this.extendMap;
        return hashCode5 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        String str = this.skuId;
        ActionButton actionButton = this.actionButton;
        QuantityButton quantityButton = this.quantityButton;
        Boolean bool = this.isDisabled;
        Theme theme = this.theme;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        Map<String, String> map2 = this.extendMap;
        StringBuilder sb2 = new StringBuilder("FamilyButtonDTO(skuId=");
        sb2.append(str);
        sb2.append(", actionButton=");
        sb2.append(actionButton);
        sb2.append(", quantityButton=");
        sb2.append(quantityButton);
        sb2.append(", isDisabled=");
        sb2.append(bool);
        sb2.append(", theme=");
        sb2.append(theme);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        return C2639a.a(", extendMap=", ")", sb2, map2, testInfo);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton;", "", "maxItems", "", "updateCartAction", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "minItems", "<init>", "(ILru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;Ljava/lang/Integer;)V", "getMaxItems", "()I", "getUpdateCartAction", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "getMinItems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton;", "equals", "", "other", "hashCode", "toString", "", "UpdateCartAction", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class QuantityButton {
        private final int maxItems;
        private final Integer minItems;

        @NotNull
        private final UpdateCartAction updateCartAction;

        public QuantityButton(int i11, @NotNull UpdateCartAction updateCartAction, Integer num) {
            Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
            this.maxItems = i11;
            this.updateCartAction = updateCartAction;
            this.minItems = num;
        }

        public static /* synthetic */ QuantityButton copy$default(QuantityButton quantityButton, int i11, UpdateCartAction updateCartAction, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = quantityButton.maxItems;
            }
            if ((i12 & 2) != 0) {
                updateCartAction = quantityButton.updateCartAction;
            }
            if ((i12 & 4) != 0) {
                num = quantityButton.minItems;
            }
            return quantityButton.copy(i11, updateCartAction, num);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxItems() {
            return this.maxItems;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final UpdateCartAction getUpdateCartAction() {
            return this.updateCartAction;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getMinItems() {
            return this.minItems;
        }

        @NotNull
        public final QuantityButton copy(int maxItems, @NotNull UpdateCartAction updateCartAction, Integer minItems) {
            Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
            return new QuantityButton(maxItems, updateCartAction, minItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityButton)) {
                return false;
            }
            QuantityButton quantityButton = (QuantityButton) other;
            return this.maxItems == quantityButton.maxItems && Intrinsics.d(this.updateCartAction, quantityButton.updateCartAction) && Intrinsics.d(this.minItems, quantityButton.minItems);
        }

        public final int getMaxItems() {
            return this.maxItems;
        }

        public final Integer getMinItems() {
            return this.minItems;
        }

        @NotNull
        public final UpdateCartAction getUpdateCartAction() {
            return this.updateCartAction;
        }

        public int hashCode() {
            int hashCode = (this.updateCartAction.hashCode() + (Integer.hashCode(this.maxItems) * 31)) * 31;
            Integer num = this.minItems;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.maxItems;
            UpdateCartAction updateCartAction = this.updateCartAction;
            Integer num = this.minItems;
            StringBuilder sb2 = new StringBuilder("QuantityButton(maxItems=");
            sb2.append(i11);
            sb2.append(", updateCartAction=");
            sb2.append(updateCartAction);
            sb2.append(", minItems=");
            return Ep.a.c(sb2, num, ")");
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "", "id", "", "quantity", "", "selectedDeliverySchema", "", "<init>", "(Ljava/lang/String;ILjava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getQuantity", "()I", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/lang/Long;)Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "equals", "", "other", "hashCode", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UpdateCartAction {

            @NotNull
            private final String id;
            private final int quantity;
            private final Long selectedDeliverySchema;

            public UpdateCartAction(@NotNull String id2, int i11, Long l11) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.id = id2;
                this.quantity = i11;
                this.selectedDeliverySchema = l11;
            }

            public static /* synthetic */ UpdateCartAction copy$default(UpdateCartAction updateCartAction, String str, int i11, Long l11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = updateCartAction.id;
                }
                if ((i12 & 2) != 0) {
                    i11 = updateCartAction.quantity;
                }
                if ((i12 & 4) != 0) {
                    l11 = updateCartAction.selectedDeliverySchema;
                }
                return updateCartAction.copy(str, i11, l11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final int getQuantity() {
                return this.quantity;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            @NotNull
            public final UpdateCartAction copy(@NotNull String id2, int quantity, Long selectedDeliverySchema) {
                Intrinsics.checkNotNullParameter(id2, "id");
                return new UpdateCartAction(id2, quantity, selectedDeliverySchema);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateCartAction)) {
                    return false;
                }
                UpdateCartAction updateCartAction = (UpdateCartAction) other;
                return Intrinsics.d(this.id, updateCartAction.id) && this.quantity == updateCartAction.quantity && Intrinsics.d(this.selectedDeliverySchema, updateCartAction.selectedDeliverySchema);
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public final int getQuantity() {
                return this.quantity;
            }

            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.quantity, this.id.hashCode() * 31, 31);
                Long l11 = this.selectedDeliverySchema;
                return a11 + (l11 == null ? 0 : l11.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.id;
                int i11 = this.quantity;
                return C3051a.d(C3660k.c(i11, "UpdateCartAction(id=", str, ", quantity=", ", selectedDeliverySchema="), this.selectedDeliverySchema, ")");
            }

            public /* synthetic */ UpdateCartAction(String str, int i11, Long l11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? null : l11);
            }
        }
    }
}
