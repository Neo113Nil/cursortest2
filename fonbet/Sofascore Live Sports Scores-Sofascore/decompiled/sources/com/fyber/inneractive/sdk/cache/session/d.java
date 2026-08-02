package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.util.o;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
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
                com.fyber.inneractive.sdk.cache.session.enums.a aVar2 = com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION;
                e eVar = this.c;
                if (aVar != aVar2) {
                    g gVar = (g) eVar.a.a.get(this.b);
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
                    eVar.a = new i();
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
