package ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import An.C2439a;
import Vg.d;
import WZ.l;
import WZ.m;
import WZ.t;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.chat.viewModels.FreshAISharedViewModel;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView;", "view", "Lru/ozon/app/android/fresh/chat/viewModels/FreshAISharedViewModel;", "sharedViewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView;Lru/ozon/app/android/fresh/chat/viewModels/FreshAISharedViewModel;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "processClickEvents", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "onAttach", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/presentation/PromptSuggestionsView;", "Lru/ozon/app/android/fresh/chat/viewModels/FreshAISharedViewModel;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromptSuggestionsViewHolder extends k<PromptSuggestionsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final FreshAISharedViewModel sharedViewModel;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PromptSuggestionsView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptSuggestionsViewHolder(@NotNull PromptSuggestionsView view, @NotNull FreshAISharedViewModel sharedViewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sharedViewModel, "sharedViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.view = view;
        this.sharedViewModel = sharedViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new PromptSuggestionsViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processClickEvents(AtomAction action, t tokenizedEvent) {
        C2439a.b(0L, null, 3, this.refs.getController());
        this.view.setActionHandlingEnabled(false);
        this.view.clearFocus();
        KeyboardUtilsKt.hideKeyboard(this.view);
        if (tokenizedEvent != null) {
            m.a(this.tokenizedAnalytics, tokenizedEvent, null);
        }
        this.actionHandler.invoke(action);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(C5427n.a(new C2408n0(this.sharedViewModel.getLoadingStateFlow(), new PromptSuggestionsViewHolder$onAttach$1(this, null)), getLifecycle(), AbstractC5434v.b.STARTED), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PromptSuggestionsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, new PromptSuggestionsViewHolder$bind$1(this), new PromptSuggestionsViewHolder$bind$2(this.tokenizedAnalytics));
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
