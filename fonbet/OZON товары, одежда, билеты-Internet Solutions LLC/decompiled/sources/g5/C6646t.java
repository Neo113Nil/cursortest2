package g5;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* renamed from: g5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6646t implements r {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase_Impl f63868a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<C6644q> f63869b;

    public C6646t(WorkDatabase_Impl workDatabase_Impl) {
        this.f63868a = workDatabase_Impl;
        this.f63869b = new C6645s(workDatabase_Impl);
    }

    @Override // g5.r
    public final void a(C6644q c6644q) {
        WorkDatabase_Impl workDatabase_Impl = this.f63868a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f63869b.insert((J4.l<C6644q>) c6644q);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // g5.r
    public final ArrayList b(String str) {
        J4.w j11 = J4.w.j(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63868a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            ArrayList arrayList = new ArrayList(b11.getCount());
            while (b11.moveToNext()) {
                arrayList.add(b11.isNull(0) ? null : b11.getString(0));
            }
            return arrayList;
        } finally {
            b11.close();
            j11.release();
        }
    }
}
