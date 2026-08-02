package defpackage;

import com.iab.omid.library.smartadserver1.adsession.AdEvents;
import com.iab.omid.library.smartadserver1.adsession.media.MediaEvents;
import com.iab.omid.library.smartadserver1.adsession.media.Position;
import com.iab.omid.library.smartadserver1.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class pjg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ rjg c;

    public /* synthetic */ pjg(rjg rjgVar, float f, int i) {
        this.a = i;
        this.c = rjgVar;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        float f = this.b;
        rjg rjgVar = this.c;
        switch (i) {
            case 0:
                try {
                    MediaEvents mediaEvents = rjgVar.c;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(f);
                        break;
                    }
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                AdEvents adEvents = rjgVar.b;
                if (adEvents != null) {
                    try {
                        adEvents.loaded(f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE) : VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                        fjg.c().f(1);
                        break;
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        fjg c = fjg.c();
                        e.getMessage();
                        c.f(1);
                    } catch (IllegalStateException e3) {
                        e = e3;
                        fjg c2 = fjg.c();
                        e.getMessage();
                        c2.f(1);
                    }
                }
                break;
        }
    }
}
