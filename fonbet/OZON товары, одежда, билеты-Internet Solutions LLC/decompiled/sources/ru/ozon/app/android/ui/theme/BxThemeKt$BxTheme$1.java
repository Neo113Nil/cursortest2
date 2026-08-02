package ru.ozon.app.android.ui.theme;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BxThemeKt$BxTheme$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ boolean $darkTheme;
    final /* synthetic */ int $themeResId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BxThemeKt$BxTheme$1(boolean z11, int i11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, int i12, int i13) {
        super(2);
        this.$darkTheme = z11;
        this.$themeResId = i11;
        this.$content = function2;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        BxThemeKt.BxTheme(this.$darkTheme, this.$themeResId, this.$content, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
