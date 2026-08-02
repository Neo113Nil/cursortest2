package com.bytedance.sdk.openadsdk.core.gbb;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class vy extends qf {

    @NonNull
    private final MediaEvents vj;
    private boolean wh;

    public vy(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.vj = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbb.qf
    public void pcc(boolean z, float f) {
        if (z) {
            this.oo = VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE);
        } else {
            this.oo = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        pcc(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbb.qf
    public void sf(int i) {
        if (pcc()) {
            switch (i) {
                case 0:
                    this.vj.pause();
                    break;
                case 1:
                    this.vj.resume();
                    break;
                case 2:
                case 14:
                    this.vj.skipped();
                    break;
                case 4:
                    this.vj.bufferStart();
                    break;
                case 5:
                    this.vj.bufferFinish();
                    break;
                case 6:
                    this.vj.firstQuartile();
                    break;
                case 7:
                    this.vj.midpoint();
                    break;
                case 8:
                    this.vj.thirdQuartile();
                    break;
                case 9:
                    this.vj.complete();
                    break;
                case 10:
                    this.vj.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.vj.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.vj.volumeChange(this.wh ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
                    break;
                case 13:
                    this.vj.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbb.qf
    public void pcc(float f, boolean z) {
        if (pcc()) {
            this.vj.start(f, z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbb.qf
    public void pcc(boolean z) {
        this.wh = z;
        sf(12);
    }
}
