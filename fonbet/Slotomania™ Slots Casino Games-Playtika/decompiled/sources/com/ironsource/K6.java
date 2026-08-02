package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.ironsource.X3;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.sentry.protocol.Device;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class K6 implements Runnable {
    public static final String M = "sdkVersion";
    public static final String N = "AdvIdOptOutReason";
    private static final int O = 15;
    private static final int P = 840;
    private static final int Q = -720;
    private Context K;
    private final String a = getClass().getSimpleName();
    private final String b = "bundleId";
    private final String c = "advertisingId";
    private final String d = X3.j.M;
    private final String e = "appKey";
    private final String f = Va.o;
    private final String g = "osVersion";
    private final String h = "connectionType";
    private final String i = "rawConnectionType";
    private final String j = Device.JsonKeys.LANGUAGE;
    private final String k = "deviceOEM";
    private final String l = "deviceModel";
    private final String m = X3.j.r;
    private final String n = Va.r;
    private final String o = Va.s;
    private final String p = "battery";
    private final String q = "gmtMinutesOffset";
    private final String r = X3.j.W;
    private final String s = JsonStorageKeyNames.SESSION_ID_KEY;
    private final String t = "pluginType";
    private final String u = "pluginVersion";
    private final String v = "plugin_fw_v";
    private final String w = Va.u;
    private final String x = Va.t;
    private final String y = M6.c1;
    private final String z = Va.w;
    private final String A = "mcc";
    private final String B = "mnc";
    private final String C = "icc";
    private final String D = "tz";
    private final String E = "auid";
    private final String F = "userLat";
    private final String G = "publisherAPI";
    private final String H = "missingDependencies";
    private final String I = "missingManifest";
    private final String J = "other";
    private final InterfaceC2738x7 L = Jb.Y().a();

    private K6() {
    }

    private Map<String, Object> a() {
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put(JsonStorageKeyNames.SESSION_ID_KEY, IronSourceUtils.d());
        String e = e();
        if (!TextUtils.isEmpty(e)) {
            hashMap.put("bundleId", e);
            String b = E1.b(this.K, e);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(X3.j.W, b);
            }
        }
        hashMap.put("appKey", c());
        String J = this.L.J(this.K);
        String c = this.L.c(this.K);
        boolean z2 = false;
        if (TextUtils.isEmpty(J)) {
            J = this.L.a(this.K);
            z = true;
            str = !TextUtils.isEmpty(J) ? IronSourceConstants.TYPE_UUID : "";
        } else {
            str = IronSourceConstants.TYPE_GAID;
            z = false;
        }
        if (!TextUtils.isEmpty(J)) {
            hashMap.put("advertisingId", J);
            hashMap.put(Va.t, str);
        }
        if (!TextUtils.isEmpty(c)) {
            z2 = Boolean.parseBoolean(c);
            hashMap.put(X3.j.M, Boolean.valueOf(z2));
        }
        if (z || z2) {
            hashMap.put(N, a(c));
        }
        hashMap.put(Va.o, h());
        if (!TextUtils.isEmpty(b())) {
            hashMap.put("osVersion", b());
        }
        String a = IronSourceUtils.a(this.K);
        if (!TextUtils.isEmpty(a)) {
            hashMap.put("connectionType", a);
        }
        String d = U3.d(this.K);
        if (!TextUtils.isEmpty(d)) {
            hashMap.put("rawConnectionType", d);
        }
        hashMap.put("sdkVersion", r());
        String l = l();
        if (!TextUtils.isEmpty(l)) {
            hashMap.put(Device.JsonKeys.LANGUAGE, l);
        }
        String g = g();
        if (!TextUtils.isEmpty(g)) {
            hashMap.put("deviceOEM", g);
        }
        String f = f();
        if (!TextUtils.isEmpty(f)) {
            hashMap.put("deviceModel", f);
        }
        String n = n();
        if (!TextUtils.isEmpty(n)) {
            hashMap.put(X3.j.r, n);
        }
        hashMap.put(Va.s, Long.valueOf(k()));
        hashMap.put(Va.r, Long.valueOf(i()));
        hashMap.put("battery", Integer.valueOf(d()));
        int j = j();
        if (a(j)) {
            hashMap.put("gmtMinutesOffset", Integer.valueOf(j));
        }
        String p = p();
        if (!TextUtils.isEmpty(p)) {
            hashMap.put("pluginType", p);
        }
        String q = q();
        if (!TextUtils.isEmpty(q)) {
            hashMap.put("pluginVersion", q);
        }
        String o = o();
        if (!TextUtils.isEmpty(o)) {
            hashMap.put("plugin_fw_v", o);
        }
        String valueOf = String.valueOf(this.L.p());
        if (!TextUtils.isEmpty(valueOf)) {
            hashMap.put(Va.u, valueOf);
        }
        String m = m();
        if (!TextUtils.isEmpty(m)) {
            hashMap.put(M6.c1, m);
        }
        String valueOf2 = String.valueOf(IronSourceUtils.c(this.K));
        if (!TextUtils.isEmpty(valueOf2)) {
            hashMap.put(Va.w, valueOf2);
        }
        String e2 = this.L.e(this.K);
        if (!TextUtils.isEmpty(e2)) {
            hashMap.put("auid", e2);
        }
        hashMap.put("mcc", Integer.valueOf(T3.b(this.K)));
        hashMap.put("mnc", Integer.valueOf(T3.c(this.K)));
        String H = this.L.H(this.K);
        if (!TextUtils.isEmpty(H)) {
            hashMap.put("icc", H);
        }
        String d2 = this.L.d();
        if (!TextUtils.isEmpty(d2)) {
            hashMap.put("tz", d2);
        }
        IronLog.INTERNAL.verbose("collecting data for events: " + hashMap);
        return hashMap;
    }

    private String b() {
        try {
            return "" + Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")";
        } catch (Exception e) {
            C2556n4.d().a(e);
            return "";
        }
    }

    private String c() {
        return com.ironsource.mediationsdk.p.h().i();
    }

    private int d() {
        try {
            Intent registerReceiver = this.K.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra != -1 && intExtra2 != -1) {
                return (int) ((intExtra / intExtra2) * 100.0f);
            }
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.a + ":getBatteryLevel()", e);
        }
        return -1;
    }

    private String e() {
        try {
            return this.K.getPackageName();
        } catch (Exception e) {
            C2556n4.d().a(e);
            return "";
        }
    }

    private String f() {
        try {
            return Build.MODEL;
        } catch (Exception e) {
            C2556n4.d().a(e);
            return "";
        }
    }

    private String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception e) {
            C2556n4.d().a(e);
            return "";
        }
    }

    private String h() {
        return X3.d;
    }

    private long i() {
        if (!s()) {
            return -1L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private int j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.a + ":getGmtMinutesOffset()", e);
            return 0;
        }
    }

    private long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e) {
            C2556n4.d().a(e);
            return -1L;
        }
    }

    private String l() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e) {
            C2556n4.d().a(e);
            return "";
        }
    }

    private String m() {
        return com.ironsource.mediationsdk.p.h().k();
    }

    private String n() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.K.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!networkOperatorName.equals("")) {
                    return networkOperatorName;
                }
            }
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, this.a + ":getMobileCarrier()", e);
        }
        return "";
    }

    private String r() {
        return LevelPlay.getSdkVersion();
    }

    private boolean s() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            C2556n4.d().a(e);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            J6.a().a(a());
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "Thread name = " + getClass().getSimpleName(), e);
        }
    }

    private String o() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e);
            return "";
        }
    }

    private String p() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e);
            return "";
        }
    }

    private String q() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e);
            return "";
        }
    }

    public K6(Context context) {
        this.K = context.getApplicationContext();
    }

    private boolean a(int i) {
        return i <= P && i >= Q && i % 15 == 0;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "missingDependencies";
        }
        if (!V4.a.b()) {
            return "publisherAPI";
        }
        if (this.L.h(this.K)) {
            return Boolean.parseBoolean(str) ? "userLat" : "other";
        }
        return "missingManifest";
    }
}
