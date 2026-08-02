package ru.ozon.app.android.favorites.ui.configurators;

import A00.a;
import Ae.InterfaceC2397i;
import Sc.s;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "", "LA00/a$J$a;", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.configurators.FavoritesConfigurator$onCreate$2", f = "FavoritesConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoritesConfigurator$onCreate$2 extends j implements InterfaceC6511n<InterfaceC2397i<? super List<? extends a.J.InterfaceC0007a>>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    FavoritesConfigurator$onCreate$2(d<? super FavoritesConfigurator$onCreate$2> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super List<? extends a.J.InterfaceC0007a>> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        FavoritesConfigurator$onCreate$2 favoritesConfigurator$onCreate$2 = new FavoritesConfigurator$onCreate$2(dVar);
        favoritesConfigurator$onCreate$2.L$0 = th2;
        return favoritesConfigurator$onCreate$2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Lm0.a.f17149a.e((Throwable) this.L$0);
        return Unit.f71690a;
    }
}
