package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i2p {
    public final Class a;
    public final Class b;

    public /* synthetic */ i2p(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i2p)) {
            return false;
        }
        i2p i2pVar = (i2p) obj;
        return i2pVar.a.equals(this.a) && i2pVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return lnb.o(this.a.getSimpleName(), " with serialization type: ", this.b.getSimpleName());
    }
}
