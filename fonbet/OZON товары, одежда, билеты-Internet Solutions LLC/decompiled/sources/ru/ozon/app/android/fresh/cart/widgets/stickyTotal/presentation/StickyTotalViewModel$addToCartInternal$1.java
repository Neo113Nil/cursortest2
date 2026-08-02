package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalViewModel", f = "StickyTotalViewModel.kt", l = {154, 171, 179}, m = "addToCartInternal")
/* loaded from: classes12.dex */
final class StickyTotalViewModel$addToCartInternal$1 extends c {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StickyTotalViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyTotalViewModel$addToCartInternal$1(StickyTotalViewModel stickyTotalViewModel, d<? super StickyTotalViewModel$addToCartInternal$1> dVar) {
        super(dVar);
        this.this$0 = stickyTotalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object addToCartInternal;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        addToCartInternal = this.this$0.addToCartInternal(null, 0L, null, null, null, null, null, 0L, null, false, this);
        return addToCartInternal;
    }
}
