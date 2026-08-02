package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbib {
    public zzbhq a;
    public boolean b;
    public final Context c;
    public final Object d = new Object();

    public zzbib(Context context) {
        this.c = context;
    }

    public final /* synthetic */ void a() {
        synchronized (this.d) {
            try {
                zzbhq zzbhqVar = this.a;
                if (zzbhqVar == null) {
                    return;
                }
                zzbhqVar.disconnect();
                this.a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
