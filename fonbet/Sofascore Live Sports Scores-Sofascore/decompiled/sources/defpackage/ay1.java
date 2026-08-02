package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ay1 {
    public final ColorFilter a;
    public final long b;
    public final int c;

    public ay1(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            by1.i();
            porterDuffColorFilter = by1.a(hkg.s0(j), eq3.X(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(hkg.s0(j), eq3.Z(i));
        }
        this.a = porterDuffColorFilter;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay1)) {
            return false;
        }
        ay1 ay1Var = (ay1) obj;
        long j = ay1Var.b;
        int i = r13.j;
        return e8k.a(this.b, j) && this.c == ay1Var.c;
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        vxd.q(this.b, ", blendMode=", sb);
        sb.append((Object) rfo.P(this.c));
        sb.append(')');
        return sb.toString();
    }
}
