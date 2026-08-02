package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ḷ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0879 extends AbstractC0201 implements MediaPlayer.OnCompletionListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2899 = StringFog.decrypt("Qkw60GAXOtl5SxbRQQ4lyGhMHM1JAjXTf0MN0H8=\n", "DSJ5vw1nVrw=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0886 f2900;

    public C0879(MediaPlayer.OnCompletionListener onCompletionListener, InterfaceC0886 interfaceC0886) {
        super(onCompletionListener);
        this.f2900 = interfaceC0886;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            this.f2900.mo502(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC0356.m204(f2899, StringFog.decrypt("Ad81fQDH2hRkwBNwPo7ADiHDImBSiN05K8A3fheT2hUq\n", "RK1HEnLns3o=\n"), th, false);
        }
        Object obj = this.f293;
        if (obj != null) {
            ((MediaPlayer.OnCompletionListener) obj).onCompletion(mediaPlayer);
        }
    }
}
