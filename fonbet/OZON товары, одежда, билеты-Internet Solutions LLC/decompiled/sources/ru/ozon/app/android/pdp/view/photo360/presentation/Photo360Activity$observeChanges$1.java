package ru.ozon.app.android.pdp.view.photo360.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class Photo360Activity$observeChanges$1 extends AbstractC7737t implements Function1<Photo360ViewModel.Action, Unit> {
    final /* synthetic */ Photo360Activity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360Activity$observeChanges$1(Photo360Activity photo360Activity) {
        super(1);
        this.this$0 = photo360Activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Photo360ViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Photo360ViewModel.Action action) {
        if (action instanceof Photo360ViewModel.Action.Loading) {
            this.this$0.onLoading();
        } else if (action instanceof Photo360ViewModel.Action.Error) {
            this.this$0.onError((Photo360ViewModel.Action.Error) action);
        } else if (action instanceof Photo360ViewModel.Action.Ready) {
            this.this$0.onReady((Photo360ViewModel.Action.Ready) action);
        } else if (action instanceof Photo360ViewModel.Action.NewPhoto) {
            this.this$0.onNewPhoto((Photo360ViewModel.Action.NewPhoto) action);
        } else {
            if (!(action instanceof Photo360ViewModel.Action.ShowZoomDescription)) {
                throw new o();
            }
            this.this$0.onShowZoomDescription();
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }
}
