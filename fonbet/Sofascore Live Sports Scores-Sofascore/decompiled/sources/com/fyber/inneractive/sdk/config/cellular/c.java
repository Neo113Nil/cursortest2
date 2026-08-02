package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c extends d {
    public final b d;

    public c(Context context) {
        super(context);
        this.d = new b(this.a, this);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.add(aVar);
            } catch (Throwable th) {
                IAlog.a("failed to add networkUpdateListener", th, new Object[0]);
            }
        }
        this.d.b();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(h hVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.remove(hVar);
            } catch (Throwable th) {
                IAlog.a("failed to remove networkUpdateListener", th, new Object[0]);
            }
        }
        this.d.c();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a() {
        this.d.a();
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.c = null;
        }
    }
}
