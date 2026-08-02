package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem;

import D40.a;
import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/Item;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem;", "products", "", "backgroundColor", "", "isScrollToButton", "<init>", "(JLjava/util/List;Ljava/lang/String;Z)V", "copy", "(JLjava/util/List;Ljava/lang/String;Z)Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/Item;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Z", "()Z", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Item implements c {

    @NotNull
    private final String backgroundColor;
    private final long id;
    private final transient boolean isScrollToButton;

    @NotNull
    private final List<ProductListItem> products;

    /* JADX WARN: Multi-variable type inference failed */
    public Item(long j11, @NotNull List<? extends ProductListItem> products, @NotNull String backgroundColor, boolean z11) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.products = products;
        this.backgroundColor = backgroundColor;
        this.isScrollToButton = z11;
    }

    public static /* synthetic */ Item copy$default(Item item, long j11, List list, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = item.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = item.products;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            str = item.backgroundColor;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            z11 = item.isScrollToButton;
        }
        return item.copy(j12, list2, str2, z11);
    }

    @NotNull
    public final Item copy(long id2, @NotNull List<? extends ProductListItem> products, @NotNull String backgroundColor, boolean isScrollToButton) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new Item(id2, products, backgroundColor, isScrollToButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return this.id == item.id && Intrinsics.d(this.products, item.products) && Intrinsics.d(this.backgroundColor, item.backgroundColor) && this.isScrollToButton == item.isScrollToButton;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ProductListItem> getProducts() {
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
        return Boolean.hashCode(this.isScrollToButton) + g.a(g.b(Long.hashCode(this.id) * 31, 31, this.products), 31, this.backgroundColor);
    }

    /* renamed from: isScrollToButton, reason: from getter */
    public final boolean getIsScrollToButton() {
        return this.isScrollToButton;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ProductListItem> list = this.products;
        String str = this.backgroundColor;
        boolean z11 = this.isScrollToButton;
        StringBuilder b11 = b.b(j11, "Item(id=", ", products=", list);
        a.g(", backgroundColor=", str, ", isScrollToButton=", b11, z11);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ Item(long j11, List list, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, str, (i11 & 8) != 0 ? false : z11);
    }
}
