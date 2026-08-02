package ru.ozon.uni.ozi.components.navBar.addons;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.ozi.components.navBar.presets.OziNavBarAlignment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopCenterScope;", "", "invoke", "(Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopCenterScope;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziNavBarTopKt$OziNavBarTop$6 extends AbstractC7737t implements InterfaceC6511n<OziNavBarTopCenterScope, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ OziNavBarAlignment $alignment;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ int $subtitleLinesLimit;
    final /* synthetic */ String $title;
    final /* synthetic */ int $titleLinesLimit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziNavBarTopKt$OziNavBarTop$6(String str, String str2, OziNavBarAlignment oziNavBarAlignment, int i11, int i12) {
        super(3);
        this.$title = str;
        this.$subtitle = str2;
        this.$alignment = oziNavBarAlignment;
        this.$titleLinesLimit = i11;
        this.$subtitleLinesLimit = i12;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(OziNavBarTopCenterScope oziNavBarTopCenterScope, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(oziNavBarTopCenterScope, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(OziNavBarTopCenterScope OziNavBarTop, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(OziNavBarTop, "$this$OziNavBarTop");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        if (this.$title != null) {
            interfaceC3967k.o(-1817984746);
            OziNavBarTopCenterScope.INSTANCE.getINSTANCE$uni_release().TitleSubtitle(this.$title, this.$subtitle, null, this.$alignment.textAlign$uni_release(), this.$titleLinesLimit, this.$subtitleLinesLimit, interfaceC3967k, 1572864, 4);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(-1817645947);
            OziNavBarTopCenterScope.INSTANCE.getINSTANCE$uni_release().Filler$uni_release(interfaceC3967k, 6);
            interfaceC3967k.k();
        }
    }
}
