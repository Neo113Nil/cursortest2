package ru.ozon.app.android.favorites.domain.favoriteToggleProductButton;

import Ae.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonChangeResult;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FavoriteToggleProductButtonInteractorImpl$observeRequests$2 extends C7735q implements Function2<FavoriteToggleProductButtonChangeResult, d<? super Unit>, Object> {
    FavoriteToggleProductButtonInteractorImpl$observeRequests$2(Object obj) {
        super(2, obj, w0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FavoriteToggleProductButtonChangeResult favoriteToggleProductButtonChangeResult, d<? super Unit> dVar) {
        return ((w0) this.receiver).emit(favoriteToggleProductButtonChangeResult, dVar);
    }
}
