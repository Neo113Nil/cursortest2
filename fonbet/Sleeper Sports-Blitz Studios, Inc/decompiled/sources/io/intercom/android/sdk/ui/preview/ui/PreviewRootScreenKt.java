package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PreviewRootScreen.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000b2'\u0010\u0010\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"PreviewRootScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "previewArgs", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "viewModel", "Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "onBackCLick", "Lkotlin/Function0;", "onDeleteClick", "Lkotlin/Function1;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "Lkotlin/ParameterName;", "name", "file", "onSendClick", "", "Landroid/net/Uri;", "uris", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewRootScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PreviewRootScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreen$lambda$2(Modifier modifier, IntercomPreviewArgs previewArgs, PreviewViewModel previewViewModel, Function0 onBackCLick, Function1 onDeleteClick, Function1 onSendClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(previewArgs, "$previewArgs");
        Intrinsics.checkNotNullParameter(onBackCLick, "$onBackCLick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        Intrinsics.checkNotNullParameter(onSendClick, "$onSendClick");
        PreviewRootScreen(modifier, previewArgs, previewViewModel, onBackCLick, onDeleteClick, onSendClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreenPreview$lambda$6(int i, Composer composer, int i2) {
        PreviewRootScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PreviewRootScreen(Modifier modifier, final IntercomPreviewArgs previewArgs, PreviewViewModel previewViewModel, final Function0<Unit> onBackCLick, final Function1<? super IntercomPreviewFile, Unit> onDeleteClick, final Function1<? super List<? extends Uri>, Unit> onSendClick, Composer composer, final int i, final int i2) {
        final PreviewViewModel previewViewModel2;
        int i3;
        CreationExtras.Empty empty;
        Intrinsics.checkNotNullParameter(previewArgs, "previewArgs");
        Intrinsics.checkNotNullParameter(onBackCLick, "onBackCLick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Intrinsics.checkNotNullParameter(onSendClick, "onSendClick");
        Composer startRestartGroup = composer.startRestartGroup(1944224733);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 4) != 0) {
            String uuid = UUID.randomUUID().toString();
            ViewModelProvider.Factory factory$intercom_sdk_ui_release = PreviewViewModel.INSTANCE.factory$intercom_sdk_ui_release(previewArgs);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                empty = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                empty = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PreviewViewModel.class), current, uuid, factory$intercom_sdk_ui_release, empty, startRestartGroup, 4096, 0);
            startRestartGroup = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            previewViewModel2 = (PreviewViewModel) viewModel;
            i3 = i & (-897);
        } else {
            previewViewModel2 = previewViewModel;
            i3 = i;
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        final PreviewUiState previewUiState = (PreviewUiState) SnapshotStateKt.collectAsState(previewViewModel2.getState$intercom_sdk_ui_release(), null, startRestartGroup, 8, 1).getValue();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        PagerState rememberPagerState = PagerStateKt.rememberPagerState(previewUiState.getCurrentPage(), 0.0f, new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int PreviewRootScreen$lambda$0;
                PreviewRootScreen$lambda$0 = PreviewRootScreenKt.PreviewRootScreen$lambda$0(PreviewUiState.this);
                return Integer.valueOf(PreviewRootScreen$lambda$0);
            }
        }, startRestartGroup, 48, 0);
        Composer composer2 = startRestartGroup;
        ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit PreviewRootScreen$lambda$1;
                PreviewRootScreen$lambda$1 = PreviewRootScreenKt.PreviewRootScreen$lambda$1(context, previewArgs, previewViewModel2, previewUiState, ((Boolean) obj).booleanValue());
                return PreviewRootScreen$lambda$1;
            }
        }, composer2, 8);
        EffectsKt.LaunchedEffect("Page Navigation", new PreviewRootScreenKt$PreviewRootScreen$1(rememberPagerState, previewViewModel2, null), composer2, 70);
        final PreviewViewModel previewViewModel3 = previewViewModel2;
        ScaffoldKt.m3518ScaffoldTvnljyQ(modifier2, null, null, null, null, 0, Color.INSTANCE.m6065getBlack0d7_KjU(), Color.INSTANCE.m6076getWhite0d7_KjU(), null, ComposableLambdaKt.rememberComposableLambda(-1427415762, true, new PreviewRootScreenKt$PreviewRootScreen$2(previewUiState, onBackCLick, rememberPagerState, onDeleteClick, onSendClick, context, rememberLauncherForActivityResult, previewViewModel3, (CoroutineScope) rememberedValue), composer2, 54), composer2, (i3 & 14) | 819462144, TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewRootScreen$lambda$2;
                    PreviewRootScreen$lambda$2 = PreviewRootScreenKt.PreviewRootScreen$lambda$2(Modifier.this, previewArgs, previewViewModel3, onBackCLick, onDeleteClick, onSendClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewRootScreen$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int PreviewRootScreen$lambda$0(PreviewUiState state) {
        Intrinsics.checkNotNullParameter(state, "$state");
        return state.getFiles().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewRootScreen$saveFile(PreviewViewModel previewViewModel, PreviewUiState previewUiState, Context context) {
        previewViewModel.saveFile$intercom_sdk_ui_release(previewUiState.getFiles().get(previewUiState.getCurrentPage()), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreen$lambda$1(Context context, IntercomPreviewArgs previewArgs, PreviewViewModel previewViewModel, PreviewUiState state, boolean z) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(previewArgs, "$previewArgs");
        Intrinsics.checkNotNullParameter(state, "$state");
        if (z) {
            PreviewRootScreen$saveFile(previewViewModel, state, context);
        } else {
            Toast.makeText(context, previewArgs.getDownloadState().getPermissionDeniedText(), 1).show();
        }
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void PreviewRootScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2020659128);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            PreviewRootScreen(null, new IntercomPreviewArgs(CollectionsKt.emptyList(), null, null, false, null, 30, null), new PreviewViewModel(new IntercomPreviewArgs(CollectionsKt.emptyList(), null, null, false, null, 30, null)), new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit PreviewRootScreenPreview$lambda$4;
                    PreviewRootScreenPreview$lambda$4 = PreviewRootScreenKt.PreviewRootScreenPreview$lambda$4((IntercomPreviewFile) obj);
                    return PreviewRootScreenPreview$lambda$4;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit PreviewRootScreenPreview$lambda$5;
                    PreviewRootScreenPreview$lambda$5 = PreviewRootScreenKt.PreviewRootScreenPreview$lambda$5((List) obj);
                    return PreviewRootScreenPreview$lambda$5;
                }
            }, startRestartGroup, 224832, 1);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewRootScreenPreview$lambda$6;
                    PreviewRootScreenPreview$lambda$6 = PreviewRootScreenKt.PreviewRootScreenPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewRootScreenPreview$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreenPreview$lambda$4(IntercomPreviewFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRootScreenPreview$lambda$5(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
