package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖦ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0757 extends AbstractC0201 implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2485 = StringFog.decrypt("380hcpNb35L90x5yglXQlOPXF3mTQtiY88wAdoJf7g==\n", "kKNyF/YwnP0=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0800 f2486;

    public C0757(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, InterfaceC0800 interfaceC0800) {
        super(onSeekCompleteListener);
        this.f2486 = interfaceC0800;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            this.f2486.mo457(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC0356.m204(f2485, StringFog.decrypt("IvK0hR1fRRxH7ZKIIxZfBgLuo5hPEEIhAuWtqQASXB4C9KM=\n", "Z4DG6m9/LHI=\n"), th, false);
        }
        Object obj = this.f293;
        if (obj != null) {
            ((MediaPlayer.OnSeekCompleteListener) obj).onSeekComplete(mediaPlayer);
        }
    }
}
