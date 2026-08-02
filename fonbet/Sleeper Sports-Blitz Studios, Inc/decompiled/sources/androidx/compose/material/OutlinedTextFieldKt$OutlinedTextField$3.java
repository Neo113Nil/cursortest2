package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class OutlinedTextFieldKt$OutlinedTextField$3 implements TextFieldDecorator {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ TextFieldLineLimits $lineLimits;
    final /* synthetic */ OutputTransformation $outputTransformation;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

    /* JADX WARN: Multi-variable type inference failed */
    OutlinedTextFieldKt$OutlinedTextField$3(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, TextFieldColors textFieldColors) {
        this.$outputTransformation = outputTransformation;
        this.$state = textFieldState;
        this.$lineLimits = textFieldLineLimits;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$isError = z2;
        this.$label = function2;
        this.$placeholder = function22;
        this.$leadingIcon = function23;
        this.$trailingIcon = function24;
        this.$shape = shape;
        this.$colors = textFieldColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Decoration$lambda$2(OutlinedTextFieldKt$OutlinedTextField$3 outlinedTextFieldKt$OutlinedTextField$3, Function2 function2, int i, Composer composer, int i2) {
        outlinedTextFieldKt$OutlinedTextField$3.Decoration(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        TextFieldBuffer textFieldBuffer;
        String obj;
        final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        Composer startRestartGroup = composer.startRestartGroup(1251830469);
        ComposerKt.sourceInformation(startRestartGroup, "C(Decoration)N(innerTextField)246@13183L119,232@12557L760:OutlinedTextField.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function22) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1251830469, i2, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration (OutlinedTextField.kt:219)");
            }
            if (this.$outputTransformation == null) {
                obj = this.$state.getText().toString();
            } else {
                TextFieldState textFieldState = this.$state;
                TextFieldBuffer startEdit = textFieldState.startEdit();
                try {
                    textFieldState.commitEdit(startEdit);
                    textFieldState.finishEditing();
                    OutputTransformation outputTransformation = this.$outputTransformation;
                    if (startEdit == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("buffer");
                        textFieldBuffer = null;
                    } else {
                        textFieldBuffer = startEdit;
                    }
                    outputTransformation.transformOutput(textFieldBuffer);
                    obj = startEdit.asCharSequence().toString();
                } catch (Throwable th) {
                    textFieldState.finishEditing();
                    throw th;
                }
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            VisualTransformation none = VisualTransformation.INSTANCE.getNone();
            boolean areEqual = Intrinsics.areEqual(this.$lineLimits, TextFieldLineLimits.SingleLine.INSTANCE);
            int i3 = i2;
            boolean z = this.$enabled;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            String str = obj;
            boolean z2 = this.$isError;
            Function2<Composer, Integer, Unit> function23 = this.$label;
            Function2<Composer, Integer, Unit> function24 = this.$placeholder;
            Function2<Composer, Integer, Unit> function25 = this.$leadingIcon;
            Function2<Composer, Integer, Unit> function26 = this.$trailingIcon;
            Shape shape = this.$shape;
            TextFieldColors textFieldColors = this.$colors;
            final boolean z3 = this.$enabled;
            final boolean z4 = this.$isError;
            final MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            final TextFieldColors textFieldColors2 = this.$colors;
            final Shape shape2 = this.$shape;
            composer2 = startRestartGroup;
            function22 = function2;
            textFieldDefaults.OutlinedTextFieldDecorationBox(str, function22, z, areEqual, none, mutableInteractionSource, z2, function23, function24, function25, function26, shape, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(413830957, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$Decoration$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    ComposerKt.sourceInformation(composer3, "C247@13223L61:OutlinedTextField.kt#jmzs0o");
                    if (!composer3.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(413830957, i4, -1, "androidx.compose.material.OutlinedTextField.<no name provided>.Decoration.<anonymous> (OutlinedTextField.kt:247)");
                    }
                    TextFieldDefaults.INSTANCE.m2531BorderBoxnbWgWpA(z3, z4, mutableInteractionSource2, textFieldColors2, shape2, 0.0f, 0.0f, composer3, 12582912, 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), composer2, ((i3 << 3) & 112) | 24576, 221184, 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit Decoration$lambda$2;
                    Decoration$lambda$2 = OutlinedTextFieldKt$OutlinedTextField$3.Decoration$lambda$2(OutlinedTextFieldKt$OutlinedTextField$3.this, function22, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return Decoration$lambda$2;
                }
            });
        }
    }
}
