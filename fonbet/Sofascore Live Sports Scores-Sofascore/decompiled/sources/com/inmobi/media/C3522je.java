package com.inmobi.media;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.je, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3522je implements T1 {
    public final /* synthetic */ C3652oe a;

    public C3522je(C3652oe c3652oe) {
        this.a = c3652oe;
    }

    @Override // com.inmobi.media.T1
    public final void a() {
        this.a.a();
    }

    @Override // com.inmobi.media.T1
    public final void b() {
        C3652oe c3652oe = this.a;
        MediaPlayer mediaPlayer = c3652oe.c;
        mediaPlayer.getClass();
        try {
            mediaPlayer.setVolume(1.0f, 1.0f);
        } catch (IllegalStateException unused) {
        }
        c3652oe.a(c3652oe.k, c3652oe.j);
        X4.a(c3652oe.e, c3652oe.b, new W1(1.0f, false));
        c3652oe.i = false;
    }
}
