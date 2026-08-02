package ru.ozon.android.messenger.blocks.floatbutton.ai;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import u0.InterfaceC9893b;

/* loaded from: classes10.dex */
final class k extends AbstractC7737t implements InterfaceC6511n<InterfaceC9893b, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ButtonV3DTO f85188b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, Map<String, TokenizedTrackingInfo>, Unit> f85189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(Function2 function2, ButtonV3DTO buttonV3DTO) {
        super(3);
        this.f85188b = buttonV3DTO;
        this.f85189c = function2;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(InterfaceC9893b interfaceC9893b, InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC9893b AiFloatingButtonSurface = interfaceC9893b;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(AiFloatingButtonSurface, "$this$AiFloatingButtonSurface");
        if ((intValue & 17) == 16 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.o(-1822452546);
            Function2<AtomAction, Map<String, TokenizedTrackingInfo>, Unit> function2 = this.f85189c;
            boolean n11 = interfaceC3967k2.n(function2);
            ButtonV3DTO buttonV3DTO = this.f85188b;
            boolean n12 = n11 | interfaceC3967k2.n(buttonV3DTO);
            Object C11 = interfaceC3967k2.C();
            if (n12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new j(function2, buttonV3DTO);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            DsButtonAtomKt.DsButtonAtom(buttonV3DTO, null, false, (Function1) C11, interfaceC3967k2, 0, 6);
        }
        return Unit.f71690a;
    }
}
