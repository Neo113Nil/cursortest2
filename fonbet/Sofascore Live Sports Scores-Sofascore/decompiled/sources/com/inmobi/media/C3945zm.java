package com.inmobi.media;

import android.widget.FrameLayout;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.zm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3945zm extends hoi implements Function2 {
    public final /* synthetic */ Nm a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3945zm(Nm nm, FrameLayout frameLayout, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = nm;
        this.b = frameLayout;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3945zm(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3945zm(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        C3906y9 c3906y9 = this.a.e;
        if (c3906y9 != null) {
            c3906y9.a("VideoExperienceManager", "inflate called - adding media player to parent layout");
        }
        Un.a(this.a.j);
        this.b.addView(this.a.j);
        return Unit.a;
    }
}
