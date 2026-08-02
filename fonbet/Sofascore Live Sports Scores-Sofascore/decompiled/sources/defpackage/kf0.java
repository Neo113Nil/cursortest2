package defpackage;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kf0 {
    public final String a;
    public final px b;

    public kf0(String str, px pxVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        oib oibVar = oib.LOG_ENVIRONMENT_PROD;
        me4.p(str, str2, str3);
        this.a = str;
        this.b = pxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf0)) {
            return false;
        }
        kf0 kf0Var = (kf0) obj;
        if (!Intrinsics.c(this.a, kf0Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.c(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        if (!Intrinsics.c(str2, str2)) {
            return false;
        }
        oib oibVar = oib.LOG_ENVIRONMENT_PROD;
        return this.b.equals(kf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((oib.LOG_ENVIRONMENT_PROD.hashCode() + dmi.c((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517566) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.7, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + oib.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
