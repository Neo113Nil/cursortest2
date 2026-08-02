package ru.ozon.app.android.orderdetails.productsToPay.data;

import Kk.C3532b;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.media.data.ProductMediaImageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00109\u001a\u00020\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010=\u001a\u00020\u0014HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0095\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u0010A\u001a\u00020\u00142\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006F"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/data/ProductDTO;", "", "checkbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "productImage", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductImageDTO;", "productMediaImage", "Lru/ozon/app/android/cscore/orderdetails/molecule/media/data/ProductMediaImageDTO;", "productPrice", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductPriceDTO;", "productCounter", "Lru/ozon/app/android/orderdetails/productsToPay/data/ProductCounterDto;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "disableSeparator", "", "state", "", "verticalPadding", "Lru/ozon/app/android/orderdetails/productsToPay/data/VerticalPadding;", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Lru/ozon/app/android/orderdetails/productsToPay/data/ProductImageDTO;Lru/ozon/app/android/cscore/orderdetails/molecule/media/data/ProductMediaImageDTO;Lru/ozon/app/android/orderdetails/productsToPay/data/ProductPriceDTO;Lru/ozon/app/android/orderdetails/productsToPay/data/ProductCounterDto;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;ZLjava/lang/String;Lru/ozon/app/android/orderdetails/productsToPay/data/VerticalPadding;)V", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getProductImage", "()Lru/ozon/app/android/orderdetails/productsToPay/data/ProductImageDTO;", "getProductMediaImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/media/data/ProductMediaImageDTO;", "getProductPrice", "()Lru/ozon/app/android/orderdetails/productsToPay/data/ProductPriceDTO;", "getProductCounter", "()Lru/ozon/app/android/orderdetails/productsToPay/data/ProductCounterDto;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getDisableSeparator", "()Z", "getState", "()Ljava/lang/String;", "getVerticalPadding", "()Lru/ozon/app/android/orderdetails/productsToPay/data/VerticalPadding;", "setVerticalPadding", "(Lru/ozon/app/android/orderdetails/productsToPay/data/VerticalPadding;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductDTO {
    public static final int $stable = 8;
    private final BadgeDTO badge;
    private final CheckBoxDTO checkbox;
    private final CommonControlSettings common;
    private final boolean disableSeparator;
    private final ProductCounterDto productCounter;
    private final ProductImageDTO productImage;
    private final ProductMediaImageDTO productMediaImage;
    private final ProductPriceDTO productPrice;
    private final transient String state;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private transient VerticalPadding verticalPadding;

    public ProductDTO(CheckBoxDTO checkBoxDTO, ProductImageDTO productImageDTO, ProductMediaImageDTO productMediaImageDTO, ProductPriceDTO productPriceDTO, ProductCounterDto productCounterDto, @NotNull TextDTO title, TextDTO textDTO, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, boolean z11, String str, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.checkbox = checkBoxDTO;
        this.productImage = productImageDTO;
        this.productMediaImage = productMediaImageDTO;
        this.productPrice = productPriceDTO;
        this.productCounter = productCounterDto;
        this.title = title;
        this.subtitle = textDTO;
        this.badge = badgeDTO;
        this.common = commonControlSettings;
        this.disableSeparator = z11;
        this.state = str;
        this.verticalPadding = verticalPadding;
    }

    public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, CheckBoxDTO checkBoxDTO, ProductImageDTO productImageDTO, ProductMediaImageDTO productMediaImageDTO, ProductPriceDTO productPriceDTO, ProductCounterDto productCounterDto, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, CommonControlSettings commonControlSettings, boolean z11, String str, VerticalPadding verticalPadding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            checkBoxDTO = productDTO.checkbox;
        }
        if ((i11 & 2) != 0) {
            productImageDTO = productDTO.productImage;
        }
        if ((i11 & 4) != 0) {
            productMediaImageDTO = productDTO.productMediaImage;
        }
        if ((i11 & 8) != 0) {
            productPriceDTO = productDTO.productPrice;
        }
        if ((i11 & 16) != 0) {
            productCounterDto = productDTO.productCounter;
        }
        if ((i11 & 32) != 0) {
            textDTO = productDTO.title;
        }
        if ((i11 & 64) != 0) {
            textDTO2 = productDTO.subtitle;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            badgeDTO = productDTO.badge;
        }
        if ((i11 & 256) != 0) {
            commonControlSettings = productDTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z11 = productDTO.disableSeparator;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str = productDTO.state;
        }
        if ((i11 & 2048) != 0) {
            verticalPadding = productDTO.verticalPadding;
        }
        String str2 = str;
        VerticalPadding verticalPadding2 = verticalPadding;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        boolean z12 = z11;
        TextDTO textDTO3 = textDTO2;
        BadgeDTO badgeDTO2 = badgeDTO;
        ProductCounterDto productCounterDto2 = productCounterDto;
        TextDTO textDTO4 = textDTO;
        return productDTO.copy(checkBoxDTO, productImageDTO, productMediaImageDTO, productPriceDTO, productCounterDto2, textDTO4, textDTO3, badgeDTO2, commonControlSettings2, z12, str2, verticalPadding2);
    }

    /* renamed from: component1, reason: from getter */
    public final CheckBoxDTO getCheckbox() {
        return this.checkbox;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getDisableSeparator() {
        return this.disableSeparator;
    }

    /* renamed from: component11, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component12, reason: from getter */
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductImageDTO getProductImage() {
        return this.productImage;
    }

    /* renamed from: component3, reason: from getter */
    public final ProductMediaImageDTO getProductMediaImage() {
        return this.productMediaImage;
    }

    /* renamed from: component4, reason: from getter */
    public final ProductPriceDTO getProductPrice() {
        return this.productPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final ProductCounterDto getProductCounter() {
        return this.productCounter;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component8, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component9, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final ProductDTO copy(CheckBoxDTO checkbox, ProductImageDTO productImage, ProductMediaImageDTO productMediaImage, ProductPriceDTO productPrice, ProductCounterDto productCounter, @NotNull TextDTO title, TextDTO subtitle, BadgeDTO badge, CommonControlSettings common, boolean disableSeparator, String state, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ProductDTO(checkbox, productImage, productMediaImage, productPrice, productCounter, title, subtitle, badge, common, disableSeparator, state, verticalPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDTO)) {
            return false;
        }
        ProductDTO productDTO = (ProductDTO) other;
        return Intrinsics.d(this.checkbox, productDTO.checkbox) && Intrinsics.d(this.productImage, productDTO.productImage) && Intrinsics.d(this.productMediaImage, productDTO.productMediaImage) && Intrinsics.d(this.productPrice, productDTO.productPrice) && Intrinsics.d(this.productCounter, productDTO.productCounter) && Intrinsics.d(this.title, productDTO.title) && Intrinsics.d(this.subtitle, productDTO.subtitle) && Intrinsics.d(this.badge, productDTO.badge) && Intrinsics.d(this.common, productDTO.common) && this.disableSeparator == productDTO.disableSeparator && Intrinsics.d(this.state, productDTO.state) && Intrinsics.d(this.verticalPadding, productDTO.verticalPadding);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final CheckBoxDTO getCheckbox() {
        return this.checkbox;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final boolean getDisableSeparator() {
        return this.disableSeparator;
    }

    public final ProductCounterDto getProductCounter() {
        return this.productCounter;
    }

    public final ProductImageDTO getProductImage() {
        return this.productImage;
    }

    public final ProductMediaImageDTO getProductMediaImage() {
        return this.productMediaImage;
    }

    public final ProductPriceDTO getProductPrice() {
        return this.productPrice;
    }

    public final String getState() {
        return this.state;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        CheckBoxDTO checkBoxDTO = this.checkbox;
        int hashCode = (checkBoxDTO == null ? 0 : checkBoxDTO.hashCode()) * 31;
        ProductImageDTO productImageDTO = this.productImage;
        int hashCode2 = (hashCode + (productImageDTO == null ? 0 : productImageDTO.hashCode())) * 31;
        ProductMediaImageDTO productMediaImageDTO = this.productMediaImage;
        int hashCode3 = (hashCode2 + (productMediaImageDTO == null ? 0 : productMediaImageDTO.hashCode())) * 31;
        ProductPriceDTO productPriceDTO = this.productPrice;
        int hashCode4 = (hashCode3 + (productPriceDTO == null ? 0 : productPriceDTO.hashCode())) * 31;
        ProductCounterDto productCounterDto = this.productCounter;
        int a11 = b.a(this.title, (hashCode4 + (productCounterDto == null ? 0 : productCounterDto.hashCode())) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode5 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode6 = (hashCode5 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int a12 = C3532b.a((hashCode6 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31, 31, this.disableSeparator);
        String str = this.state;
        int hashCode7 = (a12 + (str == null ? 0 : str.hashCode())) * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        return hashCode7 + (verticalPadding != null ? verticalPadding.hashCode() : 0);
    }

    public final void setVerticalPadding(VerticalPadding verticalPadding) {
        this.verticalPadding = verticalPadding;
    }

    @NotNull
    public String toString() {
        return "ProductDTO(checkbox=" + this.checkbox + ", productImage=" + this.productImage + ", productMediaImage=" + this.productMediaImage + ", productPrice=" + this.productPrice + ", productCounter=" + this.productCounter + ", title=" + this.title + ", subtitle=" + this.subtitle + ", badge=" + this.badge + ", common=" + this.common + ", disableSeparator=" + this.disableSeparator + ", state=" + this.state + ", verticalPadding=" + this.verticalPadding + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ProductDTO(ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO r16, ru.ozon.app.android.orderdetails.productsToPay.data.ProductImageDTO r17, ru.ozon.app.android.cscore.orderdetails.molecule.media.data.ProductMediaImageDTO r18, ru.ozon.app.android.orderdetails.productsToPay.data.ProductPriceDTO r19, ru.ozon.app.android.orderdetails.productsToPay.data.ProductCounterDto r20, ru.ozon.uni.atoms.data.text.TextDTO r21, ru.ozon.uni.atoms.data.text.TextDTO r22, ru.ozon.uni.atoms.data.dsBadge.BadgeDTO r23, ru.ozon.uni.atoms.data.controls.CommonControlSettings r24, boolean r25, java.lang.String r26, ru.ozon.app.android.orderdetails.productsToPay.data.VerticalPadding r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L9
            r1 = 0
            r12 = r1
            goto Lb
        L9:
            r12 = r25
        Lb:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L12
            r13 = r2
            goto L14
        L12:
            r13 = r26
        L14:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L2d
            r14 = r2
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r2 = r15
            goto L42
        L2d:
            r14 = r27
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
        L42:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.orderdetails.productsToPay.data.ProductDTO.<init>(ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO, ru.ozon.app.android.orderdetails.productsToPay.data.ProductImageDTO, ru.ozon.app.android.cscore.orderdetails.molecule.media.data.ProductMediaImageDTO, ru.ozon.app.android.orderdetails.productsToPay.data.ProductPriceDTO, ru.ozon.app.android.orderdetails.productsToPay.data.ProductCounterDto, ru.ozon.uni.atoms.data.text.TextDTO, ru.ozon.uni.atoms.data.text.TextDTO, ru.ozon.uni.atoms.data.dsBadge.BadgeDTO, ru.ozon.uni.atoms.data.controls.CommonControlSettings, boolean, java.lang.String, ru.ozon.app.android.orderdetails.productsToPay.data.VerticalPadding, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
