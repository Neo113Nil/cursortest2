package ru.ozon.app.android.partpayment.formpage.view;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;", "", "kotlin.jvm.PlatformType", "silent", "invoke", "(Z)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FormPageViewModelImpl$pageSource$1 extends AbstractC7737t implements Function1<Boolean, Pair<? extends FormPageVO, ? extends Boolean>> {
    final /* synthetic */ FormPageViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormPageViewModelImpl$pageSource$1(FormPageViewModelImpl formPageViewModelImpl) {
        super(1);
        this.this$0 = formPageViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Pair<? extends FormPageVO, ? extends Boolean> invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    public final Pair<FormPageVO, Boolean> invoke(boolean z11) {
        FormPageVO formPageVO;
        FormPageVO formPageVO2;
        ConcurrentHashMap concurrentHashMap;
        FormPageVO.Field copyWithValue;
        formPageVO = this.this$0.page;
        if (formPageVO == null) {
            Intrinsics.n("page");
            throw null;
        }
        formPageVO2 = this.this$0.page;
        if (formPageVO2 == null) {
            Intrinsics.n("page");
            throw null;
        }
        List<FormPageVO.Field> fields = formPageVO2.getFields();
        ArrayList<FormPageVO.Field> arrayList = new ArrayList();
        for (Object obj : fields) {
            if (!(((FormPageVO.Field) obj) instanceof FormPageVO.Field.Hidden)) {
                arrayList.add(obj);
            }
        }
        FormPageViewModelImpl formPageViewModelImpl = this.this$0;
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        for (FormPageVO.Field field : arrayList) {
            concurrentHashMap = formPageViewModelImpl.changedValues;
            FormPageVO.Field field2 = (FormPageVO.Field) concurrentHashMap.get(field.getName());
            if (field2 != null && (copyWithValue = field.copyWithValue(field2.getValue(), field2.getDisplayValue(), field2.getError())) != null) {
                field = copyWithValue;
            }
            arrayList2.add(field);
        }
        return new Pair<>(FormPageVO.copy$default(formPageVO, 0L, null, null, arrayList2, false, 23, null), Boolean.valueOf(z11));
    }
}
