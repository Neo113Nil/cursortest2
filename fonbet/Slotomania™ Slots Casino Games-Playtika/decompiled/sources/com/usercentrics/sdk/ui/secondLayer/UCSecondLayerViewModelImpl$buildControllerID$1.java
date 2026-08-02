package com.usercentrics.sdk.ui.secondLayer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UCSecondLayerViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class UCSecondLayerViewModelImpl$buildControllerID$1 extends FunctionReferenceImpl implements Function0<Unit> {
    UCSecondLayerViewModelImpl$buildControllerID$1(Object obj) {
        super(0, obj, UCSecondLayerViewModelImpl.class, "onCopyControllerId", "onCopyControllerId()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((UCSecondLayerViewModelImpl) this.receiver).onCopyControllerId();
    }
}
