package ru.ozon.app.android.fresh.chat.actionHandlers;

import Pc.a;
import Tg.b;
import Vg.f;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/chat/actionHandlers/CheckFreshAIConversationStatusActionHandler;", "LVg/f;", "LPc/a;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusViewModel;", "viewModelProvider", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(LPc/a;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "LVg/f$a;", "getViewModel", "(LVg/f$a;)Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusViewModel;", "LTg/b;", "action", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "LPc/a;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckFreshAIConversationStatusActionHandler extends f {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final a<PromptStatusViewModel> viewModelProvider;

    public CheckFreshAIConversationStatusActionHandler(@NotNull a<PromptStatusViewModel> viewModelProvider, @NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.viewModelProvider = viewModelProvider;
        this.actionV2Repository = actionV2Repository;
        this.actionId = "checkFreshAIConversationStatus";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PromptStatusViewModel getViewModel(f.a aVar) {
        return (PromptStatusViewModel) new z0(aVar.b().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.chat.actionHandlers.CheckFreshAIConversationStatusActionHandler$getViewModel$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar2 = CheckFreshAIConversationStatusActionHandler.this.viewModelProvider;
                PromptStatusViewModel promptStatusViewModel = (PromptStatusViewModel) aVar2.get();
                Intrinsics.g(promptStatusViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return promptStatusViewModel;
            }
        }).a(PromptStatusViewModel.class);
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        AtomAction.ComposerAction composerAction = action instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) action : null;
        if (composerAction == null) {
            return;
        }
        C10727i.c(K.a(widgetInfo.a().e()), null, null, new CheckFreshAIConversationStatusActionHandler$processWidgetAction$1(this, composerAction, widgetInfo, null), 3);
    }
}
