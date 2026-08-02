package ru.ozon.id.logout.presentation;

import bc0.AbstractC5648g;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import vd0.InterfaceC10308a;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function1<InterfaceC10308a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ LogoutActivity f97186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(LogoutActivity logoutActivity) {
        super(1);
        this.f97186b = logoutActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC10308a interfaceC10308a) {
        InterfaceC10308a it = interfaceC10308a;
        Intrinsics.checkNotNullParameter(it, "it");
        LogoutActivity.K(this.f97186b).m0(AbstractC5648g.d.f55922a);
        return Unit.f71690a;
    }
}
