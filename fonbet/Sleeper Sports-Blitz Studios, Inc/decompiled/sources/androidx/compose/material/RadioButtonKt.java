package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012\"\u0010\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012\"\u0010\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012\"\u0010\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012\"\u0010\u0010\u0016\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012\"\u0010\u0010\u0017\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u0018"}, d2 = {"RadioButton", "", "selected", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material/RadioButtonColors;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/RadioButtonColors;Landroidx/compose/runtime/Composer;II)V", "RadioAnimationDuration", "", "RadioButtonRippleRadius", "Landroidx/compose/ui/unit/Dp;", "F", "RadioButtonPadding", "RadioButtonSize", "RadioRadius", "RadioButtonDotSize", "RadioStrokeWidth", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonKt {
    private static final int RadioAnimationDuration = 100;
    private static final float RadioButtonDotSize;
    private static final float RadioButtonPadding;
    private static final float RadioButtonRippleRadius = Dp.m8798constructorimpl(24);
    private static final float RadioButtonSize;
    private static final float RadioRadius;
    private static final float RadioStrokeWidth;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioButton$lambda$2(boolean z, Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, RadioButtonColors radioButtonColors, int i, int i2, Composer composer, int i3) {
        RadioButton(z, function0, modifier, z2, mutableInteractionSource, radioButtonColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0065  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioButton(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, RadioButtonColors radioButtonColors, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        RadioButtonColors radioButtonColors2;
        final Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        boolean z5;
        Composer composer2;
        int i6;
        RadioButtonColors radioButtonColors3;
        MutableInteractionSource mutableInteractionSource4;
        int i7;
        float m8798constructorimpl;
        ?? r14;
        Modifier modifier4;
        int i8;
        Modifier.Companion companion2;
        Modifier.Companion companion3;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1314435585);
        ComposerKt.sourceInformation(startRestartGroup, "C(RadioButton)N(selected,onClick,modifier,enabled,interactionSource,colors)82@3703L177,86@3909L29,113@4796L386,100@4389L793:RadioButton.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            radioButtonColors2 = radioButtonColors;
                            if (startRestartGroup.changed(radioButtonColors2)) {
                                i9 = 131072;
                                i3 |= i9;
                            }
                        } else {
                            radioButtonColors2 = radioButtonColors;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    } else {
                        radioButtonColors2 = radioButtonColors;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        ComposerKt.sourceInformation(startRestartGroup, "79@3661L8");
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            companion = modifier2;
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            composer2 = startRestartGroup;
                            radioButtonColors3 = radioButtonColors2;
                        } else {
                            companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                            z5 = i4 != 0 ? true : z3;
                            MutableInteractionSource mutableInteractionSource5 = i5 != 0 ? null : mutableInteractionSource2;
                            if ((i2 & 32) != 0) {
                                composer2 = startRestartGroup;
                                i6 = i3 & (-458753);
                                radioButtonColors3 = RadioButtonDefaults.INSTANCE.m2435colorsRGew2ao(0L, 0L, 0L, composer2, 3072, 7);
                            } else {
                                composer2 = startRestartGroup;
                                i6 = i3;
                                radioButtonColors3 = radioButtonColors2;
                            }
                            mutableInteractionSource4 = mutableInteractionSource5;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1314435585, i6, -1, "androidx.compose.material.RadioButton (RadioButton.kt:80)");
                        }
                        if (z) {
                            i7 = 2;
                            m8798constructorimpl = Dp.m8798constructorimpl(RadioButtonDotSize / 2);
                        } else {
                            i7 = 2;
                            m8798constructorimpl = Dp.m8798constructorimpl(0);
                        }
                        int i11 = i7;
                        int i12 = i6;
                        startRestartGroup = composer2;
                        final State<Dp> m465animateDpAsStateAjpBEmI = AnimateAsStateKt.m465animateDpAsStateAjpBEmI(m8798constructorimpl, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
                        int i13 = i12 >> 9;
                        final State<Color> radioColor = radioButtonColors3.radioColor(z5, z, startRestartGroup, ((i12 << 3) & 112) | (i13 & 14) | (i13 & 896));
                        if (function0 != null) {
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            int m7984getRadioButtono7Vup1c = Role.INSTANCE.m7984getRadioButtono7Vup1c();
                            IndicationNodeFactory m2441rippleH2RKhps$default = RippleKt.m2441rippleH2RKhps$default(false, RadioButtonRippleRadius, 0L, 4, null);
                            Role m7972boximpl = Role.m7972boximpl(m7984getRadioButtono7Vup1c);
                            modifier4 = companion;
                            radioButtonColors2 = radioButtonColors3;
                            r14 = 0;
                            z4 = z5;
                            i8 = i11;
                            companion2 = SelectableKt.m1484selectableO2vRcR0(companion4, z, mutableInteractionSource4, m2441rippleH2RKhps$default, z4, m7972boximpl, function0);
                        } else {
                            radioButtonColors2 = radioButtonColors3;
                            r14 = 0;
                            modifier4 = companion;
                            z4 = z5;
                            i8 = i11;
                            companion2 = Modifier.INSTANCE;
                        }
                        if (function0 != null) {
                            companion3 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE);
                        } else {
                            companion3 = Modifier.INSTANCE;
                        }
                        Modifier m1201requiredSize3ABfNKs = SizeKt.m1201requiredSize3ABfNKs(PaddingKt.m1157padding3ABfNKs(SizeKt.wrapContentSize$default(modifier4.then(companion3).then(companion2), Alignment.INSTANCE.getCenter(), r14, i8, null), RadioButtonPadding), RadioButtonSize);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 452256963, "CC(remember):RadioButton.kt#9igjgp");
                        boolean changed = startRestartGroup.changed(radioColor) | startRestartGroup.changed(m465animateDpAsStateAjpBEmI);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: androidx.compose.material.RadioButtonKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit RadioButton$lambda$1$lambda$0;
                                    RadioButton$lambda$1$lambda$0 = RadioButtonKt.RadioButton$lambda$1$lambda$0(State.this, m465animateDpAsStateAjpBEmI, (DrawScope) obj);
                                    return RadioButton$lambda$1$lambda$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CanvasKt.Canvas(m1201requiredSize3ABfNKs, (Function1) rememberedValue, startRestartGroup, r14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource3 = mutableInteractionSource4;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    final RadioButtonColors radioButtonColors4 = radioButtonColors2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.RadioButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit RadioButton$lambda$2;
                                RadioButton$lambda$2 = RadioButtonKt.RadioButton$lambda$2(z, function0, modifier3, z4, mutableInteractionSource3, radioButtonColors4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return RadioButton$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                final RadioButtonColors radioButtonColors42 = radioButtonColors2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            final RadioButtonColors radioButtonColors422 = radioButtonColors2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        final RadioButtonColors radioButtonColors4222 = radioButtonColors2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioButton$lambda$1$lambda$0(State state, State state2, DrawScope drawScope) {
        float f = drawScope.mo744toPx0680j_4(RadioStrokeWidth);
        float f2 = f / 2;
        DrawScope.m6599drawCircleVaOC9Bg$default(drawScope, ((Color) state.getValue()).m6049unboximpl(), drawScope.mo744toPx0680j_4(RadioRadius) - f2, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (Dp.m8797compareTo0680j_4(((Dp) state2.getValue()).m8812unboximpl(), Dp.m8798constructorimpl(0)) > 0) {
            DrawScope.m6599drawCircleVaOC9Bg$default(drawScope, ((Color) state.getValue()).m6049unboximpl(), drawScope.mo744toPx0680j_4(((Dp) state2.getValue()).m8812unboximpl()) - f2, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
        }
        return Unit.INSTANCE;
    }

    static {
        float f = 2;
        RadioButtonPadding = Dp.m8798constructorimpl(f);
        float m8798constructorimpl = Dp.m8798constructorimpl(20);
        RadioButtonSize = m8798constructorimpl;
        RadioRadius = Dp.m8798constructorimpl(m8798constructorimpl / f);
        RadioButtonDotSize = Dp.m8798constructorimpl(12);
        RadioStrokeWidth = Dp.m8798constructorimpl(f);
    }
}
