package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0856 extends AbstractRunnableC0606 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0846 f2873;

    public C0856(C0846 c0846) {
        this.f2873 = c0846;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.ironsource.adqualitysdk.sdk.i.ᒯ] */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        C0846 c0846 = this.f2873;
        if (c0846.f2798) {
            C0558 c0558 = c0846.f2793.f2593;
            Context context = c0846.f2797;
            C0858 c0858 = new C0858(this);
            synchronized (c0558) {
                try {
                    if (c0558.f1842.get()) {
                        return;
                    }
                    if (c0558.f1841) {
                        AbstractC1008.m610(new C0673(c0858));
                    } else {
                        String decrypt = StringFog.decrypt("wZHMCUCKao75ptk3\n", "gPWdfCHmA/o=\n");
                        AbstractC0420.m253(decrypt, decrypt, StringFog.decrypt("DKcAtY+q9LAMpwC1j6r59FPlQ8vN8qv+RKps/PPyuPFI/lS4\n", "IYotmKKH2Z0=\n") + IronSourceAdQuality.getSDKVersion() + StringFog.decrypt("YoFjmjs/mjJvgWOaOz+a\n", "QqxOtxYStx8=\n"), true);
                        C0674 c0674 = new C0674(c0558, c0858, context);
                        if (c0558.m365()) {
                            String str = AbstractC0854.f2872;
                            ArrayList arrayList = new ArrayList(Arrays.asList(new C0371(), new C0383(), new C0391()));
                            ArrayList arrayList2 = new ArrayList(AbstractC0854.f2871);
                            if (!arrayList.isEmpty()) {
                                AbstractC0706 abstractC0706 = (AbstractC0706) arrayList.remove(0);
                                String str2 = (String) arrayList2.remove(0);
                                if (!arrayList.isEmpty()) {
                                    c0674 = new C0666(c0558, context, arrayList, arrayList2, c0674);
                                }
                                AbstractC1008.m610(new C0664(c0558, str2, context, abstractC0706, c0674));
                            }
                        } else {
                            AbstractC1008.m610(new C0664(c0558, AbstractC0854.f2872, context, new C0375(), c0674));
                        }
                        c0558.f1841 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
