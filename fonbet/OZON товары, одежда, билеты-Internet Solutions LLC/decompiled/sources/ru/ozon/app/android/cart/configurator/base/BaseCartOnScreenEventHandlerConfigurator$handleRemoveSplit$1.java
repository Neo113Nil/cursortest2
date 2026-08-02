package ru.ozon.app.android.cart.configurator.base;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll20/a;", "it", "", "invoke", "(Ll20/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class BaseCartOnScreenEventHandlerConfigurator$handleRemoveSplit$1 extends AbstractC7737t implements Function1<C7854a, Boolean> {
    final /* synthetic */ Integer $widgetKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseCartOnScreenEventHandlerConfigurator$handleRemoveSplit$1(Integer num) {
        super(1);
        this.$widgetKey = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C7854a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(it.d().getScrollWidgetKey(), this.$widgetKey));
    }
}
