package ru.ozon.app.android.common.navigationblocks.presentation;

import Ak.C2436a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.navigationblocks.data.NavigationBlocksV2DTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlocksV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "outerBackgroundColor", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;", "roundedCorners", "", "Lru/ozon/app/android/common/navigationblocks/presentation/NavigationBlock;", "blocks", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getOuterBackgroundColor", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;", "getRoundedCorners", "()Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;", "Ljava/util/List;", "getBlocks", "()Ljava/util/List;", "navigation-blocks_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavigationBlocksV2VO implements c {

    @NotNull
    private final List<NavigationBlock> blocks;
    private final long id;
    private final String outerBackgroundColor;

    @NotNull
    private final NavigationBlocksV2DTO.RoundedCorners roundedCorners;

    public NavigationBlocksV2VO(long j11, String str, @NotNull NavigationBlocksV2DTO.RoundedCorners roundedCorners, @NotNull List<NavigationBlock> blocks) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.id = j11;
        this.outerBackgroundColor = str;
        this.roundedCorners = roundedCorners;
        this.blocks = blocks;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBlocksV2VO)) {
            return false;
        }
        NavigationBlocksV2VO navigationBlocksV2VO = (NavigationBlocksV2VO) other;
        return this.id == navigationBlocksV2VO.id && Intrinsics.d(this.outerBackgroundColor, navigationBlocksV2VO.outerBackgroundColor) && this.roundedCorners == navigationBlocksV2VO.roundedCorners && Intrinsics.d(this.blocks, navigationBlocksV2VO.blocks);
    }

    @NotNull
    public final List<NavigationBlock> getBlocks() {
        return this.blocks;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    @NotNull
    public final NavigationBlocksV2DTO.RoundedCorners getRoundedCorners() {
        return this.roundedCorners;
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
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.outerBackgroundColor;
        return this.blocks.hashCode() + ((this.roundedCorners.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.outerBackgroundColor;
        NavigationBlocksV2DTO.RoundedCorners roundedCorners = this.roundedCorners;
        List<NavigationBlock> list = this.blocks;
        StringBuilder c11 = C2436a.c(j11, "NavigationBlocksV2VO(id=", ", outerBackgroundColor=", str);
        c11.append(", roundedCorners=");
        c11.append(roundedCorners);
        c11.append(", blocks=");
        c11.append(list);
        c11.append(")");
        return c11.toString();
    }
}
