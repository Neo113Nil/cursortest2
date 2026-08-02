package ru.ozon.uni.android.atom.price.data;

import android.graphics.drawable.BitmapDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/atom/price/data/GradientBitmapDrawableData;", "", "Landroid/graphics/drawable/BitmapDrawable;", "bitmapDrawable", "Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "gradient", "<init>", "(Landroid/graphics/drawable/BitmapDrawable;Lru/ozon/uni/android/atom/price/data/PriceViewGradient;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/drawable/BitmapDrawable;", "getBitmapDrawable", "()Landroid/graphics/drawable/BitmapDrawable;", "Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "getGradient", "()Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GradientBitmapDrawableData {

    @NotNull
    private final BitmapDrawable bitmapDrawable;
    private final PriceViewGradient gradient;

    public GradientBitmapDrawableData(@NotNull BitmapDrawable bitmapDrawable, PriceViewGradient priceViewGradient) {
        Intrinsics.checkNotNullParameter(bitmapDrawable, "bitmapDrawable");
        this.bitmapDrawable = bitmapDrawable;
        this.gradient = priceViewGradient;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientBitmapDrawableData)) {
            return false;
        }
        GradientBitmapDrawableData gradientBitmapDrawableData = (GradientBitmapDrawableData) other;
        return Intrinsics.d(this.bitmapDrawable, gradientBitmapDrawableData.bitmapDrawable) && Intrinsics.d(this.gradient, gradientBitmapDrawableData.gradient);
    }

    @NotNull
    public final BitmapDrawable getBitmapDrawable() {
        return this.bitmapDrawable;
    }

    public final PriceViewGradient getGradient() {
        return this.gradient;
    }

    public int hashCode() {
        int hashCode = this.bitmapDrawable.hashCode() * 31;
        PriceViewGradient priceViewGradient = this.gradient;
        return hashCode + (priceViewGradient == null ? 0 : priceViewGradient.hashCode());
    }

    @NotNull
    public String toString() {
        return "GradientBitmapDrawableData(bitmapDrawable=" + this.bitmapDrawable + ", gradient=" + this.gradient + ")";
    }
}
