package ru.ozon.app.android.network.cookie.handler;

import Sc.s;
import Wc.a;
import We.C4873o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.network.cookie.handler.TeensModeCookieHandler$handleCookiesFromResponse$1", f = "TeensModeCookieHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TeensModeCookieHandler$handleCookiesFromResponse$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<C4873o> $cookies;
    int label;
    final /* synthetic */ TeensModeCookieHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TeensModeCookieHandler$handleCookiesFromResponse$1(List<C4873o> list, TeensModeCookieHandler teensModeCookieHandler, d<? super TeensModeCookieHandler$handleCookiesFromResponse$1> dVar) {
        super(2, dVar);
        this.$cookies = list;
        this.this$0 = teensModeCookieHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TeensModeCookieHandler$handleCookiesFromResponse$1(this.$cookies, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        TeensModeStorage teensModeStorage;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Iterator<T> it = this.$cookies.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((C4873o) obj2).f(), "teensMode")) {
                break;
            }
        }
        C4873o c4873o = (C4873o) obj2;
        if (c4873o == null) {
            return Unit.f71690a;
        }
        teensModeStorage = this.this$0.teensModeStorage;
        teensModeStorage.saveTeensMode(Intrinsics.d(c4873o.i(), "1"));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TeensModeCookieHandler$handleCookiesFromResponse$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
