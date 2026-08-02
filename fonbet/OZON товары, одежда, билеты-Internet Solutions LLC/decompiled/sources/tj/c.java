package tj;

import Sc.s;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import vj.C10325b;
import wj.C10565a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ozonLogger.android.debug.MainFragment$configureHarLogsView$3$1", f = "MainFragment.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f99558d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f99559e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ozonLogger.android.debug.MainFragment$configureHarLogsView$3$1$1", f = "MainFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C10565a c10565a;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            C10325b c10325b = C10325b.f103003h;
            if (c10325b == null) {
                throw new IllegalStateException("Error OzonHarLogger is not initialized, you need to call OzonHarLogger.init()");
            }
            c10565a = c10325b.f103006c;
            c10565a.d();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f99559e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f99559e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f99558d;
        if (i11 == 0) {
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            a aVar2 = new a(2, null);
            this.f99558d = 1;
            if (C10727i.f(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        e eVar = this.f99559e;
        Context context = eVar.getContext();
        if (context != null) {
            String string = eVar.getString(R.string.ozon_logger_android_debug_clear_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            e.x(context, string);
        }
        return Unit.f71690a;
    }
}
