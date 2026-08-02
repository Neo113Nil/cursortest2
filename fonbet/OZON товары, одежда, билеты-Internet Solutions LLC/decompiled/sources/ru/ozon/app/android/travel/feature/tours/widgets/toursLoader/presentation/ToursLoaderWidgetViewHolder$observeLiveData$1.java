package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation.ToursLoaderViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderViewModel$Result;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/presentation/ToursLoaderViewModel$Result;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ToursLoaderWidgetViewHolder$observeLiveData$1 extends AbstractC7737t implements Function1<ToursLoaderViewModel.Result, Unit> {
    final /* synthetic */ ToursLoaderWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursLoaderWidgetViewHolder$observeLiveData$1(ToursLoaderWidgetViewHolder toursLoaderWidgetViewHolder) {
        super(1);
        this.this$0 = toursLoaderWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ToursLoaderViewModel.Result result) {
        invoke2(result);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ToursLoaderViewModel.Result result) {
        Function1 function1;
        ComposerReferences composerReferences;
        if (result instanceof ToursLoaderViewModel.Result.Error) {
            this.this$0.showError(((ToursLoaderViewModel.Result.Error) result).getMessage());
            return;
        }
        if (result instanceof ToursLoaderViewModel.Result.SuccessRefresh) {
            composerReferences = this.this$0.refs;
            InterfaceC7851b.a.e(composerReferences.getController(), ((ToursLoaderViewModel.Result.SuccessRefresh) result).getLink(), null, null, 6);
        } else {
            if (!(result instanceof ToursLoaderViewModel.Result.SuccessAction)) {
                throw new o();
            }
            function1 = this.this$0.actionHandler;
            function1.invoke(((ToursLoaderViewModel.Result.SuccessAction) result).getAction());
        }
    }
}
