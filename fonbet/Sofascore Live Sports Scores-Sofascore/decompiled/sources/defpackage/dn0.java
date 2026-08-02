package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dn0 extends BroadcastReceiver {
    public final mg6 a;
    public final zqi b;
    public final /* synthetic */ en0 c;

    public dn0(en0 en0Var, zqi zqiVar, mg6 mg6Var) {
        this.c = en0Var;
        this.b = zqiVar;
        this.a = mg6Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.e(new y2(this, 16));
        }
    }
}
