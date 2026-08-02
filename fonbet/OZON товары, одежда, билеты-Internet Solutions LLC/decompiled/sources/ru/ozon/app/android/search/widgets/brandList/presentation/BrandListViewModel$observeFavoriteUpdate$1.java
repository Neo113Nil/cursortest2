package ru.ozon.app.android.search.widgets.brandList.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.KeyFavoriteEntityModel;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/KeyFavoriteEntityModel;", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.brandList.presentation.BrandListViewModel$observeFavoriteUpdate$1", f = "BrandListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BrandListViewModel$observeFavoriteUpdate$1 extends j implements Function2<Map<KeyFavoriteEntityModel, ? extends Boolean>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BrandListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrandListViewModel$observeFavoriteUpdate$1(BrandListViewModel brandListViewModel, d<? super BrandListViewModel$observeFavoriteUpdate$1> dVar) {
        super(2, dVar);
        this.this$0 = brandListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        BrandListViewModel$observeFavoriteUpdate$1 brandListViewModel$observeFavoriteUpdate$1 = new BrandListViewModel$observeFavoriteUpdate$1(this.this$0, dVar);
        brandListViewModel$observeFavoriteUpdate$1.L$0 = obj;
        return brandListViewModel$observeFavoriteUpdate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<KeyFavoriteEntityModel, ? extends Boolean> map, d<? super Unit> dVar) {
        return invoke2((Map<KeyFavoriteEntityModel, Boolean>) map, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Map map = (Map) this.L$0;
        BrandListViewModel brandListViewModel = this.this$0;
        Intrinsics.f(map);
        brandListViewModel.applyFavoriteUpdates(map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<KeyFavoriteEntityModel, Boolean> map, d<? super Unit> dVar) {
        return ((BrandListViewModel$observeFavoriteUpdate$1) create(map, dVar)).invokeSuspend(Unit.f71690a);
    }
}
