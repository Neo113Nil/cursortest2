package defpackage;

import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l8o implements orn {
    public final WebView a;
    public boolean b = false;
    public p03 c = null;

    public l8o(WebView webView) {
        this.a = webView;
    }

    @Override // defpackage.orn
    public final void b(lda ldaVar) {
        boolean z;
        int ordinal = ldaVar.d.ordinal();
        if (ordinal == 60) {
            z = true;
        } else if (ordinal != 61) {
            return;
        } else {
            z = false;
        }
        this.b = z;
    }
}
