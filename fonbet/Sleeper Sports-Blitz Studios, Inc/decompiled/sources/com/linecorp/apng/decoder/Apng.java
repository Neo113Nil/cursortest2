package com.linecorp.apng.decoder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Trace;
import com.linecorp.apng.decoder.ApngException;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Apng.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 22\u00020\u0001:\u000212BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0000J\u0006\u0010'\u001a\u00020%J0\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u000200R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/linecorp/apng/decoder/Apng;", "", "id", "", "width", "height", RRWebVideoEvent.JsonKeys.FRAME_COUNT, "frameDurations", "", "loopCount", "allFrameByteCount", "", "<init>", "(IIII[IIJ)V", "getWidth", "()I", "getHeight", "getFrameCount", "getFrameDurations", "()[I", "getLoopCount", "getAllFrameByteCount", "()J", "bitmap", "Landroid/graphics/Bitmap;", "byteCount", "getByteCount", "duration", "getDuration", "isRecycled", "", "()Z", AnalyticsConstantsKt.KEY_CONFIG, "Landroid/graphics/Bitmap$Config;", "getConfig", "()Landroid/graphics/Bitmap$Config;", "recycle", "", "copy", "finalize", "drawWithIndex", "frameIndex", "canvas", "Landroid/graphics/Canvas;", "src", "Landroid/graphics/Rect;", "dst", "paint", "Landroid/graphics/Paint;", "DecodeResult", "Companion", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Apng {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long allFrameByteCount;
    private final Bitmap bitmap;
    private final int duration;
    private final int frameCount;
    private final int[] frameDurations;
    private final int height;
    private final int id;
    private final int loopCount;
    private final int width;

    public Apng(int i, int i2, int i3, int i4, int[] frameDurations, int i5, long j) {
        Intrinsics.checkNotNullParameter(frameDurations, "frameDurations");
        this.id = i;
        this.width = i2;
        this.height = i3;
        this.frameCount = i4;
        this.frameDurations = frameDurations;
        this.loopCount = i5;
        this.allFrameByteCount = j;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.bitmap = createBitmap;
        Trace.beginSection("Apng#draw");
        ApngDecoderJni.draw(i, 0, createBitmap);
        Trace.endSection();
        this.duration = ArraysKt.sum(frameDurations);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getFrameCount() {
        return this.frameCount;
    }

    public final int[] getFrameDurations() {
        return this.frameDurations;
    }

    public final int getLoopCount() {
        return this.loopCount;
    }

    public final long getAllFrameByteCount() {
        return this.allFrameByteCount;
    }

    public final int getByteCount() {
        return this.bitmap.getAllocationByteCount();
    }

    public final int getDuration() {
        return this.duration;
    }

    public final boolean isRecycled() {
        return this.bitmap.isRecycled();
    }

    public final Bitmap.Config getConfig() {
        Bitmap.Config config = this.bitmap.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
        return config;
    }

    public final void recycle() {
        ApngDecoderJni.recycle(this.id);
    }

    public final Apng copy() {
        return INSTANCE.copy(this);
    }

    public final void finalize() {
        recycle();
    }

    public final void drawWithIndex(int frameIndex, Canvas canvas, Rect src, Rect dst, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Trace.beginSection("Apng#draw");
        ApngDecoderJni.draw(this.id, frameIndex, this.bitmap);
        Trace.endSection();
        canvas.drawBitmap(this.bitmap, src, dst, paint);
    }

    /* compiled from: Apng.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/linecorp/apng/decoder/Apng$DecodeResult;", "", "<init>", "()V", "width", "", "getWidth", "()I", "setWidth", "(I)V", "height", "getHeight", "setHeight", RRWebVideoEvent.JsonKeys.FRAME_COUNT, "getFrameCount", "setFrameCount", "loopCount", "getLoopCount", "setLoopCount", "frameDurations", "", "getFrameDurations", "()[I", "setFrameDurations", "([I)V", "allFrameByteCount", "", "getAllFrameByteCount", "()J", "setAllFrameByteCount", "(J)V", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DecodeResult {
        private long allFrameByteCount;
        private int frameCount;
        private int[] frameDurations = new int[0];
        private int height;
        private int loopCount;
        private int width;

        public final int getWidth() {
            return this.width;
        }

        public final void setWidth(int i) {
            this.width = i;
        }

        public final int getHeight() {
            return this.height;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final int getFrameCount() {
            return this.frameCount;
        }

        public final void setFrameCount(int i) {
            this.frameCount = i;
        }

        public final int getLoopCount() {
            return this.loopCount;
        }

        public final void setLoopCount(int i) {
            this.loopCount = i;
        }

        public final int[] getFrameDurations() {
            return this.frameDurations;
        }

        public final void setFrameDurations(int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.frameDurations = iArr;
        }

        public final long getAllFrameByteCount() {
            return this.allFrameByteCount;
        }

        public final void setAllFrameByteCount(long j) {
            this.allFrameByteCount = j;
        }
    }

    /* compiled from: Apng.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/linecorp/apng/decoder/Apng$Companion;", "", "<init>", "()V", "decode", "Lcom/linecorp/apng/decoder/Apng;", "stream", "Ljava/io/InputStream;", "isApng", "", "copy", "apng", "throwIfError", "", "resultCode", "", "apng-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Apng decode(InputStream stream) throws ApngException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            DecodeResult decodeResult = new DecodeResult();
            Trace.beginSection("Apng#decode");
            try {
                int decode = ApngDecoderJni.decode(stream, decodeResult);
                Trace.endSection();
                throwIfError(decode);
                try {
                    return new Apng(decode, decodeResult.getWidth(), decodeResult.getHeight(), decodeResult.getFrameCount(), decodeResult.getFrameDurations(), decodeResult.getLoopCount(), decodeResult.getAllFrameByteCount());
                } finally {
                    ApngException apngException = new ApngException(th);
                }
            } finally {
            }
        }

        public final boolean isApng(InputStream stream) throws ApngException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            try {
                return ApngDecoderJni.isApng(stream);
            } catch (Throwable th) {
                throw new ApngException(th);
            }
        }

        public final Apng copy(Apng apng) throws ApngException {
            Intrinsics.checkNotNullParameter(apng, "apng");
            DecodeResult decodeResult = new DecodeResult();
            Trace.beginSection("Apng#copy");
            try {
                int copy = ApngDecoderJni.copy(apng.id, decodeResult);
                Trace.endSection();
                throwIfError(copy);
                try {
                    return new Apng(copy, decodeResult.getWidth(), decodeResult.getHeight(), decodeResult.getFrameCount(), decodeResult.getFrameDurations(), decodeResult.getLoopCount(), decodeResult.getAllFrameByteCount());
                } finally {
                    ApngException apngException = new ApngException(th);
                }
            } finally {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void throwIfError(int resultCode) throws ApngException {
            if (resultCode >= 0) {
                return;
            }
            throw new ApngException(ApngException.ErrorCode.INSTANCE.fromErrorCode$apng_drawable_release(resultCode), null, 2, 0 == true ? 1 : 0);
        }
    }
}
