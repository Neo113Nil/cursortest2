package ru.ozon.app.android.account.orders.barcodePopover.v1.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverViewModel", f = "BarcodePopoverViewModel.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "createBarcodeDrawable")
/* loaded from: classes11.dex */
final class BarcodePopoverViewModel$createBarcodeDrawable$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BarcodePopoverViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodePopoverViewModel$createBarcodeDrawable$1(BarcodePopoverViewModel barcodePopoverViewModel, d<? super BarcodePopoverViewModel$createBarcodeDrawable$1> dVar) {
        super(dVar);
        this.this$0 = barcodePopoverViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.createBarcodeDrawable(null, null, this);
    }
}
