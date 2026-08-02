package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zz7 {
    public static final /* synthetic */ int c = 0;
    public final ulh a = ulh.g();
    public boolean b;

    static {
        new zz7(0);
    }

    public zz7(int i) {
        a();
        a();
    }

    public static void b(h03 h03Var, yal yalVar, int i, Object obj) {
        if (yalVar == yal.d) {
            h03Var.B(i, 3);
            ((s5) obj).b(h03Var);
            h03Var.B(i, 4);
        }
        h03Var.B(i, yalVar.b);
        switch (yalVar.ordinal()) {
            case 0:
                h03Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                h03Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                h03Var.F(((Long) obj).longValue());
                break;
            case 3:
                h03Var.F(((Long) obj).longValue());
                break;
            case 4:
                h03Var.w(((Integer) obj).intValue());
                break;
            case 5:
                h03Var.u(((Long) obj).longValue());
                break;
            case 6:
                h03Var.s(((Integer) obj).intValue());
                break;
            case 7:
                h03Var.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ec2)) {
                    h03Var.A((String) obj);
                    break;
                } else {
                    h03Var.q((ec2) obj);
                    break;
                }
            case 9:
                ((s5) obj).b(h03Var);
                break;
            case 10:
                s5 s5Var = (s5) obj;
                h03Var.D(((hw8) s5Var).a(null));
                s5Var.b(h03Var);
                break;
            case 11:
                if (!(obj instanceof ec2)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    h03Var.D(length);
                    h03Var.n(bArr, 0, length);
                    break;
                } else {
                    h03Var.q((ec2) obj);
                    break;
                }
            case 12:
                h03Var.D(((Integer) obj).intValue());
                break;
            case 13:
                h03Var.w(((Integer) obj).intValue());
                break;
            case 14:
                h03Var.s(((Integer) obj).intValue());
                break;
            case 15:
                h03Var.u(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                h03Var.D((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                h03Var.F((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        ulh ulhVar = this.a;
        int size = ulhVar.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry d = ulhVar.d(i);
            if (d.getValue() instanceof hw8) {
                hw8 hw8Var = (hw8) d.getValue();
                hw8Var.getClass();
                kff kffVar = kff.c;
                kffVar.getClass();
                kffVar.a(hw8Var.getClass()).b(hw8Var);
                hw8Var.h();
            }
        }
        if (!ulhVar.c) {
            if (ulhVar.a.size() > 0) {
                ulhVar.d(0).getKey().getClass();
                pvd.j();
                return;
            } else {
                Iterator it = ulhVar.e().iterator();
                if (it.hasNext()) {
                    throw fc6.d((Map.Entry) it.next());
                }
            }
        }
        if (!ulhVar.c) {
            ulhVar.b = ulhVar.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ulhVar.b);
            ulhVar.e = ulhVar.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ulhVar.e);
            ulhVar.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        zz7 zz7Var = new zz7();
        ulh ulhVar = this.a;
        if (ulhVar.a.size() > 0) {
            Map.Entry d = ulhVar.d(0);
            if (d.getKey() != null) {
                pvd.j();
                return null;
            }
            d.getValue();
            throw null;
        }
        Iterator it = ulhVar.e().iterator();
        if (!it.hasNext()) {
            return zz7Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            pvd.j();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zz7) {
            return this.a.equals(((zz7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public zz7() {
    }
}
