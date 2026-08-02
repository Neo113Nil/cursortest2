package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.analytics.MixPanelAgent;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.common.workers.ImageWorker;
import com.socure.docv.capturesdk.databinding.FragmentUnstructuredDocSocureBinding;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.feature.orchestrator.LaunchCameraUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OpenFilePickerUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocUploadEvent;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocUploadVMFactory;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocUploadViewModel;
import com.socure.docv.capturesdk.models.PrimaryModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: UnstructuredDocUploadFragment.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0003J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u001a\u00101\u001a\u00020(2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\n0\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocUploadFragment;", "Landroidx/fragment/app/Fragment;", "()V", "component", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "getComponent", "()Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "filePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "launchCameraUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/LaunchCameraUseCase;", "getLaunchCameraUseCase", "()Lcom/socure/docv/capturesdk/feature/orchestrator/LaunchCameraUseCase;", "launchCameraUseCase$delegate", "Lkotlin/Lazy;", "mixPanel", "Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;", "getMixPanel", "()Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;", "mixPanel$delegate", "model", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "openFilePickerUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OpenFilePickerUseCase;", "getOpenFilePickerUseCase", "()Lcom/socure/docv/capturesdk/feature/orchestrator/OpenFilePickerUseCase;", "openFilePickerUseCase$delegate", "requestPermissionLauncher", "kotlin.jvm.PlatformType", "startSessionModel", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionModel", "()Lcom/socure/docv/capturesdk/models/StartSessionModel;", "takePicture", "Ljava/lang/Void;", "viewModel", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel;", "bindUnstructuredDocModel", "", "binding", "Lcom/socure/docv/capturesdk/databinding/FragmentUnstructuredDocSocureBinding;", "state", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel$State;", "handleSelectedFile", "uri", "Landroid/net/Uri;", "observeViewModel", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnstructuredDocUploadFragment extends Fragment {
    public static final String MODEL = "model";
    private final ActivityResultLauncher<String[]> filePickerLauncher;

    /* renamed from: launchCameraUseCase$delegate, reason: from kotlin metadata */
    private final Lazy launchCameraUseCase;

    /* renamed from: mixPanel$delegate, reason: from kotlin metadata */
    private final Lazy mixPanel;
    private UnstructuredModuleModel model;

    /* renamed from: openFilePickerUseCase$delegate, reason: from kotlin metadata */
    private final Lazy openFilePickerUseCase;
    private final ActivityResultLauncher<String> requestPermissionLauncher;
    private final ActivityResultLauncher<Void> takePicture;
    private IUnstructuredDocUploadViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UnstructuredDocUploadFragment() {
        super(R.layout.fragment_unstructured_doc_socure);
        this.mixPanel = LazyKt.lazy(new Function0<MixPanelAgent>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$mixPanel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MixPanelAgent invoke() {
                OrchestratorActivityComponent component;
                component = UnstructuredDocUploadFragment.this.getComponent();
                return new MixPanelAgent(component.getRepoHolder().getMixPanelRepository(), new UnstructuredDocUploadFragment$mixPanel$2$invoke$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE));
            }
        });
        ActivityResultLauncher<String[]> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.OpenDocument(), new ActivityResultCallback<Uri>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$filePickerLauncher$1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Uri uri) {
                if (uri != null) {
                    UnstructuredDocUploadFragment.this.handleSelectedFile(uri);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.filePickerLauncher = registerForActivityResult;
        ActivityResultLauncher<Void> registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.TakePicturePreview(), new ActivityResultCallback<Bitmap>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$takePicture$1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Bitmap bitmap) {
                Context applicationContext = UnstructuredDocUploadFragment.this.requireActivity().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
                Uri saveToDisk = new ImageWorker(applicationContext, null, 2, null).saveToDisk(bitmap, "JPG");
                if (saveToDisk != null) {
                    UnstructuredDocUploadFragment.this.handleSelectedFile(saveToDisk);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResul…)\n            }\n        }");
        this.takePicture = registerForActivityResult2;
        ActivityResultLauncher<String> registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$requestPermissionLauncher$1
            @Override // androidx.activity.result.ActivityResultCallback
            public /* bridge */ /* synthetic */ void onActivityResult(Boolean bool) {
                onActivityResult(bool.booleanValue());
            }

            public final void onActivityResult(boolean z) {
                LaunchCameraUseCase launchCameraUseCase;
                launchCameraUseCase = UnstructuredDocUploadFragment.this.getLaunchCameraUseCase();
                launchCameraUseCase.handlePermissionResult(z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResul…sult(isGranted)\n        }");
        this.requestPermissionLauncher = registerForActivityResult3;
        this.openFilePickerUseCase = LazyKt.lazy(new Function0<OpenFilePickerUseCase>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$openFilePickerUseCase$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final OpenFilePickerUseCase invoke() {
                ActivityResultLauncher activityResultLauncher;
                FragmentActivity requireActivity = UnstructuredDocUploadFragment.this.requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity");
                activityResultLauncher = UnstructuredDocUploadFragment.this.filePickerLauncher;
                return new OpenFilePickerUseCase((OrchestratorActivity) requireActivity, activityResultLauncher);
            }
        });
        this.launchCameraUseCase = LazyKt.lazy(new Function0<LaunchCameraUseCase>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$launchCameraUseCase$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LaunchCameraUseCase invoke() {
                ActivityResultLauncher activityResultLauncher;
                ActivityResultLauncher activityResultLauncher2;
                StartSessionModel startSessionModel;
                Context requireContext = UnstructuredDocUploadFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                activityResultLauncher = UnstructuredDocUploadFragment.this.takePicture;
                activityResultLauncher2 = UnstructuredDocUploadFragment.this.requestPermissionLauncher;
                startSessionModel = UnstructuredDocUploadFragment.this.getStartSessionModel();
                return new LaunchCameraUseCase(requireContext, activityResultLauncher, activityResultLauncher2, startSessionModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrchestratorActivityComponent getComponent() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity");
        return ((OrchestratorActivity) requireActivity).getComponent();
    }

    private final MixPanelAgent getMixPanel() {
        return (MixPanelAgent) this.mixPanel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StartSessionModel getStartSessionModel() {
        return getComponent().getStartSessionCache().get();
    }

    private final OpenFilePickerUseCase getOpenFilePickerUseCase() {
        return (OpenFilePickerUseCase) this.openFilePickerUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LaunchCameraUseCase getLaunchCameraUseCase() {
        return (LaunchCameraUseCase) this.launchCameraUseCase.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        UnstructuredModuleModel unstructuredModuleModel = this.model;
        if (unstructuredModuleModel != null) {
            Object obj = new ViewModelProvider(this, new UnstructuredDocUploadVMFactory(unstructuredModuleModel, getOpenFilePickerUseCase(), getLaunchCameraUseCase(), getMixPanel())).get((Class<Object>) UnstructuredDocUploadViewModel.class);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel");
            this.viewModel = (IUnstructuredDocUploadViewModel) obj;
        }
        FragmentUnstructuredDocSocureBinding bind = FragmentUnstructuredDocSocureBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(view)");
        observeViewModel(bind);
    }

    private final void observeViewModel(FragmentUnstructuredDocSocureBinding binding) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UnstructuredDocUploadFragment$observeViewModel$1(this, binding, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindUnstructuredDocModel(FragmentUnstructuredDocSocureBinding binding, IUnstructuredDocUploadViewModel.State state) {
        binding.tvDocument.setText(state.getLabels().getDocument());
        binding.tvSelectMethod.setText(state.getLabels().getPrimaryText());
        binding.tvDocumentsCollected.setText(state.getLabels().getDocumentsCollected());
        binding.tvPhotoUpload.setText(state.getLabels().getSecondaryText());
        if (state.getCanUpload()) {
            binding.btnUpload.setText(state.getLabels().getUploadDocumentButton());
            binding.btnUpload.setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnstructuredDocUploadFragment.bindUnstructuredDocModel$lambda$7$lambda$1(UnstructuredDocUploadFragment.this, view);
                }
            });
            StartSessionModel startSessionModel = getStartSessionModel();
            if (startSessionModel != null) {
                PrimaryModel primary = startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary();
                AppCompatButton btnUpload = binding.btnUpload;
                Intrinsics.checkNotNullExpressionValue(btnUpload, "btnUpload");
                ExtensionsKt.setCorner(btnUpload, primary.getButton().getPrimary().getBackgroundColor(), primary.getButton().getPrimary().getBorderColor());
                AppCompatButton btnUpload2 = binding.btnUpload;
                Intrinsics.checkNotNullExpressionValue(btnUpload2, "btnUpload");
                ExtensionsKt.setupText$default(btnUpload2, state.getLabels().getUploadDocumentButton(), primary.getButton().getPrimary().getColor(), null, 4, null);
            }
        }
        if (state.getCanCapture()) {
            binding.btnScanDocument.setText(state.getLabels().getScanDocumentButton());
            binding.btnScanDocument.setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragment$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnstructuredDocUploadFragment.bindUnstructuredDocModel$lambda$7$lambda$4(UnstructuredDocUploadFragment.this, view);
                }
            });
            StartSessionModel startSessionModel2 = getStartSessionModel();
            if (startSessionModel2 != null) {
                PrimaryModel primary2 = startSessionModel2.getGlobalConfig().getCustomization().getTheme().getPrimary();
                AppCompatButton btnScanDocument = binding.btnScanDocument;
                Intrinsics.checkNotNullExpressionValue(btnScanDocument, "btnScanDocument");
                ExtensionsKt.setCorner(btnScanDocument, primary2.getButton().getSecondary().getBackgroundColor(), primary2.getButton().getSecondary().getBorderColor());
                AppCompatButton btnScanDocument2 = binding.btnScanDocument;
                Intrinsics.checkNotNullExpressionValue(btnScanDocument2, "btnScanDocument");
                ExtensionsKt.setupText$default(btnScanDocument2, state.getLabels().getScanDocumentButton(), primary2.getButton().getSecondary().getColor(), null, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindUnstructuredDocModel$lambda$7$lambda$1(UnstructuredDocUploadFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IUnstructuredDocUploadViewModel iUnstructuredDocUploadViewModel = this$0.viewModel;
        if (iUnstructuredDocUploadViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            iUnstructuredDocUploadViewModel = null;
        }
        iUnstructuredDocUploadViewModel.onEvent(UnstructuredDocUploadEvent.UPLOAD_BUTTON_CLICKED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindUnstructuredDocModel$lambda$7$lambda$4(UnstructuredDocUploadFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IUnstructuredDocUploadViewModel iUnstructuredDocUploadViewModel = this$0.viewModel;
        if (iUnstructuredDocUploadViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            iUnstructuredDocUploadViewModel = null;
        }
        iUnstructuredDocUploadViewModel.onEvent(UnstructuredDocUploadEvent.SCAN_BUTTON_CLICKED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSelectedFile(Uri uri) {
        Fragment requireParentFragment = requireParentFragment().requireParentFragment();
        UnstructuredDocContainerFragment unstructuredDocContainerFragment = requireParentFragment instanceof UnstructuredDocContainerFragment ? (UnstructuredDocContainerFragment) requireParentFragment : null;
        if (unstructuredDocContainerFragment != null) {
            unstructuredDocContainerFragment.navigateToPreview(uri);
        }
    }

    /* compiled from: UnstructuredDocUploadFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocUploadFragment$Companion;", "", "()V", "MODEL", "", "newInstance", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocUploadFragment;", "model", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UnstructuredDocUploadFragment newInstance(UnstructuredModuleModel model) {
            UnstructuredDocUploadFragment unstructuredDocUploadFragment = new UnstructuredDocUploadFragment();
            unstructuredDocUploadFragment.model = model;
            return unstructuredDocUploadFragment;
        }
    }
}
