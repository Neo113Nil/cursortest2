package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dep extends e7n {
    public static final bep t = new bep();
    public static final Object u = new Object();
    public Object[] p;
    public int q;
    public String[] r;
    public int[] s;

    @Override // defpackage.e7n
    public final void E0() {
        int Q0 = Q0() - 1;
        if (Q0 == 1) {
            M();
            return;
        }
        if (Q0 != 9) {
            if (Q0 == 3) {
                Z();
                return;
            }
            if (Q0 == 4) {
                b1(true);
                return;
            }
            h1();
            int i = this.q;
            if (i > 0) {
                int[] iArr = this.s;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
        }
    }

    @Override // defpackage.e7n
    public final String I0() {
        return d1(false);
    }

    @Override // defpackage.e7n
    public final void M() {
        f1(2);
        h1();
        h1();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.e7n
    public final String P0() {
        return d1(true);
    }

    @Override // defpackage.e7n
    public final int Q0() {
        if (this.q == 0) {
            return 10;
        }
        Object g1 = g1();
        if (g1 instanceof Iterator) {
            boolean z = this.p[this.q - 2] instanceof r9p;
            Iterator it = (Iterator) g1;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            c1(it.next());
            return Q0();
        }
        if (g1 instanceof r9p) {
            return 3;
        }
        if (g1 instanceof j9p) {
            return 1;
        }
        if (!(g1 instanceof s9p)) {
            if (g1 instanceof q9p) {
                return 9;
            }
            if (g1 == u) {
                a70.r("JsonReader is closed");
                return 0;
            }
            String name = g1.getClass().getName();
            throw new g7n(wt3.m("Custom JsonElement subclass ", name, new StringBuilder(name.length() + 45), " is not supported"));
        }
        Serializable serializable = ((s9p) g1).a;
        if (serializable instanceof String) {
            return 6;
        }
        if (serializable instanceof Boolean) {
            return 8;
        }
        if (serializable instanceof Number) {
            return 7;
        }
        ogj.b();
        return 0;
    }

    @Override // defpackage.e7n
    public final void T() {
        f1(3);
        c1(((ccp) ((r9p) g1()).a.entrySet()).iterator());
    }

    @Override // defpackage.e7n
    public final void Z() {
        f1(4);
        this.r[this.q - 1] = null;
        h1();
        h1();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.e7n
    public final boolean a0() {
        int Q0 = Q0();
        return (Q0 == 4 || Q0 == 2 || Q0 == 10) ? false : true;
    }

    public final String b1(boolean z) {
        f1(5);
        Map.Entry entry = (Map.Entry) ((Iterator) g1()).next();
        String str = (String) entry.getKey();
        this.r[this.q - 1] = true != z ? str : "<skipped>";
        c1(entry.getValue());
        return str;
    }

    public final void c1(Object obj) {
        int i = this.q;
        Object[] objArr = this.p;
        if (i == objArr.length) {
            int i2 = i + i;
            this.p = Arrays.copyOf(objArr, i2);
            this.s = Arrays.copyOf(this.s, i2);
            this.r = (String[]) Arrays.copyOf(this.r, i2);
        }
        Object[] objArr2 = this.p;
        int i3 = this.q;
        this.q = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // defpackage.e7n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p = new Object[]{u};
        this.q = 1;
    }

    public final String d1(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.q;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.p;
            Object obj = objArr[i];
            if (obj instanceof j9p) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.s[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof r9p) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.r[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // defpackage.e7n
    public final String e0() {
        return b1(false);
    }

    public final String e1() {
        return " at path ".concat(d1(false));
    }

    @Override // defpackage.e7n
    public final String f0() {
        int Q0 = Q0();
        if (Q0 != 6 && Q0 != 7) {
            String e1 = e1();
            int length = e1.length();
            String T = b0a.T(Q0);
            a70.r(wt3.m("Expected STRING but was ", T, new StringBuilder(T.length() + 24 + length), e1));
            return null;
        }
        String d = ((s9p) h1()).d();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d;
    }

    public final void f1(int i) {
        if (Q0() == i) {
            return;
        }
        String T = b0a.T(Q0());
        String e1 = e1();
        String T2 = b0a.T(i);
        StringBuilder sb = new StringBuilder(mz1.d(T2.length() + 18, e1.length(), T));
        bf3.v(sb, "Expected ", T2, " but was ", T);
        zzl.m(sb, e1);
    }

    @Override // defpackage.e7n
    public final boolean g0() {
        f1(8);
        s9p s9pVar = (s9p) h1();
        Serializable serializable = s9pVar.a;
        boolean booleanValue = serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(s9pVar.d());
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return booleanValue;
    }

    public final Object g1() {
        return this.p[this.q - 1];
    }

    public final Object h1() {
        Object[] objArr = this.p;
        int i = this.q - 1;
        this.q = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // defpackage.e7n
    public final void j0() {
        f1(9);
        h1();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.e7n
    public final double n0() {
        int Q0 = Q0();
        if (Q0 != 7 && Q0 != 6) {
            String e1 = e1();
            int length = e1.length();
            String T = b0a.T(Q0);
            a70.r(wt3.m("Expected NUMBER but was ", T, new StringBuilder(T.length() + 24 + length), e1));
            return 0.0d;
        }
        double e = ((s9p) g1()).e();
        if (this.b != 1 && (Double.isNaN(e) || Double.isInfinite(e))) {
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 33);
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(e);
            throw new g7n(sb.toString());
        }
        h1();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return e;
    }

    @Override // defpackage.e7n
    public final long r0() {
        int Q0 = Q0();
        if (Q0 != 7 && Q0 != 6) {
            String e1 = e1();
            int length = e1.length();
            String T = b0a.T(Q0);
            a70.r(wt3.m("Expected NUMBER but was ", T, new StringBuilder(T.length() + 24 + length), e1));
            return 0L;
        }
        s9p s9pVar = (s9p) g1();
        long longValue = s9pVar.a instanceof Number ? s9pVar.c().longValue() : Long.parseLong(s9pVar.d());
        h1();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return longValue;
    }

    @Override // defpackage.e7n
    public final String toString() {
        return dep.class.getSimpleName().concat(e1());
    }

    @Override // defpackage.e7n
    public final int u0() {
        int Q0 = Q0();
        if (Q0 != 7 && Q0 != 6) {
            String e1 = e1();
            int length = e1.length();
            String T = b0a.T(Q0);
            a70.r(wt3.m("Expected NUMBER but was ", T, new StringBuilder(T.length() + 24 + length), e1));
            return 0;
        }
        s9p s9pVar = (s9p) g1();
        int intValue = s9pVar.a instanceof Number ? s9pVar.c().intValue() : Integer.parseInt(s9pVar.d());
        h1();
        int i = this.q;
        if (i > 0) {
            int[] iArr = this.s;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return intValue;
    }

    @Override // defpackage.e7n
    public final void zza() {
        f1(1);
        c1(((j9p) g1()).a.iterator());
        this.s[this.q - 1] = 0;
    }
}
