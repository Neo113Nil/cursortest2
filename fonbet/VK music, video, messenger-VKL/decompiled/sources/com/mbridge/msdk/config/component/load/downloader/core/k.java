package com.mbridge.msdk.config.component.load.downloader.core;

import java.io.File;

/* compiled from: FindFileFromCache.java */
/* loaded from: classes13.dex */
class k implements m {
    private final com.mbridge.msdk.config.component.load.downloader.database.c a;
    private final String b;
    private final com.mbridge.msdk.config.component.load.downloader.database.b c;
    private final d d;
    private com.mbridge.msdk.config.component.load.downloader.b e;

    private k(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.d = dVar;
        this.c = bVar;
        this.a = cVar;
        this.b = str;
        this.e = bVar2;
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, String str, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new k(dVar, bVar, cVar, str, bVar2);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.c)) {
            return null;
        }
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        File file = new File(this.e.h());
        if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(file)) {
            this.d.a(0L);
            cVar.b(false);
            return cVar;
        }
        long c = com.mbridge.msdk.config.component.load.downloader.resource.a.a().c(file);
        long k = this.c.k();
        if (k > 0 && c != k) {
            a(cVar, file);
            return cVar;
        }
        this.d.b(k);
        this.d.a(k != 0 ? c : this.c.g());
        cVar.b(a(c));
        return cVar;
    }

    private void a(com.mbridge.msdk.config.component.load.downloader.c cVar, File file) {
        long length = file.length();
        long lastModified = file.lastModified();
        this.d.b(this.c.k());
        this.d.a(file.length());
        l.c().b().a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.c.f(), file.getAbsolutePath(), this.c.d(), this.c.n(), lastModified, this.c.k(), this.c.g(), this.c.e(), this.c.c(), this.c.j(), this.c.h(), this.c.b(), this.c.a()), this.e.h());
        cVar.b(a(length));
    }

    private boolean a(long j) {
        return com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.c.k(), j) >= this.e.e();
    }
}
