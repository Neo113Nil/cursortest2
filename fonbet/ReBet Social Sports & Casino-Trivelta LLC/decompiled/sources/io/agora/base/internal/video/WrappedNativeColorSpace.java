package io.agora.base.internal.video;

import io.agora.base.ColorSpace;
import io.agora.base.HdrMetadata;
import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class WrappedNativeColorSpace implements ColorSpace {
    private ColorSpace.Matrix matrix;
    private ColorSpace.Primary primary;
    private ColorSpace.Range range;
    private ColorSpace.Transfer transfer;

    public WrappedNativeColorSpace() {
        this.range = ColorSpace.Range.Invalid;
        this.matrix = ColorSpace.Matrix.Unspecified;
        this.transfer = ColorSpace.Transfer.Unspecified;
        this.primary = ColorSpace.Primary.Unspecified;
    }

    @Override // io.agora.base.ColorSpace
    public HdrMetadata getHdrMetadata() {
        return null;
    }

    @Override // io.agora.base.ColorSpace
    public ColorSpace.Matrix getMatrix() {
        return this.matrix;
    }

    @Override // io.agora.base.ColorSpace
    public ColorSpace.Primary getPrimary() {
        return this.primary;
    }

    @Override // io.agora.base.ColorSpace
    public ColorSpace.Range getRange() {
        return this.range;
    }

    @Override // io.agora.base.ColorSpace
    public ColorSpace.Transfer getTransfer() {
        return this.transfer;
    }

    @CalledByNative
    public WrappedNativeColorSpace(int i10, int i11, int i12, int i13) {
        this.range = ColorSpace.Range.Invalid;
        this.matrix = ColorSpace.Matrix.Unspecified;
        this.transfer = ColorSpace.Transfer.Unspecified;
        this.primary = ColorSpace.Primary.Unspecified;
        ColorSpace.Range[] values = ColorSpace.Range.values();
        int length = values.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                break;
            }
            ColorSpace.Range range = values[i14];
            if (range.getRange() == i10) {
                this.range = range;
                break;
            }
            i14++;
        }
        ColorSpace.Matrix[] values2 = ColorSpace.Matrix.values();
        int length2 = values2.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length2) {
                break;
            }
            ColorSpace.Matrix matrix = values2[i15];
            if (matrix.getMatrix() == i11) {
                this.matrix = matrix;
                break;
            }
            i15++;
        }
        ColorSpace.Transfer[] values3 = ColorSpace.Transfer.values();
        int length3 = values3.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length3) {
                break;
            }
            ColorSpace.Transfer transfer = values3[i16];
            if (transfer.getTransfer() == i12) {
                this.transfer = transfer;
                break;
            }
            i16++;
        }
        for (ColorSpace.Primary primary : ColorSpace.Primary.values()) {
            if (primary.getPrimary() == i13) {
                this.primary = primary;
                return;
            }
        }
    }
}
