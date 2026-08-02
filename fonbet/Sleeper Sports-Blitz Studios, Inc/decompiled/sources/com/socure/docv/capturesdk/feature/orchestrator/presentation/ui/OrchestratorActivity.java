package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.api.SocureDocVContext;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.resource.ResourceManager;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.common.workers.ImageWorker;
import com.socure.docv.capturesdk.databinding.OrchestratorActivitySocureBinding;
import com.socure.docv.capturesdk.di.ComponentProvider;
import com.socure.docv.capturesdk.di.DependencyGraphExtKt;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.feature.base.presentation.ui.BaseActivity;
import com.socure.docv.capturesdk.feature.consent.ui.ConsentFragment;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.IOrchestratorViewModel;
import com.socure.docv.capturesdk.feature.progress.ui.ProgressFragment;
import com.socure.docv.capturesdk.models.BackModuleModel;
import com.socure.docv.capturesdk.models.CommonLabelsModel;
import com.socure.docv.capturesdk.models.ConsentModuleModel;
import com.socure.docv.capturesdk.models.ErrorModule;
import com.socure.docv.capturesdk.models.FinishedModuleModel;
import com.socure.docv.capturesdk.models.FrontModuleModel;
import com.socure.docv.capturesdk.models.GlobalConfigModel;
import com.socure.docv.capturesdk.models.IDSelectionModel;
import com.socure.docv.capturesdk.models.ModuleModel;
import com.socure.docv.capturesdk.models.PassportModuleModel;
import com.socure.docv.capturesdk.models.SelfieModuleModel;
import com.socure.docv.capturesdk.models.StartSessionModel;
import com.socure.docv.capturesdk.models.TransitionModuleModel;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: OrchestratorActivity.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0013J\u001c\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0012\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u0013H\u0014J$\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010'\u001a\u00020\u0013H\u0002J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001b\u0010\u0005\u001a\u00020\u00038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/OrchestratorActivity;", "Lcom/socure/docv/capturesdk/feature/base/presentation/ui/BaseActivity;", "Lcom/socure/docv/capturesdk/di/ComponentProvider;", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "()V", "component", "getComponent", "()Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "component$delegate", "Lkotlin/Lazy;", "fragmentViewId", "", "resourceManager", "Lcom/socure/docv/capturesdk/common/resource/ResourceManager;", "toast", "Landroid/widget/Toast;", "viewModel", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/viewmodel/IOrchestratorViewModel;", "backToCaller", "", "error", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "startSessionModel", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "backToCallerUnknown", "backToCallerWithResponseCode", "clearFilesFromDisk", "clearGlobalVariables", "observeForError", "observeForNavigation", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setData", "data", "Landroid/content/Intent;", "socureDocVError", "setupFullScreenBehaviour", "setupLiveData", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrchestratorActivity extends BaseActivity implements ComponentProvider<OrchestratorActivityComponent> {
    private Toast toast;
    private IOrchestratorViewModel viewModel;
    private int fragmentViewId = -1;
    private final ResourceManager resourceManager = new ResourceManager();

    /* renamed from: component$delegate, reason: from kotlin metadata */
    private final Lazy component = LazyKt.lazy(new Function0<OrchestratorActivityComponent>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity$component$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final OrchestratorActivityComponent invoke() {
            return OrchestratorActivityComponent.INSTANCE.build(DependencyGraphExtKt.buildActivityComponent(OrchestratorActivity.this));
        }
    });

    @Override // com.socure.docv.capturesdk.di.ComponentProvider
    public OrchestratorActivityComponent getComponent() {
        return (OrchestratorActivityComponent) this.component.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object obj;
        IOrchestratorViewModel iOrchestratorViewModel = null;
        super.onCreate(null);
        final OrchestratorActivitySocureBinding inflate = OrchestratorActivitySocureBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setupFullScreenBehaviour();
        ViewCompat.setOnApplyWindowInsetsListener(inflate.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat onCreate$lambda$0;
                onCreate$lambda$0 = OrchestratorActivity.onCreate$lambda$0(OrchestratorActivity.this, inflate, view, windowInsetsCompat);
                return onCreate$lambda$0;
            }
        });
        setContentView(inflate.getRoot());
        this.fragmentViewId = inflate.fragmentContainerView.getId();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = intent.getParcelableExtra(Keys.KEY_DOCV_CONTEXT, SocureDocVContext.class);
        } else {
            Object parcelableExtra = intent.getParcelableExtra(Keys.KEY_DOCV_CONTEXT);
            if (!(parcelableExtra instanceof SocureDocVContext)) {
                parcelableExtra = null;
            }
            obj = (SocureDocVContext) parcelableExtra;
        }
        SocureDocVContext socureDocVContext = (SocureDocVContext) obj;
        if (socureDocVContext != null) {
            SessionManager.INSTANCE.setSocureDocVContext(socureDocVContext);
        } else {
            backToCallerWithResponseCode(SocureDocVError.SESSION_INITIATION_FAILURE, getComponent().getStartSessionCache().get());
        }
        this.viewModel = getComponent().getOrchestratorVMProvider().get$capturesdk_productionRelease(this);
        if (!StringsKt.isBlank(SessionManager.INSTANCE.getPublicKey())) {
            IOrchestratorViewModel iOrchestratorViewModel2 = this.viewModel;
            if (iOrchestratorViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                iOrchestratorViewModel2 = null;
            }
            iOrchestratorViewModel2.updateKeys();
            IOrchestratorViewModel iOrchestratorViewModel3 = this.viewModel;
            if (iOrchestratorViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                iOrchestratorViewModel3 = null;
            }
            iOrchestratorViewModel3.triggerDeviceFingerPrint(SessionManager.INSTANCE.getPublicKey(), SessionManager.INSTANCE.getUseSocureGov(), SessionManager.INSTANCE.getDeviceUrl());
            IOrchestratorViewModel iOrchestratorViewModel4 = this.viewModel;
            if (iOrchestratorViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                iOrchestratorViewModel4 = null;
            }
            iOrchestratorViewModel4.startSession();
            IOrchestratorViewModel iOrchestratorViewModel5 = this.viewModel;
            if (iOrchestratorViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                iOrchestratorViewModel = iOrchestratorViewModel5;
            }
            iOrchestratorViewModel.getOnSessionStarted().observe(this, new OrchestratorActivityKt$sam$androidx_lifecycle_Observer$0(new Function1<StartSessionModel, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity$onCreate$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StartSessionModel startSessionModel) {
                    invoke2(startSessionModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(StartSessionModel startSessionModel) {
                    try {
                        OrchestratorActivity orchestratorActivity = OrchestratorActivity.this;
                        Intrinsics.checkNotNullExpressionValue(startSessionModel, "startSessionModel");
                        orchestratorActivity.setupLiveData(startSessionModel);
                    } catch (Throwable th) {
                        LoggerKt.logD("SDLT_OA", "error msg: " + th.getLocalizedMessage());
                        OrchestratorActivity.this.backToCallerWithResponseCode(SocureDocVError.SESSION_INITIATION_FAILURE, startSessionModel);
                    }
                    OrchestratorActivity orchestratorActivity2 = OrchestratorActivity.this;
                    Intrinsics.checkNotNullExpressionValue(startSessionModel, "startSessionModel");
                    orchestratorActivity2.observeForNavigation(startSessionModel);
                }
            }));
        } else {
            IOrchestratorViewModel iOrchestratorViewModel6 = this.viewModel;
            if (iOrchestratorViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                iOrchestratorViewModel6 = null;
            }
            iOrchestratorViewModel6.sendEvent("error", new Pair<>("type", AnalyticsConstantsKt.ERR_SESSION_INITIATION), new Pair<>("message", "SESSION_INITIATION_FAILURE"));
            backToCallerWithResponseCode(SocureDocVError.INVALID_PUBLIC_KEY, null);
        }
        observeForError();
        clearFilesFromDisk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onCreate$lambda$0(OrchestratorActivity this$0, OrchestratorActivitySocureBinding binding, View view, WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        IOrchestratorViewModel iOrchestratorViewModel = this$0.viewModel;
        if (iOrchestratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            iOrchestratorViewModel = null;
        }
        iOrchestratorViewModel.setStatusBarHeight(Integer.valueOf(windowInsets.getInsets(WindowInsetsCompat.Type.systemBars()).top));
        ViewCompat.setOnApplyWindowInsetsListener(binding.getRoot(), null);
        return WindowInsetsCompat.CONSUMED;
    }

    private final void observeForError() {
        IOrchestratorViewModel iOrchestratorViewModel = this.viewModel;
        if (iOrchestratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            iOrchestratorViewModel = null;
        }
        iOrchestratorViewModel.getError().observe(this, new OrchestratorActivityKt$sam$androidx_lifecycle_Observer$0(new Function1<IOrchestratorViewModel.Error, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity$observeForError$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IOrchestratorViewModel.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IOrchestratorViewModel.Error error) {
                IOrchestratorViewModel iOrchestratorViewModel2;
                IOrchestratorViewModel iOrchestratorViewModel3;
                IOrchestratorViewModel iOrchestratorViewModel4;
                IOrchestratorViewModel iOrchestratorViewModel5 = null;
                if (Intrinsics.areEqual(error, IOrchestratorViewModel.Error.FailedToStartSession.INSTANCE)) {
                    OrchestratorActivity.this.backToCaller(SocureDocVError.SESSION_INITIATION_FAILURE, null);
                    return;
                }
                if (error instanceof IOrchestratorViewModel.Error.FailedToSubmitModule) {
                    OrchestratorActivity orchestratorActivity = OrchestratorActivity.this;
                    SocureDocVError socureDocVError = SocureDocVError.UNKNOWN;
                    iOrchestratorViewModel4 = OrchestratorActivity.this.viewModel;
                    if (iOrchestratorViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        iOrchestratorViewModel5 = iOrchestratorViewModel4;
                    }
                    orchestratorActivity.backToCaller(socureDocVError, iOrchestratorViewModel5.getOnSessionStarted().getValue());
                    return;
                }
                if (error instanceof IOrchestratorViewModel.Error.ApiError) {
                    OrchestratorActivity orchestratorActivity2 = OrchestratorActivity.this;
                    SocureDocVError socureError = ((IOrchestratorViewModel.Error.ApiError) error).getSocureError();
                    iOrchestratorViewModel3 = OrchestratorActivity.this.viewModel;
                    if (iOrchestratorViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        iOrchestratorViewModel5 = iOrchestratorViewModel3;
                    }
                    orchestratorActivity2.backToCaller(socureError, iOrchestratorViewModel5.getOnSessionStarted().getValue());
                    return;
                }
                OrchestratorActivity orchestratorActivity3 = OrchestratorActivity.this;
                SocureDocVError socureDocVError2 = SocureDocVError.UNKNOWN;
                iOrchestratorViewModel2 = OrchestratorActivity.this.viewModel;
                if (iOrchestratorViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    iOrchestratorViewModel5 = iOrchestratorViewModel2;
                }
                orchestratorActivity3.backToCaller(socureDocVError2, iOrchestratorViewModel5.getOnSessionStarted().getValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeForNavigation(final StartSessionModel startSessionModel) {
        IOrchestratorViewModel iOrchestratorViewModel = this.viewModel;
        if (iOrchestratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            iOrchestratorViewModel = null;
        }
        iOrchestratorViewModel.getModule().observe(this, new OrchestratorActivityKt$sam$androidx_lifecycle_Observer$0(new Function1<ModuleModel, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity$observeForNavigation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ModuleModel moduleModel) {
                invoke2(moduleModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ModuleModel moduleModel) {
                IOrchestratorViewModel iOrchestratorViewModel2;
                Integer num;
                Unit unit = null;
                if (moduleModel instanceof IDSelectionModel) {
                    num = Integer.valueOf(R.id.socure_action_doc_selection);
                } else if (moduleModel instanceof ConsentModuleModel) {
                    num = Integer.valueOf(R.id.socure_action_consent);
                } else if (moduleModel instanceof FrontModuleModel) {
                    num = Integer.valueOf(R.id.socure_action_front);
                } else if (moduleModel instanceof BackModuleModel) {
                    num = Integer.valueOf(R.id.socure_action_back);
                } else if (moduleModel instanceof PassportModuleModel) {
                    num = Integer.valueOf(R.id.socure_action_passport);
                } else if (moduleModel instanceof SelfieModuleModel) {
                    num = Integer.valueOf(R.id.socure_action_selfie);
                } else if (moduleModel instanceof TransitionModuleModel) {
                    num = Integer.valueOf(R.id.socure_action_transition);
                } else if (moduleModel instanceof UnstructuredModuleModel) {
                    num = Integer.valueOf(R.id.socure_nav_unstructured_doc_frag);
                } else {
                    if (moduleModel instanceof ErrorModule) {
                        OrchestratorActivity.this.backToCaller(SocureDocVError.UNKNOWN, startSessionModel);
                    } else if (Intrinsics.areEqual(moduleModel, FinishedModuleModel.INSTANCE)) {
                        iOrchestratorViewModel2 = OrchestratorActivity.this.viewModel;
                        if (iOrchestratorViewModel2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            iOrchestratorViewModel2 = null;
                        }
                        iOrchestratorViewModel2.sendEvent(AnalyticsConstantsKt.SCAN_UPLOAD_COMPLETE, new Pair[0]);
                        OrchestratorActivity.this.backToCaller(null, startSessionModel);
                    }
                    num = null;
                }
                if (num != null) {
                    OrchestratorActivity orchestratorActivity = OrchestratorActivity.this;
                    int intValue = num.intValue();
                    Fragment findFragmentById = orchestratorActivity.getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
                    Intrinsics.checkNotNull(findFragmentById, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                    NavController navController = ((NavHostFragment) findFragmentById).getNavController();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("model", moduleModel);
                    Unit unit2 = Unit.INSTANCE;
                    navController.navigate(intValue, bundle);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    OrchestratorActivity.this.backToCaller(SocureDocVError.UNKNOWN, startSessionModel);
                }
            }
        }));
    }

    private final void setupFullScreenBehaviour() {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(window, window.decorView)");
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsetsCompat.Type.systemBars());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupLiveData(final StartSessionModel startSessionModel) {
        IOrchestratorViewModel iOrchestratorViewModel = this.viewModel;
        if (iOrchestratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            iOrchestratorViewModel = null;
        }
        iOrchestratorViewModel.getActivityCaller().observe(this, new OrchestratorActivityKt$sam$androidx_lifecycle_Observer$0(new Function1<SocureDocVError, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity$setupLiveData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SocureDocVError socureDocVError) {
                invoke2(socureDocVError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SocureDocVError socureDocVError) {
                LoggerKt.logD("SDLT_OA", "activityCaller received: " + socureDocVError);
                OrchestratorActivity.this.backToCallerWithResponseCode(socureDocVError, startSessionModel);
            }
        }));
        LoggerKt.logD("SDLT_OA", "useOpenCv flag after view model creation: " + this.resourceManager.getSupportedFeatures().getOpenCvSupported());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void backToCallerWithResponseCode(SocureDocVError error, StartSessionModel startSessionModel) {
        GlobalConfigModel globalConfig;
        String eventId;
        Intent intent = new Intent();
        if (this.viewModel != null) {
            SessionManager sessionManager = SessionManager.INSTANCE;
            IOrchestratorViewModel iOrchestratorViewModel = this.viewModel;
            if (iOrchestratorViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                iOrchestratorViewModel = null;
            }
            sessionManager.setCapturedImages(UtilsKt.getCapturedImageMap(iOrchestratorViewModel.getUploadImageMap()));
        }
        if (startSessionModel != null && (globalConfig = startSessionModel.getGlobalConfig()) != null && (eventId = globalConfig.getEventId()) != null) {
            intent.putExtra("session_id", eventId);
        }
        intent.putExtra("error", error);
        setResult(0, intent);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        GlobalConfigModel globalConfig;
        CommonLabelsModel commonLabels;
        LoggerKt.logD("SDLT_OA", "onBackPressed called");
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(this.fragmentViewId);
        Intrinsics.checkNotNull(findFragmentById, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        FragmentManager childFragmentManager = ((NavHostFragment) findFragmentById).getChildFragmentManager();
        if ((childFragmentManager.getFragments().get(0) instanceof ProgressFragment) || (childFragmentManager.getFragments().get(0) instanceof ConsentFragment)) {
            return;
        }
        if (this.toast == null) {
            OrchestratorActivity orchestratorActivity = this;
            StartSessionModel startSessionModel = getComponent().getStartSessionCache().get();
            this.toast = Toast.makeText(orchestratorActivity, (startSessionModel == null || (globalConfig = startSessionModel.getGlobalConfig()) == null || (commonLabels = globalConfig.getCommonLabels()) == null) ? null : commonLabels.getBackPressWarning(), 1);
        }
        Toast toast = this.toast;
        if (toast != null) {
            toast.cancel();
        }
        Toast toast2 = this.toast;
        if (toast2 != null) {
            toast2.show();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        LoggerKt.logD("SDLT_OA", "onDestroy");
        clearGlobalVariables();
        super.onDestroy();
    }

    private final void clearGlobalVariables() {
        Toast toast = this.toast;
        if (toast != null) {
            if (toast != null) {
                toast.cancel();
            }
            this.toast = null;
        }
    }

    private final void clearFilesFromDisk() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        new ImageWorker(applicationContext, null, 2, null).clearDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void backToCaller(SocureDocVError error, StartSessionModel startSessionModel) {
        Intent intent = new Intent();
        setData(intent, error, startSessionModel);
        if (error == null) {
            setResult(-1, intent);
        } else {
            setResult(0, intent);
        }
        finish();
    }

    private final void setData(Intent data, SocureDocVError socureDocVError, StartSessionModel startSessionModel) {
        GlobalConfigModel globalConfig;
        String eventId;
        LoggerKt.logD("SDLT_OA", "setData called: " + socureDocVError);
        SessionManager sessionManager = SessionManager.INSTANCE;
        IOrchestratorViewModel iOrchestratorViewModel = this.viewModel;
        if (iOrchestratorViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            iOrchestratorViewModel = null;
        }
        sessionManager.setCapturedImages(UtilsKt.getCapturedImageMap(iOrchestratorViewModel.getUploadImageMap()));
        if (startSessionModel != null && (globalConfig = startSessionModel.getGlobalConfig()) != null && (eventId = globalConfig.getEventId()) != null) {
            data.putExtra("session_id", eventId);
        }
        if (socureDocVError == null) {
            data.putExtra("result", true);
        } else {
            data.putExtra("result", false);
            data.putExtra("error", socureDocVError);
        }
    }

    public final void backToCallerUnknown() {
        backToCaller(SocureDocVError.UNKNOWN, null);
    }
}
