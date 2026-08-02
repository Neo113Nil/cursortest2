package com.inmobi.ads;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3293ah;
import com.inmobi.media.C3855wa;
import com.inmobi.media.C3881xa;
import com.inmobi.media.Xb;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e implements PreloadManager {
    public final C3855wa a;
    public final /* synthetic */ InMobiInterstitial b;

    public e(InMobiInterstitial inMobiInterstitial) {
        this.b = inMobiInterstitial;
        this.a = new C3855wa(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            this.b.getMAdManager$media_release().i();
        } catch (IllegalStateException e) {
            String access$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
            access$getTAG$cp.getClass();
            Xb.a((byte) 1, access$getTAG$cp, e.getMessage());
            this.b.getMPubListener$media_release().a(this.b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        C3293ah c3293ah;
        C3293ah c3293ah2;
        Context context;
        this.b.b = true;
        c3293ah = this.b.d;
        c3293ah.getClass();
        c3293ah.h = "Preload";
        C3881xa mAdManager$media_release = this.b.getMAdManager$media_release();
        c3293ah2 = this.b.d;
        context = this.b.a;
        if (context == null) {
            Intrinsics.i("mContext");
            throw null;
        }
        mAdManager$media_release.a(c3293ah2, context, true, "intHtml");
        this.b.getMAdManager$media_release().b(this.a);
    }
}
