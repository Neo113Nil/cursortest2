package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&JU\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "<init>", "()V", "exposedDropdownSize", "Landroidx/compose/ui/Modifier;", "matchTextFieldWidth", "", "ExposedDropdownMenu", "", "expanded", "onDismissRequest", "Lkotlin/Function0;", "modifier", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenu$lambda$4(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, Function0 function0, Modifier modifier, ScrollState scrollState, Function3 function3, int i, int i2, Composer composer, int i3) {
        exposedDropdownMenuBoxScope.ExposedDropdownMenu(z, function0, modifier, scrollState, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public abstract Modifier exposedDropdownSize(Modifier modifier, boolean z);

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ExposedDropdownMenu(boolean z, final Function0<Unit> function0, Modifier modifier, ScrollState scrollState, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        ScrollState scrollState2;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        final ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope;
        final Modifier modifier3;
        final ScrollState scrollState3;
        ScopeUpdateScope endRestartGroup;
        boolean z3;
        final ScrollState rememberScrollState;
        Object rememberedValue;
        final MutableTransitionState mutableTransitionState;
        Object rememberedValue2;
        Object rememberedValue3;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1576205770);
        ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)N(expanded,onDismissRequest,modifier,scrollState,content)196@8241L42:ExposedDropdownMenu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        scrollState2 = scrollState;
                        if (startRestartGroup.changed(scrollState2)) {
                            i5 = 2048;
                            i3 |= i5;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i5 = 1024;
                    i3 |= i5;
                } else {
                    scrollState2 = scrollState;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        exposedDropdownMenuBoxScope = this;
                    } else {
                        exposedDropdownMenuBoxScope = this;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(exposedDropdownMenuBoxScope) ? 131072 : 65536;
                        }
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "184@7740L21");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier3 = modifier2;
                        } else {
                            Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                modifier3 = companion;
                                z3 = true;
                                rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1576205770, i3, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:186)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1389732352, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new MutableTransitionState(false);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                mutableTransitionState = (MutableTransitionState) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z2));
                                if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                                    startRestartGroup.startReplaceGroup(132216667);
                                    ComposerKt.sourceInformation(startRestartGroup, "200@8443L51,201@8534L7,203@8651L147,210@8968L337,207@8812L493");
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1389738825, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m6434boximpl(TransformOrigin.INSTANCE.m6447getCenterSzJe1aQ()), null, 2, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    final MutableState mutableState = (MutableState) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Density density = (Density) consume;
                                    long m8869getZeroRKDOV3M = DpOffset.INSTANCE.m8869getZeroRKDOV3M();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1389745577, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit ExposedDropdownMenu$lambda$3$lambda$2;
                                                ExposedDropdownMenu$lambda$3$lambda$2 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu$lambda$3$lambda$2(MutableState.this, (IntRect) obj, (IntRect) obj2);
                                                return ExposedDropdownMenu$lambda$3$lambda$2;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                                    ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(function02, new DropdownMenuPositionProvider(m8869getZeroRKDOV3M, density, (Function2) rememberedValue3, null), ComposableLambdaKt.rememberComposableLambda(1604457564, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i6) {
                                            ComposerKt.sourceInformation(composer2, "C211@8986L305:ExposedDropdownMenu.kt#jmzs0o");
                                            if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1604457564, i6, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:211)");
                                            }
                                            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, rememberScrollState, ExposedDropdownMenuBoxScope.exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier3, false, 1, null), function33, composer2, MutableTransitionState.$stable | 48, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(133094060);
                                    startRestartGroup.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                scrollState3 = rememberScrollState;
                            } else {
                                modifier3 = companion;
                            }
                        }
                        z3 = true;
                        rememberScrollState = scrollState2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1389732352, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableTransitionState = (MutableTransitionState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z2));
                        if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        }
                        startRestartGroup.startReplaceGroup(132216667);
                        ComposerKt.sourceInformation(startRestartGroup, "200@8443L51,201@8534L7,203@8651L147,210@8968L337,207@8812L493");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1389738825, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState<TransformOrigin> mutableState2 = (MutableState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density2 = (Density) consume2;
                        long m8869getZeroRKDOV3M2 = DpOffset.INSTANCE.m8869getZeroRKDOV3M();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1389745577, "CC(remember):ExposedDropdownMenu.kt#9igjgp");
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function332 = function32;
                        ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(function02, new DropdownMenuPositionProvider(m8869getZeroRKDOV3M2, density2, (Function2) rememberedValue3, null), ComposableLambdaKt.rememberComposableLambda(1604457564, z3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                ComposerKt.sourceInformation(composer2, "C211@8986L305:ExposedDropdownMenu.kt#jmzs0o");
                                if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1604457564, i6, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:211)");
                                }
                                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState2, rememberScrollState, ExposedDropdownMenuBoxScope.exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier3, false, 1, null), function332, composer2, MutableTransitionState.$stable | 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                        startRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        scrollState3 = rememberScrollState;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        scrollState3 = scrollState2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final boolean z4 = z2;
                        final Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ExposedDropdownMenu$lambda$4;
                                ExposedDropdownMenu$lambda$4 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu$lambda$4(ExposedDropdownMenuBoxScope.this, z4, function0, modifier4, scrollState3, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return ExposedDropdownMenu$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                function32 = function3;
                if ((i2 & 32) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            function32 = function3;
            if ((i2 & 32) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function02 = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        function32 = function3;
        if ((i2 & 32) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExposedDropdownMenu$lambda$3$lambda$2(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.m6434boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
        return Unit.INSTANCE;
    }
}
