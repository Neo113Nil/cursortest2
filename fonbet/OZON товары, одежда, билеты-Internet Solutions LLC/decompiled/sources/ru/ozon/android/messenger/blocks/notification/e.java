package ru.ozon.android.messenger.blocks.notification;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f85914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(h hVar) {
        super(1);
        this.f85914b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        h.e(this.f85914b, action);
        return Unit.f71690a;
    }
}
