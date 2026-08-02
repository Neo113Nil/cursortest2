package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "input", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DocsDeliveryFormViewModelImpl$setFieldsErrors$1 extends AbstractC7737t implements Function1<DocsDeliveryFormVO.Input, DocsDeliveryFormVO.Input> {
    final /* synthetic */ Map<String, String> $errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocsDeliveryFormViewModelImpl$setFieldsErrors$1(Map<String, String> map) {
        super(1);
        this.$errors = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DocsDeliveryFormVO.Input invoke(DocsDeliveryFormVO.Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return (this.$errors.containsKey(input.getName()) && (input instanceof DocsDeliveryFormVO.Input.TextInput)) ? DocsDeliveryFormVO.Input.TextInput.copy$default((DocsDeliveryFormVO.Input.TextInput) input, null, null, false, null, null, "", false, 95, null) : input;
    }
}
