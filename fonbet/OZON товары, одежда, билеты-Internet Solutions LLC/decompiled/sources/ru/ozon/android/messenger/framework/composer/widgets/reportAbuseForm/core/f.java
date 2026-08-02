package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> f87030b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.analytics.i f87031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> iVar, ru.ozon.android.messenger.framework.analytics.i iVar2) {
        super(2);
        this.f87030b = iVar;
        this.f87031c = iVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.m.a(this.f87030b.b(), this.f87031c, null, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
