package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3419fe implements InterfaceC3477hk {
    public final /* synthetic */ C3445ge a;

    public C3419fe(C3445ge c3445ge) {
        this.a = c3445ge;
    }

    @Override // com.inmobi.media.InterfaceC3477hk
    public final void a() {
        C3445ge c3445ge = this.a;
        Jg jg = c3445ge.g;
        if (jg == Jg.STATE_PAUSED || jg == Jg.STATE_PREPARED) {
            Context context = c3445ge.i.getContext();
            context.getClass();
            if (AbstractC3713qn.a(context, c3445ge.b.a)) {
                C3652oe c3652oe = c3445ge.k;
                X4.a(c3652oe.b, new C3600me(c3652oe, null));
                c3445ge.l.b();
                MediaPlayer mediaPlayer = c3445ge.j;
                mediaPlayer.getClass();
                try {
                    mediaPlayer.start();
                } catch (IllegalStateException unused) {
                }
                X4.a(c3445ge.h, c3445ge.a, new Gn(c3445ge.j.getCurrentPosition()));
                c3445ge.g = Jg.STATE_PLAYING;
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC3477hk
    public final void b() {
        C3445ge c3445ge = this.a;
        if (c3445ge.g != Jg.STATE_PLAYING) {
            return;
        }
        MediaPlayer mediaPlayer = c3445ge.j;
        mediaPlayer.getClass();
        try {
            mediaPlayer.pause();
        } catch (IllegalStateException unused) {
        }
        c3445ge.l.c();
        C3652oe c3652oe = c3445ge.k;
        X4.a(c3652oe.b, new C3574le(c3652oe, null));
        X4.a(c3445ge.h, c3445ge.a, new C3635nn(c3445ge.j.getCurrentPosition()));
        c3445ge.g = Jg.STATE_PAUSED;
    }

    @Override // com.inmobi.media.InterfaceC3477hk
    public final void c() {
        C3445ge c3445ge = this.a;
        if (c3445ge.g != Jg.STATE_PLAYBACK_COMPLETED) {
            return;
        }
        MediaPlayer mediaPlayer = c3445ge.j;
        mediaPlayer.getClass();
        try {
            mediaPlayer.seekTo(0);
        } catch (IllegalStateException unused) {
        }
    }
}
