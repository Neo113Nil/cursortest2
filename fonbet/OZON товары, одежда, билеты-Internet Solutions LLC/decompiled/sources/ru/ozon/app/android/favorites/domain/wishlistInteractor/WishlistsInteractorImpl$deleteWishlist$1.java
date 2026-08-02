package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistsInteractorImpl", f = "WishlistsInteractorImpl.kt", l = {78, 135, 85, 87}, m = "deleteWishlist")
/* loaded from: classes12.dex */
final class WishlistsInteractorImpl$deleteWishlist$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WishlistsInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WishlistsInteractorImpl$deleteWishlist$1(WishlistsInteractorImpl wishlistsInteractorImpl, d<? super WishlistsInteractorImpl$deleteWishlist$1> dVar) {
        super(dVar);
        this.this$0 = wishlistsInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object deleteWishlist;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        deleteWishlist = this.this$0.deleteWishlist(0L, null, this);
        return deleteWishlist;
    }
}
