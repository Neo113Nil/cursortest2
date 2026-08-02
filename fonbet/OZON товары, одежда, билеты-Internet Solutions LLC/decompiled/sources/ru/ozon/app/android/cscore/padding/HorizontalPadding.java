package ru.ozon.app.android.cscore.padding;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "", "left", "Lru/ozon/uni/atoms/data/common/Paddings;", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeft", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HorizontalPadding {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HorizontalPadding DEFAULT_PADDING_500;

    @NotNull
    private final Paddings left;

    @NotNull
    private final Paddings right;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cscore/padding/HorizontalPadding$Companion;", "", "<init>", "()V", "DEFAULT_PADDING_500", "Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "getDEFAULT_PADDING_500", "()Lru/ozon/app/android/cscore/padding/HorizontalPadding;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HorizontalPadding getDEFAULT_PADDING_500() {
            return HorizontalPadding.DEFAULT_PADDING_500;
        }

        private Companion() {
        }
    }

    static {
        Paddings paddings = Paddings.PADDING_500;
        DEFAULT_PADDING_500 = new HorizontalPadding(paddings, paddings);
    }

    public HorizontalPadding(@NotNull Paddings left, @NotNull Paddings right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        this.left = left;
        this.right = right;
    }

    public static /* synthetic */ HorizontalPadding copy$default(HorizontalPadding horizontalPadding, Paddings paddings, Paddings paddings2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddings = horizontalPadding.left;
        }
        if ((i11 & 2) != 0) {
            paddings2 = horizontalPadding.right;
        }
        return horizontalPadding.copy(paddings, paddings2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Paddings getLeft() {
        return this.left;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getRight() {
        return this.right;
    }

    @NotNull
    public final HorizontalPadding copy(@NotNull Paddings left, @NotNull Paddings right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        return new HorizontalPadding(left, right);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalPadding)) {
            return false;
        }
        HorizontalPadding horizontalPadding = (HorizontalPadding) other;
        return this.left == horizontalPadding.left && this.right == horizontalPadding.right;
    }

    @NotNull
    public final Paddings getLeft() {
        return this.left;
    }

    @NotNull
    public final Paddings getRight() {
        return this.right;
    }

    public int hashCode() {
        return this.right.hashCode() + (this.left.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "HorizontalPadding(left=" + this.left + ", right=" + this.right + ")";
    }
}
