package com.google.ads.conversiontracking;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.conversiontracking.i;
import com.ironsource.B5;
import com.ironsource.M6;
import com.ironsource.X3;
import io.ktor.sse.ServerSentEventKt;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class g {
    private static final Map<String, String> a = new HashMap();
    private static boolean b = false;
    private static long c = -1;
    private static boolean d = true;
    private static boolean e = false;
    private static final Object f = new Object();
    private static e g = null;
    private static boolean h = false;

    public enum d {
        DOUBLECLICK_AUDIENCE,
        DOUBLECLICK_CONVERSION,
        GOOGLE_CONVERSION,
        IAP_CONVERSION
    }

    public static e a(Context context) {
        e eVar;
        synchronized (f) {
            if (g == null) {
                g = new e(context);
            }
            eVar = g;
        }
        return eVar;
    }

    public static boolean a(Context context, c cVar, boolean z) {
        return a(context, a(cVar), b(cVar), z);
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        if (b && e) {
            return d;
        }
        if (z) {
            return true;
        }
        boolean z2 = context.getSharedPreferences(str, 0).getBoolean(str2, false);
        if (z2) {
            String valueOf = String.valueOf(str2);
            Log.i("GoogleConversionReporter", valueOf.length() != 0 ? "Already sent ping for conversion ".concat(valueOf) : new String("Already sent ping for conversion "));
        }
        return !z2;
    }

    public static long b(Context context) {
        return context.getSharedPreferences("google_conversion", 0).getLong("last_retry_time", 0L);
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, true);
        edit.commit();
    }

    public static void c(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("google_conversion", 0).edit();
        edit.putLong("last_retry_time", a());
        edit.commit();
    }

    public static String a(Context context, c cVar) throws NoSuchAlgorithmException {
        return a(context, cVar, new com.google.ads.conversiontracking.a(context).a());
    }

    public static String a(Context context, c cVar, i.a aVar) throws NoSuchAlgorithmException {
        String str;
        String packageName = context.getPackageName();
        try {
            str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GoogleConversionReporter", "Error to retrieve app version", e2);
            str = "";
        }
        String e3 = aVar == null ? e(context) : null;
        if (!cVar.c && cVar.d == d.DOUBLECLICK_CONVERSION) {
            return a(cVar, packageName, str, aVar, e3);
        }
        if (cVar.d == d.DOUBLECLICK_AUDIENCE) {
            return a(cVar, aVar);
        }
        if (cVar.d == d.IAP_CONVERSION) {
            return c(cVar, packageName, str, aVar, e3);
        }
        return b(cVar, packageName, str, aVar, e3);
    }

    private static void a(Uri.Builder builder, boolean z, Map<String, ?> map) {
        if (!z || map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            if (entry.getValue() instanceof String) {
                String valueOf = String.valueOf("data.");
                String valueOf2 = String.valueOf(entry.getKey());
                builder.appendQueryParameter(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) entry.getValue());
            } else if (entry.getValue() instanceof String[]) {
                for (String str : (String[]) entry.getValue()) {
                    String valueOf3 = String.valueOf("data.");
                    String valueOf4 = String.valueOf(entry.getKey());
                    builder.appendQueryParameter(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), str);
                }
            }
        }
    }

    public static b a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String valueOf = String.valueOf(queryParameter);
        Uri parse = Uri.parse(valueOf.length() != 0 ? "http://hostname/?".concat(valueOf) : new String("http://hostname/?"));
        String queryParameter2 = parse.getQueryParameter("conv");
        String queryParameter3 = parse.getQueryParameter("gclid");
        if (TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter3)) {
            return null;
        }
        String queryParameter4 = parse.getQueryParameter("ai");
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        return new b(queryParameter2, new a(queryParameter3, queryParameter4));
    }

    public static String a(a aVar) {
        if (aVar == null) {
            return "";
        }
        if (TextUtils.isEmpty(aVar.b)) {
            String valueOf = String.valueOf("&gclid=");
            String valueOf2 = String.valueOf(aVar.a);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        String valueOf3 = String.valueOf("&gclid=");
        String str = aVar.a;
        String valueOf4 = String.valueOf("ai");
        String str2 = aVar.b;
        return new StringBuilder(String.valueOf(valueOf3).length() + 2 + String.valueOf(str).length() + String.valueOf(valueOf4).length() + String.valueOf(str2).length()).append(valueOf3).append(str).append(X3.j.c).append(valueOf4).append("=").append(str2).toString();
    }

    private static List<String> a(SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (a.a((String) entry.getValue()) == null) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public static boolean a(Context context, final b bVar) {
        if (bVar == null) {
            return false;
        }
        final SharedPreferences sharedPreferences = context.getSharedPreferences("google_conversion_click_referrer", 0);
        final List<String> a2 = a(sharedPreferences);
        if (sharedPreferences.getString(bVar.a, null) == null && sharedPreferences.getAll().size() == 100 && a2.isEmpty()) {
            return false;
        }
        String str = bVar.b.a;
        String valueOf = String.valueOf(ServerSentEventKt.SPACE);
        String str2 = bVar.b.b;
        String valueOf2 = String.valueOf(ServerSentEventKt.SPACE);
        final String sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(valueOf).length() + String.valueOf(str2).length() + String.valueOf(valueOf2).length()).append(str).append(valueOf).append(str2).append(valueOf2).append(bVar.b.c).toString();
        synchronized (a) {
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                a.remove(it.next());
            }
            a.put(bVar.a, sb);
        }
        new Thread(new Runnable() { // from class: com.google.ads.conversiontracking.g.1
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                Iterator it2 = a2.iterator();
                while (it2.hasNext()) {
                    edit.remove((String) it2.next());
                }
                edit.putString(bVar.a, sb);
                edit.commit();
            }
        }).start();
        return true;
    }

    public static a a(Context context, String str) {
        String str2;
        Map<String, String> map = a;
        synchronized (map) {
            str2 = map.get(str);
        }
        if (str2 == null) {
            str2 = context.getSharedPreferences("google_conversion_click_referrer", 0).getString(str, "");
        }
        return a.a(str2);
    }

    static String a(long j) {
        return String.format(Locale.US, "%d.%03d", Long.valueOf(j / 1000), Long.valueOf(j % 1000));
    }

    private static String a(i.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.b() ? "1" : "0";
    }

    private static void a(StringBuilder sb, i.a aVar, String str) {
        String a2 = a(aVar);
        if (a2 != null) {
            String valueOf = String.valueOf(";dc_lat=");
            String valueOf2 = String.valueOf(a2);
            sb.append(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
        if (aVar == null) {
            String valueOf3 = String.valueOf(";isu=");
            String valueOf4 = String.valueOf(str);
            sb.append(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
        } else {
            String valueOf5 = String.valueOf(";dc_rdid=");
            String valueOf6 = String.valueOf(aVar.a());
            sb.append(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5));
        }
    }

    private static void a(Uri.Builder builder, i.a aVar, String str) {
        if (a(aVar) != null) {
            builder.appendQueryParameter(M6.s, a(aVar));
        }
        if (aVar != null) {
            builder.appendQueryParameter("rdid", aVar.a());
        } else {
            builder.appendQueryParameter("muid", str);
        }
    }

    public static String a(c cVar, String str, String str2, i.a aVar, String str3) {
        String valueOf = String.valueOf("https://pubads.g.doubleclick.net/activity;xsp=");
        String str4 = cVar.a;
        String valueOf2 = String.valueOf("ait");
        String valueOf3 = String.valueOf(B5.d);
        String valueOf4 = String.valueOf("appversion");
        String valueOf5 = String.valueOf("osversion");
        String valueOf6 = String.valueOf(Build.VERSION.RELEASE);
        String valueOf7 = String.valueOf(B5.b);
        String valueOf8 = String.valueOf("ct-sdk-a-v2.2.4");
        String valueOf9 = String.valueOf("timestamp");
        String a2 = a(a());
        StringBuilder sb = new StringBuilder(new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(str4).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(str).length() + String.valueOf(valueOf4).length() + String.valueOf(str2).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length() + String.valueOf(a2).length()).append(valueOf).append(str4).append(";").append(valueOf2).append("=1;").append(valueOf3).append("=").append(str).append(";").append(valueOf4).append("=").append(str2).append(";").append(valueOf5).append("=").append(valueOf6).append(";").append(valueOf7).append("=").append(valueOf8).append(";").append(valueOf9).append("=").append(a2).toString());
        a(sb, aVar, str3);
        return sb.toString();
    }

    public static String a(c cVar, i.a aVar) {
        if (aVar == null) {
            return null;
        }
        String valueOf = String.valueOf("https://pubads.g.doubleclick.net/activity;dc_iu=");
        String valueOf2 = String.valueOf(cVar.f);
        StringBuilder sb = new StringBuilder(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        a(sb, aVar, (String) null);
        if (cVar.i != null) {
            for (Map.Entry entry : cVar.i.entrySet()) {
                String encode = Uri.encode((String) entry.getKey());
                String encode2 = Uri.encode(entry.getValue().toString());
                sb.append(new StringBuilder(String.valueOf(encode).length() + 2 + String.valueOf(encode2).length()).append(";").append(encode).append("=").append(encode2).toString());
            }
        }
        return sb.toString();
    }

    public static String b(c cVar, String str, String str2, i.a aVar, String str3) {
        String a2 = a(cVar.h);
        Uri.Builder appendQueryParameter = Uri.parse("https://www.googleadservices.com/pagead/conversion/").buildUpon().appendEncodedPath(String.valueOf(cVar.a).concat("/")).appendQueryParameter(B5.d, str).appendQueryParameter("appversion", str2).appendQueryParameter("osversion", Build.VERSION.RELEASE).appendQueryParameter(B5.b, "ct-sdk-a-v2.2.4").appendQueryParameter("gms", aVar != null ? "1" : "0");
        a(appendQueryParameter, aVar, str3);
        if (cVar.e != null && cVar.f != null) {
            appendQueryParameter.appendQueryParameter("label", cVar.e).appendQueryParameter("value", cVar.f);
        }
        if (cVar.k != 0) {
            appendQueryParameter.appendQueryParameter("timestamp", a(cVar.k));
        } else {
            appendQueryParameter.appendQueryParameter("timestamp", a(a()));
        }
        if (cVar.c) {
            appendQueryParameter.appendQueryParameter("remarketing_only", "1");
        }
        if (cVar.l) {
            appendQueryParameter.appendQueryParameter("auto", "1");
        }
        if (cVar.b) {
            appendQueryParameter.appendQueryParameter("usage_tracking_enabled", "1");
        } else {
            appendQueryParameter.appendQueryParameter("usage_tracking_enabled", "0");
        }
        if (cVar.g != null) {
            appendQueryParameter.appendQueryParameter("currency_code", cVar.g);
        }
        a(appendQueryParameter, cVar.c, (Map<String, ?>) cVar.i);
        String valueOf = String.valueOf(appendQueryParameter.build());
        return new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(a2).length()).append(valueOf).append(a2).toString();
    }

    public static String c(c cVar, String str, String str2, i.a aVar, String str3) {
        Uri.Builder appendQueryParameter = Uri.parse("https://www.googleadservices.com/pagead/conversion/").buildUpon().appendQueryParameter(AppLovinEventParameters.PRODUCT_IDENTIFIER, cVar.j).appendQueryParameter("value", cVar.f).appendQueryParameter(B5.d, str).appendQueryParameter("appversion", str2).appendQueryParameter("osversion", Build.VERSION.RELEASE).appendQueryParameter(B5.b, "ct-sdk-a-v2.2.4").appendQueryParameter("timestamp", a(a()));
        a(appendQueryParameter, aVar, str3);
        return appendQueryParameter.build().toString();
    }

    /* renamed from: com.google.ads.conversiontracking.g$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.DOUBLECLICK_CONVERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.IAP_CONVERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.GOOGLE_CONVERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(c cVar) {
        int i = AnonymousClass2.a[cVar.d.ordinal()];
        if (i == 1) {
            return "doubleclick_nonrepeatable_conversion";
        }
        if (i == 2) {
            return "iap_nonrepeatable_conversion";
        }
        return "google_nonrepeatable_conversion";
    }

    public static String b(c cVar) {
        int i = AnonymousClass2.a[cVar.d.ordinal()];
        if (i != 1) {
            return i != 2 ? cVar.e : String.format("google_iap_ping:%s", cVar.j);
        }
        return cVar.a;
    }

    static long a() {
        if (b) {
            long j = c;
            if (j >= 0) {
                return j;
            }
        }
        return System.currentTimeMillis();
    }

    private static String e(Context context) throws NoSuchAlgorithmException {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null) {
            string = AbstractJsonLexerKt.NULL;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(string.getBytes());
        return s.a(messageDigest.digest(), false);
    }

    public static boolean d(Context context) {
        if (b) {
            return h;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static String a(String str) {
        if (((String) a(str)).length() != 0) {
            return str;
        }
        throw new IllegalStateException("Parameter cannot be empty string");
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static class b {
        private final String a;
        private final a b;

        public b(String str, a aVar) {
            this.a = str;
            this.b = aVar;
        }
    }

    public static class a {
        private final String a;
        private final String b;
        private final long c;

        private a(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public a(String str, String str2) {
            this(str, str2, g.a());
        }

        public boolean a() {
            return this.c + 7776000000L < g.a();
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split(ServerSentEventKt.SPACE);
            if (split.length != 3) {
                return null;
            }
            try {
                a aVar = new a(split[0], split[1], Long.parseLong(split[2]));
                if (aVar.a()) {
                    return null;
                }
                return aVar;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }

    public static class c {
        private String a;
        private boolean b;
        private boolean c;
        private d d;
        private String e;
        private String f;
        private String g;
        private a h;
        private Map<String, ?> i;
        private String j;
        private long k;
        private boolean l;

        public c a(String str) {
            this.a = str;
            return this;
        }

        public c a() {
            this.c = true;
            return this;
        }

        public c a(d dVar) {
            this.d = dVar;
            return this;
        }

        public c b(String str) {
            this.e = str;
            return this;
        }

        public c c(String str) {
            this.f = str;
            return this;
        }

        public c d(String str) {
            this.g = str;
            return this;
        }

        public c a(a aVar) {
            this.h = aVar;
            return this;
        }

        public c a(Map<String, ?> map) {
            this.i = map;
            return this;
        }

        public c e(String str) {
            this.j = str;
            return this;
        }

        public c a(boolean z) {
            this.b = z;
            return this;
        }

        public c a(long j) {
            this.k = TimeUnit.MILLISECONDS.toSeconds(j);
            return this;
        }

        public c b() {
            this.l = true;
            return this;
        }
    }
}
