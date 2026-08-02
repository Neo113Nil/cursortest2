package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.c;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p5e implements uqa {
    public final a6e a;
    public final b b;
    public final c c;

    public p5e(a6e a6eVar, o5e o5eVar, c cVar) {
        this.a = a6eVar;
        this.b = o5eVar;
        this.c = cVar;
    }

    @Override // defpackage.uqa
    public final void a(int i, Object obj, of3 of3Var, int i2) {
        int i3;
        Object obj2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1201380429);
        int i4 = (av8Var.e(i) ? 4 : 2) | i2 | (av8Var.i(obj) ? 32 : 16) | (av8Var.g(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            jca.a(obj2, i3, this.a.y, yqo.H(1142237095, av8Var, new n61(this, i, 13)), av8Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(this, i3, obj2, i2);
        }
    }

    @Override // defpackage.uqa
    public final int c(Object obj) {
        return this.c.a(obj);
    }

    @Override // defpackage.uqa
    public final Object d(int i) {
        Object b = this.c.b(i);
        return b == null ? this.b.i(i) : b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5e)) {
            return false;
        }
        return Intrinsics.c(this.b, ((p5e) obj).b);
    }

    @Override // defpackage.uqa
    public final int getItemCount() {
        return this.b.h().b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
