package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f87071b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87072c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f87073d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f87074e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p f87075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ButtonV3DTO buttonV3DTO, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2, ru.ozon.android.messenger.framework.navigation.controller.a aVar3, p pVar, int i11) {
        super(2);
        this.f87071b = buttonV3DTO;
        this.f87072c = aVar;
        this.f87073d = aVar2;
        this.f87074e = aVar3;
        this.f87075f = pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        ru.ozon.android.messenger.framework.navigation.controller.a aVar = this.f87074e;
        ru.ozon.android.messenger.framework.composer.navigation.router.a aVar2 = this.f87072c;
        ru.ozon.android.messenger.framework.domain.repository.a aVar3 = this.f87073d;
        b.b(this.f87071b, aVar2, aVar3, aVar, this.f87075f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
