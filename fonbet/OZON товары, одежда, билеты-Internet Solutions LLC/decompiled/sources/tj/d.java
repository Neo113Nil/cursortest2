package tj;

import Sc.s;
import android.content.Context;
import android.net.Uri;
import androidx.core.app.t;
import androidx.core.content.FileProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.ozonLogger.core.i;
import ru.ozon.app.android.R;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ozonLogger.android.debug.MainFragment$configureOzonLoggerView$3$1", f = "MainFragment.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f99560d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f99561e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ozonLogger.android.debug.MainFragment$configureOzonLoggerView$3$1$isEmptyLogs$1", f = "MainFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Boolean>, Object> {
        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            return Boolean.valueOf(((Tc.b) sj.e.f98817f.f()).isEmpty());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f99561e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f99561e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f99560d;
        if (i11 == 0) {
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            a aVar2 = new a(2, null);
            this.f99560d = 1;
            obj = C10727i.f(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        e eVar = this.f99561e;
        if (booleanValue) {
            Context context = eVar.getContext();
            if (context != null) {
                String string = eVar.getString(R.string.ozon_logger_android_debug_empty_logs_message);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                e.x(context, string);
            }
            return Unit.f71690a;
        }
        Context context2 = eVar.getContext();
        if (context2 != null) {
            Uri d11 = FileProvider.d(context2, context2.getPackageName() + ".android.debug.OzonLoggerDebugFileProvider", sj.e.f98817f.e(U7.d.e(context2.getCacheDir().getAbsolutePath(), "/ozon_logger.txt"), i.FULL));
            Intrinsics.checkNotNullExpressionValue(d11, "getUriForFile(...)");
            String string2 = context2.getString(R.string.ozon_logger_android_debug_logs_share_dialog);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            t.a aVar3 = new t.a(context2);
            aVar3.g(context2.getContentResolver().getType(d11));
            aVar3.e(d11);
            aVar3.d(string2);
            aVar3.h();
        }
        return Unit.f71690a;
    }
}
