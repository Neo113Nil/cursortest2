package ru.ozon.android.messenger.blocks.recommendations;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86261b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f86261b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        this.f86261b.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(action, null, 3));
        return Unit.f71690a;
    }
}
