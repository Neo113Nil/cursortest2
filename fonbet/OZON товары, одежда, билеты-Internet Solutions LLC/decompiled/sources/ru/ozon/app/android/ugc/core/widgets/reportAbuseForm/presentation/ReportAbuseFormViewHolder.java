package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.os.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResult;
import ru.ozon.app.android.ugc.core.widgets.common.UgcCachedActionsSharedViewModel;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00120-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormVO;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel;", "viewModel", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "ugcCachedActionsSharedViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel;Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "Lru/ozon/uni/atoms/data/cell/RadioTitleSubtitleCellDTO;", "reasons", "", "initReportAction", "(Ljava/util/List;)V", "", "isAdding", "addOrRemoveKeyboardListener", "(Z)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResult;", "result", "setResult", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResult;)V", "onAttach", "()V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormVO;Ll20/d;)V", "onDetach", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel;", "Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "keyboardVisibilityListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReportAbuseFormViewHolder extends k<ReportAbuseFormVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener keyboardVisibilityListener;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel;

    @NotNull
    private final ReportAbuseFormView view;

    @NotNull
    private final ReportAbuseFormViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseFormViewHolder(@NotNull ReportAbuseFormView view, @NotNull ComposerReferences refs, @NotNull ReportAbuseFormViewModel viewModel, @NotNull UgcCachedActionsSharedViewModel ugcCachedActionsSharedViewModel, @NotNull HandlersInhibitor handlersInhibitor) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(ugcCachedActionsSharedViewModel, "ugcCachedActionsSharedViewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.view = view;
        this.refs = refs;
        this.viewModel = viewModel;
        this.ugcCachedActionsSharedViewModel = ugcCachedActionsSharedViewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).onComposerAction(new ReportAbuseFormViewHolder$actionHandler$1(this)).onClick(new ReportAbuseFormViewHolder$actionHandler$2(this)).buildHandler();
        this.keyboardVisibilityListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: UU.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ReportAbuseFormViewHolder.keyboardVisibilityListener$lambda$2(ReportAbuseFormViewHolder.this);
            }
        };
    }

    private final void addOrRemoveKeyboardListener(boolean isAdding) {
        if (isAdding) {
            this.view.getViewTreeObserver().addOnGlobalLayoutListener(this.keyboardVisibilityListener);
        } else {
            this.view.getViewTreeObserver().removeOnGlobalLayoutListener(this.keyboardVisibilityListener);
        }
    }

    private final void initReportAction(List<RadioTitleSubtitleCellDTO> reasons) {
        Object obj;
        CommonCellSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        Iterator<T> it = reasons.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            RadioDTO radio = ((RadioTitleSubtitleCellDTO) obj).getRadio();
            if (radio != null ? Intrinsics.d(radio.isSelected(), Boolean.TRUE) : false) {
                break;
            }
        }
        RadioTitleSubtitleCellDTO radioTitleSubtitleCellDTO = (RadioTitleSubtitleCellDTO) obj;
        if (radioTitleSubtitleCellDTO == null || (common = radioTitleSubtitleCellDTO.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        if ((atomAction instanceof AtomAction.ComposerAction) || (atomAction instanceof AtomAction.Click)) {
            this.viewModel.onViewIntent(new ReportAbuseFormViewModel.ViewIntent.ReasonChanged(atomAction));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keyboardVisibilityListener$lambda$2(ReportAbuseFormViewHolder reportAbuseFormViewHolder) {
        View view;
        C5353y0 n11 = Y.n(reportAbuseFormViewHolder.view);
        if (n11 == null) {
            return;
        }
        int i11 = n11.f(8).f42129d - n11.f(2).f42129d;
        Integer valueOf = Integer.valueOf(i11);
        if (i11 < 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        boolean p11 = n11.p(8);
        ComponentCallbacksC5392m c11 = reportAbuseFormViewHolder.refs.getContainer().c();
        if (c11 != null && (view = c11.getView()) != null) {
            ViewExtKt.updatePadding$default(ComposerViewExtensionKt.composerContainer(view), 0, 0, 0, intValue, 7, null);
            ComposerViewExtensionKt.composerRecyclerView(view).scrollBy(0, intValue);
        }
        if (p11) {
            reportAbuseFormViewHolder.view.requestEditTextFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setResult(ReportAbuseResult result) {
        G supportFragmentManager;
        r a11 = this.refs.getContainer().a();
        if (a11 != null && (supportFragmentManager = a11.getSupportFragmentManager()) != null) {
            supportFragmentManager.m1(d.b(new Pair("report_abuse_action_result_key", result)), "report_abuse_report_key");
        }
        this.refs.getNavigator().popBackStack();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        addOrRemoveKeyboardListener(true);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        C10727i.c(K.a(lifecycle), null, null, new ReportAbuseFormViewHolder$onAttachViewModel$1(this, null), 3);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        addOrRemoveKeyboardListener(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReportAbuseFormVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        initReportAction(item.getAbuseReasons());
        this.view.bind(item, this.actionHandler);
    }
}
