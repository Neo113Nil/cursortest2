package com.inmobi.media;

import android.transition.TransitionManager;
import android.widget.RelativeLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class U7 extends hoi implements Function2 {
    public final /* synthetic */ V7 a;
    public final /* synthetic */ VideoViewPosition b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7(rq3 rq3Var, V7 v7, VideoViewPosition videoViewPosition) {
        super(2, rq3Var);
        this.a = v7;
        this.b = videoViewPosition;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new U7(rq3Var, this.a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new U7((rq3) obj2, this.a, this.b).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        TransitionManager.beginDelayedTransition(this.a.n);
        this.a.e.setVideoViewPosition(this.b);
        int b = (int) (R5.b() * this.b.getWidth());
        int b2 = (int) (R5.b() * this.b.getHeight());
        K1 k1 = this.a.n;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b2);
        if (this.a.e.getVideoViewPosition() != null) {
            layoutParams.setMargins((int) (R5.b() * this.b.getX()), (int) (R5.b() * this.b.getY()), 0, 0);
        }
        k1.setLayoutParams(layoutParams);
        if (this.a.i > 0 && this.a.j > 0) {
            V7 v7 = this.a;
            K1 k12 = v7.n;
            int i = v7.i;
            int i2 = this.a.j;
            k12.getClass();
            if (i > 0 && i2 > 0) {
                k12.a = i / i2;
                k12.requestLayout();
            }
        }
        this.a.n.requestLayout();
        return Unit.a;
    }
}
