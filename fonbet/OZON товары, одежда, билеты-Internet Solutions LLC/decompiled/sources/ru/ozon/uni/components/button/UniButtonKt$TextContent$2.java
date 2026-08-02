package ru.ozon.uni.components.button;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniButtonKt$TextContent$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ e $modifier;
    final /* synthetic */ String $text;
    final /* synthetic */ AbstractC7799Q $textColor;
    final /* synthetic */ T $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniButtonKt$TextContent$2(e eVar, String str, T t2, AbstractC7799Q abstractC7799Q, int i11) {
        super(2);
        this.$modifier = eVar;
        this.$text = str;
        this.$textStyle = t2;
        this.$textColor = abstractC7799Q;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniButtonKt.TextContent(this.$modifier, this.$text, this.$textStyle, this.$textColor, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
