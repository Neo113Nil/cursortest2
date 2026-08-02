package dc0;

import Sc.r;
import Vb0.b;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.account.LocalCookieDataSource$removeAllCookies$2", f = "LocalCookieDataSource.kt", l = {214}, m = "invokeSuspend")
/* renamed from: dc0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6142F extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f61476d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CookieManager f61477e;

    /* renamed from: dc0.F$a */
    static final class a<T> implements ValueCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.h f61478a;

        a(kotlin.coroutines.h hVar) {
            this.f61478a = hVar;
        }

        @Override // android.webkit.ValueCallback
        public final void onReceiveValue(Object obj) {
            Boolean bool = (Boolean) obj;
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
            r.Companion companion = Sc.r.INSTANCE;
            this.f61478a.resumeWith(bool);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6142F(CookieManager cookieManager, kotlin.coroutines.d<? super C6142F> dVar) {
        super(2, dVar);
        this.f61477e = cookieManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C6142F(this.f61477e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((C6142F) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f61476d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        CookieManager cookieManager = this.f61477e;
        this.f61476d = 1;
        kotlin.coroutines.h hVar = new kotlin.coroutines.h(Wc.b.b(this));
        try {
            Looper.prepare();
            cookieManager.removeAllCookies(new a(hVar));
            Looper.loop();
        } catch (IllegalStateException e11) {
            b.a.c(Vb0.b.f28514a, e11);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
            r.Companion companion = Sc.r.INSTANCE;
            hVar.resumeWith(Boolean.FALSE);
        }
        Object a11 = hVar.a();
        if (a11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return a11 == aVar ? aVar : a11;
    }
}
