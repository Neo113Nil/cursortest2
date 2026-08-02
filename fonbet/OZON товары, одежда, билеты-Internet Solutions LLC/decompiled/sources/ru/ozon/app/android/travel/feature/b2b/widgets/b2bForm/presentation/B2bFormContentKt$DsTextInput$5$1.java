package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import Ae.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newValue", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class B2bFormContentKt$DsTextInput$5$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ w0<AtomAction> $actionFlow;
    final /* synthetic */ CommonInputV2VO.TextInputV2 $input;
    final /* synthetic */ Function1<String, Unit> $onValueChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B2bFormContentKt$DsTextInput$5$1(CommonInputV2VO.TextInputV2 textInputV2, Function1<? super String, Unit> function1, w0<AtomAction> w0Var) {
        super(1);
        this.$input = textInputV2;
        this.$onValueChange = function1;
        this.$actionFlow = w0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String mask = this.$input.getMask();
        if (mask != null) {
            StringBuilder sb2 = new StringBuilder();
            int length = newValue.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = newValue.charAt(i11);
                if (Character.isLetterOrDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            int i12 = 0;
            for (int i13 = 0; i13 < mask.length(); i13++) {
                if (mask.charAt(i13) == '_') {
                    i12++;
                }
            }
            if (sb3.length() <= i12) {
                StringBuilder sb4 = new StringBuilder();
                int i14 = 0;
                for (int i15 = 0; i15 < mask.length(); i15++) {
                    char charAt2 = mask.charAt(i15);
                    if (i14 >= sb3.length()) {
                        break;
                    }
                    if (charAt2 == '_') {
                        sb4.append(sb3.charAt(i14));
                        i14++;
                    } else {
                        sb4.append(charAt2);
                    }
                }
                String sb5 = sb4.toString();
                Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
                this.$onValueChange.invoke(sb5);
            }
        } else {
            Integer maxLength = this.$input.getMaxLength();
            if (newValue.length() <= (maxLength != null ? maxLength.intValue() : Integer.MAX_VALUE)) {
                this.$onValueChange.invoke(newValue);
            }
        }
        AtomAction onChange = this.$input.getOnChange();
        if (onChange != null) {
            this.$actionFlow.tryEmit(onChange);
        }
    }
}
