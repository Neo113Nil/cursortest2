package X2;

import android.database.Cursor;
import androidx.room.A;
import androidx.room.G;
import androidx.room.w;
import androidx.work.impl.model.SystemIdInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final w f13424a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.k f13425b;

    /* renamed from: c, reason: collision with root package name */
    public final G f13426c;

    /* renamed from: d, reason: collision with root package name */
    public final G f13427d;

    public class a extends androidx.room.k {
        public a(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, SystemIdInfo systemIdInfo) {
            kVar.P0(1, systemIdInfo.workSpecId);
            kVar.h1(2, systemIdInfo.getGeneration());
            kVar.h1(3, systemIdInfo.systemId);
        }
    }

    public class b extends G {
        public b(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    public class c extends G {
        public c(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public f(w wVar) {
        this.f13424a = wVar;
        this.f13425b = new a(wVar);
        this.f13426c = new b(wVar);
        this.f13427d = new c(wVar);
    }

    public static List h() {
        return Collections.EMPTY_LIST;
    }

    @Override // X2.e
    public SystemIdInfo b(String str, int i10) {
        A r10 = A.r("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        r10.P0(1, str);
        r10.h1(2, i10);
        this.f13424a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f13424a, r10, false, null);
        try {
            return c10.moveToFirst() ? new SystemIdInfo(c10.getString(A2.a.e(c10, "work_spec_id")), c10.getInt(A2.a.e(c10, "generation")), c10.getInt(A2.a.e(c10, "system_id"))) : null;
        } finally {
            c10.close();
            r10.U();
        }
    }

    @Override // X2.e
    public List c() {
        A r10 = A.r("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f13424a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f13424a, r10, false, null);
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

    @Override // X2.e
    public void e(SystemIdInfo systemIdInfo) {
        this.f13424a.assertNotSuspendingTransaction();
        this.f13424a.beginTransaction();
        try {
            this.f13425b.e(systemIdInfo);
            this.f13424a.setTransactionSuccessful();
        } finally {
            this.f13424a.endTransaction();
        }
    }

    @Override // X2.e
    public void f(String str, int i10) {
        this.f13424a.assertNotSuspendingTransaction();
        E2.k acquire = this.f13426c.acquire();
        acquire.P0(1, str);
        acquire.h1(2, i10);
        try {
            this.f13424a.beginTransaction();
            try {
                acquire.G();
                this.f13424a.setTransactionSuccessful();
            } finally {
                this.f13424a.endTransaction();
            }
        } finally {
            this.f13426c.release(acquire);
        }
    }

    @Override // X2.e
    public void g(String str) {
        this.f13424a.assertNotSuspendingTransaction();
        E2.k acquire = this.f13427d.acquire();
        acquire.P0(1, str);
        try {
            this.f13424a.beginTransaction();
            try {
                acquire.G();
                this.f13424a.setTransactionSuccessful();
            } finally {
                this.f13424a.endTransaction();
            }
        } finally {
            this.f13427d.release(acquire);
        }
    }
}
