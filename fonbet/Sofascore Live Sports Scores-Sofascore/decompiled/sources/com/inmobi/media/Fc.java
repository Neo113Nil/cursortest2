package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.ljg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fc extends BroadcastReceiver implements InterfaceC3598mc {
    public final String a;
    public final /* synthetic */ Jc b;

    public Fc(Jc jc, String str) {
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
        N3.a(context, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            InterfaceC3880x9 interfaceC3880x9 = this.b.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("MraidMediaProcessor", ljg.j(intExtra, "Ringer mode action changed: "));
            }
            this.b.a(this.a, 2 != intExtra);
        }
    }
}
