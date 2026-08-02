package ru.ozon.fintech.features.camera.domain.scanner;

import L80.a;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.p;
import androidx.camera.view.PreviewView;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\r\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/camera/core/p;", "source", "Ljava/nio/ByteBuffer;", "getImageByteBuffer", "(Landroidx/camera/core/p;)Ljava/nio/ByteBuffer;", "Landroid/graphics/Bitmap;", "bitmap", "imageProxy", "normalizeBitmapRotation", "(Landroid/graphics/Bitmap;Landroidx/camera/core/p;)Landroid/graphics/Bitmap;", "Landroidx/camera/view/PreviewView;", "Landroid/graphics/Rect;", "boxRect", "cropBoxBitmap", "(Landroidx/camera/view/PreviewView;Landroid/graphics/Rect;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "imageByteBuffer", "", "estimateSharpness", "(Ljava/nio/ByteBuffer;)D", "", "TAG", "Ljava/lang/String;", "camera_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageAnalyzerUtilsKt {

    @NotNull
    private static final String TAG = "ImageAnalyzer";

    public static final Bitmap cropBoxBitmap(PreviewView previewView, Rect rect, @NotNull Bitmap bitmap) {
        Bitmap bitmap2;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Integer valueOf = previewView != null ? Integer.valueOf(previewView.getWidth()) : null;
        Integer valueOf2 = previewView != null ? Integer.valueOf(previewView.getHeight()) : null;
        if (valueOf == null || valueOf2 == null || valueOf.intValue() == 0 || valueOf2.intValue() == 0 || rect == null) {
            return null;
        }
        float height = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight()) > ((float) valueOf.intValue()) / ((float) valueOf2.intValue()) ? bitmap.getHeight() / valueOf2.intValue() : bitmap.getWidth() / valueOf.intValue();
        float width = rect.width() * height;
        float height2 = rect.height() * height;
        try {
            float f7 = 2;
            bitmap2 = Bitmap.createBitmap(bitmap, (int) ((bitmap.getWidth() / 2) - (width / f7)), (int) ((bitmap.getHeight() / 2) - (height2 / f7)), (int) width, (int) height2);
        } catch (IllegalArgumentException e11) {
            e = e11;
            bitmap2 = null;
        }
        try {
            Unit unit = Unit.f71690a;
            return bitmap2;
        } catch (IllegalArgumentException e12) {
            e = e12;
            a.c(TAG, null, e);
            return bitmap2;
        }
    }

    public static final double estimateSharpness(@NotNull ByteBuffer imageByteBuffer) {
        Intrinsics.checkNotNullParameter(imageByteBuffer, "imageByteBuffer");
        try {
            int remaining = imageByteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            imageByteBuffer.get(bArr);
            int i11 = remaining - 1;
            double d11 = 0.0d;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                int i14 = (bArr[i13] & 255) - (bArr[i12] & 255);
                d11 += i14 * i14;
                i12 = i13;
            }
            double d12 = d11 / remaining;
            a.a(TAG, "Sharpness: " + d12);
            return d12;
        } catch (Exception unused) {
            return -1.0d;
        }
    }

    public static final ByteBuffer getImageByteBuffer(@NotNull p source) {
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            ByteBuffer f7 = source.c0()[0].f();
            Intrinsics.checkNotNullExpressionValue(f7, "getBuffer(...)");
            ByteBuffer allocate = ByteBuffer.allocate(f7.remaining());
            Intrinsics.checkNotNullExpressionValue(allocate, "allocate(...)");
            allocate.put(f7.duplicate());
            allocate.flip();
            return allocate;
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public static final Bitmap normalizeBitmapRotation(@NotNull Bitmap bitmap, @NotNull p imageProxy) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        Matrix matrix = new Matrix();
        matrix.postRotate(imageProxy.x0().c());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, 0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }
}
