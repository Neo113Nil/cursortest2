package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.ModelsKt;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SuggestDTO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SuggestVO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000b\u0010\u0004\u001a\u00070\u0005¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "kotlin.jvm.PlatformType", "response", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestDTO;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SearchSheetRepository$getSuggests$1 extends AbstractC7737t implements Function1<SuggestDTO, List<? extends SuggestVO>> {
    public static final SearchSheetRepository$getSuggests$1 INSTANCE = new SearchSheetRepository$getSuggests$1();

    SearchSheetRepository$getSuggests$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<SuggestVO> invoke(SuggestDTO response) {
        Intrinsics.checkNotNullParameter(response, "response");
        List<SuggestDTO.Suggest> suggests = response.getSuggests();
        ArrayList arrayList = new ArrayList(C7714v.z(suggests, 10));
        Iterator<T> it = suggests.iterator();
        while (it.hasNext()) {
            arrayList.add(ModelsKt.toVO((SuggestDTO.Suggest) it.next()));
        }
        return arrayList;
    }
}
