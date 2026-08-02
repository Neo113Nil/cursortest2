package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class cb3 {
    public final Object a;
    public final ej2 b;
    public final ct8 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ cb3(Object obj, ej2 ej2Var, ct8 ct8Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : ej2Var, (i & 4) != 0 ? null : ct8Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static cb3 a(cb3 cb3Var, ej2 ej2Var, Throwable th, int i) {
        Object obj = cb3Var.a;
        if ((i & 2) != 0) {
            ej2Var = cb3Var.b;
        }
        ej2 ej2Var2 = ej2Var;
        ct8 ct8Var = cb3Var.c;
        Object obj2 = cb3Var.d;
        if ((i & 16) != 0) {
            th = cb3Var.e;
        }
        return new cb3(obj, ej2Var2, ct8Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb3)) {
            return false;
        }
        cb3 cb3Var = (cb3) obj;
        return Intrinsics.c(this.a, cb3Var.a) && Intrinsics.c(this.b, cb3Var.b) && Intrinsics.c(this.c, cb3Var.c) && Intrinsics.c(this.d, cb3Var.d) && Intrinsics.c(this.e, cb3Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ej2 ej2Var = this.b;
        int hashCode2 = (hashCode + (ej2Var == null ? 0 : ej2Var.hashCode())) * 31;
        ct8 ct8Var = this.c;
        int hashCode3 = (hashCode2 + (ct8Var == null ? 0 : ct8Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public cb3(Object obj, ej2 ej2Var, ct8 ct8Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ej2Var;
        this.c = ct8Var;
        this.d = obj2;
        this.e = th;
    }
}
