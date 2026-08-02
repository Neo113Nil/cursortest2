package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qyk implements nyk {
    public final /* synthetic */ InitializationCompleteCallback a;

    public qyk(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }

    @Override // defpackage.nyk
    public final void a(AdError adError) {
        adError.toString();
        this.a.onInitializationFailed(adError.toString());
    }

    @Override // defpackage.nyk
    public final void b() {
        this.a.onInitializationSucceeded();
    }
}
