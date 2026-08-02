package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.ui.shoppinglists.Action;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/favorites/ui/shoppinglists/Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder$onAttach$4", f = "SellerTransparencyV3ViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SellerTransparencyV3ViewHolder$onAttach$4 extends j implements Function2<Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SellerTransparencyV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerTransparencyV3ViewHolder$onAttach$4(SellerTransparencyV3ViewHolder sellerTransparencyV3ViewHolder, d<? super SellerTransparencyV3ViewHolder$onAttach$4> dVar) {
        super(2, dVar);
        this.this$0 = sellerTransparencyV3ViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SellerTransparencyV3ViewHolder$onAttach$4 sellerTransparencyV3ViewHolder$onAttach$4 = new SellerTransparencyV3ViewHolder$onAttach$4(this.this$0, dVar);
        sellerTransparencyV3ViewHolder$onAttach$4.L$0 = obj;
        return sellerTransparencyV3ViewHolder$onAttach$4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String sellerId;
        SellerHeaderViewModel sellerHeaderViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Action action = (Action) this.L$0;
        if (action != null && (sellerId = action.getSellerId()) != null) {
            sellerHeaderViewModel = this.this$0.sellerHeaderViewModel;
            sellerHeaderViewModel.forceUnlikeState(sellerId);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Action action, d<? super Unit> dVar) {
        return ((SellerTransparencyV3ViewHolder$onAttach$4) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
