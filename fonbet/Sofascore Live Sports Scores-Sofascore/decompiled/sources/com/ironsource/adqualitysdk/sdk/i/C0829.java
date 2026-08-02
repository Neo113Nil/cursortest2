package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0829 extends AbstractC0201 implements MediaPlayer.OnPreparedListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2640 = StringFog.decrypt("gn89Pgz8wumodSElGvjG9ahjKSkK49H6uX4f\n", "zRFtTGmMo5s=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0837 f2641;

    public C0829(MediaPlayer.OnPreparedListener onPreparedListener, InterfaceC0837 interfaceC0837) {
        super(onPreparedListener);
        this.f2641 = interfaceC0837;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            this.f2641.mo510(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC0356.m204(f2640, StringFog.decrypt("30S92cHWOxa6W5vU/58hDP9YqsSTmTwo6FO/18GTNg==\n", "mjbPtrP2Ung=\n"), th, false);
        }
        Object obj = this.f293;
        if (obj != null) {
            ((MediaPlayer.OnPreparedListener) obj).onPrepared(mediaPlayer);
        }
    }
}
