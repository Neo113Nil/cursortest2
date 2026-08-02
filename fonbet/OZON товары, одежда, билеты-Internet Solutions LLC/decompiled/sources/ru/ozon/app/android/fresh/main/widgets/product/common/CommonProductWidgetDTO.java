package ru.ozon.app.android.fresh.main.widgets.product.common;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.product.common.footer.model.FooterDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.model.HeaderDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductContainerDTO;
import ru.ozon.app.android.fresh.main.widgets.product.common.richheader.data.RichHeaderDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/CommonProductWidgetDTO;", "Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderDTO;", "richHeader", "Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/data/RichHeaderDTO;", "productContainer", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/fresh/main/widgets/product/common/footer/model/FooterDTO;", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderDTO;Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/data/RichHeaderDTO;Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO;Lru/ozon/app/android/fresh/main/widgets/product/common/footer/model/FooterDTO;)V", "getHeader", "()Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderDTO;", "getRichHeader", "()Lru/ozon/app/android/fresh/main/widgets/product/common/richheader/data/RichHeaderDTO;", "getProductContainer", "()Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO;", "getFooter", "()Lru/ozon/app/android/fresh/main/widgets/product/common/footer/model/FooterDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CommonProductWidgetDTO implements ProductWidgetDTO {
    private final FooterDTO footer;
    private final HeaderDTO header;

    @NotNull
    private final ProductContainerDTO productContainer;
    private final RichHeaderDTO richHeader;

    public CommonProductWidgetDTO(HeaderDTO headerDTO, RichHeaderDTO richHeaderDTO, @NotNull ProductContainerDTO productContainer, FooterDTO footerDTO) {
        Intrinsics.checkNotNullParameter(productContainer, "productContainer");
        this.header = headerDTO;
        this.richHeader = richHeaderDTO;
        this.productContainer = productContainer;
        this.footer = footerDTO;
    }

    public static /* synthetic */ CommonProductWidgetDTO copy$default(CommonProductWidgetDTO commonProductWidgetDTO, HeaderDTO headerDTO, RichHeaderDTO richHeaderDTO, ProductContainerDTO productContainerDTO, FooterDTO footerDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = commonProductWidgetDTO.header;
        }
        if ((i11 & 2) != 0) {
            richHeaderDTO = commonProductWidgetDTO.richHeader;
        }
        if ((i11 & 4) != 0) {
            productContainerDTO = commonProductWidgetDTO.productContainer;
        }
        if ((i11 & 8) != 0) {
            footerDTO = commonProductWidgetDTO.footer;
        }
        return commonProductWidgetDTO.copy(headerDTO, richHeaderDTO, productContainerDTO, footerDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final RichHeaderDTO getRichHeader() {
        return this.richHeader;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ProductContainerDTO getProductContainer() {
        return this.productContainer;
    }

    /* renamed from: component4, reason: from getter */
    public final FooterDTO getFooter() {
        return this.footer;
    }

    @NotNull
    public final CommonProductWidgetDTO copy(HeaderDTO header, RichHeaderDTO richHeader, @NotNull ProductContainerDTO productContainer, FooterDTO footer) {
        Intrinsics.checkNotNullParameter(productContainer, "productContainer");
        return new CommonProductWidgetDTO(header, richHeader, productContainer, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonProductWidgetDTO)) {
            return false;
        }
        CommonProductWidgetDTO commonProductWidgetDTO = (CommonProductWidgetDTO) other;
        return Intrinsics.d(this.header, commonProductWidgetDTO.header) && Intrinsics.d(this.richHeader, commonProductWidgetDTO.richHeader) && Intrinsics.d(this.productContainer, commonProductWidgetDTO.productContainer) && Intrinsics.d(this.footer, commonProductWidgetDTO.footer);
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.common.HasFooterDTO
    public FooterDTO getFooter() {
        return this.footer;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.common.HasHeaderDTO
    public HeaderDTO getHeader() {
        return this.header;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.common.ProductWidgetDTO
    @NotNull
    public ProductContainerDTO getProductContainer() {
        return this.productContainer;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.product.common.HasRichHeaderDTO
    public RichHeaderDTO getRichHeader() {
        return this.richHeader;
    }

    public int hashCode() {
        HeaderDTO headerDTO = this.header;
        int hashCode = (headerDTO == null ? 0 : headerDTO.hashCode()) * 31;
        RichHeaderDTO richHeaderDTO = this.richHeader;
        int hashCode2 = (this.productContainer.hashCode() + ((hashCode + (richHeaderDTO == null ? 0 : richHeaderDTO.hashCode())) * 31)) * 31;
        FooterDTO footerDTO = this.footer;
        return hashCode2 + (footerDTO != null ? footerDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonProductWidgetDTO(header=" + this.header + ", richHeader=" + this.richHeader + ", productContainer=" + this.productContainer + ", footer=" + this.footer + ")";
    }
}
