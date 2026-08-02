package l4;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import c4.m;
import com.android.billingclient.api.l0;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.z2;
import g6.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s7.f1;
import s7.h;
import s7.j;
import s7.n0;
import s7.r0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f19359a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19360b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19361c;

    public e(ArrayList arrayList) {
        this.f19360b = new ArrayList();
        this.f19359a = 0L;
        this.f19361c = new ba.d("persistence");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y9.b bVar = (y9.b) it.next();
            if (bVar.b() > 0) {
                ((ArrayList) this.f19360b).add(bVar);
                this.f19359a += bVar.b();
            } else {
                try {
                    bVar.c();
                } catch (IOException unused) {
                    ((ba.d) this.f19361c).j("Failed to purge empty batch: " + bVar.f25740a.toString());
                }
            }
        }
    }

    public void a(a aVar, m mVar, Map map, long j) {
        io.sentry.android.replay.gestures.c cVar = (io.sentry.android.replay.gestures.c) this.f19361c;
        long j6 = cVar.f16043b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f16042a;
        if (j > j6) {
            Object remove = linkedHashMap.remove(aVar);
            if (remove != null) {
                cVar.f16044c = cVar.b() - cVar.c(aVar, remove);
                cVar.a(aVar, remove, null);
            }
            ((l0) this.f19360b).m(aVar, mVar, map, j);
            return;
        }
        d dVar = new d(mVar, map, j);
        Object put = linkedHashMap.put(aVar, dVar);
        cVar.f16044c = cVar.c(aVar, dVar) + cVar.b();
        if (put != null) {
            cVar.f16044c = cVar.b() - cVar.c(aVar, put);
            cVar.a(aVar, put, dVar);
        }
        cVar.d(cVar.f16043b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public List b() {
        ArrayList arrayList;
        j jVar = (j) this.f19361c;
        ArrayList arrayList2 = new ArrayList();
        String str = (String) this.f19360b;
        Cursor cursor = null;
        try {
            try {
                cursor = jVar.Y().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f19359a)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(0);
                        long j6 = cursor.getLong(3);
                        boolean z5 = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.f19359a) {
                            this.f19359a = j;
                        }
                        try {
                            z2 z2Var = (z2) r0.W(a3.z(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            z2Var.b();
                            ((a3) z2Var.f5041b).F(string);
                            long j10 = cursor.getLong(2);
                            z2Var.b();
                            ((a3) z2Var.f5041b).G(j10);
                            arrayList2.add(new h(j, j6, z5, (a3) z2Var.f()));
                        } catch (IOException e7) {
                            n0 n0Var = ((f1) jVar.f3328a).f22745f;
                            f1.m(n0Var);
                            n0Var.f22903f.c(n0.r(str), e7, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e9) {
                n0 n0Var2 = ((f1) jVar.f3328a).f22745f;
                f1.m(n0Var2);
                n0Var2.f22903f.c(n0.r(str), e9, "Data loss. Error querying raw events batch. appId");
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public e(j jVar, String str) {
        this.f19361c = jVar;
        v.e(str);
        this.f19360b = str;
        this.f19359a = -1L;
    }

    public e(j jVar, String str, long j) {
        this.f19361c = jVar;
        v.e(str);
        this.f19360b = str;
        this.f19359a = jVar.U("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public e(long j, l0 l0Var) {
        this.f19359a = j;
        this.f19360b = l0Var;
        this.f19361c = new io.sentry.android.replay.gestures.c(this, j);
    }
}
