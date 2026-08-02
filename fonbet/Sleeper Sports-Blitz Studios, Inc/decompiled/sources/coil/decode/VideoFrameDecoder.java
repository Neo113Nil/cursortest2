package coil.decode;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import coil.ImageLoader;
import coil.decode.Decoder;
import coil.decode.ImageSource;
import coil.fetch.MediaDataSourceFetcher;
import coil.fetch.SourceResult;
import coil.request.Options;
import coil.request.Videos;
import coil.size.Dimension;
import coil.size.Size;
import coil.size.Sizes;
import coil.util.VideoUtils;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: VideoFrameDecoder.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcoil/decode/VideoFrameDecoder;", "Lcoil/decode/Decoder;", "source", "Lcoil/decode/ImageSource;", "options", "Lcoil/request/Options;", "<init>", "(Lcoil/decode/ImageSource;Lcoil/request/Options;)V", "decode", "Lcoil/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeFrameMicros", "", "retriever", "Landroid/media/MediaMetadataRetriever;", "normalizeBitmap", "Landroid/graphics/Bitmap;", "inBitmap", RRWebVideoEvent.JsonKeys.SIZE, "Lcoil/size/Size;", "isConfigValid", "", "bitmap", "isSizeValid", "setDataSource", "", "Factory", "Companion", "coil-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VideoFrameDecoder implements Decoder {
    public static final String VIDEO_FRAME_MICROS_KEY = "coil#video_frame_micros";
    public static final String VIDEO_FRAME_OPTION_KEY = "coil#video_frame_option";
    public static final String VIDEO_FRAME_PERCENT_KEY = "coil#video_frame_percent";
    private final Options options;
    private final ImageSource source;

    public VideoFrameDecoder(ImageSource imageSource, Options options) {
        this.source = imageSource;
        this.options = options;
    }

    @Override // coil.decode.Decoder
    public Object decode(Continuation<? super DecodeResult> continuation) {
        int intValue;
        Integer intOrNull;
        int intValue2;
        Integer intOrNull2;
        double d;
        Size size;
        Bitmap frameAtTime;
        Integer intOrNull3;
        Integer intOrNull4;
        Integer intOrNull5;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            setDataSource(mediaMetadataRetriever, this.source);
            Integer videoFrameOption = Videos.videoFrameOption(this.options.getParameters());
            int intValue3 = videoFrameOption != null ? videoFrameOption.intValue() : 2;
            long computeFrameMicros = computeFrameMicros(mediaMetadataRetriever);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            int intValue4 = (extractMetadata == null || (intOrNull5 = StringsKt.toIntOrNull(extractMetadata)) == null) ? 0 : intOrNull5.intValue();
            if (intValue4 == 90 || intValue4 == 270) {
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                intValue = (extractMetadata2 == null || (intOrNull2 = StringsKt.toIntOrNull(extractMetadata2)) == null) ? 0 : intOrNull2.intValue();
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
                if (extractMetadata3 != null && (intOrNull = StringsKt.toIntOrNull(extractMetadata3)) != null) {
                    intValue2 = intOrNull.intValue();
                }
                intValue2 = 0;
            } else {
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
                intValue = (extractMetadata4 == null || (intOrNull4 = StringsKt.toIntOrNull(extractMetadata4)) == null) ? 0 : intOrNull4.intValue();
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata5 != null && (intOrNull3 = StringsKt.toIntOrNull(extractMetadata5)) != null) {
                    intValue2 = intOrNull3.intValue();
                }
                intValue2 = 0;
            }
            int i = intValue;
            int i2 = intValue2;
            if (i > 0 && i2 > 0) {
                Size size2 = this.options.getSize();
                int px = Sizes.isOriginal(size2) ? i : VideoUtils.toPx(size2.getWidth(), this.options.getScale());
                Size size3 = this.options.getSize();
                double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(i, i2, px, Sizes.isOriginal(size3) ? i2 : VideoUtils.toPx(size3.getHeight(), this.options.getScale()), this.options.getScale());
                if (this.options.getAllowInexactSize()) {
                    computeSizeMultiplier = RangesKt.coerceAtMost(computeSizeMultiplier, 1.0d);
                }
                d = 1.0d;
                size = Sizes.Size(MathKt.roundToInt(i * computeSizeMultiplier), MathKt.roundToInt(computeSizeMultiplier * i2));
            } else {
                d = 1.0d;
                size = Size.ORIGINAL;
            }
            Size size4 = size;
            Dimension width = size4.getWidth();
            Dimension height = size4.getHeight();
            if (Build.VERSION.SDK_INT >= 27 && (width instanceof Dimension.Pixels) && (height instanceof Dimension.Pixels)) {
                frameAtTime = VideoUtils.getScaledFrameAtTime(mediaMetadataRetriever, computeFrameMicros, intValue3, ((Dimension.Pixels) width).px, ((Dimension.Pixels) height).px, this.options.getConfig());
            } else {
                frameAtTime = VideoUtils.getFrameAtTime(mediaMetadataRetriever, computeFrameMicros, intValue3, this.options.getConfig());
                if (frameAtTime != null) {
                    i = frameAtTime.getWidth();
                    i2 = frameAtTime.getHeight();
                } else {
                    frameAtTime = null;
                }
            }
            if (frameAtTime == null) {
                throw new IllegalStateException(("Failed to decode frame at " + computeFrameMicros + " microseconds.").toString());
            }
            Bitmap normalizeBitmap = normalizeBitmap(frameAtTime, size4);
            DecodeResult decodeResult = new DecodeResult(new BitmapDrawable(this.options.getContext().getResources(), normalizeBitmap), i <= 0 || i2 <= 0 || DecodeUtils.computeSizeMultiplier(i, i2, normalizeBitmap.getWidth(), normalizeBitmap.getHeight(), this.options.getScale()) < d);
            if (Build.VERSION.SDK_INT >= 29) {
                UByte$$ExternalSyntheticBackport0.m13543m((Object) mediaMetadataRetriever);
                return decodeResult;
            }
            mediaMetadataRetriever.release();
            return decodeResult;
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 29) {
                UByte$$ExternalSyntheticBackport0.m13543m((Object) mediaMetadataRetriever);
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    private final long computeFrameMicros(MediaMetadataRetriever retriever) {
        Long longOrNull;
        Long videoFrameMicros = Videos.videoFrameMicros(this.options.getParameters());
        if (videoFrameMicros != null) {
            return videoFrameMicros.longValue();
        }
        Double videoFramePercent = Videos.videoFramePercent(this.options.getParameters());
        long j = 0;
        if (videoFramePercent == null) {
            return 0L;
        }
        String extractMetadata = retriever.extractMetadata(9);
        if (extractMetadata != null && (longOrNull = StringsKt.toLongOrNull(extractMetadata)) != null) {
            j = longOrNull.longValue();
        }
        return 1000 * MathKt.roundToLong(videoFramePercent.doubleValue() * j);
    }

    private final Bitmap normalizeBitmap(Bitmap inBitmap, Size size) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (isConfigValid(inBitmap, this.options) && isSizeValid(inBitmap, this.options, size)) {
            return inBitmap;
        }
        int width = inBitmap.getWidth();
        int height = inBitmap.getHeight();
        Dimension width2 = size.getWidth();
        int width3 = width2 instanceof Dimension.Pixels ? ((Dimension.Pixels) width2).px : inBitmap.getWidth();
        Dimension height2 = size.getHeight();
        float computeSizeMultiplier = (float) DecodeUtils.computeSizeMultiplier(width, height, width3, height2 instanceof Dimension.Pixels ? ((Dimension.Pixels) height2).px : inBitmap.getHeight(), this.options.getScale());
        int roundToInt = MathKt.roundToInt(inBitmap.getWidth() * computeSizeMultiplier);
        int roundToInt2 = MathKt.roundToInt(inBitmap.getHeight() * computeSizeMultiplier);
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = this.options.getConfig();
            config2 = Bitmap.Config.HARDWARE;
            if (config3 == config2) {
                config = Bitmap.Config.ARGB_8888;
                Paint paint = new Paint(3);
                Bitmap createBitmap = Bitmap.createBitmap(roundToInt, roundToInt2, config);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(computeSizeMultiplier, computeSizeMultiplier);
                canvas.drawBitmap(inBitmap, 0.0f, 0.0f, paint);
                inBitmap.recycle();
                return createBitmap;
            }
        }
        config = this.options.getConfig();
        Paint paint2 = new Paint(3);
        Bitmap createBitmap2 = Bitmap.createBitmap(roundToInt, roundToInt2, config);
        Canvas canvas2 = new Canvas(createBitmap2);
        canvas2.scale(computeSizeMultiplier, computeSizeMultiplier);
        canvas2.drawBitmap(inBitmap, 0.0f, 0.0f, paint2);
        inBitmap.recycle();
        return createBitmap2;
    }

    private final boolean isConfigValid(Bitmap bitmap, Options options) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        Bitmap.Config config3 = bitmap.getConfig();
        config = Bitmap.Config.HARDWARE;
        if (config3 != config) {
            return true;
        }
        Bitmap.Config config4 = options.getConfig();
        config2 = Bitmap.Config.HARDWARE;
        return config4 == config2;
    }

    private final boolean isSizeValid(Bitmap bitmap, Options options, Size size) {
        if (options.getAllowInexactSize()) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Dimension width2 = size.getWidth();
        int width3 = width2 instanceof Dimension.Pixels ? ((Dimension.Pixels) width2).px : bitmap.getWidth();
        Dimension height2 = size.getHeight();
        return DecodeUtils.computeSizeMultiplier(width, height, width3, height2 instanceof Dimension.Pixels ? ((Dimension.Pixels) height2).px : bitmap.getHeight(), options.getScale()) == 1.0d;
    }

    private final void setDataSource(MediaMetadataRetriever mediaMetadataRetriever, ImageSource imageSource) {
        if (imageSource.getMetadata() instanceof MediaDataSourceFetcher.MediaSourceMetadata) {
            ImageSource.Metadata metadata = imageSource.getMetadata();
            Intrinsics.checkNotNull(metadata, "null cannot be cast to non-null type coil.fetch.MediaDataSourceFetcher.MediaSourceMetadata");
            mediaMetadataRetriever.setDataSource(((MediaDataSourceFetcher.MediaSourceMetadata) metadata).getMediaDataSource());
            return;
        }
        ImageSource.Metadata metadata2 = imageSource.getMetadata();
        if (metadata2 instanceof AssetMetadata) {
            AssetFileDescriptor openFd = this.options.getContext().getAssets().openFd(((AssetMetadata) metadata2).getFilePath());
            try {
                AssetFileDescriptor assetFileDescriptor = openFd;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(openFd, null);
            } finally {
            }
        } else {
            if (metadata2 instanceof ContentMetadata) {
                mediaMetadataRetriever.setDataSource(this.options.getContext(), ((ContentMetadata) metadata2).getUri());
                return;
            }
            if (metadata2 instanceof ResourceMetadata) {
                StringBuilder sb = new StringBuilder("android.resource://");
                ResourceMetadata resourceMetadata = (ResourceMetadata) metadata2;
                sb.append(resourceMetadata.getPackageName());
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append(resourceMetadata.getResId());
                mediaMetadataRetriever.setDataSource(sb.toString());
                return;
            }
            mediaMetadataRetriever.setDataSource(imageSource.file().toFile().getPath());
        }
    }

    /* compiled from: VideoFrameDecoder.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0013\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcoil/decode/VideoFrameDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "<init>", "()V", "create", "Lcoil/decode/Decoder;", "result", "Lcoil/fetch/SourceResult;", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "isApplicable", "", "mimeType", "", "equals", "other", "", "hashCode", "", "coil-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements Decoder.Factory {
        @Override // coil.decode.Decoder.Factory
        public Decoder create(SourceResult result, Options options, ImageLoader imageLoader) {
            if (isApplicable(result.getMimeType())) {
                return new VideoFrameDecoder(result.getSource(), options);
            }
            return null;
        }

        private final boolean isApplicable(String mimeType) {
            return mimeType != null && StringsKt.startsWith$default(mimeType, "video/", false, 2, (Object) null);
        }

        public boolean equals(Object other) {
            return other instanceof Factory;
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }
}
