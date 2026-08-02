package ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.data.PromptSuggestionsDTO;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.data.PromptSuggestionsMapper;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di.PromptSuggestionsDIComponent;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsVO;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsView;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation.PromptSuggestionsViewHolder;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/core/PromptSuggestionsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/di/PromptSuggestionsDIComponent;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/data/PromptSuggestionsDTO;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/data/PromptSuggestionsMapper;", "getMapper", "()Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/data/PromptSuggestionsMapper;", "mapper", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromptSuggestionsViewMapper extends WidgetViewMapper2<PromptSuggestionsDIComponent, PromptSuggestionsDTO, PromptSuggestionsVO> {

    @NotNull
    private final Function2<View, ComposerReferences, PromptSuggestionsViewHolder> holderProducer = new PromptSuggestionsViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, PromptSuggestionsViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PromptSuggestionsDIComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PromptSuggestionsDIComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public PromptSuggestionsView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PromptSuggestionsView.Companion companion = PromptSuggestionsView.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return companion.create(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public PromptSuggestionsMapper getMapper() {
        return component().getMapper();
    }
}
