package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import defpackage.fsf;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fa extends hoi implements Function2 {
    public final /* synthetic */ Ha a;
    public final /* synthetic */ fsf b;
    public final /* synthetic */ CountDownLatch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fa(Ha ha, fsf fsfVar, CountDownLatch countDownLatch, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = ha;
        this.b = fsfVar;
        this.c = countDownLatch;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Fa(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Fa) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        try {
            HtmlVideoPlaybackState playbackState = this.a.a.getPlaybackState();
            if (playbackState == null) {
                playbackState = new HtmlVideoPlaybackState();
            }
            this.b.a = AbstractC3907ya.a(playbackState, HtmlVideoPlaybackState.class);
            this.c.countDown();
            return Unit.a;
        } catch (Throwable th) {
            this.c.countDown();
            throw th;
        }
    }
}
