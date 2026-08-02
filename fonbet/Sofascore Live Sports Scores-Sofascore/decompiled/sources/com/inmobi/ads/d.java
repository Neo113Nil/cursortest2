package com.inmobi.ads;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.AbstractC3330c2;
import com.inmobi.media.C3433g2;
import com.inmobi.media.C3485i2;
import com.inmobi.media.Xb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d implements PreloadManager {
    public final C3433g2 a;
    public final /* synthetic */ InMobiBanner b;

    public d(InMobiBanner inMobiBanner) {
        this.b = inMobiBanner;
        this.a = new C3433g2(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            C3485i2 mAdManager = this.b.getMAdManager();
            if (mAdManager != null) {
                mAdManager.o();
            }
        } catch (IllegalStateException e) {
            String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
            access$getTAG$cp.getClass();
            Xb.a((byte) 1, access$getTAG$cp, e.getMessage());
            AbstractC3330c2 mPubListener = this.b.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(this.b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.b.setEnableAutoRefresh(false);
        this.b.a((PublisherCallbacks) this.a, "Preload", false);
    }
}
