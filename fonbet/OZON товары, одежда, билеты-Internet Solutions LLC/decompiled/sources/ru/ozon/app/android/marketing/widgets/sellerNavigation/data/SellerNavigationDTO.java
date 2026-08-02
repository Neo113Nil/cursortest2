package ru.ozon.app.android.marketing.widgets.sellerNavigation.data;

import G.g;
import H3.c;
import N3.C3660k;
import Pk0.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerNavigation/data/SellerNavigationDTO;", "", "items", "", "Lru/ozon/app/android/marketing/widgets/sellerNavigation/data/SellerNavigationDTO$SellerNavigationItemDTO;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SellerNavigationItemDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerNavigationDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<SellerNavigationItemDTO> items;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerNavigation/data/SellerNavigationDTO$SellerNavigationItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "deeplink", "isActive", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getDeeplink", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SellerNavigationItemDTO {
        public static final int $stable = 0;

        @NotNull
        private final String deeplink;
        private final boolean isActive;

        @NotNull
        private final String title;

        public SellerNavigationItemDTO(@NotNull String title, @NotNull String deeplink, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.title = title;
            this.deeplink = deeplink;
            this.isActive = z11;
        }

        public static /* synthetic */ SellerNavigationItemDTO copy$default(SellerNavigationItemDTO sellerNavigationItemDTO, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sellerNavigationItemDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = sellerNavigationItemDTO.deeplink;
            }
            if ((i11 & 4) != 0) {
                z11 = sellerNavigationItemDTO.isActive;
            }
            return sellerNavigationItemDTO.copy(str, str2, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public final SellerNavigationItemDTO copy(@NotNull String title, @NotNull String deeplink, boolean isActive) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new SellerNavigationItemDTO(title, deeplink, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerNavigationItemDTO)) {
                return false;
            }
            SellerNavigationItemDTO sellerNavigationItemDTO = (SellerNavigationItemDTO) other;
            return Intrinsics.d(this.title, sellerNavigationItemDTO.title) && Intrinsics.d(this.deeplink, sellerNavigationItemDTO.deeplink) && this.isActive == sellerNavigationItemDTO.isActive;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isActive) + g.a(this.title.hashCode() * 31, 31, this.deeplink);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.deeplink;
            return a.a(")", C3660k.d("SellerNavigationItemDTO(title=", str, ", deeplink=", str2, ", isActive="), this.isActive);
        }
    }

    public SellerNavigationDTO(@NotNull List<SellerNavigationItemDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SellerNavigationDTO copy$default(SellerNavigationDTO sellerNavigationDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sellerNavigationDTO.items;
        }
        return sellerNavigationDTO.copy(list);
    }

    @NotNull
    public final List<SellerNavigationItemDTO> component1() {
        return this.items;
    }

    @NotNull
    public final SellerNavigationDTO copy(@NotNull List<SellerNavigationItemDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new SellerNavigationDTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SellerNavigationDTO) && Intrinsics.d(this.items, ((SellerNavigationDTO) other).items);
    }

    @NotNull
    public final List<SellerNavigationItemDTO> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("SellerNavigationDTO(items=", ")", this.items);
    }
}
