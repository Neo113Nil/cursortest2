package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3663p extends hoi implements Function2 {
    public final /* synthetic */ InterfaceC3880x9 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3663p(InterfaceC3880x9 interfaceC3880x9, Context context, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = interfaceC3880x9;
        this.b = context;
        this.c = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3663p(this.a, this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3663p) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        InterfaceC3880x9 interfaceC3880x9 = this.a;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (C3689q.b == null) {
            Object systemService = this.b.getSystemService("audio");
            systemService.getClass();
            C3689q.b = (AudioManager) systemService;
        }
        C3689q c3689q = C3689q.a;
        C3689q.f = N3.a(C3689q.g, 0L, this.c, new C3637o(null));
        C3689q.a(this.c);
        Context context = this.b;
        C3689q.c = new C3533k();
        N3.a(context, C3689q.c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        C3689q.a(Float.valueOf(c3689q.a()));
        return Unit.a;
    }
}
