package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.material.internal.ExposedDropdownMenuPopupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JK\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0017¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H&¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalMaterialApi
/* loaded from: classes6.dex */
public interface ExposedDropdownMenuBoxScope {
    void ExposedDropdownMenu(boolean z, Function0<Unit> function0, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i, int i2);

    Modifier exposedDropdownSize(Modifier modifier, boolean z);

    /* compiled from: ExposedDropdownMenu.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x01b5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void ExposedDropdownMenu(final ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, final Function0<Unit> onDismissRequest, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
            boolean z2;
            int i3;
            final Modifier modifier2;
            ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope2;
            final int i4;
            Modifier.Companion companion;
            Object rememberedValue;
            final MutableTransitionState mutableTransitionState;
            Object rememberedValue2;
            boolean changed;
            Object rememberedValue3;
            Modifier modifier3;
            Composer composer2;
            ScopeUpdateScope endRestartGroup;
            Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
            Intrinsics.checkNotNullParameter(content, "content");
            Composer startRestartGroup = composer.startRestartGroup(-1165636223);
            ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)P(1,3,2)244@9344L42,248@9546L51,249@9637L7,253@9784L139,257@9937L444:ExposedDropdownMenu.kt#jmzs0o");
            if ((i2 & 1) != 0) {
                i3 = i | 6;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 14) == 0) {
                    i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
            }
            if ((i2 & 2) != 0) {
                i3 |= 48;
            } else if ((i & 112) == 0) {
                i3 |= startRestartGroup.changed(onDismissRequest) ? 32 : 16;
            }
            int i5 = i2 & 4;
            if (i5 != 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i2 & 8) == 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    exposedDropdownMenuBoxScope2 = exposedDropdownMenuBoxScope;
                    i3 |= startRestartGroup.changed(exposedDropdownMenuBoxScope2) ? 16384 : 8192;
                    i4 = i3;
                    if ((46811 & i4) == 9362 || !startRestartGroup.getSkipping()) {
                        companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new MutableTransitionState(false);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        mutableTransitionState = (MutableTransitionState) rememberedValue;
                        mutableTransitionState.setTargetState(Boolean.valueOf(z2));
                        if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2490boximpl(TransformOrigin.INSTANCE.m2503getCenterSzJe1aQ()), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final MutableState mutableState = (MutableState) rememberedValue2;
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Density density = (Density) consume;
                            long m4511getZeroRKDOV3M = DpOffset.INSTANCE.m4511getZeroRKDOV3M();
                            startRestartGroup.startReplaceableGroup(1157296644);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(mutableState);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function2) new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                                        invoke2(intRect, intRect2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(IntRect parentBounds, IntRect menuBounds) {
                                        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                        mutableState.setValue(TransformOrigin.m2490boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceableGroup();
                            DropdownMenuPositionProvider dropdownMenuPositionProvider = new DropdownMenuPositionProvider(m4511getZeroRKDOV3M, density, (Function2) rememberedValue3, null);
                            final Modifier modifier4 = companion;
                            final ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope3 = exposedDropdownMenuBoxScope2;
                            modifier3 = modifier4;
                            composer2 = startRestartGroup;
                            ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, dropdownMenuPositionProvider, ComposableLambdaKt.composableLambda(startRestartGroup, -406650841, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i6) {
                                    ComposerKt.sourceInformation(composer3, "C261@10110L257:ExposedDropdownMenu.kt#jmzs0o");
                                    if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                                        MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, ExposedDropdownMenuBoxScope.DefaultImpls.exposedDropdownSize$default(exposedDropdownMenuBoxScope3, modifier4, false, 1, null), content, composer3, MutableTransitionState.$stable | 48 | (i4 & 7168), 0);
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                }
                            }), composer2, ((i4 >> 3) & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
                        } else {
                            modifier3 = companion;
                            composer2 = startRestartGroup;
                        }
                        modifier2 = modifier3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    final boolean z3 = z2;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            ExposedDropdownMenuBoxScope.this.ExposedDropdownMenu(z3, onDismissRequest, modifier2, content, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                exposedDropdownMenuBoxScope2 = exposedDropdownMenuBoxScope;
                i4 = i3;
                if ((46811 & i4) == 9362) {
                }
                if (i5 != 0) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) rememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z2));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState<TransformOrigin> mutableState2 = (MutableState) rememberedValue2;
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume2;
                long m4511getZeroRKDOV3M2 = DpOffset.INSTANCE.m4511getZeroRKDOV3M();
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(mutableState2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = (Function2) new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                        invoke2(intRect, intRect2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(IntRect parentBounds, IntRect menuBounds) {
                        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                        mutableState2.setValue(TransformOrigin.m2490boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                DropdownMenuPositionProvider dropdownMenuPositionProvider2 = new DropdownMenuPositionProvider(m4511getZeroRKDOV3M2, density2, (Function2) rememberedValue3, null);
                final Modifier modifier42 = companion;
                final ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope32 = exposedDropdownMenuBoxScope2;
                modifier3 = modifier42;
                composer2 = startRestartGroup;
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, dropdownMenuPositionProvider2, ComposableLambdaKt.composableLambda(startRestartGroup, -406650841, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        ComposerKt.sourceInformation(composer3, "C261@10110L257:ExposedDropdownMenu.kt#jmzs0o");
                        if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                            MenuKt.DropdownMenuContent(mutableTransitionState, mutableState2, ExposedDropdownMenuBoxScope.DefaultImpls.exposedDropdownSize$default(exposedDropdownMenuBoxScope32, modifier42, false, 1, null), content, composer3, MutableTransitionState.$stable | 48 | (i4 & 7168), 0);
                        } else {
                            composer3.skipToGroupEnd();
                        }
                    }
                }), composer2, ((i4 >> 3) & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
                modifier2 = modifier3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            exposedDropdownMenuBoxScope2 = exposedDropdownMenuBoxScope;
            i4 = i3;
            if ((46811 & i4) == 9362) {
            }
            if (i5 != 0) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) rememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z2));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState<TransformOrigin> mutableState22 = (MutableState) rememberedValue2;
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density22 = (Density) consume22;
            long m4511getZeroRKDOV3M22 = DpOffset.INSTANCE.m4511getZeroRKDOV3M();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(mutableState22);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = (Function2) new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                    invoke2(intRect, intRect2);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IntRect parentBounds, IntRect menuBounds) {
                    Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                    Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                    mutableState22.setValue(TransformOrigin.m2490boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            DropdownMenuPositionProvider dropdownMenuPositionProvider22 = new DropdownMenuPositionProvider(m4511getZeroRKDOV3M22, density22, (Function2) rememberedValue3, null);
            final Modifier modifier422 = companion;
            final ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope322 = exposedDropdownMenuBoxScope2;
            modifier3 = modifier422;
            composer2 = startRestartGroup;
            ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, dropdownMenuPositionProvider22, ComposableLambdaKt.composableLambda(startRestartGroup, -406650841, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    ComposerKt.sourceInformation(composer3, "C261@10110L257:ExposedDropdownMenu.kt#jmzs0o");
                    if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                        MenuKt.DropdownMenuContent(mutableTransitionState, mutableState22, ExposedDropdownMenuBoxScope.DefaultImpls.exposedDropdownSize$default(exposedDropdownMenuBoxScope322, modifier422, false, 1, null), content, composer3, MutableTransitionState.$stable | 48 | (i4 & 7168), 0);
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }
            }), composer2, ((i4 >> 3) & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
            modifier2 = modifier3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
    }
}
