package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.csma.tips.core.CsmaPayActionProcesser;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/csma/tips/core/CsmaPayActionProcesser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TipCourierDetailsV2Component$Companion$create$1$actionProcesser$2 extends AbstractC7737t implements Function0<CsmaPayActionProcesser> {
    final /* synthetic */ TipCourierDetailsV2Component$Companion$create$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TipCourierDetailsV2Component$Companion$create$1$actionProcesser$2(TipCourierDetailsV2Component$Companion$create$1 tipCourierDetailsV2Component$Companion$create$1) {
        super(0);
        this.this$0 = tipCourierDetailsV2Component$Companion$create$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CsmaPayActionProcesser invoke() {
        StorageComponentApi storageComponentApi;
        storageComponentApi = this.this$0.storageComponentApi;
        return new CsmaPayActionProcesser(storageComponentApi.getApplicationInfoStorage());
    }
}
