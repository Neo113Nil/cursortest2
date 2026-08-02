package ru.ozon.app.android.debugmenu.ozondebugmenu;

import Ib.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.debugmenu.ozondebugmenu.support.OzonDebugMenuEvents;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.debugmenu.ozondebugmenu.OzonDebugMenuHelperImpl$safeInit$1$5", f = "OzonDebugMenuHelperImpl.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OzonDebugMenuHelperImpl$safeInit$1$5 extends j implements Function1<d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OzonDebugMenuHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonDebugMenuHelperImpl$safeInit$1$5(OzonDebugMenuHelperImpl ozonDebugMenuHelperImpl, d<? super OzonDebugMenuHelperImpl$safeInit$1$5> dVar) {
        super(1, dVar);
        this.this$0 = ozonDebugMenuHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new OzonDebugMenuHelperImpl$safeInit$1$5(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.this$0.ozonDebugMenuEvents;
            OzonDebugMenuEvents ozonDebugMenuEvents = (OzonDebugMenuEvents) aVar.get();
            this.label = 1;
            if (ozonDebugMenuEvents.onClearCookie(this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super Unit> dVar) {
        return ((OzonDebugMenuHelperImpl$safeInit$1$5) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
