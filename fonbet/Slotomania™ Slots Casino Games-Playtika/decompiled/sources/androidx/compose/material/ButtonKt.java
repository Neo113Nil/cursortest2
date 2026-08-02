package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u008d\u0001\u0010\u001b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001c"}, d2 = {"Button", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "elevation", "Landroidx/compose/material/ButtonElevation;", "shape", "Landroidx/compose/ui/graphics/Shape;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "colors", "Landroidx/compose/material/ButtonColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/ButtonElevation;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ButtonColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedButton", "TextButton", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(final Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        Shape shape2;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        PaddingValues paddingValues2;
        Modifier.Companion companion;
        MutableInteractionSource mutableInteractionSource3;
        int i9;
        ButtonElevation buttonElevation3;
        CornerBasedShape cornerBasedShape;
        ButtonColors buttonColors2;
        final int i10;
        ButtonElevation buttonElevation4;
        ButtonColors buttonColors3;
        BorderStroke borderStroke3;
        boolean z3;
        final PaddingValues paddingValues3;
        final Shape shape3;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource4;
        final ButtonColors buttonColors4;
        final ButtonElevation buttonElevation5;
        final PaddingValues paddingValues4;
        final boolean z4;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2116133464);
        ComposerKt.sourceInformation(startRestartGroup, "C(Button)P(8,7,5,6,4,9!2,3)94@4533L39,95@4623L11,96@4669L6,98@4759L14,102@4922L21,108@5086L24,111@5228L37,103@4948L1086:Button.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
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
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            buttonElevation2 = buttonElevation;
                            if (startRestartGroup.changed(buttonElevation2)) {
                                i12 = 16384;
                                i3 |= i12;
                            }
                        } else {
                            buttonElevation2 = buttonElevation;
                        }
                        i12 = 8192;
                        i3 |= i12;
                    } else {
                        buttonElevation2 = buttonElevation;
                    }
                    if ((458752 & i) != 0) {
                        shape2 = shape;
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                    } else {
                        shape2 = shape;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        borderStroke2 = borderStroke;
                        i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                        if ((i & 29360128) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(buttonColors)) {
                                i11 = 8388608;
                                i3 |= i11;
                            }
                            i11 = 4194304;
                            i3 |= i11;
                        }
                        i7 = i2 & 256;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i8 = i7;
                            paddingValues2 = paddingValues;
                            i3 |= startRestartGroup.changed(paddingValues2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            if ((i2 & 512) == 0) {
                                i3 |= C.ENCODING_PCM_32BIT;
                            } else if ((1879048192 & i) == 0) {
                                i3 |= startRestartGroup.changed(content) ? 536870912 : 268435456;
                            }
                            if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i13 == 0 ? Modifier.INSTANCE : modifier;
                                    boolean z5 = i4 == 0 ? true : z2;
                                    if (i5 == 0) {
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
                                    if ((i2 & 16) == 0) {
                                        i9 = i8;
                                        buttonElevation3 = ButtonDefaults.INSTANCE.m1275elevationR_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                        i3 &= -57345;
                                    } else {
                                        i9 = i8;
                                        buttonElevation3 = buttonElevation2;
                                    }
                                    if ((i2 & 32) == 0) {
                                        cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall();
                                        i3 &= -458753;
                                    } else {
                                        cornerBasedShape = shape2;
                                    }
                                    BorderStroke borderStroke5 = i6 == 0 ? null : borderStroke;
                                    if ((i2 & 128) == 0) {
                                        buttonColors2 = ButtonDefaults.INSTANCE.m1274buttonColorsro_MJ88(0L, 0L, 0L, 0L, startRestartGroup, 24576, 15);
                                        i3 &= -29360129;
                                    } else {
                                        buttonColors2 = buttonColors;
                                    }
                                    if (i9 == 0) {
                                        ButtonColors buttonColors5 = buttonColors2;
                                        i10 = i3;
                                        buttonElevation4 = buttonElevation3;
                                        buttonColors3 = buttonColors5;
                                        borderStroke3 = borderStroke5;
                                        paddingValues3 = ButtonDefaults.INSTANCE.getContentPadding();
                                        z3 = z5;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                    } else {
                                        ButtonColors buttonColors6 = buttonColors2;
                                        i10 = i3;
                                        buttonElevation4 = buttonElevation3;
                                        buttonColors3 = buttonColors6;
                                        borderStroke3 = borderStroke5;
                                        z3 = z5;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        paddingValues3 = paddingValues;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                    companion = modifier;
                                    buttonColors3 = buttonColors;
                                    paddingValues3 = paddingValues2;
                                    z3 = z2;
                                    borderStroke3 = borderStroke2;
                                    cornerBasedShape = shape2;
                                    i10 = i3;
                                    buttonElevation4 = buttonElevation2;
                                }
                                startRestartGroup.endDefaults();
                                int i14 = i10 >> 6;
                                int i15 = (i14 & 14) | ((i10 >> 18) & 112);
                                final State<Color> contentColor = buttonColors3.contentColor(z3, startRestartGroup, i15);
                                long m2122unboximpl = buttonColors3.backgroundColor(z3, startRestartGroup, i15).getValue().m2122unboximpl();
                                long m2111copywmQWz5c$default = Color.m2111copywmQWz5c$default(m1284Button$lambda1(contentColor), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                                State<Dp> elevation = buttonElevation4 != null ? null : buttonElevation4.elevation(z3, mutableInteractionSource2, startRestartGroup, i14 & 1022);
                                PaddingValues paddingValues5 = paddingValues3;
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                                Modifier modifier3 = companion;
                                ButtonElevation buttonElevation6 = buttonElevation4;
                                ButtonColors buttonColors7 = buttonColors3;
                                Shape shape4 = cornerBasedShape;
                                SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier3, z3, shape4, m2122unboximpl, m2111copywmQWz5c$default, borderStroke3, elevation == null ? elevation.getValue().m4454unboximpl() : Dp.m4440constructorimpl(0), mutableInteractionSource5, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

                                    public final void invoke(Composer composer2, int i16) {
                                        long m1284Button$lambda1;
                                        ComposerKt.sourceInformation(composer2, "C114@5345L683:Button.kt#jmzs0o");
                                        if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                                            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                            m1284Button$lambda1 = ButtonKt.m1284Button$lambda1(contentColor);
                                            ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m2114getAlphaimpl(m1284Button$lambda1)))};
                                            final PaddingValues paddingValues6 = paddingValues3;
                                            final Function3<RowScope, Composer, Integer, Unit> function3 = content;
                                            final int i17 = i10;
                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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

                                                public final void invoke(Composer composer3, int i18) {
                                                    ComposerKt.sourceInformation(composer3, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                                                    if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                                        final PaddingValues paddingValues7 = PaddingValues.this;
                                                        final Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                        final int i19 = i17;
                                                        TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer4, int i20) {
                                                                ComposerKt.sourceInformation(composer4, "C118@5537L467:Button.kt#jmzs0o");
                                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                                    Modifier padding = PaddingKt.padding(SizeKt.m618defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m1280getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1279getMinHeightD9Ej5fM()), PaddingValues.this);
                                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                                    int i21 = ((i19 >> 18) & 7168) | 432;
                                                                    composer4.startReplaceableGroup(693286680);
                                                                    ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                                                    composer4.startReplaceableGroup(-1323940314);
                                                                    ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume = composer4.consume(localDensity);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    Density density = (Density) consume;
                                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume2 = composer4.consume(localLayoutDirection);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                                    Object consume3 = composer4.consume(localViewConfiguration);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                                        ComposablesKt.invalidApplier();
                                                                    }
                                                                    composer4.startReusableNode();
                                                                    if (composer4.getInserting()) {
                                                                        composer4.createNode(constructor);
                                                                    } else {
                                                                        composer4.useNode();
                                                                    }
                                                                    composer4.disableReusing();
                                                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer4);
                                                                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                                    composer4.enableReusing();
                                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                                    composer4.startReplaceableGroup(2058660585);
                                                                    composer4.startReplaceableGroup(-678309503);
                                                                    ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                                                    function33.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endNode();
                                                                    composer4.endReplaceableGroup();
                                                                    composer4.endReplaceableGroup();
                                                                    return;
                                                                }
                                                                composer4.skipToGroupEnd();
                                                            }
                                                        }), composer3, 48);
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }), composer2, 56);
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), startRestartGroup, (i14 & 7168) | (i10 & 14) | C.ENCODING_PCM_32BIT | (i10 & 112) | (i10 & 896) | (i10 & 3670016) | ((i10 << 15) & 234881024), 0);
                                startRestartGroup = startRestartGroup;
                                shape3 = shape4;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource4 = mutableInteractionSource5;
                                buttonColors4 = buttonColors7;
                                buttonElevation5 = buttonElevation6;
                                paddingValues4 = paddingValues5;
                                z4 = z3;
                                modifier2 = modifier3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                buttonColors4 = buttonColors;
                                z4 = z2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                borderStroke4 = borderStroke2;
                                shape3 = shape2;
                                paddingValues4 = paddingValues2;
                                buttonElevation5 = buttonElevation2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$3
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

                                public final void invoke(Composer composer2, int i16) {
                                    ButtonKt.Button(onClick, modifier2, z4, mutableInteractionSource4, buttonElevation5, shape3, borderStroke4, buttonColors4, paddingValues4, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i8 = i7;
                        paddingValues2 = paddingValues;
                        if ((i2 & 512) == 0) {
                        }
                        if ((1533916891 & i3) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        int i142 = i10 >> 6;
                        int i152 = (i142 & 14) | ((i10 >> 18) & 112);
                        final State<Color> contentColor2 = buttonColors3.contentColor(z3, startRestartGroup, i152);
                        long m2122unboximpl2 = buttonColors3.backgroundColor(z3, startRestartGroup, i152).getValue().m2122unboximpl();
                        long m2111copywmQWz5c$default2 = Color.m2111copywmQWz5c$default(m1284Button$lambda1(contentColor2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        if (buttonElevation4 != null) {
                        }
                        PaddingValues paddingValues52 = paddingValues3;
                        MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource2;
                        Modifier modifier32 = companion;
                        ButtonElevation buttonElevation62 = buttonElevation4;
                        ButtonColors buttonColors72 = buttonColors3;
                        Shape shape42 = cornerBasedShape;
                        SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier32, z3, shape42, m2122unboximpl2, m2111copywmQWz5c$default2, borderStroke3, elevation == null ? elevation.getValue().m4454unboximpl() : Dp.m4440constructorimpl(0), mutableInteractionSource52, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

                            public final void invoke(Composer composer2, int i16) {
                                long m1284Button$lambda1;
                                ComposerKt.sourceInformation(composer2, "C114@5345L683:Button.kt#jmzs0o");
                                if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                    m1284Button$lambda1 = ButtonKt.m1284Button$lambda1(contentColor2);
                                    ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m2114getAlphaimpl(m1284Button$lambda1)))};
                                    final PaddingValues paddingValues6 = paddingValues3;
                                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                                    final int i17 = i10;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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

                                        public final void invoke(Composer composer3, int i18) {
                                            ComposerKt.sourceInformation(composer3, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                                            if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                                final PaddingValues paddingValues7 = PaddingValues.this;
                                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                                final int i19 = i17;
                                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i20) {
                                                        ComposerKt.sourceInformation(composer4, "C118@5537L467:Button.kt#jmzs0o");
                                                        if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                            Modifier padding = PaddingKt.padding(SizeKt.m618defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m1280getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1279getMinHeightD9Ej5fM()), PaddingValues.this);
                                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                            Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                            int i21 = ((i19 >> 18) & 7168) | 432;
                                                            composer4.startReplaceableGroup(693286680);
                                                            ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                                            composer4.startReplaceableGroup(-1323940314);
                                                            ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume = composer4.consume(localDensity);
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            Density density = (Density) consume;
                                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume2 = composer4.consume(localLayoutDirection);
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                            Object consume3 = composer4.consume(localViewConfiguration);
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                                composer4.createNode(constructor);
                                                            } else {
                                                                composer4.useNode();
                                                            }
                                                            composer4.disableReusing();
                                                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer4);
                                                            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                            composer4.enableReusing();
                                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                            composer4.startReplaceableGroup(2058660585);
                                                            composer4.startReplaceableGroup(-678309503);
                                                            ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                                            function33.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                                            composer4.endReplaceableGroup();
                                                            composer4.endReplaceableGroup();
                                                            composer4.endNode();
                                                            composer4.endReplaceableGroup();
                                                            composer4.endReplaceableGroup();
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }), composer3, 48);
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), composer2, 56);
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i142 & 7168) | (i10 & 14) | C.ENCODING_PCM_32BIT | (i10 & 112) | (i10 & 896) | (i10 & 3670016) | ((i10 << 15) & 234881024), 0);
                        startRestartGroup = startRestartGroup;
                        shape3 = shape42;
                        borderStroke4 = borderStroke3;
                        mutableInteractionSource4 = mutableInteractionSource52;
                        buttonColors4 = buttonColors72;
                        buttonElevation5 = buttonElevation62;
                        paddingValues4 = paddingValues52;
                        z4 = z3;
                        modifier2 = modifier32;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    if ((i & 29360128) == 0) {
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    paddingValues2 = paddingValues;
                    if ((i2 & 512) == 0) {
                    }
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    int i1422 = i10 >> 6;
                    int i1522 = (i1422 & 14) | ((i10 >> 18) & 112);
                    final State<Color> contentColor22 = buttonColors3.contentColor(z3, startRestartGroup, i1522);
                    long m2122unboximpl22 = buttonColors3.backgroundColor(z3, startRestartGroup, i1522).getValue().m2122unboximpl();
                    long m2111copywmQWz5c$default22 = Color.m2111copywmQWz5c$default(m1284Button$lambda1(contentColor22), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (buttonElevation4 != null) {
                    }
                    PaddingValues paddingValues522 = paddingValues3;
                    MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource2;
                    Modifier modifier322 = companion;
                    ButtonElevation buttonElevation622 = buttonElevation4;
                    ButtonColors buttonColors722 = buttonColors3;
                    Shape shape422 = cornerBasedShape;
                    SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier322, z3, shape422, m2122unboximpl22, m2111copywmQWz5c$default22, borderStroke3, elevation == null ? elevation.getValue().m4454unboximpl() : Dp.m4440constructorimpl(0), mutableInteractionSource522, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

                        public final void invoke(Composer composer2, int i16) {
                            long m1284Button$lambda1;
                            ComposerKt.sourceInformation(composer2, "C114@5345L683:Button.kt#jmzs0o");
                            if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                                ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                m1284Button$lambda1 = ButtonKt.m1284Button$lambda1(contentColor22);
                                ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m2114getAlphaimpl(m1284Button$lambda1)))};
                                final PaddingValues paddingValues6 = paddingValues3;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                                final int i17 = i10;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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

                                    public final void invoke(Composer composer3, int i18) {
                                        ComposerKt.sourceInformation(composer3, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                                        if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                            final PaddingValues paddingValues7 = PaddingValues.this;
                                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            final int i19 = i17;
                                            TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i20) {
                                                    ComposerKt.sourceInformation(composer4, "C118@5537L467:Button.kt#jmzs0o");
                                                    if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                        Modifier padding = PaddingKt.padding(SizeKt.m618defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m1280getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1279getMinHeightD9Ej5fM()), PaddingValues.this);
                                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                        Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                        int i21 = ((i19 >> 18) & 7168) | 432;
                                                        composer4.startReplaceableGroup(693286680);
                                                        ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                                        composer4.startReplaceableGroup(-1323940314);
                                                        ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume = composer4.consume(localDensity);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        Density density = (Density) consume;
                                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume2 = composer4.consume(localLayoutDirection);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                        Object consume3 = composer4.consume(localViewConfiguration);
                                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                                        if (!(composer4.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer4.startReusableNode();
                                                        if (composer4.getInserting()) {
                                                            composer4.createNode(constructor);
                                                        } else {
                                                            composer4.useNode();
                                                        }
                                                        composer4.disableReusing();
                                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer4);
                                                        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-678309503);
                                                        ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                                        function33.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endNode();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 48);
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 56);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i1422 & 7168) | (i10 & 14) | C.ENCODING_PCM_32BIT | (i10 & 112) | (i10 & 896) | (i10 & 3670016) | ((i10 << 15) & 234881024), 0);
                    startRestartGroup = startRestartGroup;
                    shape3 = shape422;
                    borderStroke4 = borderStroke3;
                    mutableInteractionSource4 = mutableInteractionSource522;
                    buttonColors4 = buttonColors722;
                    buttonElevation5 = buttonElevation622;
                    paddingValues4 = paddingValues522;
                    z4 = z3;
                    modifier2 = modifier322;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                i8 = i7;
                paddingValues2 = paddingValues;
                if ((i2 & 512) == 0) {
                }
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i6 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i9 == 0) {
                }
                startRestartGroup.endDefaults();
                int i14222 = i10 >> 6;
                int i15222 = (i14222 & 14) | ((i10 >> 18) & 112);
                final State<Color> contentColor222 = buttonColors3.contentColor(z3, startRestartGroup, i15222);
                long m2122unboximpl222 = buttonColors3.backgroundColor(z3, startRestartGroup, i15222).getValue().m2122unboximpl();
                long m2111copywmQWz5c$default222 = Color.m2111copywmQWz5c$default(m1284Button$lambda1(contentColor222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (buttonElevation4 != null) {
                }
                PaddingValues paddingValues5222 = paddingValues3;
                MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource2;
                Modifier modifier3222 = companion;
                ButtonElevation buttonElevation6222 = buttonElevation4;
                ButtonColors buttonColors7222 = buttonColors3;
                Shape shape4222 = cornerBasedShape;
                SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier3222, z3, shape4222, m2122unboximpl222, m2111copywmQWz5c$default222, borderStroke3, elevation == null ? elevation.getValue().m4454unboximpl() : Dp.m4440constructorimpl(0), mutableInteractionSource5222, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

                    public final void invoke(Composer composer2, int i16) {
                        long m1284Button$lambda1;
                        ComposerKt.sourceInformation(composer2, "C114@5345L683:Button.kt#jmzs0o");
                        if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                            m1284Button$lambda1 = ButtonKt.m1284Button$lambda1(contentColor222);
                            ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m2114getAlphaimpl(m1284Button$lambda1)))};
                            final PaddingValues paddingValues6 = paddingValues3;
                            final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                            final int i17 = i10;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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

                                public final void invoke(Composer composer3, int i18) {
                                    ComposerKt.sourceInformation(composer3, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                                    if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                        final PaddingValues paddingValues7 = PaddingValues.this;
                                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                        final int i19 = i17;
                                        TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i20) {
                                                ComposerKt.sourceInformation(composer4, "C118@5537L467:Button.kt#jmzs0o");
                                                if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                    Modifier padding = PaddingKt.padding(SizeKt.m618defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m1280getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1279getMinHeightD9Ej5fM()), PaddingValues.this);
                                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                    int i21 = ((i19 >> 18) & 7168) | 432;
                                                    composer4.startReplaceableGroup(693286680);
                                                    ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume = composer4.consume(localDensity);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    Density density = (Density) consume;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume2 = composer4.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume3 = composer4.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    composer4.disableReusing();
                                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer4);
                                                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer4.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    composer4.startReplaceableGroup(-678309503);
                                                    ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                                    function33.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 48);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 56);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i14222 & 7168) | (i10 & 14) | C.ENCODING_PCM_32BIT | (i10 & 112) | (i10 & 896) | (i10 & 3670016) | ((i10 << 15) & 234881024), 0);
                startRestartGroup = startRestartGroup;
                shape3 = shape4222;
                borderStroke4 = borderStroke3;
                mutableInteractionSource4 = mutableInteractionSource5222;
                buttonColors4 = buttonColors7222;
                buttonElevation5 = buttonElevation6222;
                paddingValues4 = paddingValues5222;
                z4 = z3;
                modifier2 = modifier3222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            paddingValues2 = paddingValues;
            if ((i2 & 512) == 0) {
            }
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i6 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i9 == 0) {
            }
            startRestartGroup.endDefaults();
            int i142222 = i10 >> 6;
            int i152222 = (i142222 & 14) | ((i10 >> 18) & 112);
            final State<Color> contentColor2222 = buttonColors3.contentColor(z3, startRestartGroup, i152222);
            long m2122unboximpl2222 = buttonColors3.backgroundColor(z3, startRestartGroup, i152222).getValue().m2122unboximpl();
            long m2111copywmQWz5c$default2222 = Color.m2111copywmQWz5c$default(m1284Button$lambda1(contentColor2222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            if (buttonElevation4 != null) {
            }
            PaddingValues paddingValues52222 = paddingValues3;
            MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource2;
            Modifier modifier32222 = companion;
            ButtonElevation buttonElevation62222 = buttonElevation4;
            ButtonColors buttonColors72222 = buttonColors3;
            Shape shape42222 = cornerBasedShape;
            SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier32222, z3, shape42222, m2122unboximpl2222, m2111copywmQWz5c$default2222, borderStroke3, elevation == null ? elevation.getValue().m4454unboximpl() : Dp.m4440constructorimpl(0), mutableInteractionSource52222, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

                public final void invoke(Composer composer2, int i16) {
                    long m1284Button$lambda1;
                    ComposerKt.sourceInformation(composer2, "C114@5345L683:Button.kt#jmzs0o");
                    if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                        ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                        m1284Button$lambda1 = ButtonKt.m1284Button$lambda1(contentColor2222);
                        ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m2114getAlphaimpl(m1284Button$lambda1)))};
                        final PaddingValues paddingValues6 = paddingValues3;
                        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                        final int i17 = i10;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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

                            public final void invoke(Composer composer3, int i18) {
                                ComposerKt.sourceInformation(composer3, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                                if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                    TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                    final PaddingValues paddingValues7 = PaddingValues.this;
                                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                    final int i19 = i17;
                                    TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i20) {
                                            ComposerKt.sourceInformation(composer4, "C118@5537L467:Button.kt#jmzs0o");
                                            if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                                Modifier padding = PaddingKt.padding(SizeKt.m618defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m1280getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1279getMinHeightD9Ej5fM()), PaddingValues.this);
                                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                                int i21 = ((i19 >> 18) & 7168) | 432;
                                                composer4.startReplaceableGroup(693286680);
                                                ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                                composer4.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume = composer4.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Density density = (Density) consume;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume2 = composer4.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer4.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                composer4.disableReusing();
                                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer4);
                                                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer4.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-678309503);
                                                ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                                function33.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 48);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i142222 & 7168) | (i10 & 14) | C.ENCODING_PCM_32BIT | (i10 & 112) | (i10 & 896) | (i10 & 3670016) | ((i10 << 15) & 234881024), 0);
            startRestartGroup = startRestartGroup;
            shape3 = shape42222;
            borderStroke4 = borderStroke3;
            mutableInteractionSource4 = mutableInteractionSource52222;
            buttonColors4 = buttonColors72222;
            buttonElevation5 = buttonElevation62222;
            paddingValues4 = paddingValues52222;
            z4 = z3;
            modifier2 = modifier32222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        paddingValues2 = paddingValues;
        if ((i2 & 512) == 0) {
        }
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i9 == 0) {
        }
        startRestartGroup.endDefaults();
        int i1422222 = i10 >> 6;
        int i1522222 = (i1422222 & 14) | ((i10 >> 18) & 112);
        final State<Color> contentColor22222 = buttonColors3.contentColor(z3, startRestartGroup, i1522222);
        long m2122unboximpl22222 = buttonColors3.backgroundColor(z3, startRestartGroup, i1522222).getValue().m2122unboximpl();
        long m2111copywmQWz5c$default22222 = Color.m2111copywmQWz5c$default(m1284Button$lambda1(contentColor22222), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (buttonElevation4 != null) {
        }
        PaddingValues paddingValues522222 = paddingValues3;
        MutableInteractionSource mutableInteractionSource522222 = mutableInteractionSource2;
        Modifier modifier322222 = companion;
        ButtonElevation buttonElevation622222 = buttonElevation4;
        ButtonColors buttonColors722222 = buttonColors3;
        Shape shape422222 = cornerBasedShape;
        SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier322222, z3, shape422222, m2122unboximpl22222, m2111copywmQWz5c$default22222, borderStroke3, elevation == null ? elevation.getValue().m4454unboximpl() : Dp.m4440constructorimpl(0), mutableInteractionSource522222, ComposableLambdaKt.composableLambda(startRestartGroup, 7524271, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2
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

            public final void invoke(Composer composer2, int i16) {
                long m1284Button$lambda1;
                ComposerKt.sourceInformation(composer2, "C114@5345L683:Button.kt#jmzs0o");
                if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                    m1284Button$lambda1 = ButtonKt.m1284Button$lambda1(contentColor22222);
                    ProvidedValue[] providedValueArr = {localContentAlpha.provides(Float.valueOf(Color.m2114getAlphaimpl(m1284Button$lambda1)))};
                    final PaddingValues paddingValues6 = paddingValues3;
                    final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3 = content;
                    final int i17 = i10;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1699085201, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
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

                        public final void invoke(Composer composer3, int i18) {
                            ComposerKt.sourceInformation(composer3, "C116@5487L10,115@5431L587:Button.kt#jmzs0o");
                            if ((i18 & 11) != 2 || !composer3.getSkipping()) {
                                TextStyle button = MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton();
                                final PaddingValues paddingValues7 = PaddingValues.this;
                                final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                final int i19 = i17;
                                TextKt.ProvideTextStyle(button, ComposableLambdaKt.composableLambda(composer3, -630330208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i20) {
                                        ComposerKt.sourceInformation(composer4, "C118@5537L467:Button.kt#jmzs0o");
                                        if ((i20 & 11) != 2 || !composer4.getSkipping()) {
                                            Modifier padding = PaddingKt.padding(SizeKt.m618defaultMinSizeVpY3zN4(Modifier.INSTANCE, ButtonDefaults.INSTANCE.m1280getMinWidthD9Ej5fM(), ButtonDefaults.INSTANCE.m1279getMinHeightD9Ej5fM()), PaddingValues.this);
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Function3<RowScope, Composer, Integer, Unit> function33 = function32;
                                            int i21 = ((i19 >> 18) & 7168) | 432;
                                            composer4.startReplaceableGroup(693286680);
                                            ComposerKt.sourceInformation(composer4, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer4, 54);
                                            composer4.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer4, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume = composer4.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            Density density = (Density) consume;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume2 = composer4.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer4, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume3 = composer4.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            composer4.disableReusing();
                                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer4);
                                            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer4.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-678309503);
                                            ComposerKt.sourceInformation(composer4, "C80@3988L9:Row.kt#2w3rfo");
                                            function33.invoke(RowScopeInstance.INSTANCE, composer4, Integer.valueOf(((i21 >> 6) & 112) | 6));
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 48);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 56);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i1422222 & 7168) | (i10 & 14) | C.ENCODING_PCM_32BIT | (i10 & 112) | (i10 & 896) | (i10 & 3670016) | ((i10 << 15) & 234881024), 0);
        startRestartGroup = startRestartGroup;
        shape3 = shape422222;
        borderStroke4 = borderStroke3;
        mutableInteractionSource4 = mutableInteractionSource522222;
        buttonColors4 = buttonColors722222;
        buttonElevation5 = buttonElevation622222;
        paddingValues4 = paddingValues522222;
        z4 = z3;
        modifier2 = modifier322222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void OutlinedButton(Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1776134358);
        ComposerKt.sourceInformation(composer, "C(OutlinedButton)P(8,7,5,6,4,9!2,3)168@7956L39,170@8070L6,171@8127L14,172@8185L22,175@8325L270:Button.kt#jmzs0o");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        Button(onClick, modifier2, z2, mutableInteractionSource2, (i2 & 16) != 0 ? null : buttonElevation, (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape, (i2 & 64) != 0 ? ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6) : borderStroke, (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m1282outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors, (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getContentPadding() : paddingValues, content, composer, i & 2147483646, 0);
        composer.endReplaceableGroup();
    }

    public static final void TextButton(Function0<Unit> onClick, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(288797557);
        ComposerKt.sourceInformation(composer, "C(TextButton)P(8,7,5,6,4,9!2,3)222@10527L39,224@10641L6,226@10731L18,229@10877L270:Button.kt#jmzs0o");
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        Button(onClick, modifier2, z2, mutableInteractionSource2, (i2 & 16) != 0 ? null : buttonElevation, (i2 & 32) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall() : shape, (i2 & 64) != 0 ? null : borderStroke, (i2 & 128) != 0 ? ButtonDefaults.INSTANCE.m1283textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7) : buttonColors, (i2 & 256) != 0 ? ButtonDefaults.INSTANCE.getTextButtonContentPadding() : paddingValues, content, composer, i & 2147483646, 0);
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Button$lambda-1, reason: not valid java name */
    public static final long m1284Button$lambda1(State<Color> state) {
        return state.getValue().m2122unboximpl();
    }
}
