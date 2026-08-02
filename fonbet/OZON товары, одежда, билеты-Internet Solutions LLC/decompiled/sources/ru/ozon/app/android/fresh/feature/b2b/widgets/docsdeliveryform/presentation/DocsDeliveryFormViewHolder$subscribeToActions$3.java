package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.inputlist.InputListAdapter;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class DocsDeliveryFormViewHolder$subscribeToActions$3 extends C7735q implements Function1<List<DocsDeliveryFormVO.Input>, Unit> {
    DocsDeliveryFormViewHolder$subscribeToActions$3(Object obj) {
        super(1, obj, InputListAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<DocsDeliveryFormVO.Input> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<DocsDeliveryFormVO.Input> list) {
        ((InputListAdapter) this.receiver).submitList(list);
    }
}
