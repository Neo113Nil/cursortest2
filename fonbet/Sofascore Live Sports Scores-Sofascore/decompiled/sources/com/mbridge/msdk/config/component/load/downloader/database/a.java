package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URL;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {
    private final d a;
    private final Handler b;
    private final String c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;
    private volatile SQLiteDatabase d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    public class RunnableC1235a implements Runnable {
        final /* synthetic */ c.a a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        public RunnableC1235a(c.a aVar, String str, String str2) {
            this.a = aVar;
            this.b = str;
            this.c = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Cursor cursor;
            c.a aVar;
            c.a aVar2;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d)) {
                a aVar3 = a.this;
                aVar3.d = aVar3.a.getWritableDatabase();
            }
            com.mbridge.msdk.config.component.load.downloader.database.b bVar = null;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d) || !a.this.d.isOpen()) {
                if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.a)) {
                    this.a.a(null);
                    return;
                }
                return;
            }
            try {
                String str = this.b;
                if (TextUtils.isEmpty(str)) {
                    try {
                        URL url = new URL(this.c);
                        str = url.getProtocol() + "://" + url.getHost() + url.getPath();
                    } catch (Throwable th) {
                        q0.b(IDatabaseHelper.TAG, th.getMessage());
                    }
                }
                Cursor rawQuery = a.this.d.rawQuery("SELECT * FROM " + a.this.c + " WHERE cacheKey = ? AND status = 1 LIMIT 1", new String[]{str});
                if (rawQuery != null) {
                    try {
                        if (rawQuery.moveToFirst()) {
                            bVar = com.mbridge.msdk.config.component.load.downloader.database.b.a(rawQuery);
                        }
                    } catch (Exception e) {
                        cursor = rawQuery;
                        e = e;
                        try {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            aVar2 = this.a;
                            if (aVar2 == null) {
                                return;
                            }
                            aVar2.a(bVar);
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            aVar = this.a;
                            if (aVar != null) {
                                aVar.a(null);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        cursor = rawQuery;
                        th = th3;
                        if (cursor != null) {
                        }
                        aVar = this.a;
                        if (aVar != null) {
                        }
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                aVar2 = this.a;
                if (aVar2 == null) {
                    return;
                }
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
            aVar2.a(bVar);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b a;

        public b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d)) {
                a aVar = a.this;
                aVar.d = aVar.a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d) || !a.this.d.isOpen()) {
                return;
            }
            try {
                try {
                    a.this.d.beginTransaction();
                    a.this.d.insertWithOnConflict(a.this.c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.a), 4);
                    a.this.d.setTransactionSuccessful();
                } catch (Exception e) {
                    q0.b(IDatabaseHelper.TAG, e.getMessage());
                    try {
                        if (a.this.d.inTransaction()) {
                            a.this.d.endTransaction();
                        }
                    } catch (Throwable th) {
                        q0.b(IDatabaseHelper.TAG, th.getMessage());
                    }
                }
            } finally {
                try {
                    if (a.this.d.inTransaction()) {
                        a.this.d.endTransaction();
                    }
                } catch (Throwable th2) {
                    q0.b(IDatabaseHelper.TAG, th2.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b a;

        public c(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d)) {
                a aVar = a.this;
                aVar.d = aVar.a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.d) || !a.this.d.isOpen()) {
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.a.b())) {
                    a.this.d.update(a.this.c, com.mbridge.msdk.config.component.load.downloader.database.b.b(this.a), "cacheKey = ? ", new String[]{this.a.b()});
                } else {
                    if (TextUtils.isEmpty(this.a.f())) {
                        return;
                    }
                    a.this.d.update(a.this.c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.a), "originalURL = ? ", new String[]{this.a.f()});
                }
            } catch (Exception e) {
                q0.b(IDatabaseHelper.TAG, e.getMessage());
            }
        }
    }

    public a(Handler handler, d dVar) {
        this.b = handler;
        this.a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, c.a aVar) {
        this.b.post(new RunnableC1235a(aVar, str2, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.b.post(new c(bVar));
    }
}
