package ru.sberdevices.salutevision.core.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.SaluteVisionSdkLoader;
import ru.sberdevices.salutevision.core.utils.ImageTools;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0082 J\b\u0010\u001c\u001a\u00020\u001aH\u0004J\u001b\u0010\u001d\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\u0007H\u0082 J;\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0082 JO\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010!2\b\u0010&\u001a\u0004\u0018\u00010!2\b\u0010'\u001a\u0004\u0018\u00010!2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0082 J\u0013\u0010(\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\u0014H\u0082 J\u0011\u0010)\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u0014H\u0082 J\u0011\u0010+\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0082 J\u0011\u0010,\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0014H\u0082 R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006-"}, d2 = {"Lru/sberdevices/salutevision/core/data/SaluteVisionImage;", "", "context", "Landroid/content/Context;", "image", "Landroid/media/Image;", "rotationDegrees", "", "(Landroid/content/Context;Landroid/media/Image;I)V", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;I)V", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "height", "getHeight", "()I", "nativeHandle", "", "getNativeHandle", "()J", "width", "getWidth", "deleteSaluteVisionImage", "", "handle", "finalize", "initSaluteVisionImageWithBitmap", "rotation", "initSaluteVisionImageWithRgbaPlane", "rgba", "Ljava/nio/ByteBuffer;", "pixelStride", "rowStride", "initSaluteVisionImageWithYuvPlanes", "y", "u", "v", "nativeBitmap", "nativeEmpty", "", "nativeHeight", "nativeWidth", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SaluteVisionImage {
    private Bitmap bitmap;
    private final long nativeHandle;

    public SaluteVisionImage(@NotNull Context context, @NotNull Image image, int i11) {
        long j11;
        int i12;
        SaluteVisionImage saluteVisionImage;
        int i13;
        ByteBuffer buffer;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(image, "image");
        if (SaluteVisionSdkLoader.INSTANCE.getInitialized()) {
            if (image.getFormat() == 1) {
                Image.Plane[] planes = image.getPlanes();
                Intrinsics.checkNotNullExpressionValue(planes, "image.planes");
                Image.Plane plane = !(planes.length == 0) ? image.getPlanes()[0] : null;
                ByteBuffer buffer2 = plane != null ? plane.getBuffer() : null;
                int width = image.getWidth();
                int height = image.getHeight();
                int pixelStride = plane != null ? plane.getPixelStride() : 0;
                if (plane != null) {
                    i12 = plane.getRowStride();
                    i13 = i11;
                    saluteVisionImage = this;
                } else {
                    i12 = 0;
                    saluteVisionImage = this;
                    i13 = i11;
                }
                j11 = saluteVisionImage.initSaluteVisionImageWithRgbaPlane(buffer2, width, height, pixelStride, i12, i13);
                if (nativeEmpty(j11)) {
                    deleteSaluteVisionImage(j11);
                    Bitmap bitmap = Bitmap.createBitmap(image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
                    if (plane != null && (buffer = plane.getBuffer()) != null) {
                        buffer.rewind();
                    }
                    bitmap.copyPixelsFromBuffer(plane != null ? plane.getBuffer() : null);
                    ImageTools imageTools = ImageTools.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                    j11 = initSaluteVisionImageWithBitmap(imageTools.rotate(bitmap, i11), 0);
                }
            } else {
                Image.Plane[] planes2 = image.getPlanes();
                Intrinsics.checkNotNullExpressionValue(planes2, "image.planes");
                Image.Plane plane2 = !(planes2.length == 0) ? image.getPlanes()[0] : null;
                Image.Plane plane3 = image.getPlanes().length > 1 ? image.getPlanes()[1] : null;
                Image.Plane plane4 = image.getPlanes().length > 2 ? image.getPlanes()[2] : null;
                Image.Plane plane5 = plane3;
                j11 = initSaluteVisionImageWithYuvPlanes(plane2 != null ? plane2.getBuffer() : null, plane3 != null ? plane3.getBuffer() : null, plane4 != null ? plane4.getBuffer() : null, image.getWidth(), image.getHeight(), plane5 != null ? plane5.getPixelStride() : 0, plane5 != null ? plane5.getRowStride() : 0, i11);
                if (nativeEmpty(j11)) {
                    deleteSaluteVisionImage(j11);
                    j11 = initSaluteVisionImageWithBitmap(ImageTools.INSTANCE.imageToBitmap(context, image, i11), 0);
                }
            }
        } else {
            j11 = 0;
        }
        this.nativeHandle = j11;
    }

    private final native void deleteSaluteVisionImage(long handle);

    private final native long initSaluteVisionImageWithBitmap(Bitmap bitmap, int rotation);

    private final native long initSaluteVisionImageWithRgbaPlane(ByteBuffer rgba, int width, int height, int pixelStride, int rowStride, int rotation);

    private final native long initSaluteVisionImageWithYuvPlanes(ByteBuffer y11, ByteBuffer u11, ByteBuffer v11, int width, int height, int pixelStride, int rowStride, int rotation);

    private final native Bitmap nativeBitmap(long handle);

    private final native boolean nativeEmpty(long handle);

    private final native int nativeHeight(long handle);

    private final native int nativeWidth(long handle);

    protected final void finalize() {
        long j11 = this.nativeHandle;
        if (j11 != 0) {
            deleteSaluteVisionImage(j11);
        }
    }

    public final Bitmap getBitmap() {
        if (this.bitmap == null) {
            long j11 = this.nativeHandle;
            this.bitmap = j11 != 0 ? nativeBitmap(j11) : null;
        }
        return this.bitmap;
    }

    public final int getHeight() {
        long j11 = this.nativeHandle;
        if (j11 != 0) {
            return nativeHeight(j11);
        }
        return 0;
    }

    public final long getNativeHandle() {
        return this.nativeHandle;
    }

    public final int getWidth() {
        long j11 = this.nativeHandle;
        if (j11 != 0) {
            return nativeWidth(j11);
        }
        return 0;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public /* synthetic */ SaluteVisionImage(Context context, Image image, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, image, (i12 & 4) != 0 ? 0 : i11);
    }

    public SaluteVisionImage(@NotNull Bitmap bitmap, int i11) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.nativeHandle = SaluteVisionSdkLoader.INSTANCE.getInitialized() ? initSaluteVisionImageWithBitmap(bitmap, i11) : 0L;
    }

    public /* synthetic */ SaluteVisionImage(Bitmap bitmap, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, (i12 & 2) != 0 ? 0 : i11);
    }
}
