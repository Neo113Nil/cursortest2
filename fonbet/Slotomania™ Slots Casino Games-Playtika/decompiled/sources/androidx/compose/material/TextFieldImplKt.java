package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aß\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\f2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&2\u0006\u0010'\u001a\u00020(2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010*\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020 \u0018\u00010%¢\u0006\u0002\b&H\u0001¢\u0006\u0002\u00108\u001aW\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2 \u0010@\u001a\u001c\u0012\u0004\u0012\u00020 0%¢\u0006\u0002\b&¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\u001a\u0012\u0010E\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\u001a\u0012\u0010H\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0012\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0013\u0010\u0005\"\u000e\u0010\u0014\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0015\u001a\u00020\u0016X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"AnimationDuration", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material/TextFieldColors;", OutlinedTextFieldKt.BorderId, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "content", "Landroidx/compose/runtime/ComposableOpenTarget;", FirebaseAnalytics.Param.INDEX, "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String TextFieldId = "TextField";
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m4440constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m4440constructorimpl(12);

    /* JADX WARN: Removed duplicated region for block: B:103:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0403 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0392  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(final TextFieldType type, final String value, final Function2<? super Composer, ? super Integer, Unit> innerTextField, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z, boolean z2, boolean z3, final InteractionSource interactionSource, final PaddingValues contentPadding, final TextFieldColors colors, Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean changed;
        Object rememberedValue;
        InputPhase inputPhase;
        Function3<InputPhase, Composer, Integer, Color> function3;
        final boolean z4;
        long m3969getColor0d7_KjU;
        long m3969getColor0d7_KjU2;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final boolean z5;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-712568069);
        ComposerKt.sourceInformation(startRestartGroup, "C(CommonDecorationBox)P(12,13,4,14,7,9,8,11,10,3,6,5,2,1)80@3167L105,84@3322L25,101@3932L10,*113@4554L10,114@4648L22,108@4267L5060:TextFieldImpl.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(type) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(innerTextField) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            i4 |= startRestartGroup.changed(function2) ? 16384 : 8192;
        }
        int i15 = i3 & 32;
        if (i15 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function26 = function22;
        } else {
            function26 = function22;
            if ((i & 458752) == 0) {
                i4 |= startRestartGroup.changed(function26) ? 131072 : 65536;
            }
        }
        int i16 = i3 & 64;
        if (i16 != 0) {
            i4 |= 1572864;
            function27 = function23;
        } else {
            function27 = function23;
            if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changed(function27) ? 1048576 : 524288;
            }
        }
        int i17 = i3 & 128;
        if (i17 != 0) {
            i4 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i5 = i17;
            i4 |= startRestartGroup.changed(function24) ? 8388608 : 4194304;
            i6 = i3 & 256;
            if (i6 == 0) {
                i4 |= 100663296;
            } else if ((i & 234881024) == 0) {
                i7 = i6;
                i4 |= startRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i9 = i8;
                    i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 14) == 0) {
                        i11 = i10;
                        i12 = i2 | (startRestartGroup.changed(z3) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i12 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i12 |= startRestartGroup.changed(interactionSource) ? 32 : 16;
                    }
                    int i18 = i12;
                    if ((i3 & 4096) == 0) {
                        i18 |= RendererCapabilities.MODE_SUPPORT_MASK;
                    } else if ((i2 & 896) == 0) {
                        i18 |= startRestartGroup.changed(contentPadding) ? 256 : 128;
                    }
                    if ((i3 & 8192) == 0) {
                        i18 |= 3072;
                    } else if ((i2 & 7168) == 0) {
                        i18 |= startRestartGroup.changed(colors) ? 2048 : 1024;
                    }
                    i13 = i3 & 16384;
                    if (i13 == 0) {
                        i18 |= 24576;
                    } else if ((i2 & 57344) == 0) {
                        i14 = i18 | (startRestartGroup.changed(function25) ? 16384 : 8192);
                        if ((i4 & 1533916891) == 306783378 || (i14 & 46811) != 9362 || !startRestartGroup.getSkipping()) {
                            Function2<? super Composer, ? super Integer, Unit> function212 = i15 != 0 ? null : function26;
                            Function2<? super Composer, ? super Integer, Unit> function213 = i16 != 0 ? null : function27;
                            Function2<? super Composer, ? super Integer, Unit> function214 = i5 != 0 ? null : function24;
                            boolean z8 = i7 != 0 ? false : z;
                            boolean z9 = i9 != 0 ? true : z2;
                            boolean z10 = i11 != 0 ? false : z3;
                            final Function2<? super Composer, ? super Integer, Unit> function215 = i13 != 0 ? null : function25;
                            startRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            final String text = ((TransformedText) rememberedValue).getText().getText();
                            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i14 >> 3) & 14).getValue().booleanValue()) {
                                inputPhase = InputPhase.Focused;
                            } else {
                                inputPhase = text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                            }
                            final boolean z11 = z9;
                            final int i19 = i4;
                            final boolean z12 = z10;
                            final int i20 = i14;
                            function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase2, Composer composer3, Integer num) {
                                    return Color.m2102boximpl(m1580invokeXeAY9LY(inputPhase2, composer3, num.intValue()));
                                }

                                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                                public final long m1580invokeXeAY9LY(InputPhase it, Composer composer3, int i21) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    composer3.startReplaceableGroup(697243846);
                                    ComposerKt.sourceInformation(composer3, "C92@3610L273:TextFieldImpl.kt#jmzs0o");
                                    TextFieldColors textFieldColors = TextFieldColors.this;
                                    boolean z13 = z11;
                                    boolean z14 = it == InputPhase.UnfocusedEmpty ? false : z12;
                                    InteractionSource interactionSource2 = interactionSource;
                                    int i22 = (i19 >> 27) & 14;
                                    int i23 = i20;
                                    long m2122unboximpl = textFieldColors.labelColor(z13, z14, interactionSource2, composer3, i22 | ((i23 << 3) & 896) | (i23 & 7168)).getValue().m2122unboximpl();
                                    composer3.endReplaceableGroup();
                                    return m2122unboximpl;
                                }
                            };
                            Typography typography = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                            TextStyle subtitle1 = typography.getSubtitle1();
                            TextStyle caption = typography.getCaption();
                            z4 = !(Color.m2113equalsimpl0(subtitle1.m3969getColor0d7_KjU(), Color.INSTANCE.m2148getUnspecified0d7_KjU()) || Color.m2113equalsimpl0(caption.m3969getColor0d7_KjU(), Color.INSTANCE.m2148getUnspecified0d7_KjU())) || (!Color.m2113equalsimpl0(subtitle1.m3969getColor0d7_KjU(), Color.INSTANCE.m2148getUnspecified0d7_KjU()) && Color.m2113equalsimpl0(caption.m3969getColor0d7_KjU(), Color.INSTANCE.m2148getUnspecified0d7_KjU()));
                            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
                            startRestartGroup.startReplaceableGroup(2129141006);
                            ComposerKt.sourceInformation(startRestartGroup, "*110@4363L10,111@4455L22");
                            m3969getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getCaption().m3969getColor0d7_KjU();
                            if (z4 && m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                                m3969getColor0d7_KjU = function3.invoke(inputPhase, startRestartGroup, 0).m2122unboximpl();
                            }
                            long j = m3969getColor0d7_KjU;
                            startRestartGroup.endReplaceableGroup();
                            m3969getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1().m3969getColor0d7_KjU();
                            if (z4 && m3969getColor0d7_KjU2 == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                                m3969getColor0d7_KjU2 = function3.invoke(inputPhase, startRestartGroup, 0).m2122unboximpl();
                            }
                            long j2 = m3969getColor0d7_KjU2;
                            final Function2<? super Composer, ? super Integer, Unit> function216 = function213;
                            final Function2<? super Composer, ? super Integer, Unit> function217 = function214;
                            final boolean z13 = z8;
                            InputPhase inputPhase2 = inputPhase;
                            final Function2<? super Composer, ? super Integer, Unit> function218 = function212;
                            composer2 = startRestartGroup;
                            textFieldTransitionScope.m1589TransitionDTcfvLk(inputPhase2, j, j2, function3, function2 != null, ComposableLambdaKt.composableLambda(startRestartGroup, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                                /* compiled from: TextFieldImpl.kt */
                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[TextFieldType.values().length];
                                        iArr[TextFieldType.Filled.ordinal()] = 1;
                                        iArr[TextFieldType.Outlined.ordinal()] = 2;
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(6);
                                }

                                @Override // kotlin.jvm.functions.Function6
                                public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) {
                                    m1578invokeRIQooxk(f.floatValue(), color.m2122unboximpl(), color2.m2122unboximpl(), f2.floatValue(), composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-RIQooxk, reason: not valid java name */
                                public final void m1578invokeRIQooxk(final float f, long j3, final long j4, final float f2, Composer composer3, int i21) {
                                    int i22;
                                    long j5;
                                    int i23;
                                    final float f3;
                                    ComposableLambda composableLambda;
                                    ComposableLambda composableLambda2;
                                    final long m2122unboximpl;
                                    final long m2122unboximpl2;
                                    ComposerKt.sourceInformation(composer3, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)149@6201L30,150@6287L43:TextFieldImpl.kt#jmzs0o");
                                    if ((i21 & 14) == 0) {
                                        i22 = (composer3.changed(f) ? 4 : 2) | i21;
                                    } else {
                                        i22 = i21;
                                    }
                                    if ((i21 & 112) == 0) {
                                        j5 = j3;
                                        i22 |= composer3.changed(j5) ? 32 : 16;
                                    } else {
                                        j5 = j3;
                                    }
                                    if ((i21 & 896) == 0) {
                                        i22 |= composer3.changed(j4) ? 256 : 128;
                                    }
                                    if ((i21 & 7168) == 0) {
                                        i22 |= composer3.changed(f2) ? 2048 : 1024;
                                    }
                                    if ((46811 & i22) != 9362 || !composer3.getSkipping()) {
                                        final Function2<Composer, Integer, Unit> function219 = function2;
                                        if (function219 != null) {
                                            final boolean z14 = z4;
                                            final int i24 = i22;
                                            final long j6 = j5;
                                            f3 = f;
                                            i23 = i24;
                                            composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                                                public final void invoke(Composer composer4, int i25) {
                                                    ComposerKt.sourceInformation(composer4, "C*123@5027L10,124@5083L10,129@5294L55:TextFieldImpl.kt#jmzs0o");
                                                    if ((i25 & 11) != 2 || !composer4.getSkipping()) {
                                                        TextStyle lerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getCaption(), f);
                                                        boolean z15 = z14;
                                                        long j7 = j6;
                                                        if (z15) {
                                                            lerp = TextStyle.m3948copyHL5avdY$default(lerp, j7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null);
                                                        }
                                                        TextFieldImplKt.m1577DecorationeuL9pac(j4, lerp, null, function219, composer4, ((i24 >> 6) & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            });
                                        } else {
                                            i23 = i22;
                                            f3 = f;
                                            composableLambda = null;
                                        }
                                        if (function218 == null || text.length() != 0) {
                                            composableLambda2 = null;
                                        } else {
                                            final TextFieldColors textFieldColors = colors;
                                            final boolean z15 = z11;
                                            final int i25 = i19;
                                            final int i26 = i20;
                                            final Function2<Composer, Integer, Unit> function220 = function218;
                                            composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                                    invoke(modifier, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Modifier modifier, Composer composer4, int i27) {
                                                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                                                    ComposerKt.sourceInformation(composer4, "C136@5575L341:TextFieldImpl.kt#jmzs0o");
                                                    if ((i27 & 14) == 0) {
                                                        i27 |= composer4.changed(modifier) ? 4 : 2;
                                                    }
                                                    if ((i27 & 91) != 18 || !composer4.getSkipping()) {
                                                        Modifier alpha = AlphaKt.alpha(modifier, f2);
                                                        TextFieldColors textFieldColors2 = textFieldColors;
                                                        boolean z16 = z15;
                                                        int i28 = i25;
                                                        int i29 = i26;
                                                        Function2<Composer, Integer, Unit> function221 = function220;
                                                        composer4.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
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
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(alpha);
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
                                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer4.startReplaceableGroup(1188063364);
                                                        ComposerKt.sourceInformation(composer4, "C138@5709L25,139@5797L10,137@5647L247:TextFieldImpl.kt#jmzs0o");
                                                        TextFieldImplKt.m1577DecorationeuL9pac(textFieldColors2.placeholderColor(z16, composer4, ((i28 >> 27) & 14) | ((i29 >> 6) & 112)).getValue().m2122unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function221, composer4, (i28 >> 6) & 7168, 4);
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endNode();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            });
                                        }
                                        final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1513getDefaultErrorMessageUdPEhr4(), composer3, 6);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Object valueOf = Boolean.valueOf(z12);
                                        final boolean z16 = z12;
                                        composer3.startReplaceableGroup(511388516);
                                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                        boolean changed2 = composer3.changed(valueOf) | composer3.changed(m1518getString4foXLRw);
                                        Object rememberedValue2 = composer3.rememberedValue();
                                        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    invoke2(semanticsPropertyReceiver);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                    if (z16) {
                                                        SemanticsPropertiesKt.error(semantics, m1518getString4foXLRw);
                                                    }
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue2);
                                        }
                                        composer3.endReplaceableGroup();
                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue2, 1, null);
                                        if (colors instanceof TextFieldColorsWithIcons) {
                                            composer3.startReplaceableGroup(-1083197894);
                                            ComposerKt.sourceInformation(composer3, "153@6424L53");
                                            TextFieldColorsWithIcons textFieldColorsWithIcons = (TextFieldColorsWithIcons) colors;
                                            boolean z17 = z11;
                                            boolean z18 = z12;
                                            InteractionSource interactionSource2 = interactionSource;
                                            int i27 = (i19 >> 27) & 14;
                                            int i28 = i20;
                                            m2122unboximpl = textFieldColorsWithIcons.leadingIconColor(z17, z18, interactionSource2, composer3, ((i28 << 3) & 896) | i27 | ((i28 << 3) & 112)).getValue().m2122unboximpl();
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-1083197798);
                                            ComposerKt.sourceInformation(composer3, "155@6520L34");
                                            TextFieldColors textFieldColors2 = colors;
                                            boolean z19 = z11;
                                            boolean z20 = z12;
                                            int i29 = (i19 >> 27) & 14;
                                            int i30 = i20;
                                            m2122unboximpl = textFieldColors2.leadingIconColor(z19, z20, composer3, i29 | ((i30 << 3) & 112) | ((i30 >> 3) & 896)).getValue().m2122unboximpl();
                                            composer3.endReplaceableGroup();
                                        }
                                        final Function2<Composer, Integer, Unit> function221 = function216;
                                        ComposableLambda composableLambda3 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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

                                            public final void invoke(Composer composer4, int i31) {
                                                ComposerKt.sourceInformation(composer4, "C159@6690L57:TextFieldImpl.kt#jmzs0o");
                                                if ((i31 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                } else {
                                                    TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl, null, null, function221, composer4, 0, 6);
                                                }
                                            }
                                        }) : null;
                                        if (colors instanceof TextFieldColorsWithIcons) {
                                            composer3.startReplaceableGroup(-1083197452);
                                            ComposerKt.sourceInformation(composer3, "164@6866L54");
                                            TextFieldColorsWithIcons textFieldColorsWithIcons2 = (TextFieldColorsWithIcons) colors;
                                            boolean z21 = z11;
                                            boolean z22 = z12;
                                            InteractionSource interactionSource3 = interactionSource;
                                            int i31 = (i19 >> 27) & 14;
                                            int i32 = i20;
                                            m2122unboximpl2 = textFieldColorsWithIcons2.trailingIconColor(z21, z22, interactionSource3, composer3, ((i32 << 3) & 896) | i31 | ((i32 << 3) & 112)).getValue().m2122unboximpl();
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-1083197355);
                                            ComposerKt.sourceInformation(composer3, "166@6963L35");
                                            TextFieldColors textFieldColors3 = colors;
                                            boolean z23 = z11;
                                            boolean z24 = z12;
                                            int i33 = (i19 >> 27) & 14;
                                            int i34 = i20;
                                            m2122unboximpl2 = textFieldColors3.trailingIconColor(z23, z24, composer3, i33 | ((i34 << 3) & 112) | ((i34 >> 3) & 896)).getValue().m2122unboximpl();
                                            composer3.endReplaceableGroup();
                                        }
                                        final Function2<Composer, Integer, Unit> function222 = function217;
                                        ComposableLambda composableLambda4 = function222 != null ? ComposableLambdaKt.composableLambda(composer3, -1894727196, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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

                                            public final void invoke(Composer composer4, int i35) {
                                                ComposerKt.sourceInformation(composer4, "C170@7136L58:TextFieldImpl.kt#jmzs0o");
                                                if ((i35 & 11) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                } else {
                                                    TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl2, null, null, function222, composer4, 0, 6);
                                                }
                                            }
                                        }) : null;
                                        int i35 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                                        if (i35 == 1) {
                                            composer3.startReplaceableGroup(-1083197019);
                                            ComposerKt.sourceInformation(composer3, "176@7296L485");
                                            Function2<Composer, Integer, Unit> function223 = innerTextField;
                                            boolean z25 = z13;
                                            PaddingValues paddingValues = contentPadding;
                                            int i36 = i19;
                                            TextFieldKt.TextFieldLayout(semantics$default, function223, composableLambda, composableLambda2, composableLambda3, composableLambda4, z25, f, paddingValues, composer3, ((i20 << 18) & 234881024) | ((i36 >> 6) & 3670016) | ((i36 >> 3) & 112) | ((i23 << 21) & 29360128));
                                            composer3.endReplaceableGroup();
                                            Unit unit = Unit.INSTANCE;
                                            return;
                                        }
                                        if (i35 == 2) {
                                            composer3.startReplaceableGroup(-1083196463);
                                            ComposerKt.sourceInformation(composer3, "190@7903L38,208@8711L420,200@8303L994");
                                            composer3.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                            Object rememberedValue3 = composer3.rememberedValue();
                                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1928boximpl(Size.INSTANCE.m1949getZeroNHjbRc()), null, 2, null);
                                                composer3.updateRememberedValue(rememberedValue3);
                                            }
                                            composer3.endReplaceableGroup();
                                            final MutableState mutableState = (MutableState) rememberedValue3;
                                            final PaddingValues paddingValues2 = contentPadding;
                                            final Function2<Composer, Integer, Unit> function224 = function215;
                                            final int i37 = i20;
                                            ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer3, 139886979, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
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

                                                public final void invoke(Composer composer4, int i38) {
                                                    ComposerKt.sourceInformation(composer4, "C192@8021L246:TextFieldImpl.kt#jmzs0o");
                                                    if ((i38 & 11) != 2 || !composer4.getSkipping()) {
                                                        Modifier m1459outlineCutout12SF9DM = OutlinedTextFieldKt.m1459outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, OutlinedTextFieldKt.BorderId), mutableState.getValue().getPackedValue(), paddingValues2);
                                                        Function2<Composer, Integer, Unit> function225 = function224;
                                                        int i39 = i37;
                                                        composer4.startReplaceableGroup(733328855);
                                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
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
                                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m1459outlineCutout12SF9DM);
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
                                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                        composer4.enableReusing();
                                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                        composer4.startReplaceableGroup(2058660585);
                                                        composer4.startReplaceableGroup(-2137368960);
                                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        composer4.startReplaceableGroup(1029492925);
                                                        ComposerKt.sourceInformation(composer4, "C196@8237L8:TextFieldImpl.kt#jmzs0o");
                                                        if (function225 != null) {
                                                            function225.invoke(composer4, Integer.valueOf((i39 >> 12) & 14));
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endNode();
                                                        composer4.endReplaceableGroup();
                                                        composer4.endReplaceableGroup();
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            });
                                            Function2<Composer, Integer, Unit> function225 = innerTextField;
                                            ComposableLambda composableLambda6 = composableLambda2;
                                            boolean z26 = z13;
                                            Object valueOf2 = Float.valueOf(f3);
                                            composer3.startReplaceableGroup(511388516);
                                            ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                            boolean changed3 = composer3.changed(valueOf2) | composer3.changed(mutableState);
                                            Object rememberedValue4 = composer3.rememberedValue();
                                            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue4 = (Function1) new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                        m1579invokeuvyYCjk(size.getPackedValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                    public final void m1579invokeuvyYCjk(long j7) {
                                                        float m1940getWidthimpl = Size.m1940getWidthimpl(j7) * f3;
                                                        float m1937getHeightimpl = Size.m1937getHeightimpl(j7) * f3;
                                                        if (Size.m1940getWidthimpl(mutableState.getValue().getPackedValue()) == m1940getWidthimpl && Size.m1937getHeightimpl(mutableState.getValue().getPackedValue()) == m1937getHeightimpl) {
                                                            return;
                                                        }
                                                        mutableState.setValue(Size.m1928boximpl(SizeKt.Size(m1940getWidthimpl, m1937getHeightimpl)));
                                                    }
                                                };
                                                composer3.updateRememberedValue(rememberedValue4);
                                            }
                                            composer3.endReplaceableGroup();
                                            Function1 function1 = (Function1) rememberedValue4;
                                            PaddingValues paddingValues3 = contentPadding;
                                            int i38 = i19;
                                            ComposableLambda composableLambda7 = composableLambda;
                                            OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function225, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z26, f3, function1, composableLambda5, paddingValues3, composer3, (3670016 & (i38 >> 6)) | ((i38 >> 3) & 112) | C.ENCODING_PCM_32BIT | (29360128 & (i23 << 21)), (i20 >> 6) & 14);
                                            composer3.endReplaceableGroup();
                                            Unit unit2 = Unit.INSTANCE;
                                            return;
                                        }
                                        composer3.startReplaceableGroup(-1083194976);
                                        composer3.endReplaceableGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 1769472);
                            function28 = function217;
                            z5 = z12;
                            z6 = z13;
                            function29 = function215;
                            z7 = z11;
                            function210 = function216;
                            function211 = function218;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            function28 = function24;
                            z6 = z;
                            function29 = function25;
                            composer2 = startRestartGroup;
                            function211 = function26;
                            function210 = function27;
                            z7 = z2;
                            z5 = z3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$4
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

                            public final void invoke(Composer composer3, int i21) {
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.this, value, innerTextField, visualTransformation, function2, function211, function210, function28, z6, z7, z5, interactionSource, contentPadding, colors, function29, composer3, i | 1, i2, i3);
                            }
                        });
                        return;
                    }
                    i14 = i18;
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    final String text2 = ((TransformedText) rememberedValue).getText().getText();
                    if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i14 >> 3) & 14).getValue().booleanValue()) {
                    }
                    final boolean z112 = z9;
                    final int i192 = i4;
                    final boolean z122 = z10;
                    final int i202 = i14;
                    function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase22, Composer composer3, Integer num) {
                            return Color.m2102boximpl(m1580invokeXeAY9LY(inputPhase22, composer3, num.intValue()));
                        }

                        /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                        public final long m1580invokeXeAY9LY(InputPhase it, Composer composer3, int i21) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            composer3.startReplaceableGroup(697243846);
                            ComposerKt.sourceInformation(composer3, "C92@3610L273:TextFieldImpl.kt#jmzs0o");
                            TextFieldColors textFieldColors = TextFieldColors.this;
                            boolean z132 = z112;
                            boolean z14 = it == InputPhase.UnfocusedEmpty ? false : z122;
                            InteractionSource interactionSource2 = interactionSource;
                            int i22 = (i192 >> 27) & 14;
                            int i23 = i202;
                            long m2122unboximpl = textFieldColors.labelColor(z132, z14, interactionSource2, composer3, i22 | ((i23 << 3) & 896) | (i23 & 7168)).getValue().m2122unboximpl();
                            composer3.endReplaceableGroup();
                            return m2122unboximpl;
                        }
                    };
                    Typography typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    TextStyle subtitle12 = typography2.getSubtitle1();
                    TextStyle caption2 = typography2.getCaption();
                    if (Color.m2113equalsimpl0(subtitle12.m3969getColor0d7_KjU(), Color.INSTANCE.m2148getUnspecified0d7_KjU())) {
                    }
                    TextFieldTransitionScope textFieldTransitionScope2 = TextFieldTransitionScope.INSTANCE;
                    startRestartGroup.startReplaceableGroup(2129141006);
                    ComposerKt.sourceInformation(startRestartGroup, "*110@4363L10,111@4455L22");
                    m3969getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getCaption().m3969getColor0d7_KjU();
                    if (z4) {
                        m3969getColor0d7_KjU = function3.invoke(inputPhase, startRestartGroup, 0).m2122unboximpl();
                    }
                    long j3 = m3969getColor0d7_KjU;
                    startRestartGroup.endReplaceableGroup();
                    m3969getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1().m3969getColor0d7_KjU();
                    if (z4) {
                        m3969getColor0d7_KjU2 = function3.invoke(inputPhase, startRestartGroup, 0).m2122unboximpl();
                    }
                    long j22 = m3969getColor0d7_KjU2;
                    final Function2<? super Composer, ? super Integer, Unit> function2162 = function213;
                    final Function2<? super Composer, ? super Integer, Unit> function2172 = function214;
                    final boolean z132 = z8;
                    InputPhase inputPhase22 = inputPhase;
                    final Function2<? super Composer, ? super Integer, Unit> function2182 = function212;
                    composer2 = startRestartGroup;
                    textFieldTransitionScope2.m1589TransitionDTcfvLk(inputPhase22, j3, j22, function3, function2 != null, ComposableLambdaKt.composableLambda(startRestartGroup, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                        /* compiled from: TextFieldImpl.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[TextFieldType.values().length];
                                iArr[TextFieldType.Filled.ordinal()] = 1;
                                iArr[TextFieldType.Outlined.ordinal()] = 2;
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(6);
                        }

                        @Override // kotlin.jvm.functions.Function6
                        public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) {
                            m1578invokeRIQooxk(f.floatValue(), color.m2122unboximpl(), color2.m2122unboximpl(), f2.floatValue(), composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-RIQooxk, reason: not valid java name */
                        public final void m1578invokeRIQooxk(final float f, long j32, final long j4, final float f2, Composer composer3, int i21) {
                            int i22;
                            long j5;
                            int i23;
                            final float f3;
                            ComposableLambda composableLambda;
                            ComposableLambda composableLambda2;
                            final long m2122unboximpl;
                            final long m2122unboximpl2;
                            ComposerKt.sourceInformation(composer3, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)149@6201L30,150@6287L43:TextFieldImpl.kt#jmzs0o");
                            if ((i21 & 14) == 0) {
                                i22 = (composer3.changed(f) ? 4 : 2) | i21;
                            } else {
                                i22 = i21;
                            }
                            if ((i21 & 112) == 0) {
                                j5 = j32;
                                i22 |= composer3.changed(j5) ? 32 : 16;
                            } else {
                                j5 = j32;
                            }
                            if ((i21 & 896) == 0) {
                                i22 |= composer3.changed(j4) ? 256 : 128;
                            }
                            if ((i21 & 7168) == 0) {
                                i22 |= composer3.changed(f2) ? 2048 : 1024;
                            }
                            if ((46811 & i22) != 9362 || !composer3.getSkipping()) {
                                final Function2<? super Composer, ? super Integer, Unit> function219 = function2;
                                if (function219 != null) {
                                    final boolean z14 = z4;
                                    final int i24 = i22;
                                    final long j6 = j5;
                                    f3 = f;
                                    i23 = i24;
                                    composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                                        public final void invoke(Composer composer4, int i25) {
                                            ComposerKt.sourceInformation(composer4, "C*123@5027L10,124@5083L10,129@5294L55:TextFieldImpl.kt#jmzs0o");
                                            if ((i25 & 11) != 2 || !composer4.getSkipping()) {
                                                TextStyle lerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getCaption(), f);
                                                boolean z15 = z14;
                                                long j7 = j6;
                                                if (z15) {
                                                    lerp = TextStyle.m3948copyHL5avdY$default(lerp, j7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null);
                                                }
                                                TextFieldImplKt.m1577DecorationeuL9pac(j4, lerp, null, function219, composer4, ((i24 >> 6) & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    });
                                } else {
                                    i23 = i22;
                                    f3 = f;
                                    composableLambda = null;
                                }
                                if (function2182 == null || text2.length() != 0) {
                                    composableLambda2 = null;
                                } else {
                                    final TextFieldColors textFieldColors = colors;
                                    final boolean z15 = z112;
                                    final int i25 = i192;
                                    final int i26 = i202;
                                    final Function2<? super Composer, ? super Integer, Unit> function220 = function2182;
                                    composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                            invoke(modifier, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Modifier modifier, Composer composer4, int i27) {
                                            Intrinsics.checkNotNullParameter(modifier, "modifier");
                                            ComposerKt.sourceInformation(composer4, "C136@5575L341:TextFieldImpl.kt#jmzs0o");
                                            if ((i27 & 14) == 0) {
                                                i27 |= composer4.changed(modifier) ? 4 : 2;
                                            }
                                            if ((i27 & 91) != 18 || !composer4.getSkipping()) {
                                                Modifier alpha = AlphaKt.alpha(modifier, f2);
                                                TextFieldColors textFieldColors2 = textFieldColors;
                                                boolean z16 = z15;
                                                int i28 = i25;
                                                int i29 = i26;
                                                Function2<Composer, Integer, Unit> function221 = function220;
                                                composer4.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
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
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(alpha);
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
                                                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer4.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer4.startReplaceableGroup(1188063364);
                                                ComposerKt.sourceInformation(composer4, "C138@5709L25,139@5797L10,137@5647L247:TextFieldImpl.kt#jmzs0o");
                                                TextFieldImplKt.m1577DecorationeuL9pac(textFieldColors2.placeholderColor(z16, composer4, ((i28 >> 27) & 14) | ((i29 >> 6) & 112)).getValue().m2122unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function221, composer4, (i28 >> 6) & 7168, 4);
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    });
                                }
                                final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1513getDefaultErrorMessageUdPEhr4(), composer3, 6);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Object valueOf = Boolean.valueOf(z122);
                                final boolean z16 = z122;
                                composer3.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                boolean changed2 = composer3.changed(valueOf) | composer3.changed(m1518getString4foXLRw);
                                Object rememberedValue2 = composer3.rememberedValue();
                                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                            if (z16) {
                                                SemanticsPropertiesKt.error(semantics, m1518getString4foXLRw);
                                            }
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue2, 1, null);
                                if (colors instanceof TextFieldColorsWithIcons) {
                                    composer3.startReplaceableGroup(-1083197894);
                                    ComposerKt.sourceInformation(composer3, "153@6424L53");
                                    TextFieldColorsWithIcons textFieldColorsWithIcons = (TextFieldColorsWithIcons) colors;
                                    boolean z17 = z112;
                                    boolean z18 = z122;
                                    InteractionSource interactionSource2 = interactionSource;
                                    int i27 = (i192 >> 27) & 14;
                                    int i28 = i202;
                                    m2122unboximpl = textFieldColorsWithIcons.leadingIconColor(z17, z18, interactionSource2, composer3, ((i28 << 3) & 896) | i27 | ((i28 << 3) & 112)).getValue().m2122unboximpl();
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-1083197798);
                                    ComposerKt.sourceInformation(composer3, "155@6520L34");
                                    TextFieldColors textFieldColors2 = colors;
                                    boolean z19 = z112;
                                    boolean z20 = z122;
                                    int i29 = (i192 >> 27) & 14;
                                    int i30 = i202;
                                    m2122unboximpl = textFieldColors2.leadingIconColor(z19, z20, composer3, i29 | ((i30 << 3) & 112) | ((i30 >> 3) & 896)).getValue().m2122unboximpl();
                                    composer3.endReplaceableGroup();
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function221 = function2162;
                                ComposableLambda composableLambda3 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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

                                    public final void invoke(Composer composer4, int i31) {
                                        ComposerKt.sourceInformation(composer4, "C159@6690L57:TextFieldImpl.kt#jmzs0o");
                                        if ((i31 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl, null, null, function221, composer4, 0, 6);
                                        }
                                    }
                                }) : null;
                                if (colors instanceof TextFieldColorsWithIcons) {
                                    composer3.startReplaceableGroup(-1083197452);
                                    ComposerKt.sourceInformation(composer3, "164@6866L54");
                                    TextFieldColorsWithIcons textFieldColorsWithIcons2 = (TextFieldColorsWithIcons) colors;
                                    boolean z21 = z112;
                                    boolean z22 = z122;
                                    InteractionSource interactionSource3 = interactionSource;
                                    int i31 = (i192 >> 27) & 14;
                                    int i32 = i202;
                                    m2122unboximpl2 = textFieldColorsWithIcons2.trailingIconColor(z21, z22, interactionSource3, composer3, ((i32 << 3) & 896) | i31 | ((i32 << 3) & 112)).getValue().m2122unboximpl();
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-1083197355);
                                    ComposerKt.sourceInformation(composer3, "166@6963L35");
                                    TextFieldColors textFieldColors3 = colors;
                                    boolean z23 = z112;
                                    boolean z24 = z122;
                                    int i33 = (i192 >> 27) & 14;
                                    int i34 = i202;
                                    m2122unboximpl2 = textFieldColors3.trailingIconColor(z23, z24, composer3, i33 | ((i34 << 3) & 112) | ((i34 >> 3) & 896)).getValue().m2122unboximpl();
                                    composer3.endReplaceableGroup();
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function222 = function2172;
                                ComposableLambda composableLambda4 = function222 != null ? ComposableLambdaKt.composableLambda(composer3, -1894727196, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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

                                    public final void invoke(Composer composer4, int i35) {
                                        ComposerKt.sourceInformation(composer4, "C170@7136L58:TextFieldImpl.kt#jmzs0o");
                                        if ((i35 & 11) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                        } else {
                                            TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl2, null, null, function222, composer4, 0, 6);
                                        }
                                    }
                                }) : null;
                                int i35 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                                if (i35 == 1) {
                                    composer3.startReplaceableGroup(-1083197019);
                                    ComposerKt.sourceInformation(composer3, "176@7296L485");
                                    Function2<Composer, Integer, Unit> function223 = innerTextField;
                                    boolean z25 = z132;
                                    PaddingValues paddingValues = contentPadding;
                                    int i36 = i192;
                                    TextFieldKt.TextFieldLayout(semantics$default, function223, composableLambda, composableLambda2, composableLambda3, composableLambda4, z25, f, paddingValues, composer3, ((i202 << 18) & 234881024) | ((i36 >> 6) & 3670016) | ((i36 >> 3) & 112) | ((i23 << 21) & 29360128));
                                    composer3.endReplaceableGroup();
                                    Unit unit = Unit.INSTANCE;
                                    return;
                                }
                                if (i35 == 2) {
                                    composer3.startReplaceableGroup(-1083196463);
                                    ComposerKt.sourceInformation(composer3, "190@7903L38,208@8711L420,200@8303L994");
                                    composer3.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue3 = composer3.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1928boximpl(Size.INSTANCE.m1949getZeroNHjbRc()), null, 2, null);
                                        composer3.updateRememberedValue(rememberedValue3);
                                    }
                                    composer3.endReplaceableGroup();
                                    final MutableState<Size> mutableState = (MutableState) rememberedValue3;
                                    final PaddingValues paddingValues2 = contentPadding;
                                    final Function2<? super Composer, ? super Integer, Unit> function224 = function215;
                                    final int i37 = i202;
                                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer3, 139886979, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
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

                                        public final void invoke(Composer composer4, int i38) {
                                            ComposerKt.sourceInformation(composer4, "C192@8021L246:TextFieldImpl.kt#jmzs0o");
                                            if ((i38 & 11) != 2 || !composer4.getSkipping()) {
                                                Modifier m1459outlineCutout12SF9DM = OutlinedTextFieldKt.m1459outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, OutlinedTextFieldKt.BorderId), mutableState.getValue().getPackedValue(), paddingValues2);
                                                Function2<Composer, Integer, Unit> function225 = function224;
                                                int i39 = i37;
                                                composer4.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
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
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m1459outlineCutout12SF9DM);
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
                                                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                composer4.enableReusing();
                                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                                composer4.startReplaceableGroup(2058660585);
                                                composer4.startReplaceableGroup(-2137368960);
                                                ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                composer4.startReplaceableGroup(1029492925);
                                                ComposerKt.sourceInformation(composer4, "C196@8237L8:TextFieldImpl.kt#jmzs0o");
                                                if (function225 != null) {
                                                    function225.invoke(composer4, Integer.valueOf((i39 >> 12) & 14));
                                                }
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                composer4.endNode();
                                                composer4.endReplaceableGroup();
                                                composer4.endReplaceableGroup();
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    });
                                    Function2<Composer, Integer, Unit> function225 = innerTextField;
                                    ComposableLambda composableLambda6 = composableLambda2;
                                    boolean z26 = z132;
                                    Object valueOf2 = Float.valueOf(f3);
                                    composer3.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean changed3 = composer3.changed(valueOf2) | composer3.changed(mutableState);
                                    Object rememberedValue4 = composer3.rememberedValue();
                                    if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = (Function1) new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                m1579invokeuvyYCjk(size.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                            public final void m1579invokeuvyYCjk(long j7) {
                                                float m1940getWidthimpl = Size.m1940getWidthimpl(j7) * f3;
                                                float m1937getHeightimpl = Size.m1937getHeightimpl(j7) * f3;
                                                if (Size.m1940getWidthimpl(mutableState.getValue().getPackedValue()) == m1940getWidthimpl && Size.m1937getHeightimpl(mutableState.getValue().getPackedValue()) == m1937getHeightimpl) {
                                                    return;
                                                }
                                                mutableState.setValue(Size.m1928boximpl(SizeKt.Size(m1940getWidthimpl, m1937getHeightimpl)));
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue4);
                                    }
                                    composer3.endReplaceableGroup();
                                    Function1 function1 = (Function1) rememberedValue4;
                                    PaddingValues paddingValues3 = contentPadding;
                                    int i38 = i192;
                                    ComposableLambda composableLambda7 = composableLambda;
                                    OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function225, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z26, f3, function1, composableLambda5, paddingValues3, composer3, (3670016 & (i38 >> 6)) | ((i38 >> 3) & 112) | C.ENCODING_PCM_32BIT | (29360128 & (i23 << 21)), (i202 >> 6) & 14);
                                    composer3.endReplaceableGroup();
                                    Unit unit2 = Unit.INSTANCE;
                                    return;
                                }
                                composer3.startReplaceableGroup(-1083194976);
                                composer3.endReplaceableGroup();
                                Unit unit3 = Unit.INSTANCE;
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 1769472);
                    function28 = function2172;
                    z5 = z122;
                    z6 = z132;
                    function29 = function215;
                    z7 = z112;
                    function210 = function2162;
                    function211 = function2182;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i182 = i12;
                if ((i3 & 4096) == 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                i13 = i3 & 16384;
                if (i13 == 0) {
                }
                i14 = i182;
                if ((i4 & 1533916891) == 306783378) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                final String text22 = ((TransformedText) rememberedValue).getText().getText();
                if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i14 >> 3) & 14).getValue().booleanValue()) {
                }
                final boolean z1122 = z9;
                final int i1922 = i4;
                final boolean z1222 = z10;
                final int i2022 = i14;
                function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase222, Composer composer3, Integer num) {
                        return Color.m2102boximpl(m1580invokeXeAY9LY(inputPhase222, composer3, num.intValue()));
                    }

                    /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                    public final long m1580invokeXeAY9LY(InputPhase it, Composer composer3, int i21) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        composer3.startReplaceableGroup(697243846);
                        ComposerKt.sourceInformation(composer3, "C92@3610L273:TextFieldImpl.kt#jmzs0o");
                        TextFieldColors textFieldColors = TextFieldColors.this;
                        boolean z1322 = z1122;
                        boolean z14 = it == InputPhase.UnfocusedEmpty ? false : z1222;
                        InteractionSource interactionSource2 = interactionSource;
                        int i22 = (i1922 >> 27) & 14;
                        int i23 = i2022;
                        long m2122unboximpl = textFieldColors.labelColor(z1322, z14, interactionSource2, composer3, i22 | ((i23 << 3) & 896) | (i23 & 7168)).getValue().m2122unboximpl();
                        composer3.endReplaceableGroup();
                        return m2122unboximpl;
                    }
                };
                Typography typography22 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                TextStyle subtitle122 = typography22.getSubtitle1();
                TextStyle caption22 = typography22.getCaption();
                if (Color.m2113equalsimpl0(subtitle122.m3969getColor0d7_KjU(), Color.INSTANCE.m2148getUnspecified0d7_KjU())) {
                }
                TextFieldTransitionScope textFieldTransitionScope22 = TextFieldTransitionScope.INSTANCE;
                startRestartGroup.startReplaceableGroup(2129141006);
                ComposerKt.sourceInformation(startRestartGroup, "*110@4363L10,111@4455L22");
                m3969getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getCaption().m3969getColor0d7_KjU();
                if (z4) {
                }
                long j32 = m3969getColor0d7_KjU;
                startRestartGroup.endReplaceableGroup();
                m3969getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1().m3969getColor0d7_KjU();
                if (z4) {
                }
                long j222 = m3969getColor0d7_KjU2;
                final Function2<? super Composer, ? super Integer, Unit> function21622 = function213;
                final Function2<? super Composer, ? super Integer, Unit> function21722 = function214;
                final boolean z1322 = z8;
                InputPhase inputPhase222 = inputPhase;
                final Function2<? super Composer, ? super Integer, Unit> function21822 = function212;
                composer2 = startRestartGroup;
                textFieldTransitionScope22.m1589TransitionDTcfvLk(inputPhase222, j32, j222, function3, function2 != null, ComposableLambdaKt.composableLambda(startRestartGroup, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                    /* compiled from: TextFieldImpl.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[TextFieldType.values().length];
                            iArr[TextFieldType.Filled.ordinal()] = 1;
                            iArr[TextFieldType.Outlined.ordinal()] = 2;
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(6);
                    }

                    @Override // kotlin.jvm.functions.Function6
                    public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) {
                        m1578invokeRIQooxk(f.floatValue(), color.m2122unboximpl(), color2.m2122unboximpl(), f2.floatValue(), composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-RIQooxk, reason: not valid java name */
                    public final void m1578invokeRIQooxk(final float f, long j322, final long j4, final float f2, Composer composer3, int i21) {
                        int i22;
                        long j5;
                        int i23;
                        final float f3;
                        ComposableLambda composableLambda;
                        ComposableLambda composableLambda2;
                        final long m2122unboximpl;
                        final long m2122unboximpl2;
                        ComposerKt.sourceInformation(composer3, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)149@6201L30,150@6287L43:TextFieldImpl.kt#jmzs0o");
                        if ((i21 & 14) == 0) {
                            i22 = (composer3.changed(f) ? 4 : 2) | i21;
                        } else {
                            i22 = i21;
                        }
                        if ((i21 & 112) == 0) {
                            j5 = j322;
                            i22 |= composer3.changed(j5) ? 32 : 16;
                        } else {
                            j5 = j322;
                        }
                        if ((i21 & 896) == 0) {
                            i22 |= composer3.changed(j4) ? 256 : 128;
                        }
                        if ((i21 & 7168) == 0) {
                            i22 |= composer3.changed(f2) ? 2048 : 1024;
                        }
                        if ((46811 & i22) != 9362 || !composer3.getSkipping()) {
                            final Function2<? super Composer, ? super Integer, Unit> function219 = function2;
                            if (function219 != null) {
                                final boolean z14 = z4;
                                final int i24 = i22;
                                final long j6 = j5;
                                f3 = f;
                                i23 = i24;
                                composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                                    public final void invoke(Composer composer4, int i25) {
                                        ComposerKt.sourceInformation(composer4, "C*123@5027L10,124@5083L10,129@5294L55:TextFieldImpl.kt#jmzs0o");
                                        if ((i25 & 11) != 2 || !composer4.getSkipping()) {
                                            TextStyle lerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getCaption(), f);
                                            boolean z15 = z14;
                                            long j7 = j6;
                                            if (z15) {
                                                lerp = TextStyle.m3948copyHL5avdY$default(lerp, j7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null);
                                            }
                                            TextFieldImplKt.m1577DecorationeuL9pac(j4, lerp, null, function219, composer4, ((i24 >> 6) & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                            } else {
                                i23 = i22;
                                f3 = f;
                                composableLambda = null;
                            }
                            if (function21822 == null || text22.length() != 0) {
                                composableLambda2 = null;
                            } else {
                                final TextFieldColors textFieldColors = colors;
                                final boolean z15 = z1122;
                                final int i25 = i1922;
                                final int i26 = i2022;
                                final Function2<? super Composer, ? super Integer, Unit> function220 = function21822;
                                composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                        invoke(modifier, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Modifier modifier, Composer composer4, int i27) {
                                        Intrinsics.checkNotNullParameter(modifier, "modifier");
                                        ComposerKt.sourceInformation(composer4, "C136@5575L341:TextFieldImpl.kt#jmzs0o");
                                        if ((i27 & 14) == 0) {
                                            i27 |= composer4.changed(modifier) ? 4 : 2;
                                        }
                                        if ((i27 & 91) != 18 || !composer4.getSkipping()) {
                                            Modifier alpha = AlphaKt.alpha(modifier, f2);
                                            TextFieldColors textFieldColors2 = textFieldColors;
                                            boolean z16 = z15;
                                            int i28 = i25;
                                            int i29 = i26;
                                            Function2<Composer, Integer, Unit> function221 = function220;
                                            composer4.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
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
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(alpha);
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
                                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer4.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(1188063364);
                                            ComposerKt.sourceInformation(composer4, "C138@5709L25,139@5797L10,137@5647L247:TextFieldImpl.kt#jmzs0o");
                                            TextFieldImplKt.m1577DecorationeuL9pac(textFieldColors2.placeholderColor(z16, composer4, ((i28 >> 27) & 14) | ((i29 >> 6) & 112)).getValue().m2122unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function221, composer4, (i28 >> 6) & 7168, 4);
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                            }
                            final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1513getDefaultErrorMessageUdPEhr4(), composer3, 6);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Object valueOf = Boolean.valueOf(z1222);
                            final boolean z16 = z1222;
                            composer3.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                            boolean changed2 = composer3.changed(valueOf) | composer3.changed(m1518getString4foXLRw);
                            Object rememberedValue2 = composer3.rememberedValue();
                            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semantics) {
                                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        if (z16) {
                                            SemanticsPropertiesKt.error(semantics, m1518getString4foXLRw);
                                        }
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue2);
                            }
                            composer3.endReplaceableGroup();
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue2, 1, null);
                            if (colors instanceof TextFieldColorsWithIcons) {
                                composer3.startReplaceableGroup(-1083197894);
                                ComposerKt.sourceInformation(composer3, "153@6424L53");
                                TextFieldColorsWithIcons textFieldColorsWithIcons = (TextFieldColorsWithIcons) colors;
                                boolean z17 = z1122;
                                boolean z18 = z1222;
                                InteractionSource interactionSource2 = interactionSource;
                                int i27 = (i1922 >> 27) & 14;
                                int i28 = i2022;
                                m2122unboximpl = textFieldColorsWithIcons.leadingIconColor(z17, z18, interactionSource2, composer3, ((i28 << 3) & 896) | i27 | ((i28 << 3) & 112)).getValue().m2122unboximpl();
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(-1083197798);
                                ComposerKt.sourceInformation(composer3, "155@6520L34");
                                TextFieldColors textFieldColors2 = colors;
                                boolean z19 = z1122;
                                boolean z20 = z1222;
                                int i29 = (i1922 >> 27) & 14;
                                int i30 = i2022;
                                m2122unboximpl = textFieldColors2.leadingIconColor(z19, z20, composer3, i29 | ((i30 << 3) & 112) | ((i30 >> 3) & 896)).getValue().m2122unboximpl();
                                composer3.endReplaceableGroup();
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function221 = function21622;
                            ComposableLambda composableLambda3 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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

                                public final void invoke(Composer composer4, int i31) {
                                    ComposerKt.sourceInformation(composer4, "C159@6690L57:TextFieldImpl.kt#jmzs0o");
                                    if ((i31 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                    } else {
                                        TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl, null, null, function221, composer4, 0, 6);
                                    }
                                }
                            }) : null;
                            if (colors instanceof TextFieldColorsWithIcons) {
                                composer3.startReplaceableGroup(-1083197452);
                                ComposerKt.sourceInformation(composer3, "164@6866L54");
                                TextFieldColorsWithIcons textFieldColorsWithIcons2 = (TextFieldColorsWithIcons) colors;
                                boolean z21 = z1122;
                                boolean z22 = z1222;
                                InteractionSource interactionSource3 = interactionSource;
                                int i31 = (i1922 >> 27) & 14;
                                int i32 = i2022;
                                m2122unboximpl2 = textFieldColorsWithIcons2.trailingIconColor(z21, z22, interactionSource3, composer3, ((i32 << 3) & 896) | i31 | ((i32 << 3) & 112)).getValue().m2122unboximpl();
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(-1083197355);
                                ComposerKt.sourceInformation(composer3, "166@6963L35");
                                TextFieldColors textFieldColors3 = colors;
                                boolean z23 = z1122;
                                boolean z24 = z1222;
                                int i33 = (i1922 >> 27) & 14;
                                int i34 = i2022;
                                m2122unboximpl2 = textFieldColors3.trailingIconColor(z23, z24, composer3, i33 | ((i34 << 3) & 112) | ((i34 >> 3) & 896)).getValue().m2122unboximpl();
                                composer3.endReplaceableGroup();
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function222 = function21722;
                            ComposableLambda composableLambda4 = function222 != null ? ComposableLambdaKt.composableLambda(composer3, -1894727196, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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

                                public final void invoke(Composer composer4, int i35) {
                                    ComposerKt.sourceInformation(composer4, "C170@7136L58:TextFieldImpl.kt#jmzs0o");
                                    if ((i35 & 11) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                    } else {
                                        TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl2, null, null, function222, composer4, 0, 6);
                                    }
                                }
                            }) : null;
                            int i35 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                            if (i35 == 1) {
                                composer3.startReplaceableGroup(-1083197019);
                                ComposerKt.sourceInformation(composer3, "176@7296L485");
                                Function2<Composer, Integer, Unit> function223 = innerTextField;
                                boolean z25 = z1322;
                                PaddingValues paddingValues = contentPadding;
                                int i36 = i1922;
                                TextFieldKt.TextFieldLayout(semantics$default, function223, composableLambda, composableLambda2, composableLambda3, composableLambda4, z25, f, paddingValues, composer3, ((i2022 << 18) & 234881024) | ((i36 >> 6) & 3670016) | ((i36 >> 3) & 112) | ((i23 << 21) & 29360128));
                                composer3.endReplaceableGroup();
                                Unit unit = Unit.INSTANCE;
                                return;
                            }
                            if (i35 == 2) {
                                composer3.startReplaceableGroup(-1083196463);
                                ComposerKt.sourceInformation(composer3, "190@7903L38,208@8711L420,200@8303L994");
                                composer3.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue3 = composer3.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1928boximpl(Size.INSTANCE.m1949getZeroNHjbRc()), null, 2, null);
                                    composer3.updateRememberedValue(rememberedValue3);
                                }
                                composer3.endReplaceableGroup();
                                final MutableState<Size> mutableState = (MutableState) rememberedValue3;
                                final PaddingValues paddingValues2 = contentPadding;
                                final Function2<? super Composer, ? super Integer, Unit> function224 = function215;
                                final int i37 = i2022;
                                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer3, 139886979, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
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

                                    public final void invoke(Composer composer4, int i38) {
                                        ComposerKt.sourceInformation(composer4, "C192@8021L246:TextFieldImpl.kt#jmzs0o");
                                        if ((i38 & 11) != 2 || !composer4.getSkipping()) {
                                            Modifier m1459outlineCutout12SF9DM = OutlinedTextFieldKt.m1459outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, OutlinedTextFieldKt.BorderId), mutableState.getValue().getPackedValue(), paddingValues2);
                                            Function2<Composer, Integer, Unit> function225 = function224;
                                            int i39 = i37;
                                            composer4.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
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
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m1459outlineCutout12SF9DM);
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
                                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer4.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                            composer4.startReplaceableGroup(2058660585);
                                            composer4.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer4.startReplaceableGroup(1029492925);
                                            ComposerKt.sourceInformation(composer4, "C196@8237L8:TextFieldImpl.kt#jmzs0o");
                                            if (function225 != null) {
                                                function225.invoke(composer4, Integer.valueOf((i39 >> 12) & 14));
                                            }
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            composer4.endNode();
                                            composer4.endReplaceableGroup();
                                            composer4.endReplaceableGroup();
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                });
                                Function2<Composer, Integer, Unit> function225 = innerTextField;
                                ComposableLambda composableLambda6 = composableLambda2;
                                boolean z26 = z1322;
                                Object valueOf2 = Float.valueOf(f3);
                                composer3.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                boolean changed3 = composer3.changed(valueOf2) | composer3.changed(mutableState);
                                Object rememberedValue4 = composer3.rememberedValue();
                                if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (Function1) new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                            m1579invokeuvyYCjk(size.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                        public final void m1579invokeuvyYCjk(long j7) {
                                            float m1940getWidthimpl = Size.m1940getWidthimpl(j7) * f3;
                                            float m1937getHeightimpl = Size.m1937getHeightimpl(j7) * f3;
                                            if (Size.m1940getWidthimpl(mutableState.getValue().getPackedValue()) == m1940getWidthimpl && Size.m1937getHeightimpl(mutableState.getValue().getPackedValue()) == m1937getHeightimpl) {
                                                return;
                                            }
                                            mutableState.setValue(Size.m1928boximpl(SizeKt.Size(m1940getWidthimpl, m1937getHeightimpl)));
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue4);
                                }
                                composer3.endReplaceableGroup();
                                Function1 function1 = (Function1) rememberedValue4;
                                PaddingValues paddingValues3 = contentPadding;
                                int i38 = i1922;
                                ComposableLambda composableLambda7 = composableLambda;
                                OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function225, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z26, f3, function1, composableLambda5, paddingValues3, composer3, (3670016 & (i38 >> 6)) | ((i38 >> 3) & 112) | C.ENCODING_PCM_32BIT | (29360128 & (i23 << 21)), (i2022 >> 6) & 14);
                                composer3.endReplaceableGroup();
                                Unit unit2 = Unit.INSTANCE;
                                return;
                            }
                            composer3.startReplaceableGroup(-1083194976);
                            composer3.endReplaceableGroup();
                            Unit unit3 = Unit.INSTANCE;
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 1769472);
                function28 = function21722;
                z5 = z1222;
                z6 = z1322;
                function29 = function215;
                z7 = z1122;
                function210 = function21622;
                function211 = function21822;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i6;
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i1822 = i12;
            if ((i3 & 4096) == 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            i13 = i3 & 16384;
            if (i13 == 0) {
            }
            i14 = i1822;
            if ((i4 & 1533916891) == 306783378) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            final String text222 = ((TransformedText) rememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i14 >> 3) & 14).getValue().booleanValue()) {
            }
            final boolean z11222 = z9;
            final int i19222 = i4;
            final boolean z12222 = z10;
            final int i20222 = i14;
            function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase2222, Composer composer3, Integer num) {
                    return Color.m2102boximpl(m1580invokeXeAY9LY(inputPhase2222, composer3, num.intValue()));
                }

                /* renamed from: invoke-XeAY9LY, reason: not valid java name */
                public final long m1580invokeXeAY9LY(InputPhase it, Composer composer3, int i21) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    composer3.startReplaceableGroup(697243846);
                    ComposerKt.sourceInformation(composer3, "C92@3610L273:TextFieldImpl.kt#jmzs0o");
                    TextFieldColors textFieldColors = TextFieldColors.this;
                    boolean z13222 = z11222;
                    boolean z14 = it == InputPhase.UnfocusedEmpty ? false : z12222;
                    InteractionSource interactionSource2 = interactionSource;
                    int i22 = (i19222 >> 27) & 14;
                    int i23 = i20222;
                    long m2122unboximpl = textFieldColors.labelColor(z13222, z14, interactionSource2, composer3, i22 | ((i23 << 3) & 896) | (i23 & 7168)).getValue().m2122unboximpl();
                    composer3.endReplaceableGroup();
                    return m2122unboximpl;
                }
            };
            Typography typography222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            TextStyle subtitle1222 = typography222.getSubtitle1();
            TextStyle caption222 = typography222.getCaption();
            if (Color.m2113equalsimpl0(subtitle1222.m3969getColor0d7_KjU(), Color.INSTANCE.m2148getUnspecified0d7_KjU())) {
            }
            TextFieldTransitionScope textFieldTransitionScope222 = TextFieldTransitionScope.INSTANCE;
            startRestartGroup.startReplaceableGroup(2129141006);
            ComposerKt.sourceInformation(startRestartGroup, "*110@4363L10,111@4455L22");
            m3969getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getCaption().m3969getColor0d7_KjU();
            if (z4) {
            }
            long j322 = m3969getColor0d7_KjU;
            startRestartGroup.endReplaceableGroup();
            m3969getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1().m3969getColor0d7_KjU();
            if (z4) {
            }
            long j2222 = m3969getColor0d7_KjU2;
            final Function2<? super Composer, ? super Integer, Unit> function216222 = function213;
            final Function2<? super Composer, ? super Integer, Unit> function217222 = function214;
            final boolean z13222 = z8;
            InputPhase inputPhase2222 = inputPhase;
            final Function2<? super Composer, ? super Integer, Unit> function218222 = function212;
            composer2 = startRestartGroup;
            textFieldTransitionScope222.m1589TransitionDTcfvLk(inputPhase2222, j322, j2222, function3, function2 != null, ComposableLambdaKt.composableLambda(startRestartGroup, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                /* compiled from: TextFieldImpl.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        iArr[TextFieldType.Filled.ordinal()] = 1;
                        iArr[TextFieldType.Outlined.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                @Override // kotlin.jvm.functions.Function6
                public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) {
                    m1578invokeRIQooxk(f.floatValue(), color.m2122unboximpl(), color2.m2122unboximpl(), f2.floatValue(), composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-RIQooxk, reason: not valid java name */
                public final void m1578invokeRIQooxk(final float f, long j3222, final long j4, final float f2, Composer composer3, int i21) {
                    int i22;
                    long j5;
                    int i23;
                    final float f3;
                    ComposableLambda composableLambda;
                    ComposableLambda composableLambda2;
                    final long m2122unboximpl;
                    final long m2122unboximpl2;
                    ComposerKt.sourceInformation(composer3, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)149@6201L30,150@6287L43:TextFieldImpl.kt#jmzs0o");
                    if ((i21 & 14) == 0) {
                        i22 = (composer3.changed(f) ? 4 : 2) | i21;
                    } else {
                        i22 = i21;
                    }
                    if ((i21 & 112) == 0) {
                        j5 = j3222;
                        i22 |= composer3.changed(j5) ? 32 : 16;
                    } else {
                        j5 = j3222;
                    }
                    if ((i21 & 896) == 0) {
                        i22 |= composer3.changed(j4) ? 256 : 128;
                    }
                    if ((i21 & 7168) == 0) {
                        i22 |= composer3.changed(f2) ? 2048 : 1024;
                    }
                    if ((46811 & i22) != 9362 || !composer3.getSkipping()) {
                        final Function2<? super Composer, ? super Integer, Unit> function219 = function2;
                        if (function219 != null) {
                            final boolean z14 = z4;
                            final int i24 = i22;
                            final long j6 = j5;
                            f3 = f;
                            i23 = i24;
                            composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                                public final void invoke(Composer composer4, int i25) {
                                    ComposerKt.sourceInformation(composer4, "C*123@5027L10,124@5083L10,129@5294L55:TextFieldImpl.kt#jmzs0o");
                                    if ((i25 & 11) != 2 || !composer4.getSkipping()) {
                                        TextStyle lerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getCaption(), f);
                                        boolean z15 = z14;
                                        long j7 = j6;
                                        if (z15) {
                                            lerp = TextStyle.m3948copyHL5avdY$default(lerp, j7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null);
                                        }
                                        TextFieldImplKt.m1577DecorationeuL9pac(j4, lerp, null, function219, composer4, ((i24 >> 6) & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                        } else {
                            i23 = i22;
                            f3 = f;
                            composableLambda = null;
                        }
                        if (function218222 == null || text222.length() != 0) {
                            composableLambda2 = null;
                        } else {
                            final TextFieldColors textFieldColors = colors;
                            final boolean z15 = z11222;
                            final int i25 = i19222;
                            final int i26 = i20222;
                            final Function2<? super Composer, ? super Integer, Unit> function220 = function218222;
                            composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                    invoke(modifier, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Modifier modifier, Composer composer4, int i27) {
                                    Intrinsics.checkNotNullParameter(modifier, "modifier");
                                    ComposerKt.sourceInformation(composer4, "C136@5575L341:TextFieldImpl.kt#jmzs0o");
                                    if ((i27 & 14) == 0) {
                                        i27 |= composer4.changed(modifier) ? 4 : 2;
                                    }
                                    if ((i27 & 91) != 18 || !composer4.getSkipping()) {
                                        Modifier alpha = AlphaKt.alpha(modifier, f2);
                                        TextFieldColors textFieldColors2 = textFieldColors;
                                        boolean z16 = z15;
                                        int i28 = i25;
                                        int i29 = i26;
                                        Function2<Composer, Integer, Unit> function221 = function220;
                                        composer4.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
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
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(alpha);
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
                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(1188063364);
                                        ComposerKt.sourceInformation(composer4, "C138@5709L25,139@5797L10,137@5647L247:TextFieldImpl.kt#jmzs0o");
                                        TextFieldImplKt.m1577DecorationeuL9pac(textFieldColors2.placeholderColor(z16, composer4, ((i28 >> 27) & 14) | ((i29 >> 6) & 112)).getValue().m2122unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function221, composer4, (i28 >> 6) & 7168, 4);
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                        }
                        final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1513getDefaultErrorMessageUdPEhr4(), composer3, 6);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Object valueOf = Boolean.valueOf(z12222);
                        final boolean z16 = z12222;
                        composer3.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed2 = composer3.changed(valueOf) | composer3.changed(m1518getString4foXLRw);
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    if (z16) {
                                        SemanticsPropertiesKt.error(semantics, m1518getString4foXLRw);
                                    }
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue2, 1, null);
                        if (colors instanceof TextFieldColorsWithIcons) {
                            composer3.startReplaceableGroup(-1083197894);
                            ComposerKt.sourceInformation(composer3, "153@6424L53");
                            TextFieldColorsWithIcons textFieldColorsWithIcons = (TextFieldColorsWithIcons) colors;
                            boolean z17 = z11222;
                            boolean z18 = z12222;
                            InteractionSource interactionSource2 = interactionSource;
                            int i27 = (i19222 >> 27) & 14;
                            int i28 = i20222;
                            m2122unboximpl = textFieldColorsWithIcons.leadingIconColor(z17, z18, interactionSource2, composer3, ((i28 << 3) & 896) | i27 | ((i28 << 3) & 112)).getValue().m2122unboximpl();
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(-1083197798);
                            ComposerKt.sourceInformation(composer3, "155@6520L34");
                            TextFieldColors textFieldColors2 = colors;
                            boolean z19 = z11222;
                            boolean z20 = z12222;
                            int i29 = (i19222 >> 27) & 14;
                            int i30 = i20222;
                            m2122unboximpl = textFieldColors2.leadingIconColor(z19, z20, composer3, i29 | ((i30 << 3) & 112) | ((i30 >> 3) & 896)).getValue().m2122unboximpl();
                            composer3.endReplaceableGroup();
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function221 = function216222;
                        ComposableLambda composableLambda3 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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

                            public final void invoke(Composer composer4, int i31) {
                                ComposerKt.sourceInformation(composer4, "C159@6690L57:TextFieldImpl.kt#jmzs0o");
                                if ((i31 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                } else {
                                    TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl, null, null, function221, composer4, 0, 6);
                                }
                            }
                        }) : null;
                        if (colors instanceof TextFieldColorsWithIcons) {
                            composer3.startReplaceableGroup(-1083197452);
                            ComposerKt.sourceInformation(composer3, "164@6866L54");
                            TextFieldColorsWithIcons textFieldColorsWithIcons2 = (TextFieldColorsWithIcons) colors;
                            boolean z21 = z11222;
                            boolean z22 = z12222;
                            InteractionSource interactionSource3 = interactionSource;
                            int i31 = (i19222 >> 27) & 14;
                            int i32 = i20222;
                            m2122unboximpl2 = textFieldColorsWithIcons2.trailingIconColor(z21, z22, interactionSource3, composer3, ((i32 << 3) & 896) | i31 | ((i32 << 3) & 112)).getValue().m2122unboximpl();
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(-1083197355);
                            ComposerKt.sourceInformation(composer3, "166@6963L35");
                            TextFieldColors textFieldColors3 = colors;
                            boolean z23 = z11222;
                            boolean z24 = z12222;
                            int i33 = (i19222 >> 27) & 14;
                            int i34 = i20222;
                            m2122unboximpl2 = textFieldColors3.trailingIconColor(z23, z24, composer3, i33 | ((i34 << 3) & 112) | ((i34 >> 3) & 896)).getValue().m2122unboximpl();
                            composer3.endReplaceableGroup();
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function222 = function217222;
                        ComposableLambda composableLambda4 = function222 != null ? ComposableLambdaKt.composableLambda(composer3, -1894727196, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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

                            public final void invoke(Composer composer4, int i35) {
                                ComposerKt.sourceInformation(composer4, "C170@7136L58:TextFieldImpl.kt#jmzs0o");
                                if ((i35 & 11) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                } else {
                                    TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl2, null, null, function222, composer4, 0, 6);
                                }
                            }
                        }) : null;
                        int i35 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                        if (i35 == 1) {
                            composer3.startReplaceableGroup(-1083197019);
                            ComposerKt.sourceInformation(composer3, "176@7296L485");
                            Function2<Composer, Integer, Unit> function223 = innerTextField;
                            boolean z25 = z13222;
                            PaddingValues paddingValues = contentPadding;
                            int i36 = i19222;
                            TextFieldKt.TextFieldLayout(semantics$default, function223, composableLambda, composableLambda2, composableLambda3, composableLambda4, z25, f, paddingValues, composer3, ((i20222 << 18) & 234881024) | ((i36 >> 6) & 3670016) | ((i36 >> 3) & 112) | ((i23 << 21) & 29360128));
                            composer3.endReplaceableGroup();
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        if (i35 == 2) {
                            composer3.startReplaceableGroup(-1083196463);
                            ComposerKt.sourceInformation(composer3, "190@7903L38,208@8711L420,200@8303L994");
                            composer3.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                            Object rememberedValue3 = composer3.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1928boximpl(Size.INSTANCE.m1949getZeroNHjbRc()), null, 2, null);
                                composer3.updateRememberedValue(rememberedValue3);
                            }
                            composer3.endReplaceableGroup();
                            final MutableState<Size> mutableState = (MutableState) rememberedValue3;
                            final PaddingValues paddingValues2 = contentPadding;
                            final Function2<? super Composer, ? super Integer, Unit> function224 = function215;
                            final int i37 = i20222;
                            ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer3, 139886979, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
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

                                public final void invoke(Composer composer4, int i38) {
                                    ComposerKt.sourceInformation(composer4, "C192@8021L246:TextFieldImpl.kt#jmzs0o");
                                    if ((i38 & 11) != 2 || !composer4.getSkipping()) {
                                        Modifier m1459outlineCutout12SF9DM = OutlinedTextFieldKt.m1459outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, OutlinedTextFieldKt.BorderId), mutableState.getValue().getPackedValue(), paddingValues2);
                                        Function2<Composer, Integer, Unit> function225 = function224;
                                        int i39 = i37;
                                        composer4.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
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
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m1459outlineCutout12SF9DM);
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
                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer4.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                        composer4.startReplaceableGroup(2058660585);
                                        composer4.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer4.startReplaceableGroup(1029492925);
                                        ComposerKt.sourceInformation(composer4, "C196@8237L8:TextFieldImpl.kt#jmzs0o");
                                        if (function225 != null) {
                                            function225.invoke(composer4, Integer.valueOf((i39 >> 12) & 14));
                                        }
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        composer4.endNode();
                                        composer4.endReplaceableGroup();
                                        composer4.endReplaceableGroup();
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            });
                            Function2<Composer, Integer, Unit> function225 = innerTextField;
                            ComposableLambda composableLambda6 = composableLambda2;
                            boolean z26 = z13222;
                            Object valueOf2 = Float.valueOf(f3);
                            composer3.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                            boolean changed3 = composer3.changed(valueOf2) | composer3.changed(mutableState);
                            Object rememberedValue4 = composer3.rememberedValue();
                            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = (Function1) new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                        m1579invokeuvyYCjk(size.getPackedValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                    public final void m1579invokeuvyYCjk(long j7) {
                                        float m1940getWidthimpl = Size.m1940getWidthimpl(j7) * f3;
                                        float m1937getHeightimpl = Size.m1937getHeightimpl(j7) * f3;
                                        if (Size.m1940getWidthimpl(mutableState.getValue().getPackedValue()) == m1940getWidthimpl && Size.m1937getHeightimpl(mutableState.getValue().getPackedValue()) == m1937getHeightimpl) {
                                            return;
                                        }
                                        mutableState.setValue(Size.m1928boximpl(SizeKt.Size(m1940getWidthimpl, m1937getHeightimpl)));
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue4);
                            }
                            composer3.endReplaceableGroup();
                            Function1 function1 = (Function1) rememberedValue4;
                            PaddingValues paddingValues3 = contentPadding;
                            int i38 = i19222;
                            ComposableLambda composableLambda7 = composableLambda;
                            OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function225, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z26, f3, function1, composableLambda5, paddingValues3, composer3, (3670016 & (i38 >> 6)) | ((i38 >> 3) & 112) | C.ENCODING_PCM_32BIT | (29360128 & (i23 << 21)), (i20222 >> 6) & 14);
                            composer3.endReplaceableGroup();
                            Unit unit2 = Unit.INSTANCE;
                            return;
                        }
                        composer3.startReplaceableGroup(-1083194976);
                        composer3.endReplaceableGroup();
                        Unit unit3 = Unit.INSTANCE;
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, 1769472);
            function28 = function217222;
            z5 = z12222;
            z6 = z13222;
            function29 = function215;
            z7 = z11222;
            function210 = function216222;
            function211 = function218222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i17;
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i6;
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i18222 = i12;
        if ((i3 & 4096) == 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        i13 = i3 & 16384;
        if (i13 == 0) {
        }
        i14 = i18222;
        if ((i4 & 1533916891) == 306783378) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(value) | startRestartGroup.changed(visualTransformation);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        final String text2222 = ((TransformedText) rememberedValue).getText().getText();
        if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i14 >> 3) & 14).getValue().booleanValue()) {
        }
        final boolean z112222 = z9;
        final int i192222 = i4;
        final boolean z122222 = z10;
        final int i202222 = i14;
        function3 = new Function3<InputPhase, Composer, Integer, Color>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$labelColor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase22222, Composer composer3, Integer num) {
                return Color.m2102boximpl(m1580invokeXeAY9LY(inputPhase22222, composer3, num.intValue()));
            }

            /* renamed from: invoke-XeAY9LY, reason: not valid java name */
            public final long m1580invokeXeAY9LY(InputPhase it, Composer composer3, int i21) {
                Intrinsics.checkNotNullParameter(it, "it");
                composer3.startReplaceableGroup(697243846);
                ComposerKt.sourceInformation(composer3, "C92@3610L273:TextFieldImpl.kt#jmzs0o");
                TextFieldColors textFieldColors = TextFieldColors.this;
                boolean z132222 = z112222;
                boolean z14 = it == InputPhase.UnfocusedEmpty ? false : z122222;
                InteractionSource interactionSource2 = interactionSource;
                int i22 = (i192222 >> 27) & 14;
                int i23 = i202222;
                long m2122unboximpl = textFieldColors.labelColor(z132222, z14, interactionSource2, composer3, i22 | ((i23 << 3) & 896) | (i23 & 7168)).getValue().m2122unboximpl();
                composer3.endReplaceableGroup();
                return m2122unboximpl;
            }
        };
        Typography typography2222 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
        TextStyle subtitle12222 = typography2222.getSubtitle1();
        TextStyle caption2222 = typography2222.getCaption();
        if (Color.m2113equalsimpl0(subtitle12222.m3969getColor0d7_KjU(), Color.INSTANCE.m2148getUnspecified0d7_KjU())) {
        }
        TextFieldTransitionScope textFieldTransitionScope2222 = TextFieldTransitionScope.INSTANCE;
        startRestartGroup.startReplaceableGroup(2129141006);
        ComposerKt.sourceInformation(startRestartGroup, "*110@4363L10,111@4455L22");
        m3969getColor0d7_KjU = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getCaption().m3969getColor0d7_KjU();
        if (z4) {
        }
        long j3222 = m3969getColor0d7_KjU;
        startRestartGroup.endReplaceableGroup();
        m3969getColor0d7_KjU2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getSubtitle1().m3969getColor0d7_KjU();
        if (z4) {
        }
        long j22222 = m3969getColor0d7_KjU2;
        final Function2<? super Composer, ? super Integer, Unit> function2162222 = function213;
        final Function2<? super Composer, ? super Integer, Unit> function2172222 = function214;
        final boolean z132222 = z8;
        InputPhase inputPhase22222 = inputPhase;
        final Function2<? super Composer, ? super Integer, Unit> function2182222 = function212;
        composer2 = startRestartGroup;
        textFieldTransitionScope2222.m1589TransitionDTcfvLk(inputPhase22222, j3222, j22222, function3, function2 != null, ComposableLambdaKt.composableLambda(startRestartGroup, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

            /* compiled from: TextFieldImpl.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextFieldType.values().length];
                    iArr[TextFieldType.Filled.ordinal()] = 1;
                    iArr[TextFieldType.Outlined.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(6);
            }

            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer3, Integer num) {
                m1578invokeRIQooxk(f.floatValue(), color.m2122unboximpl(), color2.m2122unboximpl(), f2.floatValue(), composer3, num.intValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-RIQooxk, reason: not valid java name */
            public final void m1578invokeRIQooxk(final float f, long j32222, final long j4, final float f2, Composer composer3, int i21) {
                int i22;
                long j5;
                int i23;
                final float f3;
                ComposableLambda composableLambda;
                ComposableLambda composableLambda2;
                final long m2122unboximpl;
                final long m2122unboximpl2;
                ComposerKt.sourceInformation(composer3, "CP(1,2:c#ui.graphics.Color,0:c#ui.graphics.Color)149@6201L30,150@6287L43:TextFieldImpl.kt#jmzs0o");
                if ((i21 & 14) == 0) {
                    i22 = (composer3.changed(f) ? 4 : 2) | i21;
                } else {
                    i22 = i21;
                }
                if ((i21 & 112) == 0) {
                    j5 = j32222;
                    i22 |= composer3.changed(j5) ? 32 : 16;
                } else {
                    j5 = j32222;
                }
                if ((i21 & 896) == 0) {
                    i22 |= composer3.changed(j4) ? 256 : 128;
                }
                if ((i21 & 7168) == 0) {
                    i22 |= composer3.changed(f2) ? 2048 : 1024;
                }
                if ((46811 & i22) != 9362 || !composer3.getSkipping()) {
                    final Function2<? super Composer, ? super Integer, Unit> function219 = function2;
                    if (function219 != null) {
                        final boolean z14 = z4;
                        final int i24 = i22;
                        final long j6 = j5;
                        f3 = f;
                        i23 = i24;
                        composableLambda = ComposableLambdaKt.composableLambda(composer3, 362863774, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                            public final void invoke(Composer composer4, int i25) {
                                ComposerKt.sourceInformation(composer4, "C*123@5027L10,124@5083L10,129@5294L55:TextFieldImpl.kt#jmzs0o");
                                if ((i25 & 11) != 2 || !composer4.getSkipping()) {
                                    TextStyle lerp = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getCaption(), f);
                                    boolean z15 = z14;
                                    long j7 = j6;
                                    if (z15) {
                                        lerp = TextStyle.m3948copyHL5avdY$default(lerp, j7, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 262142, null);
                                    }
                                    TextFieldImplKt.m1577DecorationeuL9pac(j4, lerp, null, function219, composer4, ((i24 >> 6) & 14) | RendererCapabilities.MODE_SUPPORT_MASK, 0);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                    } else {
                        i23 = i22;
                        f3 = f;
                        composableLambda = null;
                    }
                    if (function2182222 == null || text2222.length() != 0) {
                        composableLambda2 = null;
                    } else {
                        final TextFieldColors textFieldColors = colors;
                        final boolean z15 = z112222;
                        final int i25 = i192222;
                        final int i26 = i202222;
                        final Function2<? super Composer, ? super Integer, Unit> function220 = function2182222;
                        composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 1120552650, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer4, Integer num) {
                                invoke(modifier, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Modifier modifier, Composer composer4, int i27) {
                                Intrinsics.checkNotNullParameter(modifier, "modifier");
                                ComposerKt.sourceInformation(composer4, "C136@5575L341:TextFieldImpl.kt#jmzs0o");
                                if ((i27 & 14) == 0) {
                                    i27 |= composer4.changed(modifier) ? 4 : 2;
                                }
                                if ((i27 & 91) != 18 || !composer4.getSkipping()) {
                                    Modifier alpha = AlphaKt.alpha(modifier, f2);
                                    TextFieldColors textFieldColors2 = textFieldColors;
                                    boolean z16 = z15;
                                    int i28 = i25;
                                    int i29 = i26;
                                    Function2<Composer, Integer, Unit> function221 = function220;
                                    composer4.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer4, 0);
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
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(alpha);
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
                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer4.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(1188063364);
                                    ComposerKt.sourceInformation(composer4, "C138@5709L25,139@5797L10,137@5647L247:TextFieldImpl.kt#jmzs0o");
                                    TextFieldImplKt.m1577DecorationeuL9pac(textFieldColors2.placeholderColor(z16, composer4, ((i28 >> 27) & 14) | ((i29 >> 6) & 112)).getValue().m2122unboximpl(), MaterialTheme.INSTANCE.getTypography(composer4, 6).getSubtitle1(), null, function221, composer4, (i28 >> 6) & 7168, 4);
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                    }
                    final String m1518getString4foXLRw = Strings_androidKt.m1518getString4foXLRw(Strings.INSTANCE.m1513getDefaultErrorMessageUdPEhr4(), composer3, 6);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Object valueOf = Boolean.valueOf(z122222);
                    final boolean z16 = z122222;
                    composer3.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                    boolean changed2 = composer3.changed(valueOf) | composer3.changed(m1518getString4foXLRw);
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                if (z16) {
                                    SemanticsPropertiesKt.error(semantics, m1518getString4foXLRw);
                                }
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    composer3.endReplaceableGroup();
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue2, 1, null);
                    if (colors instanceof TextFieldColorsWithIcons) {
                        composer3.startReplaceableGroup(-1083197894);
                        ComposerKt.sourceInformation(composer3, "153@6424L53");
                        TextFieldColorsWithIcons textFieldColorsWithIcons = (TextFieldColorsWithIcons) colors;
                        boolean z17 = z112222;
                        boolean z18 = z122222;
                        InteractionSource interactionSource2 = interactionSource;
                        int i27 = (i192222 >> 27) & 14;
                        int i28 = i202222;
                        m2122unboximpl = textFieldColorsWithIcons.leadingIconColor(z17, z18, interactionSource2, composer3, ((i28 << 3) & 896) | i27 | ((i28 << 3) & 112)).getValue().m2122unboximpl();
                        composer3.endReplaceableGroup();
                    } else {
                        composer3.startReplaceableGroup(-1083197798);
                        ComposerKt.sourceInformation(composer3, "155@6520L34");
                        TextFieldColors textFieldColors2 = colors;
                        boolean z19 = z112222;
                        boolean z20 = z122222;
                        int i29 = (i192222 >> 27) & 14;
                        int i30 = i202222;
                        m2122unboximpl = textFieldColors2.leadingIconColor(z19, z20, composer3, i29 | ((i30 << 3) & 112) | ((i30 >> 3) & 896)).getValue().m2122unboximpl();
                        composer3.endReplaceableGroup();
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function221 = function2162222;
                    ComposableLambda composableLambda3 = function221 != null ? ComposableLambdaKt.composableLambda(composer3, 1505327088, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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

                        public final void invoke(Composer composer4, int i31) {
                            ComposerKt.sourceInformation(composer4, "C159@6690L57:TextFieldImpl.kt#jmzs0o");
                            if ((i31 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                            } else {
                                TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl, null, null, function221, composer4, 0, 6);
                            }
                        }
                    }) : null;
                    if (colors instanceof TextFieldColorsWithIcons) {
                        composer3.startReplaceableGroup(-1083197452);
                        ComposerKt.sourceInformation(composer3, "164@6866L54");
                        TextFieldColorsWithIcons textFieldColorsWithIcons2 = (TextFieldColorsWithIcons) colors;
                        boolean z21 = z112222;
                        boolean z22 = z122222;
                        InteractionSource interactionSource3 = interactionSource;
                        int i31 = (i192222 >> 27) & 14;
                        int i32 = i202222;
                        m2122unboximpl2 = textFieldColorsWithIcons2.trailingIconColor(z21, z22, interactionSource3, composer3, ((i32 << 3) & 896) | i31 | ((i32 << 3) & 112)).getValue().m2122unboximpl();
                        composer3.endReplaceableGroup();
                    } else {
                        composer3.startReplaceableGroup(-1083197355);
                        ComposerKt.sourceInformation(composer3, "166@6963L35");
                        TextFieldColors textFieldColors3 = colors;
                        boolean z23 = z112222;
                        boolean z24 = z122222;
                        int i33 = (i192222 >> 27) & 14;
                        int i34 = i202222;
                        m2122unboximpl2 = textFieldColors3.trailingIconColor(z23, z24, composer3, i33 | ((i34 << 3) & 112) | ((i34 >> 3) & 896)).getValue().m2122unboximpl();
                        composer3.endReplaceableGroup();
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function222 = function2172222;
                    ComposableLambda composableLambda4 = function222 != null ? ComposableLambdaKt.composableLambda(composer3, -1894727196, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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

                        public final void invoke(Composer composer4, int i35) {
                            ComposerKt.sourceInformation(composer4, "C170@7136L58:TextFieldImpl.kt#jmzs0o");
                            if ((i35 & 11) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                            } else {
                                TextFieldImplKt.m1577DecorationeuL9pac(m2122unboximpl2, null, null, function222, composer4, 0, 6);
                            }
                        }
                    }) : null;
                    int i35 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i35 == 1) {
                        composer3.startReplaceableGroup(-1083197019);
                        ComposerKt.sourceInformation(composer3, "176@7296L485");
                        Function2<Composer, Integer, Unit> function223 = innerTextField;
                        boolean z25 = z132222;
                        PaddingValues paddingValues = contentPadding;
                        int i36 = i192222;
                        TextFieldKt.TextFieldLayout(semantics$default, function223, composableLambda, composableLambda2, composableLambda3, composableLambda4, z25, f, paddingValues, composer3, ((i202222 << 18) & 234881024) | ((i36 >> 6) & 3670016) | ((i36 >> 3) & 112) | ((i23 << 21) & 29360128));
                        composer3.endReplaceableGroup();
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                    if (i35 == 2) {
                        composer3.startReplaceableGroup(-1083196463);
                        ComposerKt.sourceInformation(composer3, "190@7903L38,208@8711L420,200@8303L994");
                        composer3.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m1928boximpl(Size.INSTANCE.m1949getZeroNHjbRc()), null, 2, null);
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        composer3.endReplaceableGroup();
                        final MutableState<Size> mutableState = (MutableState) rememberedValue3;
                        final PaddingValues paddingValues2 = contentPadding;
                        final Function2<? super Composer, ? super Integer, Unit> function224 = function215;
                        final int i37 = i202222;
                        ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer3, 139886979, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
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

                            public final void invoke(Composer composer4, int i38) {
                                ComposerKt.sourceInformation(composer4, "C192@8021L246:TextFieldImpl.kt#jmzs0o");
                                if ((i38 & 11) != 2 || !composer4.getSkipping()) {
                                    Modifier m1459outlineCutout12SF9DM = OutlinedTextFieldKt.m1459outlineCutout12SF9DM(LayoutIdKt.layoutId(Modifier.INSTANCE, OutlinedTextFieldKt.BorderId), mutableState.getValue().getPackedValue(), paddingValues2);
                                    Function2<Composer, Integer, Unit> function225 = function224;
                                    int i39 = i37;
                                    composer4.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer4, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer4, 48);
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
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m1459outlineCutout12SF9DM);
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
                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer4.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    composer4.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer4, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(1029492925);
                                    ComposerKt.sourceInformation(composer4, "C196@8237L8:TextFieldImpl.kt#jmzs0o");
                                    if (function225 != null) {
                                        function225.invoke(composer4, Integer.valueOf((i39 >> 12) & 14));
                                    }
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        });
                        Function2<Composer, Integer, Unit> function225 = innerTextField;
                        ComposableLambda composableLambda6 = composableLambda2;
                        boolean z26 = z132222;
                        Object valueOf2 = Float.valueOf(f3);
                        composer3.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed3 = composer3.changed(valueOf2) | composer3.changed(mutableState);
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                    m1579invokeuvyYCjk(size.getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                public final void m1579invokeuvyYCjk(long j7) {
                                    float m1940getWidthimpl = Size.m1940getWidthimpl(j7) * f3;
                                    float m1937getHeightimpl = Size.m1937getHeightimpl(j7) * f3;
                                    if (Size.m1940getWidthimpl(mutableState.getValue().getPackedValue()) == m1940getWidthimpl && Size.m1937getHeightimpl(mutableState.getValue().getPackedValue()) == m1937getHeightimpl) {
                                        return;
                                    }
                                    mutableState.setValue(Size.m1928boximpl(SizeKt.Size(m1940getWidthimpl, m1937getHeightimpl)));
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        composer3.endReplaceableGroup();
                        Function1 function1 = (Function1) rememberedValue4;
                        PaddingValues paddingValues3 = contentPadding;
                        int i38 = i192222;
                        ComposableLambda composableLambda7 = composableLambda;
                        OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function225, composableLambda6, composableLambda7, composableLambda3, composableLambda4, z26, f3, function1, composableLambda5, paddingValues3, composer3, (3670016 & (i38 >> 6)) | ((i38 >> 3) & 112) | C.ENCODING_PCM_32BIT | (29360128 & (i23 << 21)), (i202222 >> 6) & 14);
                        composer3.endReplaceableGroup();
                        Unit unit2 = Unit.INSTANCE;
                        return;
                    }
                    composer3.startReplaceableGroup(-1083194976);
                    composer3.endReplaceableGroup();
                    Unit unit3 = Unit.INSTANCE;
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, 1769472);
        function28 = function2172222;
        z5 = z122222;
        z6 = z132222;
        function29 = function215;
        z7 = z112222;
        function210 = function2162222;
        function211 = function2182222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m1577DecorationeuL9pac(final long j, TextStyle textStyle, Float f, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final Float f2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-399493340);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)P(2:c#ui.graphics.Color,3,1):TextFieldImpl.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
        }
        final int i6 = i3;
        if ((i6 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                textStyle = null;
            }
            final Float f3 = i5 != 0 ? null : f;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 494684590, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
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

                public final void invoke(Composer composer2, int i7) {
                    ComposerKt.sourceInformation(composer2, "C238@9719L476:TextFieldImpl.kt#jmzs0o");
                    if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j))};
                        final Float f4 = f3;
                        final Function2<Composer, Integer, Unit> function2 = content;
                        final int i8 = i6;
                        final long j2 = j;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
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
                                ComposerKt.sourceInformation(composer3, "C:TextFieldImpl.kt#jmzs0o");
                                if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                                    if (f4 != null) {
                                        composer3.startReplaceableGroup(-452622131);
                                        ComposerKt.sourceInformation(composer3, "240@9843L142");
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(f4)}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.startReplaceableGroup(-452621951);
                                    ComposerKt.sourceInformation(composer3, "245@10023L148");
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(j2)))}, function2, composer3, ((i8 >> 6) & 112) | 8);
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 56);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            });
            if (textStyle != null) {
                startRestartGroup.startReplaceableGroup(-2009952864);
                ComposerKt.sourceInformation(startRestartGroup, "252@10230L46");
                TextKt.ProvideTextStyle(textStyle, composableLambda, startRestartGroup, ((i6 >> 3) & 14) | 48);
            } else {
                startRestartGroup.startReplaceableGroup(-2009952812);
                ComposerKt.sourceInformation(startRestartGroup, "252@10282L18");
                composableLambda.invoke(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceableGroup();
            f2 = f3;
        } else {
            startRestartGroup.skipToGroupEnd();
            f2 = f;
        }
        final TextStyle textStyle2 = textStyle;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
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

            public final void invoke(Composer composer2, int i7) {
                TextFieldImplKt.m1577DecorationeuL9pac(j, textStyle2, f2, content, composer2, i | 1, i2);
            }
        });
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = 48;
        IconDefaultSizeModifier = androidx.compose.foundation.layout.SizeKt.m618defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(f));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }
}
