package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ga extends hoi implements Function2 {
    public final /* synthetic */ Ha a;
    public final /* synthetic */ VideoViewPosition b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ga(Ha ha, VideoViewPosition videoViewPosition, String str, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = ha;
        this.b = videoViewPosition;
        this.c = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Ga(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ga) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a.a;
        VideoViewPosition videoViewPosition = this.b;
        String str = this.c;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        videoViewPosition.getClass();
        D8 d8 = gestureDetectorOnGestureListenerC3889xi.Z0;
        if (d8 != null) {
            videoViewPosition.getClass();
            if (!d8.g.get()) {
                A8[] a8Arr = {A8.LOADED, A8.PLAYING, A8.PAUSED, A8.COMPLETED};
                EnumC3491i8[] enumC3491i8Arr = EnumC3491i8.a;
                if (D8.a(d8, a8Arr, "updateVideoPlayerPosition", "updateVideoPosition", null, 8)) {
                    d8.k.a(videoViewPosition);
                }
            }
            gestureDetectorOnGestureListenerC3889xi.a(EnumC3879x8.VIDEO_PLAYER_POSITION_UPDATED, str);
        } else {
            EnumC3879x8 enumC3879x8 = EnumC3879x8.VIDEO_COMMAND_ERROR;
            EnumC3491i8[] enumC3491i8Arr2 = EnumC3491i8.a;
            gestureDetectorOnGestureListenerC3889xi.a(enumC3879x8, AbstractC3907ya.a(new C3413f8((Object) str), C3413f8.class));
        }
        return Unit.a;
    }
}
