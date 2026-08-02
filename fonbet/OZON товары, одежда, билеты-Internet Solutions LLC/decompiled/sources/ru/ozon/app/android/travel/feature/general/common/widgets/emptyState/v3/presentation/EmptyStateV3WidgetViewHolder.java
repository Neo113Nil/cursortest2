package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import java.util.HashMap;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarDelegate;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3UiState;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.view.EmptyStateV3View;
import ru.ozon.app.android.travel.utils.helpers.BackPressedHelper;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.app.android.travel.utils.placeholder.PlaceholderParser;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010/\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R`\u0010;\u001aN\u0012\u0004\u0012\u000207\u0012\u001c\u0012\u001a\u0012\b\u0012\u000608j\u0002`90\u0001j\f\u0012\b\u0012\u000608j\u0002`9`\u000306j&\u0012\u0004\u0012\u000207\u0012\u001c\u0012\u001a\u0012\b\u0012\u000608j\u0002`90\u0001j\f\u0012\b\u0012\u000608j\u0002`9`\u0003`:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "view", "Ll10/i;", "composerScreenUiContainer", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Ll10/i;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3ViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState;", "state", "", "handleError", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3UiState;)V", "handleButtonLoader", "handleAction", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "onDetach", "onRecycle", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3ViewModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/view/EmptyStateV3View;", "containerView", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/view/EmptyStateV3View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "notificationBarDelegate$delegate", "LSc/j;", "getNotificationBarDelegate", "()Lru/ozon/app/android/travel/actionhandler/utils/NotificationBarDelegate;", "notificationBarDelegate", "Lru/ozon/app/android/travel/utils/helpers/BackPressedHelper;", "backPressedHelper", "Lru/ozon/app/android/travel/utils/helpers/BackPressedHelper;", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "currentPlaceholder", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "Ljava/util/HashMap;", "", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "nestedWidgetsManager", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "getComposerContainer", "()Ll10/i;", "composerContainer", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV3WidgetViewHolder extends k<EmptyStateV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BackPressedHelper backPressedHelper;
    private final i composerScreenUiContainer;

    @NotNull
    private final EmptyStateV3View containerView;

    @NotNull
    private Placeholder currentPlaceholder;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;

    @NotNull
    private final NestedWidgetsManager nestedWidgetsManager;

    /* renamed from: notificationBarDelegate$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j notificationBarDelegate;

    @NotNull
    private final PlaceholderParser placeholderParser;

    @NotNull
    private final EmptyStateV3ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV3WidgetViewHolder(@NotNull View view, i iVar, @NotNull EmptyStateV3ViewModel viewModel, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.composerScreenUiContainer = iVar;
        this.viewModel = viewModel;
        EmptyStateV3View emptyStateV3View = (EmptyStateV3View) view;
        this.containerView = emptyStateV3View;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onComposerAction(new EmptyStateV3WidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        this.notificationBarDelegate = LazyUtilsKt.unsafeLazy(new EmptyStateV3WidgetViewHolder$notificationBarDelegate$2(refs, this));
        this.backPressedHelper = new BackPressedHelper(buildHandler, refs.getContainer().a(), refs.getContainer().g());
        this.currentPlaceholder = Placeholder.INSTANCE.getEMPTY();
        this.currentViewHolders = new HashMap<>();
        this.placeholderParser = new PlaceholderParser("content");
        NestedWidgetsManager nestedWidgetsManager = new NestedWidgetsManager(getComposerContainer(), refs.getWidgetsFactory(), getComposerContainer().c0());
        nestedWidgetsManager.setContainer(emptyStateV3View.getContentView());
        this.nestedWidgetsManager = nestedWidgetsManager;
    }

    private final i getComposerContainer() {
        i iVar = this.composerScreenUiContainer;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("ComposerScreenUiContainer is null");
    }

    private final NotificationBarDelegate getNotificationBarDelegate() {
        return (NotificationBarDelegate) this.notificationBarDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(EmptyStateV3UiState state) {
        NotificationBarDelegate notificationBarDelegate;
        EmptyStateV3UiState.Action action = state.getAction();
        if (action != null) {
            NotificationDTO notification = action.getNotification();
            if (notification != null && (notificationBarDelegate = getNotificationBarDelegate()) != null) {
                notificationBarDelegate.show(notification);
            }
            this.actionHandler.invoke(action.getAtomAction());
            this.viewModel.clearActionState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleButtonLoader(EmptyStateV3UiState state) {
        if (state.getIsButtonLoaderVisible()) {
            this.containerView.showButtonLoader(state.getButtonId());
        } else if (state.getButtonId() != null) {
            this.containerView.hideButtonLoader(state.getButtonId(), new EmptyStateV3WidgetViewHolder$handleButtonLoader$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(EmptyStateV3UiState state) {
        if (state.getIsError()) {
            NotificationBarDelegate notificationBarDelegate = getNotificationBarDelegate();
            if (notificationBarDelegate != null) {
                notificationBarDelegate.showDefaultError();
            }
            this.viewModel.clearErrorState();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C(new C2408n0(C5427n.a(this.viewModel.getUiState(), getLifecycle(), AbstractC5434v.b.STARTED), new EmptyStateV3WidgetViewHolder$onAttach$1(this, null)), new EmptyStateV3WidgetViewHolder$onAttach$2(null)), H.a(getLifecycle()));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.nestedWidgetsManager.detachNestedViewHolders(this.currentViewHolders);
        this.backPressedHelper.removeCallback();
        super.onDetach();
    }

    @Override // jk0.j
    public void onRecycle() {
        this.nestedWidgetsManager.detachNestedViewHolders(this.currentViewHolders);
        super.onRecycle();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        EmptyStateV3VO boundData = getBoundData();
        if (boundData == null || !boundData.getIsFullAppearance()) {
            return;
        }
        int height = info.a().e().height();
        View view = this.itemView;
        if (view.getHeight() != height && height > view.getMeasuredHeight() && height > 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = height;
            view.setLayoutParams(layoutParams);
        }
        if (view.getHeight() == view.getMeasuredHeight() || height >= view.getMeasuredHeight() || height <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = view.getMeasuredHeight();
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EmptyStateV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Placeholder parsePlaceholders = this.placeholderParser.parsePlaceholders(getViewItem(), this.currentPlaceholder);
        this.currentPlaceholder = parsePlaceholders;
        this.nestedWidgetsManager.addNestedWidgets(parsePlaceholders, this.currentViewHolders);
        this.containerView.bind(item, this.actionHandler);
        this.backPressedHelper.addCallback(item.getOnBackPressedAction());
    }
}
