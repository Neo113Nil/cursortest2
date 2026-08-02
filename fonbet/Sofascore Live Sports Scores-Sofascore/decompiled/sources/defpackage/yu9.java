package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yu9 implements Serializable {
    public static final yu9 c = new yu9(new int[0]);
    public final int[] a;
    public final int b;

    public yu9(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public final boolean equals(Object obj) {
        yu9 yu9Var;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof yu9) && (i2 = this.b) == (i = (yu9Var = (yu9) obj).b)) {
            for (int i3 = 0; i3 < i2; i3++) {
                z1a.v(i3, i2);
                int i4 = this.a[i3];
                z1a.v(i3, i);
                if (i4 == yu9Var.a[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.b == 0 ? c : this;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return i < length ? new yu9(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
