package ru.ozon.app.android.account.orders.productsPackage.data;

import B90.C2618u;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/productsPackage/data/GiftDTO;", "", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "items", "", "Lru/ozon/app/android/account/orders/productsPackage/data/PackageProductDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GiftDTO {
    public static final int $stable = 8;

    @NotNull
    private final String icon;
    private final List<PackageProductDTO> items;

    @NotNull
    private final String title;

    public GiftDTO(@NotNull String icon, @NotNull String title, List<PackageProductDTO> list) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = icon;
        this.title = title;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftDTO copy$default(GiftDTO giftDTO, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = giftDTO.icon;
        }
        if ((i11 & 2) != 0) {
            str2 = giftDTO.title;
        }
        if ((i11 & 4) != 0) {
            list = giftDTO.items;
        }
        return giftDTO.copy(str, str2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<PackageProductDTO> component3() {
        return this.items;
    }

    @NotNull
    public final GiftDTO copy(@NotNull String icon, @NotNull String title, List<PackageProductDTO> items) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        return new GiftDTO(icon, title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftDTO)) {
            return false;
        }
        GiftDTO giftDTO = (GiftDTO) other;
        return Intrinsics.d(this.icon, giftDTO.icon) && Intrinsics.d(this.title, giftDTO.title) && Intrinsics.d(this.items, giftDTO.items);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final List<PackageProductDTO> getItems() {
        return this.items;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(this.icon.hashCode() * 31, 31, this.title);
        List<PackageProductDTO> list = this.items;
        return a11 + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        return C2618u.h(C3660k.d("GiftDTO(icon=", str, ", title=", str2, ", items="), this.items, ")");
    }
}
