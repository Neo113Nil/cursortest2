package ru.ozon.app.android.storefront.widgets.naviBlocksV3.data;

import D40.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/NaviBlocksV3DTO;", "", "blocks", "", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockV3DTO;", "paddings", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/PaddingsDTO;", "centralBlockMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/PaddingsDTO;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getBlocks", "()Ljava/util/List;", "getPaddings", "()Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/PaddingsDTO;", "getCentralBlockMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NaviBlocksV3DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<BlockV3DTO> blocks;
    private final Paddings centralBlockMargin;
    private final PaddingsDTO paddings;

    public NaviBlocksV3DTO(@NotNull List<BlockV3DTO> blocks, PaddingsDTO paddingsDTO, Paddings paddings) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.blocks = blocks;
        this.paddings = paddingsDTO;
        this.centralBlockMargin = paddings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NaviBlocksV3DTO copy$default(NaviBlocksV3DTO naviBlocksV3DTO, List list, PaddingsDTO paddingsDTO, Paddings paddings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = naviBlocksV3DTO.blocks;
        }
        if ((i11 & 2) != 0) {
            paddingsDTO = naviBlocksV3DTO.paddings;
        }
        if ((i11 & 4) != 0) {
            paddings = naviBlocksV3DTO.centralBlockMargin;
        }
        return naviBlocksV3DTO.copy(list, paddingsDTO, paddings);
    }

    @NotNull
    public final List<BlockV3DTO> component1() {
        return this.blocks;
    }

    /* renamed from: component2, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    /* renamed from: component3, reason: from getter */
    public final Paddings getCentralBlockMargin() {
        return this.centralBlockMargin;
    }

    @NotNull
    public final NaviBlocksV3DTO copy(@NotNull List<BlockV3DTO> blocks, PaddingsDTO paddings, Paddings centralBlockMargin) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new NaviBlocksV3DTO(blocks, paddings, centralBlockMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaviBlocksV3DTO)) {
            return false;
        }
        NaviBlocksV3DTO naviBlocksV3DTO = (NaviBlocksV3DTO) other;
        return Intrinsics.d(this.blocks, naviBlocksV3DTO.blocks) && Intrinsics.d(this.paddings, naviBlocksV3DTO.paddings) && this.centralBlockMargin == naviBlocksV3DTO.centralBlockMargin;
    }

    @NotNull
    public final List<BlockV3DTO> getBlocks() {
        return this.blocks;
    }

    public final Paddings getCentralBlockMargin() {
        return this.centralBlockMargin;
    }

    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public int hashCode() {
        int hashCode = this.blocks.hashCode() * 31;
        PaddingsDTO paddingsDTO = this.paddings;
        int hashCode2 = (hashCode + (paddingsDTO == null ? 0 : paddingsDTO.hashCode())) * 31;
        Paddings paddings = this.centralBlockMargin;
        return hashCode2 + (paddings != null ? paddings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<BlockV3DTO> list = this.blocks;
        PaddingsDTO paddingsDTO = this.paddings;
        Paddings paddings = this.centralBlockMargin;
        StringBuilder sb2 = new StringBuilder("NaviBlocksV3DTO(blocks=");
        sb2.append(list);
        sb2.append(", paddings=");
        sb2.append(paddingsDTO);
        sb2.append(", centralBlockMargin=");
        return b.b(sb2, paddings, ")");
    }
}
