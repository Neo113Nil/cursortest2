package ru.ozon.android.messenger.blocks.ai.aiEmptyState.presentation.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f83956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Function0<Unit> function0) {
        super(1);
        this.f83956b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f83956b.invoke();
        return Unit.f71690a;
    }
}
