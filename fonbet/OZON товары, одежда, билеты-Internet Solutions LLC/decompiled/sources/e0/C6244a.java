package e0;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.annotation.NonNull;
import d0.U;
import d0.W;
import java.io.IOException;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6244a {

    /* renamed from: a, reason: collision with root package name */
    private static final LruCache<String, MediaCodecInfo> f61725a = new LruCache<>(10);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f61726b = 0;

    @NonNull
    public static MediaCodecInfo a(@NonNull W w11) throws U {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodec;
        String a11 = w11.a();
        LruCache<String, MediaCodecInfo> lruCache = f61725a;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(a11);
        }
        try {
            if (mediaCodecInfo != null) {
                return mediaCodecInfo;
            }
            try {
                mediaCodec = MediaCodec.createEncoderByType(a11);
                try {
                    MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                    synchronized (lruCache) {
                        lruCache.put(a11, codecInfo);
                    }
                    mediaCodec.release();
                    return codecInfo;
                } catch (Throwable th2) {
                    th = th2;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw th;
                }
            } catch (IOException | IllegalArgumentException e11) {
                throw new U(e11);
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodec = null;
        }
    }
}
