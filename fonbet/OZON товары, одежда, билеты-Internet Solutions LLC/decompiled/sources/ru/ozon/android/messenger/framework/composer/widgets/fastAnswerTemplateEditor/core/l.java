package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.core;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class l extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.compose.widget.i<t> f86847b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86848c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(ru.ozon.composer.compose.widget.i<t> iVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2) {
        super(2);
        this.f86847b = iVar;
        this.f86848c = aVar;
        this.f86849d = aVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ButtonV3DTO a11 = this.f86847b.b().a();
            interfaceC3967k2.o(1715112325);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = k.f86846b;
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            ru.ozon.android.messenger.framework.domain.repository.a aVar = this.f86849d;
            ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation.g.b(a11, this.f86848c, aVar, null, (Function0) C11, interfaceC3967k2, 24576);
        }
        return Unit.f71690a;
    }
}
