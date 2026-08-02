package ru.ozon.app.android.checkoutcomposer.sbp.search.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/flashbar/model/Restriction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SearchBankListViewHolder$initBanksContainer$1$2 extends AbstractC7737t implements Function0<Restriction> {
    final /* synthetic */ SearchBankListViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBankListViewHolder$initBanksContainer$1$2(SearchBankListViewHolder searchBankListViewHolder) {
        super(0);
        this.this$0 = searchBankListViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Restriction invoke() {
        SearchBankListVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            return boundData.getRestriction();
        }
        return null;
    }
}
