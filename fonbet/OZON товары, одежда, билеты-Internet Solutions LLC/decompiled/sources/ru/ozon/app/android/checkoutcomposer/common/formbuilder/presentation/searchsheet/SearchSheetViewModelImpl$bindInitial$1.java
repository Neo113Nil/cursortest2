package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetFragment;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SearchSheetViewModelImpl$bindInitial$1 extends AbstractC7737t implements Function1<String, Boolean> {
    final /* synthetic */ SearchSheetFragment.Data $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchSheetViewModelImpl$bindInitial$1(SearchSheetFragment.Data data) {
        super(1);
        this.$data = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.length() >= this.$data.getSearchOptions().getThreshold());
    }
}
