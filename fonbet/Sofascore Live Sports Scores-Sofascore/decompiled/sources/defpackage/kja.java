package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kja {
    public static final kja g = new kja(0, 0, 0, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final eib f;

    public kja(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : Boolean.FALSE, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3, null, null);
    }

    public static kja a() {
        kja kjaVar = g;
        return new kja(kjaVar.a, kjaVar.b, kjaVar.c, 7, null, null);
    }

    public final kja b(kja kjaVar) {
        if (kjaVar == null || kjaVar.d() || kjaVar.equals(this)) {
            return this;
        }
        if (d()) {
            return kjaVar;
        }
        int i = this.a;
        jja jjaVar = new jja(i);
        if (i == -1) {
            jjaVar = null;
        }
        int i2 = jjaVar != null ? jjaVar.a : kjaVar.a;
        Boolean bool = this.b;
        if (bool == null) {
            bool = kjaVar.b;
        }
        Boolean bool2 = bool;
        int i3 = this.c;
        lja ljaVar = new lja(i3);
        if (i3 == 0) {
            ljaVar = null;
        }
        int i4 = ljaVar != null ? ljaVar.a : kjaVar.c;
        int i5 = this.d;
        lu9 lu9Var = i5 != -1 ? new lu9(i5) : null;
        int i6 = lu9Var != null ? lu9Var.a : kjaVar.d;
        Boolean bool3 = this.e;
        if (bool3 == null) {
            bool3 = kjaVar.e;
        }
        Boolean bool4 = bool3;
        eib eibVar = this.f;
        if (eibVar == null) {
            eibVar = kjaVar.f;
        }
        return new kja(i2, bool2, i4, i6, bool4, eibVar);
    }

    public final int c() {
        int i = this.d;
        lu9 lu9Var = new lu9(i);
        if (i == -1) {
            lu9Var = null;
        }
        if (lu9Var != null) {
            return lu9Var.a;
        }
        return 1;
    }

    public final boolean d() {
        return this.a == -1 && this.b == null && this.c == 0 && this.d == -1 && this.e == null && this.f == null;
    }

    public final qu9 e(boolean z) {
        int i = this.a;
        jja jjaVar = new jja(i);
        if (i == -1) {
            jjaVar = null;
        }
        int i2 = jjaVar != null ? jjaVar.a : 0;
        Boolean bool = this.b;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        lja ljaVar = i3 != 0 ? new lja(i3) : null;
        int i4 = ljaVar != null ? ljaVar.a : 1;
        int c = c();
        eib eibVar = this.f;
        if (eibVar == null) {
            eibVar = eib.c;
        }
        return new qu9(z, i2, booleanValue, i4, c, eibVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kja)) {
            return false;
        }
        kja kjaVar = (kja) obj;
        return this.a == kjaVar.a && Intrinsics.c(this.b, kjaVar.b) && this.c == kjaVar.c && this.d == kjaVar.d && Intrinsics.c(this.e, kjaVar.e) && Intrinsics.c(this.f, kjaVar.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int a = wv8.a(this.d, wv8.a(this.c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.e;
        int hashCode2 = (a + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        eib eibVar = this.f;
        return hashCode2 + (eibVar != null ? eibVar.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) jja.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) lja.a(this.c)) + ", imeAction=" + ((Object) lu9.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.e + ", hintLocales=" + this.f + ')';
    }

    public kja(int i, Boolean bool, int i2, int i3, Boolean bool2, eib eibVar) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
        this.e = bool2;
        this.f = eibVar;
    }
}
