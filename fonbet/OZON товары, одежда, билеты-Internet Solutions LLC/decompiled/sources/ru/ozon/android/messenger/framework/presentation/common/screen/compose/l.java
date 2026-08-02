package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final /* synthetic */ class l extends C7735q implements Function1<AtomAction, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((k) this.receiver).handleAction(p02);
    }
}
