package ru.ozon.app.android.partpayment.formpage.view;

import com.google.android.gms.actions.SearchIntents;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", SearchIntents.EXTRA_QUERY, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DynamicFormFieldsAdapter$onCreateViewHolder$4 extends AbstractC7737t implements Function2<DynamicFormFieldVH, String, Unit> {
    final /* synthetic */ DynamicFormFieldsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicFormFieldsAdapter$onCreateViewHolder$4(DynamicFormFieldsAdapter dynamicFormFieldsAdapter) {
        super(2);
        this.this$0 = dynamicFormFieldsAdapter;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(DynamicFormFieldVH dynamicFormFieldVH, String str) {
        invoke2(dynamicFormFieldVH, str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DynamicFormFieldVH MaskFieldVH, String query) {
        FormPageVO.Field currentItem;
        InterfaceC6511n<String, String, String, Unit> onAutocompleteRequested;
        Intrinsics.checkNotNullParameter(MaskFieldVH, "$this$MaskFieldVH");
        Intrinsics.checkNotNullParameter(query, "query");
        currentItem = this.this$0.getCurrentItem(MaskFieldVH);
        if (currentItem != null) {
            DynamicFormFieldsAdapter dynamicFormFieldsAdapter = this.this$0;
            FormPageVO.Field.Mask mask = (FormPageVO.Field.Mask) currentItem;
            String autocompleteUrl = mask.getAutocompleteUrl();
            if (autocompleteUrl == null || (onAutocompleteRequested = dynamicFormFieldsAdapter.getOnAutocompleteRequested()) == null) {
                return;
            }
            onAutocompleteRequested.invoke(mask.getName(), autocompleteUrl, query);
        }
    }
}
