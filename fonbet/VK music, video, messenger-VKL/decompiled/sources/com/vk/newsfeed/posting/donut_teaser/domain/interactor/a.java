package com.vk.newsfeed.posting.donut_teaser.domain.interactor;

import android.graphics.Bitmap;
import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.b;
import io.reactivex.rxjava3.core.d;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.core.y;
import io.reactivex.rxjava3.disposables.c;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.waiting_room.ConversationWaitingParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function;
import xsna.b3m0;
import xsna.c3k0;
import xsna.dy2;
import xsna.h3e0;
import xsna.hxm0;
import xsna.jsv;
import xsna.n3t;
import xsna.o860;
import xsna.pvn;
import xsna.rsg0;
import xsna.ux00;
import xsna.x310;
import xsna.xzk0;
import xsna.yfb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements s, d, Function, a0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.ok.tensorflow.util.Function
    public Object apply(Object obj) {
        PatternMatchRaw lambda$matchAsync$8;
        lambda$matchAsync$8 = ((BodyPatternMatchingPipeline) this.b).lambda$matchAsync$8((Bitmap) this.c, (Detection) obj);
        return lambda$matchAsync$8;
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(b bVar) {
        AdaptersKt.setAudioDeviceTypeCompletable$lambda$2((CallsAudioManager) this.b, (CallsAudioManager.AudioDeviceType) this.c, bVar);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(y yVar) {
        WaitingRoomParticipants.resolveInternalIdSingle$lambda$0((WaitingRoomParticipants) this.b, (ConversationWaitingParticipantId) this.c, yVar);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(r rVar) {
        pvn pvnVar = (pvn) this.b;
        String str = (String) this.c;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        Object obj = pvnVar.b;
        c subscribe = rsg0.l0(yfb.x(new dy2().a(Collections.singletonList(str))), null, 3).U(new o860(new h3e0(10), 10)).U(new x310(new hxm0(2), 13)).subscribe(new jsv(new c3k0(rVar, 3), 29), new n3t(new b3m0(rVar, 6), 26));
        bVar.b(subscribe);
        bVar.b(q.B0(500L, TimeUnit.MILLISECONDS).subscribe(new ux00(new xzk0(4, rVar, subscribe), 26)));
        rVar.i(bVar);
    }
}
