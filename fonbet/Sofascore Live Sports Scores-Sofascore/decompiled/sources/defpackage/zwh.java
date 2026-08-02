package defpackage;

import android.content.res.ColorStateList;
import com.ironsource.C4427z5;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zwh implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public zwh(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.b = new int[i5];
        this.c = new Object[i5];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            d(i, colorStateList);
            return;
        }
        if (this.a && i2 >= this.b.length) {
            gz8.H(this);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.b = Arrays.copyOf(this.b, i7);
            this.c = Arrays.copyOf(this.c, i7);
        }
        this.b[i3] = i;
        this.c[i3] = colorStateList;
        this.d = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zwh clone() {
        Object clone = super.clone();
        clone.getClass();
        zwh zwhVar = (zwh) clone;
        zwhVar.b = (int[]) this.b.clone();
        zwhVar.c = (Object[]) this.c.clone();
        return zwhVar;
    }

    public final int c(int i) {
        if (this.a) {
            gz8.H(this);
        }
        return this.b[i];
    }

    public final void d(int i, Object obj) {
        int h = kik.h(this.d, i, this.b);
        if (h >= 0) {
            this.c[h] = obj;
            return;
        }
        int i2 = ~h;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == gz8.e) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            gz8.H(this);
            i2 = ~kik.h(this.d, i, this.b);
        }
        int i4 = this.d;
        if (i4 >= this.b.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.b = Arrays.copyOf(this.b, i8);
            this.c = Arrays.copyOf(this.c, i8);
        }
        int i9 = this.d;
        if (i9 - i2 != 0) {
            int[] iArr = this.b;
            int i10 = i2 + 1;
            mh0.e(i10, i2, iArr, iArr, i9);
            Object[] objArr2 = this.c;
            mh0.d(i10, i2, this.d, objArr2, objArr2);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final int e() {
        if (this.a) {
            gz8.H(this);
        }
        return this.d;
    }

    public final Object f(int i) {
        if (this.a) {
            gz8.H(this);
        }
        Object[] objArr = this.c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append(C4427z5.U);
            Object f = f(i2);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
