package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gv0 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;

    public gv0(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.a = i;
        if (str == null) {
            yhk.s("Null model");
            throw null;
        }
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i3;
        if (str2 == null) {
            yhk.s("Null manufacturer");
            throw null;
        }
        if (str3 != null) {
            return;
        }
        yhk.s("Null modelClass");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gv0)) {
            return false;
        }
        gv0 gv0Var = (gv0) obj;
        if (this.a != gv0Var.a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.b != gv0Var.b || this.c != gv0Var.c || this.d != gv0Var.d || this.e != gv0Var.e || this.f != gv0Var.f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.b) * 1000003;
        long j = this.c;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        return ((((this.f ^ ((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003)) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(Build.MODEL);
        sb.append(", availableProcessors=");
        sb.append(this.b);
        sb.append(", totalRam=");
        sb.append(this.c);
        sb.append(", diskSpace=");
        sb.append(this.d);
        sb.append(", isEmulator=");
        sb.append(this.e);
        sb.append(", state=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", modelClass=");
        return mz1.o(sb, Build.PRODUCT, "}");
    }
}
