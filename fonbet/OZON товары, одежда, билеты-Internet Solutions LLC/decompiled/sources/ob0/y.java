package ob0;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotRouter$openFragment$2", f = "AntibotRouter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class y extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C8685A f78018d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ViewGroup f78019e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ComponentCallbacksC5392m f78020f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f78021g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(C8685A c8685a, ViewGroup viewGroup, ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11, kotlin.coroutines.d<? super y> dVar) {
        super(2, dVar);
        this.f78018d = c8685a;
        this.f78019e = viewGroup;
        this.f78020f = componentCallbacksC5392m;
        this.f78021g = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new y(this.f78018d, this.f78019e, this.f78020f, this.f78021g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((y) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        G g10;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        g10 = this.f78018d.f77871d;
        if (g10 == null) {
            return null;
        }
        Q p11 = g10.p();
        Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction()");
        p11.r(this.f78019e.getId(), this.f78020f, null);
        if (this.f78021g) {
            p11.g(null);
        }
        p11.i();
        return Unit.f71690a;
    }
}
