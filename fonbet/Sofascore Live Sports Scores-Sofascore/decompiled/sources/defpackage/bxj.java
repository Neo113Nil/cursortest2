package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bxj {
    public final zm6 a;
    public final alh b;
    public final in2 c;
    public final krg d;
    public final boolean e;
    public final Map f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bxj(zm6 zm6Var, alh alhVar, in2 in2Var, krg krgVar, LinkedHashMap linkedHashMap, int i) {
        this(zm6Var, alhVar, in2Var, krgVar, r0, r7);
        zm6Var = (i & 1) != 0 ? null : zm6Var;
        alhVar = (i & 2) != 0 ? null : alhVar;
        in2Var = (i & 4) != 0 ? null : in2Var;
        krgVar = (i & 8) != 0 ? null : krgVar;
        boolean z = (i & 32) == 0;
        Map map = linkedHashMap;
        if ((i & 64) != 0) {
            Map map2 = lm5.a;
            map2.getClass();
            map = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxj)) {
            return false;
        }
        bxj bxjVar = (bxj) obj;
        return Intrinsics.c(this.a, bxjVar.a) && Intrinsics.c(this.b, bxjVar.b) && Intrinsics.c(this.c, bxjVar.c) && Intrinsics.c(this.d, bxjVar.d) && this.e == bxjVar.e && Intrinsics.c(this.f, bxjVar.f);
    }

    public final int hashCode() {
        zm6 zm6Var = this.a;
        int hashCode = (zm6Var == null ? 0 : zm6Var.hashCode()) * 31;
        alh alhVar = this.b;
        int hashCode2 = (hashCode + (alhVar == null ? 0 : alhVar.hashCode())) * 31;
        in2 in2Var = this.c;
        int hashCode3 = (hashCode2 + (in2Var == null ? 0 : in2Var.hashCode())) * 31;
        krg krgVar = this.d;
        return this.f.hashCode() + dmi.e((hashCode3 + (krgVar != null ? krgVar.hashCode() : 0)) * 961, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionData(fade=");
        sb.append(this.a);
        sb.append(", slide=");
        sb.append(this.b);
        sb.append(", changeSize=");
        sb.append(this.c);
        sb.append(", scale=");
        sb.append(this.d);
        sb.append(", veil=null, hold=");
        sb.append(this.e);
        sb.append(", effectsMap=");
        return dmi.s(sb, this.f, ')');
    }

    public bxj(zm6 zm6Var, alh alhVar, in2 in2Var, krg krgVar, boolean z, Map map) {
        this.a = zm6Var;
        this.b = alhVar;
        this.c = in2Var;
        this.d = krgVar;
        this.e = z;
        this.f = map;
    }
}
