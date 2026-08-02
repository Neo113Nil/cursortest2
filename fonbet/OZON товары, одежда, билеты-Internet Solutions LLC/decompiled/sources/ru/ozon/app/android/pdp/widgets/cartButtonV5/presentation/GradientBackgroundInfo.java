package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Am.C2438a;
import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.Color;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/GradientBackgroundInfo;", "", "", "width", "height", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "gradient", "<init>", "(IILru/ozon/uni/android/uikitsdk/Color$Gradient;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getHeight", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "getGradient", "()Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class GradientBackgroundInfo {

    @NotNull
    private final Color.Gradient gradient;
    private final int height;
    private final int width;

    public GradientBackgroundInfo(int i11, int i12, @NotNull Color.Gradient gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.width = i11;
        this.height = i12;
        this.gradient = gradient;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientBackgroundInfo)) {
            return false;
        }
        GradientBackgroundInfo gradientBackgroundInfo = (GradientBackgroundInfo) other;
        return this.width == gradientBackgroundInfo.width && this.height == gradientBackgroundInfo.height && Intrinsics.d(this.gradient, gradientBackgroundInfo.gradient);
    }

    public int hashCode() {
        return this.gradient.hashCode() + C2454a.a(this.height, Integer.hashCode(this.width) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.width;
        int i12 = this.height;
        Color.Gradient gradient = this.gradient;
        StringBuilder a11 = C2438a.a("GradientBackgroundInfo(width=", i11, ", height=", ", gradient=", i12);
        a11.append(gradient);
        a11.append(")");
        return a11.toString();
    }
}
