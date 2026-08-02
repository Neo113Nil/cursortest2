package ru.ozon.fintech.features.camera.presentation.camera;

import Ae.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import t90.AbstractC9781a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class CameraViewModel$handleState$2 extends C7719a implements Function1<AbstractC9781a, Unit> {
    CameraViewModel$handleState$2(Object obj) {
        super(1, obj, w0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AbstractC9781a abstractC9781a) {
        invoke2(abstractC9781a);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AbstractC9781a abstractC9781a) {
        ((w0) this.receiver).tryEmit(abstractC9781a);
    }
}
