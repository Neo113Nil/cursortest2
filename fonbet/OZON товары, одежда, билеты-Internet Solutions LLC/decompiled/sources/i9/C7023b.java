package i9;

import h9.EnumC6876a;
import h9.c;
import h9.e;
import h9.h;
import h9.m;
import h9.o;
import h9.q;
import h9.r;
import h9.s;
import h9.t;
import j9.C7309a;
import java.util.EnumMap;
import java.util.List;
import k9.C7610a;
import o9.C8663e;

/* renamed from: i9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7023b implements o {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[LOOP:0: B:16:0x0063->B:17:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    @Override // h9.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q a(c cVar, EnumMap enumMap) throws m, h {
        s[] sVarArr;
        m mVar;
        s[] sVarArr2;
        h hVar;
        s[] sVarArr3;
        List<byte[]> a11;
        String b11;
        t tVar;
        C7610a c7610a = new C7610a(cVar.a());
        C8663e c8663e = null;
        try {
            C7022a a12 = c7610a.a(false);
            sVarArr = a12.b();
            try {
                hVar = null;
                c8663e = new C7309a().a(a12);
                sVarArr2 = sVarArr;
                mVar = null;
            } catch (h e11) {
                e = e11;
                hVar = e;
                sVarArr2 = sVarArr;
                mVar = null;
                if (c8663e == null) {
                }
                if (enumMap != null) {
                    while (r12 < r0) {
                    }
                }
                String g10 = c8663e.g();
                byte[] d11 = c8663e.d();
                EnumC6876a enumC6876a = EnumC6876a.AZTEC;
                System.currentTimeMillis();
                q qVar = new q(g10, d11, sVarArr3, enumC6876a, 0);
                a11 = c8663e.a();
                if (a11 != null) {
                }
                b11 = c8663e.b();
                if (b11 != null) {
                }
                return qVar;
            } catch (m e12) {
                e = e12;
                s[] sVarArr4 = sVarArr;
                mVar = e;
                sVarArr2 = sVarArr4;
                hVar = null;
                if (c8663e == null) {
                }
                if (enumMap != null) {
                }
                String g102 = c8663e.g();
                byte[] d112 = c8663e.d();
                EnumC6876a enumC6876a2 = EnumC6876a.AZTEC;
                System.currentTimeMillis();
                q qVar2 = new q(g102, d112, sVarArr3, enumC6876a2, 0);
                a11 = c8663e.a();
                if (a11 != null) {
                }
                b11 = c8663e.b();
                if (b11 != null) {
                }
                return qVar2;
            }
        } catch (h e13) {
            e = e13;
            sVarArr = null;
        } catch (m e14) {
            e = e14;
            sVarArr = null;
        }
        if (c8663e == null) {
            try {
                C7022a a13 = c7610a.a(true);
                s[] b12 = a13.b();
                c8663e = new C7309a().a(a13);
                sVarArr3 = b12;
            } catch (h | m e15) {
                if (mVar != null) {
                    throw mVar;
                }
                if (hVar != null) {
                    throw hVar;
                }
                throw e15;
            }
        } else {
            sVarArr3 = sVarArr2;
        }
        if (enumMap != null && (tVar = (t) enumMap.get(e.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (s sVar : sVarArr3) {
                tVar.a(sVar);
            }
        }
        String g1022 = c8663e.g();
        byte[] d1122 = c8663e.d();
        EnumC6876a enumC6876a22 = EnumC6876a.AZTEC;
        System.currentTimeMillis();
        q qVar22 = new q(g1022, d1122, sVarArr3, enumC6876a22, 0);
        a11 = c8663e.a();
        if (a11 != null) {
            qVar22.h(r.BYTE_SEGMENTS, a11);
        }
        b11 = c8663e.b();
        if (b11 != null) {
            qVar22.h(r.ERROR_CORRECTION_LEVEL, b11);
        }
        return qVar22;
    }

    @Override // h9.o
    public final void reset() {
    }
}
