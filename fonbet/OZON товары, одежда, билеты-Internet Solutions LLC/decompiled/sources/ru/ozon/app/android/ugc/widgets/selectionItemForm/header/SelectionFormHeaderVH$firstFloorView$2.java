package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderFirstFloorView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionFormHeaderVH$firstFloorView$2 extends AbstractC7737t implements Function0<SelectionFormHeaderFirstFloorView> {
    final /* synthetic */ SelectionFormHeaderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormHeaderVH$firstFloorView$2(SelectionFormHeaderVH selectionFormHeaderVH) {
        super(0);
        this.this$0 = selectionFormHeaderVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SelectionFormHeaderFirstFloorView invoke() {
        i iVar;
        iVar = this.this$0.container;
        Context L11 = iVar.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return new SelectionFormHeaderFirstFloorView(L11);
    }
}
