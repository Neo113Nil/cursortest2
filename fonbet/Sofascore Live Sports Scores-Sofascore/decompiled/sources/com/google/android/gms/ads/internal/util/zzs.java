package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzccf;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcld;
import com.google.android.gms.internal.ads.zzcmt;
import com.google.android.gms.internal.ads.zzcno;
import com.google.android.gms.internal.ads.zzdxj;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zziom;
import com.google.android.gms.internal.ads.zzion;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ba4;
import defpackage.da4;
import defpackage.ddb;
import defpackage.ea4;
import defpackage.f2n;
import defpackage.fn0;
import defpackage.hbo;
import defpackage.inn;
import defpackage.pyh;
import defpackage.sgo;
import defpackage.uvg;
import defpackage.wt3;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzs {
    public static final zzgbp zza = new zzf(Looper.getMainLooper());
    public String g;
    public volatile String h;
    public final AtomicReference a = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(new Bundle());
    public final AtomicBoolean d = new AtomicBoolean();
    public boolean e = true;
    public final Object f = new Object();
    public boolean i = false;
    public boolean j = false;
    public final ExecutorService k = Executors.newSingleThreadExecutor();

    public static boolean a(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String b(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static Bundle c(Context context) {
        try {
            return Wrappers.a(context).a(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    public static final void d(da4 da4Var, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i = bundle.getInt(h.b, -1);
        if (i >= 0) {
            da4Var.b(i);
        }
        int i2 = bundle.getInt("cbp", -1);
        if (i2 < 0 || i2 > 2) {
            return;
        }
        if (i2 < 0 || i2 > 2) {
            a70.p("Invalid value for the position argument");
        } else {
            da4Var.a.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i2);
        }
    }

    public static final String e(final Context context, String str) {
        final Context context2;
        if (str == null) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.getUserAgent", new Exception("null afmaVersion"));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.h)).booleanValue()) {
                return f();
            }
            str = VersionInfoParcel.forPackage().afmaVersion;
        }
        String str2 = null;
        try {
            zzce zza2 = zzce.zza();
            if (TextUtils.isEmpty(zza2.a)) {
                AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
                zza2.a = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        SharedPreferences sharedPreferences;
                        boolean z = false;
                        Context context3 = context2;
                        Context context4 = context;
                        if (context3 != null) {
                            zze.zza("Attempting to read user agent from Google Play Services.");
                            sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                        } else {
                            zze.zza("Attempting to read user agent from local cache.");
                            sharedPreferences = context4.getSharedPreferences("admob_user_agent", 0);
                            z = true;
                        }
                        String string = sharedPreferences.getString("user_agent", "");
                        if (!TextUtils.isEmpty(string)) {
                            return string;
                        }
                        zze.zza("Reading user agent from WebSettings");
                        String defaultUserAgent = WebSettings.getDefaultUserAgent(context4);
                        if (z) {
                            sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                            zze.zza("Persisting user agent.");
                        }
                        return defaultUserAgent;
                    }
                });
            }
            str2 = zza2.a;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = f();
        }
        String m = wt3.m(str2, " (Mobile; ", new StringBuilder(String.valueOf(str2).length() + 10 + String.valueOf(str).length()), str);
        try {
            if (Wrappers.a(context).c()) {
                StringBuilder sb = new StringBuilder(m.length() + 4);
                sb.append(m);
                sb.append(";aia");
                m = sb.toString();
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.getUserAgent", e);
        }
        return m.concat(")");
    }

    public static final String f() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_LOCAL_ONLY);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final int zzA(@Nullable View view) {
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                return 0;
            }
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof uvg) {
                return 4;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o9)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.p9);
                if (TextUtils.isEmpty(str)) {
                    continue;
                } else {
                    for (String str2 : str.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
                        if (parent.getClass().getName().toLowerCase(Locale.ROOT).contains(str2)) {
                            return 5;
                        }
                    }
                }
            }
            parent = parent.getParent();
        }
    }

    public static final String zzB() {
        Resources c = com.google.android.gms.ads.internal.zzt.zzh().c();
        return c != null ? c.getString(R.string.s7) : "Test Ad";
    }

    @Nullable
    public static final zzbo zzC(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
                return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            }
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Instantiated WorkManagerUtil not instance of IBinder.");
            return null;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("Failed to instantiate WorkManagerUtil", e);
            return null;
        }
    }

    public static final boolean zzD(Context context, String str) {
        Context a = zzccf.a(context);
        return Wrappers.a(a).a.getPackageManager().checkPermission(str, a.getPackageName()) == 0;
    }

    public static final boolean zzE(Context context) {
        try {
            Boolean bool = DeviceProperties.f;
            if (bool == null) {
                bool = Boolean.valueOf(PlatformVersion.a() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
                DeviceProperties.f = bool;
            }
            return bool.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzF(String str) {
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.m6)).booleanValue()) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o6);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            break;
                        }
                    }
                }
                String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n6);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean zzG(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
        return keyguardManager != null && keyguardManager.isKeyguardLocked();
    }

    public static final boolean zzH(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean zzI() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzJ(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzK(Context context) {
        try {
            Bundle c = c(context);
            String string = c.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(b(c))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzL(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzM(View view, int i, MotionEvent motionEvent) {
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        String str3;
        String str4;
        zzfld e;
        zzflg g;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof zzdxj) {
                view2 = ((zzdxj) view2).getChildAt(0);
            }
            if ((view2 instanceof com.google.android.gms.ads.formats.zzh) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i4 = rect.width();
                i3 = rect.height();
            } else {
                i3 = 0;
                i4 = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            long zzy = zzy(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str5 = "none";
            if (!(view2 instanceof zzcmt) || (g = ((zzcmt) view2).g()) == null) {
                str2 = str;
                str3 = "none";
            } else {
                str3 = g.b;
                int hashCode = view2.hashCode();
                str2 = str;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(hashCode).length());
                sb.append(str3);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if (!(view2 instanceof zzcld) || (e = ((zzcld) view2).e()) == null) {
                str4 = str2;
            } else {
                str4 = zzfld.a(e.b);
                i2 = e.e;
                str5 = e.E;
            }
            Locale locale = Locale.US;
            String str6 = "<Ad hashCode=" + view2.hashCode() + ", package=" + packageName + ", adNetCls=" + str5 + ", gwsQueryId=" + str3 + ", format=" + str4 + ", impType=" + i2 + ", class=" + view2.getClass().getName() + ", x=" + i5 + ", y=" + i6 + ", width=" + view2.getWidth() + ", height=" + view2.getHeight() + ", vWidth=" + i4 + ", vHeight=" + i3 + ", alpha=" + zzy + ", state=" + Integer.toString(i, 2) + ">";
            int i7 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(str6);
        } catch (Exception e2) {
            int i8 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failure getting view location.", e2);
        }
    }

    public static final AlertDialog.Builder zzN(Context context) {
        com.google.android.gms.ads.internal.zzt.zzf();
        return new AlertDialog.Builder(context, android.R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzO(Context context, String str, String str2) {
        new zzbt(context, str, str2, null, null).zzb();
    }

    public static final void zzP(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) zzblq.b.c()).booleanValue()) {
                Preconditions.i(th);
            }
        } catch (IllegalStateException | Exception unused) {
        }
    }

    public static final void zzQ(Context context, zzfld zzfldVar, zzeaj zzeajVar) {
        zzeai a = zzeajVar.a();
        a.b("action", "can_show");
        com.google.android.gms.ads.internal.zzt.zzc();
        a.b(DownloadService.KEY_FOREGROUND, true != zzJ(context) ? "1" : "0");
        a.b("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().e() ? "1" : "0");
        if (zzfldVar != null) {
            List list = zzfldVar.t;
            if (!list.isEmpty()) {
                a.b("ancn", (String) list.get(0));
            }
            a.b("ad_format", zzfld.a(zzfldVar.b));
        }
        a.c();
    }

    public static final boolean zzR(@Nullable zzfld zzfldVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.qf)).booleanValue() && zzfldVar != null && zzfldVar.e == 4;
    }

    public static final int zzS(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String concat = "Could not parse value:".concat(e.toString());
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            return 0;
        }
    }

    @Nullable
    public static final Map zzT(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x)).booleanValue()) {
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(Uri.decode(encodedQuery.substring(i, indexOf2)), indexOf2 == length ? "" : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final int[] zzV(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(android.R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] zzW(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (findViewById = window.findViewById(android.R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getTop(), findViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, iArr[1])};
    }

    public static final boolean zzX(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzc().e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long zzy = zzy(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c2)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.jc)).booleanValue()) {
                    if (zzy < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.lc)).intValue()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final void zzY(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Gc)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.startActivityWithUnknownContext", e);
        }
    }

    public static final void zzZ(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzq(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            String sb2 = sb.toString();
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        } catch (ActivityNotFoundException e) {
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("No browser is found.", e);
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        String k = fn0.k(i, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds.", new StringBuilder(String.valueOf(i).length() + 86));
        int i2 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(k);
        return 60000;
    }

    public static final int[] zzaa(Activity activity) {
        int[] zzV = zzV(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzV[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(activity, zzV[1])};
    }

    public static final boolean zzab(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return zzX(view, powerManager, keyguardManager);
    }

    public static final void zzac(Context context, Intent intent, @Nullable zzeaj zzeajVar, String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ue)).booleanValue() || !(context instanceof zzcno)) {
            zzY(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.We))) {
                    ((zzcno) context).a(intent);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ve)).booleanValue() || zzeajVar == null) {
                        return;
                    }
                    zzeai a = zzeajVar.a();
                    a.b("action", "hila");
                    if (str == null) {
                        str = "";
                    }
                    a.b("gqi", str);
                    a.e();
                    return;
                }
            }
            zzY(context, intent);
        } catch (ActivityNotFoundException e) {
            e = e;
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.startActivityForResult", e);
            zzY(context, intent);
        } catch (SecurityException e2) {
            e = e2;
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e);
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.startActivityForResult", e);
            zzY(context, intent);
        } catch (Exception e3) {
            int i3 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while starting activity for result", e3);
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.startActivityForResult", e3);
            zzY(context, intent);
        }
    }

    public static List zzj() {
        inn innVar = zzbjg.a;
        ArrayList b = com.google.android.gms.ads.internal.client.zzba.zzb().b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzguz a = zzguz.a(new sgo(','));
            str.getClass();
            Iterator i = a.c.i(a, str);
            while (true) {
                pyh pyhVar = (pyh) i;
                if (pyhVar.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) pyhVar.next()));
                    } catch (NumberFormatException unused) {
                        zze.zza("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static zzq zzk(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new zzq(locale.getLanguage(), locale.getCountry());
        }
        zzq zzqVar = new zzq(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        try {
            LocaleManager b = hbo.b(context.getSystemService(hbo.d()));
            if (b == null || b.getSystemLocales().isEmpty()) {
                return zzqVar;
            }
            Locale locale2 = b.getSystemLocales().get(0);
            return new zzq(locale2.getLanguage(), locale2.getCountry());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.getSystemDefaultLocale", th);
            return zzqVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zzo(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final boolean zzp(final Context context, final WebSettings webSettings) {
        zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgbp zzgbpVar = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings2 = webSettings;
                webSettings2.setDatabasePath(absolutePath);
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B1)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    public static final void zzq(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzr(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return b(c(context));
    }

    public static final String zzt() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : wt3.m(str, " ", new StringBuilder(fn0.c(1, str) + str2.length()), str2);
    }

    @Nullable
    public static final Integer zzu(Context context) {
        Object systemService = context.getSystemService(U3.i.d);
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzv(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final Map zzx(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e);
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzy(View view) {
        float f;
        float f2 = Float.MAX_VALUE;
        do {
            boolean z = view instanceof View;
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!z) {
                break;
            }
            View view2 = (View) view;
            f2 = Math.min(f2, view2.getAlpha());
            view = view2.getParent();
        } while (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = f2;
        }
        return Math.round(f * 100.0f);
    }

    @Nullable
    public static final WebResourceResponse zzz(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbl(context).zzb(0, str2, hashMap, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", C.UTF8_NAME, new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)));
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public final void zzb(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        String k = fn0.k(zza2, "HTTP timeout: ", " milliseconds.", new StringBuilder(String.valueOf(zza2).length() + 28));
        int i2 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(k);
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty(Command.HTTP_HEADER_USER_AGENT))) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, zze(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzc(Context context) {
        if (this.i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbjg.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this), intentFilter, 4);
        }
        this.i = true;
        return true;
    }

    public final boolean zzd(Context context) {
        if (this.j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbjg.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(), intentFilter, 4);
        }
        this.j = true;
        return true;
    }

    public final String zze(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Sc)).booleanValue()) {
            if (this.h != null) {
                return this.h;
            }
            String e = e(context, str);
            if (str != null) {
                this.h = e;
            }
            return e;
        }
        synchronized (this.f) {
            try {
                String str2 = this.g;
                if (str2 != null) {
                    return str2;
                }
                String e2 = e(context, str);
                if (str != null) {
                    this.g = e2;
                }
                return e2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ddb zzf(final Uri uri) {
        return zzhcy.c(this.k, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgbp zzgbpVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                return zzs.zzT(uri);
            }
        });
    }

    public final void zzg(final Context context, @Nullable final String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzt.zzc();
        bundle.putString(U3.i.G, zzt());
        inn innVar = zzbjg.a;
        bundle.putString("eids", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, com.google.android.gms.ads.internal.client.zzba.zzb().a()));
        if (bundle.isEmpty()) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.hc);
            boolean andSet = this.d.getAndSet(true);
            AtomicReference atomicReference = this.c;
            if (!andSet) {
                atomicReference.set(zzac.zzc(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        zzs.this.c.set(zzac.zzb(context, str3));
                    }
                }));
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        com.google.android.gms.ads.internal.client.zzay.zza();
        com.google.android.gms.ads.internal.util.client.zzf.zzD(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(String str4) {
                zzgbp zzgbpVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                zzs.zzO(context, str, str4);
                return com.google.android.gms.ads.internal.util.client.zzt.zza;
            }
        });
    }

    public final boolean zzh(String str) {
        return a(str, this.a, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V0));
    }

    public final boolean zzi(String str) {
        return a(str, this.b, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (com.google.android.gms.ads.internal.util.client.zzf.zzy() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzn(Context context, Uri uri, Bundle bundle) {
        String a;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I5)).booleanValue()) {
            zzbkf zzn = com.google.android.gms.ads.internal.zzt.zzn();
            if (zzn.e == null) {
                zzcgj.a.execute(new f2n(zzn, 21));
            }
            da4 da4Var = new da4(zzn.e);
            d(da4Var, bundle);
            ea4 a2 = da4Var.a();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W5)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zza();
            }
            a2.a.setPackage(zziom.a(context));
            a2.a(context, uri);
            return 5;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G5)).booleanValue()) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(uri);
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            return 9;
        }
        zzbkh zzbkhVar = new zzbkh();
        zzbkhVar.d = new zzk(this, zzbkhVar, bundle, context, uri);
        Activity activity = (Activity) context;
        if (zzbkhVar.b == null && (a = zziom.a(activity)) != null) {
            zzion zzionVar = new zzion(zzbkhVar);
            zzbkhVar.c = zzionVar;
            ba4.a(activity, a, zzionVar);
        }
        return 5;
    }
}
