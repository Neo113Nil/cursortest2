package tj;

import Sc.s;
import android.content.Context;
import android.net.Uri;
import androidx.core.app.t;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import vj.C10325b;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ozonLogger.android.debug.MainFragment$configureHarLogsView$2$1", f = "MainFragment.kt", l = {108}, m = "invokeSuspend")
/* renamed from: tj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9880b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f99556d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f99557e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ozonLogger.android.debug.MainFragment$configureHarLogsView$2$1$uri$1", f = "MainFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tj.b$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Uri>, Object> {
        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Uri> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            return C10325b.a.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9880b(e eVar, kotlin.coroutines.d<? super C9880b> dVar) {
        super(2, dVar);
        this.f99557e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9880b(this.f99557e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9880b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f99556d;
        if (i11 == 0) {
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            a aVar2 = new a(2, null);
            this.f99556d = 1;
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
        Uri uri = (Uri) obj;
        e eVar = this.f99557e;
        Context context = eVar.getContext();
        if (context != null) {
            String string = eVar.getString(R.string.ozon_logger_android_debug_har_share_dialog);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            t.a aVar3 = new t.a(context);
            aVar3.g(context.getContentResolver().getType(uri));
            aVar3.e(uri);
            aVar3.d(string);
            aVar3.h();
        }
        return Unit.f71690a;
    }
}
