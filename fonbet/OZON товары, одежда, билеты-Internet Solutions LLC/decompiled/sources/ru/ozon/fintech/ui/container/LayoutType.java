package ru.ozon.fintech.ui.container;

import Cm.e;
import T7.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/fintech/ui/container/LayoutType;", "", "<init>", "()V", "Linear", "Flex", "Grid", "Staggered", "Lru/ozon/fintech/ui/container/LayoutType$Flex;", "Lru/ozon/fintech/ui/container/LayoutType$Grid;", "Lru/ozon/fintech/ui/container/LayoutType$Linear;", "Lru/ozon/fintech/ui/container/LayoutType$Staggered;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class LayoutType {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/ui/container/LayoutType$Flex;", "Lru/ozon/fintech/ui/container/LayoutType;", "<init>", "()V", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Flex extends LayoutType {

        @NotNull
        public static final Flex INSTANCE = new Flex();

        private Flex() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/container/LayoutType$Grid;", "Lru/ozon/fintech/ui/container/LayoutType;", "spansCount", "", "orientation", "<init>", "(II)V", "getSpansCount", "()I", "getOrientation", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Grid extends LayoutType {
        private final int orientation;
        private final int spansCount;

        public Grid(int i11, int i12) {
            super(null);
            this.spansCount = i11;
            this.orientation = i12;
        }

        public static /* synthetic */ Grid copy$default(Grid grid, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = grid.spansCount;
            }
            if ((i13 & 2) != 0) {
                i12 = grid.orientation;
            }
            return grid.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSpansCount() {
            return this.spansCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getOrientation() {
            return this.orientation;
        }

        @NotNull
        public final Grid copy(int spansCount, int orientation) {
            return new Grid(spansCount, orientation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Grid)) {
                return false;
            }
            Grid grid = (Grid) other;
            return this.spansCount == grid.spansCount && this.orientation == grid.orientation;
        }

        public final int getOrientation() {
            return this.orientation;
        }

        public final int getSpansCount() {
            return this.spansCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.orientation) + (Integer.hashCode(this.spansCount) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("Grid(spansCount=", this.spansCount, ", orientation=", ")", this.orientation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/ui/container/LayoutType$Linear;", "Lru/ozon/fintech/ui/container/LayoutType;", "<init>", "()V", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Linear extends LayoutType {

        @NotNull
        public static final Linear INSTANCE = new Linear();

        private Linear() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/ui/container/LayoutType$Staggered;", "Lru/ozon/fintech/ui/container/LayoutType;", "spansCount", "", "<init>", "(I)V", "getSpansCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Staggered extends LayoutType {
        private final int spansCount;

        public Staggered(int i11) {
            super(null);
            this.spansCount = i11;
        }

        public static /* synthetic */ Staggered copy$default(Staggered staggered, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = staggered.spansCount;
            }
            return staggered.copy(i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSpansCount() {
            return this.spansCount;
        }

        @NotNull
        public final Staggered copy(int spansCount) {
            return new Staggered(spansCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Staggered) && this.spansCount == ((Staggered) other).spansCount;
        }

        public final int getSpansCount() {
            return this.spansCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.spansCount);
        }

        @NotNull
        public String toString() {
            return E.a(this.spansCount, "Staggered(spansCount=", ")");
        }
    }

    public /* synthetic */ LayoutType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LayoutType() {
    }
}
