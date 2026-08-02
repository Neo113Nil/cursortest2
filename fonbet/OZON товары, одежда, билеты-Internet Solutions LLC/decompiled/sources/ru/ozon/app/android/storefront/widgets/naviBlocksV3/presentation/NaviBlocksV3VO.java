package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation;

import G.g;
import GR.b;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0011¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3VO;", "blocks", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/PaddingsVO;", "paddings", "Lru/ozon/uni/atoms/data/common/Paddings;", "centralBlockMargin", "", "backgroundColorToken", "<init>", "(JLjava/util/List;Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/PaddingsVO;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBlocks", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/PaddingsVO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getCentralBlockMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "Ljava/lang/String;", "getBackgroundColorToken", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NaviBlocksV3VO implements c {

    @NotNull
    private final String backgroundColorToken;

    @NotNull
    private final List<BlockV3VO> blocks;

    @NotNull
    private final Paddings centralBlockMargin;
    private final long id;

    @NotNull
    private final PaddingsVO paddings;

    public NaviBlocksV3VO(long j11, @NotNull List<BlockV3VO> blocks, @NotNull PaddingsVO paddings, @NotNull Paddings centralBlockMargin, @NotNull String backgroundColorToken) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(centralBlockMargin, "centralBlockMargin");
        Intrinsics.checkNotNullParameter(backgroundColorToken, "backgroundColorToken");
        this.id = j11;
        this.blocks = blocks;
        this.paddings = paddings;
        this.centralBlockMargin = centralBlockMargin;
        this.backgroundColorToken = backgroundColorToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaviBlocksV3VO)) {
            return false;
        }
        NaviBlocksV3VO naviBlocksV3VO = (NaviBlocksV3VO) other;
        return this.id == naviBlocksV3VO.id && Intrinsics.d(this.blocks, naviBlocksV3VO.blocks) && Intrinsics.d(this.paddings, naviBlocksV3VO.paddings) && this.centralBlockMargin == naviBlocksV3VO.centralBlockMargin && Intrinsics.d(this.backgroundColorToken, naviBlocksV3VO.backgroundColorToken);
    }

    @NotNull
    public final String getBackgroundColorToken() {
        return this.backgroundColorToken;
    }

    @NotNull
    public final List<BlockV3VO> getBlocks() {
        return this.blocks;
    }

    @NotNull
    public final Paddings getCentralBlockMargin() {
        return this.centralBlockMargin;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
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
        return this.backgroundColorToken.hashCode() + b.b(this.centralBlockMargin, (this.paddings.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.blocks)) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<BlockV3VO> list = this.blocks;
        PaddingsVO paddingsVO = this.paddings;
        Paddings paddings = this.centralBlockMargin;
        String str = this.backgroundColorToken;
        StringBuilder b11 = Lh.b.b(j11, "NaviBlocksV3VO(id=", ", blocks=", list);
        b11.append(", paddings=");
        b11.append(paddingsVO);
        b11.append(", centralBlockMargin=");
        b11.append(paddings);
        return C6594f.a(", backgroundColorToken=", str, ")", b11);
    }
}
