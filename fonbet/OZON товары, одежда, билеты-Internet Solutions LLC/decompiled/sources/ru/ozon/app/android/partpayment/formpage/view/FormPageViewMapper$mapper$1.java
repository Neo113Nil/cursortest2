package ru.ozon.app.android.partpayment.formpage.view;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "<unused var>", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;", "invoke", "(Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FormPageViewMapper$mapper$1 extends AbstractC7737t implements Function2<FormPageDTO, d, List<? extends FormPageVO>> {
    final /* synthetic */ Context $appContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormPageViewMapper$mapper$1(Context context) {
        super(2);
        this.$appContext = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<FormPageVO> invoke(FormPageDTO dto, d dVar) {
        FormPageVO.Field vo;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        long j11 = 1813591948;
        String name = dto.getName();
        String title = dto.getTitle();
        List<FormPageDTO.Field> fields = dto.getFields();
        Context context = this.$appContext;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = fields.iterator();
        while (it.hasNext()) {
            vo = FormPageViewMapperKt.toVO((FormPageDTO.Field) it.next(), context);
            if (vo != null) {
                arrayList.add(vo);
            }
        }
        Boolean refreshOnBack = dto.getRefreshOnBack();
        return C7714v.a0(new FormPageVO(j11, name, title, arrayList, refreshOnBack != null ? refreshOnBack.booleanValue() : false));
    }
}
