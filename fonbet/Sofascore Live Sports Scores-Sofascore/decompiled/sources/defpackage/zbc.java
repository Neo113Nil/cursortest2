package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zbc {
    public final int a;
    public final gv9 b;
    public final gv9 c;
    public final gec d;
    public final Boolean e;
    public final boolean f;

    public zbc(int i, gv9 gv9Var, gv9 gv9Var2, gec gecVar, Boolean bool, boolean z) {
        gv9Var.getClass();
        gv9Var2.getClass();
        gecVar.getClass();
        this.a = i;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = gecVar;
        this.e = bool;
        this.f = z;
    }

    public static zbc a(zbc zbcVar, int i, gv9 gv9Var, gv9 gv9Var2, gec gecVar, Boolean bool, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = zbcVar.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            gv9Var = zbcVar.b;
        }
        gv9 gv9Var3 = gv9Var;
        if ((i2 & 4) != 0) {
            gv9Var2 = zbcVar.c;
        }
        gv9 gv9Var4 = gv9Var2;
        if ((i2 & 8) != 0) {
            gecVar = zbcVar.d;
        }
        gec gecVar2 = gecVar;
        if ((i2 & 16) != 0) {
            bool = zbcVar.e;
        }
        Boolean bool2 = bool;
        if ((i2 & 32) != 0) {
            z = zbcVar.f;
        }
        zbcVar.getClass();
        gv9Var3.getClass();
        gv9Var4.getClass();
        gecVar2.getClass();
        return new zbc(i3, gv9Var3, gv9Var4, gecVar2, bool2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbc)) {
            return false;
        }
        zbc zbcVar = (zbc) obj;
        return this.a == zbcVar.a && Intrinsics.c(this.b, zbcVar.b) && Intrinsics.c(this.c, zbcVar.c) && this.d == zbcVar.d && Intrinsics.c(this.e, zbcVar.e) && this.f == zbcVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ljg.d(ljg.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31;
        Boolean bool = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        return "MediaScreenState(entityId=" + this.a + ", chips=" + this.b + ", mediaItems=" + this.c + ", selectedChip=" + this.d + ", isManualRefreshing=" + this.e + ", hasBrandingBackground=" + this.f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zbc() {
        this(0, r2, r2, gec.c, null, false);
        rlh rlhVar = rlh.b;
    }
}
