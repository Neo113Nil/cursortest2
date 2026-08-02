package ru.ozon.android.messenger.blocks.notification;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f85912b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(h hVar) {
        super(1);
        this.f85912b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction atomAction2 = atomAction;
        Intrinsics.checkNotNullParameter(atomAction2, "atomAction");
        h.e(this.f85912b, atomAction2);
        return Unit.f71690a;
    }
}
