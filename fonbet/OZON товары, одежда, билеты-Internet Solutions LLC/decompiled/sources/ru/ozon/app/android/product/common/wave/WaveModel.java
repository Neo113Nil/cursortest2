package ru.ozon.app.android.product.common.wave;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/product/common/wave/WaveModel;", "", "", "waveWidth", "", "paintColor", "<init>", "(FI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getWaveWidth", "()F", "I", "getPaintColor", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WaveModel {
    private final int paintColor;
    private final float waveWidth;

    public WaveModel(float f7, int i11) {
        this.waveWidth = f7;
        this.paintColor = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaveModel)) {
            return false;
        }
        WaveModel waveModel = (WaveModel) other;
        return Float.compare(this.waveWidth, waveModel.waveWidth) == 0 && this.paintColor == waveModel.paintColor;
    }

    public final int getPaintColor() {
        return this.paintColor;
    }

    public final float getWaveWidth() {
        return this.waveWidth;
    }

    public int hashCode() {
        return Integer.hashCode(this.paintColor) + (Float.hashCode(this.waveWidth) * 31);
    }

    @NotNull
    public String toString() {
        return "WaveModel(waveWidth=" + this.waveWidth + ", paintColor=" + this.paintColor + ")";
    }

    public /* synthetic */ WaveModel(float f7, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, (i12 & 2) != 0 ? R$attr.layerFloor1 : i11);
    }
}
