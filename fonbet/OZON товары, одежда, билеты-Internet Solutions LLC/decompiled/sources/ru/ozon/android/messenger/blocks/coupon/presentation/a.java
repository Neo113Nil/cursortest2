package ru.ozon.android.messenger.blocks.coupon.presentation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f84936b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AtomActionDTO f84937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(c cVar, AtomActionDTO atomActionDTO) {
        super(0);
        this.f84936b = cVar;
        this.f84937c = atomActionDTO;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        d dVar;
        dVar = this.f84936b.f84940a;
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(this.f84937c));
        return Unit.f71690a;
    }
}
