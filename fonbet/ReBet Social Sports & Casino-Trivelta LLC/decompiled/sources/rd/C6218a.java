package rd;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenToggleFAB;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.y;
import ie.b;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import ne.l;
import ug.AbstractC6574b;
import wd.d;

/* renamed from: rd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6218a {

    /* renamed from: i, reason: collision with root package name */
    public static C6218a f64076i = null;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f64077j = false;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f64078k = true;

    /* renamed from: e, reason: collision with root package name */
    public Typeface f64083e;

    /* renamed from: f, reason: collision with root package name */
    public Typeface f64084f;

    /* renamed from: g, reason: collision with root package name */
    public Typeface f64085g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f64079a = false;

    /* renamed from: b, reason: collision with root package name */
    public String f64080b = "temp_chid";

    /* renamed from: c, reason: collision with root package name */
    public String f64081c = null;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f64082d = null;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0890a f64086h = null;

    /* renamed from: rd.a$a, reason: collision with other inner class name */
    public interface InterfaceC0890a {
        void a(boolean z10);
    }

    public static String A() {
        return "ZohoLiveDesk";
    }

    public static String B() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "9";
        }
    }

    public static Typeface C() {
        return u().f64084f;
    }

    public static String D(nd.b bVar) {
        return (bVar == null || bVar.a(2) == null) ? "roboto_medium.ttf" : bVar.a(2);
    }

    public static String E() {
        try {
            return ((AudioManager) MobilistenInitProvider.k().getSystemService("audio")).isWiredHeadsetOn() ? "1" : "3";
        } catch (Exception unused) {
            return "0";
        }
    }

    public static Typeface F() {
        return u().f64085g;
    }

    public static int G() {
        Resources resources = MobilistenInitProvider.k().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", Constants.PLATFORM_ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static String H() {
        try {
            return ((ConnectivityManager) MobilistenInitProvider.k().getSystemService("connectivity")).getActiveNetworkInfo().isConnected() ? "3" : "1";
        } catch (Exception unused) {
            return "0";
        }
    }

    public static String I() {
        try {
            return ((TelephonyManager) MobilistenInitProvider.k().getSystemService("phone")).getNetworkCountryIso().toUpperCase();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    public static String J() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) MobilistenInitProvider.k().getSystemService("connectivity");
            NetworkInfo.State state = connectivityManager.getNetworkInfo(0).getState();
            NetworkInfo.State state2 = connectivityManager.getNetworkInfo(1).getState();
            NetworkInfo.State state3 = NetworkInfo.State.CONNECTED;
            if (state == state3) {
                return "Mobile";
            }
            NetworkInfo.State state4 = NetworkInfo.State.CONNECTING;
            return state == state4 ? "Mobile" : (state2 == state3 || state2 == state4) ? "Wifi" : "";
        } catch (Exception unused) {
            return "9";
        }
    }

    public static String K() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Exception unused) {
            return "9";
        }
    }

    public static String L() {
        return "Android";
    }

    public static SharedPreferences M() {
        if (u().f64082d == null) {
            if (ZohoLiveChat.getApplicationManager() != null && ZohoLiveChat.getApplicationManager().m() != null) {
                u().f64082d = ZohoLiveChat.getApplicationManager().m().getApplicationContext().getSharedPreferences("siq_session", 0);
            } else if (MobilistenInitProvider.k() != null) {
                u().f64082d = MobilistenInitProvider.k().getApplicationContext().getSharedPreferences("siq_session", 0);
            }
        }
        return u().f64082d;
    }

    public static String N() {
        try {
            return URLEncoder.encode(Build.MODEL.replace("_", "-").replace(" ", ""), "UTF-8");
        } catch (Exception unused) {
            return "9";
        }
    }

    public static Point O() {
        Display defaultDisplay = ((WindowManager) MobilistenInitProvider.k().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static Typeface P() {
        return u().f64083e;
    }

    public static String Q(nd.b bVar) {
        return (bVar == null || bVar.a(1) == null) ? "roboto_regular.ttf" : bVar.a(1);
    }

    public static String R() {
        return "3";
    }

    public static String S() {
        try {
            return r() + " * " + p();
        } catch (Exception unused) {
            return "9";
        }
    }

    public static String T() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    public static int U() {
        Resources resources = MobilistenInitProvider.k().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", Constants.PLATFORM_ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int V() {
        TypedValue typedValue = new TypedValue();
        if (MobilistenInitProvider.k().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, MobilistenInitProvider.k().getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static boolean W() {
        return f64077j;
    }

    public static String X() {
        return Y(false);
    }

    public static String Y(boolean z10) {
        String str;
        Hashtable hashtable = new Hashtable();
        try {
            if (!N().equals("9")) {
                hashtable.put("product", N());
            }
            if (!B().equals("9")) {
                hashtable.put("manufacturer", B());
            }
            if (!L().equals("9")) {
                hashtable.put("mobileos", L());
            }
            if (!K().equals("9")) {
                hashtable.put("os-version", K());
            }
            if (J().equalsIgnoreCase("wifi")) {
                hashtable.put(EventKeys.NETWORK_TYPE, "Wifi");
            } else {
                hashtable.put(EventKeys.NETWORK_TYPE, o());
            }
            if (!i().equals("9")) {
                hashtable.put("carrier", i());
            }
            if (!v().equals("9")) {
                hashtable.put("storage", v());
            }
            if (e() != null) {
                hashtable.put("process", e());
            }
            String str2 = ((("0" + E()) + R()) + g()) + m();
            if (v().equals("9")) {
                str = str2 + "0";
            } else {
                str = str2 + "3";
            }
            hashtable.put("access-value", ((str + h()) + H()) + z());
            hashtable.put("resolution", S());
            if (d() != null) {
                hashtable.put("app-locale", d());
            }
            if (c() != null) {
                hashtable.put("app-install-time", c());
            }
            if (f() != null) {
                hashtable.put("app-updated-time", f());
            }
            hashtable.put("version", Z());
            hashtable.put("sdk-version", LiveChatUtil.getMobilistenVersionName());
            if (f() != null) {
                hashtable.put("os-locale", q());
            }
            if (LiveChatUtil.getLanguageOrNull() != null) {
                hashtable.put("sdk-locale", LiveChatUtil.getLanguageOrNull());
            } else {
                hashtable.put("sdk-locale", T());
            }
            if (I() != null) {
                hashtable.put("network-country-code", I());
            }
            String n10 = n();
            if (n10 != null && !TextUtils.isEmpty(n10)) {
                hashtable.put("currentpage", n10);
            }
            hashtable.put("power-saving-mode", "" + f0());
            return AbstractC6574b.g(hashtable);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            if (!z10) {
                l.f(new b.c(Log.getStackTraceString(e10)));
            }
            return "9";
        }
    }

    public static String Z() {
        try {
            return MobilistenInitProvider.k().getPackageManager().getPackageInfo(MobilistenUtil.f(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "1";
        }
    }

    public static void a() {
        Typeface typeface = u().f64083e;
        Typeface typeface2 = u().f64084f;
        Typeface typeface3 = u().f64085g;
        f64076i = null;
        C6218a u10 = u();
        f64076i = u10;
        u10.f64083e = typeface;
        u10.f64084f = typeface2;
        u10.f64085g = typeface3;
    }

    public static void a0(Context context, nd.b bVar) {
        String Q10 = Q(bVar);
        String D10 = D(bVar);
        u().f64083e = Typeface.createFromAsset(context.getAssets(), Q10);
        u().f64084f = Typeface.createFromAsset(context.getAssets(), D10);
        u().f64085g = Typeface.createFromAsset(context.getAssets(), "roboto_mono.ttf");
    }

    public static int b(float f10) {
        return (int) (f10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static void b0(Context context, nd.b bVar, boolean z10) {
        synchronized (C6218a.class) {
            if (z10) {
                try {
                    if (f64078k) {
                        f64078k = false;
                        y.INSTANCE.initialize(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u().f64082d = context.getSharedPreferences("siq_session", 0);
            d.i();
            a0(context, bVar);
        }
    }

    public static String c() {
        try {
            return new SimpleDateFormat("[yyyy/MM/dd - HH:mm:ss]", Locale.ENGLISH).format(new Date(MobilistenInitProvider.k().getPackageManager().getPackageInfo(MobilistenUtil.f(), 4096).firstInstallTime));
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    public static boolean c0() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) MobilistenInitProvider.k().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static String d() {
        try {
            return MobilistenInitProvider.k().getResources().getConfiguration().locale.getLanguage();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    public static boolean d0() {
        if (M() != null) {
            return M().getBoolean("is_launcher_in_bottom_side", true);
        }
        return true;
    }

    public static String e() {
        try {
            return MobilistenUtil.e();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    public static boolean e0() {
        if (M() != null) {
            return M().getBoolean("launcher_in_right_side", true);
        }
        return true;
    }

    public static String f() {
        try {
            return new SimpleDateFormat("[yyyy/MM/dd - HH:mm:ss]", Locale.ENGLISH).format(new Date(MobilistenInitProvider.k().getPackageManager().getPackageInfo(MobilistenUtil.f(), 4096).lastUpdateTime));
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    public static int f0() {
        try {
            return ((PowerManager) MobilistenInitProvider.k().getSystemService("power")).isPowerSaveMode() ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String g() {
        return "3";
    }

    public static void g0(InterfaceC0890a interfaceC0890a) {
        u().f64086h = interfaceC0890a;
    }

    public static String h() {
        try {
            return MobilistenInitProvider.k().getPackageManager().checkPermission("android.permission.CAMERA", MobilistenUtil.f()) == 0 ? "3" : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    public static void h0(boolean z10) {
        u().f64079a = z10;
    }

    public static String i() {
        try {
            String networkOperatorName = ((TelephonyManager) MobilistenInitProvider.k().getSystemService("phone")).getNetworkOperatorName();
            return networkOperatorName.equals("") ? "9" : networkOperatorName;
        } catch (Exception unused) {
            return "9";
        }
    }

    public static void i0(boolean z10, String str) {
        u().f64079a = z10;
        u().f64080b = str;
    }

    public static InterfaceC0890a j() {
        return u().f64086h;
    }

    public static boolean k() {
        return u().f64079a;
    }

    public static void k0(String str) {
        u().f64081c = str;
    }

    public static String l() {
        return u().f64081c;
    }

    public static void l0(float f10, boolean z10, MobilistenToggleFAB.e eVar) {
        n0(z10, eVar);
        m0(f10);
    }

    public static String m() {
        try {
            return MobilistenInitProvider.k().getPackageManager().checkPermission("android.permission.READ_CONTACTS", MobilistenUtil.f()) == 0 ? "3" : "0";
        } catch (Exception unused) {
            return "0";
        }
    }

    public static void m0(float f10) {
        if (M() != null) {
            SharedPreferences.Editor edit = M().edit();
            if (f10 < 0.0f || f10 > p()) {
                f10 = 0.0f;
            }
            edit.putFloat("launcher_y_in_points", f10 / p());
            edit.apply();
        }
    }

    public static String n() {
        if (ZohoLiveChat.getApplicationManager() == null || ZohoLiveChat.getApplicationManager().l() == null) {
            return null;
        }
        String canonicalName = ZohoLiveChat.getApplicationManager().l().getClass().getCanonicalName();
        return ZohoLiveChat.getApplicationManager().v().containsKey(canonicalName) ? (String) ZohoLiveChat.getApplicationManager().v().get(canonicalName) : ZohoLiveChat.getApplicationManager().l().getClass().getSimpleName();
    }

    public static void n0(boolean z10, MobilistenToggleFAB.e eVar) {
        if (M() != null) {
            SharedPreferences.Editor edit = M().edit();
            edit.putBoolean("launcher_in_right_side", z10);
            edit.putBoolean("is_launcher_in_bottom_side", eVar == MobilistenToggleFAB.e.Bottom);
            edit.apply();
        }
    }

    public static String o() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) MobilistenInitProvider.k().getSystemService("phone");
            return telephonyManager.getNetworkType() == 8 ? "3g" : telephonyManager.getNetworkType() == 10 ? "4g" : telephonyManager.getNetworkType() == 1 ? "GPRS" : telephonyManager.getNetworkType() == 2 ? "EDGE 2g" : "";
        } catch (Exception unused) {
            return "9";
        }
    }

    public static void o0(boolean z10) {
        f64077j = z10;
    }

    public static int p() {
        try {
            return MobilistenInitProvider.k().getResources().getDisplayMetrics().heightPixels;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String q() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return null;
        }
    }

    public static int r() {
        try {
            return MobilistenInitProvider.k().getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
            return 0;
        }
    }

    public static int s() {
        return O().y;
    }

    public static int t() {
        return O().x;
    }

    public static C6218a u() {
        synchronized (C6218a.class) {
            try {
                if (f64076i == null) {
                    f64076i = new C6218a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f64076i;
    }

    public static String v() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            return new DecimalFormat("#.###", new DecimalFormatSymbols(Locale.ENGLISH)).format((statFs.getBlockCount() * statFs.getBlockSize()) / 1.073741824E9d) + " GB";
        } catch (Exception unused) {
            return "9";
        }
    }

    public static int w() {
        if (M() != null) {
            return M().getInt("launcher_mode", 2);
        }
        return 2;
    }

    public static float x() {
        if (M() == null) {
            return 0.0f;
        }
        if (!M().contains("launcher_y")) {
            return M().getFloat("launcher_y_in_points", 0.0f);
        }
        float f10 = 1.0f - M().getFloat("launcher_y", 1.0f);
        M().edit().putFloat("launcher_y_in_points", f10).remove("launcher_y").apply();
        return f10;
    }

    public static String y() {
        return u().f64080b;
    }

    public static String z() {
        try {
            return !((LocationManager) MobilistenInitProvider.k().getSystemService("location")).isProviderEnabled("gps") ? "1" : "3";
        } catch (Exception unused) {
            return "0";
        }
    }

    public static void j0(boolean z10) {
    }
}
