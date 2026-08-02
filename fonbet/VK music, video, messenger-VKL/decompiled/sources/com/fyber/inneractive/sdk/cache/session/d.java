package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.util.o;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;

/* loaded from: classes12.dex */
public final class d implements Runnable {
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a a;
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.c b;
    public final /* synthetic */ e c;

    public d(e eVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        this.c = eVar;
        this.a = aVar;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.c) {
            try {
                com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.a;
                if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                    g gVar = (g) this.c.a.a.get(this.b);
                    if (gVar != null) {
                        int i = f.a[aVar.ordinal()];
                        if (i == 1) {
                            gVar.b++;
                        } else if (i == 2) {
                            gVar.c++;
                        } else if (i == 3) {
                            gVar.a++;
                        }
                    }
                } else {
                    this.c.a = new i();
                }
                try {
                    o.a(o.a, e.a(this.c).toString().getBytes(C.UTF8_NAME));
                } catch (UnsupportedEncodingException unused) {
                }
                this.c.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
