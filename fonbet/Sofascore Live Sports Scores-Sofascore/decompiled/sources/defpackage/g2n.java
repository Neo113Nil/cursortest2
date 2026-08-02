package defpackage;

import com.google.android.gms.common.api.Api;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class g2n implements Runnable {
    public final /* synthetic */ h2n a;

    public g2n(h2n h2nVar) {
        this.a = h2nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client = this.a.a.b;
        client.disconnect(client.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
