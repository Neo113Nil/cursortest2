package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public interface ImageOutput {

    /* renamed from: a, reason: collision with root package name */
    public static final ImageOutput f21341a = new a();

    public class a implements ImageOutput {
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j10, Bitmap bitmap) {
        }
    }

    void a();

    void onImageAvailable(long j10, Bitmap bitmap);
}
