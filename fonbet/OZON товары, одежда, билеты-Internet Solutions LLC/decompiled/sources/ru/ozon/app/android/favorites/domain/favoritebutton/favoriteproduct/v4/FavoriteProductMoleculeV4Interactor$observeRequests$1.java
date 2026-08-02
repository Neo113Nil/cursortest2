package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4;

import Sc.s;
import WZ.l;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.v4.FavoriteChangeV4Result;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/v4/FavoriteChangeV4Result;", "it", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/v4/FavoriteProductMoleculeV4Interactor$FavoriteChangeRequest;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor$observeRequests$1", f = "FavoriteProductMoleculeV4Interactor.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteProductMoleculeV4Interactor$observeRequests$1 extends j implements Function2<FavoriteProductMoleculeV4Interactor.FavoriteChangeRequest, d<? super FavoriteChangeV4Result>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavoriteProductMoleculeV4Interactor this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/v4/FavoriteChangeV4Result;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/v4/FavoriteChangeV4Result;"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor$observeRequests$1$1", f = "FavoriteProductMoleculeV4Interactor.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.v4.FavoriteProductMoleculeV4Interactor$observeRequests$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super FavoriteChangeV4Result>, Object> {
        final /* synthetic */ FavoriteProductMoleculeV4Interactor.FavoriteChangeRequest $it;
        int label;
        final /* synthetic */ FavoriteProductMoleculeV4Interactor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FavoriteProductMoleculeV4Interactor favoriteProductMoleculeV4Interactor, FavoriteProductMoleculeV4Interactor.FavoriteChangeRequest favoriteChangeRequest, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = favoriteProductMoleculeV4Interactor;
            this.$it = favoriteChangeRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$it, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object onFavoriteChanged;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            FavoriteProductMoleculeV4Interactor favoriteProductMoleculeV4Interactor = this.this$0;
            FavoriteProductModel molecule = this.$it.getMolecule();
            l tokenizedAnalytics = this.$it.getTokenizedAnalytics();
            AnalyticData analyticData = this.$it.getAnalyticData();
            this.label = 1;
            onFavoriteChanged = favoriteProductMoleculeV4Interactor.onFavoriteChanged(molecule, tokenizedAnalytics, analyticData, this);
            return onFavoriteChanged == aVar ? aVar : onFavoriteChanged;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super FavoriteChangeV4Result> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteProductMoleculeV4Interactor$observeRequests$1(FavoriteProductMoleculeV4Interactor favoriteProductMoleculeV4Interactor, d<? super FavoriteProductMoleculeV4Interactor$observeRequests$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteProductMoleculeV4Interactor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavoriteProductMoleculeV4Interactor$observeRequests$1 favoriteProductMoleculeV4Interactor$observeRequests$1 = new FavoriteProductMoleculeV4Interactor$observeRequests$1(this.this$0, dVar);
        favoriteProductMoleculeV4Interactor$observeRequests$1.L$0 = obj;
        return favoriteProductMoleculeV4Interactor$observeRequests$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FavoriteProductMoleculeV4Interactor.Companion companion;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        FavoriteProductMoleculeV4Interactor.FavoriteChangeRequest favoriteChangeRequest = (FavoriteProductMoleculeV4Interactor.FavoriteChangeRequest) this.L$0;
        companion = FavoriteProductMoleculeV4Interactor.Companion;
        U a11 = C10727i.a(companion.getCoroutineScope(), null, null, new AnonymousClass1(this.this$0, favoriteChangeRequest, null), 3);
        this.label = 1;
        Object s11 = a11.s(this);
        return s11 == aVar ? aVar : s11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FavoriteProductMoleculeV4Interactor.FavoriteChangeRequest favoriteChangeRequest, d<? super FavoriteChangeV4Result> dVar) {
        return ((FavoriteProductMoleculeV4Interactor$observeRequests$1) create(favoriteChangeRequest, dVar)).invokeSuspend(Unit.f71690a);
    }
}
