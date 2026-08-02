package defpackage;

import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class px {
    public final String a;
    public final String b;
    public final String c;
    public final y7f d;
    public final ArrayList e;

    public px(String str, String str2, String str3, y7f y7fVar, ArrayList arrayList) {
        w1l.y(str, str2, str3, Build.MANUFACTURER);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = y7fVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px)) {
            return false;
        }
        px pxVar = (px) obj;
        if (!Intrinsics.c(this.a, pxVar.a) || !Intrinsics.c(this.b, pxVar.b) || !Intrinsics.c(this.c, pxVar.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return Intrinsics.c(str, str) && this.d.equals(pxVar.d) && this.e.equals(pxVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + dmi.c(dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
