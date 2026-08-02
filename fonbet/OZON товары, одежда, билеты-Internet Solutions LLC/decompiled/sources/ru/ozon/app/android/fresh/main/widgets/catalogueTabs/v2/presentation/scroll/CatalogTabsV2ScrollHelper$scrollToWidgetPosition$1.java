package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper", f = "CatalogTabsV2ScrollHelper.kt", l = {93}, m = "scrollToWidgetPosition")
/* loaded from: classes12.dex */
final class CatalogTabsV2ScrollHelper$scrollToWidgetPosition$1 extends c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogTabsV2ScrollHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogTabsV2ScrollHelper$scrollToWidgetPosition$1(CatalogTabsV2ScrollHelper catalogTabsV2ScrollHelper, d<? super CatalogTabsV2ScrollHelper$scrollToWidgetPosition$1> dVar) {
        super(dVar);
        this.this$0 = catalogTabsV2ScrollHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object scrollToWidgetPosition;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        scrollToWidgetPosition = this.this$0.scrollToWidgetPosition(null, null, 0, 0, this);
        return scrollToWidgetPosition;
    }
}
