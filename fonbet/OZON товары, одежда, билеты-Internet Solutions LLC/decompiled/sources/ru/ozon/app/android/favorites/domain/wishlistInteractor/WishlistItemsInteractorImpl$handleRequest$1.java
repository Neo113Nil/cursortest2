package ru.ozon.app.android.favorites.domain.wishlistInteractor;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.domain.wishlistInteractor.WishlistItemsInteractorImpl", f = "WishlistItemsInteractorImpl.kt", l = {76, 83, 93}, m = "handleRequest")
/* loaded from: classes12.dex */
final class WishlistItemsInteractorImpl$handleRequest$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WishlistItemsInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WishlistItemsInteractorImpl$handleRequest$1(WishlistItemsInteractorImpl wishlistItemsInteractorImpl, d<? super WishlistItemsInteractorImpl$handleRequest$1> dVar) {
        super(dVar);
        this.this$0 = wishlistItemsInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.handleRequest(null, this);
    }
}
