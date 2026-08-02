package ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.data.PreOrderSubscriptionUpdateKey;
import ru.ozon.app.android.pdp.widgets.preOrderSubscriptionButton.presentation.PreOrderSubscriptionViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/presentation/PreOrderSubscriptionViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/widgets/preOrderSubscriptionButton/presentation/PreOrderSubscriptionViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PreOrderSubscriptionButtonViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<PreOrderSubscriptionViewModel.Action, Unit> {
    final /* synthetic */ PreOrderSubscriptionButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreOrderSubscriptionButtonViewHolder$onAttachViewModel$1(PreOrderSubscriptionButtonViewHolder preOrderSubscriptionButtonViewHolder) {
        super(1);
        this.this$0 = preOrderSubscriptionButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PreOrderSubscriptionViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PreOrderSubscriptionViewModel.Action action) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        if (action instanceof PreOrderSubscriptionViewModel.Action.Subscription) {
            composerReferences2 = this.this$0.composerReferences;
            composerReferences2.getController().update(new PreOrderSubscriptionUpdateKey(((PreOrderSubscriptionViewModel.Action.Subscription) action).getIsSubscribed()));
        } else {
            if (Intrinsics.d(action, PreOrderSubscriptionViewModel.Action.Error.INSTANCE)) {
                this.this$0.showError();
                return;
            }
            if (!Intrinsics.d(action, PreOrderSubscriptionViewModel.Action.CallAuth.INSTANCE)) {
                throw new o();
            }
            composerReferences = this.this$0.composerReferences;
            ComposerNavigator navigator = composerReferences.getNavigator();
            String uri = LinkGenerator.INSTANCE.auth().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
        }
    }
}
