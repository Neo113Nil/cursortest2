package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/* loaded from: classes11.dex */
class ImageConversions {
    static Bitmap convertRgbTensorBufferToBitmap(TensorBuffer buffer) {
        int[] shape = buffer.getShape();
        ColorSpaceType colorSpaceType = ColorSpaceType.RGB;
        colorSpaceType.assertShape(shape);
        int height = colorSpaceType.getHeight(shape);
        int width = colorSpaceType.getWidth(shape);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, colorSpaceType.toBitmapConfig());
        int i = width * height;
        int[] iArr = new int[i];
        int[] intArray = buffer.getIntArray();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = intArray[i2];
            int i5 = i2 + 2;
            int i6 = intArray[i2 + 1];
            i2 += 3;
            iArr[i3] = Color.rgb(i4, i6, intArray[i5]);
        }
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    static Bitmap convertGrayscaleTensorBufferToBitmap(TensorBuffer buffer) {
        if (buffer.getDataType() != DataType.UINT8) {
            buffer = TensorBuffer.createFrom(buffer, DataType.UINT8);
        }
        int[] shape = buffer.getShape();
        ColorSpaceType colorSpaceType = ColorSpaceType.GRAYSCALE;
        colorSpaceType.assertShape(shape);
        Bitmap createBitmap = Bitmap.createBitmap(colorSpaceType.getWidth(shape), colorSpaceType.getHeight(shape), colorSpaceType.toBitmapConfig());
        buffer.getBuffer().rewind();
        createBitmap.copyPixelsFromBuffer(buffer.getBuffer());
        return createBitmap;
    }

    static void convertBitmapToTensorBuffer(Bitmap bitmap, TensorBuffer buffer) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        int i2 = 0;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = {height, width, 3};
        int i3 = AnonymousClass1.$SwitchMap$org$tensorflow$lite$DataType[buffer.getDataType().ordinal()];
        if (i3 == 1) {
            byte[] bArr = new byte[i * 3];
            int i4 = 0;
            while (i2 < i) {
                int i5 = iArr[i2];
                bArr[i4] = (byte) ((i5 >> 16) & 255);
                int i6 = i4 + 2;
                bArr[i4 + 1] = (byte) ((i5 >> 8) & 255);
                i4 += 3;
                bArr[i6] = (byte) (i5 & 255);
                i2++;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(ByteOrder.nativeOrder());
            buffer.loadBuffer(wrap, iArr2);
            return;
        }
        if (i3 == 2) {
            float[] fArr = new float[i * 3];
            int i7 = 0;
            while (i2 < i) {
                int i8 = iArr[i2];
                fArr[i7] = (i8 >> 16) & 255;
                int i9 = i7 + 2;
                fArr[i7 + 1] = (i8 >> 8) & 255;
                i7 += 3;
                fArr[i9] = i8 & 255;
                i2++;
            }
            buffer.loadArray(fArr, iArr2);
            return;
        }
        throw new IllegalStateException("The type of TensorBuffer, " + buffer.getBuffer() + ", is unsupported.");
    }

    /* renamed from: org.tensorflow.lite.support.image.ImageConversions$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$DataType;

        static {
            int[] iArr = new int[DataType.values().length];
            $SwitchMap$org$tensorflow$lite$DataType = iArr;
            try {
                iArr[DataType.UINT8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.FLOAT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private ImageConversions() {
    }
}
