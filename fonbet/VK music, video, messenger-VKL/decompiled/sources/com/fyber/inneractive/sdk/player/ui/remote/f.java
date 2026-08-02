package com.fyber.inneractive.sdk.player.ui.remote;

import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.player.ui.o;
import com.fyber.inneractive.sdk.player.ui.s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class f implements com.fyber.inneractive.sdk.web.remoteui.a {
    public s a;
    public boolean h;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean i = false;
    public boolean j = false;
    public m k = m.NONE;
    public String l = "";

    public f(o oVar) {
        this.a = null;
        this.h = false;
        this.a = oVar;
        this.h = oVar.I;
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z, HashMap hashMap) {
        s sVar = this.a;
        if (sVar == null) {
            IAlog.a("%s: showFallback: fallback won't be displayed because it is null", "RemoteUiFallbackHandler");
            return;
        }
        sVar.g(this.b);
        this.a.d(this.i);
        this.a.f(this.f);
        this.a.a(this.e, this.k);
        this.a.c(this.h);
        this.a.a(this.j, this.l);
        this.a.b(this.g);
        this.a.e(this.c);
        this.a.a(this.d);
    }
}
