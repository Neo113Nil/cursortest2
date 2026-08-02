package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class it1 implements Serializable, zi5 {

    @NotNull
    public static final ht1 Companion = new ht1();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public boolean g;

    public /* synthetic */ it1(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        if (63 != (i & 63)) {
            oea.z(i, 63, gt1.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
    }

    @Override // defpackage.zi5
    public final void d() {
        this.g = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it1)) {
            return false;
        }
        it1 it1Var = (it1) obj;
        return this.a == it1Var.a && this.b == it1Var.b && this.c == it1Var.c && this.d == it1Var.d && this.e == it1Var.e && this.f == it1Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + wv8.a(this.e, wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "BatsmanExtraRow(extra=", ", wide=", ", noBall=");
        me4.q(s, this.c, ", bye=", this.d, ", legBye=");
        return me4.i(s, this.e, ", penalty=", this.f, ")");
    }

    public it1(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }
}
