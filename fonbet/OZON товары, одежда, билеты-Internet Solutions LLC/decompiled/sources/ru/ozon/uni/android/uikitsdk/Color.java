package ru.ozon.uni.android.uikitsdk;

import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/android/uikitsdk/Color;", "Landroid/os/Parcelable;", "applyTo", "", "drawable", "Landroid/graphics/drawable/GradientDrawable;", "Solid", "Gradient", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "Lru/ozon/uni/android/uikitsdk/Color$Solid;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Color extends Parcelable {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u0003J\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/android/uikitsdk/Color$Solid;", "Lru/ozon/uni/android/uikitsdk/Color;", "color", "", "<init>", "(I)V", "getColor", "()I", "applyTo", "", "drawable", "Landroid/graphics/drawable/GradientDrawable;", "describeContents", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Solid implements Color {

        @NotNull
        public static final Parcelable.Creator<Solid> CREATOR = new Creator();
        private final int color;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Solid> {
            @Override // android.os.Parcelable.Creator
            public final Solid createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Solid(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Solid[] newArray(int i11) {
                return new Solid[i11];
            }
        }

        public Solid(int i11) {
            this.color = i11;
        }

        @Override // ru.ozon.uni.android.uikitsdk.Color
        public void applyTo(@NotNull GradientDrawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            int i11 = this.color;
            drawable.setColors(new int[]{i11, i11});
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int getColor() {
            return this.color;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.color);
        }
    }

    void applyTo(@NotNull GradientDrawable drawable);

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "Lru/ozon/uni/android/uikitsdk/Color;", "colors", "", "orientation", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "positions", "", "<init>", "([ILandroid/graphics/drawable/GradientDrawable$Orientation;[F)V", "getColors", "()[I", "getOrientation", "()Landroid/graphics/drawable/GradientDrawable$Orientation;", "getPositions", "()[F", "applyTo", "", "drawable", "Landroid/graphics/drawable/GradientDrawable;", "equals", "", "other", "", "hashCode", "", "describeContents", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Gradient implements Color {

        @NotNull
        public static final Parcelable.Creator<Gradient> CREATOR = new Creator();

        @NotNull
        private final int[] colors;

        @NotNull
        private final GradientDrawable.Orientation orientation;

        @NotNull
        private final float[] positions;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<Gradient> {
            @Override // android.os.Parcelable.Creator
            public final Gradient createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gradient(parcel.createIntArray(), GradientDrawable.Orientation.valueOf(parcel.readString()), parcel.createFloatArray());
            }

            @Override // android.os.Parcelable.Creator
            public final Gradient[] newArray(int i11) {
                return new Gradient[i11];
            }
        }

        public Gradient(@NotNull int[] colors, @NotNull GradientDrawable.Orientation orientation, @NotNull float[] positions) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            Intrinsics.checkNotNullParameter(positions, "positions");
            this.colors = colors;
            this.orientation = orientation;
            this.positions = positions;
        }

        @Override // ru.ozon.uni.android.uikitsdk.Color
        public void applyTo(@NotNull GradientDrawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            if (Build.VERSION.SDK_INT >= 29) {
                drawable.setColors(this.colors, this.positions);
            } else {
                drawable.setColors(this.colors);
            }
            drawable.setOrientation(this.orientation);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!Gradient.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.uni.android.uikitsdk.Color.Gradient");
            Gradient gradient = (Gradient) other;
            return Arrays.equals(this.colors, gradient.colors) && this.orientation == gradient.orientation && Arrays.equals(this.positions, gradient.positions);
        }

        @NotNull
        public final int[] getColors() {
            return this.colors;
        }

        @NotNull
        public final GradientDrawable.Orientation getOrientation() {
            return this.orientation;
        }

        @NotNull
        public final float[] getPositions() {
            return this.positions;
        }

        public int hashCode() {
            return Arrays.hashCode(this.positions) + ((this.orientation.hashCode() + (Arrays.hashCode(this.colors) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeIntArray(this.colors);
            dest.writeString(this.orientation.name());
            dest.writeFloatArray(this.positions);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Gradient(int[] iArr, GradientDrawable.Orientation orientation, float[] fArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(iArr, orientation, fArr);
            if ((i11 & 4) != 0) {
                int length = iArr.length;
                ArrayList arrayList = new ArrayList(length);
                for (int i12 = 0; i12 < length; i12++) {
                    arrayList.add(Float.valueOf(i12 / (iArr.length - 1)));
                }
                fArr = C7714v.R0(arrayList);
            }
        }
    }
}
