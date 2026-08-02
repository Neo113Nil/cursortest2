package defpackage;

import com.iab.omid.library.smartadserver1.adsession.media.MediaEvents;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qjg implements Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ rjg c;

    public qjg(rjg rjgVar, float f, float f2) {
        this.c = rjgVar;
        this.a = f;
        this.b = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            MediaEvents mediaEvents = this.c.c;
            if (mediaEvents != null) {
                float f = this.a;
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    mediaEvents.start(f, this.b);
                }
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
