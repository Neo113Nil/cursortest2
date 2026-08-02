package ru.ozon.android.messenger.blocks.showTextButton;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f86407b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f86408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(l lVar, o oVar) {
        super(2);
        this.f86407b = lVar;
        this.f86408c = oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        ru.ozon.android.messenger.framework.core.d dVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ButtonV3DTO a11 = this.f86407b.a();
            if (a11 != null) {
                o oVar = this.f86408c;
                String valueOf = String.valueOf(oVar.hashCode());
                dVar = oVar.f86411a;
                i.b(a11, valueOf, dVar, interfaceC3967k2, 0);
            }
        }
        return Unit.f71690a;
    }
}
