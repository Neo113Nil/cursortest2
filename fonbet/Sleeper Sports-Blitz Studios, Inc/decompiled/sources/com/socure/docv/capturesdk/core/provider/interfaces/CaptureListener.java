package com.socure.docv.capturesdk.core.provider.interfaces;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import com.socure.docv.capturesdk.core.processor.model.CaptureMetadata;
import kotlin.Metadata;

/* compiled from: CaptureListener.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/core/provider/interfaces/CaptureListener;", "", "captured", "", "currentCount", "", "bitmap", "Landroid/graphics/Bitmap;", "captureMetadata", "Lcom/socure/docv/capturesdk/core/processor/model/CaptureMetadata;", "manualDbgImg", "error", "exception", "Landroidx/camera/core/ImageCaptureException;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface CaptureListener {
    void captured(int currentCount, Bitmap bitmap, CaptureMetadata captureMetadata, Bitmap manualDbgImg);

    void error(int currentCount, ImageCaptureException exception);

    /* compiled from: CaptureListener.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void captured$default(CaptureListener captureListener, int i, Bitmap bitmap, CaptureMetadata captureMetadata, Bitmap bitmap2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captured");
            }
            if ((i2 & 8) != 0) {
                bitmap2 = null;
            }
            captureListener.captured(i, bitmap, captureMetadata, bitmap2);
        }
    }
}
