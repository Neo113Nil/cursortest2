package ru.ozon.app.android.cart.cartSplitV2.accessories;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesHeaderDTO;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTrackingInfo", "()Ljava/util/Map;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AccessoriesHeaderDTO {
    public static final int $stable = 8;

    @NotNull
    private final TextDTO text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AccessoriesHeaderDTO(Map<String, TokenizedTrackingInfo> map, @NotNull TextDTO text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.trackingInfo = map;
        this.text = text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccessoriesHeaderDTO copy$default(AccessoriesHeaderDTO accessoriesHeaderDTO, Map map, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = accessoriesHeaderDTO.trackingInfo;
        }
        if ((i11 & 2) != 0) {
            textDTO = accessoriesHeaderDTO.text;
        }
        return accessoriesHeaderDTO.copy(map, textDTO);
    }

    public final Map<String, TokenizedTrackingInfo> component1() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    public final AccessoriesHeaderDTO copy(Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull TextDTO text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new AccessoriesHeaderDTO(trackingInfo, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoriesHeaderDTO)) {
            return false;
        }
        AccessoriesHeaderDTO accessoriesHeaderDTO = (AccessoriesHeaderDTO) other;
        return Intrinsics.d(this.trackingInfo, accessoriesHeaderDTO.trackingInfo) && Intrinsics.d(this.text, accessoriesHeaderDTO.text);
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.text.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "AccessoriesHeaderDTO(trackingInfo=" + this.trackingInfo + ", text=" + this.text + ")";
    }
}
