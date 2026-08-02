package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModelImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "input", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DocsDeliveryFormViewModelImpl$onCheckedChanged$1 extends AbstractC7737t implements Function1<DocsDeliveryFormVO.Input, DocsDeliveryFormVO.Input> {
    final /* synthetic */ String $fieldName;
    final /* synthetic */ boolean $newValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocsDeliveryFormViewModelImpl$onCheckedChanged$1(String str, boolean z11) {
        super(1);
        this.$fieldName = str;
        this.$newValue = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DocsDeliveryFormVO.Input invoke(DocsDeliveryFormVO.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (!Intrinsics.d(this.$fieldName, DocsDeliveryFormViewModelImpl.FormField.DISABLE_PATRONYMIC.getFieldName()) || !Intrinsics.d(input.getName(), DocsDeliveryFormViewModelImpl.FormField.PATRONYMIC.getFieldName()) || !(input instanceof DocsDeliveryFormVO.Input.TextInput)) {
            return (Intrinsics.d(input.getName(), this.$fieldName) && (input instanceof DocsDeliveryFormVO.Input.CheckBoxInput)) ? DocsDeliveryFormVO.Input.CheckBoxInput.copy$default((DocsDeliveryFormVO.Input.CheckBoxInput) input, null, null, this.$newValue, 3, null) : input;
        }
        DocsDeliveryFormVO.Input.TextInput textInput = (DocsDeliveryFormVO.Input.TextInput) input;
        boolean z11 = this.$newValue;
        return DocsDeliveryFormVO.Input.TextInput.copy$default(textInput, null, null, !z11, null, null, null, !z11, 27, null);
    }
}
