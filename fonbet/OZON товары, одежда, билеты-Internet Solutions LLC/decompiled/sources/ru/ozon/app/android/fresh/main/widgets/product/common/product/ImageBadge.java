package ru.ozon.app.android.fresh.main.widgets.product.common.product;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ImageBadge;", "", "position", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ImageBadge$Position;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/product/common/product/ImageBadge$Position;Lru/ozon/uni/atoms/data/badge/Badge;)V", "getPosition", "()Lru/ozon/app/android/fresh/main/widgets/product/common/product/ImageBadge$Position;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Position", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ImageBadge {

    @NotNull
    private final Badge badge;

    @NotNull
    private final Position position;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ImageBadge$Position;", "", "x", "", "y", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getX", "()Ljava/lang/String;", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Position {

        @NotNull
        private final String x;

        @NotNull
        private final String y;

        public Position(@NotNull String x11, @NotNull String y11) {
            Intrinsics.checkNotNullParameter(x11, "x");
            Intrinsics.checkNotNullParameter(y11, "y");
            this.x = x11;
            this.y = y11;
        }

        public static /* synthetic */ Position copy$default(Position position, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = position.x;
            }
            if ((i11 & 2) != 0) {
                str2 = position.y;
            }
            return position.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getX() {
            return this.x;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getY() {
            return this.y;
        }

        @NotNull
        public final Position copy(@NotNull String x11, @NotNull String y11) {
            Intrinsics.checkNotNullParameter(x11, "x");
            Intrinsics.checkNotNullParameter(y11, "y");
            return new Position(x11, y11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            Position position = (Position) other;
            return Intrinsics.d(this.x, position.x) && Intrinsics.d(this.y, position.y);
        }

        @NotNull
        public final String getX() {
            return this.x;
        }

        @NotNull
        public final String getY() {
            return this.y;
        }

        public int hashCode() {
            return this.y.hashCode() + (this.x.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Position(x=", this.x, ", y=", this.y, ")");
        }
    }

    public ImageBadge(@NotNull Position position, @NotNull Badge badge) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.position = position;
        this.badge = badge;
    }

    public static /* synthetic */ ImageBadge copy$default(ImageBadge imageBadge, Position position, Badge badge, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            position = imageBadge.position;
        }
        if ((i11 & 2) != 0) {
            badge = imageBadge.badge;
        }
        return imageBadge.copy(position, badge);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final ImageBadge copy(@NotNull Position position, @NotNull Badge badge) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(badge, "badge");
        return new ImageBadge(position, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageBadge)) {
            return false;
        }
        ImageBadge imageBadge = (ImageBadge) other;
        return Intrinsics.d(this.position, imageBadge.position) && Intrinsics.d(this.badge, imageBadge.badge);
    }

    @NotNull
    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final Position getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.badge.hashCode() + (this.position.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ImageBadge(position=" + this.position + ", badge=" + this.badge + ")";
    }
}
