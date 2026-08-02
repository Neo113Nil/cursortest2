package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class al4 implements e23 {
    public final long a;
    public final long b;

    public al4(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.e23
    public final long a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32 ? this.b : this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al4)) {
            return false;
        }
        al4 al4Var = (al4) obj;
        long j = al4Var.a;
        int i = r13.j;
        return e8k.a(this.a, j) && e8k.a(this.b, al4Var.b);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayNightColorProvider(day=");
        vxd.q(this.a, ", night=", sb);
        sb.append((Object) r13.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
