package com.inmobi.media;

import defpackage.lu3;
import defpackage.ot8;
import defpackage.rq3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.k7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3541k7 extends ot8 implements Function2 {
    public C3541k7(Object obj) {
        super(2, 0, C3800u7.class, obj, "handleResultInternal", "handleResultInternal(Lcom/inmobi/media/pingsv2/executor/PingExecutor$PingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object a = ((C3800u7) this.receiver).b.a((C3628ng) obj, (rq3) obj2);
        return a == lu3.a ? a : Unit.a;
    }
}
