package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cn0 extends BroadcastReceiver implements Runnable {
    public final lg6 a;
    public final Handler b;
    public final /* synthetic */ yih c;

    public cn0(yih yihVar, Handler handler, lg6 lg6Var) {
        this.c = yihVar;
        this.b = handler;
        this.a = lg6Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.b) {
            this.a.a.Q(-1, 3, false);
        }
    }
}
