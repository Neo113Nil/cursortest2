package defpackage;

import android.media.MediaPlayer;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zrm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ csm c;

    public /* synthetic */ zrm(csm csmVar, boolean z, int i) {
        this.a = i;
        this.c = csmVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qem qemVar;
        qem qemVar2;
        qem qemVar3;
        qem qemVar4;
        int i = this.a;
        boolean z = this.b;
        csm csmVar = this.c;
        switch (i) {
            case 0:
                if (!csmVar.kj()) {
                    qemVar = csmVar.ork;
                    if (qemVar != null) {
                        try {
                            csmVar.atb = z;
                            qemVar2 = csmVar.ork;
                            MediaPlayer mediaPlayer = ((pwm) qemVar2).i;
                            if (mediaPlayer != null) {
                                if (z) {
                                    mediaPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                } else {
                                    mediaPlayer.setVolume(1.0f, 1.0f);
                                }
                            }
                            break;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                }
                break;
            default:
                qemVar3 = csmVar.ork;
                if (qemVar3 != null) {
                    qemVar4 = csmVar.ork;
                    ((pwm) qemVar4).h = z;
                    break;
                }
                break;
        }
    }
}
