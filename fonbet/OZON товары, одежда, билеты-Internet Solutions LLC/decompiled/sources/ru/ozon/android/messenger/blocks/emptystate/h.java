package ru.ozon.android.messenger.blocks.emptystate;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f85101b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction it = atomAction;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f85101b.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(it, null, 3));
        return Unit.f71690a;
    }
}
