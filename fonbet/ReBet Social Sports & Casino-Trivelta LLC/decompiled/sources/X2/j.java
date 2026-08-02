package X2;

import android.database.Cursor;
import androidx.room.A;
import androidx.room.w;
import androidx.work.impl.model.WorkName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final w f13433a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.k f13434b;

    public class a extends androidx.room.k {
        public a(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, WorkName workName) {
            kVar.P0(1, workName.getName());
            kVar.P0(2, workName.getWorkSpecId());
        }
    }

    public j(w wVar) {
        this.f13433a = wVar;
        this.f13434b = new a(wVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // X2.i
    public void a(WorkName workName) {
        this.f13433a.assertNotSuspendingTransaction();
        this.f13433a.beginTransaction();
        try {
            this.f13434b.e(workName);
            this.f13433a.setTransactionSuccessful();
        } finally {
            this.f13433a.endTransaction();
        }
    }

    @Override // X2.i
    public List b(String str) {
        A r10 = A.r("SELECT name FROM workname WHERE work_spec_id=?", 1);
        r10.P0(1, str);
        this.f13433a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f13433a, r10, false, null);
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
}
