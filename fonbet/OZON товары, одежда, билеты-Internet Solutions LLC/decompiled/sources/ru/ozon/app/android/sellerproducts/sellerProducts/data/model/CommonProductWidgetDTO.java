package ru.ozon.app.android.sellerproducts.sellerProducts.data.model;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.header.model.HeaderDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006$"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductWidgetDTO;", "Lru/ozon/app/android/sellerproducts/header/model/HeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO;", "productContainer", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO$WidgetOptions;", "widgetOptions", "<init>", "(Lru/ozon/app/android/sellerproducts/header/model/HeaderDTO;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO$WidgetOptions;)V", "component1", "()Lru/ozon/app/android/sellerproducts/header/model/HeaderDTO;", "component2", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO;", "component3", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO$WidgetOptions;", "copy", "(Lru/ozon/app/android/sellerproducts/header/model/HeaderDTO;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO$WidgetOptions;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/sellerproducts/header/model/HeaderDTO;", "getHeader", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO;", "getProductContainer", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO$WidgetOptions;", "getWidgetOptions", "WidgetOptions", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommonProductWidgetDTO implements ProductWidgetDTO {
    private final HeaderDTO header;

    @NotNull
    private final ProductContainerDTO productContainer;
    private final WidgetOptions widgetOptions;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO$WidgetOptions;", "", "scrollItemsSpacing", "", "backgroundGradient", "", "", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "getScrollItemsSpacing", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundGradient", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/CommonProductWidgetDTO$WidgetOptions;", "equals", "", "other", "hashCode", "toString", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetOptions {
        private final List<String> backgroundGradient;
        private final Integer scrollItemsSpacing;

        public WidgetOptions(Integer num, List<String> list) {
            this.scrollItemsSpacing = num;
            this.backgroundGradient = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WidgetOptions copy$default(WidgetOptions widgetOptions, Integer num, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = widgetOptions.scrollItemsSpacing;
            }
            if ((i11 & 2) != 0) {
                list = widgetOptions.backgroundGradient;
            }
            return widgetOptions.copy(num, list);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getScrollItemsSpacing() {
            return this.scrollItemsSpacing;
        }

        public final List<String> component2() {
            return this.backgroundGradient;
        }

        @NotNull
        public final WidgetOptions copy(Integer scrollItemsSpacing, List<String> backgroundGradient) {
            return new WidgetOptions(scrollItemsSpacing, backgroundGradient);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetOptions)) {
                return false;
            }
            WidgetOptions widgetOptions = (WidgetOptions) other;
            return Intrinsics.d(this.scrollItemsSpacing, widgetOptions.scrollItemsSpacing) && Intrinsics.d(this.backgroundGradient, widgetOptions.backgroundGradient);
        }

        public final List<String> getBackgroundGradient() {
            return this.backgroundGradient;
        }

        public final Integer getScrollItemsSpacing() {
            return this.scrollItemsSpacing;
        }

        public int hashCode() {
            Integer num = this.scrollItemsSpacing;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<String> list = this.backgroundGradient;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "WidgetOptions(scrollItemsSpacing=" + this.scrollItemsSpacing + ", backgroundGradient=" + this.backgroundGradient + ")";
        }
    }

    public CommonProductWidgetDTO(HeaderDTO headerDTO, @NotNull ProductContainerDTO productContainer, WidgetOptions widgetOptions) {
        Intrinsics.checkNotNullParameter(productContainer, "productContainer");
        this.header = headerDTO;
        this.productContainer = productContainer;
        this.widgetOptions = widgetOptions;
    }

    public static /* synthetic */ CommonProductWidgetDTO copy$default(CommonProductWidgetDTO commonProductWidgetDTO, HeaderDTO headerDTO, ProductContainerDTO productContainerDTO, WidgetOptions widgetOptions, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = commonProductWidgetDTO.header;
        }
        if ((i11 & 2) != 0) {
            productContainerDTO = commonProductWidgetDTO.productContainer;
        }
        if ((i11 & 4) != 0) {
            widgetOptions = commonProductWidgetDTO.widgetOptions;
        }
        return commonProductWidgetDTO.copy(headerDTO, productContainerDTO, widgetOptions);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ProductContainerDTO getProductContainer() {
        return this.productContainer;
    }

    /* renamed from: component3, reason: from getter */
    public final WidgetOptions getWidgetOptions() {
        return this.widgetOptions;
    }

    @NotNull
    public final CommonProductWidgetDTO copy(HeaderDTO header, @NotNull ProductContainerDTO productContainer, WidgetOptions widgetOptions) {
        Intrinsics.checkNotNullParameter(productContainer, "productContainer");
        return new CommonProductWidgetDTO(header, productContainer, widgetOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonProductWidgetDTO)) {
            return false;
        }
        CommonProductWidgetDTO commonProductWidgetDTO = (CommonProductWidgetDTO) other;
        return Intrinsics.d(this.header, commonProductWidgetDTO.header) && Intrinsics.d(this.productContainer, commonProductWidgetDTO.productContainer) && Intrinsics.d(this.widgetOptions, commonProductWidgetDTO.widgetOptions);
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductWidgetDTO
    public HeaderDTO getHeader() {
        return this.header;
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductWidgetDTO
    @NotNull
    public ProductContainerDTO getProductContainer() {
        return this.productContainer;
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductWidgetDTO
    public WidgetOptions getWidgetOptions() {
        return this.widgetOptions;
    }

    public int hashCode() {
        HeaderDTO headerDTO = this.header;
        int hashCode = (this.productContainer.hashCode() + ((headerDTO == null ? 0 : headerDTO.hashCode()) * 31)) * 31;
        WidgetOptions widgetOptions = this.widgetOptions;
        return hashCode + (widgetOptions != null ? widgetOptions.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonProductWidgetDTO(header=" + this.header + ", productContainer=" + this.productContainer + ", widgetOptions=" + this.widgetOptions + ")";
    }
}
