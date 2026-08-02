package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class IconLoaderButtonKt$IconLoaderButton$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ IconButtonStyle $iconButtonStyle;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isFocused;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ boolean $showLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconLoaderButtonKt$IconLoaderButton$3(e eVar, IconButtonStyle iconButtonStyle, boolean z11, boolean z12, boolean z13, Function0<Unit> function0, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$iconButtonStyle = iconButtonStyle;
        this.$isFocused = z11;
        this.$isEnabled = z12;
        this.$showLoader = z13;
        this.$onClick = function0;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        IconLoaderButtonKt.IconLoaderButton(this.$modifier, this.$iconButtonStyle, this.$isFocused, this.$isEnabled, this.$showLoader, this.$onClick, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
