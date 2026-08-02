package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation;

import B3.p;
import GR.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/PaddingsVO;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "rightPadding", "leftPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getLeftPadding", "getBottomPadding", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PaddingsVO {

    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final Paddings leftPadding;

    @NotNull
    private final Paddings rightPadding;

    @NotNull
    private final Paddings topPadding;

    public PaddingsVO(@NotNull Paddings topPadding, @NotNull Paddings rightPadding, @NotNull Paddings leftPadding, @NotNull Paddings bottomPadding) {
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        this.topPadding = topPadding;
        this.rightPadding = rightPadding;
        this.leftPadding = leftPadding;
        this.bottomPadding = bottomPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingsVO)) {
            return false;
        }
        PaddingsVO paddingsVO = (PaddingsVO) other;
        return this.topPadding == paddingsVO.topPadding && this.rightPadding == paddingsVO.rightPadding && this.leftPadding == paddingsVO.leftPadding && this.bottomPadding == paddingsVO.bottomPadding;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        return this.bottomPadding.hashCode() + b.b(this.leftPadding, b.b(this.rightPadding, this.topPadding.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.rightPadding;
        return b.e(p.b("PaddingsVO(topPadding=", paddings, ", rightPadding=", paddings2, ", leftPadding="), this.leftPadding, ", bottomPadding=", this.bottomPadding, ")");
    }
}
