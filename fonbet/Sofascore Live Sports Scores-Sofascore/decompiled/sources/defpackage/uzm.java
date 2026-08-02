package defpackage;

import android.os.Bundle;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.gim;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class uzm implements op8, xd {
    public final /* synthetic */ a a;

    public /* synthetic */ uzm(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.op8
    public void b(Bundle bundle, String str) {
        int i = a.I;
        boolean z = bundle.getBoolean("selectedLanguageEvent", false);
        w3m w3mVar = (w3m) this.a.getViewModel();
        w3mVar.getClass();
        if (z) {
            try {
                w3mVar.I.getClass();
                if (pc2.b != null) {
                    n4m D = w3mVar.D();
                    gim gimVar = D != null ? D.b : null;
                    if (gimVar instanceof gim.e) {
                        mzm.b(w3mVar, EventActionName.CC_ON, mzm.createVideosPlayerProps$default(w3mVar, (gim.e) gimVar, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
                    }
                } else {
                    n4m D2 = w3mVar.D();
                    gim gimVar2 = D2 != null ? D2.b : null;
                    if (gimVar2 instanceof gim.e) {
                        mzm.b(w3mVar, EventActionName.CC_OFF, mzm.createVideosPlayerProps$default(w3mVar, (gim.e) gimVar2, false, null, null, null, null, null, null, null, null, false, null, null, null, null, 32766, null));
                    }
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            }
        }
        fam famVar = w3mVar.e;
        if (famVar == null || !famVar.isPlaying()) {
            return;
        }
        w3mVar.h0(b7m.a);
    }

    @Override // defpackage.xd
    public void onActivityResult(Object obj) {
        vzm vzmVar = this.a.v;
        if (vzmVar != null) {
            vzmVar.invoke(Boolean.TRUE);
        }
    }
}
