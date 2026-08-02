package defpackage;

import android.app.ActivityManager;
import android.os.Parcel;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.pal.zzach;
import com.google.android.gms.internal.play_billing.zzfx;
import com.google.android.gms.internal.wearable.zzcn;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class x5n {
    public static int A(int i, int i2, int i3, int i4) {
        return zzcn.r(i) + i2 + i3 + i4;
    }

    public static int B(int i, int i2, int i3) {
        return zzcn.r(i) + i2 + i3;
    }

    public static int C(int i, int i2, int i3) {
        return zzfx.c(i) + i2 + i3;
    }

    public static /* synthetic */ int a(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        a70.j("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static /* bridge */ /* synthetic */ int b(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        a70.j("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static int c(int i, int i2, int i3) {
        return zzada.b(i) + i2 + i3;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return zzach.a(i) + i2 + i3 + i4;
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static int f(int i, long j) {
        return String.valueOf(j).length() + i;
    }

    public static ActivityManager.RunningAppProcessInfo g() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public static BillingResult h(int i, String str) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        newBuilder.setDebugMessage(str);
        return newBuilder.build();
    }

    public static IObjectWrapper i(Parcel parcel) {
        IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
        parcel.recycle();
        return S1;
    }

    public static IObjectWrapper j(Parcel parcel, Parcel parcel2) {
        IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
        zzbew.f(parcel2);
        return S1;
    }

    public static zzaef k(zzaef zzaefVar) {
        int size = zzaefVar.size();
        return zzaefVar.f(size + size);
    }

    public static String l(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String m(long j, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String n(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }

    public static void o(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        zzeh.c(sb.toString());
    }

    public static void p(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        zzeh.c(sb.toString());
    }

    public static void q(String str, zzeae zzeaeVar) {
        zzeaeVar.c(zzt.zzk().a(), str);
    }

    public static void r(String str, String str2) {
        zzeh.c(str2.concat(String.valueOf(str)));
    }

    public static boolean s(JSONObject jSONObject, String str, Boolean bool) {
        return bool.equals(Boolean.valueOf(jSONObject.optBoolean(str)));
    }

    public static int t(int i, int i2, int i3) {
        return zzach.a(i) + i2 + i3;
    }

    public static int u(int i, int i2, int i3, int i4) {
        return r8n.r(i) + i2 + i3 + i4;
    }

    public static int v(int i, int i2, int i3) {
        return (zzach.f(i) * i2) + i3;
    }

    public static int w(int i, int i2, int i3, int i4) {
        return zzada.b(i) + i2 + i3 + i4;
    }

    public static int x(int i, int i2, int i3) {
        return r8n.r(i) + i2 + i3;
    }

    public static int y(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) + i4;
    }

    public static int z(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }
}
