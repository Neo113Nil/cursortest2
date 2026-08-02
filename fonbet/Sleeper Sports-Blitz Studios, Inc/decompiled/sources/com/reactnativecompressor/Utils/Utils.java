package com.reactnativecompressor.Utils;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.perf.FirebasePerformance;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.reactnativecompressor.Audio.AudioCompressor;
import com.reactnativecompressor.Video.VideoCompressor.CompressionListener;
import com.reactnativecompressor.Video.VideoCompressor.VideoCompressorClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0007JP\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0005J\u0012\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0007J9\u0010!\u001a\u0004\u0018\u00010\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010$\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0005J\u000e\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0005J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J \u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u00162\b\b\u0002\u0010:\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0019\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050$¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.¨\u0006;"}, d2 = {"Lcom/reactnativecompressor/Utils/Utils;", "", "<init>", "()V", "TAG", "", "compressorExports", "", "Lcom/reactnativecompressor/Video/VideoCompressor/VideoCompressorClass;", "getCompressorExports", "()Ljava/util/Map;", "setCompressorExports", "(Ljava/util/Map;)V", "generateCacheFilePath", ShareConstants.MEDIA_EXTENSION, "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "compressVideo", "", "srcPath", "destinationPath", "resultWidth", "", "resultHeight", "videoBitRate", "", "uuid", "progressDivider", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "cancelCompressionHelper", "getFileSizeFromURL", "urlString", "getRealPath", "fileUrl", StepData.ARGS, "", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;[Ljava/lang/Object;)Ljava/lang/String;", "getFileSize", "filePath", "slashifyFilePath", "path", "addLog", "log", "exifAttributes", "getExifAttributes", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getLength", "", "uri", "Landroid/net/Uri;", "contentResolver", "Landroid/content/ContentResolver;", "subBuffer", "Ljava/nio/ByteBuffer;", "buf", "start", "count", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Utils {
    private static final String TAG = "react-native-compessor";
    public static final Utils INSTANCE = new Utils();
    private static Map<String, VideoCompressorClass> compressorExports = new HashMap();
    private static final String[] exifAttributes = {ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_APERTURE_VALUE, ExifInterface.TAG_ARTIST, ExifInterface.TAG_BITS_PER_SAMPLE, ExifInterface.TAG_BRIGHTNESS_VALUE, ExifInterface.TAG_CFA_PATTERN, ExifInterface.TAG_COLOR_SPACE, ExifInterface.TAG_COMPONENTS_CONFIGURATION, ExifInterface.TAG_COMPRESSED_BITS_PER_PIXEL, ExifInterface.TAG_COMPRESSION, ExifInterface.TAG_CONTRAST, ExifInterface.TAG_COPYRIGHT, ExifInterface.TAG_CUSTOM_RENDERED, ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_DATETIME_ORIGINAL, ExifInterface.TAG_DEFAULT_CROP_SIZE, ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION, ExifInterface.TAG_DIGITAL_ZOOM_RATIO, ExifInterface.TAG_DNG_VERSION, ExifInterface.TAG_EXIF_VERSION, ExifInterface.TAG_EXPOSURE_BIAS_VALUE, ExifInterface.TAG_EXPOSURE_INDEX, ExifInterface.TAG_EXPOSURE_MODE, ExifInterface.TAG_EXPOSURE_PROGRAM, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_FILE_SOURCE, ExifInterface.TAG_FLASH, ExifInterface.TAG_FLASHPIX_VERSION, ExifInterface.TAG_FLASH_ENERGY, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM, ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION, ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION, ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_GAIN_CONTROL, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_GPS_AREA_INFORMATION, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_GPS_DEST_BEARING, ExifInterface.TAG_GPS_DEST_BEARING_REF, ExifInterface.TAG_GPS_DEST_DISTANCE, ExifInterface.TAG_GPS_DEST_DISTANCE_REF, ExifInterface.TAG_GPS_DEST_LATITUDE, ExifInterface.TAG_GPS_DEST_LATITUDE_REF, ExifInterface.TAG_GPS_DEST_LONGITUDE, ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, ExifInterface.TAG_GPS_DIFFERENTIAL, ExifInterface.TAG_GPS_DOP, ExifInterface.TAG_GPS_IMG_DIRECTION, ExifInterface.TAG_GPS_IMG_DIRECTION_REF, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_MAP_DATUM, ExifInterface.TAG_GPS_MEASURE_MODE, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_GPS_SATELLITES, ExifInterface.TAG_GPS_SPEED, ExifInterface.TAG_GPS_SPEED_REF, ExifInterface.TAG_GPS_STATUS, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_GPS_TRACK, ExifInterface.TAG_GPS_TRACK_REF, ExifInterface.TAG_GPS_VERSION_ID, ExifInterface.TAG_IMAGE_DESCRIPTION, ExifInterface.TAG_IMAGE_LENGTH, ExifInterface.TAG_IMAGE_UNIQUE_ID, ExifInterface.TAG_IMAGE_WIDTH, ExifInterface.TAG_INTEROPERABILITY_INDEX, ExifInterface.TAG_ISO_SPEED_RATINGS, ExifInterface.TAG_ISO_SPEED_RATINGS, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, ExifInterface.TAG_LIGHT_SOURCE, ExifInterface.TAG_MAKE, ExifInterface.TAG_MAKER_NOTE, ExifInterface.TAG_MAX_APERTURE_VALUE, ExifInterface.TAG_METERING_MODE, ExifInterface.TAG_MODEL, ExifInterface.TAG_NEW_SUBFILE_TYPE, ExifInterface.TAG_OECF, ExifInterface.TAG_ORF_ASPECT_FRAME, ExifInterface.TAG_ORF_PREVIEW_IMAGE_LENGTH, ExifInterface.TAG_ORF_PREVIEW_IMAGE_START, ExifInterface.TAG_ORF_THUMBNAIL_IMAGE, ExifInterface.TAG_ORIENTATION, ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION, ExifInterface.TAG_PIXEL_X_DIMENSION, ExifInterface.TAG_PIXEL_Y_DIMENSION, ExifInterface.TAG_PLANAR_CONFIGURATION, ExifInterface.TAG_PRIMARY_CHROMATICITIES, ExifInterface.TAG_REFERENCE_BLACK_WHITE, ExifInterface.TAG_RELATED_SOUND_FILE, ExifInterface.TAG_RESOLUTION_UNIT, ExifInterface.TAG_ROWS_PER_STRIP, ExifInterface.TAG_RW2_ISO, ExifInterface.TAG_RW2_JPG_FROM_RAW, ExifInterface.TAG_RW2_SENSOR_BOTTOM_BORDER, ExifInterface.TAG_RW2_SENSOR_LEFT_BORDER, ExifInterface.TAG_RW2_SENSOR_RIGHT_BORDER, ExifInterface.TAG_RW2_SENSOR_TOP_BORDER, ExifInterface.TAG_SAMPLES_PER_PIXEL, ExifInterface.TAG_SATURATION, ExifInterface.TAG_SCENE_CAPTURE_TYPE, ExifInterface.TAG_SCENE_TYPE, ExifInterface.TAG_SENSING_METHOD, ExifInterface.TAG_SHARPNESS, ExifInterface.TAG_SHUTTER_SPEED_VALUE, ExifInterface.TAG_SOFTWARE, ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE, ExifInterface.TAG_SPECTRAL_SENSITIVITY, ExifInterface.TAG_STRIP_BYTE_COUNTS, ExifInterface.TAG_STRIP_OFFSETS, ExifInterface.TAG_SUBFILE_TYPE, ExifInterface.TAG_SUBJECT_AREA, ExifInterface.TAG_SUBJECT_DISTANCE, ExifInterface.TAG_SUBJECT_DISTANCE_RANGE, ExifInterface.TAG_SUBJECT_LOCATION, ExifInterface.TAG_SUBSEC_TIME, ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH, ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, ExifInterface.TAG_TRANSFER_FUNCTION, ExifInterface.TAG_USER_COMMENT, ExifInterface.TAG_WHITE_BALANCE, ExifInterface.TAG_WHITE_POINT, ExifInterface.TAG_X_RESOLUTION, ExifInterface.TAG_Y_CB_CR_COEFFICIENTS, ExifInterface.TAG_Y_CB_CR_POSITIONING, ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING, ExifInterface.TAG_Y_RESOLUTION};

    private Utils() {
    }

    public final Map<String, VideoCompressorClass> getCompressorExports() {
        return compressorExports;
    }

    public final void setCompressorExports(Map<String, VideoCompressorClass> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        compressorExports = map;
    }

    @JvmStatic
    public static final String generateCacheFilePath(String extension, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        File cacheDir = reactContext.getCacheDir();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s/%s." + extension, Arrays.copyOf(new Object[]{cacheDir.getPath(), UUID.randomUUID().toString()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    @JvmStatic
    public static final void compressVideo(String srcPath, final String destinationPath, int resultWidth, int resultHeight, float videoBitRate, final String uuid, final int progressDivider, final Promise promise, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(srcPath, "srcPath");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        final int[] iArr = {0};
        VideoCompressorClass videoCompressorClass = new VideoCompressorClass(reactContext);
        compressorExports.put(uuid, videoCompressorClass);
        videoCompressorClass.start(srcPath, destinationPath, resultWidth, resultHeight, (int) videoBitRate, new CompressionListener() { // from class: com.reactnativecompressor.Utils.Utils$compressVideo$1
            @Override // com.reactnativecompressor.Video.VideoCompressor.CompressionListener
            public void onStart(int index) {
            }

            @Override // com.reactnativecompressor.Video.VideoCompressor.CompressionListener
            public void onProgress(int index, float percent) {
                if (percent <= 100.0f) {
                    int round = Math.round(percent);
                    int i = progressDivider;
                    if (i == 0 || (round % i == 0 && round > iArr[0])) {
                        EventEmitterHandler.Companion.emitVideoCompressProgress(percent / 100, uuid);
                        iArr[0] = round;
                    }
                }
            }

            @Override // com.reactnativecompressor.Video.VideoCompressor.CompressionListener
            public void onSuccess(int index, long size, String path) {
                String str = "file://" + destinationPath;
                promise.resolve(str);
                MediaCache.removeCompletedImagePath(str);
                iArr[0] = 0;
                Utils.INSTANCE.getCompressorExports().put(uuid, null);
            }

            @Override // com.reactnativecompressor.Video.VideoCompressor.CompressionListener
            public void onFailure(int index, String failureMessage) {
                Intrinsics.checkNotNullParameter(failureMessage, "failureMessage");
                Log.wtf("failureMessage", failureMessage);
                promise.reject(new Throwable(failureMessage));
                iArr[0] = 0;
            }

            @Override // com.reactnativecompressor.Video.VideoCompressor.CompressionListener
            public void onCancelled(int index) {
                Log.wtf("TAG", "compression has been cancelled");
                promise.reject(new Throwable("compression has been cancelled"));
                iArr[0] = 0;
            }
        });
    }

    public final void cancelCompressionHelper(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        try {
            VideoCompressorClass videoCompressorClass = compressorExports.get(uuid);
            if (videoCompressorClass != null) {
                videoCompressorClass.cancel();
            }
            compressorExports.put(uuid, null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.net.HttpURLConnection] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int getFileSizeFromURL(String urlString) {
        Throwable th;
        IOException e;
        try {
            try {
                URLConnection openConnection = new URL(urlString).openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                try {
                    httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.HEAD);
                    httpURLConnection.getInputStream();
                    int contentLength = httpURLConnection.getContentLength();
                    httpURLConnection.disconnect();
                    return contentLength;
                } catch (IOException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                }
            } catch (Throwable th2) {
                th = th2;
                if (urlString != 0) {
                    urlString.disconnect();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            urlString = 0;
            if (urlString != 0) {
            }
            throw th;
        }
    }

    @JvmStatic
    public static final String getRealPath(String fileUrl, ReactApplicationContext reactContext, Object... args) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNull(fileUrl);
        int i = 0;
        if (StringsKt.startsWith$default(fileUrl, "content://", false, 2, (Object) null)) {
            try {
                Uri parse = Uri.parse(fileUrl);
                RealPathUtil realPathUtil = RealPathUtil.INSTANCE;
                Intrinsics.checkNotNull(parse);
                fileUrl = realPathUtil.getRealPath(reactContext, parse);
            } catch (Exception unused) {
                Log.d(TAG, " Please see this issue: https://github.com/numandev1/react-native-compressor/issues/25");
            }
        } else if (StringsKt.startsWith$default(fileUrl, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(fileUrl, "https://", false, 2, (Object) null)) {
            String valueOf = args.length > 0 ? String.valueOf(args[0]) : "";
            if (args.length > 1) {
                Object obj = args[1];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                i = ((Integer) obj).intValue();
            }
            fileUrl = Downloader.INSTANCE.downloadMediaWithProgress(fileUrl, valueOf, i, reactContext);
            Log.d(TAG, "getRealPath: " + fileUrl);
        }
        return INSTANCE.slashifyFilePath(fileUrl);
    }

    public final void getFileSize(String filePath, Promise promise, ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (StringsKt.startsWith$default(filePath, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(filePath, "https://", false, 2, (Object) null)) {
            promise.resolve(Integer.valueOf(getFileSizeFromURL(filePath)));
            return;
        }
        Uri parse = Uri.parse(getRealPath(filePath, reactContext, new Object[0]));
        ContentResolver contentResolver = reactContext.getContentResolver();
        Intrinsics.checkNotNull(parse);
        Intrinsics.checkNotNull(contentResolver);
        long length = getLength(parse, contentResolver);
        if (length >= 0) {
            promise.resolve(String.valueOf(length));
        } else {
            promise.resolve("");
        }
    }

    public final String slashifyFilePath(String path) {
        if (path == null) {
            return null;
        }
        if (StringsKt.startsWith$default(path, "file:///", false, 2, (Object) null)) {
            return path;
        }
        if (StringsKt.startsWith$default(path, "/", false, 2, (Object) null)) {
            return new Regex("^/+").replaceFirst(path, "file:///");
        }
        return Pattern.compile("^file:/*").matcher(path).replaceAll("file:///");
    }

    public final void addLog(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        Log.d(AudioCompressor.INSTANCE.getTAG(), log);
    }

    public final String[] getExifAttributes() {
        return exifAttributes;
    }

    public final long getLength(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor assetFileDescriptor;
        Cursor query;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        try {
            assetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
        } catch (FileNotFoundException unused) {
            assetFileDescriptor = null;
        }
        long j = -1;
        long length = assetFileDescriptor != null ? assetFileDescriptor.getLength() : -1L;
        if (length != -1) {
            return length;
        }
        if (Intrinsics.areEqual("content", uri.getScheme()) && (query = contentResolver.query(uri, new String[]{"_size"}, null, null, null)) != null) {
            try {
                int columnIndex = query.getColumnIndex("_size");
                if (columnIndex != -1) {
                    if (query.moveToFirst()) {
                        try {
                            j = query.getLong(columnIndex);
                        } catch (Throwable unused2) {
                        }
                        return j;
                    }
                }
            } finally {
                query.close();
            }
        }
        return -1L;
    }

    public static /* synthetic */ ByteBuffer subBuffer$default(Utils utils, ByteBuffer byteBuffer, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = byteBuffer.remaining() - i;
        }
        return utils.subBuffer(byteBuffer, i, i2);
    }

    public final ByteBuffer subBuffer(ByteBuffer buf, int start, int count) {
        Intrinsics.checkNotNullParameter(buf, "buf");
        ByteBuffer duplicate = buf.duplicate();
        byte[] bArr = new byte[count];
        duplicate.position(start);
        duplicate.get(bArr, 0, count);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(...)");
        return wrap;
    }
}
