package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.data.markdown.MarkDownApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV3.core.FullTextSearchHeaderV3Mapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV3/core/FullTextSearchHeaderV3Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FullTextSearchHeaderV3Component$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<FullTextSearchHeaderV3Mapper> {
    final /* synthetic */ FullTextSearchHeaderV3Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FullTextSearchHeaderV3Component$Companion$create$1$1$mapper$2(FullTextSearchHeaderV3Component$Companion$create$1$1 fullTextSearchHeaderV3Component$Companion$create$1$1) {
        super(0);
        this.this$0 = fullTextSearchHeaderV3Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FullTextSearchHeaderV3Mapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        MarkDownApi markDownApi;
        contextComponentDependencies = this.this$0.contextComponentApi;
        Context context = contextComponentDependencies.getContext();
        markDownApi = this.this$0.markDownApi;
        return new FullTextSearchHeaderV3Mapper(context, markDownApi.getMarkDownParser());
    }
}
