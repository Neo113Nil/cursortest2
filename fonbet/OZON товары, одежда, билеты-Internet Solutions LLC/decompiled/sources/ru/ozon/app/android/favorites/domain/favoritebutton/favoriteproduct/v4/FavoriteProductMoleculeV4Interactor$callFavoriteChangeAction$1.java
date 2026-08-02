package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor", f = "FavoriteProductMoleculeV4Interactor.kt", l = {163}, m = "callFavoriteChangeAction")
/* loaded from: classes12.dex */
final class FavoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FavoriteProductMoleculeV4Interactor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1(FavoriteProductMoleculeV4Interactor favoriteProductMoleculeV4Interactor, d<? super FavoriteProductMoleculeV4Interactor$callFavoriteChangeAction$1> dVar) {
        super(dVar);
        this.this$0 = favoriteProductMoleculeV4Interactor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object callFavoriteChangeAction;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        callFavoriteChangeAction = this.this$0.callFavoriteChangeAction(null, false, null, this);
        return callFavoriteChangeAction;
    }
}
