package com.logrocket.protobuf;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6789c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final i1 f6790a = new i1(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f6791b;

    static {
        new u(0);
    }

    public u() {
    }

    public static void b(p pVar, f2 f2Var, int i5, Object obj) {
        if (f2Var == f2.f6697d) {
            pVar.K(i5, 3);
            ((a) obj).e(pVar);
            pVar.K(i5, 4);
        }
        pVar.K(i5, f2Var.f6702b);
        switch (f2Var.ordinal()) {
            case 0:
                pVar.D(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                pVar.B(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                pVar.O(((Long) obj).longValue());
                break;
            case 3:
                pVar.O(((Long) obj).longValue());
                break;
            case 4:
                pVar.F(((Integer) obj).intValue());
                break;
            case 5:
                pVar.D(((Long) obj).longValue());
                break;
            case 6:
                pVar.B(((Integer) obj).intValue());
                break;
            case 7:
                pVar.v(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof j)) {
                    pVar.J((String) obj);
                    break;
                } else {
                    pVar.z((j) obj);
                    break;
                }
            case 9:
                ((a) obj).e(pVar);
                break;
            case 10:
                pVar.H((a) obj);
                break;
            case 11:
                if (!(obj instanceof j)) {
                    byte[] bArr = (byte[]) obj;
                    pVar.x(bArr.length, bArr);
                    break;
                } else {
                    pVar.z((j) obj);
                    break;
                }
            case 12:
                pVar.M(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof eh.d)) {
                    pVar.F(((Integer) obj).intValue());
                    break;
                } else {
                    pVar.F(((eh.d) obj).a());
                    break;
                }
            case 14:
                pVar.B(((Integer) obj).intValue());
                break;
            case 15:
                pVar.D(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                pVar.M((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                pVar.O((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        i1 i1Var;
        if (this.f6791b) {
            return;
        }
        int i5 = 0;
        while (true) {
            i1Var = this.f6790a;
            if (i5 >= i1Var.f6731b.size()) {
                break;
            }
            Map.Entry d10 = i1Var.d(i5);
            if (d10.getValue() instanceof z) {
                ((z) d10.getValue()).k();
            }
            i5++;
        }
        if (!i1Var.f6733d) {
            if (i1Var.f6731b.size() > 0) {
                i1Var.d(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = i1Var.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!i1Var.f6733d) {
            i1Var.f6732c = i1Var.f6732c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(i1Var.f6732c);
            i1Var.f6735f = i1Var.f6735f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(i1Var.f6735f);
            i1Var.f6733d = true;
        }
        this.f6791b = true;
    }

    public final Object clone() {
        u uVar = new u();
        i1 i1Var = this.f6790a;
        if (i1Var.f6731b.size() > 0) {
            Map.Entry d10 = i1Var.d(0);
            if (d10.getKey() != null) {
                throw new ClassCastException();
            }
            d10.getValue();
            throw null;
        }
        Iterator it = i1Var.e().iterator();
        if (!it.hasNext()) {
            return uVar;
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
        if (obj instanceof u) {
            return this.f6790a.equals(((u) obj).f6790a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6790a.hashCode();
    }

    public u(int i5) {
        a();
        a();
    }
}
