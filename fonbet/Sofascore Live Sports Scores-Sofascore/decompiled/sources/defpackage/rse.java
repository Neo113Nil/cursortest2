package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rse {
    public final s67 a;
    public final s67 b;
    public final s67 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;

    public rse(s67 s67Var, s67 s67Var2, s67 s67Var3, Function0 function0, Function0 function02, Function0 function03) {
        this.a = s67Var;
        this.b = s67Var2;
        this.c = s67Var3;
        this.d = function0;
        this.e = function02;
        this.f = function03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rse)) {
            return false;
        }
        rse rseVar = (rse) obj;
        return this.a == rseVar.a && this.b == rseVar.b && this.c == rseVar.c && Intrinsics.c(this.d, rseVar.d) && Intrinsics.c(this.e, rseVar.e) && Intrinsics.c(this.f, rseVar.f);
    }

    public final int hashCode() {
        s67 s67Var = this.a;
        int hashCode = (s67Var == null ? 0 : s67Var.hashCode()) * 31;
        s67 s67Var2 = this.b;
        int hashCode2 = (hashCode + (s67Var2 == null ? 0 : s67Var2.hashCode())) * 31;
        s67 s67Var3 = this.c;
        int hashCode3 = (hashCode2 + (s67Var3 == null ? 0 : s67Var3.hashCode())) * 31;
        Function0 function0 = this.d;
        int hashCode4 = (hashCode3 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function02 = this.e;
        int hashCode5 = (hashCode4 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function0 function03 = this.f;
        return hashCode5 + (function03 != null ? function03.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerManagementControls(button1=" + this.a + ", button2=" + this.b + ", button3=" + this.c + ", buttonAction1=" + this.d + ", buttonAction2=" + this.e + ", buttonAction3=" + this.f + ")";
    }

    public /* synthetic */ rse(s67 s67Var, s67 s67Var2, Function0 function0, Function0 function02) {
        this(s67Var, s67Var2, null, function0, function02, null);
    }
}
