package g5;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;

/* renamed from: g5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6635h implements InterfaceC6633f {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase_Impl f63855a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<C6632e> f63856b;

    public C6635h(WorkDatabase_Impl workDatabase_Impl) {
        this.f63855a = workDatabase_Impl;
        this.f63856b = new C6634g(workDatabase_Impl);
    }

    @Override // g5.InterfaceC6633f
    public final void a(C6632e c6632e) {
        WorkDatabase_Impl workDatabase_Impl = this.f63855a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f63856b.insert((J4.l<C6632e>) c6632e);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // g5.InterfaceC6633f
    public final Long b(String str) {
        J4.w j11 = J4.w.j(1, "SELECT long_value FROM Preference where `key`=?");
        j11.e0(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f63855a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            Long l11 = null;
            if (b11.moveToFirst() && !b11.isNull(0)) {
                l11 = Long.valueOf(b11.getLong(0));
            }
            return l11;
        } finally {
            b11.close();
            j11.release();
        }
    }
}
