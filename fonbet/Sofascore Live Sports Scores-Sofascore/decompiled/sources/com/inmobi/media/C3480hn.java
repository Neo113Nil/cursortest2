package com.inmobi.media;

import android.media.MediaPlayer;
import defpackage.dmi;
import defpackage.lj2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3480hn implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ InterfaceC3880x9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lj2 c;

    public C3480hn(InterfaceC3880x9 interfaceC3880x9, String str, lj2 lj2Var) {
        this.a = interfaceC3880x9;
        this.b = str;
        this.c = lj2Var;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("VideoLoaderHelper", dmi.q("Video Load Success for URL: ", this.b));
        }
        X4.a(this.c, Boolean.TRUE);
    }
}
