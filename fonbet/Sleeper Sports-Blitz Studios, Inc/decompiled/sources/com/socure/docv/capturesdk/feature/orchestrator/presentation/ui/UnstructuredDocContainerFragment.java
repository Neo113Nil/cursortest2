package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.FragmentNavigatorDestinationBuilder;
import androidx.navigation.fragment.NavHostFragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocPreviewFragment;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: UnstructuredDocContainerFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u001a\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocContainerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "customFragmentFactory", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocContainerFragment$CustomFragmentFactory;", "errorDialog", "Landroidx/appcompat/app/AlertDialog;", "navController", "Landroidx/navigation/NavController;", "unstructuredDocModel", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "getUnstructuredDocModel", "()Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "createUnstructuredDocGraph", "Landroidx/navigation/NavGraph;", "navigateBack", "", "navigateToPreview", "fileUri", "Landroid/net/Uri;", "onDestroy", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "returnWithError", "showErrorDialog", "Companion", "CustomFragmentFactory", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnstructuredDocContainerFragment extends Fragment {
    private static final String MODEL = "model";
    private CustomFragmentFactory customFragmentFactory;
    private AlertDialog errorDialog;
    private NavController navController;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UnstructuredDocContainerFragment() {
        super(R.layout.fragment_unstructured_doc_container);
    }

    public final UnstructuredModuleModel getUnstructuredDocModel() {
        Object obj;
        Bundle requireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments()");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = requireArguments.getParcelable("model", UnstructuredModuleModel.class);
        } else {
            Object parcelable = requireArguments.getParcelable("model");
            if (!(parcelable instanceof UnstructuredModuleModel)) {
                parcelable = null;
            }
            obj = (UnstructuredModuleModel) parcelable;
        }
        return (UnstructuredModuleModel) obj;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        UnstructuredModuleModel unstructuredDocModel = getUnstructuredDocModel();
        if (unstructuredDocModel != null) {
            this.customFragmentFactory = new CustomFragmentFactory(unstructuredDocModel);
            FragmentManager childFragmentManager = getChildFragmentManager();
            CustomFragmentFactory customFragmentFactory = this.customFragmentFactory;
            NavController navController = null;
            if (customFragmentFactory == null) {
                Intrinsics.throwUninitializedPropertyAccessException("customFragmentFactory");
                customFragmentFactory = null;
            }
            childFragmentManager.setFragmentFactory(customFragmentFactory);
            Fragment findFragmentById = getChildFragmentManager().findFragmentById(R.id.nav_host_fragment);
            Intrinsics.checkNotNull(findFragmentById, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            NavController navController2 = ((NavHostFragment) findFragmentById).getNavController();
            this.navController = navController2;
            if (navController2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navController");
                navController2 = null;
            }
            NavGraph createUnstructuredDocGraph = createUnstructuredDocGraph(navController2);
            NavController navController3 = this.navController;
            if (navController3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navController");
            } else {
                navController = navController3;
            }
            navController.setGraph(createUnstructuredDocGraph);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* compiled from: UnstructuredDocContainerFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocContainerFragment$CustomFragmentFactory;", "Landroidx/fragment/app/FragmentFactory;", "unstructuredModel", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "(Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;)V", "instantiate", "Landroidx/fragment/app/Fragment;", "classLoader", "Ljava/lang/ClassLoader;", "className", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomFragmentFactory extends FragmentFactory {
        public static final int $stable = 8;
        private final UnstructuredModuleModel unstructuredModel;

        public CustomFragmentFactory(UnstructuredModuleModel unstructuredModel) {
            Intrinsics.checkNotNullParameter(unstructuredModel, "unstructuredModel");
            this.unstructuredModel = unstructuredModel;
        }

        @Override // androidx.fragment.app.FragmentFactory
        public Fragment instantiate(ClassLoader classLoader, String className) {
            Intrinsics.checkNotNullParameter(classLoader, "classLoader");
            Intrinsics.checkNotNullParameter(className, "className");
            if (Intrinsics.areEqual(className, UnstructuredDocUploadFragment.class.getName())) {
                if (Intrinsics.areEqual((Object) this.unstructuredModel.getTransitionScreenEnabled(), (Object) true)) {
                    return UnstructuredDocUploadFragmentV2.INSTANCE.newInstance(this.unstructuredModel);
                }
                return UnstructuredDocUploadFragment.INSTANCE.newInstance(this.unstructuredModel);
            }
            Fragment instantiate = super.instantiate(classLoader, className);
            Intrinsics.checkNotNullExpressionValue(instantiate, "super.instantiate(classLoader, className)");
            return instantiate;
        }
    }

    public final void navigateToPreview(Uri fileUri) {
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        UnstructuredDocPreviewFragment.Companion companion = UnstructuredDocPreviewFragment.INSTANCE;
        UnstructuredModuleModel unstructuredDocModel = getUnstructuredDocModel();
        Intrinsics.checkNotNull(unstructuredDocModel);
        companion.newInstance(fileUri, unstructuredDocModel).show(getChildFragmentManager(), "preview_bottom_sheet");
    }

    public final void navigateBack() {
        NavController navController = this.navController;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            navController = null;
        }
        navController.popBackStack();
    }

    public final void returnWithError() {
        FragmentActivity requireActivity = requireActivity();
        OrchestratorActivity orchestratorActivity = requireActivity instanceof OrchestratorActivity ? (OrchestratorActivity) requireActivity : null;
        if (orchestratorActivity != null) {
            orchestratorActivity.backToCallerUnknown();
        }
    }

    public final void showErrorDialog() {
        UnstructuredModuleModel.ErrorLabels error;
        UnstructuredModuleModel.ErrorLabels error2;
        final Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("preview_bottom_sheet");
        if (findFragmentByTag instanceof UnstructuredDocPreviewFragment) {
            ((UnstructuredDocPreviewFragment) findFragmentByTag).dismiss();
        }
        AlertDialog alertDialog = this.errorDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(requireContext());
        UnstructuredModuleModel unstructuredDocModel = getUnstructuredDocModel();
        String str = null;
        MaterialAlertDialogBuilder title = materialAlertDialogBuilder.setTitle((CharSequence) ((unstructuredDocModel == null || (error2 = unstructuredDocModel.getError()) == null) ? null : error2.getHeaderText()));
        UnstructuredModuleModel unstructuredDocModel2 = getUnstructuredDocModel();
        if (unstructuredDocModel2 != null && (error = unstructuredDocModel2.getError()) != null) {
            str = error.getFileSizeDescription();
        }
        AlertDialog create = title.setMessage((CharSequence) str).setCancelable(false).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocContainerFragment$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                UnstructuredDocContainerFragment.showErrorDialog$lambda$2(Fragment.this, dialogInterface, i);
            }
        }).create();
        create.show();
        this.errorDialog = create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showErrorDialog$lambda$2(Fragment fragment, DialogInterface dialogInterface, int i) {
        if (fragment instanceof UnstructuredDocPreviewFragment) {
            ((UnstructuredDocPreviewFragment) fragment).dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        AlertDialog alertDialog = this.errorDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.errorDialog = null;
        super.onDestroy();
    }

    /* compiled from: UnstructuredDocContainerFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocContainerFragment$Companion;", "", "()V", "MODEL", "", "newInstance", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/UnstructuredDocContainerFragment;", "model", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UnstructuredDocContainerFragment newInstance(UnstructuredModuleModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            UnstructuredDocContainerFragment unstructuredDocContainerFragment = new UnstructuredDocContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("model", model);
            unstructuredDocContainerFragment.setArguments(bundle);
            return unstructuredDocContainerFragment;
        }
    }

    private final NavGraph createUnstructuredDocGraph(NavController navController) {
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), "unstructuredDocFragment", (String) null);
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class), "unstructuredDocFragment", (KClass<? extends Fragment>) Reflection.getOrCreateKotlinClass(UnstructuredDocUploadFragment.class));
        fragmentNavigatorDestinationBuilder.setLabel("UnstructuredDocFragment");
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
        return navGraphBuilder.build();
    }
}
