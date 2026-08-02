package defpackage;

import com.iab.omid.library.smartadserver1.adsession.AdEvents;
import com.iab.omid.library.smartadserver1.adsession.media.InteractionType;
import com.iab.omid.library.smartadserver1.adsession.media.MediaEvents;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class ojg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjg b;

    public /* synthetic */ ojg(rjg rjgVar, int i) {
        this.a = i;
        this.b = rjgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        rjg rjgVar = this.b;
        switch (i) {
            case 0:
                try {
                    MediaEvents mediaEvents = rjgVar.c;
                    if (mediaEvents != null) {
                        mediaEvents.thirdQuartile();
                        break;
                    }
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                    return;
                }
                break;
            case 1:
                try {
                    MediaEvents mediaEvents2 = rjgVar.c;
                    if (mediaEvents2 != null) {
                        mediaEvents2.complete();
                        break;
                    }
                } catch (IllegalStateException e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
            case 2:
                try {
                    MediaEvents mediaEvents3 = rjgVar.c;
                    if (mediaEvents3 != null) {
                        mediaEvents3.pause();
                        break;
                    }
                } catch (IllegalStateException e3) {
                    e3.printStackTrace();
                    return;
                }
                break;
            case 3:
                try {
                    MediaEvents mediaEvents4 = rjgVar.c;
                    if (mediaEvents4 != null) {
                        mediaEvents4.resume();
                        break;
                    }
                } catch (IllegalStateException e4) {
                    e4.printStackTrace();
                    return;
                }
                break;
            case 4:
                try {
                    MediaEvents mediaEvents5 = rjgVar.c;
                    if (mediaEvents5 != null) {
                        mediaEvents5.skipped();
                        break;
                    }
                } catch (IllegalStateException e5) {
                    e5.printStackTrace();
                    return;
                }
                break;
            case 5:
                try {
                    MediaEvents mediaEvents6 = rjgVar.c;
                    if (mediaEvents6 != null) {
                        mediaEvents6.adUserInteraction(InteractionType.CLICK);
                        break;
                    }
                } catch (IllegalStateException e6) {
                    e6.printStackTrace();
                    return;
                }
                break;
            case 6:
                rjgVar.a.finish();
                rjgVar.a = null;
                break;
            case 7:
                try {
                    AdEvents adEvents = rjgVar.b;
                    if (adEvents != null) {
                        adEvents.loaded();
                        fjg.c().f(1);
                        break;
                    }
                } catch (IllegalArgumentException | IllegalStateException e7) {
                    fjg c = fjg.c();
                    e7.getMessage();
                    c.f(1);
                    return;
                }
                break;
            case 8:
                try {
                    AdEvents adEvents2 = rjgVar.b;
                    if (adEvents2 != null) {
                        adEvents2.impressionOccurred();
                        fjg.c().f(1);
                        break;
                    }
                } catch (IllegalArgumentException | IllegalStateException e8) {
                    fjg c2 = fjg.c();
                    e8.getMessage();
                    c2.f(1);
                    return;
                }
                break;
            case 9:
                try {
                    MediaEvents mediaEvents7 = rjgVar.c;
                    if (mediaEvents7 != null) {
                        mediaEvents7.firstQuartile();
                        break;
                    }
                } catch (IllegalStateException e9) {
                    e9.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    MediaEvents mediaEvents8 = rjgVar.c;
                    if (mediaEvents8 != null) {
                        mediaEvents8.midpoint();
                        break;
                    }
                } catch (IllegalStateException e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
        }
    }
}
