package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarColors;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchBarColors$hintText$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ SearchBarColors this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarColors$hintText$2(SearchBarColors searchBarColors) {
        super(0);
        this.this$0 = searchBarColors;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        SearchBarColors.Companion companion;
        int hintBxRes;
        int color;
        SearchBarColors.Companion companion2;
        SearchBarColors searchBarColors = this.this$0;
        if (searchBarColors.getIsSelect()) {
            companion2 = SearchBarColors.Companion;
            hintBxRes = companion2.getHintSelectRes();
        } else {
            companion = SearchBarColors.Companion;
            hintBxRes = companion.getHintBxRes();
        }
        color = searchBarColors.color(hintBxRes);
        return Integer.valueOf(color);
    }
}
