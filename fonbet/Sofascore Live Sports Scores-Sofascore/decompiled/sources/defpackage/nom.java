package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.blaze.blazesdk.features.videos.models.local.VideoViewed;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nom extends s9m {
    public final k6g a;
    public final hcm b;
    public final tfm c;
    public final thm d;
    public final njm e;

    public nom(k6g k6gVar) {
        this.a = k6gVar;
        this.b = new hcm(k6gVar);
        this.c = new tfm(k6gVar);
        this.d = new thm(k6gVar);
        this.e = new njm(k6gVar);
        new mlm(k6gVar);
        new anm(k6gVar);
    }

    @Override // defpackage.s9m
    public final int a(String str) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        tfm tfmVar = this.c;
        mni a = tfmVar.a();
        a.q(1, 1L);
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
            tfmVar.m(a);
        }
    }

    @Override // defpackage.s9m
    public final int b(String str, float f) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        thm thmVar = this.d;
        mni a = thmVar.a();
        a.J0(f, 1);
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
            thmVar.m(a);
        }
    }

    @Override // defpackage.s9m
    public final long c(VideoViewed videoViewed) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        k6gVar.beginTransaction();
        try {
            long z = this.b.z(videoViewed);
            k6gVar.setTransactionSuccessful();
            return z;
        } finally {
            k6gVar.endTransaction();
        }
    }

    @Override // defpackage.s9m
    public final ArrayList d(ArrayList arrayList) {
        StringBuilder q = fc6.q("SELECT * FROM videos_viewed WHERE video_id IN (");
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
            int F = xw3.F(query, "video_id");
            int F2 = xw3.F(query, "is_synced");
            int F3 = xw3.F(query, "last_viewed_ms");
            int F4 = xw3.F(query, "is_read");
            ArrayList arrayList2 = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.isNull(F) ? null : query.getString(F);
                boolean z = false;
                boolean z2 = query.getInt(F2) != 0;
                float f = query.getFloat(F3);
                if (query.getInt(F4) != 0) {
                    z = true;
                }
                arrayList2.add(new VideoViewed(string, z2, f, z));
            }
            return arrayList2;
        } finally {
            query.close();
            e.release();
        }
    }

    @Override // defpackage.s9m
    public final void e() {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        njm njmVar = this.e;
        mni a = njmVar.a();
        k6gVar.beginTransaction();
        try {
            a.F();
            k6gVar.setTransactionSuccessful();
        } finally {
            k6gVar.endTransaction();
            njmVar.m(a);
        }
    }
}
