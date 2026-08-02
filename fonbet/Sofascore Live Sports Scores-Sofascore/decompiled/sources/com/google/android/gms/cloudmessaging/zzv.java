package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import defpackage.b1p;
import defpackage.s3p;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzv {
    public static zzv e;
    public final Context a;
    public final ScheduledExecutorService b;
    public b1p c = new b1p(this);
    public int d = 1;

    public zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized zzv a(Context context) {
        zzv zzvVar;
        synchronized (zzv.class) {
            zzvVar = e;
            if (zzvVar == null) {
                zzvVar = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
                e = zzvVar;
            }
        }
        return zzvVar;
    }

    public final synchronized Task b(s3p s3pVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(s3pVar.toString());
            }
            if (!this.c.a(s3pVar)) {
                b1p b1pVar = new b1p(this);
                this.c = b1pVar;
                b1pVar.a(s3pVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return s3pVar.b.getTask();
    }
}
