package c6;

import I0.C3173b;
import T5.h;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class F<T> implements T5.k<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public static final T5.h<Long> f56531d = T5.h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final T5.h<Integer> f56532e = T5.h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    private static final f f56533f = new f();

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f56534g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    private final e<T> f56535a;

    /* renamed from: b, reason: collision with root package name */
    private final W5.d f56536b;

    /* renamed from: c, reason: collision with root package name */
    private final f f56537c = f56533f;

    final class a implements h.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f56538a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // T5.h.b
        public final void a(@NonNull byte[] bArr, @NonNull Long l11, @NonNull MessageDigest messageDigest) {
            Long l12 = l11;
            messageDigest.update(bArr);
            synchronized (this.f56538a) {
                this.f56538a.position(0);
                messageDigest.update(this.f56538a.putLong(l12.longValue()).array());
            }
        }
    }

    final class b implements h.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f56539a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // T5.h.b
        public final void a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f56539a) {
                this.f56539a.position(0);
                messageDigest.update(this.f56539a.putInt(num2.intValue()).array());
            }
        }
    }

    private static final class c implements e<AssetFileDescriptor> {
        @Override // c6.F.e
        public final void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // c6.F.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    static final class d implements e<ByteBuffer> {
        @Override // c6.F.e
        public final void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new G(byteBuffer));
        }

        @Override // c6.F.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new G(byteBuffer));
        }
    }

    interface e<T> {
        void a(MediaExtractor mediaExtractor, T t2) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t2);
    }

    static class f {
    }

    static final class g implements e<ParcelFileDescriptor> {
        @Override // c6.F.e
        public final void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // c6.F.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* loaded from: classes8.dex */
    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    F(W5.d dVar, e<T> eVar) {
        this.f56536b = dVar;
        this.f56535a = eVar;
    }

    public static F c(W5.d dVar) {
        return new F(dVar, new c());
    }

    public static F d(W5.d dVar) {
        return new F(dVar, new d());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(4:5|6|7|(1:9)(6:10|11|12|(2:14|(1:16)(3:17|18|19))|22|23))|38|(5:45|46|47|(1:53)|51)|(1:59)|60|(3:93|(0)|(1:76)(2:77|78))(4:64|(3:67|(1:69)(1:91)|65)|92|(0)(0))|70|71|72|(3:80|81|(3:83|(1:85)|86))|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017d, code lost:
    
        if (android.util.Log.isLoggable("VideoDecoder", 3) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017f, code lost:
    
        android.util.Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010c, code lost:
    
        if (r0 < 33) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap e(@NonNull T t2, MediaMetadataRetriever mediaMetadataRetriever, long j11, int i11, int i12, int i13, n nVar) {
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable th2) {
                th = th2;
                mediaExtractor = null;
            }
            if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                mediaExtractor = new MediaExtractor();
                try {
                    this.f56535a.a(mediaExtractor, t2);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i14 = 0; i14 < trackCount; i14++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i14).getString("mime"))) {
                            mediaExtractor.release();
                            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                        }
                    } catch (Throwable th4) {
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        throw th4;
                    }
                }
                mediaExtractor.release();
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i12 != Integer.MIN_VALUE && i13 != Integer.MIN_VALUE && nVar != n.f56566f) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float b11 = nVar.b(parseInt, parseInt2, i12, i13);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j11, i11, Math.round(parseInt * b11), Math.round(b11 * parseInt2));
            } catch (Throwable th5) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th5);
                }
            }
        }
        if (bitmap == null) {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j11, i11);
        }
        if (!Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30) {
            }
            if (bitmap != null) {
                return bitmap;
            }
            throw new h();
        }
        Iterator<String> it = f56534g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
            }
        }
        if (bitmap != null) {
        }
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt4 = Integer.parseInt(extractMetadata);
        int parseInt5 = Integer.parseInt(extractMetadata2);
        if ((parseInt4 == 7 || parseInt4 == 6) && parseInt5 == 6) {
            if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        }
        if (bitmap != null) {
        }
    }

    public static F f(W5.d dVar) {
        return new F(dVar, new g());
    }

    @Override // T5.k
    public final boolean a(@NonNull T t2, @NonNull T5.i iVar) {
        return true;
    }

    @Override // T5.k
    public final V5.v<Bitmap> b(@NonNull T t2, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        long longValue = ((Long) iVar.a(f56531d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(C3173b.b(longValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) iVar.a(f56532e);
        if (num == null) {
            num = 2;
        }
        n nVar = (n) iVar.a(n.f56568h);
        if (nVar == null) {
            nVar = n.f56567g;
        }
        n nVar2 = nVar;
        this.f56537c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f56535a.b(mediaMetadataRetriever, t2);
            try {
                Bitmap e11 = e(t2, mediaMetadataRetriever, longValue, num.intValue(), i11, i12, nVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
                return C5753e.c(this.f56536b, e11);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                    throw th3;
                }
                mediaMetadataRetriever.release();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
