package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
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
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzcu;
import com.twilio.voice.PublisherMetadata;
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
import kotlin.time.DurationKt;
import w2.AbstractC6699a;

/* loaded from: classes2.dex */
public final class b7 extends P3 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f33942i = 0;
    private static final String[] zzb = {"firebase_", "google_", "ga_"};
    private static final String[] zzc = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f33943c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f33944d;

    /* renamed from: e, reason: collision with root package name */
    public int f33945e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC6699a f33946f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f33947g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f33948h;

    public b7(C3298l3 c3298l3) {
        super(c3298l3);
        this.f33948h = null;
        this.f33944d = new AtomicLong(0L);
    }

    public static MessageDigest C() {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long D(byte[] bArr) {
        AbstractC3191o.m(bArr);
        int length = bArr.length;
        int i10 = 0;
        AbstractC3191o.p(length > 0);
        long j10 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j10 += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    public static boolean E(Context context, boolean z10) {
        AbstractC3191o.m(context);
        return F(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean F(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean N(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean O(String str, String[] strArr) {
        AbstractC3191o.m(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(String str) {
        return !zzc[0].equals(str);
    }

    public static ArrayList h0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(PublisherMetadata.APP_ID, zzahVar.f34422a);
            bundle.putString("origin", zzahVar.f34423b);
            bundle.putLong("creation_timestamp", zzahVar.f34425d);
            bundle.putString("name", zzahVar.f34424c.f34451b);
            R3.a(bundle, AbstractC3191o.m(zzahVar.f34424c.g()));
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, zzahVar.f34426e);
            String str = zzahVar.f34427f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbg zzbgVar = zzahVar.f34428g;
            if (zzbgVar != null) {
                bundle.putString("timed_out_event_name", zzbgVar.f34435a);
                zzbe zzbeVar = zzbgVar.f34436b;
                if (zzbeVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbeVar.l());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.f34429h);
            zzbg zzbgVar2 = zzahVar.f34430i;
            if (zzbgVar2 != null) {
                bundle.putString("triggered_event_name", zzbgVar2.f34435a);
                zzbe zzbeVar2 = zzbgVar2.f34436b;
                if (zzbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbeVar2.l());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.f34424c.f34452c);
            bundle.putLong("time_to_live", zzahVar.f34431j);
            zzbg zzbgVar3 = zzahVar.f34432k;
            if (zzbgVar3 != null) {
                bundle.putString("expired_event_name", zzbgVar3.f34435a);
                zzbe zzbeVar3 = zzbgVar3.f34436b;
                if (zzbeVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbeVar3.l());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean j0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC3191o.m(context);
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

    public static void k0(C3268h5 c3268h5, Bundle bundle, boolean z10) {
        if (bundle != null && c3268h5 != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = c3268h5.f34035a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c3268h5.f34036b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c3268h5.f34037c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && c3268h5 == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean m0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean r0(String str) {
        AbstractC3191o.g(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public final void A(Bundle bundle, String str, Object obj) {
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
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C3298l3 c3298l3 = this.f33578a;
            c3298l3.a().t().c("Not putting event parameter. Invalid value type. name, type", c3298l3.D().b(str), simpleName);
        }
    }

    public final int A0(String str) {
        if (!u0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f33578a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }

    public final void B(a7 a7Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        m0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        a7Var.a(str, "_err", bundle);
    }

    public final boolean B0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean C0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i10) {
                this.f33578a.a().t().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final void D0(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int z02;
        String str4;
        int r10;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        C3298l3 c3298l3 = this.f33578a;
        int i10 = true != c3298l3.w().f33578a.C().V(231100000, true) ? 0 : 35;
        int i11 = 0;
        boolean z11 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                z02 = !z10 ? z0(str5) : 0;
                if (z02 == 0) {
                    z02 = A0(str5);
                }
            } else {
                z02 = 0;
            }
            if (z02 != 0) {
                x(bundle, z02, str5, z02 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (B0(bundle.get(str5))) {
                    c3298l3.a().t().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    r10 = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    r10 = r(str, str2, str5, bundle.get(str5), bundle, list2, z10, false);
                }
                if (r10 != 0 && !"_ev".equals(str5)) {
                    x(bundle, r10, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (r0(str5) && !O(str5, X3.zzd)) {
                    i11++;
                    if (!V(231100000, true)) {
                        c3298l3.a().q().c("Item array not supported on client's version of Google Play Services (Android Only)", c3298l3.D().a(str2), c3298l3.D().e(bundle));
                        m0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i11 > i10) {
                        if (!c3298l3.w().H(str4, AbstractC3209a2.f33869f1) || !z11) {
                            C3376v2 q10 = c3298l3.a().q();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" item-scoped custom params");
                            q10.c(sb2.toString(), c3298l3.D().a(str2), c3298l3.D().e(bundle));
                        }
                        m0(bundle, 28);
                        bundle.remove(str5);
                        list2 = list;
                        z11 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean G() {
        h();
        return J() == 1;
    }

    public final AbstractC6699a H() {
        if (this.f33946f == null) {
            this.f33946f = AbstractC6699a.a(this.f33578a.d());
        }
        return this.f33946f;
    }

    public final int I() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        if (extensionVersion <= 3) {
            return 0;
        }
        extensionVersion2 = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
        return extensionVersion2;
    }

    public final long J() {
        int extensionVersion;
        long j10;
        h();
        if (!L(this.f33578a.L().q())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j10 = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j10 = 8;
            } else {
                C3298l3 c3298l3 = this.f33578a;
                int I10 = I();
                c3298l3.w();
                j10 = I10 < ((Integer) AbstractC3209a2.f33889m0.b(null)).intValue() ? 16L : 0L;
            }
        }
        if (!M("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !K()) {
            j10 = 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    public final boolean K() {
        Object e10;
        Integer num;
        if (this.f33947g == null) {
            AbstractC6699a H10 = H();
            boolean z10 = false;
            if (H10 == null) {
                return false;
            }
            try {
                num = (Integer) H10.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e11) {
                        e10 = e11;
                        this.f33578a.a().r().b("Measurement manager api exception", e10);
                        this.f33947g = Boolean.FALSE;
                        this.f33578a.a().w().b("Measurement manager api status result", num);
                        return this.f33947g.booleanValue();
                    } catch (CancellationException e12) {
                        e10 = e12;
                        this.f33578a.a().r().b("Measurement manager api exception", e10);
                        this.f33947g = Boolean.FALSE;
                        this.f33578a.a().w().b("Measurement manager api status result", num);
                        return this.f33947g.booleanValue();
                    } catch (ExecutionException e13) {
                        e10 = e13;
                        this.f33578a.a().r().b("Measurement manager api exception", e10);
                        this.f33947g = Boolean.FALSE;
                        this.f33578a.a().w().b("Measurement manager api status result", num);
                        return this.f33947g.booleanValue();
                    } catch (TimeoutException e14) {
                        e10 = e14;
                        this.f33578a.a().r().b("Measurement manager api exception", e10);
                        this.f33947g = Boolean.FALSE;
                        this.f33578a.a().w().b("Measurement manager api status result", num);
                        return this.f33947g.booleanValue();
                    }
                }
                this.f33947g = Boolean.valueOf(z10);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e15) {
                e10 = e15;
                num = null;
            }
            this.f33578a.a().w().b("Measurement manager api status result", num);
        }
        return this.f33947g.booleanValue();
    }

    public final boolean L(String str) {
        String str2 = (String) AbstractC3209a2.f33901s0.b(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public final boolean M(String str) {
        h();
        C3298l3 c3298l3 = this.f33578a;
        if (M9.e.a(c3298l3.d()).a(str) == 0) {
            return true;
        }
        c3298l3.a().v().b("Permission not granted", str);
        return false;
    }

    public final boolean P(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C3298l3 c3298l3 = this.f33578a;
        String i10 = c3298l3.w().i();
        c3298l3.c();
        return i10.equals(str);
    }

    public final Bundle Q(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object s10 = s(str2, bundle.get(str2));
                if (s10 == null) {
                    C3298l3 c3298l3 = this.f33578a;
                    c3298l3.a().t().b("Param value can't be null", c3298l3.D().b(str2));
                } else {
                    A(bundle2, str2, s10);
                }
            }
        }
        return bundle2;
    }

    public final zzbg R(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (x0(str2) != 0) {
            C3298l3 c3298l3 = this.f33578a;
            c3298l3.a().o().b("Invalid conditional property event name", c3298l3.D().c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle t10 = t(str, str2, bundle2, K9.f.a("_o"), true);
        if (z10) {
            t10 = Q(t10, str);
        }
        AbstractC3191o.m(t10);
        return new zzbg(str2, new zzbe(t10), str3, j10);
    }

    public final boolean S(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e10 = M9.e.a(context).e(str, 64);
            if (e10 == null || (signatureArr = e10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e11) {
            this.f33578a.a().o().b("Package name not found", e11);
            return true;
        } catch (CertificateException e12) {
            this.f33578a.a().o().b("Error obtaining certificate", e12);
            return true;
        }
    }

    public final byte[] T(Parcelable parcelable) {
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

    public final boolean V(int i10, boolean z10) {
        Boolean x10 = this.f33578a.J().x();
        if (W() < i10 / 1000) {
            return (x10 == null || x10.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int W() {
        if (this.f33948h == null) {
            this.f33948h = Integer.valueOf(C3171d.h().b(this.f33578a.d()) / 1000);
        }
        return this.f33948h.intValue();
    }

    public final int X(int i10) {
        return C3171d.h().j(this.f33578a.d(), AbstractC3175h.f32612a);
    }

    public final long Y(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    public final void Z(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            this.f33578a.a().r().b("Params already contained engagement", Long.valueOf(j11));
        } else {
            j11 = 0;
        }
        bundle.putLong("_et", j10 + j11);
    }

    public final void a0(zzcu zzcuVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.f33578a.a().r().b("Error returning string value to wrapper", e10);
        }
    }

    public final void b0(zzcu zzcuVar, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j10);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.f33578a.a().r().b("Error returning long value to wrapper", e10);
        }
    }

    public final void c0(zzcu zzcuVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.f33578a.a().r().b("Error returning int value to wrapper", e10);
        }
    }

    public final void d0(zzcu zzcuVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.f33578a.a().r().b("Error returning byte array to wrapper", e10);
        }
    }

    public final void e0(zzcu zzcuVar, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.f33578a.a().r().b("Error returning boolean value to wrapper", e10);
        }
    }

    public final void f0(zzcu zzcuVar, Bundle bundle) {
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.f33578a.a().r().b("Error returning bundle value to wrapper", e10);
        }
    }

    public final void g0(zzcu zzcuVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e10) {
            this.f33578a.a().r().b("Error returning bundle list to wrapper", e10);
        }
    }

    @Override // com.google.android.gms.measurement.internal.P3
    public final boolean i() {
        return true;
    }

    public final URL i0(long j10, String str, String str2, long j11, String str3) {
        try {
            AbstractC3191o.g(str2);
            AbstractC3191o.g(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 133005L, Integer.valueOf(W())), str2, str, Long.valueOf(j11));
            if (str.equals(this.f33578a.w().j())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e10) {
            e = e10;
            this.f33578a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e11) {
            e = e11;
            this.f33578a.a().o().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.P3
    public final void j() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f33578a.a().r().a("Utils falling back to Random for random id");
            }
        }
        this.f33944d.set(nextLong);
    }

    public final String l0() {
        byte[] bArr = new byte[16];
        q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object n0(int i10, Object obj, boolean z10, boolean z11, String str) {
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
            return q(obj.toString(), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle Q10 = Q((Bundle) parcelable, null);
                if (!Q10.isEmpty()) {
                    arrayList.add(Q10);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f33578a.a().q().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        AbstractC3191o.m(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        this.f33578a.a().q().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C3392x2.x(str));
        return false;
    }

    public final int o0(String str) {
        if ("_ldl".equals(str)) {
            this.f33578a.w();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f33578a.w();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f33578a.w();
            return 100;
        }
        this.f33578a.w();
        return 36;
    }

    public final boolean p(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            AbstractC3191o.m(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final long p0() {
        long andIncrement;
        long j10;
        AtomicLong atomicLong = this.f33944d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f33944d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nextLong = new Random(System.nanoTime() ^ this.f33578a.e().a()).nextLong();
            int i10 = this.f33945e + 1;
            this.f33945e = i10;
            j10 = nextLong + i10;
        }
        return j10;
    }

    public final String q(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (z10) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
        }
        return null;
    }

    public final SecureRandom q0() {
        h();
        if (this.f33943c == null) {
            this.f33943c = new SecureRandom();
        }
        return this.f33943c;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int size;
        h();
        if (B0(obj)) {
            if (!z11) {
                return 21;
            }
            if (!O(str3, X3.zzc)) {
                return 20;
            }
            Z5 J10 = this.f33578a.J();
            J10.h();
            J10.j();
            if (J10.y() && J10.f33578a.C().W() < 200900) {
                return 25;
            }
            C3298l3 c3298l3 = this.f33578a;
            c3298l3.w();
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                c3298l3.a().t().d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                c3298l3.w();
                if (z12) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i10 = 17;
                if (!C0("param", str3, (!N(str2) || N(str3)) ? this.f33578a.w().y(null, false) : this.f33578a.w().x(null, false), obj)) {
                    if (!z11) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        D0(str, str2, str3, (Bundle) obj, list, z10);
                        return i10;
                    }
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (!(parcelable instanceof Bundle)) {
                                this.f33578a.a().t().c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                                return 4;
                            }
                            D0(str, str2, str3, (Bundle) parcelable, list, z10);
                        }
                    } else {
                        if (!(obj instanceof ArrayList)) {
                            return 4;
                        }
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size2 = arrayList2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            Object obj2 = arrayList2.get(i11);
                            if (!(obj2 instanceof Bundle)) {
                                this.f33578a.a().t().c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                                return 4;
                            }
                            D0(str, str2, str3, (Bundle) obj2, list, z10);
                        }
                    }
                }
                return i10;
            }
        }
        i10 = 0;
        if (!C0("param", str3, (!N(str2) || N(str3)) ? this.f33578a.w().y(null, false) : this.f33578a.w().x(null, false), obj)) {
        }
        return i10;
    }

    public final Object s(String str, Object obj) {
        if ("_ev".equals(str)) {
            return n0(this.f33578a.w().y(null, false), obj, true, true, null);
        }
        return n0(N(str) ? this.f33578a.w().y(null, false) : this.f33578a.w().x(null, false), obj, false, true, null);
    }

    public final Bundle s0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
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
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
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
                bundle.putString("content", queryParameter3);
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
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
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
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            for (String str11 : uri.getQueryParameterNames()) {
                if (str11.startsWith("gad_")) {
                    String queryParameter10 = uri.getQueryParameter(str11);
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(str11, queryParameter10);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e10) {
            this.f33578a.a().r().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    public final Bundle t(String str, String str2, Bundle bundle, List list, boolean z10) {
        int z02;
        List list2 = list;
        boolean O10 = O(str2, W3.zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C3298l3 c3298l3 = this.f33578a;
        int v10 = c3298l3.w().v();
        int i10 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                z02 = !z10 ? z0(str3) : 0;
                if (z02 == 0) {
                    z02 = A0(str3);
                }
            } else {
                z02 = 0;
            }
            if (z02 != 0) {
                x(bundle2, z02, str3, z02 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int r10 = r(str, str2, str3, bundle.get(str3), bundle2, list2, z10, O10);
                if (r10 == 17) {
                    x(bundle2, 17, str3, Boolean.FALSE);
                } else if (r10 != 0 && !"_ev".equals(str3)) {
                    x(bundle2, r10, r10 == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (r0(str3) && (i10 = i10 + 1) > v10) {
                    if (!c3298l3.w().H(null, AbstractC3209a2.f33869f1) || !z11) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(v10).length() + 37);
                        sb2.append("Event can't contain more than ");
                        sb2.append(v10);
                        sb2.append(" params");
                        c3298l3.a().q().c(sb2.toString(), c3298l3.D().a(str2), c3298l3.D().e(bundle));
                    }
                    m0(bundle2, 5);
                    bundle2.remove(str3);
                    z11 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final boolean t0(String str, String str2) {
        if (str2 == null) {
            this.f33578a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f33578a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            this.f33578a.a().q().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f33578a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final void u(C3400y2 c3400y2, int i10) {
        Bundle bundle = c3400y2.f34397d;
        int i11 = 0;
        boolean z10 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (r0(str) && (i11 = i11 + 1) > i10) {
                C3298l3 c3298l3 = this.f33578a;
                if (!c3298l3.w().H(null, AbstractC3209a2.f33869f1) || !z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    c3298l3.a().q().c(sb2.toString(), c3298l3.D().a(c3400y2.f34394a), c3298l3.D().e(bundle));
                    m0(bundle, 5);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    public final boolean u0(String str, String str2) {
        if (str2 == null) {
            this.f33578a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f33578a.a().q().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                this.f33578a.a().q().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                this.f33578a.a().q().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final void v(Parcelable[] parcelableArr, int i10) {
        AbstractC3191o.m(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            boolean z10 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (r0(str) && !O(str, X3.zzd) && (i11 = i11 + 1) > i10) {
                    C3298l3 c3298l3 = this.f33578a;
                    if (!c3298l3.w().H(null, AbstractC3209a2.f33869f1) || !z10) {
                        C3376v2 q10 = c3298l3.a().q();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i10);
                        sb2.append(" item-scoped custom parameters");
                        q10.c(sb2.toString(), c3298l3.D().b(str), c3298l3.D().e(bundle));
                    }
                    m0(bundle, 28);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    public final boolean v0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f33578a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC3191o.m(str2);
        String[] strArr3 = zzb;
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(strArr3[i10])) {
                this.f33578a.a().q().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !O(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && O(str2, strArr2)) {
            return true;
        }
        this.f33578a.a().q().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final void w(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f33578a.C().A(bundle, str, bundle2.get(str));
            }
        }
    }

    public final boolean w0(String str, int i10, String str2) {
        if (str2 == null) {
            this.f33578a.a().q().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        this.f33578a.a().q().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final void x(Bundle bundle, int i10, String str, Object obj) {
        if (m0(bundle, i10)) {
            this.f33578a.w();
            bundle.putString("_ev", q(str, 40, true));
            if (obj != null) {
                AbstractC3191o.m(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int x0(String str) {
        if (!u0("event", str)) {
            return 2;
        }
        if (!v0("event", W3.zza, W3.zzb, str)) {
            return 13;
        }
        this.f33578a.w();
        return !w0("event", 40, str) ? 2 : 0;
    }

    public final int y(String str, Object obj) {
        return "_ldl".equals(str) ? C0("user property referrer", str, o0(str), obj) : C0("user property", str, o0(str), obj) ? 0 : 7;
    }

    public final int y0(String str) {
        if (!u0("user property", str)) {
            return 6;
        }
        if (!v0("user property", Y3.zza, null, str)) {
            return 15;
        }
        this.f33578a.w();
        return !w0("user property", 24, str) ? 6 : 0;
    }

    public final Object z(String str, Object obj) {
        return "_ldl".equals(str) ? n0(o0(str), obj, true, false, null) : n0(o0(str), obj, false, false, null);
    }

    public final int z0(String str) {
        if (!t0("event param", str)) {
            return 3;
        }
        if (!v0("event param", null, null, str)) {
            return 14;
        }
        this.f33578a.w();
        return !w0("event param", 40, str) ? 3 : 0;
    }
}
