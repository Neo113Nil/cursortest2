package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import B0.A0;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "", "<init>", "()V", "Solid", "Gradient", "Orientation", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Gradient;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Solid;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Background {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Gradient;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "", "", "colors", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Orientation;", "orientation", "<init>", "(Ljava/util/List;Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Orientation;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getColors", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Orientation;", "getOrientation", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Orientation;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gradient extends Background {

        @NotNull
        private final List<String> colors;

        @NotNull
        private final Orientation orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gradient(@NotNull List<String> colors, @NotNull Orientation orientation) {
            super(null);
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            this.colors = colors;
            this.orientation = orientation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.d(this.colors, gradient.colors) && this.orientation == gradient.orientation;
        }

        @NotNull
        public final List<String> getColors() {
            return this.colors;
        }

        @NotNull
        public final Orientation getOrientation() {
            return this.orientation;
        }

        public int hashCode() {
            return this.orientation.hashCode() + (this.colors.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Gradient(colors=" + this.colors + ", orientation=" + this.orientation + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Orientation;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT_RIGHT", "TOP_BOTTOM", "TOP_LEFT_RIGHT_BOTTOM", "TOP_RIGHT_LEFT_BOTTOM", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Orientation {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final Orientation LEFT_RIGHT = new Orientation("LEFT_RIGHT", 0);
        public static final Orientation TOP_BOTTOM = new Orientation("TOP_BOTTOM", 1);
        public static final Orientation TOP_LEFT_RIGHT_BOTTOM = new Orientation("TOP_LEFT_RIGHT_BOTTOM", 2);
        public static final Orientation TOP_RIGHT_LEFT_BOTTOM = new Orientation("TOP_RIGHT_LEFT_BOTTOM", 3);

        private static final /* synthetic */ Orientation[] $values() {
            return new Orientation[]{LEFT_RIGHT, TOP_BOTTOM, TOP_LEFT_RIGHT_BOTTOM, TOP_RIGHT_LEFT_BOTTOM};
        }

        static {
            Orientation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Orientation(String str, int i11) {
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background$Solid;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/price/Background;", "", "color", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColor", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Solid extends Background {

        @NotNull
        private final String color;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Solid(@NotNull String color) {
            super(null);
            Intrinsics.checkNotNullParameter(color, "color");
            this.color = color;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Solid) && Intrinsics.d(this.color, ((Solid) other).color);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public int hashCode() {
            return this.color.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Solid(color=", this.color, ")");
        }
    }

    public /* synthetic */ Background(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Background() {
    }
}
