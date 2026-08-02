package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class ggj {
    public static final /* synthetic */ long b = rh0.a.objectFieldOffset(ggj.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public j26[] a;

    public final void a(j26 j26Var) {
        j26Var.c((k26) this);
        j26[] j26VarArr = this.a;
        if (j26VarArr == null) {
            j26VarArr = new j26[4];
            this.a = j26VarArr;
        } else if (b() >= j26VarArr.length) {
            j26VarArr = (j26[]) Arrays.copyOf(j26VarArr, b() * 2);
            this.a = j26VarArr;
        }
        int b2 = b();
        rh0.a.putIntVolatile(this, b, b2 + 1);
        j26VarArr[b2] = j26Var;
        j26Var.b = b2;
        d(b2);
    }

    public final int b() {
        return rh0.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r5.compareTo(r6) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j26 c(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        rh0.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                j26 j26Var = objArr[i];
                j26Var.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (j26Var.compareTo(obj) < 0) {
                    e(i, i2);
                    d(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= b()) {
                    break;
                }
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < b()) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                e(i, i5);
                i = i5;
            }
        }
        j26 j26Var2 = objArr[b()];
        j26Var2.getClass();
        j26Var2.c(null);
        j26Var2.b = -1;
        objArr[b()] = null;
        return j26Var2;
    }

    public final void d(int i) {
        while (i > 0) {
            j26[] j26VarArr = this.a;
            j26VarArr.getClass();
            int i2 = (i - 1) / 2;
            j26 j26Var = j26VarArr[i2];
            j26Var.getClass();
            j26 j26Var2 = j26VarArr[i];
            j26Var2.getClass();
            if (j26Var.compareTo(j26Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        j26[] j26VarArr = this.a;
        j26VarArr.getClass();
        j26 j26Var = j26VarArr[i2];
        j26Var.getClass();
        j26 j26Var2 = j26VarArr[i];
        j26Var2.getClass();
        j26VarArr[i] = j26Var;
        j26VarArr[i2] = j26Var2;
        j26Var.b = i;
        j26Var2.b = i2;
    }
}
