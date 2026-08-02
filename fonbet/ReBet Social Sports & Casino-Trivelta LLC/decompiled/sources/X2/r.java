package X2;

import android.database.Cursor;
import androidx.room.A;
import androidx.room.G;
import androidx.room.w;
import androidx.work.impl.model.WorkTag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final w f13445a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.k f13446b;

    /* renamed from: c, reason: collision with root package name */
    public final G f13447c;

    public class a extends androidx.room.k {
        public a(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, WorkTag workTag) {
            kVar.P0(1, workTag.getTag());
            kVar.P0(2, workTag.getWorkSpecId());
        }
    }

    public class b extends G {
        public b(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public r(w wVar) {
        this.f13445a = wVar;
        this.f13446b = new a(wVar);
        this.f13447c = new b(wVar);
    }

    public static List d() {
        return Collections.EMPTY_LIST;
    }

    @Override // X2.q
    public List a(String str) {
        A r10 = A.r("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        r10.P0(1, str);
        this.f13445a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f13445a, r10, false, null);
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

    @Override // X2.q
    public void b(WorkTag workTag) {
        this.f13445a.assertNotSuspendingTransaction();
        this.f13445a.beginTransaction();
        try {
            this.f13446b.e(workTag);
            this.f13445a.setTransactionSuccessful();
        } finally {
            this.f13445a.endTransaction();
        }
    }
}
