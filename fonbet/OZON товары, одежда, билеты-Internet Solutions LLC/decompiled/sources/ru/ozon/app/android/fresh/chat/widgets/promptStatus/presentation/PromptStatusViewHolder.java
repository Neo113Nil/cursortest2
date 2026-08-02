package ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Sc.InterfaceC4008j;
import Sc.o;
import Vg.c;
import Vg.d;
import WZ.l;
import WZ.t;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.chat.databinding.PromptStatusWidgetBinding;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.presentation.PromptStatusState;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerFrameLayout;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R'\u00100\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00130+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/chat/databinding/PromptStatusWidgetBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "actionHandlersFactory", "<init>", "(Lru/ozon/app/android/fresh/chat/databinding/PromptStatusWidgetBinding;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusViewModel;LVg/d;)V", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState;", "state", "", "bindState", "(Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusState;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/chat/databinding/PromptStatusWidgetBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/fresh/chat/widgets/promptStatus/presentation/PromptStatusViewModel;", "LVg/d;", "LVg/c;", "customActionHandlersStore$delegate", "LSc/j;", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "", "isActionHandlingBlocked", "Z", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromptStatusViewHolder extends k<PromptStatusVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final d actionHandlersFactory;

    @NotNull
    private final PromptStatusWidgetBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStore;
    private boolean isActionHandlingBlocked;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PromptStatusViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PromptStatusViewHolder(@NotNull PromptStatusWidgetBinding binding, @NotNull ComposerReferences composerReferences, @NotNull l tokenizedAnalytics, @NotNull PromptStatusViewModel viewModel, @NotNull d actionHandlersFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(actionHandlersFactory, "actionHandlersFactory");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerReferences = composerReferences;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.actionHandlersFactory = actionHandlersFactory;
        this.customActionHandlersStore = Sc.k.b(new PromptStatusViewHolder$customActionHandlersStore$2(this));
        this.actionHandler = Sc.k.b(new PromptStatusViewHolder$actionHandler$2(this));
    }

    private final void bindState(PromptStatusState state) {
        PromptStatusVO boundData;
        t tokenizedEvent;
        if (state instanceof PromptStatusState.Initial) {
            IconView iconView = this.binding.iconView;
            Intrinsics.checkNotNullExpressionValue(iconView, "iconView");
            ViewExtKt.gone(iconView);
            TextAtomV2View titleView = this.binding.titleView;
            Intrinsics.checkNotNullExpressionValue(titleView, "titleView");
            ViewExtKt.gone(titleView);
            IconButtonV3View refreshButton = this.binding.refreshButton;
            Intrinsics.checkNotNullExpressionValue(refreshButton, "refreshButton");
            ViewExtKt.gone(refreshButton);
            ShimmerFrameLayout shimmerView = this.binding.shimmerView;
            Intrinsics.checkNotNullExpressionValue(shimmerView, "shimmerView");
            ViewExtKt.gone(shimmerView);
            this.isActionHandlingBlocked = true;
        } else if (state instanceof PromptStatusState.Progress) {
            IconButtonV3View refreshButton2 = this.binding.refreshButton;
            Intrinsics.checkNotNullExpressionValue(refreshButton2, "refreshButton");
            ViewExtKt.gone(refreshButton2);
            ShimmerFrameLayout shimmerView2 = this.binding.shimmerView;
            Intrinsics.checkNotNullExpressionValue(shimmerView2, "shimmerView");
            ViewExtKt.show(shimmerView2);
            IconView iconView2 = this.binding.iconView;
            Intrinsics.checkNotNullExpressionValue(iconView2, "iconView");
            PromptStatusState.Progress progress = (PromptStatusState.Progress) state;
            IconHolderKt.bindOrGone$default(iconView2, progress.getLoadingIcon(), null, 2, null);
            TextAtomV2View titleView2 = this.binding.titleView;
            Intrinsics.checkNotNullExpressionValue(titleView2, "titleView");
            TextHolderKt.bindOrGone$default(titleView2, progress.getLoadingTitle(), null, 2, null);
            this.isActionHandlingBlocked = false;
        } else {
            if (!(state instanceof PromptStatusState.Error)) {
                throw new o();
            }
            PromptStatusVO boundData2 = getBoundData();
            if (boundData2 == null) {
                return;
            }
            ShimmerFrameLayout shimmerView3 = this.binding.shimmerView;
            Intrinsics.checkNotNullExpressionValue(shimmerView3, "shimmerView");
            ViewExtKt.gone(shimmerView3);
            IconView iconView3 = this.binding.iconView;
            Intrinsics.checkNotNullExpressionValue(iconView3, "iconView");
            IconHolderKt.bindOrGone$default(iconView3, boundData2.getErrorIcon(), null, 2, null);
            TextAtomV2View titleView3 = this.binding.titleView;
            Intrinsics.checkNotNullExpressionValue(titleView3, "titleView");
            TextHolderKt.bindOrGone$default(titleView3, boundData2.getErrorTitle(), null, 2, null);
            IconButtonV3View refreshButton3 = this.binding.refreshButton;
            Intrinsics.checkNotNullExpressionValue(refreshButton3, "refreshButton");
            IconButtonV3HolderKt.bindOrGone(refreshButton3, boundData2.getRefreshButton(), new PromptStatusViewHolder$bindState$1(this));
            this.isActionHandlingBlocked = false;
        }
        Unit unit = Unit.f71690a;
        if ((!(state instanceof PromptStatusState.Progress) && !(state instanceof PromptStatusState.Error)) || (boundData = getBoundData()) == null || (tokenizedEvent = boundData.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$bindState(PromptStatusViewHolder promptStatusViewHolder, PromptStatusState promptStatusState, kotlin.coroutines.d dVar) {
        promptStatusViewHolder.bindState(promptStatusState);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$suspendConversion0(Function1 function1, AtomAction atomAction, kotlin.coroutines.d dVar) {
        function1.invoke(atomAction);
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        M0<PromptStatusState> state = this.viewModel.getState();
        AbstractC5434v lifecycle2 = lifecycle.getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(C5427n.a(state, lifecycle2, bVar), new PromptStatusViewHolder$onAttachViewModel$1(this)), K.a(lifecycle));
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.getActions(), lifecycle.getLifecycle(), bVar), new PromptStatusViewHolder$onAttachViewModel$2(getActionHandler())), K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PromptStatusVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.titleView.setTextIsSelectable(false);
        this.viewModel.bindState(item);
    }
}
