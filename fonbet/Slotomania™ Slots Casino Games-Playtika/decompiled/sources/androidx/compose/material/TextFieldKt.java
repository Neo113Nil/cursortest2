package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Constraints;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010,\u001a\u0087\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020-2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+H\u0007¢\u0006\u0002\u0010.\u001a\u009a\u0001\u0010/\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e¢\u0006\u0002\b\u00182\u0013\u00101\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010#\u001a\u00020\u00122\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\u00107\u001a]\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010C\u001aE\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020%2\u0006\u0010F\u001a\u00020%2\u0006\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020%2\u0006\u0010I\u001a\u00020%2\u0006\u0010?\u001a\u00020@H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010K\u001a\u0014\u0010L\u001a\u00020\u0010*\u00020\u00102\u0006\u0010M\u001a\u00020NH\u0000\u001at\u0010O\u001a\u00020\n*\u00020P2\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010V\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020%2\u0006\u0010Z\u001a\u00020%2\u0006\u00103\u001a\u0002042\u0006\u0010A\u001a\u000204H\u0002\u001aZ\u0010[\u001a\u00020\n*\u00020P2\u0006\u0010Q\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010\\\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010A\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\u0007\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", TextFieldImplKt.TextFieldId, "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m4440constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m4440constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m4440constructorimpl(4);

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01cd, code lost:
    
        if (r15.changed(r87) == false) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x060e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        TextStyle textStyle2;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i10;
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
        int i23;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        boolean z7;
        VisualTransformation none;
        int i24;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i25;
        KeyboardOptions keyboardOptions3;
        Modifier modifier3;
        TextStyle textStyle4;
        TextFieldColors textFieldColors2;
        boolean z8;
        KeyboardActions keyboardActions3;
        boolean z9;
        int i26;
        Shape shape3;
        long m3969getColor0d7_KjU;
        final boolean z10;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActions keyboardActions4;
        final int i27;
        final MutableInteractionSource mutableInteractionSource3;
        Composer composer2;
        final TextStyle textStyle5;
        final TextFieldColors textFieldColors3;
        final Modifier modifier4;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final boolean z12;
        final Shape shape4;
        final boolean z13;
        final VisualTransformation visualTransformation2;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        ScopeUpdateScope endRestartGroup;
        int i28;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1690895095);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)163@8397L7,174@8951L39,176@9033L6,177@9158L17,189@9576L24,199@10014L20,186@9478L1542:TextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i29 = i4 & 4;
        if (i29 != 0) {
            i5 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i2 & 896) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            int i30 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z5 = z;
                i5 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                    z6 = z2;
                } else {
                    z6 = z2;
                    if ((i2 & 57344) == 0) {
                        i5 |= startRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                }
                if ((i2 & 458752) == 0) {
                    textStyle2 = textStyle;
                    i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                } else {
                    textStyle2 = textStyle;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    function25 = function2;
                } else {
                    function25 = function2;
                    if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(function25) ? 1048576 : 524288;
                    }
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                    function26 = function22;
                } else {
                    function26 = function22;
                    if ((i2 & 29360128) == 0) {
                        i5 |= startRestartGroup.changed(function26) ? 8388608 : 4194304;
                    }
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i11 = i10;
                    i5 |= startRestartGroup.changed(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i12 = i4 & 512;
                    if (i12 == 0) {
                        i5 |= C.ENCODING_PCM_32BIT;
                    } else if ((i2 & 1879048192) == 0) {
                        i13 = i12;
                        i5 |= startRestartGroup.changed(function24) ? 536870912 : 268435456;
                        i14 = i4 & 1024;
                        if (i14 != 0) {
                            i16 = i3 | 6;
                            i15 = i14;
                        } else if ((i3 & 14) == 0) {
                            i15 = i14;
                            i16 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                        } else {
                            i15 = i14;
                            i16 = i3;
                        }
                        i17 = i4 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i3 & 112) == 0) {
                            i18 = i17;
                            i16 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                            if ((i3 & 896) == 0) {
                                if ((i4 & 4096) == 0 && startRestartGroup.changed(keyboardOptions)) {
                                    i28 = 256;
                                    i16 |= i28;
                                }
                                i28 = 128;
                                i16 |= i28;
                            }
                            if ((i3 & 7168) == 0) {
                                if ((i4 & 8192) != 0) {
                                }
                                i30 = 1024;
                                i16 |= i30;
                            }
                            int i31 = i16;
                            i19 = i4 & 16384;
                            if (i19 == 0) {
                                i31 |= 24576;
                            } else if ((i3 & 57344) == 0) {
                                i20 = i31 | (startRestartGroup.changed(z4) ? 16384 : 8192);
                                i21 = i4 & 32768;
                                if (i21 != 0) {
                                    i20 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i3 & 458752) == 0) {
                                    i20 |= startRestartGroup.changed(i) ? 131072 : 65536;
                                }
                                i22 = i4 & 65536;
                                if (i22 != 0) {
                                    i20 |= 1572864;
                                } else if ((i3 & 3670016) == 0) {
                                    i20 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                                }
                                if ((i3 & 29360128) == 0) {
                                    i20 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                                }
                                if ((i3 & 234881024) == 0) {
                                    i20 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                int i32 = i20;
                                if ((i5 & 1533916891) == 306783378 || (191739611 & i32) != 38347922 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion = i29 != 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z14 = i6 != 0 ? true : z5;
                                        boolean z15 = i7 != 0 ? false : z6;
                                        if ((i4 & 32) != 0) {
                                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(localTextStyle);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i23 = i5 & (-458753);
                                            textStyle3 = (TextStyle) consume;
                                        } else {
                                            i23 = i5;
                                            textStyle3 = textStyle2;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function213 = i8 != 0 ? null : function25;
                                        Function2<? super Composer, ? super Integer, Unit> function214 = i9 != 0 ? null : function26;
                                        function27 = i11 != 0 ? null : function23;
                                        function28 = i13 != 0 ? null : function24;
                                        z7 = i15 != 0 ? false : z3;
                                        none = i18 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        if ((i4 & 4096) != 0) {
                                            i24 = i32 & (-897);
                                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                        } else {
                                            i24 = i32;
                                            keyboardOptions2 = keyboardOptions;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i24 &= -7169;
                                            keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                        } else {
                                            keyboardActions2 = keyboardActions;
                                        }
                                        boolean z16 = i19 != 0 ? false : z4;
                                        int i33 = i21 != 0 ? Integer.MAX_VALUE : i;
                                        if (i22 != 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        if ((i4 & 131072) != 0) {
                                            i24 &= -29360129;
                                            shape2 = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                                        } else {
                                            shape2 = shape;
                                        }
                                        i25 = i24;
                                        if ((262144 & i4) != 0) {
                                            TextFieldColors m1571textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m1571textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                            startRestartGroup = startRestartGroup;
                                            TextStyle textStyle6 = textStyle3;
                                            keyboardOptions3 = keyboardOptions2;
                                            modifier3 = companion;
                                            textStyle4 = textStyle6;
                                            textFieldColors2 = m1571textFieldColorsdx8h9Zs;
                                            i25 &= -234881025;
                                        } else {
                                            TextStyle textStyle7 = textStyle3;
                                            keyboardOptions3 = keyboardOptions2;
                                            modifier3 = companion;
                                            textStyle4 = textStyle7;
                                            textFieldColors2 = textFieldColors;
                                        }
                                        z5 = z14;
                                        z8 = z15;
                                        function25 = function213;
                                        function26 = function214;
                                        keyboardActions3 = keyboardActions2;
                                        z9 = z16;
                                        i26 = i33;
                                        shape3 = shape2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & 32) != 0) {
                                            i5 &= -458753;
                                        }
                                        if ((i4 & 4096) != 0) {
                                            i32 &= -897;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i32 &= -7169;
                                        }
                                        if ((i4 & 131072) != 0) {
                                            i32 &= -29360129;
                                        }
                                        if ((262144 & i4) != 0) {
                                            i32 &= -234881025;
                                        }
                                        function27 = function23;
                                        function28 = function24;
                                        z7 = z3;
                                        none = visualTransformation;
                                        z9 = z4;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape3 = shape;
                                        i25 = i32;
                                        i23 = i5;
                                        z8 = z6;
                                        textStyle4 = textStyle2;
                                        modifier3 = modifier2;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActions3 = keyboardActions;
                                        i26 = i;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    startRestartGroup.endDefaults();
                                    startRestartGroup.startReplaceableGroup(-833027444);
                                    ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
                                    m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                                    if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                                        m3969getColor0d7_KjU = textFieldColors2.textColor(z5, startRestartGroup, ((i23 >> 9) & 14) | ((i25 >> 21) & 112)).getValue().m2122unboximpl();
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TextStyle merge = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                                    int i34 = (i25 >> 21) & 112;
                                    final boolean z17 = z5;
                                    final TextFieldColors textFieldColors4 = textFieldColors2;
                                    final boolean z18 = z7;
                                    Modifier modifier5 = modifier3;
                                    Modifier m618defaultMinSizeVpY3zN4 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i34).getValue().m2122unboximpl(), shape3), z17, z18, mutableInteractionSource2, textFieldColors4, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                                    SolidColor solidColor = new SolidColor(textFieldColors4.cursorColor(z18, startRestartGroup, (i25 & 14) | i34).getValue().m2122unboximpl(), null);
                                    final boolean z19 = z9;
                                    final Function2<? super Composer, ? super Integer, Unit> function215 = function25;
                                    final Function2<? super Composer, ? super Integer, Unit> function216 = function26;
                                    final int i35 = i23;
                                    final Function2<? super Composer, ? super Integer, Unit> function217 = function27;
                                    final Function2<? super Composer, ? super Integer, Unit> function218 = function28;
                                    final VisualTransformation visualTransformation3 = none;
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    final int i36 = i25;
                                    int i37 = i25 << 12;
                                    Shape shape5 = shape3;
                                    KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                    BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN4, z17, z8, merge, keyboardOptions5, keyboardActions3, z9, i26, visualTransformation3, (Function1) null, mutableInteractionSource4, solidColor, ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                                            int i39;
                                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                            ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                                            if ((i38 & 14) == 0) {
                                                i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                                            } else {
                                                i39 = i38;
                                            }
                                            if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                                                int i40 = i39;
                                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                String str = value;
                                                boolean z20 = z17;
                                                boolean z21 = z19;
                                                VisualTransformation visualTransformation4 = visualTransformation3;
                                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                                boolean z22 = z18;
                                                Function2<Composer, Integer, Unit> function219 = function215;
                                                Function2<Composer, Integer, Unit> function220 = function216;
                                                Function2<Composer, Integer, Unit> function221 = function217;
                                                Function2<Composer, Integer, Unit> function222 = function218;
                                                TextFieldColors textFieldColors5 = textFieldColors4;
                                                int i41 = i35;
                                                int i42 = i36;
                                                textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | (i41 & 14) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), startRestartGroup, (i23 & 64638) | (i37 & 3670016) | (KeyboardActions.$stable << 21) | (i37 & 29360128) | (i37 & 234881024) | (i37 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                                    z10 = z8;
                                    keyboardOptions4 = keyboardOptions5;
                                    keyboardActions4 = keyboardActions3;
                                    i27 = i26;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    composer2 = startRestartGroup;
                                    textStyle5 = textStyle4;
                                    textFieldColors3 = textFieldColors4;
                                    modifier4 = modifier5;
                                    z11 = z17;
                                    function29 = function215;
                                    function210 = function27;
                                    z12 = z18;
                                    shape4 = shape5;
                                    z13 = z9;
                                    visualTransformation2 = visualTransformation3;
                                    function211 = function216;
                                    function212 = function28;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    z12 = z3;
                                    keyboardActions4 = keyboardActions;
                                    i27 = i;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    shape4 = shape;
                                    textFieldColors3 = textFieldColors;
                                    z11 = z5;
                                    z10 = z6;
                                    textStyle5 = textStyle2;
                                    function29 = function25;
                                    function211 = function26;
                                    modifier4 = modifier2;
                                    composer2 = startRestartGroup;
                                    function210 = function23;
                                    function212 = function24;
                                    visualTransformation2 = visualTransformation;
                                    keyboardOptions4 = keyboardOptions;
                                    z13 = z4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
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

                                    public final void invoke(Composer composer3, int i38) {
                                        TextFieldKt.TextField(value, onValueChange, modifier4, z11, z10, textStyle5, function29, function211, function210, function212, z12, visualTransformation2, keyboardOptions4, keyboardActions4, z13, i27, mutableInteractionSource3, shape4, textFieldColors3, composer3, i2 | 1, i3, i4);
                                    }
                                });
                                return;
                            }
                            i20 = i31;
                            i21 = i4 & 32768;
                            if (i21 != 0) {
                            }
                            i22 = i4 & 65536;
                            if (i22 != 0) {
                            }
                            if ((i3 & 29360128) == 0) {
                            }
                            if ((i3 & 234881024) == 0) {
                            }
                            int i322 = i20;
                            if ((i5 & 1533916891) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                            }
                            if (i29 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if ((i4 & 32) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if ((i4 & 4096) != 0) {
                            }
                            if ((i4 & 8192) != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if ((i4 & 131072) != 0) {
                            }
                            i25 = i24;
                            if ((262144 & i4) != 0) {
                            }
                            z5 = z14;
                            z8 = z15;
                            function25 = function213;
                            function26 = function214;
                            keyboardActions3 = keyboardActions2;
                            z9 = z16;
                            i26 = i33;
                            shape3 = shape2;
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(-833027444);
                            ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
                            m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                            if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextStyle merge2 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            int i342 = (i25 >> 21) & 112;
                            final boolean z172 = z5;
                            final TextFieldColors textFieldColors42 = textFieldColors2;
                            final boolean z182 = z7;
                            Modifier modifier52 = modifier3;
                            Modifier m618defaultMinSizeVpY3zN42 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i342).getValue().m2122unboximpl(), shape3), z172, z182, mutableInteractionSource2, textFieldColors42, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                            SolidColor solidColor2 = new SolidColor(textFieldColors42.cursorColor(z182, startRestartGroup, (i25 & 14) | i342).getValue().m2122unboximpl(), null);
                            final boolean z192 = z9;
                            final Function2<? super Composer, ? super Integer, Unit> function2152 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function2162 = function26;
                            final int i352 = i23;
                            final Function2<? super Composer, ? super Integer, Unit> function2172 = function27;
                            final Function2<? super Composer, ? super Integer, Unit> function2182 = function28;
                            final VisualTransformation visualTransformation32 = none;
                            final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                            final int i362 = i25;
                            int i372 = i25 << 12;
                            Shape shape52 = shape3;
                            KeyboardOptions keyboardOptions52 = keyboardOptions3;
                            BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN42, z172, z8, merge2, keyboardOptions52, keyboardActions3, z9, i26, visualTransformation32, (Function1) null, mutableInteractionSource42, solidColor2, ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                                    int i39;
                                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                    ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                                    if ((i38 & 14) == 0) {
                                        i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                                    } else {
                                        i39 = i38;
                                    }
                                    if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                                        int i40 = i39;
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        String str = value;
                                        boolean z20 = z172;
                                        boolean z21 = z192;
                                        VisualTransformation visualTransformation4 = visualTransformation32;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource42;
                                        boolean z22 = z182;
                                        Function2<Composer, Integer, Unit> function219 = function2152;
                                        Function2<Composer, Integer, Unit> function220 = function2162;
                                        Function2<Composer, Integer, Unit> function221 = function2172;
                                        Function2<Composer, Integer, Unit> function222 = function2182;
                                        TextFieldColors textFieldColors5 = textFieldColors42;
                                        int i41 = i352;
                                        int i42 = i362;
                                        textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | (i41 & 14) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), startRestartGroup, (i23 & 64638) | (i372 & 3670016) | (KeyboardActions.$stable << 21) | (i372 & 29360128) | (i372 & 234881024) | (i372 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                            z10 = z8;
                            keyboardOptions4 = keyboardOptions52;
                            keyboardActions4 = keyboardActions3;
                            i27 = i26;
                            mutableInteractionSource3 = mutableInteractionSource42;
                            composer2 = startRestartGroup;
                            textStyle5 = textStyle4;
                            textFieldColors3 = textFieldColors42;
                            modifier4 = modifier52;
                            z11 = z172;
                            function29 = function2152;
                            function210 = function27;
                            z12 = z182;
                            shape4 = shape52;
                            z13 = z9;
                            visualTransformation2 = visualTransformation32;
                            function211 = function2162;
                            function212 = function28;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i18 = i17;
                        if ((i3 & 896) == 0) {
                        }
                        if ((i3 & 7168) == 0) {
                        }
                        int i312 = i16;
                        i19 = i4 & 16384;
                        if (i19 == 0) {
                        }
                        i20 = i312;
                        i21 = i4 & 32768;
                        if (i21 != 0) {
                        }
                        i22 = i4 & 65536;
                        if (i22 != 0) {
                        }
                        if ((i3 & 29360128) == 0) {
                        }
                        if ((i3 & 234881024) == 0) {
                        }
                        int i3222 = i20;
                        if ((i5 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i29 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i4 & 32) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if ((i4 & 4096) != 0) {
                        }
                        if ((i4 & 8192) != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if ((i4 & 131072) != 0) {
                        }
                        i25 = i24;
                        if ((262144 & i4) != 0) {
                        }
                        z5 = z14;
                        z8 = z15;
                        function25 = function213;
                        function26 = function214;
                        keyboardActions3 = keyboardActions2;
                        z9 = z16;
                        i26 = i33;
                        shape3 = shape2;
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(-833027444);
                        ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
                        m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                        if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextStyle merge22 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                        int i3422 = (i25 >> 21) & 112;
                        final boolean z1722 = z5;
                        final TextFieldColors textFieldColors422 = textFieldColors2;
                        final boolean z1822 = z7;
                        Modifier modifier522 = modifier3;
                        Modifier m618defaultMinSizeVpY3zN422 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i3422).getValue().m2122unboximpl(), shape3), z1722, z1822, mutableInteractionSource2, textFieldColors422, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                        SolidColor solidColor22 = new SolidColor(textFieldColors422.cursorColor(z1822, startRestartGroup, (i25 & 14) | i3422).getValue().m2122unboximpl(), null);
                        final boolean z1922 = z9;
                        final Function2<? super Composer, ? super Integer, Unit> function21522 = function25;
                        final Function2<? super Composer, ? super Integer, Unit> function21622 = function26;
                        final int i3522 = i23;
                        final Function2<? super Composer, ? super Integer, Unit> function21722 = function27;
                        final Function2<? super Composer, ? super Integer, Unit> function21822 = function28;
                        final VisualTransformation visualTransformation322 = none;
                        final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                        final int i3622 = i25;
                        int i3722 = i25 << 12;
                        Shape shape522 = shape3;
                        KeyboardOptions keyboardOptions522 = keyboardOptions3;
                        BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN422, z1722, z8, merge22, keyboardOptions522, keyboardActions3, z9, i26, visualTransformation322, (Function1) null, mutableInteractionSource422, solidColor22, ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                                int i39;
                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                                if ((i38 & 14) == 0) {
                                    i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                                } else {
                                    i39 = i38;
                                }
                                if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                                    int i40 = i39;
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    String str = value;
                                    boolean z20 = z1722;
                                    boolean z21 = z1922;
                                    VisualTransformation visualTransformation4 = visualTransformation322;
                                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource422;
                                    boolean z22 = z1822;
                                    Function2<Composer, Integer, Unit> function219 = function21522;
                                    Function2<Composer, Integer, Unit> function220 = function21622;
                                    Function2<Composer, Integer, Unit> function221 = function21722;
                                    Function2<Composer, Integer, Unit> function222 = function21822;
                                    TextFieldColors textFieldColors5 = textFieldColors422;
                                    int i41 = i3522;
                                    int i42 = i3622;
                                    textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | (i41 & 14) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i23 & 64638) | (i3722 & 3670016) | (KeyboardActions.$stable << 21) | (i3722 & 29360128) | (i3722 & 234881024) | (i3722 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                        z10 = z8;
                        keyboardOptions4 = keyboardOptions522;
                        keyboardActions4 = keyboardActions3;
                        i27 = i26;
                        mutableInteractionSource3 = mutableInteractionSource422;
                        composer2 = startRestartGroup;
                        textStyle5 = textStyle4;
                        textFieldColors3 = textFieldColors422;
                        modifier4 = modifier522;
                        z11 = z1722;
                        function29 = function21522;
                        function210 = function27;
                        z12 = z1822;
                        shape4 = shape522;
                        z13 = z9;
                        visualTransformation2 = visualTransformation322;
                        function211 = function21622;
                        function212 = function28;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i13 = i12;
                    i14 = i4 & 1024;
                    if (i14 != 0) {
                    }
                    i17 = i4 & 2048;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    if ((i3 & 896) == 0) {
                    }
                    if ((i3 & 7168) == 0) {
                    }
                    int i3122 = i16;
                    i19 = i4 & 16384;
                    if (i19 == 0) {
                    }
                    i20 = i3122;
                    i21 = i4 & 32768;
                    if (i21 != 0) {
                    }
                    i22 = i4 & 65536;
                    if (i22 != 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    int i32222 = i20;
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i29 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i4 & 32) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if ((i4 & 4096) != 0) {
                    }
                    if ((i4 & 8192) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if ((i4 & 131072) != 0) {
                    }
                    i25 = i24;
                    if ((262144 & i4) != 0) {
                    }
                    z5 = z14;
                    z8 = z15;
                    function25 = function213;
                    function26 = function214;
                    keyboardActions3 = keyboardActions2;
                    z9 = z16;
                    i26 = i33;
                    shape3 = shape2;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(-833027444);
                    ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
                    m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                    if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge222 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                    int i34222 = (i25 >> 21) & 112;
                    final boolean z17222 = z5;
                    final TextFieldColors textFieldColors4222 = textFieldColors2;
                    final boolean z18222 = z7;
                    Modifier modifier5222 = modifier3;
                    Modifier m618defaultMinSizeVpY3zN4222 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i34222).getValue().m2122unboximpl(), shape3), z17222, z18222, mutableInteractionSource2, textFieldColors4222, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                    SolidColor solidColor222 = new SolidColor(textFieldColors4222.cursorColor(z18222, startRestartGroup, (i25 & 14) | i34222).getValue().m2122unboximpl(), null);
                    final boolean z19222 = z9;
                    final Function2<? super Composer, ? super Integer, Unit> function215222 = function25;
                    final Function2<? super Composer, ? super Integer, Unit> function216222 = function26;
                    final int i35222 = i23;
                    final Function2<? super Composer, ? super Integer, Unit> function217222 = function27;
                    final Function2<? super Composer, ? super Integer, Unit> function218222 = function28;
                    final VisualTransformation visualTransformation3222 = none;
                    final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                    final int i36222 = i25;
                    int i37222 = i25 << 12;
                    Shape shape5222 = shape3;
                    KeyboardOptions keyboardOptions5222 = keyboardOptions3;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN4222, z17222, z8, merge222, keyboardOptions5222, keyboardActions3, z9, i26, visualTransformation3222, (Function1) null, mutableInteractionSource4222, solidColor222, ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                            int i39;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                            if ((i38 & 14) == 0) {
                                i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i39 = i38;
                            }
                            if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                                int i40 = i39;
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                String str = value;
                                boolean z20 = z17222;
                                boolean z21 = z19222;
                                VisualTransformation visualTransformation4 = visualTransformation3222;
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4222;
                                boolean z22 = z18222;
                                Function2<Composer, Integer, Unit> function219 = function215222;
                                Function2<Composer, Integer, Unit> function220 = function216222;
                                Function2<Composer, Integer, Unit> function221 = function217222;
                                Function2<Composer, Integer, Unit> function222 = function218222;
                                TextFieldColors textFieldColors5 = textFieldColors4222;
                                int i41 = i35222;
                                int i42 = i36222;
                                textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | (i41 & 14) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i23 & 64638) | (i37222 & 3670016) | (KeyboardActions.$stable << 21) | (i37222 & 29360128) | (i37222 & 234881024) | (i37222 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                    z10 = z8;
                    keyboardOptions4 = keyboardOptions5222;
                    keyboardActions4 = keyboardActions3;
                    i27 = i26;
                    mutableInteractionSource3 = mutableInteractionSource4222;
                    composer2 = startRestartGroup;
                    textStyle5 = textStyle4;
                    textFieldColors3 = textFieldColors4222;
                    modifier4 = modifier5222;
                    z11 = z17222;
                    function29 = function215222;
                    function210 = function27;
                    z12 = z18222;
                    shape4 = shape5222;
                    z13 = z9;
                    visualTransformation2 = visualTransformation3222;
                    function211 = function216222;
                    function212 = function28;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i11 = i10;
                i12 = i4 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i4 & 1024;
                if (i14 != 0) {
                }
                i17 = i4 & 2048;
                if (i17 != 0) {
                }
                i18 = i17;
                if ((i3 & 896) == 0) {
                }
                if ((i3 & 7168) == 0) {
                }
                int i31222 = i16;
                i19 = i4 & 16384;
                if (i19 == 0) {
                }
                i20 = i31222;
                i21 = i4 & 32768;
                if (i21 != 0) {
                }
                i22 = i4 & 65536;
                if (i22 != 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                int i322222 = i20;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i29 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i4 & 32) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i18 != 0) {
                }
                if ((i4 & 4096) != 0) {
                }
                if ((i4 & 8192) != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if ((i4 & 131072) != 0) {
                }
                i25 = i24;
                if ((262144 & i4) != 0) {
                }
                z5 = z14;
                z8 = z15;
                function25 = function213;
                function26 = function214;
                keyboardActions3 = keyboardActions2;
                z9 = z16;
                i26 = i33;
                shape3 = shape2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(-833027444);
                ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
                m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle merge2222 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                int i342222 = (i25 >> 21) & 112;
                final boolean z172222 = z5;
                final TextFieldColors textFieldColors42222 = textFieldColors2;
                final boolean z182222 = z7;
                Modifier modifier52222 = modifier3;
                Modifier m618defaultMinSizeVpY3zN42222 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i342222).getValue().m2122unboximpl(), shape3), z172222, z182222, mutableInteractionSource2, textFieldColors42222, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                SolidColor solidColor2222 = new SolidColor(textFieldColors42222.cursorColor(z182222, startRestartGroup, (i25 & 14) | i342222).getValue().m2122unboximpl(), null);
                final boolean z192222 = z9;
                final Function2<? super Composer, ? super Integer, Unit> function2152222 = function25;
                final Function2<? super Composer, ? super Integer, Unit> function2162222 = function26;
                final int i352222 = i23;
                final Function2<? super Composer, ? super Integer, Unit> function2172222 = function27;
                final Function2<? super Composer, ? super Integer, Unit> function2182222 = function28;
                final VisualTransformation visualTransformation32222 = none;
                final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
                final int i362222 = i25;
                int i372222 = i25 << 12;
                Shape shape52222 = shape3;
                KeyboardOptions keyboardOptions52222 = keyboardOptions3;
                BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN42222, z172222, z8, merge2222, keyboardOptions52222, keyboardActions3, z9, i26, visualTransformation32222, (Function1) null, mutableInteractionSource42222, solidColor2222, ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                        int i39;
                        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                        ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                        if ((i38 & 14) == 0) {
                            i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                        } else {
                            i39 = i38;
                        }
                        if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                            int i40 = i39;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            String str = value;
                            boolean z20 = z172222;
                            boolean z21 = z192222;
                            VisualTransformation visualTransformation4 = visualTransformation32222;
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource42222;
                            boolean z22 = z182222;
                            Function2<Composer, Integer, Unit> function219 = function2152222;
                            Function2<Composer, Integer, Unit> function220 = function2162222;
                            Function2<Composer, Integer, Unit> function221 = function2172222;
                            Function2<Composer, Integer, Unit> function222 = function2182222;
                            TextFieldColors textFieldColors5 = textFieldColors42222;
                            int i41 = i352222;
                            int i42 = i362222;
                            textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | (i41 & 14) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), startRestartGroup, (i23 & 64638) | (i372222 & 3670016) | (KeyboardActions.$stable << 21) | (i372222 & 29360128) | (i372222 & 234881024) | (i372222 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                z10 = z8;
                keyboardOptions4 = keyboardOptions52222;
                keyboardActions4 = keyboardActions3;
                i27 = i26;
                mutableInteractionSource3 = mutableInteractionSource42222;
                composer2 = startRestartGroup;
                textStyle5 = textStyle4;
                textFieldColors3 = textFieldColors42222;
                modifier4 = modifier52222;
                z11 = z172222;
                function29 = function2152222;
                function210 = function27;
                z12 = z182222;
                shape4 = shape52222;
                z13 = z9;
                visualTransformation2 = visualTransformation32222;
                function211 = function2162222;
                function212 = function28;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z5 = z;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i4 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            i17 = i4 & 2048;
            if (i17 != 0) {
            }
            i18 = i17;
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            int i312222 = i16;
            i19 = i4 & 16384;
            if (i19 == 0) {
            }
            i20 = i312222;
            i21 = i4 & 32768;
            if (i21 != 0) {
            }
            i22 = i4 & 65536;
            if (i22 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            int i3222222 = i20;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i29 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i18 != 0) {
            }
            if ((i4 & 4096) != 0) {
            }
            if ((i4 & 8192) != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            i25 = i24;
            if ((262144 & i4) != 0) {
            }
            z5 = z14;
            z8 = z15;
            function25 = function213;
            function26 = function214;
            keyboardActions3 = keyboardActions2;
            z9 = z16;
            i26 = i33;
            shape3 = shape2;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(-833027444);
            ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
            m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
            if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge22222 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
            int i3422222 = (i25 >> 21) & 112;
            final boolean z1722222 = z5;
            final TextFieldColors textFieldColors422222 = textFieldColors2;
            final boolean z1822222 = z7;
            Modifier modifier522222 = modifier3;
            Modifier m618defaultMinSizeVpY3zN422222 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i3422222).getValue().m2122unboximpl(), shape3), z1722222, z1822222, mutableInteractionSource2, textFieldColors422222, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
            SolidColor solidColor22222 = new SolidColor(textFieldColors422222.cursorColor(z1822222, startRestartGroup, (i25 & 14) | i3422222).getValue().m2122unboximpl(), null);
            final boolean z1922222 = z9;
            final Function2<? super Composer, ? super Integer, Unit> function21522222 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function21622222 = function26;
            final int i3522222 = i23;
            final Function2<? super Composer, ? super Integer, Unit> function21722222 = function27;
            final Function2<? super Composer, ? super Integer, Unit> function21822222 = function28;
            final VisualTransformation visualTransformation322222 = none;
            final MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
            final int i3622222 = i25;
            int i3722222 = i25 << 12;
            Shape shape522222 = shape3;
            KeyboardOptions keyboardOptions522222 = keyboardOptions3;
            BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN422222, z1722222, z8, merge22222, keyboardOptions522222, keyboardActions3, z9, i26, visualTransformation322222, (Function1) null, mutableInteractionSource422222, solidColor22222, ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                    int i39;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                    if ((i38 & 14) == 0) {
                        i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                    } else {
                        i39 = i38;
                    }
                    if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                        int i40 = i39;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        String str = value;
                        boolean z20 = z1722222;
                        boolean z21 = z1922222;
                        VisualTransformation visualTransformation4 = visualTransformation322222;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource422222;
                        boolean z22 = z1822222;
                        Function2<Composer, Integer, Unit> function219 = function21522222;
                        Function2<Composer, Integer, Unit> function220 = function21622222;
                        Function2<Composer, Integer, Unit> function221 = function21722222;
                        Function2<Composer, Integer, Unit> function222 = function21822222;
                        TextFieldColors textFieldColors5 = textFieldColors422222;
                        int i41 = i3522222;
                        int i42 = i3622222;
                        textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | (i41 & 14) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), startRestartGroup, (i23 & 64638) | (i3722222 & 3670016) | (KeyboardActions.$stable << 21) | (i3722222 & 29360128) | (i3722222 & 234881024) | (i3722222 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
            z10 = z8;
            keyboardOptions4 = keyboardOptions522222;
            keyboardActions4 = keyboardActions3;
            i27 = i26;
            mutableInteractionSource3 = mutableInteractionSource422222;
            composer2 = startRestartGroup;
            textStyle5 = textStyle4;
            textFieldColors3 = textFieldColors422222;
            modifier4 = modifier522222;
            z11 = z1722222;
            function29 = function21522222;
            function210 = function27;
            z12 = z1822222;
            shape4 = shape522222;
            z13 = z9;
            visualTransformation2 = visualTransformation322222;
            function211 = function21622222;
            function212 = function28;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        int i302 = 2048;
        if (i6 == 0) {
        }
        z5 = z;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i4 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i4 & 1024;
        if (i14 != 0) {
        }
        i17 = i4 & 2048;
        if (i17 != 0) {
        }
        i18 = i17;
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        int i3122222 = i16;
        i19 = i4 & 16384;
        if (i19 == 0) {
        }
        i20 = i3122222;
        i21 = i4 & 32768;
        if (i21 != 0) {
        }
        i22 = i4 & 65536;
        if (i22 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        int i32222222 = i20;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i29 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i18 != 0) {
        }
        if ((i4 & 4096) != 0) {
        }
        if ((i4 & 8192) != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        i25 = i24;
        if ((262144 & i4) != 0) {
        }
        z5 = z14;
        z8 = z15;
        function25 = function213;
        function26 = function214;
        keyboardActions3 = keyboardActions2;
        z9 = z16;
        i26 = i33;
        shape3 = shape2;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(-833027444);
        ComposerKt.sourceInformation(startRestartGroup, "*181@9327L18");
        m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
        if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge222222 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
        int i34222222 = (i25 >> 21) & 112;
        final boolean z17222222 = z5;
        final TextFieldColors textFieldColors4222222 = textFieldColors2;
        final boolean z18222222 = z7;
        Modifier modifier5222222 = modifier3;
        Modifier m618defaultMinSizeVpY3zN4222222 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i34222222).getValue().m2122unboximpl(), shape3), z17222222, z18222222, mutableInteractionSource2, textFieldColors4222222, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
        SolidColor solidColor222222 = new SolidColor(textFieldColors4222222.cursorColor(z18222222, startRestartGroup, (i25 & 14) | i34222222).getValue().m2122unboximpl(), null);
        final boolean z19222222 = z9;
        final Function2<? super Composer, ? super Integer, Unit> function215222222 = function25;
        final Function2<? super Composer, ? super Integer, Unit> function216222222 = function26;
        final int i35222222 = i23;
        final Function2<? super Composer, ? super Integer, Unit> function217222222 = function27;
        final Function2<? super Composer, ? super Integer, Unit> function218222222 = function28;
        final VisualTransformation visualTransformation3222222 = none;
        final MutableInteractionSource mutableInteractionSource4222222 = mutableInteractionSource2;
        final int i36222222 = i25;
        int i37222222 = i25 << 12;
        Shape shape5222222 = shape3;
        KeyboardOptions keyboardOptions5222222 = keyboardOptions3;
        BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN4222222, z17222222, z8, merge222222, keyboardOptions5222222, keyboardActions3, z9, i26, visualTransformation3222222, (Function1) null, mutableInteractionSource4222222, solidColor222222, ComposableLambdaKt.composableLambda(startRestartGroup, -1994363936, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                int i39;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                ComposerKt.sourceInformation(composer3, "C208@10466L538:TextField.kt#jmzs0o");
                if ((i38 & 14) == 0) {
                    i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                } else {
                    i39 = i38;
                }
                if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                    int i40 = i39;
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    String str = value;
                    boolean z20 = z17222222;
                    boolean z21 = z19222222;
                    VisualTransformation visualTransformation4 = visualTransformation3222222;
                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4222222;
                    boolean z22 = z18222222;
                    Function2<Composer, Integer, Unit> function219 = function215222222;
                    Function2<Composer, Integer, Unit> function220 = function216222222;
                    Function2<Composer, Integer, Unit> function221 = function217222222;
                    Function2<Composer, Integer, Unit> function222 = function218222222;
                    TextFieldColors textFieldColors5 = textFieldColors4222222;
                    int i41 = i35222222;
                    int i42 = i36222222;
                    textFieldDefaults.TextFieldDecorationBox(str, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | (i41 & 14) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), startRestartGroup, (i23 & 64638) | (i37222222 & 3670016) | (KeyboardActions.$stable << 21) | (i37222222 & 29360128) | (i37222222 & 234881024) | (i37222222 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
        z10 = z8;
        keyboardOptions4 = keyboardOptions5222222;
        keyboardActions4 = keyboardActions3;
        i27 = i26;
        mutableInteractionSource3 = mutableInteractionSource4222222;
        composer2 = startRestartGroup;
        textStyle5 = textStyle4;
        textFieldColors3 = textFieldColors4222222;
        modifier4 = modifier5222222;
        z11 = z17222222;
        function29 = function215222222;
        function210 = function27;
        z12 = z18222222;
        shape4 = shape5222222;
        z13 = z9;
        visualTransformation2 = visualTransformation3222222;
        function211 = function216222222;
        function212 = function28;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01cd, code lost:
    
        if (r15.changed(r87) == false) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05ea A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextField(final TextFieldValue value, final Function1<? super TextFieldValue, Unit> onValueChange, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        TextStyle textStyle2;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i10;
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
        int i23;
        TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        boolean z7;
        VisualTransformation none;
        int i24;
        KeyboardOptions keyboardOptions2;
        KeyboardActions keyboardActions2;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i25;
        KeyboardOptions keyboardOptions3;
        Modifier modifier3;
        TextStyle textStyle4;
        TextFieldColors textFieldColors2;
        boolean z8;
        KeyboardActions keyboardActions3;
        boolean z9;
        int i26;
        Shape shape3;
        long m3969getColor0d7_KjU;
        final boolean z10;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActions keyboardActions4;
        final int i27;
        final MutableInteractionSource mutableInteractionSource3;
        Composer composer2;
        final TextStyle textStyle5;
        final TextFieldColors textFieldColors3;
        final Modifier modifier4;
        final boolean z11;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final boolean z12;
        final Shape shape4;
        final boolean z13;
        final VisualTransformation visualTransformation2;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        ScopeUpdateScope endRestartGroup;
        int i28;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1576622884);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextField)P(17,10,9,1,12,15,6,11,7,16,3,18,5,4,14,8,2,13)298@15761L7,309@16315L39,310@16393L14,311@16457L17,323@16875L24,333@17313L20,320@16777L1547:TextField.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i29 = i4 & 4;
        if (i29 != 0) {
            i5 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i2 & 896) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            int i30 = 2048;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z5 = z;
                i5 |= startRestartGroup.changed(z5) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                    z6 = z2;
                } else {
                    z6 = z2;
                    if ((i2 & 57344) == 0) {
                        i5 |= startRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                }
                if ((i2 & 458752) == 0) {
                    textStyle2 = textStyle;
                    i5 |= ((i4 & 32) == 0 && startRestartGroup.changed(textStyle2)) ? 131072 : 65536;
                } else {
                    textStyle2 = textStyle;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    function25 = function2;
                } else {
                    function25 = function2;
                    if ((i2 & 3670016) == 0) {
                        i5 |= startRestartGroup.changed(function25) ? 1048576 : 524288;
                    }
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                    function26 = function22;
                } else {
                    function26 = function22;
                    if ((i2 & 29360128) == 0) {
                        i5 |= startRestartGroup.changed(function26) ? 8388608 : 4194304;
                    }
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i11 = i10;
                    i5 |= startRestartGroup.changed(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i12 = i4 & 512;
                    if (i12 == 0) {
                        i5 |= C.ENCODING_PCM_32BIT;
                    } else if ((i2 & 1879048192) == 0) {
                        i13 = i12;
                        i5 |= startRestartGroup.changed(function24) ? 536870912 : 268435456;
                        i14 = i4 & 1024;
                        if (i14 != 0) {
                            i16 = i3 | 6;
                            i15 = i14;
                        } else if ((i3 & 14) == 0) {
                            i15 = i14;
                            i16 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
                        } else {
                            i15 = i14;
                            i16 = i3;
                        }
                        i17 = i4 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                        } else if ((i3 & 112) == 0) {
                            i18 = i17;
                            i16 |= startRestartGroup.changed(visualTransformation) ? 32 : 16;
                            if ((i3 & 896) == 0) {
                                if ((i4 & 4096) == 0 && startRestartGroup.changed(keyboardOptions)) {
                                    i28 = 256;
                                    i16 |= i28;
                                }
                                i28 = 128;
                                i16 |= i28;
                            }
                            if ((i3 & 7168) == 0) {
                                if ((i4 & 8192) != 0) {
                                }
                                i30 = 1024;
                                i16 |= i30;
                            }
                            int i31 = i16;
                            i19 = i4 & 16384;
                            if (i19 == 0) {
                                i31 |= 24576;
                            } else if ((i3 & 57344) == 0) {
                                i20 = i31 | (startRestartGroup.changed(z4) ? 16384 : 8192);
                                i21 = i4 & 32768;
                                if (i21 != 0) {
                                    i20 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i3 & 458752) == 0) {
                                    i20 |= startRestartGroup.changed(i) ? 131072 : 65536;
                                }
                                i22 = i4 & 65536;
                                if (i22 != 0) {
                                    i20 |= 1572864;
                                } else if ((i3 & 3670016) == 0) {
                                    i20 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                                }
                                if ((i3 & 29360128) == 0) {
                                    i20 |= ((i4 & 131072) == 0 && startRestartGroup.changed(shape)) ? 8388608 : 4194304;
                                }
                                if ((i3 & 234881024) == 0) {
                                    i20 |= ((i4 & 262144) == 0 && startRestartGroup.changed(textFieldColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                int i32 = i20;
                                if ((i5 & 1533916891) == 306783378 || (191739611 & i32) != 38347922 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion = i29 != 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z14 = i6 != 0 ? true : z5;
                                        boolean z15 = i7 != 0 ? false : z6;
                                        if ((i4 & 32) != 0) {
                                            ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume = startRestartGroup.consume(localTextStyle);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            i23 = i5 & (-458753);
                                            textStyle3 = (TextStyle) consume;
                                        } else {
                                            i23 = i5;
                                            textStyle3 = textStyle2;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function213 = i8 != 0 ? null : function25;
                                        Function2<? super Composer, ? super Integer, Unit> function214 = i9 != 0 ? null : function26;
                                        function27 = i11 != 0 ? null : function23;
                                        function28 = i13 != 0 ? null : function24;
                                        z7 = i15 != 0 ? false : z3;
                                        none = i18 != 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        if ((i4 & 4096) != 0) {
                                            i24 = i32 & (-897);
                                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                        } else {
                                            i24 = i32;
                                            keyboardOptions2 = keyboardOptions;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i24 &= -7169;
                                            keyboardActions2 = new KeyboardActions(null, null, null, null, null, null, 63, null);
                                        } else {
                                            keyboardActions2 = keyboardActions;
                                        }
                                        boolean z16 = i19 != 0 ? false : z4;
                                        int i33 = i21 != 0 ? Integer.MAX_VALUE : i;
                                        if (i22 != 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                        if ((i4 & 131072) != 0) {
                                            i24 &= -29360129;
                                            shape2 = TextFieldDefaults.INSTANCE.getTextFieldShape(startRestartGroup, 6);
                                        } else {
                                            shape2 = shape;
                                        }
                                        i25 = i24;
                                        if ((262144 & i4) != 0) {
                                            TextFieldColors m1571textFieldColorsdx8h9Zs = TextFieldDefaults.INSTANCE.m1571textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 0, 48, 2097151);
                                            startRestartGroup = startRestartGroup;
                                            TextStyle textStyle6 = textStyle3;
                                            keyboardOptions3 = keyboardOptions2;
                                            modifier3 = companion;
                                            textStyle4 = textStyle6;
                                            textFieldColors2 = m1571textFieldColorsdx8h9Zs;
                                            i25 &= -234881025;
                                        } else {
                                            TextStyle textStyle7 = textStyle3;
                                            keyboardOptions3 = keyboardOptions2;
                                            modifier3 = companion;
                                            textStyle4 = textStyle7;
                                            textFieldColors2 = textFieldColors;
                                        }
                                        z5 = z14;
                                        z8 = z15;
                                        function25 = function213;
                                        function26 = function214;
                                        keyboardActions3 = keyboardActions2;
                                        z9 = z16;
                                        i26 = i33;
                                        shape3 = shape2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & 32) != 0) {
                                            i5 &= -458753;
                                        }
                                        if ((i4 & 4096) != 0) {
                                            i32 &= -897;
                                        }
                                        if ((i4 & 8192) != 0) {
                                            i32 &= -7169;
                                        }
                                        if ((i4 & 131072) != 0) {
                                            i32 &= -29360129;
                                        }
                                        if ((262144 & i4) != 0) {
                                            i32 &= -234881025;
                                        }
                                        function27 = function23;
                                        function28 = function24;
                                        z7 = z3;
                                        none = visualTransformation;
                                        z9 = z4;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        shape3 = shape;
                                        i25 = i32;
                                        i23 = i5;
                                        z8 = z6;
                                        textStyle4 = textStyle2;
                                        modifier3 = modifier2;
                                        keyboardOptions3 = keyboardOptions;
                                        keyboardActions3 = keyboardActions;
                                        i26 = i;
                                        textFieldColors2 = textFieldColors;
                                    }
                                    startRestartGroup.endDefaults();
                                    startRestartGroup.startReplaceableGroup(-833020145);
                                    ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
                                    m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                                    if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                                        m3969getColor0d7_KjU = textFieldColors2.textColor(z5, startRestartGroup, ((i23 >> 9) & 14) | ((i25 >> 21) & 112)).getValue().m2122unboximpl();
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TextStyle merge = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                                    int i34 = (i25 >> 21) & 112;
                                    final boolean z17 = z5;
                                    final TextFieldColors textFieldColors4 = textFieldColors2;
                                    final boolean z18 = z7;
                                    Modifier modifier5 = modifier3;
                                    Modifier m618defaultMinSizeVpY3zN4 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i34).getValue().m2122unboximpl(), shape3), z17, z18, mutableInteractionSource2, textFieldColors4, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                                    SolidColor solidColor = new SolidColor(textFieldColors4.cursorColor(z18, startRestartGroup, (i25 & 14) | i34).getValue().m2122unboximpl(), null);
                                    final boolean z19 = z9;
                                    final Function2<? super Composer, ? super Integer, Unit> function215 = function25;
                                    final Function2<? super Composer, ? super Integer, Unit> function216 = function26;
                                    final int i35 = i23;
                                    final Function2<? super Composer, ? super Integer, Unit> function217 = function27;
                                    final Function2<? super Composer, ? super Integer, Unit> function218 = function28;
                                    final VisualTransformation visualTransformation3 = none;
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    final int i36 = i25;
                                    int i37 = i25 << 12;
                                    Shape shape5 = shape3;
                                    KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                    BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN4, z17, z8, merge, keyboardOptions5, keyboardActions3, z9, i26, visualTransformation3, (Function1) null, mutableInteractionSource4, solidColor, ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                                            int i39;
                                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                            ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                                            if ((i38 & 14) == 0) {
                                                i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                                            } else {
                                                i39 = i38;
                                            }
                                            if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                                                int i40 = i39;
                                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                String text = TextFieldValue.this.getText();
                                                boolean z20 = z17;
                                                boolean z21 = z19;
                                                VisualTransformation visualTransformation4 = visualTransformation3;
                                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                                boolean z22 = z18;
                                                Function2<Composer, Integer, Unit> function219 = function215;
                                                Function2<Composer, Integer, Unit> function220 = function216;
                                                Function2<Composer, Integer, Unit> function221 = function217;
                                                Function2<Composer, Integer, Unit> function222 = function218;
                                                TextFieldColors textFieldColors5 = textFieldColors4;
                                                int i41 = i35;
                                                int i42 = i36;
                                                textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), startRestartGroup, (i23 & 64638) | (i37 & 3670016) | (KeyboardActions.$stable << 21) | (i37 & 29360128) | (i37 & 234881024) | (i37 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                                    z10 = z8;
                                    keyboardOptions4 = keyboardOptions5;
                                    keyboardActions4 = keyboardActions3;
                                    i27 = i26;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    composer2 = startRestartGroup;
                                    textStyle5 = textStyle4;
                                    textFieldColors3 = textFieldColors4;
                                    modifier4 = modifier5;
                                    z11 = z17;
                                    function29 = function215;
                                    function210 = function27;
                                    z12 = z18;
                                    shape4 = shape5;
                                    z13 = z9;
                                    visualTransformation2 = visualTransformation3;
                                    function211 = function216;
                                    function212 = function28;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    z12 = z3;
                                    keyboardActions4 = keyboardActions;
                                    i27 = i;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    shape4 = shape;
                                    textFieldColors3 = textFieldColors;
                                    z11 = z5;
                                    z10 = z6;
                                    textStyle5 = textStyle2;
                                    function29 = function25;
                                    function211 = function26;
                                    modifier4 = modifier2;
                                    composer2 = startRestartGroup;
                                    function210 = function23;
                                    function212 = function24;
                                    visualTransformation2 = visualTransformation;
                                    keyboardOptions4 = keyboardOptions;
                                    z13 = z4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$6
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

                                    public final void invoke(Composer composer3, int i38) {
                                        TextFieldKt.TextField(TextFieldValue.this, onValueChange, modifier4, z11, z10, textStyle5, function29, function211, function210, function212, z12, visualTransformation2, keyboardOptions4, keyboardActions4, z13, i27, mutableInteractionSource3, shape4, textFieldColors3, composer3, i2 | 1, i3, i4);
                                    }
                                });
                                return;
                            }
                            i20 = i31;
                            i21 = i4 & 32768;
                            if (i21 != 0) {
                            }
                            i22 = i4 & 65536;
                            if (i22 != 0) {
                            }
                            if ((i3 & 29360128) == 0) {
                            }
                            if ((i3 & 234881024) == 0) {
                            }
                            int i322 = i20;
                            if ((i5 & 1533916891) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                            }
                            if (i29 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if ((i4 & 32) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if ((i4 & 4096) != 0) {
                            }
                            if ((i4 & 8192) != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if ((i4 & 131072) != 0) {
                            }
                            i25 = i24;
                            if ((262144 & i4) != 0) {
                            }
                            z5 = z14;
                            z8 = z15;
                            function25 = function213;
                            function26 = function214;
                            keyboardActions3 = keyboardActions2;
                            z9 = z16;
                            i26 = i33;
                            shape3 = shape2;
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(-833020145);
                            ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
                            m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                            if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextStyle merge2 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                            int i342 = (i25 >> 21) & 112;
                            final boolean z172 = z5;
                            final TextFieldColors textFieldColors42 = textFieldColors2;
                            final boolean z182 = z7;
                            Modifier modifier52 = modifier3;
                            Modifier m618defaultMinSizeVpY3zN42 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i342).getValue().m2122unboximpl(), shape3), z172, z182, mutableInteractionSource2, textFieldColors42, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                            SolidColor solidColor2 = new SolidColor(textFieldColors42.cursorColor(z182, startRestartGroup, (i25 & 14) | i342).getValue().m2122unboximpl(), null);
                            final boolean z192 = z9;
                            final Function2<? super Composer, ? super Integer, Unit> function2152 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function2162 = function26;
                            final int i352 = i23;
                            final Function2<? super Composer, ? super Integer, Unit> function2172 = function27;
                            final Function2<? super Composer, ? super Integer, Unit> function2182 = function28;
                            final VisualTransformation visualTransformation32 = none;
                            final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                            final int i362 = i25;
                            int i372 = i25 << 12;
                            Shape shape52 = shape3;
                            KeyboardOptions keyboardOptions52 = keyboardOptions3;
                            BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN42, z172, z8, merge2, keyboardOptions52, keyboardActions3, z9, i26, visualTransformation32, (Function1) null, mutableInteractionSource42, solidColor2, ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                                    int i39;
                                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                    ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                                    if ((i38 & 14) == 0) {
                                        i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                                    } else {
                                        i39 = i38;
                                    }
                                    if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                                        int i40 = i39;
                                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                        String text = TextFieldValue.this.getText();
                                        boolean z20 = z172;
                                        boolean z21 = z192;
                                        VisualTransformation visualTransformation4 = visualTransformation32;
                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource42;
                                        boolean z22 = z182;
                                        Function2<Composer, Integer, Unit> function219 = function2152;
                                        Function2<Composer, Integer, Unit> function220 = function2162;
                                        Function2<Composer, Integer, Unit> function221 = function2172;
                                        Function2<Composer, Integer, Unit> function222 = function2182;
                                        TextFieldColors textFieldColors5 = textFieldColors42;
                                        int i41 = i352;
                                        int i42 = i362;
                                        textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), startRestartGroup, (i23 & 64638) | (i372 & 3670016) | (KeyboardActions.$stable << 21) | (i372 & 29360128) | (i372 & 234881024) | (i372 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                            z10 = z8;
                            keyboardOptions4 = keyboardOptions52;
                            keyboardActions4 = keyboardActions3;
                            i27 = i26;
                            mutableInteractionSource3 = mutableInteractionSource42;
                            composer2 = startRestartGroup;
                            textStyle5 = textStyle4;
                            textFieldColors3 = textFieldColors42;
                            modifier4 = modifier52;
                            z11 = z172;
                            function29 = function2152;
                            function210 = function27;
                            z12 = z182;
                            shape4 = shape52;
                            z13 = z9;
                            visualTransformation2 = visualTransformation32;
                            function211 = function2162;
                            function212 = function28;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i18 = i17;
                        if ((i3 & 896) == 0) {
                        }
                        if ((i3 & 7168) == 0) {
                        }
                        int i312 = i16;
                        i19 = i4 & 16384;
                        if (i19 == 0) {
                        }
                        i20 = i312;
                        i21 = i4 & 32768;
                        if (i21 != 0) {
                        }
                        i22 = i4 & 65536;
                        if (i22 != 0) {
                        }
                        if ((i3 & 29360128) == 0) {
                        }
                        if ((i3 & 234881024) == 0) {
                        }
                        int i3222 = i20;
                        if ((i5 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i29 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i4 & 32) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if ((i4 & 4096) != 0) {
                        }
                        if ((i4 & 8192) != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if ((i4 & 131072) != 0) {
                        }
                        i25 = i24;
                        if ((262144 & i4) != 0) {
                        }
                        z5 = z14;
                        z8 = z15;
                        function25 = function213;
                        function26 = function214;
                        keyboardActions3 = keyboardActions2;
                        z9 = z16;
                        i26 = i33;
                        shape3 = shape2;
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(-833020145);
                        ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
                        m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                        if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextStyle merge22 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                        int i3422 = (i25 >> 21) & 112;
                        final boolean z1722 = z5;
                        final TextFieldColors textFieldColors422 = textFieldColors2;
                        final boolean z1822 = z7;
                        Modifier modifier522 = modifier3;
                        Modifier m618defaultMinSizeVpY3zN422 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i3422).getValue().m2122unboximpl(), shape3), z1722, z1822, mutableInteractionSource2, textFieldColors422, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                        SolidColor solidColor22 = new SolidColor(textFieldColors422.cursorColor(z1822, startRestartGroup, (i25 & 14) | i3422).getValue().m2122unboximpl(), null);
                        final boolean z1922 = z9;
                        final Function2<? super Composer, ? super Integer, Unit> function21522 = function25;
                        final Function2<? super Composer, ? super Integer, Unit> function21622 = function26;
                        final int i3522 = i23;
                        final Function2<? super Composer, ? super Integer, Unit> function21722 = function27;
                        final Function2<? super Composer, ? super Integer, Unit> function21822 = function28;
                        final VisualTransformation visualTransformation322 = none;
                        final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                        final int i3622 = i25;
                        int i3722 = i25 << 12;
                        Shape shape522 = shape3;
                        KeyboardOptions keyboardOptions522 = keyboardOptions3;
                        BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN422, z1722, z8, merge22, keyboardOptions522, keyboardActions3, z9, i26, visualTransformation322, (Function1) null, mutableInteractionSource422, solidColor22, ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                                int i39;
                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                                if ((i38 & 14) == 0) {
                                    i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                                } else {
                                    i39 = i38;
                                }
                                if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                                    int i40 = i39;
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    String text = TextFieldValue.this.getText();
                                    boolean z20 = z1722;
                                    boolean z21 = z1922;
                                    VisualTransformation visualTransformation4 = visualTransformation322;
                                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource422;
                                    boolean z22 = z1822;
                                    Function2<Composer, Integer, Unit> function219 = function21522;
                                    Function2<Composer, Integer, Unit> function220 = function21622;
                                    Function2<Composer, Integer, Unit> function221 = function21722;
                                    Function2<Composer, Integer, Unit> function222 = function21822;
                                    TextFieldColors textFieldColors5 = textFieldColors422;
                                    int i41 = i3522;
                                    int i42 = i3622;
                                    textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i23 & 64638) | (i3722 & 3670016) | (KeyboardActions.$stable << 21) | (i3722 & 29360128) | (i3722 & 234881024) | (i3722 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                        z10 = z8;
                        keyboardOptions4 = keyboardOptions522;
                        keyboardActions4 = keyboardActions3;
                        i27 = i26;
                        mutableInteractionSource3 = mutableInteractionSource422;
                        composer2 = startRestartGroup;
                        textStyle5 = textStyle4;
                        textFieldColors3 = textFieldColors422;
                        modifier4 = modifier522;
                        z11 = z1722;
                        function29 = function21522;
                        function210 = function27;
                        z12 = z1822;
                        shape4 = shape522;
                        z13 = z9;
                        visualTransformation2 = visualTransformation322;
                        function211 = function21622;
                        function212 = function28;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i13 = i12;
                    i14 = i4 & 1024;
                    if (i14 != 0) {
                    }
                    i17 = i4 & 2048;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    if ((i3 & 896) == 0) {
                    }
                    if ((i3 & 7168) == 0) {
                    }
                    int i3122 = i16;
                    i19 = i4 & 16384;
                    if (i19 == 0) {
                    }
                    i20 = i3122;
                    i21 = i4 & 32768;
                    if (i21 != 0) {
                    }
                    i22 = i4 & 65536;
                    if (i22 != 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i3 & 234881024) == 0) {
                    }
                    int i32222 = i20;
                    if ((i5 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i29 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i4 & 32) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if ((i4 & 4096) != 0) {
                    }
                    if ((i4 & 8192) != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if ((i4 & 131072) != 0) {
                    }
                    i25 = i24;
                    if ((262144 & i4) != 0) {
                    }
                    z5 = z14;
                    z8 = z15;
                    function25 = function213;
                    function26 = function214;
                    keyboardActions3 = keyboardActions2;
                    z9 = z16;
                    i26 = i33;
                    shape3 = shape2;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(-833020145);
                    ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
                    m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                    if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle merge222 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                    int i34222 = (i25 >> 21) & 112;
                    final boolean z17222 = z5;
                    final TextFieldColors textFieldColors4222 = textFieldColors2;
                    final boolean z18222 = z7;
                    Modifier modifier5222 = modifier3;
                    Modifier m618defaultMinSizeVpY3zN4222 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i34222).getValue().m2122unboximpl(), shape3), z17222, z18222, mutableInteractionSource2, textFieldColors4222, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                    SolidColor solidColor222 = new SolidColor(textFieldColors4222.cursorColor(z18222, startRestartGroup, (i25 & 14) | i34222).getValue().m2122unboximpl(), null);
                    final boolean z19222 = z9;
                    final Function2<? super Composer, ? super Integer, Unit> function215222 = function25;
                    final Function2<? super Composer, ? super Integer, Unit> function216222 = function26;
                    final int i35222 = i23;
                    final Function2<? super Composer, ? super Integer, Unit> function217222 = function27;
                    final Function2<? super Composer, ? super Integer, Unit> function218222 = function28;
                    final VisualTransformation visualTransformation3222 = none;
                    final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                    final int i36222 = i25;
                    int i37222 = i25 << 12;
                    Shape shape5222 = shape3;
                    KeyboardOptions keyboardOptions5222 = keyboardOptions3;
                    BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN4222, z17222, z8, merge222, keyboardOptions5222, keyboardActions3, z9, i26, visualTransformation3222, (Function1) null, mutableInteractionSource4222, solidColor222, ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                            int i39;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                            if ((i38 & 14) == 0) {
                                i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                            } else {
                                i39 = i38;
                            }
                            if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                                int i40 = i39;
                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                String text = TextFieldValue.this.getText();
                                boolean z20 = z17222;
                                boolean z21 = z19222;
                                VisualTransformation visualTransformation4 = visualTransformation3222;
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4222;
                                boolean z22 = z18222;
                                Function2<Composer, Integer, Unit> function219 = function215222;
                                Function2<Composer, Integer, Unit> function220 = function216222;
                                Function2<Composer, Integer, Unit> function221 = function217222;
                                Function2<Composer, Integer, Unit> function222 = function218222;
                                TextFieldColors textFieldColors5 = textFieldColors4222;
                                int i41 = i35222;
                                int i42 = i36222;
                                textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), startRestartGroup, (i23 & 64638) | (i37222 & 3670016) | (KeyboardActions.$stable << 21) | (i37222 & 29360128) | (i37222 & 234881024) | (i37222 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                    z10 = z8;
                    keyboardOptions4 = keyboardOptions5222;
                    keyboardActions4 = keyboardActions3;
                    i27 = i26;
                    mutableInteractionSource3 = mutableInteractionSource4222;
                    composer2 = startRestartGroup;
                    textStyle5 = textStyle4;
                    textFieldColors3 = textFieldColors4222;
                    modifier4 = modifier5222;
                    z11 = z17222;
                    function29 = function215222;
                    function210 = function27;
                    z12 = z18222;
                    shape4 = shape5222;
                    z13 = z9;
                    visualTransformation2 = visualTransformation3222;
                    function211 = function216222;
                    function212 = function28;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i11 = i10;
                i12 = i4 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i4 & 1024;
                if (i14 != 0) {
                }
                i17 = i4 & 2048;
                if (i17 != 0) {
                }
                i18 = i17;
                if ((i3 & 896) == 0) {
                }
                if ((i3 & 7168) == 0) {
                }
                int i31222 = i16;
                i19 = i4 & 16384;
                if (i19 == 0) {
                }
                i20 = i31222;
                i21 = i4 & 32768;
                if (i21 != 0) {
                }
                i22 = i4 & 65536;
                if (i22 != 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i3 & 234881024) == 0) {
                }
                int i322222 = i20;
                if ((i5 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i29 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i4 & 32) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i18 != 0) {
                }
                if ((i4 & 4096) != 0) {
                }
                if ((i4 & 8192) != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i22 != 0) {
                }
                if ((i4 & 131072) != 0) {
                }
                i25 = i24;
                if ((262144 & i4) != 0) {
                }
                z5 = z14;
                z8 = z15;
                function25 = function213;
                function26 = function214;
                keyboardActions3 = keyboardActions2;
                z9 = z16;
                i26 = i33;
                shape3 = shape2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(-833020145);
                ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
                m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
                if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle merge2222 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
                int i342222 = (i25 >> 21) & 112;
                final boolean z172222 = z5;
                final TextFieldColors textFieldColors42222 = textFieldColors2;
                final boolean z182222 = z7;
                Modifier modifier52222 = modifier3;
                Modifier m618defaultMinSizeVpY3zN42222 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i342222).getValue().m2122unboximpl(), shape3), z172222, z182222, mutableInteractionSource2, textFieldColors42222, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
                SolidColor solidColor2222 = new SolidColor(textFieldColors42222.cursorColor(z182222, startRestartGroup, (i25 & 14) | i342222).getValue().m2122unboximpl(), null);
                final boolean z192222 = z9;
                final Function2<? super Composer, ? super Integer, Unit> function2152222 = function25;
                final Function2<? super Composer, ? super Integer, Unit> function2162222 = function26;
                final int i352222 = i23;
                final Function2<? super Composer, ? super Integer, Unit> function2172222 = function27;
                final Function2<? super Composer, ? super Integer, Unit> function2182222 = function28;
                final VisualTransformation visualTransformation32222 = none;
                final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
                final int i362222 = i25;
                int i372222 = i25 << 12;
                Shape shape52222 = shape3;
                KeyboardOptions keyboardOptions52222 = keyboardOptions3;
                BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN42222, z172222, z8, merge2222, keyboardOptions52222, keyboardActions3, z9, i26, visualTransformation32222, (Function1) null, mutableInteractionSource42222, solidColor2222, ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                        int i39;
                        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                        ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                        if ((i38 & 14) == 0) {
                            i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                        } else {
                            i39 = i38;
                        }
                        if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                            int i40 = i39;
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                            String text = TextFieldValue.this.getText();
                            boolean z20 = z172222;
                            boolean z21 = z192222;
                            VisualTransformation visualTransformation4 = visualTransformation32222;
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource42222;
                            boolean z22 = z182222;
                            Function2<Composer, Integer, Unit> function219 = function2152222;
                            Function2<Composer, Integer, Unit> function220 = function2162222;
                            Function2<Composer, Integer, Unit> function221 = function2172222;
                            Function2<Composer, Integer, Unit> function222 = function2182222;
                            TextFieldColors textFieldColors5 = textFieldColors42222;
                            int i41 = i352222;
                            int i42 = i362222;
                            textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), startRestartGroup, (i23 & 64638) | (i372222 & 3670016) | (KeyboardActions.$stable << 21) | (i372222 & 29360128) | (i372222 & 234881024) | (i372222 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
                z10 = z8;
                keyboardOptions4 = keyboardOptions52222;
                keyboardActions4 = keyboardActions3;
                i27 = i26;
                mutableInteractionSource3 = mutableInteractionSource42222;
                composer2 = startRestartGroup;
                textStyle5 = textStyle4;
                textFieldColors3 = textFieldColors42222;
                modifier4 = modifier52222;
                z11 = z172222;
                function29 = function2152222;
                function210 = function27;
                z12 = z182222;
                shape4 = shape52222;
                z13 = z9;
                visualTransformation2 = visualTransformation32222;
                function211 = function2162222;
                function212 = function28;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z5 = z;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 458752) == 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i4 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i4 & 1024;
            if (i14 != 0) {
            }
            i17 = i4 & 2048;
            if (i17 != 0) {
            }
            i18 = i17;
            if ((i3 & 896) == 0) {
            }
            if ((i3 & 7168) == 0) {
            }
            int i312222 = i16;
            i19 = i4 & 16384;
            if (i19 == 0) {
            }
            i20 = i312222;
            i21 = i4 & 32768;
            if (i21 != 0) {
            }
            i22 = i4 & 65536;
            if (i22 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i3 & 234881024) == 0) {
            }
            int i3222222 = i20;
            if ((i5 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i29 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i18 != 0) {
            }
            if ((i4 & 4096) != 0) {
            }
            if ((i4 & 8192) != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i22 != 0) {
            }
            if ((i4 & 131072) != 0) {
            }
            i25 = i24;
            if ((262144 & i4) != 0) {
            }
            z5 = z14;
            z8 = z15;
            function25 = function213;
            function26 = function214;
            keyboardActions3 = keyboardActions2;
            z9 = z16;
            i26 = i33;
            shape3 = shape2;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(-833020145);
            ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
            m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
            if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle merge22222 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
            int i3422222 = (i25 >> 21) & 112;
            final boolean z1722222 = z5;
            final TextFieldColors textFieldColors422222 = textFieldColors2;
            final boolean z1822222 = z7;
            Modifier modifier522222 = modifier3;
            Modifier m618defaultMinSizeVpY3zN422222 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i3422222).getValue().m2122unboximpl(), shape3), z1722222, z1822222, mutableInteractionSource2, textFieldColors422222, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
            SolidColor solidColor22222 = new SolidColor(textFieldColors422222.cursorColor(z1822222, startRestartGroup, (i25 & 14) | i3422222).getValue().m2122unboximpl(), null);
            final boolean z1922222 = z9;
            final Function2<? super Composer, ? super Integer, Unit> function21522222 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function21622222 = function26;
            final int i3522222 = i23;
            final Function2<? super Composer, ? super Integer, Unit> function21722222 = function27;
            final Function2<? super Composer, ? super Integer, Unit> function21822222 = function28;
            final VisualTransformation visualTransformation322222 = none;
            final MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
            final int i3622222 = i25;
            int i3722222 = i25 << 12;
            Shape shape522222 = shape3;
            KeyboardOptions keyboardOptions522222 = keyboardOptions3;
            BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN422222, z1722222, z8, merge22222, keyboardOptions522222, keyboardActions3, z9, i26, visualTransformation322222, (Function1) null, mutableInteractionSource422222, solidColor22222, ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                    int i39;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                    if ((i38 & 14) == 0) {
                        i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                    } else {
                        i39 = i38;
                    }
                    if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                        int i40 = i39;
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        String text = TextFieldValue.this.getText();
                        boolean z20 = z1722222;
                        boolean z21 = z1922222;
                        VisualTransformation visualTransformation4 = visualTransformation322222;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource422222;
                        boolean z22 = z1822222;
                        Function2<Composer, Integer, Unit> function219 = function21522222;
                        Function2<Composer, Integer, Unit> function220 = function21622222;
                        Function2<Composer, Integer, Unit> function221 = function21722222;
                        Function2<Composer, Integer, Unit> function222 = function21822222;
                        TextFieldColors textFieldColors5 = textFieldColors422222;
                        int i41 = i3522222;
                        int i42 = i3622222;
                        textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), startRestartGroup, (i23 & 64638) | (i3722222 & 3670016) | (KeyboardActions.$stable << 21) | (i3722222 & 29360128) | (i3722222 & 234881024) | (i3722222 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
            z10 = z8;
            keyboardOptions4 = keyboardOptions522222;
            keyboardActions4 = keyboardActions3;
            i27 = i26;
            mutableInteractionSource3 = mutableInteractionSource422222;
            composer2 = startRestartGroup;
            textStyle5 = textStyle4;
            textFieldColors3 = textFieldColors422222;
            modifier4 = modifier522222;
            z11 = z1722222;
            function29 = function21522222;
            function210 = function27;
            z12 = z1822222;
            shape4 = shape522222;
            z13 = z9;
            visualTransformation2 = visualTransformation322222;
            function211 = function21622222;
            function212 = function28;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        int i302 = 2048;
        if (i6 == 0) {
        }
        z5 = z;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i4 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i4 & 1024;
        if (i14 != 0) {
        }
        i17 = i4 & 2048;
        if (i17 != 0) {
        }
        i18 = i17;
        if ((i3 & 896) == 0) {
        }
        if ((i3 & 7168) == 0) {
        }
        int i3122222 = i16;
        i19 = i4 & 16384;
        if (i19 == 0) {
        }
        i20 = i3122222;
        i21 = i4 & 32768;
        if (i21 != 0) {
        }
        i22 = i4 & 65536;
        if (i22 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i3 & 234881024) == 0) {
        }
        int i32222222 = i20;
        if ((i5 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i29 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i18 != 0) {
        }
        if ((i4 & 4096) != 0) {
        }
        if ((i4 & 8192) != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 != 0) {
        }
        if ((i4 & 131072) != 0) {
        }
        i25 = i24;
        if ((262144 & i4) != 0) {
        }
        z5 = z14;
        z8 = z15;
        function25 = function213;
        function26 = function214;
        keyboardActions3 = keyboardActions2;
        z9 = z16;
        i26 = i33;
        shape3 = shape2;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(-833020145);
        ComposerKt.sourceInformation(startRestartGroup, "*315@16626L18");
        m3969getColor0d7_KjU = textStyle4.m3969getColor0d7_KjU();
        if (m3969getColor0d7_KjU == Color.INSTANCE.m2148getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle merge222222 = textStyle4.merge(new TextStyle(m3969getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262142, (DefaultConstructorMarker) null));
        int i34222222 = (i25 >> 21) & 112;
        final boolean z17222222 = z5;
        final TextFieldColors textFieldColors4222222 = textFieldColors2;
        final boolean z18222222 = z7;
        Modifier modifier5222222 = modifier3;
        Modifier m618defaultMinSizeVpY3zN4222222 = SizeKt.m618defaultMinSizeVpY3zN4(TextFieldDefaults.m1559indicatorLinegv0btCI$default(TextFieldDefaults.INSTANCE, BackgroundKt.m232backgroundbw27NRU(modifier3, textFieldColors2.backgroundColor(z5, startRestartGroup, ((i23 >> 9) & 14) | i34222222).getValue().m2122unboximpl(), shape3), z17222222, z18222222, mutableInteractionSource2, textFieldColors4222222, 0.0f, 0.0f, 48, null), TextFieldDefaults.INSTANCE.m1566getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m1565getMinHeightD9Ej5fM());
        SolidColor solidColor222222 = new SolidColor(textFieldColors4222222.cursorColor(z18222222, startRestartGroup, (i25 & 14) | i34222222).getValue().m2122unboximpl(), null);
        final boolean z19222222 = z9;
        final Function2<? super Composer, ? super Integer, Unit> function215222222 = function25;
        final Function2<? super Composer, ? super Integer, Unit> function216222222 = function26;
        final int i35222222 = i23;
        final Function2<? super Composer, ? super Integer, Unit> function217222222 = function27;
        final Function2<? super Composer, ? super Integer, Unit> function218222222 = function28;
        final VisualTransformation visualTransformation3222222 = none;
        final MutableInteractionSource mutableInteractionSource4222222 = mutableInteractionSource2;
        final int i36222222 = i25;
        int i37222222 = i25 << 12;
        Shape shape5222222 = shape3;
        KeyboardOptions keyboardOptions5222222 = keyboardOptions3;
        BasicTextFieldKt.BasicTextField(value, onValueChange, m618defaultMinSizeVpY3zN4222222, z17222222, z8, merge222222, keyboardOptions5222222, keyboardActions3, z9, i26, visualTransformation3222222, (Function1) null, mutableInteractionSource4222222, solidColor222222, ComposableLambdaKt.composableLambda(startRestartGroup, -2078585677, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextField$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function219, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function219, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i38) {
                int i39;
                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                ComposerKt.sourceInformation(composer3, "C342@17765L543:TextField.kt#jmzs0o");
                if ((i38 & 14) == 0) {
                    i39 = i38 | (composer3.changed(innerTextField) ? 4 : 2);
                } else {
                    i39 = i38;
                }
                if ((i39 & 91) != 18 || !composer3.getSkipping()) {
                    int i40 = i39;
                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                    String text = TextFieldValue.this.getText();
                    boolean z20 = z17222222;
                    boolean z21 = z19222222;
                    VisualTransformation visualTransformation4 = visualTransformation3222222;
                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4222222;
                    boolean z22 = z18222222;
                    Function2<Composer, Integer, Unit> function219 = function215222222;
                    Function2<Composer, Integer, Unit> function220 = function216222222;
                    Function2<Composer, Integer, Unit> function221 = function217222222;
                    Function2<Composer, Integer, Unit> function222 = function218222222;
                    TextFieldColors textFieldColors5 = textFieldColors4222222;
                    int i41 = i35222222;
                    int i42 = i36222222;
                    textFieldDefaults.TextFieldDecorationBox(text, innerTextField, z20, z21, visualTransformation4, mutableInteractionSource5, z22, function219, function220, function221, function222, textFieldColors5, null, composer3, ((i42 >> 3) & 7168) | ((i41 >> 3) & 896) | ((i40 << 3) & 112) | ((i42 << 9) & 57344) | ((i42 >> 3) & 458752) | ((i42 << 18) & 3670016) | ((i41 << 3) & 29360128) | ((i41 << 3) & 234881024) | ((i41 << 3) & 1879048192), ((i41 >> 27) & 14) | 3072 | ((i42 >> 21) & 112), 4096);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), startRestartGroup, (i23 & 64638) | (i37222222 & 3670016) | (KeyboardActions.$stable << 21) | (i37222222 & 29360128) | (i37222222 & 234881024) | (i37222222 & 1879048192), ((i25 >> 3) & 14) | 24576 | ((i25 >> 12) & 896), 2048);
        z10 = z8;
        keyboardOptions4 = keyboardOptions5222222;
        keyboardActions4 = keyboardActions3;
        i27 = i26;
        mutableInteractionSource3 = mutableInteractionSource4222222;
        composer2 = startRestartGroup;
        textStyle5 = textStyle4;
        textFieldColors3 = textFieldColors4222222;
        modifier4 = modifier5222222;
        z11 = z17222222;
        function29 = function215222222;
        function210 = function27;
        z12 = z18222222;
        shape4 = shape5222222;
        z13 = z9;
        visualTransformation2 = visualTransformation3222222;
        function211 = function216222222;
        function212 = function28;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TextFieldLayout(final Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z, final float f, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        boolean z2;
        int i3;
        final Function2<? super Composer, ? super Integer, Unit> textField = function2;
        final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(-2112507061);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldLayout)P(3,7,1,5,2,8,6)376@18854L139,379@19041L7,380@19053L1853:TextField.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function25) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(function24) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= startRestartGroup.changed(paddingValues) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((191739611 & i2) != 38347922 || !startRestartGroup.getSkipping()) {
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f);
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(paddingValues);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z, f, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume2;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume3;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = i2;
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, textFieldMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(642667778);
            ComposerKt.sourceInformation(startRestartGroup, "C422@20668L183:TextField.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(254816194);
            ComposerKt.sourceInformation(startRestartGroup, "384@19161L219");
            if (function23 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                z2 = false;
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume5;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(localLayoutDirection3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume6;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(localViewConfiguration2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume7;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(then);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1642constructorimpl2 = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1649setimpl(m1642constructorimpl2, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(822730659);
                ComposerKt.sourceInformation(startRestartGroup, "C388@19353L9:TextField.kt#jmzs0o");
                function23.invoke(startRestartGroup, Integer.valueOf((i4 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                z2 = false;
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254816479);
            ComposerKt.sourceInformation(startRestartGroup, "392@19447L221");
            if (function24 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, z2, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(localDensity3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume8;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection4 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(localLayoutDirection4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection4 = (LayoutDirection) consume9;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume10 = startRestartGroup.consume(localViewConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume10;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1642constructorimpl3 = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1649setimpl(m1642constructorimpl3, layoutDirection4, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1007916070);
                ComposerKt.sourceInformation(startRestartGroup, "C396@19640L10:TextField.kt#jmzs0o");
                function24.invoke(startRestartGroup, Integer.valueOf((i4 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion = Modifier.INSTANCE;
            if (function23 != null) {
                i3 = 0;
                calculateStartPadding = Dp.m4440constructorimpl(RangesKt.coerceAtLeast(Dp.m4440constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m4440constructorimpl(0)));
            } else {
                i3 = 0;
            }
            float f2 = calculateStartPadding;
            if (function24 != null) {
                calculateEndPadding = Dp.m4440constructorimpl(RangesKt.coerceAtLeast(Dp.m4440constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m4440constructorimpl(i3)));
            }
            Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(companion, f2, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(254817490);
            ComposerKt.sourceInformation(startRestartGroup, "417@20461L59");
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PlaceholderId).then(m589paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i4 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254817619);
            ComposerKt.sourceInformation(startRestartGroup, "420@20584L57");
            if (function22 != null) {
                Modifier then3 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LabelId).then(m589paddingqDBjuR0$default);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity4 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume11 = startRestartGroup.consume(localDensity4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density4 = (Density) consume11;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection5 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume12 = startRestartGroup.consume(localLayoutDirection5);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection5 = (LayoutDirection) consume12;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration4 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume13 = startRestartGroup.consume(localViewConfiguration4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) consume13;
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(then3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1642constructorimpl4 = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl4, density4, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1649setimpl(m1642constructorimpl4, layoutDirection5, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1649setimpl(m1642constructorimpl4, viewConfiguration4, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1319246300);
                ComposerKt.sourceInformation(startRestartGroup, "C420@20632L7:TextField.kt#jmzs0o");
                function25 = function22;
                function25.invoke(startRestartGroup, Integer.valueOf((i4 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                function25 = function22;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then4 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TextFieldId).then(m589paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity5 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume14 = startRestartGroup.consume(localDensity5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density5 = (Density) consume14;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection6 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume15 = startRestartGroup.consume(localLayoutDirection6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection6 = (LayoutDirection) consume15;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration5 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume16 = startRestartGroup.consume(localViewConfiguration5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration5 = (ViewConfiguration) consume16;
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5 = LayoutKt.materializerOf(then4);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor5);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl5 = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl5, rememberBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl5, density5, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl5, layoutDirection6, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl5, viewConfiguration5, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf5.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-2048931960);
            ComposerKt.sourceInformation(startRestartGroup, "C426@20826L11:TextField.kt#jmzs0o");
            textField = function2;
            textField.invoke(startRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldKt$TextFieldLayout$2
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

            public final void invoke(Composer composer2, int i5) {
                TextFieldKt.TextFieldLayout(Modifier.this, textField, function25, function3, function23, function24, z, f, paddingValues, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1584calculateWidthVsPV1Ek(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, Constraints.m4398getMinWidthimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1583calculateHeightO3s9Psw(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, PaddingValues paddingValues) {
        float f2 = TextFieldTopPadding * f;
        float top = paddingValues.getTop() * f;
        float bottom = paddingValues.getBottom() * f;
        int max = Math.max(i, i5);
        return Math.max(MathKt.roundToInt(z ? i2 + f2 + max + bottom : top + max + bottom), Math.max(Math.max(i3, i4), Constraints.m4397getMinHeightimpl(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i3, int i4, float f, float f2) {
        int roundToInt;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            } else {
                roundToInt = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), roundToInt - MathKt.roundToInt((roundToInt - i3) * f), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i4, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f, PaddingValues paddingValues) {
        int roundToInt = MathKt.roundToInt(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), i2), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), i2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i2) : roundToInt, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z) {
                roundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i2);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), roundToInt, 0.0f, 4, null);
        }
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final BorderStroke indicatorBorder) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(indicatorBorder, "indicatorBorder");
        final float width = indicatorBorder.getWidth();
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                if (Dp.m4445equalsimpl0(width, Dp.INSTANCE.m4458getHairlineD9Ej5fM())) {
                    return;
                }
                float density = width * drawWithContent.getDensity();
                float m1937getHeightimpl = Size.m1937getHeightimpl(drawWithContent.mo2662getSizeNHjbRc()) - (density / 2);
                DrawScope.m2648drawLine1RTmtNc$default(drawWithContent, indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, m1937getHeightimpl), OffsetKt.Offset(Size.m1940getWidthimpl(drawWithContent.mo2662getSizeNHjbRc()), m1937getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }
}
