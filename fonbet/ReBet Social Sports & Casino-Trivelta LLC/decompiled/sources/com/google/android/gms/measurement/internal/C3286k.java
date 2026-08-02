package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3286k extends O3 {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f34074b;

    /* renamed from: c, reason: collision with root package name */
    public String f34075c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3278j f34076d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f34077e;

    public C3286k(C3298l3 c3298l3) {
        super(c3298l3);
        this.f34076d = new InterfaceC3278j() { // from class: com.google.android.gms.measurement.internal.i
            @Override // com.google.android.gms.measurement.internal.InterfaceC3278j
            public final /* synthetic */ String f(String str, String str2) {
                return null;
            }
        };
    }

    public static final long n() {
        return ((Long) AbstractC3209a2.f33864e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) AbstractC3209a2.f33879j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) AbstractC3209a2.f33885l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) AbstractC3209a2.f33836S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) AbstractC3209a2.f33826N.b(null)).longValue();
    }

    public final long A() {
        this.f33578a.c();
        return 133005L;
    }

    public final boolean B() {
        if (this.f34077e == null) {
            synchronized (this) {
                try {
                    if (this.f34077e == null) {
                        C3298l3 c3298l3 = this.f33578a;
                        ApplicationInfo applicationInfo = c3298l3.d().getApplicationInfo();
                        String a10 = K9.q.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(a10)) {
                                z10 = true;
                            }
                            this.f34077e = Boolean.valueOf(z10);
                        }
                        if (this.f34077e == null) {
                            this.f34077e = Boolean.TRUE;
                            c3298l3.a().o().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f34077e.booleanValue();
    }

    public final String C(String str, Z1 z12) {
        return TextUtils.isEmpty(str) ? (String) z12.b(null) : (String) z12.b(this.f34076d.f(str, z12.a()));
    }

    public final long D(String str, Z1 z12) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) z12.b(null)).longValue();
        }
        String f10 = this.f34076d.f(str, z12.a());
        if (TextUtils.isEmpty(f10)) {
            return ((Long) z12.b(null)).longValue();
        }
        try {
            return ((Long) z12.b(Long.valueOf(Long.parseLong(f10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) z12.b(null)).longValue();
        }
    }

    public final int E(String str, Z1 z12) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) z12.b(null)).intValue();
        }
        String f10 = this.f34076d.f(str, z12.a());
        if (TextUtils.isEmpty(f10)) {
            return ((Integer) z12.b(null)).intValue();
        }
        try {
            return ((Integer) z12.b(Integer.valueOf(Integer.parseInt(f10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) z12.b(null)).intValue();
        }
    }

    public final int F(String str, Z1 z12, int i10, int i11) {
        return Math.max(Math.min(E(str, z12), i11), i10);
    }

    public final double G(String str, Z1 z12) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) z12.b(null)).doubleValue();
        }
        String f10 = this.f34076d.f(str, z12.a());
        if (TextUtils.isEmpty(f10)) {
            return ((Double) z12.b(null)).doubleValue();
        }
        try {
            return ((Double) z12.b(Double.valueOf(Double.parseDouble(f10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) z12.b(null)).doubleValue();
        }
    }

    public final boolean H(String str, Z1 z12) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) z12.b(null)).booleanValue();
        }
        String f10 = this.f34076d.f(str, z12.a());
        return TextUtils.isEmpty(f10) ? ((Boolean) z12.b(null)).booleanValue() : ((Boolean) z12.b(Boolean.valueOf("1".equals(f10)))).booleanValue();
    }

    public final Bundle I() {
        try {
            C3298l3 c3298l3 = this.f33578a;
            if (c3298l3.d().getPackageManager() == null) {
                c3298l3.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = M9.e.a(c3298l3.d()).c(c3298l3.d().getPackageName(), 128);
            if (c10 != null) {
                return c10.metaData;
            }
            c3298l3.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f33578a.a().o().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean J(String str) {
        AbstractC3191o.g(str);
        Bundle I10 = I();
        if (I10 == null) {
            this.f33578a.a().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (I10.containsKey(str)) {
            return Boolean.valueOf(I10.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List K(String str) {
        Integer valueOf;
        AbstractC3191o.g("analytics.safelisted_events");
        Bundle I10 = I();
        if (I10 == null) {
            this.f33578a.a().o().a("Failed to load metadata: Metadata bundle is null");
        } else if (I10.containsKey("analytics.safelisted_events")) {
            valueOf = Integer.valueOf(I10.getInt("analytics.safelisted_events"));
            if (valueOf != null) {
                try {
                    String[] stringArray = this.f33578a.d().getResources().getStringArray(valueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e10) {
                    this.f33578a.a().o().b("Failed to load string array from metadata: resource not found", e10);
                }
            }
            return null;
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return null;
    }

    public final boolean L() {
        this.f33578a.c();
        Boolean J10 = J("firebase_analytics_collection_deactivated");
        return J10 != null && J10.booleanValue();
    }

    public final boolean M() {
        Boolean J10 = J("google_analytics_adid_collection_enabled");
        return J10 == null || J10.booleanValue();
    }

    public final boolean N() {
        Boolean J10 = J("google_analytics_automatic_screen_reporting_enabled");
        return J10 == null || J10.booleanValue();
    }

    public final S3 O(String str, boolean z10) {
        Object obj;
        AbstractC3191o.g(str);
        C3298l3 c3298l3 = this.f33578a;
        Bundle I10 = I();
        if (I10 == null) {
            c3298l3.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = I10.get(str);
        }
        if (obj == null) {
            return S3.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return S3.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return S3.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return S3.POLICY;
        }
        c3298l3.a().r().b("Invalid manifest metadata for", str);
        return S3.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean J10 = J("google_analytics_sgtm_upload_enabled");
        if (J10 == null) {
            return false;
        }
        return J10.booleanValue();
    }

    public final void Q(String str) {
        this.f34075c = str;
    }

    public final String R() {
        return this.f34075c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", "");
    }

    public final String j() {
        return s("debug.deferred.deeplink", "");
    }

    public final boolean k(String str) {
        return "1".equals(this.f34076d.f(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f34076d.f(str, "measurement.event_sampling_enabled"));
    }

    public final boolean m() {
        if (this.f34074b == null) {
            Boolean J10 = J("app_measurement_lite");
            this.f34074b = J10;
            if (J10 == null) {
                this.f34074b = Boolean.FALSE;
            }
        }
        return this.f34074b.booleanValue() || !this.f33578a.G();
    }

    public final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC3191o.m(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f33578a.a().o().b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f33578a.a().o().b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f33578a.a().o().b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f33578a.a().o().b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    public final void t(InterfaceC3278j interfaceC3278j) {
        this.f34076d = interfaceC3278j;
    }

    public final String u() {
        this.f33578a.c();
        return "FA";
    }

    public final int v() {
        return this.f33578a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(String str) {
        return F(str, AbstractC3209a2.f33848Y, 25, 100);
    }

    public final int x(String str, boolean z10) {
        return z10 ? F(str, AbstractC3209a2.f33877i0, 100, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION) : FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION;
    }

    public final int y(String str, boolean z10) {
        return Math.max(x(str, z10), 256);
    }

    public final int z(String str) {
        return F(str, AbstractC3209a2.f33846X, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, 2000);
    }
}
