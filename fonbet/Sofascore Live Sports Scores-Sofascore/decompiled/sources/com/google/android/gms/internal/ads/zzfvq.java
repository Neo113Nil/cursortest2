package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import defpackage.x3o;
import defpackage.x5n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfvq extends zzfvm {
    public final zzfvo a;
    public zzfxa d;
    public final String g;
    public final zzfwo b = new zzfwo();
    public boolean e = false;
    public boolean f = false;
    public zzfyb c = new zzfyb(null);

    public zzfvq(zzfvn zzfvnVar, zzfvo zzfvoVar, String str) {
        zzfxa zzfxbVar;
        this.a = zzfvoVar;
        this.g = str;
        zzfvp zzfvpVar = zzfvoVar.g;
        if (zzfvpVar == zzfvp.HTML || zzfvpVar == zzfvp.JAVASCRIPT) {
            WebView webView = zzfvoVar.b;
            zzfxbVar = new zzfxb(str);
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            zzfxbVar.b = new zzfyc(webView);
            this.d = zzfxbVar;
        } else {
            zzfxbVar = new zzfxe(str, Collections.unmodifiableMap(zzfvoVar.d));
            this.d = zzfxbVar;
        }
        zzfxbVar.a();
        zzfwk.c.a.add(this);
        zzfxa zzfxaVar = this.d;
        zzfxaVar.getClass();
        zzfwr zzfwrVar = zzfwr.a;
        WebView c = zzfxaVar.c();
        String str2 = zzfxaVar.a;
        JSONObject jSONObject = new JSONObject();
        zzfxg.b(jSONObject, "impressionOwner", zzfvnVar.a);
        zzfxg.b(jSONObject, "mediaEventsOwner", zzfvnVar.b);
        zzfxg.b(jSONObject, "creativeType", zzfvnVar.d);
        zzfxg.b(jSONObject, "impressionType", zzfvnVar.e);
        zzfxg.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(zzfvnVar.c));
        zzfwrVar.a(c, "init", jSONObject, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfvm
    public final void a(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        this.c = new zzfyb(view);
        zzfxa zzfxaVar = this.d;
        zzfxaVar.getClass();
        zzfxaVar.c = System.nanoTime();
        zzfxaVar.d = 1;
        Collection<zzfvq> unmodifiableCollection = Collections.unmodifiableCollection(zzfwk.c.a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (zzfvq zzfvqVar : unmodifiableCollection) {
            if (zzfvqVar != this && ((View) zzfvqVar.c.get()) == view) {
                zzfvqVar.c.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final void b() {
        if (this.f) {
            return;
        }
        this.c.clear();
        if (!this.f) {
            this.b.a.clear();
        }
        this.f = true;
        zzfxa zzfxaVar = this.d;
        zzfxaVar.getClass();
        zzfwr.a.a(zzfxaVar.c(), "finishSession", zzfxaVar.a);
        zzfwk zzfwkVar = zzfwk.c;
        ArrayList arrayList = zzfwkVar.a;
        ArrayList arrayList2 = zzfwkVar.b;
        boolean z = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z && arrayList2.size() <= 0) {
            zzfws a = zzfws.a();
            a.getClass();
            zzfxu zzfxuVar = zzfxu.f;
            zzfxuVar.getClass();
            Handler handler = zzfxu.h;
            if (handler != null) {
                handler.removeCallbacks(zzfxu.j);
                zzfxu.h = null;
            }
            zzfxuVar.a.clear();
            zzfxu.g.post(new x3o(zzfxuVar, 18));
            zzfwj zzfwjVar = zzfwj.d;
            zzfwjVar.a = false;
            zzfwjVar.c = null;
            zzfwg zzfwgVar = a.b;
            zzfwgVar.b.getContentResolver().unregisterContentObserver(zzfwgVar);
        }
        this.d.b();
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvm
    public final void c(View view) {
        if (this.f) {
            return;
        }
        this.b.a(view);
    }

    public final void d() {
        if (this.e || this.d == null) {
            return;
        }
        this.e = true;
        ArrayList arrayList = zzfwk.c.b;
        boolean z = arrayList.size() > 0;
        arrayList.add(this);
        if (!z) {
            zzfws a = zzfws.a();
            a.getClass();
            zzfwj zzfwjVar = zzfwj.d;
            zzfwjVar.c = a;
            zzfwjVar.a = true;
            boolean z2 = x5n.g().importance == 100 || zzfwjVar.a();
            zzfwjVar.b = z2;
            zzfwjVar.b(z2);
            zzfxu.f.getClass();
            zzfxu.b();
            zzfwg zzfwgVar = a.b;
            zzfwgVar.getClass();
            zzfwgVar.f.submit(new x3o(zzfwgVar, 16));
            zzfwgVar.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, zzfwgVar);
        }
        float f = zzfws.a().a;
        zzfxa zzfxaVar = this.d;
        zzfxaVar.getClass();
        zzfwr.a.a(zzfxaVar.c(), "setDeviceVolume", Float.valueOf(f), zzfxaVar.a);
        zzfxa zzfxaVar2 = this.d;
        Date date = zzfwi.e.a;
        zzfxaVar2.f(date != null ? (Date) date.clone() : null);
        this.d.d(this, this.a);
    }
}
