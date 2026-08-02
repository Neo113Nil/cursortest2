package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.blaze.blazesdk.features.moments.models.local.MomentViewed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kmm extends i9m {
    public final k6g a;
    public final ubm b;
    public final ahm c;
    public final fp4 d;

    public kmm(k6g k6gVar) {
        this.a = k6gVar;
        this.b = new ubm(k6gVar);
        this.c = new ahm(k6gVar);
        this.d = new fp4(12, new zim(k6gVar), new nkm(k6gVar));
    }

    @Override // defpackage.i9m
    public final long a(MomentViewed momentViewed) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        k6gVar.beginTransaction();
        try {
            long z = this.b.z(momentViewed);
            k6gVar.setTransactionSuccessful();
            return z;
        } finally {
            k6gVar.endTransaction();
        }
    }

    @Override // defpackage.i9m
    public final xbb b(List list) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        k6gVar.beginTransaction();
        try {
            xbb N = this.d.N(list);
            k6gVar.setTransactionSuccessful();
            return N;
        } finally {
            k6gVar.endTransaction();
        }
    }

    @Override // defpackage.i9m
    public final ArrayList c(ArrayList arrayList) {
        StringBuilder q = fc6.q("SELECT moment_id FROM moments_viewed WHERE moment_id IN (");
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

    @Override // defpackage.i9m
    public final void d() {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        ahm ahmVar = this.c;
        mni a = ahmVar.a();
        k6gVar.beginTransaction();
        try {
            a.F();
            k6gVar.setTransactionSuccessful();
        } finally {
            k6gVar.endTransaction();
            ahmVar.m(a);
        }
    }

    @Override // defpackage.i9m
    public final int e() {
        r6g e = r6g.e(0, "SELECT COUNT(moment_id) FROM moments_viewed WHERE is_synced == 0");
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

    @Override // defpackage.i9m
    public final ArrayList f() {
        r6g e = r6g.e(0, "SELECT * FROM moments_viewed WHERE is_synced == 0");
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        Cursor query = k6gVar.query(e, (CancellationSignal) null);
        try {
            int F = xw3.F(query, "moment_id");
            int F2 = xw3.F(query, "is_synced");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new MomentViewed(query.isNull(F) ? null : query.getString(F), query.getInt(F2) != 0));
            }
            return arrayList;
        } finally {
            query.close();
            e.release();
        }
    }
}
