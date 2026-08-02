package ru.ozon.app.android.common.navigationblocks.data;

import B90.C2618u;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO;", "", "outerBackgroundColor", "", "roundedCorners", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;", "blocks", "", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlockDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;Ljava/util/List;)V", "getOuterBackgroundColor", "()Ljava/lang/String;", "getRoundedCorners", "()Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;", "getBlocks", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "RoundedCorners", "navigation-blocks_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavigationBlocksV2DTO {

    @NotNull
    private final List<NavigationBlockDTO> blocks;
    private final String outerBackgroundColor;

    @NotNull
    private final RoundedCorners roundedCorners;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BOTTOM", "navigation-blocks_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RoundedCorners {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RoundedCorners[] $VALUES;

        @i(name = "NONE")
        public static final RoundedCorners NONE = new RoundedCorners("NONE", 0);

        @i(name = "BOTTOM")
        public static final RoundedCorners BOTTOM = new RoundedCorners("BOTTOM", 1);

        private static final /* synthetic */ RoundedCorners[] $values() {
            return new RoundedCorners[]{NONE, BOTTOM};
        }

        static {
            RoundedCorners[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RoundedCorners(String str, int i11) {
        }

        public static RoundedCorners valueOf(String str) {
            return (RoundedCorners) Enum.valueOf(RoundedCorners.class, str);
        }

        public static RoundedCorners[] values() {
            return (RoundedCorners[]) $VALUES.clone();
        }
    }

    public NavigationBlocksV2DTO(String str, @NotNull RoundedCorners roundedCorners, @NotNull List<NavigationBlockDTO> blocks) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.outerBackgroundColor = str;
        this.roundedCorners = roundedCorners;
        this.blocks = blocks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationBlocksV2DTO copy$default(NavigationBlocksV2DTO navigationBlocksV2DTO, String str, RoundedCorners roundedCorners, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationBlocksV2DTO.outerBackgroundColor;
        }
        if ((i11 & 2) != 0) {
            roundedCorners = navigationBlocksV2DTO.roundedCorners;
        }
        if ((i11 & 4) != 0) {
            list = navigationBlocksV2DTO.blocks;
        }
        return navigationBlocksV2DTO.copy(str, roundedCorners, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RoundedCorners getRoundedCorners() {
        return this.roundedCorners;
    }

    @NotNull
    public final List<NavigationBlockDTO> component3() {
        return this.blocks;
    }

    @NotNull
    public final NavigationBlocksV2DTO copy(String outerBackgroundColor, @NotNull RoundedCorners roundedCorners, @NotNull List<NavigationBlockDTO> blocks) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new NavigationBlocksV2DTO(outerBackgroundColor, roundedCorners, blocks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBlocksV2DTO)) {
            return false;
        }
        NavigationBlocksV2DTO navigationBlocksV2DTO = (NavigationBlocksV2DTO) other;
        return Intrinsics.d(this.outerBackgroundColor, navigationBlocksV2DTO.outerBackgroundColor) && this.roundedCorners == navigationBlocksV2DTO.roundedCorners && Intrinsics.d(this.blocks, navigationBlocksV2DTO.blocks);
    }

    @NotNull
    public final List<NavigationBlockDTO> getBlocks() {
        return this.blocks;
    }

    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    @NotNull
    public final RoundedCorners getRoundedCorners() {
        return this.roundedCorners;
    }

    public int hashCode() {
        String str = this.outerBackgroundColor;
        return this.blocks.hashCode() + ((this.roundedCorners.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.outerBackgroundColor;
        RoundedCorners roundedCorners = this.roundedCorners;
        List<NavigationBlockDTO> list = this.blocks;
        StringBuilder sb2 = new StringBuilder("NavigationBlocksV2DTO(outerBackgroundColor=");
        sb2.append(str);
        sb2.append(", roundedCorners=");
        sb2.append(roundedCorners);
        sb2.append(", blocks=");
        return C2618u.h(sb2, list, ")");
    }

    public /* synthetic */ NavigationBlocksV2DTO(String str, RoundedCorners roundedCorners, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? RoundedCorners.NONE : roundedCorners, list);
    }
}
