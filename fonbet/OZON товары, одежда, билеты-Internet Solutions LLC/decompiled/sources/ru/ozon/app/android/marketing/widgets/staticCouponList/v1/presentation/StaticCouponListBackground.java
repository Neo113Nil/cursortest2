package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Kk.c;
import Xc.a;
import Xc.b;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors;", "colors", "<init>", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors;", "getColors", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors;", "Colors", "GradientDirection", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StaticCouponListBackground {

    @NotNull
    private final Colors colors;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors;", "", "Gradient", "Solid", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors$Gradient;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors$Solid;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Colors {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors$Gradient;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors;", "", "fromColor", "toColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$GradientDirection;", "gradientDirection", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$GradientDirection;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getFromColor", "()Ljava/lang/Integer;", "getToColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$GradientDirection;", "getGradientDirection", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$GradientDirection;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Gradient implements Colors {
            private final Integer fromColor;

            @NotNull
            private final GradientDirection gradientDirection;
            private final Integer toColor;

            public Gradient(Integer num, Integer num2, @NotNull GradientDirection gradientDirection) {
                Intrinsics.checkNotNullParameter(gradientDirection, "gradientDirection");
                this.fromColor = num;
                this.toColor = num2;
                this.gradientDirection = gradientDirection;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Gradient)) {
                    return false;
                }
                Gradient gradient = (Gradient) other;
                return Intrinsics.d(this.fromColor, gradient.fromColor) && Intrinsics.d(this.toColor, gradient.toColor) && this.gradientDirection == gradient.gradientDirection;
            }

            public final Integer getFromColor() {
                return this.fromColor;
            }

            @NotNull
            public final GradientDirection getGradientDirection() {
                return this.gradientDirection;
            }

            public final Integer getToColor() {
                return this.toColor;
            }

            public int hashCode() {
                Integer num = this.fromColor;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.toColor;
                return this.gradientDirection.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                Integer num = this.fromColor;
                Integer num2 = this.toColor;
                GradientDirection gradientDirection = this.gradientDirection;
                StringBuilder f7 = c.f("Gradient(fromColor=", ", toColor=", num, num2, ", gradientDirection=");
                f7.append(gradientDirection);
                f7.append(")");
                return f7.toString();
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors$Solid;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$Colors;", "", "color", "constructor-impl", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "", "toString-impl", "(Ljava/lang/Integer;)Ljava/lang/String;", "toString", "hashCode-impl", "(Ljava/lang/Integer;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/Integer;Ljava/lang/Object;)Z", "equals", "Ljava/lang/Integer;", "getColor", "()Ljava/lang/Integer;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Solid implements Colors {
            private final Integer color;

            private /* synthetic */ Solid(Integer num) {
                this.color = num;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Solid m796boximpl(Integer num) {
                return new Solid(num);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static Integer m797constructorimpl(Integer num) {
                return num;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m798equalsimpl(Integer num, Object obj) {
                return (obj instanceof Solid) && Intrinsics.d(num, ((Solid) obj).getColor());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m799hashCodeimpl(Integer num) {
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m800toStringimpl(Integer num) {
                return "Solid(color=" + num + ")";
            }

            public boolean equals(Object obj) {
                return m798equalsimpl(this.color, obj);
            }

            public int hashCode() {
                return m799hashCodeimpl(this.color);
            }

            public String toString() {
                return m800toStringimpl(this.color);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ Integer getColor() {
                return this.color;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground$GradientDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_BOTTOM", "TOP_RIGHT_LEFT_BOTTOM", "RIGHT_LEFT", "BOTTOM_RIGHT_TOP_LEFT", "BOTTOM_TOP", "BOTTOM_LEFT_TOP_RIGHT", "LEFT_RIGHT", "TOP_LEFT_BOTTOM_RIGHT", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GradientDirection {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ GradientDirection[] $VALUES;
        public static final GradientDirection TOP_BOTTOM = new GradientDirection("TOP_BOTTOM", 0);
        public static final GradientDirection TOP_RIGHT_LEFT_BOTTOM = new GradientDirection("TOP_RIGHT_LEFT_BOTTOM", 1);
        public static final GradientDirection RIGHT_LEFT = new GradientDirection("RIGHT_LEFT", 2);
        public static final GradientDirection BOTTOM_RIGHT_TOP_LEFT = new GradientDirection("BOTTOM_RIGHT_TOP_LEFT", 3);
        public static final GradientDirection BOTTOM_TOP = new GradientDirection("BOTTOM_TOP", 4);
        public static final GradientDirection BOTTOM_LEFT_TOP_RIGHT = new GradientDirection("BOTTOM_LEFT_TOP_RIGHT", 5);
        public static final GradientDirection LEFT_RIGHT = new GradientDirection("LEFT_RIGHT", 6);
        public static final GradientDirection TOP_LEFT_BOTTOM_RIGHT = new GradientDirection("TOP_LEFT_BOTTOM_RIGHT", 7);

        private static final /* synthetic */ GradientDirection[] $values() {
            return new GradientDirection[]{TOP_BOTTOM, TOP_RIGHT_LEFT_BOTTOM, RIGHT_LEFT, BOTTOM_RIGHT_TOP_LEFT, BOTTOM_TOP, BOTTOM_LEFT_TOP_RIGHT, LEFT_RIGHT, TOP_LEFT_BOTTOM_RIGHT};
        }

        static {
            GradientDirection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private GradientDirection(String str, int i11) {
        }

        public static GradientDirection valueOf(String str) {
            return (GradientDirection) Enum.valueOf(GradientDirection.class, str);
        }

        public static GradientDirection[] values() {
            return (GradientDirection[]) $VALUES.clone();
        }
    }

    public StaticCouponListBackground(@NotNull Colors colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StaticCouponListBackground) && Intrinsics.d(this.colors, ((StaticCouponListBackground) other).colors);
    }

    @NotNull
    public final Colors getColors() {
        return this.colors;
    }

    public int hashCode() {
        return this.colors.hashCode();
    }

    @NotNull
    public String toString() {
        return "StaticCouponListBackground(colors=" + this.colors + ")";
    }
}
