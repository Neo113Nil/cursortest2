package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import Lm0.a;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import com.google.android.gms.common.Scopes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdfviewer.presentation.FileDownloaderViewModel;
import ru.ozon.app.android.travel.feature.oldwidgets.databinding.WidgetReportDocumentBinding;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentWidgetViewModel;
import ru.ozon.app.android.travel.molecules.fragment.dateSelector.TravelDateSelectorDialogFragment;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonDateInputView;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;
import ru.ozon.app.android.travel.utils.DebouncedTextWatcher;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0018J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J#\u0010*\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00022\n\u0010)\u001a\u00060'j\u0002`(H\u0014¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000e048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u0004\u0018\u0001088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "fileDownloaderViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "downloadZip", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "input", "Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;", "payLoad", "processInputUpdate", "(Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;Lru/ozon/app/android/travel/molecules/input/v1/InputPayload;)V", "showError", "()V", "Lru/ozon/uni/android/flashbar/model/Restriction;", "notification", "showNotification", "(Lru/ozon/uni/android/flashbar/model/Restriction;)V", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$ShowDateSelector;", "operation", "showDateSelector", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel$Operation$ShowDateSelector;)V", "observeAction", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdfviewer/presentation/FileDownloaderViewModel;", "Lru/ozon/app/android/travel/feature/oldwidgets/databinding/WidgetReportDocumentBinding;", "binding", "Lru/ozon/app/android/travel/feature/oldwidgets/databinding/WidgetReportDocumentBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentWidgetViewModel;", "viewModel", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReportDocumentWidgetViewHolder extends k<ReportDocumentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetReportDocumentBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final FileDownloaderViewModel fileDownloaderViewModel;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPayload.values().length];
            try {
                iArr[InputPayload.CHANGE_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputPayload.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDocumentWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull FileDownloaderViewModel fileDownloaderViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(fileDownloaderViewModel, "fileDownloaderViewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.fileDownloaderViewModel = fileDownloaderViewModel;
        WidgetReportDocumentBinding bind = WidgetReportDocumentBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new ReportDocumentWidgetViewHolder$actionHandler$1(this)).onComposerAction(new ReportDocumentWidgetViewHolder$actionHandler$2(this)).onClick(new ReportDocumentWidgetViewHolder$actionHandler$3(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void downloadZip(AtomAction.Click action) {
        Unit unit;
        r a11 = this.refs.getContainer().a();
        if (a11 != null) {
            String link = action.getLink();
            if (link != null) {
                this.fileDownloaderViewModel.downloadFile(link, false, a11, true, "zip");
                unit = Unit.f71690a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        a.f17149a.e("Activity was null", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReportDocumentWidgetViewModel getViewModel() {
        return (ReportDocumentWidgetViewModel) getWidgetViewModel();
    }

    private final void observeAction() {
        P<ReportDocumentWidgetViewModel.Operation> operationLiveData;
        P<ReportDocumentWidgetViewModel.UpdatedInput> updateInput;
        P<Boolean> progressLiveData;
        P<List<CommonInputVO>> submitInputsLiveData;
        ReportDocumentWidgetViewModel viewModel = getViewModel();
        if (viewModel != null && (submitInputsLiveData = viewModel.submitInputsLiveData()) != null) {
            submitInputsLiveData.observe(this, new ReportDocumentWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ReportDocumentWidgetViewHolder$observeAction$1(this)));
        }
        ReportDocumentWidgetViewModel viewModel2 = getViewModel();
        if (viewModel2 != null && (progressLiveData = viewModel2.progressLiveData()) != null) {
            progressLiveData.observe(this, new ReportDocumentWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ReportDocumentWidgetViewHolder$observeAction$2(this)));
        }
        ReportDocumentWidgetViewModel viewModel3 = getViewModel();
        if (viewModel3 != null && (updateInput = viewModel3.updateInput()) != null) {
            updateInput.observe(this, new ReportDocumentWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ReportDocumentWidgetViewHolder$observeAction$3(this)));
        }
        ReportDocumentWidgetViewModel viewModel4 = getViewModel();
        if (viewModel4 == null || (operationLiveData = viewModel4.operationLiveData()) == null) {
            return;
        }
        operationLiveData.observe(this, new ReportDocumentWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ReportDocumentWidgetViewHolder$observeAction$4(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInputUpdate(CommonInputVO input, InputPayload payLoad) {
        if (Intrinsics.d(input.getName(), Scopes.EMAIL)) {
            CommonInputVO.TextCommonInputVO textCommonInputVO = (CommonInputVO.TextCommonInputVO) input;
            if (payLoad == InputPayload.CHANGE_VALUE) {
                this.binding.reportDocumentEmailCDIV.updateValue(textCommonInputVO);
                return;
            } else {
                CommonTextInputView.bind$default(this.binding.reportDocumentEmailCDIV, textCommonInputVO, false, 2, null);
                return;
            }
        }
        CommonInputVO.DateCommonInputVO dateCommonInputVO = (CommonInputVO.DateCommonInputVO) input;
        CommonDateInputView commonDateInputView = Intrinsics.d(dateCommonInputVO.getName(), "fromDate") ? this.binding.reportDocumentFromDateCDIV : this.binding.reportDocumentToDateCDIV;
        Intrinsics.f(commonDateInputView);
        int i11 = payLoad == null ? -1 : WhenMappings.$EnumSwitchMapping$0[payLoad.ordinal()];
        if (i11 == 1) {
            commonDateInputView.updateValue(dateCommonInputVO);
        } else if (i11 != 2) {
            commonDateInputView.bind(dateCommonInputVO, new ReportDocumentWidgetViewHolder$processInputUpdate$1(this));
        } else {
            commonDateInputView.bindError(dateCommonInputVO);
        }
    }

    static /* synthetic */ void processInputUpdate$default(ReportDocumentWidgetViewHolder reportDocumentWidgetViewHolder, CommonInputVO commonInputVO, InputPayload inputPayload, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            inputPayload = null;
        }
        reportDocumentWidgetViewHolder.processInputUpdate(commonInputVO, inputPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDateSelector(ReportDocumentWidgetViewModel.Operation.ShowDateSelector operation) {
        TravelDateSelectorDialogFragment.INSTANCE.newInstance(operation.getSelectorTitle(), operation.getSelectedDay(), operation.getSelectedMonth(), operation.getSelectedYear(), operation.getStartDateMillis(), operation.getEndDateMillis(), true).show(this.refs.getContainer().k(), "TravelDateSelectorDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError() {
        C4911f container = this.refs.getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(Restriction notification) {
        ViewGroup rootView = ContextExtKt.getRootView(this.refs.getContainer().a());
        if (rootView != null) {
            RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(notification), this.refs.getContainer().g(), null, null, null, null, null, 248, null);
        }
    }

    @NotNull
    public final View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        observeAction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReportDocumentVO item, @NotNull d info) {
        ComponentCallbacksC5392m c11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Group dateGroupG = this.binding.dateGroupG;
        Intrinsics.checkNotNullExpressionValue(dateGroupG, "dateGroupG");
        dateGroupG.setVisibility(item.getIsDateVisible() ? 0 : 8);
        CommonTextInputView reportDocumentEmailCDIV = this.binding.reportDocumentEmailCDIV;
        Intrinsics.checkNotNullExpressionValue(reportDocumentEmailCDIV, "reportDocumentEmailCDIV");
        reportDocumentEmailCDIV.setVisibility(item.getIsEmailVisible() ? 0 : 8);
        if (item.getEmail() != null) {
            this.binding.reportDocumentEmailCDIV.setTextWatcher(new DebouncedTextWatcher(0L, null, new ReportDocumentWidgetViewHolder$bind$1$1(this, item), 3, null));
        }
        if (item.getIsDateVisible() && (c11 = this.refs.getContainer().c()) != null) {
            C5402x.b(c11, "84655", new ReportDocumentWidgetViewHolder$bind$1$3(this));
        }
        TextAtomView reportDocumentTitleTAV = this.binding.reportDocumentTitleTAV;
        Intrinsics.checkNotNullExpressionValue(reportDocumentTitleTAV, "reportDocumentTitleTAV");
        TextAtomHolderKt.bind$default(reportDocumentTitleTAV, item.getTitle(), null, 2, null);
        TextAtomView reportDocumentTextTAV = this.binding.reportDocumentTextTAV;
        Intrinsics.checkNotNullExpressionValue(reportDocumentTextTAV, "reportDocumentTextTAV");
        TextAtomHolderKt.bind$default(reportDocumentTextTAV, item.getText(), null, 2, null);
        LargeButtonView reportDocumentButtonLBV = this.binding.reportDocumentButtonLBV;
        Intrinsics.checkNotNullExpressionValue(reportDocumentButtonLBV, "reportDocumentButtonLBV");
        LargeButtonHolderKt.bind(reportDocumentButtonLBV, item.getButton(), this.actionHandler);
        ReportDocumentWidgetViewModel viewModel = getViewModel();
        if (viewModel != null) {
            CommonInputVO[] elements = {item.getFromDate(), item.getToDate(), item.getEmail()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            viewModel.bindInputs(C7705l.B(elements));
        }
    }
}
