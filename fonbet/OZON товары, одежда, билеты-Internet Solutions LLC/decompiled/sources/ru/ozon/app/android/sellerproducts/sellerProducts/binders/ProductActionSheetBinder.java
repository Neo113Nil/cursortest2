package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductActionSheetBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "<init>", "()V", "handler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "getHandler", "()Lkotlin/jvm/functions/Function1;", "setHandler", "(Lkotlin/jvm/functions/Function1;)V", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ProductActionSheetBinder extends ProductPropertyBinder {
    private Function1<? super AtomAction, Unit> handler;

    public final Function1<AtomAction, Unit> getHandler() {
        return this.handler;
    }

    public final void setHandler(Function1<? super AtomAction, Unit> function1) {
        this.handler = function1;
    }
}
