package defpackage;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzier;
import com.google.android.gms.internal.cast.zzxp;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.play_billing.zzfx;
import com.google.android.gms.internal.wearable.zzc;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0424;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class ceo {
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

    public static int b(int i, int i2, int i3) {
        return zzier.b(i) + i2 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return zzfx.c(i) + i2 + i3 + i4;
    }

    public static long d(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static String e(String str, String str2, String str3) {
        return AbstractC0424.m255(str, str2, new StringBuilder(), str3);
    }

    public static UnsupportedOperationException f(Parcel parcel) {
        zzc.c(parcel);
        return new UnsupportedOperationException();
    }

    public static void g(String str, String str2, StringBuilder sb, String str3) {
        sb.append(str);
        sb.append(StringFog.decrypt(str2, str3));
    }

    public static int h(int i, int i2, int i3) {
        return zzpv.c(i) + i2 + i3;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return zzier.b(i) + i2 + i3 + i4;
    }

    public static int j(int i, int i2, int i3) {
        return zzxp.s(i) + i2 + i3;
    }
}
