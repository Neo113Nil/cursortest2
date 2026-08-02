package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v05 implements i72 {
    public final int a;
    public final int b;
    public final int c;

    public v05(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v05)) {
            return false;
        }
        v05 v05Var = (v05) obj;
        return this.a == v05Var.a && this.b == v05Var.b && this.c == v05Var.c;
    }

    public final int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31) + this.c;
    }
}
