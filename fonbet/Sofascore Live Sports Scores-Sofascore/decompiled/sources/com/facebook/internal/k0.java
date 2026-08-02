package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.CookieManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.appsflyer.sdk_base.referrer.Payload;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.inmobi.media.AbstractC3304b2;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.a70;
import defpackage.cw3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class k0 {
    public static volatile int a = 0;
    public static volatile long b = -1;
    public static volatile long c = -1;
    public static volatile long d = -1;
    public static volatile String e = "";
    public static volatile String f = "";
    public static volatile String g = "NoCarrier";
    public static volatile String h = "";
    public static volatile Locale i;

    public static final boolean A(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean B(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    public static final ArrayList C(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static final HashMap D(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                next.getClass();
                String string = jSONObject.getString(next);
                string.getClass();
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String E(Map map) {
        map.getClass();
        String str = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            str = jSONObject.toString();
        } catch (JSONException unused) {
        }
        str.getClass();
        return str;
    }

    public static final Bundle F(String str) {
        List split$default;
        List split$default2;
        Bundle bundle = new Bundle();
        if (!A(str)) {
            if (str == null) {
                a70.r("Required value was null.");
                return null;
            }
            split$default = StringsKt__StringsKt.split$default(str, new String[]{U3.j.c}, false, 0, 6, null);
            for (String str2 : (String[]) split$default.toArray(new String[0])) {
                split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{U3.j.b}, false, 0, 6, null);
                String[] strArr = (String[]) split$default2.toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], C.UTF8_NAME), URLDecoder.decode(strArr[1], C.UTF8_NAME));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], C.UTF8_NAME), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    com.facebook.w wVar = com.facebook.w.a;
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void G(Bundle bundle, JSONArray jSONArray) {
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray(U3.i.I0, (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray(U3.i.I0, (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray(U3.i.I0, (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray(U3.i.I0, (long[]) jSONArray);
        } else {
            bundle.putString(U3.i.I0, jSONArray.toString());
        }
    }

    public static final HashMap H(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < readInt; i2++) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (readString != null && readString2 != null) {
                hashMap.put(readString, readString2);
            }
        }
        return hashMap;
    }

    public static final String I(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[com.ironsource.mediationsdk.metadata.a.o];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    String sb2 = sb.toString();
                    inputStreamReader.close();
                    return sb2;
                }
                sb.append(cArr, 0, read);
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void J(JSONObject jSONObject, Context context) {
        Locale locale;
        int i2;
        int i3;
        Display display;
        PackageInfo packageInfo;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(AbstractC3304b2.a);
        int i4 = 0;
        if (b == -1 || System.currentTimeMillis() - b >= 1800000) {
            b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                displayName.getClass();
                e = displayName;
                String id = timeZone.getID();
                id.getClass();
                f = id;
            } catch (AssertionError unused) {
            } catch (Exception unused2) {
                com.facebook.w wVar = com.facebook.w.a;
            }
            if (Intrinsics.c(g, "NoCarrier")) {
                try {
                    Object systemService = context.getSystemService("phone");
                    systemService.getClass();
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    networkOperatorName.getClass();
                    g = networkOperatorName;
                } catch (Exception unused3) {
                    com.facebook.w wVar2 = com.facebook.w.a;
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    c = statFs.getBlockCount() * statFs.getBlockSize();
                }
                c = Math.round(c / 1.073741824E9d);
            } catch (Exception unused4) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    d = statFs2.getAvailableBlocks() * statFs2.getBlockSize();
                }
                d = Math.round(d / 1.073741824E9d);
            } catch (Exception unused5) {
            }
        }
        String packageName = context.getPackageName();
        int i5 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused6) {
        }
        if (packageInfo == null) {
            return;
        }
        i5 = packageInfo.versionCode;
        h = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i5);
        jSONArray.put(h);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused7) {
            locale = Locale.getDefault();
        }
        i = locale;
        Locale locale2 = i;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        StringBuilder sb = new StringBuilder(language);
        sb.append('_');
        Locale locale3 = i;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb.append(country != null ? country : "");
        jSONArray.put(sb.toString());
        jSONArray.put(e);
        jSONArray.put(g);
        double d2 = 0.0d;
        try {
            Object systemService2 = context.getSystemService(U3.i.d);
            DisplayManager displayManager = systemService2 instanceof DisplayManager ? (DisplayManager) systemService2 : null;
            display = displayManager != null ? displayManager.getDisplay(0) : null;
        } catch (Exception unused8) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i6 = displayMetrics.widthPixels;
            try {
                i4 = displayMetrics.heightPixels;
                d2 = displayMetrics.density;
            } catch (Exception unused9) {
            }
            i2 = i4;
            i4 = i6;
            jSONArray.put(i4);
            jSONArray.put(i2);
            jSONArray.put(new DecimalFormat("#.##").format(d2));
            if (a <= 0) {
                i3 = a;
            } else {
                try {
                    File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new i0());
                    if (listFiles != null) {
                        a = listFiles.length;
                    }
                } catch (Exception unused10) {
                    com.facebook.w wVar3 = com.facebook.w.a;
                }
                if (a <= 0) {
                    a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
                }
                i3 = a;
            }
            jSONArray.put(i3);
            jSONArray.put(c);
            jSONArray.put(d);
            jSONArray.put(f);
            jSONObject.put("extinfo", jSONArray.toString());
        }
        i2 = 0;
        jSONArray.put(i4);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        if (a <= 0) {
        }
        jSONArray.put(i3);
        jSONArray.put(c);
        jSONArray.put(d);
        jSONArray.put(f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final String K(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.getClass();
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            digest.getClass();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final void L(Parcel parcel, Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final Uri a(String str, Bundle bundle, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(HttpRequest.DEFAULT_SCHEME);
        builder.authority(str);
        builder.path(str2);
        for (String str3 : bundle.keySet()) {
            Object obj = bundle.get(str3);
            if (obj instanceof String) {
                builder.appendQueryParameter(str3, (String) obj);
            }
        }
        Uri build = builder.build();
        build.getClass();
        return build;
    }

    public static void b(String str) {
        List split$default;
        List split$default2;
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        split$default = StringsKt__StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null);
        for (String str2 : (String[]) split$default.toArray(new String[0])) {
            split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{U3.j.b}, false, 0, 6, null);
            String[] strArr = (String[]) split$default2.toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = Intrinsics.d(str3.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                sb.append(str3.subSequence(i2, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.flush();
    }

    public static final void c(Context context) {
        try {
            b("facebook.com");
            b(".facebook.com");
            b("https://facebook.com");
            b("https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final String d(String str) {
        return A(str) ? "" : str;
    }

    public static final HashSet e(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            string.getClass();
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final ArrayList f(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONArray.getString(i2);
                string.getClass();
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap g(JSONObject jSONObject) {
        jSONObject.getClass();
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names != null) {
            int length = names.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = names.getString(i2);
                    string.getClass();
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = g((JSONObject) obj);
                    }
                    obj.getClass();
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                    com.facebook.w wVar = com.facebook.w.a;
                }
            }
        }
        return hashMap;
    }

    public static final HashMap h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                next.getClass();
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static final int i(InputStream inputStream, FilterOutputStream filterOutputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            int i2 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    Unit unit = Unit.a;
                    bufferedInputStream.close();
                    return i2;
                }
                filterOutputStream.write(bArr, 0, read);
                i2 += read;
            }
        } finally {
        }
    }

    public static final void j(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final String k(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final String l(Context context) {
        try {
            com.facebook.w wVar = com.facebook.w.a;
            h.k();
            String str = com.facebook.w.e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i2);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date m(Bundle bundle, String str, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                parseLong = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + date.getTime());
    }

    public static final JSONObject n() {
        if (cw3.a.contains(k0.class)) {
            return null;
        }
        try {
            String string = com.facebook.w.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                    com.facebook.w wVar = com.facebook.w.a;
                }
            }
            return null;
        } catch (Throwable th) {
            cw3.a(k0.class, th);
            return null;
        }
    }

    public static final String o() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{com.facebook.w.s}, 1));
    }

    public static final void p(final j0 j0Var, final String str) {
        String str2;
        str.getClass();
        JSONObject jSONObject = (JSONObject) f0.a.get(str);
        if (jSONObject != null) {
            j0Var.a(jSONObject);
            return;
        }
        com.facebook.z zVar = new com.facebook.z() { // from class: com.facebook.internal.h0
            @Override // com.facebook.z
            public final void a(com.facebook.g0 g0Var) {
                String str3 = str;
                str3.getClass();
                g0Var.getClass();
                FacebookRequestError facebookRequestError = g0Var.c;
                JSONObject jSONObject2 = g0Var.d;
                j0 j0Var2 = j0.this;
                if (facebookRequestError != null) {
                    j0Var2.b(facebookRequestError.i);
                } else if (jSONObject2 == null) {
                    a70.r("Required value was null.");
                } else {
                    f0.a.put(str3, jSONObject2);
                    j0Var2.a(jSONObject2);
                }
            }
        };
        Bundle bundle = new Bundle();
        Date date = AccessToken.l;
        AccessToken p = com.facebook.appevents.g.p();
        if (p == null || (str2 = p.k) == null) {
            str2 = Payload.SOURCE_FACEBOOK;
        }
        bundle.putString("fields", str2.equals(Payload.SOURCE_INSTAGRAM) ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        com.facebook.d0 d0Var = new com.facebook.d0(null, "me", null, null, new com.facebook.a0());
        d0Var.d = bundle;
        d0Var.h = com.facebook.h0.a;
        d0Var.j(zVar);
        d0Var.d();
    }

    public static final String q() {
        return String.format("m.%s", Arrays.copyOf(new Object[]{com.facebook.w.r}, 1));
    }

    public static void r(Context context) {
        context.getClass();
        if (d.a() != null) {
            d.a();
            return;
        }
        d dVar = new d(context);
        Set set = cw3.a;
        if (!set.contains(d.class)) {
            try {
                if (!set.contains(dVar)) {
                    try {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance((Context) dVar.b);
                        localBroadcastManager.getClass();
                        localBroadcastManager.registerReceiver(dVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th) {
                        cw3.a(dVar, th);
                    }
                }
            } catch (Throwable th2) {
                cw3.a(d.class, th2);
            }
        }
        if (!cw3.a.contains(d.class)) {
            try {
                d.c = dVar;
            } catch (Throwable th3) {
                cw3.a(d.class, th3);
            }
        }
        d.a();
    }

    public static final Method s(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method t(String str, String str2, Class... clsArr) {
        try {
            return s(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object u(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            com.facebook.t.a("Got an unexpected non-JSON object.");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, opt);
        return jSONObject2;
    }

    public static final Object v(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean w() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.w.b()}, 1))));
            Context a2 = com.facebook.w.a();
            PackageManager packageManager = a2.getPackageManager();
            String packageName = a2.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            queryIntentActivities.getClass();
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean x(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str == null) {
            return false;
        }
        str.getClass();
        return new Regex(".+_cheets|cheets_.+").f(str);
    }

    public static final boolean y() {
        if (!cw3.a.contains(k0.class)) {
            try {
                JSONObject n = n();
                if (n != null) {
                    try {
                        JSONArray jSONArray = n.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            String string = jSONArray.getString(i2);
                            string.getClass();
                            String lowerCase = string.toLowerCase();
                            lowerCase.getClass();
                            if (lowerCase.equals("ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                        com.facebook.w wVar = com.facebook.w.a;
                    }
                }
            } catch (Throwable th) {
                cw3.a(k0.class, th);
                return false;
            }
        }
        return false;
    }

    public static boolean z(Context context) {
        Method t = t("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (t != null) {
            Object v = v(null, t, context);
            if ((v instanceof Integer) && v.equals(0)) {
                return true;
            }
        }
        return false;
    }
}
