package ru.ozon.app.android.search.widgets.brandList.presentation.navBar;

import J0.u3;
import K1.T;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "invoke", "(Lkotlin/jvm/functions/Function2;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class CustomTextFieldKt$CustomTextField$1 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ String $placeholderText;
    final /* synthetic */ String $searchText;
    final /* synthetic */ T $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomTextFieldKt$CustomTextField$1(String str, String str2, T t2, long j11) {
        super(3);
        this.$searchText = str;
        this.$placeholderText = str2;
        this.$textStyle = t2;
        this.$placeholderColor = j11;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke((Function2<? super InterfaceC3967k, ? super Integer, Unit>) function2, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(Function2<? super InterfaceC3967k, ? super Integer, Unit> innerTextField, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i11 & 6) == 0) {
            i12 = i11 | (interfaceC3967k2.F(innerTextField) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
            return;
        }
        interfaceC3967k2.o(708022714);
        if (this.$searchText.length() == 0) {
            u3.b(this.$placeholderText, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, T.c(this.$textStyle, this.$placeholderColor, 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214), interfaceC3967k, 0, 0, 65534);
            interfaceC3967k2 = interfaceC3967k;
        }
        interfaceC3967k2.k();
        innerTextField.invoke(interfaceC3967k2, Integer.valueOf(i12 & 14));
    }
}
