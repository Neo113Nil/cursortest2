package defpackage;

import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gmn implements bun {
    public final /* synthetic */ lnn a;

    public gmn(lnn lnnVar) {
        this.a = lnnVar;
    }

    @Override // defpackage.bun
    public final void zza() {
        zjo zjoVar = new zjo(new tf(2, 24, "IMA WebView encountered an error.", null), new Object());
        lnn lnnVar = this.a;
        lnnVar.d.v(zjoVar);
        lnnVar.f();
    }

    @Override // defpackage.bun
    public final void zzb(String str) {
        this.a.a.d(new lda(JavaScriptMessage$MsgChannel.webViewNavigationDetected, JavaScriptMessage$MsgType.webViewNavigationDetected, "*", z3p.a("url", str), null));
    }

    @Override // defpackage.bun
    public final void zzc() {
        lnn lnnVar = this.a;
        if (!lnnVar.q) {
            lnnVar.d.v(new zjo(new tf(2, 24, "IMA WebView is no longer available.", null), new Object()));
        }
        lnnVar.f();
    }
}
