package defpackage;

import android.os.Build;
import com.ironsource.U3;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hn0 {
    public static final hn0 d;
    public final int a;
    public final int b;
    public final vv9 c;

    static {
        hn0 hn0Var;
        if (Build.VERSION.SDK_INT >= 33) {
            tv9 tv9Var = new tv9(4);
            for (int i = 1; i <= 10; i++) {
                tv9Var.c(Integer.valueOf(nik.t(i)));
            }
            hn0Var = new hn0(2, tv9Var.h());
        } else {
            hn0Var = new hn0(2, 10);
        }
        d = hn0Var;
    }

    public hn0(int i, Set set) {
        this.a = i;
        vv9 t = vv9.t(set);
        this.c = t;
        cck it = t.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn0)) {
            return false;
        }
        hn0 hn0Var = (hn0) obj;
        return this.a == hn0Var.a && this.b == hn0Var.b && Objects.equals(this.c, hn0Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        vv9 vv9Var = this.c;
        return i + (vv9Var == null ? 0 : vv9Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + U3.j.e;
    }

    public hn0(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
