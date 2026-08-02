package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.data.markdown.MarkDownApi;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.core.FullTextSearchHeaderV4WidgetMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/core/FullTextSearchHeaderV4WidgetMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FullTextSearchHeaderV4Component$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<FullTextSearchHeaderV4WidgetMapper> {
    final /* synthetic */ FullTextSearchHeaderV4Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullTextSearchHeaderV4Component$Companion$create$1$1$mapper$2(FullTextSearchHeaderV4Component$Companion$create$1$1 fullTextSearchHeaderV4Component$Companion$create$1$1) {
        super(0);
        this.this$0 = fullTextSearchHeaderV4Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FullTextSearchHeaderV4WidgetMapper invoke() {
        MarkDownApi markDownApi;
        Context context = this.this$0.getContextComponentApi().getContext();
        markDownApi = this.this$0.markDownApi;
        return new FullTextSearchHeaderV4WidgetMapper(context, markDownApi.getMarkDownParser());
    }
}
