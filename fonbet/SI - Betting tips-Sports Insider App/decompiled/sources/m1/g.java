package m1;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.c1;
import d4.n;
import io.sentry.android.core.w0;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final d E;
    public static final d[][] F;
    public static final d[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;
    public static final Set J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f20154l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f20155m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f20156n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f20157o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f20158p;
    public static final byte[] q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f20159r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f20160s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f20161t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f20162u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f20163v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f20164w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f20165x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f20166y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f20167z;

    /* renamed from: a, reason: collision with root package name */
    public final FileDescriptor f20168a;

    /* renamed from: b, reason: collision with root package name */
    public int f20169b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap[] f20170c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f20171d;

    /* renamed from: e, reason: collision with root package name */
    public ByteOrder f20172e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20173f;

    /* renamed from: g, reason: collision with root package name */
    public int f20174g;

    /* renamed from: h, reason: collision with root package name */
    public int f20175h;

    /* renamed from: i, reason: collision with root package name */
    public int f20176i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public c f20177k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f20155m = new int[]{8, 8, 8};
        f20156n = new int[]{8};
        f20157o = new byte[]{-1, -40, -1};
        f20158p = new byte[]{102, 116, 121, 112};
        q = new byte[]{109, 105, 102, 49};
        f20159r = new byte[]{104, 101, 105, 99};
        f20160s = new byte[]{97, 118, 105, 102};
        f20161t = new byte[]{97, 118, 105, 115};
        f20162u = new byte[]{79, 76, 89, 77, 80, 0};
        f20163v = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f20164w = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f20165x = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        f20166y = new byte[]{82, 73, 70, 70};
        f20167z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        E = new d("StripOffsets", 273, 3);
        F = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        G = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        K = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        L = forName;
        M = "Exif\u0000\u0000".getBytes(forName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i5 = 0;
        while (true) {
            d[][] dVarArr6 = F;
            if (i5 >= dVarArr6.length) {
                HashMap hashMap = K;
                d[] dVarArr7 = G;
                hashMap.put(Integer.valueOf(dVarArr7[0].f20148a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].f20148a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].f20148a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].f20148a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].f20148a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].f20148a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            H[i5] = new HashMap();
            I[i5] = new HashMap();
            for (d dVar : dVarArr6[i5]) {
                H[i5].put(Integer.valueOf(dVar.f20148a), dVar);
                I[i5].put(dVar.f20149b, dVar);
            }
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:7:0x0037, B:13:0x0054, B:20:0x0067, B:21:0x007a, B:30:0x006f, B:31:0x0073, B:32:0x0077, B:33:0x0084, B:35:0x008d, B:37:0x0093, B:39:0x0099, B:41:0x009f, B:51:0x00ad), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(n nVar) {
        d[][] dVarArr = F;
        this.f20170c = new HashMap[dVarArr.length];
        this.f20171d = new HashSet(dVarArr.length);
        this.f20172e = ByteOrder.BIG_ENDIAN;
        boolean z5 = f20154l;
        this.f20168a = null;
        for (int i5 = 0; i5 < dVarArr.length; i5++) {
            try {
                try {
                    this.f20170c[i5] = new HashMap();
                } catch (Throwable th2) {
                    a();
                    if (z5) {
                        p();
                    }
                    throw th2;
                }
            } catch (IOException e7) {
                e = e7;
                if (z5) {
                    w0.n("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z5) {
                    return;
                }
                p();
            } catch (UnsupportedOperationException e9) {
                e = e9;
                if (z5) {
                }
                a();
                if (!z5) {
                }
                p();
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(nVar, 5000);
        int f6 = f(bufferedInputStream);
        this.f20169b = f6;
        if (f6 != 4 && f6 != 9 && f6 != 13 && f6 != 14) {
            f fVar = new f(bufferedInputStream);
            int i10 = this.f20169b;
            if (i10 != 12 && i10 != 15) {
                if (i10 == 7) {
                    g(fVar);
                } else if (i10 == 10) {
                    k(fVar);
                } else {
                    j(fVar);
                }
                fVar.k(this.f20174g);
                u(fVar);
                a();
                if (!z5) {
                    return;
                }
                p();
            }
            d(fVar, i10);
            fVar.k(this.f20174g);
            u(fVar);
            a();
            if (!z5) {
            }
            p();
        }
        b bVar = new b(bufferedInputStream);
        int i11 = this.f20169b;
        if (i11 == 4) {
            e(bVar, 0, 0);
        } else if (i11 == 13) {
            h(bVar);
        } else if (i11 == 9) {
            i(bVar);
        } else if (i11 == 14) {
            l(bVar);
        }
        a();
        if (!z5) {
        }
        p();
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z5 = f20154l;
        if (readShort == 18761) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z5) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f20170c;
        if (b10 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b10.concat("\u0000").getBytes(L);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f20172e));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f20172e));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f20172e));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f20172e));
        }
    }

    public final String b(String str) {
        c c2 = c(str);
        if (c2 != null) {
            int i5 = c2.f20144a;
            if (str.equals("GPSTimeStamp")) {
                if (i5 != 5 && i5 != 10) {
                    w0.m("ExifInterface", "GPS Timestamp format is not rational. format=" + i5);
                    return null;
                }
                e[] eVarArr = (e[]) c2.g(this.f20172e);
                if (eVarArr == null || eVarArr.length != 3) {
                    w0.m("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (eVar.f20152a / eVar.f20153b));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (eVar2.f20152a / eVar2.f20153b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (eVar3.f20152a / eVar3.f20153b)));
            }
            if (!J.contains(str)) {
                return c2.f(this.f20172e);
            }
            try {
                return Double.toString(c2.d(this.f20172e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        c cVar;
        int i5;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (f20154l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i5 = this.f20169b) != 4 && ((i5 == 9 || i5 == 15 || i5 == 12 || i5 == 13) && (cVar2 = this.f20177k) != null)) {
            return cVar2;
        }
        for (int i10 = 0; i10 < F.length; i10++) {
            c cVar3 = (c) this.f20170c[i10].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.f20177k) == null) {
            return null;
        }
        return cVar;
    }

    public final void d(f fVar, int i5) {
        String str;
        String str2;
        String str3;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i5 == 15 && i10 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(fVar));
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
                HashMap[] hashMapArr = this.f20170c;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f20172e));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str3), this.f20172e));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f20172e));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.k(parseInt2);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i11 = parseInt2 + 6;
                    int i12 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i12];
                    fVar.readFully(bArr2);
                    this.f20174g = i11;
                    r(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    fVar.k(j);
                    byte[] bArr3 = new byte[parseInt5];
                    fVar.readFully(bArr3);
                    this.f20177k = new c(j, bArr3, 1, parseInt5);
                }
                if (f20154l) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str3 + ", rotation " + str2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e7) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e7);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        r23.f20141c = r22.f20172e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f A[LOOP:0: B:9:0x0034->B:35:0x015f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(b bVar, int i5, int i10) {
        boolean z5 = f20154l;
        if (z5) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.f20141c = ByteOrder.BIG_ENDIAN;
        byte readByte = bVar.readByte();
        byte b10 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i11 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b10) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            while (true) {
                int i12 = i11 + 1;
                byte readByte3 = bVar.readByte();
                if (readByte3 != b10) {
                    if (z5) {
                        Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
                    }
                    if (readByte3 != -39 && readByte3 != -38) {
                        int readUnsignedShort = bVar.readUnsignedShort();
                        int i13 = readUnsignedShort - 2;
                        int i14 = i11 + 4;
                        if (z5) {
                            Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                        }
                        if (i13 < 0) {
                            throw new IOException("Invalid length");
                        }
                        if (readByte3 != -31) {
                            HashMap[] hashMapArr = this.f20170c;
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
                                                        bVar.c(1);
                                                        hashMapArr[i10].put(i10 != 4 ? "ImageLength" : "ThumbnailImageLength", c.a(bVar.readUnsignedShort(), this.f20172e));
                                                        hashMapArr[i10].put(i10 != 4 ? "ImageWidth" : "ThumbnailImageWidth", c.a(bVar.readUnsignedShort(), this.f20172e));
                                                        i13 = readUnsignedShort - 7;
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
                                if (i13 >= 0) {
                                    throw new IOException("Invalid length");
                                }
                                bVar.c(i13);
                                i11 = i14 + i13;
                                b10 = -1;
                            } else {
                                byte[] bArr = new byte[i13];
                                bVar.readFully(bArr);
                                if (b("UserComment") == null) {
                                    HashMap hashMap = hashMapArr[1];
                                    Charset charset = L;
                                    byte[] bytes = new String(bArr, charset).concat("\u0000").getBytes(charset);
                                    hashMap.put("UserComment", new c(bytes, 2, bytes.length));
                                }
                            }
                        } else {
                            byte[] bArr2 = new byte[i13];
                            bVar.readFully(bArr2);
                            int i15 = i14 + i13;
                            byte[] bArr3 = M;
                            if (h8.b.A(bArr2, bArr3)) {
                                byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, i13);
                                this.f20174g = i5 + i14 + bArr3.length;
                                r(i10, copyOfRange);
                                u(new b(copyOfRange));
                            } else {
                                byte[] bArr4 = N;
                                if (h8.b.A(bArr2, bArr4)) {
                                    int length = i14 + bArr4.length;
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, i13);
                                    this.f20177k = new c(length, copyOfRange2, 1, copyOfRange2.length);
                                }
                            }
                            i14 = i15;
                        }
                        i13 = 0;
                        if (i13 >= 0) {
                        }
                    }
                } else {
                    i11 = i12;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0062, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00ec, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) {
        b bVar;
        int i5;
        b bVar2;
        int i10;
        b bVar3;
        b bVar4;
        int i11;
        b bVar5;
        b bVar6;
        int i12;
        int i13;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i14 = 0;
        while (true) {
            byte[] bArr3 = f20157o;
            if (i14 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i14] != bArr3[i14]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i15 = 0; i15 < bytes.length; i15++) {
                    if (bArr2[i15] != bytes[i15]) {
                        int i16 = 1;
                        try {
                            bVar2 = new b(bArr2);
                            try {
                                try {
                                    readInt = bVar2.readInt();
                                    bArr = new byte[4];
                                    bVar2.readFully(bArr);
                                } catch (Exception e7) {
                                    e = e7;
                                    i5 = 0;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            i5 = 0;
                            bVar2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bVar = null;
                        }
                        if (Arrays.equals(bArr, f20158p)) {
                            if (readInt == 1) {
                                readInt = bVar2.readLong();
                                j = 16;
                            } else {
                                j = 8;
                            }
                            i5 = 0;
                            long j6 = 5000;
                            if (readInt > j6) {
                                readInt = j6;
                            }
                            long j10 = readInt - j;
                            if (j10 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z5 = false;
                                    boolean z7 = false;
                                    boolean z10 = false;
                                    for (long j11 = 0; j11 < j10 / 4; j11++) {
                                        try {
                                            bVar2.readFully(bArr4);
                                            if (j11 != 1) {
                                                if (Arrays.equals(bArr4, q)) {
                                                    z5 = true;
                                                } else if (Arrays.equals(bArr4, f20159r)) {
                                                    z7 = true;
                                                } else if (Arrays.equals(bArr4, f20160s) || Arrays.equals(bArr4, f20161t)) {
                                                    z10 = true;
                                                }
                                                if (z5) {
                                                    if (z7) {
                                                        bVar2.close();
                                                        i10 = 12;
                                                        break;
                                                    }
                                                    if (z10) {
                                                        bVar2.close();
                                                        i10 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    if (f20154l) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            bVar2.close();
                            i10 = i5;
                            if (i10 == 0) {
                                return i10;
                            }
                            try {
                                bVar4 = new b(bArr2);
                                try {
                                    ByteOrder q3 = q(bVar4);
                                    this.f20172e = q3;
                                    bVar4.f20141c = q3;
                                    short readShort = bVar4.readShort();
                                    i11 = (readShort == 20306 || readShort == 21330) ? 1 : i5;
                                    bVar4.close();
                                } catch (Exception unused2) {
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    i11 = i5;
                                    if (i11 == 0) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar3 = bVar4;
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused3) {
                                bVar4 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar3 = null;
                            }
                            if (i11 == 0) {
                                return 7;
                            }
                            try {
                                b bVar7 = new b(bArr2);
                                try {
                                    ByteOrder q10 = q(bVar7);
                                    this.f20172e = q10;
                                    bVar7.f20141c = q10;
                                    i12 = bVar7.readShort() == 85 ? 1 : i5;
                                    bVar7.close();
                                } catch (Exception unused4) {
                                    bVar6 = bVar7;
                                    if (bVar6 != null) {
                                        bVar6.close();
                                    }
                                    i12 = i5;
                                    if (i12 == 0) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    bVar5 = bVar7;
                                    if (bVar5 != null) {
                                        bVar5.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused5) {
                                bVar6 = null;
                            } catch (Throwable th7) {
                                th = th7;
                                bVar5 = null;
                            }
                            if (i12 == 0) {
                                return 10;
                            }
                            int i17 = i5;
                            while (true) {
                                byte[] bArr5 = f20164w;
                                if (i17 >= bArr5.length) {
                                    i13 = 1;
                                    break;
                                }
                                if (bArr2[i17] != bArr5[i17]) {
                                    i13 = i5;
                                    break;
                                }
                                i17++;
                            }
                            if (i13 != 0) {
                                return 13;
                            }
                            int i18 = i5;
                            while (true) {
                                byte[] bArr6 = f20166y;
                                if (i18 >= bArr6.length) {
                                    int i19 = i5;
                                    while (true) {
                                        byte[] bArr7 = f20167z;
                                        if (i19 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i19 + 4] != bArr7[i19]) {
                                            break;
                                        }
                                        i19++;
                                    }
                                } else {
                                    if (bArr2[i18] != bArr6[i18]) {
                                        break;
                                    }
                                    i18++;
                                }
                            }
                            i16 = i5;
                            if (i16 != 0) {
                                return 14;
                            }
                            return i5;
                        }
                        bVar2.close();
                        i5 = 0;
                        i10 = 0;
                        if (i10 == 0) {
                        }
                    }
                }
                return 9;
            }
            i14++;
        }
    }

    public final void g(f fVar) {
        int i5;
        int i10;
        j(fVar);
        HashMap[] hashMapArr = this.f20170c;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f20147d);
            fVar2.f20141c = this.f20172e;
            byte[] bArr = f20162u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.k(0L);
            byte[] bArr3 = f20163v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.k(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.k(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f20172e);
                if (iArr == null || iArr.length != 4) {
                    w0.m("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 <= i12 || (i5 = iArr[3]) <= (i10 = iArr[1])) {
                    return;
                }
                int i13 = (i11 - i12) + 1;
                int i14 = (i5 - i10) + 1;
                if (i13 < i14) {
                    int i15 = i13 + i14;
                    i14 = i15 - i14;
                    i13 = i15 - i14;
                }
                c c2 = c.c(i13, this.f20172e);
                c c8 = c.c(i14, this.f20172e);
                hashMapArr[0].put("ImageWidth", c2);
                hashMapArr[0].put("ImageLength", c8);
            }
        }
    }

    public final void h(b bVar) {
        if (f20154l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f20141c = ByteOrder.BIG_ENDIAN;
        int i5 = bVar.f20140b;
        bVar.c(f20164w.length);
        boolean z5 = false;
        boolean z7 = false;
        while (true) {
            if (z5 && z7) {
                return;
            }
            try {
                int readInt = bVar.readInt();
                int readInt2 = bVar.readInt();
                int i10 = bVar.f20140b;
                int i11 = i10 + readInt + 4;
                int i12 = i10 - i5;
                if (i12 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z5) {
                    this.f20174g = i12;
                    byte[] bArr = new byte[readInt];
                    bVar.readFully(bArr);
                    int readInt3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    r(0, bArr);
                    x();
                    u(new b(bArr));
                    z5 = true;
                } else if (readInt2 == 1767135348 && !z7) {
                    byte[] bArr2 = f20165x;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i13 = bVar.f20140b - i5;
                            int i14 = readInt - length;
                            byte[] bArr4 = new byte[i14];
                            bVar.readFully(bArr4);
                            this.f20177k = new c(i13, bArr4, 1, i14);
                            z7 = true;
                        }
                    }
                }
                bVar.c(i11 - bVar.f20140b);
            } catch (EOFException e7) {
                throw new IOException("Encountered corrupt PNG file.", e7);
            }
        }
    }

    public final void i(b bVar) {
        boolean z5 = f20154l;
        if (z5) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i5 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.c(i5 - bVar.f20140b);
        bVar.readFully(bArr4);
        e(new b(bArr4), i5, 5);
        bVar.c(i11 - bVar.f20140b);
        bVar.f20141c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == E.f20148a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c2 = c.c(readShort, this.f20172e);
                c c8 = c.c(readShort2, this.f20172e);
                HashMap[] hashMapArr = this.f20170c;
                hashMapArr[0].put("ImageLength", c2);
                hashMapArr[0].put("ImageWidth", c8);
                if (z5) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.c(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f20169b == 8) {
            HashMap[] hashMapArr = this.f20170c;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f20147d);
                fVar2.f20141c = this.f20172e;
                fVar2.c(6);
                s(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f20154l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f20170c;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f20147d), (int) cVar.f20146c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) {
        if (f20154l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f20141c = ByteOrder.LITTLE_ENDIAN;
        bVar.c(f20166y.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f20167z;
        bVar.c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i5 = length + 8;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = M;
                    if (h8.b.A(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f20174g = i5;
                    r(0, bArr3);
                    u(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i5 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.c(readInt2);
            } catch (EOFException e7) {
                throw new IOException("Encountered corrupt WebP file.", e7);
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int e7 = cVar.e(this.f20172e);
        int e9 = cVar2.e(this.f20172e);
        if (this.f20169b == 7) {
            e7 += this.f20175h;
        }
        if (e7 > 0 && e9 > 0 && this.f20168a == null) {
            bVar.c(e7);
            bVar.readFully(new byte[e9]);
        }
        if (f20154l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e7 + ", length: " + e9);
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f20172e) <= 512 && cVar2.e(this.f20172e) <= 512;
    }

    public final void o(f fVar) {
        ByteOrder q3 = q(fVar);
        this.f20172e = q3;
        fVar.f20141c = q3;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i5 = this.f20169b;
        if (i5 != 7 && i5 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(c1.i(readInt, "Invalid first Ifd offset: "));
        }
        int i10 = readInt - 8;
        if (i10 > 0) {
            fVar.c(i10);
        }
    }

    public final void p() {
        int i5 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f20170c;
            if (i5 >= hashMapArr.length) {
                return;
            }
            StringBuilder r5 = c1.r(i5, "The size of tag group[", "]: ");
            r5.append(hashMapArr[i5].size());
            Log.d("ExifInterface", r5.toString());
            for (Map.Entry entry : hashMapArr[i5].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f20172e) + "'");
            }
            i5++;
        }
    }

    public final void r(int i5, byte[] bArr) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(f fVar, int i5) {
        HashMap[] hashMapArr;
        boolean z5;
        int i10;
        int i11;
        long j;
        long j6;
        boolean z7;
        int i12;
        short s8;
        long j10;
        int i13;
        HashMap[] hashMapArr2;
        int readUnsignedShort;
        long j11;
        int i14 = i5;
        int i15 = fVar.f20140b;
        int i16 = fVar.f20143e;
        Integer valueOf = Integer.valueOf(i15);
        HashSet hashSet = this.f20171d;
        hashSet.add(valueOf);
        short readShort = fVar.readShort();
        boolean z10 = f20154l;
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s10 = 0;
        while (true) {
            hashMapArr = this.f20170c;
            if (s10 >= readShort) {
                break;
            }
            int readUnsignedShort2 = fVar.readUnsignedShort();
            int readUnsignedShort3 = fVar.readUnsignedShort();
            int readInt = fVar.readInt();
            long j12 = fVar.f20140b + 4;
            short s11 = readShort;
            d dVar = (d) H[i14].get(Integer.valueOf(readUnsignedShort2));
            if (z10) {
                i10 = 3;
                z5 = z10;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i14), Integer.valueOf(readUnsignedShort2), dVar != null ? dVar.f20149b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                z5 = z10;
                i10 = 3;
            }
            if (dVar == null) {
                if (z5) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                }
                i11 = readUnsignedShort2;
            } else {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < C.length) {
                        int i17 = dVar.f20150c;
                        if (i17 == 7 || readUnsignedShort3 == 7 || i17 == readUnsignedShort3 || (i12 = dVar.f20151d) == readUnsignedShort3) {
                            i11 = readUnsignedShort2;
                        } else {
                            i11 = readUnsignedShort2;
                            if (((i17 != 4 && i12 != 4) || readUnsignedShort3 != i10) && (((i17 != 9 && i12 != 9) || readUnsignedShort3 != 8) && ((i17 != 12 && i12 != 12) || readUnsignedShort3 != 11))) {
                                if (z5) {
                                    Log.d("ExifInterface", "Skip the tag entry since data format (" + B[readUnsignedShort3] + ") is unexpected for tag: " + dVar.f20149b);
                                }
                            }
                        }
                        if (readUnsignedShort3 == 7) {
                            readUnsignedShort3 = i17;
                        }
                        j = r7[readUnsignedShort3] * readInt;
                        if (j < 0 || j > 2147483647L) {
                            if (z5) {
                                j6 = j;
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                            } else {
                                j6 = j;
                            }
                            z7 = false;
                            j = j6;
                        } else {
                            z7 = true;
                        }
                        if (z7) {
                            fVar.k(j12);
                            s8 = s10;
                        } else {
                            s8 = s10;
                            if (j > 4) {
                                int readInt2 = fVar.readInt();
                                if (z5) {
                                    hashMapArr2 = hashMapArr;
                                    j10 = j12;
                                    Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                } else {
                                    j10 = j12;
                                    hashMapArr2 = hashMapArr;
                                }
                                if (this.f20169b == 7) {
                                    if ("MakerNote".equals(dVar.f20149b)) {
                                        this.f20175h = readInt2;
                                    } else if (i14 == 6 && "ThumbnailImage".equals(dVar.f20149b)) {
                                        this.f20176i = readInt2;
                                        this.j = readInt;
                                        c c2 = c.c(6, this.f20172e);
                                        i13 = readInt;
                                        c a7 = c.a(this.f20176i, this.f20172e);
                                        c a10 = c.a(this.j, this.f20172e);
                                        hashMapArr2[4].put("Compression", c2);
                                        hashMapArr2[4].put("JPEGInterchangeFormat", a7);
                                        hashMapArr2[4].put("JPEGInterchangeFormatLength", a10);
                                        fVar.k(readInt2);
                                    }
                                }
                                i13 = readInt;
                                fVar.k(readInt2);
                            } else {
                                j10 = j12;
                                i13 = readInt;
                                hashMapArr2 = hashMapArr;
                            }
                            Integer num = (Integer) K.get(Integer.valueOf(i11));
                            if (z5) {
                                Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                            }
                            if (num != null) {
                                if (readUnsignedShort3 != 3) {
                                    if (readUnsignedShort3 == 4) {
                                        j11 = fVar.readInt() & 4294967295L;
                                    } else if (readUnsignedShort3 == 8) {
                                        readUnsignedShort = fVar.readShort();
                                    } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                        readUnsignedShort = fVar.readInt();
                                    } else {
                                        j11 = -1;
                                    }
                                    if (z5) {
                                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j11), dVar.f20149b));
                                    }
                                    if (j11 > 0 || (i16 != -1 && j11 >= i16)) {
                                        if (z5) {
                                            String g10 = d9.e.g(j11, "Skip jump into the IFD since its offset is invalid: ");
                                            if (i16 != -1) {
                                                g10 = g10 + " (total length: " + i16 + ")";
                                            }
                                            Log.d("ExifInterface", g10);
                                        }
                                    } else if (!hashSet.contains(Integer.valueOf((int) j11))) {
                                        fVar.k(j11);
                                        s(fVar, num.intValue());
                                    } else if (z5) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j11 + ")");
                                    }
                                    fVar.k(j10);
                                } else {
                                    readUnsignedShort = fVar.readUnsignedShort();
                                }
                                j11 = readUnsignedShort;
                                if (z5) {
                                }
                                if (j11 > 0) {
                                }
                                if (z5) {
                                }
                                fVar.k(j10);
                            } else {
                                long j13 = j10;
                                int i18 = fVar.f20140b + this.f20174g;
                                byte[] bArr = new byte[(int) j];
                                fVar.readFully(bArr);
                                c cVar = new c(i18, bArr, readUnsignedShort3, i13);
                                HashMap hashMap = hashMapArr2[i5];
                                String str = dVar.f20149b;
                                hashMap.put(str, cVar);
                                if ("DNGVersion".equals(str)) {
                                    this.f20169b = 3;
                                }
                                if ((("Make".equals(str) || "Model".equals(str)) && cVar.f(this.f20172e).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f20172e) == 65535)) {
                                    this.f20169b = 8;
                                }
                                if (fVar.f20140b != j13) {
                                    fVar.k(j13);
                                }
                            }
                        }
                        s10 = (short) (s8 + 1);
                        i14 = i5;
                        readShort = s11;
                        z10 = z5;
                    }
                }
                i11 = readUnsignedShort2;
                if (z5) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
            }
            z7 = false;
            j = 0;
            if (z7) {
            }
            s10 = (short) (s8 + 1);
            i14 = i5;
            readShort = s11;
            z10 = z5;
        }
        boolean z11 = z10;
        int readInt3 = fVar.readInt();
        if (z11) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j14 = readInt3;
        if (j14 <= 0) {
            if (z11) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(readInt3))) {
            if (z11) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        fVar.k(j14);
        if (hashMapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(int i5, String str, String str2) {
        HashMap[] hashMapArr = this.f20170c;
        if (hashMapArr[i5].isEmpty() || hashMapArr[i5].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i5];
        hashMap.put(str2, (c) hashMap.get(str));
        hashMapArr[i5].remove(str);
    }

    public final void u(b bVar) {
        c cVar;
        int e7;
        HashMap hashMap = this.f20170c[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            m(bVar, hashMap);
            return;
        }
        int e9 = cVar2.e(this.f20172e);
        if (e9 != 1) {
            if (e9 == 6) {
                m(bVar, hashMap);
                return;
            } else if (e9 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f20172e);
            int[] iArr2 = f20155m;
            if (Arrays.equals(iArr2, iArr) || (this.f20169b == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e7 = cVar.e(this.f20172e)) == 1 && Arrays.equals(iArr, f20156n)) || (e7 == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) hashMap.get("StripOffsets");
                c cVar5 = (c) hashMap.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] g10 = h8.b.g(cVar4.g(this.f20172e));
                long[] g11 = h8.b.g(cVar5.g(this.f20172e));
                if (g10 == null || g10.length == 0) {
                    w0.m("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (g11 == null || g11.length == 0) {
                    w0.m("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (g10.length != g11.length) {
                    w0.m("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j6 : g11) {
                    j += j6;
                }
                byte[] bArr = new byte[(int) j];
                this.f20173f = true;
                int i5 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < g10.length; i11++) {
                    int i12 = (int) g10[i11];
                    int i13 = (int) g11[i11];
                    if (i11 < g10.length - 1 && i12 + i13 != g10[i11 + 1]) {
                        this.f20173f = false;
                    }
                    int i14 = i12 - i5;
                    if (i14 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.c(i14);
                        int i15 = i5 + i14;
                        byte[] bArr2 = new byte[i13];
                        try {
                            bVar.readFully(bArr2);
                            i5 = i15 + i13;
                            System.arraycopy(bArr2, 0, bArr, i10, i13);
                            i10 += i13;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i13 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i14 + " bytes.");
                        return;
                    }
                }
                if (this.f20173f) {
                    long j10 = g10[0];
                    return;
                }
                return;
            }
        }
        if (f20154l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i5, int i10) {
        HashMap[] hashMapArr = this.f20170c;
        boolean isEmpty = hashMapArr[i5].isEmpty();
        boolean z5 = f20154l;
        if (isEmpty || hashMapArr[i10].isEmpty()) {
            if (z5) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) hashMapArr[i5].get("ImageLength");
        c cVar2 = (c) hashMapArr[i5].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i10].get("ImageLength");
        c cVar4 = (c) hashMapArr[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z5) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z5) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e7 = cVar.e(this.f20172e);
        int e9 = cVar2.e(this.f20172e);
        int e10 = cVar3.e(this.f20172e);
        int e11 = cVar4.e(this.f20172e);
        if (e7 >= e10 || e9 >= e11) {
            return;
        }
        HashMap hashMap = hashMapArr[i5];
        hashMapArr[i5] = hashMapArr[i10];
        hashMapArr[i10] = hashMap;
    }

    public final void w(f fVar, int i5) {
        c c2;
        c c8;
        HashMap[] hashMapArr = this.f20170c;
        c cVar = (c) hashMapArr[i5].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i5].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i5].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i5].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i5].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f20144a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f20172e);
                if (eVarArr == null || eVarArr.length != 2) {
                    w0.m("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c2 = c.b(eVarArr[0], this.f20172e);
                c8 = c.b(eVarArr[1], this.f20172e);
            } else {
                int[] iArr = (int[]) cVar.g(this.f20172e);
                if (iArr == null || iArr.length != 2) {
                    w0.m("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c2 = c.c(iArr[0], this.f20172e);
                c8 = c.c(iArr[1], this.f20172e);
            }
            hashMapArr[i5].put("ImageWidth", c2);
            hashMapArr[i5].put("ImageLength", c8);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e7 = cVar2.e(this.f20172e);
            int e9 = cVar4.e(this.f20172e);
            int e10 = cVar5.e(this.f20172e);
            int e11 = cVar3.e(this.f20172e);
            if (e9 <= e7 || e10 <= e11) {
                return;
            }
            c c10 = c.c(e9 - e7, this.f20172e);
            c c11 = c.c(e10 - e11, this.f20172e);
            hashMapArr[i5].put("ImageLength", c10);
            hashMapArr[i5].put("ImageWidth", c11);
            return;
        }
        c cVar6 = (c) hashMapArr[i5].get("ImageLength");
        c cVar7 = (c) hashMapArr[i5].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i5].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i5].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e12 = cVar8.e(this.f20172e);
            int e13 = cVar8.e(this.f20172e);
            fVar.k(e12);
            byte[] bArr = new byte[e13];
            fVar.readFully(bArr);
            e(new b(bArr), e12, i5);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f20170c;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
