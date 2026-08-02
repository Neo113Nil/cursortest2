package ru.ozon.uni.android.atom.price.data;

import Am.C2438a;
import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.models.GradientDirection;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/android/atom/price/data/PriceViewGradient;", "", "", "startColor", "endColor", "Lru/ozon/uni/core/models/GradientDirection;", "direction", "<init>", "(IILru/ozon/uni/core/models/GradientDirection;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStartColor", "getEndColor", "Lru/ozon/uni/core/models/GradientDirection;", "getDirection", "()Lru/ozon/uni/core/models/GradientDirection;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PriceViewGradient {

    @NotNull
    private final GradientDirection direction;
    private final int endColor;
    private final int startColor;

    public PriceViewGradient(int i11, int i12, @NotNull GradientDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.startColor = i11;
        this.endColor = i12;
        this.direction = direction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceViewGradient)) {
            return false;
        }
        PriceViewGradient priceViewGradient = (PriceViewGradient) other;
        return this.startColor == priceViewGradient.startColor && this.endColor == priceViewGradient.endColor && this.direction == priceViewGradient.direction;
    }

    @NotNull
    public final GradientDirection getDirection() {
        return this.direction;
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public int hashCode() {
        return this.direction.hashCode() + C2454a.a(this.endColor, Integer.hashCode(this.startColor) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.startColor;
        int i12 = this.endColor;
        GradientDirection gradientDirection = this.direction;
        StringBuilder a11 = C2438a.a("PriceViewGradient(startColor=", i11, ", endColor=", ", direction=", i12);
        a11.append(gradientDirection);
        a11.append(")");
        return a11.toString();
    }
}
