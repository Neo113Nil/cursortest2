package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class K6 extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f12466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L6 f12467b;

    public K6(L6 l6, X4 x42) {
        this.f12467b = l6;
        this.f12466a = x42;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f12467b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f12467b.j.iterator();
            while (it2.hasNext()) {
                ((S8) it2.next()).a(arrayList2);
            }
            ((C0273k5) this.f12466a.f13156p).e();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i5;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (L6.a(this.f12467b)) {
                            wait();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f12467b.f12512e) {
                arrayList = new ArrayList(this.f12467b.f12513f);
                this.f12467b.f12513f.clear();
            }
            L6 l6 = this.f12467b;
            l6.getClass();
            if (!arrayList.isEmpty()) {
                long j = ((C0285kh) l6.f12515h.f13151k.a()).f14141v;
                l6.f12509b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = l6.f12510c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                l6.f12516i.incrementAndGet();
                                l6.a(contentValues, "Event saved to db");
                            }
                            if (l6.f12516i.get() > j) {
                                i5 = l6.a(writableDatabase);
                                l6.f12516i.addAndGet(-i5);
                            } else {
                                i5 = 0;
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (i5 != 0) {
                                Iterator it2 = l6.j.iterator();
                                while (it2.hasNext()) {
                                    ((S8) it2.next()).a();
                                }
                            }
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            l6.f12509b.unlock();
                            a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                l6.f12509b.unlock();
            }
            a(arrayList);
        }
    }
}
