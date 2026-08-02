package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f86872b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86873c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86874d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u f86875e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f86876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ButtonV3DTO buttonV3DTO, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2, u uVar, Function0 function0, int i11) {
        super(2);
        this.f86872b = buttonV3DTO;
        this.f86873c = aVar;
        this.f86874d = aVar2;
        this.f86875e = uVar;
        this.f86876f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(24577);
        ru.ozon.android.messenger.framework.composer.navigation.router.a aVar = this.f86873c;
        ru.ozon.android.messenger.framework.domain.repository.a aVar2 = this.f86874d;
        g.b(this.f86872b, aVar, aVar2, this.f86875e, this.f86876f, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
