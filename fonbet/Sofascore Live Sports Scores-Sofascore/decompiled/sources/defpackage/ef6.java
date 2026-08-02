package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ef6 {
    public static final String[] G;
    public static final int[] H;
    public static final byte[] I;
    public static final bf6 J;
    public static final bf6[][] K;
    public static final bf6[] L;
    public static final HashMap[] M;
    public static final HashMap[] N;
    public static final Set O;
    public static final HashMap P;
    public static final Charset Q;
    public static final byte[] R;
    public static final byte[] S;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public af6 n;
    public static final boolean o = Log.isLoggable("ExifInterface", 3);
    public static final List p = Arrays.asList(1, 6, 3, 8);
    public static final List q = Arrays.asList(2, 7, 4, 5);
    public static final int[] r = {8, 8, 8};
    public static final int[] s = {8};
    public static final byte[] t = {-1, -40, -1};
    public static final byte[] u = {102, 116, 121, 112};
    public static final byte[] v = {109, 105, 102, 49};
    public static final byte[] w = {104, 101, 105, 99};
    public static final byte[] x = {97, 118, 105, 102};
    public static final byte[] y = {97, 118, 105, 115};
    public static final byte[] z = {79, 76, 89, 77, 80, 0};
    public static final byte[] A = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] B = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] C = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] D = {82, 73, 70, 70};
    public static final byte[] E = {87, 69, 66, 80};
    public static final byte[] F = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        G = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        H = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        I = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        bf6[] bf6VarArr = {new bf6("NewSubfileType", 254, 4), new bf6("SubfileType", 255, 4), new bf6("ImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new bf6("ImageLength", 257, 3, 4), new bf6("BitsPerSample", 258, 3), new bf6("Compression", 259, 3), new bf6("PhotometricInterpretation", 262, 3), new bf6("ImageDescription", 270, 2), new bf6("Make", 271, 2), new bf6("Model", 272, 2), new bf6("StripOffsets", 273, 3, 4), new bf6("Orientation", 274, 3), new bf6("SamplesPerPixel", 277, 3), new bf6("RowsPerStrip", 278, 3, 4), new bf6("StripByteCounts", 279, 3, 4), new bf6("XResolution", 282, 5), new bf6("YResolution", 283, 5), new bf6("PlanarConfiguration", 284, 3), new bf6("ResolutionUnit", 296, 3), new bf6("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new bf6("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new bf6("DateTime", 306, 2), new bf6("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new bf6("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new bf6("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new bf6("SubIFDPointer", 330, 4), new bf6("JPEGInterchangeFormat", 513, 4), new bf6("JPEGInterchangeFormatLength", 514, 4), new bf6("YCbCrCoefficients", 529, 5), new bf6("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new bf6("YCbCrPositioning", 531, 3), new bf6("ReferenceBlackWhite", 532, 5), new bf6("Copyright", 33432, 2), new bf6("ExifIFDPointer", 34665, 4), new bf6("GPSInfoIFDPointer", 34853, 4), new bf6("SensorTopBorder", 4, 4), new bf6("SensorLeftBorder", 5, 4), new bf6("SensorBottomBorder", 6, 4), new bf6("SensorRightBorder", 7, 4), new bf6("ISO", 23, 3), new bf6("JpgFromRaw", 46, 7), new bf6("Xmp", IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 1)};
        bf6[] bf6VarArr2 = {new bf6("ExposureTime", 33434, 5), new bf6("FNumber", 33437, 5), new bf6("ExposureProgram", 34850, 3), new bf6("SpectralSensitivity", 34852, 2), new bf6("PhotographicSensitivity", 34855, 3), new bf6("OECF", 34856, 7), new bf6("SensitivityType", 34864, 3), new bf6("StandardOutputSensitivity", 34865, 4), new bf6("RecommendedExposureIndex", 34866, 4), new bf6("ISOSpeed", 34867, 4), new bf6("ISOSpeedLatitudeyyy", 34868, 4), new bf6("ISOSpeedLatitudezzz", 34869, 4), new bf6("ExifVersion", 36864, 2), new bf6("DateTimeOriginal", 36867, 2), new bf6("DateTimeDigitized", 36868, 2), new bf6("OffsetTime", 36880, 2), new bf6("OffsetTimeOriginal", 36881, 2), new bf6("OffsetTimeDigitized", 36882, 2), new bf6("ComponentsConfiguration", 37121, 7), new bf6("CompressedBitsPerPixel", 37122, 5), new bf6("ShutterSpeedValue", 37377, 10), new bf6("ApertureValue", 37378, 5), new bf6("BrightnessValue", 37379, 10), new bf6("ExposureBiasValue", 37380, 10), new bf6("MaxApertureValue", 37381, 5), new bf6("SubjectDistance", 37382, 5), new bf6("MeteringMode", 37383, 3), new bf6("LightSource", 37384, 3), new bf6("Flash", 37385, 3), new bf6("FocalLength", 37386, 5), new bf6("SubjectArea", 37396, 3), new bf6("MakerNote", 37500, 7), new bf6("UserComment", 37510, 7), new bf6("SubSecTime", 37520, 2), new bf6("SubSecTimeOriginal", 37521, 2), new bf6("SubSecTimeDigitized", 37522, 2), new bf6("FlashpixVersion", 40960, 7), new bf6("ColorSpace", 40961, 3), new bf6("PixelXDimension", 40962, 3, 4), new bf6("PixelYDimension", 40963, 3, 4), new bf6("RelatedSoundFile", 40964, 2), new bf6("InteroperabilityIFDPointer", 40965, 4), new bf6("FlashEnergy", 41483, 5), new bf6("SpatialFrequencyResponse", 41484, 7), new bf6("FocalPlaneXResolution", 41486, 5), new bf6("FocalPlaneYResolution", 41487, 5), new bf6("FocalPlaneResolutionUnit", 41488, 3), new bf6("SubjectLocation", 41492, 3), new bf6("ExposureIndex", 41493, 5), new bf6("SensingMethod", 41495, 3), new bf6("FileSource", 41728, 7), new bf6("SceneType", 41729, 7), new bf6("CFAPattern", 41730, 7), new bf6("CustomRendered", 41985, 3), new bf6("ExposureMode", 41986, 3), new bf6("WhiteBalance", 41987, 3), new bf6("DigitalZoomRatio", 41988, 5), new bf6("FocalLengthIn35mmFilm", 41989, 3), new bf6("SceneCaptureType", 41990, 3), new bf6("GainControl", 41991, 3), new bf6("Contrast", 41992, 3), new bf6("Saturation", 41993, 3), new bf6("Sharpness", 41994, 3), new bf6("DeviceSettingDescription", 41995, 7), new bf6("SubjectDistanceRange", 41996, 3), new bf6("ImageUniqueID", 42016, 2), new bf6("CameraOwnerName", 42032, 2), new bf6("BodySerialNumber", 42033, 2), new bf6("LensSpecification", 42034, 5), new bf6("LensMake", 42035, 2), new bf6("LensModel", 42036, 2), new bf6("Gamma", 42240, 5), new bf6("DNGVersion", 50706, 1), new bf6("DefaultCropSize", 50720, 3, 4)};
        bf6[] bf6VarArr3 = {new bf6("GPSVersionID", 0, 1), new bf6("GPSLatitudeRef", 1, 2), new bf6("GPSLatitude", 2, 5, 10), new bf6("GPSLongitudeRef", 3, 2), new bf6("GPSLongitude", 4, 5, 10), new bf6("GPSAltitudeRef", 5, 1), new bf6("GPSAltitude", 6, 5), new bf6("GPSTimeStamp", 7, 5), new bf6("GPSSatellites", 8, 2), new bf6("GPSStatus", 9, 2), new bf6("GPSMeasureMode", 10, 2), new bf6("GPSDOP", 11, 5), new bf6("GPSSpeedRef", 12, 2), new bf6("GPSSpeed", 13, 5), new bf6("GPSTrackRef", 14, 2), new bf6("GPSTrack", 15, 5), new bf6("GPSImgDirectionRef", 16, 2), new bf6("GPSImgDirection", 17, 5), new bf6("GPSMapDatum", 18, 2), new bf6("GPSDestLatitudeRef", 19, 2), new bf6("GPSDestLatitude", 20, 5), new bf6("GPSDestLongitudeRef", 21, 2), new bf6("GPSDestLongitude", 22, 5), new bf6("GPSDestBearingRef", 23, 2), new bf6("GPSDestBearing", 24, 5), new bf6("GPSDestDistanceRef", 25, 2), new bf6("GPSDestDistance", 26, 5), new bf6("GPSProcessingMethod", 27, 7), new bf6("GPSAreaInformation", 28, 7), new bf6("GPSDateStamp", 29, 2), new bf6("GPSDifferential", 30, 3), new bf6("GPSHPositioningError", 31, 5)};
        bf6[] bf6VarArr4 = {new bf6("InteroperabilityIndex", 1, 2)};
        bf6[] bf6VarArr5 = {new bf6("NewSubfileType", 254, 4), new bf6("SubfileType", 255, 4), new bf6("ThumbnailImageWidth", NotificationCompat.FLAG_LOCAL_ONLY, 3, 4), new bf6("ThumbnailImageLength", 257, 3, 4), new bf6("BitsPerSample", 258, 3), new bf6("Compression", 259, 3), new bf6("PhotometricInterpretation", 262, 3), new bf6("ImageDescription", 270, 2), new bf6("Make", 271, 2), new bf6("Model", 272, 2), new bf6("StripOffsets", 273, 3, 4), new bf6("ThumbnailOrientation", 274, 3), new bf6("SamplesPerPixel", 277, 3), new bf6("RowsPerStrip", 278, 3, 4), new bf6("StripByteCounts", 279, 3, 4), new bf6("XResolution", 282, 5), new bf6("YResolution", 283, 5), new bf6("PlanarConfiguration", 284, 3), new bf6("ResolutionUnit", 296, 3), new bf6("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new bf6("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new bf6("DateTime", 306, 2), new bf6("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new bf6("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new bf6("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new bf6("SubIFDPointer", 330, 4), new bf6("JPEGInterchangeFormat", 513, 4), new bf6("JPEGInterchangeFormatLength", 514, 4), new bf6("YCbCrCoefficients", 529, 5), new bf6("YCbCrSubSampling", IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new bf6("YCbCrPositioning", 531, 3), new bf6("ReferenceBlackWhite", 532, 5), new bf6("Copyright", 33432, 2), new bf6("ExifIFDPointer", 34665, 4), new bf6("GPSInfoIFDPointer", 34853, 4), new bf6("DNGVersion", 50706, 1), new bf6("DefaultCropSize", 50720, 3, 4)};
        J = new bf6("StripOffsets", 273, 3);
        K = new bf6[][]{bf6VarArr, bf6VarArr2, bf6VarArr3, bf6VarArr4, bf6VarArr5, bf6VarArr, new bf6[]{new bf6("ThumbnailImage", NotificationCompat.FLAG_LOCAL_ONLY, 7), new bf6("CameraSettingsIFDPointer", 8224, 4), new bf6("ImageProcessingIFDPointer", 8256, 4)}, new bf6[]{new bf6("PreviewImageStart", 257, 4), new bf6("PreviewImageLength", 258, 4)}, new bf6[]{new bf6("AspectFrame", 4371, 3)}, new bf6[]{new bf6("ColorSpace", 55, 3)}};
        L = new bf6[]{new bf6("SubIFDPointer", 330, 4), new bf6("ExifIFDPointer", 34665, 4), new bf6("GPSInfoIFDPointer", 34853, 4), new bf6("InteroperabilityIFDPointer", 40965, 4), new bf6("CameraSettingsIFDPointer", 8224, 1), new bf6("ImageProcessingIFDPointer", 8256, 1)};
        M = new HashMap[10];
        N = new HashMap[10];
        O = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        P = new HashMap();
        Charset forName = Charset.forName(C.ASCII_NAME);
        Q = forName;
        R = "Exif\u0000\u0000".getBytes(forName);
        S = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            bf6[][] bf6VarArr6 = K;
            if (i >= bf6VarArr6.length) {
                HashMap hashMap = P;
                bf6[] bf6VarArr7 = L;
                hashMap.put(Integer.valueOf(bf6VarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(bf6VarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(bf6VarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(bf6VarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(bf6VarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(bf6VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            M[i] = new HashMap();
            N[i] = new HashMap();
            for (bf6 bf6Var : bf6VarArr6[i]) {
                M[i].put(Integer.valueOf(bf6Var.a), bf6Var);
                N[i].put(bf6Var.b, bf6Var);
            }
            i++;
        }
    }

    public ef6(String str) {
        FileInputStream fileInputStream;
        boolean z2;
        bf6[][] bf6VarArr = K;
        this.f = new HashMap[bf6VarArr.length];
        this.g = new HashSet(bf6VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream2 = null;
        if (str == null) {
            yhk.s("filename cannot be null");
            throw null;
        }
        this.c = null;
        this.a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z2 = true;
            } catch (Exception unused) {
                z2 = false;
            }
            if (z2) {
                this.b = fileInputStream.getFD();
            } else {
                this.b = null;
            }
            r(fileInputStream);
            try {
                fileInputStream.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public static ByteOrder u(ze6 ze6Var) {
        short readShort = ze6Var.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        is8.e(bf3.i(readShort, new StringBuilder("Invalid byte order: ")));
        return null;
    }

    public final void A(df6 df6Var, int i) {
        af6 c;
        af6 c2;
        HashMap[] hashMapArr = this.f;
        af6 af6Var = (af6) hashMapArr[i].get("DefaultCropSize");
        af6 af6Var2 = (af6) hashMapArr[i].get("SensorTopBorder");
        af6 af6Var3 = (af6) hashMapArr[i].get("SensorLeftBorder");
        af6 af6Var4 = (af6) hashMapArr[i].get("SensorBottomBorder");
        af6 af6Var5 = (af6) hashMapArr[i].get("SensorRightBorder");
        if (af6Var != null) {
            int i2 = af6Var.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                cf6[] cf6VarArr = (cf6[]) af6Var.g(byteOrder);
                if (cf6VarArr == null || cf6VarArr.length != 2) {
                    Arrays.toString(cf6VarArr);
                    return;
                } else {
                    c = af6.b(cf6VarArr[0], this.h);
                    c2 = af6.b(cf6VarArr[1], this.h);
                }
            } else {
                int[] iArr = (int[]) af6Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c = af6.c(iArr[0], this.h);
                    c2 = af6.c(iArr[1], this.h);
                }
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
            return;
        }
        if (af6Var2 != null && af6Var3 != null && af6Var4 != null && af6Var5 != null) {
            int e = af6Var2.e(this.h);
            int e2 = af6Var4.e(this.h);
            int e3 = af6Var5.e(this.h);
            int e4 = af6Var3.e(this.h);
            if (e2 <= e || e3 <= e4) {
                return;
            }
            af6 c3 = af6.c(e2 - e, this.h);
            af6 c4 = af6.c(e3 - e4, this.h);
            hashMapArr[i].put("ImageLength", c3);
            hashMapArr[i].put("ImageWidth", c4);
            return;
        }
        af6 af6Var6 = (af6) hashMapArr[i].get("ImageLength");
        af6 af6Var7 = (af6) hashMapArr[i].get("ImageWidth");
        if (af6Var6 == null || af6Var7 == null) {
            af6 af6Var8 = (af6) hashMapArr[i].get("JPEGInterchangeFormat");
            af6 af6Var9 = (af6) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (af6Var8 == null || af6Var9 == null) {
                return;
            }
            int e5 = af6Var8.e(this.h);
            int e6 = af6Var8.e(this.h);
            df6Var.f(e5);
            byte[] bArr = new byte[e6];
            df6Var.readFully(bArr);
            f(new ze6(bArr), e5, i);
        }
    }

    public final void B() {
        z(0, 5);
        z(0, 4);
        z(5, 4);
        HashMap[] hashMapArr = this.f;
        af6 af6Var = (af6) hashMapArr[1].get("PixelXDimension");
        af6 af6Var2 = (af6) hashMapArr[1].get("PixelYDimension");
        if (af6Var != null && af6Var2 != null) {
            hashMapArr[0].put("ImageWidth", af6Var);
            hashMapArr[0].put("ImageLength", af6Var2);
        }
        if (hashMapArr[4].isEmpty() && q(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        q(hashMapArr[4]);
        x(0, "ThumbnailOrientation", "Orientation");
        x(0, "ThumbnailImageLength", "ImageLength");
        x(0, "ThumbnailImageWidth", "ImageWidth");
        x(5, "ThumbnailOrientation", "Orientation");
        x(5, "ThumbnailImageLength", "ImageLength");
        x(5, "ThumbnailImageWidth", "ImageWidth");
        x(4, "Orientation", "ThumbnailOrientation");
        x(4, "ImageLength", "ThumbnailImageLength");
        x(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat("\u0000").getBytes(Q);
            hashMap.put("DateTime", new af6(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", af6.a(0L, this.h));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", af6.a(0L, this.h));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", af6.a(0L, this.h));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", af6.a(0L, this.h));
        }
    }

    public final String b(String str) {
        af6 d = d(str);
        if (d != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = d.a;
                if (i == 5 || i == 10) {
                    cf6[] cf6VarArr = (cf6[]) d.g(this.h);
                    if (cf6VarArr == null || cf6VarArr.length != 3) {
                        Arrays.toString(cf6VarArr);
                        return null;
                    }
                    cf6 cf6Var = cf6VarArr[0];
                    Integer valueOf = Integer.valueOf((int) (cf6Var.a / cf6Var.b));
                    cf6 cf6Var2 = cf6VarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (cf6Var2.a / cf6Var2.b));
                    cf6 cf6Var3 = cf6VarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (cf6Var3.a / cf6Var3.b)));
                }
            } else {
                boolean contains = O.contains(str);
                ByteOrder byteOrder = this.h;
                if (!contains) {
                    return d.f(byteOrder);
                }
                try {
                    return Double.toString(d.d(byteOrder));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public final int c() {
        af6 d = d("Orientation");
        if (d == null) {
            return 1;
        }
        try {
            return d.e(this.h);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final af6 d(String str) {
        af6 af6Var;
        int i;
        af6 af6Var2;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (af6Var2 = this.n) != null)) {
            return af6Var2;
        }
        for (int i2 = 0; i2 < K.length; i2++) {
            af6 af6Var3 = (af6) this.f[i2].get(str);
            if (af6Var3 != null) {
                return af6Var3;
            }
        }
        if (!"Xmp".equals(str) || (af6Var = this.n) == null) {
            return null;
        }
        return af6Var;
    }

    public final void e(df6 df6Var, int i) {
        String str;
        String str2;
        String str3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            a70.m("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i2 < 31) {
            a70.m("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new ye6(df6Var));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", af6.c(Integer.parseInt(str), this.h));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", af6.c(Integer.parseInt(str3), this.h));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", af6.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    df6Var.f(parseInt2);
                    byte[] bArr = new byte[6];
                    df6Var.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, R)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    df6Var.readFully(bArr2);
                    this.j = i3;
                    v(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    df6Var.f(j);
                    byte[] bArr3 = new byte[parseInt5];
                    df6Var.readFully(bArr3);
                    this.n = new af6(j, bArr3, 1, parseInt5);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0061. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0064. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0067. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118 A[LOOP:0: B:9:0x0024->B:35:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(ze6 ze6Var, int i, int i2) {
        boolean z2 = o;
        if (z2) {
            Objects.toString(ze6Var);
        }
        ze6Var.c = ByteOrder.BIG_ENDIAN;
        byte readByte = ze6Var.readByte();
        if (readByte != -1) {
            is8.e(bf3.i(readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, new StringBuilder("Invalid marker: ")));
            return;
        }
        if (ze6Var.readByte() != -40) {
            is8.e(bf3.i(readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, new StringBuilder("Invalid marker: ")));
            return;
        }
        int i3 = 2;
        while (true) {
            byte readByte2 = ze6Var.readByte();
            if (readByte2 != -1) {
                is8.e(bf3.i(readByte2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, new StringBuilder("Invalid marker:")));
                return;
            }
            while (true) {
                int i4 = i3 + 1;
                byte readByte3 = ze6Var.readByte();
                if (readByte3 != -1) {
                    if (z2) {
                        Integer.toHexString(readByte3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    }
                    if (readByte3 != -39 && readByte3 != -38) {
                        int readUnsignedShort = ze6Var.readUnsignedShort();
                        int i5 = readUnsignedShort - 2;
                        int i6 = i3 + 4;
                        if (z2) {
                            Integer.toHexString(readByte3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        }
                        if (i5 < 0) {
                            is8.e("Invalid length");
                            return;
                        }
                        if (readByte3 != -31) {
                            HashMap[] hashMapArr = this.f;
                            if (readByte3 != -2) {
                                switch (readByte3) {
                                    default:
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                        }
                                                    case -55:
                                                    case -54:
                                                    case -53:
                                                        ze6Var.e(1);
                                                        hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", af6.a(ze6Var.readUnsignedShort(), this.h));
                                                        hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", af6.a(ze6Var.readUnsignedShort(), this.h));
                                                        i5 = readUnsignedShort - 7;
                                                        break;
                                                }
                                            case -59:
                                            case -58:
                                            case -57:
                                                break;
                                        }
                                    case -64:
                                    case -63:
                                    case -62:
                                    case -61:
                                        break;
                                }
                                if (i5 >= 0) {
                                    is8.e("Invalid length");
                                    return;
                                } else {
                                    ze6Var.e(i5);
                                    i3 = i6 + i5;
                                }
                            } else {
                                byte[] bArr = new byte[i5];
                                ze6Var.readFully(bArr);
                                if (b("UserComment") == null) {
                                    HashMap hashMap = hashMapArr[1];
                                    Charset charset = Q;
                                    byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                                    hashMap.put("UserComment", new af6(2, bytes.length, bytes));
                                }
                            }
                        } else {
                            byte[] bArr2 = new byte[i5];
                            ze6Var.readFully(bArr2);
                            int i7 = i6 + i5;
                            byte[] bArr3 = R;
                            if (gz8.W(bArr2, bArr3)) {
                                byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i5);
                                this.j = i + i6 + bArr3.length;
                                v(i2, copyOfRange);
                                y(new ze6(copyOfRange));
                            } else {
                                byte[] bArr4 = S;
                                if (gz8.W(bArr2, bArr4)) {
                                    int length = i6 + bArr4.length;
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i5);
                                    this.n = new af6(length, copyOfRange2, 1, copyOfRange2.length);
                                }
                            }
                            i6 = i7;
                        }
                        i5 = 0;
                        if (i5 >= 0) {
                        }
                    }
                } else {
                    i3 = i4;
                }
            }
        }
        ze6Var.c = this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00ea, code lost:
    
        if (r5 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(BufferedInputStream bufferedInputStream) {
        int i;
        ze6 ze6Var;
        int i2;
        ze6 ze6Var2;
        int i3;
        int i4;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr3 = t;
            if (i5 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i5] != bArr3[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr2[i6] != bytes[i6]) {
                        ze6 ze6Var3 = null;
                        try {
                            ze6Var = new ze6(bArr2);
                            try {
                                try {
                                    readInt = ze6Var.readInt();
                                    bArr = new byte[4];
                                    ze6Var.readFully(bArr);
                                } catch (Exception unused) {
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                ze6Var3 = ze6Var;
                                if (ze6Var3 != null) {
                                    ze6Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                            ze6Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (Arrays.equals(bArr, u)) {
                            if (readInt == 1) {
                                readInt = ze6Var.readLong();
                                j = 16;
                                if (readInt < 16) {
                                }
                            } else {
                                j = 8;
                            }
                            if (readInt > 5000) {
                                readInt = 5000;
                            }
                            long j2 = readInt - j;
                            if (j2 >= 8) {
                                byte[] bArr4 = new byte[4];
                                boolean z2 = false;
                                boolean z3 = false;
                                boolean z4 = false;
                                for (long j3 = 0; j3 < j2 / 4; j3++) {
                                    try {
                                        ze6Var.readFully(bArr4);
                                        if (j3 != 1) {
                                            i = 0;
                                            try {
                                                if (Arrays.equals(bArr4, v)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, w)) {
                                                    z3 = true;
                                                } else if (Arrays.equals(bArr4, x) || Arrays.equals(bArr4, y)) {
                                                    z4 = true;
                                                }
                                                if (z2) {
                                                    if (z3) {
                                                        ze6Var.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                    if (z4) {
                                                        ze6Var.close();
                                                        i2 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } catch (Exception unused3) {
                                            }
                                        }
                                    } catch (EOFException unused4) {
                                        i = 0;
                                    }
                                }
                                i = 0;
                                ze6Var.close();
                                i2 = i;
                                if (i2 == 0) {
                                    return i2;
                                }
                                try {
                                    ze6Var2 = new ze6(bArr2);
                                } catch (Exception unused5) {
                                    ze6Var2 = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    ByteOrder u2 = u(ze6Var2);
                                    this.h = u2;
                                    ze6Var2.c = u2;
                                    short readShort = ze6Var2.readShort();
                                    i3 = (readShort == 20306 || readShort == 21330) ? 1 : i;
                                    ze6Var2.close();
                                } catch (Exception unused6) {
                                    if (ze6Var2 != null) {
                                        ze6Var2.close();
                                    }
                                    i3 = i;
                                    if (i3 == 0) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    ze6Var3 = ze6Var2;
                                    if (ze6Var3 != null) {
                                        ze6Var3.close();
                                    }
                                    throw th;
                                }
                                if (i3 == 0) {
                                    return 7;
                                }
                                try {
                                    ze6 ze6Var4 = new ze6(bArr2);
                                    try {
                                        ByteOrder u3 = u(ze6Var4);
                                        this.h = u3;
                                        ze6Var4.c = u3;
                                        i4 = ze6Var4.readShort() != 85 ? i : 1;
                                        ze6Var4.close();
                                    } catch (Exception unused7) {
                                        ze6Var3 = ze6Var4;
                                        if (ze6Var3 != null) {
                                            ze6Var3.close();
                                        }
                                        i4 = i;
                                        if (i4 == 0) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        ze6Var3 = ze6Var4;
                                        if (ze6Var3 != null) {
                                            ze6Var3.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused8) {
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                                if (i4 == 0) {
                                    return 10;
                                }
                                int i7 = i;
                                while (true) {
                                    byte[] bArr5 = B;
                                    if (i7 >= bArr5.length) {
                                        return 13;
                                    }
                                    if (bArr2[i7] != bArr5[i7]) {
                                        int i8 = i;
                                        while (true) {
                                            byte[] bArr6 = D;
                                            if (i8 >= bArr6.length) {
                                                int i9 = i;
                                                while (true) {
                                                    byte[] bArr7 = E;
                                                    if (i9 >= bArr7.length) {
                                                        return 14;
                                                    }
                                                    if (bArr2[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                        break;
                                                    }
                                                    i9++;
                                                }
                                            } else {
                                                if (bArr2[i8] != bArr6[i8]) {
                                                    break;
                                                }
                                                i8++;
                                            }
                                        }
                                        return i;
                                    }
                                    i7++;
                                }
                            }
                        }
                        ze6Var.close();
                        i = 0;
                        i2 = 0;
                        if (i2 == 0) {
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void h(df6 df6Var) {
        int i;
        int i2;
        k(df6Var);
        HashMap[] hashMapArr = this.f;
        af6 af6Var = (af6) hashMapArr[1].get("MakerNote");
        if (af6Var != null) {
            df6 df6Var2 = new df6(af6Var.d);
            df6Var2.c = this.h;
            byte[] bArr = z;
            byte[] bArr2 = new byte[bArr.length];
            df6Var2.readFully(bArr2);
            df6Var2.f(0L);
            byte[] bArr3 = A;
            byte[] bArr4 = new byte[bArr3.length];
            df6Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                df6Var2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                df6Var2.f(12L);
            }
            w(df6Var2, 6);
            af6 af6Var2 = (af6) hashMapArr[7].get("PreviewImageStart");
            af6 af6Var3 = (af6) hashMapArr[7].get("PreviewImageLength");
            if (af6Var2 != null && af6Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", af6Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", af6Var3);
            }
            af6 af6Var4 = (af6) hashMapArr[8].get("AspectFrame");
            if (af6Var4 != null) {
                int[] iArr = (int[]) af6Var4.g(this.h);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                af6 c = af6.c(i5, this.h);
                af6 c2 = af6.c(i6, this.h);
                hashMapArr[0].put("ImageWidth", c);
                hashMapArr[0].put("ImageLength", c2);
            }
        }
    }

    public final void i(ze6 ze6Var) {
        if (o) {
            Objects.toString(ze6Var);
        }
        ze6Var.c = ByteOrder.BIG_ENDIAN;
        int i = ze6Var.b;
        ze6Var.e(B.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int readInt = ze6Var.readInt();
                int readInt2 = ze6Var.readInt();
                int i2 = ze6Var.b;
                int i3 = i2 + readInt + 4;
                int i4 = i2 - i;
                if (i4 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z2) {
                    this.j = i4;
                    byte[] bArr = new byte[readInt];
                    ze6Var.readFully(bArr);
                    int readInt3 = ze6Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    v(0, bArr);
                    B();
                    y(new ze6(bArr));
                    z2 = true;
                } else if (readInt2 == 1767135348 && !z3) {
                    byte[] bArr2 = C;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        ze6Var.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i5 = ze6Var.b - i;
                            int i6 = readInt - length;
                            byte[] bArr4 = new byte[i6];
                            ze6Var.readFully(bArr4);
                            this.n = new af6(i5, bArr4, 1, i6);
                            z3 = true;
                        }
                    }
                }
                ze6Var.e(i3 - ze6Var.b);
            } catch (EOFException e) {
                cp4.i("Encountered corrupt PNG file.", e);
                return;
            }
        }
    }

    public final void j(ze6 ze6Var) {
        if (o) {
            Objects.toString(ze6Var);
        }
        ze6Var.e(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        ze6Var.readFully(bArr);
        ze6Var.readFully(bArr2);
        ze6Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        ze6Var.e(i - ze6Var.b);
        ze6Var.readFully(bArr4);
        f(new ze6(bArr4), i, 5);
        ze6Var.e(i3 - ze6Var.b);
        ze6Var.c = ByteOrder.BIG_ENDIAN;
        int readInt = ze6Var.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = ze6Var.readUnsignedShort();
            int readUnsignedShort2 = ze6Var.readUnsignedShort();
            if (readUnsignedShort == J.a) {
                short readShort = ze6Var.readShort();
                short readShort2 = ze6Var.readShort();
                af6 c = af6.c(readShort, this.h);
                af6 c2 = af6.c(readShort2, this.h);
                HashMap[] hashMapArr = this.f;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                return;
            }
            ze6Var.e(readUnsignedShort2);
        }
    }

    public final void k(df6 df6Var) {
        s(df6Var);
        w(df6Var, 0);
        A(df6Var, 0);
        A(df6Var, 5);
        A(df6Var, 4);
        B();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.f;
            af6 af6Var = (af6) hashMapArr[1].get("MakerNote");
            if (af6Var != null) {
                df6 df6Var2 = new df6(af6Var.d);
                df6Var2.c = this.h;
                df6Var2.e(6);
                w(df6Var2, 9);
                af6 af6Var2 = (af6) hashMapArr[9].get("ColorSpace");
                if (af6Var2 != null) {
                    hashMapArr[1].put("ColorSpace", af6Var2);
                }
            }
        }
    }

    public final int l() {
        switch (c()) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void m(df6 df6Var) {
        if (o) {
            Objects.toString(df6Var);
        }
        k(df6Var);
        HashMap[] hashMapArr = this.f;
        af6 af6Var = (af6) hashMapArr[0].get("JpgFromRaw");
        if (af6Var != null) {
            f(new ze6(af6Var.d), (int) af6Var.c, 5);
        }
        af6 af6Var2 = (af6) hashMapArr[0].get("ISO");
        af6 af6Var3 = (af6) hashMapArr[1].get("PhotographicSensitivity");
        if (af6Var2 == null || af6Var3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", af6Var2);
    }

    public final boolean n(df6 df6Var) {
        byte[] bArr = R;
        byte[] bArr2 = new byte[bArr.length];
        df6Var.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = df6Var.a.read(bArr3, i, bArr3.length - i);
            if (read == -1) {
                byte[] copyOf = Arrays.copyOf(bArr3, i);
                this.j = bArr.length;
                v(0, copyOf);
                return true;
            }
            i += read;
            df6Var.b += read;
        }
    }

    public final void o(ze6 ze6Var) {
        if (o) {
            Objects.toString(ze6Var);
        }
        ze6Var.c = ByteOrder.LITTLE_ENDIAN;
        ze6Var.e(D.length);
        int readInt = ze6Var.readInt() + 8;
        byte[] bArr = E;
        ze6Var.e(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                ze6Var.readFully(bArr2);
                int readInt2 = ze6Var.readInt();
                int i = length + 8;
                if (Arrays.equals(F, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    ze6Var.readFully(bArr3);
                    byte[] bArr4 = R;
                    if (gz8.W(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.j = i;
                    v(0, bArr3);
                    y(new ze6(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                ze6Var.e(readInt2);
            } catch (EOFException e) {
                cp4.i("Encountered corrupt WebP file.", e);
                return;
            }
        }
    }

    public final void p(ze6 ze6Var, HashMap hashMap) {
        af6 af6Var = (af6) hashMap.get("JPEGInterchangeFormat");
        af6 af6Var2 = (af6) hashMap.get("JPEGInterchangeFormatLength");
        if (af6Var == null || af6Var2 == null) {
            return;
        }
        int e = af6Var.e(this.h);
        int e2 = af6Var2.e(this.h);
        if (this.d == 7) {
            e += this.k;
        }
        if (e > 0 && e2 > 0 && this.a == null && this.c == null && this.b == null) {
            ze6Var.e(e);
            ze6Var.readFully(new byte[e2]);
        }
    }

    public final boolean q(HashMap hashMap) {
        af6 af6Var = (af6) hashMap.get("ImageLength");
        af6 af6Var2 = (af6) hashMap.get("ImageWidth");
        if (af6Var == null || af6Var2 == null) {
            return false;
        }
        return af6Var.e(this.h) <= 512 && af6Var2.e(this.h) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(InputStream inputStream) {
        boolean z2 = o;
        for (int i = 0; i < K.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused) {
                    a();
                    if (z2) {
                        t();
                        return;
                    }
                    return;
                }
            } finally {
                a();
                if (z2) {
                    t();
                }
            }
        }
        boolean z3 = this.e;
        if (!z3) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.d;
        if (i2 != 4 && i2 != 9 && i2 != 13 && i2 != 14) {
            df6 df6Var = new df6(inputStream);
            if (!z3) {
                int i3 = this.d;
                if (i3 != 12 && i3 != 15) {
                    if (i3 == 7) {
                        h(df6Var);
                    } else if (i3 == 10) {
                        m(df6Var);
                    } else {
                        k(df6Var);
                    }
                }
                e(df6Var, i3);
            } else if (!n(df6Var)) {
                if (z2) {
                    return;
                } else {
                    return;
                }
            }
            df6Var.f(this.j);
            y(df6Var);
            a();
            if (z2) {
                return;
            }
            t();
            return;
        }
        ze6 ze6Var = new ze6(inputStream);
        int i4 = this.d;
        if (i4 == 4) {
            f(ze6Var, 0, 0);
        } else if (i4 == 13) {
            i(ze6Var);
        } else if (i4 == 9) {
            j(ze6Var);
        } else if (i4 == 14) {
            o(ze6Var);
        }
        a();
        if (z2) {
        }
    }

    public final void s(df6 df6Var) {
        ByteOrder u2 = u(df6Var);
        this.h = u2;
        df6Var.c = u2;
        int readUnsignedShort = df6Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            is8.e(bf3.i(readUnsignedShort, new StringBuilder("Invalid start code: ")));
            return;
        }
        int readInt = df6Var.readInt();
        if (readInt < 8) {
            is8.e(ljg.j(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            df6Var.e(i2);
        }
    }

    public final void t() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f;
            if (i >= hashMapArr.length) {
                return;
            }
            hashMapArr[i].size();
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                af6 af6Var = (af6) entry.getValue();
                af6Var.toString();
                af6Var.f(this.h);
            }
            i++;
        }
    }

    public final void v(int i, byte[] bArr) {
        df6 df6Var = new df6(bArr);
        s(df6Var);
        w(df6Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(df6 df6Var, int i) {
        boolean z2;
        HashMap[] hashMapArr;
        short s2;
        boolean z3;
        long j;
        HashMap[] hashMapArr2;
        bf6 bf6Var;
        long j2;
        boolean z4;
        int i2;
        HashMap[] hashMapArr3;
        int i3;
        bf6 bf6Var2;
        int i4;
        int readUnsignedShort;
        long j3;
        int i5;
        int i6 = i;
        Integer valueOf = Integer.valueOf(df6Var.b);
        HashSet hashSet = this.g;
        hashSet.add(valueOf);
        short readShort = df6Var.readShort();
        if (readShort <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            z2 = o;
            hashMapArr = this.f;
            if (s3 >= readShort) {
                break;
            }
            int readUnsignedShort2 = df6Var.readUnsignedShort();
            int readUnsignedShort3 = df6Var.readUnsignedShort();
            int readInt = df6Var.readInt();
            short s4 = s3;
            long j4 = df6Var.b + 4;
            bf6 bf6Var3 = (bf6) M[i6].get(Integer.valueOf(readUnsignedShort2));
            if (z2) {
                j = 4;
                s2 = readShort;
                z3 = z2;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i6), Integer.valueOf(readUnsignedShort2), bf6Var3 != null ? bf6Var3.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt));
            } else {
                s2 = readShort;
                z3 = z2;
                j = 4;
            }
            if (bf6Var3 != null && readUnsignedShort3 > 0) {
                if (readUnsignedShort3 < H.length) {
                    int i7 = bf6Var3.c;
                    if (i7 == 7 || readUnsignedShort3 == 7 || i7 == readUnsignedShort3 || (i2 = bf6Var3.d) == readUnsignedShort3 || (((i7 == 4 || i2 == 4) && readUnsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && readUnsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && readUnsignedShort3 == 11)))) {
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = i7;
                        }
                        hashMapArr2 = hashMapArr;
                        bf6Var = bf6Var3;
                        j2 = readInt * r15[readUnsignedShort3];
                        if (j2 >= 0 && j2 <= 2147483647L) {
                            z4 = true;
                            if (z4) {
                                if (j2 > j) {
                                    int readInt2 = df6Var.readInt();
                                    if (this.d == 7) {
                                        hashMapArr3 = hashMapArr2;
                                        bf6Var2 = bf6Var;
                                        if ("MakerNote".equals(bf6Var2.b)) {
                                            this.k = readInt2;
                                        } else if (i6 == 6 && "ThumbnailImage".equals(bf6Var2.b)) {
                                            this.l = readInt2;
                                            this.m = readInt;
                                            af6 c = af6.c(6, this.h);
                                            i3 = readUnsignedShort2;
                                            af6 a = af6.a(this.l, this.h);
                                            i4 = readInt;
                                            af6 a2 = af6.a(this.m, this.h);
                                            hashMapArr3[4].put("Compression", c);
                                            hashMapArr3[4].put("JPEGInterchangeFormat", a);
                                            hashMapArr3[4].put("JPEGInterchangeFormatLength", a2);
                                            df6Var.f(readInt2);
                                        }
                                        i3 = readUnsignedShort2;
                                    } else {
                                        hashMapArr3 = hashMapArr2;
                                        i3 = readUnsignedShort2;
                                        bf6Var2 = bf6Var;
                                    }
                                    i4 = readInt;
                                    df6Var.f(readInt2);
                                } else {
                                    hashMapArr3 = hashMapArr2;
                                    i3 = readUnsignedShort2;
                                    bf6Var2 = bf6Var;
                                    i4 = readInt;
                                }
                                Integer num = (Integer) P.get(Integer.valueOf(i3));
                                if (num != null) {
                                    if (readUnsignedShort3 != 3) {
                                        if (readUnsignedShort3 == 4) {
                                            j3 = df6Var.readInt() & 4294967295L;
                                        } else if (readUnsignedShort3 == 8) {
                                            readUnsignedShort = df6Var.readShort();
                                        } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                            readUnsignedShort = df6Var.readInt();
                                        } else {
                                            j3 = -1;
                                        }
                                        if (z3) {
                                            String.format("Offset: %d, tagName: %s", Long.valueOf(j3), bf6Var2.b);
                                        }
                                        if (j3 > 0 && (((i5 = df6Var.e) == -1 || j3 < i5) && !hashSet.contains(Integer.valueOf((int) j3)))) {
                                            df6Var.f(j3);
                                            w(df6Var, num.intValue());
                                        }
                                        df6Var.f(j4);
                                    } else {
                                        readUnsignedShort = df6Var.readUnsignedShort();
                                    }
                                    j3 = readUnsignedShort;
                                    if (z3) {
                                    }
                                    if (j3 > 0) {
                                        df6Var.f(j3);
                                        w(df6Var, num.intValue());
                                    }
                                    df6Var.f(j4);
                                } else {
                                    int i8 = df6Var.b + this.j;
                                    byte[] bArr = new byte[(int) j2];
                                    df6Var.readFully(bArr);
                                    af6 af6Var = new af6(i8, bArr, readUnsignedShort3, i4);
                                    HashMap hashMap = hashMapArr3[i];
                                    String str = bf6Var2.b;
                                    hashMap.put(str, af6Var);
                                    if ("DNGVersion".equals(str)) {
                                        this.d = 3;
                                    }
                                    if ((("Make".equals(str) || "Model".equals(str)) && af6Var.f(this.h).contains("PENTAX")) || ("Compression".equals(str) && af6Var.e(this.h) == 65535)) {
                                        this.d = 8;
                                    }
                                    if (df6Var.b != j4) {
                                        df6Var.f(j4);
                                    }
                                }
                            } else {
                                df6Var.f(j4);
                            }
                            s3 = (short) (s4 + 1);
                            i6 = i;
                            readShort = s2;
                        }
                        z4 = false;
                        if (z4) {
                        }
                        s3 = (short) (s4 + 1);
                        i6 = i;
                        readShort = s2;
                    } else if (z3) {
                        String str2 = G[readUnsignedShort3];
                    }
                }
            }
            bf6Var = bf6Var3;
            hashMapArr2 = hashMapArr;
            j2 = 0;
            z4 = false;
            if (z4) {
            }
            s3 = (short) (s4 + 1);
            i6 = i;
            readShort = s2;
        }
        int readInt3 = df6Var.readInt();
        if (z2) {
            String.format("nextIfdOffset: %d", Integer.valueOf(readInt3));
        }
        long j5 = readInt3;
        if (j5 <= 0 || hashSet.contains(Integer.valueOf(readInt3))) {
            return;
        }
        df6Var.f(j5);
        if (hashMapArr[4].isEmpty()) {
            w(df6Var, 4);
        } else if (hashMapArr[5].isEmpty()) {
            w(df6Var, 5);
        }
    }

    public final void x(int i, String str, String str2) {
        HashMap[] hashMapArr = this.f;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (af6) hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void y(ze6 ze6Var) {
        af6 af6Var;
        HashMap hashMap = this.f[4];
        af6 af6Var2 = (af6) hashMap.get("Compression");
        if (af6Var2 == null) {
            p(ze6Var, hashMap);
            return;
        }
        int e = af6Var2.e(this.h);
        if (e != 1) {
            if (e == 6) {
                p(ze6Var, hashMap);
                return;
            } else if (e != 7) {
                return;
            }
        }
        af6 af6Var3 = (af6) hashMap.get("BitsPerSample");
        if (af6Var3 != null) {
            int[] iArr = (int[]) af6Var3.g(this.h);
            int[] iArr2 = r;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.d != 3 || (af6Var = (af6) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int e2 = af6Var.e(this.h);
                if ((e2 != 1 || !Arrays.equals(iArr, s)) && (e2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            af6 af6Var4 = (af6) hashMap.get("StripOffsets");
            af6 af6Var5 = (af6) hashMap.get("StripByteCounts");
            if (af6Var4 == null || af6Var5 == null) {
                return;
            }
            long[] D2 = gz8.D(af6Var4.g(this.h));
            long[] D3 = gz8.D(af6Var5.g(this.h));
            if (D2 == null || D2.length == 0 || D3 == null || D3.length == 0 || D2.length != D3.length) {
                return;
            }
            long j = 0;
            for (long j2 : D3) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            this.i = true;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < D2.length; i3++) {
                int i4 = (int) D2[i3];
                int i5 = (int) D3[i3];
                if (i3 < D2.length - 1 && i4 + i5 != D2[i3 + 1]) {
                    this.i = false;
                }
                int i6 = i4 - i;
                if (i6 < 0) {
                    return;
                }
                try {
                    ze6Var.e(i6);
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    ze6Var.readFully(bArr2);
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                } catch (EOFException unused) {
                    return;
                }
            }
            if (this.i) {
                long j3 = D2[0];
            }
        }
    }

    public final void z(int i, int i2) {
        HashMap[] hashMapArr = this.f;
        if (hashMapArr[i].isEmpty() || hashMapArr[i2].isEmpty()) {
            return;
        }
        af6 af6Var = (af6) hashMapArr[i].get("ImageLength");
        af6 af6Var2 = (af6) hashMapArr[i].get("ImageWidth");
        af6 af6Var3 = (af6) hashMapArr[i2].get("ImageLength");
        af6 af6Var4 = (af6) hashMapArr[i2].get("ImageWidth");
        if (af6Var == null || af6Var2 == null || af6Var3 == null || af6Var4 == null) {
            return;
        }
        int e = af6Var.e(this.h);
        int e2 = af6Var2.e(this.h);
        int e3 = af6Var3.e(this.h);
        int e4 = af6Var4.e(this.h);
        if (e >= e3 || e2 >= e4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public ef6(InputStream inputStream) {
        bf6[][] bf6VarArr = K;
        this.f = new HashMap[bf6VarArr.length];
        this.g = new HashSet(bf6VarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        this.a = null;
        this.e = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.c = null;
                    this.b = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.c = null;
            this.b = null;
        }
        r(inputStream);
    }
}
