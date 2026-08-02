package g5;

import androidx.work.impl.WorkDatabase_Impl;

/* renamed from: g5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6630c extends J4.l<C6628a> {
    C6630c(WorkDatabase_Impl workDatabase_Impl) {
        super(workDatabase_Impl);
    }

    @Override // J4.l
    public final void bind(O4.f fVar, C6628a c6628a) {
        C6628a c6628a2 = c6628a;
        if (c6628a2.b() == null) {
            fVar.C0(1);
        } else {
            fVar.e0(1, c6628a2.b());
        }
        if (c6628a2.a() == null) {
            fVar.C0(2);
        } else {
            fVar.e0(2, c6628a2.a());
        }
    }

    @Override // J4.A
    public final String createQuery() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
