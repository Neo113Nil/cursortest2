package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f1 {
    public static e1 a(Object obj) {
        y yVar = (y) obj;
        e1 e1Var = yVar.unknownFields;
        if (e1Var != e1.f1603f) {
            return e1Var;
        }
        e1 e1Var2 = new e1(0, new int[8], new Object[8], true);
        yVar.unknownFields = e1Var2;
        return e1Var2;
    }

    public static boolean b(int i5, m mVar, Object obj) {
        int i10 = mVar.f1653b;
        l lVar = (l) mVar.f1656e;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            mVar.R(0);
            ((e1) obj).c(i11 << 3, Long.valueOf(lVar.n()));
            return true;
        }
        if (i12 == 1) {
            mVar.R(1);
            ((e1) obj).c((i11 << 3) | 1, Long.valueOf(lVar.k()));
            return true;
        }
        if (i12 == 2) {
            ((e1) obj).c((i11 << 3) | 2, mVar.i());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw c0.b();
            }
            mVar.R(5);
            ((e1) obj).c(5 | (i11 << 3), Integer.valueOf(lVar.j()));
            return true;
        }
        e1 e1Var = new e1(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i5 + 1;
        if (i15 >= 100) {
            throw new c0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (mVar.a() != Integer.MAX_VALUE && b(i15, mVar, e1Var)) {
        }
        if (i14 != mVar.f1653b) {
            throw new c0("Protocol message end-group tag did not match expected tag.");
        }
        if (e1Var.f1608e) {
            e1Var.f1608e = false;
        }
        ((e1) obj).c(i13 | 3, e1Var);
        return true;
    }
}
