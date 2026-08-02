package com.inmobi.media;

import android.media.MediaPlayer;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3626ne extends hoi implements Function2 {
    public final /* synthetic */ C3652oe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3626ne(C3652oe c3652oe, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = c3652oe;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3626ne(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3626ne(this.a, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        boolean e = this.a.f.e();
        C3652oe c3652oe = this.a;
        if (e) {
            MediaPlayer mediaPlayer = c3652oe.c;
            mediaPlayer.getClass();
            try {
                mediaPlayer.setVolume(1.0f, 1.0f);
            } catch (IllegalStateException unused) {
            }
            c3652oe.a(c3652oe.k, c3652oe.j);
            X4.a(c3652oe.e, c3652oe.b, new W1(1.0f, false));
            c3652oe.i = false;
        } else {
            c3652oe.a();
        }
        return Unit.a;
    }
}
