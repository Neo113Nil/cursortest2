package io.intercom.android.sdk.lightcompressor.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* compiled from: CompressorUtils.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0017J\u0016\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\n\u0010 \u001a\u00060\"j\u0002`!¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020'J*\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0)2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u001eJ\u0006\u0010-\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lio/intercom/android/sdk/lightcompressor/utils/CompressorUtils;", "", "<init>", "()V", "MIN_HEIGHT", "", "MIN_WIDTH", "I_FRAME_INTERVAL", "", "prepareVideoWidth", "mediaMetadataRetriever", "Landroid/media/MediaMetadataRetriever;", "prepareVideoHeight", "setOutputFileParameters", "", "inputFormat", "Landroid/media/MediaFormat;", "outputFormat", "newBitrate", "getFrameRate", "format", "getIFrameIntervalRate", "getColorStandard", "(Landroid/media/MediaFormat;)Ljava/lang/Integer;", "getColorTransfer", "getColorRange", "findTrack", "extractor", "Landroid/media/MediaExtractor;", "isVideo", "", "printException", "exception", "Lkotlin/Exception;", "Ljava/lang/Exception;", "(Ljava/lang/Exception;)V", "getBitrate", "bitrate", "quality", "Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "generateWidthAndHeight", "Lkotlin/Pair;", "width", "height", "keepOriginalResolution", "hasQTI", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CompressorUtils {
    public static final CompressorUtils INSTANCE = new CompressorUtils();
    private static final int I_FRAME_INTERVAL = 1;
    private static final double MIN_HEIGHT = 640.0d;
    private static final double MIN_WIDTH = 368.0d;

    /* compiled from: CompressorUtils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoQuality.values().length];
            try {
                iArr[VideoQuality.VERY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoQuality.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoQuality.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoQuality.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoQuality.VERY_HIGH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CompressorUtils() {
    }

    public final double prepareVideoWidth(MediaMetadataRetriever mediaMetadataRetriever) {
        Intrinsics.checkNotNullParameter(mediaMetadataRetriever, "mediaMetadataRetriever");
        String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
        String str = extractMetadata;
        return (str == null || str.length() == 0) ? MIN_WIDTH : Double.parseDouble(extractMetadata);
    }

    public final double prepareVideoHeight(MediaMetadataRetriever mediaMetadataRetriever) {
        Intrinsics.checkNotNullParameter(mediaMetadataRetriever, "mediaMetadataRetriever");
        String extractMetadata = mediaMetadataRetriever.extractMetadata(19);
        String str = extractMetadata;
        return (str == null || str.length() == 0) ? MIN_HEIGHT : Double.parseDouble(extractMetadata);
    }

    public final void setOutputFileParameters(MediaFormat inputFormat, MediaFormat outputFormat, int newBitrate) {
        Intrinsics.checkNotNullParameter(inputFormat, "inputFormat");
        Intrinsics.checkNotNullParameter(outputFormat, "outputFormat");
        int frameRate = getFrameRate(inputFormat);
        int iFrameIntervalRate = getIFrameIntervalRate(inputFormat);
        outputFormat.setInteger("color-format", 2130708361);
        outputFormat.setInteger("frame-rate", frameRate);
        outputFormat.setInteger("i-frame-interval", iFrameIntervalRate);
        outputFormat.setInteger("bitrate", newBitrate);
        outputFormat.setInteger("bitrate-mode", 2);
        CompressorUtils compressorUtils = INSTANCE;
        Integer colorStandard = compressorUtils.getColorStandard(inputFormat);
        if (colorStandard != null) {
            outputFormat.setInteger("color-standard", colorStandard.intValue());
        }
        Integer colorTransfer = compressorUtils.getColorTransfer(inputFormat);
        if (colorTransfer != null) {
            outputFormat.setInteger("color-transfer", colorTransfer.intValue());
        }
        Integer colorRange = compressorUtils.getColorRange(inputFormat);
        if (colorRange != null) {
            outputFormat.setInteger("color-range", colorRange.intValue());
        }
        Log.i("Output file parameters", "videoFormat: " + outputFormat);
    }

    private final int getFrameRate(MediaFormat format) {
        if (format.containsKey("frame-rate")) {
            return format.getInteger("frame-rate");
        }
        return 30;
    }

    private final int getIFrameIntervalRate(MediaFormat format) {
        if (format.containsKey("i-frame-interval")) {
            return format.getInteger("i-frame-interval");
        }
        return 1;
    }

    private final Integer getColorStandard(MediaFormat format) {
        if (format.containsKey("color-standard")) {
            return Integer.valueOf(format.getInteger("color-standard"));
        }
        return null;
    }

    private final Integer getColorTransfer(MediaFormat format) {
        if (format.containsKey("color-transfer")) {
            return Integer.valueOf(format.getInteger("color-transfer"));
        }
        return null;
    }

    private final Integer getColorRange(MediaFormat format) {
        if (format.containsKey("color-range")) {
            return Integer.valueOf(format.getInteger("color-range"));
        }
        return null;
    }

    public final int findTrack(MediaExtractor extractor, boolean isVideo) {
        Boolean valueOf;
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (isVideo) {
                valueOf = string != null ? Boolean.valueOf(StringsKt.startsWith$default(string, "video/", false, 2, (Object) null)) : null;
                Intrinsics.checkNotNull(valueOf);
                if (valueOf.booleanValue()) {
                    return i;
                }
            } else {
                valueOf = string != null ? Boolean.valueOf(StringsKt.startsWith$default(string, "audio/", false, 2, (Object) null)) : null;
                Intrinsics.checkNotNull(valueOf);
                if (valueOf.booleanValue()) {
                    return i;
                }
            }
        }
        return -5;
    }

    public final void printException(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "An error has occurred!";
        }
        Log.e("Compressor", localizedMessage, exception);
    }

    public final int getBitrate(int bitrate, VideoQuality quality) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        int i = WhenMappings.$EnumSwitchMapping$0[quality.ordinal()];
        if (i == 1) {
            return MathKt.roundToInt(bitrate * 0.1d);
        }
        if (i == 2) {
            return MathKt.roundToInt(bitrate * 0.2d);
        }
        if (i == 3) {
            return MathKt.roundToInt(bitrate * 0.3d);
        }
        if (i == 4) {
            return MathKt.roundToInt(bitrate * 0.4d);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return MathKt.roundToInt(bitrate * 0.6d);
    }

    public final Pair<Integer, Integer> generateWidthAndHeight(double width, double height, boolean keepOriginalResolution) {
        int generateWidthHeightValue;
        int generateWidthHeightValue2;
        if (keepOriginalResolution) {
            return new Pair<>(Integer.valueOf(MathKt.roundToInt(width)), Integer.valueOf(MathKt.roundToInt(height)));
        }
        if (width >= 1920.0d || height >= 1920.0d) {
            generateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(width, 0.5d);
            generateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(height, 0.5d);
        } else if (width >= 1280.0d || height >= 1280.0d) {
            generateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(width, 0.75d);
            generateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(height, 0.75d);
        } else if (width >= 960.0d || height >= 960.0d) {
            generateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(width, 0.95d);
            generateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(height, 0.95d);
        } else {
            generateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(width, 0.9d);
            generateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(height, 0.9d);
        }
        return new Pair<>(Integer.valueOf(generateWidthHeightValue), Integer.valueOf(generateWidthHeightValue2));
    }

    public final boolean hasQTI() {
        Iterator it = ArrayIteratorKt.iterator(new MediaCodecList(0).getCodecInfos());
        while (it.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            Log.i("CODECS: ", mediaCodecInfo.getName());
            String name = mediaCodecInfo.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.contains$default((CharSequence) name, (CharSequence) "qti.avc", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
