package com.vungle.ads.internal.network;

import defpackage.i2g;
import defpackage.l62;
import defpackage.lof;
import defpackage.zdc;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j extends i2g {
    public final i2g a;
    public final l62 b;
    public IOException c;

    public j(i2g i2gVar) {
        i2gVar.getClass();
        this.a = i2gVar;
        this.b = new lof(new i(this, i2gVar.source()));
    }

    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // defpackage.i2g, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.i2g
    public final long contentLength() {
        return this.a.contentLength();
    }

    @Override // defpackage.i2g
    public final zdc contentType() {
        return this.a.contentType();
    }

    @Override // defpackage.i2g
    public final l62 source() {
        return this.b;
    }

    public final void a(IOException iOException) {
        this.c = iOException;
    }
}
