package com.inmobi.media;

import android.media.MediaPlayer;
import defpackage.dmi;
import defpackage.lj2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.in, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3505in implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ InterfaceC3880x9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lj2 c;

    public C3505in(InterfaceC3880x9 interfaceC3880x9, String str, lj2 lj2Var) {
        this.a = interfaceC3880x9;
        this.b = str;
        this.c = lj2Var;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("VideoLoaderHelper", dmi.q("Video Load Error URL: ", this.b));
        }
        X4.a(this.c, Boolean.FALSE);
        return true;
    }
}
