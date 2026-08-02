package androidx.camera.core.impl.utils;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.dto.common.ImageSizeKey;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.o4q;
import xsna.obr;
import xsna.s500;
import xsna.t4q;

/* loaded from: classes11.dex */
public final class ExifData {
    public static final t4q[] c;
    public static final t4q[][] d;
    public static final HashSet<String> e;
    public final ArrayList a;
    public final ByteOrder b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WhiteBalanceMode {
        private static final /* synthetic */ WhiteBalanceMode[] $VALUES;
        public static final WhiteBalanceMode AUTO;
        public static final WhiteBalanceMode MANUAL;

        static {
            WhiteBalanceMode whiteBalanceMode = new WhiteBalanceMode("AUTO", 0);
            AUTO = whiteBalanceMode;
            WhiteBalanceMode whiteBalanceMode2 = new WhiteBalanceMode("MANUAL", 1);
            MANUAL = whiteBalanceMode2;
            $VALUES = new WhiteBalanceMode[]{whiteBalanceMode, whiteBalanceMode2};
        }

        public WhiteBalanceMode() {
            throw null;
        }

        public static WhiteBalanceMode valueOf(String str) {
            return (WhiteBalanceMode) Enum.valueOf(WhiteBalanceMode.class, str);
        }

        public static WhiteBalanceMode[] values() {
            return (WhiteBalanceMode[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WhiteBalanceMode.values().length];
            b = iArr;
            try {
                iArr[WhiteBalanceMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WhiteBalanceMode.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CameraCaptureMetaData$FlashState.values().length];
            a = iArr2;
            try {
                iArr2[CameraCaptureMetaData$FlashState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[CameraCaptureMetaData$FlashState.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[CameraCaptureMetaData$FlashState.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b {
        public static final Pattern c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final Pattern e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        public static final ArrayList f;
        public final ArrayList a;
        public final ByteOrder b;

        public class a implements Enumeration<HashMap<String, t4q>> {
            public int a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.a;
                t4q[] t4qVarArr = ExifData.c;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final HashMap<String, t4q> nextElement() {
                HashMap<String, t4q> hashMap = new HashMap<>();
                for (t4q t4qVar : ExifData.d[this.a]) {
                    hashMap.put(t4qVar.b, t4qVar);
                }
                this.a++;
                return hashMap;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.ExifData$b$b, reason: collision with other inner class name */
        public class C0004b implements Enumeration<Map<String, o4q>> {
            public int a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.a;
                t4q[] t4qVarArr = ExifData.c;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final Map<String, o4q> nextElement() {
                this.a++;
                return new HashMap();
            }
        }

        static {
            a aVar = new a();
            aVar.a = 0;
            f = Collections.list(aVar);
        }

        public b() {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            C0004b c0004b = new C0004b();
            c0004b.a = 0;
            this.a = Collections.list(c0004b);
            this.b = byteOrder;
        }

        public static Pair<Integer, Integer> a(String str) {
            if (str.contains(StringUtils.COMMA)) {
                String[] split = str.split(StringUtils.COMMA, -1);
                Pair<Integer, Integer> a2 = a(split[0]);
                if (((Integer) a2.first).intValue() == 2) {
                    return a2;
                }
                for (int i = 1; i < split.length; i++) {
                    Pair<Integer, Integer> a3 = a(split[i]);
                    int intValue = (((Integer) a3.first).equals(a2.first) || ((Integer) a3.second).equals(a2.first)) ? ((Integer) a2.first).intValue() : -1;
                    int intValue2 = (((Integer) a2.second).intValue() == -1 || !(((Integer) a3.first).equals(a2.second) || ((Integer) a3.second).equals(a2.second))) ? -1 : ((Integer) a2.second).intValue();
                    if (intValue == -1 && intValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (intValue == -1) {
                        a2 = new Pair<>(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        a2 = new Pair<>(Integer.valueOf(intValue), -1);
                    }
                }
                return a2;
            }
            if (!str.contains(DomExceptionUtils.SEPARATOR)) {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] split2 = str.split(DomExceptionUtils.SEPARATOR, -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        public final void b(@NonNull String str, @NonNull String str2, @NonNull ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            c(str, str2, arrayList);
        }

        /* JADX WARN: Code restructure failed: missing block: B:123:0x013c, code lost:
        
            if (r8 != r5) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:106:0x034e  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0376  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0262  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x02d0  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x02fd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(@NonNull String str, @Nullable String str2, @NonNull List<Map<String, o4q>> list) {
            int i;
            int i2;
            int i3;
            int i4;
            o4q o4qVar;
            int i5;
            int i6;
            int i7;
            String str3 = str;
            String str4 = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
                boolean find = d.matcher(str4).find();
                boolean find2 = e.matcher(str4).find();
                if (str4.length() != 19) {
                    return;
                }
                if (!find && !find2) {
                    return;
                }
                if (find2) {
                    str4 = str4.replaceAll("-", StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            int i8 = 3;
            int i9 = 2;
            int i10 = 1;
            if (str4 != null && ExifData.e.contains(str3)) {
                if (str3.equals("GPSTimeStamp")) {
                    Matcher matcher = c.matcher(str4);
                    if (!matcher.find()) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    String group = matcher.group(1);
                    group.getClass();
                    sb.append(Integer.parseInt(group));
                    sb.append("/1,");
                    String group2 = matcher.group(2);
                    group2.getClass();
                    sb.append(Integer.parseInt(group2));
                    sb.append("/1,");
                    String group3 = matcher.group(3);
                    group3.getClass();
                    sb.append(Integer.parseInt(group3));
                    sb.append("/1");
                    str4 = sb.toString();
                } else {
                    try {
                        str4 = ((long) (Double.parseDouble(str4) * 10000.0d)) + "/10000";
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
            }
            int i11 = 0;
            int i12 = 0;
            while (true) {
                t4q[] t4qVarArr = ExifData.c;
                if (i12 >= 4) {
                    return;
                }
                t4q t4qVar = (t4q) ((HashMap) f.get(i12)).get(str3);
                if (t4qVar != null) {
                    int i13 = t4qVar.d;
                    int i14 = t4qVar.c;
                    if (str4 == null) {
                        list.get(i12).remove(str3);
                    } else {
                        Pair<Integer, Integer> a2 = a(str4);
                        int i15 = -1;
                        if (i14 != ((Integer) a2.first).intValue() && i14 != ((Integer) a2.second).intValue()) {
                            if (i13 == -1 || (i13 != ((Integer) a2.first).intValue() && i13 != ((Integer) a2.second).intValue())) {
                                if (i14 != i10) {
                                    if (i14 != 7) {
                                    }
                                }
                            }
                            String str5 = DomExceptionUtils.SEPARATOR;
                            ByteOrder byteOrder = this.b;
                            switch (i13) {
                                case 1:
                                    int i16 = i11;
                                    i = i8;
                                    i2 = i9;
                                    Map<String, o4q> map = list.get(i12);
                                    Charset charset = o4q.d;
                                    i3 = i10;
                                    if (str4.length() == i3) {
                                        i4 = i16;
                                        if (str4.charAt(i4) >= '0' && str4.charAt(i4) <= '1') {
                                            byte[] bArr = new byte[i3];
                                            bArr[i4] = (byte) (str4.charAt(i4) - ImageSizeKey.SIZE_KEY_UNDEFINED);
                                            o4qVar = new o4q(i3, i3, bArr);
                                            map.put(str3, o4qVar);
                                            break;
                                        }
                                    } else {
                                        i4 = i16;
                                    }
                                    byte[] bytes = str4.getBytes(o4q.d);
                                    o4qVar = new o4q(i3, bytes.length, bytes);
                                    map.put(str3, o4qVar);
                                    break;
                                case 2:
                                case 7:
                                    int i17 = i11;
                                    i = i8;
                                    Map<String, o4q> map2 = list.get(i12);
                                    Charset charset2 = o4q.d;
                                    byte[] bytes2 = str4.concat("\u0000").getBytes(o4q.d);
                                    i2 = 2;
                                    map2.put(str3, new o4q(2, bytes2.length, bytes2));
                                    i3 = i10;
                                    i4 = i17;
                                    break;
                                case 3:
                                    i5 = i11;
                                    int i18 = i8;
                                    int i19 = i10;
                                    String[] split = str4.split(StringUtils.COMMA, -1);
                                    int length = split.length;
                                    int[] iArr = new int[length];
                                    for (int i20 = i5; i20 < split.length; i20++) {
                                        iArr[i20] = Integer.parseInt(split[i20]);
                                    }
                                    Map<String, o4q> map3 = list.get(i12);
                                    ByteBuffer wrap = ByteBuffer.wrap(new byte[o4q.f[i18] * length]);
                                    wrap.order(byteOrder);
                                    for (int i21 = i5; i21 < length; i21++) {
                                        wrap.putShort((short) iArr[i21]);
                                    }
                                    i = i18;
                                    map3.put(str3, new o4q(i, length, wrap.array()));
                                    i3 = i19;
                                    i4 = i5;
                                    i2 = 2;
                                    break;
                                case 4:
                                    i5 = i11;
                                    i6 = i8;
                                    i7 = i10;
                                    String[] split2 = str4.split(StringUtils.COMMA, -1);
                                    long[] jArr = new long[split2.length];
                                    for (int i22 = i5; i22 < split2.length; i22++) {
                                        jArr[i22] = Long.parseLong(split2[i22]);
                                    }
                                    list.get(i12).put(str3, o4q.b(jArr, byteOrder));
                                    i3 = i7;
                                    i = i6;
                                    i4 = i5;
                                    i2 = 2;
                                    break;
                                case 5:
                                    i5 = i11;
                                    i6 = i8;
                                    i7 = i10;
                                    int i23 = -1;
                                    String[] split3 = str4.split(StringUtils.COMMA, -1);
                                    int length2 = split3.length;
                                    s500[] s500VarArr = new s500[length2];
                                    int i24 = i5;
                                    while (i24 < split3.length) {
                                        String[] split4 = split3[i24].split(str5, i23);
                                        int i25 = i24;
                                        s500VarArr[i25] = new s500((long) Double.parseDouble(split4[i5]), (long) Double.parseDouble(split4[i7]));
                                        i24 = i25 + 1;
                                        str5 = str5;
                                        i23 = -1;
                                    }
                                    Map<String, o4q> map4 = list.get(i12);
                                    ByteBuffer wrap2 = ByteBuffer.wrap(new byte[o4q.f[5] * length2]);
                                    wrap2.order(byteOrder);
                                    for (int i26 = i5; i26 < length2; i26++) {
                                        s500 s500Var = s500VarArr[i26];
                                        wrap2.putInt((int) s500Var.a);
                                        wrap2.putInt((int) s500Var.b);
                                    }
                                    map4.put(str3, new o4q(5, length2, wrap2.array()));
                                    i3 = i7;
                                    i = i6;
                                    i4 = i5;
                                    i2 = 2;
                                    break;
                                case 6:
                                case 8:
                                case 11:
                                default:
                                    i = i8;
                                    i2 = i9;
                                    i3 = i10;
                                    i4 = i11;
                                    break;
                                case 9:
                                    i5 = i11;
                                    i6 = i8;
                                    i7 = i10;
                                    String[] split5 = str4.split(StringUtils.COMMA, -1);
                                    int length3 = split5.length;
                                    int[] iArr2 = new int[length3];
                                    for (int i27 = i5; i27 < split5.length; i27++) {
                                        iArr2[i27] = Integer.parseInt(split5[i27]);
                                    }
                                    Map<String, o4q> map5 = list.get(i12);
                                    ByteBuffer wrap3 = ByteBuffer.wrap(new byte[o4q.f[9] * length3]);
                                    wrap3.order(byteOrder);
                                    for (int i28 = i5; i28 < length3; i28++) {
                                        wrap3.putInt(iArr2[i28]);
                                    }
                                    map5.put(str3, new o4q(9, length3, wrap3.array()));
                                    i3 = i7;
                                    i = i6;
                                    i4 = i5;
                                    i2 = 2;
                                    break;
                                case 10:
                                    i7 = i10;
                                    String[] split6 = str4.split(StringUtils.COMMA, -1);
                                    int length4 = split6.length;
                                    s500[] s500VarArr2 = new s500[length4];
                                    int i29 = i11;
                                    while (i29 < split6.length) {
                                        String[] split7 = split6[i29].split(DomExceptionUtils.SEPARATOR, i15);
                                        int i30 = i29;
                                        s500VarArr2[i30] = new s500((long) Double.parseDouble(split7[i11]), (long) Double.parseDouble(split7[i7]));
                                        i29 = i30 + 1;
                                        i8 = i8;
                                        i11 = i11;
                                        i15 = -1;
                                    }
                                    i5 = i11;
                                    i6 = i8;
                                    Map<String, o4q> map6 = list.get(i12);
                                    ByteBuffer wrap4 = ByteBuffer.wrap(new byte[o4q.f[10] * length4]);
                                    wrap4.order(byteOrder);
                                    for (int i31 = i5; i31 < length4; i31++) {
                                        s500 s500Var2 = s500VarArr2[i31];
                                        wrap4.putInt((int) s500Var2.a);
                                        wrap4.putInt((int) s500Var2.b);
                                    }
                                    map6.put(str3, new o4q(10, length4, wrap4.array()));
                                    i3 = i7;
                                    i = i6;
                                    i4 = i5;
                                    i2 = 2;
                                    break;
                                case 12:
                                    String[] split8 = str4.split(StringUtils.COMMA, -1);
                                    int length5 = split8.length;
                                    double[] dArr = new double[length5];
                                    for (int i32 = i11; i32 < split8.length; i32++) {
                                        dArr[i32] = Double.parseDouble(split8[i32]);
                                    }
                                    Map<String, o4q> map7 = list.get(i12);
                                    ByteBuffer wrap5 = ByteBuffer.wrap(new byte[o4q.f[12] * length5]);
                                    wrap5.order(byteOrder);
                                    int i33 = i11;
                                    while (i33 < length5) {
                                        wrap5.putDouble(dArr[i33]);
                                        i33++;
                                        i10 = i10;
                                    }
                                    map7.put(str3, new o4q(12, length5, wrap5.array()));
                                    i3 = i10;
                                    i = i8;
                                    i2 = 2;
                                    i4 = i11;
                                    break;
                            }
                            i12++;
                            i11 = i4;
                            i10 = i3;
                            i8 = i;
                            i9 = i2;
                        }
                        i13 = i14;
                        String str52 = DomExceptionUtils.SEPARATOR;
                        ByteOrder byteOrder2 = this.b;
                        switch (i13) {
                        }
                        i12++;
                        i11 = i4;
                        i10 = i3;
                        i8 = i;
                        i9 = i2;
                    }
                }
                i = i8;
                i2 = i9;
                i3 = i10;
                i4 = i11;
                i12++;
                i11 = i4;
                i10 = i3;
                i8 = i;
                i9 = i2;
            }
        }

        @NonNull
        public final void d(int i) {
            c("Orientation", String.valueOf(i != 0 ? i != 90 ? i != 180 ? i != 270 ? 0 : 8 : 3 : 6 : 1), this.a);
        }
    }

    static {
        t4q[] t4qVarArr = {new t4q("ImageWidth", 256, 3, 4), new t4q("ImageLength", 257, 3, 4), new t4q("Make", 271, 2), new t4q("Model", 272, 2), new t4q("Orientation", 274, 3), new t4q("XResolution", 282, 5), new t4q("YResolution", 283, 5), new t4q("ResolutionUnit", 296, 3), new t4q("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new t4q("DateTime", 306, 2), new t4q("YCbCrPositioning", 531, 3), new t4q("SubIFDPointer", 330, 4), new t4q("ExifIFDPointer", 34665, 4), new t4q("GPSInfoIFDPointer", 34853, 4)};
        t4q[] t4qVarArr2 = {new t4q("ExposureTime", 33434, 5), new t4q("FNumber", 33437, 5), new t4q("ExposureProgram", 34850, 3), new t4q("PhotographicSensitivity", 34855, 3), new t4q("SensitivityType", 34864, 3), new t4q("ExifVersion", 36864, 2), new t4q("DateTimeOriginal", 36867, 2), new t4q("DateTimeDigitized", 36868, 2), new t4q("ComponentsConfiguration", 37121, 7), new t4q("ShutterSpeedValue", 37377, 10), new t4q("ApertureValue", 37378, 5), new t4q("BrightnessValue", 37379, 10), new t4q("ExposureBiasValue", 37380, 10), new t4q("MaxApertureValue", 37381, 5), new t4q("MeteringMode", 37383, 3), new t4q("LightSource", 37384, 3), new t4q("Flash", 37385, 3), new t4q("FocalLength", 37386, 5), new t4q("SubSecTime", 37520, 2), new t4q("SubSecTimeOriginal", 37521, 2), new t4q("SubSecTimeDigitized", 37522, 2), new t4q("FlashpixVersion", 40960, 7), new t4q("ColorSpace", 40961, 3), new t4q("PixelXDimension", 40962, 3, 4), new t4q("PixelYDimension", 40963, 3, 4), new t4q("InteroperabilityIFDPointer", 40965, 4), new t4q("FocalPlaneResolutionUnit", 41488, 3), new t4q("SensingMethod", 41495, 3), new t4q("FileSource", 41728, 7), new t4q("SceneType", 41729, 7), new t4q("CustomRendered", 41985, 3), new t4q("ExposureMode", 41986, 3), new t4q("WhiteBalance", 41987, 3), new t4q("SceneCaptureType", 41990, 3), new t4q("Contrast", 41992, 3), new t4q("Saturation", 41993, 3), new t4q("Sharpness", 41994, 3)};
        t4q[] t4qVarArr3 = {new t4q("GPSVersionID", 0, 1), new t4q("GPSLatitudeRef", 1, 2), new t4q("GPSLatitude", 2, 5, 10), new t4q("GPSLongitudeRef", 3, 2), new t4q("GPSLongitude", 4, 5, 10), new t4q("GPSAltitudeRef", 5, 1), new t4q("GPSAltitude", 6, 5), new t4q("GPSTimeStamp", 7, 5), new t4q("GPSSpeedRef", 12, 2), new t4q("GPSTrackRef", 14, 2), new t4q("GPSImgDirectionRef", 16, 2), new t4q("GPSDestBearingRef", 23, 2), new t4q("GPSDestDistanceRef", 25, 2)};
        c = new t4q[]{new t4q("SubIFDPointer", 330, 4), new t4q("ExifIFDPointer", 34665, 4), new t4q("GPSInfoIFDPointer", 34853, 4), new t4q("InteroperabilityIFDPointer", 40965, 4)};
        d = new t4q[][]{t4qVarArr, t4qVarArr2, t4qVarArr3, new t4q[]{new t4q("InteroperabilityIndex", 1, 2)}};
        e = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public ExifData(ByteOrder byteOrder, ArrayList arrayList) {
        obr.f("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.b = byteOrder;
        this.a = arrayList;
    }

    @NonNull
    public final Map<String, o4q> a(int i) {
        obr.c(i, 4, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return (Map) this.a.get(i);
    }
}
