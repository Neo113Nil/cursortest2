package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w5j implements Serializable {
    public final boolean a;
    public final int b;

    public w5j(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5j)) {
            return false;
        }
        w5j w5jVar = (w5j) obj;
        return this.a == w5jVar.a && this.b == w5jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TennisGameResult(isBreak=" + this.a + ", value=" + this.b + ")";
    }
}
