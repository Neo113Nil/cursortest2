package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f1n implements ahj {
    public final /* synthetic */ e0n a;

    public f1n(e0n e0nVar) {
        this.a = e0nVar;
    }

    @Override // defpackage.ahj
    public final void a(chj chjVar, long j) {
        a aVar = (a) this.a.c;
        aVar.getClass();
        try {
            ((w3m) aVar.getViewModel()).i(j);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.ahj
    public final void b(chj chjVar, long j, boolean z) {
        a aVar = (a) this.a.c;
        aVar.getClass();
        try {
            ((w3m) aVar.getViewModel()).j(j, ((w3m) aVar.getViewModel()).c0);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // defpackage.ahj
    public final void c(chj chjVar, long j) {
        e0n e0nVar = this.a;
        if (Math.abs(j - e0nVar.l) > e0nVar.m) {
            a aVar = (a) e0nVar.c;
            aVar.getClass();
            try {
                w3m w3mVar = (w3m) aVar.getViewModel();
                w3mVar.getClass();
                try {
                    fam famVar = w3mVar.e;
                    if (famVar != null) {
                        famVar.seekTo(j);
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
            } catch (Throwable th2) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
            }
            e0nVar.l = j;
        }
    }
}
