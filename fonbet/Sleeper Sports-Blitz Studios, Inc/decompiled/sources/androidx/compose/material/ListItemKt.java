package androidx.compose.material;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0015\b\u0002\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\r\u001a8\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0013\u001a4\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\u0006H\u0002¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "secondaryText", "singleLineSecondaryText", "", "overlineText", "trailing", "text", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BaselinesOffsetColumn", "offsets", "", "Landroidx/compose/ui/unit/Dp;", "content", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", TypedValues.CycleType.S_WAVE_OFFSET, "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "applyTextStyle", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaselinesOffsetColumn$lambda$4(List list, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        BaselinesOffsetColumn(list, modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$2(Modifier modifier, Function2 function2, Function2 function22, boolean z, Function2 function23, Function2 function24, Function2 function25, int i, int i2, Composer composer, int i3) {
        ListItem(modifier, function2, function22, z, function23, function24, function25, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OffsetToBaselineOrCenter_Kz89ssw$lambda$6(float f, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        m2372OffsetToBaselineOrCenterKz89ssw(f, modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListItem(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, final Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i7;
        final Modifier modifier2;
        final boolean z2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1618131318);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)N(modifier,icon,secondaryText,singleLineSecondaryText,overlineText,trailing,text)88@3495L10,90@3578L4,91@3668L6,92@3769L4,93@3862L4,95@3951L2:ListItem.kt#jmzs0o");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function26 = function2;
            i3 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function27 = function22;
                i3 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function28 = function23;
                        i3 |= startRestartGroup.changedInstance(function28) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z2 = z;
                            function29 = function24;
                            function210 = function26;
                            function211 = function27;
                            function212 = function28;
                        } else {
                            Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier;
                            Function2<? super Composer, ? super Integer, Unit> function213 = i9 != 0 ? null : function26;
                            Function2<? super Composer, ? super Integer, Unit> function214 = i4 != 0 ? null : function27;
                            boolean z3 = i5 != 0 ? true : z;
                            Function2<? super Composer, ? super Integer, Unit> function215 = i6 != 0 ? null : function28;
                            Function2<? super Composer, ? super Integer, Unit> function216 = i7 == 0 ? function24 : null;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1618131318, i3, -1, "androidx.compose.material.ListItem (ListItem.kt:87)");
                            }
                            Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                            Function2<Composer, Integer, Unit> applyTextStyle = applyTextStyle(typography.getSubtitle1(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function25);
                            Intrinsics.checkNotNull(applyTextStyle);
                            Function2<Composer, Integer, Unit> applyTextStyle2 = applyTextStyle(typography.getBody2(), ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function214);
                            Function2<Composer, Integer, Unit> applyTextStyle3 = applyTextStyle(typography.getOverline(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function215);
                            Function2<Composer, Integer, Unit> applyTextStyle4 = applyTextStyle(typography.getCaption(), ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function216);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 246062872, "CC(remember):ListItem.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function1() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit ListItem$lambda$1$lambda$0;
                                        ListItem$lambda$1$lambda$0 = ListItemKt.ListItem$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                                        return ListItem$lambda$1$lambda$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue);
                            if (applyTextStyle2 == null && applyTextStyle3 == null) {
                                startRestartGroup.startReplaceGroup(-961912553);
                                ComposerKt.sourceInformation(startRestartGroup, "98@4040L61");
                                OneLine.INSTANCE.ListItem(semantics, function213, applyTextStyle, applyTextStyle4, startRestartGroup, (i3 & 112) | 24576, 0);
                                startRestartGroup.endReplaceGroup();
                            } else if ((applyTextStyle3 == null && z3) || applyTextStyle2 == null) {
                                startRestartGroup.startReplaceGroup(-961713285);
                                ComposerKt.sourceInformation(startRestartGroup, "102@4237L185");
                                TwoLine.INSTANCE.ListItem(semantics, function213, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                startRestartGroup = startRestartGroup;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-961499943);
                                ComposerKt.sourceInformation(startRestartGroup, "111@4454L185");
                                ThreeLine.INSTANCE.ListItem(semantics, function213, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                startRestartGroup = startRestartGroup;
                                startRestartGroup.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function211 = function214;
                            z2 = z3;
                            function212 = function215;
                            function210 = function213;
                            function29 = function216;
                            modifier2 = companion;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ListItem$lambda$2;
                                    ListItem$lambda$2 = ListItemKt.ListItem$lambda$2(Modifier.this, function210, function211, z2, function212, function29, function25, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return ListItem$lambda$2;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function28 = function23;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function28 = function23;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function27 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function28 = function23;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function26 = function2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function27 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function28 = function23;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$1$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BaselinesOffsetColumn(final List<Dp> list, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(872528548);
        ComposerKt.sourceInformation(startRestartGroup, "C(BaselinesOffsetColumn)N(offsets,modifier,content)365@13317L1092,365@13291L1118:ListItem.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(872528548, i3, -1, "androidx.compose.material.BaselinesOffsetColumn (ListItem.kt:364)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 981318632, "CC(remember):ListItem.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(list);
            ListItemKt$BaselinesOffsetColumn$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ListItemKt$BaselinesOffsetColumn$1$1(list);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i5 = ((i3 >> 6) & 14) | (i3 & 112);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((i5 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BaselinesOffsetColumn$lambda$4;
                    BaselinesOffsetColumn$lambda$4 = ListItemKt.BaselinesOffsetColumn$lambda$4(list, modifier2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BaselinesOffsetColumn$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m2372OffsetToBaselineOrCenterKz89ssw(final float f, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(953221030);
        ComposerKt.sourceInformation(startRestartGroup, "C(OffsetToBaselineOrCenter)N(offset:c#ui.unit.Dp,modifier,content)404@14961L830,404@14935L856:ListItem.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(953221030, i3, -1, "androidx.compose.material.OffsetToBaselineOrCenter (ListItem.kt:403)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1217382116, "CC(remember):ListItem.kt#9igjgp");
            boolean z = (i3 & 14) == 4;
            ListItemKt$OffsetToBaselineOrCenter$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ListItemKt$OffsetToBaselineOrCenter$1$1(f);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((i3 & 112) | ((i3 >> 6) & 14)) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 6) & 14));
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ListItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OffsetToBaselineOrCenter_Kz89ssw$lambda$6;
                    OffsetToBaselineOrCenter_Kz89ssw$lambda$6 = ListItemKt.OffsetToBaselineOrCenter_Kz89ssw$lambda$6(f, modifier2, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return OffsetToBaselineOrCenter_Kz89ssw$lambda$6;
                }
            });
        }
    }

    private static final Function2<Composer, Integer, Unit> applyTextStyle(final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function2) {
        if (function2 == null) {
            return null;
        }
        final LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m8623getProportionalPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m8643getBothEVpEnUU(), (DefaultConstructorMarker) null);
        return ComposableLambdaKt.composableLambdaInstance(-1000595778, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C438@16234L97,438@16168L163:ListItem.kt#jmzs0o");
                if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1000595778, i, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:438)");
                }
                ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(f));
                final TextStyle textStyle2 = textStyle;
                final LineHeightStyle lineHeightStyle2 = lineHeightStyle;
                final Function2<Composer, Integer, Unit> function22 = function2;
                CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-925826178, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        ComposerKt.sourceInformation(composer2, "C439@16248L73:ListItem.kt#jmzs0o");
                        if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-925826178, i2, -1, "androidx.compose.material.applyTextStyle.<anonymous>.<anonymous> (ListItem.kt:439)");
                        }
                        TextKt.ProvideTextStyle(TextStyle.m8245copyp1EtxEg$default(TextStyle.this, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, lineHeightStyle2, 0, 0, null, 15728639, null), function22, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
