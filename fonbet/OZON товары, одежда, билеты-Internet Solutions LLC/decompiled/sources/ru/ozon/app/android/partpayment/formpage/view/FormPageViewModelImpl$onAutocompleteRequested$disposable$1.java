package ru.ozon.app.android.partpayment.formpage.view;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.data.autocomplete.MaskAutocompleteDTO;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "autocompletes", "", "Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteDTO$Value;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FormPageViewModelImpl$onAutocompleteRequested$disposable$1 extends AbstractC7737t implements Function1<List<? extends MaskAutocompleteDTO.Value>, Unit> {
    final /* synthetic */ FormPageViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormPageViewModelImpl$onAutocompleteRequested$disposable$1(FormPageViewModelImpl formPageViewModelImpl) {
        super(1);
        this.this$0 = formPageViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends MaskAutocompleteDTO.Value> list) {
        invoke2((List<MaskAutocompleteDTO.Value>) list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<MaskAutocompleteDTO.Value> autocompletes) {
        ConcurrentHashMap concurrentHashMap;
        FormPageVO formPageVO;
        Object obj;
        FormPageVO.Field copyWithValue$default;
        ConcurrentHashMap concurrentHashMap2;
        Intrinsics.checkNotNullParameter(autocompletes, "autocompletes");
        FormPageViewModelImpl formPageViewModelImpl = this.this$0;
        for (MaskAutocompleteDTO.Value value : autocompletes) {
            concurrentHashMap = formPageViewModelImpl.changedValues;
            FormPageVO.Field field = (FormPageVO.Field) concurrentHashMap.get(value.getToField());
            if (field != null && (copyWithValue$default = FormPageVO.Field.copyWithValue$default(field, value.getValue(), value.getValue(), null, 4, null)) != null) {
                concurrentHashMap2 = formPageViewModelImpl.changedValues;
                concurrentHashMap2.put(value.getToField(), copyWithValue$default);
            }
            formPageVO = formPageViewModelImpl.page;
            if (formPageVO == null) {
                Intrinsics.n("page");
                throw null;
            }
            Iterator<T> it = formPageVO.getFields().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.d(((FormPageVO.Field) obj).getName(), value.getToField())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Object obj2 = (FormPageVO.Field) obj;
            if (obj2 != null) {
                FormPageVO.Field.FocusableField focusableField = obj2 instanceof FormPageVO.Field.FocusableField ? (FormPageVO.Field.FocusableField) obj2 : null;
                String focusableViewTag = focusableField != null ? focusableField.getFocusableViewTag() : null;
                if (focusableViewTag != null) {
                    formPageViewModelImpl.getAction().setValue(new FormPageViewModel.Action.ClearFocus(focusableViewTag));
                }
            }
        }
        this.this$0.postChanges(false);
    }
}
