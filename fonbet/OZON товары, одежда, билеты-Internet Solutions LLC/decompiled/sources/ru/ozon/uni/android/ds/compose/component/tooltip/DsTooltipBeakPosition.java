package ru.ozon.uni.android.ds.compose.component.tooltip;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "", "<init>", "()V", "TopCenter", "Left", "Right", "BottomCenter", "TopCustom", "BottomCustom", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$BottomCenter;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$BottomCustom;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$Left;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$Right;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$TopCenter;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$TopCustom;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DsTooltipBeakPosition {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$BottomCenter;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomCenter extends DsTooltipBeakPosition {

        @NotNull
        public static final BottomCenter INSTANCE = new BottomCenter();

        private BottomCenter() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BottomCenter);
        }

        public int hashCode() {
            return 1973956005;
        }

        @NotNull
        public String toString() {
            return "BottomCenter";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$BottomCustom;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "leftMargin", "", "rightMargin", "<init>", "(II)V", "getLeftMargin", "()I", "getRightMargin", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomCustom extends DsTooltipBeakPosition {
        private final int leftMargin;
        private final int rightMargin;

        public BottomCustom(int i11, int i12) {
            super(null);
            this.leftMargin = i11;
            this.rightMargin = i12;
        }

        public final int getLeftMargin() {
            return this.leftMargin;
        }

        public final int getRightMargin() {
            return this.rightMargin;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$Left;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Left extends DsTooltipBeakPosition {

        @NotNull
        public static final Left INSTANCE = new Left();

        private Left() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Left);
        }

        public int hashCode() {
            return -345039796;
        }

        @NotNull
        public String toString() {
            return "Left";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$Right;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Right extends DsTooltipBeakPosition {

        @NotNull
        public static final Right INSTANCE = new Right();

        private Right() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Right);
        }

        public int hashCode() {
            return -2100638089;
        }

        @NotNull
        public String toString() {
            return "Right";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$TopCenter;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopCenter extends DsTooltipBeakPosition {

        @NotNull
        public static final TopCenter INSTANCE = new TopCenter();

        private TopCenter() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TopCenter);
        }

        public int hashCode() {
            return -1620718363;
        }

        @NotNull
        public String toString() {
            return "TopCenter";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition$TopCustom;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "leftMargin", "", "rightMargin", "<init>", "(II)V", "getLeftMargin", "()I", "getRightMargin", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TopCustom extends DsTooltipBeakPosition {
        private final int leftMargin;
        private final int rightMargin;

        public TopCustom(int i11, int i12) {
            super(null);
            this.leftMargin = i11;
            this.rightMargin = i12;
        }

        public final int getLeftMargin() {
            return this.leftMargin;
        }

        public final int getRightMargin() {
            return this.rightMargin;
        }
    }

    public /* synthetic */ DsTooltipBeakPosition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DsTooltipBeakPosition() {
    }
}
