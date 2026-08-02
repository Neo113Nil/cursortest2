package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import defpackage.mcp;
import defpackage.yuo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzxy {
    public final zzxo a;
    public final CopyOnWriteArrayList b;

    public zzxy() {
        this(new CopyOnWriteArrayList(), null);
    }

    public final void a(zzdu zzduVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            mcp mcpVar = (mcp) it.next();
            zzxz zzxzVar = mcpVar.b;
            Handler handler = mcpVar.a;
            yuo yuoVar = new yuo(12, zzduVar, zzxzVar);
            String str = zzfm.a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    yuoVar.run();
                } else {
                    handler.post(yuoVar);
                }
            }
        }
    }

    public zzxy(CopyOnWriteArrayList copyOnWriteArrayList, zzxo zzxoVar) {
        this.b = copyOnWriteArrayList;
        this.a = zzxoVar;
    }
}
