package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class CanvasCompat {

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface CanvasOperation {
        void run(@NonNull Canvas canvas);
    }

    private CanvasCompat() {
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, RectF rectF, int i5) {
        return canvas.saveLayerAlpha(rectF, i5);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, float f6, float f10, float f11, float f12, int i5) {
        return canvas.saveLayerAlpha(f6, f10, f11, f12, i5);
    }
}
