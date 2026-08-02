package ru.ozon.app.android.fresh.chat.widgets.promptStatus.core;

import WZ.l;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.chat.databinding.PromptStatusWidgetBinding;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewHolder;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PromptStatusViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PromptStatusViewHolder> {
    final /* synthetic */ PromptStatusViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromptStatusViewMapper$holderProducer$1(PromptStatusViewMapper promptStatusViewMapper) {
        super(2);
        this.this$0 = promptStatusViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PromptStatusViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        PromptStatusWidgetBinding bind = PromptStatusWidgetBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        B0 a11 = composerReferences.getViewModelOwnerProvider().a();
        final PromptStatusViewMapper promptStatusViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.fresh.chat.widgets.promptStatus.core.PromptStatusViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PromptStatusViewModel promptStatusViewModel = PromptStatusViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(promptStatusViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return promptStatusViewModel;
            }
        }).a(PromptStatusViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        return new PromptStatusViewHolder(bind, composerReferences, tokenizedAnalytics, (PromptStatusViewModel) a12, this.this$0.component().getActionHandlersFactory());
    }
}
