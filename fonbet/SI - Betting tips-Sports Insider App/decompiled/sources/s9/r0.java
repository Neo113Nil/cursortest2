package s9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 {
    public static q0 a(Object obj) {
        r rVar = (r) obj;
        q0 q0Var = rVar.f23374c;
        if (q0Var != q0.f23367e) {
            return q0Var;
        }
        q0 q0Var2 = new q0(0, new int[8], new Object[8], true);
        rVar.f23374c = q0Var2;
        return q0Var2;
    }

    public static boolean b(int i5, androidx.datastore.preferences.protobuf.m mVar, Object obj) {
        k kVar = (k) mVar.f1656e;
        int i10 = mVar.f1653b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            mVar.R(0);
            ((q0) obj).b(i11 << 3, Long.valueOf(kVar.n()));
            return true;
        }
        if (i12 == 1) {
            mVar.R(1);
            ((q0) obj).b((i11 << 3) | 1, Long.valueOf(kVar.k()));
            return true;
        }
        if (i12 == 2) {
            ((q0) obj).b((i11 << 3) | 2, mVar.j());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i5 != 0) {
                    return false;
                }
                throw new v("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw v.b();
            }
            mVar.R(5);
            ((q0) obj).b(5 | (i11 << 3), Integer.valueOf(kVar.j()));
            return true;
        }
        q0 q0Var = new q0(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i5 + 1;
        if (i15 >= 100) {
            throw new v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (mVar.a() != Integer.MAX_VALUE && b(i15, mVar, q0Var)) {
        }
        if (i14 != mVar.f1653b) {
            throw new v("Protocol message end-group tag did not match expected tag.");
        }
        if (q0Var.f23371d) {
            q0Var.f23371d = false;
        }
        ((q0) obj).b(i13 | 3, q0Var);
        return true;
    }
}
