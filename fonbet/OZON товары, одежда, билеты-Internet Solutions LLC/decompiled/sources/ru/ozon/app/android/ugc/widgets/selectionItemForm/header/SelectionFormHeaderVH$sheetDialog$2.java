package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.header.cancelSheet.SheetAdapter;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.uni.android.component.sheet.SheetDialog;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/component/sheet/SheetDialog;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionFormHeaderVH$sheetDialog$2 extends AbstractC7737t implements Function0<SheetDialog> {
    final /* synthetic */ SelectionFormHeaderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormHeaderVH$sheetDialog$2(SelectionFormHeaderVH selectionFormHeaderVH) {
        super(0);
        this.this$0 = selectionFormHeaderVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SheetDialog invoke() {
        i iVar;
        RecyclerView cancelSheetRecycler;
        SheetAdapter sheetAdapter;
        SelectionItemFormDTO.BackSubmit backSubmit;
        iVar = this.this$0.container;
        Context L11 = iVar.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        SheetDialog sheetDialog = new SheetDialog(L11, R$style.OzonBottomSheetDialogAdjust, false, 0, true, true, null, null, false, false, null, false, 0, false, null, 32716, null);
        SelectionFormHeaderVH selectionFormHeaderVH = this.this$0;
        sheetDialog.setOnDismiss(new SelectionFormHeaderVH$sheetDialog$2$1$1(selectionFormHeaderVH));
        cancelSheetRecycler = selectionFormHeaderVH.getCancelSheetRecycler();
        sheetDialog.setContentView(cancelSheetRecycler);
        sheetAdapter = selectionFormHeaderVH.getSheetAdapter();
        SelectionFormHeaderVO boundData = selectionFormHeaderVH.getBoundData();
        List<Object> items = (boundData == null || (backSubmit = boundData.getBackSubmit()) == null) ? null : backSubmit.getItems();
        if (items == null) {
            items = K.f71697a;
        }
        sheetAdapter.submitList(items);
        return sheetDialog;
    }
}
