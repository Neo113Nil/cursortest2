package com.google.android.gms.internal.cast;

import android.content.Context;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.ShowFirstParty;
import defpackage.p03;
import defpackage.tc0;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzj {
    public static final Logger k = new Logger("ClientCastAnalytics", null);
    public static boolean l = true;
    public final Context a;
    public final SessionManager b;
    public final zzce c;
    public final zzax d;
    public Long f;
    public p03 h;
    public zzcn i;
    public int j = 1;
    public final String e = UUID.randomUUID().toString();
    public final ExecutorService g = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public zzj(Context context, com.google.android.gms.cast.internal.zzn zznVar, SessionManager sessionManager, zzce zzceVar, zzax zzaxVar) {
        this.a = context;
        this.b = sessionManager;
        this.c = zzceVar;
        this.d = zzaxVar;
    }

    public final void a(zzqr zzqrVar, int i) {
        this.g.execute(new tc0(this, zzqrVar, i, 8));
    }
}
