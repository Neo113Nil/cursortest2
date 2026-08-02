package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wmi implements tmi, Serializable {
    public final Object a;

    public wmi(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wmi) {
            return sha.r(this.a, ((wmi) obj).a);
        }
        return false;
    }

    @Override // defpackage.tmi
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return mz1.n(new StringBuilder("Suppliers.ofInstance("), this.a, ")");
    }
}
