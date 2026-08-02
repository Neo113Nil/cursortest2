package ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.data;

import B3.p;
import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commondisclaimerv2/data/LayoutPaddings;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "leftPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getLeftPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LayoutPaddings {
    public static final int $stable = 0;
    private final Paddings bottomPadding;
    private final Paddings leftPadding;
    private final Paddings rightPadding;
    private final Paddings topPadding;

    public LayoutPaddings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
        this.topPadding = paddings;
        this.rightPadding = paddings2;
        this.leftPadding = paddings3;
        this.bottomPadding = paddings4;
    }

    public static /* synthetic */ LayoutPaddings copy$default(LayoutPaddings layoutPaddings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddings = layoutPaddings.topPadding;
        }
        if ((i11 & 2) != 0) {
            paddings2 = layoutPaddings.rightPadding;
        }
        if ((i11 & 4) != 0) {
            paddings3 = layoutPaddings.leftPadding;
        }
        if ((i11 & 8) != 0) {
            paddings4 = layoutPaddings.bottomPadding;
        }
        return layoutPaddings.copy(paddings, paddings2, paddings3, paddings4);
    }

    /* renamed from: component1, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component2, reason: from getter */
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final LayoutPaddings copy(Paddings topPadding, Paddings rightPadding, Paddings leftPadding, Paddings bottomPadding) {
        return new LayoutPaddings(topPadding, rightPadding, leftPadding, bottomPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LayoutPaddings)) {
            return false;
        }
        LayoutPaddings layoutPaddings = (LayoutPaddings) other;
        return this.topPadding == layoutPaddings.topPadding && this.rightPadding == layoutPaddings.rightPadding && this.leftPadding == layoutPaddings.leftPadding && this.bottomPadding == layoutPaddings.bottomPadding;
    }

    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        Paddings paddings = this.topPadding;
        int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
        Paddings paddings2 = this.rightPadding;
        int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.leftPadding;
        int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.bottomPadding;
        return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.rightPadding;
        return b.e(p.b("LayoutPaddings(topPadding=", paddings, ", rightPadding=", paddings2, ", leftPadding="), this.leftPadding, ", bottomPadding=", this.bottomPadding, ")");
    }
}
