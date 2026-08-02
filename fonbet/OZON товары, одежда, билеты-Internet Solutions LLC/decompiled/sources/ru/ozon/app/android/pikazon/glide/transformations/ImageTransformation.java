package ru.ozon.app.android.pikazon.glide.transformations;

import Cm.e;
import T7.E;
import Xc.a;
import Xc.b;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "", "<init>", "()V", "CropOnWhite", "CenterCrop", "CircleCrop", "FitCenter", "GreyAndWhite", "RoundedCorners", "FitWidthCropHeight", "FitHeightCropWidth", "Blur", "CropOnColor", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$Blur;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$CenterCrop;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$CircleCrop;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$CropOnColor;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$CropOnWhite;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitCenter;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitWidthCropHeight;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$GreyAndWhite;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ImageTransformation {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$Blur;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "", "radius", "sampling", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRadius", "getSampling", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Blur extends ImageTransformation {
        private final int radius;
        private final int sampling;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Blur() {
            this(r2, r2, 3, null);
            int i11 = 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Blur)) {
                return false;
            }
            Blur blur = (Blur) other;
            return this.radius == blur.radius && this.sampling == blur.sampling;
        }

        public final int getRadius() {
            return this.radius;
        }

        public final int getSampling() {
            return this.sampling;
        }

        public int hashCode() {
            return Integer.hashCode(this.sampling) + (Integer.hashCode(this.radius) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("Blur(radius=", this.radius, ", sampling=", ")", this.sampling);
        }

        public Blur(int i11, int i12) {
            super(null);
            this.radius = i11;
            this.sampling = i12;
        }

        public /* synthetic */ Blur(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 25 : i11, (i13 & 2) != 0 ? 3 : i12);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$CenterCrop;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CenterCrop extends ImageTransformation {

        @NotNull
        public static final CenterCrop INSTANCE = new CenterCrop();

        private CenterCrop() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CenterCrop);
        }

        public int hashCode() {
            return -300600635;
        }

        @NotNull
        public String toString() {
            return "CenterCrop";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$CircleCrop;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class CircleCrop extends ImageTransformation {

        @NotNull
        public static final CircleCrop INSTANCE = new CircleCrop();

        private CircleCrop() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CircleCrop);
        }

        public int hashCode() {
            return 1721527744;
        }

        @NotNull
        public String toString() {
            return "CircleCrop";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$CropOnColor;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "", "bgColor", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getBgColor", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class CropOnColor extends ImageTransformation {
        private final int bgColor;

        public CropOnColor(int i11) {
            super(null);
            this.bgColor = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CropOnColor) && this.bgColor == ((CropOnColor) other).bgColor;
        }

        public final int getBgColor() {
            return this.bgColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.bgColor);
        }

        @NotNull
        public String toString() {
            return E.a(this.bgColor, "CropOnColor(bgColor=", ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$CropOnWhite;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CropOnWhite extends ImageTransformation {

        @NotNull
        public static final CropOnWhite INSTANCE = new CropOnWhite();

        private CropOnWhite() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CropOnWhite);
        }

        public int hashCode() {
            return -1618716006;
        }

        @NotNull
        public String toString() {
            return "CropOnWhite";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitCenter;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class FitCenter extends ImageTransformation {

        @NotNull
        public static final FitCenter INSTANCE = new FitCenter();

        private FitCenter() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FitCenter);
        }

        public int hashCode() {
            return -1743158906;
        }

        @NotNull
        public String toString() {
            return "FitCenter";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth$CropType;", "cropType", "<init>", "(Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth$CropType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth$CropType;", "getCropType", "()Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth$CropType;", "CropType", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FitHeightCropWidth extends ImageTransformation {

        @NotNull
        private final CropType cropType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitHeightCropWidth$CropType;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class CropType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ CropType[] $VALUES;
            public static final CropType LEFT = new CropType("LEFT", 0);
            public static final CropType CENTER = new CropType("CENTER", 1);
            public static final CropType RIGHT = new CropType("RIGHT", 2);

            private static final /* synthetic */ CropType[] $values() {
                return new CropType[]{LEFT, CENTER, RIGHT};
            }

            static {
                CropType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private CropType(String str, int i11) {
            }

            public static CropType valueOf(String str) {
                return (CropType) Enum.valueOf(CropType.class, str);
            }

            public static CropType[] values() {
                return (CropType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FitHeightCropWidth(@NotNull CropType cropType) {
            super(null);
            Intrinsics.checkNotNullParameter(cropType, "cropType");
            this.cropType = cropType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FitHeightCropWidth) && this.cropType == ((FitHeightCropWidth) other).cropType;
        }

        @NotNull
        public final CropType getCropType() {
            return this.cropType;
        }

        public int hashCode() {
            return this.cropType.hashCode();
        }

        @NotNull
        public String toString() {
            return "FitHeightCropWidth(cropType=" + this.cropType + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitWidthCropHeight;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitWidthCropHeight$CropType;", "cropType", "<init>", "(Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitWidthCropHeight$CropType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitWidthCropHeight$CropType;", "getCropType", "()Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitWidthCropHeight$CropType;", "CropType", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FitWidthCropHeight extends ImageTransformation {

        @NotNull
        private final CropType cropType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitWidthCropHeight$CropType;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class CropType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ CropType[] $VALUES;
            public static final CropType TOP = new CropType("TOP", 0);
            public static final CropType CENTER = new CropType("CENTER", 1);
            public static final CropType BOTTOM = new CropType("BOTTOM", 2);

            private static final /* synthetic */ CropType[] $values() {
                return new CropType[]{TOP, CENTER, BOTTOM};
            }

            static {
                CropType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private CropType(String str, int i11) {
            }

            public static CropType valueOf(String str) {
                return (CropType) Enum.valueOf(CropType.class, str);
            }

            public static CropType[] values() {
                return (CropType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FitWidthCropHeight(@NotNull CropType cropType) {
            super(null);
            Intrinsics.checkNotNullParameter(cropType, "cropType");
            this.cropType = cropType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FitWidthCropHeight) && this.cropType == ((FitWidthCropHeight) other).cropType;
        }

        @NotNull
        public final CropType getCropType() {
            return this.cropType;
        }

        public int hashCode() {
            return this.cropType.hashCode();
        }

        @NotNull
        public String toString() {
            return "FitWidthCropHeight(cropType=" + this.cropType + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$GreyAndWhite;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class GreyAndWhite extends ImageTransformation {

        @NotNull
        public static final GreyAndWhite INSTANCE = new GreyAndWhite();

        private GreyAndWhite() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof GreyAndWhite);
        }

        public int hashCode() {
            return -2109379887;
        }

        @NotNull
        public String toString() {
            return "GreyAndWhite";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners;", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "", "cornerRadius", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners$CornerType;", "corner", "<init>", "(ILru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners$CornerType;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCornerRadius", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners$CornerType;", "getCorner", "()Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners$CornerType;", "CornerType", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RoundedCorners extends ImageTransformation {

        @NotNull
        private final CornerType corner;
        private final int cornerRadius;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$RoundedCorners$CornerType;", "", "<init>", "(Ljava/lang/String;I)V", "ALL", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "TOP", "BOTTOM", "LEFT", "RIGHT", "OTHER_TOP_LEFT", "OTHER_TOP_RIGHT", "OTHER_BOTTOM_LEFT", "OTHER_BOTTOM_RIGHT", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CornerType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ CornerType[] $VALUES;
            public static final CornerType ALL = new CornerType("ALL", 0);
            public static final CornerType TOP_LEFT = new CornerType("TOP_LEFT", 1);
            public static final CornerType TOP_RIGHT = new CornerType("TOP_RIGHT", 2);
            public static final CornerType BOTTOM_LEFT = new CornerType("BOTTOM_LEFT", 3);
            public static final CornerType BOTTOM_RIGHT = new CornerType("BOTTOM_RIGHT", 4);
            public static final CornerType TOP = new CornerType("TOP", 5);
            public static final CornerType BOTTOM = new CornerType("BOTTOM", 6);
            public static final CornerType LEFT = new CornerType("LEFT", 7);
            public static final CornerType RIGHT = new CornerType("RIGHT", 8);
            public static final CornerType OTHER_TOP_LEFT = new CornerType("OTHER_TOP_LEFT", 9);
            public static final CornerType OTHER_TOP_RIGHT = new CornerType("OTHER_TOP_RIGHT", 10);
            public static final CornerType OTHER_BOTTOM_LEFT = new CornerType("OTHER_BOTTOM_LEFT", 11);
            public static final CornerType OTHER_BOTTOM_RIGHT = new CornerType("OTHER_BOTTOM_RIGHT", 12);

            private static final /* synthetic */ CornerType[] $values() {
                return new CornerType[]{ALL, TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, TOP, BOTTOM, LEFT, RIGHT, OTHER_TOP_LEFT, OTHER_TOP_RIGHT, OTHER_BOTTOM_LEFT, OTHER_BOTTOM_RIGHT};
            }

            static {
                CornerType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private CornerType(String str, int i11) {
            }

            public static CornerType valueOf(String str) {
                return (CornerType) Enum.valueOf(CornerType.class, str);
            }

            public static CornerType[] values() {
                return (CornerType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RoundedCorners() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoundedCorners)) {
                return false;
            }
            RoundedCorners roundedCorners = (RoundedCorners) other;
            return this.cornerRadius == roundedCorners.cornerRadius && this.corner == roundedCorners.corner;
        }

        @NotNull
        public final CornerType getCorner() {
            return this.corner;
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }

        public int hashCode() {
            return this.corner.hashCode() + (Integer.hashCode(this.cornerRadius) * 31);
        }

        @NotNull
        public String toString() {
            return "RoundedCorners(cornerRadius=" + this.cornerRadius + ", corner=" + this.corner + ")";
        }

        public /* synthetic */ RoundedCorners(int i11, CornerType cornerType, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? (int) TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()) : i11, (i12 & 2) != 0 ? CornerType.ALL : cornerType);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoundedCorners(int i11, @NotNull CornerType corner) {
            super(null);
            Intrinsics.checkNotNullParameter(corner, "corner");
            this.cornerRadius = i11;
            this.corner = corner;
        }
    }

    public /* synthetic */ ImageTransformation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ImageTransformation() {
    }
}
