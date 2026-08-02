package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Range;
import androidx.autofill.HintConstants;
import com.applovin.impl.b5;
import com.applovin.impl.e4;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.n7;
import com.applovin.impl.o8;
import com.applovin.impl.p0;
import com.applovin.impl.p7;
import com.applovin.impl.q0;
import com.applovin.impl.q5;
import com.applovin.impl.q7;
import com.applovin.impl.r0;
import com.applovin.impl.s0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.v;
import com.applovin.impl.v2;
import com.applovin.impl.w4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.Scopes;
import com.ironsource.M6;
import com.ironsource.X3;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.model.Cookie;
import io.ktor.http.ContentType;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.Geo;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class m {
    private static String j;
    private static String k;
    private static final AtomicReference l = new AtomicReference();
    private static final AtomicReference m = new AtomicReference();
    private final l a;
    private final p b;
    private final Context c;
    private final Map d;
    private final Map f;
    private boolean h;
    private final Object e = new Object();
    private final Object g = new Object();
    private final AtomicReference i = new AtomicReference();

    class a implements q5.a {
        a() {
        }

        @Override // com.applovin.impl.q5.a
        public void a(v.a aVar) {
            m.l.set(aVar);
        }
    }

    public static class b {
        public final String a;
        public final int b;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    public static class c {
        public int a = -1;
        public int b = -1;
        public Boolean c = null;
    }

    public interface d {
        String a(ContentResolver contentResolver, String str);
    }

    protected m(l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = lVar;
        this.b = lVar.Q();
        this.c = l.p();
        this.d = D();
        this.f = C();
    }

    private String B() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            sb.append(audioDeviceInfo.getType());
            sb.append(",");
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) && p.a()) {
            this.b.a("DataCollector", "No sound outputs detected");
        }
        return sb2;
    }

    private Map C() {
        HashMap hashMap = new HashMap();
        PackageManager packageManager = this.c.getPackageManager();
        ApplicationInfo applicationInfo = this.c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        int i = p0.f() ? 134238224 : 20560;
        PackageInfo a2 = q7.a(this.c, 0);
        PackageInfo a3 = q7.a(this.c, i);
        String a4 = a(applicationInfo.packageName, packageManager, this.a);
        String a5 = a(applicationInfo.packageName, packageManager);
        hashMap.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        hashMap.put(App.JsonKeys.APP_VERSION, a2 != null ? a2.versionName : "");
        hashMap.put("app_version_code", Integer.valueOf(a2 != null ? a2.versionCode : -1));
        hashMap.put("installer_name", StringUtils.emptyIfNull(a4));
        hashMap.put("originating_name", StringUtils.emptyIfNull(a5));
        hashMap.put("tg", p7.a(this.a));
        hashMap.put("debug", Boolean.valueOf(q7.c(this.a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        hashMap.put("alts_ms", Long.valueOf(l.o()));
        hashMap.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, this.a.o0().getSessionId());
        hashMap.put("j8", Boolean.valueOf(l.H0()));
        hashMap.put("app_info_flags", Integer.valueOf(applicationInfo.flags));
        hashMap.put("last_update_ms", Long.valueOf(a2 != null ? a2.lastUpdateTime : 0L));
        List d2 = d(a3);
        if (!CollectionUtils.isEmpty(d2)) {
            hashMap.put("signing_info", d2);
        }
        List a6 = a(a3);
        if (!CollectionUtils.isEmpty(a6)) {
            hashMap.put("instrumentation", a6);
        }
        hashMap.put("install_location", Integer.valueOf(a2 != null ? a2.installLocation : 0));
        hashMap.put("split_names", a2 != null ? a2.splitNames : Collections.emptyList());
        if (((Boolean) this.a.a(z4.Q4)).booleanValue()) {
            Map c2 = c(a3);
            if (!CollectionUtils.isEmpty(c2)) {
                hashMap.put("req_p", c2);
            }
            List b2 = b(a3);
            if (!CollectionUtils.isEmpty(b2)) {
                hashMap.put("req_f", b2);
            }
        }
        l lVar = this.a;
        b5 b5Var = b5.h;
        Long l2 = (Long) lVar.a(b5Var);
        if (l2 != null) {
            hashMap.put("ia_v2", l2);
        } else {
            this.a.b(b5Var, Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.a.g0().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.j.b(), hashMap);
        hashMap.put("api_did", this.a.a(z4.f));
        hashMap.put("first_install_v3_ms", a2 != null ? Long.valueOf(a2.firstInstallTime) : "");
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (p0.d()) {
            hashMap.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.a.J0()) {
            hashMap.put("unity_version", q7.a(this.a.p0()));
        }
        List i2 = i();
        if (!CollectionUtils.isEmpty(i2)) {
            hashMap.put("application_start_info", i2);
        }
        List g = g();
        if (!CollectionUtils.isEmpty(g)) {
            hashMap.put("application_exit_info", g);
        }
        if (p0.e()) {
            hashMap.put("instant_app", Boolean.valueOf(packageManager.isInstantApp()));
        }
        return hashMap;
    }

    private Map D() {
        HashMap hashMap = new HashMap(35);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put(Device.JsonKeys.BRAND, Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        hashMap.put("aida", Boolean.valueOf(v.a()));
        hashMap.put(Device.JsonKeys.LOCALE, Locale.getDefault().toString());
        hashMap.put("model", Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("platform", A());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(E()));
        hashMap.put("gy", Boolean.valueOf(u()));
        hashMap.put(Geo.JsonKeys.COUNTRY_CODE, n());
        hashMap.put("mcc", y());
        hashMap.put("mnc", z());
        hashMap.put(M6.R0, l());
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.c)));
        hashMap.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        hashMap.put("hdr", S());
        hashMap.put("supported_abis", CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS));
        hashMap.put("type", Build.TYPE);
        hashMap.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            p0.b a2 = p0.a(this.c, this.a);
            if (a2 != null) {
                hashMap.put("tl_cr", Integer.valueOf(a2.c()));
                hashMap.put("tr_cr", Integer.valueOf(a2.d()));
                hashMap.put("bl_cr", Integer.valueOf(a2.a()));
                hashMap.put("br_cr", Integer.valueOf(a2.b()));
            }
        }
        hashMap.put("bt_ms", Long.valueOf(k()));
        hashMap.put("tbalsi_ms", Long.valueOf(this.a.M() - l.o()));
        CollectionUtils.putStringIfValid("process_name", q7.c(this.c), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", q7.i(this.c), hashMap);
        try {
            PackageInfo packageInfo = this.c.getPackageManager().getPackageInfo("com.android.vending", 0);
            hashMap.put("ps_version", packageInfo.versionName);
            hashMap.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            hashMap.put("ps_version", "");
            hashMap.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", n7.a(this.c), hashMap);
        a(hashMap);
        return hashMap;
    }

    private double E() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0200 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONArray F() {
        boolean z;
        MediaCodecInfo[] mediaCodecInfoArr;
        int i;
        int i2;
        MediaCodecInfo[] mediaCodecInfoArr2;
        int i3;
        int i4;
        MediaCodecInfo mediaCodecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z2 = true;
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            int i5 = 0;
            while (i5 < length) {
                MediaCodecInfo mediaCodecInfo2 = codecInfos[i5];
                if (mediaCodecInfo2.isEncoder()) {
                    z = z2;
                    mediaCodecInfoArr = codecInfos;
                    i = length;
                    i2 = i5;
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", mediaCodecInfo2.getName());
                    if (p0.g()) {
                        hashMap.put("is_hardware_accelerated", Boolean.valueOf(mediaCodecInfo2.isHardwareAccelerated()));
                        hashMap.put("is_software_only", Boolean.valueOf(mediaCodecInfo2.isSoftwareOnly()));
                    }
                    String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                    ArrayList arrayList2 = new ArrayList();
                    HashMap hashMap2 = new HashMap();
                    int length2 = supportedTypes.length;
                    z = z2;
                    int i6 = 0;
                    while (i6 < length2) {
                        String str = supportedTypes[i6];
                        int i7 = i6;
                        if (str.toLowerCase(Locale.ROOT).startsWith("video/")) {
                            arrayList2.add(str);
                            try {
                                capabilitiesForType = mediaCodecInfo2.getCapabilitiesForType(str);
                            } catch (Throwable th) {
                                th = th;
                                mediaCodecInfoArr2 = codecInfos;
                            }
                            if (capabilitiesForType != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                                mediaCodecInfoArr2 = codecInfos;
                                try {
                                    HashMap hashMap3 = new HashMap();
                                    i3 = length;
                                    try {
                                        i4 = i5;
                                        try {
                                            hashMap3.put("max_width", videoCapabilities.getSupportedWidths().getUpper());
                                            hashMap3.put("max_height", videoCapabilities.getSupportedHeights().getUpper());
                                            Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
                                            Integer lower = bitrateRange.getLower();
                                            Integer upper = bitrateRange.getUpper();
                                            mediaCodecInfo = mediaCodecInfo2;
                                            try {
                                                Integer[] numArr = new Integer[2];
                                                numArr[0] = lower;
                                                numArr[z ? 1 : 0] = upper;
                                                hashMap3.put("bitrate_range_bps", Arrays.asList(numArr));
                                                Range<Integer> supportedFrameRates = videoCapabilities.getSupportedFrameRates();
                                                Integer lower2 = supportedFrameRates.getLower();
                                                Integer upper2 = supportedFrameRates.getUpper();
                                                Integer[] numArr2 = new Integer[2];
                                                numArr2[0] = lower2;
                                                numArr2[z ? 1 : 0] = upper2;
                                                hashMap3.put("overall_frame_rate_range", Arrays.asList(numArr2));
                                                int intValue = videoCapabilities.getSupportedWidths().getUpper().intValue();
                                                int intValue2 = videoCapabilities.getSupportedHeights().getUpper().intValue();
                                                if (videoCapabilities.isSizeSupported(intValue, intValue2)) {
                                                    try {
                                                        Range<Double> supportedFrameRatesFor = videoCapabilities.getSupportedFrameRatesFor(intValue, intValue2);
                                                        if (supportedFrameRatesFor != null) {
                                                            Double lower3 = supportedFrameRatesFor.getLower();
                                                            Double upper3 = supportedFrameRatesFor.getUpper();
                                                            Double[] dArr = new Double[2];
                                                            dArr[0] = lower3;
                                                            dArr[z ? 1 : 0] = upper3;
                                                            hashMap3.put("frame_rate_range_for_max_res", Arrays.asList(dArr));
                                                        }
                                                    } catch (Throwable th2) {
                                                        if (p.a()) {
                                                            this.b.a("DataCollector", "Could not get frame rates for max resolution for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th2);
                                                        }
                                                    }
                                                }
                                                ArrayList arrayList3 = new ArrayList();
                                                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                                                if (codecProfileLevelArr != null && codecProfileLevelArr.length > 0) {
                                                    int i8 = 0;
                                                    for (int length3 = codecProfileLevelArr.length; i8 < length3; length3 = length3) {
                                                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i8];
                                                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = codecProfileLevelArr;
                                                        HashMap hashMap4 = new HashMap();
                                                        hashMap4.put(Scopes.PROFILE, Integer.valueOf(codecProfileLevel.profile));
                                                        hashMap4.put("level", Integer.valueOf(codecProfileLevel.level));
                                                        arrayList3.add(hashMap4);
                                                        i8++;
                                                        codecProfileLevelArr = codecProfileLevelArr2;
                                                    }
                                                    hashMap3.put("profile_levels", arrayList3);
                                                }
                                                if (!hashMap3.isEmpty()) {
                                                    hashMap2.put(str, hashMap3);
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                if (!p.a()) {
                                                    this.b.a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                                }
                                                i6 = i7 + 1;
                                                codecInfos = mediaCodecInfoArr2;
                                                length = i3;
                                                i5 = i4;
                                                mediaCodecInfo2 = mediaCodecInfo;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            mediaCodecInfo = mediaCodecInfo2;
                                            if (!p.a()) {
                                            }
                                            i6 = i7 + 1;
                                            codecInfos = mediaCodecInfoArr2;
                                            length = i3;
                                            i5 = i4;
                                            mediaCodecInfo2 = mediaCodecInfo;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i4 = i5;
                                        mediaCodecInfo = mediaCodecInfo2;
                                        if (!p.a()) {
                                        }
                                        i6 = i7 + 1;
                                        codecInfos = mediaCodecInfoArr2;
                                        length = i3;
                                        i5 = i4;
                                        mediaCodecInfo2 = mediaCodecInfo;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    i3 = length;
                                    i4 = i5;
                                    mediaCodecInfo = mediaCodecInfo2;
                                    if (!p.a()) {
                                    }
                                    i6 = i7 + 1;
                                    codecInfos = mediaCodecInfoArr2;
                                    length = i3;
                                    i5 = i4;
                                    mediaCodecInfo2 = mediaCodecInfo;
                                }
                                i6 = i7 + 1;
                                codecInfos = mediaCodecInfoArr2;
                                length = i3;
                                i5 = i4;
                                mediaCodecInfo2 = mediaCodecInfo;
                            }
                        }
                        mediaCodecInfoArr2 = codecInfos;
                        i3 = length;
                        i4 = i5;
                        mediaCodecInfo = mediaCodecInfo2;
                        i6 = i7 + 1;
                        codecInfos = mediaCodecInfoArr2;
                        length = i3;
                        i5 = i4;
                        mediaCodecInfo2 = mediaCodecInfo;
                    }
                    mediaCodecInfoArr = codecInfos;
                    i = length;
                    i2 = i5;
                    if (!arrayList2.isEmpty()) {
                        hashMap.put("supported_mime_types", arrayList2);
                        if (!hashMap2.isEmpty()) {
                            hashMap.put("capabilities_by_type", hashMap2);
                        }
                        arrayList.add(hashMap);
                    }
                }
                i5 = i2 + 1;
                z2 = z;
                codecInfos = mediaCodecInfoArr;
                length = i;
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable th7) {
            if (p.a()) {
                this.b.a("DataCollector", "Failed to get MediaCodecList", th7);
            }
            return new JSONArray();
        }
    }

    public static String J() {
        return k;
    }

    private Map L() {
        return q7.a(a((Map) null, true, false));
    }

    private boolean O() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Boolean P() {
        if (p0.g()) {
            return null;
        }
        return Boolean.valueOf(!CollectionUtils.isEmpty(q7.a("/proc/net/tcp", Collections.singletonList(":69A2"), this.a)));
    }

    private boolean Q() {
        ConnectivityManager connectivityManager;
        if (p0.d() && (connectivityManager = (ConnectivityManager) this.c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.a.Q();
                if (p.a()) {
                    this.a.Q().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private boolean R() {
        boolean z = this.c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.c.getPackageManager();
        return z && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    private Boolean S() {
        if (p0.e()) {
            return Boolean.valueOf(this.c.getResources().getConfiguration().isScreenHdr());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.i.set(s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        Map Y = Y();
        List X = X();
        synchronized (this.g) {
            if (Y != null) {
                try {
                    this.f.putAll(Y);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (X != null) {
                this.f.put("dl", X);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        JSONArray F = F();
        synchronized (this.e) {
            this.d.put("video_decoders", F);
        }
    }

    private List X() {
        List c2 = this.a.c(z4.M4);
        if (CollectionUtils.isEmpty(c2)) {
            return null;
        }
        return q7.a("/proc/self/maps", c2, this.a);
    }

    private Map Y() {
        boolean z;
        int i;
        Throwable th;
        if (!((Boolean) this.a.a(z4.L4)).booleanValue()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            z = false;
            i = 0;
            while (it.hasNext()) {
                try {
                    for (StackTraceElement stackTraceElement : it.next().getValue()) {
                        String stackTraceElement2 = stackTraceElement.toString();
                        if (!z && stackTraceElement2.contains("de.robv.android.xposed")) {
                            z = true;
                        }
                        if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                            i++;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.a.E().b("DataCollector", "collectHookingSignals", th);
                    hashMap.put("xpd", Boolean.valueOf(z));
                    hashMap.put("zi_count", Integer.valueOf(i));
                    CollectionUtils.putBooleanIfValid("fpd", P(), hashMap);
                    return hashMap;
                }
            }
        } catch (Throwable th3) {
            z = false;
            i = 0;
            th = th3;
        }
        hashMap.put("xpd", Boolean.valueOf(z));
        hashMap.put("zi_count", Integer.valueOf(i));
        CollectionUtils.putBooleanIfValid("fpd", P(), hashMap);
        return hashMap;
    }

    private void a0() {
        this.a.s0().a((k5) new u6(this.a, "collectPostInitAppInfo", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                m.this.V();
            }
        }), f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String I = I();
            if (StringUtils.isValidString(I)) {
                this.a.Q();
                if (p.a()) {
                    this.a.Q().a("DataCollector", "Successfully retrieved bid token");
                }
                v2.a(appLovinBidTokenCollectionListener, I);
                return;
            }
            this.a.Q();
            if (p.a()) {
                this.a.Q().b("DataCollector", "Empty bid token");
            }
            v2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (p.a()) {
                this.b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.a.E().a("DataCollector", "collectBidToken", th);
            v2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private void b0() {
        this.a.s0().a((k5) new u6(this.a, "collectVideoDecodersInfo", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                m.this.W();
            }
        }), f6.b.OTHER);
    }

    private Map c(PackageInfo packageInfo) {
        HashMap hashMap = null;
        if (packageInfo == null) {
            return null;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && iArr != null && strArr.length != 0 && strArr.length == iArr.length) {
            hashMap = new HashMap();
            for (int i = 0; i < strArr.length; i++) {
                CollectionUtils.putIntegerIfValid(strArr[i], Integer.valueOf(iArr[i]), hashMap);
            }
        }
        return hashMap;
    }

    private List d(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        if (p0.f()) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                return a(signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory());
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                return a(signatureArr);
            }
        }
        return null;
    }

    private List g() {
        ActivityManager activityManager;
        if (!p0.b()) {
            return null;
        }
        Integer num = (Integer) this.a.a(z4.F4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.c.getSystemService("activity")) == null) {
            return null;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(((Boolean) this.a.a(z4.G4)).booleanValue() ? this.c.getPackageName() : null, 0, num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessExitReasons)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            HashMap hashMap = new HashMap(13);
            int reason = applicationExitInfo.getReason();
            hashMap.put("reason", Integer.valueOf(reason));
            String description = applicationExitInfo.getDescription();
            CollectionUtils.putStringIfValid("description", description, hashMap);
            hashMap.put("timestamp", Long.valueOf(applicationExitInfo.getTimestamp()));
            hashMap.put("status", Integer.valueOf(applicationExitInfo.getStatus()));
            hashMap.put("importance", Integer.valueOf(applicationExitInfo.getImportance()));
            hashMap.put("pss", Long.valueOf(applicationExitInfo.getPss()));
            hashMap.put("rss", Long.valueOf(applicationExitInfo.getRss()));
            CollectionUtils.putStringIfValid("process_name", applicationExitInfo.getProcessName(), hashMap);
            hashMap.put("pid", Integer.valueOf(applicationExitInfo.getPid()));
            hashMap.put("ruid", Integer.valueOf(applicationExitInfo.getRealUid()));
            hashMap.put("puid", Integer.valueOf(applicationExitInfo.getPackageUid()));
            hashMap.put("duid", Integer.valueOf(applicationExitInfo.getDefiningUid()));
            String a2 = a(applicationExitInfo, reason);
            if (StringUtils.isValidString(a2)) {
                hashMap.put("stack_trace", a2);
                b(a2, reason, description);
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    private List i() {
        ActivityManager activityManager;
        if (!p0.c()) {
            return null;
        }
        Integer num = (Integer) this.a.a(z4.E4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.c.getSystemService("activity")) == null) {
            return null;
        }
        List<ApplicationStartInfo> historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessStartReasons)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(historicalProcessStartReasons.size());
        for (ApplicationStartInfo applicationStartInfo : historicalProcessStartReasons) {
            HashMap hashMap = new HashMap(11);
            hashMap.put("reason", Integer.valueOf(applicationStartInfo.getReason()));
            hashMap.put("startup_state", Integer.valueOf(applicationStartInfo.getStartupState()));
            hashMap.put(App.JsonKeys.START_TYPE, Integer.valueOf(applicationStartInfo.getStartType()));
            hashMap.put("was_force_stopped", Boolean.valueOf(applicationStartInfo.wasForceStopped()));
            hashMap.put("startup_timestamps", applicationStartInfo.getStartupTimestamps());
            CollectionUtils.putStringIfValid("process_name", applicationStartInfo.getProcessName(), hashMap);
            hashMap.put("pid", Integer.valueOf(applicationStartInfo.getPid()));
            hashMap.put("ruid", Integer.valueOf(applicationStartInfo.getRealUid()));
            hashMap.put("puid", Integer.valueOf(applicationStartInfo.getPackageUid()));
            hashMap.put("duid", Integer.valueOf(applicationStartInfo.getDefiningUid()));
            hashMap.put("launch_mode", Integer.valueOf(applicationStartInfo.getLaunchMode()));
            hashMap.put(SDKConstants.PARAM_INTENT, a(applicationStartInfo.getIntent()));
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    private c j() {
        c cVar = new c();
        Intent registerReceiver = this.c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.b = -1;
        } else {
            cVar.b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        cVar.c = Boolean.valueOf(Settings.Global.getInt(this.c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    private long k() {
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Long l2 = (Long) this.a.a(z4.K4);
        return (currentTimeMillis / l2.longValue()) * l2.longValue();
    }

    private String l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!p.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private String n() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String o() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.u));
        ResolveInfo resolveActivity = this.c.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
            k = activityInfo.packageName;
        }
        return k;
    }

    private String q() {
        if (!p0.d()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.c.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                sb.append(locales.get(i));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Map r() {
        HashMap hashMap = new HashMap();
        JSONObject deserialize = JsonUtils.deserialize((String) this.a.a(z4.N4));
        if (JsonUtils.isValid(deserialize)) {
            hashMap.putAll(a(deserialize, new d() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda3
                @Override // com.applovin.impl.sdk.m.d
                public final String a(ContentResolver contentResolver, String str) {
                    String string;
                    string = Settings.System.getString(contentResolver, str);
                    return string;
                }
            }));
        }
        JSONObject deserialize2 = JsonUtils.deserialize((String) this.a.a(z4.O4));
        if (JsonUtils.isValid(deserialize2)) {
            hashMap.putAll(a(deserialize2, new d() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda4
                @Override // com.applovin.impl.sdk.m.d
                public final String a(ContentResolver contentResolver, String str) {
                    String string;
                    string = Settings.Secure.getString(contentResolver, str);
                    return string;
                }
            }));
        }
        JSONObject deserialize3 = JsonUtils.deserialize((String) this.a.a(z4.P4));
        if (JsonUtils.isValid(deserialize3)) {
            hashMap.putAll(a(deserialize3, new d() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda5
                @Override // com.applovin.impl.sdk.m.d
                public final String a(ContentResolver contentResolver, String str) {
                    String string;
                    string = Settings.Global.getString(contentResolver, str);
                    return string;
                }
            }));
        }
        return hashMap;
    }

    private Float s() {
        Float f = (Float) this.a.a(z4.g4);
        Float b2 = this.a.q().b();
        if (b2 != null) {
            return Float.valueOf(b2.floatValue() * f.floatValue());
        }
        return null;
    }

    private float t() {
        try {
            return Settings.System.getFloat(this.c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (!p.a()) {
                return -1.0f;
            }
            this.b.a("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    private boolean u() {
        SensorManager sensorManager = (SensorManager) this.c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map v() {
        HashMap hashMap = new HashMap();
        CollectionUtils.putIntegerIfValid(Cookie.IABTCF_GDPR_APPLIES, this.a.t0().g(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.a.t0().j(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.a.t0().c(), hashMap);
        return hashMap;
    }

    private Boolean w() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean x() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String y() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!p.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String z() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!p.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    public String A() {
        return AppLovinSdkUtils.isFireOS(this.c) ? "fireos" : "android";
    }

    public Map G() {
        Map map;
        synchronized (this.g) {
            map = CollectionUtils.map(this.f);
        }
        String str = StringUtils.isValidString(j) ? j : this.c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.a.E0()));
        map.put("first_install_v2", Boolean.valueOf(!this.a.B0()));
        map.put("app_launch_count", Long.valueOf(this.a.O()));
        CollectionUtils.putLongIfValid("last_launch_ms", this.a.N(), map);
        map.put("test_ads", Boolean.valueOf(this.h));
        map.put("test_mode", Integer.valueOf(this.a.u0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.a.p0().isMuted()));
        if (((Boolean) this.a.a(z4.G3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.a.y0().e(), map);
        }
        if (((Boolean) this.a.a(z4.J3)).booleanValue()) {
            map.put("compass_random_token", this.a.v());
        }
        if (((Boolean) this.a.a(z4.L3)).booleanValue()) {
            map.put("applovin_random_token", this.a.j0());
        }
        if (((Boolean) this.a.a(z4.P3)).booleanValue()) {
            map.put("art", this.a.s());
        }
        map.putAll(v());
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.a.r0().a(b5.T, null), map);
        return map;
    }

    public b H() {
        return (b) m.get();
    }

    protected String I() {
        String encodeToString = Base64.encodeToString(new JSONObject(L()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.a.a(z4.r5)).booleanValue() ? w4.b(encodeToString, q7.a(this.a), w4.a.a(((Integer) this.a.a(z4.s5)).intValue()), this.a) : encodeToString;
    }

    public String K() {
        ActivityManager activityManager = (ActivityManager) this.c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map M() {
        Map map;
        synchronized (this.g) {
            map = CollectionUtils.map(this.f);
        }
        return map;
    }

    public Map N() {
        Map map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.d);
        }
        return map;
    }

    public boolean T() {
        return this.h;
    }

    public void Z() {
        f6 s0 = this.a.s0();
        q5 q5Var = new q5(this.a, new a());
        f6.b bVar = f6.b.OTHER;
        s0.a((k5) q5Var, bVar);
        this.a.s0().a((k5) new u6(this.a, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                m.this.U();
            }
        }), bVar);
    }

    public void c0() {
        synchronized (this.e) {
            a(this.d);
        }
        a0();
    }

    public Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sc", this.a.a(z4.l));
        hashMap.put("sc2", this.a.a(z4.m));
        hashMap.put("sc3", this.a.a(z4.n));
        hashMap.put("server_installed_at", this.a.a(z4.o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.a.a(b5.H), hashMap);
        return hashMap;
    }

    public v.a f() {
        v.a b2 = v.b(this.c);
        if (b2 == null) {
            return new v.a();
        }
        if (((Boolean) this.a.a(z4.E3)).booleanValue()) {
            if (b2.c() && !((Boolean) this.a.a(z4.D3)).booleanValue()) {
                b2.a("");
            }
            l.set(b2);
        } else {
            b2 = new v.a();
        }
        List<String> testDeviceAdvertisingIds = this.a.L() != null ? this.a.L().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds == null) {
            this.h = false;
            return b2;
        }
        String a2 = b2.a();
        if (StringUtils.isValidString(a2)) {
            this.h = testDeviceAdvertisingIds.contains(a2);
        }
        b H = H();
        String str = H != null ? H.a : null;
        if (StringUtils.isValidString(str)) {
            this.h = testDeviceAdvertisingIds.contains(str) | this.h;
        }
        return b2;
    }

    public Map m() {
        HashMap hashMap = new HashMap();
        e4 f0 = this.a.f0();
        Deque b2 = f0.b();
        if (!CollectionUtils.isEmpty(b2)) {
            hashMap.put("network_throughput_info", b2);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", f0.a(), hashMap);
        r0.d a2 = this.a.x().a();
        if (a2 != null) {
            hashMap.put("lrm_ts_ms", String.valueOf(a2.c()));
            hashMap.put("lrm_url", a2.d());
            hashMap.put("lrm_ct_ms", String.valueOf(a2.a()));
            hashMap.put("lrm_rs", String.valueOf(a2.b()));
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public Map p() {
        return a(false);
    }

    private String h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.c);
        return orientation == 1 ? X3.i.D : orientation == 2 ? X3.i.C : "none";
    }

    protected void a(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.a.s0().a((k5) new u6(this.a, ((Boolean) this.a.a(z4.T3)).booleanValue(), "DataCollector", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                m.this.b(appLovinBidTokenCollectionListener);
            }
        }), f6.b.CORE);
    }

    public Map a(Map map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap(64);
        Map a2 = a(z);
        Map G = G();
        Map m2 = m();
        Map m0 = this.a.m0();
        if (z2) {
            hashMap.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, a2);
            hashMap.put("app_info", G);
            if (m2 != null) {
                hashMap.put("connection_info", m2);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(m0)) {
                hashMap.put("segments", m0);
            }
        } else {
            hashMap.putAll(a2);
            hashMap.putAll(G);
            if (m2 != null) {
                hashMap.putAll(m2);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!CollectionUtils.isEmpty(m0)) {
                hashMap.putAll(m0);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.a.X(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.a.D(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.a.a(z4.R3), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.a.v0()), hashMap);
        if (!((Boolean) this.a.a(z4.p5)).booleanValue()) {
            hashMap.put("sdk_key", this.a.k0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.a.r(), hashMap);
        hashMap.putAll(e());
        hashMap.put(com.safedk.android.analytics.brandsafety.m.x, UUID.randomUUID().toString());
        return hashMap;
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(c(strArr[i])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long d() {
        long j2;
        int b2;
        int b3;
        int b4;
        long j3;
        long j4;
        long j5;
        String emptyIfNull = StringUtils.emptyIfNull(Settings.Secure.getString(this.c.getContentResolver(), "enabled_accessibility_services"));
        long j6 = emptyIfNull.contains("AccessibilityMenuService") ? 256L : 0L;
        if (emptyIfNull.contains("SelectToSpeakService")) {
            j6 |= 512;
        }
        if (emptyIfNull.contains("SoundAmplifierService")) {
            j6 |= 2;
        }
        if (emptyIfNull.contains("SpeechToTextAccessibilityService")) {
            j6 |= 128;
        }
        if (emptyIfNull.contains("SwitchAccessService")) {
            j6 |= 4;
        }
        if ((this.c.getResources().getConfiguration().uiMode & 48) == 32) {
            j6 |= 1024;
        }
        if (a("accessibility_enabled")) {
            j6 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j6 |= 16;
        }
        if (a(AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_INVERSION_ENABLED)) {
            j6 |= 32;
        }
        if (a("skip_first_use_hints")) {
            j6 |= 64;
        }
        if (a("lock_screen_allow_remote_input")) {
            j6 |= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        if (a("enabled_accessibility_audio_description_by_default")) {
            j6 |= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        if (a("accessibility_shortcut_on_lock_screen")) {
            j6 |= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        if (a("wear_talkback_enabled")) {
            j6 |= 16384;
        }
        if (a("hush_gesture_used")) {
            j6 |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
        }
        if (a("high_text_contrast_enabled")) {
            j6 |= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        }
        if (a("accessibility_display_magnification_enabled")) {
            j6 |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
        }
        if (a("accessibility_display_magnification_navbar_enabled")) {
            j6 |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        }
        if (a("accessibility_captioning_enabled")) {
            j6 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        }
        if (a(AndroidDynamicDeviceInfoDataSource.SETTING_ACCESSIBILITY_DISPLAY_DALTONIZER_ENABLED)) {
            j6 |= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        if (a("accessibility_autoclick_enabled")) {
            j6 |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
        }
        if (a("accessibility_large_pointer_icon")) {
            j6 |= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;
        }
        if (a("reduce_bright_colors_activated")) {
            j6 |= 8388608;
        }
        if (a("reduce_bright_colors_persist_across_reboots")) {
            j6 |= 16777216;
        }
        if (a("tty_mode_enabled")) {
            j6 |= 33554432;
        }
        if (a("rtt_calling_mode")) {
            j6 |= 67108864;
        }
        if (a("accessibility_floating_menu_fade_enabled")) {
            j6 |= 134217728;
        }
        if (a("accessibility_show_window_magnification_prompt")) {
            j6 |= 268435456;
        }
        if (a("accessibility_floating_menu_migration_tooltip_prompt")) {
            j6 |= 536870912;
        }
        int b5 = b("accessibility_magnification_mode");
        if (b5 == 0) {
            j2 = 1073741824;
        } else if (b5 == 1) {
            j2 = 2147483648L;
        } else {
            if (b5 != 2) {
                if (b5 == 3) {
                    j2 = 8589934592L;
                }
                b2 = b("accessibility_button_mode");
                if (b2 == 0) {
                    j5 = b2 == 1 ? 34359738368L : 17179869184L;
                    b3 = b("accessibility_floating_menu_size");
                    if (b3 != 0) {
                        j4 = b3 == 1 ? 137438953472L : 68719476736L;
                        b4 = b("accessibility_floating_menu_icon_type");
                        if (b4 != 0) {
                            j3 = 274877906944L;
                        } else {
                            if (b4 != 1) {
                                return j6;
                            }
                            j3 = 549755813888L;
                        }
                        return j6 | j3;
                    }
                    j6 |= j4;
                    b4 = b("accessibility_floating_menu_icon_type");
                    if (b4 != 0) {
                    }
                    return j6 | j3;
                }
                j6 |= j5;
                b3 = b("accessibility_floating_menu_size");
                if (b3 != 0) {
                }
                j6 |= j4;
                b4 = b("accessibility_floating_menu_icon_type");
                if (b4 != 0) {
                }
                return j6 | j3;
            }
            j2 = 4294967296L;
        }
        j6 |= j2;
        b2 = b("accessibility_button_mode");
        if (b2 == 0) {
        }
        j6 |= j5;
        b3 = b("accessibility_floating_menu_size");
        if (b3 != 0) {
        }
        j6 |= j4;
        b4 = b("accessibility_floating_menu_icon_type");
        if (b4 != 0) {
        }
        return j6 | j3;
    }

    private List b(PackageInfo packageInfo) {
        FeatureInfo[] featureInfoArr;
        if (packageInfo == null || (featureInfoArr = packageInfo.reqFeatures) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : featureInfoArr) {
            arrayList.add(featureInfo.name);
        }
        return arrayList;
    }

    private void b(final String str, final int i, final String str2) {
        this.a.s0().a((k5) new u6(this.a, "reportAppExitInfoStackTrace", new Runnable() { // from class: com.applovin.impl.sdk.m$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                m.this.a(str, i, str2);
            }
        }), f6.b.OTHER);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    private Map a(boolean z) {
        Map map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.d);
        }
        return a(map, z);
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = 9; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    private void a(Map map) {
        if (((Boolean) this.a.a(z4.a4)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.a.a(z4.b4)).booleanValue() && !map.containsKey(ContentType.Font.TYPE)) {
            map.put(ContentType.Font.TYPE, Float.valueOf(t()));
        }
        if (((Boolean) this.a.a(z4.i4)).booleanValue() && q7.d(this.a)) {
            o8.a(this.a);
        }
        if (((Boolean) this.a.a(z4.t4)).booleanValue()) {
            o8.b(this.a);
        }
        if (((Boolean) this.a.a(z4.h4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.a.a(z4.d4)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(Q()));
        }
        map.put("is_pc", Boolean.valueOf(R()));
        if (((Boolean) this.a.a(z4.v4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", K(), map);
        }
        if (((Boolean) this.a.a(z4.O6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", o(), map);
        }
        if (!((Boolean) this.a.a(z4.P6)).booleanValue() || map.containsKey("video_decoders")) {
            return;
        }
        b0();
    }

    private Map a(Map map, boolean z) {
        v.a f;
        Map map2 = CollectionUtils.map(map);
        Point b2 = p0.b(this.c);
        map2.put("dx", Integer.valueOf(b2.x));
        map2.put("dy", Integer.valueOf(b2.y));
        if (this.c.getResources().getDisplayMetrics() != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(b2.x, 2.0d) + Math.pow(b2.y, 2.0d)) / r4.xdpi));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.c)));
        if (((Boolean) this.a.a(z4.J4)).booleanValue()) {
            String b3 = q7.b(this.c);
            Map a2 = p0.a(b3);
            if (a2 != null) {
                map2.put("display_cutout_insets", a2);
            }
            Map c2 = p0.c(b3);
            if (c2 != null) {
                map2.put("status_bar_insets", c2);
            }
            Map b4 = p0.b(b3);
            if (b4 != null) {
                map2.put("nav_bar_insets", b4);
            }
        }
        if (z) {
            f = (v.a) l.get();
            if (f != null) {
                Z();
            } else if (q7.i()) {
                f = new v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                f = f();
            }
        } else {
            f = f();
        }
        String a3 = f.a();
        if (StringUtils.isValidString(a3)) {
            map2.put("idfa", a3);
        }
        map2.put("dnt", Boolean.valueOf(f.c()));
        map2.put("dnt_code", f.b().b());
        b bVar = (b) m.get();
        if (((Boolean) this.a.a(z4.F3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.a);
            map2.put("idfv_scope", Integer.valueOf(bVar.b));
        }
        Boolean b5 = q0.b().b(this.c);
        if (b5 != null) {
            map2.put("huc", b5);
        }
        Boolean b6 = q0.c().b(this.c);
        if (b6 != null) {
            map2.put("aru", b6);
        }
        Boolean b7 = q0.a().b(this.c);
        if (b7 != null) {
            map2.put("dns", b7);
        }
        if (((Boolean) this.a.a(z4.U3)).booleanValue()) {
            c j2 = j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(j2.a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(j2.b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", j2.c, map2);
        }
        if (((Boolean) this.a.a(z4.c4)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.a.o0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.a.a(z4.f4)).booleanValue()) {
            map2.put(com.safedk.android.analytics.brandsafety.m.C, Boolean.valueOf(O()));
        }
        Float s = z ? (Float) this.i.get() : s();
        if (s != null) {
            map2.put("volume", s);
        }
        CollectionUtils.putBooleanIfValid("ma", w(), map2);
        CollectionUtils.putBooleanIfValid("spo", x(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.a.o0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.a.o0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.a.o0().getAppEnteredBackgroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("abd_ms", Long.valueOf(this.a.o0().getTotalBackgroundDurationMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e) {
            if (p.a()) {
                this.b.a("DataCollector", "Unable to collect screen brightness", e);
            }
        }
        if (((Boolean) this.a.a(z4.i4)).booleanValue() && q7.d(this.a)) {
            o8.a(this.a);
            String a4 = o8.a();
            if (StringUtils.isValidString(a4)) {
                map2.put(M6.d0, a4);
            }
        }
        if (((Boolean) this.a.a(z4.t4)).booleanValue()) {
            o8.b(this.a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(o8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", o8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", o8.b(), map2);
        }
        if (((Boolean) this.a.a(z4.W3)).booleanValue()) {
            try {
                map2.put(M6.W0, Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put(M6.W0, -1);
                map2.put("tds", -1);
                if (p.a()) {
                    this.b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.a.a(z4.X3)).booleanValue()) {
            ActivityManager.MemoryInfo a5 = q7.a((ActivityManager) this.c.getSystemService("activity"));
            if (a5 != null) {
                map2.put("fm", Long.valueOf(a5.availMem));
                map2.put("tm", Long.valueOf(a5.totalMem));
                map2.put("lmt", Long.valueOf(a5.threshold));
                map2.put("lm", Boolean.valueOf(a5.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.a.a(z4.Y3)).booleanValue() && p0.a("android.permission.READ_PHONE_STATE", this.c) && p0.d()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.c.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getDataNetworkType()));
        }
        if (((Boolean) this.a.a(z4.V3)).booleanValue()) {
            String B = B();
            if (!TextUtils.isEmpty(B)) {
                map2.put("so", B);
            }
        }
        map2.put(BrandSafetyEvent.aw, q7.b(this.c));
        map2.put("orientation_lock", h());
        if (((Boolean) this.a.a(z4.Z3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(q7.k()));
        }
        PowerManager powerManager = (PowerManager) this.c.getSystemService("power");
        if (powerManager != null) {
            map2.put(M6.b1, Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.a.a(z4.k4)).booleanValue() && this.a.n0() != null) {
            map2.put("da", Float.valueOf(this.a.n0().a()));
        }
        if (((Boolean) this.a.a(z4.l4)).booleanValue() && this.a.n0() != null) {
            map2.put("dm", Float.valueOf(this.a.n0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.a.q().c()));
        map2.put("network", s0.g(this.a));
        String q = q();
        if (StringUtils.isValidString(q)) {
            map2.put("kb", q);
        }
        Map r = r();
        if (!CollectionUtils.isEmpty(r)) {
            map2.put("ds", r);
        }
        return map2;
    }

    private List a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                arrayList.add(StringUtils.toHexString(messageDigest.digest()));
            }
        } catch (Throwable th) {
            this.a.E().b("DataCollector", "parseSignatures", th);
        }
        return arrayList;
    }

    private List a(PackageInfo packageInfo) {
        InstrumentationInfo[] instrumentationInfoArr;
        if (packageInfo == null || (instrumentationInfoArr = packageInfo.instrumentation) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InstrumentationInfo instrumentationInfo : instrumentationInfoArr) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", instrumentationInfo.name);
            hashMap.put("hp", Boolean.valueOf(instrumentationInfo.handleProfiling));
            hashMap.put("ft", Boolean.valueOf(instrumentationInfo.functionalTest));
            hashMap.put("t_pa", instrumentationInfo.targetPackage);
            if (p0.e()) {
                hashMap.put("t_pr", instrumentationInfo.targetProcesses);
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    private Map a(Intent intent) {
        if (intent == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(5);
        hashMap.put("action", StringUtils.emptyIfNull(intent.getAction()));
        hashMap.put("data", StringUtils.emptyIfNull(intent.getDataString()));
        hashMap.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        hashMap.put("component", component != null ? component.flattenToString() : "");
        Set<String> categories = intent.getCategories();
        hashMap.put("categories", categories != null ? new ArrayList(categories) : Collections.emptyList());
        return hashMap;
    }

    private String a(ApplicationExitInfo applicationExitInfo, int i) {
        InputStream inputStream;
        String readLine;
        if (this.a.c(z4.I4).contains(Integer.toString(i))) {
            return null;
        }
        Integer num = (Integer) this.a.a(z4.H4);
        if (num.intValue() <= 0) {
            return null;
        }
        try {
            inputStream = applicationExitInfo.getTraceInputStream();
        } catch (Throwable th) {
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("DataCollector", "Failed to obtain trace input stream from application exit info", th);
            }
            this.a.E().b("DataCollector", "getTraceInputStream", th);
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            for (int i2 = 0; i2 < num.intValue() && (readLine = bufferedReader.readLine()) != null; i2++) {
                try {
                    sb.append(readLine).append('\n');
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th2) {
            this.a.Q();
            if (p.a()) {
                this.a.Q().a("DataCollector", "Failed to read stack trace from input stream", th2);
            }
            this.a.E().b("DataCollector", "readStackTraceFromInputStream", th2);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i, String str2) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(i), hashMap);
        CollectionUtils.putStringIfValid("error_message", str2, hashMap);
        this.a.E().d(f2.P0, hashMap);
    }

    public static void a(v.a aVar) {
        l.set(aVar);
    }

    public static void a(b bVar) {
        m.set(bVar);
    }

    public static void a(String str, l lVar) {
        String a2 = a(l.p().getApplicationInfo().packageName, l.p().getPackageManager(), lVar);
        List c2 = lVar.c(z4.i7);
        if (!StringUtils.isValidString(a2) || c2.contains(a2)) {
            j = str;
        }
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private Map a(JSONObject jSONObject, d dVar) {
        ContentResolver contentResolver = this.c.getContentResolver();
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = JsonUtils.getString(jSONObject, next, null);
            if (StringUtils.isValidString(string)) {
                hashMap.put(next, StringUtils.emptyIfNull(a(dVar, contentResolver, string)));
            }
        }
        return hashMap;
    }

    private String a(d dVar, ContentResolver contentResolver, String str) {
        try {
            return dVar.a(contentResolver, str);
        } catch (Throwable th) {
            this.a.E().a("DataCollector", "retrieveSystemSettingValue", th, CollectionUtils.hashMap("details", str));
            return null;
        }
    }

    private String a(String str, PackageManager packageManager) {
        if (!p0.b()) {
            return null;
        }
        try {
            return packageManager.getInstallSourceInfo(str).getOriginatingPackageName();
        } catch (Throwable th) {
            this.a.E().b("DataCollector", "getOriginatingName", th);
            return null;
        }
    }

    private static String a(String str, PackageManager packageManager, l lVar) {
        try {
            if (p0.b()) {
                return packageManager.getInstallSourceInfo(str).getInstallingPackageName();
            }
            return packageManager.getInstallerPackageName(str);
        } catch (Throwable th) {
            lVar.E().b("DataCollector", "getInstallerName", th);
            return null;
        }
    }
}
