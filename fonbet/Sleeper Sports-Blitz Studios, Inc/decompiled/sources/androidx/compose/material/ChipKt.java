package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001aÆ\u0001\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00192\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0002\u0010\u001c\"\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010 \u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010!\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u0010\u0010\"\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f\"\u000e\u0010#\u001a\u00020$X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020$X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010&\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020)X\u008a\u0084\u0002"}, d2 = {"Chip", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material/ChipColors;", "leadingIcon", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "HorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LeadingIconStartSpacing", "LeadingIconEndSpacing", "TrailingIconSpacing", "SurfaceOverlayOpacity", "", "SelectedOverlayOpacity", "SelectedIconContainerSize", "material", "contentColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconContentColor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m8798constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m8798constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m8798constructorimpl(24);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chip$lambda$3(Function0 function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2 function2, Function3 function3, int i, int i2, Composer composer, int i3) {
        Chip(function0, modifier, z, mutableInteractionSource, shape, borderStroke, chipColors, function2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilterChip$lambda$6(boolean z, Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2 function2, Function2 function22, Function2 function23, Function3 function3, int i, int i2, int i3, Composer composer, int i4) {
        FilterChip(z, function0, modifier, z2, mutableInteractionSource, shape, borderStroke, selectableChipColors, function2, function22, function23, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0105  */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Chip(final Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i6;
        BorderStroke borderStroke2;
        ChipColors chipColors2;
        int i7;
        int i8;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier3;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final ChipColors chipColors3;
        ScopeUpdateScope endRestartGroup;
        CornerBasedShape cornerBasedShape;
        Composer composer3;
        boolean z4;
        boolean z5;
        Shape shape4;
        ChipColors chipColors4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        BorderStroke borderStroke4;
        boolean z6;
        MutableInteractionSource mutableInteractionSource4;
        ?? r6;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1232125330);
        ComposerKt.sourceInformation(startRestartGroup, "C(Chip)N(onClick,modifier,enabled,interactionSource,shape,border,colors,leadingIcon,content)100@4561L21,103@4661L22,106@4758L24,110@4916L1391,101@4587L1720:Chip.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i10 = 16384;
                                i3 |= i10;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i10 = 8192;
                        i3 |= i10;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= startRestartGroup.changed(borderStroke2) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                chipColors2 = chipColors;
                                if (startRestartGroup.changed(chipColors2)) {
                                    i9 = 1048576;
                                    i3 |= i9;
                                }
                            } else {
                                chipColors2 = chipColors;
                            }
                            i9 = 524288;
                            i3 |= i9;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                            i8 = i6;
                        } else {
                            i8 = i6;
                            if ((i & 12582912) == 0) {
                                i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                            }
                        }
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
                            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "94@4298L6,96@4415L12");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i11 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if (i5 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if ((i2 & 16) != 0) {
                                        cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                        i3 &= -57345;
                                    } else {
                                        cornerBasedShape = shape2;
                                    }
                                    BorderStroke borderStroke5 = i8 != 0 ? null : borderStroke2;
                                    if ((i2 & 64) != 0) {
                                        z4 = true;
                                        z5 = false;
                                        composer3 = startRestartGroup;
                                        i3 &= -3670017;
                                        chipColors2 = ChipDefaults.INSTANCE.m2255chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                                    } else {
                                        composer3 = startRestartGroup;
                                        z4 = true;
                                        z5 = false;
                                    }
                                    ChipColors chipColors5 = chipColors2;
                                    shape4 = cornerBasedShape;
                                    chipColors4 = chipColors5;
                                    function23 = i7 != 0 ? null : function2;
                                    borderStroke4 = borderStroke5;
                                    z6 = z2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    r6 = z4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    r6 = 1;
                                    borderStroke4 = borderStroke2;
                                    chipColors4 = chipColors2;
                                    z5 = false;
                                    z6 = z2;
                                    shape4 = shape2;
                                    composer3 = startRestartGroup;
                                    function23 = function2;
                                }
                                composer3.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1232125330, i3, -1, "androidx.compose.material.Chip (Chip.kt:99)");
                                }
                                int i12 = ((i3 >> 6) & 14) | ((i3 >> 15) & 112);
                                final State<Color> contentColor = chipColors4.contentColor(z6, composer3, i12);
                                ComposerKt.sourceInformationMarkerStart(composer3, 1338550436, "CC(remember):Chip.kt#9igjgp");
                                Object rememberedValue = composer3.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function1() { // from class: androidx.compose.material.ChipKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit Chip$lambda$2$lambda$1;
                                            Chip$lambda$2$lambda$1 = ChipKt.Chip$lambda$2$lambda$1((SemanticsPropertyReceiver) obj);
                                            return Chip$lambda$2$lambda$1;
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                final ChipColors chipColors6 = chipColors4;
                                final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                                final boolean z7 = z6;
                                composer2 = composer3;
                                SurfaceKt.m2490SurfaceLPr_se0(function0, SemanticsModifierKt.semantics$default(modifier2, z5, (Function1) rememberedValue, r6, null), z6, shape4, chipColors4.backgroundColor(z6, composer3, i12).getValue().m6049unboximpl(), Color.m6038copywmQWz5c$default(Chip$lambda$0(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke4, 0.0f, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1849195083, r6, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i13) {
                                        long Chip$lambda$0;
                                        ComposerKt.sourceInformation(composer4, "C111@4998L1303,111@4926L1375:Chip.kt#jmzs0o");
                                        if (!composer4.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1849195083, i13, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:111)");
                                        }
                                        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                        Chip$lambda$0 = ChipKt.Chip$lambda$0(contentColor);
                                        ProvidedValue<Float> provides = localContentAlpha.provides(Float.valueOf(Color.m6041getAlphaimpl(Chip$lambda$0)));
                                        final Function2<Composer, Integer, Unit> function25 = function24;
                                        final ChipColors chipColors7 = chipColors6;
                                        final boolean z8 = z7;
                                        final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                        CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(1808091765, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$Chip$2.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i14) {
                                                ComposerKt.sourceInformation(composer5, "C112@5051L10,112@5069L1222,112@5012L1279:Chip.kt#jmzs0o");
                                                if (!composer5.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1808091765, i14, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous> (Chip.kt:112)");
                                                }
                                                TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer5, 6).getBody2();
                                                final Function2<Composer, Integer, Unit> function26 = function25;
                                                final ChipColors chipColors8 = chipColors7;
                                                final boolean z9 = z8;
                                                final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                TextKt.ProvideTextStyle(body2, ComposableLambdaKt.rememberComposableLambda(1507027814, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.Chip.2.1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                                        invoke(composer6, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer6, int i15) {
                                                        float m8798constructorimpl;
                                                        float f;
                                                        float f2;
                                                        float f3;
                                                        ComposerKt.sourceInformation(composer6, "C113@5087L1190:Chip.kt#jmzs0o");
                                                        if (!composer6.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                            composer6.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1507027814, i15, -1, "androidx.compose.material.Chip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:113)");
                                                        }
                                                        Modifier m1194defaultMinSizeVpY3zN4$default = SizeKt.m1194defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChipDefaults.INSTANCE.m2258getMinHeightD9Ej5fM(), 1, null);
                                                        if (function26 == null) {
                                                            m8798constructorimpl = ChipKt.HorizontalPadding;
                                                        } else {
                                                            m8798constructorimpl = Dp.m8798constructorimpl(0);
                                                        }
                                                        f = ChipKt.HorizontalPadding;
                                                        Modifier m1161paddingqDBjuR0$default = PaddingKt.m1161paddingqDBjuR0$default(m1194defaultMinSizeVpY3zN4$default, m8798constructorimpl, 0.0f, f, 0.0f, 10, null);
                                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        Function2<Composer, Integer, Unit> function27 = function26;
                                                        ChipColors chipColors9 = chipColors8;
                                                        boolean z10 = z9;
                                                        Function3<RowScope, Composer, Integer, Unit> function34 = function33;
                                                        ComposerKt.sourceInformationMarkerStart(composer6, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer6, 54);
                                                        ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer6, m1161paddingqDBjuR0$default);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(composer6.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer6.startReusableNode();
                                                        if (composer6.getInserting()) {
                                                            composer6.createNode(constructor);
                                                        } else {
                                                            composer6.useNode();
                                                        }
                                                        Composer m5333constructorimpl = Updater.m5333constructorimpl(composer6);
                                                        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer6, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer6, 1856957913, "C135@6250L9:Chip.kt#jmzs0o");
                                                        if (function27 != null) {
                                                            composer6.startReplaceGroup(1856981007);
                                                            ComposerKt.sourceInformation(composer6, "126@5702L47,127@5812L32,128@5869L268,133@6162L45");
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            f2 = ChipKt.LeadingIconStartSpacing;
                                                            SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(companion, f2), composer6, 6);
                                                            State<Color> leadingIconContentColor = chipColors9.leadingIconContentColor(z10, composer6, 0);
                                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m6029boximpl(invoke$lambda$1$lambda$0(leadingIconContentColor))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m6041getAlphaimpl(invoke$lambda$1$lambda$0(leadingIconContentColor))))}, function27, composer6, ProvidedValue.$stable);
                                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                                            f3 = ChipKt.LeadingIconEndSpacing;
                                                            SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(companion2, f3), composer6, 6);
                                                            composer6.endReplaceGroup();
                                                        } else {
                                                            composer6.startReplaceGroup(1857512440);
                                                            composer6.endReplaceGroup();
                                                        }
                                                        function34.invoke(rowScopeInstance, composer6, 6);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        composer6.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    private static final long invoke$lambda$1$lambda$0(State<Color> state) {
                                                        return state.getValue().m6049unboximpl();
                                                    }
                                                }, composer5, 54), composer5, 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer2, (i3 & 14) | 805306368 | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 3670016) | ((i3 << 15) & 234881024), 128);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                chipColors3 = chipColors4;
                                function22 = function24;
                                modifier3 = modifier2;
                                z3 = z6;
                                shape3 = shape4;
                                borderStroke3 = borderStroke4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                function22 = function2;
                                modifier3 = modifier2;
                                z3 = z2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                borderStroke3 = borderStroke2;
                                chipColors3 = chipColors2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ChipKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Chip$lambda$3;
                                        Chip$lambda$3 = ChipKt.Chip$lambda$3(Function0.this, modifier3, z3, mutableInteractionSource3, shape3, borderStroke3, chipColors3, function22, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return Chip$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
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
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Chip$lambda$2$lambda$1(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m7998setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7979getButtono7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        CornerBasedShape cornerBasedShape;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final SelectableChipColors selectableChipColors2;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Shape shape2;
        final BorderStroke borderStroke3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i16;
        Modifier modifier4;
        int i17;
        int i18;
        int i19;
        SelectableChipColors selectableChipColors3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        MutableInteractionSource mutableInteractionSource3;
        int i20;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Modifier modifier5;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(69602198);
        ComposerKt.sourceInformation(startRestartGroup, "C(FilterChip)N(selected,onClick,modifier,enabled,interactionSource,shape,border,colors,leadingIcon,selectedIcon,trailingIcon,content)196@9190L31,200@9329L24,203@9428L34,207@9602L3857,197@9226L4233:Chip.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    z3 = z2;
                    i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            cornerBasedShape = shape;
                            i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(cornerBasedShape)) ? 131072 : 65536;
                        } else {
                            cornerBasedShape = shape;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                            borderStroke2 = borderStroke;
                        } else {
                            borderStroke2 = borderStroke;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                            }
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & 128) == 0) {
                                if ((16777216 & i) == 0 ? startRestartGroup.changed(selectableChipColors) : startRestartGroup.changedInstance(selectableChipColors)) {
                                    i21 = 8388608;
                                    i4 |= i21;
                                }
                            }
                            i21 = 4194304;
                            i4 |= i21;
                        }
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                            function24 = function2;
                        } else {
                            function24 = function2;
                            if ((i & 100663296) == 0) {
                                i4 |= startRestartGroup.changedInstance(function24) ? 67108864 : 33554432;
                            }
                        }
                        i10 = i3 & 512;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= startRestartGroup.changedInstance(function22) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            i12 = i3 & 1024;
                            if (i12 == 0) {
                                i14 = i2 | 6;
                                i13 = i12;
                            } else if ((i2 & 6) == 0) {
                                i13 = i12;
                                i14 = i2 | (startRestartGroup.changedInstance(function23) ? 4 : 2);
                            } else {
                                i13 = i12;
                                i14 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i14 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i14 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                                i15 = i14;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    ComposerKt.sourceInformation(startRestartGroup, "187@8731L6,189@8858L18");
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                        }
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        function29 = function22;
                                        function28 = function23;
                                        i16 = i15;
                                        function210 = function24;
                                        modifier5 = modifier2;
                                        i20 = i4;
                                        selectableChipColors3 = selectableChipColors;
                                    } else {
                                        Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z5 = i6 != 0 ? true : z3;
                                        MutableInteractionSource mutableInteractionSource4 = i7 != 0 ? null : mutableInteractionSource;
                                        if ((i3 & 32) != 0) {
                                            cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                            i4 &= -458753;
                                        }
                                        int i22 = i4;
                                        Shape shape3 = cornerBasedShape;
                                        BorderStroke borderStroke4 = i8 != 0 ? null : borderStroke2;
                                        if ((i3 & 128) != 0) {
                                            i18 = i11;
                                            i19 = i13;
                                            i17 = i9;
                                            i16 = i15;
                                            modifier4 = companion;
                                            selectableChipColors3 = ChipDefaults.INSTANCE.m2256filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 805306368, 511);
                                            startRestartGroup = startRestartGroup;
                                            i22 &= -29360129;
                                        } else {
                                            i16 = i15;
                                            modifier4 = companion;
                                            i17 = i9;
                                            i18 = i11;
                                            i19 = i13;
                                            selectableChipColors3 = selectableChipColors;
                                        }
                                        if (i17 != 0) {
                                            function24 = null;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function211 = i18 != 0 ? null : function22;
                                        if (i19 != 0) {
                                            function29 = function211;
                                            z3 = z5;
                                            mutableInteractionSource3 = mutableInteractionSource4;
                                            cornerBasedShape = shape3;
                                            i20 = i22;
                                            borderStroke2 = borderStroke4;
                                            function28 = null;
                                        } else {
                                            function28 = function23;
                                            function29 = function211;
                                            z3 = z5;
                                            mutableInteractionSource3 = mutableInteractionSource4;
                                            cornerBasedShape = shape3;
                                            i20 = i22;
                                            borderStroke2 = borderStroke4;
                                        }
                                        function210 = function24;
                                        modifier5 = modifier4;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(69602198, i20, i16, "androidx.compose.material.FilterChip (Chip.kt:194)");
                                    }
                                    int i23 = i20 << 3;
                                    int i24 = ((i20 >> 9) & 14) | (i23 & 112) | ((i20 >> 15) & 896);
                                    final State<Color> contentColor = selectableChipColors3.contentColor(z3, z, startRestartGroup, i24);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1831737138, "CC(remember):Chip.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new Function1() { // from class: androidx.compose.material.ChipKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit FilterChip$lambda$5$lambda$4;
                                                FilterChip$lambda$5$lambda$4 = ChipKt.FilterChip$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
                                                return FilterChip$lambda$5$lambda$4;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final Function2<? super Composer, ? super Integer, Unit> function212 = function210;
                                    Shape shape4 = cornerBasedShape;
                                    final SelectableChipColors selectableChipColors4 = selectableChipColors3;
                                    final Function2<? super Composer, ? super Integer, Unit> function213 = function29;
                                    final Function2<? super Composer, ? super Integer, Unit> function214 = function28;
                                    final boolean z6 = z3;
                                    Modifier modifier6 = modifier5;
                                    SurfaceKt.m2491SurfaceNy5ogXk(z, function0, SemanticsModifierKt.semantics$default(modifier5, false, (Function1) rememberedValue, 1, null), z6, shape4, selectableChipColors3.backgroundColor(z3, z, startRestartGroup, i24).getValue().m6049unboximpl(), Color.m6038copywmQWz5c$default(contentColor.getValue().m6049unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(-60565717, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i25) {
                                            ComposerKt.sourceInformation(composer3, "C208@9690L3763,208@9612L3841:Chip.kt#jmzs0o");
                                            if (!composer3.shouldExecute((i25 & 3) != 2, i25 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-60565717, i25, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:208)");
                                            }
                                            ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m6041getAlphaimpl(contentColor.getValue().m6049unboximpl())));
                                            final Function2<Composer, Integer, Unit> function215 = function212;
                                            final boolean z7 = z;
                                            final Function2<Composer, Integer, Unit> function216 = function213;
                                            final Function2<Composer, Integer, Unit> function217 = function214;
                                            final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                            final SelectableChipColors selectableChipColors5 = selectableChipColors4;
                                            final boolean z8 = z6;
                                            final State<Color> state = contentColor;
                                            CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(-773543317, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt$FilterChip$2.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i26) {
                                                    ComposerKt.sourceInformation(composer4, "C209@9743L10,209@9761L3682,209@9704L3739:Chip.kt#jmzs0o");
                                                    if (!composer4.shouldExecute((i26 & 3) != 2, i26 & 1)) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-773543317, i26, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:209)");
                                                    }
                                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                    final Function2<Composer, Integer, Unit> function218 = function215;
                                                    final boolean z9 = z7;
                                                    final Function2<Composer, Integer, Unit> function219 = function216;
                                                    final Function2<Composer, Integer, Unit> function220 = function217;
                                                    final Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                    final SelectableChipColors selectableChipColors6 = selectableChipColors5;
                                                    final boolean z10 = z8;
                                                    final State<Color> state2 = state;
                                                    TextKt.ProvideTextStyle(body2, ComposableLambdaKt.rememberComposableLambda(-44453990, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2.1.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer5, int i27) {
                                                            float f;
                                                            Function2<Composer, Integer, Unit> function221;
                                                            Function3<RowScope, Composer, Integer, Unit> function34;
                                                            float f2;
                                                            float f3;
                                                            float f4;
                                                            float f5;
                                                            ComposerKt.sourceInformation(composer5, "C210@9779L3650:Chip.kt#jmzs0o");
                                                            if (!composer5.shouldExecute((i27 & 3) != 2, i27 & 1)) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-44453990, i27, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:210)");
                                                            }
                                                            Modifier m1161paddingqDBjuR0$default = PaddingKt.m1161paddingqDBjuR0$default(SizeKt.m1194defaultMinSizeVpY3zN4$default(IntrinsicKt.width(Modifier.INSTANCE, IntrinsicSize.Max), 0.0f, ChipDefaults.INSTANCE.m2258getMinHeightD9Ej5fM(), 1, null), (function218 != null || (z9 && function219 != null)) ? Dp.m8798constructorimpl(0) : ChipKt.HorizontalPadding, 0.0f, function220 == null ? ChipKt.HorizontalPadding : Dp.m8798constructorimpl(0), 0.0f, 10, null);
                                                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                            Function2<Composer, Integer, Unit> function222 = function218;
                                                            boolean z11 = z9;
                                                            Function2<Composer, Integer, Unit> function223 = function219;
                                                            Function3<RowScope, Composer, Integer, Unit> function35 = function33;
                                                            Function2<Composer, Integer, Unit> function224 = function220;
                                                            SelectableChipColors selectableChipColors7 = selectableChipColors6;
                                                            boolean z12 = z10;
                                                            State<Color> state3 = state2;
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, m1161paddingqDBjuR0$default);
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            Composer m5333constructorimpl = Updater.m5333constructorimpl(composer5);
                                                            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1505315515, "C268@12902L264:Chip.kt#jmzs0o");
                                                            if (function222 != null || (z11 && function223 != null)) {
                                                                composer5.startReplaceGroup(-1505271403);
                                                                ComposerKt.sourceInformation(composer5, "231@10804L47,232@10876L1913,266@12814L45");
                                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                                f = ChipKt.LeadingIconStartSpacing;
                                                                SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(companion2, f), composer5, 6);
                                                                ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                function221 = function224;
                                                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer5, companion3);
                                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                function34 = function35;
                                                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor2);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer5);
                                                                Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                    m5333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                    m5333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                }
                                                                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                                ComposerKt.sourceInformationMarkerStart(composer5, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                ComposerKt.sourceInformationMarkerStart(composer5, -2077321583, "C:Chip.kt#jmzs0o");
                                                                if (function222 != null) {
                                                                    composer5.startReplaceGroup(-2077339967);
                                                                    ComposerKt.sourceInformation(composer5, "234@10999L35,235@11067L298");
                                                                    State<Color> leadingIconColor = selectableChipColors7.leadingIconColor(z12, z11, composer5, 0);
                                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(leadingIconColor.getValue()), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m6041getAlphaimpl(leadingIconColor.getValue().m6049unboximpl())))}, function222, composer5, ProvidedValue.$stable);
                                                                    composer5.endReplaceGroup();
                                                                } else {
                                                                    composer5.startReplaceGroup(-2076897907);
                                                                    composer5.endReplaceGroup();
                                                                }
                                                                if (!z11 || function223 == null) {
                                                                    composer5.startReplaceGroup(-2075540851);
                                                                    composer5.endReplaceGroup();
                                                                } else {
                                                                    composer5.startReplaceGroup(-2076791112);
                                                                    ComposerKt.sourceInformation(composer5, "255@12280L453");
                                                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                    long m6049unboximpl = state3.getValue().m6049unboximpl();
                                                                    if (function222 != null) {
                                                                        composer5.startReplaceGroup(-2076615869);
                                                                        ComposerKt.sourceInformation(composer5, "253@12173L34");
                                                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                        f3 = ChipKt.SelectedIconContainerSize;
                                                                        companion4 = ClipKt.clip(BackgroundKt.m581backgroundbw27NRU(SizeKt.m1201requiredSize3ABfNKs(companion5, f3), state3.getValue().m6049unboximpl(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                                                        m6049unboximpl = selectableChipColors7.backgroundColor(z12, z11, composer5, 0).getValue().m6049unboximpl();
                                                                        composer5.endReplaceGroup();
                                                                    } else {
                                                                        composer5.startReplaceGroup(-2076052723);
                                                                        composer5.endReplaceGroup();
                                                                    }
                                                                    Alignment center = Alignment.INSTANCE.getCenter();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer5, companion4);
                                                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor3);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer5);
                                                                    Updater.m5340setimpl(m5333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                    if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                        m5333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                        m5333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                    }
                                                                    Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composer5, 1681585881, "C259@12494L205:Chip.kt#jmzs0o");
                                                                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m6029boximpl(m6049unboximpl)), function223, composer5, ProvidedValue.$stable);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    composer5.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                    composer5.endReplaceGroup();
                                                                }
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                composer5.endNode();
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                                f2 = ChipKt.LeadingIconEndSpacing;
                                                                SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(companion6, f2), composer5, 6);
                                                                composer5.endReplaceGroup();
                                                            } else {
                                                                composer5.startReplaceGroup(-1503250420);
                                                                composer5.endReplaceGroup();
                                                                function34 = function35;
                                                                function221 = function224;
                                                            }
                                                            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                                            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
                                                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, composer5, 54);
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                            CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer5, weight$default);
                                                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                            if (!(composer5.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor4);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            Composer m5333constructorimpl4 = Updater.m5333constructorimpl(composer5);
                                                            Updater.m5340setimpl(m5333constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m5340setimpl(m5333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (m5333constructorimpl4.getInserting() || !Intrinsics.areEqual(m5333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                m5333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                m5333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                            }
                                                            Updater.m5340setimpl(m5333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                            function34.invoke(RowScopeInstance.INSTANCE, composer5, 6);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            composer5.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            if (function221 != null) {
                                                                composer5.startReplaceGroup(-1502914938);
                                                                ComposerKt.sourceInformation(composer5, "275@13239L43,276@13307L14,277@13346L43");
                                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                                f4 = ChipKt.TrailingIconSpacing;
                                                                SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(companion7, f4), composer5, 6);
                                                                function221.invoke(composer5, 0);
                                                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                                                f5 = ChipKt.TrailingIconSpacing;
                                                                SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(companion8, f5), composer5, 6);
                                                                composer5.endReplaceGroup();
                                                            } else {
                                                                composer5.startReplaceGroup(-1502724660);
                                                                composer5.endReplaceGroup();
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            composer5.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, 48);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i20 & 7294) | ((i20 >> 3) & 57344) | (i23 & 29360128) | ((i20 << 15) & 1879048192), 6, 256);
                                    composer2 = startRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    shape2 = shape4;
                                    borderStroke3 = borderStroke2;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    selectableChipColors2 = selectableChipColors4;
                                    function27 = function212;
                                    function25 = function213;
                                    function26 = function214;
                                    z4 = z6;
                                    modifier3 = modifier6;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    selectableChipColors2 = selectableChipColors;
                                    function25 = function22;
                                    function26 = function23;
                                    shape2 = cornerBasedShape;
                                    borderStroke3 = borderStroke2;
                                    modifier3 = modifier2;
                                    function27 = function24;
                                    z4 = z3;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ChipKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit FilterChip$lambda$6;
                                            FilterChip$lambda$6 = ChipKt.FilterChip$lambda$6(z, function0, modifier3, z4, mutableInteractionSource2, shape2, borderStroke3, selectableChipColors2, function27, function25, function26, function3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            return FilterChip$lambda$6;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i15 = i14;
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i11 = i10;
                        i12 = i3 & 1024;
                        if (i12 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        i15 = i14;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    i15 = i14;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                i15 = i14;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z3 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            i15 = i14;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z3 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        i15 = i14;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilterChip$lambda$5$lambda$4(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m7998setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7981getCheckboxo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Chip$lambda$0(State<Color> state) {
        return state.getValue().m6049unboximpl();
    }

    static {
        float f = 8;
        LeadingIconEndSpacing = Dp.m8798constructorimpl(f);
        TrailingIconSpacing = Dp.m8798constructorimpl(f);
    }
}
