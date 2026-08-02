package ru.ozon.app.android.cscore.padding;

import B3.p;
import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cscore/padding/PaddingCompose;", "", "left", "Lru/ozon/uni/atoms/data/common/Paddings;", "top", "right", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeft", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTop", "getRight", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaddingCompose {
    public static final int $stable = 0;

    @NotNull
    private final Paddings bottom;

    @NotNull
    private final Paddings left;

    @NotNull
    private final Paddings right;

    @NotNull
    private final Paddings top;

    public PaddingCompose(@NotNull Paddings left, @NotNull Paddings top, @NotNull Paddings right, @NotNull Paddings bottom) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public static /* synthetic */ PaddingCompose copy$default(PaddingCompose paddingCompose, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddings = paddingCompose.left;
        }
        if ((i11 & 2) != 0) {
            paddings2 = paddingCompose.top;
        }
        if ((i11 & 4) != 0) {
            paddings3 = paddingCompose.right;
        }
        if ((i11 & 8) != 0) {
            paddings4 = paddingCompose.bottom;
        }
        return paddingCompose.copy(paddings, paddings2, paddings3, paddings4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Paddings getLeft() {
        return this.left;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getTop() {
        return this.top;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Paddings getRight() {
        return this.right;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Paddings getBottom() {
        return this.bottom;
    }

    @NotNull
    public final PaddingCompose copy(@NotNull Paddings left, @NotNull Paddings top, @NotNull Paddings right, @NotNull Paddings bottom) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        return new PaddingCompose(left, top, right, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingCompose)) {
            return false;
        }
        PaddingCompose paddingCompose = (PaddingCompose) other;
        return this.left == paddingCompose.left && this.top == paddingCompose.top && this.right == paddingCompose.right && this.bottom == paddingCompose.bottom;
    }

    @NotNull
    public final Paddings getBottom() {
        return this.bottom;
    }

    @NotNull
    public final Paddings getLeft() {
        return this.left;
    }

    @NotNull
    public final Paddings getRight() {
        return this.right;
    }

    @NotNull
    public final Paddings getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.bottom.hashCode() + b.b(this.right, b.b(this.top, this.left.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        Paddings paddings = this.left;
        Paddings paddings2 = this.top;
        return b.e(p.b("PaddingCompose(left=", paddings, ", top=", paddings2, ", right="), this.right, ", bottom=", this.bottom, ")");
    }
}
