package com.inmobi.media;

import android.media.MediaPlayer;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.de, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3368de extends hoi implements Function2 {
    public final /* synthetic */ C3445ge a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3368de(C3445ge c3445ge, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = c3445ge;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3368de(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3368de(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        C3445ge c3445ge = this.a;
        boolean z = c3445ge.b.b;
        En en = c3445ge.l;
        if (z) {
            en.c();
            en.g = -1;
            en.b();
            MediaPlayer mediaPlayer = this.a.j;
            mediaPlayer.getClass();
            try {
                mediaPlayer.seekTo(0);
            } catch (IllegalStateException unused) {
            }
            MediaPlayer mediaPlayer2 = this.a.j;
            mediaPlayer2.getClass();
            try {
                mediaPlayer2.start();
            } catch (IllegalStateException unused2) {
            }
        } else {
            en.c();
            Ng ng = (Ng) this.a.m.i.d.getValue();
            ng.f.set(true);
            P6.a(ng.e);
            ng.e = null;
            this.a.g = Jg.STATE_PLAYBACK_COMPLETED;
        }
        return Unit.a;
    }
}
