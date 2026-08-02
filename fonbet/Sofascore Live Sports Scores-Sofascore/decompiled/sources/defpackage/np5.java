package defpackage;

import com.google.android.gms.ads.AdError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class np5 extends rz8 {
    public final f9a q;

    public np5(f9a f9aVar) {
        this.q = f9aVar;
    }

    @Override // defpackage.rz8
    public final void K() {
        this.q.onAdClicked();
    }

    @Override // defpackage.rz8
    public final void L() {
        this.q.onAdDismissedFullScreenContent();
    }

    @Override // defpackage.rz8
    public final void N(hdg hdgVar) {
        int ordinal = hdgVar.a.ordinal();
        String message = hdgVar.getMessage();
        if (message == null) {
            message = "";
        }
        this.q.onAdFailedToShowFullScreenContent(new AdError(ordinal, message, ""));
    }

    @Override // defpackage.rz8
    public final void P() {
        f9a f9aVar = this.q;
        f9aVar.onAdShowedFullScreenContent();
        f9aVar.onAdImpression();
    }
}
