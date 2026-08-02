package ru.ozon.app.android.cml.delivery.widgets.input.presentation.keyboard;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import ze.u;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class KeyboardKt$keyboardVisibilityChanges$1$listener$1 extends C7719a implements Function1<Boolean, Unit> {
    KeyboardKt$keyboardVisibilityChanges$1$listener$1(Object obj) {
        super(1, obj, u.class, "trySend", "trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((u) this.receiver).b(Boolean.valueOf(z11));
    }
}
