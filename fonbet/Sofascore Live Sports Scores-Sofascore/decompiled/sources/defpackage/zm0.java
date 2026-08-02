package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zm0 implements i72 {
    public static final zm0 g = new zm0(0, 0, 1, 1, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public dad f;

    public zm0(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zm0.class == obj.getClass()) {
            zm0 zm0Var = (zm0) obj;
            if (this.a == zm0Var.a && this.b == zm0Var.b && this.c == zm0Var.c && this.d == zm0Var.d && this.e == zm0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}
