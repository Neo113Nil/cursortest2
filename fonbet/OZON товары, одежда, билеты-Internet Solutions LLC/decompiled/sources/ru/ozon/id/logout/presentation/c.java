package ru.ozon.id.logout.presentation;

import bc0.AbstractC5648g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LogoutActivity f97188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(LogoutActivity logoutActivity) {
        super(0);
        this.f97188b = logoutActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LogoutActivity.K(this.f97188b).m0(AbstractC5648g.c.f55921a);
        return Unit.f71690a;
    }
}
