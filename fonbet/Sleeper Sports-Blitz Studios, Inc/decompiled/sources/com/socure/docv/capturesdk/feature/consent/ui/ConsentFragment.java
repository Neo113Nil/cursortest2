package com.socure.docv.capturesdk.feature.consent.ui;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.stepup.Content;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCase;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCaseKt;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.common.utils.Markdown;
import com.socure.docv.capturesdk.core.storage.CacheKt;
import com.socure.docv.capturesdk.databinding.FragmentConsentSocureBinding;
import com.socure.docv.capturesdk.di.ComponentProvider;
import com.socure.docv.capturesdk.di.consent.ConsentFragmentComponent;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.feature.base.presentation.ui.BaseFragment;
import com.socure.docv.capturesdk.feature.consent.data.ConsentAdapter;
import com.socure.docv.capturesdk.feature.consent.ui.ConsentFragmentDirections;
import com.socure.docv.capturesdk.feature.consent.ui.ConsentViewModel;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import com.socure.docv.capturesdk.models.BodyComponentModel;
import com.socure.docv.capturesdk.models.ConsentModuleModel;
import com.socure.docv.capturesdk.models.ConsentModuleModelKt;
import com.socure.docv.capturesdk.models.PrimaryModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ConsentFragment.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\"\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u001aH\u0016J\b\u0010)\u001a\u00020\u001aH\u0016J\u001a\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010,\u001a\u00020\u001aH\u0002J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R!\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u00061"}, d2 = {"Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentFragment;", "Lcom/socure/docv/capturesdk/feature/base/presentation/ui/BaseFragment;", "()V", "_binding", "Lcom/socure/docv/capturesdk/databinding/FragmentConsentSocureBinding;", "binding", "getBinding", "()Lcom/socure/docv/capturesdk/databinding/FragmentConsentSocureBinding;", "consentViewModel", "Lcom/socure/docv/capturesdk/feature/consent/ui/ConsentViewModel;", "graph", "Lcom/socure/docv/capturesdk/di/consent/ConsentFragmentComponent;", "getGraph$annotations", "getGraph", "()Lcom/socure/docv/capturesdk/di/consent/ConsentFragmentComponent;", "graph$delegate", "Lkotlin/Lazy;", "model", "Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "getModel", "()Lcom/socure/docv/capturesdk/models/ConsentModuleModel;", "startSessionModel", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getStartSessionModel", "()Lcom/socure/docv/capturesdk/models/StartSessionModel;", "announcementConsentProcess", "", "handleLinkClick", "hyperLinkUrl", "", "hyperLinkPhrase", "version", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "setupCustomUi", "validateCheckBox", "isChecked", "", "isMandatory", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConsentFragment extends BaseFragment {
    private FragmentConsentSocureBinding _binding;
    private ConsentViewModel consentViewModel;

    /* renamed from: graph$delegate, reason: from kotlin metadata */
    private final Lazy graph;

    private static /* synthetic */ void getGraph$annotations() {
    }

    public ConsentFragment() {
        super("SDLT_CF");
        this.graph = LazyKt.lazy(new Function0<ConsentFragmentComponent>() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment$graph$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ConsentFragmentComponent invoke() {
                KeyEventDispatcher.Component requireActivity = ConsentFragment.this.requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.socure.docv.capturesdk.di.ComponentProvider<com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent>");
                return ((OrchestratorActivityComponent) ((ComponentProvider) requireActivity).getComponent()).consentFragmentSubComponent(ConsentFragment.this);
            }
        });
    }

    private final FragmentConsentSocureBinding getBinding() {
        FragmentConsentSocureBinding fragmentConsentSocureBinding = this._binding;
        Intrinsics.checkNotNull(fragmentConsentSocureBinding);
        return fragmentConsentSocureBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConsentFragmentComponent getGraph() {
        return (ConsentFragmentComponent) this.graph.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConsentModuleModel getModel() {
        return getGraph().getModel();
    }

    private final StartSessionModel getStartSessionModel() {
        return (StartSessionModel) CacheKt.require(getGraph().getStartSessionCache());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentConsentSocureBinding.inflate(inflater, container, false);
        this.consentViewModel = (ConsentViewModel) new ViewModelProvider(this, new ConsentVMFactory(getGraph().getShim(), getGraph().getModel())).get(ConsentViewModel.class);
        Guideline guideline = getBinding().glTop;
        Intrinsics.checkNotNullExpressionValue(guideline, "binding.glTop");
        setGuidelineViewTopMargin(guideline);
        setupCustomUi();
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ConsentViewModel consentViewModel = this.consentViewModel;
        ConsentViewModel consentViewModel2 = null;
        if (consentViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
            consentViewModel = null;
        }
        consentViewModel.getOnConsentPosted().observe(getViewLifecycleOwner(), new ConsentFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<Boolean, Unit>() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment$onViewCreated$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke2(bool);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean consentGiven) {
                ConsentFragmentComponent graph;
                graph = ConsentFragment.this.getGraph();
                ConsentShim shim = graph.getShim();
                Intrinsics.checkNotNullExpressionValue(consentGiven, "consentGiven");
                shim.onFinished(consentGiven.booleanValue());
            }
        }));
        ConsentViewModel consentViewModel3 = this.consentViewModel;
        if (consentViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
        } else {
            consentViewModel2 = consentViewModel3;
        }
        consentViewModel2.getOnError().observe(getViewLifecycleOwner(), new ConsentFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<ConsentViewModel.Error, Unit>() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment$onViewCreated$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConsentViewModel.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ConsentViewModel.Error error) {
                IOrchestratorViewModel orchestratorViewModel;
                IOrchestratorViewModel orchestratorViewModel2;
                if (Intrinsics.areEqual(error, ConsentViewModel.Error.FailedToPostConsent.INSTANCE)) {
                    orchestratorViewModel2 = ConsentFragment.this.getOrchestratorViewModel();
                    orchestratorViewModel2.backToCaller(SocureDocVError.CONSENT_DECLINED);
                } else if (error instanceof ConsentViewModel.Error.Unknown) {
                    orchestratorViewModel = ConsentFragment.this.getOrchestratorViewModel();
                    orchestratorViewModel.backToCaller(SocureDocVError.UNKNOWN);
                }
            }
        }));
    }

    private final void setupCustomUi() {
        ConsentAdapter.Item.Text text;
        LoggerKt.logD("SDLT_CF", "called setupCustomUi");
        if (getStartSessionModel().getGlobalConfig().getCustomization().isLogoCustomized()) {
            LoggerKt.logD("SDLT_CF", "We have customised logo");
            try {
                byte[] decode = Base64.decode((String) StringsKt.split$default((CharSequence) getStartSessionModel().getGlobalConfig().getCustomization().getLogo(), new String[]{","}, false, 0, 6, (Object) null).get(1), 0);
                getBinding().imgBrandLogo.setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                getBinding().imgBrandLogo.setVisibility(0);
            } catch (Throwable th) {
                LoggerKt.logD("SDLT_CF", "customised brand logo setting ex: " + th.getMessage());
            }
        } else {
            LoggerKt.logD("SDLT_CF", "We do not have customised logo");
        }
        PrimaryModel primary = getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary();
        getBinding().getRoot().setBackgroundColor(Color.parseColor(primary.getBackgroundColor()));
        AppCompatButton appCompatButton = getBinding().btnAgree;
        Intrinsics.checkNotNullExpressionValue(appCompatButton, "binding.btnAgree");
        ExtensionsKt.setCorner(appCompatButton, primary.getButton().getPrimary().getBackgroundColor(), primary.getButton().getPrimary().getBorderColor());
        AppCompatButton appCompatButton2 = getBinding().btnAgree;
        Intrinsics.checkNotNullExpressionValue(appCompatButton2, "binding.btnAgree");
        ExtensionsKt.setupText$default(appCompatButton2, getModel().getAgreeButtonText(), primary.getButton().getPrimary().getColor(), null, 4, null);
        AppCompatButton appCompatButton3 = getBinding().btnDecline;
        Intrinsics.checkNotNullExpressionValue(appCompatButton3, "binding.btnDecline");
        ExtensionsKt.setupText$default(appCompatButton3, getModel().getDeclineButtonText(), primary.getButton().getSecondary().getColor(), null, 4, null);
        AppCompatButton appCompatButton4 = getBinding().btnDecline;
        Intrinsics.checkNotNullExpressionValue(appCompatButton4, "binding.btnDecline");
        ExtensionsKt.setCornerStroke(appCompatButton4, primary.getButton().getSecondary().getBorderColor());
        Markdown.INSTANCE.setupMarkdown$capturesdk_productionRelease(Color.parseColor(getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getBackgroundColor()), new Function2<String, String, Unit>() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment$setupCustomUi$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                invoke2(str, str2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String title, String link) {
                ConsentModuleModel model;
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(link, "link");
                ConsentFragment consentFragment = ConsentFragment.this;
                model = consentFragment.getModel();
                consentFragment.handleLinkClick(link, title, model.getConsentVersion());
            }
        });
        AppCompatTextView appCompatTextView = getBinding().tvConsentHeader;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvConsentHeader");
        ExtensionsKt.setupText$default(appCompatTextView, getModel().getHeaderText(), getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getColor(), null, 4, null);
        ViewCompat.setAccessibilityHeading(getBinding().tvConsentHeader, true);
        RecyclerView recyclerView = getBinding().rvContents;
        ConsentAdapter consentAdapter = new ConsentAdapter(new ConsentAdapter.Config(getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getColor(), getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getBackgroundColor(), getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getColor(), getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getColor()), getGraph().getAccessibilityAnnouncer());
        consentAdapter.setCheckboxClicked(new Function3<ConsentAdapter.Item, Boolean, Boolean, Unit>() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment$setupCustomUi$3$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ConsentAdapter.Item item, Boolean bool, Boolean bool2) {
                invoke(item, bool.booleanValue(), bool2.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ConsentAdapter.Item item, boolean z, boolean z2) {
                ConsentModuleModel model;
                ConsentModuleModel model2;
                ConsentViewModel consentViewModel;
                Object obj;
                ConsentViewModel consentViewModel2;
                Intrinsics.checkNotNullParameter(item, "item");
                ConsentFragment consentFragment = ConsentFragment.this;
                Pair[] pairArr = new Pair[6];
                pairArr[0] = new Pair("type", AnalyticsConstantsKt.CHECKBOX);
                pairArr[1] = new Pair(AnalyticsConstantsKt.KEY_SCREEN, AnalyticsConstantsKt.CONSENT_SCREEN);
                pairArr[2] = new Pair("code", z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                model = ConsentFragment.this.getModel();
                pairArr[3] = new Pair("version", model.getConsentVersion());
                pairArr[4] = new Pair("id", item.getId());
                model2 = ConsentFragment.this.getModel();
                Iterator<T> it = model2.getBodyComponents().iterator();
                while (true) {
                    consentViewModel = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.areEqual(((BodyComponentModel) obj).getId(), item.getId())) {
                            break;
                        }
                    }
                }
                BodyComponentModel bodyComponentModel = (BodyComponentModel) obj;
                pairArr[5] = new Pair("flag", bodyComponentModel != null ? Intrinsics.areEqual((Object) bodyComponentModel.getMandatory(), (Object) true) : false ? AnalyticsConstantsKt.MANDATORY : AnalyticsConstantsKt.OPTIONAL);
                consentFragment.sendEvent("clicked", pairArr);
                ConsentFragment.this.validateCheckBox(z, z2);
                consentViewModel2 = ConsentFragment.this.consentViewModel;
                if (consentViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
                } else {
                    consentViewModel = consentViewModel2;
                }
                consentViewModel.onCheckboxClick(item.getId(), z);
            }
        });
        List<BodyComponentModel> bodyComponents = getModel().getBodyComponents();
        ArrayList arrayList = new ArrayList();
        for (BodyComponentModel bodyComponentModel : bodyComponents) {
            if (Intrinsics.areEqual(bodyComponentModel.getType(), Content.CHECKBOX.getLabel())) {
                Markdown.MarkDownCheckBox parseMarkdownWithCheckboxes = Markdown.INSTANCE.parseMarkdownWithCheckboxes(bodyComponentModel.getContent());
                validateCheckBox(parseMarkdownWithCheckboxes.isChecked(), Intrinsics.areEqual((Object) bodyComponentModel.getMandatory(), (Object) true));
                text = new ConsentAdapter.Item.Checkbox(bodyComponentModel.getId(), Intrinsics.areEqual((Object) bodyComponentModel.getMandatory(), (Object) true), parseMarkdownWithCheckboxes.getText(), parseMarkdownWithCheckboxes.isChecked());
            } else {
                text = Intrinsics.areEqual(bodyComponentModel.getType(), Content.TEXT.getLabel()) ? new ConsentAdapter.Item.Text(bodyComponentModel.getId(), bodyComponentModel.getContent()) : null;
            }
            if (text != null) {
                arrayList.add(text);
            }
        }
        consentAdapter.submitList(arrayList);
        recyclerView.setAdapter(consentAdapter);
        final AlertDialog create = new AlertDialog.Builder(requireActivity(), R.style.socure_consent_alert_dialog_style).setMessage(getModel().getWarningMessageText()).setCancelable(false).setPositiveButton(getModel().getWarningMessageCloseText(), new DialogInterface.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(create, "Builder(requireActivity(…                .create()");
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ConsentFragment.setupCustomUi$lambda$4(AlertDialog.this, this, dialogInterface);
            }
        });
        getBinding().btnAgree.setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentFragment.setupCustomUi$lambda$5(ConsentFragment.this, create, view);
            }
        });
        getBinding().btnDecline.setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentFragment.setupCustomUi$lambda$6(ConsentFragment.this, view);
            }
        });
        getBinding().brandView.setUpBrandView(getStartSessionModel().getGlobalConfig().getCommonLabels().getPoweredBy(), R.drawable.socure_logo_black, R.color.socure_black);
        getBinding().brandView.setContentDescription(getStartSessionModel().getGlobalConfig().getCommonLabels().getPoweredBy());
        getBinding().clProgressView.setContentDescription(getModel().getProcessingConsent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCustomUi$lambda$4(AlertDialog dialog, ConsentFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.getButton(-1).setTextColor(Color.parseColor(this$0.getStartSessionModel().getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getSecondary().getColor()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCustomUi$lambda$5(ConsentFragment this$0, AlertDialog dialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        ConsentViewModel consentViewModel = this$0.consentViewModel;
        ConsentViewModel consentViewModel2 = null;
        if (consentViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
            consentViewModel = null;
        }
        if (consentViewModel.isAllSelected()) {
            LoggerKt.logD("SDLT_CF", "agree clicked");
            Pair<String, String>[] pairArr = new Pair[4];
            pairArr[0] = new Pair<>("version", this$0.getModel().getConsentVersion());
            ConsentModuleModel model = this$0.getModel();
            ConsentViewModel consentViewModel3 = this$0.consentViewModel;
            if (consentViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
                consentViewModel3 = null;
            }
            pairArr[1] = new Pair<>("code", ConsentModuleModelKt.selectedArray(model, consentViewModel3.getSelectedIds()));
            pairArr[2] = new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, AnalyticsConstantsKt.CONSENT_SCREEN);
            pairArr[3] = this$0.getScrTimeArg();
            this$0.sendEvent(AnalyticsConstantsKt.CONSENT_GIVEN, pairArr);
            this$0.getBinding().clProgressView.setVisibility(0);
            this$0.announcementConsentProcess();
            ConsentViewModel consentViewModel4 = this$0.consentViewModel;
            if (consentViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
            } else {
                consentViewModel2 = consentViewModel4;
            }
            consentViewModel2.onAcceptClick();
            return;
        }
        LoggerKt.logD("SDLT_CF", "agree button was clicked when all mandatory checkboxes were not checked");
        Pair<String, String>[] pairArr2 = new Pair[4];
        pairArr2[0] = new Pair<>("type", AnalyticsConstantsKt.AGREE_BUTTON);
        pairArr2[1] = new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, AnalyticsConstantsKt.CONSENT_SCREEN);
        pairArr2[2] = new Pair<>("version", this$0.getModel().getConsentVersion());
        ConsentModuleModel model2 = this$0.getModel();
        ConsentViewModel consentViewModel5 = this$0.consentViewModel;
        if (consentViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
        } else {
            consentViewModel2 = consentViewModel5;
        }
        pairArr2[3] = new Pair<>("code", ConsentModuleModelKt.selectedArray(model2, consentViewModel2.getSelectedIds()));
        this$0.sendEvent("clicked", pairArr2);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCustomUi$lambda$6(ConsentFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LoggerKt.logD("SDLT_CF", "decline clicked");
        Pair<String, String>[] pairArr = new Pair[3];
        pairArr[0] = new Pair<>("version", this$0.getModel().getConsentVersion());
        ConsentModuleModel model = this$0.getModel();
        ConsentViewModel consentViewModel = this$0.consentViewModel;
        ConsentViewModel consentViewModel2 = null;
        if (consentViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
            consentViewModel = null;
        }
        pairArr[1] = new Pair<>("code", ConsentModuleModelKt.selectedArray(model, consentViewModel.getSelectedIds()));
        pairArr[2] = this$0.getScrTimeArg();
        this$0.sendEvent(AnalyticsConstantsKt.CONSENT_NOT_GIVEN, pairArr);
        Pair<String, String>[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair<>("type", AnalyticsConstantsKt.CONSENT_NOT_GIVEN);
        pairArr2[1] = new Pair<>("version", this$0.getModel().getConsentVersion());
        ConsentModuleModel model2 = this$0.getModel();
        ConsentViewModel consentViewModel3 = this$0.consentViewModel;
        if (consentViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
            consentViewModel3 = null;
        }
        pairArr2[2] = new Pair<>("code", ConsentModuleModelKt.selectedArray(model2, consentViewModel3.getSelectedIds()));
        this$0.sendEvent("error", pairArr2);
        this$0.getBinding().clProgressView.setVisibility(0);
        this$0.announcementConsentProcess();
        ConsentViewModel consentViewModel4 = this$0.consentViewModel;
        if (consentViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("consentViewModel");
        } else {
            consentViewModel2 = consentViewModel4;
        }
        consentViewModel2.onDeclineClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateCheckBox(boolean isChecked, boolean isMandatory) {
        if (isMandatory && !isChecked) {
            getBinding().btnAgree.setEnabled(false);
            getBinding().btnAgree.setAlpha(0.5f);
        } else {
            getBinding().btnAgree.setEnabled(true);
            getBinding().btnAgree.setAlpha(1.0f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AnnounceAccessibilityMessageUseCase accessibilityAnnouncer = getGraph().getAccessibilityAnnouncer();
        AppCompatTextView appCompatTextView = getBinding().tvConsentHeader;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvConsentHeader");
        AnnounceAccessibilityMessageUseCaseKt.queue$default(accessibilityAnnouncer, appCompatTextView, getModel().getHeaderText(), false, 4, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLinkClick(String hyperLinkUrl, String hyperLinkPhrase, String version) {
        LoggerKt.logD("SDLT_CF", "handleLinkClick: " + hyperLinkUrl + " | " + hyperLinkPhrase);
        try {
            Pair<String, String>[] pairArr = new Pair[5];
            pairArr[0] = new Pair<>("type", AnalyticsConstantsKt.HYPER_LINK);
            pairArr[1] = new Pair<>(AnalyticsConstantsKt.KEY_SCREEN, AnalyticsConstantsKt.CONSENT_SCREEN);
            pairArr[2] = new Pair<>(AnalyticsConstantsKt.KEY_ENDPOINT, hyperLinkUrl);
            if (hyperLinkPhrase == null) {
                hyperLinkPhrase = AbstractJsonLexerKt.NULL;
            }
            pairArr[3] = new Pair<>("message", hyperLinkPhrase);
            pairArr[4] = new Pair<>("version", version);
            sendEvent("clicked", pairArr);
            CustomTabColorSchemeParams build = new CustomTabColorSchemeParams.Builder().setToolbarColor(ContextCompat.getColor(requireContext(), R.color.socure_white)).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
            CustomTabsIntent build2 = new CustomTabsIntent.Builder().setShareState(2).setDefaultColorSchemeParams(build).build();
            Intrinsics.checkNotNullExpressionValue(build2, "builder.setShareState(Cu…omTabColorParams).build()");
            build2.launchUrl(requireContext(), Uri.parse(hyperLinkUrl));
        } catch (Throwable th) {
            if (th instanceof ActivityNotFoundException) {
                LoggerKt.logE$default("SDLT_CF", "updateHyperLink error: ActivityNotFoundException", null, 4, null);
                NavController findNavController = FragmentKt.findNavController(this);
                ConsentFragmentDirections.ActionConsentPrivacyDialog actionConsentPrivacyDialog = ConsentFragmentDirections.actionConsentPrivacyDialog(hyperLinkUrl, getStartSessionModel().getGlobalConfig().getNativeLabelsModel().getCloseButtonContinueDescription());
                Intrinsics.checkNotNullExpressionValue(actionConsentPrivacyDialog, "actionConsentPrivacyDial…                        )");
                ExtensionsKt.safeNavigate(findNavController, actionConsentPrivacyDialog);
                return;
            }
            LoggerKt.logE$default("SDLT_CF", "updateHyperLink error: " + th.getLocalizedMessage(), null, 4, null);
        }
    }

    private final void announcementConsentProcess() {
        AnnounceAccessibilityMessageUseCase accessibilityAnnouncer = getGraph().getAccessibilityAnnouncer();
        ConstraintLayout constraintLayout = getBinding().clProgressView;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clProgressView");
        AnnounceAccessibilityMessageUseCaseKt.queue$default(accessibilityAnnouncer, constraintLayout, getModel().getProcessingConsent(), false, 4, null);
        LoggerKt.logD("SDLT_CF", "announcementConsentProcess called");
    }
}
