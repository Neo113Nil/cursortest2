package b0;

import Ph.C0;
import Ph.M;
import Ph.P;
import Ph.Q;
import Ph.X0;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final a f24178c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final k f24179d = new k();

    /* renamed from: e, reason: collision with root package name */
    public static final M f24180e = new b(M.f9041T2);

    /* renamed from: a, reason: collision with root package name */
    public final d f24181a;

    /* renamed from: b, reason: collision with root package name */
    public P f24182b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public j(d asyncTypefaceCache, CoroutineContext injectedContext) {
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(injectedContext, "injectedContext");
        this.f24181a = asyncTypefaceCache;
        this.f24182b = Q.a(f24180e.plus(injectedContext).plus(X0.a((C0) injectedContext.get(C0.f9001U2))));
    }

    public v a(t typefaceRequest, n platformFontLoader, Function1 onAsyncCompletion, Function1 createDefaultTypeface) {
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        Intrinsics.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface");
        throw null;
    }

    public /* synthetic */ j(d dVar, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new d() : dVar, (i10 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext);
    }

    public static final class b extends AbstractCoroutineContextElement implements M {
        public b(M.a aVar) {
            super(aVar);
        }

        @Override // Ph.M
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
