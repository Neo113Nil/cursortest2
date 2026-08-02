package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t implements com.fyber.inneractive.sdk.network.f0 {
    public final /* synthetic */ u a;

    public t(u uVar) {
        this.a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.a("IAVideoContentLoader : Remote ui template callback onNetworkResult from cache: %s", Boolean.valueOf(z));
        if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            return;
        }
        u uVar = this.a;
        uVar.getClass();
        if (TextUtils.isEmpty(str) && z) {
            uVar.a(exc, "Fetched cached template is ".concat(str == null ? "null" : "empty"), true);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.g i = uVar.i();
        if (i == null) {
            uVar.a(null, "Flow Manager is null", z);
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = i.a;
        if (isEmpty) {
            boolean z2 = dVar.i;
            StringBuilder sb = new StringBuilder("Unknown error while receiving template: templateContent is: ");
            sb.append(TextUtils.isEmpty(str) ? "null or empty" : "not null and not empty");
            sb.append(" isFromCache: ");
            sb.append(z2);
            uVar.a(exc, sb.toString(), z2);
            return;
        }
        dVar.i = z;
        IAlog.a("%s : schedule UI load timeout task with delay: %d", "RemoteUIWebviewController", 10000);
        com.fyber.inneractive.sdk.util.r.b.postDelayed(dVar.k, Ua.s);
        try {
            dVar.b.loadData(str, "text/html", C.UTF8_NAME);
        } catch (Throwable th) {
            IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar.k);
            dVar.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, bf3.o(new StringBuilder("Unable load data: "), th), true, null);
        }
    }
}
