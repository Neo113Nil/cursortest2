package u00;

import Ae.C0;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t00.AbstractC9719a;
import t00.AbstractC9720b;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.ui.screens.list.ComposerDebugMenuItemsListViewModel$sendResetStringItemToDefault$1", f = "ComposerDebugMenuItemsListViewModel.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f99735d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m f99736e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC9720b.d f99737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(m mVar, AbstractC9720b.d dVar, kotlin.coroutines.d<? super o> dVar2) {
        super(2, dVar2);
        this.f99736e = mVar;
        this.f99737f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o(this.f99736e, this.f99737f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f99735d;
        if (i11 == 0) {
            s.b(obj);
            C0 c02 = this.f99736e.f99721b;
            AbstractC9719a.b bVar = new AbstractC9719a.b(this.f99737f);
            this.f99735d = 1;
            if (c02.emit(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
