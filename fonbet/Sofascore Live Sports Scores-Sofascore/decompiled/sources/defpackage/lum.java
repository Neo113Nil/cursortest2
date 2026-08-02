package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lum {
    public final jwm b;
    public final iwm c;
    public final jtm j;
    public SQLiteStatement k;
    public volatile long l;
    public volatile long m;
    public volatile boolean n;
    public final ArrayList a = new ArrayList();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final AtomicInteger h = new AtomicInteger(0);
    public volatile AtomicInteger i = new AtomicInteger(0);

    public lum(jwm jwmVar, iwm iwmVar) {
        ydm qf;
        this.b = jwmVar;
        this.c = iwmVar;
        if (iwmVar.wh() && (qf = iwmVar.qf()) != null) {
            this.j = new jtm(jwmVar, iwmVar.oo(), qf);
        }
        if (jwmVar.b.qf() >= iwmVar.pcc()) {
            iwmVar.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        if (r10 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r10 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r10.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(sem semVar) {
        Cursor cursor;
        try {
            cursor = semVar.getReadableDatabase().query(this.c.oo(), new String[]{"count(*)"}, null, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int i = cursor.getInt(0);
                        try {
                            cursor.close();
                        } catch (Exception unused) {
                        }
                        return i;
                    }
                } catch (Throwable unused2) {
                    try {
                        jtm jtmVar = this.j;
                        if (jtmVar != null) {
                            jtmVar.b(10007, 1);
                        }
                    } finally {
                    }
                }
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r7.inTransaction() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        r7.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        if (r7.inTransaction() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(sem semVar) {
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f) {
            arrayList = new ArrayList(this.f);
            this.f.clear();
        }
        try {
            sQLiteDatabase = semVar.getWritableDatabase();
        } catch (Throwable unused) {
            sQLiteDatabase = null;
        }
        try {
            sQLiteDatabase.beginTransaction();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder("(");
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = (String) arrayList.get(i);
                if (i > 0) {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                sb.append("?");
            }
            sb.append(")");
            if (sQLiteDatabase.delete(this.c.oo(), "data_id in ".concat(String.valueOf(sb)), strArr) == 0) {
                hashSet.addAll(arrayList);
            }
            sQLiteDatabase.setTransactionSuccessful();
            arrayList.size();
            hashSet.size();
            hashSet.size();
        } catch (Throwable unused2) {
            try {
                jtm jtmVar = this.j;
                if (jtmVar != null) {
                    jtmVar.b(Sdk.SDKError.Reason.AD_NO_FILL_VALUE, 1);
                }
                if (sQLiteDatabase != null) {
                }
                synchronized (this.d) {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            this.d.remove((String) it.next());
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
    }

    public final void c(sem semVar, int i) {
        String str;
        String[] strArr;
        ArrayList arrayList;
        this.h.set(0);
        int i2 = 1;
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase readableDatabase = semVar.getReadableDatabase();
                int g = g();
                if (this.d.isEmpty()) {
                    str = null;
                    strArr = null;
                } else {
                    StringBuilder sb = new StringBuilder("data_id NOT IN (");
                    ArrayList arrayList2 = new ArrayList();
                    synchronized (this.d) {
                        try {
                            Iterator it = this.d.iterator();
                            while (it.hasNext()) {
                                String str2 = (String) it.next();
                                if (!arrayList2.isEmpty()) {
                                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                                }
                                sb.append("?");
                                arrayList2.add(str2);
                                if (arrayList2.size() >= g) {
                                    break;
                                }
                            }
                        } finally {
                        }
                    }
                    sb.append(")");
                    String sb2 = sb.toString();
                    String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                    Arrays.toString(strArr2);
                    str = sb2;
                    strArr = strArr2;
                }
                Cursor query = readableDatabase.query(this.c.oo(), null, str, strArr, null, null, "priority DESC, create_time DESC", String.valueOf(g * i * 2));
                if (query != null) {
                    try {
                        if (!query.moveToFirst()) {
                            query.close();
                            return;
                        }
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("data");
                        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("data_id");
                        int columnIndexOrThrow3 = query.getColumnIndexOrThrow(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                        int columnIndexOrThrow4 = query.getColumnIndexOrThrow("upload_retry_count");
                        ArrayList arrayList3 = new ArrayList();
                        int i3 = 0;
                        while (true) {
                            try {
                                String string = query.getString(columnIndexOrThrow2);
                                synchronized (this.d) {
                                    try {
                                        if (!this.d.contains(string)) {
                                            this.d.add(string);
                                            byte[] blob = query.getBlob(columnIndexOrThrow);
                                            eem oo = this.b.b.oo();
                                            if (oo != null) {
                                                blob = oo.sf(blob);
                                                jtm jtmVar = this.j;
                                                if (jtmVar != null) {
                                                    jtmVar.b(blob != null ? 7 : 8, i2);
                                                }
                                            }
                                            itm pcc = this.c.pcc(string, blob, query.getInt(columnIndexOrThrow3), query.getInt(columnIndexOrThrow4));
                                            if (pcc == null) {
                                                synchronized (this.d) {
                                                    this.d.remove(string);
                                                }
                                            } else {
                                                arrayList3.add(pcc);
                                                if (arrayList3.size() >= g) {
                                                    d(arrayList3, true, null);
                                                    i3++;
                                                    arrayList = new ArrayList();
                                                    if (i3 < i) {
                                                        arrayList3 = arrayList;
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            } catch (Exception unused) {
                                jtm jtmVar2 = this.j;
                                if (jtmVar2 != null) {
                                    jtmVar2.b(11, 1);
                                }
                            }
                            if (!query.moveToNext()) {
                                arrayList = arrayList3;
                                break;
                            }
                            i2 = 1;
                        }
                        if (!arrayList.isEmpty()) {
                            d(arrayList, false, null);
                        }
                    } catch (Throwable unused2) {
                        cursor = query;
                        try {
                            jtm jtmVar3 = this.j;
                            if (jtmVar3 != null) {
                                jtmVar3.b(10005, 1);
                            }
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused3) {
                                }
                            }
                            throw th;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (Throwable unused4) {
            }
        } catch (Exception unused5) {
        }
    }

    public final void d(ArrayList arrayList, boolean z, d1l d1lVar) {
        arrayList.size();
        this.l = SystemClock.elapsedRealtime();
        this.c.pcc(arrayList, new yih(this, z, d1lVar));
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(this.a.size());
        synchronized (this.a) {
            try {
                int size = this.a.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add((itm) this.a.get(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    itm itmVar = (itm) it.next();
                    if (this.d.contains(itmVar.wh())) {
                        itmVar.toString();
                        it.remove();
                    } else {
                        this.d.add(itmVar.wh());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        arrayList.size();
        if (arrayList.isEmpty()) {
            return;
        }
        d(arrayList, false, new d1l(this, 1));
    }

    public final void f(sem semVar) {
        ArrayList arrayList;
        synchronized (this.g) {
            arrayList = new ArrayList(this.g);
            this.g.clear();
        }
        try {
            SQLiteDatabase writableDatabase = semVar.getWritableDatabase();
            StringBuilder sb = new StringBuilder("(");
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = (String) arrayList.get(i);
                if (i > 0) {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                sb.append("?");
            }
            sb.append(")");
            writableDatabase.execSQL("UPDATE " + this.c.oo() + " SET upload_retry_count = upload_retry_count+1 WHERE data_id IN " + ((Object) sb), strArr);
            arrayList.size();
        } catch (Throwable unused) {
            jtm jtmVar = this.j;
            if (jtmVar != null) {
                jtmVar.b(10000, 1);
            }
        }
        synchronized (this.d) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.d.remove((String) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int g() {
        int e0 = (int) (aik.e0(true) * this.c.sf());
        if (e0 <= 0) {
            return 100;
        }
        return e0;
    }

    public final void h(sem semVar) {
        this.h.set(0);
        int g = g();
        int ceil = (int) Math.ceil((a(semVar) * 1.0f) / g);
        Objects.toString(this.c);
        for (int i = 0; i < ceil; i++) {
            int i2 = i * g;
            try {
                bem sf = this.b.b.sf();
                ExecutorService sf2 = sf != null ? sf.sf() : null;
                if (sf2 == null) {
                    sf2 = ktm.G();
                }
                sf2.submit(new tc0(this, semVar, i2));
            } catch (Exception unused) {
                jtm jtmVar = this.j;
                if (jtmVar != null) {
                    jtmVar.b(10, 1);
                }
            }
        }
    }
}
