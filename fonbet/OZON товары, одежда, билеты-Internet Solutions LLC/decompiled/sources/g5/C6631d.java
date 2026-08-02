package g5;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* renamed from: g5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6631d implements InterfaceC6629b {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase_Impl f63851a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<C6628a> f63852b;

    public C6631d(WorkDatabase_Impl workDatabase_Impl) {
        this.f63851a = workDatabase_Impl;
        this.f63852b = new C6630c(workDatabase_Impl);
    }

    @Override // g5.InterfaceC6629b
    public final void a(C6628a c6628a) {
        WorkDatabase_Impl workDatabase_Impl = this.f63851a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f63852b.insert((J4.l<C6628a>) c6628a);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // g5.InterfaceC6629b
    public final ArrayList b(String str) {
        J4.w j11 = J4.w.j(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63851a;
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

    @Override // g5.InterfaceC6629b
    public final boolean c(String str) {
        J4.w j11 = J4.w.j(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63851a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        boolean z11 = false;
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            if (b11.moveToFirst()) {
                z11 = b11.getInt(0) != 0;
            }
            return z11;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // g5.InterfaceC6629b
    public final boolean d(String str) {
        J4.w j11 = J4.w.j(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63851a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        boolean z11 = false;
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            if (b11.moveToFirst()) {
                z11 = b11.getInt(0) != 0;
            }
            return z11;
        } finally {
            b11.close();
            j11.release();
        }
    }
}
