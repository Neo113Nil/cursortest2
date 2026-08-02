package ru.ozon.app.android.storefront.data.tiles.countbutton;

import B0.C2454a;
import Bl.C2639a;
import D3.g;
import H00.a;
import Kk.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0001HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO;", "", "icon", "", "action", "iconColor", "backgroundColor", "isDisabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Ljava/lang/Object;", "getIconColor", "getBackgroundColor", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO;", "equals", "other", "hashCode", "", "toString", "UpdateCart", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CountButtonDTO {

    @NotNull
    private final Object action;
    private final String backgroundColor;

    @NotNull
    private final String icon;
    private final String iconColor;
    private final Boolean isDisabled;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0084\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001f¨\u00062"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO$UpdateCart;", "", "quantity", "", "minItems", "maxItems", "selectedDeliverySchema", "", "mode", "Lru/ozon/app/android/storefront/data/tiles/countbutton/UpdateCartMode;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "extendMap", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Long;Lru/ozon/app/android/storefront/data/tiles/countbutton/UpdateCartMode;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinItems", "getMaxItems", "()I", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMode", "()Lru/ozon/app/android/storefront/data/tiles/countbutton/UpdateCartMode;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getExtendMap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Long;Lru/ozon/app/android/storefront/data/tiles/countbutton/UpdateCartMode;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO$UpdateCart;", "equals", "", "other", "hashCode", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateCart {
        private final Map<String, String> extendMap;
        private final int maxItems;
        private final Integer minItems;
        private final UpdateCartMode mode;
        private final Integer quantity;
        private final Long selectedDeliverySchema;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public UpdateCart(Integer num, Integer num2, int i11, Long l11, UpdateCartMode updateCartMode, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, Map<String, String> map2) {
            this.quantity = num;
            this.minItems = num2;
            this.maxItems = i11;
            this.selectedDeliverySchema = l11;
            this.mode = updateCartMode;
            this.trackingInfo = map;
            this.testInfo = testInfo;
            this.extendMap = map2;
        }

        public static /* synthetic */ UpdateCart copy$default(UpdateCart updateCart, Integer num, Integer num2, int i11, Long l11, UpdateCartMode updateCartMode, Map map, TestInfo testInfo, Map map2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = updateCart.quantity;
            }
            if ((i12 & 2) != 0) {
                num2 = updateCart.minItems;
            }
            if ((i12 & 4) != 0) {
                i11 = updateCart.maxItems;
            }
            if ((i12 & 8) != 0) {
                l11 = updateCart.selectedDeliverySchema;
            }
            if ((i12 & 16) != 0) {
                updateCartMode = updateCart.mode;
            }
            if ((i12 & 32) != 0) {
                map = updateCart.trackingInfo;
            }
            if ((i12 & 64) != 0) {
                testInfo = updateCart.testInfo;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map2 = updateCart.extendMap;
            }
            TestInfo testInfo2 = testInfo;
            Map map3 = map2;
            UpdateCartMode updateCartMode2 = updateCartMode;
            Map map4 = map;
            return updateCart.copy(num, num2, i11, l11, updateCartMode2, map4, testInfo2, map3);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getQuantity() {
            return this.quantity;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getMinItems() {
            return this.minItems;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxItems() {
            return this.maxItems;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        /* renamed from: component5, reason: from getter */
        public final UpdateCartMode getMode() {
            return this.mode;
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
        public final UpdateCart copy(Integer quantity, Integer minItems, int maxItems, Long selectedDeliverySchema, UpdateCartMode mode, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, Map<String, String> extendMap) {
            return new UpdateCart(quantity, minItems, maxItems, selectedDeliverySchema, mode, trackingInfo, testInfo, extendMap);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateCart)) {
                return false;
            }
            UpdateCart updateCart = (UpdateCart) other;
            return Intrinsics.d(this.quantity, updateCart.quantity) && Intrinsics.d(this.minItems, updateCart.minItems) && this.maxItems == updateCart.maxItems && Intrinsics.d(this.selectedDeliverySchema, updateCart.selectedDeliverySchema) && this.mode == updateCart.mode && Intrinsics.d(this.trackingInfo, updateCart.trackingInfo) && Intrinsics.d(this.testInfo, updateCart.testInfo) && Intrinsics.d(this.extendMap, updateCart.extendMap);
        }

        public final Map<String, String> getExtendMap() {
            return this.extendMap;
        }

        public final int getMaxItems() {
            return this.maxItems;
        }

        public final Integer getMinItems() {
            return this.minItems;
        }

        public final UpdateCartMode getMode() {
            return this.mode;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final Long getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Integer num = this.quantity;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.minItems;
            int a11 = C2454a.a(this.maxItems, (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
            Long l11 = this.selectedDeliverySchema;
            int hashCode2 = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
            UpdateCartMode updateCartMode = this.mode;
            int hashCode3 = (hashCode2 + (updateCartMode == null ? 0 : updateCartMode.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, String> map2 = this.extendMap;
            return hashCode5 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.quantity;
            Integer num2 = this.minItems;
            int i11 = this.maxItems;
            Long l11 = this.selectedDeliverySchema;
            UpdateCartMode updateCartMode = this.mode;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            Map<String, String> map2 = this.extendMap;
            StringBuilder f7 = c.f("UpdateCart(quantity=", ", minItems=", num, num2, ", maxItems=");
            f7.append(i11);
            f7.append(", selectedDeliverySchema=");
            f7.append(l11);
            f7.append(", mode=");
            f7.append(updateCartMode);
            f7.append(", trackingInfo=");
            f7.append(map);
            f7.append(", testInfo=");
            return C2639a.a(", extendMap=", ")", f7, map2, testInfo);
        }
    }

    public CountButtonDTO(@NotNull String icon, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "updateCart", type = UpdateCart.class), @ProtoOneOfSignature(name = "common", type = CommonControlSettings.class)}) @NotNull @ProtoOneOf(label = "type") Object action, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.icon = icon;
        this.action = action;
        this.iconColor = str;
        this.backgroundColor = str2;
        this.isDisabled = bool;
    }

    public static /* synthetic */ CountButtonDTO copy$default(CountButtonDTO countButtonDTO, String str, Object obj, String str2, String str3, Boolean bool, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = countButtonDTO.icon;
        }
        if ((i11 & 2) != 0) {
            obj = countButtonDTO.action;
        }
        if ((i11 & 4) != 0) {
            str2 = countButtonDTO.iconColor;
        }
        if ((i11 & 8) != 0) {
            str3 = countButtonDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            bool = countButtonDTO.isDisabled;
        }
        Boolean bool2 = bool;
        String str4 = str2;
        return countButtonDTO.copy(str, obj, str4, str3, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Object getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public final CountButtonDTO copy(@NotNull String icon, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "updateCart", type = UpdateCart.class), @ProtoOneOfSignature(name = "common", type = CommonControlSettings.class)}) @NotNull @ProtoOneOf(label = "type") Object action, String iconColor, String backgroundColor, Boolean isDisabled) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        return new CountButtonDTO(icon, action, iconColor, backgroundColor, isDisabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountButtonDTO)) {
            return false;
        }
        CountButtonDTO countButtonDTO = (CountButtonDTO) other;
        return Intrinsics.d(this.icon, countButtonDTO.icon) && Intrinsics.d(this.action, countButtonDTO.action) && Intrinsics.d(this.iconColor, countButtonDTO.iconColor) && Intrinsics.d(this.backgroundColor, countButtonDTO.backgroundColor) && Intrinsics.d(this.isDisabled, countButtonDTO.isDisabled);
    }

    @NotNull
    public final Object getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public int hashCode() {
        int c11 = a.c(this.icon.hashCode() * 31, 31, this.action);
        String str = this.iconColor;
        int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        Object obj = this.action;
        String str2 = this.iconColor;
        String str3 = this.backgroundColor;
        Boolean bool = this.isDisabled;
        StringBuilder sb2 = new StringBuilder("CountButtonDTO(icon=");
        sb2.append(str);
        sb2.append(", action=");
        sb2.append(obj);
        sb2.append(", iconColor=");
        Nh.a.h(sb2, str2, ", backgroundColor=", str3, ", isDisabled=");
        return g.d(sb2, bool, ")");
    }
}
