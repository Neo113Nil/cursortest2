package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v7e implements r7e {
    public final /* synthetic */ InitializationCompleteCallback a;

    public v7e(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }

    @Override // defpackage.r7e
    public final void a(AdError adError) {
        adError.toString();
        this.a.onInitializationFailed(adError.getMessage());
    }

    @Override // defpackage.r7e
    public final void b() {
        this.a.onInitializationSucceeded();
    }
}
