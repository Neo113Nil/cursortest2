package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.HotelsBookTotalV3StickyWidgetViewHolder", f = "HotelsBookTotalV3StickyWidgetViewHolder.kt", l = {158}, m = "performActionsList")
/* loaded from: classes3.dex */
final class HotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HotelsBookTotalV3StickyWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1(HotelsBookTotalV3StickyWidgetViewHolder hotelsBookTotalV3StickyWidgetViewHolder, d<? super HotelsBookTotalV3StickyWidgetViewHolder$performActionsList$1> dVar) {
        super(dVar);
        this.this$0 = hotelsBookTotalV3StickyWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object performActionsList;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        performActionsList = this.this$0.performActionsList(null, this);
        return performActionsList;
    }
}
