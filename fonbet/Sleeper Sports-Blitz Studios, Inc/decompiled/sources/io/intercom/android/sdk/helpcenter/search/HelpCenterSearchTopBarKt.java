package io.intercom.android.sdk.helpcenter.search;

import android.app.Activity;
import android.view.Window;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.core.view.WindowCompat;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.objectweb.asm.Opcodes;

/* compiled from: HelpCenterSearchTopBar.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\u0007X\u008a\u008e\u0002"}, d2 = {"HelpCenterSearchTopBar", "", "onBackClick", "Lkotlin/Function0;", "onTextChanged", "Lkotlin/Function1;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onSearchAction", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release", "searchText"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HelpCenterSearchTopBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterSearchTopBar$lambda$8(Function0 onBackClick, Function1 onTextChanged, Function1 onSearchAction, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(onBackClick, "$onBackClick");
        Intrinsics.checkNotNullParameter(onTextChanged, "$onTextChanged");
        Intrinsics.checkNotNullParameter(onSearchAction, "$onSearchAction");
        HelpCenterSearchTopBar(onBackClick, onTextChanged, onSearchAction, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HelpCenterSearchTopBar(final Function0<Unit> onBackClick, final Function1<? super MutableStateFlow<String>, Unit> onTextChanged, final Function1<? super String, Unit> onSearchAction, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Intrinsics.checkNotNullParameter(onSearchAction, "onSearchAction");
        Composer startRestartGroup = composer.startRestartGroup(1649601348);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(onBackClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onTextChanged) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onSearchAction) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startReplaceGroup(149283995);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            FocusManager focusManager = (FocusManager) consume;
            startRestartGroup.startReplaceGroup(149287229);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(149288863);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = StateFlowKt.MutableStateFlow("");
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableStateFlow mutableStateFlow = (MutableStateFlow) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            final boolean z = !ColorExtensionsKt.m13186isDarkColor8_81llA(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13106getHeader0d7_KjU());
            ProvidableCompositionLocal<Activity> localActivity = LocalActivityKt.getLocalActivity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localActivity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Activity activity = (Activity) consume2;
            final Window window = activity != null ? activity.getWindow() : null;
            startRestartGroup.startReplaceGroup(149295521);
            if (window != null) {
                EffectsKt.SideEffect(new Function0() { // from class: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit HelpCenterSearchTopBar$lambda$6$lambda$5;
                        HelpCenterSearchTopBar$lambda$6$lambda$5 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$6$lambda$5(window, z);
                        return HelpCenterSearchTopBar$lambda$6$lambda$5;
                    }
                }, startRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$2(onTextChanged, mutableStateFlow, null), startRestartGroup, 70);
            Unit unit2 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(149307211);
            HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$3$1(focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 70);
            composer2 = startRestartGroup;
            AppBarKt.m2664TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-227105272, true, new HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$4(focusRequester, mutableState, onSearchAction, focusManager, mutableStateFlow), startRestartGroup, 54), WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), ComposableLambdaKt.rememberComposableLambda(-1996576886, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$HelpCenterSearchTopBar$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        IconButtonKt.IconButton(onBackClick, null, false, null, null, null, ComposableSingletons$HelpCenterSearchTopBarKt.INSTANCE.m12016getLambda3$intercom_sdk_base_release(), composer3, 1572864, 62);
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), null, 0.0f, null, TopAppBarDefaults.INSTANCE.m4141topAppBarColors5tl4gsc(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13106getHeader0d7_KjU(), 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13113getOnHeader0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13113getOnHeader0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13113getOnHeader0d7_KjU(), 0L, startRestartGroup, TopAppBarDefaults.$stable << 18, 34), null, composer2, 390, Opcodes.INVOKESTATIC);
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.helpcenter.search.HelpCenterSearchTopBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HelpCenterSearchTopBar$lambda$8;
                    HelpCenterSearchTopBar$lambda$8 = HelpCenterSearchTopBarKt.HelpCenterSearchTopBar$lambda$8(Function0.this, onTextChanged, onSearchAction, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HelpCenterSearchTopBar$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HelpCenterSearchTopBar$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterSearchTopBar$lambda$6$lambda$5(Window it, boolean z) {
        Intrinsics.checkNotNullParameter(it, "$it");
        WindowCompat.getInsetsController(it, it.getDecorView()).setAppearanceLightStatusBars(z);
        return Unit.INSTANCE;
    }
}
