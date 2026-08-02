package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.chatlist.disclaimermodal.a;

/* loaded from: classes10.dex */
final class Q extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9509v f90595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(C9509v c9509v) {
        super(0);
        this.f90595b = c9509v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        x0 x0Var;
        x0Var = this.f90595b.f90711s;
        x0Var.tryEmit(a.b.f90469a);
        return Unit.f71690a;
    }
}
