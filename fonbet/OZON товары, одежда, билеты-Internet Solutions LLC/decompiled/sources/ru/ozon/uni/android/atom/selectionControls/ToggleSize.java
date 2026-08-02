package ru.ozon.uni.android.atom.selectionControls;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/atom/selectionControls/ToggleSize;", "", "width", "", "height", "knobSize", "<init>", "(III)V", "getWidth", "()I", "getHeight", "getKnobSize", "Toggle500", "Toggle600", "Lru/ozon/uni/android/atom/selectionControls/ToggleSize$Toggle500;", "Lru/ozon/uni/android/atom/selectionControls/ToggleSize$Toggle600;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ToggleSize {
    private final int height;
    private final int knobSize;
    private final int width;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/atom/selectionControls/ToggleSize$Toggle500;", "Lru/ozon/uni/android/atom/selectionControls/ToggleSize;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final /* data */ class Toggle500 extends ToggleSize {

        @NotNull
        public static final Toggle500 INSTANCE = new Toggle500();

        private Toggle500() {
            super(31, 24, 16, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Toggle500);
        }

        public int hashCode() {
            return 112908571;
        }

        @NotNull
        public String toString() {
            return "Toggle500";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/atom/selectionControls/ToggleSize$Toggle600;", "Lru/ozon/uni/android/atom/selectionControls/ToggleSize;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Toggle600 extends ToggleSize {

        @NotNull
        public static final Toggle600 INSTANCE = new Toggle600();

        private Toggle600() {
            super(44, 32, 24, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Toggle600);
        }

        public int hashCode() {
            return 112909532;
        }

        @NotNull
        public String toString() {
            return "Toggle600";
        }
    }

    public /* synthetic */ ToggleSize(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getKnobSize() {
        return this.knobSize;
    }

    public final int getWidth() {
        return this.width;
    }

    private ToggleSize(int i11, int i12, int i13) {
        this.width = i11;
        this.height = i12;
        this.knobSize = i13;
    }
}
