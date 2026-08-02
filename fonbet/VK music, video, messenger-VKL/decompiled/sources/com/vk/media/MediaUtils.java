package com.vk.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.location.Location;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.utils.PreviewRetrieveOption;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.proto.PublisherConfiguration;
import xsna.aq1;
import xsna.arm0;
import xsna.brm0;
import xsna.epx;
import xsna.ho8;
import xsna.i020;
import xsna.izs;
import xsna.j020;
import xsna.j20;
import xsna.jv2;
import xsna.kf5;
import xsna.rm0;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: MediaUtils.kt */
/* loaded from: classes3.dex */
public final class MediaUtils {

    /* compiled from: MediaUtils.kt */
    public static final class AudioConfig extends AudioConfigLight {
        public final long d;
        public final int e;
        public final String f;

        public AudioConfig(long j, int i, int i2, String str, int i3) {
            super(i2, i3);
            this.d = j;
            this.e = i;
            this.f = str;
        }

        public final String toString() {
            return "codecMimeType=" + this.f + ",durationMs=" + this.d + ",bitrate=" + this.e + ",sampleRate=" + this.b + ",channels=" + this.c;
        }
    }

    /* compiled from: MediaUtils.kt */
    public static class AudioConfigLight implements Parcelable {
        public static final Parcelable.Creator<AudioConfigLight> CREATOR = new a();
        public final int b;
        public final int c;

        /* compiled from: MediaUtils.kt */
        public static final class a implements Parcelable.Creator<AudioConfigLight> {
            @Override // android.os.Parcelable.Creator
            public final AudioConfigLight createFromParcel(Parcel parcel) {
                return new AudioConfigLight(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final AudioConfigLight[] newArray(int i) {
                return new AudioConfigLight[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AudioConfigLight() {
            this(r2, r2, 3, null);
            int i = 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }

        public AudioConfigLight(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public /* synthetic */ AudioConfigLight(int i, int i2, int i3, zcl zclVar) {
            this((i3 & 1) != 0 ? 44100 : i, (i3 & 2) != 0 ? 2 : i2);
        }
    }

    /* compiled from: MediaUtils.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Location a(String str) {
            MediaMetadataRetriever mediaMetadataRetriever;
            MediaMetadataRetriever mediaMetadataRetriever2 = null;
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(str);
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                        if (extractMetadata == null) {
                            mediaMetadataRetriever.release();
                            return null;
                        }
                        Location o = o(extractMetadata);
                        mediaMetadataRetriever.release();
                        return o;
                    } catch (Exception e) {
                        e = e;
                        e.toString();
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    if (mediaMetadataRetriever2 != null) {
                        mediaMetadataRetriever2.release();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                mediaMetadataRetriever = null;
            } catch (Throwable th2) {
                th = th2;
                if (mediaMetadataRetriever2 != null) {
                }
                throw th;
            }
        }

        public static int b(float f, int i, int i2, int i3) {
            if ((i3 & 8) != 0) {
                f = 30.0f;
            }
            return (int) ((f / 30) * (((int) 2260000.0f) / (921600 / (i * i2))));
        }

        public static f c(Context context, Uri uri, boolean z) {
            return z ? f(new j20(18, uri, context), new aq1(12, uri, context)) : g(new rm0(16, uri, context));
        }

        public static f d(String str) {
            return g(new i020(str, 0));
        }

        public static f e(String str, boolean z) {
            return z ? f(new j020(str, 0), new jv2(str, 1)) : g(new kf5(str, 4));
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        
            if (r6.containsKey("frame-rate") == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
        
            r0 = r6.getInteger("frame-rate");
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
        
            r0 = (int) r6.getFloat("frame-rate");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static f f(izs izsVar, izs izsVar2) {
            Object obj;
            MediaExtractor mediaExtractor;
            int i;
            String str;
            String string;
            int i2;
            f g = g(izsVar2);
            MediaExtractor mediaExtractor2 = null;
            Integer valueOf = null;
            if (g == null) {
                return null;
            }
            try {
                mediaExtractor = new MediaExtractor();
                try {
                    izsVar.invoke(mediaExtractor);
                    i = g.d;
                    String str2 = g.h;
                    int trackCount = mediaExtractor.getTrackCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= trackCount) {
                            str = str2;
                            break;
                        }
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i3);
                        string = trackFormat.containsKey("mime") ? trackFormat.getString("mime") : null;
                        if (string != null && brm0.B(string, "video/", false) && !string.equals("video/dolby-vision") && !string.equals("video/scrambled")) {
                            break;
                        }
                        i3++;
                    }
                    f fVar = new f(g.a, g.b, g.c, i, g.e, g.f, g.g, str, g.i);
                    mediaExtractor.release();
                    return fVar;
                } catch (Throwable th) {
                    obj = th;
                    mediaExtractor2 = mediaExtractor;
                    try {
                        obj.toString();
                        if (mediaExtractor2 != null) {
                            mediaExtractor2.release();
                        }
                        return g;
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                obj = th2;
            }
            valueOf = Integer.valueOf(i2);
            if (valueOf != null) {
                i = valueOf.intValue();
            }
            str = string;
            f fVar2 = new f(g.a, g.b, g.c, i, g.e, g.f, g.g, str, g.i);
            mediaExtractor.release();
            return fVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static f g(izs izsVar) {
            Throwable th;
            Exception exc;
            MediaMetadataRetriever mediaMetadataRetriever;
            int i;
            int i2;
            MediaMetadataRetriever mediaMetadataRetriever2 = null;
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        izsVar.invoke(mediaMetadataRetriever);
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(7);
                        int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                        if (parseInt3 % 180 != 0) {
                            i2 = parseInt;
                            i = parseInt2;
                        } else {
                            i = parseInt;
                            i2 = parseInt2;
                        }
                        f fVar = new f(i, i2, Integer.parseInt(mediaMetadataRetriever.extractMetadata(20)), 0, parseInt3, Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)), mediaMetadataRetriever.extractMetadata(12), null, extractMetadata);
                        mediaMetadataRetriever.release();
                        return fVar;
                    } catch (Exception e) {
                        exc = e;
                        exc.toString();
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    if (mediaMetadataRetriever2 != null) {
                        throw th;
                    }
                    mediaMetadataRetriever2.release();
                    throw th;
                }
            } catch (Exception e2) {
                exc = e2;
                mediaMetadataRetriever = null;
            } catch (Throwable th3) {
                th = th3;
                if (mediaMetadataRetriever2 != null) {
                }
            }
        }

        public static long h(String str) {
            MediaMetadataRetriever mediaMetadataRetriever;
            MediaMetadataRetriever mediaMetadataRetriever2 = null;
            try {
                try {
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                mediaMetadataRetriever.setDataSource(str);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                long parseLong = extractMetadata != null ? Long.parseLong(extractMetadata) : 0L;
                mediaMetadataRetriever.release();
                return parseLong;
            } catch (Exception e2) {
                e = e2;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                e.toString();
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                }
                return 0L;
            } catch (Throwable th2) {
                th = th2;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    mediaMetadataRetriever2.release();
                }
                throw th;
            }
        }

        public static Bitmap i(long j, MediaMetadataRetriever mediaMetadataRetriever, d dVar) {
            Bitmap bitmap;
            try {
                bitmap = l(j, mediaMetadataRetriever, dVar);
            } catch (Exception e) {
                Log.e("MediaUtils", "", e);
                bitmap = null;
            }
            if (bitmap == null || (bitmap.getWidth() == dVar.a && bitmap.getHeight() == dVar.b)) {
                return bitmap;
            }
            Bitmap p = p(dVar.a, dVar.b, bitmap);
            bitmap.recycle();
            return p;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, android.graphics.Bitmap] */
        public static Bitmap j(String str, d dVar) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                ref$ObjectRef.element = i(0L, mediaMetadataRetriever, dVar);
                s3q0 s3q0Var = s3q0.a;
            } catch (Exception unused) {
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
            mediaMetadataRetriever.release();
            return (Bitmap) ref$ObjectRef.element;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Bitmap k(long j, String str) {
            MediaMetadataRetriever mediaMetadataRetriever;
            PreviewRetrieveOption previewRetrieveOption = PreviewRetrieveOption.OPTION_CLOSEST_SYNC;
            MediaMetadataRetriever mediaMetadataRetriever2 = null;
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(str);
                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j * 1000, previewRetrieveOption.h());
                        mediaMetadataRetriever.release();
                        return frameAtTime;
                    } catch (Exception e) {
                        e = e;
                        Log.e("MediaUtils", "", e);
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    mediaMetadataRetriever2 = mediaMetadataRetriever;
                    if (mediaMetadataRetriever2 != null) {
                        mediaMetadataRetriever2.release();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                mediaMetadataRetriever = null;
            } catch (Throwable th2) {
                th = th2;
                if (mediaMetadataRetriever2 != null) {
                }
                throw th;
            }
        }

        public static Bitmap l(long j, MediaMetadataRetriever mediaMetadataRetriever, d dVar) {
            Integer m;
            Integer m2;
            Integer m3;
            try {
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                int intValue = (extractMetadata == null || (m3 = arm0.m(10, extractMetadata)) == null) ? dVar.a : m3.intValue();
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                int intValue2 = (extractMetadata2 == null || (m2 = arm0.m(10, extractMetadata2)) == null) ? dVar.b : m2.intValue();
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                int intValue3 = (extractMetadata3 == null || (m = arm0.m(10, extractMetadata3)) == null) ? 0 : m.intValue();
                long j2 = j * 1000;
                if (intValue3 == 90 || intValue3 == 270) {
                    int i = intValue2;
                    intValue2 = intValue;
                    intValue = i;
                }
                int i2 = dVar.a;
                if (i2 >= intValue && dVar.b >= intValue2) {
                    return mediaMetadataRetriever.getFrameAtTime(j2);
                }
                float max = Math.max(i2 / intValue, dVar.b / intValue2);
                return mediaMetadataRetriever.getScaledFrameAtTime(j2, 2, (int) Math.rint(r13 * max), (int) Math.rint(max * r0));
            } catch (Exception e) {
                Log.e("MediaUtils", "", e);
                return null;
            }
        }

        public static boolean m(g gVar, d dVar) {
            if (epx.f(gVar, dVar)) {
                return true;
            }
            if (gVar == null || dVar == null) {
                return false;
            }
            int i = gVar.b;
            int i2 = dVar.b;
            if (i == i2 && gVar.a == dVar.a) {
                return true;
            }
            return i == dVar.a && gVar.a == i2;
        }

        public static boolean n(String str) {
            epx.f(Looper.getMainLooper(), Looper.myLooper());
            boolean z = false;
            try {
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(str);
                try {
                    int trackCount = mediaExtractor.getTrackCount();
                    int i = 0;
                    while (true) {
                        if (i >= trackCount) {
                            mediaExtractor.release();
                            break;
                        }
                        String string = mediaExtractor.getTrackFormat(i).getString("mime");
                        if (string != null && brm0.B(string, "audio/", false)) {
                            mediaExtractor.release();
                            z = true;
                            break;
                        }
                        i++;
                    }
                    return !z;
                } finally {
                    mediaExtractor.release();
                }
            } catch (Throwable th) {
                Log.e("MediaUtils", "Can't fetch audio track for story file", th);
                return false;
            }
        }

        public static Location o(String str) {
            Double d;
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            int i = 0;
            StringBuilder sb = null;
            Double d2 = null;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                char c = charArray[i];
                if (sb != null && (c == '+' || c == '-' || c == '/')) {
                    double parseDouble = Double.parseDouble(sb.toString());
                    if (d2 != null) {
                        d = Double.valueOf(parseDouble);
                        break;
                    }
                    d2 = Double.valueOf(parseDouble);
                    sb = null;
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(c);
                i++;
            }
            if (d2 == null || d == null) {
                return null;
            }
            Location location = new Location("VIDEO_META");
            location.setLatitude(d2.doubleValue());
            location.setLongitude(d.doubleValue());
            return location;
        }

        public static Bitmap p(int i, int i2, Bitmap bitmap) {
            float max = Math.max(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * max);
            int height = (int) (bitmap.getHeight() * max);
            int i3 = (i - width) / 2;
            int i4 = (i2 - height) / 2;
            Rect rect = new Rect(i3, i4, width + i3, height + i4);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
            return createBitmap;
        }
    }

    /* compiled from: MediaUtils.kt */
    public static final class b {
        public final long a;
        public final String b;
        public final String c;

        public b(long j, String str, String str2) {
            this.a = j;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaTrackInfo(durationMs=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", artist=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: MediaUtils.kt */
    public static final class c {
        public static final ArrayList<g> a;

        static {
            ArrayList<g> arrayList = new ArrayList<>();
            a = arrayList;
            arrayList.add(new g(640, 360));
            arrayList.add(new g(Tensorflow.FRAME_HEIGHT, Tensorflow.FRAME_WIDTH));
            arrayList.add(new g(896, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
            arrayList.add(new g(VideoRecord.DEFAULT_MAX_DIMENSION, 540));
            arrayList.add(new g(CoverVideoUploadTask.y, PublisherConfiguration.DEFAULT_MAX_RES));
        }
    }

    /* compiled from: MediaUtils.kt */
    public static class d {
        public int a;
        public int b;

        public d() {
            this(0, 0);
        }

        public final int a() {
            return this.b;
        }

        public final float b() {
            return this.a / this.b;
        }

        public final int c() {
            return this.a;
        }

        public final boolean d() {
            return this.a * this.b == 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!getClass().equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public String toString() {
            return "size " + this.a + 'x' + this.b;
        }

        public d(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public d(Size size) {
            this.a = size.getWidth();
            this.b = size.getHeight();
        }
    }

    /* compiled from: MediaUtils.kt */
    public static final class e extends g {
        public final int e;
        public final int f;

        public e(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i, i2, i3, i4);
            this.e = i5;
            this.f = i6;
        }

        public final e f() {
            return new e(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    /* compiled from: MediaUtils.kt */
    public static final class f extends g {
        public final int e;
        public final int f;
        public final String g;
        public final String h;
        public final String i;

        public f(int i, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3) {
            super(i, i2, i3, i4);
            this.e = i5;
            this.f = i6;
            this.g = str;
            this.h = str2;
            this.i = str3;
        }

        @Override // com.vk.media.MediaUtils.d
        public final String toString() {
            return "mime: " + this.g + '/' + this.h + " bitrate: " + this.c + " fps: " + this.d + ' ' + super.toString();
        }
    }

    public static final String a(double d2, String str) {
        return d2 < 1000.0d ? String.format("%4d ", Arrays.copyOf(new Object[]{Long.valueOf((long) d2)}, 1)).concat(str) : d2 < 1000000.0d ? String.format("%3.1f K", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1000)}, 1)).concat(str) : d2 < 1.0E9d ? String.format("%3.1f M", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1000000)}, 1)).concat(str) : String.format("%3.1f G", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1000000000)}, 1)).concat(str);
    }

    /* compiled from: MediaUtils.kt */
    public static class g extends d {
        public final int c;
        public final int d;

        public /* synthetic */ g(int i, int i2) {
            this(i, i2, a.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, 12), 0);
        }

        public final int e() {
            return this.d;
        }

        public g(int i, int i2, int i3, int i4) {
            super(i, i2);
            this.c = i3;
            this.d = i4;
        }
    }
}
