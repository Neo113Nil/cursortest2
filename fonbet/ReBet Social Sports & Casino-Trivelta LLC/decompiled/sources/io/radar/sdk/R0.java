package io.radar.sdk;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.provider.Settings;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;
import o0.C5747a;

/* loaded from: classes3.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    public static final R0 f49781a = new R0();

    /* renamed from: b, reason: collision with root package name */
    public static final String f49782b = Build.MODEL;

    /* renamed from: c, reason: collision with root package name */
    public static final String f49783c = Build.VERSION.RELEASE;

    /* renamed from: d, reason: collision with root package name */
    public static final String f49784d = Build.MANUFACTURER;

    public final String a(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public final String b() {
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getDefault().country");
        return country;
    }

    public final String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public final String d() {
        return f49784d;
    }

    public final String e() {
        return f49782b;
    }

    public final String f() {
        return f49783c;
    }

    public final String g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ((Build.VERSION.SDK_INT < 31) || (AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0)) ? "FULL" : "REDUCED";
    }

    public final String h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = L0.f49705a.n(context) ? "DENIED" : "NOT_DETERMINED";
        if (AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            str = "GRANTED_FOREGROUND";
        }
        return (Build.VERSION.SDK_INT < 29 || AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0) ? str : "GRANTED_BACKGROUND";
    }

    public final int i() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    public final boolean j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C5747a b10 = C5747a.b(context);
        Intrinsics.checkNotNullExpressionValue(b10, "getInstance(context)");
        return b10.a().length > 1;
    }

    public final boolean k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return L0.f49705a.v(context);
    }

    public final String l(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = messageDigest.digest(bytes);
        StringBuilder sb2 = new StringBuilder(bytes2.length * 2);
        Intrinsics.checkNotNullExpressionValue(bytes2, "bytes");
        for (byte b10 : bytes2) {
            String hexString = Integer.toHexString(b10 & UByte.MAX_VALUE);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "hexString.toString()");
        return sb3;
    }

    public final boolean m() {
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        if (StringsKt.startsWith$default(BRAND, "generic", false, 2, (Object) null)) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (StringsKt.startsWith$default(DEVICE, "generic", false, 2, (Object) null)) {
                return true;
            }
        }
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.startsWith$default(FINGERPRINT, "unknown", false, 2, (Object) null)) {
            return true;
        }
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (StringsKt.contains$default((CharSequence) HARDWARE, (CharSequence) "goldfish", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (StringsKt.contains$default((CharSequence) HARDWARE, (CharSequence) "ranchu", false, 2, (Object) null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Emulator", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT, (CharSequence) "sdk_google", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT, (CharSequence) "google_sdk", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT, (CharSequence) "sdk", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT, (CharSequence) "sdk_x86", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT, (CharSequence) "vbox86p", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT, (CharSequence) "emulator", false, 2, (Object) null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        return StringsKt.contains$default((CharSequence) PRODUCT, (CharSequence) "simulator", false, 2, (Object) null);
    }

    public final boolean n(double d10, double d11) {
        return Math.abs(d10 - d11) < 1.0E-8d;
    }

    public final Date o(String str) {
        ZonedDateTime parse;
        Date from;
        if (str == null) {
            return null;
        }
        try {
            parse = ZonedDateTime.parse(str);
            from = Date.from(parse.toInstant());
            return from;
        } catch (Exception unused) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                return simpleDateFormat.parse(str);
            } catch (ParseException unused2) {
                return null;
            }
        }
    }

    public final boolean p(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return (!n(location.getLatitude(), 0.0d) && (location.getLatitude() > (-90.0d) ? 1 : (location.getLatitude() == (-90.0d) ? 0 : -1)) > 0 && (location.getLatitude() > 90.0d ? 1 : (location.getLatitude() == 90.0d ? 0 : -1)) < 0) && (!n(location.getLongitude(), 0.0d) && (location.getLongitude() > (-180.0d) ? 1 : (location.getLongitude() == (-180.0d) ? 0 : -1)) > 0 && (location.getLongitude() > 180.0d ? 1 : (location.getLongitude() == 180.0d ? 0 : -1)) < 0) && ((location.getAccuracy() > 0.0f ? 1 : (location.getAccuracy() == 0.0f ? 0 : -1)) > 0);
    }
}
