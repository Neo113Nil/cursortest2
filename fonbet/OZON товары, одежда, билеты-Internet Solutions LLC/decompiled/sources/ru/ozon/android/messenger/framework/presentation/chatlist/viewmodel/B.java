package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import Ae.C0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class B extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9509v f90568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(C9509v c9509v) {
        super(0);
        this.f90568b = c9509v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0 c02;
        ru.ozon.android.messenger.framework.presentation.common.notification.g gVar;
        C9509v c9509v = this.f90568b;
        c02 = c9509v.f90712t;
        gVar = c9509v.f90706n;
        c02.tryEmit(gVar.b());
        return Unit.f71690a;
    }
}
