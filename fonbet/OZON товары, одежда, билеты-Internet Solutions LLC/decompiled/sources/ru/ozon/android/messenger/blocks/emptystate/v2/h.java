package ru.ozon.android.messenger.blocks.emptystate.v2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f85136b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar) {
        super(1);
        this.f85136b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        ru.ozon.android.messenger.framework.core.d dVar;
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        dVar = this.f85136b.f85137a;
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(action, null, 3));
        return Unit.f71690a;
    }
}
