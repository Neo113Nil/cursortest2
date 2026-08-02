package defpackage;

import android.webkit.ValueCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ksn implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8p b;

    public /* synthetic */ ksn(n8p n8pVar, int i) {
        this.a = i;
        this.b = n8pVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = this.a;
        n8p n8pVar = this.b;
        switch (i) {
            case 0:
                n8pVar.d(b2p.k((String) obj));
                break;
            default:
                n8pVar.d(u1p.a);
                break;
        }
    }
}
