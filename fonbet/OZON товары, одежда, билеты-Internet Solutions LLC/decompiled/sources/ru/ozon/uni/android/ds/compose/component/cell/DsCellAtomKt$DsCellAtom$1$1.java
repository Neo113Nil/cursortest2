package ru.ozon.uni.android.ds.compose.component.cell;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsCellAtomKt$DsCellAtom$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    public static final DsCellAtomKt$DsCellAtom$1$1 INSTANCE = new DsCellAtomKt$DsCellAtom$1$1();

    DsCellAtomKt$DsCellAtom$1$1() {
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
