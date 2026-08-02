package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b5 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4932c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final j6 f4933a = new j6();

    /* renamed from: b, reason: collision with root package name */
    public boolean f4934b;

    static {
        new b5(0);
    }

    public b5() {
    }

    public static void b(x4 x4Var, t6 t6Var, int i5, Object obj) {
        if (t6Var == t6.f5254d) {
            Charset charset = n5.f5148a;
            x4Var.M(i5, 3);
            ((g5) ((q4) obj)).d(x4Var);
            x4Var.M(i5, 4);
            return;
        }
        x4Var.M(i5, t6Var.f5257b);
        u6 u6Var = u6.f5268a;
        switch (t6Var.ordinal()) {
            case 0:
                x4Var.Y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                x4Var.W(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                x4Var.X(((Long) obj).longValue());
                break;
            case 3:
                x4Var.X(((Long) obj).longValue());
                break;
            case 4:
                x4Var.U(((Integer) obj).intValue());
                break;
            case 5:
                x4Var.Y(((Long) obj).longValue());
                break;
            case 6:
                x4Var.W(((Integer) obj).intValue());
                break;
            case 7:
                x4Var.T(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof w4)) {
                    x4Var.a0((String) obj);
                    break;
                } else {
                    x4Var.S((w4) obj);
                    break;
                }
            case 9:
                ((g5) ((q4) obj)).d(x4Var);
                break;
            case 10:
                x4Var.getClass();
                g5 g5Var = (g5) ((q4) obj);
                x4Var.V(g5Var.k());
                g5Var.d(x4Var);
                break;
            case 11:
                if (!(obj instanceof w4)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    x4Var.V(length);
                    x4Var.Z(length, bArr);
                    break;
                } else {
                    x4Var.S((w4) obj);
                    break;
                }
            case 12:
                x4Var.V(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof i5)) {
                    x4Var.U(((Integer) obj).intValue());
                    break;
                } else {
                    x4Var.U(((i5) obj).a());
                    break;
                }
            case 14:
                x4Var.W(((Integer) obj).intValue());
                break;
            case 15:
                x4Var.Y(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                x4Var.V((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                x4Var.X((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.f4934b) {
            return;
        }
        j6 j6Var = this.f4933a;
        int i5 = j6Var.f5099b;
        for (int i10 = 0; i10 < i5; i10++) {
            Object obj = j6Var.a(i10).f5111b;
            if (obj instanceof g5) {
                ((g5) obj).g();
            }
        }
        Iterator it = j6Var.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof g5) {
                ((g5) value).g();
            }
        }
        if (!j6Var.f5101d) {
            if (j6Var.f5099b > 0) {
                j6Var.a(0).f5110a.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = j6Var.c().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!j6Var.f5101d) {
            j6Var.f5100c = j6Var.f5100c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(j6Var.f5100c);
            j6Var.f5103f = j6Var.f5103f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(j6Var.f5103f);
            j6Var.f5101d = true;
        }
        this.f4934b = true;
    }

    public final Object clone() {
        b5 b5Var = new b5();
        j6 j6Var = this.f4933a;
        if (j6Var.f5099b > 0) {
            j6Var.a(0).f5110a.getClass();
            throw new ClassCastException();
        }
        Iterator it = j6Var.c().iterator();
        if (!it.hasNext()) {
            return b5Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b5) {
            return this.f4933a.equals(((b5) obj).f4933a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4933a.hashCode();
    }

    public b5(int i5) {
        a();
        a();
    }
}
