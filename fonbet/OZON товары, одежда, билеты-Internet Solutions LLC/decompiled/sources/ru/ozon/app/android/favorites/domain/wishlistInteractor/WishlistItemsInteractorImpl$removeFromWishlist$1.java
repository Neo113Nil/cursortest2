package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractorImpl", f = "WishlistItemsInteractorImpl.kt", l = {216}, m = "removeFromWishlist")
/* loaded from: classes12.dex */
final class WishlistItemsInteractorImpl$removeFromWishlist$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WishlistItemsInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WishlistItemsInteractorImpl$removeFromWishlist$1(WishlistItemsInteractorImpl wishlistItemsInteractorImpl, d<? super WishlistItemsInteractorImpl$removeFromWishlist$1> dVar) {
        super(dVar);
        this.this$0 = wishlistItemsInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object removeFromWishlist;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        removeFromWishlist = this.this$0.removeFromWishlist(null, 0L, null, null, null, this);
        return removeFromWishlist;
    }
}
