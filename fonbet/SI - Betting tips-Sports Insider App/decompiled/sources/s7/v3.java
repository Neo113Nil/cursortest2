package s7;

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
import android.util.Log;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.sports.insider.data.repository.room.metric.EventsTable;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
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
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v3 extends l1 {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f23150i = {"firebase_", "google_", "ga_"};
    public static final String[] j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f23151c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f23152d;

    /* renamed from: e, reason: collision with root package name */
    public int f23153e;

    /* renamed from: f, reason: collision with root package name */
    public g2.b f23154f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f23155g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f23156h;

    public v3(f1 f1Var) {
        super(f1Var);
        this.f23156h = null;
        this.f23152d = new AtomicLong(0L);
    }

    public static MessageDigest A() {
        MessageDigest messageDigest;
        for (int i5 = 0; i5 < 2; i5++) {
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

    public static long B(byte[] bArr) {
        g6.v.h(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i5 = 0;
        long j6 = 0;
        for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
            j6 += (bArr[i10] & 255) << i5;
            i5 += 8;
        }
        return j6;
    }

    public static boolean C(Context context) {
        g6.v.h(context);
        return Build.VERSION.SDK_INT >= 24 ? D(context, "com.google.android.gms.measurement.AppMeasurementJobService") : D(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean D(Context context, String str) {
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

    public static int F() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static boolean H(String str) {
        String str2 = (String) x.f23216s0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(StringUtils.COMMA)).contains(str);
    }

    public static boolean J(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean K(String str, String[] strArr) {
        g6.v.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] P(Parcelable parcelable) {
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

    public static ArrayList a0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString(CommonUrlParts.APP_ID, zzahVar.f5785a);
            bundle.putString("origin", zzahVar.f5786b);
            bundle.putLong("creation_timestamp", zzahVar.f5788d);
            bundle.putString("name", zzahVar.f5787c.f5814b);
            Object c2 = zzahVar.f5787c.c();
            g6.v.h(c2);
            r1.c(bundle, c2);
            bundle.putBoolean("active", zzahVar.f5789e);
            String str = zzahVar.f5790f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbg zzbgVar = zzahVar.f5791g;
            if (zzbgVar != null) {
                bundle.putString("timed_out_event_name", zzbgVar.f5797a);
                zzbe zzbeVar = zzbgVar.f5798b;
                if (zzbeVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbeVar.s0());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.f5792h);
            zzbg zzbgVar2 = zzahVar.f5793i;
            if (zzbgVar2 != null) {
                bundle.putString("triggered_event_name", zzbgVar2.f5797a);
                zzbe zzbeVar2 = zzbgVar2.f5798b;
                if (zzbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbeVar2.s0());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.f5787c.f5815c);
            bundle.putLong("time_to_live", zzahVar.j);
            zzbg zzbgVar3 = zzahVar.f5794k;
            if (zzbgVar3 != null) {
                bundle.putString("expired_event_name", zzbgVar3.f5797a);
                zzbe zzbeVar3 = zzbgVar3.f5798b;
                if (zzbeVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbeVar3.s0());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean b0(Context context) {
        ActivityInfo receiverInfo;
        g6.v.h(context);
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

    public static void c0(l2 l2Var, Bundle bundle, boolean z5) {
        if (bundle != null && l2Var != null) {
            if (!bundle.containsKey("_sc") || z5) {
                String str = l2Var.f22871a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = l2Var.f22872b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", l2Var.f22873c);
                return;
            }
            z5 = false;
        }
        if (bundle != null && l2Var == null && z5) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean e0(int i5, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i5);
        return true;
    }

    public static boolean j0(String str) {
        g6.v.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String o(String str, int i5, boolean z5) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i5) {
                return str;
            }
            if (z5) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i5))).concat("...");
            }
        }
        return null;
    }

    public static boolean t0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void z(u3 u3Var, String str, int i5, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        e0(i5, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i5 == 6 || i5 == 7 || i5 == 2) {
            bundle.putLong("_el", i10);
        }
        u3Var.a(str, "_err", bundle);
    }

    public final g2.b E() {
        d5 d5Var;
        Object obj;
        if (this.f23154f == null) {
            Context context = ((f1) this.f3328a).f22740a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
            int i5 = Build.VERSION.SDK_INT;
            e2.b bVar = e2.b.f8470a;
            sb2.append(i5 >= 33 ? bVar.a() : 0);
            Log.d("MeasurementManager", sb2.toString());
            if ((i5 >= 33 ? bVar.a() : 0) >= 5) {
                d5Var = new h2.b(context, 1);
            } else {
                e2.a aVar = e2.a.f8469a;
                if (((i5 == 31 || i5 == 32) ? aVar.a() : 0) >= 9) {
                    androidx.fragment.app.r manager = new androidx.fragment.app.r(1, context);
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("MeasurementManager", "tag");
                    Intrinsics.checkNotNullParameter(manager, "manager");
                    try {
                        obj = manager.invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i10 = Build.VERSION.SDK_INT;
                        sb3.append((i10 == 31 || i10 == 32) ? aVar.a() : 0);
                        Log.d("MeasurementManager", sb3.toString());
                        obj = null;
                    }
                    d5Var = (d5) obj;
                } else {
                    d5Var = null;
                }
            }
            this.f23154f = d5Var != null ? new g2.b(d5Var) : null;
        }
        return this.f23154f;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long G() {
        boolean booleanValue;
        Object e7;
        Integer num;
        j();
        f1 f1Var = (f1) this.f3328a;
        f0 r5 = f1Var.r();
        n0 n0Var = f1Var.f22745f;
        if (!H(r5.p())) {
            return 0L;
        }
        long j6 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : F() < ((Integer) x.f23205m0.a(null)).intValue() ? 16L : 0L;
        if (!I("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j6 |= 2;
        }
        if (j6 == 0) {
            if (this.f23155g == null) {
                g2.b E = E();
                booleanValue = false;
                if (E != null) {
                    try {
                        num = (Integer) E.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    booleanValue = true;
                                }
                            } catch (InterruptedException e9) {
                                e7 = e9;
                                f1.m(n0Var);
                                n0Var.f22906i.b(e7, "Measurement manager api exception");
                                this.f23155g = Boolean.FALSE;
                                f1.m(n0Var);
                                n0Var.f22910n.b(num, "Measurement manager api status result");
                                booleanValue = this.f23155g.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j6 == 0) {
                                }
                            } catch (CancellationException e10) {
                                e7 = e10;
                                f1.m(n0Var);
                                n0Var.f22906i.b(e7, "Measurement manager api exception");
                                this.f23155g = Boolean.FALSE;
                                f1.m(n0Var);
                                n0Var.f22910n.b(num, "Measurement manager api status result");
                                booleanValue = this.f23155g.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j6 == 0) {
                                }
                            } catch (ExecutionException e11) {
                                e7 = e11;
                                f1.m(n0Var);
                                n0Var.f22906i.b(e7, "Measurement manager api exception");
                                this.f23155g = Boolean.FALSE;
                                f1.m(n0Var);
                                n0Var.f22910n.b(num, "Measurement manager api status result");
                                booleanValue = this.f23155g.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j6 == 0) {
                                }
                            } catch (TimeoutException e12) {
                                e7 = e12;
                                f1.m(n0Var);
                                n0Var.f22906i.b(e7, "Measurement manager api exception");
                                this.f23155g = Boolean.FALSE;
                                f1.m(n0Var);
                                n0Var.f22910n.b(num, "Measurement manager api status result");
                                booleanValue = this.f23155g.booleanValue();
                                if (!booleanValue) {
                                }
                                if (j6 == 0) {
                                }
                            }
                        }
                        this.f23155g = Boolean.valueOf(booleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e13) {
                        e7 = e13;
                        num = null;
                    }
                    f1.m(n0Var);
                    n0Var.f22910n.b(num, "Measurement manager api status result");
                }
                if (!booleanValue) {
                    j6 = 64;
                }
            }
            booleanValue = this.f23155g.booleanValue();
            if (!booleanValue) {
            }
        }
        if (j6 == 0) {
            return 1L;
        }
        return j6;
    }

    public final boolean I(String str) {
        j();
        f1 f1Var = (f1) this.f3328a;
        if (s6.c.a(f1Var.f22740a).f22629a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        n0 n0Var = f1Var.f22745f;
        f1.m(n0Var);
        n0Var.f22909m.b(str, "Permission not granted");
        return false;
    }

    public final boolean L(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((f1) this.f3328a).f22743d.n("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle M(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object q = q(bundle.get(str), str);
                if (q == null) {
                    f1 f1Var = (f1) this.f3328a;
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22907k.b(f1Var.j.b(str), "Param value can't be null");
                } else {
                    y(bundle2, str, q);
                }
            }
        }
        return bundle2;
    }

    public final zzbg N(String str, Bundle bundle, String str2, long j6, boolean z5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (p0(str) != 0) {
            f1 f1Var = (f1) this.f3328a;
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(f1Var.j.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle r5 = r(str, bundle2, Collections.singletonList("_o"), true);
        if (z5) {
            r5 = M(r5);
        }
        g6.v.h(r5);
        return new zzbg(str, new zzbe(r5), str2, j6);
    }

    public final boolean O(Context context, String str) {
        Signature[] signatureArr;
        f1 f1Var = (f1) this.f3328a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b10 = s6.c.a(context).b(64, str);
            if (b10 == null || (signatureArr = b10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e7) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(e7, "Package name not found");
            return true;
        } catch (CertificateException e9) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.b(e9, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean Q(int i5) {
        Boolean bool = ((f1) this.f3328a).p().f23258e;
        if (R() < i5 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int R() {
        if (this.f23156h == null) {
            f1 f1Var = (f1) this.f3328a;
            c6.d dVar = c6.d.f3660b;
            Context context = f1Var.f22740a;
            dVar.getClass();
            AtomicBoolean atomicBoolean = c6.g.f3661a;
            int i5 = 0;
            try {
                i5 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                io.sentry.android.core.w0.m("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f23156h = Integer.valueOf(i5 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        }
        return this.f23156h.intValue();
    }

    public final void S(Bundle bundle, long j6) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22906i.b(Long.valueOf(j10), "Params already contained engagement");
        } else {
            j10 = 0;
        }
        bundle.putLong("_et", j6 + j10);
    }

    public final void T(String str, com.google.android.gms.internal.measurement.n0 n0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            n0Var.b(bundle);
        } catch (RemoteException e7) {
            n0 n0Var2 = ((f1) this.f3328a).f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.b(e7, "Error returning string value to wrapper");
        }
    }

    public final void U(com.google.android.gms.internal.measurement.n0 n0Var, long j6) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j6);
        try {
            n0Var.b(bundle);
        } catch (RemoteException e7) {
            n0 n0Var2 = ((f1) this.f3328a).f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.b(e7, "Error returning long value to wrapper");
        }
    }

    public final void V(com.google.android.gms.internal.measurement.n0 n0Var, int i5) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i5);
        try {
            n0Var.b(bundle);
        } catch (RemoteException e7) {
            n0 n0Var2 = ((f1) this.f3328a).f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.b(e7, "Error returning int value to wrapper");
        }
    }

    public final void W(com.google.android.gms.internal.measurement.n0 n0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            n0Var.b(bundle);
        } catch (RemoteException e7) {
            n0 n0Var2 = ((f1) this.f3328a).f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.b(e7, "Error returning byte array to wrapper");
        }
    }

    public final void X(com.google.android.gms.internal.measurement.n0 n0Var, boolean z5) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z5);
        try {
            n0Var.b(bundle);
        } catch (RemoteException e7) {
            n0 n0Var2 = ((f1) this.f3328a).f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.b(e7, "Error returning boolean value to wrapper");
        }
    }

    public final void Y(com.google.android.gms.internal.measurement.n0 n0Var, Bundle bundle) {
        try {
            n0Var.b(bundle);
        } catch (RemoteException e7) {
            n0 n0Var2 = ((f1) this.f3328a).f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.b(e7, "Error returning bundle value to wrapper");
        }
    }

    public final void Z(com.google.android.gms.internal.measurement.n0 n0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            n0Var.b(bundle);
        } catch (RemoteException e7) {
            n0 n0Var2 = ((f1) this.f3328a).f22745f;
            f1.m(n0Var2);
            n0Var2.f22906i.b(e7, "Error returning bundle list to wrapper");
        }
    }

    public final String d0() {
        byte[] bArr = new byte[16];
        i0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object f0(int i5, Object obj, boolean z5, boolean z7) {
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
            return o(obj.toString(), i5, z5);
        }
        if (!z7) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle M = M((Bundle) parcelable);
                if (!M.isEmpty()) {
                    arrayList.add(M);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int g0(String str) {
        f1 f1Var = (f1) this.f3328a;
        if ("_ldl".equals(str)) {
            f1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            f1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            f1Var.getClass();
            return 100;
        }
        f1Var.getClass();
        return 36;
    }

    public final long h0() {
        long andIncrement;
        long j6;
        AtomicLong atomicLong = this.f23152d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f23152d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((f1) this.f3328a).f22749k.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i5 = this.f23153e + 1;
            this.f23153e = i5;
            j6 = nextLong + i5;
        }
        return j6;
    }

    public final SecureRandom i0() {
        j();
        if (this.f23151c == null) {
            this.f23151c = new SecureRandom();
        }
        return this.f23151c;
    }

    @Override // s7.l1
    public final boolean k() {
        return true;
    }

    public final Bundle k0(Uri uri) {
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
                bundle.putString(AdRevenueConstants.SOURCE_KEY, str2);
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
                bundle.putString(EventsTable.contentColumn, queryParameter3);
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
        } catch (UnsupportedOperationException e7) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22906i.b(e7, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final boolean l0(String str, String str2) {
        f1 f1Var = (f1) this.f3328a;
        if (str2 == null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22905h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22905h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            n0 n0Var3 = f1Var.f22745f;
            f1.m(n0Var3);
            n0Var3.f22905h.c(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                n0 n0Var4 = f1Var.f22745f;
                f1.m(n0Var4);
                n0Var4.f22905h.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean m0(String str, String str2) {
        f1 f1Var = (f1) this.f3328a;
        if (str2 == null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22905h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22905h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                n0 n0Var3 = f1Var.f22745f;
                f1.m(n0Var3);
                n0Var3.f22905h.c(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                n0 n0Var4 = f1Var.f22745f;
                f1.m(n0Var4);
                n0Var4.f22905h.c(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean n(String str) {
        f1 f1Var = (f1) this.f3328a;
        if (TextUtils.isEmpty(str)) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22905h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        g6.v.h(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        n0 n0Var2 = f1Var.f22745f;
        f1.m(n0Var2);
        n0Var2.f22905h.b(n0.r(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean n0(String str, String[] strArr, String[] strArr2, String str2) {
        f1 f1Var = (f1) this.f3328a;
        if (str2 == null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22905h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i5 = 0; i5 < 3; i5++) {
            if (str2.startsWith(f23150i[i5])) {
                n0 n0Var2 = f1Var.f22745f;
                f1.m(n0Var2);
                n0Var2.f22905h.c(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !K(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && K(str2, strArr2)) {
            return true;
        }
        n0 n0Var3 = f1Var.f22745f;
        f1.m(n0Var3);
        n0Var3.f22905h.c(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean o0(int i5, String str, String str2) {
        f1 f1Var = (f1) this.f3328a;
        if (str2 == null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22905h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i5) {
            return true;
        }
        n0 n0Var2 = f1Var.f22745f;
        f1.m(n0Var2);
        n0Var2.f22905h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i5), str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p(String str, String str2, Object obj, Bundle bundle, List list, boolean z5, boolean z7) {
        int i5;
        int i10;
        int size;
        f1 f1Var = (f1) this.f3328a;
        j();
        int i11 = 0;
        if (t0(obj)) {
            if (!z7) {
                return 21;
            }
            if (!K(str2, r1.f22981g)) {
                return 20;
            }
            y2 p10 = f1Var.p();
            p10.j();
            p10.k();
            if (p10.q()) {
                v3 v3Var = ((f1) p10.f3328a).f22748i;
                f1.k(v3Var);
                if (v3Var.R() < 200900) {
                    return 25;
                }
            }
            boolean z10 = obj instanceof Parcelable[];
            if (z10) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                n0 n0Var = f1Var.f22745f;
                f1.m(n0Var);
                n0Var.f22907k.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i5 = 17;
                if (z10) {
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
                i10 = 500;
                if (!J(str) || J(str2)) {
                    f1Var.f22743d.getClass();
                    i10 = Math.max(500, 256);
                } else {
                    f1Var.f22743d.getClass();
                }
                if (!u0("param", str2, i10, obj)) {
                    if (!z7) {
                        return 4;
                    }
                    if (obj instanceof Bundle) {
                        v0(str, str2, (Bundle) obj, list, z5);
                        return i5;
                    }
                    if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                        int length = parcelableArr2.length;
                        while (i11 < length) {
                            Parcelable parcelable = parcelableArr2[i11];
                            if (!(parcelable instanceof Bundle)) {
                                n0 n0Var2 = f1Var.f22745f;
                                f1.m(n0Var2);
                                n0Var2.f22907k.c(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            v0(str, str2, (Bundle) parcelable, list, z5);
                            i11++;
                        }
                    } else {
                        if (!(obj instanceof ArrayList)) {
                            return 4;
                        }
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size2 = arrayList2.size();
                        while (i11 < size2) {
                            Object obj2 = arrayList2.get(i11);
                            if (!(obj2 instanceof Bundle)) {
                                n0 n0Var3 = f1Var.f22745f;
                                f1.m(n0Var3);
                                n0Var3.f22907k.c(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                                return 4;
                            }
                            v0(str, str2, (Bundle) obj2, list, z5);
                            i11++;
                        }
                    }
                }
                return i5;
            }
        }
        i5 = 0;
        i10 = 500;
        if (J(str)) {
        }
        f1Var.f22743d.getClass();
        i10 = Math.max(500, 256);
        if (!u0("param", str2, i10, obj)) {
        }
        return i5;
    }

    public final int p0(String str) {
        if (!m0("event", str)) {
            return 2;
        }
        if (!n0("event", r1.f22975a, r1.f22976b, str)) {
            return 13;
        }
        ((f1) this.f3328a).getClass();
        return !o0(40, "event", str) ? 2 : 0;
    }

    public final Object q(Object obj, String str) {
        f1 f1Var = (f1) this.f3328a;
        int i5 = 500;
        if ("_ev".equals(str)) {
            f1Var.f22743d.getClass();
            return f0(Math.max(500, 256), obj, true, true);
        }
        if (J(str)) {
            f1Var.f22743d.getClass();
            i5 = Math.max(500, 256);
        } else {
            f1Var.f22743d.getClass();
        }
        return f0(i5, obj, false, true);
    }

    public final int q0(String str) {
        if (!m0("user property", str)) {
            return 6;
        }
        if (!n0("user property", r1.f22983i, null, str)) {
            return 15;
        }
        ((f1) this.f3328a).getClass();
        return !o0(24, "user property", str) ? 6 : 0;
    }

    public final Bundle r(String str, Bundle bundle, List list, boolean z5) {
        int r02;
        String str2;
        List list2 = list;
        boolean K = K(str, r1.f22978d);
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        f1 f1Var = (f1) this.f3328a;
        e eVar = f1Var.f22743d;
        i0 i0Var = f1Var.j;
        v3 v3Var = ((f1) eVar.f3328a).f22748i;
        f1.k(v3Var);
        int i5 = v3Var.Q(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z7 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                r02 = !z5 ? r0(str4) : 0;
                if (r02 == 0) {
                    r02 = s0(str4);
                }
            } else {
                r02 = 0;
            }
            if (r02 != 0) {
                v(bundle2, r02, str4, r02 == 3 ? str4 : str3);
                bundle2.remove(str4);
            } else {
                int p10 = p(str, str4, bundle.get(str4), bundle2, list2, z5, K);
                if (p10 == 17) {
                    v(bundle2, 17, str4, Boolean.FALSE);
                } else if (p10 != 0 && !"_ev".equals(str4)) {
                    v(bundle2, p10, p10 == 21 ? str : str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (j0(str4)) {
                    i10++;
                    if (i10 > i5) {
                        if (f1Var.f22743d.t(str3, x.f23188f1) && z7) {
                            str2 = str3;
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i5);
                            sb2.append(" params");
                            String sb3 = sb2.toString();
                            n0 n0Var = f1Var.f22745f;
                            f1.m(n0Var);
                            str2 = str3;
                            n0Var.f22905h.c(i0Var.a(str), i0Var.e(bundle), sb3);
                        }
                        e0(5, bundle2);
                        bundle2.remove(str4);
                        z7 = true;
                        list2 = list;
                        str3 = str2;
                    } else {
                        list2 = list;
                    }
                }
            }
            str2 = str3;
            list2 = list;
            str3 = str2;
        }
        return bundle2;
    }

    public final int r0(String str) {
        if (!l0("event param", str)) {
            return 3;
        }
        if (!n0("event param", null, null, str)) {
            return 14;
        }
        ((f1) this.f3328a).getClass();
        return !o0(40, "event param", str) ? 3 : 0;
    }

    public final void s(o0 o0Var, int i5) {
        Bundle bundle = (Bundle) o0Var.f22924e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z5 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (j0(str) && (i10 = i10 + 1) > i5) {
                f1 f1Var = (f1) this.f3328a;
                e eVar = f1Var.f22743d;
                i0 i0Var = f1Var.j;
                if (!eVar.t(null, x.f23188f1) || !z5) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i5);
                    sb2.append(" params");
                    String sb3 = sb2.toString();
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22905h.c(i0Var.a((String) o0Var.f22922c), i0Var.e(bundle), sb3);
                    e0(5, bundle);
                }
                bundle.remove(str);
                z5 = true;
            }
        }
    }

    public final int s0(String str) {
        if (!m0("event param", str)) {
            return 3;
        }
        if (!n0("event param", null, null, str)) {
            return 14;
        }
        ((f1) this.f3328a).getClass();
        return !o0(40, "event param", str) ? 3 : 0;
    }

    public final void t(Parcelable[] parcelableArr, int i5) {
        g6.v.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            boolean z5 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (j0(str) && !K(str, r1.f22982h) && (i10 = i10 + 1) > i5) {
                    f1 f1Var = (f1) this.f3328a;
                    e eVar = f1Var.f22743d;
                    i0 i0Var = f1Var.j;
                    if (!eVar.t(null, x.f23188f1) || !z5) {
                        n0 n0Var = f1Var.f22745f;
                        f1.m(n0Var);
                        l0 l0Var = n0Var.f22905h;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i5);
                        sb2.append(" item-scoped custom parameters");
                        l0Var.c(i0Var.b(str), i0Var.e(bundle), sb2.toString());
                    }
                    e0(28, bundle);
                    bundle.remove(str);
                    z5 = true;
                }
            }
        }
    }

    public final void u(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                v3 v3Var = ((f1) this.f3328a).f22748i;
                f1.k(v3Var);
                v3Var.y(bundle, str, bundle2.get(str));
            }
        }
    }

    public final boolean u0(String str, String str2, int i5, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String obj2 = obj.toString();
        if (obj2.codePointCount(0, obj2.length()) > i5) {
            n0 n0Var = ((f1) this.f3328a).f22745f;
            f1.m(n0Var);
            n0Var.f22907k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
            return false;
        }
        return true;
    }

    public final void v(Bundle bundle, int i5, String str, Object obj) {
        if (e0(i5, bundle)) {
            ((f1) this.f3328a).getClass();
            bundle.putString("_ev", o(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void v0(String str, String str2, Bundle bundle, List list, boolean z5) {
        int r02;
        String str3;
        int p10;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        f1 f1Var = (f1) this.f3328a;
        e eVar = f1Var.f22743d;
        n0 n0Var = f1Var.f22745f;
        i0 i0Var = f1Var.j;
        v3 v3Var = ((f1) eVar.f3328a).f22748i;
        f1.k(v3Var);
        int i5 = true != v3Var.Q(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z7 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                r02 = !z5 ? r0(str4) : 0;
                if (r02 == 0) {
                    r02 = s0(str4);
                }
            } else {
                r02 = 0;
            }
            if (r02 != 0) {
                v(bundle, r02, str4, r02 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (t0(bundle.get(str4))) {
                    f1.m(n0Var);
                    n0Var.f22907k.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    p10 = 22;
                    str3 = null;
                } else {
                    str3 = null;
                    p10 = p(str, str4, bundle.get(str4), bundle, list2, z5, false);
                }
                if (p10 != 0 && !"_ev".equals(str4)) {
                    v(bundle, p10, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (j0(str4) && !K(str4, r1.f22982h)) {
                    int i11 = i10 + 1;
                    if (!Q(231100000)) {
                        f1.m(n0Var);
                        n0Var.f22905h.c(i0Var.a(str), i0Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        e0(23, bundle);
                        bundle.remove(str4);
                    } else if (i11 > i5) {
                        if (!f1Var.f22743d.t(str3, x.f23188f1) || !z7) {
                            f1.m(n0Var);
                            l0 l0Var = n0Var.f22905h;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i5);
                            sb2.append(" item-scoped custom params");
                            l0Var.c(i0Var.a(str), i0Var.e(bundle), sb2.toString());
                        }
                        e0(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        i10 = i11;
                        z7 = true;
                    }
                    list2 = list;
                    i10 = i11;
                }
            }
            list2 = list;
        }
    }

    public final int w(Object obj, String str) {
        return "_ldl".equals(str) ? u0("user property referrer", str, g0(str), obj) : u0("user property", str, g0(str), obj) ? 0 : 7;
    }

    public final Object x(Object obj, String str) {
        return "_ldl".equals(str) ? f0(g0(str), obj, true, false) : f0(g0(str), obj, false, false);
    }

    public final void y(Bundle bundle, String str, Object obj) {
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
            f1 f1Var = (f1) this.f3328a;
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22907k.c(f1Var.j.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }
}
