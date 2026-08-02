package ru.ozon.app.android.uikit.dialog.sort;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pos", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SortsBottomSheetDialog$initViews$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ SortsBottomSheetDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SortsBottomSheetDialog$initViews$1(SortsBottomSheetDialog sortsBottomSheetDialog) {
        super(1);
        this.this$0 = sortsBottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        List list;
        list = this.this$0.items;
        if (list == null) {
            Intrinsics.n("items");
            throw null;
        }
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((SortItem) it.next()).getIsSelected()) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 != i11) {
            this.this$0.sendResult(-1, i11);
        }
        this.this$0.dismiss();
    }
}
