package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sra implements uqa {
    public final ksa a;
    public final rra b;
    public final xpa c;
    public final c d;

    public sra(ksa ksaVar, rra rraVar, xpa xpaVar, c cVar) {
        this.a = ksaVar;
        this.b = rraVar;
        this.c = xpaVar;
        this.d = cVar;
    }

    @Override // defpackage.uqa
    public final void a(int i, Object obj, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-462424778);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2 | (av8Var.i(obj) ? 32 : 16) | (av8Var.g(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            jca.a(obj, i, this.a.s, yqo.H(-824725566, av8Var, new n61(this, i, 6)), av8Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(i, i2, 26, this, obj);
        }
    }

    @Override // defpackage.uqa
    public final Object b(int i) {
        return this.b.g(i);
    }

    @Override // defpackage.uqa
    public final int c(Object obj) {
        return this.d.a(obj);
    }

    @Override // defpackage.uqa
    public final Object d(int i) {
        Object b = this.d.b(i);
        return b == null ? this.b.i(i) : b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sra)) {
            return false;
        }
        return Intrinsics.c(this.b, ((sra) obj).b);
    }

    @Override // defpackage.uqa
    public final int getItemCount() {
        return this.b.h().b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
