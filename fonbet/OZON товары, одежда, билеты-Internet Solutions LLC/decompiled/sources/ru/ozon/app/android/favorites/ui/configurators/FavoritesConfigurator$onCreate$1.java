package ru.ozon.app.android.favorites.ui.configurators;

import A00.a;
import Sc.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LA00/a$J$a;", "events", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$onCreate$1", f = "FavoritesConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoritesConfigurator$onCreate$1 extends j implements Function2<List<? extends a.J.InterfaceC0007a>, d<? super Unit>, Object> {
    final /* synthetic */ FavoritesConfigurator.FavoriteEventViewModel $viewModel;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FavoritesConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoritesConfigurator$onCreate$1(FavoritesConfigurator.FavoriteEventViewModel favoriteEventViewModel, FavoritesConfigurator favoritesConfigurator, d<? super FavoritesConfigurator$onCreate$1> dVar) {
        super(2, dVar);
        this.$viewModel = favoriteEventViewModel;
        this.this$0 = favoritesConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FavoritesConfigurator$onCreate$1 favoritesConfigurator$onCreate$1 = new FavoritesConfigurator$onCreate$1(this.$viewModel, this.this$0, dVar);
        favoritesConfigurator$onCreate$1.L$0 = obj;
        return favoritesConfigurator$onCreate$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC7851b controller;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List<a.J.InterfaceC0007a> list = (List) this.L$0;
        FavoritesConfigurator favoritesConfigurator = this.this$0;
        for (a.J.InterfaceC0007a interfaceC0007a : list) {
            ConfiguratorReferences references = favoritesConfigurator.getReferences();
            if (references != null && (controller = references.getController()) != null) {
                controller.update(interfaceC0007a);
            }
        }
        this.$viewModel.dropEvents();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends a.J.InterfaceC0007a> list, d<? super Unit> dVar) {
        return ((FavoritesConfigurator$onCreate$1) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
