package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsController", f = "CatalogTabsController.kt", l = {141, 153}, m = "updateTabs")
/* loaded from: classes12.dex */
final class CatalogTabsController$updateTabs$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CatalogTabsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogTabsController$updateTabs$1(CatalogTabsController catalogTabsController, d<? super CatalogTabsController$updateTabs$1> dVar) {
        super(dVar);
        this.this$0 = catalogTabsController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.updateTabs(null, this);
    }
}
