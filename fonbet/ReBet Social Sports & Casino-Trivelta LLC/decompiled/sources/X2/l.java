package X2;

import androidx.room.G;
import androidx.room.w;
import androidx.work.impl.model.WorkProgress;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final w f13436a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.k f13437b;

    /* renamed from: c, reason: collision with root package name */
    public final G f13438c;

    /* renamed from: d, reason: collision with root package name */
    public final G f13439d;

    public class a extends androidx.room.k {
        public a(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, WorkProgress workProgress) {
            kVar.P0(1, workProgress.getWorkSpecId());
            kVar.j1(2, androidx.work.b.g(workProgress.getProgress()));
        }
    }

    public class b extends G {
        public b(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends G {
        public c(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public l(w wVar) {
        this.f13436a = wVar;
        this.f13437b = new a(wVar);
        this.f13438c = new b(wVar);
        this.f13439d = new c(wVar);
    }

    public static List d() {
        return Collections.EMPTY_LIST;
    }

    @Override // X2.k
    public void a(String str) {
        this.f13436a.assertNotSuspendingTransaction();
        E2.k acquire = this.f13438c.acquire();
        acquire.P0(1, str);
        try {
            this.f13436a.beginTransaction();
            try {
                acquire.G();
                this.f13436a.setTransactionSuccessful();
            } finally {
                this.f13436a.endTransaction();
            }
        } finally {
            this.f13438c.release(acquire);
        }
    }

    @Override // X2.k
    public void b() {
        this.f13436a.assertNotSuspendingTransaction();
        E2.k acquire = this.f13439d.acquire();
        try {
            this.f13436a.beginTransaction();
            try {
                acquire.G();
                this.f13436a.setTransactionSuccessful();
            } finally {
                this.f13436a.endTransaction();
            }
        } finally {
            this.f13439d.release(acquire);
        }
    }

    @Override // X2.k
    public void c(WorkProgress workProgress) {
        this.f13436a.assertNotSuspendingTransaction();
        this.f13436a.beginTransaction();
        try {
            this.f13437b.e(workProgress);
            this.f13436a.setTransactionSuccessful();
        } finally {
            this.f13436a.endTransaction();
        }
    }
}
