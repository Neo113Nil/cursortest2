package ru.ozon.uni.android.ds.compose.factory;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DSComposeAtomsFactory$CreateAtom$3$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    public static final DSComposeAtomsFactory$CreateAtom$3$1 INSTANCE = new DSComposeAtomsFactory$CreateAtom$3$1();

    DSComposeAtomsFactory$CreateAtom$3$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }
}
