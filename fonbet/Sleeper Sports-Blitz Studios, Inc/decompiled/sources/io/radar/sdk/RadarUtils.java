package io.radar.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.provider.Settings;
import androidx.core.content.ContextCompat;
import androidx.core.hardware.display.DisplayManagerCompat;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.protocol.Device;
import j$.time.ZonedDateTime;
import j$.util.DesugarDate;
import j$.util.DesugarTimeZone;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: RadarUtils.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0002\b\u0019J!\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b*J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0015\u0010-\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b.J\u0015\u0010/\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b0J\u000e\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006J\r\u00103\u001a\u00020)H\u0000¢\u0006\u0002\b4J\u0018\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0002J\u0019\u00108\u001a\u0004\u0018\u00010\u00182\b\u00109\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020=H\u0000¢\u0006\u0002\b>R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\n \n*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u001c\u0010\u000e\u001a\n \n*\u0004\u0018\u00010\u00060\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u000e\u0010\u0010\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006?"}, d2 = {"Lio/radar/sdk/RadarUtils;", "", "()V", "DEGREE_EPSILON", "", "country", "", "getCountry$sdk_release", "()Ljava/lang/String;", "deviceMake", "kotlin.jvm.PlatformType", "getDeviceMake$sdk_release", "deviceModel", "getDeviceModel$sdk_release", "deviceOS", "getDeviceOS$sdk_release", "deviceType", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "timeZoneOffset", "", "getTimeZoneOffset$sdk_release", "()I", "dateToISOString", "date", "Ljava/util/Date;", "dateToISOString$sdk_release", "getApplicationInfo", "", "context", "Landroid/content/Context;", "getApplicationInfo$sdk_release", "getConnectionType", "Lio/radar/sdk/ConnectionType;", "getConnectionType$sdk_release", "getDeviceId", "getDeviceId$sdk_release", "getLocationAccuracyAuthorization", "getLocationAccuracyAuthorization$sdk_release", "getLocationAuthorization", "getLocationAuthorization$sdk_release", "getLocationEnabled", "", "getLocationEnabled$sdk_release", "getSharedPreferences", "Landroid/content/SharedPreferences;", "hasMultipleDisplays", "hasMultipleDisplays$sdk_release", "hasVirtualInputDevice", "hasVirtualInputDevice$sdk_release", "hashSHA256", MetricTracker.Object.INPUT, "isEmulator", "isEmulator$sdk_release", "isWithinDegreeEpsilon", "firstValue", "secondValue", "isoStringToDate", "str", "isoStringToDate$sdk_release", "valid", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "valid$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarUtils {
    private static final double DEGREE_EPSILON = 1.0E-8d;
    public static final String deviceType = "Android";
    public static final String sdkVersion = "3.24.2";
    public static final RadarUtils INSTANCE = new RadarUtils();
    private static final String deviceModel = Build.MODEL;
    private static final String deviceOS = Build.VERSION.RELEASE;
    private static final String deviceMake = Build.MANUFACTURER;

    private RadarUtils() {
    }

    private final SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RadarSDK", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final String getDeviceModel$sdk_release() {
        return deviceModel;
    }

    public final String getDeviceOS$sdk_release() {
        return deviceOS;
    }

    public final String getCountry$sdk_release() {
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return country;
    }

    public final int getTimeZoneOffset$sdk_release() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    public final String getDeviceId$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public final String getDeviceMake$sdk_release() {
        return deviceMake;
    }

    public final String getLocationAuthorization$sdk_release(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!RadarSettings.INSTANCE.getPermissionsDenied$sdk_release(context)) {
            str = "NOT_DETERMINED";
        } else {
            str = ConstantsKt.DENIED;
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            str = "GRANTED_FOREGROUND";
        }
        return (Build.VERSION.SDK_INT < 29 || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") != 0) ? str : "GRANTED_BACKGROUND";
    }

    public final String getLocationAccuracyAuthorization$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = Build.VERSION.SDK_INT < 31;
        boolean z2 = ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        if (z || z2) {
            return "FULL";
        }
        return "REDUCED";
    }

    public final boolean getLocationEnabled$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public final boolean valid$sdk_release(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return (!isWithinDegreeEpsilon(location.getLatitude(), 0.0d) && (location.getLatitude() > (-90.0d) ? 1 : (location.getLatitude() == (-90.0d) ? 0 : -1)) > 0 && (location.getLatitude() > 90.0d ? 1 : (location.getLatitude() == 90.0d ? 0 : -1)) < 0) && (!isWithinDegreeEpsilon(location.getLongitude(), 0.0d) && (location.getLongitude() > (-180.0d) ? 1 : (location.getLongitude() == (-180.0d) ? 0 : -1)) > 0 && (location.getLongitude() > 180.0d ? 1 : (location.getLongitude() == 180.0d ? 0 : -1)) < 0) && ((location.getAccuracy() > 0.0f ? 1 : (location.getAccuracy() == 0.0f ? 0 : -1)) > 0);
    }

    private final boolean isWithinDegreeEpsilon(double firstValue, double secondValue) {
        return Math.abs(firstValue - secondValue) < DEGREE_EPSILON;
    }

    public final boolean isEmulator$sdk_release() {
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
        String FINGERPRINT2 = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
        if (StringsKt.startsWith$default(FINGERPRINT2, "unknown", false, 2, (Object) null)) {
            return true;
        }
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (StringsKt.contains$default((CharSequence) HARDWARE, (CharSequence) "goldfish", false, 2, (Object) null)) {
            return true;
        }
        String HARDWARE2 = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE2, "HARDWARE");
        if (StringsKt.contains$default((CharSequence) HARDWARE2, (CharSequence) "ranchu", false, 2, (Object) null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
            return true;
        }
        String MODEL2 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL2, (CharSequence) "Emulator", false, 2, (Object) null)) {
            return true;
        }
        String MODEL3 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
        if (StringsKt.contains$default((CharSequence) MODEL3, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
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
        String PRODUCT2 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT2, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT2, (CharSequence) "google_sdk", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT3 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT3, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT3, (CharSequence) "sdk", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT4 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT4, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT4, (CharSequence) "sdk_x86", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT5 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT5, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT5, (CharSequence) "vbox86p", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT6 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT6, "PRODUCT");
        if (StringsKt.contains$default((CharSequence) PRODUCT6, (CharSequence) "emulator", false, 2, (Object) null)) {
            return true;
        }
        String PRODUCT7 = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT7, "PRODUCT");
        return StringsKt.contains$default((CharSequence) PRODUCT7, (CharSequence) Device.JsonKeys.SIMULATOR, false, 2, (Object) null);
    }

    public final boolean hasMultipleDisplays$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayManagerCompat displayManagerCompat = DisplayManagerCompat.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(displayManagerCompat, "getInstance(...)");
        return displayManagerCompat.getDisplays().length > 1;
    }

    public final boolean hasVirtualInputDevice$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return RadarSettings.INSTANCE.getSharing$sdk_release(context);
    }

    public final Date isoStringToDate$sdk_release(String str) {
        if (str == null) {
            return null;
        }
        try {
            return DesugarDate.from(ZonedDateTime.parse(str).toInstant());
        } catch (Exception unused) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            try {
                return simpleDateFormat.parse(str);
            } catch (ParseException unused2) {
                return null;
            }
        }
    }

    public final String dateToISOString$sdk_release(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public final String hashSHA256(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        StringBuilder sb = new StringBuilder(digest.length * 2);
        Intrinsics.checkNotNull(digest);
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final ConnectionType getConnectionType$sdk_release(Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        ConnectionType connectionType = ConnectionType.unknown;
        if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return connectionType;
        }
        if (networkCapabilities.hasTransport(1)) {
            return ConnectionType.wifi;
        }
        if (networkCapabilities.hasTransport(0)) {
            return ConnectionType.cellular;
        }
        return ConnectionType.unknown;
    }

    public final Map<String, String> getApplicationInfo$sdk_release(Context context) {
        char c;
        String valueOf;
        long longVersionCode;
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            String obj = packageManager.getApplicationLabel(applicationInfo).toString();
            String str = packageInfo.versionName;
            if (str == null) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            c = 3;
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    longVersionCode = packageInfo.getLongVersionCode();
                    valueOf = String.valueOf(longVersionCode);
                } else {
                    valueOf = String.valueOf(packageInfo.versionCode);
                }
                return MapsKt.mapOf(TuplesKt.to("name", obj), TuplesKt.to(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str), TuplesKt.to("build", valueOf), TuplesKt.to("bundleId", packageName));
            } catch (Exception unused) {
                Pair[] pairArr = new Pair[4];
                pairArr[0] = TuplesKt.to("name", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
                pairArr[1] = TuplesKt.to(RemoteConfigConstants.RequestFieldKey.APP_VERSION, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
                pairArr[2] = TuplesKt.to("build", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
                pairArr[c] = TuplesKt.to("bundleId", context.getPackageName());
                return MapsKt.mapOf(pairArr);
            }
        } catch (Exception unused2) {
            c = 3;
        }
    }
}
