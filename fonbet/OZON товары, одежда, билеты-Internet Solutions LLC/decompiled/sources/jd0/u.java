package jd0;

import De.C2862e;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

/* loaded from: classes3.dex */
public final class u implements G {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f69817a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69818a;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f69818a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.web.WebViewCookieSynchronizer$webViewLifecycleObserver$2$1$onStateChanged$1", f = "WebViewCookieSynchronizer.kt", l = {55}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f69819d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f69820e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r rVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f69820e = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f69820e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f69819d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f69819d = 1;
                if (r.e(this.f69820e, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    u(r rVar) {
        this.f69817a = rVar;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J source, AbstractC5434v.a event) {
        C2862e c2862e;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i11 = a.f69818a[event.ordinal()];
        r rVar = this.f69817a;
        if (i11 == 1) {
            r.c(rVar);
        } else {
            if (i11 != 2) {
                return;
            }
            source.getLifecycle().e(this);
            r.d(rVar);
            c2862e = rVar.f69805j;
            td0.f.b(c2862e, null, new b(rVar, null));
        }
    }
}
