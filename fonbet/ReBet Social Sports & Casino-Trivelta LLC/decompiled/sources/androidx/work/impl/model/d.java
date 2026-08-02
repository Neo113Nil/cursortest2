package androidx.work.impl.model;

import Q2.C;
import Q2.C1493d;
import Q2.EnumC1490a;
import Q2.EnumC1509u;
import Q2.K;
import Y2.y;
import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.A;
import androidx.room.AbstractC2268f;
import androidx.room.AbstractC2272j;
import androidx.room.G;
import androidx.room.w;
import androidx.work.impl.model.WorkSpec;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes.dex */
public final class d implements androidx.work.impl.model.c {

    /* renamed from: a, reason: collision with root package name */
    public final w f23979a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.k f23980b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2272j f23981c;

    /* renamed from: d, reason: collision with root package name */
    public final G f23982d;

    /* renamed from: e, reason: collision with root package name */
    public final G f23983e;

    /* renamed from: f, reason: collision with root package name */
    public final G f23984f;

    /* renamed from: g, reason: collision with root package name */
    public final G f23985g;

    /* renamed from: h, reason: collision with root package name */
    public final G f23986h;

    /* renamed from: i, reason: collision with root package name */
    public final G f23987i;

    /* renamed from: j, reason: collision with root package name */
    public final G f23988j;

    /* renamed from: k, reason: collision with root package name */
    public final G f23989k;

    /* renamed from: l, reason: collision with root package name */
    public final G f23990l;

    /* renamed from: m, reason: collision with root package name */
    public final G f23991m;

    /* renamed from: n, reason: collision with root package name */
    public final G f23992n;

    /* renamed from: o, reason: collision with root package name */
    public final G f23993o;

    /* renamed from: p, reason: collision with root package name */
    public final G f23994p;

    /* renamed from: q, reason: collision with root package name */
    public final G f23995q;

    /* renamed from: r, reason: collision with root package name */
    public final G f23996r;

    public class a extends G {
        public a(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class b extends G {
        public b(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    public class c extends G {
        public c(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    /* renamed from: androidx.work.impl.model.d$d, reason: collision with other inner class name */
    public class C0426d extends G {
        public C0426d(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class e extends G {
        public e(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class f extends G {
        public f(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public class g extends G {
        public g(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    public class h extends G {
        public h(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    public class i implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f24005a;

        public i(A a10) {
            this.f24005a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List call() {
            d.this.f23979a.beginTransaction();
            try {
                Cursor c10 = A2.b.c(d.this.f23979a, this.f24005a, true, null);
                try {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    while (c10.moveToNext()) {
                        String string = c10.getString(0);
                        if (!hashMap.containsKey(string)) {
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = c10.getString(0);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                    }
                    c10.moveToPosition(-1);
                    d.this.E(hashMap);
                    d.this.D(hashMap2);
                    ArrayList arrayList = new ArrayList(c10.getCount());
                    while (c10.moveToNext()) {
                        String string3 = c10.getString(0);
                        K.c g10 = X2.s.g(c10.getInt(1));
                        androidx.work.b b10 = androidx.work.b.b(c10.getBlob(2));
                        int i10 = c10.getInt(3);
                        int i11 = c10.getInt(4);
                        arrayList.add(new WorkSpec.c(string3, g10, b10, c10.getLong(14), c10.getLong(15), c10.getLong(16), new C1493d(X2.s.l(c10.getBlob(6)), X2.s.e(c10.getInt(5)), c10.getInt(7) != 0, c10.getInt(8) != 0, c10.getInt(9) != 0, c10.getInt(10) != 0, c10.getLong(11), c10.getLong(12), X2.s.b(c10.getBlob(13))), i10, X2.s.d(c10.getInt(17)), c10.getLong(18), c10.getLong(19), c10.getInt(20), i11, c10.getLong(21), c10.getInt(22), (ArrayList) hashMap.get(c10.getString(0)), (ArrayList) hashMap2.get(c10.getString(0))));
                    }
                    d.this.f23979a.setTransactionSuccessful();
                    c10.close();
                    return arrayList;
                } catch (Throwable th2) {
                    c10.close();
                    throw th2;
                }
            } finally {
                d.this.f23979a.endTransaction();
            }
        }

        public void finalize() {
            this.f24005a.U();
        }
    }

    public class j extends androidx.room.k {
        public j(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, WorkSpec workSpec) {
            kVar.P0(1, workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
            X2.s sVar = X2.s.f13450a;
            kVar.h1(2, X2.s.k(workSpec.state));
            kVar.P0(3, workSpec.workerClassName);
            kVar.P0(4, workSpec.inputMergerClassName);
            kVar.j1(5, androidx.work.b.g(workSpec.input));
            kVar.j1(6, androidx.work.b.g(workSpec.output));
            kVar.h1(7, workSpec.initialDelay);
            kVar.h1(8, workSpec.intervalDuration);
            kVar.h1(9, workSpec.flexDuration);
            kVar.h1(10, workSpec.runAttemptCount);
            kVar.h1(11, X2.s.a(workSpec.backoffPolicy));
            kVar.h1(12, workSpec.backoffDelayDuration);
            kVar.h1(13, workSpec.lastEnqueueTime);
            kVar.h1(14, workSpec.minimumRetentionDuration);
            kVar.h1(15, workSpec.scheduleRequestedAt);
            kVar.h1(16, workSpec.expedited ? 1L : 0L);
            kVar.h1(17, X2.s.i(workSpec.outOfQuotaPolicy));
            kVar.h1(18, workSpec.getPeriodCount());
            kVar.h1(19, workSpec.getGeneration());
            kVar.h1(20, workSpec.getNextScheduleTimeOverride());
            kVar.h1(21, workSpec.getNextScheduleTimeOverrideGeneration());
            kVar.h1(22, workSpec.getStopReason());
            if (workSpec.getTraceTag() == null) {
                kVar.C1(23);
            } else {
                kVar.P0(23, workSpec.getTraceTag());
            }
            C1493d c1493d = workSpec.constraints;
            kVar.h1(24, X2.s.h(c1493d.f()));
            kVar.j1(25, X2.s.c(c1493d.e()));
            kVar.h1(26, c1493d.i() ? 1L : 0L);
            kVar.h1(27, c1493d.j() ? 1L : 0L);
            kVar.h1(28, c1493d.h() ? 1L : 0L);
            kVar.h1(29, c1493d.k() ? 1L : 0L);
            kVar.h1(30, c1493d.b());
            kVar.h1(31, c1493d.a());
            kVar.j1(32, X2.s.j(c1493d.c()));
        }
    }

    public class k implements Callable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ A f24008a;

        public k(A a10) {
            this.f24008a = a10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Boolean bool;
            Cursor c10 = A2.b.c(d.this.f23979a, this.f24008a, false, null);
            try {
                if (c10.moveToFirst()) {
                    bool = Boolean.valueOf(c10.getInt(0) != 0);
                } else {
                    bool = Boolean.FALSE;
                }
                c10.close();
                return bool;
            } catch (Throwable th2) {
                c10.close();
                throw th2;
            }
        }

        public void finalize() {
            this.f24008a.U();
        }
    }

    public class l extends AbstractC2272j {
        public l(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.AbstractC2272j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, WorkSpec workSpec) {
            kVar.P0(1, workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
            X2.s sVar = X2.s.f13450a;
            kVar.h1(2, X2.s.k(workSpec.state));
            kVar.P0(3, workSpec.workerClassName);
            kVar.P0(4, workSpec.inputMergerClassName);
            kVar.j1(5, androidx.work.b.g(workSpec.input));
            kVar.j1(6, androidx.work.b.g(workSpec.output));
            kVar.h1(7, workSpec.initialDelay);
            kVar.h1(8, workSpec.intervalDuration);
            kVar.h1(9, workSpec.flexDuration);
            kVar.h1(10, workSpec.runAttemptCount);
            kVar.h1(11, X2.s.a(workSpec.backoffPolicy));
            kVar.h1(12, workSpec.backoffDelayDuration);
            kVar.h1(13, workSpec.lastEnqueueTime);
            kVar.h1(14, workSpec.minimumRetentionDuration);
            kVar.h1(15, workSpec.scheduleRequestedAt);
            kVar.h1(16, workSpec.expedited ? 1L : 0L);
            kVar.h1(17, X2.s.i(workSpec.outOfQuotaPolicy));
            kVar.h1(18, workSpec.getPeriodCount());
            kVar.h1(19, workSpec.getGeneration());
            kVar.h1(20, workSpec.getNextScheduleTimeOverride());
            kVar.h1(21, workSpec.getNextScheduleTimeOverrideGeneration());
            kVar.h1(22, workSpec.getStopReason());
            if (workSpec.getTraceTag() == null) {
                kVar.C1(23);
            } else {
                kVar.P0(23, workSpec.getTraceTag());
            }
            C1493d c1493d = workSpec.constraints;
            kVar.h1(24, X2.s.h(c1493d.f()));
            kVar.j1(25, X2.s.c(c1493d.e()));
            kVar.h1(26, c1493d.i() ? 1L : 0L);
            kVar.h1(27, c1493d.j() ? 1L : 0L);
            kVar.h1(28, c1493d.h() ? 1L : 0L);
            kVar.h1(29, c1493d.k() ? 1L : 0L);
            kVar.h1(30, c1493d.b());
            kVar.h1(31, c1493d.a());
            kVar.j1(32, X2.s.j(c1493d.c()));
            kVar.P0(33, workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String);
        }
    }

    public class m extends G {
        public m(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class n extends G {
        public n(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    public class o extends G {
        public o(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    public class p extends G {
        public p(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    public class q extends G {
        public q(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class r extends G {
        public r(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    public class s extends G {
        public s(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public d(w wVar) {
        this.f23979a = wVar;
        this.f23980b = new j(wVar);
        this.f23981c = new l(wVar);
        this.f23982d = new m(wVar);
        this.f23983e = new n(wVar);
        this.f23984f = new o(wVar);
        this.f23985g = new p(wVar);
        this.f23986h = new q(wVar);
        this.f23987i = new r(wVar);
        this.f23988j = new s(wVar);
        this.f23989k = new a(wVar);
        this.f23990l = new b(wVar);
        this.f23991m = new c(wVar);
        this.f23992n = new C0426d(wVar);
        this.f23993o = new e(wVar);
        this.f23994p = new f(wVar);
        this.f23995q = new g(wVar);
        this.f23996r = new h(wVar);
    }

    public static /* synthetic */ Unit B(d dVar, HashMap hashMap) {
        dVar.D(hashMap);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit C(d dVar, HashMap hashMap) {
        dVar.E(hashMap);
        return Unit.INSTANCE;
    }

    public static List I() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.c
    public void A(String str, int i10) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23991m.acquire();
        acquire.P0(1, str);
        acquire.h1(2, i10);
        try {
            this.f23979a.beginTransaction();
            try {
                acquire.G();
                this.f23979a.setTransactionSuccessful();
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23991m.release(acquire);
        }
    }

    public final void D(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            A2.d.a(hashMap, true, new Function1() { // from class: X2.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return androidx.work.impl.model.d.B(androidx.work.impl.model.d.this, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder b10 = A2.e.b();
        b10.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        A2.e.a(b10, size);
        b10.append(")");
        A r10 = A.r(b10.toString(), size);
        Iterator it = keySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            r10.P0(i10, (String) it.next());
            i10++;
        }
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            int d10 = A2.a.d(c10, "work_spec_id");
            if (d10 == -1) {
                return;
            }
            while (c10.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(c10.getString(d10));
                if (arrayList != null) {
                    arrayList.add(androidx.work.b.b(c10.getBlob(0)));
                }
            }
        } finally {
            c10.close();
        }
    }

    public final void E(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            A2.d.a(hashMap, true, new Function1() { // from class: X2.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return androidx.work.impl.model.d.C(androidx.work.impl.model.d.this, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder b10 = A2.e.b();
        b10.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        A2.e.a(b10, size);
        b10.append(")");
        A r10 = A.r(b10.toString(), size);
        Iterator it = keySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            r10.P0(i10, (String) it.next());
            i10++;
        }
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            int d10 = A2.a.d(c10, "work_spec_id");
            if (d10 == -1) {
                return;
            }
            while (c10.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(c10.getString(d10));
                if (arrayList != null) {
                    arrayList.add(c10.getString(0));
                }
            }
        } finally {
            c10.close();
        }
    }

    @Override // androidx.work.impl.model.c
    public void a(String str) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23982d.acquire();
        acquire.P0(1, str);
        try {
            this.f23979a.beginTransaction();
            try {
                acquire.G();
                this.f23979a.setTransactionSuccessful();
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23982d.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public void b(String str) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23985g.acquire();
        acquire.P0(1, str);
        try {
            this.f23979a.beginTransaction();
            try {
                acquire.G();
                this.f23979a.setTransactionSuccessful();
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23985g.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List c(long j10) {
        A a10;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        A r10 = A.r("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        r10.h1(1, j10);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
            e11 = A2.a.e(c10, "state");
            e12 = A2.a.e(c10, "worker_class_name");
            e13 = A2.a.e(c10, "input_merger_class_name");
            e14 = A2.a.e(c10, "input");
            e15 = A2.a.e(c10, "output");
            e16 = A2.a.e(c10, "initial_delay");
            e17 = A2.a.e(c10, "interval_duration");
            e18 = A2.a.e(c10, "flex_duration");
            e19 = A2.a.e(c10, "run_attempt_count");
            e20 = A2.a.e(c10, "backoff_policy");
            e21 = A2.a.e(c10, "backoff_delay_duration");
            e22 = A2.a.e(c10, "last_enqueue_time");
            e23 = A2.a.e(c10, "minimum_retention_duration");
            a10 = r10;
        } catch (Throwable th2) {
            th = th2;
            a10 = r10;
        }
        try {
            int e24 = A2.a.e(c10, "schedule_requested_at");
            int e25 = A2.a.e(c10, "run_in_foreground");
            int e26 = A2.a.e(c10, "out_of_quota_policy");
            int e27 = A2.a.e(c10, "period_count");
            int e28 = A2.a.e(c10, "generation");
            int e29 = A2.a.e(c10, "next_schedule_time_override");
            int e30 = A2.a.e(c10, "next_schedule_time_override_generation");
            int e31 = A2.a.e(c10, "stop_reason");
            int e32 = A2.a.e(c10, "trace_tag");
            int e33 = A2.a.e(c10, "required_network_type");
            int e34 = A2.a.e(c10, "required_network_request");
            int e35 = A2.a.e(c10, "requires_charging");
            int e36 = A2.a.e(c10, "requires_device_idle");
            int e37 = A2.a.e(c10, "requires_battery_not_low");
            int e38 = A2.a.e(c10, "requires_storage_not_low");
            int e39 = A2.a.e(c10, "trigger_content_update_delay");
            int e40 = A2.a.e(c10, "trigger_max_content_delay");
            int e41 = A2.a.e(c10, "content_uri_triggers");
            int i10 = e23;
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                String string = c10.getString(e10);
                K.c g10 = X2.s.g(c10.getInt(e11));
                String string2 = c10.getString(e12);
                String string3 = c10.getString(e13);
                androidx.work.b b10 = androidx.work.b.b(c10.getBlob(e14));
                androidx.work.b b11 = androidx.work.b.b(c10.getBlob(e15));
                long j11 = c10.getLong(e16);
                long j12 = c10.getLong(e17);
                long j13 = c10.getLong(e18);
                int i11 = c10.getInt(e19);
                EnumC1490a d10 = X2.s.d(c10.getInt(e20));
                long j14 = c10.getLong(e21);
                long j15 = c10.getLong(e22);
                int i12 = i10;
                long j16 = c10.getLong(i12);
                int i13 = e10;
                int i14 = e24;
                long j17 = c10.getLong(i14);
                e24 = i14;
                int i15 = e25;
                boolean z10 = c10.getInt(i15) != 0;
                e25 = i15;
                int i16 = e26;
                C f10 = X2.s.f(c10.getInt(i16));
                e26 = i16;
                int i17 = e27;
                int i18 = c10.getInt(i17);
                e27 = i17;
                int i19 = e28;
                int i20 = c10.getInt(i19);
                e28 = i19;
                int i21 = e29;
                long j18 = c10.getLong(i21);
                e29 = i21;
                int i22 = e30;
                int i23 = c10.getInt(i22);
                e30 = i22;
                int i24 = e31;
                int i25 = c10.getInt(i24);
                e31 = i24;
                int i26 = e32;
                String string4 = c10.isNull(i26) ? null : c10.getString(i26);
                e32 = i26;
                int i27 = e33;
                EnumC1509u e42 = X2.s.e(c10.getInt(i27));
                e33 = i27;
                int i28 = e34;
                y l10 = X2.s.l(c10.getBlob(i28));
                e34 = i28;
                int i29 = e35;
                boolean z11 = c10.getInt(i29) != 0;
                e35 = i29;
                int i30 = e36;
                boolean z12 = c10.getInt(i30) != 0;
                e36 = i30;
                int i31 = e37;
                boolean z13 = c10.getInt(i31) != 0;
                e37 = i31;
                int i32 = e38;
                boolean z14 = c10.getInt(i32) != 0;
                e38 = i32;
                int i33 = e39;
                long j19 = c10.getLong(i33);
                e39 = i33;
                int i34 = e40;
                long j20 = c10.getLong(i34);
                e40 = i34;
                int i35 = e41;
                e41 = i35;
                arrayList.add(new WorkSpec(string, g10, string2, string3, b10, b11, j11, j12, j13, new C1493d(l10, e42, z11, z12, z13, z14, j19, j20, X2.s.b(c10.getBlob(i35))), i11, d10, j14, j15, j16, j17, z10, f10, i18, i20, j18, i23, i25, string4));
                e10 = i13;
                i10 = i12;
            }
            c10.close();
            a10.U();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c10.close();
            a10.U();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public void d(String str, int i10) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23996r.acquire();
        acquire.h1(1, i10);
        acquire.P0(2, str);
        try {
            this.f23979a.beginTransaction();
            try {
                acquire.G();
                this.f23979a.setTransactionSuccessful();
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23996r.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public void e(WorkSpec workSpec) {
        this.f23979a.assertNotSuspendingTransaction();
        this.f23979a.beginTransaction();
        try {
            this.f23980b.e(workSpec);
            this.f23979a.setTransactionSuccessful();
        } finally {
            this.f23979a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.c
    public List f() {
        A a10;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        A r10 = A.r("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
            e11 = A2.a.e(c10, "state");
            e12 = A2.a.e(c10, "worker_class_name");
            e13 = A2.a.e(c10, "input_merger_class_name");
            e14 = A2.a.e(c10, "input");
            e15 = A2.a.e(c10, "output");
            e16 = A2.a.e(c10, "initial_delay");
            e17 = A2.a.e(c10, "interval_duration");
            e18 = A2.a.e(c10, "flex_duration");
            e19 = A2.a.e(c10, "run_attempt_count");
            e20 = A2.a.e(c10, "backoff_policy");
            e21 = A2.a.e(c10, "backoff_delay_duration");
            e22 = A2.a.e(c10, "last_enqueue_time");
            e23 = A2.a.e(c10, "minimum_retention_duration");
            a10 = r10;
        } catch (Throwable th2) {
            th = th2;
            a10 = r10;
        }
        try {
            int e24 = A2.a.e(c10, "schedule_requested_at");
            int e25 = A2.a.e(c10, "run_in_foreground");
            int e26 = A2.a.e(c10, "out_of_quota_policy");
            int e27 = A2.a.e(c10, "period_count");
            int e28 = A2.a.e(c10, "generation");
            int e29 = A2.a.e(c10, "next_schedule_time_override");
            int e30 = A2.a.e(c10, "next_schedule_time_override_generation");
            int e31 = A2.a.e(c10, "stop_reason");
            int e32 = A2.a.e(c10, "trace_tag");
            int e33 = A2.a.e(c10, "required_network_type");
            int e34 = A2.a.e(c10, "required_network_request");
            int e35 = A2.a.e(c10, "requires_charging");
            int e36 = A2.a.e(c10, "requires_device_idle");
            int e37 = A2.a.e(c10, "requires_battery_not_low");
            int e38 = A2.a.e(c10, "requires_storage_not_low");
            int e39 = A2.a.e(c10, "trigger_content_update_delay");
            int e40 = A2.a.e(c10, "trigger_max_content_delay");
            int e41 = A2.a.e(c10, "content_uri_triggers");
            int i10 = e23;
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                String string = c10.getString(e10);
                K.c g10 = X2.s.g(c10.getInt(e11));
                String string2 = c10.getString(e12);
                String string3 = c10.getString(e13);
                androidx.work.b b10 = androidx.work.b.b(c10.getBlob(e14));
                androidx.work.b b11 = androidx.work.b.b(c10.getBlob(e15));
                long j10 = c10.getLong(e16);
                long j11 = c10.getLong(e17);
                long j12 = c10.getLong(e18);
                int i11 = c10.getInt(e19);
                EnumC1490a d10 = X2.s.d(c10.getInt(e20));
                long j13 = c10.getLong(e21);
                long j14 = c10.getLong(e22);
                int i12 = i10;
                long j15 = c10.getLong(i12);
                int i13 = e10;
                int i14 = e24;
                long j16 = c10.getLong(i14);
                e24 = i14;
                int i15 = e25;
                boolean z10 = c10.getInt(i15) != 0;
                e25 = i15;
                int i16 = e26;
                C f10 = X2.s.f(c10.getInt(i16));
                e26 = i16;
                int i17 = e27;
                int i18 = c10.getInt(i17);
                e27 = i17;
                int i19 = e28;
                int i20 = c10.getInt(i19);
                e28 = i19;
                int i21 = e29;
                long j17 = c10.getLong(i21);
                e29 = i21;
                int i22 = e30;
                int i23 = c10.getInt(i22);
                e30 = i22;
                int i24 = e31;
                int i25 = c10.getInt(i24);
                e31 = i24;
                int i26 = e32;
                String string4 = c10.isNull(i26) ? null : c10.getString(i26);
                e32 = i26;
                int i27 = e33;
                EnumC1509u e42 = X2.s.e(c10.getInt(i27));
                e33 = i27;
                int i28 = e34;
                y l10 = X2.s.l(c10.getBlob(i28));
                e34 = i28;
                int i29 = e35;
                boolean z11 = c10.getInt(i29) != 0;
                e35 = i29;
                int i30 = e36;
                boolean z12 = c10.getInt(i30) != 0;
                e36 = i30;
                int i31 = e37;
                boolean z13 = c10.getInt(i31) != 0;
                e37 = i31;
                int i32 = e38;
                boolean z14 = c10.getInt(i32) != 0;
                e38 = i32;
                int i33 = e39;
                long j18 = c10.getLong(i33);
                e39 = i33;
                int i34 = e40;
                long j19 = c10.getLong(i34);
                e40 = i34;
                int i35 = e41;
                e41 = i35;
                arrayList.add(new WorkSpec(string, g10, string2, string3, b10, b11, j10, j11, j12, new C1493d(l10, e42, z11, z12, z13, z14, j18, j19, X2.s.b(c10.getBlob(i35))), i11, d10, j13, j14, j15, j16, z10, f10, i18, i20, j17, i23, i25, string4));
                e10 = i13;
                i10 = i12;
            }
            c10.close();
            a10.U();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c10.close();
            a10.U();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public List g(String str) {
        A r10 = A.r("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        r10.P0(1, str);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(c10.getString(0));
            }
            return arrayList;
        } finally {
            c10.close();
            r10.U();
        }
    }

    @Override // androidx.work.impl.model.c
    public K.c h(String str) {
        A r10 = A.r("SELECT state FROM workspec WHERE id=?", 1);
        r10.P0(1, str);
        this.f23979a.assertNotSuspendingTransaction();
        K.c cVar = null;
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            if (c10.moveToFirst()) {
                Integer valueOf = c10.isNull(0) ? null : Integer.valueOf(c10.getInt(0));
                if (valueOf != null) {
                    X2.s sVar = X2.s.f13450a;
                    cVar = X2.s.g(valueOf.intValue());
                }
            }
            return cVar;
        } finally {
            c10.close();
            r10.U();
        }
    }

    @Override // androidx.work.impl.model.c
    public WorkSpec i(String str) {
        A a10;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        WorkSpec workSpec;
        A r10 = A.r("SELECT * FROM workspec WHERE id=?", 1);
        r10.P0(1, str);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
            e11 = A2.a.e(c10, "state");
            e12 = A2.a.e(c10, "worker_class_name");
            e13 = A2.a.e(c10, "input_merger_class_name");
            e14 = A2.a.e(c10, "input");
            e15 = A2.a.e(c10, "output");
            e16 = A2.a.e(c10, "initial_delay");
            e17 = A2.a.e(c10, "interval_duration");
            e18 = A2.a.e(c10, "flex_duration");
            e19 = A2.a.e(c10, "run_attempt_count");
            e20 = A2.a.e(c10, "backoff_policy");
            e21 = A2.a.e(c10, "backoff_delay_duration");
            e22 = A2.a.e(c10, "last_enqueue_time");
            e23 = A2.a.e(c10, "minimum_retention_duration");
            a10 = r10;
        } catch (Throwable th2) {
            th = th2;
            a10 = r10;
        }
        try {
            int e24 = A2.a.e(c10, "schedule_requested_at");
            int e25 = A2.a.e(c10, "run_in_foreground");
            int e26 = A2.a.e(c10, "out_of_quota_policy");
            int e27 = A2.a.e(c10, "period_count");
            int e28 = A2.a.e(c10, "generation");
            int e29 = A2.a.e(c10, "next_schedule_time_override");
            int e30 = A2.a.e(c10, "next_schedule_time_override_generation");
            int e31 = A2.a.e(c10, "stop_reason");
            int e32 = A2.a.e(c10, "trace_tag");
            int e33 = A2.a.e(c10, "required_network_type");
            int e34 = A2.a.e(c10, "required_network_request");
            int e35 = A2.a.e(c10, "requires_charging");
            int e36 = A2.a.e(c10, "requires_device_idle");
            int e37 = A2.a.e(c10, "requires_battery_not_low");
            int e38 = A2.a.e(c10, "requires_storage_not_low");
            int e39 = A2.a.e(c10, "trigger_content_update_delay");
            int e40 = A2.a.e(c10, "trigger_max_content_delay");
            int e41 = A2.a.e(c10, "content_uri_triggers");
            if (c10.moveToFirst()) {
                workSpec = new WorkSpec(c10.getString(e10), X2.s.g(c10.getInt(e11)), c10.getString(e12), c10.getString(e13), androidx.work.b.b(c10.getBlob(e14)), androidx.work.b.b(c10.getBlob(e15)), c10.getLong(e16), c10.getLong(e17), c10.getLong(e18), new C1493d(X2.s.l(c10.getBlob(e34)), X2.s.e(c10.getInt(e33)), c10.getInt(e35) != 0, c10.getInt(e36) != 0, c10.getInt(e37) != 0, c10.getInt(e38) != 0, c10.getLong(e39), c10.getLong(e40), X2.s.b(c10.getBlob(e41))), c10.getInt(e19), X2.s.d(c10.getInt(e20)), c10.getLong(e21), c10.getLong(e22), c10.getLong(e23), c10.getLong(e24), c10.getInt(e25) != 0, X2.s.f(c10.getInt(e26)), c10.getInt(e27), c10.getInt(e28), c10.getLong(e29), c10.getInt(e30), c10.getInt(e31), c10.isNull(e32) ? null : c10.getString(e32));
            } else {
                workSpec = null;
            }
            c10.close();
            a10.U();
            return workSpec;
        } catch (Throwable th3) {
            th = th3;
            c10.close();
            a10.U();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public int j(String str) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23984f.acquire();
        acquire.P0(1, str);
        try {
            this.f23979a.beginTransaction();
            try {
                int G10 = acquire.G();
                this.f23979a.setTransactionSuccessful();
                return G10;
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23984f.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List k(String str) {
        A r10 = A.r("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        r10.P0(1, str);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(androidx.work.b.b(c10.getBlob(0)));
            }
            return arrayList;
        } finally {
            c10.close();
            r10.U();
        }
    }

    @Override // androidx.work.impl.model.c
    public List l(int i10) {
        A a10;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        A r10 = A.r("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        r10.h1(1, i10);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
            e11 = A2.a.e(c10, "state");
            e12 = A2.a.e(c10, "worker_class_name");
            e13 = A2.a.e(c10, "input_merger_class_name");
            e14 = A2.a.e(c10, "input");
            e15 = A2.a.e(c10, "output");
            e16 = A2.a.e(c10, "initial_delay");
            e17 = A2.a.e(c10, "interval_duration");
            e18 = A2.a.e(c10, "flex_duration");
            e19 = A2.a.e(c10, "run_attempt_count");
            e20 = A2.a.e(c10, "backoff_policy");
            e21 = A2.a.e(c10, "backoff_delay_duration");
            e22 = A2.a.e(c10, "last_enqueue_time");
            e23 = A2.a.e(c10, "minimum_retention_duration");
            a10 = r10;
        } catch (Throwable th2) {
            th = th2;
            a10 = r10;
        }
        try {
            int e24 = A2.a.e(c10, "schedule_requested_at");
            int e25 = A2.a.e(c10, "run_in_foreground");
            int e26 = A2.a.e(c10, "out_of_quota_policy");
            int e27 = A2.a.e(c10, "period_count");
            int e28 = A2.a.e(c10, "generation");
            int e29 = A2.a.e(c10, "next_schedule_time_override");
            int e30 = A2.a.e(c10, "next_schedule_time_override_generation");
            int e31 = A2.a.e(c10, "stop_reason");
            int e32 = A2.a.e(c10, "trace_tag");
            int e33 = A2.a.e(c10, "required_network_type");
            int e34 = A2.a.e(c10, "required_network_request");
            int e35 = A2.a.e(c10, "requires_charging");
            int e36 = A2.a.e(c10, "requires_device_idle");
            int e37 = A2.a.e(c10, "requires_battery_not_low");
            int e38 = A2.a.e(c10, "requires_storage_not_low");
            int e39 = A2.a.e(c10, "trigger_content_update_delay");
            int e40 = A2.a.e(c10, "trigger_max_content_delay");
            int e41 = A2.a.e(c10, "content_uri_triggers");
            int i11 = e23;
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                String string = c10.getString(e10);
                K.c g10 = X2.s.g(c10.getInt(e11));
                String string2 = c10.getString(e12);
                String string3 = c10.getString(e13);
                androidx.work.b b10 = androidx.work.b.b(c10.getBlob(e14));
                androidx.work.b b11 = androidx.work.b.b(c10.getBlob(e15));
                long j10 = c10.getLong(e16);
                long j11 = c10.getLong(e17);
                long j12 = c10.getLong(e18);
                int i12 = c10.getInt(e19);
                EnumC1490a d10 = X2.s.d(c10.getInt(e20));
                long j13 = c10.getLong(e21);
                long j14 = c10.getLong(e22);
                int i13 = i11;
                long j15 = c10.getLong(i13);
                int i14 = e10;
                int i15 = e24;
                long j16 = c10.getLong(i15);
                e24 = i15;
                int i16 = e25;
                boolean z10 = c10.getInt(i16) != 0;
                e25 = i16;
                int i17 = e26;
                C f10 = X2.s.f(c10.getInt(i17));
                e26 = i17;
                int i18 = e27;
                int i19 = c10.getInt(i18);
                e27 = i18;
                int i20 = e28;
                int i21 = c10.getInt(i20);
                e28 = i20;
                int i22 = e29;
                long j17 = c10.getLong(i22);
                e29 = i22;
                int i23 = e30;
                int i24 = c10.getInt(i23);
                e30 = i23;
                int i25 = e31;
                int i26 = c10.getInt(i25);
                e31 = i25;
                int i27 = e32;
                String string4 = c10.isNull(i27) ? null : c10.getString(i27);
                e32 = i27;
                int i28 = e33;
                EnumC1509u e42 = X2.s.e(c10.getInt(i28));
                e33 = i28;
                int i29 = e34;
                y l10 = X2.s.l(c10.getBlob(i29));
                e34 = i29;
                int i30 = e35;
                boolean z11 = c10.getInt(i30) != 0;
                e35 = i30;
                int i31 = e36;
                boolean z12 = c10.getInt(i31) != 0;
                e36 = i31;
                int i32 = e37;
                boolean z13 = c10.getInt(i32) != 0;
                e37 = i32;
                int i33 = e38;
                boolean z14 = c10.getInt(i33) != 0;
                e38 = i33;
                int i34 = e39;
                long j18 = c10.getLong(i34);
                e39 = i34;
                int i35 = e40;
                long j19 = c10.getLong(i35);
                e40 = i35;
                int i36 = e41;
                e41 = i36;
                arrayList.add(new WorkSpec(string, g10, string2, string3, b10, b11, j10, j11, j12, new C1493d(l10, e42, z11, z12, z13, z14, j18, j19, X2.s.b(c10.getBlob(i36))), i12, d10, j13, j14, j15, j16, z10, f10, i19, i21, j17, i24, i26, string4));
                e10 = i14;
                i11 = i13;
            }
            c10.close();
            a10.U();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c10.close();
            a10.U();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public int m() {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23993o.acquire();
        try {
            this.f23979a.beginTransaction();
            try {
                int G10 = acquire.G();
                this.f23979a.setTransactionSuccessful();
                return G10;
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23993o.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public int n(K.c cVar, String str) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23983e.acquire();
        acquire.h1(1, X2.s.k(cVar));
        acquire.P0(2, str);
        try {
            this.f23979a.beginTransaction();
            try {
                int G10 = acquire.G();
                this.f23979a.setTransactionSuccessful();
                return G10;
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23983e.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public int o(String str, long j10) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23992n.acquire();
        acquire.h1(1, j10);
        acquire.P0(2, str);
        try {
            this.f23979a.beginTransaction();
            try {
                int G10 = acquire.G();
                this.f23979a.setTransactionSuccessful();
                return G10;
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23992n.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List p(String str) {
        A r10 = A.r("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        r10.P0(1, str);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(new WorkSpec.b(c10.getString(0), X2.s.g(c10.getInt(1))));
            }
            return arrayList;
        } finally {
            c10.close();
            r10.U();
        }
    }

    @Override // androidx.work.impl.model.c
    public InterfaceC5321f q() {
        return AbstractC2268f.a(this.f23979a, false, new String[]{"workspec"}, new k(A.r("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)));
    }

    @Override // androidx.work.impl.model.c
    public List r(int i10) {
        A a10;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        A r10 = A.r("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        r10.h1(1, i10);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
            e11 = A2.a.e(c10, "state");
            e12 = A2.a.e(c10, "worker_class_name");
            e13 = A2.a.e(c10, "input_merger_class_name");
            e14 = A2.a.e(c10, "input");
            e15 = A2.a.e(c10, "output");
            e16 = A2.a.e(c10, "initial_delay");
            e17 = A2.a.e(c10, "interval_duration");
            e18 = A2.a.e(c10, "flex_duration");
            e19 = A2.a.e(c10, "run_attempt_count");
            e20 = A2.a.e(c10, "backoff_policy");
            e21 = A2.a.e(c10, "backoff_delay_duration");
            e22 = A2.a.e(c10, "last_enqueue_time");
            e23 = A2.a.e(c10, "minimum_retention_duration");
            a10 = r10;
        } catch (Throwable th2) {
            th = th2;
            a10 = r10;
        }
        try {
            int e24 = A2.a.e(c10, "schedule_requested_at");
            int e25 = A2.a.e(c10, "run_in_foreground");
            int e26 = A2.a.e(c10, "out_of_quota_policy");
            int e27 = A2.a.e(c10, "period_count");
            int e28 = A2.a.e(c10, "generation");
            int e29 = A2.a.e(c10, "next_schedule_time_override");
            int e30 = A2.a.e(c10, "next_schedule_time_override_generation");
            int e31 = A2.a.e(c10, "stop_reason");
            int e32 = A2.a.e(c10, "trace_tag");
            int e33 = A2.a.e(c10, "required_network_type");
            int e34 = A2.a.e(c10, "required_network_request");
            int e35 = A2.a.e(c10, "requires_charging");
            int e36 = A2.a.e(c10, "requires_device_idle");
            int e37 = A2.a.e(c10, "requires_battery_not_low");
            int e38 = A2.a.e(c10, "requires_storage_not_low");
            int e39 = A2.a.e(c10, "trigger_content_update_delay");
            int e40 = A2.a.e(c10, "trigger_max_content_delay");
            int e41 = A2.a.e(c10, "content_uri_triggers");
            int i11 = e23;
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                String string = c10.getString(e10);
                K.c g10 = X2.s.g(c10.getInt(e11));
                String string2 = c10.getString(e12);
                String string3 = c10.getString(e13);
                androidx.work.b b10 = androidx.work.b.b(c10.getBlob(e14));
                androidx.work.b b11 = androidx.work.b.b(c10.getBlob(e15));
                long j10 = c10.getLong(e16);
                long j11 = c10.getLong(e17);
                long j12 = c10.getLong(e18);
                int i12 = c10.getInt(e19);
                EnumC1490a d10 = X2.s.d(c10.getInt(e20));
                long j13 = c10.getLong(e21);
                long j14 = c10.getLong(e22);
                int i13 = i11;
                long j15 = c10.getLong(i13);
                int i14 = e10;
                int i15 = e24;
                long j16 = c10.getLong(i15);
                e24 = i15;
                int i16 = e25;
                boolean z10 = c10.getInt(i16) != 0;
                e25 = i16;
                int i17 = e26;
                C f10 = X2.s.f(c10.getInt(i17));
                e26 = i17;
                int i18 = e27;
                int i19 = c10.getInt(i18);
                e27 = i18;
                int i20 = e28;
                int i21 = c10.getInt(i20);
                e28 = i20;
                int i22 = e29;
                long j17 = c10.getLong(i22);
                e29 = i22;
                int i23 = e30;
                int i24 = c10.getInt(i23);
                e30 = i23;
                int i25 = e31;
                int i26 = c10.getInt(i25);
                e31 = i25;
                int i27 = e32;
                String string4 = c10.isNull(i27) ? null : c10.getString(i27);
                e32 = i27;
                int i28 = e33;
                EnumC1509u e42 = X2.s.e(c10.getInt(i28));
                e33 = i28;
                int i29 = e34;
                y l10 = X2.s.l(c10.getBlob(i29));
                e34 = i29;
                int i30 = e35;
                boolean z11 = c10.getInt(i30) != 0;
                e35 = i30;
                int i31 = e36;
                boolean z12 = c10.getInt(i31) != 0;
                e36 = i31;
                int i32 = e37;
                boolean z13 = c10.getInt(i32) != 0;
                e37 = i32;
                int i33 = e38;
                boolean z14 = c10.getInt(i33) != 0;
                e38 = i33;
                int i34 = e39;
                long j18 = c10.getLong(i34);
                e39 = i34;
                int i35 = e40;
                long j19 = c10.getLong(i35);
                e40 = i35;
                int i36 = e41;
                e41 = i36;
                arrayList.add(new WorkSpec(string, g10, string2, string3, b10, b11, j10, j11, j12, new C1493d(l10, e42, z11, z12, z13, z14, j18, j19, X2.s.b(c10.getBlob(i36))), i12, d10, j13, j14, j15, j16, z10, f10, i19, i21, j17, i24, i26, string4));
                e10 = i14;
                i11 = i13;
            }
            c10.close();
            a10.U();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c10.close();
            a10.U();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public void s(String str, androidx.work.b bVar) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23986h.acquire();
        acquire.j1(1, androidx.work.b.g(bVar));
        acquire.P0(2, str);
        try {
            this.f23979a.beginTransaction();
            try {
                acquire.G();
                this.f23979a.setTransactionSuccessful();
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23986h.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public void t(String str, long j10) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23987i.acquire();
        acquire.h1(1, j10);
        acquire.P0(2, str);
        try {
            this.f23979a.beginTransaction();
            try {
                acquire.G();
                this.f23979a.setTransactionSuccessful();
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23987i.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public List u() {
        A a10;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        A r10 = A.r("SELECT * FROM workspec WHERE state=1", 0);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
            e11 = A2.a.e(c10, "state");
            e12 = A2.a.e(c10, "worker_class_name");
            e13 = A2.a.e(c10, "input_merger_class_name");
            e14 = A2.a.e(c10, "input");
            e15 = A2.a.e(c10, "output");
            e16 = A2.a.e(c10, "initial_delay");
            e17 = A2.a.e(c10, "interval_duration");
            e18 = A2.a.e(c10, "flex_duration");
            e19 = A2.a.e(c10, "run_attempt_count");
            e20 = A2.a.e(c10, "backoff_policy");
            e21 = A2.a.e(c10, "backoff_delay_duration");
            e22 = A2.a.e(c10, "last_enqueue_time");
            e23 = A2.a.e(c10, "minimum_retention_duration");
            a10 = r10;
        } catch (Throwable th2) {
            th = th2;
            a10 = r10;
        }
        try {
            int e24 = A2.a.e(c10, "schedule_requested_at");
            int e25 = A2.a.e(c10, "run_in_foreground");
            int e26 = A2.a.e(c10, "out_of_quota_policy");
            int e27 = A2.a.e(c10, "period_count");
            int e28 = A2.a.e(c10, "generation");
            int e29 = A2.a.e(c10, "next_schedule_time_override");
            int e30 = A2.a.e(c10, "next_schedule_time_override_generation");
            int e31 = A2.a.e(c10, "stop_reason");
            int e32 = A2.a.e(c10, "trace_tag");
            int e33 = A2.a.e(c10, "required_network_type");
            int e34 = A2.a.e(c10, "required_network_request");
            int e35 = A2.a.e(c10, "requires_charging");
            int e36 = A2.a.e(c10, "requires_device_idle");
            int e37 = A2.a.e(c10, "requires_battery_not_low");
            int e38 = A2.a.e(c10, "requires_storage_not_low");
            int e39 = A2.a.e(c10, "trigger_content_update_delay");
            int e40 = A2.a.e(c10, "trigger_max_content_delay");
            int e41 = A2.a.e(c10, "content_uri_triggers");
            int i10 = e23;
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                String string = c10.getString(e10);
                K.c g10 = X2.s.g(c10.getInt(e11));
                String string2 = c10.getString(e12);
                String string3 = c10.getString(e13);
                androidx.work.b b10 = androidx.work.b.b(c10.getBlob(e14));
                androidx.work.b b11 = androidx.work.b.b(c10.getBlob(e15));
                long j10 = c10.getLong(e16);
                long j11 = c10.getLong(e17);
                long j12 = c10.getLong(e18);
                int i11 = c10.getInt(e19);
                EnumC1490a d10 = X2.s.d(c10.getInt(e20));
                long j13 = c10.getLong(e21);
                long j14 = c10.getLong(e22);
                int i12 = i10;
                long j15 = c10.getLong(i12);
                int i13 = e10;
                int i14 = e24;
                long j16 = c10.getLong(i14);
                e24 = i14;
                int i15 = e25;
                boolean z10 = c10.getInt(i15) != 0;
                e25 = i15;
                int i16 = e26;
                C f10 = X2.s.f(c10.getInt(i16));
                e26 = i16;
                int i17 = e27;
                int i18 = c10.getInt(i17);
                e27 = i17;
                int i19 = e28;
                int i20 = c10.getInt(i19);
                e28 = i19;
                int i21 = e29;
                long j17 = c10.getLong(i21);
                e29 = i21;
                int i22 = e30;
                int i23 = c10.getInt(i22);
                e30 = i22;
                int i24 = e31;
                int i25 = c10.getInt(i24);
                e31 = i24;
                int i26 = e32;
                String string4 = c10.isNull(i26) ? null : c10.getString(i26);
                e32 = i26;
                int i27 = e33;
                EnumC1509u e42 = X2.s.e(c10.getInt(i27));
                e33 = i27;
                int i28 = e34;
                y l10 = X2.s.l(c10.getBlob(i28));
                e34 = i28;
                int i29 = e35;
                boolean z11 = c10.getInt(i29) != 0;
                e35 = i29;
                int i30 = e36;
                boolean z12 = c10.getInt(i30) != 0;
                e36 = i30;
                int i31 = e37;
                boolean z13 = c10.getInt(i31) != 0;
                e37 = i31;
                int i32 = e38;
                boolean z14 = c10.getInt(i32) != 0;
                e38 = i32;
                int i33 = e39;
                long j18 = c10.getLong(i33);
                e39 = i33;
                int i34 = e40;
                long j19 = c10.getLong(i34);
                e40 = i34;
                int i35 = e41;
                e41 = i35;
                arrayList.add(new WorkSpec(string, g10, string2, string3, b10, b11, j10, j11, j12, new C1493d(l10, e42, z11, z12, z13, z14, j18, j19, X2.s.b(c10.getBlob(i35))), i11, d10, j13, j14, j15, j16, z10, f10, i18, i20, j17, i23, i25, string4));
                e10 = i13;
                i10 = i12;
            }
            c10.close();
            a10.U();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c10.close();
            a10.U();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public List v() {
        A a10;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        A r10 = A.r("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            e10 = A2.a.e(c10, StackTraceHelper.ID_KEY);
            e11 = A2.a.e(c10, "state");
            e12 = A2.a.e(c10, "worker_class_name");
            e13 = A2.a.e(c10, "input_merger_class_name");
            e14 = A2.a.e(c10, "input");
            e15 = A2.a.e(c10, "output");
            e16 = A2.a.e(c10, "initial_delay");
            e17 = A2.a.e(c10, "interval_duration");
            e18 = A2.a.e(c10, "flex_duration");
            e19 = A2.a.e(c10, "run_attempt_count");
            e20 = A2.a.e(c10, "backoff_policy");
            e21 = A2.a.e(c10, "backoff_delay_duration");
            e22 = A2.a.e(c10, "last_enqueue_time");
            e23 = A2.a.e(c10, "minimum_retention_duration");
            a10 = r10;
        } catch (Throwable th2) {
            th = th2;
            a10 = r10;
        }
        try {
            int e24 = A2.a.e(c10, "schedule_requested_at");
            int e25 = A2.a.e(c10, "run_in_foreground");
            int e26 = A2.a.e(c10, "out_of_quota_policy");
            int e27 = A2.a.e(c10, "period_count");
            int e28 = A2.a.e(c10, "generation");
            int e29 = A2.a.e(c10, "next_schedule_time_override");
            int e30 = A2.a.e(c10, "next_schedule_time_override_generation");
            int e31 = A2.a.e(c10, "stop_reason");
            int e32 = A2.a.e(c10, "trace_tag");
            int e33 = A2.a.e(c10, "required_network_type");
            int e34 = A2.a.e(c10, "required_network_request");
            int e35 = A2.a.e(c10, "requires_charging");
            int e36 = A2.a.e(c10, "requires_device_idle");
            int e37 = A2.a.e(c10, "requires_battery_not_low");
            int e38 = A2.a.e(c10, "requires_storage_not_low");
            int e39 = A2.a.e(c10, "trigger_content_update_delay");
            int e40 = A2.a.e(c10, "trigger_max_content_delay");
            int e41 = A2.a.e(c10, "content_uri_triggers");
            int i10 = e23;
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                String string = c10.getString(e10);
                K.c g10 = X2.s.g(c10.getInt(e11));
                String string2 = c10.getString(e12);
                String string3 = c10.getString(e13);
                androidx.work.b b10 = androidx.work.b.b(c10.getBlob(e14));
                androidx.work.b b11 = androidx.work.b.b(c10.getBlob(e15));
                long j10 = c10.getLong(e16);
                long j11 = c10.getLong(e17);
                long j12 = c10.getLong(e18);
                int i11 = c10.getInt(e19);
                EnumC1490a d10 = X2.s.d(c10.getInt(e20));
                long j13 = c10.getLong(e21);
                long j14 = c10.getLong(e22);
                int i12 = i10;
                long j15 = c10.getLong(i12);
                int i13 = e10;
                int i14 = e24;
                long j16 = c10.getLong(i14);
                e24 = i14;
                int i15 = e25;
                boolean z10 = c10.getInt(i15) != 0;
                e25 = i15;
                int i16 = e26;
                C f10 = X2.s.f(c10.getInt(i16));
                e26 = i16;
                int i17 = e27;
                int i18 = c10.getInt(i17);
                e27 = i17;
                int i19 = e28;
                int i20 = c10.getInt(i19);
                e28 = i19;
                int i21 = e29;
                long j17 = c10.getLong(i21);
                e29 = i21;
                int i22 = e30;
                int i23 = c10.getInt(i22);
                e30 = i22;
                int i24 = e31;
                int i25 = c10.getInt(i24);
                e31 = i24;
                int i26 = e32;
                String string4 = c10.isNull(i26) ? null : c10.getString(i26);
                e32 = i26;
                int i27 = e33;
                EnumC1509u e42 = X2.s.e(c10.getInt(i27));
                e33 = i27;
                int i28 = e34;
                y l10 = X2.s.l(c10.getBlob(i28));
                e34 = i28;
                int i29 = e35;
                boolean z11 = c10.getInt(i29) != 0;
                e35 = i29;
                int i30 = e36;
                boolean z12 = c10.getInt(i30) != 0;
                e36 = i30;
                int i31 = e37;
                boolean z13 = c10.getInt(i31) != 0;
                e37 = i31;
                int i32 = e38;
                boolean z14 = c10.getInt(i32) != 0;
                e38 = i32;
                int i33 = e39;
                long j18 = c10.getLong(i33);
                e39 = i33;
                int i34 = e40;
                long j19 = c10.getLong(i34);
                e40 = i34;
                int i35 = e41;
                e41 = i35;
                arrayList.add(new WorkSpec(string, g10, string2, string3, b10, b11, j10, j11, j12, new C1493d(l10, e42, z11, z12, z13, z14, j18, j19, X2.s.b(c10.getBlob(i35))), i11, d10, j13, j14, j15, j16, z10, f10, i18, i20, j17, i23, i25, string4));
                e10 = i13;
                i10 = i12;
            }
            c10.close();
            a10.U();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            c10.close();
            a10.U();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.c
    public int w(String str) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23989k.acquire();
        acquire.P0(1, str);
        try {
            this.f23979a.beginTransaction();
            try {
                int G10 = acquire.G();
                this.f23979a.setTransactionSuccessful();
                return G10;
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23989k.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public LiveData x(List list) {
        StringBuilder b10 = A2.e.b();
        b10.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        A2.e.a(b10, size);
        b10.append(")");
        A r10 = A.r(b10.toString(), size);
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            r10.P0(i10, (String) it.next());
            i10++;
        }
        return this.f23979a.getInvalidationTracker().e(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new i(r10));
    }

    @Override // androidx.work.impl.model.c
    public int y(String str) {
        this.f23979a.assertNotSuspendingTransaction();
        E2.k acquire = this.f23988j.acquire();
        acquire.P0(1, str);
        try {
            this.f23979a.beginTransaction();
            try {
                int G10 = acquire.G();
                this.f23979a.setTransactionSuccessful();
                return G10;
            } finally {
                this.f23979a.endTransaction();
            }
        } finally {
            this.f23988j.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.c
    public int z() {
        A r10 = A.r("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f23979a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f23979a, r10, false, null);
        try {
            return c10.moveToFirst() ? c10.getInt(0) : 0;
        } finally {
            c10.close();
            r10.U();
        }
    }
}
