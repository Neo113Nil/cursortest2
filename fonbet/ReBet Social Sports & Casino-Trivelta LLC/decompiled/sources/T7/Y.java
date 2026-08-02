package T7;

import T7.C1678s;
import T7.Y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.react.uimanager.ViewProps;
import g6.C4331C;
import g6.C4339K;
import g6.C4357q;
import g6.EnumC4340L;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: b, reason: collision with root package name */
    public static int f11043b;

    /* renamed from: j, reason: collision with root package name */
    public static Locale f11051j;

    /* renamed from: a, reason: collision with root package name */
    public static final Y f11042a = new Y();

    /* renamed from: c, reason: collision with root package name */
    public static long f11044c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static long f11045d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static long f11046e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static String f11047f = "";

    /* renamed from: g, reason: collision with root package name */
    public static String f11048g = "";

    /* renamed from: h, reason: collision with root package name */
    public static String f11049h = "NoCarrier";

    /* renamed from: i, reason: collision with root package name */
    public static String f11050i = "";

    public interface a {
        void a(C4357q c4357q);

        void b(JSONObject jSONObject);
    }

    public static final Locale A() {
        Locale N10 = N();
        if (N10 != null) {
            return N10;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return locale;
    }

    public static final JSONObject C() {
        if (Y7.a.d(Y.class)) {
            return null;
        }
        try {
            String string = C4331C.l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, Y.class);
            return null;
        }
    }

    public static final String E(String str) {
        String u10 = C4331C.u();
        if (str != null) {
            if (Intrinsics.areEqual(str, "gaming")) {
                return StringsKt.replace$default(u10, "facebook.com", "fb.gg", false, 4, (Object) null);
            }
            if (Intrinsics.areEqual(str, "instagram")) {
                return StringsKt.replace$default(u10, "facebook.com", "instagram.com", false, 4, (Object) null);
            }
        }
        return u10;
    }

    public static final void E0(Runnable runnable) {
        try {
            C4331C.t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final void F0(JSONObject params, C1662b c1662b, String str, boolean z10, Context context) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        C1678s c1678s = C1678s.f11164a;
        C1678s.b bVar = C1678s.b.ServiceUpdateCompliance;
        if (!C1678s.g(bVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z10);
        params.put("advertiser_id_collection_enabled", C4331C.k());
        if (c1662b != null) {
            if (C1678s.g(bVar)) {
                f11042a.c(params, c1662b, str, context);
            }
            if (c1662b.j() != null) {
                if (C1678s.g(bVar)) {
                    f11042a.d(params, c1662b, context);
                } else {
                    params.put("attribution", c1662b.j());
                }
            }
            if (c1662b.h() != null) {
                params.put("advertiser_id", c1662b.h());
                params.put("advertiser_tracking_enabled", !c1662b.l());
            }
            if (!c1662b.l()) {
                String c10 = h6.K.c();
                if (c10.length() != 0) {
                    params.put("ud", c10);
                }
            }
            if (c1662b.i() != null) {
                params.put("installer_package", c1662b.i());
            }
        }
    }

    public static final void G(final String accessToken, final a callback) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject a10 = O.a(accessToken);
        if (a10 != null) {
            callback.b(a10);
            return;
        }
        GraphRequest.b bVar = new GraphRequest.b() { // from class: T7.X
            @Override // com.facebook.GraphRequest.b
            public final void a(C4339K c4339k) {
                Y.H(Y.a.this, accessToken, c4339k);
            }
        };
        GraphRequest F10 = f11042a.F(accessToken);
        F10.E(bVar);
        F10.l();
    }

    public static final void G0(JSONObject params, Context appContext) {
        Locale locale;
        String language;
        int i10;
        Display display;
        String country;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f11042a.B0(appContext);
        String packageName = appContext.getPackageName();
        int i11 = 0;
        int i12 = -1;
        try {
            packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return;
        }
        i12 = packageInfo.versionCode;
        f11050i = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i12);
        jSONArray.put(f11050i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        f11051j = locale;
        StringBuilder sb2 = new StringBuilder();
        Locale locale2 = f11051j;
        String str = "";
        if (locale2 == null || (language = locale2.getLanguage()) == null) {
            language = "";
        }
        sb2.append(language);
        sb2.append('_');
        Locale locale3 = f11051j;
        if (locale3 != null && (country = locale3.getCountry()) != null) {
            str = country;
        }
        sb2.append(str);
        jSONArray.put(sb2.toString());
        jSONArray.put(f11047f);
        jSONArray.put(f11049h);
        double d10 = 0.0d;
        try {
            Object systemService = appContext.getSystemService(ViewProps.DISPLAY);
            display = null;
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
        } catch (Exception unused3) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i13 = displayMetrics.widthPixels;
            try {
                i11 = displayMetrics.heightPixels;
                d10 = displayMetrics.density;
            } catch (Exception unused4) {
            }
            i10 = i11;
            i11 = i13;
            jSONArray.put(i11);
            jSONArray.put(i10);
            jSONArray.put(new DecimalFormat("#.##").format(d10));
            jSONArray.put(f11042a.y0());
            jSONArray.put(f11045d);
            jSONArray.put(f11046e);
            jSONArray.put(f11048g);
            params.put("extinfo", jSONArray.toString());
        }
        i10 = 0;
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(new DecimalFormat("#.##").format(d10));
        jSONArray.put(f11042a.y0());
        jSONArray.put(f11045d);
        jSONArray.put(f11046e);
        jSONArray.put(f11048g);
        params.put("extinfo", jSONArray.toString());
    }

    public static final void H(a callback, String accessToken, C4339K response) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.b() != null) {
            callback.a(response.b().getException());
            return;
        }
        O o10 = O.f11030a;
        JSONObject d10 = response.d();
        if (d10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        O.b(accessToken, d10);
        callback.b(response.d());
    }

    public static final String H0(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return f11042a.T(McElieceCCA2KeyGenParameterSpec.SHA1, bytes);
    }

    public static final String I0(String str) {
        if (str == null) {
            return null;
        }
        return f11042a.S("SHA-256", str);
    }

    public static final String J(Context context) {
        Z.m(context, "context");
        return C4331C.m();
    }

    public static final boolean J0(String str, String str2) {
        boolean z10 = str == null || str.length() == 0;
        boolean z11 = str2 == null || str2.length() == 0;
        if (z10 && z11) {
            return true;
        }
        if (z10 || z11) {
            return false;
        }
        return Intrinsics.areEqual(str, str2);
    }

    public static final Method K(Class clazz, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final void K0(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
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

    public static final Method L(String className, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return K(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final void L0(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
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

    public static final Locale N() {
        try {
            return C4331C.l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object O(JSONObject jsonObject, String str, String str2) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            throw new C4357q("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, opt);
        return jSONObject;
    }

    public static final String P(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.toString();
    }

    public static final Object U(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean V() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C4331C.m()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context l10 = C4331C.l();
            PackageManager packageManager = l10.getPackageManager();
            String packageName = l10.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, PKIFailureInfo.notAuthorized);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean W(Context context) {
        AutofillManager a10;
        boolean isAutofillSupported;
        boolean isEnabled;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && (a10 = T.a(context.getSystemService(S.a()))) != null) {
            isAutofillSupported = a10.isAutofillSupported();
            if (isAutofillSupported) {
                isEnabled = a10.isEnabled();
                if (isEnabled) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean X(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        return new Regex(".+_cheets|cheets_.+").matches(DEVICE);
    }

    public static final boolean Y(Uri uri) {
        return uri != null && StringsKt.equals("content", uri.getScheme(), true);
    }

    public static final boolean Z(AccessToken accessToken) {
        return accessToken != null && Intrinsics.areEqual(accessToken, AccessToken.INSTANCE.e());
    }

    public static final boolean a0() {
        if (Y7.a.d(Y.class)) {
            return false;
        }
        try {
            JSONObject C10 = C();
            if (C10 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = C10.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        String string = jSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (Intrinsics.areEqual(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, Y.class);
            return false;
        }
    }

    public static final boolean b0(Uri uri) {
        return uri != null && StringsKt.equals("file", uri.getScheme(), true);
    }

    public static final boolean d0(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : Intrinsics.areEqual(obj, obj2);
    }

    public static final boolean e0(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final JSONObject f(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject a10 = O.a(accessToken);
        if (a10 != null) {
            return a10;
        }
        C4339K k10 = f11042a.F(accessToken).k();
        if (k10.b() != null) {
            return null;
        }
        return k10.d();
    }

    public static final boolean f0(Uri uri) {
        if (uri != null) {
            return StringsKt.equals("http", uri.getScheme(), true) || StringsKt.equals("https", uri.getScheme(), true) || StringsKt.equals("fbstaging", uri.getScheme(), true);
        }
        return false;
    }

    public static final Uri g(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static final Set g0(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                String string = jsonArray.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashSet;
    }

    public static final List h0(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(jsonArray.getString(i10));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public static final void i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Y y10 = f11042a;
            y10.h(context, "facebook.com");
            y10.h(context, ".facebook.com");
            y10.h(context, "https://facebook.com");
            y10.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final Map i0(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final void j(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void j0(String str, Exception exc) {
        if (!C4331C.D() || str == null || exc == null) {
            return;
        }
        exc.getMessage();
    }

    public static final String k(String str, String str2) {
        return d0(str) ? str2 : str;
    }

    public static final void k0(String str, String str2) {
        C4331C.D();
    }

    public static final void l0(String str, String str2, Throwable th2) {
        if (C4331C.D()) {
            d0(str);
        }
    }

    public static final List m(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    String string = jsonArray.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    arrayList.add(string);
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final String m0(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
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
        Intrinsics.checkNotNullExpressionValue(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        return str;
    }

    public static final Map n(JSONObject jsonObject) {
        int length;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names != null && (length = names.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                try {
                    String string = names.getString(i10);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = n((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    public static final String n0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f11042a.S("MD5", key);
    }

    public static final Map o(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final boolean o0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return W(context);
    }

    public static final int p(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[8192];
            int i10 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i10 += read;
            }
            bufferedInputStream.close();
            if (inputStream == null) {
                return i10;
            }
            inputStream.close();
            return i10;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static final Bundle p0(String str) {
        Bundle bundle = new Bundle();
        if (!d0(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object[] array = StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                Object[] array2 = StringsKt.split$default((CharSequence) strArr[i10], new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e10) {
                    j0("FacebookSDK", e10);
                }
                i10 = i11;
            }
        }
        return bundle;
    }

    public static final void q(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final void q0(Bundle b10, String str, List list) {
        Intrinsics.checkNotNullParameter(b10, "b");
        if (list != null) {
            b10.putString(str, TextUtils.join(",", list));
        }
    }

    public static final boolean r0(Bundle bundle, String str, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        }
        if (obj instanceof JSONArray) {
            bundle.putString(str, ((JSONArray) obj).toString());
            return true;
        }
        if (!(obj instanceof JSONObject)) {
            return false;
        }
        bundle.putString(str, ((JSONObject) obj).toString());
        return true;
    }

    public static final String s(int i10) {
        String bigInteger = new BigInteger(i10 * 5, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    public static final void s0(Bundle b10, String str, String str2) {
        Intrinsics.checkNotNullParameter(b10, "b");
        if (d0(str2)) {
            return;
        }
        b10.putString(str, str2);
    }

    public static final String t(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final void t0(Bundle b10, String str, Uri uri) {
        Intrinsics.checkNotNullParameter(b10, "b");
        if (uri != null) {
            s0(b10, str, uri.toString());
        }
    }

    public static final String u(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String n10 = C4331C.n();
            if (n10 != null) {
                return n10;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i10);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Map u0(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i10 = 0;
            do {
                i10++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i10 < readInt);
        }
        return hashMap;
    }

    public static final String v() {
        Context l10 = C4331C.l();
        if (l10 == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = l10.getPackageManager().getPackageInfo(l10.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final String v0(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read == -1) {
                            String sb3 = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(sb3, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                            j(bufferedInputStream);
                            j(inputStreamReader);
                            return sb3;
                        }
                        sb2.append(cArr, 0, read);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    j(bufferedInputStream);
                    j(inputStreamReader);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th2 = th5;
            inputStreamReader = null;
        }
    }

    public static final Map w0(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i10 = 0;
            do {
                i10++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i10 < readInt);
        }
        return hashMap;
    }

    public static final Date x(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
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
        return parseLong == 0 ? new Date(LongCompanionObject.MAX_VALUE) : new Date(dateBase.getTime() + (parseLong * 1000));
    }

    public static final long z(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursor = null;
        try {
            cursor = C4331C.l().getContentResolver().query(contentUri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j10 = cursor.getLong(columnIndex);
            cursor.close();
            return j10;
        } finally {
        }
    }

    public static final boolean z0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public final void A0(Context context) {
        if (Intrinsics.areEqual(f11049h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                f11049h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    public final String B() {
        AccessToken e10 = AccessToken.INSTANCE.e();
        return (e10 == null || e10.getGraphDomain() == null) ? "facebook" : e10.getGraphDomain();
    }

    public final void B0(Context context) {
        if (f11044c == -1 || System.currentTimeMillis() - f11044c >= 1800000) {
            f11044c = System.currentTimeMillis();
            C0();
            A0(context);
            D0();
            x0();
        }
    }

    public final void C0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f11047f = displayName;
            String id2 = timeZone.getID();
            Intrinsics.checkNotNullExpressionValue(id2, "tz.id");
            f11048g = id2;
        } catch (AssertionError | Exception unused) {
        }
    }

    public final String D() {
        return f11048g;
    }

    public final void D0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f11045d = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f11045d = l(f11045d);
        } catch (Exception unused) {
        }
    }

    public final GraphRequest F(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", M(B()));
        bundle.putString("access_token", str);
        GraphRequest y10 = GraphRequest.f30314n.y(null, null);
        y10.J(bundle);
        y10.I(EnumC4340L.GET);
        return y10;
    }

    public final Locale I() {
        return f11051j;
    }

    public final String M(String str) {
        return Intrinsics.areEqual(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public final String Q() {
        return f11050i;
    }

    public final String R(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        int length = digest.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = digest[i10];
            i10++;
            sb2.append(Integer.toHexString((b10 >> 4) & 15));
            sb2.append(Integer.toHexString(b10 & 15));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        return sb3;
    }

    public final String S(String str, String str2) {
        Charset charset = Charsets.UTF_8;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return T(str, bytes);
    }

    public final String T(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            return R(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final void c(JSONObject jSONObject, C1662b c1662b, String str, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !c0(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (c1662b.l()) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    public final boolean c0(Context context) {
        Method L10 = L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (L10 == null) {
            return false;
        }
        Object U10 = U(null, L10, context);
        return (U10 instanceof Integer) && Intrinsics.areEqual(U10, (Object) 0);
    }

    public final void d(JSONObject jSONObject, C1662b c1662b, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !c0(context)) {
            jSONObject.put("attribution", c1662b.j());
        } else {
            if (c1662b.l()) {
                return;
            }
            jSONObject.put("attribution", c1662b.j());
        }
    }

    public final void h(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        Object[] array = StringsKt.split$default((CharSequence) cookie, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            i10++;
            Object[] array2 = StringsKt.split$default((CharSequence) str2, new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (i11 <= length2) {
                    boolean z11 = Intrinsics.compare((int) str3.charAt(!z10 ? i11 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                }
                cookieManager.setCookie(str, Intrinsics.stringPlus(str3.subSequence(i11, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public final long l(double d10) {
        return Math.round(d10 / 1.073741824E9d);
    }

    public final boolean r() {
        return Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
    }

    public final long w() {
        return f11046e;
    }

    public final void x0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f11046e = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f11046e = l(f11046e);
        } catch (Exception unused) {
        }
    }

    public final String y() {
        return f11049h;
    }

    public final int y0() {
        int i10 = f11043b;
        if (i10 > 0) {
            return i10;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: T7.W
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean z02;
                    z02 = Y.z0(file, str);
                    return z02;
                }
            });
            if (listFiles != null) {
                f11043b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f11043b <= 0) {
            f11043b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f11043b;
    }
}
