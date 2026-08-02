package g5;

import androidx.work.impl.WorkDatabase_Impl;

/* loaded from: classes.dex */
public final class z implements InterfaceC6648v {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase_Impl f63872a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<C6647u> f63873b;

    /* renamed from: c, reason: collision with root package name */
    private final J4.A f63874c;

    /* renamed from: d, reason: collision with root package name */
    private final J4.A f63875d;

    public z(WorkDatabase_Impl workDatabase_Impl) {
        this.f63872a = workDatabase_Impl;
        this.f63873b = new C6649w(workDatabase_Impl);
        this.f63874c = new C6650x(workDatabase_Impl);
        this.f63875d = new C6651y(workDatabase_Impl);
    }

    @Override // g5.InterfaceC6648v
    public final void a() {
        WorkDatabase_Impl workDatabase_Impl = this.f63872a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63875d;
        O4.f acquire = a11.acquire();
        workDatabase_Impl.beginTransaction();
        try {
            acquire.C();
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
            a11.release(acquire);
        }
    }

    @Override // g5.InterfaceC6648v
    public final void b(C6647u c6647u) {
        WorkDatabase_Impl workDatabase_Impl = this.f63872a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f63873b.insert((J4.l<C6647u>) c6647u);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // g5.InterfaceC6648v
    public final void delete(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63872a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63874c;
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
