package com.fyber.inneractive.sdk.player.ui.remote;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.v;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d implements com.fyber.inneractive.sdk.web.remoteui.a, a {
    public com.fyber.inneractive.sdk.web.remoteui.a a;
    public final com.fyber.inneractive.sdk.web.remoteui.b b;
    public final t0 c;
    public final e d;
    public n e;
    public final String f;
    public boolean i;
    public com.fyber.inneractive.sdk.flow.g j;
    public boolean g = false;
    public boolean h = false;
    public final b k = new b(this);
    public final c l = new c(this);
    public boolean m = false;
    public boolean n = false;

    public d(Context context, t0 t0Var, String str) {
        this.c = t0Var;
        this.f = str;
        com.fyber.inneractive.sdk.web.remoteui.b bVar = new com.fyber.inneractive.sdk.web.remoteui.b();
        this.b = bVar;
        this.d = new e(this);
        bVar.setCommandHandler(this);
        bVar.setResultFailureListener(this);
        bVar.setCommandHandler(this);
        this.j = new com.fyber.inneractive.sdk.flow.g(context, true, t0Var != null ? t0Var.a : null, b(), null);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap hashMap) {
        g1 lastClickedLocation;
        e eVar;
        d dVar;
        com.fyber.inneractive.sdk.flow.g gVar;
        lastClickedLocation = this.b.getLastClickedLocation();
        eVar = this.d;
        eVar.getClass();
        str.getClass();
        switch (str) {
            case "clickSkip":
                eVar.a(6, lastClickedLocation);
                break;
            case "expandCollapseClick":
                eVar.a(5, lastClickedLocation);
                break;
            case "appInfoClick":
                eVar.a(10, lastClickedLocation);
                break;
            case "shouldSkipUpdateUi.true":
                d dVar2 = eVar.a;
                if (dVar2 != null) {
                    dVar2.m = true;
                    break;
                }
                break;
            case "onGeneralError":
                d dVar3 = eVar.a;
                if (dVar3 != null) {
                    dVar3.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_GENERAL_ERROR, (String) hashMap.get("error"), "true".equalsIgnoreCase((String) hashMap.get("shouldFailUi")), hashMap);
                    break;
                }
                break;
            case "ctaClick":
                eVar.a(3, lastClickedLocation);
                break;
            case "isSkipEnabled.false":
                d dVar4 = eVar.a;
                if (dVar4 != null) {
                    dVar4.n = false;
                    break;
                }
                break;
            case "clickMuteUnmute":
                eVar.a(1, lastClickedLocation);
                break;
            case "DOMLoaded":
                String str2 = eVar.c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                d dVar5 = eVar.a;
                if (dVar5 != null) {
                    dVar5.b.a(str2);
                }
                Iterator it = eVar.b.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) eVar.b.get((String) it.next());
                    if (!TextUtils.isEmpty(str3) && (dVar = eVar.a) != null) {
                        dVar.b.a(str3);
                    }
                }
                eVar.b.clear();
                d dVar6 = eVar.a;
                if (dVar6 != null) {
                    IAlog.a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    r.b.removeCallbacks(dVar6.k);
                    dVar6.g = false;
                    dVar6.b.setUiReady(true);
                    if (dVar6.b() != null) {
                        dVar6.b().I = true;
                    }
                    dVar6.b.setVisibility(0);
                    break;
                }
                break;
            case "adIdentifierClick":
                d dVar7 = eVar.a;
                if (dVar7 != null && (gVar = dVar7.j) != null) {
                    gVar.a();
                    break;
                }
                break;
            case "shouldSkipUpdateUi.false":
                d dVar8 = eVar.a;
                if (dVar8 != null) {
                    dVar8.m = false;
                    break;
                }
                break;
            case "isSkipEnabled.true":
                d dVar9 = eVar.a;
                if (dVar9 != null) {
                    dVar9.n = true;
                    break;
                }
                break;
            case "onVideoClick":
                eVar.a(7, lastClickedLocation);
                break;
            case "onResourceError":
                d dVar10 = eVar.a;
                if (dVar10 != null) {
                    dVar10.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_RESOURCE_ERROR, (String) hashMap.get("error"), true, hashMap);
                    break;
                }
                break;
            default:
                IAlog.a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        d dVar11 = eVar.a;
        if (dVar11 != null) {
            dVar11.b.a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }

    public final com.fyber.inneractive.sdk.response.e b() {
        t0 t0Var = this.c;
        if (t0Var != null) {
            return t0Var.b;
        }
        return null;
    }

    public final void a() {
        this.h = true;
        this.e = null;
        e eVar = this.d;
        eVar.b.clear();
        eVar.a = null;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.b.removeCallbacks(this.k);
        this.b.setVisibility(8);
        this.b.setUiReady(false);
        v.a(this.b);
        this.b.destroy();
        this.j = null;
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z, HashMap hashMap) {
        String str2;
        HashMap hashMap2;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.b.removeCallbacks(this.k);
        if (hashMap != null && hashMap.containsKey("failedURL")) {
            str2 = (String) hashMap.get("failedURL");
        } else {
            str2 = this.f;
        }
        String str3 = str2;
        if (z) {
            if (b() != null) {
                b().I = false;
            }
            a();
            t tVar = t.VAST_ERROR_DVC_FAILURE;
            t0 t0Var = this.c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar, bVar, t0Var != null ? t0Var.a : null, b(), str, str3, Boolean.valueOf(this.i));
            hashMap2 = hashMap;
        } else {
            t tVar2 = t.VAST_ERROR_DVC_FAILURE;
            String name = bVar.name();
            t0 t0Var2 = this.c;
            hashMap2 = hashMap;
            com.fyber.inneractive.sdk.network.events.a.a(tVar2, name, str3, t0Var2 != null ? t0Var2.a : null, b(), hashMap2, Boolean.valueOf(this.i));
        }
        com.fyber.inneractive.sdk.web.remoteui.a aVar = this.a;
        if (aVar != null) {
            aVar.a(bVar, str, z, hashMap2);
        }
    }
}
