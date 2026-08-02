package ru.ozon.android.messenger.blocks.emptystate.v2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<AtomAction, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85118b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f85119c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f85120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ru.ozon.android.messenger.framework.core.d dVar, d dVar2, g gVar) {
        super(1);
        this.f85118b = dVar;
        this.f85119c = dVar2;
        this.f85120d = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomAction atomAction) {
        AtomAction action = atomAction;
        Intrinsics.checkNotNullParameter(action, "action");
        ru.ozon.android.messenger.framework.core.d dVar = this.f85118b;
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(action, null, 3));
        g gVar = this.f85120d;
        this.f85119c.getClass();
        b.q(dVar, gVar, action);
        return Unit.f71690a;
    }
}
