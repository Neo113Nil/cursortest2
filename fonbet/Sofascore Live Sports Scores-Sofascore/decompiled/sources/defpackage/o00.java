package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o00 {
    public final Context a;
    public final kx4 b;
    public final long c;
    public final t3e d;

    public o00(Context context, kx4 kx4Var, long j, t3e t3eVar) {
        this.a = context;
        this.b = kx4Var;
        this.c = j;
        this.d = t3eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o00.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        o00 o00Var = (o00) obj;
        if (!Intrinsics.c(this.a, o00Var.a) || !Intrinsics.c(this.b, o00Var.b)) {
            return false;
        }
        long j = o00Var.c;
        int i = r13.j;
        return e8k.a(this.c, j) && this.d.equals(o00Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return this.d.hashCode() + ljg.c(hashCode, 31, this.c);
    }
}
