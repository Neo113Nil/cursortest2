package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d> f86948b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86949c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d> iVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2) {
        super(2);
        this.f86948b = iVar;
        this.f86949c = aVar;
        this.f86950d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k2.m(b00.f.c());
            ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d b11 = this.f86948b.b();
            interfaceC3967k2.o(-282986357);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = e.f86947b;
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.c.b(b11, this.f86949c, interfaceC7851b, this.f86950d, (Function1) C11, interfaceC3967k2, 24576);
        }
        return Unit.f71690a;
    }
}
