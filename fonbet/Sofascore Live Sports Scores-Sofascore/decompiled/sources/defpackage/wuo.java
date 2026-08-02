package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wuo extends BroadcastReceiver {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ z9h c;
    public final /* synthetic */ muo d;
    public final /* synthetic */ Executor e;

    public wuo(AtomicBoolean atomicBoolean, Context context, z9h z9hVar, muo muoVar, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = z9hVar;
        this.d = muoVar;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException unused) {
            }
            z9h z9hVar = this.c;
            muo muoVar = this.d;
            Executor executor = this.e;
            v1k v1kVar = new v1k();
            v1kVar.i = new u1k(v1kVar, muoVar);
            executor.execute(v1kVar);
            z9hVar.n(v1kVar);
        }
    }
}
