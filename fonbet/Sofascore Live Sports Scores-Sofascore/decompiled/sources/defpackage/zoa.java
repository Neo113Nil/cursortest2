package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zoa implements uqa {
    public final qpa a;
    public final yoa b;
    public final c c;

    public zoa(qpa qpaVar, yoa yoaVar, c cVar) {
        this.a = qpaVar;
        this.b = yoaVar;
        this.c = cVar;
    }

    @Override // defpackage.uqa
    public final void a(int i, Object obj, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1493551140);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2 | (av8Var.i(obj) ? 32 : 16) | (av8Var.g(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            jca.a(obj, i, this.a.q, yqo.H(726189336, av8Var, new n61(this, i, 5)), av8Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(i, i2, 24, this, obj);
        }
    }

    @Override // defpackage.uqa
    public final Object b(int i) {
        return this.b.g(i);
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
        if (!(obj instanceof zoa)) {
            return false;
        }
        return Intrinsics.c(this.b, ((zoa) obj).b);
    }

    @Override // defpackage.uqa
    public final int getItemCount() {
        return this.b.h().b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
