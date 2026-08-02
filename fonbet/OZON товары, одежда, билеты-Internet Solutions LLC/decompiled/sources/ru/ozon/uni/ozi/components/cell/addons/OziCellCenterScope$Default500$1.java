package ru.ozon.uni.ozi.components.cell.addons;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.theme.OziTheme;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziCellCenterScope$Default500$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ String $subtitle;
    final /* synthetic */ long $subtitleColor;
    final /* synthetic */ int $subtitleMaxLines;
    final /* synthetic */ String $title;
    final /* synthetic */ long $titleColor;
    final /* synthetic */ int $titleMaxLines;
    final /* synthetic */ OziCellCenterScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziCellCenterScope$Default500$1(OziCellCenterScope oziCellCenterScope, String str, int i11, long j11, String str2, int i12, long j12) {
        super(2);
        this.this$0 = oziCellCenterScope;
        this.$title = str;
        this.$titleMaxLines = i11;
        this.$titleColor = j11;
        this.$subtitle = str2;
        this.$subtitleMaxLines = i12;
        this.$subtitleColor = j12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        OziCellCenterScope oziCellCenterScope = this.this$0;
        String str = this.$title;
        int i12 = this.$titleMaxLines;
        long j11 = this.$titleColor;
        OziTheme oziTheme = OziTheme.INSTANCE;
        oziCellCenterScope.m3074TextBlockOjOrPUU(str, i12, j11, oziTheme.getTypography().getCompact500(), this.$subtitle, this.$subtitleMaxLines, this.$subtitleColor, oziTheme.getTypography().getBody400(), null, false, interfaceC3967k, 0, 0, 768);
    }
}
