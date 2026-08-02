package ru.ozon.app.android.initializers.warmer;

import Sc.s;
import Wc.a;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.warmer.MoshiAdapterWarmerImpl$warmUpJsonAdapters$1", f = "MoshiAdapterWarmer.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class MoshiAdapterWarmerImpl$warmUpJsonAdapters$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ U<List<JsonAdapter<? extends Object>>> $deferred;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MoshiAdapterWarmerImpl$warmUpJsonAdapters$1(U<? extends List<? extends JsonAdapter<? extends Object>>> u11, d<? super MoshiAdapterWarmerImpl$warmUpJsonAdapters$1> dVar) {
        super(2, dVar);
        this.$deferred = u11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MoshiAdapterWarmerImpl$warmUpJsonAdapters$1(this.$deferred, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            U<List<JsonAdapter<? extends Object>>> u11 = this.$deferred;
            this.label = 1;
            if (u11.s(this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MoshiAdapterWarmerImpl$warmUpJsonAdapters$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
