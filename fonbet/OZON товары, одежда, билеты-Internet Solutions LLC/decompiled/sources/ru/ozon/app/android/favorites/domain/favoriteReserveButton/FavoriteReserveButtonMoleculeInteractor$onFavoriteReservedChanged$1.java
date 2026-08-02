package ru.ozon.app.android.favorites.domain.favoriteReserveButton;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.domain.favoriteReserveButton.FavoriteReserveButtonMoleculeInteractor", f = "FavoriteReserveButtonMoleculeInteractor.kt", l = {109}, m = "onFavoriteReservedChanged")
/* loaded from: classes12.dex */
final class FavoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FavoriteReserveButtonMoleculeInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1(FavoriteReserveButtonMoleculeInteractor favoriteReserveButtonMoleculeInteractor, d<? super FavoriteReserveButtonMoleculeInteractor$onFavoriteReservedChanged$1> dVar) {
        super(dVar);
        this.this$0 = favoriteReserveButtonMoleculeInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object onFavoriteReservedChanged;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        onFavoriteReservedChanged = this.this$0.onFavoriteReservedChanged(null, this);
        return onFavoriteReservedChanged;
    }
}
