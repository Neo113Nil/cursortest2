package ru.ozon.fintech.features.camera.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class ScannerErrorResultView$getButtonState$1 extends C7719a implements Function0<Unit> {
    ScannerErrorResultView$getButtonState$1(Object obj) {
        super(0, obj, ScannerErrorResultView.class, "close", "close()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ScannerErrorResultView) this.receiver).close();
    }
}
