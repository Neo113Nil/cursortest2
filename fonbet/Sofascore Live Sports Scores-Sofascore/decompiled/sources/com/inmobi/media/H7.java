package com.inmobi.media;

import android.view.Surface;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.ironsource.U3;
import defpackage.g51;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.vg6;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class H7 extends hoi implements Function2 {
    public final /* synthetic */ V7 a;
    public final /* synthetic */ C3620n8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(rq3 rq3Var, V7 v7, C3620n8 c3620n8) {
        super(2, rq3Var);
        this.a = v7;
        this.b = c3620n8;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new H7(rq3Var, this.a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new H7((rq3) obj2, this.a, this.b).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Surface surface;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        this.a.l.set(Jg.STATE_PREPARED);
        ((g51) this.a.p).M(5, 0L);
        C3853w8 c3853w8 = this.a.z;
        if (!c3853w8.g && (surface = c3853w8.e) != null) {
            c3853w8.g = true;
            ((vg6) c3853w8.b).d0(surface);
        }
        V7 v7 = this.a;
        HtmlVideoPlaybackState htmlVideoPlaybackState = new HtmlVideoPlaybackState();
        htmlVideoPlaybackState.setDuration(this.b.b / 1000.0f);
        htmlVideoPlaybackState.setVideoUrl(this.b.a);
        htmlVideoPlaybackState.setLatency(new Long(System.currentTimeMillis() - this.a.u));
        htmlVideoPlaybackState.setMuted(this.a.y.e);
        EnumC3723r8[] enumC3723r8Arr = EnumC3723r8.a;
        htmlVideoPlaybackState.setState(U3.i.s);
        htmlVideoPlaybackState.setTime(((vg6) this.a.p).getCurrentPosition() / 1000.0f);
        v7.a(new C3646o8(htmlVideoPlaybackState, this.b.c));
        return Unit.a;
    }
}
