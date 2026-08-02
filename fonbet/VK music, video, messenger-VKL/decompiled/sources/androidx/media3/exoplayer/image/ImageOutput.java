package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* loaded from: classes12.dex */
public interface ImageOutput {
    public static final a a = new a();

    void onImageAvailable(long j, Bitmap bitmap);

    public class a implements ImageOutput {
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void onImageAvailable(long j, Bitmap bitmap) {
        }
    }
}
