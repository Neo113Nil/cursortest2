package defpackage;

import kotlin.coroutines.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gu3 extends a {
    public static final kpg c = new kpg(19);
    public final String b;

    public gu3(String str) {
        super(c);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu3) && this.b.equals(((gu3) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("CoroutineName("), this.b, ')');
    }
}
