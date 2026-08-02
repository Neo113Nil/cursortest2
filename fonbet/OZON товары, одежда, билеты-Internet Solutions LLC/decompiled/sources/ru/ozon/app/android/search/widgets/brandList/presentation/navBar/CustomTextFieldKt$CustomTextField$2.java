package ru.ozon.app.android.search.widgets.brandList.presentation.navBar;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CustomTextFieldKt$CustomTextField$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<String, Unit> $onValueChange;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ String $placeholderText;
    final /* synthetic */ String $searchText;
    final /* synthetic */ T $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CustomTextFieldKt$CustomTextField$2(e eVar, String str, T t2, long j11, String str2, Function1<? super String, Unit> function1, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$placeholderText = str;
        this.$textStyle = t2;
        this.$placeholderColor = j11;
        this.$searchText = str2;
        this.$onValueChange = function1;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        CustomTextFieldKt.m969CustomTextFieldfWhpE4E(this.$modifier, this.$placeholderText, this.$textStyle, this.$placeholderColor, this.$searchText, this.$onValueChange, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
