package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartQuantViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/CartQuantViewModel$Action;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartQuantViewModel$action$2 extends AbstractC7737t implements Function0<SingleLiveEvent<CartQuantViewModel.Action>> {
    final /* synthetic */ CartQuantViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartQuantViewModel$action$2(CartQuantViewModel cartQuantViewModel) {
        super(0);
        this.this$0 = cartQuantViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SingleLiveEvent<CartQuantViewModel.Action> invoke() {
        SingleLiveEvent<CartQuantViewModel.Action> singleLiveEvent;
        singleLiveEvent = this.this$0._action;
        return singleLiveEvent;
    }
}
