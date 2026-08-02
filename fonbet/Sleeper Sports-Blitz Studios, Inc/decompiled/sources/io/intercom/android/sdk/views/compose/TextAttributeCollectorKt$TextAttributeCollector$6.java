package io.intercom.android.sdk.views.compose;

import android.content.res.Resources;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.utilities.AttributeCollectorValidatorKt;
import io.intercom.android.sdk.utilities.AttributeValidatorUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TextAttributeCollector.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class TextAttributeCollectorKt$TextAttributeCollector$6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AttributeData $attributeData;
    final /* synthetic */ boolean $disabled;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ Function1<AttributeData, Unit> $onSubmitAttribute;
    final /* synthetic */ Function1<String, Unit> $onValidationError;
    final /* synthetic */ Resources $resources;
    final /* synthetic */ CornerBasedShape $shape;
    final /* synthetic */ boolean $submitted;
    final /* synthetic */ MutableState<String> $value$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    TextAttributeCollectorKt$TextAttributeCollector$6(boolean z, boolean z2, boolean z3, CornerBasedShape cornerBasedShape, Function1<? super String, Unit> function1, Resources resources, AttributeData attributeData, Function1<? super AttributeData, Unit> function12, MutableState<String> mutableState) {
        this.$disabled = z;
        this.$submitted = z2;
        this.$loading = z3;
        this.$shape = cornerBasedShape;
        this.$onValidationError = function1;
        this.$resources = resources;
        this.$attributeData = attributeData;
        this.$onSubmitAttribute = function12;
        this.$value$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            boolean z = this.$disabled;
            boolean z2 = this.$submitted;
            boolean z3 = this.$loading;
            CornerBasedShape cornerBasedShape = this.$shape;
            final Function1<String, Unit> function1 = this.$onValidationError;
            final Resources resources = this.$resources;
            final AttributeData attributeData = this.$attributeData;
            final Function1<AttributeData, Unit> function12 = this.$onSubmitAttribute;
            final MutableState<String> mutableState = this.$value$delegate;
            TextAttributeCollectorKt.TextAttributeTrailingComponent(z, z2, z3, cornerBasedShape, new Function0() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$TextAttributeCollector$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = TextAttributeCollectorKt$TextAttributeCollector$6.invoke$lambda$0(Function1.this, resources, attributeData, function12, mutableState);
                    return invoke$lambda$0;
                }
            }, composer, 0);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 function1, Resources resources, AttributeData attributeData, Function1 function12, MutableState value$delegate) {
        String TextAttributeCollector$lambda$3;
        Intrinsics.checkNotNullParameter(attributeData, "$attributeData");
        Intrinsics.checkNotNullParameter(value$delegate, "$value$delegate");
        TextAttributeCollector$lambda$3 = TextAttributeCollectorKt.TextAttributeCollector$lambda$3(value$delegate);
        String obj = StringsKt.trim((CharSequence) TextAttributeCollector$lambda$3).toString();
        if (obj.length() == 0) {
            String string = resources.getString(R.string.intercom_string_is_incorrect);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            function1.invoke(string);
        } else {
            Attribute attribute = attributeData.getAttribute();
            int validateAttribute = AttributeValidatorUtils.validateAttribute(obj, attribute.getRenderType());
            if (validateAttribute == 0) {
                function1.invoke("");
                function12.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attribute, null, null, null, false, null, null, null, obj, 127, null), null, false, 6, null));
            } else {
                Intrinsics.checkNotNull(resources);
                function1.invoke(AttributeCollectorValidatorKt.getErrorStringFromCode(resources, validateAttribute));
            }
        }
        return Unit.INSTANCE;
    }
}
