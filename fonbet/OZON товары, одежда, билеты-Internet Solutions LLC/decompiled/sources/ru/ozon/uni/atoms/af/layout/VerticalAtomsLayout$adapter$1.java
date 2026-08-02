package ru.ozon.uni.atoms.af.layout;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class VerticalAtomsLayout$adapter$1 extends C7735q implements Function1<List<? extends Atom<AtomDTO, Atom.AtomConfiguration>>, Unit> {
    VerticalAtomsLayout$adapter$1(Object obj) {
        super(1, obj, VerticalAtomsLayout.class, "onAdapterChanged", "onAdapterChanged(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends Atom<AtomDTO, Atom.AtomConfiguration>> p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((VerticalAtomsLayout) this.receiver).onAdapterChanged(p02);
    }
}
