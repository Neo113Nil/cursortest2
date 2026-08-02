package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetVerificationEdoCheckingOperatorBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 $2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001$B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetVerificationEdoCheckingOperatorBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetVerificationEdoCheckingOperatorBinding;Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorViewModel;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "", "showNotificationBar", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetVerificationEdoCheckingOperatorBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerificationEdoCheckingOperatorViewHolder extends k<VerificationEdoCheckingOperatorVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetVerificationEdoCheckingOperatorBinding binding;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final VerificationEdoCheckingOperatorViewModel viewModel;
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VerificationEdoCheckingOperatorViewHolder(@NotNull WidgetVerificationEdoCheckingOperatorBinding binding, @NotNull VerificationEdoCheckingOperatorViewModel viewModel, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new VerificationEdoCheckingOperatorViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onComposerAction(new VerificationEdoCheckingOperatorViewHolder$actionHandler$2(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$showNotificationBar(VerificationEdoCheckingOperatorViewHolder verificationEdoCheckingOperatorViewHolder, NotificationDTO notificationDTO, kotlin.coroutines.d dVar) {
        verificationEdoCheckingOperatorViewHolder.showNotificationBar(notificationDTO);
        return Unit.f71690a;
    }

    private final void showNotificationBar(NotificationDTO notification) {
        r a11;
        ViewGroup rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        if (notification == null || (a11 = this.references.getContainer().a()) == null || (rootView = ContextExtKt.getRootView(a11)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, this.references.getContainer().i(), this.actionHandler).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getNotificationBar(), new VerificationEdoCheckingOperatorViewHolder$onAttachViewModel$1(this)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getVerificationStarted(), new VerificationEdoCheckingOperatorViewHolder$onAttachViewModel$2(this, null)), K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull VerificationEdoCheckingOperatorVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetVerificationEdoCheckingOperatorBinding widgetVerificationEdoCheckingOperatorBinding = this.binding;
        TextAtomV2View name = widgetVerificationEdoCheckingOperatorBinding.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        TextHolderKt.bind$default(name, item.getName(), null, 2, null);
        CellView fnsParticipantIdCell = widgetVerificationEdoCheckingOperatorBinding.fnsParticipantIdCell;
        Intrinsics.checkNotNullExpressionValue(fnsParticipantIdCell, "fnsParticipantIdCell");
        CellHolderKt.bindOrGone(fnsParticipantIdCell, item.getFnsParticipantId(), this.actionHandler);
        CellView documentCell = widgetVerificationEdoCheckingOperatorBinding.documentCell;
        Intrinsics.checkNotNullExpressionValue(documentCell, "documentCell");
        CellHolderKt.bindOrGone(documentCell, item.getDoc(), this.actionHandler);
        ButtonV3View button = widgetVerificationEdoCheckingOperatorBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ButtonV3HolderKt.bind(button, item.getButton(), this.actionHandler);
    }
}
