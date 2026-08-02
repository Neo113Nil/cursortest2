package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.feature.notifications.utils.ViewIntent;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data.PromoPushEnableCellDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PromoPushEnableKt$PromoPushEnable$1$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ PromoPushEnableCellDTO $model;
    final /* synthetic */ Function1<ViewIntent, Unit> $onIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PromoPushEnableKt$PromoPushEnable$1$1$1$1(Function1<? super ViewIntent, Unit> function1, PromoPushEnableCellDTO promoPushEnableCellDTO) {
        super(0);
        this.$onIntent = function1;
        this.$model = promoPushEnableCellDTO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onIntent.invoke(new PromoPushEnableViewIntent$OnToggleClick(this.$model.getCell()));
    }
}
