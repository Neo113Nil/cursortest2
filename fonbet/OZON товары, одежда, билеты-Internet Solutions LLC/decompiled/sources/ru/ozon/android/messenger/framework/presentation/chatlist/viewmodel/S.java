package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.b;

/* loaded from: classes10.dex */
final class S extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9509v f90596b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(C9509v c9509v) {
        super(0);
        this.f90596b = c9509v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        x0 x0Var;
        x0Var = this.f90596b.f90714v;
        x0Var.tryEmit(b.a.f86160a);
        return Unit.f71690a;
    }
}
