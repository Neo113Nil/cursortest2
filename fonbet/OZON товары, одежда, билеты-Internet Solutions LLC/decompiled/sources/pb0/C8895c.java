package pb0;

import Sc.s;
import android.app.Activity;
import android.content.Intent;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.antibot.callback.presentation.FullScreenAntibotActivity;
import xe.M;

@e(c = "ru.ozon.id.antibot.callback.FullScreenAntibotCallback$startAntibotActivity$2", f = "FullScreenAntibotCallback.kt", l = {}, m = "invokeSuspend")
/* renamed from: pb0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8895c extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Activity f80397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8895c(Activity activity, d<? super C8895c> dVar) {
        super(2, dVar);
        this.f80397d = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new C8895c(this.f80397d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((C8895c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Activity activity = this.f80397d;
        activity.startActivity(new Intent(activity, (Class<?>) FullScreenAntibotActivity.class));
        return Unit.f71690a;
    }
}
