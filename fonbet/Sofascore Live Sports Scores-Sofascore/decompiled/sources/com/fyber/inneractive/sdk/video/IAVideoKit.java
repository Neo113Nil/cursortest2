package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.factories.h;
import com.fyber.inneractive.sdk.factories.i;
import com.fyber.inneractive.sdk.player.cache.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s;
import com.fyber.inneractive.sdk.util.w;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class IAVideoKit extends BroadcastReceiver {
    private static final w sProvider = new a();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        w wVar = sProvider;
        IAConfigManager.N.G.put(wVar.b(), wVar);
        n nVar = n.f;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            nVar.getClass();
            IAlog.f("context is null, would not start the video cache.", new Object[0]);
        } else if (!nVar.c || !s.a()) {
            nVar.a = applicationContext;
            new Thread(nVar.e, "VideoCache").start();
        }
        IAlog.a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.factories.d.a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST, new b());
        i iVar = h.a;
        iVar.a.add(new c());
        com.fyber.inneractive.sdk.factories.c cVar = com.fyber.inneractive.sdk.factories.b.a;
        cVar.a.add(new d());
    }
}
