package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JS\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J×\u0001\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+H\u0007¢\u0006\u0002\u00106JÂ\u0001\u00107\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00190*¢\u0006\u0002\b+2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010*¢\u0006\u0002\b+2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u00103\u001a\u000204H\u0007¢\u0006\u0002\u00108Jç\u0001\u00109\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010@\u001a\u00020;2\b\b\u0002\u0010A\u001a\u00020;2\b\b\u0002\u0010B\u001a\u00020;2\b\b\u0002\u0010C\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJ=\u0010R\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010XJç\u0001\u0010Y\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020;2\b\b\u0002\u0010?\u001a\u00020;2\b\b\u0002\u0010Z\u001a\u00020;2\b\b\u0002\u0010[\u001a\u00020;2\b\b\u0002\u0010\\\u001a\u00020;2\b\b\u0002\u0010]\u001a\u00020;2\b\b\u0002\u0010D\u001a\u00020;2\b\b\u0002\u0010E\u001a\u00020;2\b\b\u0002\u0010F\u001a\u00020;2\b\b\u0002\u0010G\u001a\u00020;2\b\b\u0002\u0010H\u001a\u00020;2\b\b\u0002\u0010I\u001a\u00020;2\b\b\u0002\u0010J\u001a\u00020;2\b\b\u0002\u0010K\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020;2\b\b\u0002\u0010M\u001a\u00020;2\b\b\u0002\u0010N\u001a\u00020;2\b\b\u0002\u0010O\u001a\u00020;H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010QJ=\u0010_\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b`\u0010XJ=\u0010a\u001a\u0002042\b\b\u0002\u0010S\u001a\u00020\u00062\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\b\b\u0002\u0010V\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010XJM\u0010c\u001a\u00020d*\u00020d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010e\u001a\u00020\u00062\b\b\u0002\u0010f\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bg\u0010hR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "()V", "BackgroundOpacity", "", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "IconOpacity", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedTextFieldShape", "Landroidx/compose/ui/graphics/Shape;", "getOutlinedTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getTextFieldShape", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorLineOpacity", "BorderBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "Landroidx/compose/material/TextFieldColors;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "OutlinedTextFieldDecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", OutlinedTextFieldKt.BorderId, "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", "outlinedTextFieldColors", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "outlinedTextFieldPadding", TtmlNode.START, "top", TtmlNode.END, "bottom", "outlinedTextFieldPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-dx8h9Zs", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "Landroidx/compose/ui/Modifier;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldDefaults {
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m4440constructorimpl(56);
    private static final float MinWidth = Dp.m4440constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m4440constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m4440constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1565getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1566getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final Shape getTextFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1117199624, "C214@7704L6:TextFieldDefaults.kt#jmzs0o");
        CornerBasedShape copy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        ComposerKt.sourceInformationMarkerEnd(composer);
        return copy$default;
    }

    public final Shape getOutlinedTextFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1899109048, "C223@8006L6:TextFieldDefaults.kt#jmzs0o");
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        ComposerKt.sourceInformationMarkerEnd(composer);
        return small;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1567getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1564getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1559indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z, boolean z2, InteractionSource interactionSource, TextFieldColors textFieldColors, float f, float f2, int i, Object obj) {
        if ((i & 16) != 0) {
            f = FocusedBorderThickness;
        }
        return textFieldDefaults.m1568indicatorLinegv0btCI(modifier, z, z2, interactionSource, textFieldColors, f, (i & 32) != 0 ? UnfocusedBorderThickness : f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        if ((r28 & 64) != 0) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0063  */
    @ExperimentalMaterialApi
    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1563BorderBoxnbWgWpA(final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors colors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        Shape shape2;
        float f3;
        float f4;
        State m1575animateBorderStrokeAsStateNuRrP5Q;
        Composer composer2;
        final float f5;
        final float f6;
        final Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(943754022);
        ComposerKt.sourceInformation(startRestartGroup, "C(BorderBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)313@11762L22,317@11946L203,325@12158L47:TextFieldDefaults.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 14) == 0) {
            z3 = z;
            i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(colors) ? 2048 : 1024;
            }
            if ((i & 57344) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    shape2 = shape;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                shape2 = shape;
            }
            if ((i & 458752) != 0) {
                if ((i2 & 32) == 0) {
                    f3 = f;
                    if (startRestartGroup.changed(f3)) {
                        i6 = 131072;
                        i3 |= i6;
                    }
                } else {
                    f3 = f;
                }
                i6 = 65536;
                i3 |= i6;
            } else {
                f3 = f;
            }
            if ((3670016 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f4 = f2;
                    if (startRestartGroup.changed(f4)) {
                        i5 = 1048576;
                        i3 |= i5;
                    }
                } else {
                    f4 = f2;
                }
                i5 = 524288;
                i3 |= i5;
            } else {
                f4 = f2;
            }
            if ((i2 & 128) != 0) {
                i4 = (29360128 & i) == 0 ? startRestartGroup.changed(this) ? 8388608 : 4194304 : 12582912;
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if ((i2 & 16) != 0) {
                            shape2 = getOutlinedTextFieldShape(startRestartGroup, (i3 >> 21) & 14);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            f3 = FocusedBorderThickness;
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            f4 = UnfocusedBorderThickness;
                            i3 &= -3670017;
                        }
                        float f7 = f3;
                        Shape shape4 = shape2;
                        float f8 = f4;
                        startRestartGroup.endDefaults();
                        int i8 = i3 & 8190;
                        int i9 = i3 >> 3;
                        m1575animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1575animateBorderStrokeAsStateNuRrP5Q(z3, z2, interactionSource, colors, f7, f8, startRestartGroup, (57344 & i9) | i8 | (i9 & 458752));
                        BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) m1575animateBorderStrokeAsStateNuRrP5Q.getValue(), shape4), startRestartGroup, 0);
                        composer2 = startRestartGroup;
                        f5 = f8;
                        f6 = f7;
                        shape3 = shape4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    shape3 = shape2;
                    f6 = f3;
                    f5 = f4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$BorderBox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i10) {
                        TextFieldDefaults.this.m1563BorderBoxnbWgWpA(z, z2, interactionSource, colors, shape3, f6, f5, composer3, i | 1, i2);
                    }
                });
                return;
            }
            i3 |= i4;
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            float f72 = f3;
            Shape shape42 = shape2;
            float f82 = f4;
            startRestartGroup.endDefaults();
            int i82 = i3 & 8190;
            int i92 = i3 >> 3;
            m1575animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1575animateBorderStrokeAsStateNuRrP5Q(z3, z2, interactionSource, colors, f72, f82, startRestartGroup, (57344 & i92) | i82 | (i92 & 458752));
            BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) m1575animateBorderStrokeAsStateNuRrP5Q.getValue(), shape42), startRestartGroup, 0);
            composer2 = startRestartGroup;
            f5 = f82;
            f6 = f72;
            shape3 = shape42;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i3 |= i4;
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        float f722 = f3;
        Shape shape422 = shape2;
        float f822 = f4;
        startRestartGroup.endDefaults();
        int i822 = i3 & 8190;
        int i922 = i3 >> 3;
        m1575animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1575animateBorderStrokeAsStateNuRrP5Q(z3, z2, interactionSource, colors, f722, f822, startRestartGroup, (57344 & i922) | i822 | (i922 & 458752));
        BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) m1575animateBorderStrokeAsStateNuRrP5Q.getValue(), shape422), startRestartGroup, 0);
        composer2 = startRestartGroup;
        f5 = f822;
        f6 = f722;
        shape3 = shape422;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1561textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1572textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterialApi
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1572textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m581PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1562textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1573textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterialApi
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1573textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m581PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1560outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1570outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    @ExperimentalMaterialApi
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1570outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m581PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1571textFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        composer.startReplaceableGroup(231892599);
        ComposerKt.sourceInformation(composer, "C(textFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)376@14082L7,376@14113L7,377@14186L8,378@14244L6,379@14337L6,380@14401L6,382@14480L6,382@14521L4,384@14595L6,385@14747L8,386@14809L6,388@14883L6,389@15012L8,392@15141L6,393@15272L8,394@15337L6,396@15412L6,396@15453L4,397@15511L6,397@15546L6,398@15629L8,399@15687L6,400@15749L6,400@15784L6,401@15870L8:TextFieldDefaults.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m2122unboximpl = ((Color) consume).m2122unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            j22 = Color.m2111copywmQWz5c$default(m2122unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j;
        }
        long m2111copywmQWz5c$default = (i4 & 2) != 0 ? Color.m2111copywmQWz5c$default(j22, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m2111copywmQWz5c$default2 = (i4 & 4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1324getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU() : j4;
        long m1318getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j5;
        long m2111copywmQWz5c$default3 = (i4 & 32) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m2111copywmQWz5c$default4 = (i4 & 64) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j31 = m2111copywmQWz5c$default4;
            j23 = j31;
            j24 = Color.m2111copywmQWz5c$default(j31, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = m2111copywmQWz5c$default4;
            j24 = j8;
        }
        long m1318getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j9;
        long m2111copywmQWz5c$default5 = (i4 & 512) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j32 = m2111copywmQWz5c$default5;
            j26 = Color.m2111copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j32;
        } else {
            j25 = m2111copywmQWz5c$default5;
            j26 = j11;
        }
        long j33 = (i4 & 2048) != 0 ? j25 : j12;
        long m2111copywmQWz5c$default6 = (i4 & 4096) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i4 & 8192) != 0) {
            long j34 = m2111copywmQWz5c$default6;
            j28 = Color.m2111copywmQWz5c$default(j34, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j34;
        } else {
            j27 = m2111copywmQWz5c$default6;
            j28 = j14;
        }
        long m1318getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j15;
        long m2111copywmQWz5c$default7 = (32768 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m2111copywmQWz5c$default8 = (65536 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((131072 & i4) != 0) {
            long j35 = m2111copywmQWz5c$default8;
            j30 = Color.m2111copywmQWz5c$default(j35, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j29 = j35;
        } else {
            j29 = m2111copywmQWz5c$default8;
            j30 = j18;
        }
        long m1318getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j19;
        long m2111copywmQWz5c$default9 = (524288 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(j22, m2111copywmQWz5c$default, m1324getPrimary0d7_KjU, m1318getError0d7_KjU, m2111copywmQWz5c$default3, j23, m1318getError0d7_KjU2, j24, j25, j26, j33, j27, j28, m1318getError0d7_KjU3, m2111copywmQWz5c$default2, m2111copywmQWz5c$default7, j29, j30, m1318getError0d7_KjU4, m2111copywmQWz5c$default9, (i4 & 1048576) != 0 ? Color.m2111copywmQWz5c$default(m2111copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    /* renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1569outlinedTextFieldColorsdx8h9Zs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        composer.startReplaceableGroup(1762667317);
        ComposerKt.sourceInformation(composer, "C(outlinedTextFieldColors)P(17:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,13:c#ui.graphics.Color,19:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,15:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,18:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,20:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,16:c#ui.graphics.Color,5:c#ui.graphics.Color)434@17398L7,434@17429L7,435@17502L8,437@17608L6,438@17672L6,440@17748L6,440@17789L4,442@17860L6,442@17903L8,443@17998L8,444@18057L6,446@18131L6,447@18260L8,450@18389L6,451@18520L8,452@18585L6,454@18660L6,454@18701L4,455@18759L6,455@18794L6,456@18877L8,457@18935L6,458@18997L6,458@19032L6,459@19118L8:TextFieldDefaults.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m2122unboximpl = ((Color) consume).m2122unboximpl();
            ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localContentAlpha);
            ComposerKt.sourceInformationMarkerEnd(composer);
            j22 = Color.m2111copywmQWz5c$default(m2122unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j22 = j;
        }
        long m2111copywmQWz5c$default = (i4 & 2) != 0 ? Color.m2111copywmQWz5c$default(j22, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m2147getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.INSTANCE.m2147getTransparent0d7_KjU() : j3;
        long m1324getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU() : j4;
        long m1318getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j5;
        long m2111copywmQWz5c$default2 = (i4 & 32) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m2111copywmQWz5c$default3 = (i4 & 64) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if ((i4 & 128) != 0) {
            long j31 = m2111copywmQWz5c$default3;
            j23 = j31;
            j24 = Color.m2111copywmQWz5c$default(j31, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = m2111copywmQWz5c$default3;
            j24 = j8;
        }
        long m1318getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j9;
        long m2111copywmQWz5c$default4 = (i4 & 512) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i4 & 1024) != 0) {
            long j32 = m2111copywmQWz5c$default4;
            j26 = Color.m2111copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j32;
        } else {
            j25 = m2111copywmQWz5c$default4;
            j26 = j11;
        }
        long j33 = (i4 & 2048) != 0 ? j25 : j12;
        long m2111copywmQWz5c$default5 = (i4 & 4096) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i4 & 8192) != 0) {
            long j34 = m2111copywmQWz5c$default5;
            j28 = Color.m2111copywmQWz5c$default(j34, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j34;
        } else {
            j27 = m2111copywmQWz5c$default5;
            j28 = j14;
        }
        long m1318getError0d7_KjU3 = (i4 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j15;
        long m2111copywmQWz5c$default6 = (32768 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1324getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long m2111copywmQWz5c$default7 = (65536 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((131072 & i4) != 0) {
            long j35 = m2111copywmQWz5c$default7;
            j30 = Color.m2111copywmQWz5c$default(j35, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j29 = j35;
        } else {
            j29 = m2111copywmQWz5c$default7;
            j30 = j18;
        }
        long m1318getError0d7_KjU4 = (262144 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1318getError0d7_KjU() : j19;
        long m2111copywmQWz5c$default8 = (524288 & i4) != 0 ? Color.m2111copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1323getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(j22, m2111copywmQWz5c$default, m1324getPrimary0d7_KjU, m1318getError0d7_KjU, m2111copywmQWz5c$default2, j23, m1318getError0d7_KjU2, j24, j25, j26, j33, j27, j28, m1318getError0d7_KjU3, m2147getTransparent0d7_KjU, m2111copywmQWz5c$default6, j29, j30, m1318getError0d7_KjU4, m2111copywmQWz5c$default8, (i4 & 1048576) != 0 ? Color.m2111copywmQWz5c$default(m2111copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21, null);
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x033f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0296  */
    @ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void TextFieldDecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> innerTextField, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i14;
        final TextFieldColors textFieldColors3;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Function2<? super Composer, ? super Integer, Unit> function210;
        PaddingValues m1561textFieldWithLabelPaddinga9UjIt4$default;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final boolean z6;
        final PaddingValues paddingValues3;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        ScopeUpdateScope endRestartGroup;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(1171040065);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldDecorationBox)P(11,3,2,9,12,4,5,6,8,7,10)553@25007L17,561@25241L569:TextFieldDefaults.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(innerTextField) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                        z4 = z3;
                    } else {
                        z4 = z3;
                        if ((i & 3670016) == 0) {
                            i4 |= startRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                        function25 = function2;
                    } else {
                        function25 = function2;
                        if ((i & 29360128) == 0) {
                            i4 |= startRestartGroup.changed(function25) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                        function26 = function22;
                    } else {
                        function26 = function22;
                        if ((i & 234881024) == 0) {
                            i4 |= startRestartGroup.changed(function26) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(function23) ? 536870912 : 268435456;
                        i11 = i3 & 1024;
                        if (i11 != 0) {
                            i13 = i2 | 6;
                            i12 = i11;
                        } else if ((i2 & 14) == 0) {
                            i12 = i11;
                            i13 = i2 | (startRestartGroup.changed(function24) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i2;
                        }
                        if ((i2 & 112) == 0) {
                            if ((i3 & 2048) == 0 && startRestartGroup.changed(textFieldColors)) {
                                i16 = 32;
                                i13 |= i16;
                            }
                            i16 = 16;
                            i13 |= i16;
                        }
                        if ((i2 & 896) == 0) {
                            if ((i3 & 4096) == 0 && startRestartGroup.changed(paddingValues)) {
                                i15 = 256;
                                i13 |= i15;
                            }
                            i15 = 128;
                            i13 |= i15;
                        }
                        int i17 = i13;
                        if ((i3 & 8192) != 0) {
                            i17 |= 3072;
                        } else if ((i2 & 7168) == 0) {
                            i17 |= startRestartGroup.changed(this) ? 2048 : 1024;
                            if ((i4 & 1533916891) == 306783378 || (i17 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z7 = i6 == 0 ? false : z4;
                                    Function2<? super Composer, ? super Integer, Unit> function215 = i7 == 0 ? null : function25;
                                    Function2<? super Composer, ? super Integer, Unit> function216 = i8 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function217 = i10 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function218 = i12 == 0 ? function24 : null;
                                    if ((i3 & 2048) == 0) {
                                        composer2 = startRestartGroup;
                                        textFieldColors2 = m1571textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 0, 0, (i17 >> 6) & 112, 2097151);
                                        i17 &= -113;
                                    } else {
                                        composer2 = startRestartGroup;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    if ((i3 & 4096) == 0) {
                                        if (function215 == null) {
                                            m1561textFieldWithLabelPaddinga9UjIt4$default = m1562textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        } else {
                                            m1561textFieldWithLabelPaddinga9UjIt4$default = m1561textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        }
                                        i17 &= -897;
                                        z5 = z7;
                                        function27 = function218;
                                        i14 = i4;
                                        paddingValues2 = m1561textFieldWithLabelPaddinga9UjIt4$default;
                                    } else {
                                        paddingValues2 = paddingValues;
                                        z5 = z7;
                                        function27 = function218;
                                        i14 = i4;
                                    }
                                    textFieldColors3 = textFieldColors2;
                                    function28 = function215;
                                    function29 = function216;
                                    function210 = function217;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 2048) != 0) {
                                        i17 &= -113;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i17 &= -897;
                                    }
                                    function27 = function24;
                                    textFieldColors3 = textFieldColors;
                                    i14 = i4;
                                    z5 = z4;
                                    function28 = function25;
                                    function29 = function26;
                                    composer2 = startRestartGroup;
                                    function210 = function23;
                                    paddingValues2 = paddingValues;
                                }
                                composer2.endDefaults();
                                int i18 = i14 << 3;
                                int i19 = i14 >> 9;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function28, function29, function210, function27, z2, z, z5, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i18 & 896) | (i18 & 112) | 6 | ((i14 >> 3) & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | ((i17 << 21) & 29360128) | ((i14 << 15) & 234881024) | ((i14 << 21) & 1879048192), ((i14 >> 12) & 112) | ((i14 >> 18) & 14) | (i17 & 896) | ((i17 << 6) & 7168), 16384);
                                function211 = function28;
                                function212 = function210;
                                z6 = z5;
                                paddingValues3 = paddingValues2;
                                function213 = function29;
                                function214 = function27;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function212 = function23;
                                textFieldColors3 = textFieldColors;
                                z6 = z4;
                                function211 = function25;
                                function213 = function26;
                                function214 = function24;
                                paddingValues3 = paddingValues;
                                composer2 = startRestartGroup;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
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

                                public final void invoke(Composer composer3, int i20) {
                                    TextFieldDefaults.this.TextFieldDecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z6, function211, function213, function212, function214, textFieldColors3, paddingValues3, composer3, i | 1, i2, i3);
                                }
                            });
                            return;
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        if ((i3 & 4096) == 0) {
                        }
                        textFieldColors3 = textFieldColors2;
                        function28 = function215;
                        function29 = function216;
                        function210 = function217;
                        composer2.endDefaults();
                        int i182 = i14 << 3;
                        int i192 = i14 >> 9;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function28, function29, function210, function27, z2, z, z5, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i182 & 896) | (i182 & 112) | 6 | ((i14 >> 3) & 7168) | (i192 & 57344) | (i192 & 458752) | (i192 & 3670016) | ((i17 << 21) & 29360128) | ((i14 << 15) & 234881024) | ((i14 << 21) & 1879048192), ((i14 >> 12) & 112) | ((i14 >> 18) & 14) | (i17 & 896) | ((i17 << 6) & 7168), 16384);
                        function211 = function28;
                        function212 = function210;
                        z6 = z5;
                        paddingValues3 = paddingValues2;
                        function213 = function29;
                        function214 = function27;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 1024;
                    if (i11 != 0) {
                    }
                    if ((i2 & 112) == 0) {
                    }
                    if ((i2 & 896) == 0) {
                    }
                    int i172 = i13;
                    if ((i3 & 8192) != 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    if ((i3 & 4096) == 0) {
                    }
                    textFieldColors3 = textFieldColors2;
                    function28 = function215;
                    function29 = function216;
                    function210 = function217;
                    composer2.endDefaults();
                    int i1822 = i14 << 3;
                    int i1922 = i14 >> 9;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function28, function29, function210, function27, z2, z, z5, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i1822 & 896) | (i1822 & 112) | 6 | ((i14 >> 3) & 7168) | (i1922 & 57344) | (i1922 & 458752) | (i1922 & 3670016) | ((i172 << 21) & 29360128) | ((i14 << 15) & 234881024) | ((i14 << 21) & 1879048192), ((i14 >> 12) & 112) | ((i14 >> 18) & 14) | (i172 & 896) | ((i172 << 6) & 7168), 16384);
                    function211 = function28;
                    function212 = function210;
                    z6 = z5;
                    paddingValues3 = paddingValues2;
                    function213 = function29;
                    function214 = function27;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 1024;
                if (i11 != 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                int i1722 = i13;
                if ((i3 & 8192) != 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                textFieldColors3 = textFieldColors2;
                function28 = function215;
                function29 = function216;
                function210 = function217;
                composer2.endDefaults();
                int i18222 = i14 << 3;
                int i19222 = i14 >> 9;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function28, function29, function210, function27, z2, z, z5, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i18222 & 896) | (i18222 & 112) | 6 | ((i14 >> 3) & 7168) | (i19222 & 57344) | (i19222 & 458752) | (i19222 & 3670016) | ((i1722 << 21) & 29360128) | ((i14 << 15) & 234881024) | ((i14 << 21) & 1879048192), ((i14 >> 12) & 112) | ((i14 >> 18) & 14) | (i1722 & 896) | ((i1722 << 6) & 7168), 16384);
                function211 = function28;
                function212 = function210;
                z6 = z5;
                paddingValues3 = paddingValues2;
                function213 = function29;
                function214 = function27;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            int i17222 = i13;
            if ((i3 & 8192) != 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            textFieldColors3 = textFieldColors2;
            function28 = function215;
            function29 = function216;
            function210 = function217;
            composer2.endDefaults();
            int i182222 = i14 << 3;
            int i192222 = i14 >> 9;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function28, function29, function210, function27, z2, z, z5, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i182222 & 896) | (i182222 & 112) | 6 | ((i14 >> 3) & 7168) | (i192222 & 57344) | (i192222 & 458752) | (i192222 & 3670016) | ((i17222 << 21) & 29360128) | ((i14 << 15) & 234881024) | ((i14 << 21) & 1879048192), ((i14 >> 12) & 112) | ((i14 >> 18) & 14) | (i17222 & 896) | ((i17222 << 6) & 7168), 16384);
            function211 = function28;
            function212 = function210;
            z6 = z5;
            paddingValues3 = paddingValues2;
            function213 = function29;
            function214 = function27;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        int i172222 = i13;
        if ((i3 & 8192) != 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        textFieldColors3 = textFieldColors2;
        function28 = function215;
        function29 = function216;
        function210 = function217;
        composer2.endDefaults();
        int i1822222 = i14 << 3;
        int i1922222 = i14 >> 9;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function28, function29, function210, function27, z2, z, z5, interactionSource, paddingValues2, textFieldColors3, null, composer2, (i1822222 & 896) | (i1822222 & 112) | 6 | ((i14 >> 3) & 7168) | (i1922222 & 57344) | (i1922222 & 458752) | (i1922222 & 3670016) | ((i172222 << 21) & 29360128) | ((i14 << 15) & 234881024) | ((i14 << 21) & 1879048192), ((i14 >> 12) & 112) | ((i14 >> 18) & 14) | (i172222 & 896) | ((i172222 << 6) & 7168), 16384);
        function211 = function28;
        function212 = function210;
        z6 = z5;
        paddingValues3 = paddingValues2;
        function213 = function29;
        function214 = function27;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027a  */
    @ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OutlinedTextFieldDecorationBox(final String value, final Function2<? super Composer, ? super Integer, Unit> innerTextField, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function25, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TextFieldColors textFieldColors2;
        int i17;
        PaddingValues paddingValues2;
        int i18;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        int i19;
        final TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function213;
        final Function2<? super Composer, ? super Integer, Unit> function214;
        final boolean z5;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        final PaddingValues paddingValues4;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        ScopeUpdateScope endRestartGroup;
        int i20;
        int i21;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-1280721485);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedTextFieldDecorationBox)P(12,4,3,10,13,5,6,7,9,8,11,1,2)645@30340L25,651@30571L600:TextFieldDefaults.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(innerTextField) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 57344) == 0) {
                    i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i & 458752) == 0) {
                        i5 = startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                        function26 = function2;
                    } else {
                        function26 = function2;
                        if ((i & 29360128) == 0) {
                            i4 |= startRestartGroup.changed(function26) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                        function27 = function22;
                    } else {
                        function27 = function22;
                        if ((i & 234881024) == 0) {
                            i4 |= startRestartGroup.changed(function27) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= C.ENCODING_PCM_32BIT;
                    } else if ((i & 1879048192) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(function23) ? 536870912 : 268435456;
                        i11 = i3 & 1024;
                        if (i11 != 0) {
                            i13 = i2 | 6;
                            i12 = i11;
                        } else if ((i2 & 14) == 0) {
                            i12 = i11;
                            i13 = i2 | (startRestartGroup.changed(function24) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i2;
                        }
                        if ((i2 & 112) == 0) {
                            if ((i3 & 2048) == 0 && startRestartGroup.changed(textFieldColors)) {
                                i21 = 32;
                                i13 |= i21;
                            }
                            i21 = 16;
                            i13 |= i21;
                        }
                        if ((i2 & 896) == 0) {
                            if ((i3 & 4096) == 0 && startRestartGroup.changed(paddingValues)) {
                                i20 = 256;
                                i13 |= i20;
                            }
                            i20 = 128;
                            i13 |= i20;
                        }
                        int i22 = i13;
                        i14 = i3 & 8192;
                        if (i14 != 0) {
                            i15 = i22 | 3072;
                        } else if ((i2 & 7168) == 0) {
                            i15 = i22 | (startRestartGroup.changed(function25) ? 2048 : 1024);
                        } else {
                            i15 = i22;
                        }
                        if ((i3 & 16384) != 0) {
                            i15 |= 24576;
                        } else if ((i2 & 57344) == 0) {
                            i15 |= startRestartGroup.changed(this) ? 16384 : 8192;
                            int i23 = i15;
                            if ((i4 & 1533916891) == 306783378 || (i23 & 46811) != 9362 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    boolean z6 = i6 == 0 ? false : z3;
                                    Function2<? super Composer, ? super Integer, Unit> function218 = i7 == 0 ? null : function26;
                                    Function2<? super Composer, ? super Integer, Unit> function219 = i8 == 0 ? null : function27;
                                    Function2<? super Composer, ? super Integer, Unit> function220 = i10 == 0 ? null : function23;
                                    Function2<? super Composer, ? super Integer, Unit> function221 = i12 == 0 ? function24 : null;
                                    if ((i3 & 2048) == 0) {
                                        i16 = i14;
                                        textFieldColors2 = m1569outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, (i23 >> 9) & 112, 2097151);
                                        startRestartGroup = startRestartGroup;
                                        i17 = i23 & (-113);
                                    } else {
                                        i16 = i14;
                                        textFieldColors2 = textFieldColors;
                                        i17 = i23;
                                    }
                                    if ((i3 & 4096) == 0) {
                                        paddingValues2 = m1560outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i17 &= -897;
                                    } else {
                                        paddingValues2 = paddingValues;
                                    }
                                    if (i16 == 0) {
                                        final boolean z7 = z6;
                                        final int i24 = i4;
                                        final int i25 = i17;
                                        final TextFieldColors textFieldColors4 = textFieldColors2;
                                        i18 = i25;
                                        function28 = ComposableLambdaKt.composableLambda(startRestartGroup, 1261916269, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i26) {
                                                ComposerKt.sourceInformation(composer3, "C648@30490L54:TextFieldDefaults.kt#jmzs0o");
                                                if ((i26 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                boolean z8 = z;
                                                boolean z9 = z7;
                                                InteractionSource interactionSource2 = interactionSource;
                                                TextFieldColors textFieldColors5 = textFieldColors4;
                                                int i27 = i24;
                                                textFieldDefaults.m1563BorderBoxnbWgWpA(z8, z9, interactionSource2, textFieldColors5, null, 0.0f, 0.0f, composer3, ((i27 >> 9) & 896) | ((i27 >> 6) & 14) | 12582912 | ((i27 >> 15) & 112) | ((i25 << 6) & 7168), 112);
                                            }
                                        });
                                        textFieldColors3 = textFieldColors2;
                                        paddingValues3 = paddingValues2;
                                        function210 = function218;
                                        function211 = function219;
                                        function29 = function221;
                                        i19 = i4;
                                        z4 = z7;
                                        function212 = function220;
                                    } else {
                                        int i26 = i17;
                                        boolean z8 = z6;
                                        i18 = i26;
                                        function28 = function25;
                                        function29 = function221;
                                        i19 = i4;
                                        textFieldColors3 = textFieldColors2;
                                        paddingValues3 = paddingValues2;
                                        function210 = function218;
                                        function211 = function219;
                                        function212 = function220;
                                        z4 = z8;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    i18 = (i3 & 2048) != 0 ? i23 & (-113) : i23;
                                    if ((i3 & 4096) != 0) {
                                        i18 &= -897;
                                    }
                                    z4 = z3;
                                    function29 = function24;
                                    textFieldColors3 = textFieldColors;
                                    i19 = i4;
                                    function210 = function26;
                                    function211 = function27;
                                    function212 = function23;
                                    paddingValues3 = paddingValues;
                                    function28 = function25;
                                }
                                startRestartGroup.endDefaults();
                                int i27 = i19 << 3;
                                int i28 = i19 >> 9;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function210, function211, function212, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function28, startRestartGroup, (i27 & 896) | (i27 & 112) | 6 | ((i19 >> 3) & 7168) | (i28 & 57344) | (i28 & 458752) | (i28 & 3670016) | ((i18 << 21) & 29360128) | ((i19 << 15) & 234881024) | ((i19 << 21) & 1879048192), ((i19 >> 12) & 112) | ((i19 >> 18) & 14) | (i18 & 896) | ((i18 << 6) & 7168) | ((i18 << 3) & 57344), 0);
                                function213 = function210;
                                function214 = function212;
                                z5 = z4;
                                composer2 = startRestartGroup;
                                function215 = function211;
                                function216 = function28;
                                paddingValues4 = paddingValues3;
                                function217 = function29;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z5 = z3;
                                function214 = function23;
                                textFieldColors3 = textFieldColors;
                                function213 = function26;
                                function215 = function27;
                                composer2 = startRestartGroup;
                                function217 = function24;
                                paddingValues4 = paddingValues;
                                function216 = function25;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
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

                                public final void invoke(Composer composer3, int i29) {
                                    TextFieldDefaults.this.OutlinedTextFieldDecorationBox(value, innerTextField, z, z2, visualTransformation, interactionSource, z5, function213, function215, function214, function217, textFieldColors3, paddingValues4, function216, composer3, i | 1, i2, i3);
                                }
                            });
                            return;
                        }
                        int i232 = i15;
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        if ((i3 & 4096) == 0) {
                        }
                        if (i16 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        int i272 = i19 << 3;
                        int i282 = i19 >> 9;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function210, function211, function212, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function28, startRestartGroup, (i272 & 896) | (i272 & 112) | 6 | ((i19 >> 3) & 7168) | (i282 & 57344) | (i282 & 458752) | (i282 & 3670016) | ((i18 << 21) & 29360128) | ((i19 << 15) & 234881024) | ((i19 << 21) & 1879048192), ((i19 >> 12) & 112) | ((i19 >> 18) & 14) | (i18 & 896) | ((i18 << 6) & 7168) | ((i18 << 3) & 57344), 0);
                        function213 = function210;
                        function214 = function212;
                        z5 = z4;
                        composer2 = startRestartGroup;
                        function215 = function211;
                        function216 = function28;
                        paddingValues4 = paddingValues3;
                        function217 = function29;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 1024;
                    if (i11 != 0) {
                    }
                    if ((i2 & 112) == 0) {
                    }
                    if ((i2 & 896) == 0) {
                    }
                    int i222 = i13;
                    i14 = i3 & 8192;
                    if (i14 != 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    int i2322 = i15;
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    if ((i3 & 4096) == 0) {
                    }
                    if (i16 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    int i2722 = i19 << 3;
                    int i2822 = i19 >> 9;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function210, function211, function212, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function28, startRestartGroup, (i2722 & 896) | (i2722 & 112) | 6 | ((i19 >> 3) & 7168) | (i2822 & 57344) | (i2822 & 458752) | (i2822 & 3670016) | ((i18 << 21) & 29360128) | ((i19 << 15) & 234881024) | ((i19 << 21) & 1879048192), ((i19 >> 12) & 112) | ((i19 >> 18) & 14) | (i18 & 896) | ((i18 << 6) & 7168) | ((i18 << 3) & 57344), 0);
                    function213 = function210;
                    function214 = function212;
                    z5 = z4;
                    composer2 = startRestartGroup;
                    function215 = function211;
                    function216 = function28;
                    paddingValues4 = paddingValues3;
                    function217 = function29;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 1024;
                if (i11 != 0) {
                }
                if ((i2 & 112) == 0) {
                }
                if ((i2 & 896) == 0) {
                }
                int i2222 = i13;
                i14 = i3 & 8192;
                if (i14 != 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                int i23222 = i15;
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((i3 & 4096) == 0) {
                }
                if (i16 == 0) {
                }
                startRestartGroup.endDefaults();
                int i27222 = i19 << 3;
                int i28222 = i19 >> 9;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function210, function211, function212, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function28, startRestartGroup, (i27222 & 896) | (i27222 & 112) | 6 | ((i19 >> 3) & 7168) | (i28222 & 57344) | (i28222 & 458752) | (i28222 & 3670016) | ((i18 << 21) & 29360128) | ((i19 << 15) & 234881024) | ((i19 << 21) & 1879048192), ((i19 >> 12) & 112) | ((i19 >> 18) & 14) | (i18 & 896) | ((i18 << 6) & 7168) | ((i18 << 3) & 57344), 0);
                function213 = function210;
                function214 = function212;
                z5 = z4;
                composer2 = startRestartGroup;
                function215 = function211;
                function216 = function28;
                paddingValues4 = paddingValues3;
                function217 = function29;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i5;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            if ((i2 & 112) == 0) {
            }
            if ((i2 & 896) == 0) {
            }
            int i22222 = i13;
            i14 = i3 & 8192;
            if (i14 != 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            int i232222 = i15;
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            if (i16 == 0) {
            }
            startRestartGroup.endDefaults();
            int i272222 = i19 << 3;
            int i282222 = i19 >> 9;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function210, function211, function212, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function28, startRestartGroup, (i272222 & 896) | (i272222 & 112) | 6 | ((i19 >> 3) & 7168) | (i282222 & 57344) | (i282222 & 458752) | (i282222 & 3670016) | ((i18 << 21) & 29360128) | ((i19 << 15) & 234881024) | ((i19 << 21) & 1879048192), ((i19 >> 12) & 112) | ((i19 >> 18) & 14) | (i18 & 896) | ((i18 << 6) & 7168) | ((i18 << 3) & 57344), 0);
            function213 = function210;
            function214 = function212;
            z5 = z4;
            composer2 = startRestartGroup;
            function215 = function211;
            function216 = function28;
            paddingValues4 = paddingValues3;
            function217 = function29;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        if ((i2 & 112) == 0) {
        }
        if ((i2 & 896) == 0) {
        }
        int i222222 = i13;
        i14 = i3 & 8192;
        if (i14 != 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        int i2322222 = i15;
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        if (i16 == 0) {
        }
        startRestartGroup.endDefaults();
        int i2722222 = i19 << 3;
        int i2822222 = i19 >> 9;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function210, function211, function212, function29, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function28, startRestartGroup, (i2722222 & 896) | (i2722222 & 112) | 6 | ((i19 >> 3) & 7168) | (i2822222 & 57344) | (i2822222 & 458752) | (i2822222 & 3670016) | ((i18 << 21) & 29360128) | ((i19 << 15) & 234881024) | ((i19 << 21) & 1879048192), ((i19 >> 12) & 112) | ((i19 >> 18) & 14) | (i18 & 896) | ((i18 << 6) & 7168) | ((i18 << 3) & 57344), 0);
        function213 = function210;
        function214 = function212;
        z5 = z4;
        composer2 = startRestartGroup;
        function215 = function211;
        function216 = function28;
        paddingValues4 = paddingValues3;
        function217 = function29;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    @ExperimentalMaterialApi
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1568indicatorLinegv0btCI(Modifier indicatorLine, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors colors, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return ComposedModifierKt.composed(indicatorLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", colors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m4438boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m4438boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                State m1575animateBorderStrokeAsStateNuRrP5Q;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1398930845);
                ComposerKt.sourceInformation(composer, "C280@10408L217:TextFieldDefaults.kt#jmzs0o");
                m1575animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m1575animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, colors, f, f2, composer, 0);
                Modifier drawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) m1575animateBorderStrokeAsStateNuRrP5Q.getValue());
                composer.endReplaceableGroup();
                return drawIndicatorLine;
            }
        });
    }
}
