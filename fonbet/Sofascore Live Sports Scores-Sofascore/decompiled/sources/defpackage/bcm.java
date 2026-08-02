package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.blaze.blazesdk.features.stories.models.local.StoryPageStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bcm extends trl {
    public final k6g a;
    public final uvl b;
    public final vzl c;
    public final o3m d;
    public final fp4 e;

    public bcm(k6g k6gVar) {
        this.a = k6gVar;
        this.b = new uvl(k6gVar);
        this.c = new vzl(k6gVar);
        this.d = new o3m(k6gVar);
        this.e = new fp4(12, new t6m(k6gVar), new n9m(k6gVar));
    }

    @Override // defpackage.trl
    public final int a(String str, String str2) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        vzl vzlVar = this.c;
        mni a = vzlVar.a();
        if (str2 == null) {
            a.s(1);
        } else {
            a.m0(1, str2);
        }
        if (str == null) {
            a.s(2);
        } else {
            a.m0(2, str);
        }
        k6gVar.beginTransaction();
        try {
            int F = a.F();
            k6gVar.setTransactionSuccessful();
            return F;
        } finally {
            k6gVar.endTransaction();
            vzlVar.m(a);
        }
    }

    @Override // defpackage.trl
    public final long b(StoryPageStatus storyPageStatus) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        k6gVar.beginTransaction();
        try {
            long z = this.b.z(storyPageStatus);
            k6gVar.setTransactionSuccessful();
            return z;
        } finally {
            k6gVar.endTransaction();
        }
    }

    @Override // defpackage.trl
    public final xbb c(List list) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        k6gVar.beginTransaction();
        try {
            xbb N = this.e.N(list);
            k6gVar.setTransactionSuccessful();
            return N;
        } finally {
            k6gVar.endTransaction();
        }
    }

    @Override // defpackage.trl
    public final ArrayList d(ArrayList arrayList) {
        StringBuilder q = fc6.q("SELECT page_id FROM stories_pages_status WHERE page_id IN (");
        int size = arrayList.size();
        pea.m(size, q);
        q.append(")");
        r6g e = r6g.e(size, q.toString());
        Iterator it = arrayList.iterator();
        int i = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                e.s(i);
            } else {
                e.m0(i, str);
            }
            i++;
        }
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        Cursor query = k6gVar.query(e, (CancellationSignal) null);
        try {
            ArrayList arrayList2 = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList2.add(query.isNull(0) ? null : query.getString(0));
            }
            return arrayList2;
        } finally {
            query.close();
            e.release();
        }
    }

    @Override // defpackage.trl
    public final void e() {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        o3m o3mVar = this.d;
        mni a = o3mVar.a();
        k6gVar.beginTransaction();
        try {
            a.F();
            k6gVar.setTransactionSuccessful();
        } finally {
            k6gVar.endTransaction();
            o3mVar.m(a);
        }
    }

    @Override // defpackage.trl
    public final int f() {
        r6g e = r6g.e(0, "SELECT COUNT(page_id) FROM stories_pages_status WHERE is_synced == 0");
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        Cursor query = k6gVar.query(e, (CancellationSignal) null);
        try {
            return query.moveToFirst() ? query.getInt(0) : 0;
        } finally {
            query.close();
            e.release();
        }
    }

    @Override // defpackage.trl
    public final ArrayList g() {
        r6g e = r6g.e(0, "SELECT * FROM stories_pages_status WHERE is_synced == 0");
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        Cursor query = k6gVar.query(e, (CancellationSignal) null);
        try {
            int F = xw3.F(query, "page_id");
            int F2 = xw3.F(query, "story_id");
            int F3 = xw3.F(query, "is_synced");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new StoryPageStatus(query.isNull(F) ? null : query.getString(F), query.isNull(F2) ? null : query.getString(F2), query.getInt(F3) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            e.release();
        }
    }
}
