package ru.ozon.app.android.ugc.widgets.productVariant.data;

import G.g;
import Ih.a;
import Ns.b;
import T7.P;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO;", "", "productName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "productDescription", "productImage", "", "changeVariantButton", "Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO$ChangeVariantButtonDTO;", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO$ChangeVariantButtonDTO;Ljava/lang/String;Ljava/util/Map;)V", "getProductName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getProductDescription", "getProductImage", "()Ljava/lang/String;", "getChangeVariantButton", "()Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO$ChangeVariantButtonDTO;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ChangeVariantButtonDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductVariantDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final ChangeVariantButtonDTO changeVariantButton;

    @NotNull
    private final TextDTO productDescription;

    @NotNull
    private final String productImage;

    @NotNull
    private final TextDTO productName;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productVariant/data/ProductVariantDTO$ChangeVariantButtonDTO;", "", "changeVariantText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getChangeVariantText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangeVariantButtonDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final TextDTO changeVariantText;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ChangeVariantButtonDTO(@NotNull TextDTO changeVariantText, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(changeVariantText, "changeVariantText");
            Intrinsics.checkNotNullParameter(action, "action");
            this.changeVariantText = changeVariantText;
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChangeVariantButtonDTO copy$default(ChangeVariantButtonDTO changeVariantButtonDTO, TextDTO textDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = changeVariantButtonDTO.changeVariantText;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = changeVariantButtonDTO.action;
            }
            if ((i11 & 4) != 0) {
                map = changeVariantButtonDTO.trackingInfo;
            }
            return changeVariantButtonDTO.copy(textDTO, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getChangeVariantText() {
            return this.changeVariantText;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final ChangeVariantButtonDTO copy(@NotNull TextDTO changeVariantText, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(changeVariantText, "changeVariantText");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ChangeVariantButtonDTO(changeVariantText, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeVariantButtonDTO)) {
                return false;
            }
            ChangeVariantButtonDTO changeVariantButtonDTO = (ChangeVariantButtonDTO) other;
            return Intrinsics.d(this.changeVariantText, changeVariantButtonDTO.changeVariantText) && Intrinsics.d(this.action, changeVariantButtonDTO.action) && Intrinsics.d(this.trackingInfo, changeVariantButtonDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getChangeVariantText() {
            return this.changeVariantText;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, this.changeVariantText.hashCode() * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.changeVariantText;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ChangeVariantButtonDTO(changeVariantText=");
            sb2.append(textDTO);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public ProductVariantDTO(@NotNull TextDTO productName, @NotNull TextDTO productDescription, @NotNull String productImage, ChangeVariantButtonDTO changeVariantButtonDTO, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(productDescription, "productDescription");
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImage = productImage;
        this.changeVariantButton = changeVariantButtonDTO;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ProductVariantDTO copy$default(ProductVariantDTO productVariantDTO, TextDTO textDTO, TextDTO textDTO2, String str, ChangeVariantButtonDTO changeVariantButtonDTO, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = productVariantDTO.productName;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = productVariantDTO.productDescription;
        }
        if ((i11 & 4) != 0) {
            str = productVariantDTO.productImage;
        }
        if ((i11 & 8) != 0) {
            changeVariantButtonDTO = productVariantDTO.changeVariantButton;
        }
        if ((i11 & 16) != 0) {
            str2 = productVariantDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            map = productVariantDTO.trackingInfo;
        }
        String str3 = str2;
        Map map2 = map;
        return productVariantDTO.copy(textDTO, textDTO2, str, changeVariantButtonDTO, str3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getProductName() {
        return this.productName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getProductDescription() {
        return this.productDescription;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProductImage() {
        return this.productImage;
    }

    /* renamed from: component4, reason: from getter */
    public final ChangeVariantButtonDTO getChangeVariantButton() {
        return this.changeVariantButton;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProductVariantDTO copy(@NotNull TextDTO productName, @NotNull TextDTO productDescription, @NotNull String productImage, ChangeVariantButtonDTO changeVariantButton, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(productDescription, "productDescription");
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        return new ProductVariantDTO(productName, productDescription, productImage, changeVariantButton, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVariantDTO)) {
            return false;
        }
        ProductVariantDTO productVariantDTO = (ProductVariantDTO) other;
        return Intrinsics.d(this.productName, productVariantDTO.productName) && Intrinsics.d(this.productDescription, productVariantDTO.productDescription) && Intrinsics.d(this.productImage, productVariantDTO.productImage) && Intrinsics.d(this.changeVariantButton, productVariantDTO.changeVariantButton) && Intrinsics.d(this.backgroundColor, productVariantDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, productVariantDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ChangeVariantButtonDTO getChangeVariantButton() {
        return this.changeVariantButton;
    }

    @NotNull
    public final TextDTO getProductDescription() {
        return this.productDescription;
    }

    @NotNull
    public final String getProductImage() {
        return this.productImage;
    }

    @NotNull
    public final TextDTO getProductName() {
        return this.productName;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(b.a(this.productDescription, this.productName.hashCode() * 31, 31), 31, this.productImage);
        ChangeVariantButtonDTO changeVariantButtonDTO = this.changeVariantButton;
        int hashCode = (a11 + (changeVariantButtonDTO == null ? 0 : changeVariantButtonDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.productName;
        TextDTO textDTO2 = this.productDescription;
        String str = this.productImage;
        ChangeVariantButtonDTO changeVariantButtonDTO = this.changeVariantButton;
        String str2 = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("ProductVariantDTO(productName=", textDTO, ", productDescription=", textDTO2, ", productImage=");
        g10.append(str);
        g10.append(", changeVariantButton=");
        g10.append(changeVariantButtonDTO);
        g10.append(", backgroundColor=");
        return C4070a.a(g10, str2, ", trackingInfo=", map, ")");
    }
}
