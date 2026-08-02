package ru.ozon.app.android.product.common;

import Pk0.h;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.footer.model.FooterDTO;
import ru.ozon.app.android.product.common.header.model.HeaderDTO;
import ru.ozon.app.android.product.common.product.ProductContainerDTO;
import ru.ozon.app.android.product.common.richheader.data.RichHeaderDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lru/ozon/app/android/product/common/CommonProductWidgetDTO;", "Lru/ozon/app/android/product/common/ProductWidgetDTO;", "Lru/ozon/app/android/product/common/header/model/HeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/product/common/richheader/data/RichHeaderDTO;", "richHeader", "Lru/ozon/app/android/product/common/footer/model/FooterDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/product/common/product/ProductContainerDTO;", "productContainer", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/app/android/product/common/header/model/HeaderDTO;Lru/ozon/app/android/product/common/richheader/data/RichHeaderDTO;Lru/ozon/app/android/product/common/footer/model/FooterDTO;Lru/ozon/app/android/product/common/product/ProductContainerDTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "component1", "()Lru/ozon/app/android/product/common/header/model/HeaderDTO;", "component2", "()Lru/ozon/app/android/product/common/richheader/data/RichHeaderDTO;", "component3", "()Lru/ozon/app/android/product/common/footer/model/FooterDTO;", "component4", "()Lru/ozon/app/android/product/common/product/ProductContainerDTO;", "component5", "()Lru/ozon/uni/atoms/data/TestInfo;", "copy", "(Lru/ozon/app/android/product/common/header/model/HeaderDTO;Lru/ozon/app/android/product/common/richheader/data/RichHeaderDTO;Lru/ozon/app/android/product/common/footer/model/FooterDTO;Lru/ozon/app/android/product/common/product/ProductContainerDTO;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/product/common/CommonProductWidgetDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/common/header/model/HeaderDTO;", "getHeader", "Lru/ozon/app/android/product/common/richheader/data/RichHeaderDTO;", "getRichHeader", "Lru/ozon/app/android/product/common/footer/model/FooterDTO;", "getFooter", "Lru/ozon/app/android/product/common/product/ProductContainerDTO;", "getProductContainer", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CommonProductWidgetDTO implements ProductWidgetDTO {
    private final FooterDTO footer;
    private final HeaderDTO header;

    @NotNull
    private final ProductContainerDTO productContainer;
    private final RichHeaderDTO richHeader;
    private final TestInfo testInfo;

    public CommonProductWidgetDTO(HeaderDTO headerDTO, RichHeaderDTO richHeaderDTO, FooterDTO footerDTO, @NotNull ProductContainerDTO productContainer, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(productContainer, "productContainer");
        this.header = headerDTO;
        this.richHeader = richHeaderDTO;
        this.footer = footerDTO;
        this.productContainer = productContainer;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ CommonProductWidgetDTO copy$default(CommonProductWidgetDTO commonProductWidgetDTO, HeaderDTO headerDTO, RichHeaderDTO richHeaderDTO, FooterDTO footerDTO, ProductContainerDTO productContainerDTO, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = commonProductWidgetDTO.header;
        }
        if ((i11 & 2) != 0) {
            richHeaderDTO = commonProductWidgetDTO.richHeader;
        }
        if ((i11 & 4) != 0) {
            footerDTO = commonProductWidgetDTO.footer;
        }
        if ((i11 & 8) != 0) {
            productContainerDTO = commonProductWidgetDTO.productContainer;
        }
        if ((i11 & 16) != 0) {
            testInfo = commonProductWidgetDTO.testInfo;
        }
        TestInfo testInfo2 = testInfo;
        FooterDTO footerDTO2 = footerDTO;
        return commonProductWidgetDTO.copy(headerDTO, richHeaderDTO, footerDTO2, productContainerDTO, testInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final RichHeaderDTO getRichHeader() {
        return this.richHeader;
    }

    /* renamed from: component3, reason: from getter */
    public final FooterDTO getFooter() {
        return this.footer;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProductContainerDTO getProductContainer() {
        return this.productContainer;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final CommonProductWidgetDTO copy(HeaderDTO header, RichHeaderDTO richHeader, FooterDTO footer, @NotNull ProductContainerDTO productContainer, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(productContainer, "productContainer");
        return new CommonProductWidgetDTO(header, richHeader, footer, productContainer, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonProductWidgetDTO)) {
            return false;
        }
        CommonProductWidgetDTO commonProductWidgetDTO = (CommonProductWidgetDTO) other;
        return Intrinsics.d(this.header, commonProductWidgetDTO.header) && Intrinsics.d(this.richHeader, commonProductWidgetDTO.richHeader) && Intrinsics.d(this.footer, commonProductWidgetDTO.footer) && Intrinsics.d(this.productContainer, commonProductWidgetDTO.productContainer) && Intrinsics.d(this.testInfo, commonProductWidgetDTO.testInfo);
    }

    @Override // ru.ozon.app.android.product.common.HasFooterDTO
    public FooterDTO getFooter() {
        return this.footer;
    }

    @Override // ru.ozon.app.android.product.common.ProductWidgetDTO
    public HeaderDTO getHeader() {
        return this.header;
    }

    @Override // ru.ozon.app.android.product.common.ProductWidgetDTO
    @NotNull
    public ProductContainerDTO getProductContainer() {
        return this.productContainer;
    }

    @Override // ru.ozon.app.android.product.common.HasRichHeaderDTO
    public RichHeaderDTO getRichHeader() {
        return this.richHeader;
    }

    @Override // ru.ozon.app.android.product.common.ProductWidgetDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public int hashCode() {
        HeaderDTO headerDTO = this.header;
        int hashCode = (headerDTO == null ? 0 : headerDTO.hashCode()) * 31;
        RichHeaderDTO richHeaderDTO = this.richHeader;
        int hashCode2 = (hashCode + (richHeaderDTO == null ? 0 : richHeaderDTO.hashCode())) * 31;
        FooterDTO footerDTO = this.footer;
        int hashCode3 = (this.productContainer.hashCode() + ((hashCode2 + (footerDTO == null ? 0 : footerDTO.hashCode())) * 31)) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        HeaderDTO headerDTO = this.header;
        RichHeaderDTO richHeaderDTO = this.richHeader;
        FooterDTO footerDTO = this.footer;
        ProductContainerDTO productContainerDTO = this.productContainer;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("CommonProductWidgetDTO(header=");
        sb2.append(headerDTO);
        sb2.append(", richHeader=");
        sb2.append(richHeaderDTO);
        sb2.append(", footer=");
        sb2.append(footerDTO);
        sb2.append(", productContainer=");
        sb2.append(productContainerDTO);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }
}
