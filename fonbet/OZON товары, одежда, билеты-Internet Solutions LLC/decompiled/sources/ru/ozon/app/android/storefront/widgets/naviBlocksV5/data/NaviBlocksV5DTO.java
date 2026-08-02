package ru.ozon.app.android.storefront.widgets.naviBlocksV5.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/NaviBlocksV5DTO;", "", "backgroundColor", "", "leftBlock", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/BlockV5DTO;", "rightBlock", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/BlockV5DTO;Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/BlockV5DTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getLeftBlock", "()Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/BlockV5DTO;", "getRightBlock", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NaviBlocksV5DTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final BlockV5DTO leftBlock;

    @NotNull
    private final BlockV5DTO rightBlock;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public NaviBlocksV5DTO(@NotNull String backgroundColor, @NotNull BlockV5DTO leftBlock, @NotNull BlockV5DTO rightBlock, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(leftBlock, "leftBlock");
        Intrinsics.checkNotNullParameter(rightBlock, "rightBlock");
        this.backgroundColor = backgroundColor;
        this.leftBlock = leftBlock;
        this.rightBlock = rightBlock;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NaviBlocksV5DTO copy$default(NaviBlocksV5DTO naviBlocksV5DTO, String str, BlockV5DTO blockV5DTO, BlockV5DTO blockV5DTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = naviBlocksV5DTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            blockV5DTO = naviBlocksV5DTO.leftBlock;
        }
        if ((i11 & 4) != 0) {
            blockV5DTO2 = naviBlocksV5DTO.rightBlock;
        }
        if ((i11 & 8) != 0) {
            map = naviBlocksV5DTO.trackingInfo;
        }
        return naviBlocksV5DTO.copy(str, blockV5DTO, blockV5DTO2, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlockV5DTO getLeftBlock() {
        return this.leftBlock;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlockV5DTO getRightBlock() {
        return this.rightBlock;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final NaviBlocksV5DTO copy(@NotNull String backgroundColor, @NotNull BlockV5DTO leftBlock, @NotNull BlockV5DTO rightBlock, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(leftBlock, "leftBlock");
        Intrinsics.checkNotNullParameter(rightBlock, "rightBlock");
        return new NaviBlocksV5DTO(backgroundColor, leftBlock, rightBlock, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaviBlocksV5DTO)) {
            return false;
        }
        NaviBlocksV5DTO naviBlocksV5DTO = (NaviBlocksV5DTO) other;
        return Intrinsics.d(this.backgroundColor, naviBlocksV5DTO.backgroundColor) && Intrinsics.d(this.leftBlock, naviBlocksV5DTO.leftBlock) && Intrinsics.d(this.rightBlock, naviBlocksV5DTO.rightBlock) && Intrinsics.d(this.trackingInfo, naviBlocksV5DTO.trackingInfo);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BlockV5DTO getLeftBlock() {
        return this.leftBlock;
    }

    @NotNull
    public final BlockV5DTO getRightBlock() {
        return this.rightBlock;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.rightBlock.hashCode() + ((this.leftBlock.hashCode() + (this.backgroundColor.hashCode() * 31)) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return "NaviBlocksV5DTO(backgroundColor=" + this.backgroundColor + ", leftBlock=" + this.leftBlock + ", rightBlock=" + this.rightBlock + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
