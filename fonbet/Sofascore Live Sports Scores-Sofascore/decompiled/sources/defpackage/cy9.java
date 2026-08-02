package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cy9 implements yx9 {
    public final /* synthetic */ InitializationCompleteCallback a;

    public cy9(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }

    @Override // defpackage.yx9
    public final void a(AdError adError) {
        this.a.onInitializationFailed(adError.toString());
    }

    @Override // defpackage.yx9
    public final void b() {
        this.a.onInitializationSucceeded();
    }
}
