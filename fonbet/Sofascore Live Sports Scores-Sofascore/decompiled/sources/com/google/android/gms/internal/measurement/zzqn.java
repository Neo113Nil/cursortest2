package com.google.android.gms.internal.measurement;

import defpackage.fn0;
import defpackage.hv9;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqn {
    public final boolean a;
    public final List b;
    public final zzacr c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final zznf k;

    public zzqn(boolean z, hv9 hv9Var, zzacr zzacrVar, String str, String str2, hv9 hv9Var2, hv9 hv9Var3, boolean z2, boolean z3, boolean z4, zznf zznfVar) {
        hv9Var.getClass();
        zzacrVar.getClass();
        str.getClass();
        str2.getClass();
        hv9Var2.getClass();
        hv9Var3.getClass();
        zznfVar.getClass();
        this.a = z;
        this.b = hv9Var;
        this.c = zzacrVar;
        this.d = str;
        this.e = str2;
        this.f = hv9Var2;
        this.g = hv9Var3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = zznfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqn)) {
            return false;
        }
        zzqn zzqnVar = (zzqn) obj;
        return this.a == zzqnVar.a && Intrinsics.c(this.b, zzqnVar.b) && Intrinsics.c(this.c, zzqnVar.c) && Intrinsics.c(this.d, zzqnVar.d) && Intrinsics.c(this.e, zzqnVar.e) && Intrinsics.c(this.f, zzqnVar.f) && Intrinsics.c(this.g, zzqnVar.g) && this.h == zzqnVar.h && this.i == zzqnVar.i && this.j == zzqnVar.j && Intrinsics.c(this.k, zzqnVar.k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z = this.a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        zzacr zzacrVar = this.c;
        int length3 = String.valueOf(zzacrVar).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        zznf zznfVar = this.k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(zznfVar).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(zzacrVar);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        fn0.y(", allowEmptySnapshotToken=", ", enableCommitV2Api=", sb, z3, z4);
        sb.append(", clientFlags=");
        sb.append(zznfVar);
        sb.append(")");
        return sb.toString();
    }
}
