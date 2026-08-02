package com.socure.docv.capturesdk.feature.selection.persentation.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.henninghall.date_picker.props.TextColorProp;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.common.view.BrandLayout;
import com.socure.docv.capturesdk.common.view.CustomToolbar;
import com.socure.docv.capturesdk.common.view.model.CurrentScreen;
import com.socure.docv.capturesdk.core.storage.CacheKt;
import com.socure.docv.capturesdk.databinding.FragmentCameraPrimDocSelectionBinding;
import com.socure.docv.capturesdk.di.ComponentProvider;
import com.socure.docv.capturesdk.di.docselection.DocSelectionFragmentComponent;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.feature.base.presentation.ui.BaseFragment;
import com.socure.docv.capturesdk.models.IDSelectionModel;
import com.socure.docv.capturesdk.models.IDSelectionModelKt;
import com.socure.docv.capturesdk.models.StartSessionModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: DocSelectionFragment.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u001cH\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020,H\u0002J\u0018\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001fH\u0002J\u0010\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u000202H\u0002J \u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R!\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u00068"}, d2 = {"Lcom/socure/docv/capturesdk/feature/selection/persentation/ui/DocSelectionFragment;", "Lcom/socure/docv/capturesdk/feature/base/presentation/ui/BaseFragment;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "graph", "Lcom/socure/docv/capturesdk/di/docselection/DocSelectionFragmentComponent;", "getGraph$annotations", "getGraph", "()Lcom/socure/docv/capturesdk/di/docselection/DocSelectionFragmentComponent;", "graph$delegate", "Lkotlin/Lazy;", "model", "Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "getModel", "()Lcom/socure/docv/capturesdk/models/IDSelectionModel;", "startSessionModel", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionModel", "()Lcom/socure/docv/capturesdk/models/StartSessionModel;", TextColorProp.name, "", "getTextColor", "()Ljava/lang/String;", "closeClicked", "", AnalyticsConstantsKt.KEY_SCREEN, "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "setBrandView", "brandView", "Lcom/socure/docv/capturesdk/common/view/BrandLayout;", "setCameraPrimingUI", "Lcom/socure/docv/capturesdk/databinding/FragmentCameraPrimDocSelectionBinding;", "setLicPassportClickAction", "licView", "passportView", "setUpCloseButtonClickAction", "clDocSelectionToolbar", "Lcom/socure/docv/capturesdk/common/view/CustomToolbar;", "setUpTitles", "tvDocTitle", "Landroid/widget/TextView;", "tvLicTitle", "btnPassport", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DocSelectionFragment extends BaseFragment {
    private ViewBinding _binding;

    /* renamed from: graph$delegate, reason: from kotlin metadata */
    private final Lazy graph;

    private static /* synthetic */ void getGraph$annotations() {
    }

    public DocSelectionFragment() {
        super("SDLT_DSF");
        this.graph = LazyKt.lazy(new Function0<DocSelectionFragmentComponent>() { // from class: com.socure.docv.capturesdk.feature.selection.persentation.ui.DocSelectionFragment$graph$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final DocSelectionFragmentComponent invoke() {
                KeyEventDispatcher.Component requireActivity = DocSelectionFragment.this.requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.socure.docv.capturesdk.di.ComponentProvider<com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent>");
                return ((OrchestratorActivityComponent) ((ComponentProvider) requireActivity).getComponent()).docSelectionFragmentSubComponent(DocSelectionFragment.this);
            }
        });
    }

    private final ViewBinding getBinding() {
        ViewBinding viewBinding = this._binding;
        Intrinsics.checkNotNull(viewBinding);
        return viewBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocSelectionFragmentComponent getGraph() {
        return (DocSelectionFragmentComponent) this.graph.getValue();
    }

    private final StartSessionModel getStartSessionModel() {
        return (StartSessionModel) CacheKt.require(getGraph().getStartSessionCache());
    }

    private final IDSelectionModel getModel() {
        return getGraph().getModel();
    }

    private final String getTextColor() {
        return getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getColor();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentCameraPrimDocSelectionBinding.inflate(inflater, container, false);
        ViewBinding binding = getBinding();
        Intrinsics.checkNotNull(binding, "null cannot be cast to non-null type com.socure.docv.capturesdk.databinding.FragmentCameraPrimDocSelectionBinding");
        setCameraPrimingUI((FragmentCameraPrimDocSelectionBinding) binding);
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    private final void setUpTitles(TextView tvDocTitle, TextView tvLicTitle, TextView btnPassport) {
        ExtensionsKt.setupText$default(tvDocTitle, getModel().getHeaderText(), getTextColor(), null, 4, null);
        ViewCompat.setAccessibilityHeading(tvDocTitle, true);
        IDSelectionModel.Button licenseButton = IDSelectionModelKt.licenseButton(getModel());
        ExtensionsKt.setupText$default(tvLicTitle, licenseButton != null ? licenseButton.getLabel() : null, getTextColor(), null, 4, null);
        IDSelectionModel.Button passportButton = IDSelectionModelKt.passportButton(getModel());
        ExtensionsKt.setupText$default(btnPassport, passportButton != null ? passportButton.getLabel() : null, getTextColor(), null, 4, null);
    }

    private final void setCameraPrimingUI(FragmentCameraPrimDocSelectionBinding binding) {
        AppCompatTextView setCameraPrimingUI$lambda$1$lambda$0;
        AppCompatTextView setCameraPrimingUI$lambda$4$lambda$3;
        String subText;
        String subText2;
        Guideline guideline = binding.glTop;
        Intrinsics.checkNotNullExpressionValue(guideline, "binding.glTop");
        setGuidelineViewTopMargin(guideline);
        ConstraintLayout constraintLayout = binding.cvLicense;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.cvLicense");
        ConstraintLayout constraintLayout2 = binding.cvPassport;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.cvPassport");
        setLicPassportClickAction(constraintLayout, constraintLayout2);
        CustomToolbar customToolbar = binding.clDocSelectionToolbar;
        Intrinsics.checkNotNullExpressionValue(customToolbar, "binding.clDocSelectionToolbar");
        setUpCloseButtonClickAction(customToolbar);
        binding.clDocSelectionToolbar.hideBack();
        binding.clDocSelectionToolbar.setBackContentDescription(getStartSessionModel().getGlobalConfig().getNativeLabelsModel().getBackButtonContinueDescription());
        BrandLayout brandLayout = binding.brandView;
        Intrinsics.checkNotNullExpressionValue(brandLayout, "binding.brandView");
        setBrandView(brandLayout);
        binding.brandView.setContentDescription(getStartSessionModel().getGlobalConfig().getCommonLabels().getPoweredBy());
        try {
            AppCompatTextView appCompatTextView = binding.tvDocTitle;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvDocTitle");
            AppCompatTextView appCompatTextView2 = binding.tvLicTitle;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.tvLicTitle");
            AppCompatTextView appCompatTextView3 = binding.tvPassportTitle;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "binding.tvPassportTitle");
            setUpTitles(appCompatTextView, appCompatTextView2, appCompatTextView3);
            AppCompatTextView appCompatTextView4 = binding.tvDocSubtext;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "binding.tvDocSubtext");
            ExtensionsKt.setupText$default(appCompatTextView4, getModel().getHeaderText(), getTextColor(), null, 4, null);
            IDSelectionModel.Button licenseButton = IDSelectionModelKt.licenseButton(getModel());
            if (licenseButton == null || (subText2 = licenseButton.getSubText()) == null) {
                setCameraPrimingUI$lambda$1$lambda$0 = null;
            } else {
                setCameraPrimingUI$lambda$1$lambda$0 = binding.tvLicSubText;
                Intrinsics.checkNotNullExpressionValue(setCameraPrimingUI$lambda$1$lambda$0, "setCameraPrimingUI$lambda$1$lambda$0");
                ExtensionsKt.setupText$default(setCameraPrimingUI$lambda$1$lambda$0, subText2, getTextColor(), null, 4, null);
            }
            if (setCameraPrimingUI$lambda$1$lambda$0 == null) {
                DocSelectionFragment docSelectionFragment = this;
                binding.tvLicSubText.setVisibility(8);
            }
            IDSelectionModel.Button passportButton = IDSelectionModelKt.passportButton(getModel());
            if (passportButton == null || (subText = passportButton.getSubText()) == null) {
                setCameraPrimingUI$lambda$4$lambda$3 = null;
            } else {
                setCameraPrimingUI$lambda$4$lambda$3 = binding.tvPassportSubText;
                Intrinsics.checkNotNullExpressionValue(setCameraPrimingUI$lambda$4$lambda$3, "setCameraPrimingUI$lambda$4$lambda$3");
                ExtensionsKt.setupText$default(setCameraPrimingUI$lambda$4$lambda$3, subText, getTextColor(), null, 4, null);
            }
            if (setCameraPrimingUI$lambda$4$lambda$3 == null) {
                DocSelectionFragment docSelectionFragment2 = this;
                binding.tvPassportSubText.setVisibility(8);
            }
            AppCompatTextView appCompatTextView5 = binding.tvDocReady;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "binding.tvDocReady");
            ExtensionsKt.setupText$default(appCompatTextView5, getModel().getDocReadyText(), getTextColor(), null, 4, null);
            Utils utils = Utils.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            if (utils.hasCameraPermission(requireContext)) {
                return;
            }
            AppCompatTextView appCompatTextView6 = binding.tvCameraAccess;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "binding.tvCameraAccess");
            ExtensionsKt.setupText$default(appCompatTextView6, getModel().getCameraAccessText(), getTextColor(), null, 4, null);
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_DSF", "customisation failed: " + th.getLocalizedMessage(), null, 4, null);
        }
    }

    private final void setLicPassportClickAction(View licView, View passportView) {
        licView.setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.selection.persentation.ui.DocSelectionFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DocSelectionFragment.setLicPassportClickAction$lambda$6(DocSelectionFragment.this, view);
            }
        });
        passportView.setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.selection.persentation.ui.DocSelectionFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DocSelectionFragment.setLicPassportClickAction$lambda$7(DocSelectionFragment.this, view);
            }
        });
        int i = R.string.socure_button_description;
        IDSelectionModel.Button licenseButton = IDSelectionModelKt.licenseButton(getModel());
        String label = licenseButton != null ? licenseButton.getLabel() : null;
        if (label == null) {
            label = "";
        }
        licView.setContentDescription(getString(i, label));
        int i2 = R.string.socure_button_description;
        IDSelectionModel.Button passportButton = IDSelectionModelKt.passportButton(getModel());
        String label2 = passportButton != null ? passportButton.getLabel() : null;
        passportView.setContentDescription(getString(i2, label2 != null ? label2 : ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLicPassportClickAction$lambda$6(DocSelectionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LoggerKt.logD("SDLT_DSF", "clicked doc lic");
        this$0.sendEvent(AnalyticsConstantsKt.ID_CARD_SELECTED, this$0.getScrTimeArg());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new DocSelectionFragment$setLicPassportClickAction$1$1(this$0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setLicPassportClickAction$lambda$7(DocSelectionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LoggerKt.logD("SDLT_DSF", "clicked doc passport");
        this$0.sendEvent(AnalyticsConstantsKt.PASSPORT_SELECTED, this$0.getScrTimeArg());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new DocSelectionFragment$setLicPassportClickAction$2$1(this$0, null), 3, null);
    }

    private final void closeClicked(String screen) {
        sendEvent("clicked", new Pair<>("type", AnalyticsConstantsKt.CLOSE_BUTTON), new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, screen), getScrTimeArg());
        sendEvent("error", new Pair<>("type", AnalyticsConstantsKt.ERR_DOCUMENT_SCAN_CANCEL), new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, screen), new Pair<>(AnalyticsConstantsKt.KEY_FACET_TYPE, Utils.INSTANCE.getDocSelFacet$capturesdk_productionRelease()));
        getOrchestratorViewModel().closeClicked();
    }

    private final void setUpCloseButtonClickAction(CustomToolbar clDocSelectionToolbar) {
        clDocSelectionToolbar.setCloseListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.selection.persentation.ui.DocSelectionFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DocSelectionFragment.setUpCloseButtonClickAction$lambda$8(DocSelectionFragment.this, view);
            }
        });
        clDocSelectionToolbar.setCloseContentDescription(getStartSessionModel().getGlobalConfig().getNativeLabelsModel().getCloseButtonContinueDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpCloseButtonClickAction$lambda$8(DocSelectionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeClicked(CurrentScreen.SELECTOR.getScreenType());
    }

    private final void setBrandView(BrandLayout brandView) {
        brandView.setUpBrandView(getStartSessionModel().getGlobalConfig().getCommonLabels().getPoweredBy(), R.drawable.socure_logo_black, R.color.socure_black);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View findViewById = getBinding().getRoot().findViewById(R.id.tvDocTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "binding.root.findViewByI…extView>(R.id.tvDocTitle)");
        UtilsKt.requestFocusAccessibilityEvent(findViewById);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
