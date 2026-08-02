package g5;

import Ij.C3261b;
import android.database.Cursor;
import androidx.collection.C5132a;
import androidx.recyclerview.widget.m;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.v;
import g5.C6627B;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q implements C {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase_Impl f63828a;

    /* renamed from: b, reason: collision with root package name */
    private final J4.l<C6627B> f63829b;

    /* renamed from: c, reason: collision with root package name */
    private final J4.k<C6627B> f63830c;

    /* renamed from: d, reason: collision with root package name */
    private final J4.A f63831d;

    /* renamed from: e, reason: collision with root package name */
    private final J4.A f63832e;

    /* renamed from: f, reason: collision with root package name */
    private final J4.A f63833f;

    /* renamed from: g, reason: collision with root package name */
    private final J4.A f63834g;

    /* renamed from: h, reason: collision with root package name */
    private final J4.A f63835h;

    /* renamed from: i, reason: collision with root package name */
    private final J4.A f63836i;

    /* renamed from: j, reason: collision with root package name */
    private final J4.A f63837j;

    /* renamed from: k, reason: collision with root package name */
    private final J4.A f63838k;

    /* renamed from: l, reason: collision with root package name */
    private final J4.A f63839l;

    public Q(WorkDatabase_Impl workDatabase_Impl) {
        this.f63828a = workDatabase_Impl;
        this.f63829b = new H(workDatabase_Impl);
        this.f63830c = new I(workDatabase_Impl);
        this.f63831d = new J(workDatabase_Impl);
        this.f63832e = new K(workDatabase_Impl);
        this.f63833f = new L(workDatabase_Impl);
        this.f63834g = new M(workDatabase_Impl);
        this.f63835h = new N(workDatabase_Impl);
        this.f63836i = new O(workDatabase_Impl);
        this.f63837j = new P(workDatabase_Impl);
        this.f63838k = new D(workDatabase_Impl);
        this.f63839l = new E(workDatabase_Impl);
        new F(workDatabase_Impl);
        new G(workDatabase_Impl);
    }

    private void w(C5132a<String, ArrayList<androidx.work.e>> c5132a) {
        Set<String> keySet = c5132a.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (c5132a.size() > 999) {
            C5132a<String, ArrayList<androidx.work.e>> c5132a2 = new C5132a<>(999);
            int size = c5132a.size();
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                c5132a2.put(c5132a.j(i11), c5132a.n(i11));
                i11++;
                i12++;
                if (i12 == 999) {
                    w(c5132a2);
                    c5132a2 = new C5132a<>(999);
                    i12 = 0;
                }
            }
            if (i12 > 0) {
                w(c5132a2);
                return;
            }
            return;
        }
        StringBuilder e11 = C3261b.e("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        L4.d.a(size2, e11);
        e11.append(")");
        J4.w j11 = J4.w.j(size2, e11.toString());
        int i13 = 1;
        for (String str : keySet) {
            if (str == null) {
                j11.C0(i13);
            } else {
                j11.e0(i13, str);
            }
            i13++;
        }
        Cursor b11 = L4.b.b(this.f63828a, j11, false);
        try {
            int a11 = L4.a.a(b11, "work_spec_id");
            if (a11 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                ArrayList<androidx.work.e> arrayList = c5132a.get(b11.getString(a11));
                if (arrayList != null) {
                    arrayList.add(androidx.work.e.a(b11.isNull(0) ? null : b11.getBlob(0)));
                }
            }
        } finally {
            b11.close();
        }
    }

    private void x(C5132a<String, ArrayList<String>> c5132a) {
        Set<String> keySet = c5132a.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (c5132a.size() > 999) {
            C5132a<String, ArrayList<String>> c5132a2 = new C5132a<>(999);
            int size = c5132a.size();
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                c5132a2.put(c5132a.j(i11), c5132a.n(i11));
                i11++;
                i12++;
                if (i12 == 999) {
                    x(c5132a2);
                    c5132a2 = new C5132a<>(999);
                    i12 = 0;
                }
            }
            if (i12 > 0) {
                x(c5132a2);
                return;
            }
            return;
        }
        StringBuilder e11 = C3261b.e("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        L4.d.a(size2, e11);
        e11.append(")");
        J4.w j11 = J4.w.j(size2, e11.toString());
        int i13 = 1;
        for (String str : keySet) {
            if (str == null) {
                j11.C0(i13);
            } else {
                j11.e0(i13, str);
            }
            i13++;
        }
        Cursor b11 = L4.b.b(this.f63828a, j11, false);
        try {
            int a11 = L4.a.a(b11, "work_spec_id");
            if (a11 == -1) {
                return;
            }
            while (b11.moveToNext()) {
                ArrayList<String> arrayList = c5132a.get(b11.getString(a11));
                if (arrayList != null) {
                    arrayList.add(b11.isNull(0) ? null : b11.getString(0));
                }
            }
        } finally {
            b11.close();
        }
    }

    @Override // g5.C
    public final void a(C6627B c6627b) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f63830c.handle(c6627b);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // g5.C
    public final void b(C6627B c6627b) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f63829b.insert((J4.l<C6627B>) c6627b);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // g5.C
    public final ArrayList c(String str) {
        J4.w j11 = J4.w.j(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
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

    @Override // g5.C
    public final v.a d(String str) {
        J4.w j11 = J4.w.j(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            v.a aVar = null;
            if (b11.moveToFirst()) {
                Integer valueOf = b11.isNull(0) ? null : Integer.valueOf(b11.getInt(0));
                if (valueOf != null) {
                    aVar = Y.e(valueOf.intValue());
                }
            }
            return aVar;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // g5.C
    public final void delete(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63831d;
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

    @Override // g5.C
    public final ArrayList e(String str) {
        J4.w j11 = J4.w.j(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            ArrayList arrayList = new ArrayList(b11.getCount());
            while (b11.moveToNext()) {
                arrayList.add(androidx.work.e.a(b11.isNull(0) ? null : b11.getBlob(0)));
            }
            return arrayList;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // g5.C
    public final int f(v.a aVar, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63832e;
        O4.f acquire = a11.acquire();
        acquire.m0(1, Y.h(aVar));
        if (str == null) {
            acquire.C0(2);
        } else {
            acquire.e0(2, str);
        }
        workDatabase_Impl.beginTransaction();
        try {
            int C11 = acquire.C();
            workDatabase_Impl.setTransactionSuccessful();
            return C11;
        } finally {
            workDatabase_Impl.endTransaction();
            a11.release(acquire);
        }
    }

    @Override // g5.C
    public final boolean g() {
        boolean z11 = false;
        J4.w j11 = J4.w.j(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            if (b11.moveToFirst()) {
                if (b11.getInt(0) != 0) {
                    z11 = true;
                }
            }
            return z11;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // g5.C
    public final int h(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63837j;
        O4.f acquire = a11.acquire();
        if (str == null) {
            acquire.C0(1);
        } else {
            acquire.e0(1, str);
        }
        workDatabase_Impl.beginTransaction();
        try {
            int C11 = acquire.C();
            workDatabase_Impl.setTransactionSuccessful();
            return C11;
        } finally {
            workDatabase_Impl.endTransaction();
            a11.release(acquire);
        }
    }

    @Override // g5.C
    public final void i(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63833f;
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

    @Override // g5.C
    public final int j(long j11, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63838k;
        O4.f acquire = a11.acquire();
        acquire.m0(1, j11);
        if (str == null) {
            acquire.C0(2);
        } else {
            acquire.e0(2, str);
        }
        workDatabase_Impl.beginTransaction();
        try {
            int C11 = acquire.C();
            workDatabase_Impl.setTransactionSuccessful();
            return C11;
        } finally {
            workDatabase_Impl.endTransaction();
            a11.release(acquire);
        }
    }

    @Override // g5.C
    public final ArrayList k(long j11) {
        J4.w wVar;
        J4.w j12 = J4.w.j(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        j12.m0(1, j11);
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j12, false);
        try {
            int b12 = L4.a.b(b11, "id");
            int b13 = L4.a.b(b11, "state");
            int b14 = L4.a.b(b11, "worker_class_name");
            int b15 = L4.a.b(b11, "input_merger_class_name");
            int b16 = L4.a.b(b11, "input");
            int b17 = L4.a.b(b11, "output");
            int b18 = L4.a.b(b11, "initial_delay");
            int b19 = L4.a.b(b11, "interval_duration");
            int b21 = L4.a.b(b11, "flex_duration");
            int b22 = L4.a.b(b11, "run_attempt_count");
            int b23 = L4.a.b(b11, "backoff_policy");
            int b24 = L4.a.b(b11, "backoff_delay_duration");
            int b25 = L4.a.b(b11, "last_enqueue_time");
            wVar = j12;
            try {
                int b26 = L4.a.b(b11, "minimum_retention_duration");
                int b27 = L4.a.b(b11, "schedule_requested_at");
                int b28 = L4.a.b(b11, "run_in_foreground");
                int b29 = L4.a.b(b11, "out_of_quota_policy");
                int b31 = L4.a.b(b11, "period_count");
                int b32 = L4.a.b(b11, "generation");
                int b33 = L4.a.b(b11, "required_network_type");
                int b34 = L4.a.b(b11, "requires_charging");
                int b35 = L4.a.b(b11, "requires_device_idle");
                int b36 = L4.a.b(b11, "requires_battery_not_low");
                int b37 = L4.a.b(b11, "requires_storage_not_low");
                int b38 = L4.a.b(b11, "trigger_content_update_delay");
                int b39 = L4.a.b(b11, "trigger_max_content_delay");
                int b41 = L4.a.b(b11, "content_uri_triggers");
                int i11 = b26;
                ArrayList arrayList = new ArrayList(b11.getCount());
                while (b11.moveToNext()) {
                    byte[] bArr = null;
                    String string = b11.isNull(b12) ? null : b11.getString(b12);
                    v.a e11 = Y.e(b11.getInt(b13));
                    String string2 = b11.isNull(b14) ? null : b11.getString(b14);
                    String string3 = b11.isNull(b15) ? null : b11.getString(b15);
                    androidx.work.e a11 = androidx.work.e.a(b11.isNull(b16) ? null : b11.getBlob(b16));
                    androidx.work.e a12 = androidx.work.e.a(b11.isNull(b17) ? null : b11.getBlob(b17));
                    long j13 = b11.getLong(b18);
                    long j14 = b11.getLong(b19);
                    long j15 = b11.getLong(b21);
                    int i12 = b11.getInt(b22);
                    androidx.work.a b42 = Y.b(b11.getInt(b23));
                    long j16 = b11.getLong(b24);
                    long j17 = b11.getLong(b25);
                    int i13 = i11;
                    long j18 = b11.getLong(i13);
                    int i14 = b12;
                    int i15 = b27;
                    long j19 = b11.getLong(i15);
                    b27 = i15;
                    int i16 = b28;
                    boolean z11 = b11.getInt(i16) != 0;
                    b28 = i16;
                    int i17 = b29;
                    androidx.work.s d11 = Y.d(b11.getInt(i17));
                    b29 = i17;
                    int i18 = b31;
                    int i19 = b11.getInt(i18);
                    b31 = i18;
                    int i21 = b32;
                    int i22 = b11.getInt(i21);
                    b32 = i21;
                    int i23 = b33;
                    androidx.work.p c11 = Y.c(b11.getInt(i23));
                    b33 = i23;
                    int i24 = b34;
                    boolean z12 = b11.getInt(i24) != 0;
                    b34 = i24;
                    int i25 = b35;
                    boolean z13 = b11.getInt(i25) != 0;
                    b35 = i25;
                    int i26 = b36;
                    boolean z14 = b11.getInt(i26) != 0;
                    b36 = i26;
                    int i27 = b37;
                    boolean z15 = b11.getInt(i27) != 0;
                    b37 = i27;
                    int i28 = b38;
                    long j21 = b11.getLong(i28);
                    b38 = i28;
                    int i29 = b39;
                    long j22 = b11.getLong(i29);
                    b39 = i29;
                    int i31 = b41;
                    if (!b11.isNull(i31)) {
                        bArr = b11.getBlob(i31);
                    }
                    b41 = i31;
                    arrayList.add(new C6627B(string, e11, string2, string3, a11, a12, j13, j14, j15, new androidx.work.d(c11, z12, z13, z14, z15, j21, j22, Y.a(bArr)), i12, b42, j16, j17, j18, j19, z11, d11, i19, i22));
                    b12 = i14;
                    i11 = i13;
                }
                b11.close();
                wVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b11.close();
                wVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            wVar = j12;
        }
    }

    @Override // g5.C
    public final ArrayList l() {
        J4.w wVar;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b21;
        int b22;
        int b23;
        int b24;
        J4.w j11 = J4.w.j(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b25 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            b11 = L4.a.b(b25, "id");
            b12 = L4.a.b(b25, "state");
            b13 = L4.a.b(b25, "worker_class_name");
            b14 = L4.a.b(b25, "input_merger_class_name");
            b15 = L4.a.b(b25, "input");
            b16 = L4.a.b(b25, "output");
            b17 = L4.a.b(b25, "initial_delay");
            b18 = L4.a.b(b25, "interval_duration");
            b19 = L4.a.b(b25, "flex_duration");
            b21 = L4.a.b(b25, "run_attempt_count");
            b22 = L4.a.b(b25, "backoff_policy");
            b23 = L4.a.b(b25, "backoff_delay_duration");
            b24 = L4.a.b(b25, "last_enqueue_time");
            wVar = j11;
        } catch (Throwable th2) {
            th = th2;
            wVar = j11;
        }
        try {
            int b26 = L4.a.b(b25, "minimum_retention_duration");
            int b27 = L4.a.b(b25, "schedule_requested_at");
            int b28 = L4.a.b(b25, "run_in_foreground");
            int b29 = L4.a.b(b25, "out_of_quota_policy");
            int b31 = L4.a.b(b25, "period_count");
            int b32 = L4.a.b(b25, "generation");
            int b33 = L4.a.b(b25, "required_network_type");
            int b34 = L4.a.b(b25, "requires_charging");
            int b35 = L4.a.b(b25, "requires_device_idle");
            int b36 = L4.a.b(b25, "requires_battery_not_low");
            int b37 = L4.a.b(b25, "requires_storage_not_low");
            int b38 = L4.a.b(b25, "trigger_content_update_delay");
            int b39 = L4.a.b(b25, "trigger_max_content_delay");
            int b41 = L4.a.b(b25, "content_uri_triggers");
            int i11 = b26;
            ArrayList arrayList = new ArrayList(b25.getCount());
            while (b25.moveToNext()) {
                byte[] bArr = null;
                String string = b25.isNull(b11) ? null : b25.getString(b11);
                v.a e11 = Y.e(b25.getInt(b12));
                String string2 = b25.isNull(b13) ? null : b25.getString(b13);
                String string3 = b25.isNull(b14) ? null : b25.getString(b14);
                androidx.work.e a11 = androidx.work.e.a(b25.isNull(b15) ? null : b25.getBlob(b15));
                androidx.work.e a12 = androidx.work.e.a(b25.isNull(b16) ? null : b25.getBlob(b16));
                long j12 = b25.getLong(b17);
                long j13 = b25.getLong(b18);
                long j14 = b25.getLong(b19);
                int i12 = b25.getInt(b21);
                androidx.work.a b42 = Y.b(b25.getInt(b22));
                long j15 = b25.getLong(b23);
                long j16 = b25.getLong(b24);
                int i13 = i11;
                long j17 = b25.getLong(i13);
                int i14 = b11;
                int i15 = b27;
                long j18 = b25.getLong(i15);
                b27 = i15;
                int i16 = b28;
                boolean z11 = b25.getInt(i16) != 0;
                b28 = i16;
                int i17 = b29;
                androidx.work.s d11 = Y.d(b25.getInt(i17));
                b29 = i17;
                int i18 = b31;
                int i19 = b25.getInt(i18);
                b31 = i18;
                int i21 = b32;
                int i22 = b25.getInt(i21);
                b32 = i21;
                int i23 = b33;
                androidx.work.p c11 = Y.c(b25.getInt(i23));
                b33 = i23;
                int i24 = b34;
                boolean z12 = b25.getInt(i24) != 0;
                b34 = i24;
                int i25 = b35;
                boolean z13 = b25.getInt(i25) != 0;
                b35 = i25;
                int i26 = b36;
                boolean z14 = b25.getInt(i26) != 0;
                b36 = i26;
                int i27 = b37;
                boolean z15 = b25.getInt(i27) != 0;
                b37 = i27;
                int i28 = b38;
                long j19 = b25.getLong(i28);
                b38 = i28;
                int i29 = b39;
                long j21 = b25.getLong(i29);
                b39 = i29;
                int i31 = b41;
                if (!b25.isNull(i31)) {
                    bArr = b25.getBlob(i31);
                }
                b41 = i31;
                arrayList.add(new C6627B(string, e11, string2, string3, a11, a12, j12, j13, j14, new androidx.work.d(c11, z12, z13, z14, z15, j19, j21, Y.a(bArr)), i12, b42, j15, j16, j17, j18, z11, d11, i19, i22));
                b11 = i14;
                i11 = i13;
            }
            b25.close();
            wVar.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b25.close();
            wVar.release();
            throw th;
        }
    }

    @Override // g5.C
    public final C6627B m(String str) {
        J4.w wVar;
        J4.w j11 = J4.w.j(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            int b12 = L4.a.b(b11, "id");
            int b13 = L4.a.b(b11, "state");
            int b14 = L4.a.b(b11, "worker_class_name");
            int b15 = L4.a.b(b11, "input_merger_class_name");
            int b16 = L4.a.b(b11, "input");
            int b17 = L4.a.b(b11, "output");
            int b18 = L4.a.b(b11, "initial_delay");
            int b19 = L4.a.b(b11, "interval_duration");
            int b21 = L4.a.b(b11, "flex_duration");
            int b22 = L4.a.b(b11, "run_attempt_count");
            int b23 = L4.a.b(b11, "backoff_policy");
            int b24 = L4.a.b(b11, "backoff_delay_duration");
            int b25 = L4.a.b(b11, "last_enqueue_time");
            wVar = j11;
            try {
                int b26 = L4.a.b(b11, "minimum_retention_duration");
                int b27 = L4.a.b(b11, "schedule_requested_at");
                int b28 = L4.a.b(b11, "run_in_foreground");
                int b29 = L4.a.b(b11, "out_of_quota_policy");
                int b31 = L4.a.b(b11, "period_count");
                int b32 = L4.a.b(b11, "generation");
                int b33 = L4.a.b(b11, "required_network_type");
                int b34 = L4.a.b(b11, "requires_charging");
                int b35 = L4.a.b(b11, "requires_device_idle");
                int b36 = L4.a.b(b11, "requires_battery_not_low");
                int b37 = L4.a.b(b11, "requires_storage_not_low");
                int b38 = L4.a.b(b11, "trigger_content_update_delay");
                int b39 = L4.a.b(b11, "trigger_max_content_delay");
                int b41 = L4.a.b(b11, "content_uri_triggers");
                C6627B c6627b = null;
                byte[] blob = null;
                if (b11.moveToFirst()) {
                    String string = b11.isNull(b12) ? null : b11.getString(b12);
                    v.a e11 = Y.e(b11.getInt(b13));
                    String string2 = b11.isNull(b14) ? null : b11.getString(b14);
                    String string3 = b11.isNull(b15) ? null : b11.getString(b15);
                    androidx.work.e a11 = androidx.work.e.a(b11.isNull(b16) ? null : b11.getBlob(b16));
                    androidx.work.e a12 = androidx.work.e.a(b11.isNull(b17) ? null : b11.getBlob(b17));
                    long j12 = b11.getLong(b18);
                    long j13 = b11.getLong(b19);
                    long j14 = b11.getLong(b21);
                    int i11 = b11.getInt(b22);
                    androidx.work.a b42 = Y.b(b11.getInt(b23));
                    long j15 = b11.getLong(b24);
                    long j16 = b11.getLong(b25);
                    long j17 = b11.getLong(b26);
                    long j18 = b11.getLong(b27);
                    boolean z11 = b11.getInt(b28) != 0;
                    androidx.work.s d11 = Y.d(b11.getInt(b29));
                    int i12 = b11.getInt(b31);
                    int i13 = b11.getInt(b32);
                    androidx.work.p c11 = Y.c(b11.getInt(b33));
                    boolean z12 = b11.getInt(b34) != 0;
                    boolean z13 = b11.getInt(b35) != 0;
                    boolean z14 = b11.getInt(b36) != 0;
                    boolean z15 = b11.getInt(b37) != 0;
                    long j19 = b11.getLong(b38);
                    long j21 = b11.getLong(b39);
                    if (!b11.isNull(b41)) {
                        blob = b11.getBlob(b41);
                    }
                    c6627b = new C6627B(string, e11, string2, string3, a11, a12, j12, j13, j14, new androidx.work.d(c11, z12, z13, z14, z15, j19, j21, Y.a(blob)), i11, b42, j15, j16, j17, j18, z11, d11, i12, i13);
                }
                b11.close();
                wVar.release();
                return c6627b;
            } catch (Throwable th2) {
                th = th2;
                b11.close();
                wVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            wVar = j11;
        }
    }

    @Override // g5.C
    public final int n() {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63839l;
        O4.f acquire = a11.acquire();
        workDatabase_Impl.beginTransaction();
        try {
            int C11 = acquire.C();
            workDatabase_Impl.setTransactionSuccessful();
            return C11;
        } finally {
            workDatabase_Impl.endTransaction();
            a11.release(acquire);
        }
    }

    @Override // g5.C
    public final ArrayList o() {
        J4.w wVar;
        J4.w j11 = J4.w.j(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        j11.m0(1, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            int b12 = L4.a.b(b11, "id");
            int b13 = L4.a.b(b11, "state");
            int b14 = L4.a.b(b11, "worker_class_name");
            int b15 = L4.a.b(b11, "input_merger_class_name");
            int b16 = L4.a.b(b11, "input");
            int b17 = L4.a.b(b11, "output");
            int b18 = L4.a.b(b11, "initial_delay");
            int b19 = L4.a.b(b11, "interval_duration");
            int b21 = L4.a.b(b11, "flex_duration");
            int b22 = L4.a.b(b11, "run_attempt_count");
            int b23 = L4.a.b(b11, "backoff_policy");
            int b24 = L4.a.b(b11, "backoff_delay_duration");
            int b25 = L4.a.b(b11, "last_enqueue_time");
            wVar = j11;
            try {
                int b26 = L4.a.b(b11, "minimum_retention_duration");
                int b27 = L4.a.b(b11, "schedule_requested_at");
                int b28 = L4.a.b(b11, "run_in_foreground");
                int b29 = L4.a.b(b11, "out_of_quota_policy");
                int b31 = L4.a.b(b11, "period_count");
                int b32 = L4.a.b(b11, "generation");
                int b33 = L4.a.b(b11, "required_network_type");
                int b34 = L4.a.b(b11, "requires_charging");
                int b35 = L4.a.b(b11, "requires_device_idle");
                int b36 = L4.a.b(b11, "requires_battery_not_low");
                int b37 = L4.a.b(b11, "requires_storage_not_low");
                int b38 = L4.a.b(b11, "trigger_content_update_delay");
                int b39 = L4.a.b(b11, "trigger_max_content_delay");
                int b41 = L4.a.b(b11, "content_uri_triggers");
                int i11 = b26;
                ArrayList arrayList = new ArrayList(b11.getCount());
                while (b11.moveToNext()) {
                    byte[] bArr = null;
                    String string = b11.isNull(b12) ? null : b11.getString(b12);
                    v.a e11 = Y.e(b11.getInt(b13));
                    String string2 = b11.isNull(b14) ? null : b11.getString(b14);
                    String string3 = b11.isNull(b15) ? null : b11.getString(b15);
                    androidx.work.e a11 = androidx.work.e.a(b11.isNull(b16) ? null : b11.getBlob(b16));
                    androidx.work.e a12 = androidx.work.e.a(b11.isNull(b17) ? null : b11.getBlob(b17));
                    long j12 = b11.getLong(b18);
                    long j13 = b11.getLong(b19);
                    long j14 = b11.getLong(b21);
                    int i12 = b11.getInt(b22);
                    androidx.work.a b42 = Y.b(b11.getInt(b23));
                    long j15 = b11.getLong(b24);
                    long j16 = b11.getLong(b25);
                    int i13 = i11;
                    long j17 = b11.getLong(i13);
                    int i14 = b12;
                    int i15 = b27;
                    long j18 = b11.getLong(i15);
                    b27 = i15;
                    int i16 = b28;
                    boolean z11 = b11.getInt(i16) != 0;
                    b28 = i16;
                    int i17 = b29;
                    androidx.work.s d11 = Y.d(b11.getInt(i17));
                    b29 = i17;
                    int i18 = b31;
                    int i19 = b11.getInt(i18);
                    b31 = i18;
                    int i21 = b32;
                    int i22 = b11.getInt(i21);
                    b32 = i21;
                    int i23 = b33;
                    androidx.work.p c11 = Y.c(b11.getInt(i23));
                    b33 = i23;
                    int i24 = b34;
                    boolean z12 = b11.getInt(i24) != 0;
                    b34 = i24;
                    int i25 = b35;
                    boolean z13 = b11.getInt(i25) != 0;
                    b35 = i25;
                    int i26 = b36;
                    boolean z14 = b11.getInt(i26) != 0;
                    b36 = i26;
                    int i27 = b37;
                    boolean z15 = b11.getInt(i27) != 0;
                    b37 = i27;
                    int i28 = b38;
                    long j19 = b11.getLong(i28);
                    b38 = i28;
                    int i29 = b39;
                    long j21 = b11.getLong(i29);
                    b39 = i29;
                    int i31 = b41;
                    if (!b11.isNull(i31)) {
                        bArr = b11.getBlob(i31);
                    }
                    b41 = i31;
                    arrayList.add(new C6627B(string, e11, string2, string3, a11, a12, j12, j13, j14, new androidx.work.d(c11, z12, z13, z14, z15, j19, j21, Y.a(bArr)), i12, b42, j15, j16, j17, j18, z11, d11, i19, i22));
                    b12 = i14;
                    i11 = i13;
                }
                b11.close();
                wVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b11.close();
                wVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            wVar = j11;
        }
    }

    @Override // g5.C
    public final ArrayList p(String str) {
        J4.w j11 = J4.w.j(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            j11.C0(1);
        } else {
            j11.e0(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            ArrayList arrayList = new ArrayList(b11.getCount());
            while (b11.moveToNext()) {
                String id2 = b11.isNull(0) ? null : b11.getString(0);
                v.a state = Y.e(b11.getInt(1));
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(state, "state");
                C6627B.a aVar = new C6627B.a();
                aVar.f63819a = id2;
                aVar.f63820b = state;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            b11.close();
            j11.release();
        }
    }

    @Override // g5.C
    public final ArrayList q(int i11) {
        J4.w wVar;
        J4.w j11 = J4.w.j(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        j11.m0(1, i11);
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b11 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            int b12 = L4.a.b(b11, "id");
            int b13 = L4.a.b(b11, "state");
            int b14 = L4.a.b(b11, "worker_class_name");
            int b15 = L4.a.b(b11, "input_merger_class_name");
            int b16 = L4.a.b(b11, "input");
            int b17 = L4.a.b(b11, "output");
            int b18 = L4.a.b(b11, "initial_delay");
            int b19 = L4.a.b(b11, "interval_duration");
            int b21 = L4.a.b(b11, "flex_duration");
            int b22 = L4.a.b(b11, "run_attempt_count");
            int b23 = L4.a.b(b11, "backoff_policy");
            int b24 = L4.a.b(b11, "backoff_delay_duration");
            int b25 = L4.a.b(b11, "last_enqueue_time");
            wVar = j11;
            try {
                int b26 = L4.a.b(b11, "minimum_retention_duration");
                int b27 = L4.a.b(b11, "schedule_requested_at");
                int b28 = L4.a.b(b11, "run_in_foreground");
                int b29 = L4.a.b(b11, "out_of_quota_policy");
                int b31 = L4.a.b(b11, "period_count");
                int b32 = L4.a.b(b11, "generation");
                int b33 = L4.a.b(b11, "required_network_type");
                int b34 = L4.a.b(b11, "requires_charging");
                int b35 = L4.a.b(b11, "requires_device_idle");
                int b36 = L4.a.b(b11, "requires_battery_not_low");
                int b37 = L4.a.b(b11, "requires_storage_not_low");
                int b38 = L4.a.b(b11, "trigger_content_update_delay");
                int b39 = L4.a.b(b11, "trigger_max_content_delay");
                int b41 = L4.a.b(b11, "content_uri_triggers");
                int i12 = b26;
                ArrayList arrayList = new ArrayList(b11.getCount());
                while (b11.moveToNext()) {
                    byte[] bArr = null;
                    String string = b11.isNull(b12) ? null : b11.getString(b12);
                    v.a e11 = Y.e(b11.getInt(b13));
                    String string2 = b11.isNull(b14) ? null : b11.getString(b14);
                    String string3 = b11.isNull(b15) ? null : b11.getString(b15);
                    androidx.work.e a11 = androidx.work.e.a(b11.isNull(b16) ? null : b11.getBlob(b16));
                    androidx.work.e a12 = androidx.work.e.a(b11.isNull(b17) ? null : b11.getBlob(b17));
                    long j12 = b11.getLong(b18);
                    long j13 = b11.getLong(b19);
                    long j14 = b11.getLong(b21);
                    int i13 = b11.getInt(b22);
                    androidx.work.a b42 = Y.b(b11.getInt(b23));
                    long j15 = b11.getLong(b24);
                    long j16 = b11.getLong(b25);
                    int i14 = i12;
                    long j17 = b11.getLong(i14);
                    int i15 = b12;
                    int i16 = b27;
                    long j18 = b11.getLong(i16);
                    b27 = i16;
                    int i17 = b28;
                    boolean z11 = b11.getInt(i17) != 0;
                    b28 = i17;
                    int i18 = b29;
                    androidx.work.s d11 = Y.d(b11.getInt(i18));
                    b29 = i18;
                    int i19 = b31;
                    int i21 = b11.getInt(i19);
                    b31 = i19;
                    int i22 = b32;
                    int i23 = b11.getInt(i22);
                    b32 = i22;
                    int i24 = b33;
                    androidx.work.p c11 = Y.c(b11.getInt(i24));
                    b33 = i24;
                    int i25 = b34;
                    boolean z12 = b11.getInt(i25) != 0;
                    b34 = i25;
                    int i26 = b35;
                    boolean z13 = b11.getInt(i26) != 0;
                    b35 = i26;
                    int i27 = b36;
                    boolean z14 = b11.getInt(i27) != 0;
                    b36 = i27;
                    int i28 = b37;
                    boolean z15 = b11.getInt(i28) != 0;
                    b37 = i28;
                    int i29 = b38;
                    long j19 = b11.getLong(i29);
                    b38 = i29;
                    int i31 = b39;
                    long j21 = b11.getLong(i31);
                    b39 = i31;
                    int i32 = b41;
                    if (!b11.isNull(i32)) {
                        bArr = b11.getBlob(i32);
                    }
                    b41 = i32;
                    arrayList.add(new C6627B(string, e11, string2, string3, a11, a12, j12, j13, j14, new androidx.work.d(c11, z12, z13, z14, z15, j19, j21, Y.a(bArr)), i13, b42, j15, j16, j17, j18, z11, d11, i21, i23));
                    b12 = i15;
                    i12 = i14;
                }
                b11.close();
                wVar.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b11.close();
                wVar.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            wVar = j11;
        }
    }

    @Override // g5.C
    public final void r(String str, androidx.work.e eVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63834g;
        O4.f acquire = a11.acquire();
        byte[] e11 = androidx.work.e.e(eVar);
        if (e11 == null) {
            acquire.C0(1);
        } else {
            acquire.q0(1, e11);
        }
        if (str == null) {
            acquire.C0(2);
        } else {
            acquire.e0(2, str);
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

    @Override // g5.C
    public final void s(long j11, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63835h;
        O4.f acquire = a11.acquire();
        acquire.m0(1, j11);
        if (str == null) {
            acquire.C0(2);
        } else {
            acquire.e0(2, str);
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

    @Override // g5.C
    public final ArrayList t() {
        J4.w wVar;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b21;
        int b22;
        int b23;
        int b24;
        J4.w j11 = J4.w.j(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor b25 = L4.b.b(workDatabase_Impl, j11, false);
        try {
            b11 = L4.a.b(b25, "id");
            b12 = L4.a.b(b25, "state");
            b13 = L4.a.b(b25, "worker_class_name");
            b14 = L4.a.b(b25, "input_merger_class_name");
            b15 = L4.a.b(b25, "input");
            b16 = L4.a.b(b25, "output");
            b17 = L4.a.b(b25, "initial_delay");
            b18 = L4.a.b(b25, "interval_duration");
            b19 = L4.a.b(b25, "flex_duration");
            b21 = L4.a.b(b25, "run_attempt_count");
            b22 = L4.a.b(b25, "backoff_policy");
            b23 = L4.a.b(b25, "backoff_delay_duration");
            b24 = L4.a.b(b25, "last_enqueue_time");
            wVar = j11;
        } catch (Throwable th2) {
            th = th2;
            wVar = j11;
        }
        try {
            int b26 = L4.a.b(b25, "minimum_retention_duration");
            int b27 = L4.a.b(b25, "schedule_requested_at");
            int b28 = L4.a.b(b25, "run_in_foreground");
            int b29 = L4.a.b(b25, "out_of_quota_policy");
            int b31 = L4.a.b(b25, "period_count");
            int b32 = L4.a.b(b25, "generation");
            int b33 = L4.a.b(b25, "required_network_type");
            int b34 = L4.a.b(b25, "requires_charging");
            int b35 = L4.a.b(b25, "requires_device_idle");
            int b36 = L4.a.b(b25, "requires_battery_not_low");
            int b37 = L4.a.b(b25, "requires_storage_not_low");
            int b38 = L4.a.b(b25, "trigger_content_update_delay");
            int b39 = L4.a.b(b25, "trigger_max_content_delay");
            int b41 = L4.a.b(b25, "content_uri_triggers");
            int i11 = b26;
            ArrayList arrayList = new ArrayList(b25.getCount());
            while (b25.moveToNext()) {
                byte[] bArr = null;
                String string = b25.isNull(b11) ? null : b25.getString(b11);
                v.a e11 = Y.e(b25.getInt(b12));
                String string2 = b25.isNull(b13) ? null : b25.getString(b13);
                String string3 = b25.isNull(b14) ? null : b25.getString(b14);
                androidx.work.e a11 = androidx.work.e.a(b25.isNull(b15) ? null : b25.getBlob(b15));
                androidx.work.e a12 = androidx.work.e.a(b25.isNull(b16) ? null : b25.getBlob(b16));
                long j12 = b25.getLong(b17);
                long j13 = b25.getLong(b18);
                long j14 = b25.getLong(b19);
                int i12 = b25.getInt(b21);
                androidx.work.a b42 = Y.b(b25.getInt(b22));
                long j15 = b25.getLong(b23);
                long j16 = b25.getLong(b24);
                int i13 = i11;
                long j17 = b25.getLong(i13);
                int i14 = b11;
                int i15 = b27;
                long j18 = b25.getLong(i15);
                b27 = i15;
                int i16 = b28;
                boolean z11 = b25.getInt(i16) != 0;
                b28 = i16;
                int i17 = b29;
                androidx.work.s d11 = Y.d(b25.getInt(i17));
                b29 = i17;
                int i18 = b31;
                int i19 = b25.getInt(i18);
                b31 = i18;
                int i21 = b32;
                int i22 = b25.getInt(i21);
                b32 = i21;
                int i23 = b33;
                androidx.work.p c11 = Y.c(b25.getInt(i23));
                b33 = i23;
                int i24 = b34;
                boolean z12 = b25.getInt(i24) != 0;
                b34 = i24;
                int i25 = b35;
                boolean z13 = b25.getInt(i25) != 0;
                b35 = i25;
                int i26 = b36;
                boolean z14 = b25.getInt(i26) != 0;
                b36 = i26;
                int i27 = b37;
                boolean z15 = b25.getInt(i27) != 0;
                b37 = i27;
                int i28 = b38;
                long j19 = b25.getLong(i28);
                b38 = i28;
                int i29 = b39;
                long j21 = b25.getLong(i29);
                b39 = i29;
                int i31 = b41;
                if (!b25.isNull(i31)) {
                    bArr = b25.getBlob(i31);
                }
                b41 = i31;
                arrayList.add(new C6627B(string, e11, string2, string3, a11, a12, j12, j13, j14, new androidx.work.d(c11, z12, z13, z14, z15, j19, j21, Y.a(bArr)), i12, b42, j15, j16, j17, j18, z11, d11, i19, i22));
                b11 = i14;
                i11 = i13;
            }
            b25.close();
            wVar.release();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            b25.close();
            wVar.release();
            throw th;
        }
    }

    @Override // g5.C
    public final ArrayList u() {
        J4.w j11 = J4.w.j(1, "SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        j11.e0(1, "ru.ozon.push.sdk.pushstatus.data.worker.PushWorkManager");
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            Cursor b11 = L4.b.b(workDatabase_Impl, j11, true);
            try {
                C5132a<String, ArrayList<String>> c5132a = new C5132a<>();
                C5132a<String, ArrayList<androidx.work.e>> c5132a2 = new C5132a<>();
                while (b11.moveToNext()) {
                    String string = b11.getString(0);
                    if (c5132a.get(string) == null) {
                        c5132a.put(string, new ArrayList<>());
                    }
                    String string2 = b11.getString(0);
                    if (c5132a2.get(string2) == null) {
                        c5132a2.put(string2, new ArrayList<>());
                    }
                }
                b11.moveToPosition(-1);
                x(c5132a);
                w(c5132a2);
                ArrayList arrayList = new ArrayList(b11.getCount());
                while (b11.moveToNext()) {
                    byte[] bArr = null;
                    String string3 = b11.isNull(0) ? null : b11.getString(0);
                    v.a e11 = Y.e(b11.getInt(1));
                    if (!b11.isNull(2)) {
                        bArr = b11.getBlob(2);
                    }
                    androidx.work.e a11 = androidx.work.e.a(bArr);
                    int i11 = b11.getInt(3);
                    int i12 = b11.getInt(4);
                    ArrayList<String> arrayList2 = c5132a.get(b11.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    ArrayList<androidx.work.e> arrayList4 = c5132a2.get(b11.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList.add(new C6627B.b(string3, e11, a11, i11, i12, arrayList3, arrayList4));
                }
                workDatabase_Impl.setTransactionSuccessful();
                b11.close();
                j11.release();
                return arrayList;
            } catch (Throwable th2) {
                b11.close();
                j11.release();
                throw th2;
            }
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // g5.C
    public final int v(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f63828a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        J4.A a11 = this.f63836i;
        O4.f acquire = a11.acquire();
        if (str == null) {
            acquire.C0(1);
        } else {
            acquire.e0(1, str);
        }
        workDatabase_Impl.beginTransaction();
        try {
            int C11 = acquire.C();
            workDatabase_Impl.setTransactionSuccessful();
            return C11;
        } finally {
            workDatabase_Impl.endTransaction();
            a11.release(acquire);
        }
    }
}
