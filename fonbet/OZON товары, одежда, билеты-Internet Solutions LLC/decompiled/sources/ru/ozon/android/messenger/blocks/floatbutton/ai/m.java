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
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import u0.InterfaceC9893b;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements InterfaceC6511n<InterfaceC9893b, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f85192b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, Map<String, TokenizedTrackingInfo>, Unit> f85193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(Function2 function2, g gVar) {
        super(3);
        this.f85192b = gVar;
        this.f85193c = function2;
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
            g gVar = this.f85192b;
            IconButtonV3DTO c11 = gVar.c();
            interfaceC3967k2.o(-1200467651);
            Function2<AtomAction, Map<String, TokenizedTrackingInfo>, Unit> function2 = this.f85193c;
            boolean n11 = interfaceC3967k2.n(function2) | interfaceC3967k2.F(gVar);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new l(function2, gVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            DsIconButtonAtomKt.DsIconButtonAtom(c11, null, false, (Function1) C11, interfaceC3967k2, IconButtonV3DTO.$stable, 6);
        }
        return Unit.f71690a;
    }
}
