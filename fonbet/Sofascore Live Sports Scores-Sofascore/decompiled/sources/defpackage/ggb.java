package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.auth.api.signin.internal.zbc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ggb implements skd {
    public final ewm a;
    public boolean b = false;

    public ggb(zbc zbcVar, ewm ewmVar) {
        this.a = ewmVar;
    }

    @Override // defpackage.skd
    public final void h(Object obj) {
        this.b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.a.b;
        signInHubActivity.setResult(signInHubActivity.k, signInHubActivity.l);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.a.toString();
    }
}
