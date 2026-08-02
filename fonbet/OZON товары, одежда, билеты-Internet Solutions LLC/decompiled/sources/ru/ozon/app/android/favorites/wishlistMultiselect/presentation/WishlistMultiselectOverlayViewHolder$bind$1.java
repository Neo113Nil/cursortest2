package ru.ozon.app.android.favorites.wishlistMultiselect.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "count", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.wishlistMultiselect.presentation.WishlistMultiselectOverlayViewHolder$bind$1", f = "WishlistMultiselectOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class WishlistMultiselectOverlayViewHolder$bind$1 extends j implements Function2<Integer, d<? super Unit>, Object> {
    final /* synthetic */ WishlistMultiselectVO $item;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ WishlistMultiselectOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WishlistMultiselectOverlayViewHolder$bind$1(WishlistMultiselectOverlayViewHolder wishlistMultiselectOverlayViewHolder, WishlistMultiselectVO wishlistMultiselectVO, d<? super WishlistMultiselectOverlayViewHolder$bind$1> dVar) {
        super(2, dVar);
        this.this$0 = wishlistMultiselectOverlayViewHolder;
        this.$item = wishlistMultiselectVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        WishlistMultiselectOverlayViewHolder$bind$1 wishlistMultiselectOverlayViewHolder$bind$1 = new WishlistMultiselectOverlayViewHolder$bind$1(this.this$0, this.$item, dVar);
        wishlistMultiselectOverlayViewHolder$bind$1.I$0 = ((Number) obj).intValue();
        return wishlistMultiselectOverlayViewHolder$bind$1;
    }

    public final Object invoke(int i11, d<? super Unit> dVar) {
        return ((WishlistMultiselectOverlayViewHolder$bind$1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.bindButton(this.$item.getSubmitButton(), this.I$0, this.$item);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
        return invoke(num.intValue(), dVar);
    }
}
