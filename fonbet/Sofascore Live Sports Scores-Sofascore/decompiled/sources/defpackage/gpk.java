package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gpk implements j1g {
    public static final ivd d = new ivd("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new dpk());
    public static final ivd e = new ivd("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new bq4());
    public static final haf f = new haf(5);
    public static final List g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final fpk a;
    public final dx1 b;
    public final haf c = f;

    public gpk(dx1 dx1Var, fpk fpkVar) {
        this.b = dx1Var;
        this.a = fpkVar;
    }

    @Override // defpackage.j1g
    public final boolean a(Object obj, uvd uvdVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j1g
    public final e1g b(Object obj, int i, int i2, uvd uvdVar) {
        boolean isTerminated;
        boolean isTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long longValue = ((Long) uvdVar.c(d)).longValue();
        if (longValue < 0 && longValue != -1) {
            a70.p(vxd.l(longValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        int i3 = (Integer) uvdVar.c(e);
        if (i3 == null) {
            i3 = 2;
        }
        l75 l75Var = (l75) uvdVar.c(l75.c);
        if (l75Var == null) {
            l75Var = l75.b;
        }
        l75 l75Var2 = l75Var;
        this.c.getClass();
        Integer num = i3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z = false;
        try {
            this.a.c(mediaMetadataRetriever, obj);
            Bitmap c = c(obj, mediaMetadataRetriever, longValue, num.intValue(), i, i2, l75Var2);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!isTerminated2) {
                        try {
                            isTerminated2 = executorService.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            return new ex1(this.b, c);
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(isTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService2.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(4:5|6|7|(1:9)(6:10|12|13|(2:15|(1:17)(3:18|19|20))|23|24))|28|(5:35|36|37|(1:43)|41)|(1:46)|47|(3:75|(0)|(1:63)(2:64|65))(4:51|(3:54|(1:56)(1:73)|52)|74|(0)(0))|57|58|59|(3:67|68|(1:70))|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e1, code lost:
    
        if (r1 < 33) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, l75 l75Var) {
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable unused) {
                mediaExtractor = null;
            }
            if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                mediaExtractor = new MediaExtractor();
                try {
                    this.a.b(mediaExtractor, obj);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i4 = 0; i4 < trackCount; i4++) {
                        if (MimeTypes.VIDEO_VP8.equals(mediaExtractor.getTrackFormat(i4).getString("mime"))) {
                            mediaExtractor.release();
                            a70.r("Cannot decode VP8 video on CrOS.");
                            return null;
                        }
                    }
                } catch (Throwable unused2) {
                }
                mediaExtractor.release();
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && l75Var != l75.a) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float b = l75Var.b(parseInt, parseInt2, i2, i3);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * b), Math.round(b * parseInt2));
            } catch (Throwable unused3) {
            }
        }
        if (bitmap == null) {
            bitmap = mediaMetadataRetriever.getFrameAtTime(j, i);
        }
        if (!Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
            }
            if (bitmap != null) {
                return bitmap;
            }
            throw new fb3("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details", 15);
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
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
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        }
        if (bitmap != null) {
        }
    }
}
