package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.header.presentation.a f84140b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, AtomActionDTO, Unit> f84141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    e(ru.ozon.android.messenger.blocks.ai.header.presentation.a aVar, Function2<? super AtomAction, ? super AtomActionDTO, Unit> function2) {
        super(2);
        this.f84140b = aVar;
        this.f84141c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            o.c(null, this.f84140b.h(), this.f84141c, interfaceC3967k2, IconButtonV3DTO.$stable << 3);
        }
        return Unit.f71690a;
    }
}
