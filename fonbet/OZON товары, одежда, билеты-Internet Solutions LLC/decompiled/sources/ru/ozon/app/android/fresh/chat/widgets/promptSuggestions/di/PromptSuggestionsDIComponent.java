package ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di;

import GV.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.chat.viewModels.FreshAISharedViewModel;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.data.PromptSuggestionsMapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u0001\u0015R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00060\fj\u0002`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/di/PromptSuggestionsDIComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/data/PromptSuggestionsMapper;", "getMapper", "()Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/data/PromptSuggestionsMapper;", "mapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/fresh/chat/viewModels/FreshAISharedViewModel;", "getSharedViewModel", "()Lru/ozon/app/android/fresh/chat/viewModels/FreshAISharedViewModel;", "sharedViewModel", "Companion", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PromptSuggestionsDIComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/di/PromptSuggestionsDIComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/chat/widgets/promptSuggestions/di/PromptSuggestionsDIComponent;", "create", "(Lk20/g;)Lk20/e;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PromptSuggestionsDIComponent create$lambda$0(final C7475g c7475g) {
            return new PromptSuggestionsDIComponent() { // from class: ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di.PromptSuggestionsDIComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(PromptSuggestionsDIComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di.PromptSuggestionsDIComponent
                public d getCustomActionHandlersStoreFactory() {
                    return ((CustomActionHandlersComponentApi) C7475g.this.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di.PromptSuggestionsDIComponent
                public PromptSuggestionsMapper getMapper() {
                    return (PromptSuggestionsMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di.PromptSuggestionsDIComponent
                public FreshAISharedViewModel getSharedViewModel() {
                    return new FreshAISharedViewModel();
                }

                @Override // ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di.PromptSuggestionsDIComponent
                public l getTokenizedAnalytics() {
                    return ((RetainComposerComponentApi) C7475g.this.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<PromptSuggestionsDIComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(PromptSuggestionsDIComponent.class), new a(storage, 1));
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    PromptSuggestionsMapper getMapper();

    @NotNull
    FreshAISharedViewModel getSharedViewModel();

    @NotNull
    l getTokenizedAnalytics();
}
