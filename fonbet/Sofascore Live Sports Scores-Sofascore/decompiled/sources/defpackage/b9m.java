package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b9m implements ahj {
    public final /* synthetic */ dlm a;

    public b9m(dlm dlmVar) {
        this.a = dlmVar;
    }

    @Override // defpackage.ahj
    public final void a(chj chjVar, long j) {
        syl sylVar = (syl) this.a.c;
        sylVar.getClass();
        try {
            ((sqm) sylVar.getViewModel()).i(j);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.ahj
    public final void b(chj chjVar, long j, boolean z) {
        syl sylVar = (syl) this.a.c;
        sylVar.getClass();
        try {
            ((sqm) sylVar.getViewModel()).j(j, true);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.ahj
    public final void c(chj chjVar, long j) {
        syl sylVar = (syl) this.a.c;
        sylVar.getClass();
        try {
            sqm sqmVar = (sqm) sylVar.getViewModel();
            sqmVar.getClass();
            try {
                fam famVar = sqmVar.e;
                if (famVar != null) {
                    famVar.seekTo(j);
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
    }
}
