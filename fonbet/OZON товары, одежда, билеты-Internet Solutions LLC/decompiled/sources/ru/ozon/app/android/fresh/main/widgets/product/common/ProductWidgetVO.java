package ru.ozon.app.android.fresh.main.widgets.product.common;

import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductVO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\"B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;", "products", "Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO$Options;", "options", "<init>", "(JLjava/util/List;Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO$Options;)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO$Options;)Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO$Options;", "getOptions", "()Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO$Options;", "Options", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductWidgetVO implements c {
    private final long id;
    private final Options options;

    @NotNull
    private final List<ProductVO> products;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO$Options;", "", "", "imageGrey", "itemsAreFaded", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getImageGrey", "()Z", "getItemsAreFaded", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options {
        private final boolean imageGrey;
        private final boolean itemsAreFaded;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Options() {
            this(r2, r2, 3, null);
            boolean z11 = false;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return this.imageGrey == options.imageGrey && this.itemsAreFaded == options.itemsAreFaded;
        }

        public int hashCode() {
            return Boolean.hashCode(this.itemsAreFaded) + (Boolean.hashCode(this.imageGrey) * 31);
        }

        @NotNull
        public String toString() {
            return Ef0.c.c("Options(imageGrey=", ", itemsAreFaded=", ")", this.imageGrey, this.itemsAreFaded);
        }

        public Options(boolean z11, boolean z12) {
            this.imageGrey = z11;
            this.itemsAreFaded = z12;
        }

        public /* synthetic */ Options(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
        }
    }

    public ProductWidgetVO(long j11, @NotNull List<ProductVO> products, Options options) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.id = j11;
        this.products = products;
        this.options = options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductWidgetVO copy$default(ProductWidgetVO productWidgetVO, long j11, List list, Options options, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = productWidgetVO.id;
        }
        if ((i11 & 2) != 0) {
            list = productWidgetVO.products;
        }
        if ((i11 & 4) != 0) {
            options = productWidgetVO.options;
        }
        return productWidgetVO.copy(j11, list, options);
    }

    @NotNull
    public final ProductWidgetVO copy(long id2, @NotNull List<ProductVO> products, Options options) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new ProductWidgetVO(id2, products, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductWidgetVO)) {
            return false;
        }
        ProductWidgetVO productWidgetVO = (ProductWidgetVO) other;
        return this.id == productWidgetVO.id && Intrinsics.d(this.products, productWidgetVO.products) && Intrinsics.d(this.options, productWidgetVO.options);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ProductVO> getProducts() {
        return this.products;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.products);
        Options options = this.options;
        return b11 + (options == null ? 0 : options.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ProductVO> list = this.products;
        Options options = this.options;
        StringBuilder b11 = b.b(j11, "ProductWidgetVO(id=", ", products=", list);
        b11.append(", options=");
        b11.append(options);
        b11.append(")");
        return b11.toString();
    }
}
