package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0852 extends AbstractC0201 implements MediaPlayer.OnInfoListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2868 = StringFog.decrypt("opGNGHUaDimei6EYdgcGJY6QthdnGjA=\n", "7f/EdhN1QkA=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0860 f2869;

    public C0852(MediaPlayer.OnInfoListener onInfoListener, InterfaceC0860 interfaceC0860) {
        super(onInfoListener);
        this.f2869 = interfaceC0860;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            this.f2869.mo508(this, mediaPlayer, i, i2);
        } catch (Throwable th) {
            AbstractC0356.m204(f2868, StringFog.decrypt("33I/EvBT3tO6bRkfzhrEyf9uKA+iHNn09GYi\n", "mgBNfYJzt70=\n"), th, false);
        }
        Object obj = this.f293;
        if (obj != null) {
            return ((MediaPlayer.OnInfoListener) obj).onInfo(mediaPlayer, i, i2);
        }
        return false;
    }
}
