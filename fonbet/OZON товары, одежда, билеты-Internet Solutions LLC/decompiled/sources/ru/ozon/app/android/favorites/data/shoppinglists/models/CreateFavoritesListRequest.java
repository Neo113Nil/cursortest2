package ru.ozon.app.android.favorites.data.shoppinglists.models;

import N3.C3660k;
import TY.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListRequest;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "hash", "category", "", "fromList", "parentCategoryId", "isWishlist", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getHash", "getCategory", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFromList", "getParentCategoryId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lru/ozon/app/android/favorites/data/shoppinglists/models/CreateFavoritesListRequest;", "equals", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CreateFavoritesListRequest {
    private final Long category;
    private final Long fromList;
    private final String hash;
    private final Boolean isWishlist;
    private final Long parentCategoryId;
    private final String title;

    public CreateFavoritesListRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CreateFavoritesListRequest copy$default(CreateFavoritesListRequest createFavoritesListRequest, String str, String str2, Long l11, Long l12, Long l13, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = createFavoritesListRequest.title;
        }
        if ((i11 & 2) != 0) {
            str2 = createFavoritesListRequest.hash;
        }
        if ((i11 & 4) != 0) {
            l11 = createFavoritesListRequest.category;
        }
        if ((i11 & 8) != 0) {
            l12 = createFavoritesListRequest.fromList;
        }
        if ((i11 & 16) != 0) {
            l13 = createFavoritesListRequest.parentCategoryId;
        }
        if ((i11 & 32) != 0) {
            bool = createFavoritesListRequest.isWishlist;
        }
        Long l14 = l13;
        Boolean bool2 = bool;
        return createFavoritesListRequest.copy(str, str2, l11, l12, l14, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getCategory() {
        return this.category;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getFromList() {
        return this.fromList;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsWishlist() {
        return this.isWishlist;
    }

    @NotNull
    public final CreateFavoritesListRequest copy(String title, String hash, Long category, Long fromList, Long parentCategoryId, Boolean isWishlist) {
        return new CreateFavoritesListRequest(title, hash, category, fromList, parentCategoryId, isWishlist);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateFavoritesListRequest)) {
            return false;
        }
        CreateFavoritesListRequest createFavoritesListRequest = (CreateFavoritesListRequest) other;
        return Intrinsics.d(this.title, createFavoritesListRequest.title) && Intrinsics.d(this.hash, createFavoritesListRequest.hash) && Intrinsics.d(this.category, createFavoritesListRequest.category) && Intrinsics.d(this.fromList, createFavoritesListRequest.fromList) && Intrinsics.d(this.parentCategoryId, createFavoritesListRequest.parentCategoryId) && Intrinsics.d(this.isWishlist, createFavoritesListRequest.isWishlist);
    }

    public final Long getCategory() {
        return this.category;
    }

    public final Long getFromList() {
        return this.fromList;
    }

    public final String getHash() {
        return this.hash;
    }

    public final Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hash;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.category;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.fromList;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.parentCategoryId;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Boolean bool = this.isWishlist;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isWishlist() {
        return this.isWishlist;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.hash;
        Long l11 = this.category;
        Long l12 = this.fromList;
        Long l13 = this.parentCategoryId;
        Boolean bool = this.isWishlist;
        StringBuilder d11 = C3660k.d("CreateFavoritesListRequest(title=", str, ", hash=", str2, ", category=");
        a.e(d11, l11, ", fromList=", l12, ", parentCategoryId=");
        d11.append(l13);
        d11.append(", isWishlist=");
        d11.append(bool);
        d11.append(")");
        return d11.toString();
    }

    public CreateFavoritesListRequest(String str, String str2, Long l11, Long l12, Long l13, Boolean bool) {
        this.title = str;
        this.hash = str2;
        this.category = l11;
        this.fromList = l12;
        this.parentCategoryId = l13;
        this.isWishlist = bool;
    }

    public /* synthetic */ CreateFavoritesListRequest(String str, String str2, Long l11, Long l12, Long l13, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : l13, (i11 & 32) != 0 ? null : bool);
    }
}
