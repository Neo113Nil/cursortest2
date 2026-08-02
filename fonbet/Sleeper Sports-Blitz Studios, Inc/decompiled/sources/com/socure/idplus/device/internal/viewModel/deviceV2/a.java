package com.socure.idplus.device.internal.viewModel.deviceV2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.view.accessibility.CaptioningManager;
import com.socure.idplus.device.SigmaDeviceOptions;
import com.socure.idplus.device.context.SigmaDeviceContext;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.AndroidAttributes;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.Battery;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.DeviceMetadata;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.DeviceNetwork;
import com.socure.idplus.device.internal.utils.b;
import com.socure.idplus.device.internal.utils.c;
import com.socure.idplus.device.internal.utils.d;
import io.radar.sdk.RadarTrackingOptions;
import io.sentry.protocol.Device;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public abstract class a {
    /* JADX WARN: Can't wrap try/catch for region: R(39:0|1|(2:3|(2:4|(2:6|(1:9)(1:8))(3:10|11|(1:15)(0))))(0)|120|16|(6:17|18|(1:20)(1:118)|(1:22)(1:117)|23|24)|(32:26|27|28|(3:32|33|(28:35|36|(3:38|(1:40)(1:110)|(24:44|45|(1:109)(1:49)|50|(1:52)(1:108)|53|(3:55|(3:57|(2:59|(1:61)(1:102))(2:104|105)|103)|106)|107|62|(1:64)(1:101)|65|(2:67|(2:69|(1:71)(1:98))(1:99))(1:100)|72|(1:74)(1:97)|(1:76)(1:96)|77|78|79|(3:81|82|83)|85|86|87|82|83))|111|45|(1:47)|109|50|(0)(0)|53|(0)|107|62|(0)(0)|65|(0)(0)|72|(0)(0)|(0)(0)|77|78|79|(0)|85|86|87|82|83))|113|36|(0)|111|45|(0)|109|50|(0)(0)|53|(0)|107|62|(0)(0)|65|(0)(0)|72|(0)(0)|(0)(0)|77|78|79|(0)|85|86|87|82|83)|115|27|28|(4:30|32|33|(0))|113|36|(0)|111|45|(0)|109|50|(0)(0)|53|(0)|107|62|(0)(0)|65|(0)(0)|72|(0)(0)|(0)(0)|77|78|79|(0)|85|86|87|82|83) */
    /* JADX WARN: Can't wrap try/catch for region: R(44:0|1|(2:3|(2:4|(2:6|(1:9)(1:8))(3:10|11|(1:15)(0))))(0)|120|16|17|18|(1:20)(1:118)|(1:22)(1:117)|23|24|(32:26|27|28|(3:32|33|(28:35|36|(3:38|(1:40)(1:110)|(24:44|45|(1:109)(1:49)|50|(1:52)(1:108)|53|(3:55|(3:57|(2:59|(1:61)(1:102))(2:104|105)|103)|106)|107|62|(1:64)(1:101)|65|(2:67|(2:69|(1:71)(1:98))(1:99))(1:100)|72|(1:74)(1:97)|(1:76)(1:96)|77|78|79|(3:81|82|83)|85|86|87|82|83))|111|45|(1:47)|109|50|(0)(0)|53|(0)|107|62|(0)(0)|65|(0)(0)|72|(0)(0)|(0)(0)|77|78|79|(0)|85|86|87|82|83))|113|36|(0)|111|45|(0)|109|50|(0)(0)|53|(0)|107|62|(0)(0)|65|(0)(0)|72|(0)(0)|(0)(0)|77|78|79|(0)|85|86|87|82|83)|115|27|28|(4:30|32|33|(0))|113|36|(0)|111|45|(0)|109|50|(0)(0)|53|(0)|107|62|(0)(0)|65|(0)(0)|72|(0)(0)|(0)(0)|77|78|79|(0)|85|86|87|82|83) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d6, code lost:
    
        r0 = java.lang.String.valueOf(r0.getMessage());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ApplicationTypeChecker", "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "msg");
        r0 = com.socure.idplus.device.internal.logger.a.f870a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f0, code lost:
    
        if (com.socure.idplus.device.internal.common.utils.a.a(r47) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02f2, code lost:
    
        r0 = com.socure.idplus.device.internal.utils.a.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f5, code lost:
    
        r0 = com.socure.idplus.device.internal.utils.a.e;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DeviceMetadata a(Context context, SigmaDeviceContext sigmaDeviceContext, SigmaDeviceOptions options) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        com.socure.idplus.device.internal.utils.a aVar;
        Configuration configuration;
        String ssid;
        Float valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sigmaDeviceContext, "sigmaDeviceContext");
        Intrinsics.checkNotNullParameter(options, "options");
        Locale.setDefault(Locale.getDefault());
        Object systemService = context.getSystemService("captioning");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
        CaptioningManager captioningManager = (CaptioningManager) systemService;
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        if (!b.a()) {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
            int i = 0;
            while (true) {
                if (i >= 10) {
                    String str3 = Build.TAGS;
                    if (str3 == null || !StringsKt.contains$default((CharSequence) str3, (CharSequence) "test-keys", false, 2, (Object) null)) {
                        z = false;
                    }
                } else {
                    if (new File(strArr[i]).exists()) {
                        break;
                    }
                    i++;
                }
            }
        }
        z = true;
        String str4 = Build.FINGERPRINT;
        String str5 = Build.BRAND;
        String str6 = Build.DEVICE;
        String str7 = Build.HARDWARE;
        String str8 = Build.PRODUCT;
        Intrinsics.checkNotNull(calendar);
        String a2 = c.a(calendar);
        String b = c.b(context);
        String a3 = c.a(context);
        boolean isEnabled = captioningManager.isEnabled();
        try {
            Resources resources = context.getResources();
            Configuration configuration2 = resources != null ? resources.getConfiguration() : null;
            valueOf = configuration2 != null ? Float.valueOf(configuration2.fontScale) : null;
            Intrinsics.checkNotNull(valueOf);
        } catch (Exception unused) {
        }
        if (valueOf.floatValue() > 1.0f) {
            z2 = true;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale") == 0.0f && Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale") == 0.0f) {
                if (Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale") == 0.0f) {
                    z3 = true;
                    String advertisingID = options.getAdvertisingID();
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.c, context)) {
                        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                        WifiInfo connectionInfo = wifiManager != null ? wifiManager.getConnectionInfo() : null;
                        if (connectionInfo != null && (ssid = connectionInfo.getSSID()) != null) {
                            str = StringsKt.replace$default(ssid, "\"", "", false, 4, (Object) null);
                            ArrayList a4 = d.a(context);
                            Intrinsics.checkNotNull(str4);
                            Intrinsics.checkNotNull(str5);
                            Intrinsics.checkNotNull(str6);
                            Intrinsics.checkNotNull(str7);
                            Intrinsics.checkNotNull(str8);
                            AndroidAttributes androidAttributes = new AndroidAttributes(z, str4, str5, str6, str7, str8, a2, b, a3, advertisingID, isEnabled, z2, z3, str, a4);
                            String RELEASE = Build.VERSION.RELEASE;
                            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                            String MODEL = Build.MODEL;
                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                            String MANUFACTURER = Build.MANUFACTURER;
                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                            Resources resources2 = context.getResources();
                            Integer valueOf2 = (resources2 != null || (configuration = resources2.getConfiguration()) == null) ? null : Integer.valueOf(configuration.screenLayout & 15);
                            Intrinsics.checkNotNull(valueOf2);
                            String str9 = valueOf2.intValue() < 3 ? "tablet" : "phone";
                            Intrinsics.checkNotNullParameter(context, "context");
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            Object systemService2 = context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
                            Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
                            ((ActivityManager) systemService2).getMemoryInfo(memoryInfo);
                            long j = 1024;
                            float rint = (float) Math.rint(memoryInfo.totalMem / ((1024 * j) * j));
                            String id = TimeZone.getDefault().getID();
                            Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
                            int offset = (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000) / 60;
                            String languageTag = Locale.getDefault().toLanguageTag();
                            Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
                            String lowerCase = languageTag.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
                            Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
                            String joinToString$default = ArraysKt.joinToString$default(SUPPORTED_ABIS, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
                            Intrinsics.checkNotNullParameter(context, "context");
                            if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.b, context)) {
                                Object systemService3 = context.getApplicationContext().getSystemService("connectivity");
                                Intrinsics.checkNotNull(systemService3, "null cannot be cast to non-null type android.net.ConnectivityManager");
                                ConnectivityManager connectivityManager = (ConnectivityManager) systemService3;
                                Network[] allNetworks = connectivityManager.getAllNetworks();
                                Intrinsics.checkNotNullExpressionValue(allNetworks, "getAllNetworks(...)");
                                int length = allNetworks.length;
                                int i2 = 0;
                                while (i2 < length) {
                                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i2]);
                                    str2 = RELEASE;
                                    if (networkCapabilities != null) {
                                        boolean hasTransport = networkCapabilities.hasTransport(4);
                                        z4 = true;
                                        if (hasTransport) {
                                            break;
                                        }
                                    }
                                    i2++;
                                    RELEASE = str2;
                                }
                            }
                            str2 = RELEASE;
                            z4 = false;
                            DeviceNetwork deviceNetwork = new DeviceNetwork(z4);
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                            int intExtra = registerReceiver == null ? registerReceiver.getIntExtra("status", -1) : -1;
                            Battery battery = new Battery(intExtra == 2 ? intExtra != 3 ? intExtra != 5 ? "unknown" : "full" : "unplugged" : Device.JsonKeys.CHARGING, (context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null ? Float.valueOf(r14.getIntExtra("level", -1) / r14.getIntExtra("scale", -1)) : null) == null ? Double.valueOf(r12.floatValue()) : null);
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(context, "context");
                            if (context.getClassLoader().loadClass("com.facebook.react.ReactActivity") != null) {
                                aVar = com.socure.idplus.device.internal.utils.a.b;
                                return new DeviceMetadata("4.5.1", null, null, str2, MODEL, MANUFACTURER, str9, rint, id, offset, lowerCase, joinToString$default, deviceNetwork, battery, aVar.f900a, sigmaDeviceContext.getValue(), androidAttributes, 6, null);
                            }
                            Class.forName("react.React");
                            aVar = com.socure.idplus.device.internal.utils.a.c;
                            return new DeviceMetadata("4.5.1", null, null, str2, MODEL, MANUFACTURER, str9, rint, id, offset, lowerCase, joinToString$default, deviceNetwork, battery, aVar.f900a, sigmaDeviceContext.getValue(), androidAttributes, 6, null);
                        }
                    }
                    str = null;
                    ArrayList a42 = d.a(context);
                    Intrinsics.checkNotNull(str4);
                    Intrinsics.checkNotNull(str5);
                    Intrinsics.checkNotNull(str6);
                    Intrinsics.checkNotNull(str7);
                    Intrinsics.checkNotNull(str8);
                    AndroidAttributes androidAttributes2 = new AndroidAttributes(z, str4, str5, str6, str7, str8, a2, b, a3, advertisingID, isEnabled, z2, z3, str, a42);
                    String RELEASE2 = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(RELEASE2, "RELEASE");
                    String MODEL2 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                    String MANUFACTURER2 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER2, "MANUFACTURER");
                    Resources resources22 = context.getResources();
                    if (resources22 != null) {
                    }
                    Intrinsics.checkNotNull(valueOf2);
                    String str92 = valueOf2.intValue() < 3 ? "tablet" : "phone";
                    Intrinsics.checkNotNullParameter(context, "context");
                    ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                    Object systemService22 = context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
                    Intrinsics.checkNotNull(systemService22, "null cannot be cast to non-null type android.app.ActivityManager");
                    ((ActivityManager) systemService22).getMemoryInfo(memoryInfo2);
                    long j2 = 1024;
                    float rint2 = (float) Math.rint(memoryInfo2.totalMem / ((1024 * j2) * j2));
                    String id2 = TimeZone.getDefault().getID();
                    Intrinsics.checkNotNullExpressionValue(id2, "getID(...)");
                    int offset2 = (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000) / 60;
                    String languageTag2 = Locale.getDefault().toLanguageTag();
                    Intrinsics.checkNotNullExpressionValue(languageTag2, "toLanguageTag(...)");
                    String lowerCase2 = languageTag2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    String[] SUPPORTED_ABIS2 = Build.SUPPORTED_ABIS;
                    Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS2, "SUPPORTED_ABIS");
                    String joinToString$default2 = ArraysKt.joinToString$default(SUPPORTED_ABIS2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.b, context)) {
                    }
                    str2 = RELEASE2;
                    z4 = false;
                    DeviceNetwork deviceNetwork2 = new DeviceNetwork(z4);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (registerReceiver2 == null) {
                    }
                    if (intExtra == 2) {
                    }
                    if (context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
                    }
                    Battery battery2 = new Battery(intExtra == 2 ? intExtra != 3 ? intExtra != 5 ? "unknown" : "full" : "unplugged" : Device.JsonKeys.CHARGING, (context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null ? Float.valueOf(r14.getIntExtra("level", -1) / r14.getIntExtra("scale", -1)) : null) == null ? Double.valueOf(r12.floatValue()) : null);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (context.getClassLoader().loadClass("com.facebook.react.ReactActivity") != null) {
                    }
                    Class.forName("react.React");
                    aVar = com.socure.idplus.device.internal.utils.a.c;
                    return new DeviceMetadata("4.5.1", null, null, str2, MODEL2, MANUFACTURER2, str92, rint2, id2, offset2, lowerCase2, joinToString$default2, deviceNetwork2, battery2, aVar.f900a, sigmaDeviceContext.getValue(), androidAttributes2, 6, null);
                }
            }
            z3 = false;
            String advertisingID2 = options.getAdvertisingID();
            Intrinsics.checkNotNullParameter(context, "context");
            if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.c, context)) {
            }
            str = null;
            ArrayList a422 = d.a(context);
            Intrinsics.checkNotNull(str4);
            Intrinsics.checkNotNull(str5);
            Intrinsics.checkNotNull(str6);
            Intrinsics.checkNotNull(str7);
            Intrinsics.checkNotNull(str8);
            AndroidAttributes androidAttributes22 = new AndroidAttributes(z, str4, str5, str6, str7, str8, a2, b, a3, advertisingID2, isEnabled, z2, z3, str, a422);
            String RELEASE22 = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE22, "RELEASE");
            String MODEL22 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL22, "MODEL");
            String MANUFACTURER22 = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER22, "MANUFACTURER");
            Resources resources222 = context.getResources();
            if (resources222 != null) {
            }
            Intrinsics.checkNotNull(valueOf2);
            String str922 = valueOf2.intValue() < 3 ? "tablet" : "phone";
            Intrinsics.checkNotNullParameter(context, "context");
            ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
            Object systemService222 = context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
            Intrinsics.checkNotNull(systemService222, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager) systemService222).getMemoryInfo(memoryInfo22);
            long j22 = 1024;
            float rint22 = (float) Math.rint(memoryInfo22.totalMem / ((1024 * j22) * j22));
            String id22 = TimeZone.getDefault().getID();
            Intrinsics.checkNotNullExpressionValue(id22, "getID(...)");
            int offset22 = (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000) / 60;
            String languageTag22 = Locale.getDefault().toLanguageTag();
            Intrinsics.checkNotNullExpressionValue(languageTag22, "toLanguageTag(...)");
            String lowerCase22 = languageTag22.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase22, "toLowerCase(...)");
            String[] SUPPORTED_ABIS22 = Build.SUPPORTED_ABIS;
            Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS22, "SUPPORTED_ABIS");
            String joinToString$default22 = ArraysKt.joinToString$default(SUPPORTED_ABIS22, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
            Intrinsics.checkNotNullParameter(context, "context");
            if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.b, context)) {
            }
            str2 = RELEASE22;
            z4 = false;
            DeviceNetwork deviceNetwork22 = new DeviceNetwork(z4);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            Intent registerReceiver22 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver22 == null) {
            }
            if (intExtra == 2) {
            }
            if (context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
            }
            Battery battery22 = new Battery(intExtra == 2 ? intExtra != 3 ? intExtra != 5 ? "unknown" : "full" : "unplugged" : Device.JsonKeys.CHARGING, (context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null ? Float.valueOf(r14.getIntExtra("level", -1) / r14.getIntExtra("scale", -1)) : null) == null ? Double.valueOf(r12.floatValue()) : null);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            if (context.getClassLoader().loadClass("com.facebook.react.ReactActivity") != null) {
            }
            Class.forName("react.React");
            aVar = com.socure.idplus.device.internal.utils.a.c;
            return new DeviceMetadata("4.5.1", null, null, str2, MODEL22, MANUFACTURER22, str922, rint22, id22, offset22, lowerCase22, joinToString$default22, deviceNetwork22, battery22, aVar.f900a, sigmaDeviceContext.getValue(), androidAttributes22, 6, null);
        }
        z2 = false;
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale") == 0.0f) {
            if (Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale") == 0.0f) {
            }
        }
        z3 = false;
        String advertisingID22 = options.getAdvertisingID();
        Intrinsics.checkNotNullParameter(context, "context");
        if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.c, context)) {
        }
        str = null;
        ArrayList a4222 = d.a(context);
        Intrinsics.checkNotNull(str4);
        Intrinsics.checkNotNull(str5);
        Intrinsics.checkNotNull(str6);
        Intrinsics.checkNotNull(str7);
        Intrinsics.checkNotNull(str8);
        AndroidAttributes androidAttributes222 = new AndroidAttributes(z, str4, str5, str6, str7, str8, a2, b, a3, advertisingID22, isEnabled, z2, z3, str, a4222);
        String RELEASE222 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE222, "RELEASE");
        String MODEL222 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL222, "MODEL");
        String MANUFACTURER222 = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER222, "MANUFACTURER");
        Resources resources2222 = context.getResources();
        if (resources2222 != null) {
        }
        Intrinsics.checkNotNull(valueOf2);
        String str9222 = valueOf2.intValue() < 3 ? "tablet" : "phone";
        Intrinsics.checkNotNullParameter(context, "context");
        ActivityManager.MemoryInfo memoryInfo222 = new ActivityManager.MemoryInfo();
        Object systemService2222 = context.getSystemService(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY);
        Intrinsics.checkNotNull(systemService2222, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) systemService2222).getMemoryInfo(memoryInfo222);
        long j222 = 1024;
        float rint222 = (float) Math.rint(memoryInfo222.totalMem / ((1024 * j222) * j222));
        String id222 = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id222, "getID(...)");
        int offset222 = (TimeZone.getDefault().getOffset(new Date().getTime()) / 1000) / 60;
        String languageTag222 = Locale.getDefault().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag222, "toLanguageTag(...)");
        String lowerCase222 = languageTag222.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase222, "toLowerCase(...)");
        String[] SUPPORTED_ABIS222 = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS222, "SUPPORTED_ABIS");
        String joinToString$default222 = ArraysKt.joinToString$default(SUPPORTED_ABIS222, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        Intrinsics.checkNotNullParameter(context, "context");
        if (com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.b, context)) {
        }
        str2 = RELEASE222;
        z4 = false;
        DeviceNetwork deviceNetwork222 = new DeviceNetwork(z4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intent registerReceiver222 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver222 == null) {
        }
        if (intExtra == 2) {
        }
        if (context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null) {
        }
        Battery battery222 = new Battery(intExtra == 2 ? intExtra != 3 ? intExtra != 5 ? "unknown" : "full" : "unplugged" : Device.JsonKeys.CHARGING, (context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) == null ? Float.valueOf(r14.getIntExtra("level", -1) / r14.getIntExtra("scale", -1)) : null) == null ? Double.valueOf(r12.floatValue()) : null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.getClassLoader().loadClass("com.facebook.react.ReactActivity") != null) {
        }
        Class.forName("react.React");
        aVar = com.socure.idplus.device.internal.utils.a.c;
        return new DeviceMetadata("4.5.1", null, null, str2, MODEL222, MANUFACTURER222, str9222, rint222, id222, offset222, lowerCase222, joinToString$default222, deviceNetwork222, battery222, aVar.f900a, sigmaDeviceContext.getValue(), androidAttributes222, 6, null);
    }
}
