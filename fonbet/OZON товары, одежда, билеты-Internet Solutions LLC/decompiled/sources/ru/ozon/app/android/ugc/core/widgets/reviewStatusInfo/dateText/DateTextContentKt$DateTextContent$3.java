package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Tg.b;
import WZ.t;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DateTextContentKt$DateTextContent$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Locale $appLocale;
    final /* synthetic */ DateTextVO $item;
    final /* synthetic */ Function1<b, Unit> $onAction;
    final /* synthetic */ Function1<t, Unit> $onView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DateTextContentKt$DateTextContent$3(DateTextVO dateTextVO, Locale locale, Function1<? super t, Unit> function1, Function1<? super b, Unit> function12, int i11, int i12) {
        super(2);
        this.$item = dateTextVO;
        this.$appLocale = locale;
        this.$onView = function1;
        this.$onAction = function12;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DateTextContentKt.DateTextContent(this.$item, this.$appLocale, this.$onView, this.$onAction, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
