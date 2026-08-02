package ru.ozon.debugMenu.internal.core.ui.widgets.cell;

import S0.A1;
import S0.C3996z;
import S0.InterfaceC3967k;
import a1.c;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.debugMenu.internal.core.ui.widgets.cell.addons.DebugMenuCellEndScope;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class DebugMenuCellKt$DebugMenuCell$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC6511n<DebugMenuCellEndScope, InterfaceC3967k, Integer, Unit> $end;
    final /* synthetic */ A1<Float> $endAlphaState;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.debugMenu.internal.core.ui.widgets.cell.DebugMenuCellKt$DebugMenuCell$6$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ InterfaceC6511n<DebugMenuCellEndScope, InterfaceC3967k, Integer, Unit> $end;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(InterfaceC6511n<? super DebugMenuCellEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n) {
            super(2);
            this.$end = interfaceC6511n;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
            if ((i11 & 3) == 2 && interfaceC3967k.b()) {
                interfaceC3967k.j();
            } else {
                this.$end.invoke(DebugMenuCellEndScope.INSTANCE.getINSTANCE(), interfaceC3967k, 6);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebugMenuCellKt$DebugMenuCell$6(A1<Float> a12, InterfaceC6511n<? super DebugMenuCellEndScope, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n) {
        super(2);
        this.$endAlphaState = a12;
        this.$end = interfaceC6511n;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            C3996z.a(DebugMenuCellKt.getLocalAddonAlpha().c(this.$endAlphaState), c.c(-2046325786, new AnonymousClass1(this.$end), interfaceC3967k), interfaceC3967k, 56);
        }
    }
}
