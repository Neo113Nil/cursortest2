package ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class AtomsAdapter$onCreateViewHolder$3 extends C7735q implements Function1<AtomAction, Unit> {
    AtomsAdapter$onCreateViewHolder$3(Object obj) {
        super(1, obj, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((Function1) this.receiver).invoke(p02);
    }
}
