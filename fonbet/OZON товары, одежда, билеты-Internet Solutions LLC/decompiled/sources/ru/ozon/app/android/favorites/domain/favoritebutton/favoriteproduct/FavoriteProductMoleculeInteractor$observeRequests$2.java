package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct;

import Nc.C3669c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResult;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class FavoriteProductMoleculeInteractor$observeRequests$2 extends C7735q implements Function1<FavoriteChangeResult, Unit> {
    FavoriteProductMoleculeInteractor$observeRequests$2(Object obj) {
        super(1, obj, C3669c.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteChangeResult favoriteChangeResult) {
        invoke2(favoriteChangeResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteChangeResult p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((C3669c) this.receiver).onNext(p02);
    }
}
