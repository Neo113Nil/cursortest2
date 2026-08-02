package ru.sberdevices.salutevision.core.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lru/sberdevices/salutevision/core/utils/ImageTools;", "", "()V", "imageToBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "image", "Landroid/media/Image;", "rotationDegrees", "", "rotate", "bitmap", "degrees", "YuvToRgbConverter", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageTools {

    @NotNull
    public static final ImageTools INSTANCE = new ImageTools();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/sberdevices/salutevision/core/utils/ImageTools$YuvToRgbConverter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "inputAllocation", "Landroid/renderscript/Allocation;", "outputAllocation", "pixelCount", "", "rs", "Landroid/renderscript/RenderScript;", "kotlin.jvm.PlatformType", "scriptYuvToRgb", "Landroid/renderscript/ScriptIntrinsicYuvToRGB;", "yuvBuffer", "", "imageToByteArray", "", "image", "Landroid/media/Image;", "outputBuffer", "yuvToRgb", "Landroid/graphics/Bitmap;", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class YuvToRgbConverter {
        private Allocation inputAllocation;
        private Allocation outputAllocation;
        private int pixelCount;
        private final RenderScript rs;
        private final ScriptIntrinsicYuvToRGB scriptYuvToRgb;
        private byte[] yuvBuffer;

        public YuvToRgbConverter(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RenderScript create = RenderScript.create(context);
            this.rs = create;
            this.scriptYuvToRgb = ScriptIntrinsicYuvToRGB.create(create, Element.U8_4(create));
            this.pixelCount = -1;
        }

        private final void imageToByteArray(Image image, byte[] outputBuffer) {
            int i11;
            int i12;
            Rect rect;
            Image.Plane[] planeArr;
            YuvToRgbConverter yuvToRgbConverter = this;
            image.getFormat();
            Rect cropRect = image.getCropRect();
            Image.Plane[] imagePlanes = image.getPlanes();
            Intrinsics.checkNotNullExpressionValue(imagePlanes, "imagePlanes");
            int length = imagePlanes.length;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                Image.Plane plane = imagePlanes[i13];
                int i15 = i14 + 1;
                if (i14 != 0) {
                    if (i14 == 1) {
                        i12 = yuvToRgbConverter.pixelCount + 1;
                    } else if (i14 != 2) {
                        planeArr = imagePlanes;
                        i13++;
                        yuvToRgbConverter = this;
                        i14 = i15;
                        imagePlanes = planeArr;
                        cropRect = cropRect;
                    } else {
                        i12 = yuvToRgbConverter.pixelCount;
                    }
                    i11 = 2;
                } else {
                    i11 = 1;
                    i12 = 0;
                }
                ByteBuffer buffer = plane.getBuffer();
                int rowStride = plane.getRowStride();
                int pixelStride = plane.getPixelStride();
                if (i14 == 0) {
                    rect = cropRect;
                    planeArr = imagePlanes;
                } else {
                    planeArr = imagePlanes;
                    rect = new Rect(cropRect.left / 2, cropRect.top / 2, cropRect.right / 2, cropRect.bottom / 2);
                }
                int width = rect.width();
                int height = rect.height();
                byte[] bArr = new byte[plane.getRowStride()];
                int i16 = (pixelStride == 1 && i11 == 1) ? width : ((width - 1) * pixelStride) + 1;
                int i17 = 0;
                while (i17 < height) {
                    Rect rect2 = cropRect;
                    buffer.position((rect.left * pixelStride) + ((rect.top + i17) * rowStride));
                    if (pixelStride == 1 && i11 == 1) {
                        buffer.get(outputBuffer, i12, i16);
                        i12 += i16;
                    } else {
                        buffer.get(bArr, 0, i16);
                        for (int i18 = 0; i18 < width; i18++) {
                            outputBuffer[i12] = bArr[i18 * pixelStride];
                            i12 += i11;
                        }
                    }
                    i17++;
                    cropRect = rect2;
                }
                i13++;
                yuvToRgbConverter = this;
                i14 = i15;
                imagePlanes = planeArr;
                cropRect = cropRect;
            }
        }

        @NotNull
        public final synchronized Bitmap yuvToRgb(@NotNull Image image) {
            Bitmap output;
            try {
                Intrinsics.checkNotNullParameter(image, "image");
                output = Bitmap.createBitmap(image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
                if (this.yuvBuffer == null) {
                    this.pixelCount = image.getCropRect().width() * image.getCropRect().height();
                    this.yuvBuffer = new byte[(this.pixelCount * ImageFormat.getBitsPerPixel(35)) / 8];
                }
                byte[] bArr = this.yuvBuffer;
                if (bArr == null) {
                    Intrinsics.n("yuvBuffer");
                    throw null;
                }
                imageToByteArray(image, bArr);
                if (this.inputAllocation == null) {
                    RenderScript renderScript = this.rs;
                    Type create = new Type.Builder(renderScript, Element.YUV(renderScript)).setYuvFormat(17).create();
                    RenderScript renderScript2 = this.rs;
                    Element element = create.getElement();
                    byte[] bArr2 = this.yuvBuffer;
                    if (bArr2 == null) {
                        Intrinsics.n("yuvBuffer");
                        throw null;
                    }
                    Allocation createSized = Allocation.createSized(renderScript2, element, bArr2.length);
                    Intrinsics.checkNotNullExpressionValue(createSized, "createSized(rs, elemType.element, yuvBuffer.size)");
                    this.inputAllocation = createSized;
                }
                if (this.outputAllocation == null) {
                    Allocation createFromBitmap = Allocation.createFromBitmap(this.rs, output);
                    Intrinsics.checkNotNullExpressionValue(createFromBitmap, "createFromBitmap(rs, output)");
                    this.outputAllocation = createFromBitmap;
                }
                Allocation allocation = this.inputAllocation;
                if (allocation == null) {
                    Intrinsics.n("inputAllocation");
                    throw null;
                }
                byte[] bArr3 = this.yuvBuffer;
                if (bArr3 == null) {
                    Intrinsics.n("yuvBuffer");
                    throw null;
                }
                allocation.copyFrom(bArr3);
                ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB = this.scriptYuvToRgb;
                Allocation allocation2 = this.inputAllocation;
                if (allocation2 == null) {
                    Intrinsics.n("inputAllocation");
                    throw null;
                }
                scriptIntrinsicYuvToRGB.setInput(allocation2);
                ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB2 = this.scriptYuvToRgb;
                Allocation allocation3 = this.outputAllocation;
                if (allocation3 == null) {
                    Intrinsics.n("outputAllocation");
                    throw null;
                }
                scriptIntrinsicYuvToRGB2.forEach(allocation3);
                Allocation allocation4 = this.outputAllocation;
                if (allocation4 == null) {
                    Intrinsics.n("outputAllocation");
                    throw null;
                }
                allocation4.copyTo(output);
                Allocation allocation5 = this.inputAllocation;
                if (allocation5 == null) {
                    Intrinsics.n("inputAllocation");
                    throw null;
                }
                allocation5.destroy();
                Allocation allocation6 = this.outputAllocation;
                if (allocation6 == null) {
                    Intrinsics.n("outputAllocation");
                    throw null;
                }
                allocation6.destroy();
                this.scriptYuvToRgb.destroy();
                Intrinsics.checkNotNullExpressionValue(output, "output");
            } catch (Throwable th2) {
                throw th2;
            }
            return output;
        }
    }

    private ImageTools() {
    }

    @NotNull
    public final Bitmap imageToBitmap(@NotNull Context context, @NotNull Image image, int rotationDegrees) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(image, "image");
        return rotationDegrees == 0 ? new YuvToRgbConverter(context).yuvToRgb(image) : rotate(new YuvToRgbConverter(context).yuvToRgb(image), rotationDegrees);
    }

    @NotNull
    public final Bitmap rotate(@NotNull Bitmap bitmap, int degrees) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.postRotate(degrees);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(bitmap, 0, …map.height, matrix, true)");
        return createBitmap;
    }
}
