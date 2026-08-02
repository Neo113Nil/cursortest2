package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bu0 extends hy3 {
    public final Context a;
    public final wy2 b;
    public final wy2 c;
    public final String d;

    public bu0(Context context, wy2 wy2Var, wy2 wy2Var2, String str) {
        if (context == null) {
            yhk.s("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (wy2Var == null) {
            yhk.s("Null wallClock");
            throw null;
        }
        this.b = wy2Var;
        if (wy2Var2 == null) {
            yhk.s("Null monotonicClock");
            throw null;
        }
        this.c = wy2Var2;
        if (str != null) {
            this.d = str;
        } else {
            yhk.s("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hy3) {
            bu0 bu0Var = (bu0) ((hy3) obj);
            if (this.a.equals(bu0Var.a) && this.b.equals(bu0Var.b) && this.c.equals(bu0Var.c) && this.d.equals(bu0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return mz1.o(sb, this.d, "}");
    }
}
