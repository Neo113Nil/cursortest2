package g5;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class X implements U {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase_Impl f63842a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<T> f63843b;

    /* renamed from: c, reason: collision with root package name */
    private final J4.A f63844c;

    public X(WorkDatabase_Impl workDatabase_Impl) {
        this.f63842a = workDatabase_Impl;
        this.f63843b = new V(workDatabase_Impl);
        this.f63844c = new W(workDatabase_Impl);
    }

    @Override // g5.U
    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63842a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63844c;
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

    @Override // g5.U
    public final void b(String id2, Set<String> tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            T t2 = new T((String) it.next(), id2);
            WorkDatabase_Impl workDatabase_Impl = this.f63842a;
            workDatabase_Impl.assertNotSuspendingTransaction();
            workDatabase_Impl.beginTransaction();
            try {
                this.f63843b.insert((J4.l<T>) t2);
                workDatabase_Impl.setTransactionSuccessful();
            } finally {
                workDatabase_Impl.endTransaction();
            }
        }
    }

    @Override // g5.U
    public final ArrayList c(String str) {
        J4.w j11 = J4.w.j(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63842a;
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
