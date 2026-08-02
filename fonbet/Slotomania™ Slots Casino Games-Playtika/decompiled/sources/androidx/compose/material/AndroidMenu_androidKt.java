package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import com.braze.models.FeatureFlag;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidMenu.android.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aa\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/DpOffset;", FeatureFlag.PROPERTIES, "Landroidx/compose/ui/window/PopupProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "onClick", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidMenu_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0074  */
    /* renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1229DropdownMenuILWXrKs(boolean z, final Function0<Unit> onDismissRequest, Modifier modifier, long j, PopupProperties popupProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        final Modifier modifier2;
        int i4;
        long j2;
        PopupProperties popupProperties2;
        int i5;
        final int i6;
        long j3;
        Object rememberedValue;
        final MutableTransitionState mutableTransitionState;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        Modifier modifier3;
        Composer composer2;
        PopupProperties popupProperties3;
        final PopupProperties popupProperties4;
        final Modifier modifier4;
        final long j4;
        int i7;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-840283139);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,5)82@4130L42,86@4320L51,87@4407L7,91@4531L131,95@4672L400:AndroidMenu.android.kt#jmzs0o");
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
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        popupProperties2 = popupProperties;
                        if (startRestartGroup.changed(popupProperties2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        popupProperties2 = popupProperties;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    popupProperties2 = popupProperties;
                }
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i5 = startRestartGroup.changed(content) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                float f = 0;
                                j2 = DpKt.m4461DpOffsetYgX7TsA(Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(f));
                            }
                            if ((i2 & 16) == 0) {
                                i6 = i3 & (-57345);
                                modifier2 = companion;
                                j3 = j2;
                                popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                                startRestartGroup.endDefaults();
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
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                    changed = startRestartGroup.changed(mutableState);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (Function2) new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                                    DropdownMenuPositionProvider dropdownMenuPositionProvider = new DropdownMenuPositionProvider(j3, density, (Function2) rememberedValue3, null);
                                    Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                                        public final void invoke(Composer composer3, int i9) {
                                            ComposerKt.sourceInformation(composer3, "C100@4847L215:AndroidMenu.android.kt#jmzs0o");
                                            if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                                MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                                MutableState<TransformOrigin> mutableState2 = mutableState;
                                                Modifier modifier5 = modifier2;
                                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                                int i10 = MutableTransitionState.$stable | 48;
                                                int i11 = i6;
                                                MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier5, function3, composer3, i10 | (i11 & 896) | ((i11 >> 6) & 7168), 0);
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    };
                                    int i9 = i6;
                                    modifier3 = modifier2;
                                    composer2 = startRestartGroup;
                                    popupProperties3 = popupProperties2;
                                    AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider, onDismissRequest, popupProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, function2), composer2, (i9 & 112) | 3072 | ((i9 >> 6) & 896), 0);
                                } else {
                                    composer2 = startRestartGroup;
                                    modifier3 = modifier2;
                                    popupProperties3 = popupProperties2;
                                }
                                popupProperties4 = popupProperties3;
                                startRestartGroup = composer2;
                                modifier4 = modifier3;
                                j4 = j3;
                            } else {
                                i6 = i3;
                                modifier2 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i6 = i3;
                        }
                        j3 = j2;
                        startRestartGroup.endDefaults();
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
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(mutableState2);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue3 = (Function2) new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                        DropdownMenuPositionProvider dropdownMenuPositionProvider2 = new DropdownMenuPositionProvider(j3, density2, (Function2) rememberedValue3, null);
                        Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                            public final void invoke(Composer composer3, int i92) {
                                ComposerKt.sourceInformation(composer3, "C100@4847L215:AndroidMenu.android.kt#jmzs0o");
                                if ((i92 & 11) != 2 || !composer3.getSkipping()) {
                                    MutableTransitionState<Boolean> mutableTransitionState2 = mutableTransitionState;
                                    MutableState<TransformOrigin> mutableState22 = mutableState2;
                                    Modifier modifier5 = modifier2;
                                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                    int i10 = MutableTransitionState.$stable | 48;
                                    int i11 = i6;
                                    MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState22, modifier5, function3, composer3, i10 | (i11 & 896) | ((i11 >> 6) & 7168), 0);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        };
                        int i92 = i6;
                        modifier3 = modifier2;
                        composer2 = startRestartGroup;
                        popupProperties3 = popupProperties2;
                        AndroidPopup_androidKt.Popup(dropdownMenuPositionProvider2, onDismissRequest, popupProperties3, ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, function22), composer2, (i92 & 112) | 3072 | ((i92 >> 6) & 896), 0);
                        popupProperties4 = popupProperties3;
                        startRestartGroup = composer2;
                        modifier4 = modifier3;
                        j4 = j3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        j4 = j2;
                        popupProperties4 = popupProperties2;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    final boolean z3 = z2;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        public final void invoke(Composer composer3, int i10) {
                            AndroidMenu_androidKt.m1229DropdownMenuILWXrKs(z3, onDismissRequest, modifier4, j4, popupProperties4, content, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i5;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
            }
            j2 = j;
            if ((57344 & i) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j2 = j;
        if ((57344 & i) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(final Function0<Unit> onClick, Modifier modifier, boolean z, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        MutableInteractionSource mutableInteractionSource3;
        final MutableInteractionSource mutableInteractionSource4;
        final PaddingValues paddingValues3;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1988562892);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)P(5,4,2,1,3)133@6255L39,136@6349L227:AndroidMenu.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            if ((458752 & i) == 0) {
                                i7 = startRestartGroup.changed(content) ? 131072 : 65536;
                            }
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                PaddingValues dropdownMenuItemContentPadding = i5 == 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues2;
                                if (i6 == 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                int i9 = i3 & 524286;
                                boolean z4 = z2;
                                Modifier modifier4 = companion;
                                MenuKt.DropdownMenuItemContent(onClick, modifier4, z4, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i9, 0);
                                mutableInteractionSource4 = mutableInteractionSource3;
                                paddingValues3 = dropdownMenuItemContentPadding;
                                z3 = z4;
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i10) {
                                    AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier3, z3, paddingValues3, mutableInteractionSource4, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i3 |= i7;
                        if ((374491 & i3) == 74898) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        int i92 = i3 & 524286;
                        boolean z42 = z2;
                        Modifier modifier42 = companion;
                        MenuKt.DropdownMenuItemContent(onClick, modifier42, z42, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i92, 0);
                        mutableInteractionSource4 = mutableInteractionSource3;
                        paddingValues3 = dropdownMenuItemContentPadding;
                        z3 = z42;
                        modifier3 = modifier42;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    int i922 = i3 & 524286;
                    boolean z422 = z2;
                    Modifier modifier422 = companion;
                    MenuKt.DropdownMenuItemContent(onClick, modifier422, z422, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i922, 0);
                    mutableInteractionSource4 = mutableInteractionSource3;
                    paddingValues3 = dropdownMenuItemContentPadding;
                    z3 = z422;
                    modifier3 = modifier422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                paddingValues2 = paddingValues;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((374491 & i3) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                int i9222 = i3 & 524286;
                boolean z4222 = z2;
                Modifier modifier4222 = companion;
                MenuKt.DropdownMenuItemContent(onClick, modifier4222, z4222, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i9222, 0);
                mutableInteractionSource4 = mutableInteractionSource3;
                paddingValues3 = dropdownMenuItemContentPadding;
                z3 = z4222;
                modifier3 = modifier4222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((374491 & i3) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            int i92222 = i3 & 524286;
            boolean z42222 = z2;
            Modifier modifier42222 = companion;
            MenuKt.DropdownMenuItemContent(onClick, modifier42222, z42222, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i92222, 0);
            mutableInteractionSource4 = mutableInteractionSource3;
            paddingValues3 = dropdownMenuItemContentPadding;
            z3 = z42222;
            modifier3 = modifier42222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((374491 & i3) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        int i922222 = i3 & 524286;
        boolean z422222 = z2;
        Modifier modifier422222 = companion;
        MenuKt.DropdownMenuItemContent(onClick, modifier422222, z422222, dropdownMenuItemContentPadding, mutableInteractionSource3, content, startRestartGroup, i922222, 0);
        mutableInteractionSource4 = mutableInteractionSource3;
        paddingValues3 = dropdownMenuItemContentPadding;
        z3 = z422222;
        modifier3 = modifier422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
