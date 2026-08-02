package ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkout.databinding.WidgetEnableNotificationWithReplacementButtonBinding;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.di.EnableNotificationWithReplacementButtonDiComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVH;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class EnableNotificationWithReplacementButtonViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, EnableNotificationWithReplacementButtonVH> {
    final /* synthetic */ EnableNotificationWithReplacementButtonViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnableNotificationWithReplacementButtonViewMapper$holderProducer$1(EnableNotificationWithReplacementButtonViewMapper enableNotificationWithReplacementButtonViewMapper) {
        super(2);
        this.this$0 = enableNotificationWithReplacementButtonViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final EnableNotificationWithReplacementButtonVH invoke(View view, ComposerReferences refs) {
        EnableNotificationWithReplacementButtonDiComponent enableNotificationWithReplacementButtonDiComponent;
        EnableNotificationWithReplacementButtonDiComponent enableNotificationWithReplacementButtonDiComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetEnableNotificationWithReplacementButtonBinding bind = WidgetEnableNotificationWithReplacementButtonBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        enableNotificationWithReplacementButtonDiComponent = this.this$0.component;
        EnableNotificationsSuggestingHandler enableNotificationsSuggestingHandler = enableNotificationWithReplacementButtonDiComponent.getEnableNotificationsSuggestingHandler();
        enableNotificationWithReplacementButtonDiComponent2 = this.this$0.component;
        return new EnableNotificationWithReplacementButtonVH(refs, bind, enableNotificationsSuggestingHandler, enableNotificationWithReplacementButtonDiComponent2.getCustomActionHandlersStoreFactory());
    }
}
