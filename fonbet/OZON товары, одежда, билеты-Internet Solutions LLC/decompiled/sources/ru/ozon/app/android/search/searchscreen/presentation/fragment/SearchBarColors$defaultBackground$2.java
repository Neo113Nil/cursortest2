package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarColors;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SearchBarColors$defaultBackground$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ SearchBarColors this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarColors$defaultBackground$2(SearchBarColors searchBarColors) {
        super(0);
        this.this$0 = searchBarColors;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        SearchBarColors.Companion companion;
        String token;
        Context context;
        SearchBarColors.Companion companion2;
        SearchBarColors.Companion companion3;
        if (this.this$0.getIsSelect()) {
            companion3 = SearchBarColors.Companion;
            token = companion3.getDefaultBackgroundSelect();
        } else {
            companion = SearchBarColors.Companion;
            token = companion.getDefaultBackgroundBx().getToken();
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        context = this.this$0.context;
        companion2 = SearchBarColors.Companion;
        return Integer.valueOf(styleParser.parseColor(context, token, companion2.getDefaultBackgroundBx().getResId()));
    }
}
