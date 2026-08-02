package g5;

import androidx.work.impl.WorkDatabase_Impl;

/* renamed from: g5.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6645s extends J4.l<C6644q> {
    C6645s(WorkDatabase_Impl workDatabase_Impl) {
        super(workDatabase_Impl);
    }

    @Override // J4.l
    public final void bind(O4.f fVar, C6644q c6644q) {
        C6644q c6644q2 = c6644q;
        if (c6644q2.a() == null) {
            fVar.C0(1);
        } else {
            fVar.e0(1, c6644q2.a());
        }
        if (c6644q2.b() == null) {
            fVar.C0(2);
        } else {
            fVar.e0(2, c6644q2.b());
        }
    }

    @Override // J4.A
    public final String createQuery() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }
}
