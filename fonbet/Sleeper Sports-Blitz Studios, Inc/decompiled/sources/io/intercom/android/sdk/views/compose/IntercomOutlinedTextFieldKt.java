package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.messaging.Constants;
import com.rnlineargradient.LinearGradientManager;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.objectweb.asm.Opcodes;

/* compiled from: IntercomOutlinedTextField.kt */
@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&\"\u0010\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)¨\u0006*"}, d2 = {"IntercomOutlinedTextField", "", "value", "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "minLines", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material3/TextFieldColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;IIII)V", "OutlinedTextFieldTopPadding", "Landroidx/compose/ui/unit/Dp;", "F", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomOutlinedTextFieldKt {
    private static final float OutlinedTextFieldTopPadding = Dp.m8798constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomOutlinedTextField$lambda$3(String value, Function1 onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, int i3, int i4, int i5, int i6, Composer composer, int i7) {
        Intrinsics.checkNotNullParameter(value, "$value");
        Intrinsics.checkNotNullParameter(onValueChange, "$onValueChange");
        IntercomOutlinedTextField(value, onValueChange, modifier, z, z2, textStyle, function2, function22, function23, function24, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i, i2, mutableInteractionSource, shape, textFieldColors, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IntercomOutlinedTextField(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i3, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        TextStyle textStyle2;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i11;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Function2<? super Composer, ? super Integer, Unit> function27;
        boolean z7;
        VisualTransformation none;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        boolean z8;
        int i31;
        int i32;
        Function2<? super Composer, ? super Integer, Unit> function28;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        CornerBasedShape cornerBasedShape;
        Shape shape2;
        TextFieldColors textFieldColors2;
        TextFieldColors textFieldColors3;
        Function2<? super Composer, ? super Integer, Unit> function29;
        MutableInteractionSource mutableInteractionSource4;
        PaddingValues paddingValues2;
        int i33;
        int i34;
        Shape shape3;
        TextFieldColors textFieldColors4;
        long m8262getColor0d7_KjU;
        TextStyle textStyle3;
        final MutableInteractionSource mutableInteractionSource5;
        Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        Composer composer2;
        final boolean z9;
        final boolean z10;
        final TextStyle textStyle4;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final boolean z11;
        final VisualTransformation visualTransformation2;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final KeyboardOptions keyboardOptions3;
        final int i35;
        final boolean z12;
        final Shape shape4;
        final MutableInteractionSource mutableInteractionSource6;
        final Modifier modifier4;
        final KeyboardActions keyboardActions3;
        final PaddingValues paddingValues3;
        final TextFieldColors textFieldColors5;
        final int i36;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(967048125);
        if ((i6 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i7 = (startRestartGroup.changed(value) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 112) == 0) {
            i7 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i37 = i6 & 4;
        if (i37 != 0) {
            i7 |= 384;
        } else if ((i3 & 896) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else if ((i3 & 7168) == 0) {
                z5 = z;
                i7 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                    z6 = z2;
                } else {
                    z6 = z2;
                    if ((i3 & 57344) == 0) {
                        i7 |= startRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                }
                if ((i3 & Opcodes.ASM7) == 0) {
                    textStyle2 = textStyle;
                    i7 |= ((i6 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                } else {
                    textStyle2 = textStyle;
                }
                i10 = i6 & 64;
                if (i10 != 0) {
                    i7 |= 1572864;
                    function25 = function2;
                } else {
                    function25 = function2;
                    if ((i3 & 3670016) == 0) {
                        i7 |= startRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                    }
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                    function26 = function22;
                } else {
                    function26 = function22;
                    if ((i3 & 29360128) == 0) {
                        i7 |= startRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
                    }
                }
                i12 = i6 & 256;
                if (i12 != 0) {
                    i7 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    i13 = i12;
                    i7 |= startRestartGroup.changedInstance(function23) ? 67108864 : 33554432;
                    i14 = i6 & 512;
                    if (i14 == 0) {
                        i7 |= 805306368;
                    } else if ((i3 & 1879048192) == 0) {
                        i15 = i14;
                        i7 |= startRestartGroup.changedInstance(function24) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        i16 = i6 & 1024;
                        if (i16 != 0) {
                            i18 = i4 | 6;
                            i17 = i16;
                        } else if ((i4 & 14) == 0) {
                            i17 = i16;
                            i18 = i4 | (startRestartGroup.changed(z3) ? 4 : 2);
                        } else {
                            i17 = i16;
                            i18 = i4;
                        }
                        i19 = i6 & 2048;
                        if (i19 != 0) {
                            i18 |= 48;
                            i20 = i19;
                        } else if ((i4 & 112) == 0) {
                            i20 = i19;
                            i18 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                        } else {
                            i20 = i19;
                        }
                        int i38 = i18;
                        i21 = i6 & 4096;
                        if (i21 != 0) {
                            i22 = i38 | 384;
                        } else {
                            int i39 = i38;
                            if ((i4 & 896) == 0) {
                                i39 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                            }
                            i22 = i39;
                        }
                        i23 = i6 & 8192;
                        if (i23 != 0) {
                            i24 = i22 | 3072;
                        } else {
                            int i40 = i22;
                            if ((i4 & 7168) == 0) {
                                i24 = i40 | (startRestartGroup.changed(keyboardActions) ? 2048 : 1024);
                            } else {
                                i24 = i40;
                            }
                        }
                        i25 = i6 & 16384;
                        if (i25 != 0) {
                            i24 |= 24576;
                        } else if ((i4 & 57344) == 0) {
                            i26 = i24 | (startRestartGroup.changed(z4) ? 16384 : 8192);
                            if ((i4 & Opcodes.ASM7) == 0) {
                                i26 |= ((i6 & 32768) == 0 && startRestartGroup.changed(i)) ? 131072 : 65536;
                            }
                            i27 = i6 & 65536;
                            if (i27 == 0) {
                                i26 |= 1572864;
                            } else if ((i4 & 3670016) == 0) {
                                i26 |= startRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i28 = i6 & 131072;
                            if (i28 == 0) {
                                i26 |= 12582912;
                            } else if ((i4 & 29360128) == 0) {
                                i26 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                            }
                            if ((i4 & 234881024) == 0) {
                                i26 |= ((i6 & 262144) == 0 && startRestartGroup.changed(shape)) ? 67108864 : 33554432;
                            }
                            if ((i4 & 1879048192) == 0) {
                                i26 |= ((i6 & 524288) == 0 && startRestartGroup.changed(textFieldColors)) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            }
                            i29 = i6 & 1048576;
                            if (i29 == 0) {
                                i30 = i5 | 6;
                            } else if ((i5 & 14) == 0) {
                                i30 = i5 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
                            } else {
                                i30 = i5;
                            }
                            if ((i7 & 1533916891) == 306783378 || (i26 & 1533916891) != 306783378 || (i30 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i37 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i8 != 0) {
                                        z5 = true;
                                    }
                                    if (i9 != 0) {
                                        z6 = false;
                                    }
                                    if ((i6 & 32) != 0) {
                                        ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localTextStyle);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        i7 &= -458753;
                                        textStyle2 = (TextStyle) consume;
                                    }
                                    if (i10 != 0) {
                                        function25 = null;
                                    }
                                    if (i11 != 0) {
                                        function26 = null;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function213 = i13 == 0 ? null : function23;
                                    function27 = i15 == 0 ? null : function24;
                                    z7 = i17 == 0 ? false : z3;
                                    none = i20 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                    keyboardOptions2 = i21 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions;
                                    keyboardActions2 = i23 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                    z8 = i25 == 0 ? false : z4;
                                    if ((i6 & 32768) == 0) {
                                        i31 = z8 ? 1 : Integer.MAX_VALUE;
                                        i26 &= -458753;
                                    } else {
                                        i31 = i;
                                    }
                                    i32 = i27 == 0 ? 1 : i2;
                                    if (i28 == 0) {
                                        startRestartGroup.startReplaceGroup(1299418141);
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        function28 = function213;
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        function28 = function213;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    if ((262144 & i6) == 0) {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        cornerBasedShape = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
                                        i26 &= -234881025;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        cornerBasedShape = shape;
                                    }
                                    if ((i6 & 524288) == 0) {
                                        shape2 = cornerBasedShape;
                                        textFieldColors2 = TextFieldColors.m3804copyejIjP34$default(OutlinedTextFieldDefaults.INSTANCE.colors(startRestartGroup, 6), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), Color.m6038copywmQWz5c$default(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), 0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13108getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13108getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13108getInputAlt0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13108getInputAlt0d7_KjU(), 0L, 0L, null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13098getCollectorBorder0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13098getCollectorBorder0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -6392, 2047, null);
                                        i26 &= -1879048193;
                                    } else {
                                        shape2 = cornerBasedShape;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    if (i29 == 0) {
                                        float f = 8;
                                        textFieldColors3 = textFieldColors2;
                                        PaddingValues m1151PaddingValuesYgX7TsA = PaddingKt.m1151PaddingValuesYgX7TsA(Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f));
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        paddingValues2 = m1151PaddingValuesYgX7TsA;
                                        i33 = i7;
                                        i34 = i26;
                                        function29 = function28;
                                    } else {
                                        textFieldColors3 = textFieldColors2;
                                        function29 = function28;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        paddingValues2 = paddingValues;
                                        i33 = i7;
                                        i34 = i26;
                                    }
                                    shape3 = shape2;
                                    textFieldColors4 = textFieldColors3;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & 32) != 0) {
                                        i7 &= -458753;
                                    }
                                    if ((32768 & i6) != 0) {
                                        i26 &= -458753;
                                    }
                                    if ((262144 & i6) != 0) {
                                        i26 &= -234881025;
                                    }
                                    if ((i6 & 524288) != 0) {
                                        i26 &= -1879048193;
                                    }
                                    function29 = function23;
                                    function27 = function24;
                                    z7 = z3;
                                    none = visualTransformation;
                                    keyboardOptions2 = keyboardOptions;
                                    keyboardActions2 = keyboardActions;
                                    z8 = z4;
                                    i31 = i;
                                    i32 = i2;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    paddingValues2 = paddingValues;
                                    i33 = i7;
                                    i34 = i26;
                                    shape3 = shape;
                                    textFieldColors4 = textFieldColors;
                                }
                                startRestartGroup.endDefaults();
                                m8262getColor0d7_KjU = textStyle2.m8262getColor0d7_KjU();
                                if (m8262getColor0d7_KjU == 16) {
                                    m8262getColor0d7_KjU = z5 ? textFieldColors4.getUnfocusedTextColor() : textFieldColors4.getDisabledTextColor();
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function214 = function29;
                                TextStyle merge = textStyle2.merge(new TextStyle(m8262getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                if (function25 == null) {
                                    textStyle3 = merge;
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    modifier3 = PaddingKt.m1161paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier2, true, new Function1() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit IntercomOutlinedTextField$lambda$2;
                                            IntercomOutlinedTextField$lambda$2 = IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$2((SemanticsPropertyReceiver) obj);
                                            return IntercomOutlinedTextField$lambda$2;
                                        }
                                    }), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13, null);
                                } else {
                                    textStyle3 = merge;
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                    modifier3 = modifier2;
                                }
                                final Shape shape5 = shape3;
                                final boolean z13 = z5;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function26;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = function27;
                                final Function2<? super Composer, ? super Integer, Unit> function217 = function25;
                                final boolean z14 = z7;
                                final VisualTransformation visualTransformation3 = none;
                                final TextFieldColors textFieldColors6 = textFieldColors4;
                                final PaddingValues paddingValues4 = paddingValues2;
                                final boolean z15 = z8;
                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource5;
                                function210 = function214;
                                int i41 = i34 << 12;
                                BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m1193defaultMinSizeVpY3zN4(BackgroundKt.m581backgroundbw27NRU(modifier3, !z5 ? textFieldColors4.getUnfocusedContainerColor() : textFieldColors4.getDisabledContainerColor(), shape3), TextFieldDefaults.INSTANCE.m3878getMinWidthD9Ej5fM(), Dp.m8798constructorimpl(40)), z5, z6, textStyle3, keyboardOptions2, keyboardActions2, z8, i31, i32, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7, new SolidColor(!z7 ? textFieldColors4.getErrorCursorColor() : textFieldColors4.getCursorColor(), null), ComposableLambdaKt.rememberComposableLambda(491720992, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function218, Composer composer3, Integer num) {
                                        invoke((Function2<? super Composer, ? super Integer, Unit>) function218, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i42) {
                                        int i43;
                                        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                        if ((i42 & 14) == 0) {
                                            i43 = i42 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                                        } else {
                                            i43 = i42;
                                        }
                                        if ((i43 & 91) != 18 || !composer3.getSkipping()) {
                                            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                            int i44 = i43;
                                            String str = value;
                                            boolean z16 = z13;
                                            boolean z17 = z15;
                                            VisualTransformation visualTransformation4 = visualTransformation3;
                                            MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource5;
                                            boolean z18 = z14;
                                            Function2<Composer, Integer, Unit> function218 = function217;
                                            Function2<Composer, Integer, Unit> function219 = function215;
                                            Function2<Composer, Integer, Unit> function220 = function214;
                                            Function2<Composer, Integer, Unit> function221 = function216;
                                            TextFieldColors textFieldColors7 = textFieldColors6;
                                            PaddingValues paddingValues5 = paddingValues4;
                                            final boolean z19 = z13;
                                            final boolean z20 = z14;
                                            final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource5;
                                            final TextFieldColors textFieldColors8 = textFieldColors6;
                                            final Shape shape6 = shape5;
                                            outlinedTextFieldDefaults.DecorationBox(str, innerTextField, z16, z17, visualTransformation4, mutableInteractionSource8, z18, function218, function219, function220, function221, null, null, null, textFieldColors7, paddingValues5, ComposableLambdaKt.rememberComposableLambda(888607277, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i45) {
                                                    if ((i45 & 11) != 2 || !composer4.getSkipping()) {
                                                        float f2 = 1;
                                                        OutlinedTextFieldDefaults.INSTANCE.m3438Container4EFweAY(z19, z20, mutableInteractionSource9, null, textFieldColors8, shape6, Dp.m8798constructorimpl(f2), Dp.m8798constructorimpl(f2), composer4, 114819072, 8);
                                                    } else {
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }
                                            }, composer3, 54), composer3, (i44 << 3) & 112, 14155776, 14336);
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), startRestartGroup, (i33 & 64638) | (i41 & 3670016) | (i41 & 29360128) | (234881024 & i41) | (i41 & 1879048192), ((i34 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i34 & 112) | ((i34 >> 12) & 7168), 4096);
                                composer2 = startRestartGroup;
                                z9 = z5;
                                z10 = z6;
                                textStyle4 = textStyle2;
                                function211 = function25;
                                z11 = z7;
                                visualTransformation2 = none;
                                function212 = function216;
                                keyboardOptions3 = keyboardOptions2;
                                i35 = i32;
                                z12 = z8;
                                shape4 = shape5;
                                mutableInteractionSource6 = mutableInteractionSource7;
                                modifier4 = modifier2;
                                keyboardActions3 = keyboardActions2;
                                paddingValues3 = paddingValues2;
                                textFieldColors5 = textFieldColors6;
                                i36 = i31;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function210 = function23;
                                keyboardOptions3 = keyboardOptions;
                                z12 = z4;
                                i36 = i;
                                i35 = i2;
                                mutableInteractionSource6 = mutableInteractionSource;
                                shape4 = shape;
                                textFieldColors5 = textFieldColors;
                                paddingValues3 = paddingValues;
                                composer2 = startRestartGroup;
                                z9 = z5;
                                z10 = z6;
                                textStyle4 = textStyle2;
                                function211 = function25;
                                modifier4 = modifier2;
                                function212 = function24;
                                z11 = z3;
                                visualTransformation2 = visualTransformation;
                                keyboardActions3 = keyboardActions;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit IntercomOutlinedTextField$lambda$3;
                                        IntercomOutlinedTextField$lambda$3 = IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$3(value, onValueChange, modifier4, z9, z10, textStyle4, function211, function26, function210, function212, z11, visualTransformation2, keyboardOptions3, keyboardActions3, z12, i36, i35, mutableInteractionSource6, shape4, textFieldColors5, paddingValues3, i3, i4, i5, i6, (Composer) obj, ((Integer) obj2).intValue());
                                        return IntercomOutlinedTextField$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i26 = i24;
                        if ((i4 & Opcodes.ASM7) == 0) {
                        }
                        i27 = i6 & 65536;
                        if (i27 == 0) {
                        }
                        i28 = i6 & 131072;
                        if (i28 == 0) {
                        }
                        if ((i4 & 234881024) == 0) {
                        }
                        if ((i4 & 1879048192) == 0) {
                        }
                        i29 = i6 & 1048576;
                        if (i29 == 0) {
                        }
                        if ((i7 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i37 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if ((i6 & 32) != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i21 == 0) {
                        }
                        if (i23 == 0) {
                        }
                        if (i25 == 0) {
                        }
                        if ((i6 & 32768) == 0) {
                        }
                        if (i27 == 0) {
                        }
                        if (i28 == 0) {
                        }
                        if ((262144 & i6) == 0) {
                        }
                        if ((i6 & 524288) == 0) {
                        }
                        if (i29 == 0) {
                        }
                        shape3 = shape2;
                        textFieldColors4 = textFieldColors3;
                        startRestartGroup.endDefaults();
                        m8262getColor0d7_KjU = textStyle2.m8262getColor0d7_KjU();
                        if (m8262getColor0d7_KjU == 16) {
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function2142 = function29;
                        TextStyle merge2 = textStyle2.merge(new TextStyle(m8262getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        if (function25 == null) {
                        }
                        final Shape shape52 = shape3;
                        final boolean z132 = z5;
                        final Function2<? super Composer, ? super Integer, Unit> function2152 = function26;
                        final Function2<? super Composer, ? super Integer, Unit> function2162 = function27;
                        final Function2<? super Composer, ? super Integer, Unit> function2172 = function25;
                        final boolean z142 = z7;
                        final VisualTransformation visualTransformation32 = none;
                        final TextFieldColors textFieldColors62 = textFieldColors4;
                        final PaddingValues paddingValues42 = paddingValues2;
                        final boolean z152 = z8;
                        MutableInteractionSource mutableInteractionSource72 = mutableInteractionSource5;
                        function210 = function2142;
                        int i412 = i34 << 12;
                        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m1193defaultMinSizeVpY3zN4(BackgroundKt.m581backgroundbw27NRU(modifier3, !z5 ? textFieldColors4.getUnfocusedContainerColor() : textFieldColors4.getDisabledContainerColor(), shape3), TextFieldDefaults.INSTANCE.m3878getMinWidthD9Ej5fM(), Dp.m8798constructorimpl(40)), z5, z6, textStyle3, keyboardOptions2, keyboardActions2, z8, i31, i32, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource72, new SolidColor(!z7 ? textFieldColors4.getErrorCursorColor() : textFieldColors4.getCursorColor(), null), ComposableLambdaKt.rememberComposableLambda(491720992, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function218, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function218, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i42) {
                                int i43;
                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                if ((i42 & 14) == 0) {
                                    i43 = i42 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                                } else {
                                    i43 = i42;
                                }
                                if ((i43 & 91) != 18 || !composer3.getSkipping()) {
                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                    int i44 = i43;
                                    String str = value;
                                    boolean z16 = z132;
                                    boolean z17 = z152;
                                    VisualTransformation visualTransformation4 = visualTransformation32;
                                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource5;
                                    boolean z18 = z142;
                                    Function2<Composer, Integer, Unit> function218 = function2172;
                                    Function2<Composer, Integer, Unit> function219 = function2152;
                                    Function2<Composer, Integer, Unit> function220 = function2142;
                                    Function2<Composer, Integer, Unit> function221 = function2162;
                                    TextFieldColors textFieldColors7 = textFieldColors62;
                                    PaddingValues paddingValues5 = paddingValues42;
                                    final boolean z19 = z132;
                                    final boolean z20 = z142;
                                    final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource5;
                                    final TextFieldColors textFieldColors8 = textFieldColors62;
                                    final Shape shape6 = shape52;
                                    outlinedTextFieldDefaults.DecorationBox(str, innerTextField, z16, z17, visualTransformation4, mutableInteractionSource8, z18, function218, function219, function220, function221, null, null, null, textFieldColors7, paddingValues5, ComposableLambdaKt.rememberComposableLambda(888607277, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i45) {
                                            if ((i45 & 11) != 2 || !composer4.getSkipping()) {
                                                float f2 = 1;
                                                OutlinedTextFieldDefaults.INSTANCE.m3438Container4EFweAY(z19, z20, mutableInteractionSource9, null, textFieldColors8, shape6, Dp.m8798constructorimpl(f2), Dp.m8798constructorimpl(f2), composer4, 114819072, 8);
                                            } else {
                                                composer4.skipToGroupEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, (i44 << 3) & 112, 14155776, 14336);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i33 & 64638) | (i412 & 3670016) | (i412 & 29360128) | (234881024 & i412) | (i412 & 1879048192), ((i34 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i34 & 112) | ((i34 >> 12) & 7168), 4096);
                        composer2 = startRestartGroup;
                        z9 = z5;
                        z10 = z6;
                        textStyle4 = textStyle2;
                        function211 = function25;
                        z11 = z7;
                        visualTransformation2 = none;
                        function212 = function2162;
                        keyboardOptions3 = keyboardOptions2;
                        i35 = i32;
                        z12 = z8;
                        shape4 = shape52;
                        mutableInteractionSource6 = mutableInteractionSource72;
                        modifier4 = modifier2;
                        keyboardActions3 = keyboardActions2;
                        paddingValues3 = paddingValues2;
                        textFieldColors5 = textFieldColors62;
                        i36 = i31;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i15 = i14;
                    i16 = i6 & 1024;
                    if (i16 != 0) {
                    }
                    i19 = i6 & 2048;
                    if (i19 != 0) {
                    }
                    int i382 = i18;
                    i21 = i6 & 4096;
                    if (i21 != 0) {
                    }
                    i23 = i6 & 8192;
                    if (i23 != 0) {
                    }
                    i25 = i6 & 16384;
                    if (i25 != 0) {
                    }
                    i26 = i24;
                    if ((i4 & Opcodes.ASM7) == 0) {
                    }
                    i27 = i6 & 65536;
                    if (i27 == 0) {
                    }
                    i28 = i6 & 131072;
                    if (i28 == 0) {
                    }
                    if ((i4 & 234881024) == 0) {
                    }
                    if ((i4 & 1879048192) == 0) {
                    }
                    i29 = i6 & 1048576;
                    if (i29 == 0) {
                    }
                    if ((i7 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i37 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i6 & 32) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i23 == 0) {
                    }
                    if (i25 == 0) {
                    }
                    if ((i6 & 32768) == 0) {
                    }
                    if (i27 == 0) {
                    }
                    if (i28 == 0) {
                    }
                    if ((262144 & i6) == 0) {
                    }
                    if ((i6 & 524288) == 0) {
                    }
                    if (i29 == 0) {
                    }
                    shape3 = shape2;
                    textFieldColors4 = textFieldColors3;
                    startRestartGroup.endDefaults();
                    m8262getColor0d7_KjU = textStyle2.m8262getColor0d7_KjU();
                    if (m8262getColor0d7_KjU == 16) {
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function21422 = function29;
                    TextStyle merge22 = textStyle2.merge(new TextStyle(m8262getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                    if (function25 == null) {
                    }
                    final Shape shape522 = shape3;
                    final boolean z1322 = z5;
                    final Function2<? super Composer, ? super Integer, Unit> function21522 = function26;
                    final Function2<? super Composer, ? super Integer, Unit> function21622 = function27;
                    final Function2<? super Composer, ? super Integer, Unit> function21722 = function25;
                    final boolean z1422 = z7;
                    final VisualTransformation visualTransformation322 = none;
                    final TextFieldColors textFieldColors622 = textFieldColors4;
                    final PaddingValues paddingValues422 = paddingValues2;
                    final boolean z1522 = z8;
                    MutableInteractionSource mutableInteractionSource722 = mutableInteractionSource5;
                    function210 = function21422;
                    int i4122 = i34 << 12;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m1193defaultMinSizeVpY3zN4(BackgroundKt.m581backgroundbw27NRU(modifier3, !z5 ? textFieldColors4.getUnfocusedContainerColor() : textFieldColors4.getDisabledContainerColor(), shape3), TextFieldDefaults.INSTANCE.m3878getMinWidthD9Ej5fM(), Dp.m8798constructorimpl(40)), z5, z6, textStyle3, keyboardOptions2, keyboardActions2, z8, i31, i32, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource722, new SolidColor(!z7 ? textFieldColors4.getErrorCursorColor() : textFieldColors4.getCursorColor(), null), ComposableLambdaKt.rememberComposableLambda(491720992, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function218, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function218, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i42) {
                            int i43;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            if ((i42 & 14) == 0) {
                                i43 = i42 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                            } else {
                                i43 = i42;
                            }
                            if ((i43 & 91) != 18 || !composer3.getSkipping()) {
                                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                                int i44 = i43;
                                String str = value;
                                boolean z16 = z1322;
                                boolean z17 = z1522;
                                VisualTransformation visualTransformation4 = visualTransformation322;
                                MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource5;
                                boolean z18 = z1422;
                                Function2<Composer, Integer, Unit> function218 = function21722;
                                Function2<Composer, Integer, Unit> function219 = function21522;
                                Function2<Composer, Integer, Unit> function220 = function21422;
                                Function2<Composer, Integer, Unit> function221 = function21622;
                                TextFieldColors textFieldColors7 = textFieldColors622;
                                PaddingValues paddingValues5 = paddingValues422;
                                final boolean z19 = z1322;
                                final boolean z20 = z1422;
                                final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource5;
                                final TextFieldColors textFieldColors8 = textFieldColors622;
                                final Shape shape6 = shape522;
                                outlinedTextFieldDefaults.DecorationBox(str, innerTextField, z16, z17, visualTransformation4, mutableInteractionSource8, z18, function218, function219, function220, function221, null, null, null, textFieldColors7, paddingValues5, ComposableLambdaKt.rememberComposableLambda(888607277, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i45) {
                                        if ((i45 & 11) != 2 || !composer4.getSkipping()) {
                                            float f2 = 1;
                                            OutlinedTextFieldDefaults.INSTANCE.m3438Container4EFweAY(z19, z20, mutableInteractionSource9, null, textFieldColors8, shape6, Dp.m8798constructorimpl(f2), Dp.m8798constructorimpl(f2), composer4, 114819072, 8);
                                        } else {
                                            composer4.skipToGroupEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, (i44 << 3) & 112, 14155776, 14336);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i33 & 64638) | (i4122 & 3670016) | (i4122 & 29360128) | (234881024 & i4122) | (i4122 & 1879048192), ((i34 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i34 & 112) | ((i34 >> 12) & 7168), 4096);
                    composer2 = startRestartGroup;
                    z9 = z5;
                    z10 = z6;
                    textStyle4 = textStyle2;
                    function211 = function25;
                    z11 = z7;
                    visualTransformation2 = none;
                    function212 = function21622;
                    keyboardOptions3 = keyboardOptions2;
                    i35 = i32;
                    z12 = z8;
                    shape4 = shape522;
                    mutableInteractionSource6 = mutableInteractionSource722;
                    modifier4 = modifier2;
                    keyboardActions3 = keyboardActions2;
                    paddingValues3 = paddingValues2;
                    textFieldColors5 = textFieldColors622;
                    i36 = i31;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i13 = i12;
                i14 = i6 & 512;
                if (i14 == 0) {
                }
                i15 = i14;
                i16 = i6 & 1024;
                if (i16 != 0) {
                }
                i19 = i6 & 2048;
                if (i19 != 0) {
                }
                int i3822 = i18;
                i21 = i6 & 4096;
                if (i21 != 0) {
                }
                i23 = i6 & 8192;
                if (i23 != 0) {
                }
                i25 = i6 & 16384;
                if (i25 != 0) {
                }
                i26 = i24;
                if ((i4 & Opcodes.ASM7) == 0) {
                }
                i27 = i6 & 65536;
                if (i27 == 0) {
                }
                i28 = i6 & 131072;
                if (i28 == 0) {
                }
                if ((i4 & 234881024) == 0) {
                }
                if ((i4 & 1879048192) == 0) {
                }
                i29 = i6 & 1048576;
                if (i29 == 0) {
                }
                if ((i7 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i37 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i6 & 32) != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 == 0) {
                }
                if (i15 == 0) {
                }
                if (i17 == 0) {
                }
                if (i20 == 0) {
                }
                if (i21 == 0) {
                }
                if (i23 == 0) {
                }
                if (i25 == 0) {
                }
                if ((i6 & 32768) == 0) {
                }
                if (i27 == 0) {
                }
                if (i28 == 0) {
                }
                if ((262144 & i6) == 0) {
                }
                if ((i6 & 524288) == 0) {
                }
                if (i29 == 0) {
                }
                shape3 = shape2;
                textFieldColors4 = textFieldColors3;
                startRestartGroup.endDefaults();
                m8262getColor0d7_KjU = textStyle2.m8262getColor0d7_KjU();
                if (m8262getColor0d7_KjU == 16) {
                }
                final Function2<? super Composer, ? super Integer, Unit> function214222 = function29;
                TextStyle merge222 = textStyle2.merge(new TextStyle(m8262getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                if (function25 == null) {
                }
                final Shape shape5222 = shape3;
                final boolean z13222 = z5;
                final Function2<? super Composer, ? super Integer, Unit> function215222 = function26;
                final Function2<? super Composer, ? super Integer, Unit> function216222 = function27;
                final Function2<? super Composer, ? super Integer, Unit> function217222 = function25;
                final boolean z14222 = z7;
                final VisualTransformation visualTransformation3222 = none;
                final TextFieldColors textFieldColors6222 = textFieldColors4;
                final PaddingValues paddingValues4222 = paddingValues2;
                final boolean z15222 = z8;
                MutableInteractionSource mutableInteractionSource7222 = mutableInteractionSource5;
                function210 = function214222;
                int i41222 = i34 << 12;
                BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m1193defaultMinSizeVpY3zN4(BackgroundKt.m581backgroundbw27NRU(modifier3, !z5 ? textFieldColors4.getUnfocusedContainerColor() : textFieldColors4.getDisabledContainerColor(), shape3), TextFieldDefaults.INSTANCE.m3878getMinWidthD9Ej5fM(), Dp.m8798constructorimpl(40)), z5, z6, textStyle3, keyboardOptions2, keyboardActions2, z8, i31, i32, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource7222, new SolidColor(!z7 ? textFieldColors4.getErrorCursorColor() : textFieldColors4.getCursorColor(), null), ComposableLambdaKt.rememberComposableLambda(491720992, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function218, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function218, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i42) {
                        int i43;
                        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                        if ((i42 & 14) == 0) {
                            i43 = i42 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                        } else {
                            i43 = i42;
                        }
                        if ((i43 & 91) != 18 || !composer3.getSkipping()) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                            int i44 = i43;
                            String str = value;
                            boolean z16 = z13222;
                            boolean z17 = z15222;
                            VisualTransformation visualTransformation4 = visualTransformation3222;
                            MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource5;
                            boolean z18 = z14222;
                            Function2<Composer, Integer, Unit> function218 = function217222;
                            Function2<Composer, Integer, Unit> function219 = function215222;
                            Function2<Composer, Integer, Unit> function220 = function214222;
                            Function2<Composer, Integer, Unit> function221 = function216222;
                            TextFieldColors textFieldColors7 = textFieldColors6222;
                            PaddingValues paddingValues5 = paddingValues4222;
                            final boolean z19 = z13222;
                            final boolean z20 = z14222;
                            final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource5;
                            final TextFieldColors textFieldColors8 = textFieldColors6222;
                            final Shape shape6 = shape5222;
                            outlinedTextFieldDefaults.DecorationBox(str, innerTextField, z16, z17, visualTransformation4, mutableInteractionSource8, z18, function218, function219, function220, function221, null, null, null, textFieldColors7, paddingValues5, ComposableLambdaKt.rememberComposableLambda(888607277, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i45) {
                                    if ((i45 & 11) != 2 || !composer4.getSkipping()) {
                                        float f2 = 1;
                                        OutlinedTextFieldDefaults.INSTANCE.m3438Container4EFweAY(z19, z20, mutableInteractionSource9, null, textFieldColors8, shape6, Dp.m8798constructorimpl(f2), Dp.m8798constructorimpl(f2), composer4, 114819072, 8);
                                    } else {
                                        composer4.skipToGroupEnd();
                                    }
                                }
                            }, composer3, 54), composer3, (i44 << 3) & 112, 14155776, 14336);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, (i33 & 64638) | (i41222 & 3670016) | (i41222 & 29360128) | (234881024 & i41222) | (i41222 & 1879048192), ((i34 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i34 & 112) | ((i34 >> 12) & 7168), 4096);
                composer2 = startRestartGroup;
                z9 = z5;
                z10 = z6;
                textStyle4 = textStyle2;
                function211 = function25;
                z11 = z7;
                visualTransformation2 = none;
                function212 = function216222;
                keyboardOptions3 = keyboardOptions2;
                i35 = i32;
                z12 = z8;
                shape4 = shape5222;
                mutableInteractionSource6 = mutableInteractionSource7222;
                modifier4 = modifier2;
                keyboardActions3 = keyboardActions2;
                paddingValues3 = paddingValues2;
                textFieldColors5 = textFieldColors6222;
                i36 = i31;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z5 = z;
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            if ((i3 & Opcodes.ASM7) == 0) {
            }
            i10 = i6 & 64;
            if (i10 != 0) {
            }
            i11 = i6 & 128;
            if (i11 != 0) {
            }
            i12 = i6 & 256;
            if (i12 != 0) {
            }
            i13 = i12;
            i14 = i6 & 512;
            if (i14 == 0) {
            }
            i15 = i14;
            i16 = i6 & 1024;
            if (i16 != 0) {
            }
            i19 = i6 & 2048;
            if (i19 != 0) {
            }
            int i38222 = i18;
            i21 = i6 & 4096;
            if (i21 != 0) {
            }
            i23 = i6 & 8192;
            if (i23 != 0) {
            }
            i25 = i6 & 16384;
            if (i25 != 0) {
            }
            i26 = i24;
            if ((i4 & Opcodes.ASM7) == 0) {
            }
            i27 = i6 & 65536;
            if (i27 == 0) {
            }
            i28 = i6 & 131072;
            if (i28 == 0) {
            }
            if ((i4 & 234881024) == 0) {
            }
            if ((i4 & 1879048192) == 0) {
            }
            i29 = i6 & 1048576;
            if (i29 == 0) {
            }
            if ((i7 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i37 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i6 & 32) != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 == 0) {
            }
            if (i15 == 0) {
            }
            if (i17 == 0) {
            }
            if (i20 == 0) {
            }
            if (i21 == 0) {
            }
            if (i23 == 0) {
            }
            if (i25 == 0) {
            }
            if ((i6 & 32768) == 0) {
            }
            if (i27 == 0) {
            }
            if (i28 == 0) {
            }
            if ((262144 & i6) == 0) {
            }
            if ((i6 & 524288) == 0) {
            }
            if (i29 == 0) {
            }
            shape3 = shape2;
            textFieldColors4 = textFieldColors3;
            startRestartGroup.endDefaults();
            m8262getColor0d7_KjU = textStyle2.m8262getColor0d7_KjU();
            if (m8262getColor0d7_KjU == 16) {
            }
            final Function2<? super Composer, ? super Integer, Unit> function2142222 = function29;
            TextStyle merge2222 = textStyle2.merge(new TextStyle(m8262getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            if (function25 == null) {
            }
            final Shape shape52222 = shape3;
            final boolean z132222 = z5;
            final Function2<? super Composer, ? super Integer, Unit> function2152222 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function2162222 = function27;
            final Function2<? super Composer, ? super Integer, Unit> function2172222 = function25;
            final boolean z142222 = z7;
            final VisualTransformation visualTransformation32222 = none;
            final TextFieldColors textFieldColors62222 = textFieldColors4;
            final PaddingValues paddingValues42222 = paddingValues2;
            final boolean z152222 = z8;
            MutableInteractionSource mutableInteractionSource72222 = mutableInteractionSource5;
            function210 = function2142222;
            int i412222 = i34 << 12;
            BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m1193defaultMinSizeVpY3zN4(BackgroundKt.m581backgroundbw27NRU(modifier3, !z5 ? textFieldColors4.getUnfocusedContainerColor() : textFieldColors4.getDisabledContainerColor(), shape3), TextFieldDefaults.INSTANCE.m3878getMinWidthD9Ej5fM(), Dp.m8798constructorimpl(40)), z5, z6, textStyle3, keyboardOptions2, keyboardActions2, z8, i31, i32, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource72222, new SolidColor(!z7 ? textFieldColors4.getErrorCursorColor() : textFieldColors4.getCursorColor(), null), ComposableLambdaKt.rememberComposableLambda(491720992, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function218, Composer composer3, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function218, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i42) {
                    int i43;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    if ((i42 & 14) == 0) {
                        i43 = i42 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                    } else {
                        i43 = i42;
                    }
                    if ((i43 & 91) != 18 || !composer3.getSkipping()) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                        int i44 = i43;
                        String str = value;
                        boolean z16 = z132222;
                        boolean z17 = z152222;
                        VisualTransformation visualTransformation4 = visualTransformation32222;
                        MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource5;
                        boolean z18 = z142222;
                        Function2<Composer, Integer, Unit> function218 = function2172222;
                        Function2<Composer, Integer, Unit> function219 = function2152222;
                        Function2<Composer, Integer, Unit> function220 = function2142222;
                        Function2<Composer, Integer, Unit> function221 = function2162222;
                        TextFieldColors textFieldColors7 = textFieldColors62222;
                        PaddingValues paddingValues5 = paddingValues42222;
                        final boolean z19 = z132222;
                        final boolean z20 = z142222;
                        final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource5;
                        final TextFieldColors textFieldColors8 = textFieldColors62222;
                        final Shape shape6 = shape52222;
                        outlinedTextFieldDefaults.DecorationBox(str, innerTextField, z16, z17, visualTransformation4, mutableInteractionSource8, z18, function218, function219, function220, function221, null, null, null, textFieldColors7, paddingValues5, ComposableLambdaKt.rememberComposableLambda(888607277, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i45) {
                                if ((i45 & 11) != 2 || !composer4.getSkipping()) {
                                    float f2 = 1;
                                    OutlinedTextFieldDefaults.INSTANCE.m3438Container4EFweAY(z19, z20, mutableInteractionSource9, null, textFieldColors8, shape6, Dp.m8798constructorimpl(f2), Dp.m8798constructorimpl(f2), composer4, 114819072, 8);
                                } else {
                                    composer4.skipToGroupEnd();
                                }
                            }
                        }, composer3, 54), composer3, (i44 << 3) & 112, 14155776, 14336);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, (i33 & 64638) | (i412222 & 3670016) | (i412222 & 29360128) | (234881024 & i412222) | (i412222 & 1879048192), ((i34 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i34 & 112) | ((i34 >> 12) & 7168), 4096);
            composer2 = startRestartGroup;
            z9 = z5;
            z10 = z6;
            textStyle4 = textStyle2;
            function211 = function25;
            z11 = z7;
            visualTransformation2 = none;
            function212 = function2162222;
            keyboardOptions3 = keyboardOptions2;
            i35 = i32;
            z12 = z8;
            shape4 = shape52222;
            mutableInteractionSource6 = mutableInteractionSource72222;
            modifier4 = modifier2;
            keyboardActions3 = keyboardActions2;
            paddingValues3 = paddingValues2;
            textFieldColors5 = textFieldColors62222;
            i36 = i31;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        z5 = z;
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        if ((i3 & Opcodes.ASM7) == 0) {
        }
        i10 = i6 & 64;
        if (i10 != 0) {
        }
        i11 = i6 & 128;
        if (i11 != 0) {
        }
        i12 = i6 & 256;
        if (i12 != 0) {
        }
        i13 = i12;
        i14 = i6 & 512;
        if (i14 == 0) {
        }
        i15 = i14;
        i16 = i6 & 1024;
        if (i16 != 0) {
        }
        i19 = i6 & 2048;
        if (i19 != 0) {
        }
        int i382222 = i18;
        i21 = i6 & 4096;
        if (i21 != 0) {
        }
        i23 = i6 & 8192;
        if (i23 != 0) {
        }
        i25 = i6 & 16384;
        if (i25 != 0) {
        }
        i26 = i24;
        if ((i4 & Opcodes.ASM7) == 0) {
        }
        i27 = i6 & 65536;
        if (i27 == 0) {
        }
        i28 = i6 & 131072;
        if (i28 == 0) {
        }
        if ((i4 & 234881024) == 0) {
        }
        if ((i4 & 1879048192) == 0) {
        }
        i29 = i6 & 1048576;
        if (i29 == 0) {
        }
        if ((i7 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i37 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i6 & 32) != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 == 0) {
        }
        if (i15 == 0) {
        }
        if (i17 == 0) {
        }
        if (i20 == 0) {
        }
        if (i21 == 0) {
        }
        if (i23 == 0) {
        }
        if (i25 == 0) {
        }
        if ((i6 & 32768) == 0) {
        }
        if (i27 == 0) {
        }
        if (i28 == 0) {
        }
        if ((262144 & i6) == 0) {
        }
        if ((i6 & 524288) == 0) {
        }
        if (i29 == 0) {
        }
        shape3 = shape2;
        textFieldColors4 = textFieldColors3;
        startRestartGroup.endDefaults();
        m8262getColor0d7_KjU = textStyle2.m8262getColor0d7_KjU();
        if (m8262getColor0d7_KjU == 16) {
        }
        final Function2<? super Composer, ? super Integer, Unit> function21422222 = function29;
        TextStyle merge22222 = textStyle2.merge(new TextStyle(m8262getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
        if (function25 == null) {
        }
        final Shape shape522222 = shape3;
        final boolean z1322222 = z5;
        final Function2<? super Composer, ? super Integer, Unit> function21522222 = function26;
        final Function2<? super Composer, ? super Integer, Unit> function21622222 = function27;
        final Function2<? super Composer, ? super Integer, Unit> function21722222 = function25;
        final boolean z1422222 = z7;
        final VisualTransformation visualTransformation322222 = none;
        final TextFieldColors textFieldColors622222 = textFieldColors4;
        final PaddingValues paddingValues422222 = paddingValues2;
        final boolean z1522222 = z8;
        MutableInteractionSource mutableInteractionSource722222 = mutableInteractionSource5;
        function210 = function21422222;
        int i4122222 = i34 << 12;
        BasicTextFieldKt.BasicTextField(value, onValueChange, SizeKt.m1193defaultMinSizeVpY3zN4(BackgroundKt.m581backgroundbw27NRU(modifier3, !z5 ? textFieldColors4.getUnfocusedContainerColor() : textFieldColors4.getDisabledContainerColor(), shape3), TextFieldDefaults.INSTANCE.m3878getMinWidthD9Ej5fM(), Dp.m8798constructorimpl(40)), z5, z6, textStyle3, keyboardOptions2, keyboardActions2, z8, i31, i32, none, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource722222, new SolidColor(!z7 ? textFieldColors4.getErrorCursorColor() : textFieldColors4.getCursorColor(), null), ComposableLambdaKt.rememberComposableLambda(491720992, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function218, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function218, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i42) {
                int i43;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                if ((i42 & 14) == 0) {
                    i43 = i42 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                } else {
                    i43 = i42;
                }
                if ((i43 & 91) != 18 || !composer3.getSkipping()) {
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                    int i44 = i43;
                    String str = value;
                    boolean z16 = z1322222;
                    boolean z17 = z1522222;
                    VisualTransformation visualTransformation4 = visualTransformation322222;
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource5;
                    boolean z18 = z1422222;
                    Function2<Composer, Integer, Unit> function218 = function21722222;
                    Function2<Composer, Integer, Unit> function219 = function21522222;
                    Function2<Composer, Integer, Unit> function220 = function21422222;
                    Function2<Composer, Integer, Unit> function221 = function21622222;
                    TextFieldColors textFieldColors7 = textFieldColors622222;
                    PaddingValues paddingValues5 = paddingValues422222;
                    final boolean z19 = z1322222;
                    final boolean z20 = z1422222;
                    final MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource5;
                    final TextFieldColors textFieldColors8 = textFieldColors622222;
                    final Shape shape6 = shape522222;
                    outlinedTextFieldDefaults.DecorationBox(str, innerTextField, z16, z17, visualTransformation4, mutableInteractionSource8, z18, function218, function219, function220, function221, null, null, null, textFieldColors7, paddingValues5, ComposableLambdaKt.rememberComposableLambda(888607277, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt$IntercomOutlinedTextField$3.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i45) {
                            if ((i45 & 11) != 2 || !composer4.getSkipping()) {
                                float f2 = 1;
                                OutlinedTextFieldDefaults.INSTANCE.m3438Container4EFweAY(z19, z20, mutableInteractionSource9, null, textFieldColors8, shape6, Dp.m8798constructorimpl(f2), Dp.m8798constructorimpl(f2), composer4, 114819072, 8);
                            } else {
                                composer4.skipToGroupEnd();
                            }
                        }
                    }, composer3, 54), composer3, (i44 << 3) & 112, 14155776, 14336);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, (i33 & 64638) | (i4122222 & 3670016) | (i4122222 & 29360128) | (234881024 & i4122222) | (i4122222 & 1879048192), ((i34 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i34 & 112) | ((i34 >> 12) & 7168), 4096);
        composer2 = startRestartGroup;
        z9 = z5;
        z10 = z6;
        textStyle4 = textStyle2;
        function211 = function25;
        z11 = z7;
        visualTransformation2 = none;
        function212 = function21622222;
        keyboardOptions3 = keyboardOptions2;
        i35 = i32;
        z12 = z8;
        shape4 = shape522222;
        mutableInteractionSource6 = mutableInteractionSource722222;
        modifier4 = modifier2;
        keyboardActions3 = keyboardActions2;
        paddingValues3 = paddingValues2;
        textFieldColors5 = textFieldColors622222;
        i36 = i31;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomOutlinedTextField$lambda$2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }
}
