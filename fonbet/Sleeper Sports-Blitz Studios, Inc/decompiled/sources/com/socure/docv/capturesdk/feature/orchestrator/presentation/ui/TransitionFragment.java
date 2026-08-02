package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.socure.docv.capturesdk.di.orchestrator.OrchestratorActivityComponent;
import com.socure.docv.capturesdk.models.TransitionModuleModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TransitionFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/TransitionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "component", "Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "getComponent", "()Lcom/socure/docv/capturesdk/di/orchestrator/OrchestratorActivityComponent;", "model", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "getModel", "()Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "submitTransitionModule", "", "Companion", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransitionFragment extends Fragment {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String MODEL = "model";

    /* JADX INFO: Access modifiers changed from: private */
    public final OrchestratorActivityComponent getComponent() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.OrchestratorActivity");
        return ((OrchestratorActivity) requireActivity).getComponent();
    }

    public final TransitionModuleModel getModel() {
        Object obj;
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            obj = arguments.getParcelable("model", TransitionModuleModel.class);
        } else {
            Object parcelable = arguments.getParcelable("model");
            obj = (TransitionModuleModel) (parcelable instanceof TransitionModuleModel ? parcelable : null);
        }
        return (TransitionModuleModel) obj;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1757425532, true, new Function2<Composer, Integer, Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.TransitionFragment$onCreateView$1$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1757425532, i, -1, "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.TransitionFragment.onCreateView.<anonymous>.<anonymous> (TransitionFragment.kt:34)");
                    }
                    TransitionModuleModel model = TransitionFragment.this.getModel();
                    if (model != null) {
                        final TransitionFragment transitionFragment = TransitionFragment.this;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        String documentType = model.getDocumentType();
                        String str = documentType == null ? "" : documentType;
                        String headerText = model.getLabels().getHeaderText();
                        String str2 = headerText == null ? "" : headerText;
                        String instructionsPrimaryText = model.getLabels().getInstructionsPrimaryText();
                        String str3 = instructionsPrimaryText == null ? "" : instructionsPrimaryText;
                        String continueButton = model.getLabels().getContinueButton();
                        String str4 = continueButton == null ? "" : continueButton;
                        String instructionsSecondaryText = model.getLabels().getInstructionsSecondaryText();
                        TertiaryTextData tertiaryTextData = new TertiaryTextData(instructionsSecondaryText != null ? instructionsSecondaryText : "", null, 2, null);
                        Integer totalVerificationCount = model.getTotalVerificationCount();
                        int intValue = totalVerificationCount != null ? totalVerificationCount.intValue() : 1;
                        Integer currentVerificationCount = model.getCurrentVerificationCount();
                        SocureMultiStepScreenState socureMultiStepScreenState = new SocureMultiStepScreenState(str, str2, str3, tertiaryTextData, str4, null, intValue, currentVerificationCount != null ? currentVerificationCount.intValue() : 1);
                        composer.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean changed = composer.changed(transitionFragment);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.TransitionFragment$onCreateView$1$1$1$1$1
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
                                    TransitionFragment.this.submitTransitionModule();
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceableGroup();
                        Function0 function0 = (Function0) rememberedValue;
                        composer.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean changed2 = composer.changed(transitionFragment);
                        Object rememberedValue2 = composer.rememberedValue();
                        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.TransitionFragment$onCreateView$1$1$1$2$1
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
                                    FragmentActivity requireActivity = TransitionFragment.this.requireActivity();
                                    OrchestratorActivity orchestratorActivity = requireActivity instanceof OrchestratorActivity ? (OrchestratorActivity) requireActivity : null;
                                    if (orchestratorActivity != null) {
                                        orchestratorActivity.backToCallerUnknown();
                                    }
                                }
                            };
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        composer.endReplaceableGroup();
                        SocureMultiStepScreenKt.SocureMultiStepScreen(socureMultiStepScreenState, fillMaxSize$default, true, function0, null, (Function0) rememberedValue2, composer, 432, 16);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitTransitionModule() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new TransitionFragment$submitTransitionModule$1(this, null), 2, null);
    }

    /* compiled from: TransitionFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/TransitionFragment$Companion;", "", "()V", "MODEL", "", "newInstance", "Lcom/socure/docv/capturesdk/feature/orchestrator/presentation/ui/TransitionFragment;", "model", "Lcom/socure/docv/capturesdk/models/TransitionModuleModel;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransitionFragment newInstance(TransitionModuleModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            TransitionFragment transitionFragment = new TransitionFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("model", model);
            transitionFragment.setArguments(bundle);
            return transitionFragment;
        }
    }
}
