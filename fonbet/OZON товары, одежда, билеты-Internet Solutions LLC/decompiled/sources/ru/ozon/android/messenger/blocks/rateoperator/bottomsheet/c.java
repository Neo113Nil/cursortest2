package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final /* synthetic */ class c extends C7735q implements Function1<AtomAction, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction p02 = atomAction;
        Intrinsics.checkNotNullParameter(p02, "p0");
        a.E((a) this.receiver, p02);
        return Unit.f71690a;
    }
}
