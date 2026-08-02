package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> f87037b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87038c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f87039d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f87040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> iVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2, ru.ozon.android.messenger.framework.navigation.controller.a aVar3) {
        super(2);
        this.f87037b = iVar;
        this.f87038c = aVar;
        this.f87039d = aVar2;
        this.f87040e = aVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.b.b(this.f87037b.b().a(), this.f87038c, this.f87039d, this.f87040e, null, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
