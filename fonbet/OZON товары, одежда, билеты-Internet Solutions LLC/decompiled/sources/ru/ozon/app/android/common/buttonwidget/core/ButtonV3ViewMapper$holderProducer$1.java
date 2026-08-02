package ru.ozon.app.android.common.buttonwidget.core;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.buttonwidget.presentation.ButtonWidgetV3ViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/buttonwidget/presentation/ButtonWidgetV3ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ButtonV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ButtonWidgetV3ViewHolder> {
    final /* synthetic */ ButtonV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonV3ViewMapper$holderProducer$1(ButtonV3ViewMapper buttonV3ViewMapper) {
        super(2);
        this.this$0 = buttonV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ButtonWidgetV3ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new ButtonWidgetV3ViewHolder((FrameLayout) view, refs, this.this$0.component().getHandlersInhibitor(), this.this$0.component().getCustomActionHandlersStoreFactory().create(this.this$0.component().getButtonWidgetCustomActionHandlers().getActionHandlers()));
    }
}
