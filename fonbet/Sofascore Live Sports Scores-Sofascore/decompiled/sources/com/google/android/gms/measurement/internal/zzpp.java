package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcs;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.fso;
import defpackage.ilg;
import defpackage.muo;
import defpackage.r1c;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpp extends fso {
    public static final String[] j = {"firebase_", "google_", "ga_"};
    public static final String[] k = {"_err"};
    public SecureRandom d;
    public final AtomicLong e;
    public int f;
    public r1c g;
    public Boolean h;
    public Integer i;

    public zzpp(zzic zzicVar) {
        super(zzicVar);
        this.i = null;
        this.e = new AtomicLong(0L);
    }

    public static ArrayList K0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.APP_ID, zzahVar.a);
            bundle.putString("origin", zzahVar.b);
            bundle.putLong("creation_timestamp", zzahVar.d);
            bundle.putString("name", zzahVar.c.b);
            Object zza = zzahVar.c.zza();
            Preconditions.i(zza);
            zzjh.a(bundle, zza);
            bundle.putBoolean("active", zzahVar.e);
            String str = zzahVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbh zzbhVar = zzahVar.g;
            if (zzbhVar != null) {
                bundle.putString("timed_out_event_name", zzbhVar.a);
                zzbf zzbfVar = zzbhVar.b;
                if (zzbfVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbfVar.b1());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.h);
            zzbh zzbhVar2 = zzahVar.i;
            if (zzbhVar2 != null) {
                bundle.putString("triggered_event_name", zzbhVar2.a);
                zzbf zzbfVar2 = zzbhVar2.b;
                if (zzbfVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbfVar2.b1());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.c.c);
            bundle.putLong("time_to_live", zzahVar.j);
            zzbh zzbhVar3 = zzahVar.k;
            if (zzbhVar3 != null) {
                bundle.putString("expired_event_name", zzbhVar3.a);
                zzbf zzbfVar3 = zzbhVar3.b;
                if (zzbfVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbfVar3.b1());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean L0(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void M0(zzlu zzluVar, Bundle bundle, boolean z) {
        if (bundle != null && zzluVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzluVar.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzluVar.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzluVar.c);
                return;
            }
            z = false;
        }
        if (bundle != null && zzluVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean Q0(String str) {
        Preconditions.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean S0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static String X(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    public static boolean c1(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void i0(muo muoVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        o0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        muoVar.f(str, bundle, "_err");
    }

    public static MessageDigest j0() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long k0(byte[] bArr) {
        Preconditions.i(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.l(length > 0);
        long j2 = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j2 += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j2;
    }

    public static boolean l0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static int m0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static final boolean o0(int i, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static boolean r0(String str, String[] strArr) {
        Preconditions.i(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean s0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)).contains(str2);
    }

    public static boolean u0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static byte[] z0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final boolean A0(int i) {
        Boolean bool = ((zzic) this.b).o().f;
        if (B0() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int B0() {
        Integer num = this.i;
        if (num == null) {
            zzic zzicVar = (zzic) this.b;
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.b;
            Context context = zzicVar.a;
            googleApiAvailabilityLight.getClass();
            num = Integer.valueOf(GooglePlayServicesUtilLight.b(context) / 1000);
            this.i = num;
        }
        return num.intValue();
    }

    public final void C0(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.b(Long.valueOf(j3), "Params already contained engagement");
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void D0(String str, zzcs zzcsVar) {
        try {
            zzcsVar.F(bf3.f("r", str));
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.b(e, "Error returning string value to wrapper");
        }
    }

    public final void E0(zzcs zzcsVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzcsVar.F(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.b(e, "Error returning long value to wrapper");
        }
    }

    public final void F0(zzcs zzcsVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcsVar.F(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.b(e, "Error returning int value to wrapper");
        }
    }

    public final void G0(zzcs zzcsVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcsVar.F(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.b(e, "Error returning byte array to wrapper");
        }
    }

    public final void H0(zzcs zzcsVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcsVar.F(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.b(e, "Error returning boolean value to wrapper");
        }
    }

    public final void I0(zzcs zzcsVar, Bundle bundle) {
        try {
            zzcsVar.F(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.b(e, "Error returning bundle value to wrapper");
        }
    }

    public final void J0(zzcs zzcsVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcsVar.F(bundle);
        } catch (RemoteException e) {
            zzgu zzguVar = ((zzic) this.b).f;
            zzic.m(zzguVar);
            zzguVar.j.b(e, "Error returning bundle list to wrapper");
        }
    }

    public final String N0() {
        byte[] bArr = new byte[16];
        P0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long O0() {
        long andIncrement;
        long j2;
        AtomicLong atomicLong = this.e;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.e;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((zzic) this.b).k.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f + 1;
            this.f = i;
            j2 = nextLong + i;
        }
        return j2;
    }

    public final SecureRandom P0() {
        Q();
        SecureRandom secureRandom = this.d;
        if (secureRandom != null) {
            return secureRandom;
        }
        SecureRandom secureRandom2 = new SecureRandom();
        this.d = secureRandom2;
        return secureRandom2;
    }

    @Override // defpackage.fso
    public final boolean R() {
        return true;
    }

    public final Bundle R0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        zzic zzicVar;
        zzic zzicVar2 = (zzic) this.b;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str2 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str4 = uri.getQueryParameter("utm_medium");
                    str5 = uri.getQueryParameter("gclid");
                    str6 = uri.getQueryParameter("gbraid");
                    str7 = uri.getQueryParameter("utm_id");
                    str8 = uri.getQueryParameter("dclid");
                    str9 = uri.getQueryParameter("srsltid");
                    str = uri.getQueryParameter("sfmc_id");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                    str9 = null;
                }
                if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str7) || !TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str)) {
                    Bundle bundle = new Bundle();
                    if (TextUtils.isEmpty(str2)) {
                        zzicVar = zzicVar2;
                    } else {
                        zzicVar = zzicVar2;
                        bundle.putString(MBInterstitialActivity.INTENT_CAMAPIGN, str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("source", str3);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        bundle.putString("medium", str4);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        bundle.putString("gclid", str5);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("gbraid", str6);
                    }
                    String queryParameter = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("gad_source", queryParameter);
                    }
                    String queryParameter2 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("term", queryParameter2);
                    }
                    String queryParameter3 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, queryParameter3);
                    }
                    String queryParameter4 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    String queryParameter5 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("cp1", queryParameter5);
                    }
                    String queryParameter6 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("anid", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        bundle.putString(Payload.CAMPAIGN_ID, str7);
                    }
                    if (!TextUtils.isEmpty(str8)) {
                        bundle.putString("dclid", str8);
                    }
                    String queryParameter7 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("source_platform", queryParameter7);
                    }
                    String queryParameter8 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("creative_format", queryParameter8);
                    }
                    String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("marketing_tactic", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(str9)) {
                        bundle.putString("srsltid", str9);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putString("sfmc_id", str);
                    }
                    for (String str10 : uri.getQueryParameterNames()) {
                        if (str10.startsWith("gad_")) {
                            String queryParameter10 = uri.getQueryParameter(str10);
                            if (!TextUtils.isEmpty(queryParameter10)) {
                                bundle.putString(str10, queryParameter10);
                            }
                        }
                    }
                    zzic zzicVar3 = zzicVar;
                    if (zzicVar3.d.b0(null, zzfy.a1)) {
                        String uri2 = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        zzicVar3.d.getClass();
                        int max = Math.max(500, NotificationCompat.FLAG_LOCAL_ONLY);
                        if (uri2.length() > max) {
                            uri2 = X(max - 3, uri2, true);
                        }
                        if (!TextUtils.isEmpty(uri2)) {
                            bundle.putString("deep_link_url", uri2);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                zzgu zzguVar = zzicVar2.f;
                zzic.m(zzguVar);
                zzguVar.j.b(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean T0(String str, String str2) {
        zzic zzicVar = (zzic) this.b;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.i.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzgu zzguVar3 = zzicVar.f;
            zzic.m(zzguVar3);
            zzguVar3.i.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzgu zzguVar4 = zzicVar.f;
                zzic.m(zzguVar4);
                zzguVar4.i.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean U(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) <= i) {
            return true;
        }
        zzgu zzguVar = ((zzic) this.b).f;
        zzic.m(zzguVar);
        zzguVar.l.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
        return false;
    }

    public final boolean U0(String str, String str2) {
        zzic zzicVar = (zzic) this.b;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.i.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                zzgu zzguVar3 = zzicVar.f;
                zzic.m(zzguVar3);
                zzguVar3.i.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzgu zzguVar4 = zzicVar.f;
                zzic.m(zzguVar4);
                zzguVar4.i.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final void V(String str, String str2, Bundle bundle, List list, boolean z) {
        int a1;
        int Y;
        List list2 = list;
        zzic zzicVar = (zzic) this.b;
        zzal zzalVar = zzicVar.d;
        zzgu zzguVar = zzicVar.f;
        zzgn zzgnVar = zzicVar.j;
        zzpp zzppVar = ((zzic) zzalVar.b).i;
        zzic.k(zzppVar);
        int i = true != zzppVar.A0(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (list2 == null || !list2.contains(str3)) {
                a1 = !z ? a1(str3) : 0;
                if (a1 == 0) {
                    a1 = b1(str3);
                }
            } else {
                a1 = 0;
            }
            if (a1 != 0) {
                e0(bundle, a1, str3, a1 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (c1(bundle.get(str3))) {
                    zzic.m(zzguVar);
                    zzguVar.l.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    Y = 22;
                } else {
                    Y = Y(str, str3, bundle.get(str3), bundle, list2, z, false);
                }
                if (Y != 0 && !"_ev".equals(str3)) {
                    e0(bundle, Y, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (Q0(str3) && !r0(str3, zzjn.d)) {
                    i2++;
                    if (!A0(231100000)) {
                        zzic.m(zzguVar);
                        zzguVar.i.c(zzgnVar.a(str), zzgnVar.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        o0(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            zzic.m(zzguVar);
                            zzguVar.i.c(zzgnVar.a(str), zzgnVar.e(bundle), fn0.k(i, "Item can't contain more than ", " item-scoped custom params", new StringBuilder(String.valueOf(i).length() + 55)));
                        }
                        o0(28, bundle);
                        bundle.remove(str3);
                        list2 = list;
                        z2 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean V0(String str, String[] strArr, String[] strArr2, String str2) {
        zzic zzicVar = (zzic) this.b;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(j[i])) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.i.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !r0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && r0(str2, strArr2)) {
            return true;
        }
        zzgu zzguVar3 = zzicVar.f;
        zzic.m(zzguVar3);
        zzguVar3.i.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean W(String str) {
        zzic zzicVar = (zzic) this.b;
        if (TextUtils.isEmpty(str)) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.i.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        Preconditions.i(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        zzgu zzguVar2 = zzicVar.f;
        zzic.m(zzguVar2);
        zzguVar2.i.b(zzgu.U(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean W0(int i, String str, String str2) {
        zzic zzicVar = (zzic) this.b;
        if (str2 == null) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.i.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        zzgu zzguVar2 = zzicVar.f;
        zzic.m(zzguVar2);
        zzguVar2.i.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final int X0(String str) {
        if (!U0("event", str)) {
            return 2;
        }
        if (V0("event", zzjm.a, ((zzic) this.b).d.b0(null, zzfy.f1) ? zzjm.c : zzjm.b, str)) {
            return !W0(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Y(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        int size;
        zzic zzicVar = (zzic) this.b;
        Q();
        int i3 = 0;
        if (c1(obj)) {
            if (!z2) {
                return 21;
            }
            if (!r0(str2, zzjn.c)) {
                return 20;
            }
            zznl o = zzicVar.o();
            o.Q();
            o.R();
            if (o.X()) {
                zzpp zzppVar = ((zzic) o.b).i;
                zzic.k(zzppVar);
                if (zzppVar.B0() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                zzgu zzguVar = zzicVar.f;
                zzic.m(zzguVar);
                zzguVar.l.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i2 = 500;
                if (!u0(str) || u0(str2)) {
                    zzicVar.d.getClass();
                    i2 = Math.max(500, NotificationCompat.FLAG_LOCAL_ONLY);
                } else {
                    zzicVar.d.getClass();
                }
                if (!U("param", str2, i2, obj)) {
                    if (!z2) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        V(str, str2, (Bundle) obj, list, z);
                        return i;
                    }
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        int length = parcelableArr2.length;
                        while (i3 < length) {
                            Parcelable parcelable = parcelableArr2[i3];
                            if (!(parcelable instanceof Bundle)) {
                                zzgu zzguVar2 = zzicVar.f;
                                zzic.m(zzguVar2);
                                zzguVar2.l.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            V(str, str2, (Bundle) parcelable, list, z);
                            i3++;
                        }
                    } else {
                        if (!(obj instanceof ArrayList)) {
                            return 4;
                        }
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size2 = arrayList2.size();
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            if (!(obj2 instanceof Bundle)) {
                                zzgu zzguVar3 = zzicVar.f;
                                zzic.m(zzguVar3);
                                zzguVar3.l.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            V(str, str2, (Bundle) obj2, list, z);
                            i3++;
                        }
                    }
                }
                return i;
            }
        }
        i = 0;
        i2 = 500;
        if (u0(str)) {
        }
        zzicVar.d.getClass();
        i2 = Math.max(500, NotificationCompat.FLAG_LOCAL_ONLY);
        if (!U("param", str2, i2, obj)) {
        }
        return i;
    }

    public final boolean Y0(String str) {
        return ((zzic) this.b).d.b0(null, zzfy.f1) ? r0(str, zzjm.e) : r0(str, zzjm.d);
    }

    public final Object Z(Object obj, String str) {
        zzic zzicVar = (zzic) this.b;
        int i = 500;
        if ("_ev".equals(str)) {
            zzicVar.d.getClass();
            return p0(Math.max(500, NotificationCompat.FLAG_LOCAL_ONLY), obj, true, true);
        }
        if (u0(str)) {
            zzicVar.d.getClass();
            i = Math.max(500, NotificationCompat.FLAG_LOCAL_ONLY);
        } else {
            zzicVar.d.getClass();
        }
        return p0(i, obj, false, true);
    }

    public final int Z0(String str) {
        if (!U0("user property", str)) {
            return 6;
        }
        if (!V0("user property", zzjo.a, null, str)) {
            return 15;
        }
        zzal zzalVar = ((zzic) this.b).d;
        return !W0(24, "user property", str) ? 6 : 0;
    }

    public final Bundle a0(String str, Bundle bundle, List list, boolean z) {
        int a1;
        List list2 = list;
        boolean r0 = r0(str, zzjm.g);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        zzic zzicVar = (zzic) this.b;
        zzal zzalVar = zzicVar.d;
        zzgn zzgnVar = zzicVar.j;
        zzpp zzppVar = ((zzic) zzalVar.b).i;
        zzic.k(zzppVar);
        int i = zzppVar.A0(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z2 = false;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                a1 = !z ? a1(str2) : 0;
                if (a1 == 0) {
                    a1 = b1(str2);
                }
            } else {
                a1 = 0;
            }
            if (a1 != 0) {
                e0(bundle2, a1, str2, a1 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int Y = Y(str, str2, bundle.get(str2), bundle2, list2, z, r0);
                if (Y == 17) {
                    e0(bundle2, 17, str2, Boolean.FALSE);
                } else if (Y != 0 && !"_ev".equals(str2)) {
                    e0(bundle2, Y, Y == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (Q0(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            String k2 = fn0.k(i, "Event can't contain more than ", " params", new StringBuilder(String.valueOf(i).length() + 37));
                            zzgu zzguVar = zzicVar.f;
                            zzic.m(zzguVar);
                            zzguVar.i.c(zzgnVar.a(str), zzgnVar.e(bundle), k2);
                        }
                        o0(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                    list2 = list;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final int a1(String str) {
        if (!T0("event param", str)) {
            return 3;
        }
        if (!V0("event param", null, null, str)) {
            return 14;
        }
        zzal zzalVar = ((zzic) this.b).d;
        return !W0(40, "event param", str) ? 3 : 0;
    }

    public final void b0(zzgv zzgvVar, int i) {
        Bundle bundle = zzgvVar.e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Q0(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    String k2 = fn0.k(i, "Event can't contain more than ", " params", new StringBuilder(String.valueOf(i).length() + 37));
                    zzic zzicVar = (zzic) this.b;
                    zzgu zzguVar = zzicVar.f;
                    zzgn zzgnVar = zzicVar.j;
                    zzic.m(zzguVar);
                    zzguVar.i.c(zzgnVar.a(zzgvVar.a), zzgnVar.e(bundle), k2);
                    o0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final int b1(String str) {
        if (!U0("event param", str)) {
            return 3;
        }
        if (!V0("event param", null, null, str)) {
            return 14;
        }
        zzal zzalVar = ((zzic) this.b).d;
        return !W0(40, "event param", str) ? 3 : 0;
    }

    public final void c0(Parcelable[] parcelableArr, int i) {
        Preconditions.i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (Q0(str) && !r0(str, zzjn.d) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        zzic zzicVar = (zzic) this.b;
                        zzgu zzguVar = zzicVar.f;
                        zzgn zzgnVar = zzicVar.j;
                        zzic.m(zzguVar);
                        zzguVar.i.c(zzgnVar.b(str), zzgnVar.e(bundle), fn0.k(i, "Param can't contain more than ", " item-scoped custom parameters", new StringBuilder(String.valueOf(i).length() + 60)));
                    }
                    o0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void d0(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                zzpp zzppVar = ((zzic) this.b).i;
                zzic.k(zzppVar);
                zzppVar.h0(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void e0(Bundle bundle, int i, String str, Object obj) {
        if (o0(i, bundle)) {
            zzal zzalVar = ((zzic) this.b).d;
            bundle.putString("_ev", X(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int f0(Object obj, String str) {
        return "_ldl".equals(str) ? U("user property referrer", str, q0(str), obj) : U("user property", str, q0(str), obj) ? 0 : 7;
    }

    public final Object g0(Object obj, String str) {
        return "_ldl".equals(str) ? p0(q0(str), obj, true, false) : p0(q0(str), obj, false, false);
    }

    public final void h0(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzic zzicVar = (zzic) this.b;
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.l.c(zzicVar.j.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long n0() {
        boolean booleanValue;
        Integer num;
        Q();
        zzic zzicVar = (zzic) this.b;
        zzgi q = zzicVar.q();
        zzgu zzguVar = zzicVar.f;
        Integer num2 = null;
        if (!s0((String) zzfy.q0.a(null), q.W())) {
            return 0L;
        }
        long j2 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : m0() < ((Integer) zzfy.k0.a(null)).intValue() ? 16L : 0L;
        if (!t0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0) {
            if (this.h == null) {
                r1c r1cVar = this.g;
                if (r1cVar == null) {
                    r1cVar = r1c.b(zzicVar.a);
                    this.g = r1cVar;
                }
                booleanValue = false;
                if (r1cVar != null) {
                    try {
                        num = (Integer) r1cVar.c().get(Ua.s, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    booleanValue = true;
                                }
                            } catch (InterruptedException e) {
                                e = e;
                                num2 = num;
                                zzic.m(zzguVar);
                                zzguVar.j.b(e, "Measurement manager api exception");
                                this.h = Boolean.FALSE;
                                num = num2;
                                zzic.m(zzguVar);
                                zzguVar.o.b(num, "Measurement manager api status result");
                                booleanValue = this.h.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j2 == 0) {
                                }
                            } catch (CancellationException e2) {
                                e = e2;
                                num2 = num;
                                zzic.m(zzguVar);
                                zzguVar.j.b(e, "Measurement manager api exception");
                                this.h = Boolean.FALSE;
                                num = num2;
                                zzic.m(zzguVar);
                                zzguVar.o.b(num, "Measurement manager api status result");
                                booleanValue = this.h.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j2 == 0) {
                                }
                            } catch (ExecutionException e3) {
                                e = e3;
                                num2 = num;
                                zzic.m(zzguVar);
                                zzguVar.j.b(e, "Measurement manager api exception");
                                this.h = Boolean.FALSE;
                                num = num2;
                                zzic.m(zzguVar);
                                zzguVar.o.b(num, "Measurement manager api status result");
                                booleanValue = this.h.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j2 == 0) {
                                }
                            } catch (TimeoutException e4) {
                                e = e4;
                                num2 = num;
                                zzic.m(zzguVar);
                                zzguVar.j.b(e, "Measurement manager api exception");
                                this.h = Boolean.FALSE;
                                num = num2;
                                zzic.m(zzguVar);
                                zzguVar.o.b(num, "Measurement manager api status result");
                                booleanValue = this.h.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j2 == 0) {
                                }
                            }
                        }
                        this.h = Boolean.valueOf(booleanValue);
                    } catch (InterruptedException e5) {
                        e = e5;
                    } catch (CancellationException e6) {
                        e = e6;
                    } catch (ExecutionException e7) {
                        e = e7;
                    } catch (TimeoutException e8) {
                        e = e8;
                    }
                    zzic.m(zzguVar);
                    zzguVar.o.b(num, "Measurement manager api status result");
                }
                if (!booleanValue) {
                    j2 = 64;
                }
            }
            booleanValue = this.h.booleanValue();
            if (!booleanValue) {
            }
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    public final Object p0(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return obj;
        }
        if (obj instanceof Double) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return X(i, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle w0 = w0((Bundle) parcelable);
                if (!w0.isEmpty()) {
                    arrayList.add(w0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int q0(String str) {
        zzic zzicVar = (zzic) this.b;
        if ("_ldl".equals(str)) {
            zzal zzalVar = zzicVar.d;
            return a.o;
        }
        if ("_id".equals(str)) {
            zzal zzalVar2 = zzicVar.d;
            return NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if ("_lgclid".equals(str)) {
            zzal zzalVar3 = zzicVar.d;
            return 100;
        }
        zzal zzalVar4 = zzicVar.d;
        return 36;
    }

    public final boolean t0(String str) {
        Q();
        zzic zzicVar = (zzic) this.b;
        if (Wrappers.a(zzicVar.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.n.b(str, "Permission not granted");
        return false;
    }

    public final boolean v0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((zzic) this.b).d.U("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle w0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object Z = Z(bundle.get(str), str);
                if (Z == null) {
                    zzic zzicVar = (zzic) this.b;
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.l.b(zzicVar.j.b(str), "Param value can't be null");
                } else {
                    h0(bundle2, str, Z);
                }
            }
        }
        return bundle2;
    }

    public final zzbh x0(String str, Bundle bundle, String str2, long j2, long j3, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (X0(str) != 0) {
            zzic zzicVar = (zzic) this.b;
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.b(zzicVar.j.c(str), "Invalid conditional property event name");
            ilg.c();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle a0 = a0(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            a0 = w0(a0);
        }
        Preconditions.i(a0);
        return new zzbh(str, new zzbf(a0), str2, j2, j3);
    }

    public final boolean y0(Context context, String str) {
        Signature[] signatureArr;
        zzic zzicVar = (zzic) this.b;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = Wrappers.a(context).b(64, str);
            if (b == null || (signatureArr = b.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.g.b(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            zzgu zzguVar2 = zzicVar.f;
            zzic.m(zzguVar2);
            zzguVar2.g.b(e2, "Error obtaining certificate");
            return true;
        }
    }
}
