package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.ljg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ec extends BroadcastReceiver implements InterfaceC3598mc {
    public final String a;
    public final /* synthetic */ Jc b;

    public Ec(Jc jc, String str) {
        str.getClass();
        this.b = jc;
        this.a = str;
    }

    @Override // com.inmobi.media.InterfaceC3598mc
    public final void a() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        context.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.InterfaceC3598mc
    public final void b() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        N3.a(context, this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("state", 0);
            InterfaceC3880x9 interfaceC3880x9 = this.b.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("MraidMediaProcessor", ljg.j(intExtra, "Headphone plugged state changed: "));
            }
            this.b.b(this.a, 1 == intExtra);
        }
    }
}
