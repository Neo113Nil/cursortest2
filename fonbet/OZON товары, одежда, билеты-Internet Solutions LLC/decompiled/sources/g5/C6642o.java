package g5;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6642o implements InterfaceC6638k {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase_Impl f63860a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<C6637j> f63861b;

    /* renamed from: c, reason: collision with root package name */
    private final J4.A f63862c;

    /* renamed from: d, reason: collision with root package name */
    private final J4.A f63863d;

    public C6642o(WorkDatabase_Impl workDatabase_Impl) {
        this.f63860a = workDatabase_Impl;
        this.f63861b = new C6639l(workDatabase_Impl);
        this.f63862c = new C6640m(workDatabase_Impl);
        this.f63863d = new C6641n(workDatabase_Impl);
    }

    @Override // g5.InterfaceC6638k
    public final C6637j a(C6643p id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        String b11 = id2.b();
        int a11 = id2.a();
        J4.w j11 = J4.w.j(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (b11 == null) {
            j11.C0(1);
        } else {
            j11.e0(1, b11);
        }
        j11.m0(2, a11);
        WorkDatabase_Impl workDatabase_Impl = this.f63860a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b12 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            int b13 = L4.a.b(b12, "work_spec_id");
            int b14 = L4.a.b(b12, "generation");
            int b15 = L4.a.b(b12, "system_id");
            C6637j c6637j = null;
            String string = null;
            if (b12.moveToFirst()) {
                if (!b12.isNull(b13)) {
                    string = b12.getString(b13);
                }
                c6637j = new C6637j(string, b12.getInt(b14), b12.getInt(b15));
            }
            return c6637j;
        } finally {
            b12.close();
            j11.release();
        }
    }

    @Override // g5.InterfaceC6638k
    public final void b(C6637j c6637j) {
        WorkDatabase_Impl workDatabase_Impl = this.f63860a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f63861b.insert((J4.l<C6637j>) c6637j);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // g5.InterfaceC6638k
    public final ArrayList c() {
        J4.w j11 = J4.w.j(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = this.f63860a;
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

    @Override // g5.InterfaceC6638k
    public final void d(C6643p id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        String b11 = id2.b();
        int a11 = id2.a();
        WorkDatabase_Impl workDatabase_Impl = this.f63860a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a12 = this.f63862c;
        O4.f acquire = a12.acquire();
        if (b11 == null) {
            acquire.C0(1);
        } else {
            acquire.e0(1, b11);
        }
        acquire.m0(2, a11);
        workDatabase_Impl.beginTransaction();
        try {
            acquire.C();
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
            a12.release(acquire);
        }
    }

    @Override // g5.InterfaceC6638k
    public final void e(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63860a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63863d;
        O4.f acquire = a11.acquire();
        if (str == null) {
            acquire.C0(1);
        } else {
            acquire.e0(1, str);
        }
        workDatabase_Impl.beginTransaction();
        try {
            acquire.C();
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
            a11.release(acquire);
        }
    }
}
