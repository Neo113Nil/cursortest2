package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gei implements jkk {
    public final Object a;

    public gei(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.jkk
    public final Object a(aee aeeVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gei) && Intrinsics.c(this.a, ((gei) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return lnb.p(new StringBuilder("StaticValueHolder(value="), this.a, ')');
    }
}
