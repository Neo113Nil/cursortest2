package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.R$string;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "input", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DocsDeliveryFormViewModelImpl$validateInputs$1 extends AbstractC7737t implements Function1<DocsDeliveryFormVO.Input, DocsDeliveryFormVO.Input> {
    final /* synthetic */ I $validated;
    final /* synthetic */ DocsDeliveryFormViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocsDeliveryFormViewModelImpl$validateInputs$1(DocsDeliveryFormViewModelImpl docsDeliveryFormViewModelImpl, I i11) {
        super(1);
        this.this$0 = docsDeliveryFormViewModelImpl;
        this.$validated = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DocsDeliveryFormVO.Input invoke(DocsDeliveryFormVO.Input input) {
        boolean postIndexInvalid;
        boolean isNoSatisfiedByMask;
        Intrinsics.checkNotNullParameter(input, "input");
        boolean z11 = input instanceof DocsDeliveryFormVO.Input.TextInput;
        if (z11) {
            DocsDeliveryFormVO.Input.TextInput textInput = (DocsDeliveryFormVO.Input.TextInput) input;
            if (textInput.getRequired()) {
                isNoSatisfiedByMask = this.this$0.isNoSatisfiedByMask(textInput);
                if (isNoSatisfiedByMask) {
                    this.$validated.f71783a = false;
                    return DocsDeliveryFormVO.Input.TextInput.copy$default(textInput, null, null, false, null, null, StringProvider.getString(R$string.error_docs_delivery_empty_field_android), false, 95, null);
                }
            }
        }
        if (!z11) {
            return input;
        }
        DocsDeliveryFormVO.Input.TextInput textInput2 = (DocsDeliveryFormVO.Input.TextInput) input;
        postIndexInvalid = this.this$0.postIndexInvalid(textInput2);
        if (!postIndexInvalid) {
            return input;
        }
        this.$validated.f71783a = false;
        return DocsDeliveryFormVO.Input.TextInput.copy$default(textInput2, null, null, false, null, null, StringProvider.getString(R$string.deliviry_form_incorrect_index_error_android), false, 95, null);
    }
}
