package ru.ozon.app.android.cart.cartSplitV2.accessories;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesResponse;", "", "shelf", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesShelfDTO;", "emptyShelfTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesShelfDTO;Ljava/util/Map;)V", "getShelf", "()Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesShelfDTO;", "getEmptyShelfTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AccessoriesResponse {
    public static final int $stable = 8;
    private final Map<String, TokenizedTrackingInfo> emptyShelfTrackingInfo;
    private final AccessoriesShelfDTO shelf;

    public AccessoriesResponse(AccessoriesShelfDTO accessoriesShelfDTO, Map<String, TokenizedTrackingInfo> map) {
        this.shelf = accessoriesShelfDTO;
        this.emptyShelfTrackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccessoriesResponse copy$default(AccessoriesResponse accessoriesResponse, AccessoriesShelfDTO accessoriesShelfDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            accessoriesShelfDTO = accessoriesResponse.shelf;
        }
        if ((i11 & 2) != 0) {
            map = accessoriesResponse.emptyShelfTrackingInfo;
        }
        return accessoriesResponse.copy(accessoriesShelfDTO, map);
    }

    /* renamed from: component1, reason: from getter */
    public final AccessoriesShelfDTO getShelf() {
        return this.shelf;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.emptyShelfTrackingInfo;
    }

    @NotNull
    public final AccessoriesResponse copy(AccessoriesShelfDTO shelf, Map<String, TokenizedTrackingInfo> emptyShelfTrackingInfo) {
        return new AccessoriesResponse(shelf, emptyShelfTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoriesResponse)) {
            return false;
        }
        AccessoriesResponse accessoriesResponse = (AccessoriesResponse) other;
        return Intrinsics.d(this.shelf, accessoriesResponse.shelf) && Intrinsics.d(this.emptyShelfTrackingInfo, accessoriesResponse.emptyShelfTrackingInfo);
    }

    public final Map<String, TokenizedTrackingInfo> getEmptyShelfTrackingInfo() {
        return this.emptyShelfTrackingInfo;
    }

    public final AccessoriesShelfDTO getShelf() {
        return this.shelf;
    }

    public int hashCode() {
        AccessoriesShelfDTO accessoriesShelfDTO = this.shelf;
        int hashCode = (accessoriesShelfDTO == null ? 0 : accessoriesShelfDTO.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.emptyShelfTrackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessoriesResponse(shelf=" + this.shelf + ", emptyShelfTrackingInfo=" + this.emptyShelfTrackingInfo + ")";
    }
}
