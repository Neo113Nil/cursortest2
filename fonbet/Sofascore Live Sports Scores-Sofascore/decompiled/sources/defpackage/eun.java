package defpackage;

import com.google.android.gms.internal.ads.n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eun implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ eun(n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        n nVar = this.b;
        switch (i) {
            case 0:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                nVar.v0();
                break;
        }
    }
}
