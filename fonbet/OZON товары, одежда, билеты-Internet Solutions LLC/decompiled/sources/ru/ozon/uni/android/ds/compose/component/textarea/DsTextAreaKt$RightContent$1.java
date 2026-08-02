package ru.ozon.uni.android.ds.compose.component.textarea;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTextAreaKt$RightContent$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<String, Unit> $copyOnClipboard;
    final /* synthetic */ boolean $hasBottomBar;
    final /* synthetic */ boolean $hasInfoIcon;
    final /* synthetic */ boolean $isTextEmpty;
    final /* synthetic */ Function0<Unit> $onInfoButtonClicked;
    final /* synthetic */ DsTextAreaState $state;
    final /* synthetic */ DsTextAreaStyle $style;
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsTextAreaKt$RightContent$1(DsTextAreaStyle dsTextAreaStyle, DsTextAreaState dsTextAreaState, boolean z11, boolean z12, boolean z13, String str, Function0<Unit> function0, Function1<? super String, Unit> function1, int i11) {
        super(2);
        this.$style = dsTextAreaStyle;
        this.$state = dsTextAreaState;
        this.$hasInfoIcon = z11;
        this.$isTextEmpty = z12;
        this.$hasBottomBar = z13;
        this.$value = str;
        this.$onInfoButtonClicked = function0;
        this.$copyOnClipboard = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsTextAreaKt.RightContent(this.$style, this.$state, this.$hasInfoIcon, this.$isTextEmpty, this.$hasBottomBar, this.$value, this.$onInfoButtonClicked, this.$copyOnClipboard, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
