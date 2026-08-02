package ht;

import io.reactivex.C;
import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.checkoutgeo.location.ComposerLocationRepositoryImpl;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor;
import ru.ozon.app.android.location.api.ComposerLocationResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f65641b;

    public /* synthetic */ b(Function1 function1, int i11) {
        this.f65640a = i11;
        this.f65641b = function1;
    }

    @Override // qc.o
    public final Object apply(Object obj) {
        C observeRequests$lambda$14;
        ComposerLocationResponse.Location initLocation$lambda$2;
        switch (this.f65640a) {
            case 0:
                observeRequests$lambda$14 = FavoriteProductMoleculeInteractor.observeRequests$lambda$14(this.f65641b, obj);
                return observeRequests$lambda$14;
            default:
                initLocation$lambda$2 = ComposerLocationRepositoryImpl.initLocation$lambda$2(this.f65641b, obj);
                return initLocation$lambda$2;
        }
    }
}
