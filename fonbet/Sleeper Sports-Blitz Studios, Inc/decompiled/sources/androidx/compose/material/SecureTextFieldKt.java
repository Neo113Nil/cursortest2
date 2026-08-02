package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicSecureTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.messaging.Constants;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SecureTextField.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001añ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b!\u0010\"\u001añ\u0001\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b$\u0010\"\"\u000e\u0010%\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0016X\u0082T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"SecureTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textObfuscationMode", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationCharacter", "", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "shape", "Landroidx/compose/ui/graphics/Shape;", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "SecureTextField-0vce7ms", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/text/input/InputTransformation;ICLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "OutlinedSecureTextField", "OutlinedSecureTextField-0vce7ms", "SecureTextFieldKeyboardOptions", "DefaultObfuscationCharacter", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final KeyboardOptions SecureTextFieldKeyboardOptions = new KeyboardOptions(0, (Boolean) false, KeyboardType.INSTANCE.m8473getPasswordPjHm6EE(), 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 121, (DefaultConstructorMarker) null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedSecureTextField_0vce7ms$lambda$8(TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        m2450OutlinedSecureTextField0vce7ms(textFieldState, modifier, z, textStyle, function2, function22, function23, function24, z2, inputTransformation, i, c, keyboardOptions, keyboardActionHandler, shape, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecureTextField_0vce7ms$lambda$2(TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        m2451SecureTextField0vce7ms(textFieldState, modifier, z, textStyle, function2, function22, function23, function24, z2, inputTransformation, i, c, keyboardOptions, keyboardActionHandler, shape, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024d  */
    /* renamed from: SecureTextField-0vce7ms, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2451SecureTextField0vce7ms(final TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i11;
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
        Composer composer2;
        final TextStyle textStyle2;
        int i23;
        final char c2;
        final KeyboardOptions keyboardOptions2;
        TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final boolean z4;
        final boolean z5;
        final InputTransformation inputTransformation2;
        final KeyboardActionHandler keyboardActionHandler2;
        final Shape shape2;
        ScopeUpdateScope endRestartGroup;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        boolean z6;
        int i24;
        KeyboardOptions keyboardOptions3;
        KeyboardActionHandler keyboardActionHandler3;
        Shape shape3;
        Composer composer3;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColors3;
        int i25;
        MutableInteractionSource mutableInteractionSource4;
        int i26;
        boolean z7;
        TextStyle textStyle4;
        InputTransformation inputTransformation3;
        char c3;
        MutableInteractionSource mutableInteractionSource5;
        int i27;
        int i28;
        Composer startRestartGroup = composer.startRestartGroup(-308805078);
        ComposerKt.sourceInformation(startRestartGroup, "C(SecureTextField)N(state,modifier,enabled,textStyle,label,placeholder,leadingIcon,trailingIcon,isError,inputTransformation,textObfuscationMode:c#foundation.text.input.TextObfuscationMode,textObfuscationCharacter,keyboardOptions,onKeyboardAction,shape,colors,interactionSource)133@7665L38,140@7981L20,128@7456L1524:SecureTextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i29 = i4 & 2;
        if (i29 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                z3 = z;
                i5 |= startRestartGroup.changed(z3) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    if ((i4 & 8) == 0 && startRestartGroup.changed(textStyle)) {
                        i28 = 2048;
                        i5 |= i28;
                    }
                    i28 = 1024;
                    i5 |= i28;
                }
                i7 = i4 & 16;
                int i30 = 8192;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function25 = function2;
                    i5 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changedInstance(function26) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        function27 = function23;
                    } else {
                        function27 = function23;
                        if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(function27) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                        function28 = function24;
                    } else {
                        function28 = function24;
                        if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
                        }
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i12 = i11;
                        i5 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i14 = i13;
                            i5 |= startRestartGroup.changed(inputTransformation) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            if ((i3 & 6) != 0) {
                                if ((i4 & 1024) == 0 && startRestartGroup.changed(i)) {
                                    i27 = 4;
                                    i15 = i3 | i27;
                                }
                                i27 = 2;
                                i15 = i3 | i27;
                            } else {
                                i15 = i3;
                            }
                            i16 = i4 & 2048;
                            if (i16 == 0) {
                                i15 |= 48;
                                i17 = i16;
                            } else if ((i3 & 48) == 0) {
                                i17 = i16;
                                i15 |= startRestartGroup.changed(c) ? 32 : 16;
                            } else {
                                i17 = i16;
                            }
                            int i31 = i15;
                            i18 = i4 & 4096;
                            if (i18 == 0) {
                                i19 = i31 | 384;
                            } else {
                                int i32 = i31;
                                if ((i3 & 384) == 0) {
                                    i32 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                }
                                i19 = i32;
                            }
                            i20 = i4 & 8192;
                            if (i20 == 0) {
                                i21 = i19 | 3072;
                            } else {
                                int i33 = i19;
                                if ((i3 & 3072) == 0) {
                                    i21 = i33 | (startRestartGroup.changed(keyboardActionHandler) ? 2048 : 1024);
                                } else {
                                    i21 = i33;
                                }
                            }
                            if ((i3 & 24576) == 0) {
                                if ((i4 & 16384) == 0 && startRestartGroup.changed(shape)) {
                                    i30 = 16384;
                                }
                                i21 |= i30;
                            }
                            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i21 |= ((i4 & 32768) == 0 && startRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
                            }
                            i22 = i4 & 65536;
                            if (i22 == 0) {
                                i21 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i21 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                            }
                            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "107@6345L7,118@6948L14,119@7012L17");
                                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 8) != 0) {
                                        i5 &= -7169;
                                    }
                                    if ((i4 & 1024) != 0) {
                                        i21 &= -15;
                                    }
                                    if ((i4 & 16384) != 0) {
                                        i21 &= -57345;
                                    }
                                    if ((i4 & 32768) != 0) {
                                        i21 &= -458753;
                                    }
                                    composer3 = startRestartGroup;
                                    textStyle4 = textStyle;
                                    z6 = z2;
                                    inputTransformation3 = inputTransformation;
                                    c3 = c;
                                    keyboardOptions3 = keyboardOptions;
                                    keyboardActionHandler3 = keyboardActionHandler;
                                    shape3 = shape;
                                    textFieldColors3 = textFieldColors;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    function213 = function25;
                                    function214 = function28;
                                    z7 = z3;
                                    i26 = i21;
                                    i23 = i;
                                } else {
                                    Modifier.Companion companion = i29 != 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z8 = i6 != 0 ? true : z3;
                                    if ((i4 & 8) != 0) {
                                        ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localTextStyle);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        i5 &= -7169;
                                        textStyle3 = (TextStyle) consume;
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    int i34 = i5;
                                    function213 = i7 != 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function215 = i8 != 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function216 = i9 != 0 ? null : function27;
                                    function214 = i10 != 0 ? null : function28;
                                    z6 = i12 != 0 ? false : z2;
                                    InputTransformation inputTransformation4 = i14 != 0 ? null : inputTransformation;
                                    if ((i4 & 1024) != 0) {
                                        i21 &= -15;
                                        i24 = TextObfuscationMode.INSTANCE.m1785getRevealLastTypedvTwcZD0();
                                    } else {
                                        i24 = i;
                                    }
                                    char c4 = i17 != 0 ? (char) 8226 : c;
                                    keyboardOptions3 = i18 != 0 ? SecureTextFieldKeyboardOptions : keyboardOptions;
                                    keyboardActionHandler3 = i20 != 0 ? null : keyboardActionHandler;
                                    if ((i4 & 16384) != 0) {
                                        i21 &= -57345;
                                        shape3 = TextFieldDefaults.INSTANCE.getTextFieldShape(startRestartGroup, 6);
                                    } else {
                                        shape3 = shape;
                                    }
                                    int i35 = i21;
                                    if ((i4 & 32768) != 0) {
                                        mutableInteractionSource3 = null;
                                        textFieldColors3 = TextFieldDefaults.INSTANCE.m2539textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                        composer3 = startRestartGroup;
                                        i25 = i35 & (-458753);
                                    } else {
                                        composer3 = startRestartGroup;
                                        mutableInteractionSource3 = null;
                                        textFieldColors3 = textFieldColors;
                                        i25 = i35;
                                    }
                                    if (i22 != 0) {
                                        modifier2 = companion;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                    } else {
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        modifier2 = companion;
                                    }
                                    i26 = i25;
                                    z7 = z8;
                                    textStyle4 = textStyle3;
                                    i5 = i34;
                                    function26 = function215;
                                    function27 = function216;
                                    inputTransformation3 = inputTransformation4;
                                    i23 = i24;
                                    c3 = c4;
                                }
                                composer3.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-308805078, i5, i26, "androidx.compose.material.SecureTextField (SecureTextField.kt:121)");
                                }
                                if (mutableInteractionSource4 == null) {
                                    composer3.startReplaceGroup(208856593);
                                    ComposerKt.sourceInformation(composer3, "123@7173L39");
                                    ComposerKt.sourceInformationMarkerStart(composer3, -408904687, "CC(remember):SecureTextField.kt#9igjgp");
                                    Object rememberedValue = composer3.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composer3.updateRememberedValue(rememberedValue);
                                    }
                                    mutableInteractionSource5 = (MutableInteractionSource) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-408905338);
                                    composer3.endReplaceGroup();
                                    mutableInteractionSource5 = mutableInteractionSource4;
                                }
                                composer3.startReplaceGroup(-408899592);
                                ComposerKt.sourceInformation(composer3, "*125@7352L18");
                                long m8262getColor0d7_KjU = textStyle4.m8262getColor0d7_KjU();
                                if (m8262getColor0d7_KjU == 16) {
                                    m8262getColor0d7_KjU = textFieldColors3.textColor(z7, composer3, ((i5 >> 6) & 14) | ((i26 >> 12) & 112)).getValue().m6049unboximpl();
                                }
                                composer3.endReplaceGroup();
                                TextStyle merge = textStyle4.merge(new TextStyle(m8262getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                TextFieldColors textFieldColors4 = textFieldColors3;
                                boolean z9 = z7;
                                Modifier modifier3 = modifier2;
                                boolean z10 = z6;
                                TextStyle textStyle5 = textStyle4;
                                Function2<? super Composer, ? super Integer, Unit> function217 = function26;
                                Function2<? super Composer, ? super Integer, Unit> function218 = function27;
                                textFieldColors2 = textFieldColors4;
                                int i36 = i26 << 12;
                                Composer composer4 = composer3;
                                KeyboardOptions keyboardOptions4 = keyboardOptions3;
                                KeyboardActionHandler keyboardActionHandler4 = keyboardActionHandler3;
                                BasicSecureTextFieldKt.m1532BasicSecureTextFieldegD4TGM(textFieldState, SizeKt.m1193defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(TextFieldDefaults.m2527indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, modifier3, z9, z10, mutableInteractionSource5, textFieldColors4, 0.0f, 0.0f, 48, null), z10, Strings_androidKt.m2487getString4foXLRw(Strings.INSTANCE.m2481getDefaultErrorMessageUdPEhr4(), composer3, 6)), TextFieldDefaults.INSTANCE.m2534getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2533getMinHeightD9Ej5fM()), z9, false, inputTransformation3, merge, keyboardOptions4, keyboardActionHandler4, null, mutableInteractionSource5, new SolidColor(textFieldColors4.cursorColor(z10, composer3, ((i5 >> 24) & 14) | ((i26 >> 12) & 112)).getValue().m6049unboximpl(), null), new SecureTextFieldKt$SecureTextField$1(textFieldState, z9, mutableInteractionSource5, z10, function213, function217, function218, function214, shape3, textFieldColors4), i23, c3, composer4, (i5 & 910) | ((i5 >> 15) & 57344) | (3670016 & i36) | (i36 & 29360128), (i26 << 6) & 8064, 264);
                                composer2 = composer4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textStyle2 = textStyle5;
                                keyboardOptions2 = keyboardOptions4;
                                keyboardActionHandler2 = keyboardActionHandler4;
                                z4 = z9;
                                c2 = c3;
                                mutableInteractionSource2 = mutableInteractionSource4;
                                modifier2 = modifier3;
                                function29 = function213;
                                function210 = function217;
                                function211 = function218;
                                z5 = z10;
                                shape2 = shape3;
                                inputTransformation2 = inputTransformation3;
                                function212 = function214;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                textStyle2 = textStyle;
                                i23 = i;
                                c2 = c;
                                keyboardOptions2 = keyboardOptions;
                                textFieldColors2 = textFieldColors;
                                mutableInteractionSource2 = mutableInteractionSource;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                function212 = function28;
                                z4 = z3;
                                z5 = z2;
                                inputTransformation2 = inputTransformation;
                                keyboardActionHandler2 = keyboardActionHandler;
                                shape2 = shape;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier4 = modifier2;
                                final int i37 = i23;
                                final TextFieldColors textFieldColors5 = textFieldColors2;
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SecureTextFieldKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit SecureTextField_0vce7ms$lambda$2;
                                        SecureTextField_0vce7ms$lambda$2 = SecureTextFieldKt.SecureTextField_0vce7ms$lambda$2(TextFieldState.this, modifier4, z4, textStyle2, function29, function210, function211, function212, z5, inputTransformation2, i37, c2, keyboardOptions2, keyboardActionHandler2, shape2, textFieldColors5, mutableInteractionSource2, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        return SecureTextField_0vce7ms$lambda$2;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 = i13;
                        if ((i3 & 6) != 0) {
                        }
                        i16 = i4 & 2048;
                        if (i16 == 0) {
                        }
                        int i312 = i15;
                        i18 = i4 & 4096;
                        if (i18 == 0) {
                        }
                        i20 = i4 & 8192;
                        if (i20 == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        i22 = i4 & 65536;
                        if (i22 == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if ((i3 & 6) != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                    }
                    int i3122 = i15;
                    i18 = i4 & 4096;
                    if (i18 == 0) {
                    }
                    i20 = i4 & 8192;
                    if (i20 == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i22 = i4 & 65536;
                    if (i22 == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function25 = function2;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                if ((i3 & 6) != 0) {
                }
                i16 = i4 & 2048;
                if (i16 == 0) {
                }
                int i31222 = i15;
                i18 = i4 & 4096;
                if (i18 == 0) {
                }
                i20 = i4 & 8192;
                if (i20 == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i22 = i4 & 65536;
                if (i22 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i2 & 3072) == 0) {
            }
            i7 = i4 & 16;
            int i302 = 8192;
            if (i7 != 0) {
            }
            function25 = function2;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i3 & 6) != 0) {
            }
            i16 = i4 & 2048;
            if (i16 == 0) {
            }
            int i312222 = i15;
            i18 = i4 & 4096;
            if (i18 == 0) {
            }
            i20 = i4 & 8192;
            if (i20 == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i22 = i4 & 65536;
            if (i22 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        z3 = z;
        if ((i2 & 3072) == 0) {
        }
        i7 = i4 & 16;
        int i3022 = 8192;
        if (i7 != 0) {
        }
        function25 = function2;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i3 & 6) != 0) {
        }
        i16 = i4 & 2048;
        if (i16 == 0) {
        }
        int i3122222 = i15;
        i18 = i4 & 4096;
        if (i18 == 0) {
        }
        i20 = i4 & 8192;
        if (i20 == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i22 = i4 & 65536;
        if (i22 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024a  */
    /* renamed from: OutlinedSecureTextField-0vce7ms, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2450OutlinedSecureTextField0vce7ms(final TextFieldState textFieldState, Modifier modifier, boolean z, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z2, InputTransformation inputTransformation, int i, char c, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function28;
        int i11;
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
        Composer composer2;
        final TextStyle textStyle2;
        final char c2;
        final KeyboardOptions keyboardOptions2;
        final TextFieldColors textFieldColors2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final boolean z4;
        final boolean z5;
        final InputTransformation inputTransformation2;
        final int i23;
        final KeyboardActionHandler keyboardActionHandler2;
        final Shape shape2;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        int i24;
        KeyboardOptions keyboardOptions3;
        Shape shape3;
        Composer composer3;
        TextFieldColors textFieldColors3;
        int i25;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColors4;
        int i26;
        boolean z6;
        TextStyle textStyle4;
        int i27;
        boolean z7;
        InputTransformation inputTransformation3;
        int i28;
        char c3;
        KeyboardActionHandler keyboardActionHandler3;
        MutableInteractionSource mutableInteractionSource4;
        TextStyle textStyle5;
        Modifier.Companion companion2;
        int i29;
        int i30;
        Composer startRestartGroup = composer.startRestartGroup(-1856037588);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedSecureTextField)N(state,modifier,enabled,textStyle,label,placeholder,leadingIcon,trailingIcon,isError,inputTransformation,textObfuscationMode:c#foundation.text.input.TextObfuscationMode,textObfuscationCharacter,keyboardOptions,onKeyboardAction,shape,colors,interactionSource)250@14549L7,267@15231L38,274@15547L20,252@14562L2138:SecureTextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(textFieldState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i31 = i4 & 2;
        if (i31 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                z3 = z;
                i5 |= startRestartGroup.changed(z3) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    if ((i4 & 8) == 0 && startRestartGroup.changed(textStyle)) {
                        i30 = 2048;
                        i5 |= i30;
                    }
                    i30 = 1024;
                    i5 |= i30;
                }
                i7 = i4 & 16;
                int i32 = 8192;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function25 = function2;
                    i5 |= startRestartGroup.changedInstance(function25) ? 16384 : 8192;
                    i8 = i4 & 32;
                    if (i8 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changedInstance(function26) ? 131072 : 65536;
                        }
                    }
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        function27 = function23;
                    } else {
                        function27 = function23;
                        if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(function27) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i5 |= 12582912;
                        function28 = function24;
                    } else {
                        function28 = function24;
                        if ((i2 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(function28) ? 8388608 : 4194304;
                        }
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i12 = i11;
                        i5 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i5 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i14 = i13;
                            i5 |= startRestartGroup.changed(inputTransformation) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            if ((i3 & 6) != 0) {
                                if ((i4 & 1024) == 0 && startRestartGroup.changed(i)) {
                                    i29 = 4;
                                    i15 = i3 | i29;
                                }
                                i29 = 2;
                                i15 = i3 | i29;
                            } else {
                                i15 = i3;
                            }
                            i16 = i4 & 2048;
                            if (i16 == 0) {
                                i15 |= 48;
                                i17 = i16;
                            } else if ((i3 & 48) == 0) {
                                i17 = i16;
                                i15 |= startRestartGroup.changed(c) ? 32 : 16;
                            } else {
                                i17 = i16;
                            }
                            int i33 = i15;
                            i18 = i4 & 4096;
                            if (i18 == 0) {
                                i19 = i33 | 384;
                            } else {
                                int i34 = i33;
                                if ((i3 & 384) == 0) {
                                    i34 |= startRestartGroup.changed(keyboardOptions) ? 256 : 128;
                                }
                                i19 = i34;
                            }
                            i20 = i4 & 8192;
                            if (i20 == 0) {
                                i21 = i19 | 3072;
                            } else {
                                int i35 = i19;
                                if ((i3 & 3072) == 0) {
                                    i21 = i35 | (startRestartGroup.changed(keyboardActionHandler) ? 2048 : 1024);
                                } else {
                                    i21 = i35;
                                }
                            }
                            if ((i3 & 24576) == 0) {
                                if ((i4 & 16384) == 0 && startRestartGroup.changed(shape)) {
                                    i32 = 16384;
                                }
                                i21 |= i32;
                            }
                            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i21 |= ((i4 & 32768) == 0 && startRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
                            }
                            i22 = i4 & 65536;
                            if (i22 == 0) {
                                i21 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i21 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                            }
                            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "229@13395L7,240@13998L22,241@14070L25");
                                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 8) != 0) {
                                        i5 &= -7169;
                                    }
                                    if ((i4 & 1024) != 0) {
                                        i21 &= -15;
                                    }
                                    if ((i4 & 16384) != 0) {
                                        i21 &= -57345;
                                    }
                                    if ((i4 & 32768) != 0) {
                                        i21 &= -458753;
                                    }
                                    textStyle4 = textStyle;
                                    inputTransformation3 = inputTransformation;
                                    c3 = c;
                                    keyboardOptions3 = keyboardOptions;
                                    shape3 = shape;
                                    textFieldColors4 = textFieldColors;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    composer3 = startRestartGroup;
                                    function213 = function25;
                                    i27 = i5;
                                    companion = modifier2;
                                    function214 = function28;
                                    z6 = z3;
                                    i26 = i21;
                                    z7 = z2;
                                    i28 = i;
                                    keyboardActionHandler3 = keyboardActionHandler;
                                } else {
                                    companion = i31 != 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z8 = i6 != 0 ? true : z3;
                                    if ((i4 & 8) != 0) {
                                        ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localTextStyle);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        i5 &= -7169;
                                        textStyle3 = (TextStyle) consume;
                                    } else {
                                        textStyle3 = textStyle;
                                    }
                                    int i36 = i5;
                                    function213 = i7 != 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function215 = i8 != 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function216 = i9 != 0 ? null : function27;
                                    function214 = i10 != 0 ? null : function28;
                                    boolean z9 = i12 != 0 ? false : z2;
                                    InputTransformation inputTransformation4 = i14 != 0 ? null : inputTransformation;
                                    if ((i4 & 1024) != 0) {
                                        i21 &= -15;
                                        i24 = TextObfuscationMode.INSTANCE.m1785getRevealLastTypedvTwcZD0();
                                    } else {
                                        i24 = i;
                                    }
                                    char c4 = i17 != 0 ? (char) 8226 : c;
                                    keyboardOptions3 = i18 != 0 ? SecureTextFieldKeyboardOptions : keyboardOptions;
                                    KeyboardActionHandler keyboardActionHandler4 = i20 != 0 ? null : keyboardActionHandler;
                                    if ((i4 & 16384) != 0) {
                                        i21 &= -57345;
                                        shape3 = TextFieldDefaults.INSTANCE.getOutlinedTextFieldShape(startRestartGroup, 6);
                                    } else {
                                        shape3 = shape;
                                    }
                                    int i37 = i21;
                                    if ((i4 & 32768) != 0) {
                                        textFieldColors3 = TextFieldDefaults.INSTANCE.m2537outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                        composer3 = startRestartGroup;
                                        i25 = i37 & (-458753);
                                    } else {
                                        composer3 = startRestartGroup;
                                        textFieldColors3 = textFieldColors;
                                        i25 = i37;
                                    }
                                    if (i22 != 0) {
                                        textFieldColors4 = textFieldColors3;
                                        i26 = i25;
                                        z6 = z8;
                                        textStyle4 = textStyle3;
                                        i27 = i36;
                                        function26 = function215;
                                        function27 = function216;
                                        z7 = z9;
                                        inputTransformation3 = inputTransformation4;
                                        i28 = i24;
                                        c3 = c4;
                                        keyboardActionHandler3 = keyboardActionHandler4;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        textFieldColors4 = textFieldColors3;
                                        i26 = i25;
                                        z6 = z8;
                                        textStyle4 = textStyle3;
                                        i27 = i36;
                                        function26 = function215;
                                        function27 = function216;
                                        z7 = z9;
                                        inputTransformation3 = inputTransformation4;
                                        i28 = i24;
                                        c3 = c4;
                                        keyboardActionHandler3 = keyboardActionHandler4;
                                    }
                                }
                                composer3.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1856037588, i27, i26, "androidx.compose.material.OutlinedSecureTextField (SecureTextField.kt:243)");
                                }
                                if (mutableInteractionSource3 == null) {
                                    composer3.startReplaceGroup(194195663);
                                    ComposerKt.sourceInformation(composer3, "245@14239L39");
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1240661613, "CC(remember):SecureTextField.kt#9igjgp");
                                    Object rememberedValue = composer3.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composer3.updateRememberedValue(rememberedValue);
                                    }
                                    mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-1240662264);
                                    composer3.endReplaceGroup();
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                composer3.startReplaceGroup(-1240656518);
                                ComposerKt.sourceInformation(composer3, "*247@14418L18");
                                long m8262getColor0d7_KjU = textStyle4.m8262getColor0d7_KjU();
                                if (m8262getColor0d7_KjU == 16) {
                                    m8262getColor0d7_KjU = textFieldColors4.textColor(z6, composer3, ((i27 >> 6) & 14) | ((i26 >> 12) & 112)).getValue().m6049unboximpl();
                                }
                                composer3.endReplaceGroup();
                                TextStyle merge = textStyle4.merge(new TextStyle(m8262getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume2;
                                if (function213 != null) {
                                    composer3.startReplaceGroup(194672877);
                                    ComposerKt.sourceInformation(composer3, "261@14981L2");
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    textStyle5 = textStyle4;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1240637906, "CC(remember):SecureTextField.kt#9igjgp");
                                    Object rememberedValue2 = composer3.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new Function1() { // from class: androidx.compose.material.SecureTextFieldKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                Unit OutlinedSecureTextField_0vce7ms$lambda$6$lambda$5;
                                                OutlinedSecureTextField_0vce7ms$lambda$6$lambda$5 = SecureTextFieldKt.OutlinedSecureTextField_0vce7ms$lambda$6$lambda$5((SemanticsPropertyReceiver) obj);
                                                return OutlinedSecureTextField_0vce7ms$lambda$6$lambda$5;
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    companion2 = PaddingKt.m1161paddingqDBjuR0$default(SemanticsModifierKt.semantics(companion3, true, (Function1) rememberedValue2), 0.0f, density.mo739toDpGaN1DYA(OutlinedTextFieldKt.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
                                    composer3.endReplaceGroup();
                                } else {
                                    textStyle5 = textStyle4;
                                    composer3.startReplaceGroup(195058238);
                                    composer3.endReplaceGroup();
                                    companion2 = Modifier.INSTANCE;
                                }
                                Modifier modifier4 = companion;
                                boolean z10 = z7;
                                Function2<? super Composer, ? super Integer, Unit> function217 = function26;
                                Function2<? super Composer, ? super Integer, Unit> function218 = function27;
                                TextFieldColors textFieldColors5 = textFieldColors4;
                                int i38 = i26 << 12;
                                TextStyle textStyle6 = textStyle5;
                                Composer composer4 = composer3;
                                KeyboardOptions keyboardOptions4 = keyboardOptions3;
                                BasicSecureTextFieldKt.m1532BasicSecureTextFieldegD4TGM(textFieldState, SizeKt.m1193defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(companion.then(companion2), z7, Strings_androidKt.m2487getString4foXLRw(Strings.INSTANCE.m2481getDefaultErrorMessageUdPEhr4(), composer3, 6)), TextFieldDefaults.INSTANCE.m2534getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2533getMinHeightD9Ej5fM()), z6, false, inputTransformation3, merge, keyboardOptions4, keyboardActionHandler3, null, mutableInteractionSource5, new SolidColor(textFieldColors4.cursorColor(z7, composer3, ((i27 >> 24) & 14) | ((i26 >> 12) & 112)).getValue().m6049unboximpl(), null), new SecureTextFieldKt$OutlinedSecureTextField$3(textFieldState, z6, mutableInteractionSource5, z10, function213, function217, function218, function214, shape3, textFieldColors5), i28, c3, composer4, (i27 & 910) | ((i27 >> 15) & 57344) | (3670016 & i38) | (i38 & 29360128), (i26 << 6) & 8064, 264);
                                composer2 = composer4;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                keyboardOptions2 = keyboardOptions4;
                                keyboardActionHandler2 = keyboardActionHandler3;
                                i23 = i28;
                                c2 = c3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                modifier3 = modifier4;
                                textStyle2 = textStyle6;
                                function29 = function213;
                                function211 = function218;
                                z5 = z10;
                                shape2 = shape3;
                                textFieldColors2 = textFieldColors5;
                                z4 = z6;
                                inputTransformation2 = inputTransformation3;
                                function210 = function217;
                                function212 = function214;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                textStyle2 = textStyle;
                                c2 = c;
                                keyboardOptions2 = keyboardOptions;
                                textFieldColors2 = textFieldColors;
                                mutableInteractionSource2 = mutableInteractionSource;
                                function29 = function25;
                                function210 = function26;
                                function211 = function27;
                                modifier3 = modifier2;
                                function212 = function28;
                                z4 = z3;
                                z5 = z2;
                                inputTransformation2 = inputTransformation;
                                i23 = i;
                                keyboardActionHandler2 = keyboardActionHandler;
                                shape2 = shape;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SecureTextFieldKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit OutlinedSecureTextField_0vce7ms$lambda$8;
                                        OutlinedSecureTextField_0vce7ms$lambda$8 = SecureTextFieldKt.OutlinedSecureTextField_0vce7ms$lambda$8(TextFieldState.this, modifier3, z4, textStyle2, function29, function210, function211, function212, z5, inputTransformation2, i23, c2, keyboardOptions2, keyboardActionHandler2, shape2, textFieldColors2, mutableInteractionSource2, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        return OutlinedSecureTextField_0vce7ms$lambda$8;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 = i13;
                        if ((i3 & 6) != 0) {
                        }
                        i16 = i4 & 2048;
                        if (i16 == 0) {
                        }
                        int i332 = i15;
                        i18 = i4 & 4096;
                        if (i18 == 0) {
                        }
                        i20 = i4 & 8192;
                        if (i20 == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        i22 = i4 & 65536;
                        if (i22 == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    if ((i3 & 6) != 0) {
                    }
                    i16 = i4 & 2048;
                    if (i16 == 0) {
                    }
                    int i3322 = i15;
                    i18 = i4 & 4096;
                    if (i18 == 0) {
                    }
                    i20 = i4 & 8192;
                    if (i20 == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i22 = i4 & 65536;
                    if (i22 == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function25 = function2;
                i8 = i4 & 32;
                if (i8 == 0) {
                }
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                if ((i3 & 6) != 0) {
                }
                i16 = i4 & 2048;
                if (i16 == 0) {
                }
                int i33222 = i15;
                i18 = i4 & 4096;
                if (i18 == 0) {
                }
                i20 = i4 & 8192;
                if (i20 == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i22 = i4 & 65536;
                if (i22 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i2 & 3072) == 0) {
            }
            i7 = i4 & 16;
            int i322 = 8192;
            if (i7 != 0) {
            }
            function25 = function2;
            i8 = i4 & 32;
            if (i8 == 0) {
            }
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            if ((i3 & 6) != 0) {
            }
            i16 = i4 & 2048;
            if (i16 == 0) {
            }
            int i332222 = i15;
            i18 = i4 & 4096;
            if (i18 == 0) {
            }
            i20 = i4 & 8192;
            if (i20 == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i22 = i4 & 65536;
            if (i22 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        z3 = z;
        if ((i2 & 3072) == 0) {
        }
        i7 = i4 & 16;
        int i3222 = 8192;
        if (i7 != 0) {
        }
        function25 = function2;
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        if ((i3 & 6) != 0) {
        }
        i16 = i4 & 2048;
        if (i16 == 0) {
        }
        int i3322222 = i15;
        i18 = i4 & 4096;
        if (i18 == 0) {
        }
        i20 = i4 & 8192;
        if (i20 == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i22 = i4 & 65536;
        if (i22 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (i21 & 599187) != 599186, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OutlinedSecureTextField_0vce7ms$lambda$6$lambda$5(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.INSTANCE;
    }
}
