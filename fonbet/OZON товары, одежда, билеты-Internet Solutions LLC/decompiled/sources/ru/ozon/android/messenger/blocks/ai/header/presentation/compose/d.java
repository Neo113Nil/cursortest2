package ru.ozon.android.messenger.blocks.ai.header.presentation.compose;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.ai.header.AiHeaderDTO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.header.presentation.a f84137b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<AtomActionDTO, Unit> f84138c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, AtomActionDTO, Unit> f84139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    d(ru.ozon.android.messenger.blocks.ai.header.presentation.a aVar, Function1<? super AtomActionDTO, Unit> function1, Function2<? super AtomAction, ? super AtomActionDTO, Unit> function2) {
        super(2);
        this.f84137b = aVar;
        this.f84138c = function1;
        this.f84139d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        float f7;
        float f11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ru.ozon.android.messenger.blocks.ai.header.presentation.a aVar = this.f84137b;
            AiHeaderDTO.TitleSubtitle f12 = aVar.f();
            interfaceC3967k2.o(1601600552);
            if (f12 != null) {
                e.a aVar2 = androidx.compose.ui.e.f40358c0;
                f11 = o.f84180b;
                o.d(T.h(aVar2, f11, 0.0f, 2), f12, this.f84138c, interfaceC3967k2, 6);
                Unit unit = Unit.f71690a;
            }
            interfaceC3967k2.k();
            ButtonV3DTO b11 = aVar.b();
            if (b11 != null) {
                e.a aVar3 = androidx.compose.ui.e.f40358c0;
                f7 = o.f84180b;
                androidx.compose.ui.e h11 = T.h(aVar3, f7, 0.0f, 2);
                interfaceC3967k2.o(-94275095);
                Function2<AtomAction, AtomActionDTO, Unit> function2 = this.f84139d;
                boolean n11 = interfaceC3967k2.n(function2) | interfaceC3967k2.n(b11);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new c(function2, b11);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                DsButtonAtomKt.DsButtonAtom(b11, h11, false, (Function1) C11, interfaceC3967k2, 48, 4);
            }
        }
        return Unit.f71690a;
    }
}
