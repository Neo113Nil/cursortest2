package defpackage;

import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p0l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;

    public /* synthetic */ p0l(byte[] bArr, int i) {
        this.a = i;
        this.b = bArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WebViewEvent sendUserConsentChange$lambda$19;
        WebViewEvent sendPrivacyFsmChange$lambda$20;
        WebViewEvent onAllowedPiiChange$lambda$22;
        int i = this.a;
        byte[] bArr = this.b;
        switch (i) {
            case 0:
                sendUserConsentChange$lambda$19 = WebViewAdPlayer.sendUserConsentChange$lambda$19(bArr);
                return sendUserConsentChange$lambda$19;
            case 1:
                sendPrivacyFsmChange$lambda$20 = WebViewAdPlayer.sendPrivacyFsmChange$lambda$20(bArr);
                return sendPrivacyFsmChange$lambda$20;
            default:
                onAllowedPiiChange$lambda$22 = WebViewAdPlayer.onAllowedPiiChange$lambda$22(bArr);
                return onAllowedPiiChange$lambda$22;
        }
    }
}
