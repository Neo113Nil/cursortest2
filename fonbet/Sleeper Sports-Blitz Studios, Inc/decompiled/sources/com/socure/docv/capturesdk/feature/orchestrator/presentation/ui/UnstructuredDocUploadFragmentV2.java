package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.socure.docv.capturesdk.common.analytics.MixPanelAgent;
import com.socure.docv.capturesdk.common.workers.ImageWorker;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.feature.orchestrator.LaunchCameraUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.OpenFilePickerUseCase;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IUnstructuredDocUploadViewModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: UnstructuredDocUploadFragmentV2.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J$\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\n0\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082.¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocUploadFragmentV2;", "Landroidx/fragment/app/Fragment;", "()V", "component", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "getComponent", "()Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "filePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "launchCameraUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/LaunchCameraUseCase;", "getLaunchCameraUseCase", "()Lcom/socure/docv/capturesdk/feature/orchestrator/LaunchCameraUseCase;", "launchCameraUseCase$delegate", "Lkotlin/Lazy;", "mixPanel", "Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;", "getMixPanel", "()Lcom/socure/docv/capturesdk/common/analytics/MixPanelAgent;", "mixPanel$delegate", "model", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "getModel", "()Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "setModel", "(Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;)V", "openFilePickerUseCase", "Lcom/socure/docv/capturesdk/feature/orchestrator/OpenFilePickerUseCase;", "getOpenFilePickerUseCase", "()Lcom/socure/docv/capturesdk/feature/orchestrator/OpenFilePickerUseCase;", "openFilePickerUseCase$delegate", "requestPermissionLauncher", "kotlin.jvm.PlatformType", "startSessionModel", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionModel", "()Lcom/socure/docv/capturesdk/models/StartSessionModel;", "takePicture", "Ljava/lang/Void;", "viewModel", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IUnstructuredDocUploadViewModel;", "handleSelectedFile", "", "uri", "Landroid/net/Uri;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnstructuredDocUploadFragmentV2 extends Fragment {
    private final ActivityResultLauncher<String[]> filePickerLauncher;

    /* renamed from: launchCameraUseCase$delegate, reason: from kotlin metadata */
    private final Lazy launchCameraUseCase;

    /* renamed from: mixPanel$delegate, reason: from kotlin metadata */
    private final Lazy mixPanel = LazyKt.lazy(new Function0<MixPanelAgent>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2$mixPanel$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MixPanelAgent invoke() {
            OrchestratorActivityComponent component;
            component = UnstructuredDocUploadFragmentV2.this.getComponent();
            return new MixPanelAgent(component.getRepoHolder().getMixPanelRepository(), new UnstructuredDocUploadFragmentV2$mixPanel$2$invoke$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE));
        }
    });
    private UnstructuredModuleModel model;

    /* renamed from: openFilePickerUseCase$delegate, reason: from kotlin metadata */
    private final Lazy openFilePickerUseCase;
    private final ActivityResultLauncher<String> requestPermissionLauncher;
    private final ActivityResultLauncher<Void> takePicture;
    private IUnstructuredDocUploadViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UnstructuredDocUploadFragmentV2() {
        ActivityResultLauncher<String[]> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.OpenDocument(), new ActivityResultCallback<Uri>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2$filePickerLauncher$1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Uri uri) {
                if (uri != null) {
                    UnstructuredDocUploadFragmentV2.this.handleSelectedFile(uri);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.filePickerLauncher = registerForActivityResult;
        ActivityResultLauncher<Void> registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.TakePicturePreview(), new ActivityResultCallback<Bitmap>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2$takePicture$1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Bitmap bitmap) {
                Context applicationContext = UnstructuredDocUploadFragmentV2.this.requireActivity().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
                Uri saveToDisk = new ImageWorker(applicationContext, null, 2, null).saveToDisk(bitmap, "JPG");
                if (saveToDisk != null) {
                    UnstructuredDocUploadFragmentV2.this.handleSelectedFile(saveToDisk);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResul…)\n            }\n        }");
        this.takePicture = registerForActivityResult2;
        ActivityResultLauncher<String> registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2$requestPermissionLauncher$1
            @Override // androidx.activity.result.ActivityResultCallback
            public /* bridge */ /* synthetic */ void onActivityResult(Boolean bool) {
                onActivityResult(bool.booleanValue());
            }

            public final void onActivityResult(boolean z) {
                LaunchCameraUseCase launchCameraUseCase;
                launchCameraUseCase = UnstructuredDocUploadFragmentV2.this.getLaunchCameraUseCase();
                launchCameraUseCase.handlePermissionResult(z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResul…sult(isGranted)\n        }");
        this.requestPermissionLauncher = registerForActivityResult3;
        this.openFilePickerUseCase = LazyKt.lazy(new Function0<OpenFilePickerUseCase>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2$openFilePickerUseCase$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final OpenFilePickerUseCase invoke() {
                ActivityResultLauncher activityResultLauncher;
                FragmentActivity requireActivity = UnstructuredDocUploadFragmentV2.this.requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity");
                activityResultLauncher = UnstructuredDocUploadFragmentV2.this.filePickerLauncher;
                return new OpenFilePickerUseCase((OrchestratorActivity) requireActivity, activityResultLauncher);
            }
        });
        this.launchCameraUseCase = LazyKt.lazy(new Function0<LaunchCameraUseCase>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocUploadFragmentV2$launchCameraUseCase$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LaunchCameraUseCase invoke() {
                ActivityResultLauncher activityResultLauncher;
                ActivityResultLauncher activityResultLauncher2;
                StartSessionModel startSessionModel;
                Context requireContext = UnstructuredDocUploadFragmentV2.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                activityResultLauncher = UnstructuredDocUploadFragmentV2.this.takePicture;
                activityResultLauncher2 = UnstructuredDocUploadFragmentV2.this.requestPermissionLauncher;
                startSessionModel = UnstructuredDocUploadFragmentV2.this.getStartSessionModel();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final MixPanelAgent getMixPanel() {
        return (MixPanelAgent) this.mixPanel.getValue();
    }

    public final UnstructuredModuleModel getModel() {
        return this.model;
    }

    public final void setModel(UnstructuredModuleModel unstructuredModuleModel) {
        this.model = unstructuredModuleModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StartSessionModel getStartSessionModel() {
        return getComponent().getStartSessionCache().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OpenFilePickerUseCase getOpenFilePickerUseCase() {
        return (OpenFilePickerUseCase) this.openFilePickerUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LaunchCameraUseCase getLaunchCameraUseCase() {
        return (LaunchCameraUseCase) this.launchCameraUseCase.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(472173790, true, new UnstructuredDocUploadFragmentV2$onCreateView$1$1(this)));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSelectedFile(Uri uri) {
        Fragment requireParentFragment = requireParentFragment().requireParentFragment();
        UnstructuredDocContainerFragment unstructuredDocContainerFragment = requireParentFragment instanceof UnstructuredDocContainerFragment ? (UnstructuredDocContainerFragment) requireParentFragment : null;
        if (unstructuredDocContainerFragment != null) {
            unstructuredDocContainerFragment.navigateToPreview(uri);
        }
    }

    /* compiled from: UnstructuredDocUploadFragmentV2.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocUploadFragmentV2$Companion;", "", "()V", "newInstance", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocUploadFragmentV2;", "model", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UnstructuredDocUploadFragmentV2 newInstance(UnstructuredModuleModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            UnstructuredDocUploadFragmentV2 unstructuredDocUploadFragmentV2 = new UnstructuredDocUploadFragmentV2();
            unstructuredDocUploadFragmentV2.setModel(model);
            return unstructuredDocUploadFragmentV2;
        }
    }
}
