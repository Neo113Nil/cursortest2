package com.usercentrics.sdk.ui.toggle;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PredefinedUIToggleGroup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class PredefinedUIToggleGroupImpl$bind$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    PredefinedUIToggleGroupImpl$bind$1(Object obj) {
        super(1, obj, PredefinedUIToggleGroupImpl.class, "onStateChange", "onStateChange(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((PredefinedUIToggleGroupImpl) this.receiver).onStateChange(z);
    }
}
