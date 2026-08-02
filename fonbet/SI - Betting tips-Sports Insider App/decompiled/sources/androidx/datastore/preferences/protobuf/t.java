package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1698c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f1699a = z0.g();

    /* renamed from: b, reason: collision with root package name */
    public boolean f1700b;

    static {
        new t(0);
    }

    public t() {
    }

    public static void b(o oVar, s1 s1Var, int i5, Object obj) {
        if (s1Var == s1.f1693d) {
            oVar.x0(i5, 3);
            ((a) obj).b(oVar);
            oVar.x0(i5, 4);
        }
        oVar.x0(i5, s1Var.f1697b);
        switch (s1Var.ordinal()) {
            case 0:
                oVar.r0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                oVar.p0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                oVar.B0(((Long) obj).longValue());
                break;
            case 3:
                oVar.B0(((Long) obj).longValue());
                break;
            case 4:
                oVar.t0(((Integer) obj).intValue());
                break;
            case 5:
                oVar.r0(((Long) obj).longValue());
                break;
            case 6:
                oVar.p0(((Integer) obj).intValue());
                break;
            case 7:
                oVar.j0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof i)) {
                    oVar.w0((String) obj);
                    break;
                } else {
                    oVar.n0((i) obj);
                    break;
                }
            case 9:
                ((a) obj).b(oVar);
                break;
            case 10:
                a aVar = (a) obj;
                oVar.getClass();
                oVar.z0(((y) aVar).a(null));
                aVar.b(oVar);
                break;
            case 11:
                if (!(obj instanceof i)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    oVar.z0(length);
                    oVar.k0(bArr, 0, length);
                    break;
                } else {
                    oVar.n0((i) obj);
                    break;
                }
            case 12:
                oVar.z0(((Integer) obj).intValue());
                break;
            case 13:
                oVar.t0(((Integer) obj).intValue());
                break;
            case 14:
                oVar.p0(((Integer) obj).intValue());
                break;
            case 15:
                oVar.r0(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                oVar.z0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                oVar.B0((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f1700b) {
            return;
        }
        z0 z0Var = this.f1699a;
        int size = z0Var.f1733a.size();
        for (int i5 = 0; i5 < size; i5++) {
            Map.Entry d10 = z0Var.d(i5);
            if (d10.getValue() instanceof y) {
                y yVar = (y) d10.getValue();
                yVar.getClass();
                u0 u0Var = u0.f1715c;
                u0Var.getClass();
                u0Var.a(yVar.getClass()).b(yVar);
                yVar.h();
            }
        }
        if (!z0Var.f1735c) {
            if (z0Var.f1733a.size() > 0) {
                z0Var.d(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = z0Var.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!z0Var.f1735c) {
            z0Var.f1734b = z0Var.f1734b.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(z0Var.f1734b);
            z0Var.f1737e = z0Var.f1737e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(z0Var.f1737e);
            z0Var.f1735c = true;
        }
        this.f1700b = true;
    }

    public final Object clone() {
        t tVar = new t();
        z0 z0Var = this.f1699a;
        if (z0Var.f1733a.size() > 0) {
            Map.Entry d10 = z0Var.d(0);
            if (d10.getKey() != null) {
                throw new ClassCastException();
            }
            d10.getValue();
            throw null;
        }
        Iterator it = z0Var.e().iterator();
        if (!it.hasNext()) {
            return tVar;
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
        if (obj instanceof t) {
            return this.f1699a.equals(((t) obj).f1699a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1699a.hashCode();
    }

    public t(int i5) {
        a();
        a();
    }
}
