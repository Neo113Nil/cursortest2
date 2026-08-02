package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModelProvider;
import com.socure.docv.capturesdk.common.analytics.MixPanelAgent;
import com.socure.docv.capturesdk.feature.orchestrator.LaunchCameraUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OpenFilePickerUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocUploadEvent;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocUploadVMFactory;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocUploadViewModelV2;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: UnstructuredDocUploadFragmentV2.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class UnstructuredDocUploadFragmentV2$onCreateView$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UnstructuredDocUploadFragmentV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnstructuredDocUploadFragmentV2$onCreateView$1$1(UnstructuredDocUploadFragmentV2 unstructuredDocUploadFragmentV2) {
        super(2);
        this.this$0 = unstructuredDocUploadFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        IUnstructuredDocUploadViewModel iUnstructuredDocUploadViewModel;
        IUnstructuredDocUploadViewModel iUnstructuredDocUploadViewModel2;
        String uploadDocumentButton;
        OpenFilePickerUseCase openFilePickerUseCase;
        LaunchCameraUseCase launchCameraUseCase;
        MixPanelAgent mixPanel;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(472173790, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2.onCreateView.<anonymous>.<anonymous> (UnstructuredDocUploadFragmentV2.kt:97)");
            }
            UnstructuredModuleModel model = this.this$0.getModel();
            if (model != null) {
                final UnstructuredDocUploadFragmentV2 unstructuredDocUploadFragmentV2 = this.this$0;
                iUnstructuredDocUploadViewModel = unstructuredDocUploadFragmentV2.viewModel;
                if (iUnstructuredDocUploadViewModel == null) {
                    openFilePickerUseCase = unstructuredDocUploadFragmentV2.getOpenFilePickerUseCase();
                    launchCameraUseCase = unstructuredDocUploadFragmentV2.getLaunchCameraUseCase();
                    mixPanel = unstructuredDocUploadFragmentV2.getMixPanel();
                    Object obj = new ViewModelProvider(unstructuredDocUploadFragmentV2, new UnstructuredDocUploadVMFactory(model, openFilePickerUseCase, launchCameraUseCase, mixPanel)).get((Class<Object>) UnstructuredDocUploadViewModelV2.class);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel");
                    unstructuredDocUploadFragmentV2.viewModel = (IUnstructuredDocUploadViewModel) obj;
                }
                iUnstructuredDocUploadViewModel2 = unstructuredDocUploadFragmentV2.viewModel;
                if (iUnstructuredDocUploadViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    iUnstructuredDocUploadViewModel2 = null;
                }
                final State collectAsState = SnapshotStateKt.collectAsState(iUnstructuredDocUploadViewModel2.getState(), null, composer, 8, 1);
                String document = invoke$lambda$2$lambda$0(collectAsState).getLabels().getDocument();
                String str = document == null ? "" : document;
                String primaryText = invoke$lambda$2$lambda$0(collectAsState).getLabels().getPrimaryText();
                String str2 = primaryText == null ? "" : primaryText;
                String secondaryText = invoke$lambda$2$lambda$0(collectAsState).getLabels().getSecondaryText();
                String tertiaryText = invoke$lambda$2$lambda$0(collectAsState).getLabels().getTertiaryText();
                SocureMultiStepScreenKt.SocureMultiStepScreen(new SocureMultiStepScreenState(str, str2, secondaryText, tertiaryText != null ? new TertiaryTextData(tertiaryText, null, 2, null) : null, (!invoke$lambda$2$lambda$0(collectAsState).getCanUpload() || (uploadDocumentButton = invoke$lambda$2$lambda$0(collectAsState).getLabels().getUploadDocumentButton()) == null) ? "" : uploadDocumentButton, invoke$lambda$2$lambda$0(collectAsState).getCanCapture() ? invoke$lambda$2$lambda$0(collectAsState).getLabels().getScanDocumentButton() : null, invoke$lambda$2$lambda$0(collectAsState).getTotalSteps(), invoke$lambda$2$lambda$0(collectAsState).getCurrentStep()), null, false, new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2$onCreateView$1$1$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IUnstructuredDocUploadViewModel.State invoke$lambda$2$lambda$0;
                        IUnstructuredDocUploadViewModel iUnstructuredDocUploadViewModel3;
                        invoke$lambda$2$lambda$0 = UnstructuredDocUploadFragmentV2$onCreateView$1$1.invoke$lambda$2$lambda$0(collectAsState);
                        if (invoke$lambda$2$lambda$0.getCanUpload()) {
                            iUnstructuredDocUploadViewModel3 = UnstructuredDocUploadFragmentV2.this.viewModel;
                            if (iUnstructuredDocUploadViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                iUnstructuredDocUploadViewModel3 = null;
                            }
                            iUnstructuredDocUploadViewModel3.onEvent(UnstructuredDocUploadEvent.UPLOAD_BUTTON_CLICKED);
                        }
                    }
                }, new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2$onCreateView$1$1$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        IUnstructuredDocUploadViewModel.State invoke$lambda$2$lambda$0;
                        IUnstructuredDocUploadViewModel iUnstructuredDocUploadViewModel3;
                        invoke$lambda$2$lambda$0 = UnstructuredDocUploadFragmentV2$onCreateView$1$1.invoke$lambda$2$lambda$0(collectAsState);
                        if (invoke$lambda$2$lambda$0.getCanCapture()) {
                            iUnstructuredDocUploadViewModel3 = UnstructuredDocUploadFragmentV2.this.viewModel;
                            if (iUnstructuredDocUploadViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                iUnstructuredDocUploadViewModel3 = null;
                            }
                            iUnstructuredDocUploadViewModel3.onEvent(UnstructuredDocUploadEvent.SCAN_BUTTON_CLICKED);
                        }
                    }
                }, new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2$onCreateView$1$1$1$5
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, composer, 196992, 2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IUnstructuredDocUploadViewModel.State invoke$lambda$2$lambda$0(State<IUnstructuredDocUploadViewModel.State> state) {
        return state.getValue();
    }
}
