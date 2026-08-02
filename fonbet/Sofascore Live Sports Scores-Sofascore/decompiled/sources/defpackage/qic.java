package defpackage;

import com.ironsource.C4427z5;
import com.ironsource.U3;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qic {
    public static final Logger c = Logger.getLogger(qic.class.getName());
    public static final it7 d = new it7(28);
    public static final o21 e;
    public Object[] a;
    public int b;

    static {
        o21 o21Var = q21.e;
        if (o21Var.b != null) {
            o21Var = new o21(o21Var.a, (Character) null);
        }
        e = o21Var;
    }

    public final void a(mic micVar) {
        if (this.b == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                Arrays.fill(this.a, i2 * 2, i3 * 2, (Object) null);
                this.b = i2;
                return;
            }
            int i4 = i * 2;
            if (!Arrays.equals(micVar.b, (byte[]) this.a[i4])) {
                Object[] objArr = this.a;
                int i5 = i2 * 2;
                objArr[i5] = (byte[]) objArr[i4];
                Object obj = objArr[i4 + 1];
                if (objArr instanceof byte[][]) {
                    b(objArr.length);
                }
                this.a[i5 + 1] = obj;
                i2++;
            }
            i++;
        }
    }

    public final void b(int i) {
        Object[] objArr = new Object[i];
        int i2 = this.b;
        if (i2 != 0) {
            System.arraycopy(this.a, 0, objArr, 0, i2 * 2);
        }
        this.a = objArr;
    }

    public final Object c(mic micVar) {
        for (int i = this.b - 1; i >= 0; i--) {
            int i2 = i * 2;
            if (Arrays.equals(micVar.b, (byte[]) this.a[i2])) {
                Object obj = this.a[i2 + 1];
                if (obj instanceof byte[]) {
                    return micVar.a((byte[]) obj);
                }
                throw fn0.h(obj);
            }
        }
        return null;
    }

    public final void d(qic qicVar) {
        int i = qicVar.b;
        if (i == 0) {
            return;
        }
        Object[] objArr = this.a;
        int length = objArr != null ? objArr.length : 0;
        int i2 = this.b;
        int i3 = length - (i2 * 2);
        if (i2 == 0 || i3 < i * 2) {
            b((i * 2) + (i2 * 2));
        }
        System.arraycopy(qicVar.a, 0, this.a, this.b * 2, qicVar.b * 2);
        this.b += qicVar.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1 == (r2 != null ? r2.length : 0)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(mic micVar, Object obj) {
        z1a.y(micVar, U3.i.W);
        z1a.y(obj, U3.i.X);
        int i = this.b;
        int i2 = i * 2;
        if (i2 != 0) {
            Object[] objArr = this.a;
        }
        b(Math.max(i * 4, 8));
        int i3 = this.b;
        this.a[i3 * 2] = micVar.b;
        this.a[(i3 * 2) + 1] = micVar.b(obj);
        this.b++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            int i2 = i * 2;
            byte[] bArr = (byte[]) this.a[i2];
            Charset charset = xp2.a;
            String str = new String(bArr, charset);
            sb.append(str);
            sb.append(C4427z5.U);
            boolean endsWith = str.endsWith("-bin");
            Object[] objArr = this.a;
            if (endsWith) {
                Object obj = objArr[i2 + 1];
                if (!(obj instanceof byte[])) {
                    wt3.z(obj);
                    throw null;
                }
                sb.append(e.c((byte[]) obj));
            } else {
                Object obj2 = objArr[i2 + 1];
                if (!(obj2 instanceof byte[])) {
                    wt3.z(obj2);
                    throw null;
                }
                sb.append(new String((byte[]) obj2, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
