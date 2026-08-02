package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzgbp;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.fc6;
import defpackage.vxd;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf {
    public float a = -1.0f;
    public static final Handler zza = new zzgbp(Looper.getMainLooper());
    public static final String b = AdView.class.getName();
    public static final String c = InterstitialAd.class.getName();
    public static final String d = AdManagerAdView.class.getName();
    public static final String e = AdManagerInterstitialAd.class.getName();
    public static final String f = AdLoader.class.getName();

    public static String a(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static final void e(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i, int i2) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i);
        textView.setBackgroundColor(i2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i);
        int zzE = zzE(context, 3);
        int i3 = zzrVar.zzf;
        int i4 = zzrVar.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i3 - zzE, i4 - zzE, 17));
        viewGroup.addView(frameLayout, i3, i4);
    }

    public static final boolean zzA(Context context) {
        int b2 = GoogleApiAvailabilityLight.b.b(context, 12451000);
        return b2 == 0 || b2 == 2;
    }

    public static final boolean zzB() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int zzC(DisplayMetrics displayMetrics, int i) {
        return Math.round(i / displayMetrics.density);
    }

    public static final void zzD(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(L6.F, Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            GoogleApiAvailabilityLight.b.getClass();
            int b2 = GooglePlayServicesUtilLight.b(context);
            str = fc6.h(b2, ".262180000", new StringBuilder(String.valueOf(b2).length() + 10));
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(appendQueryParameter.toString());
    }

    public static final int zzE(Context context, int i) {
        return zzw(context.getResources().getDisplayMetrics(), i);
    }

    @Nullable
    public static final String zzF(Context context) {
        zzbjg.a(context);
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || zzy()) {
            string = "emulator";
        }
        return a(string, SameMD5.TAG);
    }

    public static Object zzd(Map map, Object obj, Object obj2) {
        return map.containsKey(obj) ? map.get(obj) : obj2;
    }

    @Nullable
    public static ActivityManager.MemoryInfo zze(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (NullPointerException unused) {
            zzo.zzi("Error retrieving the memory information.");
            return memoryInfo;
        }
    }

    @Nullable
    public static String zzf(Context context) {
        if (context == null) {
            return null;
        }
        try {
            Bundle bundle = Wrappers.a(context).a(128, context.getPackageName()).metaData;
            if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                return bundle.getString("com.google.unity.ads.UNITY_VERSION");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @Nullable
    public static String zzg(String str) {
        return a(str, SameMD5.TAG);
    }

    @Nullable
    public static String zzh(String str) {
        return a(str, "SHA-256");
    }

    public static String zzj() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static AdSize zzk(Context context, int i, int i2, int i3) {
        int zzr = zzr(context, i3);
        if (zzr == -1) {
            return AdSize.INVALID;
        }
        return new AdSize(i, Math.max(Math.min(i > 655 ? vxd.b(i, 728.0f, 90.0f) : i > 632 ? 81 : i > 526 ? vxd.b(i, 468.0f, 60.0f) : i > 432 ? 68 : vxd.b(i, 320.0f, 50.0f), Math.min(90, Math.round(zzr * 0.15f))), 50));
    }

    public static AdSize zzl(Context context, int i, int i2) {
        int zzr = zzr(context, i2);
        if (zzr == -1) {
            return AdSize.INVALID;
        }
        return new AdSize(i, Math.max(Math.min(Math.max(100, Math.round((i / 320.0f) * 100.0f)), Math.min(150, Math.round(zzr * 0.2f))), 50));
    }

    public static boolean zzq(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzblq.d.c());
    }

    public static int zzr(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return i == i2 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    @Nullable
    public static PreloadConfiguration zzs(zzfp zzfpVar) {
        PreloadConfiguration zzt = zzt(zzfpVar);
        if (zzt == null) {
            return null;
        }
        PreloadConfiguration.Builder builder = new PreloadConfiguration.Builder(zzt.getAdUnitId());
        builder.setAdRequest(zzt.getAdRequest());
        builder.setBufferSize(zzt.getBufferSize());
        return builder.build();
    }

    @Nullable
    public static PreloadConfiguration zzt(@NonNull zzfp zzfpVar) {
        String str = zzfpVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return null;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfpVar.zzc;
        AdRequest.Builder builder = new AdRequest.Builder();
        List list = zzmVar.zze;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((String) it.next());
            }
        }
        builder.zza(zzmVar.zzm);
        Bundle bundle = zzmVar.zzn;
        for (String str2 : bundle.keySet()) {
            builder.addCustomTargeting(str2, bundle.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        String str3 = zzmVar.zzl;
        if (str3 != null) {
            builder.setContentUrl(str3);
        }
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        AdRequest build = builder.build();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(build);
        builder2.setBufferSize(zzfpVar.zzd);
        return builder2.build();
    }

    public static zzfp zzu(Context context, PreloadConfiguration preloadConfiguration, AdFormat adFormat) {
        PreloadConfiguration.Builder builder = new PreloadConfiguration.Builder(preloadConfiguration.getAdUnitId(), adFormat);
        builder.setAdRequest(preloadConfiguration.getAdRequest());
        builder.setBufferSize(preloadConfiguration.getBufferSize());
        return zzv(context, builder.build(), 2);
    }

    public static zzfp zzv(Context context, PreloadConfiguration preloadConfiguration, int i) {
        boolean z;
        int intValue;
        com.google.android.gms.ads.internal.client.zzm zza2 = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, preloadConfiguration.getAdRequest().zza());
        int i2 = 1;
        if (i == 1) {
            zza2.zzc.putBoolean("is_sdk_preload", true);
        } else {
            zza2.zzc.putBoolean("zenith_v2", true);
        }
        int bufferSize = preloadConfiguration.getBufferSize();
        if (bufferSize <= 0) {
            int ordinal = preloadConfiguration.getAdFormat().ordinal();
            if (ordinal == 1) {
                bufferSize = ((Integer) zzba.zzc().a(zzbjg.l0)).intValue();
            } else if (ordinal == 2) {
                bufferSize = ((Integer) zzba.zzc().a(zzbjg.m0)).intValue();
            } else if (ordinal != 5) {
                bufferSize = 1;
            } else {
                bufferSize = ((Integer) zzba.zzc().a(zzbjg.k0)).intValue();
            }
            z = true;
        } else {
            z = false;
        }
        int ordinal2 = preloadConfiguration.getAdFormat().ordinal();
        if (ordinal2 == 1) {
            intValue = ((Integer) zzba.zzc().a(zzbjg.i0)).intValue();
        } else if (ordinal2 == 2) {
            intValue = ((Integer) zzba.zzc().a(zzbjg.j0)).intValue();
        } else if (ordinal2 != 5) {
            intValue = 1;
        } else {
            intValue = ((Integer) zzba.zzc().a(zzbjg.h0)).intValue();
        }
        int max = Math.max(Math.min(intValue, 15), 1);
        int ordinal3 = preloadConfiguration.getAdFormat().ordinal();
        if (ordinal3 == 1) {
            i2 = ((Integer) zzba.zzc().a(zzbjg.o0)).intValue();
        } else if (ordinal3 == 2) {
            i2 = ((Integer) zzba.zzc().a(zzbjg.p0)).intValue();
        } else if (ordinal3 == 5) {
            i2 = ((Integer) zzba.zzc().a(zzbjg.n0)).intValue();
        }
        return new zzfp(preloadConfiguration.getAdUnitId(), preloadConfiguration.getAdFormat().getValue(), zza2, Math.max(Math.min(bufferSize, max), Math.min(i2, max)), z);
    }

    public static final int zzw(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    @Nullable
    public static final String zzx(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        int i2;
        String str2;
        while (true) {
            i2 = i + 1;
            if (i2 >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className = stackTraceElement.getClassName();
            i = ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (b.equalsIgnoreCase(className) || c.equalsIgnoreCase(className) || d.equalsIgnoreCase(className) || e.equalsIgnoreCase(className) || f.equalsIgnoreCase(className))) ? 0 : i2;
        }
        str2 = stackTraceElementArr[i2].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i3 = 2; i3 > 0 && stringTokenizer.hasMoreElements(); i3--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzy() {
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.ad)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return booleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final boolean zzz(Context context, int i) {
        return GoogleApiAvailabilityLight.b.b(context, i) == 0;
    }

    public final JSONArray b(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void c(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(zzo((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(zzm((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(b((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(f((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final void d(JSONObject jSONObject, String str, Object obj) {
        if (((Boolean) zzba.zzc().a(zzbjg.u)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzo((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, zzm((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), b((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, b(Arrays.asList((Object[]) obj)));
            return;
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            while (i < length) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            jSONObject.put(str, f(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            Double[] dArr2 = new Double[length2];
            while (i < length2) {
                dArr2[i] = Double.valueOf(dArr[i]);
                i++;
            }
            jSONObject.put(str, f(dArr2));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            Long[] lArr = new Long[length3];
            while (i < length3) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            jSONObject.put(str, f(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length4 = zArr.length;
        Boolean[] boolArr = new Boolean[length4];
        while (i < length4) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
            i++;
        }
        jSONObject.put(str, f(boolArr));
    }

    public final JSONArray f(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    public final int zza(Context context, int i) {
        float f2 = this.a;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            synchronized (this) {
                try {
                    f2 = this.a;
                    if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        float f3 = displayMetrics.density;
                        this.a = f3;
                        f2 = f3;
                    }
                } finally {
                }
            }
        }
        return Math.round(i / f2);
    }

    public final void zzb(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzo.zzi(str2);
        }
        e(viewGroup, zzrVar, str, -65536, -16777216);
    }

    public final void zzc(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar, @Nullable String str) {
        e(viewGroup, zzrVar, "Ads by Google", -16777216, -1);
    }

    public final void zzi(final Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        zzD(context, str, "gmob-apps", bundle, true, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzd
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final /* synthetic */ zzt zza(String str3) {
                new zzc(zzf.this, context, str3).start();
                return zzt.zza;
            }
        });
    }

    public final JSONObject zzm(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                d(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    public final JSONObject zzn(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzo(bundle);
            } catch (JSONException e2) {
                zzo.zzg("Error converting Bundle to JSON", e2);
            }
        }
        return jSONObject;
    }

    public final JSONObject zzo(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            d(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }
}
