package ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import El.C2971a;
import android.view.ViewGroup;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.comparison.AddToComparisonResponse;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.AddToComparisonViewModel;
import ru.ozon.app.android.pdp.ui.configurators.comparison.viewModel.ComparisonRefreshViewModel;
import ru.ozon.app.android.pdpoldwidgets.R$string;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetAddToComparisonButtonBinding;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00130$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetAddToComparisonButtonBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/AddToComparisonViewModel;", "viewModel", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/ComparisonRefreshViewModel;", "refreshViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetAddToComparisonButtonBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/AddToComparisonViewModel;Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/ComparisonRefreshViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "", "params", "", "addToComparison", "(Ljava/util/Map;)V", "Lru/ozon/app/android/comparison/AddToComparisonResponse;", "result", "showError", "(Lru/ozon/app/android/comparison/AddToComparisonResponse;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonVO;Ll20/d;)V", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetAddToComparisonButtonBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/AddToComparisonViewModel;", "Lru/ozon/app/android/pdp/ui/configurators/comparison/viewModel/ComparisonRefreshViewModel;", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddToComparisonButtonViewHolder extends k<AddToComparisonButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PdpWidgetAddToComparisonButtonBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;
    private AddToComparisonButtonVO item;

    @NotNull
    private final ComparisonRefreshViewModel refreshViewModel;

    @NotNull
    private final AddToComparisonViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddToComparisonButtonViewHolder(@NotNull PdpWidgetAddToComparisonButtonBinding binding, @NotNull ComposerReferences composerReferences, @NotNull AddToComparisonViewModel viewModel, @NotNull ComparisonRefreshViewModel refreshViewModel, @NotNull HandlersInhibitor handlersInhibitor) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refreshViewModel, "refreshViewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        SingleAtom constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerReferences = composerReferences;
        this.viewModel = viewModel;
        this.refreshViewModel = refreshViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).enableClickThrottling(handlersInhibitor).onComposerAction(new AddToComparisonButtonViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        binding.pdpAddToComparisonSAL.setOnAction(buildHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addToComparison(Map<String, String> params) {
        C2399j.C(new C(new C2408n0(this.viewModel.addToComparison(params), new AddToComparisonButtonViewHolder$addToComparison$1(this, null)), new AddToComparisonButtonViewHolder$addToComparison$2(this, null)), x0.a(this.viewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(AddToComparisonResponse result) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        NotificationDTO createNetworkErrorNotificationDTO$default;
        String message;
        ViewGroup b11 = C2971a.b(this.composerReferences);
        if (b11 == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(b11, null, 1, null)) == null) {
            return;
        }
        if (result == null || (message = result.getMessage()) == null) {
            createNetworkErrorNotificationDTO$default = NotificationBarHelperKt.createNetworkErrorNotificationDTO$default(false, 1, null);
        } else {
            createNetworkErrorNotificationDTO$default = new NotificationDTO(message, null, null, null, null, result.getDeeplink() != null ? new NotificationDTO.RightContent(NotificationDTO.RightContent.ButtonType.BUTTON, new ButtonV3DTO(ButtonV3DTO.StyleTypes.CUSTOM, ButtonV3DTO.Sizes.SIZE_400, StringProvider.getString(R$string.pdp_common_redirect), null, null, null, null, UniColors.TEXT_ACTION_INVERTED.getToken(), null, null, null, null, UniColors.BG_ACTION_SECONDARY_INVERTED.getToken(), new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, result.getDeeplink(), null, null, 12, null), null, null, 6, null), null, null, null, null, 249720, null), null, null, 12, null) : null, null, null, null, NotificationDTO.Preset.WARNING, 478, null);
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, createNetworkErrorNotificationDTO$default, this.composerReferences.getContainer().g(), this.actionHandler).show();
    }

    static /* synthetic */ void showError$default(AddToComparisonButtonViewHolder addToComparisonButtonViewHolder, AddToComparisonResponse addToComparisonResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addToComparisonResponse = null;
        }
        addToComparisonButtonViewHolder.showError(addToComparisonResponse);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddToComparisonButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        SingleAtom.bind$default(this.binding.pdpAddToComparisonSAL, item.getIsAddedToComparison() ? item.getGoToComparisonCell() : item.getAddToComparisonCell(), false, 2, null);
    }
}
