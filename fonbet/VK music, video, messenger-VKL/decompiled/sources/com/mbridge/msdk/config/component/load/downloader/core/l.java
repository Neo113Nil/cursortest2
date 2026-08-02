package com.mbridge.msdk.config.component.load.downloader.core;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.h5s;

/* compiled from: GlobalComponent.java */
/* loaded from: classes13.dex */
public final class l {
    private static volatile l e;
    private int a = 4096;
    private com.mbridge.msdk.config.component.load.downloader.d b;
    private com.mbridge.msdk.config.component.load.downloader.database.c c;
    private volatile v d;

    /* compiled from: GlobalComponent.java */
    public class a implements com.mbridge.msdk.config.component.load.downloader.database.d {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.d
        public SQLiteDatabase getWritableDatabase() {
            return com.mbridge.msdk.config.component.database.a.a().a(true);
        }
    }

    private l() {
    }

    public static l c() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(e)) {
            synchronized (l.class) {
                try {
                    if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(e)) {
                        e = new l();
                    }
                } finally {
                }
            }
        }
        return e;
    }

    private void e() {
        this.c = new com.mbridge.msdk.config.component.load.downloader.database.a(new Handler(h5s.a("mb_db_thread").getLooper()), new a());
    }

    public int a() {
        return this.a;
    }

    public com.mbridge.msdk.config.component.load.downloader.database.c b() {
        return this.c;
    }

    public v d() {
        if (this.d == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(w.HTTP_1_1);
            com.mbridge.msdk.thrid.okhttp.m mVar = new com.mbridge.msdk.thrid.okhttp.m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
            mVar.a(this.b.f());
            mVar.b(this.b.g());
            v.b bVar = new v.b();
            long a2 = this.b.a();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.d = bVar.b(a2, timeUnit).d(this.b.a(), timeUnit).e(this.b.d(), timeUnit).a(mVar).c(this.b.b(), timeUnit).b(true).a(new com.mbridge.msdk.thrid.okhttp.i(32, 5L, TimeUnit.MINUTES)).a(arrayList).a();
        }
        return this.d;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.d dVar) {
        this.b = dVar;
        e();
    }
}
