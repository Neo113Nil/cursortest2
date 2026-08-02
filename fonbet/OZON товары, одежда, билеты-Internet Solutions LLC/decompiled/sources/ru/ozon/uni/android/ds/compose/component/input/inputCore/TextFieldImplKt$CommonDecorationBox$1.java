package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "labelProgress", "", "invoke", "(FLS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TextFieldImplKt$CommonDecorationBox$1 extends AbstractC7737t implements InterfaceC6511n<Float, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC9914x $contentPadding;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $finalPlaceholder;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $innerTextField;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $label;
    final /* synthetic */ DsInputLabelPosition $labelPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TextFieldImplKt$CommonDecorationBox$1(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, InterfaceC9914x interfaceC9914x, DsInputLabelPosition dsInputLabelPosition) {
        super(3);
        this.$innerTextField = function2;
        this.$label = function22;
        this.$finalPlaceholder = function23;
        this.$contentPadding = interfaceC9914x;
        this.$labelPosition = dsInputLabelPosition;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Float f7, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(f7.floatValue(), interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7, InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.q(f7) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            TextFieldLayoutKt.TextFieldLayout(e.f40358c0, this.$innerTextField, this.$label, this.$finalPlaceholder, f7, this.$contentPadding, this.$labelPosition, interfaceC3967k, ((i11 << 12) & 57344) | 6);
        }
    }
}
